package carManagementSystem;

public class DiagnosticResult {
	private String issuesFound;
	private String recommendedActions;
	
	public DiagnosticResult(String issuesFound, String recommendedActions) {
		this.issuesFound = issuesFound;
		this.recommendedActions = recommendedActions;
	}

	public String getIssuesFound() {
		return issuesFound;
	}

	public String getRecommendedActions() {
		return recommendedActions;
	}

	@Override 
	public String toString() {
		return "Issues Found: " + issuesFound +
				"\n Recommended Actions: " + recommendedActions;
	}
}
