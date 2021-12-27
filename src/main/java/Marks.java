
import java.util.Scanner;

public class Marks {
    private int roll;
    private String name;
    private int std;
    private int[] marks=new int[3];
    float avg;
    
    public Marks()
    {
    	
    }
    
    Scanner sc=new Scanner(System.in);
    public  void setRoll(int roll)
    {
  	this.roll=roll;  
    }
    public int getRoll()
    {
     return roll;	
    }
    
    public  void setName(String name)
    {
  	this.name=name;  
    }
    public String getName()
    {
     return name;	
    }
    
    public  void setStd(int std)
    {
  	  this.std=std;  
    }
    public int getStd()
    {
     return std;	
    }
    
    public void setMarks()
    {
    	System.out.println("Enter the Marks of 3 subjects<MAths-Science-English>");
        for(int i=0;i<3;i++)
        {
      	  marks[i]=sc.nextInt();
        }  	
    }
    public int[] getMarks()
    {
      return marks;	
    }
    
    public  void setAvg(float avg)
    {
  	this.avg=avg;  
    }
    public float getAvg()
    {
     return avg;	
    }
    
}
