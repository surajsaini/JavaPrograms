package JavaProgramListPackage;

public class TargetSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TSA();

	}

	public static void TSA() {

		int[] num = { 1, 4, 20, 3, 10, 5 };

		int target = 33;
		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i; j < num.length; j++) {

				sum = sum + num[j];
				if (sum == 33) {

					System.out.println(i + "-" + j);
				}
				
				else if(sum>33) {
					break;
				}

			}
			sum=0;

		}
	}

//			int j =i;
//			int sum=0;
//			while(sum==33) {
//				
//				sum = sum + num[j];
//				j++;
//				
//				if(sum>33) {
//					
//					break;
//				}
//			}
//			System.out.println(i +"--"+j);
//		}
//	}
}
