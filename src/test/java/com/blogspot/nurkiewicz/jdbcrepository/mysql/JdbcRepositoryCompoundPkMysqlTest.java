package com.blogspot.nurkiewicz.jdbcrepository.mysql;

import com.blogspot.nurkiewicz.jdbcrepository.JdbcRepositoryCompoundPkTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static com.blogspot.nurkiewicz.jdbcrepository.mysql.JdbcRepositoryTestMysqlConfig.MYSQL_PORT;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/9/13, 10:20 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = JdbcRepositoryTestMysqlConfig.class)
public class JdbcRepositoryCompoundPkMysqlTest extends JdbcRepositoryCompoundPkTest {
	public JdbcRepositoryCompoundPkMysqlTest() {
		super(MYSQL_PORT);
	}
}
