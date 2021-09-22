import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;

public class TelaEventos extends JFrame{
	JLabel lb1,lb2;
	ImageIcon foto,tela1,textbox;
	Clip clip;

public TelaEventos() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	setBackground(Color.green);
	
	textbox = new ImageIcon ("textbox.png");
	lb2 = new JLabel (textbox);
	lb2.setBounds(-20,-15,725,210);
	add(lb2);
	
	tela1 = new ImageIcon ("tela1.jpg");
	lb1 = new JLabel (tela1);
	lb1.setBounds(1,170,700,319);
	add(lb1);
			
	
}

public void Eventos() {
	setLayout(null);
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	



public static void main(String args[]) {
	
	 TelaEventos frame = new TelaEventos();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(0,0,700,750);
	 frame.setVisible(true);
	
}
}