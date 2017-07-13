package com.devweapons.java8features.defaultmethod.ex1;

/**
 * 
 * functional interface : contains only one abstract method and one or more DEFAULT METHOD
 * the default method can have a body
 *
 */
public interface FunctionalInterfaceTest {
	void show();
	default void infos() {
		System.out.println("im a default method, no need to my implementation");
	};
}
