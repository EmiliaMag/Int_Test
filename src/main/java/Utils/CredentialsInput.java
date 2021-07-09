package Utils;

import java.util.Scanner;


public class CredentialsInput {

    public void usernameInput() {
        Scanner user = new Scanner(System.in);
        String username = user.nextLine();
    }

    public void passwordInput () {
        Scanner pass = new Scanner(System.in);
        String password = pass.nextLine();
    }
}
