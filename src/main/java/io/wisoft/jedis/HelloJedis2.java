package io.wisoft.jedis;

import redis.clients.jedis.Jedis;

public class HelloJedis2 {

  public static void main(final String... args) {
    final Jedis jedis = new Jedis("127.0.0.1", 6379);
    final String result = jedis.set("redisbook", "hello redis!");
    System.out.println(result);
    System.out.println(jedis.get("redisbook"));
  }

}
