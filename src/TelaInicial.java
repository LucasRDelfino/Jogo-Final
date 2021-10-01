import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;

public class TelaInicial extends JFrame{
	JLabel lb1,lb2,lb3,lb4,lb5;
	ImageIcon fundo,ribamar,logo,gif;
	JButton jogar;
	Clip clip;
	JTextField name; 
	pontucaoDAO dao;

public TelaInicial() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setLayout(null);
	setBackground(Color.WHITE);
	 setBounds(0,0,1400,1050);
	
	logo = new ImageIcon ("logo.png");
	lb3 = new JLabel (logo);
	lb3.setBounds(800,200,300,300);
	add(lb3);
	
	gif = new ImageIcon ("carregando.gif");
	lb5 = new JLabel (gif);
	lb5.setBounds(630 ,550,100,100);
	add(lb5);
	
	
	ribamar = new ImageIcon ("ribamar.png");
	lb2 = new JLabel (ribamar);
	lb2.setBounds(100,100,500,500);
	add(lb2);
	
	name = new JTextField (5);
	name.setBounds(600,670,150,30);
	add(name);

	jogar = new JButton ("JOGAR");
	jogar.setBounds(600,735,150,50);
	jogar.setFont(new Font("Ravie", 1, 18));
    jogar.setBackground(Color.GREEN);
    jogar.setFocusable(false);
	add(jogar);
	
	
	fundo = new ImageIcon ("fundo.jpg");
	lb1 = new JLabel (fundo);
	lb1.setBounds(0,0,1400,1050);
	add(lb1);
	

	dao = new pontucaoDAO();
	if (!dao.bd.getConnection()) {
		System.out.println("Falha na conexão");
		System.exit(0);
	}
	
    try {
 	  File soundFile = new File("ribamar.wav");
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
			  dao.pontuacao.setname(name.getText());
			  dao.pontuacao.setscore(0);
			  dao.atualizar(1);
			  new escalacao().setVisible(true);				
			  setVisible(false);
			  clip.stop();
		
			
		}
	});
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	



public static void main(String args[]) {
	
	 TelaInicial frame = new TelaInicial();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}
}
