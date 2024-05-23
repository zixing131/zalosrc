package com.zing.zalo.zinstant.zom.meta;

import com.zing.zalo.zinstant.zom.node.ZOMMeta;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ZinstantMetadata {
    private final boolean hasScript;
    private ImpressionMeta mImpressionMeta;
    private MemoryCachingMeta mMemoryCachingMeta;
    private TimeOnScreenMeta mTimeOnScreenMeta;
    private ViewportMeta mViewport;

    public ZinstantMetadata(ZOMMeta[] zOMMetaArr, boolean z11, MetaFactory metaFactory) {
        AbstractC19074t.m100208f(metaFactory, "metaFactory");
        this.hasScript = z11;
        if (zOMMetaArr != null) {
            for (ZOMMeta zOMMeta : zOMMetaArr) {
                String str = zOMMeta.name;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1531132287:
                            if (str.equals(ZinstantMetaConstant.MEMORY_CACHING)) {
                                parseMemoryCaching(metaFactory, zOMMeta);
                                break;
                            } else {
                                break;
                            }
                        case 120623625:
                            if (str.equals(ZinstantMetaConstant.IMPRESSION_META_NAME)) {
                                parseImpression(metaFactory, zOMMeta);
                                break;
                            } else {
                                break;
                            }
                        case 617573658:
                            if (str.equals(ZinstantMetaConstant.TIME_ON_SCREEN_META_NAME)) {
                                parseTimeOnScreen(metaFactory);
                                break;
                            } else {
                                break;
                            }
                        case 1196685478:
                            if (str.equals(ZinstantMetaConstant.VIEWPORT)) {
                                parseViewport(metaFactory, zOMMeta);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
    }

    private final void parseImpression(MetaFactory metaFactory, ZOMMeta zOMMeta) {
        this.mImpressionMeta = metaFactory.impression(zOMMeta);
    }

    private final void parseMemoryCaching(MetaFactory metaFactory, ZOMMeta zOMMeta) {
        this.mMemoryCachingMeta = metaFactory.memoryCaching(zOMMeta, this.hasScript);
    }

    private final void parseTimeOnScreen(MetaFactory metaFactory) {
        this.mTimeOnScreenMeta = metaFactory.timeOnScreen();
    }

    private final void parseViewport(MetaFactory metaFactory, ZOMMeta zOMMeta) {
        this.mViewport = metaFactory.viewport(zOMMeta);
    }

    public final ImpressionMeta getImpressionMeta() {
        return this.mImpressionMeta;
    }

    public final String getViewportId() {
        ViewportMeta viewportMeta = this.mViewport;
        if (viewportMeta != null) {
            return viewportMeta.getViewportId();
        }
        return null;
    }

    public final boolean isAllowReuse() {
        MemoryCachingMeta memoryCachingMeta = this.mMemoryCachingMeta;
        if (memoryCachingMeta != null) {
            return memoryCachingMeta.isAllowReuse();
        }
        return this.hasScript;
    }

    public final boolean isStrongRef() {
        MemoryCachingMeta memoryCachingMeta = this.mMemoryCachingMeta;
        if (memoryCachingMeta != null) {
            return memoryCachingMeta.isStrongRef();
        }
        return true;
    }

    public final boolean isTrackingTimeOnScreen() {
        TimeOnScreenMeta timeOnScreenMeta = this.mTimeOnScreenMeta;
        if (timeOnScreenMeta != null) {
            return timeOnScreenMeta.isEnable();
        }
        return false;
    }

    public /* synthetic */ ZinstantMetadata(ZOMMeta[] zOMMetaArr, boolean z11, MetaFactory metaFactory, int i11, AbstractC19060k abstractC19060k) {
        this(zOMMetaArr, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? new MetaFactoryImpl() : metaFactory);
    }
}
