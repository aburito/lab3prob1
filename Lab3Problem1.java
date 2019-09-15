import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Lab3Problem1 extends WindowAdapter{
   
   private JFrame f = new JFrame();
   private JTextArea jtaPassage;
   private JLabel jlFind = new JLabel("Find:");
   private JTextField jtfSearch;
   private JButton jbFind;
   private JButton jbClear;
   private JScrollPane jspPassage;
   private String search;

   public Lab3Problem1(){
      f.setTitle("Find");
      JPanel jpNorth = new JPanel();
      JPanel jpCenter = new JPanel();
      JPanel jpSouth = new JPanel();
      
      jtaPassage = new JTextArea(25, 40);
      jspPassage = new JScrollPane(jtaPassage);
      jbFind = new JButton("Find");
      jbClear = new JButton("Clear");
      jtfSearch = new JTextField(10);
         
      jpNorth.add(jspPassage);
      jpCenter.add(jlFind);
      jpCenter.add(jtfSearch);
      jpSouth.add(jbFind);
      jpSouth.add(jbClear);
      
      f.add(jpNorth, BorderLayout.NORTH);
      f.add(jpCenter, BorderLayout.CENTER);
      f.add(jpSouth, BorderLayout.SOUTH);
      
      f.setSize(500,525);
      f.setVisible(true);
      
      jbClear.addActionListener(new ActionListener()	{
			public void	actionPerformed(ActionEvent ae) {
					clear();
			}
		}
      );
      jbFind.addActionListener(new ActionListener()	{
			public void	actionPerformed(ActionEvent ae) {
					finder();
			}
		}
      );
      
      f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
          		exit();
         }
      }
      );
   }   
   public static void main(String[] args){
      new Lab3Problem1();
   }
   public void clear(){
         jtfSearch.setText(""); 
         jtfSearch.requestFocus();
   }
   public void exit(){
 		System.out.println("Thank you for using find!");
      f.dispose();
 		System.exit(0);
 	}
   public void finder(){
      search = jtfSearch.getText();
      String test = jtaPassage.getText();
      ArrayList<Character> letters = new ArrayList<Character>();
      for (char c : test.toCharArray()){
         letters.add(c);
      }
      System.out.println(search + "\n" + letters);
   }   
}   