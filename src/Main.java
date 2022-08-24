import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Asan asan = new Asan(1990,"Asan","Asanov",32,"asan90@gmail.com","Bishkek");
        Uson uson = new Uson(1993,"Uson","Usonov",29,"uson93@gmail.com","Karakol");
        Adyl adyl = new Adyl(1985,"Adyl","Adylov",37,"adyl85@gmail.com","Osh");
        Akyl akyl = new Akyl(1994,"Akyl","Akylov",28,"akyl94@gmail.com","Naryn");
        Ainur ainur = new Ainur(1999,"Ainur","Aidarova",23,"ainur99@gmail.com","Bishkek");

        /*System.out.println("First name: "+asan.getFirstName());
        System.out.println("Last name: "+asan.getLastName());
        System.out.println("Age: "+asan.getAge());
        System.out.println("Email: "+asan.getEmail());
        System.out.println("City: "+asan.getCity());*/


        People[]people={asan,uson,adyl,akyl,ainur};

        Asan[]asans={asan};
        Uson[]usons={uson};
        Adyl[]adyls={adyl};
        Akyl[]akyls={akyl};
        Ainur[]ainurs={ainur};

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (People people1:people) {
            if (people1 instanceof Asan){
                System.out.println("- - - - - ASAN - - - - -");
                System.out.println("First name: "+asan.getFirstName());
                System.out.println("Last name: "+asan.getLastName());
                System.out.println("Age: "+asan.getAge());
                System.out.println("Email: "+asan.getEmail());
                System.out.println("City: "+asan.getCity());
                asan.work();
                asan.toRelax();
                asan.communication();
                asan.timeTable();
                asan.name();
                asan.age();
                asan.email();
                asans[a]=(Asan) people1;
                a++;
                System.out.println();
            }
            if (people1 instanceof Uson) {
                System.out.println("- - - - - USON - - - - -");
                System.out.println("First name: "+asan.getFirstName());
                System.out.println("Last name: "+asan.getLastName());
                System.out.println("Age: "+asan.getAge());
                System.out.println("Email: "+asan.getEmail());
                System.out.println("City: "+asan.getCity());
                uson.work();
                uson.toRelax();
                uson.communication();
                uson.timeTable();
                uson.name();
                uson.age();
                uson.email();
                usons[b] = (Uson) people1;
                b++;
                System.out.println();
            }
            if (people1 instanceof Adyl) {
                System.out.println("- - - - - ADYL - - - - -");
                System.out.println("First name: "+adyl.getFirstName());
                System.out.println("Last name: "+adyl.getLastName());
                System.out.println("Age: "+adyl.getAge());
                System.out.println("Email: "+adyl.getEmail());
                System.out.println("City: "+adyl.getCity());
                adyl.work();
                adyl.toRelax();
                adyl.communication();
                adyl.timeTable();
                adyl.name();
                adyl.age();
                adyl.email();
                adyls[c] = (Adyl) people1;
                c++;
                System.out.println();
            }
            if (people1 instanceof Akyl) {
                System.out.println("- - - - - AKYL - - - - -");
                System.out.println("First name: "+akyl.getFirstName());
                System.out.println("Last name: "+akyl.getLastName());
                System.out.println("Age: "+akyl.getAge());
                System.out.println("Email: "+akyl.getEmail());
                System.out.println("City: "+akyl.getCity());
                akyl.work();
                akyl.toRelax();
                akyl.communication();
                akyl.timeTable();
                akyl.name();
                akyl.age();
                akyl.email();
                akyls[d] = (Akyl) people1;
                d++;
                System.out.println();
            }
            if (people1 instanceof Ainur) {
                System.out.println("- - - - - AINUR - - - - -");
                System.out.println("First name: "+ainur.getFirstName());
                System.out.println("Last name: "+ainur.getLastName());
                System.out.println("Age: "+ainur.getAge());
                System.out.println("Email: "+ainur.getEmail());
                System.out.println("City: "+ainur.getCity());
                ainur.work();
                ainur.toRelax();
                ainur.communication();
                ainur.timeTable();
                ainur.name();
                ainur.age();
                ainur.email();
                ainurs[e] = (Ainur) people1;
                e++;
                System.out.println();
            }
        }

        /*Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        switch (word){
            case "Asan":
                System.out.println("First name "+asan.getFirstName());
                System.out.println("Last name: "+asan.getLastName());
                System.out.println("Age: "+asan.getAge());
                System.out.println("Email: "+asan.getEmail());
                System.out.println("City: "+asan.getCity());
                asan.name();
                asan.age();
                asan.email();
                asan.work();
                asan.toRelax();
                asan.communication();
                asan.timeTable();
                break;
            case "Uson":
                System.out.println("First name "+uson.getFirstName());
                System.out.println("Last name: "+uson.getLastName());
                System.out.println("Age: "+uson.getAge());
                System.out.println("Email: "+uson.getEmail());
                System.out.println("City: "+uson.getCity());
                uson.work();
                uson.toRelax();
                uson.communication();
                uson.timeTable();
                uson.name();
                uson.age();
                uson.email();
                break;
            case "Adyl":
                System.out.println("First name "+adyl.getFirstName());
                System.out.println("Last name: "+adyl.getLastName());
                System.out.println("Age: "+adyl.getAge());
                System.out.println("Email: "+adyl.getEmail());
                System.out.println("City: "+adyl.getCity());
                adyl.work();
                adyl.toRelax();
                adyl.communication();
                adyl.timeTable();
                adyl.name();
                adyl.age();
                adyl.email();
                break;
            case "Akyl":
                System.out.println("First name "+akyl.getFirstName());
                System.out.println("Last name: "+akyl.getLastName());
                System.out.println("Age: "+akyl.getAge());
                System.out.println("Email: "+akyl.getEmail());
                System.out.println("City: "+akyl.getCity());
                akyl.work();
                akyl.toRelax();
                akyl.communication();
                akyl.timeTable();
                akyl.name();
                akyl.age();
                akyl.email();
                break;
            case "Ainur":
                System.out.println("First name "+ainur.getFirstName());
                System.out.println("Last name: "+ainur.getLastName());
                System.out.println("Age: "+ainur.getAge());
                System.out.println("Email: "+ainur.getEmail());
                System.out.println("City: "+ainur.getCity());
                ainur.work();
                ainur.toRelax();
                ainur.communication();
                ainur.timeTable();
                ainur.name();
                ainur.age();
                ainur.email();
                break;
            default:
                System.out.println("INVALID NAME");
        }*/
    }
}