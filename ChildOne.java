package chap05.ex05.poly;

public class ChildOne extends ParentHouse{
	//override�ؼ� "ù°�� ���� ����Ѵ�"���� ���
	
	String a;
	@Override
	public void useRoom() {
		a="ù";
		System.out.println(a+"°�� ���� ����Ѵ�.");
		//super.useRoom();  -> �����ص� ��
	}

}
