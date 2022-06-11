import  java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.*;
import java.lang.String;
import java.sql.*;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.event.*;
import java.io.FileReader;
import java.awt.geom.*;
import javax.imageio.*;
import java.awt.image.*;
import java.lang.*;
import java.net.*;
import javax.swing.JCheckBox;

//StringMatchingInterface

public class StringMatchingInterface extends JFrame implements ActionListener
{
FileDialog fd=null;
FileDialog fd1=null;
int i,xcoord,ycoord,v=0,fiw,fih,len;
char c;
static String selected_algorithm="";
static String str5;
static String str6;
static String str7;
static String str8;
static String str9,str10,str11,str12;
StringBuffer sb = null;
 StringBuffer res_part1 =null;
StringBuffer res_part2 =null;
StringBuffer res_part3 =null;
StringBuffer res_part4 =null;
static int tot_num_lines=0;
static int nol = 0;
static int number_of_processors_in_network=0;
static int no_of_proc_net=0;
static int chkb1=0,chkb2=0,chkb3=0,chkb4=0,chkb5=0,chkb6=0,chkb7=0,chkb8=0,chkb9=0,chkb10=0,chkb11=0,chkb12=0,chkb13=0,chkb14=0,chkb15=0,chkb16=0,chkb17=0,chkb18=0,chkb19=0;
String s10 =null;
String f11,f12,f13,f14;
JScrollPane jScrollPane1 = new JScrollPane();
JScrollPane jScrollPane2 = new JScrollPane();
JScrollPane jScrollPane3 = new JScrollPane();
JScrollPane jScrollPane4 = new JScrollPane();
JScrollPane jScrollPane5 = new JScrollPane();
JScrollPane jScrollPane6 = new JScrollPane();

JTextArea jTextArea1 = new JTextArea();
JTextArea jTextArea2 = new JTextArea();
public static JTextArea jTextArea3 = new JTextArea();
JTextArea jTextArea4 = new JTextArea();
JTextArea jTextArea5 = new JTextArea();
JTextArea jTextArea6 = new JTextArea();

       JMenuBar menuBar;
       JMenu file,edit,Watermarking,help;
       JMenuItem open,save,saveas,close,openwm,insrting1,insrting2,extracting,copyrighting,Authentic,organisation,university,wm,ewm;

       JPanel tools,panel1,panel2,panel3,panel4,panel5,position,select,slider,Bpanel1,Bpanel2,Rpanel,text,Rpanel2;
       JTabbedPane jtabbedpane1,jtabbedpane2;
       
       
       JTextField x,y,twm;
       JCheckBox LT,RT,C,LB,RB,copyr,auth;
       JRadioButton Selectpos, Fixed, textwm,imgwm;
       ButtonGroup radio,radio2;

       JLabel l1,l2,l7;
       BufferedImage bimg;

       File file1;
       String s="",str="",str1="";
      
       JButton insert1,insert2,insert3,insert4,insert5,insert6,insert7,insert8,insert9,insert10,insert11,insert12,extract;
       JRadioButton ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12,ch13,ch14,ch15,ch16,ch17,ch18,ch19;
  

       Container con;
	

       public StringMatchingInterface()
       {
		
               setTitle("UltrafastParallelGenomeExtractor");

               con=getContentPane();

               con.setLayout(null);
                              
               

               //hdesk = new Help();

              // hdesk.Display(2);

              
		
               tools=new JPanel();
               tools.setBorder(BorderFactory.createRaisedBevelBorder());
               tools.setLayout(new BorderLayout());
               con.add(tools);
               
//tools.setBounds(0,10,990,420);
tools.setBounds(10,10,1320,630);

               select=new JPanel();
               select.setBorder(BorderFactory.createEtchedBorder());
               tools.add(select,BorderLayout.NORTH);

               panel1=new JPanel();
               panel2=new JPanel();

               panel1.setLayout(null);
               panel2.setLayout(null);

               panel1.setBorder(BorderFactory.createEtchedBorder());
               panel2.setBorder(BorderFactory.createEtchedBorder());

               



try{             
                              
jScrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"FILE NAME AND SEARCH PATTERN"));




jScrollPane2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"PATTERNS"));

jScrollPane3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"ELAPSED TIME"));
              
