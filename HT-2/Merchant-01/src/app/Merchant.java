package app;

// Модель объекта Продавца.
public class Merchant {

    private final String name;
    private final String phone;
    private final String surname;

    public Merchant(String name,String surname, String phone) {
        this.name = name;
        this.phone = phone;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


}
