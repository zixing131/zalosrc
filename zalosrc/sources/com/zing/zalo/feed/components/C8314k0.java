package com.zing.zalo.feed.components;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.feed.components.k0 */
/* loaded from: classes4.dex */
public final class C8314k0 {

    /* renamed from: a */
    private String f45453a;

    /* renamed from: b */
    private boolean f45454b;

    /* renamed from: c */
    private boolean f45455c;

    /* renamed from: d */
    private int f45456d;

    public C8314k0(String str, boolean z11, boolean z12, int i11) {
        AbstractC19074t.m100208f(str, "feedId");
        this.f45453a = str;
        this.f45454b = z11;
        this.f45455c = z12;
        this.f45456d = i11;
    }

    /* renamed from: a */
    public final String m44729a() {
        return this.f45453a;
    }

    /* renamed from: b */
    public final boolean m44730b() {
        return this.f45454b;
    }

    /* renamed from: c */
    public final int m44731c() {
        return this.f45456d;
    }

    /* renamed from: d */
    public final boolean m44732d() {
        return this.f45455c;
    }

    /* renamed from: e */
    public final void m44733e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45453a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8314k0)) {
            return false;
        }
        C8314k0 c8314k0 = (C8314k0) obj;
        return AbstractC19074t.m100204b(this.f45453a, c8314k0.f45453a) && this.f45454b == c8314k0.f45454b && this.f45455c == c8314k0.f45455c && this.f45456d == c8314k0.f45456d;
    }

    /* renamed from: f */
    public final void m44734f(boolean z11) {
        this.f45454b = z11;
    }

    /* renamed from: g */
    public final void m44735g(boolean z11) {
        this.f45455c = z11;
    }

    /* renamed from: h */
    public final void m44736h(int i11) {
        this.f45456d = i11;
    }

    public int hashCode() {
        return (((((this.f45453a.hashCode() * 31) + AbstractC2144f.m11520a(this.f45454b)) * 31) + AbstractC2144f.m11520a(this.f45455c)) * 31) + this.f45456d;
    }

    public String toString() {
        return "ConfigBindZInstantAds(feedId=" + this.f45453a + ", forceShowLayoutLoading=" + this.f45454b + ", isReloadState=" + this.f45455c + ", retryCount=" + this.f45456d + ")";
    }

    public /* synthetic */ C8314k0(String str, boolean z11, boolean z12, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? 0 : i11);
    }
}
