package dz.dz6;

public class Report{
    private User user;

    public Report(User user) {
        this.user = user;
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
