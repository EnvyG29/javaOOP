package seminar5.views.validator;

import seminar5.model.User;

public class NameValidator {
    String userInput;

    public NameValidator(String input) {
        this.userInput = input;
    }

    public void validate() throws Exception {
        if (!userInput.matches("^\\S+$")) {
            throw new Exception("Валидация прошла ");
        }
    }

}
