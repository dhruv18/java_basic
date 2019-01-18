enum day {
    monday, tusday, wednesday, thursday, friday, saterday;
}

// example 1
class useofenum1 {
    day d = day.monday;

    public void show() {
        System.out.println(d);
    }
}

// second example
class switchcase {
    day d;

    switchcase(day e1) {
        this.d = e1;
    }

    public void dayis() {
        switch (d) {
        case monday:
            System.out.println("monday");
            break;

        default:
            System.out.println("default");
            break;
        }
    }
}

public class Enum_userdefined {
    public static void main(String[] args) {
        useofenum1 e1 = new useofenum1();
        e1.show();
        switchcase e2 = new switchcase(day.valueOf("monday"));
        e2.dayis();
    }
}