package chap05.ex04.tune;

public class MainCar {

	public static void main(String[] args) {
		MyCar car =new MyCar();
		car.start();
		System.out.println("차가 시속"+car.run()+"km로 달린다");
		
		//부모 메서드를 override를 이용해 일부 수정한 기능 
		car.turbo = true;
		System.out.println("차가 시속"+car.run()+"km로 달린다");
		car.stop();
	}

}
