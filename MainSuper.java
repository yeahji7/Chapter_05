package chap05.ex03.superinit;

public class MainSuper {

	public static void main(String[] args) {
		
		//1.Child ��üȭ�� 3���� ���ڰ� ����.
	Childsuper child = new Childsuper("1�� �Ӽ�", 2, "�ڽ��ʵ�");
	System.out.println(child.attr1);
	System.out.println(child.attr2);
	System.out.println(child.field);
	}

}
