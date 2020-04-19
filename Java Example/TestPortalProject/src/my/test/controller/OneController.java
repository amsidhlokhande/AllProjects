package my.test.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")

public class OneController {

	@RenderMapping
	public String doView(@ModelAttribute("userBean")UserBean userBean, RenderRequest request, RenderResponse response) {
		System.out.println("In a View method");
		userBean.setName("<b>nitin</b>");
		return "one";
	}
	@ActionMapping("submit")
	public void submit(@ModelAttribute("userBean")UserBean userBean , ActionRequest request, ActionResponse response) {
		// request.getAttribute("name");
		System.out.println("Acction Submit method");
		response.setRenderParameter("render", "one2");
	}

	@RequestMapping(params = "render")
	public String viewRender(@RequestParam String render) {
		return render;
	}
}
