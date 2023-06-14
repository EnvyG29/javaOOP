package dz.dz6;

public class Main{
	public static void main(String[] args){
		String name = "Bob";
		User user = new User(name);
		Report report = new Report(user);
		report.report();
		Persister persister = new Persister();
		persister.save(user);
	}
}