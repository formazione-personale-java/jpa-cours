package it.cws.coursjpa;

import it.cws.coursjpa.dao.EmployeRepository;
import it.cws.coursjpa.entities.Address;
import it.cws.coursjpa.entities.Employee;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class CoursJpaApplication {
    private EmployeRepository employeRepository;
   // private Product product;
    public static void main(String[] args) {
        SpringApplication.run(CoursJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {


            employeRepository.save(Employee.builder()
                            .address(Address.builder()
                                    .city("Tougue")
                                    .continemt("Africa")
                                    .street("via Abdoul Karim")
                                    .tel("351206015")
                                    .build())
                            .email("test@gmail.com")
                            .name("Alpha")
                            .lastname("Barry")

                    .build());
            

        };
    }

}
