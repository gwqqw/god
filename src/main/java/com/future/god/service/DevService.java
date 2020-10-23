package com.future.god.service;

import com.future.god.entity.Dev;
import java.util.List;

/**
 * (Dev)表服务接口
 *
 * @author makejava
 * @since 2020-10-23 14:35:05
 */
public interface DevService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dev queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dev> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dev 实例对象
     * @return 实例对象
     */
    Dev insert(Dev dev);

    /**
     * 修改数据
     *
     * @param dev 实例对象
     * @return 实例对象
     */
    Dev update(Dev dev);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}