package com.hubaba.bus.service;

import com.hubaba.bus.entity.Outport;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @create 2021/2/21 9:57
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 */
public interface IOutportService extends IService<Outport> {

    /**
     * 对商品进货进行退货处理
     * @param id    进货单ID
     * @param number    退货数量
     * @param remark    备注
     */
    void addOutport(Integer id, Integer number, String remark);
}
