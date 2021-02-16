package project;

public class select_c {
	
	void c_print() {
		
		report.clearScreen();
		for(int i=0;i<report.c_kind.length;i++)
		{
			System.out.println((i+1)+"  "+report.c_kind[i][0]);
			System.out.println("-----------------------");
		}
	}

}
