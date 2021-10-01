import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

public class tabela extends JFrame {
	private JScrollPane scrollTable;
	private JTable table;
	private BD bd;
	private PreparedStatement st;
	private ResultSet rs;
	pontucaoDAO dao;
	
	

	

	public tabela() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(560, 430);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		Componentes();
		Eventos();

	}

	public void Componentes() {
		
	    
		setLayout(null);
		setFont(new Font("Arial", Font.PLAIN, 12));
		scrollTable = new JScrollPane();
		scrollTable.setBounds(15, 200, 515, 183);
		add(scrollTable);
		dao = new pontucaoDAO();
		if (!dao.bd.getConnection()) {
			System.out.println("Falha na conexão");
			System.exit(0);
			
		
		}
		executarTabela();

	}
		public void Eventos() {
			
		}

		
		public void executarTabela() {
	        try {
	            String sql = "SELECT name, score FROM pontucao";
	            st = dao.bd.c.prepareStatement(sql);
	            rs= st.executeQuery();
	            DefaultTableModel tableModel = new DefaultTableModel(new String[] { "Nome", "Pontuação" }, 0) {
	                public boolean isCellEditable(int row, int col) {
	                    return false;
	                }
	            };
	            int qtdeColunas = rs.getMetaData().getColumnCount();
	            for (int indice = 1; indice <= qtdeColunas; indice++) {
//	                tableModel.addColumn(resultado.getMetaData().getColumnName(indice));
	            }
	            table = new JTable(tableModel);
	            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

	            while (rs.next()) {
	                try {
	                    String[] dados = new String[qtdeColunas];
	                    for (int i = 1; i <= qtdeColunas; i++) {
	                        dados[i - 1] = rs.getString(i);
	                    }
	                    dtm.addRow(dados);
	                    System.out.print("");
	                } catch (SQLException erro) {
	                    System.out.println(erro);
	                }
	                scrollTable.setViewportView(table);
	            }

	            rs.close();
	            st.close();
	        } catch (SQLException erro) {
	            System.out.println("ERRO");
	        }
	    }

		public static void main(String args[]){
			new tabela();
			}
}

