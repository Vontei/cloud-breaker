package com.cloudbreaker.Controllers;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;
import com.cloudbreaker.Models.Document;
import com.cloudbreaker.Models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by nickmattei on 10/29/15.
 */

@RestController
public class MainController {

    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String testing(){
        return "Welcome to CloudBreakers Spring Boot";
    }


    @RequestMapping(value="/reverse/{str}",method= RequestMethod.GET)
    public String reverseIt(@PathVariable("str") String str){
        int length = str.length();
        StringBuilder holder = new StringBuilder(length);
        for(int i = (length-1); i>=0; i--){
            holder.append(str.charAt(i));
        }
        return(holder.toString());
    }


    @RequestMapping(value="/user" ,method=RequestMethod.GET)
    public User user(){
        return new User("Nick Mattei", "nick@example.com", 27);
    }


    @RequestMapping(value="/json", method=RequestMethod.GET)
    public String requestData() throws JSONException {

        JSONObject obj = new JSONObject();
        obj.put("Name", "crunchify.com");
        obj.put("Author", "App Shah");

        JSONArray company;
        company = new JSONArray();
        company.put("Compnay: eBay");
        company.put("Compnay: Paypal");
        company.put("Compnay: Google");
        obj.put("Company List", company);
        return obj.toString();

    }

    @RequestMapping(value="/library/{name}", method=RequestMethod.GET)
    public Document getDocuments(@PathVariable("name") String name ){
        String body = "It was the best of times, it was the worst of times.";
        String genre = "Romance";
        String collection = "renaissance";
        Document temp = new Document(name,genre,collection,body);
        return temp;

    }

}
