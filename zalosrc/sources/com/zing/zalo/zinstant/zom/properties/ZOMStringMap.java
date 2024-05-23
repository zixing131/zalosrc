package com.zing.zalo.zinstant.zom.properties;

import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMStringMap {
    public String key;
    public String value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZOMStringMap() {
    }

    public ZOMStringMap(byte[] bArr, byte[] bArr2) {
        this.key = AbstractC28268b.m142407b(bArr);
        this.value = AbstractC28268b.m142407b(bArr2);
    }

    public static ZOMStringMap createObject() {
        return new ZOMStringMap();
    }

    public String get() {
        return this.value;
    }
}
