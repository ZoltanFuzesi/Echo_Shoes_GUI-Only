package EchoProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;


public class changeWindow extends JFrame implements ActionListener
{
	private mainWindow mainW;
	private BufferedImage image = new BufferedImage(250, 150, BufferedImage.SCALE_FAST);//ImageIO.read(DatabaseGui.class.getClass().getResourceAsStream("/images/DataB.jpg"));
    private ImageIcon img =  new ImageIcon(image);  
    private JLabel labBack = new JLabel(img, SwingConstants.CENTER);
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private double width = screenSize.getWidth();
    private double height = screenSize.getHeight();
	private int returnVal;
	@SuppressWarnings("unused")
	private  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	private  GridBagConstraints c = new GridBagConstraints();   
	private	Dimension dropDim = new Dimension(250,25);	
		//JPanels main structure
	private	JPanel mainTop = new JPanel(new GridLayout(2,4));
	private	JPanel mainBotton = new JPanel();
	private	JPanel mainBottonOne = new JPanel();
	private	JPanel mainBottonTwo = new JPanel();
	private	JPanel mainBottonThree = new JPanel();
	private	JPanel mainBottonFour = new JPanel();
	private	JPanel mainBottonFive = new JPanel();
	private	JPanel mainBottonSix = new JPanel();
	private	JPanel mainBottonSeven = new JPanel();
	private	JPanel mainBottonEigth = new JPanel();
	private	JPanel mainCenter = new JPanel();
	private	JPanel mainLeft = new JPanel();//gridlayout 3,1
	private	JPanel emptyOne = new JPanel();
	private	JPanel emptyTwo = new JPanel();
	private	JPanel emptyFour = new JPanel();
	private	JPanel emptyFive = new JPanel();
	private	JPanel emptySix = new JPanel();
	private	JPanel emptySeven = new JPanel();
	private	JPanel emptyEigth = new JPanel();
	private	JPanel emptyNine = new JPanel();
	private	JPanel emptyTen = new JPanel();
	private	JPanel emptyEleven = new JPanel();		
	private	JPanel leftOne = new JPanel();
	private	JPanel leftOneTop = new JPanel();
	private	JPanel leftOneBotton = new JPanel();
	private	JPanel leftTwo = new JPanel();
	private	JPanel leftThree = new JPanel();
	private	JPanel leftThreeTop = new JPanel();
	private	JPanel leftThreeBotton = new JPanel();
	private	JPanel innerCenter = new JPanel();//layout 12,1	
	private	JPanel innerOne = new JPanel();
	private	JPanel innerOne1 = new JPanel();
	private	JPanel innerOne2 = new JPanel();
	private	JPanel innerOne3 = new JPanel();	
	private	JPanel innerTwo = new JPanel();
	private	JPanel twoone = new JPanel();
	private	JPanel twoTwo = new JPanel();	
	private	JPanel innerThree = new JPanel();
	private	JPanel threeone = new JPanel();
	private	JPanel threeTwo = new JPanel();	
	private	JPanel innerFour = new JPanel();
	private	JPanel fourone = new JPanel();
	private	JPanel fourTwo = new JPanel();		
	private	JPanel innerFive = new JPanel();
	private	JPanel fiveone = new JPanel();
	private	JPanel fiveTwo = new JPanel();		
	private	JPanel innerSix = new JPanel();
	private	JPanel sixone = new JPanel();
	private	JPanel sixTwo = new JPanel();	
	private	JPanel innerSeven = new JPanel();
	private	JPanel sevenone = new JPanel();
	private	JPanel sevenTwo = new JPanel();	
	private	JPanel innerEigth = new JPanel();
	private	JPanel eigthone = new JPanel();
	private	JPanel eigthTwo = new JPanel();		
	private	JPanel innerNine = new JPanel();
	private	JPanel nineone = new JPanel();
	private	JPanel nineTwo = new JPanel();		
	private	JPanel innerTen = new JPanel();
	private	JPanel tenone = new JPanel();
	private	JPanel tenTwo = new JPanel();		
	private	JPanel innerEleven = new JPanel();
	private	JPanel elevenone = new JPanel();
	private	JPanel elevenTwo = new JPanel();		
	private	JPanel innerTwelve = new JPanel();
	private	JPanel innerTwelveOne = new JPanel();
	private	JPanel innerTwelveTwo = new JPanel();
	private	JPanel innerTwelveThree = new JPanel();
	
	private	JLabel adm = new JLabel("Admin Actions");
	private	JLabel sup = new JLabel("Supplier Actions");
	private	JLabel cus = new JLabel("Customer Actions");
	private	JLabel pro = new JLabel("Product Actions");
	private	JLabel locationLabel2 = new JLabel("");
	private	JLabel locationLabel3= new JLabel("");
	private	JLabel uploadImageLabel= new JLabel("Select image to product");
	private	JLabel pictureNameLabel= new JLabel("");
	
