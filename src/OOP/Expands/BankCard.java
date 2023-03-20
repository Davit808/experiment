package OOP.Expands;

public class BankCard {
    private Person infoOfUser;
    private int accountNumber;
    private int sumOfAccount;
    private int exitSum;
    private int outputBalance;
    private int inputOfAccount;
    private static int sumAllAccount = 1;

    BankCard(Person infoOfUser, int sumOfAccount) {
        this.infoOfUser = infoOfUser;
        if (sumOfAccount >= 0 || sumOfAccount < 100000000) {
            this.sumOfAccount = sumOfAccount;
        } else if (sumOfAccount > 100000000) {
            System.out.println("This card doesn't have this count sum");
            this.sumOfAccount = 100000000;
        }
        accountNumber = sumAllAccount++;
    }

    public void setExitSum(int sum) {
        if (sum > sumOfAccount) {
            System.out.println("You don't have that count sum for your balance");
            System.exit(1);
        } else if (sum <= 0) {
            System.out.println("it's a bad data tape");
            System.exit(1);
        }
        sumOfAccount -= sum;
    }

    public void setInputOfAccount(int inputOfAccount) {
        if (inputOfAccount + sumOfAccount <= 100000000) {
            this.sumOfAccount += inputOfAccount;
        } else {
            System.out.println("You can't have that count sum for your account");
            System.exit(1);
        }
    }

    public int getSumOfAccount() {
        return sumOfAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
