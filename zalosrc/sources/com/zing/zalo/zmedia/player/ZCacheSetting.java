package com.zing.zalo.zmedia.player;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;

/* loaded from: classes.dex */
public class ZCacheSetting {
    private static final String TAG = "ZCacheSetting";

    private static ZCacheConfig getZCacheConfigByVideoConfig(ZMediaPlayerSettings.CacheConfig cacheConfig) {
        ZCacheConfig zCacheConfig = new ZCacheConfig();
        zCacheConfig.setType(cacheConfig.getPlayerSection());
        zCacheConfig.setPath(ZMediaPlayerSettings.getCacheDir(cacheConfig.getPlayerSection()));
        zCacheConfig.setBaseSize(cacheConfig.getBaseCacheSize());
        zCacheConfig.setAddCacheSizePercent(cacheConfig.getAddCacheSizePercent());
        zCacheConfig.setMaxCacheSizePercent(cacheConfig.getMaxCacheSizePercent());
        zCacheConfig.setFreeStoragePercent(cacheConfig.getFreeStoragePercent());
        zCacheConfig.setTotalStoragePercent(cacheConfig.getTotalStoragePercent());
        zCacheConfig.setOffCacheSize(cacheConfig.getOffCacheSize());
        zCacheConfig.setTimeToLive(cacheConfig.getTimeToLive());
        return zCacheConfig;
    }

    public static ZCacheConfig[] getZCacheConfigs() {
        return new ZCacheConfig[]{getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(0)), getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(5)), getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(1)), getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(2)), getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(3)), getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(4)), getZCacheConfigByVideoConfig(ZMediaPlayerSettings.getCacheConfig(6))};
    }
}
