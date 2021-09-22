import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;

public class TelaInicial extends JFrame{
	JLabel lb1,lb2,lb3,lb4;
	ImageIcon fundo,ribamar,logo;
	Clip clip;

public TelaInicial() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	setBackground(Color.WHITE);
	
	logo = new ImageIcon ("logo.png");
	lb3 = new JLabel (logo);
	lb3.setBounds(800,200,300,300);
	add(lb3);
	
	
	ribamar = new ImageIcon ("ribamar.png");
	lb2 = new JLabel (ribamar);
	lb2.setBounds(-150,-100,1000,879);
	add(lb2);
	
	
	fundo = new ImageIcon ("fundo.jpg");
	lb1 = new JLabel (fundo);
	lb1.setBounds(0,0,1400,1050);
	add(lb1);
	
	
//    try {
//  	  File soundFile = new File("ribamar.wav");
//         AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
//         DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
//         clip = (Clip) AudioSystem.getLine(info);
//         clip.open(sound);
//         clip.start();
//         
//      } catch (Exception e) {
//          JOptionPane.showMessageDialog(this, e);
//      }

			
	
}

public void Eventos() {
	setLayout(null);
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	



public static void main(String args[]) {
	
	 TelaInicial frame = new TelaInicial();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(0,0,1400,1050);
	 frame.setVisible(true);
	
}
}
