package com.nero.sample.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-02-22
 * time : 15:22
 * </p>
 *
 * @author Nero
 */
@Component
public class DemoRunner implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private InsertOps insertOps;

    @Override
    public void run(String... args) {
        System.out.println("REQUIRED级别事务执行前：" + jdbcTemplate.queryForList("select * from foo"));
        try {
            insertOps.insertOne();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("REQUIRED级别事务执行后：" + jdbcTemplate.queryForList("select * from foo"));
        // 清除数据
        jdbcTemplate.execute("delete from foo");
        System.out.println("REQUIRES_NEW级别事务执行前：" + jdbcTemplate.queryForList("select * from foo"));
        try {
            insertOps.insertTwo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("REQUIRES_NEW级别事务执行后：" + jdbcTemplate.queryForList("select * from foo"));

    }
}
