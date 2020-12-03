package chap05.ex01.inherit;

public class MainPerson {

	public static void main(String[] args) { //이게 있어야 스스로 실행가능
		
		Person person = new Person(); //Person을 사용하기 위한 객체화
		//Person의 본래 기능들(useTool(), social(), talk())
		person.useTool();
		person.social();
		person.talk();
		
		//Mamal에서 상속받은 기능들(birth(),eat())
		//Mamal의 기능을 Mamal을 직접 객체화 하지 않고 Person꺼 처럼 사용가능
		person.birth();
		person.eat();
		

	}

}
