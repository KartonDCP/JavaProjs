import com.KartonDCP.Server.MobileSever.SSLMobileServer;
import com.KartonDCP.Server.MobileSever.Server;
import com.KartonDCP.Server.MobileSever.TcpMobileServer;


public class Main {
    public static void main(final String[] args) throws Exception {
        Server server = new TcpMobileServer();
        server.startServing();
    }
}