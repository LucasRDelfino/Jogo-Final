import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;

public class TelaEventos extends JFrame{
	JLabel lb1,lb2,lb3,lb4,lb5,lb6;
	ImageIcon foto,tela1,textbox,setaesquerda,setadireita,placar,p1,p2;
	JButton setae,setad;
	Clip clip;

public TelaEventos() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	Color verdeEscuro = new Color(43, 87, 38);
	getContentPane().setBackground(verdeEscuro);
	
	
	lb6 = new JLabel ("<html>O jogo tem a saida de bola com a turma da 4 SIT . Você tem 2 opções de saida de bola?\r\n"
			+ "\r\n<br>"
			+ "A) Tocar para o o zagueiro.\r\n<br>"
			+ "B) Tocar para o ponta esquerda.");
	lb6.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb6.setBounds(40,210,600,500);
	add(lb6);
	
	placar = new ImageIcon ("placar.png");
	lb3 = new JLabel (placar);
	lb3.setBounds(180,-3,350,120);
	add(lb3);
	
	setaesquerda = new ImageIcon("a.png");
	setae = new JButton(setaesquerda);
	setae.setBounds(110, 492, 100, 100);
	setae.setContentAreaFilled(false);
	setae.setBorder(null);
	add(setae);
	
	
	setadireita = new ImageIcon("b.png");
	setad = new JButton(setadireita);
	setad.setBounds(500, 510, 75, 75);
	setad.setContentAreaFilled(false);
    setad.setBorder(null);
	add(setad);
	
	p1 = new ImageIcon ("p2.jpg");
	lb4 = new JLabel (p1);
	lb4.setBounds(1,1,180,55);
	add(lb4);
	
	p2 = new ImageIcon ("p1.jpg");
	lb5 = new JLabel (p2);
	lb5.setBounds(528,1,160,55);
	add(lb5);
	
	textbox = new ImageIcon ("textbox.png");
	lb2 = new JLabel (textbox);
	lb2.setBounds(-20,345,725,340);
	add(lb2);
	
	tela1 = new ImageIcon ("tela1.jpeg");
	lb1 = new JLabel (tela1);
	lb1.setBounds(1,53,700,319);	
	add(lb1);
			
	
}

public void Eventos() {
	
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	



public static void main(String args[]) {
	
	 TelaEventos frame = new TelaEventos();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(0,0,700,680);
	 frame.setVisible(true);
	
}
}