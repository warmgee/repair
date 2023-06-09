package me.zhengjie.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
* 公共抽象service实现类
* @author fanglei
* @date 2021/07/28
*/
public abstract class CommonServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements CommonService<T> {
}
