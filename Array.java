/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Aksystems
 */
public class Array {
public Array(){

    int number[]={1,2,3,4,5,6,7,8,9,10};
    for(int i=0;i<number.length;i++){
        System.out.println("Numbers are"+i+") "+number[i]);
    }
    
    double dec[]={1.00,2.00,3.00};
    for(int j=0;j<dec.length;j++){
        System.out.println("Decimal numbers are"+j+")"+dec[j]);
    }
}    
}
