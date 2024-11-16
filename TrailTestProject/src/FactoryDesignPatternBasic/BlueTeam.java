package FactoryDesignPatternBasic;

public class BlueTeam implements  TeamsInterface{
    @Override
    public void instructionsForTeam() {
        System.out.println("1.blue Team wil have blue tie " +
                "2.blue team will lead." +
                "3.blue team will support other teams.");
    }
}
