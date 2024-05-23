package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.b */
/* loaded from: classes2.dex */
public final class C4336b {

    /* renamed from: a */
    private final SparseBooleanArray f17499a;

    /* renamed from: a */
    public final int m20359a(int i11) {
        v71.m27170a(i11, 0, this.f17499a.size());
        return this.f17499a.keyAt(i11);
    }

    /* renamed from: b */
    public final int m20360b() {
        return this.f17499a.size();
    }

    /* renamed from: c */
    public final boolean m20361c(int i11) {
        return this.f17499a.get(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4336b)) {
            return false;
        }
        C4336b c4336b = (C4336b) obj;
        if (g92.f20474a < 24) {
            if (this.f17499a.size() != c4336b.f17499a.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f17499a.size(); i11++) {
                if (m20359a(i11) != c4336b.m20359a(i11)) {
                    return false;
                }
            }
            return true;
        }
        return this.f17499a.equals(c4336b.f17499a);
    }

    public final int hashCode() {
        if (g92.f20474a < 24) {
            int size = this.f17499a.size();
            for (int i11 = 0; i11 < this.f17499a.size(); i11++) {
                size = (size * 31) + m20359a(i11);
            }
            return size;
        }
        return this.f17499a.hashCode();
    }
}
