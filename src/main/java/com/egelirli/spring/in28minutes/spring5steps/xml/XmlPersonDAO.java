package com.egelirli.spring.in28minutes.spring5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Component
public class XmlPersonDAO {
	
	//@Autowired
	XmlJdbcConnection jdbcConnection;

	public XmlJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
