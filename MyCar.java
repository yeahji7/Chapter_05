package chap05.ex04.tune;

public class MyCar extends ParentCar {
	//override 상속받은 메서드 중에서 마음에 안드는 내용을 바꿔쓰는 기능
	//터보기능 추가
	
	boolean turbo = false;
	@Override
	public int run() {
		if(turbo==true) {
			return 200; //새로운 기능
		} else {
			return super.run(); //super -> 부모의 run 메서드라는 것
		}  
	}
	
	
}