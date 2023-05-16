package DecisionMakingStatements;

public class NestedIf {
	
	public static void main(String[] args) {
		
		String Country = "India";
		String state = "Tamilnadu, Kerala, Maharastra";
		
		if (Country.equals("India")) {
			
			if (state.contains("UP")) {
				
				System.out.println("You are in mumbai");
				
			} else if (state.contains("Tamilnadu")) {
				
				System.out.println("You are inside the listed state");
				
			} else if (state.contains("Gujarat")) {
				
				System.out.println("you are in Gujarat");
				
			}
			
		} else {
			
			System.out.println("you are not from India");

		}
	}

}
