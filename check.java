package project;
import java.util.*;

public class check {
	Scanner scan = new Scanner(System.in);
	
	String[][] e_kind = {
			{"롱 블랙","4100","4600"},
			{"아메리카노","4100","4600"},
			{"숏라떼","4600","5100"},
			{"카푸치노","4600","5100"},
			{"바닐라 라떼","5100","5600"},
			{"카페 모카","5100","5600"},
			{"카라멜 마끼아또","5600","6100"},
			{"화이트 모카","5600","6100"},
			{"플로팅 라떼","6000","7000"},
			{"에스프레소","3300","3800"},
			{"롱 블랙","4100","4600"}};
	
	int candle_check() {
		
		int candle = 0;
		int candle_count=0;
		clearScreen();
		System.out.println("초가 필요하십니까? \n 1.예    2.아니오");
		candle = scan.nextInt();
		

		while(!(candle>=1 && candle<=2))
		{
			System.out.println("잘못된 입력값입니다.");
			System.out.println("초가 필요하십니까? \n 1.예    2.아니오");
			candle = scan.nextInt();
		}
		
		
		if(candle == 1)
		{
			clearScreen();
			System.out.println("필요하신 초의 개수를 입력해 주세요.");
			candle_count = scan.nextInt();
			
			while(candle_count<=0)
			{
				System.out.println("잘못된 입력값입니다.");
				System.out.println("필요하신 초의 개수를 입력해 주세요.");
				candle_count = scan.nextInt();
			}
			
			return candle_count;
		}
			
		else
			return candle_count;
		
	}
	
	boolean point_check() {
		
		int point = 0; 
		clearScreen();
		System.out.println("포인트 적립 하시겟습니까? \n 1.예    2.아니오");
		point = scan.nextInt();
		

		while(!(point>=1 && point<=2))
		{
			clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("포인트 적립 하시겟습니까? \n 1.예    2.아니오");
			point = scan.nextInt();
		}
		
		
		if(point == 1)
			return true;
		else
			return false;
		
	}
	
	
	int type_check() {
		int type = 1;
		clearScreen();
		System.out.println("음료의 온도를 선택해 주세요.\n 1.Hot  2. Ice");
		type = scan.nextInt();
		
		while(!(type>=1 && type<=2))
		{
			clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("음료의 크기를 선택해 주세요.\n 1.Hot  2. Ice");
			type = scan.nextInt();
		}
		
		return type;
		
		
	}
	
	
	int size_check() {
		int size = 1;
		clearScreen();
		System.out.println("음료의 크기를 선택해 주세요.\n 1.Regular  2. Large");
		size = scan.nextInt();
		
		while(!(size>=1 && size<=2))
		{
			clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("음료의 크기를 선택해 주세요.\n 1.Regular  2. Large");
			size = scan.nextInt();
		}
		
		return size;
		
		
	}
	
	int quantity_check() {
		
		int quantity = 0;
		clearScreen();
		System.out.println("주문하실 수량을 입력해 주세요.");
		quantity = scan.nextInt();
		
		while(quantity<=0)
		{
			clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("주문하실 수량을 입력해 주세요.");
			quantity = scan.nextInt();
			
		}
		
		
		return quantity;
		
	}

	boolean cream_check(String type){
		
		String check = null;
		
		clearScreen();
		
		if(type.equals("바닐라 라떼") || type.equals("카페 모카") || type.equals("카라멜 마끼아또") || type.equals("화이트 모카") )
		{
			
			System.out.println("휘핑크림이 추가되는 메뉴입니다. 추가하시겠습니까?(y/n)");
			
			check = scan.next();
			
			
			//문자 검열
			while(!(check.equals("y") || check.equals("Y") ||  check.equals("N") || check.equals("n")))
			{
				clearScreen();
				System.out.println("잘못된 입력값입니다.");
				System.out.println("휘핑크림이 추가되는 메뉴입니다. 추가하시겠습니까?(y/n)");
				check = scan.next();
			}
			
			
		}
		
		if(check==null)
			return false;
		else if(check.equals("y") || check.equals("Y"))
			return true;
		else
			return false;
		
	}
	
	
	int add()
	{
		int add = 0; 
		clearScreen();
		System.out.println("추가하실 품목을 선택해 주세요.");
		System.out.println("0.취소   1.휘핑    2.시럽    3.샷");
		add = scan.nextInt();
		
		while(add<0 || add>3)
		{
			clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("추가하실 품목을 선택해 주세요.");
			System.out.println("0.취소   1.휘핑    2.시럽    3.샷");
			add = scan.nextInt();
			
		}
		
		return add;
	}
	
	boolean takeout_check()
	{
		int takeout = 0; 
		clearScreen();
		System.out.println("포장하십니까? \n 1.예    2.아니오");
		takeout = scan.nextInt();
		

		while(!(takeout>=1 && takeout<=2))
		{
			clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("포장하십니까? \n 1.예    2.아니오");
			takeout = scan.nextInt();
		}
		
		
		if(takeout == 1)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	void clearScreen() {
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	  }
	
}
