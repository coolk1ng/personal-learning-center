package com.coolk1ng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coolk1ng.entity.Dept;
import com.coolk1ng.entity.vo.DeptVO;

import java.util.List;

/**
 * 部门(Dept)Service
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
public interface DeptService extends IService<Dept> {
    /**
     * 查询部门信息(一个部门对应多个职员)
     * @return List<DeptVO>
     */
    List<DeptVO> listDeptInfo();

}
