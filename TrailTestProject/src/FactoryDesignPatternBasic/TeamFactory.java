package FactoryDesignPatternBasic;

public class TeamFactory {
    public TeamsInterface getTeamDetails(String team){
        if(team.equalsIgnoreCase("blue")){
            return new BlueTeam();
        }else if(team.equalsIgnoreCase("Red")){
            return new RedTeam();
        }
        return null;
    }
}
