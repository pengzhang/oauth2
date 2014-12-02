package cn.mengcms.infrastructure;

import cn.mengcms.ContextTest;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author zp
 */
public abstract class AbstractRepositoryTest extends ContextTest {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    public SqlSessionTemplate sqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public JdbcTemplate jdbcTemplate() {
        return jdbcTemplate;
    }


}