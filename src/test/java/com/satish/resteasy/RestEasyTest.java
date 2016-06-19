package com.satish.resteasy;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.satish.resteasy.adapter.PrintAdapter;
import com.satish.resteasy.service.PrintService;

@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration({"classpath:RestEasys-servlet.xml"})
public class RestEasyTest 
{
	private static RestEasyServer res;

	@InjectMocks
    public static PrintService ps = new PrintService();

	ApplicationContext ac;
   // @Mock
  //  private PrintAdapter pa;
    
    @Before
    public void setUp() {
    //	MockitoAnnotations.initMocks(this);
    	try {
    		 ac = new ClassPathXmlApplicationContext("classpath:RestEasys-servlet.xml");
			res = RestEasyServer.create(ps);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    
   
    
    @Test
    public void execute()
    {
    	try {
    		
    	//	 Mockito.when(pa.getAdapter()).thenReturn("satish");
    		
    		 Response response = res.newRequest("/api/print/service").request().buildGet().invoke();
    		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
