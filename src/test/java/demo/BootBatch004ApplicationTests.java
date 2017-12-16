package demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import demo.mainController;

//JUnit 테스트에 사용할 컨텍스트를 로드하고, 테스트 클래스에 자동으로 주입하는 역활을 수행하는 어노테이션
@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest(mainController.class)
//@AutoConfigureMockMvc
public class BootBatch004ApplicationTests {

	@Autowired
	private WebApplicationContext webContext; 
	
	private MockMvc mockMvc; 
	
	//실제 웹서버에 REST 방식으로 API 를 호출하는 클래스
	private TestRestTemplate restTemplate;
	
	private String baseUrl;

	
	final static Logger log = LoggerFactory.getLogger(BootBatch004ApplicationTests.class);
	

	 
	@Before
    public void setUp() throws Exception {
//		restTemplate = new TestRestTemplate(); 
		mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build(); 
	 

    }
	
	@Test
	public void contextLoads() throws Exception {
//		this.mockMvc.perform(get("/findAll")).andDo(print()).andExpect(status().isOk())
//        .andExpect(content().string(containsString("Hello World")));
		
//		this.mockMvc.toString();
		log.info("--{}", this.mockMvc.perform(MockMvcRequestBuilders.get("/findAll")).andDo(print()));
		//same as below
		log.info("same --{}", this.mockMvc.perform(get("/findAll")).andDo(print()));
	}

}
