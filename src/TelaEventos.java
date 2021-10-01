import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Random;

public class TelaEventos extends JFrame {
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,x,y,xx,lb16,lb17,lb18,lb19,lb20,lb21,lb22;
	ImageIcon foto,tela1,textbox,setaesquerda,setadireita,placar,p1,p2,img1,img2,img3,img4,img5,img6;
	JButton seta1,seta2,seta3,seta4,seta5,seta6,seta7,seta8,seta9,seta10,seta11,seta12,seta13,seta14;
	Clip clip;
	int Click = 1;
	Random random = new Random();

	

public TelaEventos() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setBounds(0,0,700,680);
	setLayout(null);
	Color verdeEscuro = new Color(43, 87, 38);
	getContentPane().setBackground(verdeEscuro);
	
	//Placar
	x = new JLabel("0");
	x.setBounds(305,1,100,50);
    x.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 40) );
    x.setForeground(Color.WHITE);
	add(x);
	xx = new JLabel("X");
	xx.setBounds(340,1,100,50);
    xx.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 40) );
    xx.setForeground(Color.WHITE);
	add(xx);
	y = new JLabel("0");
	y.setBounds(385,1,100,50);
    y.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 40) );
    y.setForeground(Color.WHITE);
	add(y);
	placar = new ImageIcon ("placar.png");
	lb3 = new JLabel (placar);
	lb3.setBounds(180,-10,350,120);
	add(lb3);
	
	
	
	//JogadaMeia
	lb10= new JLabel ("<html>O meia dominou a bola , ele tem duas opções: \r\n"
				+ "\r\n<br>"
				+ "A) Chutar para o gol\r\n<br>"
				+ "B) Cruzar na área");
	   lb10.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	   lb10.setBounds(40,210,600,500);
	   lb10.setVisible(false);
	   add(lb10);

	
	//Recuar para o lateral
	lb11= new JLabel ("<html>O lateral dominou a bola , mas o jogador da 4SAT fez falta . Ele deve: \r\n"
						+ "\r\n<br>"
						+ "A)Tocar para o meia \r\n<br>"
						+ "B)Cruzar na área ");
	lb11.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb11.setBounds(40,210,600,500);
	lb11.setVisible(false);
	add(lb11);
	
	//Condição de gol
	lb9= new JLabel ("<html>O cruzamento foi perfeito , seu jogador está de cara pro gol, ele deve:\r\n"
					+ "\r\n<br>"
					+ "A) Chutar para a direita.\r\n<br>"
					+ "B) Chutar para a esquerda");
	lb9.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb9.setBounds(40,210,600,500);
	lb9.setVisible(false);
	add(lb9);
	
	
	//Condição1 de Cruzamento
	lb8= new JLabel ("<html>O ponta esquerda driblou o lateral e está na linha de fundo , ele deverá :\r\n"
				+ "\r\n<br>"
				+ "A) Recuar para o lateral.\r\n<br>"
				+ "B) Cruzar na área  ");
	lb8.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb8.setBounds(40,210,600,500);
	lb8.setVisible(false);
	add(lb8);
	
	
	//Condição voltar para o zagueiro
	lb7 = new JLabel ("<html>Muito bem você tocou para o zagueiro atrás, o jogador da SIT dominou a bola e analisou o jogo. Ele tem 2 opções:\r\n"
			+ "\r\n<br>"
			+ "A) Tocar para o meia.\r\n<br>"
			+ "B) Tocar para o ponta esquerda");
	lb7.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb7.setBounds(40,210,600,500);
	lb7.setVisible(false);
	add(lb7);
	
	
	
	lb6 = new JLabel ("<html>O jogo tem a saida de bola com a turma da 4 SIT . Você tem 2 opções de saida de bola?\r\n"
			+ "\r\n<br>"
			+ "A) Tocar para o o zagueiro.\r\n<br>"
			+ "B) Tocar para o ponta esquerda.");
	lb6.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb6.setBounds(40,210,600,500);
	add(lb6);
	
	
	
	setaesquerda = new ImageIcon("a.png");
	seta1 = new JButton(setaesquerda);
	seta1.setBounds(110, 492, 100, 100);
	seta1.setContentAreaFilled(false);
	seta1.setBorder(null);
	add(seta1);
	
	
	setadireita = new ImageIcon("b.png");
	seta2 = new JButton(setadireita);
	seta2.setBounds(500, 510, 75, 75);
	seta2.setContentAreaFilled(false);
    seta2.setBorder(null);
	add(seta2);
	
	setaesquerda = new ImageIcon("a.png");
	seta3 = new JButton(setaesquerda);
	seta3.setBounds(110, 492, 100, 100);
	seta3.setContentAreaFilled(false);
	seta3.setBorder(null);
	seta3.setVisible(false);
	add(seta3);
	
	
	setadireita = new ImageIcon("b.png");
	seta4 = new JButton(setadireita);
	seta4.setBounds(500, 510, 75, 75);
	seta4.setContentAreaFilled(false);
    seta4.setBorder(null);
	seta4.setVisible(false);
	add(seta4);
	
	setaesquerda = new ImageIcon("a.png");
	seta5 = new JButton(setaesquerda);
	seta5.setBounds(110, 492, 100, 100);
	seta5.setContentAreaFilled(false);
	seta5.setBorder(null);
	seta5.setVisible(false);
	add(seta5);
	
	
	setadireita = new ImageIcon("b.png");
	seta6 = new JButton(setadireita);
	seta6.setBounds(500, 510, 75, 75);
	seta6.setContentAreaFilled(false);
    seta6.setBorder(null);
	seta6.setVisible(false);
	add(seta6);
	
	
	
	setaesquerda = new ImageIcon("a.png");
	seta7 = new JButton(setaesquerda);
	seta7.setBounds(110, 492, 100, 100);
	seta7.setContentAreaFilled(false);
    seta7.setBorder(null);
	seta7.setVisible(false);
	add(seta7);
	
	
	setadireita = new ImageIcon("b.png");
	seta8 = new JButton(setadireita);
	seta8.setBounds(500, 510, 75, 75);
	seta8.setContentAreaFilled(false);
    seta8.setBorder(null);
	seta8.setVisible(false);
	add(seta8);
	
	setaesquerda = new ImageIcon("a.png");
	seta9 = new JButton(setaesquerda);
	seta9.setBounds(110, 492, 100, 100);
	seta9.setContentAreaFilled(false);
	seta9.setBorder(null);
	seta9.setVisible(false);
	add(seta9);
	
	
	setadireita = new ImageIcon("b.png");
	seta10 = new JButton(setadireita);
	seta10.setBounds(500, 510, 75, 75);
	seta10.setContentAreaFilled(false);
    seta10.setBorder(null);
	seta10.setVisible(false);
	add(seta10);
	
	
	setaesquerda = new ImageIcon("a.png");
	seta11 = new JButton(setaesquerda);
	seta11.setBounds(110, 492, 100, 100);
	seta11.setContentAreaFilled(false);
	seta11.setBorder(null);
	seta11.setVisible(false);
	add(seta11);
	
	
	setadireita = new ImageIcon("b.png");
	seta12 = new JButton(setadireita);
	seta12.setBounds(500, 510, 75, 75);
	seta12.setContentAreaFilled(false);
    seta12.setBorder(null);
	seta12.setVisible(false);
	add(seta12);
	
	
	
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
	
	img1 = new ImageIcon ("foto1.jpeg");
	lb16 = new JLabel (img1);
	lb16.setBounds(1,53,700,319);
	lb16.setVisible(false);
	add(lb16);
	

	img2 = new ImageIcon ("foto2.jpeg");
	lb17 = new JLabel (img2);
	lb17.setBounds(1,53,700,319);
	lb17.setVisible(false);
	add(lb17);
	
	img3 = new ImageIcon ("foto3.jpeg");
	lb18 = new JLabel (img3);
	lb18.setBounds(1,53,700,319);
	lb18.setVisible(false);
	add(lb18);
	
	img4= new ImageIcon ("foto4.jpeg");
	lb19 = new JLabel (img4);
	lb19.setBounds(1,53,700,319);
	lb19.setVisible(false);
	add(lb19);
	
	img5= new ImageIcon ("foto5.jpeg");
	lb20 = new JLabel (img5);
	lb20.setBounds(1,53,700,319);
	lb20.setVisible(false);
	add(lb20);
	
	tela1 = new ImageIcon ("tela1.jpeg");
	lb1 = new JLabel (tela1);
	lb1.setBounds(1,53,700,319);	
	add(lb1);
			
	
}

