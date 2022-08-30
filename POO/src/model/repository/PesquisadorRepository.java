package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Banco;
import model.entity.Pesquisador;
import model.entity.Vacina;

public class PesquisadorRepository {
	
	public Pesquisador consultarPorId(int id) {
		Pesquisador pesquisadorBuscado = null;
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM pesquisador WHERE ID = ? ";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				pesquisadorBuscado = new Pesquisador();
				pesquisadorBuscado.setId(resultado.getInt("id"));
				pesquisadorBuscado.setNome(resultado.getString("nome"));
				pesquisadorBuscado.setCpf(resultado.getString("cpf"));
				pesquisadorBuscado.setMatricula(resultado.getInt("matricula"));
				pesquisadorBuscado.setDataNascimento(resultado.getDate("data_nascimento"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar pesquisador com id = " + id + " .\nCausa: "+ e.getMessage());
		} finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conexao);
		}
		return pesquisadorBuscado;
	}
	
	public ArrayList<Pesquisador> pesquisarTodos() {
		ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();
		String sql = "SELECT * FROM pesquisador";
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
				ResultSet resultado = query.executeQuery()) {
			while(resultado.next()) {
				Pesquisador pesquisadorBuscado = new Pesquisador();
				pesquisadorBuscado.setId(resultado.getInt("id"));
				pesquisadorBuscado.setNome(resultado.getString("nome"));
				pesquisadorBuscado.setCpf(resultado.getString("cpf"));
				pesquisadorBuscado.setMatricula(resultado.getInt("matricula"));
				pesquisadorBuscado.setDataNascimento(resultado.getDate("data_nascimento"));
				
				pesquisadores.add(pesquisadorBuscado);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar os pesquisadores.\nCausa: "+ e.getMessage());
		}
		
		return pesquisadores;
	}
	
	public boolean excluir(int id) {
		boolean excluiu = false;
		
		String sql = " DELETE FROM pesquisador "
				+ " WHERE id = ? ";

		try (Connection conexao = Banco.getConnection();
				PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql)) {
			stmt.setInt(1, id);
			int registrosExcluidos = stmt.executeUpdate();
			excluiu = (registrosExcluidos > 0);
		} catch (SQLException e) {
			System.out.println("Erro ao excluir o pesquisador com id = " + id + " .\nCausa: "+ e.getCause());
		}
		return excluiu;
	}
	
	public boolean atualizar(Pesquisador pesquisador) {
		boolean atualizou = false;

		String sql = " UPDATE pesquisador SET "
				   + " nome = ?, cpf = ?, "
				   + " matricula = ?, data_nascimento = ? "
				   + " WHERE id = ? ";
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement query = Banco.getPreparedStatement(conexao, sql)) {
			query.setString(1, pesquisador.getNome());
			query.setString(2, pesquisador.getCpf());
			query.setInt(3, pesquisador.getMatricula());
			query.setDate(4, new java.sql.Date(pesquisador.getDataNascimento().getTime()));
			query.setInt(5, pesquisador.getId());
			
			int linhasAfetadas = query.executeUpdate();
			atualizou = linhasAfetadas > 0;
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o pesquisador.\nCausa: "+ e.getCause());
		}
		return atualizou;
	}
	
	public Pesquisador inserir(Pesquisador pesquisador) {
		String sql = "INSERT INTO pesquisador (NOME, CPF, MATRICULA, DATA_NASCIMENTO)" +
				" VALUES(?, ?, ?, ?)";
		
		try (Connection conexao = Banco.getConnection();
				PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql)) {
			query.setString(1, pesquisador.getNome());
			query.setString(2, pesquisador.getCpf());
			query.setInt(3, pesquisador.getMatricula());
			query.setDate(4, new java.sql.Date(pesquisador.getDataNascimento().getTime()));
			query.execute();
			
			ResultSet chavesGeradas = query.getGeneratedKeys();
			if(chavesGeradas.next()) {
				pesquisador.setId(chavesGeradas.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir o pesquisador.\nCausa: "+ e.getMessage());
		}
		return pesquisador;
	}
}
