import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        ArrayList<book> bk = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("使用者好" + "\n" + "1--新增書籍" + "\n" + "2--查詢書籍" + "\n" + "3---查看數量" + "\n" + "4--離開");
            int a = scn.nextInt();
            switch (a) {
                case 1:
                    System.out.println("書名:");
                    String name = scn.next();
                    System.out.println("作者:");
                    String author = scn.next();
                    System.out.println("出版社:");
                    String publisher = scn.next();
                    System.out.println("ISBN:");
                    String isbn = scn.next();
                    System.out.println("價格:");
                    int price = scn.nextInt();
                    book b = new book(name, author, publisher, isbn, price);
                    bk.add(b);

                    break;
                case 2:
                    System.out.println("用書名查詢--1");
                    System.out.println("用作者查詢--2");
                    System.out.println("用出版社查詢--3");
                    System.out.println("用ISBN查詢--4");
                    System.out.println("用價格查詢--5");
                    int choice = scn.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("請輸入名稱");
                            String name2 = scn.next();
                            for (int i = 0; i < bk.size(); i++) {
                                if (bk.get(i).getName().equals(name2)) {
                                    System.out.println("書名:" + bk.get(i).getName());
                                    System.out.println("作者:" + bk.get(i).getAuthor());
                                    System.out.println("出版社:" + bk.get(i).getPublisher());
                                    System.out.println("ISBN:" + bk.get(i).getIsbn());
                                    System.out.println("價格:" + bk.get(i).getPrice());
                                }
                            }
                            break;
                        case 2:
                            System.out.println("請輸入作者");
                            String author2 = scn.next();
                            for (int i = 0; i < bk.size(); i++) {
                                if (bk.get(i).getName().equals(author2)) {
                                    System.out.println("書名:" + bk.get(i).getName());
                                    System.out.println("作者:" + bk.get(i).getAuthor());
                                    System.out.println("出版社:" + bk.get(i).getPublisher());
                                    System.out.println("ISBN:" + bk.get(i).getIsbn());
                                    System.out.println("價格:" + bk.get(i).getPrice());
                                }
                            }
                            break;
                        case 3:
                            System.out.println("請輸入出版社");
                            String publisher2 = scn.next();
                            for (int i = 0; i < bk.size(); i++) {
                                if (bk.get(i).getName().equals(publisher2)) {
                                    System.out.println("書名:" + bk.get(i).getName());
                                    System.out.println("作者:" + bk.get(i).getAuthor());
                                    System.out.println("出版社:" + bk.get(i).getPublisher());
                                    System.out.println("ISBN:" + bk.get(i).getIsbn());
                                    System.out.println("價格:" + bk.get(i).getPrice());
                                }
                            }
                            break;
                        case 4:
                            System.out.println("請輸入ISBN");
                            String isbn2 = scn.next();
                            for (int i = 0; i < bk.size(); i++) {
                                if (bk.get(i).getName().equals(isbn2)) {
                                    System.out.println("書名:" + bk.get(i).getName());
                                    System.out.println("作者:" + bk.get(i).getAuthor());
                                    System.out.println("出版社:" + bk.get(i).getPublisher());
                                    System.out.println("ISBN:" + bk.get(i).getIsbn());
                                    System.out.println("價格:" + bk.get(i).getPrice());
                                }
                            }
                            break;
                        case 5:
                            System.out.println("請輸入價格");
                            String price2 = scn.next();
                            for (int i = 0; i < bk.size(); i++) {
                                if (bk.get(i).getName().equals(price2)) {
                                    System.out.println("書名:" + bk.get(i).getName());
                                    System.out.println("作者:" + bk.get(i).getAuthor());
                                    System.out.println("出版社:" + bk.get(i).getPublisher());
                                    System.out.println("ISBN:" + bk.get(i).getIsbn());
                                    System.out.println("價格:" + bk.get(i).getPrice());
                                }
                            }
                            break;
                    }
                    break;
                case 3:

                    System.out.println(bk.size() + "本");
                    break;
                case 4:
                    flag = false;
                    System.out.println("88");
                    break;
            }


        }

}}
