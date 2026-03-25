import java.util.ArrayList;

class xyInfo {
    int x;
    int y;
}

class xyManager {
    ArrayList<xyInfo> arr = new ArrayList<>();

    void add(xyInfo data) {
        arr.add(data);
    }

    void drawButton() {
        for (xyInfo o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        xyManager manager = new xyManager();
        xyInfo info1 = new xyInfo();
        info1.x = 3;
        info1.y = 7;

        xyInfo info2 = new xyInfo();
        info2.x = 10;
        info2.y = 5;

        xyInfo info3 = new xyInfo();
        info3.x = 2;
        info3.y = 1;

        manager.add(info1);
        manager.add(info2);
        manager.add(info3);

        manager.drawButton();
    }
}
