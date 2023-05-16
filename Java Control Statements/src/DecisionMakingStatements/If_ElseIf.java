package DecisionMakingStatements;

public class If_ElseIf {
	
	public static void main(String[] args) {
		
		String city = "Chennai";
		
		if (city == "mumbai") {
			
			System.out.println("The city is Mumbai");
			
		} else if (city == "delhi") {
			System.out.println("The city is Delhi");
			
		} else if (city == "Chennai") {
			System.out.println("The city is Chennai");
			
		} else {
			System.out.println("Other Cities");
		}
	}

}
