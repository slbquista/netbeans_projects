package hosts;

import db_connection.NetworkDevices;
import java.sql.SQLException;

/**
 * @author 1516392
 */

public class Host {
    NetworkDevices nd;

    public Host()  throws ClassNotFoundException, SQLException {
        this.nd = new NetworkDevices();
    }
}
