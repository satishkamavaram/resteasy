package com.satish.resteasy.service;


import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.satish.resteasy.adapter.PrintAdapter;

@Named
//@Component
@Path("/api/print")
//@Controller
//@RequestMapping("/api/print")
public class PrintService {

	@Autowired
	PrintAdapter printAdapter;
	
	
	@GET
	@Path("/service")
	//@RequestMapping("/service")
	public Response printMessage() {
		System.out.println("insdie printMessage");
		String result = "Restful";
		result = printAdapter.getAdapter();
		System.out.println("result::::"+result);
		return Response.status(200).entity(result).build();

	}

}