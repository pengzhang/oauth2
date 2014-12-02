package cn.mengcms;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.BeforeTransaction;

/**
 * @author zp
 */
@ContextConfiguration(locations = {"classpath:testApplicationContext.xml"})
public abstract class ContextTest extends AbstractTransactionalTestNGSpringContextTests {

    @BeforeTransaction
    public void beforeTest() {

    }
}