package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {



	public static boolean isValidEmail(String email) 
	{
		   String regex = "^(.+)@(.+)$";
		 // STEP 1: initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	 public static void main(String[] args)
	 {
	       List<String> emails = new ArrayList<String>();
	       // STEP 2 :valid email addresses
	       emails.add("hemanth@gmail.com");
	       emails.add("pavan@babu.com");
	       emails.add("kalyan@babu.me.org");
	       //STEP 3:invalid email addresses
	       emails.add("mahesh.babu.com");
	       emails.add("mahesh..babu.com");
	       emails.add("mahesh.babu.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	   }
}