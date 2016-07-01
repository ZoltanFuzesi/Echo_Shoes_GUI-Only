package EchoProject;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		
    	int dialogButton = JOptionPane.showConfirmDialog (null, "Close application ?","WARNING",JOptionPane.YES_NO_OPTION);

    	if(dialogButton == JOptionPane.YES_OPTION)
    	{
    		System.exit(0);
    	}else 
    	{

    	}
       
    }
	
}