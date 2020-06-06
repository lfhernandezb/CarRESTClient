package cl.dsoft.car.restclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.Resource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.web.client.RestTemplate;


@Configuration
@ImportResource("classpath:spring/carrest-beans.xml")
public class RESTConfig {

	private String serviceBaseURL = 
		"http://localhost:8080/carrest/usuario/";
	
	@Autowired
	private ApplicationContext ctx;
	/*
	@Bean
	public CastorMarshaller castorMarshaller(){
		CastorMarshaller marshaller = new CastorMarshaller();
		marshaller.setMappingLocations(new Resource[]{
				ctx.getResource("classpath:/castor/employee.xml"), 
				ctx.getResource("classpath:/castor/resultMessage.xml")});
		return marshaller;
	}
	
	@Bean
	public MarshallingHttpMessageConverter marshallingMessageConverter(){
		CastorMarshaller marshaller = castorMarshaller();
		return new MarshallingHttpMessageConverter(marshaller, marshaller);
	}
	*/
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		/*
		List<HttpMessageConverter<?>> converters = 
			new ArrayList<HttpMessageConverter<?>>();
		converters.add(marshallingMessageConverter());
		restTemplate.setMessageConverters(converters);
		*/
		return restTemplate;
	}
	
	@Bean
	public RestTemplate restTemplateNoError() {
		RestTemplate restTemplate = new RestTemplate();
		/*
		List<HttpMessageConverter<?>> converters = 
			new ArrayList<HttpMessageConverter<?>>();
		converters.add(marshallingMessageConverter());
		restTemplate.setMessageConverters(converters);
		restTemplate.setErrorHandler(new NoOpResponseErrorHandler());
		*/
		return restTemplate;
	}
	
	@Bean
	public UsuarioService usuarioService() {
		return new UsuarioService(serviceBaseURL, restTemplate(), 
				restTemplateNoError());
	}
	
	
}
