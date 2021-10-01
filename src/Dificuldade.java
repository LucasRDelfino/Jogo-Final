import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import java.awt.Insets;



public class Dificuldade extends JFrame{
	JLabel lb1,lb2,lb3,lb4,x,y;
	ImageIcon campo,jogador;
	JButton bt1,bt2;
	Clip clip;

	
	public Dificuldade() {
		Componentes();
     	Eventos();
	}
	
	
	public void Componentes() {
		setBounds(0,0,500,330);
		setLayout(null);
		
		
		
		
		
		//Titulo
		lb1 = new JLabel("Selecione um modo de Jogo : ");
		lb1.setBounds(20,10,500,50);
        lb1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 20) );
        lb1.setForeground(Color.BLUE);
		add(lb1);
		
		
		
		 
		 //Botão Inicial
		 bt1 = new JButton ("Fácil");
		 bt1.setBounds(200,100,110,30);
		 bt1.setFont(new Font("Ravie", 1, 18));
	     bt1.setBackground(Color.RED);
	     bt1.setFocusable(false);
		 add(bt1);
		 bt2 = new JButton ("Dificil");
		 bt2.setBounds(200,200,110,30);
		 bt2.setFont(new Font("Ravie", 1, 18));
	     bt2.setBackground(Color.RED);
	     bt2.setFocusable(false);
		 add(bt2);
			
		
		
		
		//Fundo Tela de Inicio
		campo = new ImageIcon("campo.jpg");			
		lb3 = new JLabel (campo);
		lb3.setBounds(0, 0 ,500 ,300);
		add(lb3);
		
		
		
	    //Tocar Música 
	    try {
	    	  File soundFile = new File("som.wav");
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
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new TelaEventos().setVisible(true);				
				  setVisible(false);
				  clip.stop();
			
				
			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new TelaEventos2().setVisible(true);				
				  setVisible(false);
				  clip.stop();
			
				
			}
		});
	    
	    
	}
	

		
	



public static void main(String args[]) {
	
	 Dificuldade frame = new Dificuldade();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}

}


