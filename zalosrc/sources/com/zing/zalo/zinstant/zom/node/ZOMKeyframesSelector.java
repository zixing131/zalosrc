package com.zing.zalo.zinstant.zom.node;

/* loaded from: classes7.dex */
public class ZOMKeyframesSelector {
    public int mSelector;
    public ZOMKeyframesStyles mStyles;

    public ZOMKeyframesSelector() {
    }

    public ZOMKeyframesSelector(int i11, ZOMKeyframesStyles zOMKeyframesStyles) {
        this.mSelector = i11;
        this.mStyles = zOMKeyframesStyles;
    }

    public static ZOMKeyframesSelector createObject() {
        return new ZOMKeyframesSelector();
    }
}
