package com.spring.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void helloReturnsGreeting() throws Exception {
		MockMvc mockMvc = standaloneSetup(new HelloController()).build();

		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Siva!"));
	}

}
