package seminar5;

import seminar5.controllers.UserController;
import seminar5.model.FileOperation;
import seminar5.model.FileOperationImpl;
import seminar5.model.Repository;
import seminar5.model.RepositoryFile;
import seminar5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
