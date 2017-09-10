package cc.anjun.store.webapi;

import cc.anjun.store.domain.DomainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DomainConfig.class})
public class StoreApplication  {
    public static  void main(String[]args){
        SpringApplication.run(StoreApplication.class,args);
    }

}
