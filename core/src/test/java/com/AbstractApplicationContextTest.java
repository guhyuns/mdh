package com;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(locations = {
	"classpath*:/spring/config/context-*.xml"
	//,"classpath*:/webapp/WEB-INF/config/springmvc/egov-*.xml"
})
@Transactional
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class AbstractApplicationContextTest {
}
