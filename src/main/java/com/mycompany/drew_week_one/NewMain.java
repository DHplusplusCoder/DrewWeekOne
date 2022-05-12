/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drew_week_one;
import java.system.*;
import java.util.Scanner;
/**
 *
 * @author drew
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner User_Input;
        System.out.println("Welcome to the CLI Menu Service!\n");
        System.out.println("Select your choice from the following options:");
        System.out.println("---View Employees = 1");
        System.out.println("---Go to Finance Submenu = 2");
        
        User_Input = new Scanner(System.in);
        String Response = User_Input.nextLine();
        
    }
    
}
