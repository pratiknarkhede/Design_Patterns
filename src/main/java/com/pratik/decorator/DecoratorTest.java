package com.pratik.decorator;

public class DecoratorTest {
		
		public static void main(String[] args) {
			
			//we are passing christmasImpl object to bubblelights  
			ChristmasTree tree1=new BubbleLights(new ChristmasTreeImpl());
			ChristmasTree tree2=new JingleBells(new ChristmasTreeImpl());
			
			//here we are passing tree1(bubblelights and christmasTree) to JingleLights 
			ChristmasTree tree3=new JingleBells(tree1);
			
			/* o/p Christmas Tree with bubble lights */
			System.out.println(tree1.decorate());
			
			/* o/p Christmas Tree with jingle bells */
			System.out.println(tree2.decorate());
			
			/* o/p Christmas Tree with bubble lights with jingle bells */
			System.out.println(tree3.decorate());
		}
}
