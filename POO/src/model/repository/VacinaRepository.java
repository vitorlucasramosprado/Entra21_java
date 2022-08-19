package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Banco;
import model.entity.Vacina;

public class VacinaRepository {
	public Vacina inserir(Vacina novaVacina) {
		Connection conexao = Banco.getConnection();
		
		String sql = " INSERT INTO vacinas(pais_origem, estagio_pesquisa, "
					 + "                  data_inicio_pesquisa, nome_responsavel) "
				     + " VALUES (?, ?, ?, ?) ";
		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		try {
			query.setString(1, novaVacina.getPaisOrigem());
			query.setInt(2, novaVacina.getEstagio());
			query.setDate(3, new java.sql.Date(novaVacina.getDataInicio().getTime()));
			query.setString(4, novaVacina.getNomePesquisador());
			query.execute();
			
			ResultSet chavesGeradas = query.getGeneratedKeys();
			if(chavesGeradas.next()) {
				novaVacina.setId(chavesGeradas.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir vacina.\nCausa: " + e.getCause());
		}finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return novaVacina;
	}
	
	public boolean atualizar(Vacina vacina) {
		Connection conexao = Banco.getConnection();
		boolean atualizou = false;
		
		String sql = " UPDATE vacinas SET "
				   + " pais_origem = ?, estagio_pesquisa = ?, "
				   + " data_inicio_pesquisa = ?, nome_responsavel = ? "
				   + " WHERE id = ? ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		
		try {
			query.setString(1, vacina.getPaisOrigem());
			query.setInt(2, vacina.getEstagio());
			query.setDate(3, new java.sql.Date(vacina.getDataInicio().getTime()));
			query.setString(4, vacina.getNomePesquisador());
			query.setInt(5, vacina.getId());
			
			int linhasAfetadas = query.executeUpdate();
			atualizou = linhasAfetadas > 0;
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar vacina.\nCausa: " + e.getCause());
		}finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return atualizou;
	}
	
	//Delete
	public boolean excluir(int id) {
		boolean excluiu = false;
		
		//Conectar no banco
		Connection conexao = Banco.getConnection();
		String sql = " DELETE FROM vacinas "
				+ " WHERE id = ? ";
		//Obter o preparedStatement
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			//Executar
			stmt.setInt(1, id);
			int registrosExcluidos = stmt.executeUpdate();
			excluiu = (registrosExcluidos > 0);
		} catch (SQLException e) {
			System.out.println("Erro ao excluir vacina.\nCausa: " + e.getCause());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		
		return excluiu;
	}
	
	public Vacina pesquisarPorId(int id) {
		Vacina vacinaBuscada = null;
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM vacinas WHERE id = ? ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				vacinaBuscada = new Vacina();
				vacinaBuscada.setId(resultado.getInt("id"));
				vacinaBuscada.setEstagio(resultado.getInt("estagio_pesquisa"));
				vacinaBuscada.setNomePesquisador(resultado.getString("nome_responsavel"));
				vacinaBuscada.setPaisOrigem(resultado.getString("pais_origem"));
				vacinaBuscada.setDataInicio(resultado.getDate("data_inicio_pesquisa"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar vacina com id = " + id + " .\nCausa: "+ e.getCause());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		return vacinaBuscada;
	}
	
	
	
	public ArrayList<Vacina> pesquisarTodas(){
		ArrayList<Vacina> vacinas = new ArrayList();
		
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM vacinas ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		try {
			ResultSet resultado = query.executeQuery();
			
			while(resultado.next()) {
				Vacina vac = new Vacina();
				vac.setId(resultado.getInt("id"));
				vac.setDataInicio(resultado.getDate("data_inicio_pesquisa"));
				vac.setNomePesquisador(resultado.getString("nome_responsavel"));
				vac.setEstagio(resultado.getInt("estagio_pesquisa"));
				vac.setPaisOrigem(resultado.getString("pais_origem"));
				
				vacinas.add(vac);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar vacinas.\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return vacinas;
	}
}
