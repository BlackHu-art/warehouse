package com.hubaba.sys.service.impl;

import com.hubaba.sys.entity.Notice;
import com.hubaba.sys.mapper.NoticeMapper;
import com.hubaba.sys.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author admin
 * @create 2021/2/21 10:06
 * InnoDB free: 9216 kB 服务实现类
 */
@Service
@Transactional
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
