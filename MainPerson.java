package chap05.ex01.inherit;

public class MainPerson {

	public static void main(String[] args) { //�̰� �־�� ������ ���డ��
		
		Person person = new Person(); //Person�� ����ϱ� ���� ��üȭ
		//Person�� ���� ��ɵ�(useTool(), social(), talk())
		person.useTool();
		person.social();
		person.talk();
		
		//Mamal���� ��ӹ��� ��ɵ�(birth(),eat())
		//Mamal�� ����� Mamal�� ���� ��üȭ ���� �ʰ� Person�� ó�� ��밡��
		person.birth();
		person.eat();
		

	}

}
