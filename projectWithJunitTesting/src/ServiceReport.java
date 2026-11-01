package carManagementSystem;

public class ServiceReport {
	private String repairsPerformed;
	private String partsUsed;
	
	public ServiceReport(String repairsPerformed, String partsUsed) {
		this.repairsPerformed = repairsPerformed;
		this.partsUsed = partsUsed;
	}

	public String getRepairsPerformed() {
		return repairsPerformed;
	}

	public String getPartsUsed() {
		return partsUsed;
	}
	
	@Override 
	public String toString() {
		return "Repairs Performed: " + repairsPerformed +
				"\n Parts Used: " + partsUsed;
	}
	
}
