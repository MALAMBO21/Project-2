
package my.company.id.project1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
      String item;
      double price;
      int quantity;
      char currency = 'R';
      double total;
      
           
     JOptionPane.showMessageDialog(null, "Welcome to Emeris Caffe!");
     
     JOptionPane.showInputDialog("What would you like to order?");
     
          JOptionPane.showInputDialog("The price of each is:");
                   
          JOptionPane.showInputDialog("How many would you like?");
                   
          JOptionPane.showMessageDialog(null, "===THANK YOU FOR SHOPPING====");
         
     JOptionPane.showMessageDialog(null, "Your total is:" + currency);
      
      
    
      
   }    
}    