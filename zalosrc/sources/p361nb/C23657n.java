package p361nb;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: nb.n */
/* loaded from: classes3.dex */
public final class C23657n extends C23669z {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private long f114602i;

    /* renamed from: j */
    private long f114603j;

    /* renamed from: k */
    private String f114604k;

    /* renamed from: l */
    private String f114605l;

    /* renamed from: m */
    private String f114606m;

    /* renamed from: n */
    private int f114607n;

    /* renamed from: o */
    private int f114608o;

    /* renamed from: p */
    private String f114609p;

    /* renamed from: q */
    private final int f114610q;

    /* renamed from: nb.n$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C23657n() {
        this(0L, 0L, null, null, null, 0, 0, null, 255, null);
    }

    /* renamed from: i */
    private final boolean m123974i(int i11) {
        String[] strArr = this.f114659f;
        if (strArr != null && strArr.length > i11 && strArr[i11] != null) {
            return true;
        }
        return false;
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        long j11;
        long j12;
        String str;
        String str2;
        String str3;
        int i11;
        super.mo123889c();
        if (this.f114659f != null) {
            if (m123974i(0)) {
                String str4 = this.f114659f[0];
                AbstractC19074t.m100207e(str4, "get(...)");
                j11 = Long.parseLong(str4);
            } else {
                j11 = 0;
            }
            this.f114602i = j11;
            if (m123974i(1)) {
                String str5 = this.f114659f[1];
                AbstractC19074t.m100207e(str5, "get(...)");
                j12 = Long.parseLong(str5);
            } else {
                j12 = 1;
            }
            this.f114603j = j12;
            String str6 = "";
            if (!m123974i(2)) {
                str = "";
            } else {
                str = this.f114659f[2];
                AbstractC19074t.m100207e(str, "get(...)");
            }
            this.f114604k = str;
            if (!m123974i(3)) {
                str2 = "";
            } else {
                str2 = this.f114659f[3];
                AbstractC19074t.m100207e(str2, "get(...)");
            }
            this.f114605l = str2;
            if (!m123974i(4)) {
                str3 = "";
            } else {
                str3 = this.f114659f[4];
                AbstractC19074t.m100207e(str3, "get(...)");
            }
            this.f114606m = str3;
            if (m123974i(5)) {
                String str7 = this.f114659f[5];
                AbstractC19074t.m100207e(str7, "get(...)");
                i11 = Integer.parseInt(str7);
            } else {
                i11 = -1;
            }
            this.f114608o = i11;
            if (m123974i(6)) {
                str6 = this.f114659f[6];
                AbstractC19074t.m100207e(str6, "get(...)");
            }
            this.f114609p = str6;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23657n)) {
            return false;
        }
        C23657n c23657n = (C23657n) obj;
        return this.f114602i == c23657n.f114602i && this.f114603j == c23657n.f114603j && AbstractC19074t.m100204b(this.f114604k, c23657n.f114604k) && AbstractC19074t.m100204b(this.f114605l, c23657n.f114605l) && AbstractC19074t.m100204b(this.f114606m, c23657n.f114606m) && this.f114607n == c23657n.f114607n && this.f114608o == c23657n.f114608o && AbstractC19074t.m100204b(this.f114609p, c23657n.f114609p);
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = this.f114659f;
        if (strArr != null && strArr.length >= this.f114610q) {
            strArr[0] = String.valueOf(this.f114602i);
            this.f114659f[1] = String.valueOf(this.f114603j);
            String[] strArr2 = this.f114659f;
            strArr2[2] = this.f114604k;
            strArr2[3] = this.f114605l;
            strArr2[4] = this.f114606m;
            strArr2[5] = String.valueOf(this.f114608o);
            this.f114659f[6] = this.f114609p;
        }
    }

    /* renamed from: g */
    public final String m123975g() {
        return this.f114604k;
    }

    /* renamed from: h */
    public final String m123976h() {
        return this.f114605l;
    }

    public int hashCode() {
        return (((((((((((((AbstractC2147g0.m11521a(this.f114602i) * 31) + AbstractC2147g0.m11521a(this.f114603j)) * 31) + this.f114604k.hashCode()) * 31) + this.f114605l.hashCode()) * 31) + this.f114606m.hashCode()) * 31) + this.f114607n) * 31) + this.f114608o) * 31) + this.f114609p.hashCode();
    }

    /* renamed from: j */
    public final void m123977j(long j11) {
        this.f114603j = j11;
    }

    /* renamed from: k */
    public final void m123978k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f114609p = str;
    }

    @Override // p361nb.C23669z
    public String toString() {
        String str = this.f114604k;
        long j11 = this.f114603j;
        long j12 = this.f114602i;
        return "(feedId = " + str + ", duration = " + (j11 - j12) + ", startTime = " + j12 + ", endTime = " + j11 + ", feedType = " + this.f114605l + ", feedOwnerId = " + this.f114606m + ", feedIndex = " + this.f114608o + ", extendInfo = " + this.f114609p + ", source_type=" + this.f114607n + ")";
    }

    public /* synthetic */ C23657n(long j11, long j12, String str, String str2, String str3, int i11, int i12, String str4, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0L : j11, (i13 & 2) == 0 ? j12 : 0L, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? -1 : i12, (i13 & 128) == 0 ? str4 : "");
    }

    public C23657n(long j11, long j12, String str, String str2, String str3, int i11, int i12, String str4) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "feedType");
        AbstractC19074t.m100208f(str3, "feedOwnerId");
        AbstractC19074t.m100208f(str4, "extendInfo");
        this.f114602i = j11;
        this.f114603j = j12;
        this.f114604k = str;
        this.f114605l = str2;
        this.f114606m = str3;
        this.f114607n = i11;
        this.f114608o = i12;
        this.f114609p = str4;
        this.f114610q = 7;
        this.f114654a = 11;
        this.f114658e = 7;
        String[] strArr = new String[7];
        for (int i13 = 0; i13 < 7; i13++) {
            strArr[i13] = "";
        }
        this.f114659f = strArr;
        this.f114657d = this.f114607n;
        this.f114655b = 1;
    }
}
