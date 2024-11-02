package view;

import java.util.Scanner;

import java.util.ArrayList;

public abstract class AutoMenu {

    protected String title;// tiêu de cua menu
    protected ArrayList<String> mChon;// danh sach cac chuc nang

    public AutoMenu() {
    }

    public AutoMenu(String td, String[] mc) {
        title = td;
        mChon = new ArrayList<>();
        for (String s : mc) {
            mChon.add(s);
        }
    }
//-------------------------------------------

    public void display() {// hien thi danh sach cac chuc nang cua Menu
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + "." + mChon.get(i));
        }
        System.out.println("--------------------------------");
    }
//-------------------------------------------

    public int getSelected() {// doc lua chon nguoi dung
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter selection: ");
        return sc.nextInt();
    }
//-------------------------------------------

    public abstract void execute(int n);//thi hanh menu
//-------------------------------------------

    public void run() {
        boolean continueRunning = true;  // Cờ kiểm soát vòng lặp
        while (continueRunning) {
            int n = getSelected();
            execute(n);  // Gọi phương thức execute để thực hiện hành động

            // Kiểm tra xem lựa chọn của người dùng có vượt quá số lượng lựa chọn hay không
            if (n == mChon.size() || n == 0) {
                continueRunning = false;  // Thoát khỏi vòng lặp
            }
        }
    }
//-------------------------------------------      
}