package p535u2;

import androidx.work.AbstractC2147g0;
import androidx.work.AbstractC2253u;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2258z;
import androidx.work.OverwritingInputMerger;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ln0.AbstractC22543l;
import p411p0.InterfaceC24593a;
import qm0.AbstractC25370t;

/* renamed from: u2.w */
/* loaded from: classes.dex */
public final class C26976w {

    /* renamed from: x */
    public static final a f127494x = new a(null);

    /* renamed from: y */
    private static final String f127495y;

    /* renamed from: z */
    public static final InterfaceC24593a f127496z;

    /* renamed from: a */
    public final String f127497a;

    /* renamed from: b */
    public C2149h0.c f127498b;

    /* renamed from: c */
    public String f127499c;

    /* renamed from: d */
    public String f127500d;

    /* renamed from: e */
    public C2148h f127501e;

    /* renamed from: f */
    public C2148h f127502f;

    /* renamed from: g */
    public long f127503g;

    /* renamed from: h */
    public long f127504h;

    /* renamed from: i */
    public long f127505i;

    /* renamed from: j */
    public C2142e f127506j;

    /* renamed from: k */
    public int f127507k;

    /* renamed from: l */
    public EnumC2134a f127508l;

    /* renamed from: m */
    public long f127509m;

    /* renamed from: n */
    public long f127510n;

    /* renamed from: o */
    public long f127511o;

    /* renamed from: p */
    public long f127512p;

    /* renamed from: q */
    public boolean f127513q;

    /* renamed from: r */
    public EnumC2258z f127514r;

    /* renamed from: s */
    private int f127515s;

    /* renamed from: t */
    private final int f127516t;

    /* renamed from: u */
    private long f127517u;

    /* renamed from: v */
    private int f127518v;

    /* renamed from: w */
    private final int f127519w;

    /* renamed from: u2.w$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final long m138988a(boolean z11, int i11, EnumC2134a enumC2134a, long j11, long j12, int i12, boolean z12, long j13, long j14, long j15, long j16) {
            long j17;
            long scalb;
            long m116585h;
            long m116581d;
            AbstractC19074t.m100208f(enumC2134a, "backoffPolicy");
            if (j16 != Long.MAX_VALUE && z12) {
                if (i12 != 0) {
                    m116581d = AbstractC22543l.m116581d(j16, 900000 + j12);
                    return m116581d;
                }
                return j16;
            }
            if (z11) {
                if (enumC2134a == EnumC2134a.LINEAR) {
                    scalb = i11 * j11;
                } else {
                    scalb = Math.scalb((float) j11, i11 - 1);
                }
                m116585h = AbstractC22543l.m116585h(scalb, 18000000L);
                return j12 + m116585h;
            }
            if (z12) {
                if (i12 == 0) {
                    j17 = j12 + j13;
                } else {
                    j17 = j12 + j15;
                }
                if (j14 != j15 && i12 == 0) {
                    j17 += j15 - j14;
                }
                return j17;
            }
            if (j12 == -1) {
                return Long.MAX_VALUE;
            }
            return j12 + j13;
        }
    }

    /* renamed from: u2.w$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public String f127520a;

        /* renamed from: b */
        public C2149h0.c f127521b;

