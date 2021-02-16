package project;

public class report {
	
	
	static String[][] e_kind = {
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
	
	static String[][] c_kind= {
			{"바닐라 크렘브뤨레","31000"},
			{"커피생크림","25000"},
			{"까망베르치즈","26000"},
			{"벚꽃향기딸기생크림","27000"},
			{"밀키베리하트","28000"}};
			
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			TotalFlow a = new TotalFlow();
			a.flow();
			
			while(a.mid_flow());
			
			a.final_flow();
	
		

	}
	
	static void clearScreen() {
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	  }

}
