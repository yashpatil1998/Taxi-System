package olauber;
import java.util.*;
public class Student implements Route {

	ArrayList<String> s = new ArrayList<String>();
	ArrayList<Integer> startPoint = new ArrayList<Integer>();
	ArrayList<Integer> endPoint = new ArrayList<Integer>();
	ArrayList<Integer> difference = new ArrayList<Integer>();
	public void start(int s) {
		this.startPoint.add(s);
	}
	public void end(int e) {
		this.endPoint.add(e);
	}
	public void StudentAdd(String s)
	{
		this.s.add(s);
	}
	public void Display()
	{
		for(String str: s)
			System.out.print(str + " ");
		System.out.println();
		for(int s: startPoint)
			System.out.print(s + " ");
		System.out.println();
		for(int e:endPoint)
			System.out.print(e + " ");
	}
}
