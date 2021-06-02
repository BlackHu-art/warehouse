package com.hubaba.bus.service;

import com.hubaba.bus.entity.Provider;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @create 2021/2/21 9:57
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 */
public interface IProviderService extends IService<Provider> {

    /**
     * 根据供应商ID删除供应商
     * @param id
     */
    void deleteProviderById(Integer id);
}
