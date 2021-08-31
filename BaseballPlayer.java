public class BaseballPlayer {
    private String name;
    private String team;
    private double battingAverage;

    public BaseballPlayer(String name, String team, double battingAverage){
        this.name = name;
        this.team = team;
        this.battingAverage = battingAverage;
    }
    //get methods
    public String getName(){return name;}
    public String getTeam(){return team;}
    public double getBattingAverage(){return battingAverage;}
    //set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }
    //ToString method, definitely not auto done Mr McElrea

    @Override
    public String toString() {
        return "Player name:" + name + ", team: " + team + ", Batting Average" + battingAverage + '.';
    }
}

