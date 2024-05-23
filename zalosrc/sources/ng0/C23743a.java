package ng0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: ng0.a */
/* loaded from: classes7.dex */
public final class C23743a {

    /* renamed from: a */
    private boolean f114845a;

    /* renamed from: b */
    private int f114846b;

    /* renamed from: c */
    private int f114847c;

    /* renamed from: d */
    private int f114848d;

    public C23743a(boolean z11, int i11, int i12, int i13) {
        this.f114845a = z11;
        this.f114846b = i11;
        this.f114847c = i12;
        this.f114848d = i13;
    }

    /* renamed from: a */
    public final int m124105a() {
        return this.f114848d;
    }

    /* renamed from: b */
    public final boolean m124106b() {
        return this.f114845a;
    }

    /* renamed from: c */
    public final int m124107c() {
        return this.f114847c;
    }

    /* renamed from: d */
    public final int m124108d() {
        return this.f114846b;
    }

    /* renamed from: e */
    public final void m124109e(int i11) {
        this.f114848d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23743a)) {
            return false;
        }
        C23743a c23743a = (C23743a) obj;
        return this.f114845a == c23743a.f114845a && this.f114846b == c23743a.f114846b && this.f114847c == c23743a.f114847c && this.f114848d == c23743a.f114848d;
    }

    /* renamed from: f */
    public final void m124110f(boolean z11) {
        this.f114845a = z11;
    }

    /* renamed from: g */
    public final void m124111g(int i11) {
        this.f114847c = i11;
    }

    /* renamed from: h */
    public final void m124112h(int i11) {
        this.f114846b = i11;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f114845a) * 31) + this.f114846b) * 31) + this.f114847c) * 31) + this.f114848d;
    }

    public String toString() {
        return "enable: " + this.f114845a + ", strongWarningThreshold: " + this.f114846b + ", mediumWarningThreshold: " + this.f114847c + ", bannerShowInterval: " + this.f114848d;
    }

    public /* synthetic */ C23743a(boolean z11, int i11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
