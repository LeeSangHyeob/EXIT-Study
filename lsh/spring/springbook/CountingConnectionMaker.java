package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {
	
	int cnt = 0;
	private ConnectionMaker realConnectionMaker;
	
	public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
		this.realConnectionMaker = realConnectionMaker;
	}
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		this.cnt++;
		return realConnectionMaker.makeConnection();
	}
	
	public int getCnt() {
		return this.cnt;
	}
}