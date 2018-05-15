package lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class demo1 {
	public static void main(String[] args) {
		//Java 8方式：
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		
		System.out.println("-----------------------------");
		
		String []datas = new String[] {"peng","zhao","li"};
	    Arrays.sort(datas);
	    Stream.of(datas).forEach(param ->     System.out.println(param));
	    
	    System.out.println("-----------------------------");
	    
	    Arrays.sort(datas,(v1 , v2) -> Integer.compare(v1.length(), v2.length()));  // 可推测v1 v2的类型String
	    Stream.of(datas).forEach(param -> System.out.println(param));   // ---> 只有一个参数
	    //Lambda表达式只有一个参数，并且参数的类型是可以由编译器推断出来的，则可以如下所示使用Lambda表达式,即可以省略参数的类型及括号
	    
	    //Parameters -> an expression 如果Lambda表达式中要执行多个语句块,需要将多个语句块以{}进行包装，如果有返回值，需要显示指定return语句
	    // 如果Lambda表达式不需要参数，可以使用一个空括号表示
	    
	   
	    
	    
	    
	}

}
