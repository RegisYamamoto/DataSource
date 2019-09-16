package com.regis.datasource.config;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = "com.regis.datasource.repository.atrativa", entityManagerFactoryRef = "atrativaEntityManagerFactory", transactionManagerRef = "atrativaTransactionManager")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class })

public class ClienteAtrativaConfig {

	public DataSource atrativaDataSource() {
		DataSource ds = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:jboss/datasources/ClubefatoMobileDS");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		if (ds == null) {
			throw new IllegalArgumentException("No Control Database could be found");
		}
		return ds;
	}

	@Bean
	public PlatformTransactionManager atrativaTransactionManager() {
		EntityManagerFactory factory = atrativaEntityManagerFactory().getObject();
		return new JpaTransactionManager(factory);
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean atrativaEntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setPackagesToScan("com.regis.datasource.model.atrativa");
		factory.setPersistenceUnitName("ClubefatoMobileDS");
		factory.setDataSource(atrativaDataSource());
		factory.setPersistenceProviderClass(org.hibernate.jpa.HibernatePersistenceProvider.class);
		return factory;
	}

}