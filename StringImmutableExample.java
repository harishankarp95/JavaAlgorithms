package com.hari;

final class Immutable{
	
	private int i;
	
	Immutable(int i){
		this.i = i;
	}
	
	public Immutable modify(int i) {
		
		if(this.i == i) {
			
			return this;
		}else {
			
			return new Immutable(i);
		}
	}
}
public class StringImmutableExample {

	public static void main(String[] args) {  

		Immutable d1 = new Immutable(10);
		Immutable d2 =d1.modify(20);
		Immutable d3 = d1.modify(10);
		
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
	}
}
