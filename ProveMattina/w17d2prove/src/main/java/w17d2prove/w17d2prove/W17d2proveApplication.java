package w17d2prove.w17d2prove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import w17d2prove.w17d2prove.test.TestApplicationProperties;

@SpringBootApplication
@Slf4j
public class W17d2proveApplication {

	public static void main(String[] args) {
		SpringApplication.run(W17d2proveApplication.class, args);
	}

	public static void configWithComponent() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(W17d2proveApplication.class);

		TestApplicationProperties test = ctx.getBean(TestApplicationProperties.class);

		log.info(test.toString());

		ctx.close();
	}

}
