package gui;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundPerrito extends JPanel {
	private Image backgroundImage;

	public BackgroundPerrito(String imagePath) {
	    backgroundImage = new ImageIcon(getClass().getResource(imagePath)).getImage();
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Transparencia del fondo: 0.5f = 50%
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
        g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();
    }
}
