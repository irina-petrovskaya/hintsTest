package mytests.springboot.customProps.utils;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/27/2015.
 * Project: hintsTest
 * *******************************
 */
@Component
@Profile("prof2")
public class BeanService1_2 implements BeanService1 {
}
