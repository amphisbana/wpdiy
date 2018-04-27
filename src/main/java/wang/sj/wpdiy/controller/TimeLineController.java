package wang.sj.wpdiy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wang.sj.wpdiy.service.TimeLineService;

import javax.servlet.http.HttpServletRequest;

/*
 *
 * 描 述: 主要功能
 * 作 者: sj.wong
 * 创 建： 2018/4/27 15:33
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping("timeLine")
public class TimeLineController {
	@Autowired
	private TimeLineService timeLineService;

	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("msg",timeLineService.getAll());
		return "/timeline/index";
	}
}
