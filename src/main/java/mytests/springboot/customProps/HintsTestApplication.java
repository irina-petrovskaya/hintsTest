package mytests.springboot.customProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class HintsTestApplication implements CommandLineRunner {
    @Bean
    MyProps myProps(){
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
