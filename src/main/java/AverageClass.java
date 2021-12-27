
public class AverageClass {
  
  public static float average(int[] marks)
  {
	 float f=0f;
	 float s=0;
	 for(int i=0;i<marks.length;i++)
		 s+=marks[i];
	 f=s/marks.length;
	 return f;
  }
}
