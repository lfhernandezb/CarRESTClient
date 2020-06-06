package cl.dsoft.car.restclient;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarRestClient {


	public static void main(String[] args) {
		ApplicationContext ctx = 
			new AnnotationConfigApplicationContext(RESTConfig.class);
		
		UsuarioService service = 
			ctx.getBean(UsuarioService.class);
		/*
		//happy path
		Usuario e1 = new Usuario();
		e1.setFirstName("John");
		e1.setLastName("smith");
		e1.setAddress("105 Easy St.");
		e1.setCity("Saint Louis");
		e1.setJobTitle("Programmer");
		e1.setHireDate(new Date());
		e1.setState("MO");
		e1.setZip("63101");
		
		e1 = service.createUsuario2(e1);
		System.out.println(e1.toString());
		*/
		
		cl.dsoft.car.data.entities.Usuario usuario = service.getUsuario(1);
		System.out.println(usuario.toString());
		
		/*
		//update
		emp.setFirstName("Jim");
		service.updateUsuario(emp);
		emp = service.getUsuario(emp.getId());
		System.out.println(emp.toString());
		
		//delete
		service.deleteUsuario(emp.getId());
		System.out.println("deleted employee: " + emp.getId());		
		
		//unhappy path
		System.out.println("UNHAPPY PATH 1:");
		emp = new Usuario();
		emp = service.createUsuario(emp); 
		if(emp == null){
			System.out.println("employee not created\n");
		}

		//unhappy path
		System.out.println("UNHAPPY PATH 2:");
		emp = new Usuario();
		emp = service.createUsuario2(emp); 
		if(emp == null){
			System.out.println("employee not created\n");
		}
		*/
	}

}
