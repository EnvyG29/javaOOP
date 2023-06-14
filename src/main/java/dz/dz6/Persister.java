package dz.dz6;

public class Persister implements Save{

	@Override
	public void save(User user) {
		System.out.println("Save user: " + user.getName());
	}
}