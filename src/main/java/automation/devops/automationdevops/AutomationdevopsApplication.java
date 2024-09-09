package automation.devops.automationdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AutomationdevopsApplication {

	@GetMapping
	public String message(){
		return "Welcome devops";
	}

	public static void main(String[] args) {
		SpringApplication.run(AutomationdevopsApplication.class, args);
	}

}
