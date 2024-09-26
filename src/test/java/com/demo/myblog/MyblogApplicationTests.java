package com.demo.myblog;

import com.demo.myblog.config.TestcontainersConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MyblogApplicationTests {

	@Test
	void contextLoads() {
	}

}
