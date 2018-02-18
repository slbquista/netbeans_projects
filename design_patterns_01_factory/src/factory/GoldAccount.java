package factory;

public class GoldAccount extends AccountBase {
   
    @Override
    public int addRewardPoints(double amount) {
        rewardPoints += (int) Math.round(amount/goldTAValue);
        return rewardPoints;
    }
}