        public b(String str, C2149h0.c cVar) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(cVar, "state");
            this.f127520a = str;
            this.f127521b = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f127520a, bVar.f127520a) && this.f127521b == bVar.f127521b;
        }

        public int hashCode() {
            return (this.f127520a.hashCode() * 31) + this.f127521b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f127520a + ", state=" + this.f127521b + ')';
        }
    }

    /* renamed from: u2.w$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private final String f127522a;

        /* renamed from: b */
        private final C2149h0.c f127523b;

        /* renamed from: c */
        private final C2148h f127524c;

        /* renamed from: d */
        private final long f127525d;

        /* renamed from: e */
        private final long f127526e;

        /* renamed from: f */
        private final long f127527f;

        /* renamed from: g */
        private final C2142e f127528g;

        /* renamed from: h */
        private final int f127529h;

        /* renamed from: i */
        private EnumC2134a f127530i;

        /* renamed from: j */
        private long f127531j;

        /* renamed from: k */
        private long f127532k;

        /* renamed from: l */
        private int f127533l;

        /* renamed from: m */
        private final int f127534m;

        /* renamed from: n */
        private final long f127535n;

        /* renamed from: o */
        private final int f127536o;

        /* renamed from: p */
        private final List f127537p;

        /* renamed from: q */
        private final List f127538q;

        public c(String str, C2149h0.c cVar, C2148h c2148h, long j11, long j12, long j13, C2142e c2142e, int i11, EnumC2134a enumC2134a, long j14, long j15, int i12, int i13, long j16, int i14, List list, List list2) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(cVar, "state");
            AbstractC19074t.m100208f(c2148h, "output");
            AbstractC19074t.m100208f(c2142e, "constraints");
            AbstractC19074t.m100208f(enumC2134a, "backoffPolicy");
            AbstractC19074t.m100208f(list, "tags");
            AbstractC19074t.m100208f(list2, "progress");
            this.f127522a = str;
            this.f127523b = cVar;
            this.f127524c = c2148h;
            this.f127525d = j11;
            this.f127526e = j12;
            this.f127527f = j13;
            this.f127528g = c2142e;
            this.f127529h = i11;
            this.f127530i = enumC2134a;
            this.f127531j = j14;
            this.f127532k = j15;
            this.f127533l = i12;
            this.f127534m = i13;
            this.f127535n = j16;
            this.f127536o = i14;
            this.f127537p = list;
            this.f127538q = list2;
        }

        /* renamed from: a */
        private final long m138989a() {
            if (this.f127523b == C2149h0.c.ENQUEUED) {
                return C26976w.f127494x.m138988a(m138991c(), this.f127529h, this.f127530i, this.f127531j, this.f127532k, this.f127533l, m138992d(), this.f127525d, this.f127527f, this.f127526e, this.f127535n);
            }
            return Long.MAX_VALUE;
        }

        /* renamed from: b */
        private final C2149h0.b m138990b() {
            long j11 = this.f127526e;
            if (j11 != 0) {
                return new C2149h0.b(j11, this.f127527f);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m138991c() {
            if (this.f127523b == C2149h0.c.ENQUEUED && this.f127529h > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m138992d() {
            return this.f127526e != 0;
        }

        /* renamed from: e */
        public final C2149h0 m138993e() {
            C2148h c2148h;
            if (!this.f127538q.isEmpty()) {
                c2148h = (C2148h) this.f127538q.get(0);
            } else {
                c2148h = C2148h.f9115c;
            }
            C2148h c2148h2 = c2148h;
            UUID fromString = UUID.fromString(this.f127522a);
            AbstractC19074t.m100207e(fromString, "fromString(id)");
            C2149h0.c cVar = this.f127523b;
            HashSet hashSet = new HashSet(this.f127537p);
            C2148h c2148h3 = this.f127524c;
            AbstractC19074t.m100207e(c2148h2, "progress");
            return new C2149h0(fromString, cVar, hashSet, c2148h3, c2148h2, this.f127529h, this.f127534m, this.f127528g, this.f127525d, m138990b(), m138989a(), this.f127536o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f127522a, cVar.f127522a) && this.f127523b == cVar.f127523b && AbstractC19074t.m100204b(this.f127524c, cVar.f127524c) && this.f127525d == cVar.f127525d && this.f127526e == cVar.f127526e && this.f127527f == cVar.f127527f && AbstractC19074t.m100204b(this.f127528g, cVar.f127528g) && this.f127529h == cVar.f127529h && this.f127530i == cVar.f127530i && this.f127531j == cVar.f127531j && this.f127532k == cVar.f127532k && this.f127533l == cVar.f127533l && this.f127534m == cVar.f127534m && this.f127535n == cVar.f127535n && this.f127536o == cVar.f127536o && AbstractC19074t.m100204b(this.f127537p, cVar.f127537p) && AbstractC19074t.m100204b(this.f127538q, cVar.f127538q);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f127522a.hashCode() * 31) + this.f127523b.hashCode()) * 31) + this.f127524c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f127525d)) * 31) + AbstractC2147g0.m11521a(this.f127526e)) * 31) + AbstractC2147g0.m11521a(this.f127527f)) * 31) + this.f127528g.hashCode()) * 31) + this.f127529h) * 31) + this.f127530i.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f127531j)) * 31) + AbstractC2147g0.m11521a(this.f127532k)) * 31) + this.f127533l) * 31) + this.f127534m) * 31) + AbstractC2147g0.m11521a(this.f127535n)) * 31) + this.f127536o) * 31) + this.f127537p.hashCode()) * 31) + this.f127538q.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f127522a + ", state=" + this.f127523b + ", output=" + this.f127524c + ", initialDelay=" + this.f127525d + ", intervalDuration=" + this.f127526e + ", flexDuration=" + this.f127527f + ", constraints=" + this.f127528g + ", runAttemptCount=" + this.f127529h + ", backoffPolicy=" + this.f127530i + ", backoffDelayDuration=" + this.f127531j + ", lastEnqueueTime=" + this.f127532k + ", periodCount=" + this.f127533l + ", generation=" + this.f127534m + ", nextScheduleTimeOverride=" + this.f127535n + ", stopReason=" + this.f127536o + ", tags=" + this.f127537p + ", progress=" + this.f127538q + ')';
        }
    }

    static {
        String m11897i = AbstractC2253u.m11897i("WorkSpec");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"WorkSpec\")");
        f127495y = m11897i;
        f127496z = new InterfaceC24593a() { // from class: u2.v
            @Override // p411p0.InterfaceC24593a
            public final Object apply(Object obj) {
                List m138971b;
                m138971b = C26976w.m138971b((List) obj);
                return m138971b;
            }
        };
    }

    public C26976w(String str, C2149h0.c cVar, String str2, String str3, C2148h c2148h, C2148h c2148h2, long j11, long j12, long j13, C2142e c2142e, int i11, EnumC2134a enumC2134a, long j14, long j15, long j16, long j17, boolean z11, EnumC2258z enumC2258z, int i12, int i13, long j18, int i14, int i15) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(cVar, "state");
        AbstractC19074t.m100208f(str2, "workerClassName");
        AbstractC19074t.m100208f(str3, "inputMergerClassName");
        AbstractC19074t.m100208f(c2148h, "input");
        AbstractC19074t.m100208f(c2148h2, "output");
        AbstractC19074t.m100208f(c2142e, "constraints");
        AbstractC19074t.m100208f(enumC2134a, "backoffPolicy");
        AbstractC19074t.m100208f(enumC2258z, "outOfQuotaPolicy");
        this.f127497a = str;
        this.f127498b = cVar;
        this.f127499c = str2;
        this.f127500d = str3;
        this.f127501e = c2148h;
        this.f127502f = c2148h2;
        this.f127503g = j11;
        this.f127504h = j12;
        this.f127505i = j13;
        this.f127506j = c2142e;
        this.f127507k = i11;
        this.f127508l = enumC2134a;
        this.f127509m = j14;
        this.f127510n = j15;
        this.f127511o = j16;
        this.f127512p = j17;
        this.f127513q = z11;
        this.f127514r = enumC2258z;
        this.f127515s = i12;
        this.f127516t = i13;
        this.f127517u = j18;
        this.f127518v = i14;
        this.f127519w = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final List m138971b(List list) {
        int m131511r;
        if (list != null) {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((c) it.next()).m138993e());
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: e */
    public static /* synthetic */ C26976w m138972e(C26976w c26976w, String str, C2149h0.c cVar, String str2, String str3, C2148h c2148h, C2148h c2148h2, long j11, long j12, long j13, C2142e c2142e, int i11, EnumC2134a enumC2134a, long j14, long j15, long j16, long j17, boolean z11, EnumC2258z enumC2258z, int i12, int i13, long j18, int i14, int i15, int i16, Object obj) {
        String str4 = (i16 & 1) != 0 ? c26976w.f127497a : str;
        C2149h0.c cVar2 = (i16 & 2) != 0 ? c26976w.f127498b : cVar;
        String str5 = (i16 & 4) != 0 ? c26976w.f127499c : str2;
        String str6 = (i16 & 8) != 0 ? c26976w.f127500d : str3;
        C2148h c2148h3 = (i16 & 16) != 0 ? c26976w.f127501e : c2148h;
        C2148h c2148h4 = (i16 & 32) != 0 ? c26976w.f127502f : c2148h2;
        long j19 = (i16 & 64) != 0 ? c26976w.f127503g : j11;
        long j21 = (i16 & 128) != 0 ? c26976w.f127504h : j12;
        long j22 = (i16 & 256) != 0 ? c26976w.f127505i : j13;
        C2142e c2142e2 = (i16 & 512) != 0 ? c26976w.f127506j : c2142e;
        return c26976w.m138974d(str4, cVar2, str5, str6, c2148h3, c2148h4, j19, j21, j22, c2142e2, (i16 & 1024) != 0 ? c26976w.f127507k : i11, (i16 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c26976w.f127508l : enumC2134a, (i16 & 4096) != 0 ? c26976w.f127509m : j14, (i16 & 8192) != 0 ? c26976w.f127510n : j15, (i16 & 16384) != 0 ? c26976w.f127511o : j16, (i16 & 32768) != 0 ? c26976w.f127512p : j17, (i16 & 65536) != 0 ? c26976w.f127513q : z11, (131072 & i16) != 0 ? c26976w.f127514r : enumC2258z, (i16 & 262144) != 0 ? c26976w.f127515s : i12, (i16 & 524288) != 0 ? c26976w.f127516t : i13, (i16 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? c26976w.f127517u : j18, (i16 & 2097152) != 0 ? c26976w.f127518v : i14, (i16 & 4194304) != 0 ? c26976w.f127519w : i15);
    }

    /* renamed from: c */
    public final long m138973c() {
        return f127494x.m138988a(m138981l(), this.f127507k, this.f127508l, this.f127509m, this.f127510n, this.f127515s, m138982m(), this.f127503g, this.f127505i, this.f127504h, this.f127517u);
    }

    /* renamed from: d */
    public final C26976w m138974d(String str, C2149h0.c cVar, String str2, String str3, C2148h c2148h, C2148h c2148h2, long j11, long j12, long j13, C2142e c2142e, int i11, EnumC2134a enumC2134a, long j14, long j15, long j16, long j17, boolean z11, EnumC2258z enumC2258z, int i12, int i13, long j18, int i14, int i15) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(cVar, "state");
        AbstractC19074t.m100208f(str2, "workerClassName");
        AbstractC19074t.m100208f(str3, "inputMergerClassName");
        AbstractC19074t.m100208f(c2148h, "input");
        AbstractC19074t.m100208f(c2148h2, "output");
        AbstractC19074t.m100208f(c2142e, "constraints");
        AbstractC19074t.m100208f(enumC2134a, "backoffPolicy");
        AbstractC19074t.m100208f(enumC2258z, "outOfQuotaPolicy");
        return new C26976w(str, cVar, str2, str3, c2148h, c2148h2, j11, j12, j13, c2142e, i11, enumC2134a, j14, j15, j16, j17, z11, enumC2258z, i12, i13, j18, i14, i15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26976w)) {
            return false;
        }
        C26976w c26976w = (C26976w) obj;
        return AbstractC19074t.m100204b(this.f127497a, c26976w.f127497a) && this.f127498b == c26976w.f127498b && AbstractC19074t.m100204b(this.f127499c, c26976w.f127499c) && AbstractC19074t.m100204b(this.f127500d, c26976w.f127500d) && AbstractC19074t.m100204b(this.f127501e, c26976w.f127501e) && AbstractC19074t.m100204b(this.f127502f, c26976w.f127502f) && this.f127503g == c26976w.f127503g && this.f127504h == c26976w.f127504h && this.f127505i == c26976w.f127505i && AbstractC19074t.m100204b(this.f127506j, c26976w.f127506j) && this.f127507k == c26976w.f127507k && this.f127508l == c26976w.f127508l && this.f127509m == c26976w.f127509m && this.f127510n == c26976w.f127510n && this.f127511o == c26976w.f127511o && this.f127512p == c26976w.f127512p && this.f127513q == c26976w.f127513q && this.f127514r == c26976w.f127514r && this.f127515s == c26976w.f127515s && this.f127516t == c26976w.f127516t && this.f127517u == c26976w.f127517u && this.f127518v == c26976w.f127518v && this.f127519w == c26976w.f127519w;
    }

    /* renamed from: f */
    public final int m138975f() {
        return this.f127516t;
    }

    /* renamed from: g */
    public final long m138976g() {
        return this.f127517u;
    }

    /* renamed from: h */
    public final int m138977h() {
        return this.f127518v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f127497a.hashCode() * 31) + this.f127498b.hashCode()) * 31) + this.f127499c.hashCode()) * 31) + this.f127500d.hashCode()) * 31) + this.f127501e.hashCode()) * 31) + this.f127502f.hashCode()) * 31) + AbstractC26974u.m138969a(this.f127503g)) * 31) + AbstractC26974u.m138969a(this.f127504h)) * 31) + AbstractC26974u.m138969a(this.f127505i)) * 31) + this.f127506j.hashCode()) * 31) + this.f127507k) * 31) + this.f127508l.hashCode()) * 31) + AbstractC26974u.m138969a(this.f127509m)) * 31) + AbstractC26974u.m138969a(this.f127510n)) * 31) + AbstractC26974u.m138969a(this.f127511o)) * 31) + AbstractC26974u.m138969a(this.f127512p)) * 31;
        boolean z11 = this.f127513q;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((((((((((((hashCode + i11) * 31) + this.f127514r.hashCode()) * 31) + this.f127515s) * 31) + this.f127516t) * 31) + AbstractC26974u.m138969a(this.f127517u)) * 31) + this.f127518v) * 31) + this.f127519w;
    }

    /* renamed from: i */
    public final int m138978i() {
        return this.f127515s;
    }

    /* renamed from: j */
    public final int m138979j() {
        return this.f127519w;
    }

    /* renamed from: k */
    public final boolean m138980k() {
        return !AbstractC19074t.m100204b(C2142e.f9094j, this.f127506j);
    }

    /* renamed from: l */
    public final boolean m138981l() {
        if (this.f127498b == C2149h0.c.ENQUEUED && this.f127507k > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m138982m() {
        return this.f127504h != 0;
    }

    /* renamed from: n */
    public final void m138983n(long j11) {
        long m116589l;
        if (j11 > 18000000) {
            AbstractC2253u.m11895e().mo11905k(f127495y, "Backoff delay duration exceeds maximum value");
        }
        if (j11 < 10000) {
            AbstractC2253u.m11895e().mo11905k(f127495y, "Backoff delay duration less than minimum value");
        }
        m116589l = AbstractC22543l.m116589l(j11, 10000L, 18000000L);
        this.f127509m = m116589l;
    }

    /* renamed from: o */
    public final void m138984o(long j11) {
        this.f127517u = j11;
    }

    /* renamed from: p */
    public final void m138985p(int i11) {
        this.f127518v = i11;
    }

    /* renamed from: q */
    public final void m138986q(long j11) {
        long m116581d;
        long m116581d2;
        if (j11 < 900000) {
            AbstractC2253u.m11895e().mo11905k(f127495y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        m116581d = AbstractC22543l.m116581d(j11, 900000L);
        m116581d2 = AbstractC22543l.m116581d(j11, 900000L);
        m138987r(m116581d, m116581d2);
    }

    /* renamed from: r */
    public final void m138987r(long j11, long j12) {
        long m116581d;
        long m116589l;
        if (j11 < 900000) {
            AbstractC2253u.m11895e().mo11905k(f127495y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        m116581d = AbstractC22543l.m116581d(j11, 900000L);
        this.f127504h = m116581d;
        if (j12 < 300000) {
            AbstractC2253u.m11895e().mo11905k(f127495y, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j12 > this.f127504h) {
            AbstractC2253u.m11895e().mo11905k(f127495y, "Flex duration greater than interval duration; Changed to " + j11);
        }
        m116589l = AbstractC22543l.m116589l(j12, 300000L, this.f127504h);
        this.f127505i = m116589l;
    }

    public String toString() {
        return "{WorkSpec: " + this.f127497a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C26976w(String str, C2149h0.c cVar, String str2, String str3, C2148h c2148h, C2148h c2148h2, long j11, long j12, long j13, C2142e c2142e, int i11, EnumC2134a enumC2134a, long j14, long j15, long j16, long j17, boolean z11, EnumC2258z enumC2258z, int i12, int i13, long j18, int i14, int i15, int i16, AbstractC19060k abstractC19060k) {
        this(str, r4, str2, r6, r7, r8, (i16 & 64) != 0 ? 0L : j11, (i16 & 128) != 0 ? 0L : j12, (i16 & 256) != 0 ? 0L : j13, (i16 & 512) != 0 ? C2142e.f9094j : c2142e, (i16 & 1024) != 0 ? 0 : i11, (i16 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? EnumC2134a.EXPONENTIAL : enumC2134a, (i16 & 4096) != 0 ? 30000L : j14, (i16 & 8192) != 0 ? -1L : j15, (i16 & 16384) != 0 ? 0L : j16, (32768 & i16) != 0 ? -1L : j17, (65536 & i16) != 0 ? false : z11, (131072 & i16) != 0 ? EnumC2258z.RUN_AS_NON_EXPEDITED_WORK_REQUEST : enumC2258z, (262144 & i16) != 0 ? 0 : i12, (524288 & i16) != 0 ? 0 : i13, (1048576 & i16) != 0 ? Long.MAX_VALUE : j18, (2097152 & i16) != 0 ? 0 : i14, (i16 & 4194304) != 0 ? -256 : i15);
        String str4;
        C2148h c2148h3;
        C2148h c2148h4;
        C2149h0.c cVar2 = (i16 & 2) != 0 ? C2149h0.c.ENQUEUED : cVar;
        if ((i16 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            AbstractC19074t.m100207e(name, "OverwritingInputMerger::class.java.name");
            str4 = name;
        } else {
            str4 = str3;
        }
        if ((i16 & 16) != 0) {
            C2148h c2148h5 = C2148h.f9115c;
            AbstractC19074t.m100207e(c2148h5, "EMPTY");
            c2148h3 = c2148h5;
        } else {
            c2148h3 = c2148h;
        }
        if ((i16 & 32) != 0) {
            C2148h c2148h6 = C2148h.f9115c;
            AbstractC19074t.m100207e(c2148h6, "EMPTY");
            c2148h4 = c2148h6;
        } else {
            c2148h4 = c2148h2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26976w(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388602, null);
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26976w(String str, C26976w c26976w) {
        this(str, c26976w.f127498b, c26976w.f127499c, c26976w.f127500d, new C2148h(c26976w.f127501e), new C2148h(c26976w.f127502f), c26976w.f127503g, c26976w.f127504h, c26976w.f127505i, new C2142e(c26976w.f127506j), c26976w.f127507k, c26976w.f127508l, c26976w.f127509m, c26976w.f127510n, c26976w.f127511o, c26976w.f127512p, c26976w.f127513q, c26976w.f127514r, c26976w.f127515s, 0, c26976w.f127517u, c26976w.f127518v, c26976w.f127519w, 524288, null);
        AbstractC19074t.m100208f(str, "newId");
        AbstractC19074t.m100208f(c26976w, "other");
    }
}
