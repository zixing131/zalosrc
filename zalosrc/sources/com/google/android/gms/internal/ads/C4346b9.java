package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.b9 */
/* loaded from: classes2.dex */
public final class C4346b9 {

    /* renamed from: a */
    long f17671a;

    /* renamed from: b */
    final String f17672b;

    /* renamed from: c */
    final String f17673c;

    /* renamed from: d */
    final long f17674d;

    /* renamed from: e */
    final long f17675e;

    /* renamed from: f */
    final long f17676f;

    /* renamed from: g */
    final long f17677g;

    /* renamed from: h */
    final List f17678h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4346b9(String str, C5196y7 c5196y7) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = c5196y7.f30821b;
        long j11 = c5196y7.f30822c;
        long j12 = c5196y7.f30823d;
        long j13 = c5196y7.f30824e;
        long j14 = c5196y7.f30825f;
        List list = c5196y7.f30827h;
        if (list == null) {
            Map map = c5196y7.f30826g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new C4529g8((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    /* renamed from: a */
    public static C4346b9 m20440a(C4382c9 c4382c9) {
        List arrayList;
        if (C4456e9.m21632c(c4382c9) == 538247942) {
            String m21634f = C4456e9.m21634f(c4382c9);
            String m21634f2 = C4456e9.m21634f(c4382c9);
            long m21633d = C4456e9.m21633d(c4382c9);
            long m21633d2 = C4456e9.m21633d(c4382c9);
            long m21633d3 = C4456e9.m21633d(c4382c9);
            long m21633d4 = C4456e9.m21633d(c4382c9);
            int m21632c = C4456e9.m21632c(c4382c9);
            if (m21632c >= 0) {
                if (m21632c == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i11 = 0; i11 < m21632c; i11++) {
                    list.add(new C4529g8(C4456e9.m21634f(c4382c9).intern(), C4456e9.m21634f(c4382c9).intern()));
                }
                return new C4346b9(m21634f, m21634f2, m21633d, m21633d2, m21633d3, m21633d4, list);
            }
            throw new IOException("readHeaderList size=" + m21632c);
        }
        throw new IOException();
    }

    private C4346b9(String str, String str2, long j11, long j12, long j13, long j14, List list) {
        this.f17672b = str;
        this.f17673c = true == "".equals(str2) ? null : str2;
        this.f17674d = j11;
        this.f17675e = j12;
        this.f17676f = j13;
        this.f17677g = j14;
        this.f17678h = list;
    }
}
