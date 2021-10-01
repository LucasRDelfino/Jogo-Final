import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class Derrota extends JFrame{
	JLabel lb1,lb2;
	ImageIcon troféu,jogador,derrota;
	JButton jogar,tabela;
	Clip clip;
	pontucaoDAO dao;

	
public Derrota() {
		Componentes();
     	Eventos();
}
	
public void Componentes(){
	Color verdeEscuro = new Color(43, 87, 38);
	getContentPane().setBackground(verdeEscuro);
	setBounds(0,0,700,680);
	setLayout(null);
	
	
	lb1 = new JLabel ("<html>O jogador da 4SAT fez o gol e você perdeu o jogo!!!");
	lb1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
    lb1.setForeground(Color.WHITE);
	lb1.setBounds(1,10,800,50);
	add(lb1);
	derrota = new ImageIcon("CARA.png");			
	lb2 = new JLabel (derrota);
	lb2.setBounds(170, 100 ,300 ,400);
	add(lb2);
	jogar = new JButton ("JOGAR DE NOVO");
	jogar.setBounds(475,535,170,50);
	jogar.setFont(new Font("Ravie", 1, 13));
    jogar.setBackground(Color.GREEN);
    jogar.setFocusable(false);
	add(jogar);

	tabela = new JButton ("?");
	tabela.setBounds(70,535,150,50);
	tabela.setFont(new Font("Arial", 1, 20));
    tabela.setBackground(Color.GREEN);
    tabela.setFocusable(false);
	add(tabela);
	
	dao = new pontucaoDAO();
	if (!dao.bd.getConnection()) {
		System.out.println("Falha na conexão");
		System.exit(0);
		
	
	}
	
	dao.pontuacao.setscore(0);
	dao.atualizar(2);
	
	
	
}

public void Eventos(){
	jogar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 //Muda de Tela
			  new TelaInicial().setVisible(true);				
			  setVisible(false);
		
		
			
		}
	});
	tabela.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 //Muda de Tela
			  new tabela().setVisible(true);				
			  setVisible(false);
		
		
			
		}
	});
	
}

public static void main(String args[]) {
	
	 Derrota frame = new Derrota();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}

}
