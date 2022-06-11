
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.sql.*;
 
/**
 * Summary description for N2
 *
 */
public class N2 extends JFrame implements ItemListener
{
	// Variables declaration
	private JLabel title;
	private JTabbedPane Tab;
	private JButton exit;
	private JPanel contentPane;
	//-----
	static JTextArea node1_Text;
	private JScrollPane jScrollPane3;
	private JPanel Node1;
	//-----
	static JTextArea node2_Text;
	private JScrollPane jScrollPane4;
	private JPanel Node2;
	//-----
	private JPanel Node3;
	// For Socket Communication
	public static boolean ack=false;
	JComboBox node_List;
    Socket N1_socket;
	ServerSocket N1_server;
	//-----
	// End of variables declaration
	// Components declaration
	JLabel l1,l2;
	JButton send,clear;
	JTextField tf1;
	JScrollPane js;
	JTextArea message;
	JRadioButton jr;

	FileInputStream fis;
	int ch;
	String node1="",node2="",node3="",node4="";
	int port1=0,port2=0,port3=0,port4=0;
	public int day;
	public String month="",year="",time="";
long diff;
StringBuffer sb = new StringBuffer();
int linecount=0;
static String a1[];
static String text;
static String pattern;
static int n1,n2,n21,n22,n23,n24,n25,n26,n27,n28,n29,n210,n211,n212;
static int i99=1;
//static char[] text1;
//static char[] pattern1;
static int count1=0;


static char[] text1;
static char[] pattern1;
static char[] pattern2;
static char[] pattern3;
static char[] pattern4;
static char[] pattern5;
static char[] pattern6;
static char[] pattern7;
static char[] pattern8;
static char[] pattern9;
static char[] pattern10;


static String pattsupport1="",pattsupport2="",pattsupport3="",pattsupport4="",pattsupport5="",pattsupport6="",pattsupport7="",pattsupport8="",pattsupport9="",pattsupport10="",pattsupport11="",pattsupport12="";

 static int[] k=new int[4];
static String[] pattsupport_multi;
static int count=0;
static int i_left_prev=0;
static int i_right_prev=0;
static int match_identify_shift=0;
static String patt1="",patt2="",patt3="",patt4="",patt5="",patt6="",patt7="",patt8="",patt9="",patt10="",patt11="",patt12="";
static int i_left=0;
static int i_right=0;

static int initial_check_var=0;
static int match_check_var=0;
static int mismatch_check_var=0;
static int good_suffix_position=0;
static int bad_character_position=0;
static int[] badchar10=new int[110];
static int start1=0,end1=0;


	public N2(String str_name,int start,int end)
	{
		super();

		
		initializeComponent();


start1=start;end1=end;
 
 pattsupport1="CSF1PO";patt1="TAGA";
pattsupport2="D18S51";patt2="AGAA";
pattsupport3="D7S820|D16S539";patt3="GATA";
pattsupport4="VWA|D3S1358";patt4="TCTA";
		
		

pattsupport5="TH01";patt5="TCAT";	
pattsupport6="TPOX";patt6="GAAT";
pattsupport7="D5S818";patt7="AGAT";	
pattsupport8="FGA";patt8="CTTT";	

pattsupport9="D13S317";patt9="TATC";
pattsupport10="VWA|D3S1358";patt10="TCTG";

//System.out.println("==========="+file3+"=========="+file4+"===="+file5);

long startTime=System.currentTimeMillis();


search_Main(str_name);
   
long endTime=System.currentTimeMillis();
diff=endTime-startTime;

node1_Text.append("\n=============================");
node1_Text.append("\nTime elapsed\t\t"+diff+" ms");
node1_Text.append("\n=============================\n");




 
//================================//


try{
String str1 = String.valueOf(diff); 
FileWriter fw3 = new FileWriter("timeelapsed-II.txt");
			BufferedWriter bw3 = new BufferedWriter(fw3);
			bw3.write(str1);bw3.close();
}
catch(Exception e)

{
}			

		

		this.setVisible(true);
	}

	public void itemStateChanged(ItemEvent ie)
	{
	

	

	}
	private void initializeComponent()
	{
		title = new JLabel();
		Tab = new JTabbedPane();
		exit = new JButton();
		contentPane = (JPanel)this.getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//-----
		node1_Text = new JTextArea();
		jScrollPane3 = new JScrollPane();
		Node1 = new JPanel();
		//-----
		

		node1_Text.setText("Pattern Found at positions");
		node1_Text.append("\n"+"=======================");


		



		jScrollPane4 = new JScrollPane();
		Node2 = new JPanel();
		//-----
		Node3 = new JPanel();
		//-----
		//
		// title
		//
		title.setText("Processor");
		//
		// Tab
		//
		Tab.addTab("Processor", Node1);
		//Tab.addTab("Message", new MSG1());

		Tab.setMinimumSize(new Dimension(0, 17));
		Tab.setPreferredSize(new Dimension(0, 17));
		//
		// exit
		//
		exit.setText("EXIT");
		exit.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				exit_actionPerformed(e);
			}

		});
		// components initialization
		l1=new JLabel("Positions & Processing time ");
		

		send=new JButton("SEND ELAPSED TIME TO SERVER");
		
		


		js=new JScrollPane();


		

	    l1.setBounds(140,12,300,30);
		
		





		send.setBounds(90,310,300,30);
		









