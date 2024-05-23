package com.zing.zalo.zinstant.zom.meta;

import com.zing.zalo.zinstant.zom.node.ZOMMeta;
import com.zing.zalo.zinstant.zom.properties.ZOMStringMap;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class MemoryCachingMeta {
    private boolean mIsAllowReuse;
    private boolean mIsStrongRef;

    public MemoryCachingMeta(ZOMMeta zOMMeta, boolean z11) {
        AbstractC19074t.m100208f(zOMMeta, "meta");
        this.mIsStrongRef = true;
        this.mIsAllowReuse = z11;
        ZOMStringMap[] zOMStringMapArr = zOMMeta.contents;
        AbstractC19074t.m100207e(zOMStringMapArr, "meta.contents");
        for (ZOMStringMap zOMStringMap : zOMStringMapArr) {
            String str = zOMStringMap.key;
            if (AbstractC19074t.m100204b(str, ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE)) {
                AbstractC19074t.m100207e(zOMStringMap, "content");
                parseContentCache(zOMStringMap);
            } else if (AbstractC19074t.m100204b(str, ZinstantMetaConstant.MEMORY_CACHING_ALLOW_REUSE_NODE)) {
                AbstractC19074t.m100207e(zOMStringMap, "content");
                parseContentAllowReuse(zOMStringMap);
            }
        }
    }

    private final void parseContentAllowReuse(ZOMStringMap zOMStringMap) {
        this.mIsAllowReuse = AbstractC19074t.m100204b("yes", zOMStringMap.value);
    }

    private final void parseContentCache(ZOMStringMap zOMStringMap) {
        this.mIsStrongRef = !AbstractC19074t.m100204b("no", zOMStringMap.value);
    }

    public final boolean isAllowReuse() {
        return this.mIsAllowReuse;
    }

    public final boolean isStrongRef() {
        return this.mIsStrongRef;
    }
}
