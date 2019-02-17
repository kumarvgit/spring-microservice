package com.in28minutes.rest.controllers;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.controllers.bean.HelloWorldBean;

@RestController
public class HeloWorldController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World !";
	}

//	@GetMapping(path = "/hello-world-internationalized")
//	public String helloWorldInternational(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
//		return messageSource.getMessage("good.mornig.message", null, locale);
//	}

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternational(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("good.mornig.message", null, LocaleContextHolder.getLocale());
	}

	/**
	 * hello-world bean
	 * 
	 * @return
	 */
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {

//		No converter found for return value of type: class com.in28minutes.rest.controllers.HelloWorldBean
//		Will come when there is no getter available
		return new HelloWorldBean("Hello world");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@Valid @PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s!", name));
	}
}
