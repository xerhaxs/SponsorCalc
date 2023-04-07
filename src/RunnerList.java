import java.util.ArrayList;
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
    //public TreeMap<String, Runner> getLeadingRunner() {
   //     return RunnerList.firstEntry().getValue().getName() + RunnerList.firstEntry().getValue().getBirthday(), RunnerList.firstEntry().getValue());
  //  }

    public void delRunner(String pIdent) {
        RunnerList.remove(pIdent);
    }

    public TreeMap<String, Runner> getFirstRunner() {
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
        //System.out.println(BestRunnerList); .firstEntry().getValue();
        return BestRunnerList;
    }

    public TreeMap<String, Runner> getSortedRunnerListSelection() {
        TreeMap<String, Runner> lSortedRunnerList = new TreeMap<>();
        while (!RunnerList.isEmpty()) {
            lSortedRunnerList.put(this.getFirstRunner().firstEntry().getValue().getName() + this.getFirstRunner().firstEntry().getValue().getBirthday(), this.getFirstRunner().firstEntry().getValue());
            RunnerList.remove(this.getFirstRunner().firstEntry().getValue().getName() + this.getFirstRunner().firstEntry().getValue().getBirthday(), this.getFirstRunner().firstEntry().getValue());
        }
        RunnerList = lSortedRunnerList;
        System.out.println(RunnerList);
        return RunnerList;
    }



    public TreeMap<String, Runner> getSortedRunnerListMagic(TreeMap <String, Runner> lSortedRunnerList) {
        TreeMap<String, Runner> lSortedRunnerListMagicSmaller = new TreeMap<>();
        TreeMap<String, Runner> lSortedRunnerListMagicLager = new TreeMap<>();
        TreeMap<String, Runner> lSortedRunnerListMagicFirst = new TreeMap<>();
        TreeMap<String, Runner> lSortedRunnerListMagic = new TreeMap<>();
        lSortedRunnerListMagic = RunnerList;
        lSortedRunnerListMagicFirst.put(lSortedRunnerListMagic.firstEntry().getValue().getName() + lSortedRunnerListMagic.firstEntry().getValue().getBirthday(), lSortedRunnerListMagic.firstEntry().getValue());
        if (lSortedRunnerListMagic.size() > 3) {
            if (lSortedRunnerListMagic.firstEntry().getValue().getRound() >= lSortedRunnerListMagicFirst.firstEntry().getValue().getRound()) {
                lSortedRunnerListMagicLager.put(lSortedRunnerListMagic.firstEntry().getValue().getName() + lSortedRunnerListMagic.firstEntry().getValue().getBirthday(), lSortedRunnerListMagic.firstEntry().getValue());
            } else if (lSortedRunnerListMagic.firstEntry().getValue().getRound() < lSortedRunnerListMagicFirst.firstEntry().getValue().getRound()) {
                lSortedRunnerListMagicSmaller.put(lSortedRunnerListMagic.firstEntry().getValue().getName() + lSortedRunnerListMagic.firstEntry().getValue().getBirthday(), lSortedRunnerListMagic.firstEntry().getValue());
            }
            lSortedRunnerListMagic.remove(lSortedRunnerListMagic.firstEntry());
            this.getSortedRunnerListMagic()
        }
        RunnerList = lSortedRunnerListMagic;
        return RunnerList;
    }

    public TreeMap<String, Runner> getSortedRunnerListInsert() {
        TreeMap<String, Runner> lgetRunnerList = new TreeMap<String, Runner>();
        lgetRunnerList.firstEntry();
        while (!RunnerList.isEmpty()) {
            if (lgetRunnerList.isEmpty()) {
                lgetRunnerList.put(RunnerList.firstEntry().getValue().getName() + RunnerList.firstEntry().getValue().getBirthday(), RunnerList.firstEntry().getValue());
                RunnerList.remove(RunnerList.firstEntry().getValue().getName() + RunnerList.firstEntry().getValue().getBirthday(), RunnerList.firstEntry().getValue());
            } else if (lgetRunnerList.higherKey(lgetRunnerList.fir) {

                }
            } else {

            }
        }
        return lgetRunnerList;
    }

    public String getRunnerNames() {
        TreeMap<String, Runner> lgetRunnerList = new TreeMap<>();
        lgetRunnerList = RunnerList;
        String lRunnerNames = null;
        while (!lgetRunnerList.isEmpty()) {
            if (lRunnerNames == null) {
                lRunnerNames = lgetRunnerList.firstEntry().getValue().getName();
            } else {
                lRunnerNames = lRunnerNames + "\n" + lgetRunnerList.firstEntry().getValue().getName();
            }
            lgetRunnerList.remove(lgetRunnerList.firstEntry().getValue().getName() + lgetRunnerList.firstEntry().getValue().getBirthday(), lgetRunnerList.firstEntry().getValue());
        }
        return  lRunnerNames;
    }
}