//hdesk.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(),"Help"));
}
catch(Exception e){}
               



               position=new JPanel();
               position.setLayout(null);

	
	JLabel label5 = new JLabel();
	label5.setFont(new Font("Serif", Font.BOLD, 25));
	label5.setForeground(Color.RED);
        label5.setText("Sequential Approaches"); 
        position.add(label5);
	label5.setBounds(30,20,270,40);
	

ch1 = new JRadioButton();
ch1.setFont(new Font("Serif", Font.BOLD, 25));
ch1.setForeground(Color.BLUE);
ch1.setText("<html>2<sup>0</sup>Shaft Forward</html>");
position.add(ch1);
ch1.addActionListener(this);
ch1.setBounds(30,70,250,40);
 
ch2 = new JRadioButton();
ch2.setFont(new Font("Serif", Font.BOLD, 25));
ch2.setForeground(Color.BLUE);
ch2.setText("<html>2<sup>0</sup>Shaft Backward</html>");
position.add(ch2);
ch2.addActionListener(this);
ch2.setBounds(280,70,250,40);

ch3 = new JRadioButton();
ch3.setFont(new Font("Serif", Font.BOLD, 25));
ch3.setForeground(Color.BLUE);
ch3.setText("<html>2<sup>1</sup>Shaft</html>");
position.add(ch3);
ch3.addActionListener(this);
ch3.setBounds(530,70,160,40);

ch4 = new JRadioButton();
ch4.setFont(new Font("Serif", Font.BOLD, 25));
ch4.setForeground(Color.BLUE);
ch4.setText("<html>2<sup>2</sup>Shaft</html>");
position.add(ch4);
ch4.addActionListener(this);
ch4.setBounds(30,130,150,40);

ch5 = new JRadioButton();

ch5.setBounds(200,130,150,40);

ch6 = new JRadioButton();

ch6.setBounds(370,130,150,40);

ch7 = new JRadioButton();
ch7.setFont(new Font("Serif", Font.BOLD, 25));
ch7.setForeground(Color.BLUE);
ch7.setText("<html>2<sup>5</sup>Shaft</html>");
position.add(ch7);
ch7.addActionListener(this);
ch7.setBounds(530,130,150,40);



JLabel label6 = new JLabel();

label6.setBounds(30,180,270,40);

ch8 = new JRadioButton();
ch8.setFont(new Font("Serif", Font.BOLD, 25));
ch8.setForeground(Color.BLUE);
ch8.setText("<html>2<sup>0</sup>Shaft</html>");
position.add(ch8);
ch8.addActionListener(this);
ch8.setBounds(30,220,150,40);

ch9 = new JRadioButton();
ch9.setFont(new Font("Serif", Font.BOLD, 25));
ch9.setForeground(Color.BLUE);
ch9.setText("<html>2<sup>1</sup>Shaft</html>");
position.add(ch9);
ch9.addActionListener(this);
ch9.setBounds(200,220,150,40);

ch10 = new JRadioButton();
ch10.setFont(new Font("Serif", Font.BOLD, 25));
ch10.setForeground(Color.BLUE);
ch10.setText("<html>2<sup>2</sup>Shaft</html>");
position.add(ch10);
ch10.addActionListener(this);
ch10.setBounds(370,220,150,40);

ch11 = new JRadioButton();
ch11.setFont(new Font("Serif", Font.BOLD, 25));
ch11.setForeground(Color.BLUE);
ch11.setText("<html>2<sup>3</sup>Shaft</html>");
position.add(ch11);
ch11.addActionListener(this);
ch11.setBounds(530,220,150,40);

ch12 = new JRadioButton();
ch12.setFont(new Font("Serif", Font.BOLD, 25));
ch12.setForeground(Color.BLUE);
ch12.setText("<html>2<sup>4</sup>Shaft</html>");
position.add(ch12);
ch12.addActionListener(this);
ch12.setBounds(30,270,150,40);

ch13 = new JRadioButton();
ch13.setFont(new Font("Serif", Font.BOLD, 25));
ch13.setForeground(Color.BLUE);
ch13.setText("<html>2<sup>5</sup>Shaft</html>");
position.add(ch13);
ch13.addActionListener(this);
ch13.setBounds(200,270,150,40);


JLabel label7 = new JLabel();
label7.setFont(new Font("Serif", Font.BOLD, 25));
label7.setForeground(Color.RED);
label7.setText("Existing Approaches"); 
position.add(label7);
label7.setBounds(30,320,270,40);

