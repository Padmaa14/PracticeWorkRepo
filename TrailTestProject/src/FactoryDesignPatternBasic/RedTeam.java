package FactoryDesignPatternBasic;

public class RedTeam implements TeamsInterface{

    @Override
    public void instructionsForTeam() {
        System.out.println("1.Red Team wil have Red tie " +
                "2.Red team will lead." +
                "3.Red team will support other teams.");
    }
}
