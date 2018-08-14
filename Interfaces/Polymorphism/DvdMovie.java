public class DvdMovie implements RetailItem{
	private String title;
	private int runningTime;
	private double retailPrice;

	public DvdMovie(String dvdTitle, int runTime, double dvdPrice){
		title = dvdTitle;
		runningTime = runTime;
		retailPrice = dvdPrice;
	}

	public String getTitle(){
		return title;
	}

	public int getRunningTime(){
		return runningTime;
	}

	public double getRetailPrice(){
		return retailPrice;
	}
}