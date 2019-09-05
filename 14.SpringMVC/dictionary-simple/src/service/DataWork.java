package service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

public class DataWork {
       private static Map<String,String> dic = new  HashMap<>();
       static {
           dic.put("hello", "Xin chào");
           dic.put("how", "Thế nào");
           dic.put("book", "Quyển vở");
           dic.put("computer", "Máy tính");

    }
    public static String found(String word){
        String result = dic.get(word);
        if(result != null) {
            return result;
        } else {
            return "not found";
        }
    }
}
