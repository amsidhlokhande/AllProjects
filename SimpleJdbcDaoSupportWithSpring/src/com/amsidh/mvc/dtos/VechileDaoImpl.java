/**
 * 
 */
package com.amsidh.mvc.dtos;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Component;

/**
 * @author amsidhlokhande
 *
 */
@Component
public class VechileDaoImpl extends SimpleJdbcDaoSupport{

	public void getCircleCount()
	{
		String query="SELECT COUNT(*) FROM CIRCLE";
		Integer count=(Integer)getJdbcTemplate().queryForInt(query);
		System.out.println(count);
	}
}
