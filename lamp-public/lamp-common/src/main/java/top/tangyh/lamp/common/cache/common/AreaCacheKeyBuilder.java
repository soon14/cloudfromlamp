package top.tangyh.lamp.common.cache.common;


import top.tangyh.basic.model.cache.CacheKeyBuilder;
import top.tangyh.lamp.common.cache.CacheKeyDefinition;

/**
 * εζ° KEY
 * {tenant}:PARAMETER_KEY:{key} -> value
 * <p>
 * #c_parameter
 *
 * @author zuihou
 * @date 2020/9/20 6:45 δΈε
 */
public class AreaCacheKeyBuilder implements CacheKeyBuilder {
    @Override
    public String getPrefix() {
        return CacheKeyDefinition.AREA;
    }

}
