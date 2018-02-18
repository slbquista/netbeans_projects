package factory;

/**
 *
 * @author 1516392
 */
public class SilverAccount extends AccountBase {
    // Implied...
    //    public SilverAccount() {
    //        super();
    //    }
        
        
    @Override
    public int addRewardPoints(double amount) {
        rewardPoints += (int) Math.round(amount/silverTAValue);
        return rewardPoints;
    }
    
    //Same method used in all subclasses -> see class AccountBase
    // @Override
    // public int rewardPoints() {
    //     return rewardPoints;
    // }
}
