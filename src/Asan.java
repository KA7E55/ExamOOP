public class Asan extends People{
    public Asan(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work() {
        System.out.println("Бизнесмен");
    }
    @Override
    public void toRelax() {
        System.out.println("Японияга эс алууга барат");
    }
    @Override
    public void communication() {
        System.out.println("Жакшы тил табышат");
    }
    @Override
    public void timeTable() {
        System.out.println("Жумасына 5 күн 8 саат иштейт");
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
