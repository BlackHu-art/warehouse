package com.hubaba.bus.service.impl;

import com.hubaba.bus.entity.Customer;
import com.hubaba.bus.mapper.CustomerMapper;
import com.hubaba.bus.mapper.GoodsMapper;
import com.hubaba.bus.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;

/**
 * @Author admin
 * @create 2021/2/21 9:55
 * <p>
 * InnoDB free: 9216 kB 服务实现类
 * </p>
 *
 */
@Service
@Transactional
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public boolean save(Customer entity) {
        return super.save(entity);
    }

    @Override
    public boolean updateById(Customer entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }
    @Override
    public Customer getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    /**
     * 根据客户id删除客户
     * @param id    客户id
     */
    @Override
    public void deleteCustomerById(Integer id) {
        //根据客户id删除商品销售
        goodsMapper.deleteSaleByCustomerId(id);
        //根据客户id删除商品销售退货
        goodsMapper.deleteSaleBackByCustomerId(id);
        this.removeById(id);
    }
}
