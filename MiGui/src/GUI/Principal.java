package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Principal {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		JLabel label = new JLabel();
		ImageIcon icon = new ImageIcon("images/dgt.png"); 
		JButton boton1 = new JButton();
		boton1.setPreferredSize(new Dimension(100, 100));
		boton1.setText("CACA");
		boton1.setSize(100, 20);
		boton1.addActionListener(e -> System.out.println("Caca"));
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance(60, 100,  java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		label.setText("Holita");
		label.setIcon(icon);

		JPanel redPanel = new JPanel();
		JPanel bluePanel = new JPanel();
		JPanel greenPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		bluePanel.add(boton1);
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		
		
		
		frame.add(redPanel);	
		redPanel.add(label);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
		
	}

}
