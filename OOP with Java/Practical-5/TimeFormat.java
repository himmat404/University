class Time {
    int hr;
    int min;
    int sec;
    
    Time(){}
    Time(int h, int m, int s) {
        setTime(h, m, s);
    }
    
    Time(int s) {
        int hours = s / 3600;
        int minutes = (s % 3600) / 60;
        int seconds = s % 60;
        setTime(hours, minutes, seconds);
    }
    
    void setTime(int h, int m, int s) {
        if (h < 0 || h > 23) {
            System.out.println("Invalid hour value");
            return;
        }
        if (m < 0 || m > 59) {
            System.out.println("Invalid minute value");
            return;
        }
        if (s < 0 || s > 59) {
            System.out.println("Invalid second value");
            return;
        }
        this.hr = h;
        this.min = m;
        this.sec = s;
    }
    
    void display() {
        System.out.printf("%02d:%02d:%02d\n", this.hr, this.min, this.sec);
    }
}

public class TimeFormat {
    public static void main(String[] args) {

        Time t1 = new Time(5, 15, 30);
        t1.display();
        Time t2 = new Time(60000);
        t2.display();

        Time t3 = new Time(25,30,15);
        
        Time t4 = new Time(15,75,15);
    }
}
