package com.devweapons.java8features.defaultmethod.ex1;

/**
 * 
 * The above example is used to demonstrate the :
 * use of a default method
 * no need to implement a default method
 *
 */
public class DefaultInterfaceTestImpl {
    public static void main(String[] args){
	   
	   //implementation using lambda expression
	   FunctionalInterfaceTest newWay = () -> {System.out.println("Display from new way using : Lambda Expression");};
	      newWay.show();//outputs : Display from new Lambda Expression
	      newWay.infos();
	   }
}
