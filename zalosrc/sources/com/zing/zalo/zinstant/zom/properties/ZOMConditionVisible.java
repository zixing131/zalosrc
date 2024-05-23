package com.zing.zalo.zinstant.zom.properties;

import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMConditionVisible extends ZOMConditionParam {
    public int fallback;
    public int ifFalse;
    public int ifTrue;

    @Deprecated
    public int transition;

    public ZOMConditionVisible(int i11) {
        super(i11);
    }

    public static ZOMConditionVisible createObject() {
        return new ZOMConditionVisible(0);
    }

    public void setData(int i11, int i12, int i13, byte[] bArr, byte[] bArr2) {
        this.fallback = i11;
        this.ifTrue = i12;
        this.ifFalse = i13;
        this.action = AbstractC28268b.m142407b(bArr);
        this.data = AbstractC28268b.m142407b(bArr2);
    }
}
