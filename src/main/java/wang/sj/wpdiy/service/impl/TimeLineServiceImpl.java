package wang.sj.wpdiy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.sj.wpdiy.entity.TimeLine;
import wang.sj.wpdiy.mapper.TimeLineMapper;
import wang.sj.wpdiy.service.TimeLineService;

import java.util.List;

/*
 *
 * 描 述: 主要功能
 * 作 者: sj.wong
 * 创 建： 2018/4/27 15:36
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 */
@Service
public class TimeLineServiceImpl implements TimeLineService {
	@Autowired
	private TimeLineMapper timeLineMapper;
	@Override
	public List<TimeLine> getAll() {
		return timeLineMapper.getAll();
	}
}
