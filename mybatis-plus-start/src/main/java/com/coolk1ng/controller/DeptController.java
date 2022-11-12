package com.coolk1ng.controller;


import com.coolk1ng.entity.vo.DeptVO;
import com.coolk1ng.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门(Dept)Controller
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@RestController
@RequestMapping("/dept")
public class DeptController{

    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/listDeptInfo")
    public List<DeptVO> listDeptInfo() {
        return deptService.listDeptInfo();
    }

}
