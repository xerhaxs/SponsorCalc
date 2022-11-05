import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RunnerList {

    HashMap<String, Runner> RunnerList = new HashMap<>();

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

    public TreeMap<String, Runner> getBestRunner() {
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
        System.out.println(BestRunnerList);
        return BestRunnerList;
    }

//    public void getCompleteRunner() {
//        for int pLoop
//        RunnerList.keySet()
//    }
}
