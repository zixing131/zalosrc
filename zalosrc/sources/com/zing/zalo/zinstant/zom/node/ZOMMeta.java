package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMStringMap;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMMeta {
    public ZOMStringMap[] contents;
    public String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZOMMeta() {
    }

    public ZOMMeta(byte[] bArr, Object[] objArr) {
        this.name = AbstractC28268b.m142407b(bArr);
        this.contents = (ZOMStringMap[]) objArr;
    }

    public Object[] getContents() {
        return this.contents;
    }

    public String getName() {
        return this.name;
    }
}
