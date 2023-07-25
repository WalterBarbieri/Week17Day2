package w17d2prove.w17d2prove.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Component
@ComponentScan(basePackages = { "w17d2prove.w17d2prove", "w17d2prove.w17d2prove.test", "w17d2prove.w17d2prove.runner" })
@Getter
@Setter
@ToString
@PropertySource("classpath:application.properties")
@Slf4j
public class TestApplicationProperties {
	@Value("${application.supersecret}")
	String supersecret;

	public TestApplicationProperties() {

	}

	@PostConstruct
	public void useValue() {
		log.info(this.supersecret);
	}
}
