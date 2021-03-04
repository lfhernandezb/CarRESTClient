package cl.dsoft.car.restclient;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.dsoft.car.data.entities.Comuna;
import cl.dsoft.car.data.entities.Usuario;

public class CarRestClient {


	public static void main(String[] args) {
		ApplicationContext ctx = 
			new AnnotationConfigApplicationContext(RESTConfig.class);
		
		UsuarioService serviceU = 
			ctx.getBean(UsuarioService.class);
		
		Usuario usuario = serviceU.getUsuario(1);
		System.out.println(usuario.toString());
		
		Usuario[] usuarios = serviceU.getUsuarios(1, 10, "mazda");
		
		System.out.println("Contents of the array: ");
		for (Usuario element: usuarios) {
		   System.out.println(element.toString());
		}		
		
		// create
		Usuario u = new Usuario();

		ComunaService serviceC = 
				ctx.getBean(ComunaService.class);
		
		Comuna comuna = serviceC.getComuna(1);
		
		u.setComuna(comuna);
		
		u.setNombre("PruebaPrueba");
		u.setCorreo("prueba@prueba.cl");
		u.setHombre(true);
		
		Usuario u2 = serviceU.createUsuario(u);
		u2 = serviceU.getUsuario(u2.getIdUsuario());
		System.out.println(u2.toString());
		
		//update
		Usuario u3 = serviceU.getUsuario(9832);
		u3.setTelefono("987654321");
		serviceU.updateUsuario(u3);
		u3 = serviceU.getUsuario(u3.getIdUsuario());
		System.out.println(u3.toString());
		/*
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
