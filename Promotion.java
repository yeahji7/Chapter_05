package chap05.ex06.promotion;

public class Promotion {

	public static void main(String[] args) {		
		/*					Verterate
		 * 					/		\
		 * 				Birds		Mammal
		 * 				/   \		/	\
		 * 		 Chicken   Duck   Dog    Cat
		 */
		Vertebrate 척추동물;
		//닭, 오리, 개 , 고양이 모두 척추 동물이므로 (묵시적으로)들어갈 수 있다.
		척추동물 = new Chicken();
		척추동물 = new Duck();
		척추동물 = new Dog();
		척추동물 = new Cat();
		System.out.println("-------------상속-----------");
		//Chicken이 Mammal에 들어갈 수 있나? -> X
		Mammal2 포유류;
		포유류 = new Dog();
		//Cat이 Birds에 들어갈 수 있나? -> X
		Birds2 조류;
		조류= new Chicken();
		
	}

}
