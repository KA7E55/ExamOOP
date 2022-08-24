public class Akyl extends People{
    public Akyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work() {
        System.out.println("Акыл мугалим болуп иштейт");
    }
    @Override
    public void toRelax() {
        System.out.println("Эс алууга кээде барат");
    }
    @Override
    public void communication() {
        System.out.println("Өтө жакшы тил табышат");
    }
    @Override
    public void timeTable() {
        System.out.println("Жумасына 5 күн 6 сааттан иштейт");
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