	private	JButton exit = new JButton("Exit");
	private	JButton action = new JButton("Action");
	private	JButton action1 = new JButton("Search.");
	private	JButton action2 = new JButton("Search..");
	private	JButton action3 = new JButton("Search...");
	private	JButton action4 = new JButton("Add.");
	private	JButton action5 = new JButton("Add..");
	private	JButton action6 = new JButton("Add...");
	private	JButton action7 = new JButton("Delete.");
	private	JButton action8 = new JButton("Delete..");
	private	JButton action9 = new JButton("Delete...");
	private	JButton action10 = new JButton("Add User");
	private	JButton action11= new JButton("Delete User");
	private	JButton action12 = new JButton("History");		
	private	JButton addPhoto = new JButton("Add Photo");
	private JButton passwordButton = new JButton("Change Password");
	
		//Button holder panels
	private	JPanel adminLabel = new JPanel();
	private	JPanel supplierLabel = new JPanel();
	private	JPanel customerLabel = new JPanel();
	private	JPanel productLabel = new JPanel();
	private	JPanel adminHolder = new JPanel();
	private	JPanel supplierHolder = new JPanel();
	private	JPanel customerHolder = new JPanel();
	private	JPanel productHolder = new JPanel();		
		//search bropdown boxes
	private	DefaultComboBoxModel searchByID = new DefaultComboBoxModel();	
	private	JComboBox searchByIdBox = new JComboBox(searchByID);	
	private	DefaultComboBoxModel searchByName = new DefaultComboBoxModel();	
	private	JComboBox searchByNameBox = new JComboBox(searchByName);			
		//Main action drop down boxes and label
	private	JLabel dropIdLabel = new JLabel("");		
	private	JTextField dropIDText  = new JTextField();		
	private	JLabel dropNameLabel = new JLabel("");
	private	DefaultComboBoxModel Name = new DefaultComboBoxModel();	
	private	JTextField dropNameText  = new JTextField();		
	private	JLabel dropStreetLabel = new JLabel("");
	private	DefaultComboBoxModel Street = new DefaultComboBoxModel();	
	private	JTextField dropStreetText  = new JTextField();		
	private	JLabel dropTownLabel = new JLabel("");
	private	JTextField dropTownText = new JTextField();
	private	JLabel dropCountyLabel = new JLabel("");
	private	JTextField dropCountyText = new JTextField();	
	private	JLabel dropCountryLabel = new JLabel("");
	private JTextField dropCountryText = new JTextField();		
	private	JLabel dropPostCodeLabel = new JLabel("");
	private	JTextField dropPostCodeText = new JTextField();		
	private	JLabel dropEmailLabel = new JLabel("");
	private	JTextField dropEmailText = new JTextField();		
	private JLabel dropContactLabel = new JLabel("");
	private JTextField dropContactText = new JTextField();		
	private	JLabel dropProductLabel = new JLabel("");
	private DefaultComboBoxModel Products = new DefaultComboBoxModel();	
	private	JComboBox dropProducts = new JComboBox(Products);
	private	JTextField dropProductsText = new JTextField();
	private history history;
	
	public changeWindow()
	{
		  super("Echo.Shoes");
		    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
	        setLocation(0, 0);
	        setResizable(true);	               
	        createWorkingWindow(); 
	        history = new history();
	}
	

	//admin
	public void home()
	{
		
		searchByIdBox.setVisible(false);
		searchByNameBox.setVisible(false);
		locationLabel3.setVisible(false);
		
	}
	
	public void addUser()
	{
		setEditableUser();
		addPhoto.setVisible(false);
		locationLabel2.setText("Add User");
		searchByIdBox.setVisible(false);
		searchByNameBox.setVisible(false);
		locationLabel3.setVisible(false);
		dropIdLabel.setText("User name");
		dropIdLabel.setVisible(true);
		dropIDText.setVisible(true);
		dropNameLabel.setText("Create Password");
		dropNameLabel.setVisible(true);
		dropNameText.setVisible(true);
		dropStreetLabel.setText("Repeat password");
		dropStreetLabel.setVisible(true);
		dropStreetText.setVisible(true);
		dropTownLabel.setText("Email");
		dropTownLabel.setVisible(true);
		dropTownText.setVisible(true);
		action.setText("Create User");
		action.setVisible(true);
	}
	
