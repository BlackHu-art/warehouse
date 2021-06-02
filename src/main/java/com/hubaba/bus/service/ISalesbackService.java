package com.hubaba.bus.service;

import com.hubaba.bus.entity.Salesback;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @create 2021/2/21 9:57
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 */
public interface ISalesbackService extends IService<Salesback> {

    /**
     * 对商品销售进行退货处理
     * @param id    销售单ID
     * @param number    退货数量
     * @param remark    备注
     */
    void addSalesback(Integer id, Integer number, String remark);

}
