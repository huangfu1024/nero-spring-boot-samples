package com.nero.sample.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * date : 2019-02-22
 * time : 14:53
 * </p>
 *
 * @author Nero
 */
@Component
public class InsertErrorOps {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertWithSameTrans() {
        jdbcTemplate.execute("insert into foo (id, bar) values (2, 'bbb');");
        jdbcTemplate.execute("insert into foo (id, bar) values (3, 'ccccc');");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertWithNewTrans() {
        jdbcTemplate.execute("insert into foo (id, bar) values (2, 'bbb');");
        jdbcTemplate.execute("insert into foo (id, bar) values (3, 'ccccc');");
    }
}
