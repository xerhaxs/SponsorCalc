import java.util.Map;
import java.util.TreeMap;

public class RunnerList {

    TreeMap<String, Runner> RunnerList = new TreeMap<>();

    public RunnerList() {
    }

    public void addRunner(String pName, String pBirthday, int pMaxMoney, int pMoneyPerRound) {
        Runner Runner;
        RunnerList.put(pName + pBirthday, Runner = new Runner(pName, pBirthday, pMaxMoney, pMoneyPerRound));

    }

    public int getRunnerCount() {
        return RunnerList.size();
    }
    public Runner getRunner(String pIdent) {
        return RunnerList.get(pIdent);
    }
    public void delRunner(String pIdent) {
        RunnerList.remove(pIdent);
    }

    public Runner getBestRunner() {
        TreeMap<String, Runner> BestRunnerList = new TreeMap<>();
        for (Map.Entry<String, Runner> entry : RunnerList.entrySet()) {
            if (BestRunnerList.isEmpty()) {
                BestRunnerList.put(entry.getValue().getName() + entry.getValue().getBirthday(), entry.getValue());
            } else if (entry.getValue().getRound() > BestRunnerList.firstEntry().getValue().getRound()) {
                BestRunnerList.clear();
                BestRunnerList.put(entry.getValue().getName() + entry.getValue().getBirthday(), entry.getValue());
            } else if (entry.getValue().getRound() == BestRunnerList.firstEntry().getValue().getRound()) {
                BestRunnerList.put(entry.getValue().getName() + entry.getValue().getBirthday(), entry.getValue());
            }
        }
        //System.out.println(BestRunnerList);
        return BestRunnerList.firstEntry().getValue();
    }

    public TreeMap<String, Runner> getSortedRunnerList() {
        TreeMap<String, Runner> lSortedRunnerList = new TreeMap<>();
        while (!RunnerList.isEmpty()) {
            lSortedRunnerList.put(this.getBestRunner().getName() + this.getBestRunner().getBirthday(), this.getBestRunner());
            RunnerList.remove(this.getBestRunner().getName() + this.getBestRunner().getBirthday(), this.getBestRunner());
        }
        RunnerList = lSortedRunnerList;
        System.out.println(RunnerList);
        return RunnerList;
    }
}
