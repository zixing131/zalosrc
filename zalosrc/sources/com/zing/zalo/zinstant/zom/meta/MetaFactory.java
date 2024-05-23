package com.zing.zalo.zinstant.zom.meta;

import com.zing.zalo.zinstant.zom.node.ZOMMeta;

/* loaded from: classes7.dex */
public interface MetaFactory {
    ImpressionMeta impression(ZOMMeta zOMMeta);

    MemoryCachingMeta memoryCaching(ZOMMeta zOMMeta, boolean z11);

    TimeOnScreenMeta timeOnScreen();

    ViewportMeta viewport(ZOMMeta zOMMeta);
}
