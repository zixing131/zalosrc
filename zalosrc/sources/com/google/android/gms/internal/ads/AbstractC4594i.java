package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i */
/* loaded from: classes2.dex */
public abstract class AbstractC4594i {
    /* renamed from: a */
    public static List m23082a(byte[] bArr) {
        byte b11 = bArr[11];
        byte b12 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m23084c(m23083b(((b11 & 255) << 8) | (b12 & 255))));
        arrayList.add(m23084c(m23083b(3840L)));
        return arrayList;
    }

    /* renamed from: b */
    private static long m23083b(long j11) {
        return (j11 * 1000000000) / 48000;
    }

    /* renamed from: c */
    private static byte[] m23084c(long j11) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array();
    }
}
