package chap05.ex03.superinit;

public class Childsuper extends Parentsuper {
	
	public String field;

	public Childsuper(String a, int i, String b) {
		// 2. 2���� ���ڰ��� �θ� �����ڿ��� ����
		// �׷��� super();�� ������ �ϳ��ۿ� ���޾Ƽ� ������ ��.
		super(a,i); //�θ� �����ڿ� ������ ���������.
		field=b; //field�� ���� �ڽĲ��ϱ� �ڽİ�ü�� ����.
		
		//�θ� �����ڸ� ���� �޾ƿ��Ƿ� super�� ���� ���� ������� (field�� �ڸ� �ٲ�� �ȵ�)
		
	}

}
