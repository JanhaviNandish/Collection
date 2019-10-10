import java.util.Arrays;

public class ArrayList 
{
	Object ar[];
	int size;
	public ArrayList()
	{
		ar = new Object[10];
	}
	public Object get(int index)
	{
		if(index>=size)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			return ar[index];
		}
	}
	public void add(Object ele)
	{
		if(ar.length<=5)
		{
			increaseSize();
		}
		ar[size++]=ele;
	}
	public void increaseSize()
	{
		ar = Arrays.copyOf(ar,ar.length*2);
	}
	public void remove(int index)
	{
		if(index>=size)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			ar[index]=null;
			int t=index;
			while(t<size)
			{
				ar[t]=ar[t+1];
				ar[t+1]=null;
				t++;
			}
			size--;
		}
	}
	public void getSize()
	{
		System.out.println("the size of array is:" +size);
		//return size;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();
		obj.add(new Integer(10));
		obj.add(new Integer(20));
		obj.add(new Integer(30));
		obj.add(new Integer(40));
		obj.add(new Integer(50));
		obj.display();
		obj.getSize();
		obj.remove(2);
		obj.display();
		obj.getSize();
		
		
	}

}
