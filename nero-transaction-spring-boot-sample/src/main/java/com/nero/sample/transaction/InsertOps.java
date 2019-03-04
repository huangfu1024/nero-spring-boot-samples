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
public class InsertOps {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private InsertErrorOps insertErrorOps;

    @Transactional(propagation = Propagation.REQUIRED )
    public void insertOne() {
        jdbcTemplate.execute("insert into foo (id, bar) values (1, 'aaa');");
        try {
            insertErrorOps.insertWithSameTrans();
        }catch (RuntimeException e){
            throw e;
        }
        jdbcTemplate.execute("insert into foo (id, bar) values (4, 'ddd');");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertTwo() {
        jdbcTemplate.execute("insert into foo (id, bar) values (1, 'aaa');");
        try {
            insertErrorOps.insertWithNewTrans();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        jdbcTemplate.execute("insert into foo (id, bar) values (4, 'ddd');");
    }
}
