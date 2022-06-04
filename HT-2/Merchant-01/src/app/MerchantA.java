package app;


public class MerchantA extends Merchant implements Bonus {

    String email;

    public MerchantA(String name, String surname, String phone) {
        super(name, surname, phone);
    }


    public String infoMerchant() {
        String name = getName();
        String surname = getSurname();
        String phone = getPhone();
        return "\nMerchant: " + name + ", " + phone + ", " + surname + ", " + email + "\n";
    }

    @Override
    public double calcBonus(double sales) {
        if (sales <= 10000) {
            return sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            return sales * 10 / 100;
        } else {
            return sales * 15 / 100;
        }
    }
}
