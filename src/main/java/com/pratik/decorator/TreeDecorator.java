/*
 * cannot create instance of this class 
 * children of this class , are supposed to be used for creating instances
 * 
 */
package com.pratik.decorator;

/*
 * this is just a base class , for all the tree decorators
 * now all the children class can directly implement decorate method and 
 * add decoration elements further without need of creating subclasses again 
 * again 
*/

public abstract class TreeDecorator implements ChristmasTree {

	public TreeDecorator(ChristmasTree tree) {
		super();
		this.tree = tree;
	}

	private ChristmasTree tree;

	@Override
	public String decorate() {
		return tree.decorate();
	}

}
