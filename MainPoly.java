package chap05.ex05.poly;

public class MainPoly {

	public static void main(String[] args) {
		//ù°���� ��°���� �ҷ��� ���� �Ẹ��
		ChildOne one = new ChildOne(); 
		one.useRoom();
		
		ChildTwo two = new ChildTwo();
		two.useRoom();
		
		ChildThree thr = new ChildThree();
		thr.useRoom();
		
		ChildFour four = new ChildFour();
		four.useRoom();
		
		//���� ���� ) ���� ��üȭ ���Ѽ� 4���� ������ ���� �������ְ� �޼ҵ带 ���� �ҷ��;���
		//���� ������ 50���� ��� ��� ������ �ʿ��Ѱ�? 50��
		//�ڵ嵵 ��� ����������ϴ� ���ŷο��� �ִ�.
		
		// -> �������� �̿��ϸ�?
		//���� �θ� ������ ������ �θ𿡰� ���� �� ����.
		System.out.println("-----------Polymorphism-----------------");
		
		ParentHouse house; //�θ� ������ ����(house) �ϳ�����
		house = new ChildOne(); //�θ�� ���� ù° ��.
		house.useRoom();
		
		house = new ChildTwo(); //house ������ �ڽİ�ü���� �� �����ư��鼭 �ʱ�ȭ
		house.useRoom();
		
		house = new ChildThree();
		house.useRoom();
		
		house = new ChildFour();
		house.useRoom();
		//�ڽ��� �ʱ�ȭ �Ҷ����� ���� ���ϴ� ��. �������� ��ü�� �� ����Ϸ���  �迭�� ����ؾ���

	}

}
