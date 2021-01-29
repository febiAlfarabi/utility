package io.github.febialfarabi.utility;

import java9.util.function.Consumer;
import org.apache.commons.lang.StringUtils;

public class PhoneNumberUtil {

    public static final String cleanupIndMobilePhone(String input, Consumer<ValidPhoneNumber> consumer){
        boolean valid = false ;
        if(StringUtils.isEmpty(input)){
            return input;
        }
        if(input.length()<10){
            consumer.accept(new ValidPhoneNumber(valid, input));
            return input;
        }
        if(input.startsWith("00")){
            valid = false ;
            consumer.accept(new ValidPhoneNumber(valid, input));
        }
        if(input.startsWith("0") || input.startsWith("62") || input.startsWith("+62")){
            if(input.startsWith("0")){
                input = input.replaceFirst("0", "+62");
                valid = true ;
                consumer.accept(new ValidPhoneNumber(valid, input));
            }else if(input.startsWith("62")){
                input = input.replaceFirst("62", "+62");
                valid = true ;
                consumer.accept(new ValidPhoneNumber(valid, input));
            }else if(input.startsWith("+62")){
                valid = true ;
                consumer.accept(new ValidPhoneNumber(valid, input));
            }
        }
        consumer.accept(new ValidPhoneNumber(valid, input));
        return input;
    }


    public static class ValidPhoneNumber{
        boolean valid ;
        String phoneNumber;

        public ValidPhoneNumber(){

        }
        public ValidPhoneNumber(boolean valid, String phoneNumber){
            this.valid = valid ;
            this.phoneNumber = phoneNumber ;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

}
