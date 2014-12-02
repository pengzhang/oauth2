package cn.mengcms.infrastructure.mybatis;

import cn.mengcms.domain.oauth.OauthClientDetails;
import cn.mengcms.domain.oauth.OauthRepository;
import cn.mengcms.infrastructure.AbstractRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;

/**
 * @author zp
 */
public class OauthRepositoryMyBatisTest extends AbstractRepositoryTest {


    @Autowired
    private OauthRepository oauthRepositoryMyBatis;


    @Test
    public void findOauthClientDetails() {
        OauthClientDetails oauthClientDetails = oauthRepositoryMyBatis.findOauthClientDetails("unity-client");
        assertNull(oauthClientDetails);

    }

}