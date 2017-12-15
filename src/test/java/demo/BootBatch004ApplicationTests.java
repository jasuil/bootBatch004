package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import demo.mainController;


@RunWith(SpringRunner.class)
//@SpringBootTest(classes = mainController.class)
@WebMvcTest(mainController.class)
//@AutoConfigureMockMvc
public class BootBatch004ApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	final static Logger log = LoggerFactory.getLogger(BootBatch004ApplicationTests.class);
	
	@Test
	public void contextLoads() throws Exception {
//		this.mockMvc.perform(get("/findAll")).andDo(print()).andExpect(status().isOk())
//        .andExpect(content().string(containsString("Hello World")));
		
		this.mockMvc.toString();
	}

}
