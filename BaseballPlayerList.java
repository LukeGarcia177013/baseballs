import java.util.ArrayList;
import java.util.List;


public class BaseballPlayerList {
    private List<BaseballPlayer> players = new ArrayList<>();
    public BaseballPlayerList() { players = new ArrayList<BaseballPlayer>();}
    public void add(String name, String team, double battingAverage) {players.add(new BaseballPlayer(name, team, battingAverage));}

    public BaseballPlayer getHighestAvg(String team){
        BaseballPlayer highest = players.get(0);
        for (int i = 1; i < players.size(); i++){
            BaseballPlayer current = players.get(i);
            if(current.getTeam().equals(team)){

                if(current.getBattingAverage() > highest.getBattingAverage()){
                    highest = current;
                }

            }
        }
        return highest;
    }
}