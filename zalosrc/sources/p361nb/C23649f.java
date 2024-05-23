package p361nb;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: nb.f */
/* loaded from: classes3.dex */
public final class C23649f {

    /* renamed from: a */
    private final String f114570a;

    /* renamed from: b */
    private final long f114571b;

    /* renamed from: c */
    private final int f114572c;

    /* renamed from: d */
    private final int f114573d;

    /* renamed from: e */
    private final long f114574e;

    /* renamed from: f */
    private final boolean f114575f;

    /* renamed from: g */
    private String f114576g;

    /* renamed from: h */
    private boolean f114577h;

    /* renamed from: i */
    private boolean f114578i;

    public C23649f(String str, long j11, int i11, int i12, long j12, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f114570a = str;
        this.f114571b = j11;
        this.f114572c = i11;
        this.f114573d = i12;
        this.f114574e = j12;
        this.f114575f = z11;
    }

    /* renamed from: a */
    public final int m123933a() {
        return this.f114572c;
    }

    /* renamed from: b */
    public final int m123934b() {
        return this.f114573d;
    }

    /* renamed from: c */
    public final String m123935c() {
        return this.f114576g;
    }

    /* renamed from: d */
    public final String m123936d() {
        return this.f114570a;
    }

    /* renamed from: e */
    public final long m123937e() {
        return this.f114571b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23649f)) {
            return false;
        }
        C23649f c23649f = (C23649f) obj;
        return AbstractC19074t.m100204b(this.f114570a, c23649f.f114570a) && this.f114571b == c23649f.f114571b && this.f114572c == c23649f.f114572c && this.f114573d == c23649f.f114573d && this.f114574e == c23649f.f114574e && this.f114575f == c23649f.f114575f;
    }

    /* renamed from: f */
    public final long m123938f() {
        return this.f114574e;
    }

    /* renamed from: g */
    public final boolean m123939g() {
        return this.f114575f;
    }

    /* renamed from: h */
    public final boolean m123940h() {
        return this.f114578i;
    }

    public int hashCode() {
        return (((((((((this.f114570a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f114571b)) * 31) + this.f114572c) * 31) + this.f114573d) * 31) + AbstractC2147g0.m11521a(this.f114574e)) * 31) + AbstractC2144f.m11520a(this.f114575f);
    }

    /* renamed from: i */
    public final boolean m123941i() {
        return this.f114577h;
    }

    /* renamed from: j */
    public final void m123942j(boolean z11) {
        this.f114578i = z11;
    }

    /* renamed from: k */
    public final void m123943k(String str) {
        this.f114576g = str;
    }

    /* renamed from: l */
    public final void m123944l(boolean z11) {
        this.f114577h = z11;
    }

    public String toString() {
        return "ActionLogV2Param(threadId=" + this.f114570a + ", timestamp=" + this.f114571b + ", chatType=" + this.f114572c + ", index=" + this.f114573d + ", ttl=" + this.f114574e + ", isE2ee=" + this.f114575f + ")";
    }

    public /* synthetic */ C23649f(String str, long j11, int i11, int i12, long j12, boolean z11, int i13, AbstractC19060k abstractC19060k) {
        this(str, j11, i11, (i13 & 8) != 0 ? -1 : i12, (i13 & 16) != 0 ? 0L : j12, (i13 & 32) != 0 ? false : z11);
    }
}
