package com.ibm.developerworks.springmvc;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;
import org.springframework.web.portlet.mvc.Controller;

public class ViewController extends AbstractController{
	private static Log log = LogFactory.getLog(EditController.class);
	
	protected ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response) throws Exception {
		log.debug("Entering ViewController.handleRenderRequestInternal()");
		ModelAndView modelAndView = new ModelAndView("View");
		log.debug("Exiting ViewController.handleRenderRequestInternal() " + modelAndView);
		return modelAndView;
	}

}
