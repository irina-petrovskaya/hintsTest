package mytests.springboot.customProps;

import mytests.springboot.customProps.utils.MyBean1;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/27/2015.
 * Project: hintsTest
 * *******************************
 */
@ConfigurationProperties("mycustomprops")
public class MyProps {

    String plain_hintProp;
    Map<String,String> hintForMapProp;
    String anyProviderProp;
    String classRefProp;
    String handleAsEnumProp;
    String handleAsResProp;
    String handleAsLocaleProp;
    String handleAsCharsetProp;
    String handleAsMimetypeProp;
    Map<String,String> loggerProviderProp;
    String beanProviderProp;
    String profileProviderProp;

    MyBean1 myBean1Prop;

    public MyBean1 getMyBean1Prop() {
        return myBean1Prop;
    }

    public void setMyBean1Prop(MyBean1 myBean1Prop) {
        this.myBean1Prop = myBean1Prop;
    }

    public String getPlain_hintProp() {
        return plain_hintProp;
    }

    public void setPlain_hintProp(String plain_hintPropArg) {
        plain_hintProp = plain_hintPropArg;
    }

    public Map<String, String> getHintForMapProp() {
        return hintForMapProp;
    }

    public void setHintForMapProp(Map<String, String> hintForMapPropArg) {
        hintForMapProp = hintForMapPropArg;
    }

    public String getAnyProviderProp() {
        return anyProviderProp;
    }

    public void setAnyProviderProp(String anyProviderPropArg) {
        anyProviderProp = anyProviderPropArg;
    }

    public String getClassRefProp() {
        return classRefProp;
    }

    public void setClassRefProp(String classRefPropArg) {
        classRefProp = classRefPropArg;
    }

    public String getHandleAsEnumProp() {
        return handleAsEnumProp;
    }

    public void setHandleAsEnumProp(String handleAsEnumPropArg) {
        handleAsEnumProp = handleAsEnumPropArg;
    }

    public String getHandleAsResProp() {
        return handleAsResProp;
    }

    public void setHandleAsResProp(String handleAsResPropArg) {
        handleAsResProp = handleAsResPropArg;
    }

    public String getHandleAsLocaleProp() {
        return handleAsLocaleProp;
    }

    public void setHandleAsLocaleProp(String handleAsLocalePropArg) {
        handleAsLocaleProp = handleAsLocalePropArg;
    }

    public String getHandleAsCharsetProp() {
        return handleAsCharsetProp;
    }

    public void setHandleAsCharsetProp(String handleAsCharsetPropArg) {
        handleAsCharsetProp = handleAsCharsetPropArg;
    }

    public String getHandleAsMimetypeProp() {
        return handleAsMimetypeProp;
    }

    public void setHandleAsMimetypeProp(String handleAsMimetypePropArg) {
        handleAsMimetypeProp = handleAsMimetypePropArg;
    }

    public Map<String, String> getLoggerProviderProp() {
        return loggerProviderProp;
    }

    public void setLoggerProviderProp(Map<String, String> loggerProviderPropArg) {
        loggerProviderProp = loggerProviderPropArg;
    }

    public String getBeanProviderProp() {
        return beanProviderProp;
    }

    public void setBeanProviderProp(String beanProviderPropArg) {
        beanProviderProp = beanProviderPropArg;
    }

    public String getProfileProviderProp() {
        return profileProviderProp;
    }

    public void setProfileProviderProp(String profileProviderPropArg) {
        profileProviderProp = profileProviderPropArg;
    }
}
