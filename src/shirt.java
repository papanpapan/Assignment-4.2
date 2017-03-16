
public class shirt {

	private int ShirtCollorSize;
	private int ShirtSleeveLength;
	private String ShirtMaterial;
	shirt()
	{
	}
	shirt(int CollorSize,int SleeveLength,String Material){
		ShirtCollorSize =CollorSize;
		ShirtSleeveLength= SleeveLength;
		Material=ShirtMaterial;
	}
	public int getCollorSize()
	{
	return ShirtCollorSize;
	}
	public int getSleeveLength()
	{
		return ShirtSleeveLength;
	}
	public String getMaterial()
	{
		return ShirtMaterial;	
	}
	public void setCollorSize(int newvalue)
	{
		ShirtCollorSize=newvalue;
	}
	public void setSleeveLength(int newvalue)
	{
		ShirtSleeveLength=newvalue;
	}
	public void setMaterial(String newvalue)
	{
		ShirtMaterial=newvalue;
	}
	public String toString()
	{
		return "Shirt Collor Size is:" +getCollorSize()+"inch"+"Shirt Sleeve Length is:" +getSleeveLength() +"inch"+"Shirt Material is :"+getMaterial();
	}

	











		
		public static void main(String[] args) {
			

	
			shirt s1=new shirt();
		    shirt s2=new shirt(15,32,"Cotton");
			shirt s3=new shirt(0,0,"NULL");
		    s1.setCollorSize(11);
			s1.setSleeveLength(32);
			s1.setMaterial("Silk");
			System.out.println("The Shirt Collor Size is:" + s1.getCollorSize() +" inch");
			System.out.println("The Shirt Sleeve Length is:" +s1.getSleeveLength() +"inch");
			System.out.println("The Shirt Material is:" +s1.getMaterial() );
			System.out.println(s2.toString());
			System.out.println(s3.toString());

		
		}

	}


