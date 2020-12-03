package chap05.ex05.poly;

public class MainPoly {

	public static void main(String[] args) {
		//첫째부터 넷째까지 불러서 방을 써보자
		ChildOne one = new ChildOne(); 
		one.useRoom();
		
		ChildTwo two = new ChildTwo();
		two.useRoom();
		
		ChildThree thr = new ChildThree();
		thr.useRoom();
		
		ChildFour four = new ChildFour();
		four.useRoom();
		
		//위의 예시 ) 각각 객체화 시켜서 4개의 변수를 각각 선언해주고 메소드를 각각 불러와야함
		//만약 형제가 50명일 경우 몇개의 변수가 필요한가? 50개
		//코드도 계속 변경해줘야하는 번거로움이 있다.
		
		// -> 다형성을 이용하면?
		//같은 부모를 가지고 있으면 부모에게 속할 수 있음.
		System.out.println("-----------Polymorphism-----------------");
		
		ParentHouse house; //부모 형태의 변수(house) 하나생성
		house = new ChildOne(); //부모님 집에 첫째 들어감.
		house.useRoom();
		
		house = new ChildTwo(); //house 변수에 자식객체들이 들어가 번갈아가면서 초기화
		house.useRoom();
		
		house = new ChildThree();
		house.useRoom();
		
		house = new ChildFour();
		house.useRoom();
		//자식을 초기화 할때마다 값이 변하는 것. 넣으려는 객체를 다 출력하려면  배열을 사용해야함

	}

}
