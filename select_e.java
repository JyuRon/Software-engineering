package project;

public class select_e {
	
	void e_print() {
		
		report.clearScreen();
		for(int i=0;i<report.e_kind.length;i++)
		{
			System.out.println((i+1)+"  "+report.e_kind[i][0]);
			System.out.println("-----------------------");
		}
	}

}
