package com.zing.zalo.zinstant.zom.meta;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOMMeta;
import com.zing.zalo.zinstant.zom.properties.ZOMStringMap;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;

/* loaded from: classes7.dex */
public final class ImpressionMeta {
    private long mInterval;
    private int mType;

    public ImpressionMeta(ZOMMeta zOMMeta) {
        AbstractC19074t.m100208f(zOMMeta, "metaImpression");
        this.mInterval = 5000L;
        ZOMStringMap[] zOMStringMapArr = zOMMeta.contents;
        AbstractC19074t.m100207e(zOMStringMapArr, "metaImpression.contents");
        for (ZOMStringMap zOMStringMap : zOMStringMapArr) {
            String str = zOMStringMap.key;
            if (AbstractC19074t.m100204b(str, ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                AbstractC19074t.m100207e(zOMStringMap, "content");
                parseImpressionType(zOMStringMap);
            } else if (AbstractC19074t.m100204b(str, ZinstantMetaConstant.IMPRESSION_META_INTERVAL)) {
                AbstractC19074t.m100207e(zOMStringMap, "content");
                parseImpressionInternal(zOMStringMap);
            }
        }
    }

    @ZinstantMetaConstant.ImpressionType
    private static /* synthetic */ void getMType$annotations() {
    }

    private final void parseImpressionInternal(ZOMStringMap zOMStringMap) {
        long j11;
        long m116581d;
        try {
            AbstractC19074t.m100207e(zOMStringMap.value, "content.value");
            j11 = Integer.parseInt(r7) * 1000;
        } catch (Exception unused) {
            j11 = 5000;
        }
        this.mInterval = j11;
        m116581d = AbstractC22543l.m116581d(j11, 5000L);
        this.mInterval = m116581d;
    }

    private final void parseImpressionType(ZOMStringMap zOMStringMap) {
        try {
            String str = zOMStringMap.value;
            AbstractC19074t.m100207e(str, "content.value");
            int parseInt = Integer.parseInt(str);
            this.mType = parseInt;
            if (parseInt < 0 || parseInt > 2) {
                this.mType = 0;
            }
        } catch (Exception unused) {
            this.mType = 0;
        }
    }

    public final long getIntervalTime() {
        return this.mInterval;
    }

    public final boolean isOnlyInteraction() {
        return this.mType == 0;
    }

    public final boolean isOnlyInterval() {
        return this.mType == 1;
    }
}
