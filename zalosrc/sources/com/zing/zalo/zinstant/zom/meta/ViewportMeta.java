package com.zing.zalo.zinstant.zom.meta;

import com.zing.zalo.zinstant.zom.node.ZOMMeta;
import com.zing.zalo.zinstant.zom.properties.ZOMStringMap;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ViewportMeta {
    private String mViewportId;

    public ViewportMeta(ZOMMeta zOMMeta) {
        AbstractC19074t.m100208f(zOMMeta, "meta");
        ZOMStringMap[] zOMStringMapArr = zOMMeta.contents;
        AbstractC19074t.m100207e(zOMStringMapArr, "meta.contents");
        for (ZOMStringMap zOMStringMap : zOMStringMapArr) {
            if (AbstractC19074t.m100204b(zOMStringMap.key, ZinstantMetaConstant.TARGET_VIEWPORT)) {
                AbstractC19074t.m100207e(zOMStringMap, "content");
                parseTargetViewport(zOMStringMap);
            }
        }
    }

    private final void parseTargetViewport(ZOMStringMap zOMStringMap) {
        String str = zOMStringMap.value;
        if (str != null && str.length() != 0) {
            this.mViewportId = zOMStringMap.value;
        }
    }

    public final String getViewportId() {
        return this.mViewportId;
    }
}
