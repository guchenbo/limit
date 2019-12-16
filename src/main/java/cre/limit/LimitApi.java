package cre.limit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author guchenbo
 * @Date 2019/7/15.
 */
@RestController
@RequestMapping(value = "/limit")
public class LimitApi implements ApplicationContextAware {

    protected static final Logger log = LoggerFactory.getLogger(LimitApi.class);

    private ApplicationContext context;

//    @Resource
//    private RateLimiter rateLimiter;
//
////    @Autowired
////    @Qualifier(value = "car1")
//    @Resource
//    private Car car1;
//    @Autowired
    private Car car2;


    @RequestMapping(value = "/get")
    public String get(){
        log.info("here");
        context.getBean("rateLimiter");
        return "0";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Resource
    @Qualifier("car2")
    public void setCar23(Car car) {
        this.car2 = car;
    }
}
