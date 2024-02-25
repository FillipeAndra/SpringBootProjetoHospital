package unidade.hospital.api.BancoDeDados;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {
        @Bean
        public DataSource getDataSource() {
            return DataSourceBuilder.create()
              .driverClassName("com.mysql.cj.jdbc.Driver")
              .url("jdbc:mysql://localhost:3306/hospital")
              .username("fillipe")
              .password("S3nha1234")
              .build();	
        }
    }


