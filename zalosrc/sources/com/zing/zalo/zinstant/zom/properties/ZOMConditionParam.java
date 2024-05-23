package com.zing.zalo.zinstant.zom.properties;

import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMConditionParam extends ZOMConditional {
    public String action;
    public String data;

    public ZOMConditionParam(int i11) {
        super(i11);
    }

    public static ZOMConditionParam createObject() {
        return new ZOMConditionParam(1);
    }

    public void setData(byte[] bArr, byte[] bArr2) {
        this.action = AbstractC28268b.m142407b(bArr);
        this.data = AbstractC28268b.m142407b(bArr2);
    }
}
