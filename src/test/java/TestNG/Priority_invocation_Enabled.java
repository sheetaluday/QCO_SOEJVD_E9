package TestNG;

import org.testng.annotations.Test;

public class Priority_invocation_Enabled {
@ Test(priority=3,invocationCount=2)
public void demo1(){
	System.out.println("Hi Demo1");
	
}
@ Test (priority=2,invocationCount=3)
public void demo2(){
	System.out.println("Hi Demo2");
	
}
@ Test (priority=-1,invocationCount=4,enabled=false)
public void demo3(){
	System.out.println("Hi Demo3");
	
}
}
