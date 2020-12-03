package chap05.ex05.poly;

public class ChildOne extends ParentHouse{
	//override해서 "첫째가 방을 사용한다"문장 출력
	
	String a;
	@Override
	public void useRoom() {
		a="첫";
		System.out.println(a+"째가 방을 사용한다.");
		//super.useRoom();  -> 생략해도 됨
	}

}
