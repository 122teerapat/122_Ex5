/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_2;

import java.util.Scanner;

/**
 *
 * @author jjsoc
 */
public class Ex5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean score = new  LiveScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        
        score.addPropertyChangeListener(sub1);
        score.addPropertyChangeListener(sub2);
        
        
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String input = in.nextLine();
            score.setSomeData(input);
            if (input.isEmpty()) {
                break;
            }
        }
    }
    
}
