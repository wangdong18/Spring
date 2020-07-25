package springboot.simple.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.simple.dao.NgUpcMapper;
import springboot.simple.entity.NgUpc;
import springboot.simple.service.NgUpcService;

/**
 * 管理用户(NgUpc)表服务实现类
 *
 * @author mortal
 * @since 2020-07-25 15:03:29
 */
@Service("ngUpcService")
public class NgUpcServiceImpl implements NgUpcService {
    @Autowired
    private NgUpcMapper ngUpcMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NgUpc queryById(Long id) {
        return this.ngUpcMapper.queryById(id);
    }
}