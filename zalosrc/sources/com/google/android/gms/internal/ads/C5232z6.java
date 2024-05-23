package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z6 */
/* loaded from: classes2.dex */
public final class C5232z6 {

    /* renamed from: a */
    public final int f31378a;

    /* renamed from: b */
    public final String f31379b;

    /* renamed from: c */
    public final List f31380c;

    /* renamed from: d */
    public final byte[] f31381d;

    public C5232z6(int i11, String str, List list, byte[] bArr) {
        List unmodifiableList;
        this.f31378a = i11;
        this.f31379b = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f31380c = unmodifiableList;
        this.f31381d = bArr;
    }
}
