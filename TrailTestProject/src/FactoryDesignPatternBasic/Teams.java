package FactoryDesignPatternBasic;

public class Teams {
    public static void main(String args[]) {
        TeamFactory team=new TeamFactory();
        TeamsInterface myteam=team.getTeamDetails("Red");
        myteam.instructionsForTeam();
    }
}
