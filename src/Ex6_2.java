
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woytek
 */
public class Ex6_2 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact testContact = new Contact();
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.println( "Last name: " + testContact.getLastName() );
        
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName(input);
        
        System.out.println( "First name: " + testContact.getFirstName());
        
        System.out.print( "Enter the Middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName(input);
        
        System.out.println( "Middle name: " + testContact.getMiddleName());
        
        System.out.print( "Enter the prefix (if you have none, input none): " );
        input = keyboard.nextLine();
        testContact.setPrefix(input);
        
        System.out.println( "Prefix: " + testContact.getPrefix());
        
        System.out.print( "Enter the phone number: " );
        input = keyboard.nextLine();
        testContact.setPhoneNum(input);
        
        System.out.println( "Phone number: " + testContact.getPhoneNum());
        
        
        
        
        
        
        
    }
    
    public static class Contact {
        Contact() {
        }
        
        public void setLastName( String n ) {
            // fix line 35 so it accepts special characters found in last names ex. ' - spaces 
            if( !n.matches("^[A-Za-z' -]+$") ) { // this line is called a regular expression a.k.a. reg expression + means accept any number of letters / characters
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = n;
            }
        }
        public String getLastName() {
            
        	return lName;
        }
        public void setFirstName( String n ) {
        	  if( !n.matches("^[A-Za-z' -]+$") ) { 
                  System.out.println( "Invalid characters in first name" );
              } else {
            	  fName = n;
              }	
        }
        public String getFirstName() {
            return fName;
        }
        public void setMiddleName( String n ) {
        	  if( !n.matches("^[A-Za-z' -]+$") ) { 
                  System.out.println( "Invalid characters in middle name" );
              } else {
        	mName = n;
              }
        }
        public String getMiddleName() {
            return mName;
        }
        public void setPrefix( String n ){
        	  if( !n.matches("^[A-Za-z. ]+$") ) { 
                  System.out.println( "Invalid characters in prefix" );
              } else {
        	prefix = n;
              }
        }
        public String getPrefix(){
        	return prefix;
        }
        public void setPhoneNum( String n){
        	  if( !n.matches("^[0-9+ -]+$") ) { 
                  System.out.println( "Invalid characters in phone number" );
              } else {
        	phoneNum = n;
              }	
        }
        public String getPhoneNum(){
        	return phoneNum;
        }
        //ex phone reg ex: "^[0-9]{3} - [0-9]{3} - [0-9]{4}$"
        /*
         * Name (first, last, middle)
         * Prefix
         * Phone number
         * email
         * address (street, city, state, zip)
         * occupation
        */
        private String lName,fName, mName;
        private String prefix;
        private String phoneNum;
        private String email;
        private String street, city, state, zip;
        private String occupation;
        
        
        
    }
    
}
