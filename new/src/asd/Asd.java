package asd;

import javax.swing.*;
import java.awt.*;

public class Asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame win;
		Container contentPane;
		Graphics g;
		
		win = new JFrame("Hello");
		win.setSize(640, 480);
		win.setLocation(150,100);
		win.setVisible(true);
		
		contentPane = win.getContentPane();
		contentPane.setBackground(Color.black);
		g = contentPane.getGraphics();
		
		g.setColor(Color.blue);
		int len = g.getFont().getSize();
		g.drawString("Hello world", 320-len*4, 240-len/2);
		System.out.println(len);
		
	}

}
