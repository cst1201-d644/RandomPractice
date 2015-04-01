/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.util.Random;

/**
 *
 * @author rkhatchadourian
 */
public class RandomPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        System.out.println(num);
        
        random.ints(10, 1, 7).forEach(System.out::println);
    }
    
}
