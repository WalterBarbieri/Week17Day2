package w17d2prove.w17d2prove.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Order(0)
public class HelloWorldRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello World!");
	}

}
