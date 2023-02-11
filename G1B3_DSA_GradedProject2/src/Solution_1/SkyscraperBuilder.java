package Solution_1;
import java.util.*;


public class SkyscraperBuilder {

	public SkyscraperBuilder() {
		// TODO Auto-generated constructor stub
	}	
	 void floorsBuild(int b[],int n) {
		int max=n;
		int a[]=new int[n+1];

		for(int i=0;i<n;i++){
			int day=i;
			System.out.println("Day : "+day+"\n");
			int val=b[i];
			a[val]=val;

			if(a[val]==max){
				while(a[val]!=0){
					System.out.print(a[val]+" ");
					val--;
				}
				max = val;
				System.out.println("\n");
			}
			else System.out.println("\n");

		}
	}
	public void manager()
	{
		int n;
		System.out.println("enter the total no of floors in the building  ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		int b[]=new int[n];
		//Vector<Integer> a=new Vector<Integer>(n+1);
		int max=n;
		for(int i=0;i<n;i++){
			int onDay=i+1;
			System.out.println("enter the floor size given on day :"+onDay+"\n");
			int floor=sc.nextInt();

			b[i]=floor;

		}
		sc.close();
		floorsBuild(b,max);        

	}

}
