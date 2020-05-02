package file.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = { "file.upload"})
public class FileUploadApplicaion {
	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplicaion.class, args);
	}

}
