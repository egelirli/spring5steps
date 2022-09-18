package com.egelirli.spring.in28minutes.spring5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PersonDAO {
	
	@Autowired
	JdbcConnecion jdbcConnection;

	public JdbcConnecion getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnecion jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
