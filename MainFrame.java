package com.nli;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
	        public void run() {
	        	Consts.LS_CHAR_MAP.clear();
	        	Consts.SS_CHAR_MAP.clear();
	        }
	    }, "Shutdown-thread"));
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("NLI Converter");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TitledBorder titledBorder = new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Text", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0));
		TitledBorder titledBorder_1 = new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Hexadecimal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0));
		titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));
		titledBorder_1.setTitleFont(titledBorder_1.getTitleFont().deriveFont(Font.BOLD));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.setBounds(0, 0, 536, 429);
		contentPane.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("Turkish", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 36, 370, 180);
		textArea.setLineWrap(true);
		JScrollPane scroll = new JScrollPane (textArea);
		scroll.setBounds(10, 11, 370, 186);
		panel_4.add(scroll);
		scroll.setViewportBorder(null);
		scroll.setBorder(titledBorder);
		
		JButton btnTestMessage = new JButton("Test Message");
		scroll.setColumnHeaderView(btnTestMessage);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 254, 370, 180);
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		JScrollPane scroll_1 = new JScrollPane (textArea_1);
		scroll_1.setBounds(10, 208, 370, 182);
		panel_4.add(scroll_1);
		scroll_1.setViewportBorder(null);
		scroll_1.setBorder(titledBorder_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(390, 326, 134, 64);
		panel_4.add(panel_3);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		
		JLabel lblCharacterCount = new JLabel("Characters: 0/155");
		lblCharacterCount.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCharacterCount.setBounds(10, 11, 124, 14);
		panel_3.add(lblCharacterCount);
		
		JLabel lblSmsCount = new JLabel("Messages: 0");
		lblSmsCount.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSmsCount.setBounds(10, 36, 114, 14);
		panel_3.add(lblSmsCount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(390, 251, 134, 64);
		panel_4.add(panel_2);
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);
		
		JLabel lblDataCoding = new JLabel("Data Coding:");
		lblDataCoding.setBounds(10, 14, 73, 14);
		panel_2.add(lblDataCoding);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 11, 43, 20);
		panel_2.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JLabel lblEsmClass = new JLabel("Esm Class:");
		lblEsmClass.setBounds(10, 39, 70, 14);
		panel_2.add(lblEsmClass);
		
		textField = new JTextField();
		textField.setBounds(85, 36, 43, 20);
		panel_2.add(textField);
		textField.setEditable(false);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(390, 135, 134, 105);
		panel_4.add(panel);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(null);
		
		JCheckBox chckbxLockingShift = new JCheckBox("Locking Shift");
		chckbxLockingShift.setSelected(true);
		chckbxLockingShift.setBounds(6, 7, 122, 23);
		panel.add(chckbxLockingShift);
		
		JCheckBox chckbxSingleShift = new JCheckBox("Single Shift");
		chckbxSingleShift.setBounds(6, 33, 122, 23);
		panel.add(chckbxSingleShift);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(6, 63, 122, 2);
		panel.add(separator);
		
		JCheckBox chckbxLongSms = new JCheckBox("Long SMS");
		chckbxLongSms.setBounds(6, 71, 122, 23);
		panel.add(chckbxLongSms);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(390, 60, 134, 64);
		panel_4.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JRadioButton rdbtnHttp = new JRadioButton("HTTP");
		buttonGroup.add(rdbtnHttp);
		rdbtnHttp.setBounds(6, 34, 109, 23);
		panel_1.add(rdbtnHttp);
		
		JRadioButton rdbtnSmpp = new JRadioButton("SMPP");
		rdbtnSmpp.setSelected(true);
		rdbtnSmpp.setBounds(6, 8, 109, 23);
		panel_1.add(rdbtnSmpp);
		buttonGroup.add(rdbtnSmpp);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBounds(390, 23, 134, 30);
		panel_4.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = "";
				String hexText = "";
				int charCount = 0;
				int smsCount = 0;
				double dblSmsCount = 0.0;
				double decimalPoint = 0.0;
				int esmClass = 0;
				int dataCoding = 0;
				
				if(!textArea.getText().equals(""))
				{
					if(!chckbxLockingShift.isSelected() && chckbxSingleShift.isSelected())			
					{
						if(rdbtnSmpp.isSelected())
						{
							if(chckbxLongSms.isSelected())
							{
								hexText = "080003AA0101240101";
								dataCoding = 0;
								esmClass = 64;
								textField_1.setText(String.valueOf(dataCoding));
								textField.setText(String.valueOf(esmClass));
							}
							else
							{
								hexText = "03240101";
								dataCoding = 0;
								esmClass = 64;
								textField_1.setText(String.valueOf(dataCoding));
								textField.setText(String.valueOf(esmClass));
							}
						}
						
						text = textArea.getText();
						charCount = text.length();
						
						for(int i = 0; i < text.length(); i++)
						{
							if(Consts.LS_CHAR_MAP.containsKey(String.valueOf(text.charAt(i))))
							{
								if(Consts.SS_CHAR_MAP.containsKey(String.valueOf(text.charAt(i))))
								{
									hexText = hexText + Consts.SS_CHAR_MAP.get(String.valueOf(text.charAt(i)));
									charCount++;
								}
								else
								{
									hexText = hexText + Consts.LS_CHAR_MAP.get(String.valueOf(text.charAt(i)));
								}
							}
						}

						textArea_1.setText(hexText);
						
						if(chckbxLongSms.isSelected())
						{
							lblCharacterCount.setText("Characters: " + charCount + "/149");
							dblSmsCount = (double) charCount / 149.00;
						}
						else
						{
							lblCharacterCount.setText("Characters: " + charCount + "/155");
							dblSmsCount = (double) charCount / 155.00;
						}
						smsCount = (int) dblSmsCount;
						decimalPoint = dblSmsCount - Math.floor(dblSmsCount);
						if(decimalPoint == 0.0 && smsCount >= 0)
							lblSmsCount.setText("Messages: " + smsCount);
						else
							lblSmsCount.setText("Messages: " + (smsCount + 1));
					}
					else if(chckbxLockingShift.isSelected() && chckbxSingleShift.isSelected())
					{
						if(rdbtnSmpp.isSelected())
						{
							if(chckbxLongSms.isSelected())
							{
								hexText = "110003AA0101250101240101";
								dataCoding = 0;
								esmClass = 64;
								textField_1.setText(String.valueOf(dataCoding));
								textField.setText(String.valueOf(esmClass));
							}
							else
							{
								hexText = "06250101240101";
								esmClass = 64;
								dataCoding = 0;
								esmClass = 64;
								textField_1.setText(String.valueOf(dataCoding));
								textField.setText(String.valueOf(esmClass));
							}
						}
						
						text = textArea.getText();
						charCount = text.length();
						
						for(int i = 0; i < text.length(); i++)
						{
							if(Consts.LS_CHAR_MAP.containsKey(String.valueOf(text.charAt(i))))
								hexText = hexText + Consts.LS_CHAR_MAP.get(String.valueOf(text.charAt(i)));
						}

						textArea_1.setText(hexText);
						
						if(chckbxLongSms.isSelected())
						{
							lblCharacterCount.setText("Characters: " + charCount + "/149");
							dblSmsCount = (double) charCount / 149.00;
						}
						else
						{
							lblCharacterCount.setText("Characters: " + charCount + "/151");
							dblSmsCount = (double) charCount / 155.00;
						}
						smsCount = (int) dblSmsCount;
						decimalPoint = dblSmsCount - Math.floor(dblSmsCount);
						if(decimalPoint == 0.0 && smsCount >= 0)
							lblSmsCount.setText("Messages: " + smsCount);
						else
							lblSmsCount.setText("Messages: " + (smsCount + 1));
					}
					
					else
					{
						if(rdbtnSmpp.isSelected())
						{
							if(chckbxLongSms.isSelected())
							{
								hexText = "080003AA0101250101";
								esmClass = 64;
								dataCoding = 0;
								esmClass = 64;
								textField_1.setText(String.valueOf(dataCoding));
								textField.setText(String.valueOf(esmClass));
							}
							else
							{
								hexText = "03250101";
								esmClass = 64;
								dataCoding = 0;
								esmClass = 64;
								textField_1.setText(String.valueOf(dataCoding));
								textField.setText(String.valueOf(esmClass));
							}
						}
						
						text = textArea.getText();
						charCount = text.length();

						for(int i = 0; i < text.length(); i++)
						{
							if(Consts.LS_CHAR_MAP.containsKey(String.valueOf(text.charAt(i))))
								hexText = hexText + Consts.LS_CHAR_MAP.get(String.valueOf(text.charAt(i)));
						}

						textArea_1.setText(hexText);

						if(chckbxLongSms.isSelected())
						{
							lblCharacterCount.setText("Characters: " + charCount + "/149");
							dblSmsCount = (double) charCount / 149.00;
						}
						else
						{
							lblCharacterCount.setText("Characters: " + charCount + "/155");
							dblSmsCount = (double) charCount / 155.00;
						}
						
						dblSmsCount = (double) charCount / 155.00;
						smsCount = (int) dblSmsCount;
						decimalPoint = dblSmsCount - Math.floor(dblSmsCount);
						if(decimalPoint == 0.0 && smsCount >= 0)
							lblSmsCount.setText("Messages: " + smsCount);
						else
							lblSmsCount.setText("Messages: " + (smsCount + 1));
					}			
				}
				else
				{
					textArea_1.setText("");
					lblCharacterCount.setText("Characters: 0/155");
					lblSmsCount.setText("Messages: 0");
				}
			}
		});
		
		btnTestMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "Test message: İı Şş Çç Ğğ Üü Öö");
			}
		});
		
		/**
		 * Event Handlers
		 */
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				textArea.requestFocus();
			}
		});
	}
}
