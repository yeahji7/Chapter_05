package chap05.ex02.seq;

public class Childseq extends Parentseq{

	public Childseq() {  //생성자는 초기화 할 거 아니면 굳이 써줄 필요 없음. (당연히 있는 것이라 생략가능)
		//Super();  => 부모생성자를 호출하는 녀석이지만 이것도 생략가능. 
		System.out.println("자식 생성자 호출");
		
	}

}
