package factory;

public class PlatinumAccount extends AccountBase {
   
    @Override
    public int addRewardPoints(double amount) {
        rewardPoints += (int) Math.round(amount/platinumTAValue);
        return rewardPoints;
    }
}
