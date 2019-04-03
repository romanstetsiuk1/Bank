import java.math.BigDecimal;

public interface Transactional {

    boolean singIn(Client login, String inputLog, String inputPass);

    boolean singOut(Client client);

    BigDecimal showBalance(Client client);

    BigDecimal addToBalance(Client client, BigDecimal deposit);

    void cashWithdrawal(Client client, BigDecimal inputValue);


}
