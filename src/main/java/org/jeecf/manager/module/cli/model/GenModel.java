package org.jeecf.manager.module.cli.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 代码生成 实体
 * 
 * @author jianyiming
 *
 */
@ApiModel(value = "genModel", description = "代码生成实体")
public class GenModel extends AuthModel {
    /**
     * 命名空间
     */
    @ApiModelProperty(value = "命名空间", name = "namespace")
    private String namespace;
    /**
     * 数据源
     */
    @ApiModelProperty(value = "数据源", name = "dbsource")
    private String dbsource;
    /**
     * 单例
     */
    @ApiModelProperty(value = "单例", name = "genSingleModel")
    private GenSingleModel genSingleModel;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getDbsource() {
        return dbsource;
    }

    public void setDbsource(String dbsource) {
        this.dbsource = dbsource;
    }

    public GenSingleModel getGenSingleModel() {
        return genSingleModel;
    }

    public void setGenSingleModel(GenSingleModel genSingleModel) {
        this.genSingleModel = genSingleModel;
    }

}
