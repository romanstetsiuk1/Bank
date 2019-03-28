public interface Transactional {

    boolean singIn(Client login, String inputLog, String inputPass);

    public boolean singOut(Client client);

}
