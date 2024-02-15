package cleancode;

public class Person {
	
		// Attributes
		private String firstN;
		private String lastN;
		private int age;
		
		// Constructor/s
		public Person(String firstN, String lastN, int age) 
		{
			this.firstN = firstN;
			this.lastN = lastN;
			this.age = age;
		}
		
		// Getters
		public String getFirstN() 
		{
			return this.firstN;
		}
		public String getLastN() 
		{
			return this.lastN;
		}
		public int getAge() 
		{
			return this.age;
		}
		
		// Setters
		public void setFirstN(String firstN) 
		{
			this.firstN = firstN;
		}
		public void setLastN(String lastN) 
		{
			this.lastN = lastN;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
		
		// General methods
		public void eat() 
		{
			System.out.println("I'm eating");
		}
		
		// Own methods
		@Override
		public String toString() 
		{
			return "Person: " + this.firstN + " " + this.lastN + " is " + this.age + " years old";
		}

}