	public void deleteUser()
	{
		
		locationLabel2.setText("Delete User");
		locationLabel3.setText("Search by Id,Name ");
		dropIdLabel.setText("User name");
		dropIdLabel.setVisible(true);
		dropIDText.setVisible(true);
		dropNameLabel.setText("Password");
		dropNameLabel.setVisible(true);
		dropNameText.setVisible(true);
		action.setText("Delete User");
		action.setVisible(true);
		setUnEditableUser();
	}
	
	
	public void searchSupplier()
	{
		locationLabel2.setText("Search Supplier");
		locationLabel3.setText("Search by Id,Name ");
		dropIdLabel.setText("Supplier ID");
		action.setText("Change Supplier Details");
		action.setVisible(true);
		changeComponentsToJtext();
		dropNameLabel.setText("Supplier Name");
		dropProductLabel.setText("Products");
		changeBackLabels();
		setEditableFalse();
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
	}
	
	public void addSupplier()
	{
		locationLabel2.setText("Add Supplier");
		//locationLabel3.setText("Search by Id,Name ");
		dropIdLabel.setText("Supplier ID");
		action.setText("Add Supplier");
		action.setVisible(true);
		dropNameLabel.setText("Supplier Name");		
		dropProductLabel.setText("");
		changeBackLabels();
		setEditableTrue();
		changeComponentsToJtext();
		searchByIdBox.setVisible(false);
		searchByNameBox.setVisible(false);
		locationLabel3.setVisible(false);
		
	}
	

	public void deleteSupplier()
	{
		locationLabel2.setText("Delete Supplier");
		locationLabel3.setText("Search by Id,Name ");
		dropIdLabel.setText("Supplier ID");
		dropNameLabel.setText("Supplier Name");
		action.setText("Delete Supplier");
		action.setVisible(true);
		dropProductLabel.setText("");
		changeComponentsToJtext();
		changeBackLabels();
		setEditableFalse();
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
	}
	
	//customer
	public void searchCustomer()
	{
		locationLabel2.setText("Search Customer");
		locationLabel3.setText("Search by Id,Name ");
		dropNameLabel.setText("Customer Name");
		dropIdLabel.setText("Customer ID");
		dropProductLabel.setText("Bougth Products");
		action.setText("Change Customer Details");
		action.setVisible(true);
		changeComponentsToJtext();
		changeBackLabels();
		setEditableFalse();
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
	}
	
	public void addCustomer()
	{
		locationLabel2.setText("Add Customer");
		//locationLabel3.setText("Search by Id,Name ");
		dropNameLabel.setText("Customer Name");
		dropIdLabel.setText("Customer ID");
		action.setText("Add Customer");
		action.setVisible(true);
		changeBackLabels();
		setEditableTrue();
		dropProductLabel.setText("Products");
		searchByIdBox.setVisible(false);
		searchByNameBox.setVisible(false);
		locationLabel3.setVisible(false);
	}
	
	public void deleteCustomer()
	{
		locationLabel2.setText("Delete Customer");
		locationLabel3.setText("Search by Id,Name ");
		dropNameLabel.setText("Customer Name");
		dropIdLabel.setText("Customer ID");
		action.setText("Delete Customer");
		dropProductLabel.setText("");
		action.setVisible(true);
		changeBackLabels();
		setEditableFalse();
		dropProducts.setVisible(false);
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
	}
	
	public void searchProduct()
	{
		locationLabel2.setText("Search Product");
		locationLabel3.setText("Search by Id,Name ");
		dropNameLabel.setText("Product Name");
		dropIdLabel.setText("Product ID");
		action.setText("Change Product Details");
		action.setVisible(true);
		dropProductLabel.setVisible(false);
		dropProductsText.setVisible(false);
		changeComponentsToJtext();
		changeProductLabels();
		setEditableFalse();
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
	}
	
	public void addProduct()
	{
		locationLabel2.setText("Add Product");
		locationLabel3.setText("Search by Id,Name ");
		dropNameLabel.setText("Product Name");
		dropIdLabel.setText("Product ID");
		action.setText("Add Product");
		action.setVisible(true);
		dropProductLabel.setVisible(false);
		dropProductsText.setVisible(false);
		changeComponentsToJbox();
		changeProductLabels();
		setEditableTrue();
		addPhoto.setVisible(true);
		searchByIdBox.setVisible(false);
		searchByNameBox.setVisible(false);
		locationLabel3.setVisible(false);
	}
	
	public void deleteProduct()
	{
		locationLabel2.setText("Delete Product");
		locationLabel3.setText("Search by Id,Name ");
		dropNameLabel.setText("Product Name");
		dropIdLabel.setText("Product ID");
		action.setText("Delete Product");
		action.setVisible(true);
		dropProductLabel.setVisible(false);
		dropProductsText.setVisible(false);
		changeComponentsToJtext();
		changeProductLabels();
		setEditableFalse();
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
	}
	
	public void changeProductLabels()
	{
		dropStreetLabel.setText("Supplier");
		dropTownLabel.setText("Type");
		dropCountyLabel.setText("Size");
		dropCountryLabel.setText("Price");
		dropPostCodeLabel.setText("Colour");
		dropEmailLabel.setText("Contact");
		dropContactLabel.setText("");
	}
	
