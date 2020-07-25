package springboot.simple.dao;

import springboot.simple.entity.NgUpc;

/**
 * 管理用户(NgUpc)表数据库访问层
 *
 * @author mortal
 * @since 2020-07-25 15:03:29
 */
public interface NgUpcMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NgUpc queryById(Long id);


}