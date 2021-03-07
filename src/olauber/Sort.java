package olauber;
import java.util.*;

public class Sort {

	void bubbleSort(Student obj) 
	{
		int n = obj.s.size(); 
		for(int i=0; i < n; i++)
		{  
			for(int j=1; j < (n-i); j++)
			{  
				if(obj.difference.get(j-1) < obj.difference.get(j))
				{  
					Collections.swap(obj.difference,j,j-1);
					Collections.swap(obj.s,j,j-1);
					Collections.swap(obj.startPoint,j,j-1);
					Collections.swap(obj.endPoint,j,j-1);
				}         
			}  
		} 
	}
}
