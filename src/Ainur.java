public class Ainur extends People{
    public Ainur(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work() {
        System.out.println("Чач-тарачта иштейт");
    }
    @Override
    public void toRelax() {
        System.out.println("АКШга барып эс алат");
    }
    @Override
    public void communication() {
        System.out.println("Жаккан адам менен жакшы тил табышат");
    }
    @Override
    public void timeTable() {
        System.out.println("Жумасына 6 күн 9 сааттан иштейт");
    }
    @Override
    public void name() {
        super.name();
    }
    @Override
    public void age() {
        super.age();
    }
    @Override
    public void email() {
        super.email();
    }
}