public void Eventos() {
	seta1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb7.setVisible(true);
		lb6.setVisible(false);
		seta1.setVisible(false);
		seta2.setVisible(false);
		seta3.setVisible(true);
		seta4.setVisible(true);
		lb16.setVisible(true);
		lb1.setVisible(false);
	}
	});
	seta2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb19.setVisible(true);
		lb1.setVisible(false);
		lb8.setVisible(true);
		lb6.setVisible(false);
		seta1.setVisible(false);
		seta2.setVisible(false);
		seta5.setVisible(true);
		seta6.setVisible(true);
	}
	});
	seta3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb18.setVisible(true);
		lb16.setVisible(false);
		lb10.setVisible(true);
		lb7.setVisible(false);
		lb11.setVisible(false);
		seta9.setVisible(true);
		seta6.setVisible(true);
		seta3.setVisible(false);
		seta4.setVisible(false);
	}
	});
	seta4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb19.setVisible(true);
		lb16.setVisible(false);
		lb8.setVisible(true);
		lb7.setVisible(false);
		seta3.setVisible(false);
		seta4.setVisible(false);
		seta5.setVisible(true);
		seta6.setVisible(true);
	}
	});
	seta5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb20.setVisible(true);
		lb19.setVisible(false);
		lb11.setVisible(true);
		lb8.setVisible(false);
		seta5.setVisible(false);
		seta6.setVisible(false);
		seta3.setVisible(true);
		seta6.setVisible(true);
	}
	});
	seta6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb17.setVisible(true);
		lb1.setVisible(false);
		lb9.setVisible(true);
		lb8.setVisible(false);
		lb10.setVisible(false);
		lb11.setVisible(false);
		seta5.setVisible(false);
		seta6.setVisible(false);
		seta4.setVisible(false);
		seta3.setVisible(false);
		seta9.setVisible(true);
		seta10.setVisible(true);
	}
	});
	seta5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb20.setVisible(true);
		lb17.setVisible(false);
		lb19  .setVisible(false);
		lb11.setVisible(true);
		lb8.setVisible(false);
		seta5.setVisible(false);
		seta6.setVisible(false);
		seta4.setVisible(false);
		seta3.setVisible(false);
		seta3.setVisible(true);
		seta6.setVisible(true);
	}
	});
	seta9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int numero = random.nextInt(2);
		if(numero==0) {
			new Win().setVisible(true);				
			setVisible(false);
		}else {
			new Empate().setVisible(true);				
			setVisible(false);
		}
	}
	});
	seta10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int numero = random.nextInt(2);
		if(numero==0) {
			new Empate().setVisible(true);				
			setVisible(false);
		}else {
			new Win().setVisible(true);				
			setVisible(false);
		}
	}
	});



}

public static void main(String args[]) {
	
	 TelaEventos frame = new TelaEventos();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}

}
