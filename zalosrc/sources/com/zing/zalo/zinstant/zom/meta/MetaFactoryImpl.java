package com.zing.zalo.zinstant.zom.meta;

import com.zing.zalo.zinstant.zom.node.ZOMMeta;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class MetaFactoryImpl implements MetaFactory {
    @Override // com.zing.zalo.zinstant.zom.meta.MetaFactory
    public ImpressionMeta impression(ZOMMeta zOMMeta) {
        AbstractC19074t.m100208f(zOMMeta, "impressionMeta");
        return new ImpressionMeta(zOMMeta);
    }

    @Override // com.zing.zalo.zinstant.zom.meta.MetaFactory
    public MemoryCachingMeta memoryCaching(ZOMMeta zOMMeta, boolean z11) {
        AbstractC19074t.m100208f(zOMMeta, "cachingMeta");
        return new MemoryCachingMeta(zOMMeta, z11);
    }

    @Override // com.zing.zalo.zinstant.zom.meta.MetaFactory
    public TimeOnScreenMeta timeOnScreen() {
        return new TimeOnScreenMeta();
    }

    @Override // com.zing.zalo.zinstant.zom.meta.MetaFactory
    public ViewportMeta viewport(ZOMMeta zOMMeta) {
        AbstractC19074t.m100208f(zOMMeta, "viewportMeta");
        return new ViewportMeta(zOMMeta);
    }
}
