package com.pratik.springboot.rest.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCacheConfig {
    @Bean
    public Config cacheConfig() {
        Config config = new Config();
        MapConfig mapConfig = new MapConfig();

        mapConfig.setName("product-cache");
        mapConfig.setTimeToLiveSeconds(3000);

        config.setInstanceName("hazelcast-instance");
        config.addMapConfig(mapConfig);


        return config;
    }
}
