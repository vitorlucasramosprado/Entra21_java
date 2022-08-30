package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Banco;
import model.entity.Pesquisador;
import model.entity.Vacina;

public class VacinaRepository {
	
	public Vacina inserir(Vacina novaVacina) {
		String sql = " INSERT INTO vacinas(pais_origem, estagio_pesquisa, "
					 + " data_inicio_pesquisa, id_responsavel) "
				     + " VALUES (?, ?, ?, ?) ";
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql)) {
			query.setString(1, novaVacina.getPaisOrigem());
			query.setInt(2, novaVacina.getEstagio());
			query.setDate(3, new java.sql.Date(novaVacina.getDataInicio().getTime()));
			query.setInt(4, novaVacina.getPesquisador().getId());
			query.execute();
			
			ResultSet chavesGeradas = query.getGeneratedKeys();
			if(chavesGeradas.next()) {
				novaVacina.setId(chavesGeradas.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir vacina.\nCausa: "+ e.getMessage());
		}
		return novaVacina;
	}
	
	public boolean atualizar(Vacina vacina) {
		String sql = " UPDATE vacinas SET "
				   + " pais_origem = ?, estagio_pesquisa = ?, "
				   + " data_inicio_pesquisa = ?, id_responsavel = ? "
				   + " WHERE id = ? ";
		boolean atualizou = false;
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement query = Banco.getPreparedStatement(conexao, sql)) {
			query.setString(1, vacina.getPaisOrigem());
			query.setInt(2, vacina.getEstagio());
			query.setDate(3, new java.sql.Date(vacina.getDataInicio().getTime()));
			query.setInt(4, vacina.getPesquisador().getId());
			query.setInt(5, vacina.getId());
			
			int linhasAfetadas = query.executeUpdate();
			atualizou = linhasAfetadas > 0;
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar.\nCausa: "+ e.getMessage());
		}
		return atualizou;
	}
	
	public boolean excluir(int id) {
		String sql = " DELETE FROM vacinas "
				+ " WHERE id = ? ";
		
		boolean excluiu = false;
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql)) {
			stmt.setInt(1, id);
			int registrosExcluidos = stmt.executeUpdate();
			excluiu = (registrosExcluidos > 0);
		} catch (SQLException e) {
			System.out.println("Erro ao excluir a vacina com id = " + id + " .\nCausa: "+ e.getMessage());
		}
		return excluiu;
	}
	
	public Vacina pesquisarPorId(int id) {
		Vacina vacinaBuscada = null;
		String sql = " SELECT * FROM vacinas WHERE id = ? ";
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql)) {
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				vacinaBuscada = new Vacina();
				vacinaBuscada.setId(resultado.getInt("id"));
				vacinaBuscada.setEstagio(resultado.getInt("estagio_pesquisa"));
				vacinaBuscada.setPaisOrigem(resultado.getString("pais_origem"));
				vacinaBuscada.setDataInicio(resultado.getDate("data_inicio_pesquisa"));
				
				int idResponsavel = resultado.getInt("id_responsavel");
				PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
				Pesquisador responsavelBuscado = pesquisadorRepository.consultarPorId(idResponsavel);
				
				vacinaBuscada.setPesquisador(responsavelBuscado);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar a vacina.\nCausa: "+ e.getMessage());
		}
		return vacinaBuscada;
	}
	
	public ArrayList<Vacina> pesquisarTodas(){
		ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
		String sql = " SELECT * FROM vacinas ";
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
				ResultSet resultado = query.executeQuery()) {
			while(resultado.next()) {
				Vacina vac = new Vacina();
				vac.setId(resultado.getInt("id"));
				vac.setDataInicio(resultado.getDate("data_inicio_pesquisa"));
				vac.setEstagio(resultado.getInt("estagio_pesquisa"));
				vac.setPaisOrigem(resultado.getString("pais_origem"));
				
				int idResponsavel = resultado.getInt("id_responsavel");
				PesquisadorRepository pesquisadorRepository = new PesquisadorRepository();
				Pesquisador responsavelBuscado = pesquisadorRepository.consultarPorId(idResponsavel);
				
				vac.setPesquisador(responsavelBuscado);
				
				vacinas.add(vac);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar as vacinas.\nCausa: "+ e.getMessage());
		}
		return vacinas;
	}
}