ch14 = new JRadioButton();
ch14.setFont(new Font("Serif", Font.BOLD, 25));
ch14.setForeground(Color.BLUE);
ch14.setText("<html>EMP-WM</html>");
position.add(ch14);
ch14.addActionListener(this);
ch14.setBounds(30,360,150,40);

ch15 = new JRadioButton();
ch15.setFont(new Font("Serif", Font.BOLD, 25));
ch15.setForeground(Color.BLUE);
ch15.setText("<html>EMP-QWM</html>");
position.add(ch15);
ch15.addActionListener(this);
ch15.setBounds(200,360,150,40);

ch16 = new JRadioButton();
ch16.setFont(new Font("Serif", Font.BOLD, 25));
ch16.setForeground(Color.BLUE);
ch16.setText("<html>EMP-Improved WM</html>");
position.add(ch16);
ch16.addActionListener(this);
ch16.setBounds(370,360,300,40);

ch17 = new JRadioButton();
ch17.setFont(new Font("Serif", Font.BOLD, 25));
ch17.setForeground(Color.BLUE);
ch17.setText("<html>EMP-QMM</html>");
position.add(ch17);
ch17.addActionListener(this);
ch17.setBounds(30,420,160,40);


ch18 = new JRadioButton();
ch18.setFont(new Font("Serif", Font.BOLD, 25));
ch18.setForeground(Color.BLUE);
ch18.setText("<html>EMP-HCWM</html>");
position.add(ch18);
ch18.addActionListener(this);
ch18.setBounds(200,420,170,40);

ch19 = new JRadioButton();
ch19.setFont(new Font("Serif", Font.BOLD, 25));
ch19.setForeground(Color.BLUE);
ch19.setText("<html>EMP-AFWM</html>");
position.add(ch19);
ch19.addActionListener(this);
ch19.setBounds(370,420,170,40);	


ButtonGroup group = new ButtonGroup();
group.add(ch1);
group.add(ch2);
group.add(ch3);
group.add(ch4);
group.add(ch5);
group.add(ch6);
group.add(ch7);
group.add(ch8);
group.add(ch9);
group.add(ch10);
group.add(ch11);
group.add(ch12);
group.add(ch13);
group.add(ch14);
group.add(ch15);
group.add(ch16);
group.add(ch17);
group.add(ch18);
group.add(ch19);
	
		insert3 = new JButton("Enable the Ultrafast Search Process");
		insert3.setFont(new Font("Serif", Font.BOLD, 25));
		insert3.setForeground(Color.BLUE);
               	position.add(insert3);
               	insert3.addActionListener(this);
	        insert3.setBounds(80,475,510,80);
		

		insert1 = new JButton("OPEN FILE");
		insert1.setFont(new Font("Serif", Font.BOLD, 20));
		insert1.setForeground(Color.BLUE);
               	position.add( insert1 );
               	insert1.addActionListener(this);
              	insert1.setBounds(745,70,200,80);
		insert1.setEnabled(false);
	/*
		insert2 = new JButton("READ PATTERN ");
		insert2.setFont(new Font("Serif", Font.BOLD, 20));
		insert2.setForeground(Color.BLUE);
               	position.add( insert2 );
               	insert2.addActionListener(this);
	        insert2.setBounds(745,140,200,60);
		insert2.setEnabled(false);
	*/

		insert4 = new JButton("START SEARCH PROCESS");
		insert4.setFont(new Font("Serif", Font.BOLD, 12));
		insert4.setForeground(Color.BLUE);
               	position.add(insert4);
               	insert4.addActionListener(this);
	        insert4.setBounds(745,170,200,80);
		insert4.setEnabled(false);

		insert5 = new JButton("TOTAL TIME ELAPSED");
		insert5.setFont(new Font("Serif", Font.BOLD, 12));
		insert5.setForeground(Color.BLUE);
               	position.add( insert5 );
               	insert5.addActionListener(this);
	        insert5.setBounds(745,270,200,80);
		insert5.setEnabled(false);

		 
		insert7 = new JButton(" EXIT ");
		insert7.setFont(new Font("Serif", Font.BOLD, 20));
		insert7.setForeground(Color.BLUE);
               	position.add( insert7 );
               	insert7.addActionListener(this);
	        insert7.setBounds(745,370,200,80);




              panel3=new JPanel();
            
              panel4=new JPanel();
                
              position.setBorder(BorderFactory.createEtchedBorder());

              text = new JPanel();

              text.setLayout(null);

              text.setBorder(BorderFactory.createEtchedBorder());

               jtabbedpane2=new JTabbedPane();
               jtabbedpane2.addTab("String Matching Interface",position);
             

              position.add(panel3);
             panel3.setBounds(20,35,150,100);
   
  
               position.add(panel4);
               panel4.setBounds(180,35,150,100);
 
 
               panel1.add(jtabbedpane2);
              


