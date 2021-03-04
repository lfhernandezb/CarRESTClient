/**
 * 
 */
package cl.dsoft.car.restclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cl.dsoft.car.data.entities.Comuna;

/**
 * @author lfhernandez
 *
 */
public class ComunaService {
	private final String SERVICE_URL;
	private final String SERVICE_URL_TEMPLATE1;
	private final String SERVICE_URL_TEMPLATE2;
	private final String SERVICE_URL_TEMPLATE3;
	private final String SERVICE_URL_TEMPLATE4;
	private final String SERVICE_URL_TEMPLATE5;
	private final String SERVICE_URL_TEMPLATE6;
	
	private final RestTemplate template;
	private final RestTemplate templateNoErrorHandling;
	
	public ComunaService(String serviceURL, RestTemplate template, 
			RestTemplate templateNoErrorHandling) {
		SERVICE_URL = serviceURL;
		SERVICE_URL_TEMPLATE1 = SERVICE_URL + "{id}";
		SERVICE_URL_TEMPLATE2 = SERVICE_URL + "items?offset={offset}&limit={limit}";
		SERVICE_URL_TEMPLATE3 = SERVICE_URL + "items?offset={offset}&limit={limit}&criteria={criteria}";
		SERVICE_URL_TEMPLATE4 = SERVICE_URL + "items?criteria={criteria}";
		SERVICE_URL_TEMPLATE5 = SERVICE_URL + "count?criteria={criteria}";
		SERVICE_URL_TEMPLATE6 = SERVICE_URL + "count";
		this.template = template;
		this.templateNoErrorHandling = templateNoErrorHandling;
	}
	

	public Comuna getComuna(long id){
		try {
			return template.getForObject(SERVICE_URL_TEMPLATE1, Comuna.class, id);
			
		} catch(Exception e){
			e.printStackTrace(); 
			return null;
		}
	}
	
	public Comuna[] getComunas(int offset, int limit, String criteria){
		try {
			return template.getForObject(SERVICE_URL_TEMPLATE3, Comuna[].class, offset, limit, criteria);
			
		} catch(Exception e){
			e.printStackTrace(); 
			return null;
		}
	}

	public Comuna createComuna(Comuna comuna){
		try {
			return template.postForObject(SERVICE_URL, comuna, Comuna.class);
		
		} catch(Exception e){
			e.printStackTrace(); 
			return null;
		}
	}
	
	public boolean updateComuna(Comuna comuna) {
		try {
			template.put(SERVICE_URL_TEMPLATE1, comuna, comuna.getIdComuna());
			return true;
			
		} catch(Exception e){
			e.printStackTrace(); 
			return false;
		}
	}
	
	public boolean deleteComuna(long id){
		try {
			template.delete(SERVICE_URL_TEMPLATE1, id);
			return true;
			
		} catch(Exception e){
			e.printStackTrace(); 
			return false;
		}
	}
	
	public Comuna createComuna2(Comuna comuna){
		HttpEntity<Comuna> requestEntity = new HttpEntity<Comuna>(comuna);
		ResponseEntity<Object> response = 
			templateNoErrorHandling.exchange(SERVICE_URL, HttpMethod.POST, 
					requestEntity, Object.class);
		if(response.getStatusCode() == HttpStatus.OK){
			return  (Comuna)response.getBody();
		} 
			
		ResultMessage rm = (ResultMessage) response.getBody();
        System.out.println(rm.getMessage()); 
		return null;
	}
	
}
