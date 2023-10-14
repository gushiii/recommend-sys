package com.gushiii.recommend.common;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.common
 * @className : CommonUtil
 * @description : TODO
 * @date : 2023/10/14 13:04
 */
public class CommonUtil {

    public static String processErrorString(BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            stringBuilder.append(fieldError.getDefaultMessage() + ",");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

}
