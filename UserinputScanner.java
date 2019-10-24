/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.Scanner;
/**
 *
 * @author Aksystems
 */
public class UserinputScanner {
    
    Scanner obj=new Scanner(System.in);
    String name; char alpha;
    public void inputString(){
        System.out.println("What is your name");
         name=obj.nextLine();
    }
    
    public void inputChar(){
        System.out.println("Enter any Alphabet");
        alpha=obj.next().charAt(0);
    }
    
    public void printallvariable(){
        System.out.println("Your name is: "+name);
        System.out.println("Your char is: "+alpha);
    
    }
}
