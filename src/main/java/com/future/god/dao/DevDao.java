package com.future.god.dao;

import com.future.god.entity.Dev;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Dev)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-23 14:35:05
 */
public interface DevDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dev queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dev> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dev 实例对象
     * @return 对象列表
     */
    List<Dev> queryAll(Dev dev);

    /**
     * 新增数据
     *
     * @param dev 实例对象
     * @return 影响行数
     */
    int insert(Dev dev);

    /**
     * 修改数据
     *
     * @param dev 实例对象
     * @return 影响行数
     */
    int update(Dev dev);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}