/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10.JavaApplication10;
import java.util.Scanner;

/**
 *
 * @author ELECTRON
 */
public class Player {
    private String playerName;
    public int x;
    public int y;
    
    public Player(){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("What is your name?\n\n> ");
        String name = sc.nextLine();
        System.out.print("\n" + name + "...\n");
        playerName = name;
    }
}
