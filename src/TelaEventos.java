import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;

public class TelaEventos extends JFrame{
	JLabel lb1,lb2,lb3,lb4,lb5;
	ImageIcon foto,tela1,textbox,setaesquerda,setadireita,placar,p1,p2;
	JButton setae,setad;
	Clip clip;

public TelaEventos() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	getContentPane().setBackground(Color.green);
	
	placar = new ImageIcon ("placar.png");
	lb3 = new JLabel (placar);
	lb3.setBounds(180,-3,350,120);
	add(lb3);
	
	setaesquerda = new ImageIcon("setae.png");
	setae = new JButton(setaesquerda);
	setae.setBounds(50, 550, 140, 61);
	setae.setContentAreaFilled(false);
	setae.setBorder(null);
	add(setae);
	
	
	setadireita = new ImageIcon("setad.png");
	setad = new JButton(setadireita);
	setad.setBounds(500, 550, 140, 61);
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
	lb2.setBounds(-20,355,725,210);
	add(lb2);
	
	tela1 = new ImageIcon ("tela1.jpg");
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