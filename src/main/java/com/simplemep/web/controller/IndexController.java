package com.simplemep.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplemep.business.IMEPBusinessController;
import com.simplemep.business.IImpactBusinessController;
import com.simplemep.model.IMEP;
import com.simplemep.model.IImpact;
import com.simplemep.utils.IocSingleton;

@Controller
public class IndexController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("index")
	public ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("Return Index View");

		ModelAndView model = new ModelAndView("index");
		
		/**
		 * Projects Loading
		 */
//		IProjectBusinessController pbc = (IProjectBusinessController) IocSingleton
//				.getBean("projectBusinessController");
//		List<IProject> projectList = pbc.getProjectList();
//		model.addObject("projectList", projectList);
//
//		/**
//		 * MEPs Loading 
//		 */
//		IMEPBusinessController mbc = (IMEPBusinessController) IocSingleton
//				.getBean("mepBusinessController");
//		List<IMEP> mepList = mbc.getMEPList();
//		model.addObject("mepList", mepList);
		
		return model;
	}

}
