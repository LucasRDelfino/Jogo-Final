import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;

public class escalacao extends JFrame{
	JLabel lb1,lb2,lb3,lb4;
	ImageIcon escalacao;
	Clip clip;

public escalacao() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	setBackground(Color.WHITE);
	

	
	
	
	escalacao = new ImageIcon ("escalação.jpg");
	lb1 = new JLabel (escalacao);
	lb1.setBounds(0,0,1000,1033);
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
	
	 escalacao frame = new escalacao();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(0,0,1000,1033);
	 frame.setVisible(true);
	
}
}
