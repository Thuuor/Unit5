
public class Call {

	private int numSource;
	private int numDestination;
	private int seconds;
	private int band;
	
	public Call(int numSource,int numDestination,int seconds,int band) {
		
		this.numSource = numSource;
		this.numDestination = numDestination;
		this.seconds = seconds;
		this.band = band;
	}
	
	@Override
	public String toString() {
		return "N. source: " + numSource + " N. dest.: " + numDestination + " Seconds: " + seconds + " Band: " + band;
	}
}
