package com.jasdhir.rest.webservices.client;



import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.jasdhir.rest.webservices.user.User;



public class RestClient {
	public static void main(String[] args) {
    //  useForObject();  
    useForEntity();
     // useExchangeAPI();
     }
	
	public static void useExchangeAPI() {
		RestTemplate restTemplate = new RestTemplate();
		 HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	       
	         
	        HttpEntity<String> entity = new HttpEntity<String>(headers);
	         
	        ResponseEntity<User> responseEntity = restTemplate.exchange("http://localhost:8080/jpa/users/10", HttpMethod.GET, entity, User.class);
	        System.out.println(responseEntity.getBody().getName());
	}
	
	public static void useForObject() {
		RestTemplate restTemplate = new RestTemplate();
		User emp=restTemplate.getForObject("http://localhost:8080/jpa/users/10",User.class);
        System.out.println(emp.getName());
        
      //Employee e1=new Employee("jas10Mar","jas10Mar","jas25Feb@jas25Feb.com");

        //  Employee addedEmp= restTemplate.postForObject("http://localhost:9090/api/v1/employees",e1,Employee.class);
		
	}
	public static void useForEntity() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<User> emp=restTemplate.getForEntity("http://localhost:8080/jpa/users/15",User.class);
	       System.out.println(emp.getBody().getName());
		
	}
}
