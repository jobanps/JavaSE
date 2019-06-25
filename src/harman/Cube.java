package harman;

public class Cube {
	
	
	 double width;
	
	public Cube(double width) {
		this.width=width;
	}
	public Cube() {
		this.width=0.0;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public  double getArea() {
		double area=6*width*width;
		return area;
		
	}
	public  double getVolume() {
		double volume=width*width*width;
		return volume;
		
	}
	public  double getDiagnol() {
		double diagnol=(Math.sqrt(3))*width;
		return diagnol;
		
	}
	
	public  void outputCubeInfo() {
		System.out.println("w"+ width);
		System.out.println("s"+ getArea());
		System.out.println("v"+ getVolume());
		System.out.println("d"+ getDiagnol());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
