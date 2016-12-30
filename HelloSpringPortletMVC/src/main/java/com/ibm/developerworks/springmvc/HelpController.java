package com.ibm.developerworks.springmvc;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

public class HelpController extends AbstractController{
	private static Log log = LogFactory.getLog(HelpController.class);
	
	protected ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response) throws Exception {
		log.debug("Entering HelpController.handleRenderRequestInternal()");
		ModelAndView modelAndView = new ModelAndView("Help");
		log.debug("Exiting HelpController.handleRenderRequestInternal() " + modelAndView);
		return modelAndView;
	}

}