tools.add(jtabbedpane2,BorderLayout.CENTER);
               tools.add(jtabbedpane2);

jtabbedpane2.setBounds(15,70,990,180);
          

jScrollPane1.setName("jScrollPane1");  

jTextArea1.setColumns(20);
jTextArea1.setRows(5);
jTextArea1.setName("jTextArea1");  
jScrollPane1.setViewportView(jTextArea1);
position.add(jScrollPane1);
jScrollPane1.setBounds(970,60,300,100);



/*===========*/

jScrollPane2.setName("jScrollPane2");  

jTextArea2.setColumns(20);
jTextArea2.setRows(5);
jTextArea2.setName("jTextArea2");  
jScrollPane2.setViewportView(jTextArea2);
position.add(jScrollPane2);
jScrollPane2.setBounds(970,170,300,100);

/*===========*/


jScrollPane3.setName("jScrollPane3");  
 
jTextArea3.setColumns(20);
jTextArea3.setRows(5);
jTextArea3.setName("jTextArea3");  
jScrollPane3.setViewportView(jTextArea3);
position.add(jScrollPane3);
 
jScrollPane3.setBounds(970,300,300,230);
               


             JLabel label = new JLabel("Ultrafast Parallel Genome Extractor",JLabel.CENTER);
              
              
              label.setFont(new Font("Arial", Font.BOLD, 17));
              
              label.setForeground(Color.blue);

              select.add(label);

 	     jtabbedpane2.setVisible(true);

   
       }
 
 


       public void actionPerformed(ActionEvent ae)
       {
              
     //For Close

       if( ae.getSource()==insert7)
               {
       
		try{ 
			
		}
		catch(Exception e)
		{
		System.out.println("Error at EXIT:"+e); 
		}

		System.exit(0);

               }



else if(ae.getSource()==insert3)
 
{
no_of_proc_net=5;
chkb5=1;
selected_algorithm="2^3 shaft Sequential";
}
if(ch6.isSelected())
{
no_of_proc_net=6;
chkb6=1;
selected_algorithm="2^4 shaft Sequential";
}
if(ch7.isSelected())
{
no_of_proc_net=7;
chkb7=1;
selected_algorithm="2^5 shaft Sequential";
}

if(ch8.isSelected())
{
no_of_proc_net=8;
chkb8=1;
selected_algorithm="2^0 shaft Parallel";
}
if(ch9.isSelected())
{
no_of_proc_net=9;
chkb9=1;
selected_algorithm="2^1 shaft Parallel";
}
if(ch10.isSelected())
{
no_of_proc_net=10;
chkb10=1;
selected_algorithm="2^2 shaft Parallel";
}
if(ch11.isSelected())
{
no_of_proc_net=11;
chkb11=1;
selected_algorithm="2^3 shaft Parallel";
}
if(ch12.isSelected())
{
no_of_proc_net=12;
chkb12=1;
selected_algorithm="2^4 shaft Parallel";
}
if(ch13.isSelected())
{
no_of_proc_net=13;
chkb13=1;
selected_algorithm="2^5 shaft Parallel";
}


if(no_of_proc_net==0)
{
JOptionPane.showMessageDialog(null,"Please Select Atleast one Algorithm");
}
else
{
JOptionPane.showMessageDialog(null,"You have selected the multiple pattern "+selected_algorithm+" Algorithm");

insert3.setEnabled(false);
insert1.setEnabled(true);
}
}

