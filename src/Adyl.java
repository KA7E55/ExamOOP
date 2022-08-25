public class Adyl extends People{
    public Adyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work() {
        System.out.println("Айдоочу болуп иштейт");
    }
    @Override
    public void toRelax() {
        System.out.println("Казахстанга барып эс алат");
    }
    @Override
    public void communication() {
        System.out.println("Адамдар менен көп сүйлөшпөйт");
    }
    @Override
    public void timeTable() {
        System.out.println("Жумасына 7 күн 6 сааттан иштейт");
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
