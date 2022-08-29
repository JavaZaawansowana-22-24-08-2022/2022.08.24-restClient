package pl.szkolenia.comarch.rest.client;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        /*String url = "http://localhost:8080/user?login=admin";

        User user = restTemplate.getForObject(url, User.class);

        System.out.println(user.getId());
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());*/

        /***********************/

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("header1", "value1");


        HttpEntity request = new HttpEntity(null, new HttpHeaders());
        String url = "http://localhost:8080/user?login=admin";
        ResponseEntity<User> response = restTemplate.exchange(url, HttpMethod.GET, request, User.class);

        if(response.getStatusCode() == HttpStatus.OK) {

        }

        User user = response.getBody();
        System.out.println(user.getId());
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());

        response.getHeaders();
    }
}
