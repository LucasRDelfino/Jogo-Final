import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Random;

public class TelaEventos2 extends JFrame {
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,x,y,xx,x1,y1,x2,y2,lb16,lb17,lb18,lb19,lb20,lb21,lb22,lb23,lb24,lb25;
	ImageIcon foto,tela1,textbox,imgB,imgA,imgC,placar,p1,p2,img1,img2,img3,img4,img5,img6;
	JButton seta1,seta2,seta3,seta4,seta5,seta6,seta7,seta8,seta9,seta10,seta11,seta12,seta13,seta14,seta15,seta16,seta17,seta18,seta19,seta20;
	Clip clip;
	int Click = 1;
	Random random = new Random();
	
	

public TelaEventos2() {
	Componentes();
	Eventos();
}
		
		
public void Componentes() {
	setBounds(0,0,700,680);
	setLayout(null);
	Color verdeEscuro = new Color(43, 87, 38);
	getContentPane().setBackground(verdeEscuro);
	
	//Placar
	x1 = new JLabel("1");
	x1.setBounds(305,1,100,50);
    x1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 40) );
    x1.setForeground(Color.WHITE);
    x1.setVisible(false);
	add(x1);
	
	y1 = new JLabel("1");
	y1.setBounds(385,1,100,50);
    y1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 40) );
    y1.setForeground(Color.WHITE);
    y1.setVisible(false);
	add(y1);
	
	y2 = new JLabel("2");
	y2.setBounds(385,1,100,50);
    y2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 40) );
    y2.setForeground(Color.WHITE);
    y2.setVisible(false);
	add(y2);


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
	
	
	lb13= new JLabel ("<html>GOLLLLLLLLLLLLLLL , saida para a 4SAT , eles tocam bem a bola até chegar ao gol, o atacante está de cara , o seu goleiro deve pular : \r\n"
			+ "\r\n<br>"
			+ "A)Para direita\r\n<br>"
			+ "B)Para a esquerda ");
	lb13.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb13.setBounds(40,210,600,500);
	lb13.setVisible(false);
	add(lb13);
	
	lb12= new JLabel ("<html>O chute foi para fora , tiro de meta da 4SAT , eles tocam bem a bola até chegar ao gol , o atacante está de cara pro gol , o seu goleiro deve pular : \r\n"
			+ "\r\n<br>"
			+ "A)Para direita\r\n<br>"
			+ "B)Para a esquerda ");
	lb12.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb12.setBounds(40,210,600,500);
	lb12.setVisible(false);
	add(lb12);
	
	lb11= new JLabel ("<html>O lateral dominou a bola , mas o jogador da 4SAT fez falta . Ele deve: \r\n"
			+ "\r\n<br>"
			+ "A)Tocar para o meia \r\n<br>"
			+ "B)Cruzar na área ");
	lb11.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb11.setBounds(40,210,600,500);
	lb11.setVisible(false);
	add(lb11);
	
	lb10= new JLabel ("<html>O cruzamento foi perfeito , seu jogador está de cara pro gol, ele deve:\r\n"
			+ "\r\n<br>"
			+ "A) Chutar para a direita.\r\n<br>"
			+ "B) Chutar para a esquerda");
	lb10.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb10.setBounds(40,210,600,500);
	lb10.setVisible(false);
	add(lb10);
	
	lb9= new JLabel ("<html>O meia dominou a bola , ele tem duas opções: \r\n"
			+ "\r\n<br>"
			+ "A) Chutar para o gol\r\n<br>"
			+ "B) Cruzar na área");
   lb9.setFont(new Font ("Arial-Black", Font.BOLD , 15));
   lb9.setBounds(40,210,600,500);
   lb9.setVisible(false);
   add(lb9);
	
	lb8= new JLabel ("<html>O ponta esquerda driblou o lateral e está na linha de fundo , ele deverá :\r\n"
			+ "\r\n<br>"
			+ "A) Recuar para o lateral.\r\n<br>"
			+ "B) Cruzar na área  ");
	lb8.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb8.setBounds(40,210,600,500);
	lb8.setVisible(false);
	add(lb8);


	
	
	
	lb7 = new JLabel ("<html>O zagueiro fez cagada e seu time tomou o gol, saida de bola novamente o jogagor, deverá:\r\n"
			+ "\r\n<br>"
			+ "A) Tocar para o meia \r\n<br>"
			+ " B) Tocar para o ponta esquerda ");
			
	lb7.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb7.setBounds(40,210,600,500);
	lb7.setVisible(false);
	add(lb7);
	
	
	
	lb6 = new JLabel ("<html>O jogo tem a saida de bola com a turma da 4 SIT . Você tem 2 opções de saida de bola:\r\n"
			+ "\r\n<br>"
			+ "A) Tocar para o o zagueiro \r\n<br>"
			+ " B) Tocar para o ponta esquerda ");
			
	lb6.setFont(new Font ("Arial-Black", Font.BOLD , 15));
	lb6.setBounds(40,210,600,500);
	add(lb6);
	
	
	
	imgA = new ImageIcon("a.png");
	seta1 = new JButton(imgA);
	seta1.setBounds(110, 492, 100, 100);
	seta1.setContentAreaFilled(false);
	seta1.setBorder(null);
	add(seta1);
	
	
	imgB = new ImageIcon("b.png");
	seta2 = new JButton(imgB);
	seta2.setBounds(500, 510, 75, 75);
	seta2.setContentAreaFilled(false);
    seta2.setBorder(null);
	add(seta2);
	
	imgA = new ImageIcon("a.png");
	seta3 = new JButton(imgA);
	seta3.setBounds(110, 492, 100, 100);
	seta3.setContentAreaFilled(false);
	seta3.setBorder(null);
	seta3.setVisible(false);
	add(seta3);
	
	
	imgB = new ImageIcon("b.png");
	seta4 = new JButton(imgB);
	seta4.setBounds(500, 510, 75, 75);
	seta4.setContentAreaFilled(false);
    seta4.setBorder(null);
    seta4.setVisible(false);
	add(seta4);
	
	imgA = new ImageIcon("a.png");
	seta5 = new JButton(imgA);
	seta5.setBounds(110, 492, 100, 100);
	seta5.setContentAreaFilled(false);
	seta5.setBorder(null);
	seta5.setVisible(false);
	add(seta5);
	
	
	imgB = new ImageIcon("b.png");
	seta6 = new JButton(imgB);
	seta6.setBounds(500, 510, 75, 75);
	seta6.setContentAreaFilled(false);
    seta6.setBorder(null);
    seta6.setVisible(false);
	add(seta6);
	
	imgA = new ImageIcon("a.png");
	seta7 = new JButton(imgA);
	seta7.setBounds(110, 492, 100, 100);
	seta7.setContentAreaFilled(false);
	seta7.setBorder(null);
	seta7.setVisible(false);
	add(seta7);
	
	
	imgB = new ImageIcon("b.png");
	seta8 = new JButton(imgB);
	seta8.setBounds(500, 510, 75, 75);
	seta8.setContentAreaFilled(false);
    seta8.setBorder(null);
    seta8.setVisible(false);
	add(seta8);
	
	imgA = new ImageIcon("a.png");
	seta9 = new JButton(imgA);
	seta9.setBounds(110, 492, 100, 100);
	seta9.setContentAreaFilled(false);
	seta9.setBorder(null);
	seta9.setVisible(false);
	add(seta9);
	
	
	imgB = new ImageIcon("b.png");
	seta10 = new JButton(imgB);
	seta10.setBounds(500, 510, 75, 75);
	seta10.setContentAreaFilled(false);
    seta10.setBorder(null);
    seta10.setVisible(false);
	add(seta10);
	
	imgA = new ImageIcon("a.png");
	seta11 = new JButton(imgA);
	seta11.setBounds(110, 492, 100, 100);
	seta11.setContentAreaFilled(false);
	seta11.setBorder(null);
	seta11.setVisible(false);
	add(seta11);
	
		
	imgB = new ImageIcon("b.png");
	seta12 = new JButton(imgB);
	seta12.setBounds(500, 510, 75, 75);
	seta12.setContentAreaFilled(false);
    seta12.setBorder(null);
    seta12.setVisible(false);
	add(seta12);
	
	imgA = new ImageIcon("a.png");
	seta13 = new JButton(imgA);
	seta13.setBounds(110, 492, 100, 100);
	seta13.setContentAreaFilled(false);
	seta13.setBorder(null);
	seta13.setVisible(false);
	add(seta13);
	
		
	imgB = new ImageIcon("b.png");
	seta14 = new JButton(imgB);
	seta14.setBounds(500, 510, 75, 75);
	seta14.setContentAreaFilled(false);
    seta14.setBorder(null);
    seta14.setVisible(false);
	add(seta14);
	
	imgA = new ImageIcon("a.png");
	seta15 = new JButton(imgA);
	seta15.setBounds(110, 492, 100, 100);
	seta15.setContentAreaFilled(false);
	seta15.setBorder(null);
	seta15.setVisible(false);
	add(seta15);
	
		
	imgB = new ImageIcon("b.png");
	seta16 = new JButton(imgB);
	seta16.setBounds(500, 510, 75, 75);
	seta16.setContentAreaFilled(false);
    seta16.setBorder(null);
    seta16.setVisible(false);
	add(seta16);
	
	imgA = new ImageIcon("a.png");
	seta17 = new JButton(imgA);
	seta17.setBounds(110, 492, 100, 100);
	seta17.setContentAreaFilled(false);
	seta17.setBorder(null);
	seta17.setVisible(false);
	add(seta17);
	
		
	imgB = new ImageIcon("b.png");
	seta18 = new JButton(imgB);
	seta18.setBounds(500, 510, 75, 75);
	seta18.setContentAreaFilled(false);
    seta18.setBorder(null);
    seta18.setVisible(false);
	add(seta18);
	
	imgA = new ImageIcon("a.png");
	seta19 = new JButton(imgA);
	seta19.setBounds(110, 492, 100, 100);
	seta19.setContentAreaFilled(false);
	seta19.setBorder(null);
	seta19.setVisible(false);
	add(seta19);
	
		
	imgB = new ImageIcon("b.png");
	seta20= new JButton(imgB);
	seta20.setBounds(500, 510, 75, 75);
	seta20.setContentAreaFilled(false);
    seta20.setBorder(null);
    seta20.setVisible(false);
	add(seta20);
	
	img1 = new ImageIcon ("foto1.jpeg");
	lb21 = new JLabel (img1);
	lb21.setBounds(1,53,700,319);
	lb21.setVisible(false);
	add(lb21);
	

	img2 = new ImageIcon ("foto2.jpeg");
	lb22 = new JLabel (img2);
	lb22.setBounds(1,53,700,319);
	lb22.setVisible(false);
	add(lb22);
	
	img3 = new ImageIcon ("foto3.jpeg");
	lb23 = new JLabel (img3);
	lb23.setBounds(1,53,700,319);
	lb23.setVisible(false);
	add(lb23);
	
	img4= new ImageIcon ("foto4.jpeg");
	lb24 = new JLabel (img4);
	lb24.setBounds(1,53,700,319);
	lb24.setVisible(false);
	add(lb24);
	
	img5= new ImageIcon ("foto5.jpeg");
	lb25 = new JLabel (img5);
	lb25.setBounds(1,53,700,319);
	lb25.setVisible(false);
	add(lb25);
	
	
	
	
	
	
	
	
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
	seta1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb7.setVisible(true);
		lb6.setVisible(false);
		y1.setVisible(true);
		y.setVisible(false);
		seta1.setVisible(false);
		seta2.setVisible(false);
		seta3.setVisible(true);
		seta4.setVisible(true);
		lb1.setVisible(false);
		lb21.setVisible(true);
	}
	});
	seta2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb24.setVisible(true);
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
		lb25.setVisible(true);
		lb21.setVisible(false);
		lb9.setVisible(true);
		lb7.setVisible(false);
		seta3.setVisible(false);
		seta4.setVisible(false);
		seta7.setVisible(true);
		seta8.setVisible(true);
	}
	});
	seta4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb24.setVisible(true);
		lb21.setVisible(false);
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
		lb25.setVisible(true);
		lb24.setVisible(false);
		lb11.setVisible(true);
		lb8.setVisible(false);
		seta5.setVisible(false);
		seta6.setVisible(false);
		seta9.setVisible(true);
		seta10.setVisible(true);
	}
	});
	seta6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb22.setVisible(true);
		lb21.setVisible(false);
		lb10.setVisible(true);
		lb8.setVisible(false);
		seta5.setVisible(false);
		seta6.setVisible(false);
		seta17.setVisible(true);
		seta18.setVisible(true);
	}
	});
	seta7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				x1.setVisible(true);
				x.setVisible(false);
				lb13.setVisible(true);
				lb9.setVisible(false);
				seta7.setVisible(false);
				seta8.setVisible(false);
				seta17.setVisible(true);
				seta18.setVisible(true);
			}else {
				lb12.setVisible(true);
				lb9.setVisible(false);
				seta7.setVisible(false);
				seta8.setVisible(false);
				seta19.setVisible(true);
				seta20.setVisible(true);
			}
	}
	});
	seta8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb22.setVisible(true);
		lb23.setVisible(false);
		lb10.setVisible(true);
		lb9.setVisible(false);
		seta7.setVisible(false);
		seta8.setVisible(false);
		seta11.setVisible(true);
		seta12.setVisible(true);
	}
	});
	seta9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb9.setVisible(true);
		lb11.setVisible(false);
		seta9.setVisible(false);
		seta10.setVisible(false);
		seta7.setVisible(true);
		seta8.setVisible(true);
	}
	});
	seta10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		lb10.setVisible(true);
		lb11.setVisible(false);
		seta9.setVisible(false);
		seta10.setVisible(false);
		seta11.setVisible(true);
		seta12.setVisible(true);
	}
	});
	seta11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				x1.setVisible(true);
				x.setVisible(false);
				lb13.setVisible(true);
				lb10.setVisible(false);
				seta11.setVisible(false);
				seta12.setVisible(false);
				seta13.setVisible(true);
				seta14.setVisible(true);
			}else {
				lb12.setVisible(true);
				lb10.setVisible(false);
				seta11.setVisible(false);
				seta12.setVisible(false);
				seta13.setVisible(true);
				seta14.setVisible(true);
			}
	}
	});
	seta12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				x1.setVisible(true);
				x.setVisible(false);
				lb13.setVisible(true);
				lb10.setVisible(false);
				seta11.setVisible(false);
				seta12.setVisible(false);
				seta13.setVisible(true);
				seta14.setVisible(true);
			}else {
				lb12.setVisible(true);
				lb10.setVisible(false);
				seta11.setVisible(false);
				seta12.setVisible(false);
				seta15.setVisible(true);
				seta16.setVisible(true);
			}
	}
	});
	seta13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Empate().setVisible(true);				
				setVisible(false);
				
			}else {
				new Win().setVisible(true);				
				setVisible(false);
				
			}
	}
	});
	seta14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Empate().setVisible(true);				
				setVisible(false);
				
			}else {
				new Win().setVisible(true);				
				setVisible(false);
				
			}
	}
	});
	seta15.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Derrota().setVisible(true);	
				setVisible(false);
				
				
			}else {
				new Empate().setVisible(true);				
				setVisible(false);
			}
	}
	});
	seta16.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Derrota().setVisible(true);	
				setVisible(false);
				
				
			}else {
				new Empate().setVisible(true);				
				setVisible(false);
			}
	}
	});
	seta17.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Derrota().setVisible(true);	
				setVisible(false);
				
				
			}else {
				new Empate().setVisible(true);				
				setVisible(false);
			}
	}
	});
	seta18.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Derrota().setVisible(true);	
				setVisible(false);
				
				
			}else {
				new Empate().setVisible(true);				
				setVisible(false);
			}
	}
	});
	seta19.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Derrota().setVisible(true);	
				setVisible(false);
				
				
			}else {
				new Derrota().setVisible(true);				
				setVisible(false);
			}
	}
	});
	seta20.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int numero = random.nextInt(2);
			if(numero==0) {
				y1.setVisible(true);
				y.setVisible(false);
				new Derrota().setVisible(true);	
				setVisible(false);
				
				
			}else {
				new Derrota().setVisible(true);				
				setVisible(false);
			}
	}
	});





}

public static void main(String args[]) {
	
	 TelaEventos2 frame = new TelaEventos2();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	
}

}
