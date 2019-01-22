package com.test.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress{
	private String s;
	public StringAddress(String s) {this.s=s;}
	public String toString() {
		return super.toString()+"     "+s;		
	}
}
public class Fillinglists {
	public static void main(String[] args) {
		List<StringAddress> list=new ArrayList<StringAddress>(
				Collections.nCopies(3, new StringAddress("hello")));
				System.out.println(list);
				Collections.fill(list, new StringAddress("World"));
				System.out.println(list);
	}

}
