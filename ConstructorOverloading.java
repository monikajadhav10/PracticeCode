package InterviewQuestions;

public class ConstructorOverloading {
	
	double width,height,depth;
	int boxNo;
	
	

	
	ConstructorOverloading(double w, double h, double d,int length){
		width = w;
		height = h;
		depth =d;	
		boxNo =length;
	}
	
	ConstructorOverloading()
	{
		width = height = depth= 0;
	}
	
	ConstructorOverloading(int length)
	{
		this();
		boxNo  = length;
		
		
	}
	
	double volume() {
		return depth*height*width;
		
	}

	public static void main(String[] args) {
		
		ConstructorOverloading obj1 = new ConstructorOverloading(10,20,5,2);
		ConstructorOverloading obj2 = new ConstructorOverloading();
		ConstructorOverloading obj3 = new ConstructorOverloading(2);
		
		System.out.println(obj1.volume());
		System.out.println(obj2.volume());
		System.out.println(obj3.width);
		
	}

}