	public void changeBackLabels()
	{
		dropStreetLabel.setText("Street");
		dropTownLabel.setText("Town");
		dropCountyLabel.setText("County");
		dropCountryLabel.setText("Country");
		dropPostCodeLabel.setText("Post Code");
		dropEmailLabel.setText("Email");
		dropContactLabel.setText("Contact");
	}
	
	
	
	public void setVisibleFalse()
	{
		dropIdLabel.setVisible(false);
		dropIDText.setVisible(false);
		dropNameLabel.setVisible(false);
		dropNameText.setVisible(false);
		dropStreetLabel.setVisible(false);
		dropStreetText.setVisible(false);
		//dropStreetBox.setVisible(false);
		dropTownLabel.setVisible(false);
		dropTownText.setVisible(false);
		dropCountyLabel.setVisible(false);
		dropCountyText.setVisible(false);
		dropCountryLabel.setVisible(false);
		dropCountryText.setVisible(false);
		dropPostCodeLabel.setVisible(false);
		dropPostCodeText.setVisible(false);
		dropEmailLabel.setVisible(false);
		dropEmailText.setVisible(false);
		dropContactLabel.setVisible(false);
		dropContactText.setVisible(false);
		dropPostCodeLabel.setVisible(false);
		dropContactText.setVisible(false);
		dropProductLabel.setVisible(false);
		dropProducts.setVisible(false);
		passwordButton.setVisible(false);
		action.setVisible(false);
	}
	
	public void setVisibleTrue()
	{
		locationLabel2.setVisible(true);
		locationLabel3.setVisible(true);
		dropIdLabel.setVisible(true);
		dropIDText.setVisible(true);
		dropNameLabel.setVisible(true);
		dropNameText.setVisible(true);
		dropStreetLabel.setVisible(true);
		dropStreetText.setVisible(true);
		dropTownLabel.setVisible(true);
		dropTownText.setVisible(true);
		dropCountyLabel.setVisible(true);
		dropCountyText.setVisible(true);
		dropCountryLabel.setVisible(true);
		dropCountryText.setVisible(true);
		dropPostCodeLabel.setVisible(true);
		dropPostCodeText.setVisible(true);
		dropEmailLabel.setVisible(true);
		dropEmailText.setVisible(true);
		dropContactLabel.setVisible(true);
		dropContactText.setVisible(true);
		dropPostCodeLabel.setVisible(true);
		dropContactText.setVisible(true);
		dropProductLabel.setVisible(true);
		dropProducts.setVisible(true);	
		passwordButton.setVisible(false);
	}
	
	public void changeComponentsToJbox()
	{
		if(dropStreetText.isShowing())
		{
			dropIDText.setPreferredSize(dropDim);
			dropNameText.setPreferredSize(dropDim);
			dropStreetLabel.setText("Supplier");
			dropIDText.setEditable(false);
		}
		
	}
	
	public void changeComponentsToJtext()
	{
		if(dropStreetText.isShowing())
		{ 
			dropStreetLabel.setText("Street");
		}
	}
	
	public void setEditableTrue()
	{
		dropNameText.setEditable(true);
		dropNameText.setBackground(Color.WHITE);
		
		dropStreetText.setEditable(true);
		dropStreetText.setBackground(Color.WHITE);
		
		dropTownText.setEditable(true);
		dropTownText.setBackground(Color.WHITE);
		
		dropCountyText.setEditable(true);
		dropCountyText.setBackground(Color.WHITE);
		
		dropCountryText.setEditable(true);
		dropCountryText.setBackground(Color.WHITE);
		
		dropPostCodeText.setEditable(true);
		dropPostCodeText.setBackground(Color.WHITE);
		
		dropEmailText.setEditable(true);
		dropEmailText.setBackground(Color.WHITE);
		
		dropContactText.setEditable(true);
		dropContactText.setBackground(Color.WHITE);
	}
	
	public void setEditableFalse()
	{
		dropIDText.setEditable(false);
		dropIDText.setBackground(Color.lightGray);
		
		dropNameText.setEditable(false);
		dropNameText.setBackground(Color.lightGray);
		
		dropStreetText.setEditable(false);
		dropStreetText.setBackground(Color.lightGray);
		
		dropTownText.setEditable(false);
		dropTownText.setBackground(Color.lightGray);
		
		dropCountyText.setEditable(false);
		dropCountyText.setBackground(Color.lightGray);
		
		dropCountryText.setEditable(false);
		dropCountryText.setBackground(Color.lightGray);
		
		dropPostCodeText.setEditable(false);
		dropPostCodeText.setBackground(Color.lightGray);
		
		dropEmailText.setEditable(false);
		dropEmailText.setBackground(Color.lightGray);
		
		dropContactText.setEditable(false);
		dropContactText.setBackground(Color.lightGray);
		
		dropProductsText.setEditable(false);
		dropProductsText.setBackground(Color.lightGray);
		
		
	}
	
