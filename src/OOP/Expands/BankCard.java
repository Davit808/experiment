package OOP.Expands;

public class BankCard {
    private Person infoOfUser;
    private int accountNumber;
    private String expirationYear;
    private int sumOfAccount = 1000000;
    private int onlinePayment;
    private static int sumAllAccount = 1; // 0000.0000.0000.0001 ... I will receive it in this form tomorrow :D

    BankCard(Person infoOfUser, int mount, int year) {
        this.infoOfUser = infoOfUser;
        if ((mount > 0 || mount < 13) && (year > 2023 || year < 2030)) {
            expirationYear = String.valueOf(mount) + "/" + String.valueOf(year);
        } else {
            System.out.println("It's a bad data for card");
            System.exit(1);
        }
        accountNumber = sumAllAccount++;
    }

    public void setInputOfAccount(int inputOfAccount) {
        if (inputOfAccount + sumOfAccount <= 1000000) {
            this.sumOfAccount += inputOfAccount;
        } else {
            System.out.println("You can't have that count sum for your account");
        }
    }

    public void setExitSum(int sum) {
        if (sum > sumOfAccount) {
            System.out.println("bbb You don't have that count sum for your balance");
        } else if (sum <= 0) {
            System.out.println("it's a bad data tape");
        } else {
            sumOfAccount -= sum;
        }
    }

    public void setOnlinePayment(int onlinePayment) {
        if (onlinePayment > sumOfAccount) {
            System.out.println("Your balance is " + sumOfAccount + "\nYou don't have that count sum for your balance");
        } else if (onlinePayment <= 0) {
            System.out.println("it's a bad data tape");
        } else {
            sumOfAccount -= onlinePayment;
        }
    }

    public int getSumOfAccount() {
        return sumOfAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Person getInfoOfUser() {
        return infoOfUser;
    }

    public String getExpirationYear() {
        return expirationYear;
    }
}
