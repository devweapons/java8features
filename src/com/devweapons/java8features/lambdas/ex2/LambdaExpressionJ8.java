package com.devweapons.java8features.lambdas.ex2;

/**
 * 
 * The above example is used to demonstrate the :
 * use of lambda expressions with functional interfaces
 *
 */
public class LambdaExpressionJ8 {
	
	   public static void main(String args[]){
	      
		   LambdaExpressionJ8 tester = new LambdaExpressionJ8();
			
	      //LE using type declaration
		   ArithmeticOperation addition = (int a, int b) -> a + b;
			
	      //LE without type declaration
		   ArithmeticOperation subtraction = (a, b) -> a - b;
			
	      //LE with return statement along with curly braces
		   ArithmeticOperation multiplication = (int a, int b) -> { return a * b; };
		
	      //LE without return statement and without curly braces
		   ArithmeticOperation division = (int a, int b) -> a / b;
			
	      System.out.println("5 + 5 = " + tester.operate(5, 5, addition));
	      System.out.println("5 - 5 = " + tester.operate(5, 5, subtraction));
	      System.out.println("5 x 5 = " + tester.operate(5, 5, multiplication));
	      System.out.println("5 / 5 = " + tester.operate(5, 5, division));
			
	      //LE without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //LE with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("abdel");
	      greetService2.sayMessage("toto");
	   }
	
	   private int operate(int a, int b, ArithmeticOperation operation){
	      return operation.operation(a, b);
	   }
	}
