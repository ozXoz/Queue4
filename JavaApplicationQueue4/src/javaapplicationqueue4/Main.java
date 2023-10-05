/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationqueue4;

import java.util.PriorityQueue;

/**
 *
 * @author oz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
// Actually we making sorting .
//    while (!queue.isEmpty())
//    System.out.println(queue.remove());
//         System.out.println(queue.remove());
        System.out.println(queue);




        // if i create a priority queue of integers in Java
        // by default the smallest numbers will come out first.

        System.out.println(queue);
    }
    
}
