package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author ：WuChenHui
 * @Date ：Created in 3:15 PM 8/19/2019
 * @Description：datasource
 * @Version: 1.0$
 */

@Configuration
@MapperScan(basePackages = "com.example.demo.mapper.mapper1", sqlSessionFactoryRef = "test1SqlSessionFactory")
public class DataSourceConfig1 {

    @Bean(name = "test1DataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.test1")
    public DataSource getDateSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "test1SqlSessionFactory")
    @Primary
    public SqlSessionFactory test1SqlSessionFactory(@Qualifier("test1DataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                // 设置mybatis的xml所在位置
                new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mybatis1/*.xml"));

        return bean.getObject();
    }
    @Bean("test1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate test1sqlsessiontemplate(
            @Qualifier("test1SqlSessionFactory") SqlSessionFactory sessionfactory) {
        return new SqlSessionTemplate(sessionfactory);
    }
}




