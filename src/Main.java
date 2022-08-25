import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Asan asan = new Asan(1990,"Asan","Asanov",32,"asan90@gmail.com","Бишкек");
        Uson uson = new Uson(1993,"Uson","Usonov",29,"uson93@gmail.com","Каракол");
        Adyl adyl = new Adyl(1985,"Adyl","Adylov",37,"adyl85@gmail.com","Ош");
        Akyl akyl = new Akyl(1994,"Akyl","Akylov",28,"akyl94@gmail.com","Нарын");
        Ainur ainur = new Ainur(1999,"Ainur","Aidarova",23,"ainur99@gmail.com","Бишкек");

        People[]people={asan,uson,adyl,akyl,ainur};

        Asan[]asans=new Asan[3];
        Uson[]usons=new Uson[3];
        Adyl[]adyls=new Adyl[3];
        Akyl[]akyls=new Akyl[3];
        Ainur[]ainurs= new Ainur[3];

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (People i : people) {
            if (i instanceof Asan){
                asans[a]=(Asan) i;
                a++;
                System.out.println(i);
                asan.work();
                asan.toRelax();
                asan.communication();
                asan.timeTable();
                asan.name();
                asan.age();
                asan.email();
            }
            if (i instanceof Uson){
                usons[b]=(Uson) i;
                b++;
                System.out.println(i);
                i.work();
                i.toRelax();
                i.communication();
                i.timeTable();
                i.name();
                i.age();
                i.email();
            }
            if (i instanceof Adyl){
                adyls[c]=(Adyl) i;
                c++;
                System.out.println(i);
                i.work();
                i.toRelax();
                i.communication();
                i.timeTable();
                i.name();
                i.age();
                i.email();
            }
            if (i instanceof Akyl){
                akyls[d]=(Akyl) i;
                d++;
                System.out.println(i);
                i.work();
                i.toRelax();
                i.communication();
                i.timeTable();
                i.name();
                i.age();
                i.email();
            }
            if (i instanceof Ainur){
                ainurs[e]=(Ainur) i;
                e++;
                System.out.println(i);
                i.work();
                i.toRelax();
                i.communication();
                i.timeTable();
                i.name();
                i.age();
                i.email();
            }
        }
    }

}