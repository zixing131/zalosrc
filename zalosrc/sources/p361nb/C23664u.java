package p361nb;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: nb.u */
/* loaded from: classes3.dex */
public final class C23664u extends C23669z {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private int f114632i;

    /* renamed from: j */
    private long f114633j;

    /* renamed from: k */
    private long f114634k;

    /* renamed from: l */
    private String f114635l;

    /* renamed from: m */
    private String f114636m;

    /* renamed from: n */
    private int f114637n;

    /* renamed from: o */
    private int f114638o;

    /* renamed from: p */
    private final int f114639p;

    /* renamed from: nb.u$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public /* synthetic */ C23664u(int i11, long j11, long j12, String str, String str2, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0L : j11, (i14 & 4) == 0 ? j12 : 0L, (i14 & 8) != 0 ? "" : str, (i14 & 16) == 0 ? str2 : "", (i14 & 32) != 0 ? 0 : i12, (i14 & 64) == 0 ? i13 : 0);
    }

    /* renamed from: g */
    private final boolean m123987g(int i11) {
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
        int i11;
        super.mo123889c();
        if (this.f114659f != null) {
            if (m123987g(0)) {
                String str2 = this.f114659f[0];
                AbstractC19074t.m100207e(str2, "get(...)");
                j11 = Long.parseLong(str2);
            } else {
                j11 = 0;
            }
            this.f114633j = j11;
            if (m123987g(1)) {
                String str3 = this.f114659f[1];
                AbstractC19074t.m100207e(str3, "get(...)");
                j12 = Long.parseLong(str3);
            } else {
                j12 = 1;
            }
            this.f114634k = j12;
            String str4 = "";
            if (!m123987g(2)) {
                str = "";
            } else {
                str = this.f114659f[2];
                AbstractC19074t.m100207e(str, "get(...)");
            }
            this.f114635l = str;
            if (m123987g(3)) {
                str4 = this.f114659f[3];
                AbstractC19074t.m100207e(str4, "get(...)");
            }
            this.f114636m = str4;
            int i12 = -1;
            if (m123987g(4)) {
                String str5 = this.f114659f[4];
                AbstractC19074t.m100207e(str5, "get(...)");
                i11 = Integer.parseInt(str5);
            } else {
                i11 = -1;
            }
            this.f114637n = i11;
            if (m123987g(5)) {
                String str6 = this.f114659f[5];
                AbstractC19074t.m100207e(str6, "get(...)");
                i12 = Integer.parseInt(str6);
            }
            this.f114638o = i12;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23664u)) {
            return false;
        }
        C23664u c23664u = (C23664u) obj;
        return this.f114632i == c23664u.f114632i && this.f114633j == c23664u.f114633j && this.f114634k == c23664u.f114634k && AbstractC19074t.m100204b(this.f114635l, c23664u.f114635l) && AbstractC19074t.m100204b(this.f114636m, c23664u.f114636m) && this.f114637n == c23664u.f114637n && this.f114638o == c23664u.f114638o;
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = this.f114659f;
        if (strArr != null && strArr.length >= this.f114639p) {
            strArr[0] = String.valueOf(this.f114633j);
            this.f114659f[1] = String.valueOf(this.f114634k);
            String[] strArr2 = this.f114659f;
            strArr2[2] = this.f114635l;
            strArr2[3] = this.f114636m;
            strArr2[4] = String.valueOf(this.f114637n);
            this.f114659f[5] = String.valueOf(this.f114638o);
        }
    }

    /* renamed from: h */
    public final void m123988h(long j11) {
        this.f114634k = j11;
    }

    public int hashCode() {
        return (((((((((((this.f114632i * 31) + AbstractC2147g0.m11521a(this.f114633j)) * 31) + AbstractC2147g0.m11521a(this.f114634k)) * 31) + this.f114635l.hashCode()) * 31) + this.f114636m.hashCode()) * 31) + this.f114637n) * 31) + this.f114638o;
    }

    @Override // p361nb.C23669z
    public String toString() {
        String str = this.f114635l;
        long j11 = this.f114634k;
        long j12 = this.f114633j;
        return "(storyId = " + str + ", duration = " + (j11 - j12) + ", startTime = " + j12 + ", endTime = " + j11 + ", storyOwnerId = " + this.f114636m + ", userIndex = " + this.f114637n + ", storyIndex = " + this.f114638o + ")";
    }

    public C23664u(int i11, long j11, long j12, String str, String str2, int i12, int i13) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(str2, "storyOwnerId");
        this.f114632i = i11;
        this.f114633j = j11;
        this.f114634k = j12;
        this.f114635l = str;
        this.f114636m = str2;
        this.f114637n = i12;
        this.f114638o = i13;
        this.f114639p = 6;
        this.f114654a = 15;
        this.f114658e = 6;
        String[] strArr = new String[6];
        for (int i14 = 0; i14 < 6; i14++) {
            strArr[i14] = "";
        }
        this.f114659f = strArr;
        this.f114657d = this.f114632i;
        this.f114655b = 1;
    }
}
