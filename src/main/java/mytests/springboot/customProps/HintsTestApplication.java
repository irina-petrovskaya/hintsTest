package mytests.springboot.customProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


@EnableConfigurationProperties
@SpringBootApplication
public class HintsTestApplication implements CommandLineRunner {
    @Bean
    @Profile("prof1")
    MyProps myProps1(){
        return new MyProps();
    }
    @Bean
    @Profile("prof2")
    MyProps myProps2(){
        return new MyProps();
    }
    @Autowired
    MyProps myProps;

    public static void main(String[] args) {
        SpringApplication.run(HintsTestApplication.class, args);
    }

    @Override
    public void run(String... stringsArg) throws Exception {
        System.out.println(myProps.getAnyProviderProp());
    }
}
