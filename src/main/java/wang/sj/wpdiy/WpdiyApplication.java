package wang.sj.wpdiy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("wang.sj.wpdiy.mapper")
public class WpdiyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpdiyApplication.class, args);
	}
}
