package TryOuts;

class User {
    private int id;
    private String username;
    private String email;
    private double walletBalance;

    public User(int id, String username, String email, double walletBalance) {
        setId(id);
        setEmail(email);
        setUsername(username);
        setWalletBalance(walletBalance);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public boolean makePayment(double billAmount) {
        if (getWalletBalance() < billAmount || billAmount < 0) {
            return false;
        } else {
            setWalletBalance(getWalletBalance() - billAmount);
            return true;
        }
    }

}

class KYCUser extends User {
    private int rewardPoints;

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public KYCUser(int id, String username, String email, double walletBalance) {
        super(id, username, email, walletBalance);
    }

    @Override
    public boolean makePayment(double billAmount) {
        boolean status = super.makePayment(billAmount);

        if (status) {
            setRewardPoints(getRewardPoints() + (int) (billAmount * 0.1));
        }

        return status;
    }
}

class EPayWallet {

    public static void processPaymentByUser(User user, double billAmount) {
        boolean status = user.makePayment(billAmount);
        if (status)
            System.out.println("E-Transaction Success");
        else
            System.out.println("E-Transaction Failed");
        System.out.println("E-Wallet Balance is :" + user.getWalletBalance());
        if (user instanceof KYCUser) {
            KYCUser kycuser = (KYCUser) user;
            System.out.println("E-Reward Points :" + kycuser.getRewardPoints());
        }

    }

}

public class Assignment5 {

    public static void main(String agrs[]) {
        User U1 = new User(101, "Jack", "pvamsikri2003@gmail.com", 1000);
        // System.out.println(U1.getWalletBalance());
        // System.out.println("Transaction:" + U1.makePayment(400));
        // System.out.println(U1.getWalletBalance());
        // System.out.println("Transaction:" + U1.makePayment(-201));
        // System.out.println(U1.getWalletBalance());

        KYCUser U2 = new KYCUser(201, "Harish", "email.harishhari@gmail.com", 3000);
        // System.out.println(U2.getWalletBalance());
        // System.out.println("Transaction of 500 is :" + U2.makePayment(500));
        // System.out.println(U2.getWalletBalance());
        // System.out.println(U2.getRewardPoints());
        // System.out.println("Transaction of 400 is :" + U2.makePayment(400));
        // System.out.println(U2.getWalletBalance());
        // System.out.println(U2.getRewardPoints());

        EPayWallet.processPaymentByUser(U1, 700);
        EPayWallet.processPaymentByUser(U2, 1500);
        EPayWallet.processPaymentByUser(U2, 800);
        EPayWallet.processPaymentByUser(U2, 1200);
    }
}