/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
import java.util.Scanner;

public class NewClass {
    

	     public static void main(String[] args) {
         Scanner Keybord = new Scanner(System.in);
	         System.out.println("Enter the checks for the month: ");
	         int Input_values = Keybord.nextInt();
	         System.out.println(outputfee(Input_values));
	    }
	    public static double outputfee(int check){
	double fees=0;
	double checksfee1 = 0.10;
	double checksfee2 = 0.08;
	double checksfee3 = 0.06;
	double checksfee4 = 0.04;
	double Total=0;
	double Constantfee= 10;
	  if(check < 20){
	   fees= checksfee1;
	}else if(check >= 20 && check < 40){
	   fees = checksfee2;
	}else if (check >= 40 && check < 60) {
	      fees = checksfee3;
	    } else {
	     fees = checksfee4;
	    }
	  Total = Constantfee + (fees * check);
	 return(Total);
	}
}