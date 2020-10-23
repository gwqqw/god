package com.future.god.service.impl;

import com.future.god.entity.Dev;
import com.future.god.dao.DevDao;
import com.future.god.service.DevService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dev)表服务实现类
 *
 * @author makejava
 * @since 2020-10-23 14:35:05
 */
@Service("devService")
public class DevServiceImpl implements DevService {
    @Resource
    private DevDao devDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dev queryById(Long id) {
        return this.devDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dev> queryAllByLimit(int offset, int limit) {
        return this.devDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dev 实例对象
     * @return 实例对象
     */
    @Override
    public Dev insert(Dev dev) {
        this.devDao.insert(dev);
        return dev;
    }

    /**
     * 修改数据
     *
     * @param dev 实例对象
     * @return 实例对象
     */
    @Override
    public Dev update(Dev dev) {
        this.devDao.update(dev);
        return this.queryById(dev.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.devDao.deleteById(id) > 0;
    }
}