package p716zh;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.LinkedHashSet;

/* renamed from: zh.g4 */
/* loaded from: classes3.dex */
public final class C31927g4 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final boolean f146674a;

    /* renamed from: b */
    private final String f146675b;

    /* renamed from: c */
    private final int f146676c;

    /* renamed from: d */
    private final int f146677d;

    /* renamed from: e */
    private int f146678e;

    /* renamed from: f */
    private long f146679f;

    /* renamed from: g */
    private boolean f146680g;

    /* renamed from: h */
    private boolean f146681h;

    /* renamed from: i */
    private boolean f146682i;

    /* renamed from: j */
    private int f146683j;

    /* renamed from: k */
    private final LinkedHashSet f146684k;

    /* renamed from: zh.g4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C31927g4(boolean z11, String str, int i11, int i12, int i13, long j11, boolean z12) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f146674a = z11;
        this.f146675b = str;
        this.f146676c = i11;
        this.f146677d = i12;
        this.f146678e = i13;
        this.f146679f = j11;
        this.f146680g = z12;
        this.f146684k = new LinkedHashSet();
    }

    /* renamed from: a */
    public final LinkedHashSet m153389a() {
        return this.f146684k;
    }

    /* renamed from: b */
    public final int m153390b() {
        return this.f146677d;
    }

    /* renamed from: c */
    public final int m153391c() {
        return this.f146683j;
    }

    /* renamed from: d */
    public final boolean m153392d() {
        return this.f146680g;
    }

    /* renamed from: e */
    public final int m153393e() {
        return this.f146678e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31927g4)) {
            return false;
        }
        C31927g4 c31927g4 = (C31927g4) obj;
        return this.f146674a == c31927g4.f146674a && AbstractC19074t.m100204b(this.f146675b, c31927g4.f146675b) && this.f146676c == c31927g4.f146676c && this.f146677d == c31927g4.f146677d && this.f146678e == c31927g4.f146678e && this.f146679f == c31927g4.f146679f && this.f146680g == c31927g4.f146680g;
    }

    /* renamed from: f */
    public final String m153394f() {
        return this.f146675b;
    }

    /* renamed from: g */
    public final long m153395g() {
        return this.f146679f;
    }

    /* renamed from: h */
    public final int m153396h() {
        return this.f146676c;
    }

    public int hashCode() {
        return (((((((((((AbstractC2144f.m11520a(this.f146674a) * 31) + this.f146675b.hashCode()) * 31) + this.f146676c) * 31) + this.f146677d) * 31) + this.f146678e) * 31) + AbstractC2147g0.m11521a(this.f146679f)) * 31) + AbstractC2144f.m11520a(this.f146680g);
    }

    /* renamed from: i */
    public final boolean m153397i() {
        return this.f146674a;
    }

    /* renamed from: j */
    public final boolean m153398j() {
        return this.f146682i;
    }

    /* renamed from: k */
    public final boolean m153399k() {
        return this.f146681h;
    }

    /* renamed from: l */
    public final boolean m153400l(boolean z11, String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "threadId");
        if (this.f146674a == z11 && AbstractC19074t.m100204b(this.f146675b, str) && this.f146676c == i11 && this.f146677d == i12) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m153401m(int i11) {
        this.f146683j = i11;
    }

    /* renamed from: n */
    public final void m153402n(boolean z11) {
        this.f146680g = z11;
    }

    /* renamed from: o */
    public final void m153403o(boolean z11) {
        this.f146682i = z11;
    }

    /* renamed from: p */
    public final void m153404p(boolean z11) {
        this.f146681h = z11;
    }

    /* renamed from: q */
    public final void m153405q(int i11) {
        this.f146678e = i11;
    }

    /* renamed from: r */
    public final void m153406r(long j11) {
        this.f146679f = j11;
    }

    public String toString() {
        return "E2eeSession(isGroup=" + this.f146674a + ", threadId=" + this.f146675b + ", uid=" + this.f146676c + ", deviceId=" + this.f146677d + ", state=" + this.f146678e + ", timestamp=" + this.f146679f + ", hasSentInitSuccess=" + this.f146680g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C31927g4(boolean z11, String str, int i11, int i12, int i13, long j11, boolean z12, int i14, AbstractC19060k abstractC19060k) {
        this(z11, str, i11, i12, i13, j11, r9);
        boolean z13;
        if ((i14 & 64) != 0) {
            z13 = i13 >= 4;
        } else {
            z13 = z12;
        }
    }
}
