package chap05.ex03.superinit;

public class MainSuper {

	public static void main(String[] args) {
		
		//1.Child 객체화시 3개의 인자값 전송.
	Childsuper child = new Childsuper("1번 속성", 2, "자식필드");
	System.out.println(child.attr1);
	System.out.println(child.attr2);
	System.out.println(child.field);
	}

}