send.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
		Socket cs=new Socket("localhost",3021);
		BufferedReader dis=new BufferedReader(new FileReader("timeelapsed-II.txt"));
		PrintWriter dos=new PrintWriter(cs.getOutputStream(),true);
		//System.out.println("Enter msg to send");
		String str=dis.readLine();
		//System.out.println("Processor I Time elapsed\t"+str);
		dos.println(str);
		}catch(IOException ioe)
		  {
			ioe.printStackTrace();
			}

			}

		});





		
		Node1.add(l1);
		
		Node1.add(js);
		Node1.add(send);
		
		
		
		contentPane.setLayout(null);
		
		addComponent(contentPane, title, 163,25,200,20);
		addComponent(contentPane, Tab, 9,57,556,377);
		addComponent(contentPane, exit, 253,450,83,28);
		
		jScrollPane3.setViewportView(node1_Text);
		
//
		// Node1
		//
		Node1.setLayout(null);
		Node1.setBorder(BorderFactory.createEtchedBorder());
		addComponent(Node1, jScrollPane3, 70,40,320,260);
		

		// Node2
		//
		Node2.setLayout(null);
		Node2.setBorder(BorderFactory.createEtchedBorder());
		addComponent(Node2, jScrollPane4, 255,41,283,218);
		//
		// Node3
		//
		Node3.setLayout(null);
		Node3.setBorder(BorderFactory.createEtchedBorder());
		//
		// N1
		//
		this.setTitle("Processor What You Selected");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(600, 517));
	}

	
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	

	private void exit_actionPerformed(ActionEvent e)
	{
                 this.dispose();
		

	}

private void send_actionPerformed(ActionEvent e)
	{
                 //this.dispose();
		//JOptionPane.showMessageDialog(null,"PRE-PROCESSING-STARTS");
		//JOptionPane.showMessageDialog(null,"Please Select TEXT File and Try again");
		
			
 

	}
	//
	// TODO: Add any method code to meet your needs in the following area
	//
	



/*

//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)
	{
        JFrame.setDefaultLookAndFeelDecorated(true);
		
		new N2();
		

}*/



//search method 
public static void search_Main(String text2) 
{
 
//System.out.println(text2);
 

n1= text2.length();

n21= patt1.length();
n22= patt2.length();
n23= patt3.length();
n24= patt4.length();
n25= patt5.length();
n26= patt6.length();
n27= patt7.length();
n28= patt8.length();
n29= patt9.length();
n210= patt10.length();
 

text1=text2.toCharArray();

pattern1=patt1.toCharArray();
pattern2=patt2.toCharArray();
pattern3=patt3.toCharArray();
pattern4=patt4.toCharArray();
pattern5=patt5.toCharArray();
pattern6=patt6.toCharArray();
pattern7=patt7.toCharArray();
pattern8=patt8.toCharArray();
pattern9=patt9.toCharArray();
pattern10=patt10.toCharArray();

ArrayList<Integer> list = new ArrayList<Integer>();

for (int i=0; i<n21; i++)
list.add(new Integer(i));

Collections.shuffle(list);

for (int i=0; i<n21; i++)
k[i]=list.get(i);



badCharHeuristic(pattern1, n21, badchar10);

i_right = start1;

 

while(i_right> (end1))
{	if(initial_check_var==0)
	{
	//System.out.println("After while\t"+i_right);
 	i_right = shift_right(text1,pattern1,i_right-1,end1,(n21-1));
	count1=search_sub(text1,pattern1,i_right,(n21-1),k,count1);
	initial_check_var=1;
	}
	

	if(match_check_var==1)
	{
		i_right=shift_right(text1,pattern1,(i_right - good_suffix_position),end1,(n21-1));
		count1=search_sub(text1,pattern1,i_right,(n21-1),k,count1);
		match_check_var=0;
		//System.out.println("\tgood suffix position\t"+good_suffix_position);
	 
	}
	else
	{
		i_right=shift_right(text1,pattern1,(i_right - bad_character_position),end1,(n21-1));
		count1=search_sub(text1,pattern1,i_right,(n21-1),k,count1);
		//System.out.println("\tbad_character_position\t"+bad_character_position);
	
	}

good_suffix_position=0;
bad_character_position=0;

i_right--;

 

}	



}//search_Main close


public static int search_sub(char[] text,char[] patt,int i_right,int j,int[] k,int count11 )
{

int j1 = j;
int comp_pos=0;



if ( j1 == -1 )
{
node1_Text.append("\n Found at position\t"+(i_right-j));

good_suffix_position = ( (i_right-j < end1)? j-badchar10[text[i_right-j]] : 1 );
 

count11++;
match_check_var=1;
}


 
return count11;

}
 
//shift_right function

public static int shift_right(char[] text,char[] patt,int i_right,int n,int j)
{



while(  ( text[i_right] != patt[j] ) && ( i_right > end1  ) )
i_right--;
 

return i_right;


}



// A utility function to get maximum of two integers
public static int max (int a, int b) { return (a > b)? a: b; }
 
// The preprocessing function for Boyer Moore's bad character heuristic
public static void badCharHeuristic( char[] str, int size, int[] badchar)
{
     
 
    // Initialize all occurrences as -1
    for (int i = 0; i < 110; i++)
         badchar[i] = -1;
 
    // Fill the actual value of last occurrence of a character
    for (int i = 0; i < size; i++)
         badchar[(int) str[i]] = i;
}



}
