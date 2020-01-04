package Postassessment2;


	import java.util.Comparator;

	public class Employeesort implements Comparator<EmployeeVo> {

		
	@Override
		public int compare(EmployeeVo e1, EmployeeVo e2) {
			int s= (int)e2.getIncometax()-(int)e1.getIncometax();
			if(s>0) {
				return 1;
			}
			else if(s==0) {
				return 0;
			}
			else if(s<0) {
				return -1;
			}
			return 0;
		    }
	            }