	public void allComponentsNotVisible()
	{
		dropIdLabel.setVisible(false);
		dropIDText.setVisible(false);
		dropNameLabel.setVisible(false);
		dropNameText.setVisible(false);
		dropStreetLabel.setVisible(false);
		dropStreetText.setVisible(false);
		dropTownLabel.setVisible(false);
		dropTownText.setVisible(false);
		dropCountyLabel.setVisible(false);
		dropCountyText.setVisible(false);
		dropCountryLabel.setVisible(false);
		dropCountryText.setVisible(false);
		dropPostCodeLabel.setVisible(false);
		dropPostCodeText.setVisible(false);
		dropEmailLabel.setVisible(false);
		dropEmailText.setVisible(false);
		dropContactLabel.setVisible(false);
		dropContactText.setVisible(false);
		dropPostCodeLabel.setVisible(false);
		dropPostCodeText.setVisible(false);
		dropContactLabel.setVisible(false);
		dropContactText.setVisible(false);
		dropProductLabel.setVisible(false);
		dropProducts.setVisible(false);
		//passwordButton.setVisible(false);
		action.setVisible(false);
	}
	
	public void setEditableUser()
	{
		dropIDText.setEditable(true);
		dropIDText.setBackground(Color.WHITE);
		dropNameText.setEditable(true);
		dropNameText.setBackground(Color.WHITE);
		dropStreetText.setEditable(true);
		dropStreetText.setBackground(Color.WHITE);
		dropTownText.setEditable(true);
		dropTownText.setBackground(Color.WHITE);
	}
		
	public void setUnEditableUser()
	{
		locationLabel3.setVisible(true);
		searchByIdBox.setVisible(true);
		searchByNameBox.setVisible(true);
		dropIDText.setEditable(false);
		dropIDText.setBackground(Color.lightGray);
		dropNameText.setEditable(false);
		dropNameText.setBackground(Color.lightGray);
		
	}
	
