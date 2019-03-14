package com.qfedu.personsystem.service.impl;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.AttendanceVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.dao.AttendanceMapper;
import com.qfedu.personsystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceMapper attendanceMapper;
    @Override
    public ResultVo findAllAtt() {
        List<AttendanceVo> list = attendanceMapper.selectAll();
        return ResultUtil.exec(true,"OK",list);
    }
}
