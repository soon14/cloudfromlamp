package top.tangyh.lamp.common.cache.auth;

import top.tangyh.basic.model.cache.CacheKeyBuilder;
import top.tangyh.lamp.common.cache.CacheKeyDefinition;

import java.time.Duration;

/**
 * 用户角色 KEY
 * <p>
 * #c_user_role
 *
 * @author zuihou
 * @date 2020/9/20 6:45 下午
 */
public class UserRoleCacheKeyBuilder implements CacheKeyBuilder {
    @Override
    public String getPrefix() {
        return CacheKeyDefinition.USER_ROLE;
    }

    @Override
    public Duration getExpire() {
        return Duration.ofHours(12);
    }
}
