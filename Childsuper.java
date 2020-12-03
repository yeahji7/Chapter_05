package chap05.ex03.superinit;

public class Childsuper extends Parentsuper {
	
	public String field;

	public Childsuper(String a, int i, String b) {
		// 2. 2개의 인자값을 부모 생성자에게 전달
		// 그래서 super();로 받으면 하나밖에 못받아서 에러가 남.
		super(a,i); //부모 생성자와 갯수를 맞춰줘야함.
		field=b; //field는 원래 자식꺼니까 자식객체에 저장.
		
		//부모 생성자를 먼저 받아오므로 super는 가장 위에 써줘야함 (field랑 자리 바뀌면 안됨)
		
	}

}
