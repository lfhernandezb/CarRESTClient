package cl.dsoft.car.restclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cl.dsoft.car.data.entities.Usuario;

public class UsuarioService {
	private final String SERVICE_URL;
	private final String SERVICE_URL_TEMPLATE;
	
	private final RestTemplate template;
	private final RestTemplate templateNoErrorHandling;
	
	public UsuarioService(String serviceURL, RestTemplate template, 
			RestTemplate templateNoErrorHandling) {
		SERVICE_URL = serviceURL;
		SERVICE_URL_TEMPLATE = SERVICE_URL + "{id}";
		this.template = template;
		this.templateNoErrorHandling = templateNoErrorHandling;
	}
	

	public cl.dsoft.car.data.entities.Usuario getUsuario(long id){
		try {
			return template.getForObject(SERVICE_URL_TEMPLATE, cl.dsoft.car.data.entities.Usuario.class, id);
			
		} catch(Exception e){
			e.printStackTrace(); 
			return null;
		}
	}
	
	public Usuario createUsuario(Usuario usuario){
		try {
			return template.postForObject(SERVICE_URL, usuario, Usuario.class);
		
		} catch(Exception e){
			e.printStackTrace(); 
			return null;
		}
	}
	
	public boolean updateUsuario(Usuario usuario) {
		try {
			template.put(SERVICE_URL_TEMPLATE, usuario, usuario.getIdUsuario());
			return true;
			
		} catch(Exception e){
			e.printStackTrace(); 
			return false;
		}
	}
	
	public boolean deleteUsuario(long id){
		try {
			template.delete(SERVICE_URL_TEMPLATE, id);
			return true;
			
		} catch(Exception e){
			e.printStackTrace(); 
			return false;
		}
	}
	
	public Usuario createUsuario2(Usuario usuario){
		HttpEntity<Usuario> requestEntity = new HttpEntity<Usuario>(usuario);
		ResponseEntity<Object> response = 
			templateNoErrorHandling.exchange(SERVICE_URL, HttpMethod.POST, 
					requestEntity, Object.class);
		if(response.getStatusCode() == HttpStatus.OK){
			return  (Usuario)response.getBody();
		} 
			
		ResultMessage rm = (ResultMessage) response.getBody();
        System.out.println(rm.getMessage()); 
		return null;
	}
	
}
