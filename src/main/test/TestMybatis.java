import com.alibaba.fastjson.JSON;
import com.xbp.springmybatis.entity.UserEntity;
import com.xbp.springmybatis.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:13
 */


public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    private ApplicationContext ac = null;

    @Resource
    private UserService userService;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService) ac.getBean("userService");
    }

    @Test
    public void test1() {
        UserEntity user = userService.getUserById(1);
        System.out.println(user.getUserName());
        logger.info("值：" + user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}