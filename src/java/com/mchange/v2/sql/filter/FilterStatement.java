/*
 * This class generated by com.mchange.v2.codegen.intfc.DelegatorGenerator
 * Thu Mar 07 08:36:33 UTC 2013
 * DO NOT HAND EDIT!!!!
 */
package com.mchange.v2.sql.filter;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/**
 * This class was generated by com.mchange.v2.codegen.intfc.DelegatorGenerator.
 */
public abstract class FilterStatement implements Statement
{
	protected Statement inner;
	
	
	private void __setInner( Statement inner )
	{
		this.inner = inner;
	}
	
	public FilterStatement(Statement inner)
	{ __setInner( inner ); }
	
	public FilterStatement()
	{}
	
	public void setInner( Statement inner )
	{ __setInner( inner ); }
	
	public Statement getInner()
	{ return inner; }
	
	public boolean execute(String a, int b) throws SQLException
	{
		return inner.execute(a, b);
	}
	
	public boolean execute(String a, String[] b) throws SQLException
	{
		return inner.execute(a, b);
	}
	
	public boolean execute(String a) throws SQLException
	{
		return inner.execute(a);
	}
	
	public boolean execute(String a, int[] b) throws SQLException
	{
		return inner.execute(a, b);
	}
	
	public void clearWarnings() throws SQLException
	{
		inner.clearWarnings();
	}
	
	public SQLWarning getWarnings() throws SQLException
	{
		return inner.getWarnings();
	}
	
	public boolean isClosed() throws SQLException
	{
		return inner.isClosed();
	}
	
	public int getFetchDirection() throws SQLException
	{
		return inner.getFetchDirection();
	}
	
	public int getFetchSize() throws SQLException
	{
		return inner.getFetchSize();
	}
	
	public void setFetchDirection(int a) throws SQLException
	{
		inner.setFetchDirection(a);
	}
	
	public void setFetchSize(int a) throws SQLException
	{
		inner.setFetchSize(a);
	}
	
	public Connection getConnection() throws SQLException
	{
		return inner.getConnection();
	}
	
	public int getResultSetHoldability() throws SQLException
	{
		return inner.getResultSetHoldability();
	}
	
	public void addBatch(String a) throws SQLException
	{
		inner.addBatch(a);
	}
	
	public void cancel() throws SQLException
	{
		inner.cancel();
	}
	
	public void clearBatch() throws SQLException
	{
		inner.clearBatch();
	}
	
	public void closeOnCompletion() throws SQLException
	{
		inner.closeOnCompletion();
	}
	
	public int[] executeBatch() throws SQLException
	{
		return inner.executeBatch();
	}
	
	public ResultSet executeQuery(String a) throws SQLException
	{
		return inner.executeQuery(a);
	}
	
	public int executeUpdate(String a, int[] b) throws SQLException
	{
		return inner.executeUpdate(a, b);
	}
	
	public int executeUpdate(String a, String[] b) throws SQLException
	{
		return inner.executeUpdate(a, b);
	}
	
	public int executeUpdate(String a) throws SQLException
	{
		return inner.executeUpdate(a);
	}
	
	public int executeUpdate(String a, int b) throws SQLException
	{
		return inner.executeUpdate(a, b);
	}
	
	public ResultSet getGeneratedKeys() throws SQLException
	{
		return inner.getGeneratedKeys();
	}
	
	public int getMaxFieldSize() throws SQLException
	{
		return inner.getMaxFieldSize();
	}
	
	public int getMaxRows() throws SQLException
	{
		return inner.getMaxRows();
	}
	
	public boolean getMoreResults() throws SQLException
	{
		return inner.getMoreResults();
	}
	
	public boolean getMoreResults(int a) throws SQLException
	{
		return inner.getMoreResults(a);
	}
	
	public int getQueryTimeout() throws SQLException
	{
		return inner.getQueryTimeout();
	}
	
	public ResultSet getResultSet() throws SQLException
	{
		return inner.getResultSet();
	}
	
	public int getResultSetConcurrency() throws SQLException
	{
		return inner.getResultSetConcurrency();
	}
	
	public int getResultSetType() throws SQLException
	{
		return inner.getResultSetType();
	}
	
	public int getUpdateCount() throws SQLException
	{
		return inner.getUpdateCount();
	}
	
	public boolean isCloseOnCompletion() throws SQLException
	{
		return inner.isCloseOnCompletion();
	}
	
	public boolean isPoolable() throws SQLException
	{
		return inner.isPoolable();
	}
	
	public void setCursorName(String a) throws SQLException
	{
		inner.setCursorName(a);
	}
	
	public void setEscapeProcessing(boolean a) throws SQLException
	{
		inner.setEscapeProcessing(a);
	}
	
	public void setMaxFieldSize(int a) throws SQLException
	{
		inner.setMaxFieldSize(a);
	}
	
	public void setMaxRows(int a) throws SQLException
	{
		inner.setMaxRows(a);
	}
	
	public void setPoolable(boolean a) throws SQLException
	{
		inner.setPoolable(a);
	}
	
	public void setQueryTimeout(int a) throws SQLException
	{
		inner.setQueryTimeout(a);
	}
	
	public void close() throws SQLException
	{
		inner.close();
	}
	
	public boolean isWrapperFor(Class a) throws SQLException
	{
		return inner.isWrapperFor(a);
	}
	
	public Object unwrap(Class a) throws SQLException
	{
		return inner.unwrap(a);
	}
	
}
