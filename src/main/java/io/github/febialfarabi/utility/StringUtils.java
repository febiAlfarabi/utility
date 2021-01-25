package io.github.febialfarabi.utility;

public class StringUtils {

    public static final String[] firtlastname(String fullname){
        String[] firstnameLastname = {"", ""};
        if(fullname.contains(" ")){
            firstnameLastname[0] = fullname.split(" ")[0];
            firstnameLastname[1] = fullname.split(" ", 2)[1];
        }else{
            firstnameLastname[0] = fullname ;
        }
        return firstnameLastname ;
    }

    public static final boolean oneOf(String in, String... matchers){
        boolean match = false ;
        if(matchers==null){
            return match;
        }
        for (String matcher : matchers) {
            if(in.equalsIgnoreCase(matcher)){
                match = true ;
                break;
            }
        }
        return match;

    }


}
