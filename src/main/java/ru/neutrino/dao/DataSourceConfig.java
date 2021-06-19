package ru.neutrino.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:/datasource.properties")
public class DataSourceConfig {

        @Value("${data.url}")
        private String url;

        @Value("${data.username}")
        private String username;

        @Value("${data.password}")
        private String password;

        @Value("${data.driver}")
        private String driver;

        @Bean
        public DataSource dataSource() {

            DriverManagerDataSource dataSource = new DriverManagerDataSource();

            dataSource.setDriverClassName(driver);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;
        }

    }

