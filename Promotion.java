package chap05.ex06.promotion;

public class Promotion {

	public static void main(String[] args) {		
		/*					Verterate
		 * 					/		\
		 * 				Birds		Mammal
		 * 				/   \		/	\
		 * 		 Chicken   Duck   Dog    Cat
		 */
		Vertebrate ô�ߵ���;
		//��, ����, �� , ����� ��� ô�� �����̹Ƿ� (����������)�� �� �ִ�.
		ô�ߵ��� = new Chicken();
		ô�ߵ��� = new Duck();
		ô�ߵ��� = new Dog();
		ô�ߵ��� = new Cat();
		System.out.println("-------------���-----------");
		//Chicken�� Mammal�� �� �� �ֳ�? -> X
		Mammal2 ������;
		������ = new Dog();
		//Cat�� Birds�� �� �� �ֳ�? -> X
		Birds2 ����;
		����= new Chicken();
		
	}

}
