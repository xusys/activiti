package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
