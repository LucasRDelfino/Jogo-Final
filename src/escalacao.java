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
	JButton jogar;

public escalacao() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	setBackground(Color.WHITE);
	setBounds(0,0,852,80);
	
	jogar = new JButton (">>>");
	jogar.setBounds(400,785,110,30);
	jogar.setFont(new Font("Ravie", 1, 18));
    jogar.setBackground(Color.RED);
    jogar.setFocusable(false);
	add(jogar);
	
	
	
	escalacao = new ImageIcon ("escalacao.jpg");
	lb1 = new JLabel (escalacao);
	lb1.setBounds(0,0,852,880);
	add(lb1);
	
	
    try {
 	  File soundFile = new File("vi.wav");
         AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
         DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
         clip = (Clip) AudioSystem.getLine(info);
        clip.open(sound);
        clip.start();
        
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, e);
      }

			
	
}

public void Eventos() {
	jogar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 //Muda de Tela
			  new Dificuldade().setVisible(true);				
			  setVisible(false);
			  clip.stop();
		
			
		}
	});
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	



public static void main(String args[]) {
	
	 escalacao frame = new escalacao();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}
}
