//package com.example.rest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.example.persistance.domain.Client;
//import com.example.persistance.domain.Officer;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

//
//

//
//@SpringBootTest
//(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//@Sql(scripts = "classpath:client-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
//@ActiveProfiles
//public class ClientIntegrationTest {
//
//	@Autowired
//	private MockMvc mockMVC;
//
//	@Autowired
//	private ObjectMapper mapper;
//
//	private final Client TEST_CLIENT = new Client(null,"Mary","Bond","05/07/1992","Musician@gmail.com",07654373,"London","Visa",111111,"Monday 16 from 07:00 to 19:00");
//	
//	private final Client TEST_SAVED_CLIENT = new Client(1L,"Mary","Bond","05/07/1992","Musician@gmail.com",07654373,"London","Visa",111111,"Monday 16 from 07:00 to 19:00");
//
////	private final Client TEST_SAVED_CLIENT = new Client(1L, 26, "Jordan Harrison");
//
//	@Test
//	public void testCreate() throws JsonProcessingException, Exception {
//		String resultString = this.mockMVC
//				.perform(post("/AddClient").contentType(MediaType.APPLICATION_JSON)
//						.content(this.mapper.writeValueAsString(TEST_CLIENT)))
//				.andExpect(status().isCreated()).andReturn().getRequest().getContentAsString();
//
//		Client result = this.mapper.readValue(resultString, Client.class);
//		assertThat(result).isEqualTo(TEST_CLIENT);
//	}
//
//	@Test
//	public void testReadOne() throws Exception {
//		this.mockMVC.perform(get("/clientById/1")).andExpect(status().isOk())
//				.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_CLIENT)));
//
//	}
//
//	@Test
//	public void testZZZ() throws Exception {
//		final List<Client> CLIENTS = new ArrayList<>();
//		CLIENTS.add(TEST_SAVED_CLIENT);
//
//		final String resultString = this.mockMVC
//				.perform(request(HttpMethod.GET, "/allClients").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
//
//		List<Client> results = Arrays.asList(mapper.readValue(resultString, Client[].class));
//		assertThat(results).contains(this.TEST_CLIENT).hasSize(3);
//	}
//
//	@Test
//	public void testUpdate() throws Exception {
//		final Client newClient = new Client(null,"Mary","Bond","05/07/1992","Musician@gmail.com",07654373,"London","Visa",111111,"Monday 16 from 07:00 to 19:00");
//
//		String resultString = this.mockMVC
//				.perform(put("/updateClient/3").contentType(MediaType.APPLICATION_JSON)
//						.content(this.mapper.writeValueAsString(newClient)))
//				.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();
//
//		Client result = this.mapper.readValue(resultString, Client.class);
//		assertThat(result).isEqualTo(newClient);
//	
//
//	@Test
//	public void testDelete() throws Exception {
//		this.mockMVC.perform(delete("/deleteClient/2")).andExpect(status().isNoContent());
//	}
//}
