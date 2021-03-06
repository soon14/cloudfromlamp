package top.tangyh.lamp.common.cache.gateway;

import top.tangyh.basic.model.cache.CacheKeyBuilder;
import top.tangyh.lamp.common.cache.CacheKeyDefinition;

/**
 * ιζ΅ KEY
 * <p>
 *
 * @author zuihou
 * @date 2020/9/20 6:45 δΈε
 */
public class RateLimiterCacheKeyBuilder implements CacheKeyBuilder {
    @Override
    public String getPrefix() {
        return CacheKeyDefinition.RATE_LIMITER;
    }

}
