package wang.sj.wpdiy.mapper;

import org.springframework.stereotype.Component;
import wang.sj.wpdiy.entity.TimeLine;

import java.util.List;

/*
 *
 * 描 述: 时间轴mapper
 * 作 者: sj.wong
 * 创 建： 2018/4/27 15:14
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 *
 */
public interface TimeLineMapper {
	public List<TimeLine> getAll();
}
