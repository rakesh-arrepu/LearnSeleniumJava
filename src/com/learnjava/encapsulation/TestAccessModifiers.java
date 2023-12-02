package com.learnjava.encapsulation;

import com.learnjava.accessModifiers.DefaultModifiers;
import com.learnjava.accessModifiers.PrivateModifiers;
import com.learnjava.accessModifiers.*;

public class TestAccessModifiers extends ProtectedModifiers{

	public static void main(String[] args) {
		
		TestAccessModifiers tm = new TestAccessModifiers();
		tm.display();
//		tm.dis
		
		
		PrivateModifiers  pm = new PrivateModifiers();
		pm.displayText();
		
		
//		DefaultModifiers dm = new DefaultModifiers();
//		dm.printNum();
		
		
		
		ReadWrite fe = new ReadWrite();
		fe.setN(10);
		fe.getN();
		
	}

}
