package chap05.ex01.inherit;

public class Person extends Mammal1{ //인간은 조류이면서 포유류 일 수가 없으므로 하나만 상속받는다.

	/*Person 고유 메서드*/
	public void useTool(){
		System.out.println("도구를 사용한다");
	}
	public void social(){
		System.out.println("사회생활을 한다");
	}
	public void talk (){
		System.out.println("대화한다");
	}
	
	
}
