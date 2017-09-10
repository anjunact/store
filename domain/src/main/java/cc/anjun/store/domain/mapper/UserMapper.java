package cc.anjun.store.domain.mapper;

import cc.anjun.store.domain.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where userId=#{userId}")
    User get(@Param("userId") int userId);

    @Update("update t_user set  where userId=#{userId} ")
    void update(User user);

    @Insert("insert into t_user (userId,username,password,tel,address,deleted )values(#{userId},#{username},#{password},#{tel},#{address},#{deleted}) where userId=#{userId}")
    @Options(useGeneratedKeys = true, keyProperty = "userId", flushCache = Options.FlushCachePolicy.TRUE)
    void create(User user);

    @Update("update t_user set deleted=1 where userId=#{userId}")
    void delete(@Param("userId") int userId);
}
