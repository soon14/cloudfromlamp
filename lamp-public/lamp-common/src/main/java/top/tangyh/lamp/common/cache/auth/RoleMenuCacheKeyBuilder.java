package top.tangyh.lamp.common.cache.auth;

import top.tangyh.basic.model.cache.CacheKeyBuilder;
import top.tangyh.lamp.common.cache.CacheKeyDefinition;

import java.time.Duration;

/**
 * 资源 KEY
 * <p>
 * #c_role_authority
 *
 * @author zuihou
 * @date 2020/9/20 6:45 下午
 */
public class RoleMenuCacheKeyBuilder implements CacheKeyBuilder {
    @Override
    public String getPrefix() {
        return CacheKeyDefinition.ROLE_MENU;
    }

    @Override
    public Duration getExpire() {
        return Duration.ofHours(24);
    }


}
