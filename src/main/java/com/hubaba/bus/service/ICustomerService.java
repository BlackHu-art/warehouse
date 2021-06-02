package com.hubaba.bus.service;

import com.hubaba.bus.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @create 2021/2/21 9:56
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 */
public interface ICustomerService extends IService<Customer> {

    /**
     * 根据客户id删除客户
     * @param id    客户id
     */
    void deleteCustomerById(Integer id);
}
