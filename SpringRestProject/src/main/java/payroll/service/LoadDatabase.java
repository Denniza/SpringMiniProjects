package payroll.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import payroll.model.Employee;
import payroll.model.Order;
import payroll.model.Status;
import payroll.repository.EmployeeRepository;
import payroll.repository.OrderRepository;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository){


        return args -> {
            log.info("Preloading" + repository.save(new Employee("Bilbo","Baggins","bulgar")));
            log.info("Preloading" + repository.save(new Employee("Frodo","Baggins", "thief")));
            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
        });
        };
    }
}
