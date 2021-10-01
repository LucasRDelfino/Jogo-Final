import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class WinHard extends JFrame{
	JLabel lb1,lb2;
	ImageIcon trof�u,jogador;
	JButton jogar;
	Clip clip;
	pontucaoDAO dao;

	
public WinHard() {
		Componentes();
     	Eventos();
}
	
public void Componentes(){
	Color verdeEscuro = new Color(43, 87, 38);
	getContentPane().setBackground(verdeEscuro);
	setBounds(0,0,700,680);
	setLayout(null);
	
	
	lb1 = new JLabel ("<html>O seu jogador fez o gol e o time da 4SIT ganhou o jogo voc� fez o total de 1000 pontos!!!");
	lb1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
    lb1.setForeground(Color.WHITE);
	lb1.setBounds(1,10,800,50);
	add(lb1);

	trof�u = new ImageIcon("trof�u.png");			
	lb2 = new JLabel (trof�u);
	lb2.setBounds(150, 120 ,400 ,260);
	add(lb2);	
	
	jogar = new JButton ("JOGAR DE NOVO");
	jogar.setBounds(475,535,170,50);
	jogar.setFont(new Font("Ravie", 1, 13));
    jogar.setBackground(Color.GREEN);
    jogar.setFocusable(false);
	add(jogar);
	
	dao = new pontucaoDAO();
	if (!dao.bd.getConnection()) {
		System.out.println("Falha na conex�o");
		System.exit(0);
		
	
	}
	
	dao.pontuacao.setscore(1000);
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
	
}

public static void main(String args[]) {
	
	 WinHard frame = new WinHard();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}

}