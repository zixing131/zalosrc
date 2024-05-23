package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z8 */
/* loaded from: classes2.dex */
public final class C5234z8 {

    /* renamed from: d */
    protected static final Comparator f31401d = new C5197y8();

    /* renamed from: a */
    private final List f31402a = new ArrayList();

    /* renamed from: b */
    private final List f31403b = new ArrayList(64);

    /* renamed from: c */
    private int f31404c = 0;

    public C5234z8(int i11) {
    }

    /* renamed from: c */
    private final synchronized void m28456c() {
        while (this.f31404c > 4096) {
            byte[] bArr = (byte[]) this.f31402a.remove(0);
            this.f31403b.remove(bArr);
            this.f31404c -= bArr.length;
        }
    }

    /* renamed from: a */
    public final synchronized void m28457a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f31402a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f31403b, bArr, f31401d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f31403b.add(binarySearch, bArr);
                this.f31404c += length;
                m28456c();
            }
        }
    }

    /* renamed from: b */
    public final synchronized byte[] m28458b(int i11) {
        for (int i12 = 0; i12 < this.f31403b.size(); i12++) {
            byte[] bArr = (byte[]) this.f31403b.get(i12);
            int length = bArr.length;
            if (length >= i11) {
                this.f31404c -= length;
                this.f31403b.remove(i12);
                this.f31402a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i11];
    }
}
