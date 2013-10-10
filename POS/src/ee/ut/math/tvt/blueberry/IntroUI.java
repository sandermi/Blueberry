package ee.ut.math.tvt.blueberry;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.*;

public class IntroUI {
	public static void aken() throws IOException {
		JFrame raam = new JFrame("IntroUI Blueberry");
	    raam.setSize(400, 200);
	
	    
	    Properties propsapplication = new Properties();
        FileInputStream fisapplication = new FileInputStream("C:\\Users\\Sander\\Desktop\\TestRepository-master\\application.properties");

        propsapplication.load(fisapplication);
        
        Properties propsversion = new Properties();
        FileInputStream fisversion = new FileInputStream("C:\\Users\\Sander\\Desktop\\TestRepository-master\\version.properties");

        propsversion.load(fisversion);
	
	    Container sisu = raam.getContentPane();
	    sisu.setLayout(new BoxLayout(sisu, 1));
//		BufferedImage image = ImageIO.read(new File("C:\\Users\\Andreas\\Downloads\\lab3_demo\\lab3-demo\\src\\mustikas.jpg"));
//		JLabel pilt = new JLabel(new ImageIcon(image));
	    JLabel Teamname = new JLabel("Team name: " + propsapplication.getProperty("application.teamname"));
		JLabel Leadername = new JLabel("Leader: " + propsapplication.getProperty("application.leader"));
		JLabel Leaderemail = new JLabel("Leader's email: " + propsapplication.getProperty("application.lemail"));
		JLabel Members = new JLabel("Members: " + propsapplication.getProperty("application.members"));
		JLabel Softwarenr = new JLabel("Version: " + propsversion.getProperty("version.versionnr"));
	    sisu.add(Teamname);
		sisu.add(Leadername);
		sisu.add(Leaderemail);
		sisu.add(Members);
//		sisu.add(pilt);
		sisu.add(Softwarenr);
		raam.setVisible(true);
		
  }
}
