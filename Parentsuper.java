package chap05.ex03.superinit;

public class Parentsuper {

	public String attr1;
	public int attr2;
	
	//3. 자식으로부터 온 인자값을 받아서 저장
	public Parentsuper(String a, int i) {
		attr1=a;
		attr2=i;
	}

}
