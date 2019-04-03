import java.math.BigDecimal;

public class Client implements Transactional {

    private String firstName;
    private String secondName;
    private String login;
    private String password;

    private static boolean signed = false;
    private static BigDecimal balance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean isSigned() {
        return signed;
    }

    public static boolean setSigned(boolean signed) {
        Client.signed = signed;
        return signed;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Client(String firstName, String secondName, String login, String password, BigDecimal balance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
        this.balance = balance;
    }

    public Client() {
    }

    public boolean singIn(Client client, String inputLog, String inputPass) {
        if (client.getLogin().equals(inputLog)) {
            if (client.getPassword().equals(inputPass)) {
                System.out.println("Welcome " + client.getFirstName() + " " + client.getSecondName());
                return client.setSigned(true);
            }
            System.out.println("Ups. Your login or password is no correct :(");
            return false;
        }
        System.out.println("Ups. Your login or password is no correct :(");
        return false;
    }

    public boolean singOut(Client client) {
        System.out.println("Thank you. Good bye.");
        return client.setSigned(false);
    }

    public BigDecimal showBalance(Client client) {
        return client.getBalance();
    }


}
