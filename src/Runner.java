public class Runner {

    protected String zName;
    protected String zBirthday;
    protected int zMaxMoney;
    protected int zMoneyPerRound;
    protected int zRound;

    public Runner(String pName, String pBirthday, int pMaxMoney, int pMoneyPerRound) {
        zName = pName;
        zBirthday = pBirthday;
        zMaxMoney = pMaxMoney;
        zMoneyPerRound = pMoneyPerRound;
        this.getRunnerData();
    }

    public String getName() {
        return zName;
    }

    public String getBirthday() {
        return zBirthday;
    }

    public int getMaxMoney() {
        return zMaxMoney;
    }

    public int getMoneyPerRound() {
        return zMoneyPerRound;
    }

    public int getRound() {
        return zRound;
    }

    public int getMoney() {
        return Math.min(zRound * zMoneyPerRound, zMaxMoney);
    }

    public void run(int pRound) {
        zRound = zRound + pRound;
    }

    public void getRunnerData() {
        System.out.println("\nName: " + this.getName());
        System.out.println("Birthday: " + this.getBirthday());
        System.out.println("MaxMoney: " + this.getMaxMoney());
        System.out.println("MoneyPerRound: " + this.getMoneyPerRound());
        System.out.println("CompleteMoney: " + this.getMoney());
        System.out.println("Rounds: " + this.getRound()+ "\n");
    }
}
