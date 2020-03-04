/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava;

import java.util.Scanner;

/**
 *
 * @author Fahri Afif
 */
public class LatihanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int number = 100;
    String hello = (number < 10) ?
            "Hello" : "Not Hello";
    System.out.print("hello");
    Scanner inputan = new Scanner (System.in);
    String hasil = inputan.nextLine();
   
    switch (hasil){
        case "1":
            System.out.print("Hello world");
            break;
        case "2":
            System.out.print("Afif is Good");
        case "3":
            System.out.print("No Option");
    }
               
        
    }}
   

