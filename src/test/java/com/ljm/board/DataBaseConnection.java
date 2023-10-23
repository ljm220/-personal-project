package com.ljm.board;

import javax.sql.DataSource;
import java.sql.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataBaseConnection {
   @Autowired
   DataSource dataSource;   //root에있는 datasoruce 가져온거
   
   @Test
   public void test1() {
         log.info("#dataSource: " + dataSource);
            try {
               Connection con = dataSource.getConnection();
               log.info("#연결성공: " + con);
            }catch(SQLException se) {
               log.info("#연결실패: " + se);
            }
   }
}
