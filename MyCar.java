package chap05.ex04.tune;

public class MyCar extends ParentCar {
	//override ��ӹ��� �޼��� �߿��� ������ �ȵ�� ������ �ٲ㾲�� ���
	//�ͺ���� �߰�
	
	boolean turbo = false;
	@Override
	public int run() {
		if(turbo==true) {
			return 200; //���ο� ���
		} else {
			return super.run(); //super -> �θ��� run �޼����� ��
		}  
	}
	
	
}