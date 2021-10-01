import java.sql.*;
public class pontucaoDAO {
	public bdgetset pontuacao;
	public BD bd;
	private PreparedStatement statement;
	private ResultSet resultSet;
	private String men, sql;
	public static final byte INCLUSAO = 1;
	public static final byte ALTERACAO = 2;
	public static final byte EXCLUSAO = 3;
	
	public pontucaoDAO() {
		bd = new BD();
		pontuacao = new bdgetset();
	}
	
	public boolean localizar() {
		sql = "select * from pontucao where name =?";
		try {
			statement = bd.c.prepareStatement(sql);
			statement.setString(1, pontuacao.getname());
			resultSet = statement.executeQuery();
			resultSet.next();
			pontuacao.setname(resultSet.getString(1));
			pontuacao.setscore(resultSet.getInt(2));
			System.out.println("Selecionado com sucesso!");
			return true;
		}catch (SQLException erro) {
			return false;
		}
	}
	
	public String atualizar(int operacao) {
		men = "Operação realizada com sucesso ";
		try {
			if(operacao == INCLUSAO) {
				sql = "insert into pontucao values (?,?)";
				statement = bd.c.prepareStatement(sql);
				statement.setString(1, pontuacao.getname());
				statement.setInt(2, pontuacao.getscore());
				
			} else if(operacao == ALTERACAO) {
				sql = "update pontucao set  score = ? where name =?";
				statement = bd.c.prepareStatement(sql);
				statement.setString(2, pontuacao.getname());
				statement.setInt(1, pontuacao.getscore());
				
			} 
			if (statement.executeUpdate() == 0) {
				men = "Falha na operação";
			}
			
		} catch(SQLException erro) {
			men = "Falha na operação " + erro.toString();
		}
		return men;
	}
}