else if(ae.getSource()==insert1)
  {  
try
{
 fd1=new FileDialog(this,"Open File...",FileDialog.LOAD);    
fd1.show();  
s10 = fd1.getDirectory()+""+fd1.getFile();
//System.out.println("file name"+s);
    int i = s10.lastIndexOf('.');

    if (i > 0 && i < s10.length() - 1)
      if( (s10.substring(i + 1).toLowerCase().equals("txt"))||(s10.substring(i + 1).toLowerCase().equals("fasta"))||(s10.substring(i + 1).toLowerCase().equals("FASTA"))||(s10.substring(i + 1).toLowerCase().equals("fna"))||(s10.substring(i + 1).toLowerCase().equals("FA"))||(s10.substring(i + 1).toLowerCase().equals("fa"))||(s10.substring(i + 1).toLowerCase().equals("FNA")))
 
{

         

jTextArea1.append("You have Chosed"+"\t"+fd1.getFile()+"\n");

jTextArea2.append("TAGA"+"\t"+"TCAT"+"\t"+"GAAT"+"\n"+"AGAT"+"\t"+"AGAA"+"\t"+"GATA"+"\n"+"TATC"+"\t"+"CTTT"+"\t"+"TCTG"+"\n"+"TCTA");

//=================datset creation=============//

sb=new StringBuffer("");
try{
   
            FileReader fr = new FileReader(s10);    
            BufferedReader br = new BufferedReader(fr);                                                   
            String data;
            while((data = br.readLine()) != null)   
            {
		sb.append(data);
		tot_num_lines++;
	     }
}
catch(IOException e){ }  



insert1.setEnabled(false);
insert4.setEnabled(true);

}
else

JOptionPane.showMessageDialog(null,"Please Select TEXT File and Try again");
 
       
//System.out.print(str);
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
 








else if(ae.getSource()==insert4)
{
if(no_of_proc_net==1)
{
//System.out.println(selected_algorithm);
Forward_Sequential l1=new Forward_Sequential(sb.toString(),0,sb.length());
}
if(no_of_proc_net==2)
{
//System.out.println(selected_algorithm);
Backward_Sequential l1=new Backward_Sequential(sb.toString(),sb.length(),4);
}
if(no_of_proc_net==3)
{
N1 l1=new N1(sb.toString(),0,((sb.length()/2)+4));
N2 l2=new N2(sb.toString(),sb.length(),(sb.length()/2));
}
if(no_of_proc_net==4)
{
N1 l1=new N1(sb.toString(),0,((sb.length()/4)+4));
N2 l2=new N2(sb.toString(),(sb.length()/4),((sb.length()/2)+4));
N3 l3=new N3(sb.toString(),(sb.length()/2),((sb.length()/4) + (sb.length()/2) ) +4);
N4 l4=new N4(sb.toString(),((sb.length()/4) + (sb.length()/2) ),sb.length());
}


insert4.setEnabled(false);
insert5.setEnabled(true);

}


else if(ae.getSource()==insert5)
{


jTextArea3.append("\t\t===============\n");

if(no_of_proc_net==1)
jTextArea3.append("Time Elapsed\t\t"+"              "+Integer.parseInt(str5)+" "+"ms");
else if(no_of_proc_net==2)
jTextArea3.append("Time Elapsed\t\t"+"              "+Integer.parseInt(str5)+" "+"ms");
/*
else if(no_of_proc_net==2)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5),  Integer.parseInt(str6))+" "+"ms");
else if(no_of_proc_net==3)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5),  Math.max( Integer.parseInt(str6), Integer.parseInt(str7)))+" "+"ms");
else if(no_of_proc_net==4)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5), Math.max( Integer.parseInt(str6),Math.max(Integer.parseInt(str7),Integer.parseInt(str8)) ))+" "+"ms");
else if(no_of_proc_net==5)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5), Math.max( Integer.parseInt(str6),Math.max(Integer.parseInt(str7),Math.max(Integer.parseInt(str8),Integer.parseInt(str9) ) ) ))+" "+"ms");
else if(no_of_proc_net==6)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5), Math.max( Integer.parseInt(str6),Math.max(Integer.parseInt(str7),Math.max(Integer.parseInt(str8), Math.max( Integer.parseInt(str9), Integer.parseInt(str10)) ) ) ))+" "+"ms");
else if(no_of_proc_net==7)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5), Math.max( Integer.parseInt(str6),Math.max(Integer.parseInt(str7),Math.max(Integer.parseInt(str8), Math.max( Integer.parseInt(str9), Math.max(Integer.parseInt(str10),Integer.parseInt(str11) )) ) ) ))+" "+"ms");
else if(no_of_proc_net==8)
jTextArea3.append("Time Elapsed\t\t"+"              "+Math.max( Integer.parseInt(str5), Math.max( Integer.parseInt(str6),Math.max(Integer.parseInt(str7),Math.max(Integer.parseInt(str8), Math.max( Integer.parseInt(str9), Math.max(Integer.parseInt(str10),Math.max(Integer.parseInt(str11),Integer.parseInt(str12) ) )) ) ) ))+" "+"ms");
*/




jTextArea3.append("\n\t\t===============\n");


insert5.setEnabled(false);
 
}

}


public static void main(String a[]) throws IOException{	       
               StringMatchingInterface app = new StringMatchingInterface();
               app.setDefaultCloseOperation(EXIT_ON_CLOSE);
               
		app.setSize(1350,700);
               app.setVisible(true);  
               app.setResizable(false);

 


 
Socket cs;
ServerSocket ss=new ServerSocket(3020);
cs=ss.accept();
BufferedReader dis=new BufferedReader(new InputStreamReader(cs.getInputStream()));
PrintWriter pw=new PrintWriter(cs.getOutputStream(),true);
str5=dis.readLine();

jTextArea3.append("\nProcessor Name           \t "+"Time Elapsed(ms)\n");
jTextArea3.append("==============\t "+"===============\n"); 
jTextArea3.append(selected_algorithm+"\t"+"              "+str5+"\n"); 

Socket cs1;
ServerSocket ss1=new ServerSocket(3021);
cs1=ss1.accept();
BufferedReader dis1=new BufferedReader(new InputStreamReader(cs1.getInputStream()));
PrintWriter pw1=new PrintWriter(cs1.getOutputStream(),true);
str6=dis1.readLine();

jTextArea3.append("2^0 backward sequential \t"+"              "+str6+"\n"); 

Socket cs2;
ServerSocket ss2=new ServerSocket(3022);
cs2=ss2.accept();
BufferedReader dis2=new BufferedReader(new InputStreamReader(cs2.getInputStream()));
PrintWriter pw2=new PrintWriter(cs2.getOutputStream(),true);
str7=dis2.readLine();
jTextArea3.append("IIIrd Processor You Selected\t"+"              "+str7+"\n");

Socket cs3;
ServerSocket ss3=new ServerSocket(3023);
cs3=ss3.accept();
BufferedReader dis3=new BufferedReader(new InputStreamReader(cs3.getInputStream()));
PrintWriter pw3=new PrintWriter(cs3.getOutputStream(),true);
str8=dis3.readLine();
jTextArea3.append("IVth Processor You Selected\t"+"              "+str8+"\n");

Socket cs4;
ServerSocket ss4=new ServerSocket(3024);
cs4=ss4.accept();
BufferedReader dis4=new BufferedReader(new InputStreamReader(cs4.getInputStream()));
PrintWriter pw4=new PrintWriter(cs4.getOutputStream(),true);
str9=dis4.readLine();
jTextArea3.append("Vth Processor You Selected\t"+"              "+str9+"\n"); 

Socket cs5;
ServerSocket ss5=new ServerSocket(3025);
cs5=ss5.accept();
BufferedReader dis5=new BufferedReader(new InputStreamReader(cs5.getInputStream()));
PrintWriter pw5=new PrintWriter(cs5.getOutputStream(),true);
str10=dis5.readLine();
jTextArea3.append("VIth Processor You Selected\t"+"              "+str10+"\n"); 

Socket cs6;
ServerSocket ss6=new ServerSocket(3026);
cs6=ss6.accept();
BufferedReader dis6=new BufferedReader(new InputStreamReader(cs6.getInputStream()));
PrintWriter pw6=new PrintWriter(cs6.getOutputStream(),true);
str11=dis6.readLine();
jTextArea3.append("VIIth Processor You Selected\t"+"              "+str11+"\n"); 

Socket cs7;
ServerSocket ss7=new ServerSocket(3027);
cs7=ss7.accept();
BufferedReader dis7=new BufferedReader(new InputStreamReader(cs7.getInputStream()));
PrintWriter pw7=new PrintWriter(cs7.getOutputStream(),true);
str12=dis7.readLine();
jTextArea3.append("VIIIth Processor You Selected\t"+"              "+str12+"\n");

 


//=====================     


 }









     
}//main StringMatchingInterface class