	public void createWorkingWindow()
	{
		passwordButton.setVisible(false);
		setLayout(new BorderLayout());
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(2, 2, 2, 2);
		//empty.setBackground(Color.BLUE);
		searchByIdBox.setPreferredSize(dropDim);
		searchByNameBox.setPreferredSize(dropDim);
		dropIDText.setPreferredSize(dropDim);
		dropNameText.setPreferredSize(dropDim);
		dropStreetText.setPreferredSize(dropDim);
		dropTownText.setPreferredSize(dropDim);
		dropCountyText.setPreferredSize(dropDim);
		dropCountryText.setPreferredSize(dropDim);
		dropPostCodeText.setPreferredSize(dropDim);
		dropEmailText.setPreferredSize(dropDim);
		dropContactText.setPreferredSize(dropDim);
		dropProductsText.setPreferredSize(dropDim);
		dropProducts.setPreferredSize(dropDim);
		
		mainCenter.setLayout(new BorderLayout());
		JPanel centerTop = new JPanel();
		mainCenter.add(centerTop, BorderLayout.NORTH);
		innerCenter.setLayout(new GridLayout(12,1));
		//*****
		innerOne.setLayout(new GridLayout(1,3));
		innerOne.add(innerOne1);
		innerOne2.add(locationLabel2);
		innerOne.add(innerOne2);
		innerOne3.add(locationLabel3);
		innerOne.add(innerOne3);
		innerCenter.add(innerOne);
		//******
		innerTwo.setLayout(new GridLayout(1,3));
		twoone.setLayout(new BorderLayout());
		twoone.add(dropIdLabel, BorderLayout.EAST);
		innerTwo.add(twoone);
		twoTwo.add(dropIDText);
		innerTwo.add(twoTwo);
		searchByIdBox.setVisible(false);
		emptyOne.add(searchByIdBox);
		innerTwo.add(emptyOne);
		innerCenter.add(innerTwo);
		//***********
		innerThree.setLayout(new GridLayout(1, 3));
		threeone.setLayout(new BorderLayout());
		threeone.add(dropNameLabel, BorderLayout.EAST);
		innerThree.add(threeone);
		dropNameText.setPreferredSize(dropDim);
		threeTwo.add(dropNameText);
		innerThree.add(threeTwo);
		searchByNameBox.setVisible(false);
		emptyTwo.add(searchByNameBox);
		innerThree.add(emptyTwo);
		innerCenter.add(innerThree);
		//***********
		innerFour.setLayout(new GridLayout(1,3));
		fourone.setLayout(new BorderLayout());
		fourone.add(dropStreetLabel, BorderLayout.EAST);
		innerFour.add(fourone);
		fourTwo.add(dropStreetText);
		innerFour.add(fourTwo);
		innerFour.add(emptyFour);
		innerCenter.add(innerFour);
		
		//**********
		innerFive.setLayout(new GridLayout(1,3));
		fiveone.setLayout(new BorderLayout());
		fiveone.add(dropTownLabel, BorderLayout.EAST);
		innerFive.add(fiveone);
		fiveTwo.add(dropTownText);
		innerFive.add(fiveTwo);
		innerFive.add(emptyFive);
		innerCenter.add(innerFive);
		//********
		innerSix.setLayout(new GridLayout(1,2));
		sixone.setLayout(new BorderLayout());
		sixone.add(dropCountyLabel, BorderLayout.EAST);
		innerSix.add(sixone);
		sixTwo.add(dropCountyText);
		innerSix.add(sixTwo);
		innerSix.add(emptySix);
		innerCenter.add(innerSix);
		//**********
		innerSeven.setLayout(new GridLayout(1,3));
		sevenone.setLayout(new BorderLayout());
		sevenone.add(dropCountryLabel, BorderLayout.EAST);
		innerSeven.add(sevenone);
		sevenTwo.add(dropCountryText);
		innerSeven.add(sevenTwo);
		innerSeven.add(emptySeven);
		innerCenter.add(innerSeven);
		//***********
		innerEigth.setLayout(new GridLayout(1,3));
		eigthone.setLayout(new BorderLayout());
		eigthone.add(dropPostCodeLabel, BorderLayout.EAST);
		innerEigth.add(eigthone);
		eigthTwo.add(dropPostCodeText);
		innerEigth.add(eigthTwo);
		innerEigth.add(emptyEigth);
		innerCenter.add(innerEigth);
		//*********
		innerNine.setLayout(new GridLayout(1,3));
		nineone.setLayout(new BorderLayout());
		nineone.add(dropEmailLabel, BorderLayout.EAST);
		innerNine.add(nineone);
		nineTwo.add(dropEmailText);
		innerNine.add(nineTwo);
		innerNine.add(emptyNine);
		innerCenter.add(innerNine);
		//************
		innerTen.setLayout(new GridLayout(1,3));
		tenone.setLayout(new BorderLayout());
		tenone.add(dropContactLabel, BorderLayout.EAST);
		innerTen.add(tenone);
		tenTwo.add(dropContactText);
		innerTen.add(tenTwo);
		innerTen.add(emptyTen);
		innerCenter.add(innerTen);
		//**************
		innerEleven.setLayout(new GridLayout(1,3));
		elevenone.setLayout(new BorderLayout());
		elevenone.add(dropProductLabel, BorderLayout.EAST);
		innerEleven.add(elevenone);
		elevenTwo.add(dropProducts);
		innerEleven.add(elevenTwo);
		innerEleven.add(emptyEleven);
		innerCenter.add(innerEleven);
		
		
		//*************USED FOR CHANGE BUTTON
		innerTwelve.setLayout(new GridLayout(1,3));
		innerTwelve.add(innerTwelveOne);
		passwordButton.addActionListener(this);
		innerTwelveOne.add(passwordButton);
		innerTwelve.add(innerTwelveTwo);
		innerTwelve.add(innerTwelveThree);
		innerTwelveTwo.add(action);
		action.addActionListener(this);
		innerCenter.add(innerTwelve);
		//innerCenter.setBackground(Color.cyan);
		//innerCenter.setBorder(BorderFactory.createLineBorder(Color.black));
		//***************
		mainCenter.add(innerCenter);
		//mainBotton.setBounds(0, 0, dim.width, 150);
		//mainBotton.setBackground(Color.BLUE);
		
		//Closing window control
		addWindowListener(new MyWindowListener());

		adminLabel.add(adm);
		mainTop.add(adminLabel);
		supplierLabel.add(sup);
		mainTop.add(supplierLabel);
		customerLabel.add(cus);
		mainTop.add(customerLabel);
		productLabel.add(pro);
		mainTop.add(productLabel);
		adminHolder.setBorder(BorderFactory.createMatteBorder(2,1,1,1, Color.black));
		mainTop.add(adminHolder);
		adminHolder.add(action10);
		action10.addActionListener(this);
		adminHolder.add(action11);
		action11.addActionListener(this);
		adminHolder.add(action12);
		action12.addActionListener(this);
		supplierHolder.setBorder(BorderFactory.createMatteBorder(2,1,1,1, Color.black));
		mainTop.add(supplierHolder);
		supplierHolder.add(action1);
		action1.addActionListener(this);
		supplierHolder.add(action4);
		action4.addActionListener(this);
		supplierHolder.add(action7);
		action7.addActionListener(this);
		customerHolder.setBorder(BorderFactory.createMatteBorder(2,1,1,1, Color.black));
		mainTop.add(customerHolder);
		customerHolder.add(action2);
		action2.addActionListener(this);
		customerHolder.add(action5);
		action5.addActionListener(this);
		customerHolder.add(action8);
		action8.addActionListener(this);
		productHolder.setBorder(BorderFactory.createMatteBorder(2,1,1,1, Color.black));
		mainTop.add(productHolder);
		productHolder.add(action3);
		action3.addActionListener(this);
		productHolder.add(action6);
		action6.addActionListener(this);
		productHolder.add(action9);
		action9.addActionListener(this);
		mainLeft.setLayout(new GridLayout(3,1));
		leftOne.setLayout(new GridLayout(2,1));
		leftOne.add(leftOneTop);
		leftOneBotton.add(uploadImageLabel);
		leftOne.add(leftOneBotton);
		mainLeft.add(leftOne);
		mainLeft.add(leftTwo);
		labBack.setOpaque(true);
		//labBack.setText("Upload image");
		labBack.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
		//labBack.setBackground(Color.WHITE);
		//labBack.setForeground(Color.GREEN);
		leftTwo.add(labBack);
		addPhoto.setVisible(false);
		addPhoto.addActionListener(this);
		leftThree.setLayout(new GridLayout(2,1));
		leftThreeTop.add(addPhoto);
		leftThree.add(leftThreeTop);
		leftThreeBotton.add(pictureNameLabel);
		leftThree.add(leftThreeBotton);
		leftThree.setBackground(Color.black);
		//leftThree.add(addPhoto);
		mainLeft.add(leftThree);
		//mainTop.setBorder(BorderFactory.createLineBorder(Color.black));
		mainLeft.setBorder(BorderFactory.createMatteBorder(0,1,1,1, Color.black));
		mainBotton.setLayout(new GridLayout(1,7));
		mainBottonFour.add(exit);
		exit.addActionListener(this);
		mainBotton.add(mainBottonOne);
		mainBotton.add(mainBottonTwo);
		mainBotton.add(mainBottonThree);
		mainBotton.add(mainBottonFour);
		mainBotton.add(mainBottonFive);
		mainBotton.add(mainBottonSix);
		mainBotton.add(mainBottonSeven);
		//mainBotton.add(mainBottonEigth);
		mainBotton.setBackground(Color.black);
		mainBotton.setBorder(BorderFactory.createLineBorder(Color.black));
		mainCenter.setBorder(BorderFactory.createMatteBorder(0,1,1,1, Color.black));		
		setMinimumSize(new Dimension((int)width,(int)height));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		dropIdLabel.setVisible(false);
		dropIDText.setVisible(false);
		dropNameLabel.setVisible(false);
		dropNameText.setVisible(false);
		dropStreetLabel.setVisible(false);
		dropStreetText.setVisible(false);
		dropTownLabel.setVisible(false);
		dropTownText.setVisible(false);
		dropCountyLabel.setVisible(false);
		dropCountyText.setVisible(false);
		dropCountryLabel.setVisible(false);
		dropCountryText.setVisible(false);
		dropPostCodeLabel.setVisible(false);
		dropPostCodeText.setVisible(false);
		dropEmailLabel.setVisible(false);
		dropEmailText.setVisible(false);
		dropContactLabel.setVisible(false);
		dropContactText.setVisible(false);
		dropPostCodeLabel.setVisible(false);
		dropPostCodeText.setVisible(false);
		dropContactLabel.setVisible(false);
		dropContactText.setVisible(false);
		dropProductLabel.setVisible(false);
		dropProducts.setVisible(false);
		action.setVisible(false);
		getContentPane().add(mainLeft, BorderLayout.WEST);
		getContentPane().add(mainTop, BorderLayout.NORTH);
		getContentPane().add(mainBotton, BorderLayout.SOUTH);
		getContentPane().add(mainCenter, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void changePassword()
	{
		setEditableUser();
		addPhoto.setVisible(false);
		locationLabel2.setText("Change Password");
		searchByIdBox.setVisible(false);
		searchByNameBox.setVisible(false);
		locationLabel3.setVisible(false);
		dropIdLabel.setText("User name");
		dropIdLabel.setVisible(true);
		dropIDText.setVisible(true);
		dropNameLabel.setText("New Password");
		dropNameLabel.setVisible(true);
		dropNameText.setVisible(true);
		dropStreetLabel.setText("Repeat password");
		dropStreetLabel.setVisible(true);
		dropStreetText.setVisible(true);
		//dropTownLabel.setText("Email");
		//dropTownLabel.setVisible(true);
		//dropTownText.setVisible(true);
		action.setText("Change");
		action.setVisible(true);
	}
	//ActionListener 
	@Override
	public void actionPerformed(ActionEvent e) {
	
		String command = e.getActionCommand();
		
		if (command.equals("Exit"))
		{
			int dialogButton = JOptionPane.showConfirmDialog (null, "Close application ?","WARNING",JOptionPane.YES_NO_OPTION);

	    	if(dialogButton == JOptionPane.YES_OPTION)
	    	{
	    		history.closeHistory();
				System.exit(0);
	    	}
	    	
			
		}
		else if(command.equals("Add User"))
		{
			setVisibleFalse();
			passwordButton.setVisible(true);
			addUser();
			
		}
		else if(command.equals("Delete User"))
		{
			setVisibleFalse();
			deleteUser();
			//addPhoto.setVisible(false);
		}
		else if(command.equals("Change Password"))
		{
			setVisibleFalse();
			changePassword();
			
			
		}
		else if(command.equals("History"))
		{
			history.showHistoryWindow();
		
			
		}
		else if(command.equals("Search."))
		{
			searchSupplier();
			setVisibleTrue();
			addPhoto.setVisible(false);
		}
		else if(command.equals("Search.."))
		{
			searchCustomer();
			setVisibleTrue();
			dropProductsText.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Search..."))
		{
			setVisibleTrue();
			searchProduct();
			dropContactLabel.setVisible(false);
			dropProducts.setVisible(false);
			dropContactText.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Add."))
		{
			addSupplier();
			setVisibleTrue();
			dropProducts.setVisible(false);
			locationLabel3.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Add.."))
		{
			addCustomer();
			setVisibleTrue();
			dropProductLabel.setText("");
			dropProducts.setVisible(false);
			locationLabel3.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Add..."))
		{
			setVisibleTrue();
			addProduct();
			dropContactLabel.setVisible(false);
			dropProducts.setVisible(false);
			dropContactText.setVisible(false);
			locationLabel3.setVisible(false);
		}
		else if(command.equals("Delete."))
		{
			deleteSupplier();
			setVisibleTrue();
			dropProducts.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Delete.."))
		{
			deleteCustomer();
			setVisibleTrue();
			dropProducts.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Delete..."))
		{
			setVisibleTrue();
			deleteProduct();
			dropContactLabel.setVisible(false);
			dropProducts.setVisible(false);
			dropContactText.setVisible(false);
			addPhoto.setVisible(false);
		}
		else if(command.equals("Change Supplier Details"))
		{
			setEditableTrue();
			dropProductLabel.setVisible(false);
			dropProducts.setVisible(false);
			dropNameText.setEditable(false);
			dropNameText.setBackground(Color.lightGray);
			action.setText("Save Changes");
			addPhoto.setVisible(false);
		}
		else if(command.equals("Change Customer Details"))
		{
			setEditableTrue();
			dropProductLabel.setText("Buying product");
			dropNameText.setEditable(false);
			dropNameText.setBackground(Color.lightGray);
			action.setText("Save Changes");
			addPhoto.setVisible(false);
		}
		else if(command.equals("Change Product Details"))
		{
			setEditableTrue();
			dropProductLabel.setVisible(false);
			dropProducts.setVisible(false);
			dropNameText.setEditable(false);
			dropNameText.setBackground(Color.lightGray);
			dropStreetText.setEditable(false);
			dropStreetText.setBackground(Color.lightGray);
			action.setText("Save Changes");
			addPhoto.setVisible(false);
		}
		else if(command.equals("Add Product"))
		{
			addPhoto.setVisible(false);
		}
		else if (command.equals("Add Photo")){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter=new FileNameExtensionFilter("images", "jpg","gif","png");
            fileChooser.setFileFilter(filter);
            returnVal=fileChooser.showOpenDialog(null);
            File selectedFile=fileChooser.getSelectedFile();
           // System.out.println(selectedFile.toString());
           // File targetLocation = new File("C:\\Database_Images");
            if(returnVal==JFileChooser.APPROVE_OPTION){
                if(selectedFile.getName().endsWith(".JPG")||selectedFile.getName().endsWith(".jpg")||selectedFile.getName().endsWith(".png"))
                {
                	//selectedFile = fileChooser.getSelectedFile();
                	//System.out.println(selectedFile.getName().toString());
                    try {
                    	String fileName = selectedFile.getName().toString();
                        image=ImageIO.read(selectedFile);
                        ImageIcon icon=new ImageIcon(image); // ADDED
                        labBack.setIcon(icon); // ADDED

                        Dimension imageSize = new Dimension(250,150); // ADDED
                        labBack.setPreferredSize(imageSize); // ADDED

                        labBack.revalidate(); // ADDED
                        labBack.repaint(); // ADDED
                        pictureNameLabel.setText("File name : " + fileName );
                    }
                    catch(IOException e1) {}
                }

                
                else{
                    JOptionPane.showMessageDialog(null,"Please select .jpg or .png file");
                }
        }else if(returnVal == JFileChooser.CANCEL_OPTION){				//JFileChoser cancel button called out
            JOptionPane.showMessageDialog(null, "you closed without selecting file");
        }
		}
		
		
		
		
	}
}
