package springboot.simple.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理用户(NgUpc)实体类
 *
 * @author mortal
 * @since 2020-07-25 15:03:29
 */
public class NgUpc implements Serializable {
    private static final long serialVersionUID = 860335075695774354L;
    /**
     * id
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date modifyTime;
    /**
     * 逻辑删除:true=1,false=0
     */
    private Boolean isDeleted;
    /**
     * upc
     */
    private String upc;
    /**
     * upc内容
     */
    private String upcDesc;
    /**
     * 尺寸
     */
    private String size;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUpcDesc() {
        return upcDesc;
    }

    public void setUpcDesc(String upcDesc) {
        this.upcDesc = upcDesc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}