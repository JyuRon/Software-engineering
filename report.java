package project;

public class report {
	
	
	static String[][] e_kind = {
			{"�� ��","4100","4600"},
			{"�Ƹ޸�ī��","4100","4600"},
			{"����","4600","5100"},
			{"īǪġ��","4600","5100"},
			{"�ٴҶ� ��","5100","5600"},
			{"ī�� ��ī","5100","5600"},
			{"ī��� �����ƶ�","5600","6100"},
			{"ȭ��Ʈ ��ī","5600","6100"},
			{"�÷��� ��","6000","7000"},
			{"����������","3300","3800"},
			{"�� ��","4100","4600"}};
	
	static String[][] c_kind= {
			{"�ٴҶ� ũ����ַ�","31000"},
			{"Ŀ�ǻ�ũ��","25000"},
			{"�������ġ��","26000"},
			{"�����������ũ��","27000"},
			{"��Ű������Ʈ","28000"}};
			
	
	

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
