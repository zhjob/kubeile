package kubeila.employee.dao.mapper;

import java.util.List;
import kubeila.employee.entity.SysPermissions;
import kubeila.employee.entity.SysPermissionsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysPermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int countByExample(SysPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int deleteByExample(SysPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int insert(SysPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int insertSelective(SysPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    List<SysPermissions> selectByExample(SysPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    SysPermissions selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permissions
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysPermissions record);
}