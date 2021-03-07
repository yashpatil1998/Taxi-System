package olauber;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try{
			Student sObj = new Student();
			System.out.print("Enter Driver capacity : ");
			int c = sc.nextInt();
			Driver dObj = new Driver(c);
			System.out.print("Enter Source Station of Driver : ");
			int s = sc.nextInt();
			dObj.start(s);
			System.out.print("Enter Destination Station of Driver: ");
			int d = sc.nextInt();
			dObj.end(d);
			int students = 0;
			while(true)
			{
				System.out.print("Enter Student name : ");
				String name = sc.next();
				sObj.StudentAdd(name);
				System.out.print("Enter Source Station number :");
				int source = sc.nextInt();
				sObj.start(source);
				System.out.print("Enter Destination Station Number:");
				int dest = sc.nextInt();
				sObj.end(dest);
				System.out.print("Enter yes to Enter anther data : ");
				String choice = sc.next();
				if(!choice.equals("yes"))
					break;
				else
					students++;
			}
			students++;
			System.out.println("Number of Customers is :"+students);
			System.out.println("Assuming Cost of Trip between 2 Stations is Rs.10 ");
			System.out.print("Enter number of trips:");
			int trips = sc.nextInt();
			ArrayList<Integer> tnum = new ArrayList<Integer>();
			ArrayList<String> tempsp = new ArrayList<String>();
			ArrayList<String> tnumname = new ArrayList<String>();
			for(int i = 0; i < trips; i++)
			{
				System.out.println("Enter trip number :");
				tnum.add(sc.nextInt() - 1);
				tnumname.add(sObj.s.get(tnum.get(i)));
			}
			int profit = 0;
			Sort objSort = new Sort();
			if(trips <= c)
			{
				for(int i = 0; i < tnum.size(); i++)
				{
					profit += sObj.endPoint.get(tnum.get(i)) - sObj.startPoint.get(tnum.get(i));
				}
				profit *= 15;
				System.out.println("Profit earned is Rs." +profit);
			}
			else
			{
				for(int i = 0; i < sObj.s.size(); i++)
				{
					sObj.difference.add(sObj.endPoint.get(i) - sObj.startPoint.get(i)); 	
				}
				objSort.bubbleSort(sObj);
				for(int i = 0; i < sObj.endPoint.size(); i++)
				{
					for(int j = 0; j < sObj.startPoint.size(); j++)
					{
						if(sObj.endPoint.get(i) <= sObj.startPoint.get(j))
						{
							tempsp.add(sObj.s.get(j));
						}
					}
				}
				int count = 0;
				while(count < c){
					for(int i = 0; i < sObj.s.size(); i++)
						if(sObj.s.get(i).equals((tnumname).get(count)))
						{
							profit += sObj.difference.get(i);
							count++;
						}
				}
				for(int i = c; i < trips; i++)
				{
					for(int j = 0; j < sObj.s.size(); j++)
					{
						if(tempsp.get(i-c).equals(sObj.s.get(j)))
							profit += sObj.difference.get(i);
					}
				}
				profit *= 15;
				System.out.println("Maximum profit earned is Rs." +profit);
			}
		}
		catch(Exception e)
		{
			System.out.println("Something gone wrong ");
		}
		finally{
			sc.close();
		}
	}
}