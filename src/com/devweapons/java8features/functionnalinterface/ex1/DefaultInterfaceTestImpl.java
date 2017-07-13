package com.devweapons.java8features.functionnalinterface.ex1;

/**
 * 
 * The above example is used to demonstrate the :
 * use and implementation of functional interface
 *
 */
public class DefaultInterfaceTestImpl {
    public static void main(String[] args){
   
	   //implementation using old way using anonymous inner class
	   FunctionalInterfaceTest oldWay = new FunctionalInterfaceTest(){
	      public void show(){
	         System.out.println("Display from old way");
	      }};
	   
	      oldWay.show();//outputs: Display from old way
	   
	   //implementation using lambda expression
	   FunctionalInterfaceTest newWay = () -> {System.out.println("Display from new way using : Lambda Expression");};
	      newWay.show();//outputs : Display from new Lambda Expression
	   }
}
