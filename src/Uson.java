public class Uson extends People{
    public Uson(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work() {
        System.out.println("Үсөн курулушта иштейт");
    }
    @Override
    public void toRelax() {
        System.out.println("Эс алууга барбайт");
    }
    @Override
    public void communication() {
        System.out.println("Жакшы тил табышат");
    }
    @Override
    public void timeTable() {
        System.out.println("Жумасына 5 күн 5 сааттан иштейт");
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
