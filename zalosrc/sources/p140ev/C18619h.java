package p140ev;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: ev.h */
/* loaded from: classes4.dex */
public final class C18619h {

    /* renamed from: a */
    private String f93654a;

    /* renamed from: b */
    private int f93655b;

    /* renamed from: c */
    private long f93656c;

    /* renamed from: d */
    private C18613b f93657d;

    public C18619h(String str, int i11, long j11, C18613b c18613b) {
        this.f93654a = str;
        this.f93655b = i11;
        this.f93656c = j11;
        this.f93657d = c18613b;
    }

    /* renamed from: a */
    public final int m98399a() {
        return this.f93655b;
    }

    /* renamed from: b */
    public final C18613b m98400b() {
        return this.f93657d;
    }

    /* renamed from: c */
    public final long m98401c() {
        return this.f93656c;
    }

    /* renamed from: d */
    public final String m98402d() {
        return this.f93654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18619h)) {
            return false;
        }
        C18619h c18619h = (C18619h) obj;
        return AbstractC19074t.m100204b(this.f93654a, c18619h.f93654a) && this.f93655b == c18619h.f93655b && this.f93656c == c18619h.f93656c && AbstractC19074t.m100204b(this.f93657d, c18619h.f93657d);
    }

    public int hashCode() {
        String str = this.f93654a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f93655b) * 31) + AbstractC2147g0.m11521a(this.f93656c)) * 31;
        C18613b c18613b = this.f93657d;
        return hashCode + (c18613b != null ? c18613b.hashCode() : 0);
    }

    public String toString() {
        return "QoSWebLoadingData(url=" + this.f93654a + ", action=" + this.f93655b + ", loadPageStartTime=" + this.f93656c + ", featureId=" + this.f93657d + ")";
    }
}
