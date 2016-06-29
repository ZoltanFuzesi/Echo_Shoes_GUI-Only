package EchoProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class history extends JFrame implements ActionListener
{
	private	Dimension dropBox = new Dimension(250,25);
	private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel mainPanel = new JPanel();
	private JPanel mainPanelBottom = new JPanel();
	private JPanel mainTop = new JPanel();
	private JPanel mainTopOne = new JPanel();
	private JPanel mainTopTwo = new JPanel();
	private JPanel mainCenter = new JPanel();
	private JPanel mainCenterOne = new JPanel();
	private JPanel mainCenterTwo = new JPanel();
	
	private JPanel emptyCenter = new JPanel();
	private JPanel emptyTopLeft = new JPanel();
	private JPanel emptyTopCenter = new JPanel();
	private JPanel emptyTopRigth = new JPanel();
	private JPanel emptyBottonLeft = new JPanel();
	private JPanel emptyBottonCenter = new JPanel();
	private JPanel emptyBottonRigth = new JPanel();
	
	private JPanel emptySecondOne = new JPanel();
	private JPanel emptySecondTwo = new JPanel();
	private JPanel emptySecondThree = new JPanel();
	private JPanel emptyThirdOne = new JPanel();
	private JPanel emptyThidrdTwo = new JPanel();
	private JPanel emptyThirdThree = new JPanel();
	
	private JPanel textAreaHolder = new JPanel();
	
	private JLabel mainLabel = new JLabel("History");
	
	//change for JcomboBoxes
	JLabel userLabel = new JLabel("Select User");
	JLabel actionLabel = new JLabel("Select Action");
	JLabel logLabel = new JLabel("Log Records");
	JLabel customerLabel = new JLabel("Customer");
	JLabel bougthLabel = new JLabel("Bougth products");
	JLabel allLogLabel = new JLabel("All other logs");
	private DefaultComboBoxModel userModel = new DefaultComboBoxModel();
	private JComboBox user = new JComboBox(userModel);
	
	private DefaultComboBoxModel actionModel = new DefaultComboBoxModel();
	private JComboBox action = new JComboBox(actionModel);
	
	private DefaultComboBoxModel logModel = new DefaultComboBoxModel();
	private JComboBox log = new JComboBox(logModel);
	
	private DefaultComboBoxModel customerModel = new DefaultComboBoxModel();
	private JComboBox customer = new JComboBox(customerModel);
	
	private DefaultComboBoxModel bougthModel = new DefaultComboBoxModel();
	private JComboBox bougth = new JComboBox(bougthModel);
	
	private DefaultComboBoxModel allLogModel = new DefaultComboBoxModel();
	private JComboBox allLog = new JComboBox(allLogModel);
	
	private JButton clearBtn = new JButton("Clear");
	private JButton closeBtn = new JButton("Close");
	
	private JTextArea historyText = new JTextArea(15,80);
	private JScrollPane textPane = new JScrollPane(historyText);
	
	public history()
	{
		super("History");
		   setLayout(new BorderLayout());
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	        this.setLocation(dim.width/2-this.getSize().width/2-500, dim.height/2-this.getSize().height/2-275);
	        setSize(1000,  550);
	        setMinimumSize(new Dimension(1000 , 550));
	        setResizable(true);
	        createHistoryWindow();
	       
	}
	
	public void createHistoryWindow()
	{
		user.setPreferredSize(dropBox);
		action.setPreferredSize(dropBox);
		log.setPreferredSize(dropBox);
		customer.setPreferredSize(dropBox);
		bougth.setPreferredSize(dropBox);
		allLog.setPreferredSize(dropBox);
		//sec thr need dgrid layout
		mainPanel.setLayout(new BorderLayout());		//top panel
		mainTop.add(mainLabel);							//label
		mainPanel.add(mainTop, BorderLayout.NORTH);
		mainTop.setBorder(BorderFactory.createMatteBorder(1,0,1,0, Color.black));
		mainTopOne.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.black));
		mainTopTwo.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.black));
		
		mainTopOne.setLayout(new GridLayout(2,3));
		emptyTopLeft.add(userLabel);
		mainTopOne.add(emptyTopLeft);
		emptyTopCenter.add(actionLabel);				//drop sec
		mainTopOne.add(emptyTopCenter);					//drop sec
		emptyTopRigth.add(logLabel);
		mainTopOne.add(emptyTopRigth);					//drop sec
		emptyBottonLeft.add(user);
		mainTopOne.add(emptyBottonLeft);				//drop sec
		emptyBottonCenter.add(action);
		mainTopOne.add(emptyBottonCenter);				//drop sec
		emptyBottonRigth.add(log);
		mainTopOne.add(emptyBottonRigth);				//drop sec
		mainCenter.setLayout(new BorderLayout());
		mainCenter.add(mainTopOne, BorderLayout.NORTH);
		mainCenterOne.setLayout(new BorderLayout());
		mainTopTwo.setLayout(new GridLayout(2,3));
		emptySecondOne.add(customerLabel);
		mainTopTwo.add(emptySecondOne);
		emptySecondTwo.add(bougthLabel);				//drop third
		mainTopTwo.add(emptySecondTwo);
		emptySecondThree.add(allLogLabel);				
		mainTopTwo.add(emptySecondThree);
		emptyThirdOne.add(customer);					//drop third
		mainTopTwo.add(emptyThirdOne);
		emptyThidrdTwo.add(bougth);
		mainTopTwo.add(emptyThidrdTwo);
		emptyThirdThree.add(allLog);
		mainTopTwo.add(emptyThirdThree);
		mainCenterOne.add(mainTopTwo, BorderLayout.NORTH);
		
		//mainCenterOne.setBackground(Color.black);
		//textAreaHolder.setBackground(Color.black);
		//textAreaHolder.setBorder(BorderFactory.createLineBorder(Color.black));
		historyText.setEditable(false);
		textAreaHolder.add(textPane);
		mainCenterTwo.add(textAreaHolder);//text area
		mainCenterOne.add(mainCenterTwo, BorderLayout.CENTER);
		mainCenter.add(mainCenterOne, BorderLayout.CENTER);
		mainPanel.add(mainCenter, BorderLayout.CENTER);
		mainPanelBottom.setBorder(BorderFactory.createMatteBorder(1,0,1,0, Color.black));
		closeBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		mainPanelBottom.add(closeBtn);
		mainPanelBottom.add(clearBtn);
		mainPanel.setBorder(BorderFactory.createMatteBorder(0,1,0,1, Color.black));
		mainPanel.add(mainPanelBottom, BorderLayout.SOUTH);
		
		
		//getContentPane().add(mainTopOne, BorderLayout.NORTH);
		getContentPane().add(mainPanel);
	}
	
	public void showHistoryWindow()
	{
		this.repaint();
		this.revalidate();
		setVisible(true);
	}
	
	public void closeHistory()
	{
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String command = e.getActionCommand();
		
		if (command.equals("Close"))
		{
			super.dispose();
			
		}
	}
}
