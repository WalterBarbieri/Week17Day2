package w17d2prove.w17d2prove;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomMathTests {

	@Test
	void testSum() {
		log.info("Test1");
		int result = CustomMath.sum(4, 8);
		assertEquals(result, 12);
	}
}
