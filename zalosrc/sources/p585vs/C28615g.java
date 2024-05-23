package p585vs;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: vs.g */
/* loaded from: classes4.dex */
public final class C28615g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f132678a;

    /* renamed from: b */
    private int f132679b;

    /* renamed from: c */
    private int f132680c;

    /* renamed from: d */
    private long f132681d;

    /* renamed from: e */
    private long f132682e;

    /* renamed from: f */
    private int f132683f;

    /* renamed from: g */
    private int f132684g;

    /* renamed from: h */
    private int f132685h;

    /* renamed from: i */
    private int f132686i;

    /* renamed from: j */
    private String f132687j;

    /* renamed from: k */
    private int f132688k;

    /* renamed from: vs.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28615g(String str, int i11, int i12, long j11, long j12, int i13, int i14, int i15, int i16, String str2) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "sessionId");
        this.f132678a = str;
        this.f132679b = i11;
        this.f132680c = i12;
        this.f132681d = j11;
        this.f132682e = j12;
        this.f132683f = i13;
        this.f132684g = i14;
        this.f132685h = i15;
        this.f132686i = i16;
        this.f132687j = str2;
    }

    /* renamed from: a */
    public final int m143100a() {
        return this.f132688k;
    }

    /* renamed from: b */
    public final long m143101b() {
        return this.f132682e;
    }

    /* renamed from: c */
    public final int m143102c() {
        return this.f132679b;
    }

    /* renamed from: d */
    public final int m143103d() {
        return this.f132685h;
    }

    /* renamed from: e */
    public final String m143104e() {
        return this.f132687j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28615g)) {
            return false;
        }
        C28615g c28615g = (C28615g) obj;
        return AbstractC19074t.m100204b(this.f132678a, c28615g.f132678a) && this.f132679b == c28615g.f132679b && this.f132680c == c28615g.f132680c && this.f132681d == c28615g.f132681d && this.f132682e == c28615g.f132682e && this.f132683f == c28615g.f132683f && this.f132684g == c28615g.f132684g && this.f132685h == c28615g.f132685h && this.f132686i == c28615g.f132686i && AbstractC19074t.m100204b(this.f132687j, c28615g.f132687j);
    }

    /* renamed from: f */
    public final long m143105f() {
        return this.f132681d;
    }

    /* renamed from: g */
    public final int m143106g() {
        return this.f132686i;
    }

    /* renamed from: h */
    public final String m143107h() {
        return this.f132678a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f132678a.hashCode() * 31) + this.f132679b) * 31) + this.f132680c) * 31) + AbstractC2147g0.m11521a(this.f132681d)) * 31) + AbstractC2147g0.m11521a(this.f132682e)) * 31) + this.f132683f) * 31) + this.f132684g) * 31) + this.f132685h) * 31) + this.f132686i) * 31) + this.f132687j.hashCode();
    }

    /* renamed from: i */
    public final int m143108i() {
        return this.f132684g;
    }

    /* renamed from: j */
    public final int m143109j() {
        return this.f132683f;
    }

    /* renamed from: k */
    public final int m143110k() {
        return this.f132680c;
    }

    /* renamed from: l */
    public final void m143111l(int i11) {
        this.f132688k = i11;
    }

    /* renamed from: m */
    public final void m143112m(long j11) {
        this.f132682e = j11;
    }

    /* renamed from: n */
    public final void m143113n(int i11) {
        this.f132685h = i11;
    }

    /* renamed from: o */
    public final void m143114o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f132687j = str;
    }

    /* renamed from: p */
    public final void m143115p(int i11) {
        this.f132686i = i11;
    }

    /* renamed from: q */
    public final void m143116q(int i11) {
        this.f132684g = i11;
    }

    /* renamed from: r */
    public final void m143117r(int i11) {
        this.f132680c = i11;
    }

    public String toString() {
        return "SyncCloudMsgInfo(threadId=" + this.f132678a + ", numMember=" + this.f132679b + ", totalSessionLoad=" + this.f132680c + ", startTimeSync=" + this.f132681d + ", endTimeSync=" + this.f132682e + ", totalMsgStartSync=" + this.f132683f + ", totalMsgEndSync=" + this.f132684g + ", numMsgLoaded=" + this.f132685h + ", stateLoad=" + this.f132686i + ", sessionId=" + this.f132687j + ")";
    }
}
