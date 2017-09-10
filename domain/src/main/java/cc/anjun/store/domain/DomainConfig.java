package cc.anjun.store.domain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cc.anjun.store.domain.mapper")
public class DomainConfig {
}
