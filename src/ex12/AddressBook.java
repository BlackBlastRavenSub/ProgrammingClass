package ex12;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Address> addressBookArrayList;

    public AddressBook() {
        addressBookArrayList = new ArrayList<>();
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        System.out.println("一覧の表示。");
        book.showAddress();
        System.out.println("新規データの追加。");
        book.add(new Address("小野", "栃木", "123-45-6789", "ono@tochigi"));
        book.add(new Address("Abe", "Saitama", "090-1234-5678", "abe@saitama"));
        book.add(new Address("スコット", "Okinawa", "0987-65-4321", "scott@okinawa"));
        book.add(new Address("Sasaki", "Osaka", "06-7890-1234", "sasaki@osaka"));
        System.out.println("一覧の表示。");
        book.showAddress();
    }

    public void add(Address address) {
        addressBookArrayList.add(address);
    }

    public void showAddress() {
        for (Address address:addressBookArrayList) {
            System.out.println(address.toString());
        }
    }

    public void open(String filename) {
    }

    public void save(String filename) {
    }
}
