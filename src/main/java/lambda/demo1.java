package lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class demo1 {
	public static void main(String[] args) {
		//Java 8��ʽ��
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		
		System.out.println("-----------------------------");
		
		String []datas = new String[] {"peng","zhao","li"};
	    Arrays.sort(datas);
	    Stream.of(datas).forEach(param ->     System.out.println(param));
	    
	    System.out.println("-----------------------------");
	    
	    Arrays.sort(datas,(v1 , v2) -> Integer.compare(v1.length(), v2.length()));  // ���Ʋ�v1 v2������String
	    Stream.of(datas).forEach(param -> System.out.println(param));   // ---> ֻ��һ������
	    //Lambda���ʽֻ��һ�����������Ҳ����������ǿ����ɱ������ƶϳ����ģ������������ʾʹ��Lambda���ʽ,������ʡ�Բ��������ͼ�����
	    
	    //Parameters -> an expression ���Lambda���ʽ��Ҫִ�ж������,��Ҫ�����������{}���а�װ������з���ֵ����Ҫ��ʾָ��return���
	    // ���Lambda���ʽ����Ҫ����������ʹ��һ�������ű�ʾ
	    
	   
	    
	    
	    
	}

}
