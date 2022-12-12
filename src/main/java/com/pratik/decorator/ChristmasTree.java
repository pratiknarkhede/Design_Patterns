/*
 * A Decorator pattern can be used to attach additional responsibilities 
 * to an object either statically or dynamically.
 */
package com.pratik.decorator;

/**
 * we prefer composition over an inheritance – so that we can reduce the
 * overhead of subclassing again and again for each decorating element.
 */
public interface ChristmasTree {

	public String decorate();
}
