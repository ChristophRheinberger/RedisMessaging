import redis.clients.jedis.Jedis;

public class MessageProducer {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 63790);

        jedis.rpush("queue", "Value 1");
        jedis.rpush("queue", "Value 2");
        jedis.rpush("queue", "Value 3");
    }
}