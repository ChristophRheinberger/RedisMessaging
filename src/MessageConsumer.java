import redis.clients.jedis.Jedis;
import java.util.List;

public class MessageConsumer
{
    public static void main( String[] args )
    {
        Jedis jedis = new Jedis("localhost", 63790);
        List<String> messages = null;
        while(true){
            System.out.println("Waiting for a message");
            messages = jedis.blpop(0,"queue");
            System.out.println("Got the message");
            System.out.println("KEY:" + messages.get(0) + " VALUE:" + messages.get(1));
            String payload = messages.get(1);
            //Do some processing with the payload
            System.out.println("Message received:" + payload);
        }
    }
}