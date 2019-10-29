
public class Call {

	public static final double LOCAL_COST = 0.15;
	public static final double BAND_1_COST = 0.15;
	public static final double BAND_2_COST = 0.15;
	public static final double BAND_3_COST = 0.15;
	
	
	private int numSource;
	private int numDestination;
	private int seconds;
	private int band;
	private boolean local;
	private double cost;
	
	public Call(int numSource,int numDestination,int seconds,int band,boolean local) {
		
		this.numSource = numSource;
		this.numDestination = numDestination;
		this.seconds = seconds;
		this.band = band;
		this.local = local;
		cost = calculateCost();
	}
	
	@Override
	public String toString() {
		return "N. source: " + numSource + " N. dest.: " + numDestination + " Seconds: " + seconds + " Band: " + band;
	}
	
	public double calculateCost() {
		if(local) {
			return seconds*LOCAL_COST;
		} else {
			switch(band) {
			case 1:
				return BAND_1_COST*seconds;
			case 2:
				return BAND_2_COST*seconds;
			case 3:
				return BAND_3_COST*seconds;
			default:
				return -1;
			}
			
		}
		
	}
	
	public double getCost() {
		return cost;
	}
}
