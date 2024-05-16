import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vehiclesim.vehiclesimserver.repository.VehiclesRepository;

@Configuration
@ComponentScan(basePackages = "com.vehiclesim.vehiclesimserver.repository")
public class Config {
   @Bean
   public VehiclesRepository vehiclesRepository() {
      return vehiclesRepository();
   }

}