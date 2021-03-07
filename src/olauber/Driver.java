package olauber;
public class Driver implements Route {
	int capacity,start,end;
	Driver(int capacity)
	{
		this.capacity = capacity;
	}
	public void start(int s)
	{
		this.start = s;
	}

	public void end(int e)
	{
		this.end = e;
	}
}
