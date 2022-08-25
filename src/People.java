public abstract class People {
    private int id;
    private String firstName;
    private String lastName;
    private  int age;
    private String email;
    private String city;
    public People(int id, String firstName, String lastName, int age, String email, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.city = city;
    }
    public abstract void work();
    public abstract void toRelax();
    public abstract void communication();
    public abstract void timeTable();
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getCity() {
        return city;
    }
    public void name(){
        if (!firstName.equals(getClass().getSimpleName())) {
            System.out.println("Имя неправильно");
        }
        else this.firstName = firstName;
    }
    public void age(){
        if (getAge()<0||getAge()>110){
            System.out.println("Терс сан берүүгө жана жок жаш берүүгө болбойт!");
        }else this.age = age;
    }
    public void email(){
        if (!email.contains("@")){
            System.out.println("Email не существует!");
        }else this.email=email;
    }
    @Override
    public String toString() {
        return "- - - - - "+firstName+" - - - - -"+
                "\nID: " + id +
                "\nFirst name:" + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age +
                "\nEmail: " + email+
                "\nCity: " + city;
    }
}
