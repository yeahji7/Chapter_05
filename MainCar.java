package chap05.ex04.tune;

public class MainCar {

	public static void main(String[] args) {
		MyCar car =new MyCar();
		car.start();
		System.out.println("���� �ü�"+car.run()+"km�� �޸���");
		
		//�θ� �޼��带 override�� �̿��� �Ϻ� ������ ��� 
		car.turbo = true;
		System.out.println("���� �ü�"+car.run()+"km�� �޸���");
		car.stop();
	}

}
