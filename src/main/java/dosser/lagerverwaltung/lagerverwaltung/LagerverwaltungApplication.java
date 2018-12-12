package dosser.lagerverwaltung.lagerverwaltung;


import dosser.lagerverwaltung.lagerverwaltung.controller.Logic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LagerverwaltungApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(LagerverwaltungApplication.class, args);
		con.getBean(Logic.class).start();
	}



}
