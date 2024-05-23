package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k3 */
/* loaded from: classes2.dex */
public final class C4671k3 {

    /* renamed from: G */
    private static final C4671k3 f23080G = new C4671k3(new C5004t1());

    /* renamed from: H */
    public static final g94 f23081H = C4373c0.f18063a;

    /* renamed from: A */
    public final int f23082A;

    /* renamed from: B */
    public final int f23083B;

    /* renamed from: C */
    public final int f23084C;

    /* renamed from: D */
    public final int f23085D;

    /* renamed from: E */
    public final int f23086E;

    /* renamed from: F */
    private int f23087F;

    /* renamed from: a */
    public final String f23088a;

    /* renamed from: b */
    public final String f23089b;

    /* renamed from: c */
    public final String f23090c;

    /* renamed from: d */
    public final int f23091d;

    /* renamed from: e */
    public final int f23092e;

    /* renamed from: f */
    public final int f23093f;

    /* renamed from: g */
    public final int f23094g;

    /* renamed from: h */
    public final int f23095h;

    /* renamed from: i */
    public final String f23096i;

    /* renamed from: j */
    public final zzbq f23097j;

    /* renamed from: k */
    public final String f23098k;

    /* renamed from: l */
    public final String f23099l;

    /* renamed from: m */
    public final int f23100m;

    /* renamed from: n */
    public final List f23101n;

    /* renamed from: o */
    public final zzx f23102o;

    /* renamed from: p */
    public final long f23103p;

    /* renamed from: q */
    public final int f23104q;

    /* renamed from: r */
    public final int f23105r;

    /* renamed from: s */
    public final float f23106s;

    /* renamed from: t */
    public final int f23107t;

    /* renamed from: u */
    public final float f23108u;

    /* renamed from: v */
    public final byte[] f23109v;

    /* renamed from: w */
    public final int f23110w;

    /* renamed from: x */
    public final sc4 f23111x;

    /* renamed from: y */
    public final int f23112y;

    /* renamed from: z */
    public final int f23113z;

    public /* synthetic */ C4671k3(C5004t1 c5004t1, AbstractC4670k2 abstractC4670k2) {
        this(c5004t1);
    }

    /* renamed from: a */
    public final int m23808a() {
        int i11;
        int i12 = this.f23104q;
        if (i12 == -1 || (i11 = this.f23105r) == -1) {
            return -1;
        }
        return i12 * i11;
    }

    /* renamed from: b */
    public final C5004t1 m23809b() {
        return new C5004t1(this, null);
    }

    /* renamed from: c */
    public final C4671k3 m23810c(int i11) {
        C5004t1 c5004t1 = new C5004t1(this, null);
        c5004t1.m26499a(i11);
        return new C4671k3(c5004t1);
    }

    /* renamed from: d */
    public final boolean m23811d(C4671k3 c4671k3) {
        if (this.f23101n.size() != c4671k3.f23101n.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f23101n.size(); i11++) {
            if (!Arrays.equals((byte[]) this.f23101n.get(i11), (byte[]) c4671k3.f23101n.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj != null && C4671k3.class == obj.getClass()) {
            C4671k3 c4671k3 = (C4671k3) obj;
            int i12 = this.f23087F;
            if ((i12 == 0 || (i11 = c4671k3.f23087F) == 0 || i12 == i11) && this.f23091d == c4671k3.f23091d && this.f23093f == c4671k3.f23093f && this.f23094g == c4671k3.f23094g && this.f23100m == c4671k3.f23100m && this.f23103p == c4671k3.f23103p && this.f23104q == c4671k3.f23104q && this.f23105r == c4671k3.f23105r && this.f23107t == c4671k3.f23107t && this.f23110w == c4671k3.f23110w && this.f23112y == c4671k3.f23112y && this.f23113z == c4671k3.f23113z && this.f23082A == c4671k3.f23082A && this.f23083B == c4671k3.f23083B && this.f23084C == c4671k3.f23084C && this.f23085D == c4671k3.f23085D && this.f23086E == c4671k3.f23086E && Float.compare(this.f23106s, c4671k3.f23106s) == 0 && Float.compare(this.f23108u, c4671k3.f23108u) == 0 && g92.m22362t(this.f23088a, c4671k3.f23088a) && g92.m22362t(this.f23089b, c4671k3.f23089b) && g92.m22362t(this.f23096i, c4671k3.f23096i) && g92.m22362t(this.f23098k, c4671k3.f23098k) && g92.m22362t(this.f23099l, c4671k3.f23099l) && g92.m22362t(this.f23090c, c4671k3.f23090c) && Arrays.equals(this.f23109v, c4671k3.f23109v) && g92.m22362t(this.f23097j, c4671k3.f23097j) && g92.m22362t(this.f23111x, c4671k3.f23111x) && g92.m22362t(this.f23102o, c4671k3.f23102o) && m23811d(c4671k3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i11;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i12 = this.f23087F;
        if (i12 == 0) {
            String str = this.f23088a;
            int i13 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i14 = (hashCode + 527) * 31;
            String str2 = this.f23089b;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 31;
            String str3 = this.f23090c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i16 = (((((((i15 + hashCode2) * 31) + this.f23091d) * 961) + this.f23093f) * 31) + this.f23094g) * 31;
            String str4 = this.f23096i;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i17 = (i16 + hashCode3) * 31;
            zzbq zzbqVar = this.f23097j;
            if (zzbqVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = zzbqVar.hashCode();
            }
            int i18 = (i17 + hashCode4) * 31;
            String str5 = this.f23098k;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i19 = (i18 + hashCode5) * 31;
            String str6 = this.f23099l;
            if (str6 != null) {
                i13 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((((((((((i19 + i13) * 31) + this.f23100m) * 31) + ((int) this.f23103p)) * 31) + this.f23104q) * 31) + this.f23105r) * 31) + Float.floatToIntBits(this.f23106s)) * 31) + this.f23107t) * 31) + Float.floatToIntBits(this.f23108u)) * 31) + this.f23110w) * 31) + this.f23112y) * 31) + this.f23113z) * 31) + this.f23082A) * 31) + this.f23083B) * 31) + this.f23084C) * 31) + this.f23085D) * 31) + this.f23086E;
            this.f23087F = floatToIntBits;
            return floatToIntBits;
        }
        return i12;
    }

    public final String toString() {
        return "Format(" + this.f23088a + ", " + this.f23089b + ", " + this.f23098k + ", " + this.f23099l + ", " + this.f23096i + ", " + this.f23095h + ", " + this.f23090c + ", [" + this.f23104q + ", " + this.f23105r + ", " + this.f23106s + "], [" + this.f23112y + ", " + this.f23113z + "])";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4671k3(C5004t1 c5004t1) {
        String str;
        String str2;
        String str3;
        int i11;
        int i12;
        int i13;
        String str4;
        zzbq zzbqVar;
        String str5;
        String str6;
        int i14;
        List list;
        List list2;
        zzx zzxVar;
        long j11;
        int i15;
        int i16;
        float f11;
        int i17;
        float f12;
        byte[] bArr;
        int i18;
        sc4 sc4Var;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        str = c5004t1.f28085a;
        this.f23088a = str;
        str2 = c5004t1.f28086b;
        this.f23089b = str2;
        str3 = c5004t1.f28087c;
        this.f23090c = g92.m22358p(str3);
        i11 = c5004t1.f28088d;
        this.f23091d = i11;
        this.f23092e = 0;
        i12 = c5004t1.f28089e;
        this.f23093f = i12;
        i13 = c5004t1.f28090f;
        this.f23094g = i13;
        this.f23095h = i13 != -1 ? i13 : i12;
        str4 = c5004t1.f28091g;
        this.f23096i = str4;
        zzbqVar = c5004t1.f28092h;
        this.f23097j = zzbqVar;
        str5 = c5004t1.f28093i;
        this.f23098k = str5;
        str6 = c5004t1.f28094j;
        this.f23099l = str6;
        i14 = c5004t1.f28095k;
        this.f23100m = i14;
        list = c5004t1.f28096l;
        if (list != null) {
            list2 = c5004t1.f28096l;
        } else {
            list2 = Collections.emptyList();
        }
        this.f23101n = list2;
        zzxVar = c5004t1.f28097m;
        this.f23102o = zzxVar;
        j11 = c5004t1.f28098n;
        this.f23103p = j11;
        i15 = c5004t1.f28099o;
        this.f23104q = i15;
        i16 = c5004t1.f28100p;
        this.f23105r = i16;
        f11 = c5004t1.f28101q;
        this.f23106s = f11;
        i17 = c5004t1.f28102r;
        this.f23107t = i17 == -1 ? 0 : c5004t1.f28102r;
        f12 = c5004t1.f28103s;
        this.f23108u = f12 == -1.0f ? 1.0f : c5004t1.f28103s;
        bArr = c5004t1.f28104t;
        this.f23109v = bArr;
        i18 = c5004t1.f28105u;
        this.f23110w = i18;
        sc4Var = c5004t1.f28106v;
        this.f23111x = sc4Var;
        i19 = c5004t1.f28107w;
        this.f23112y = i19;
        i21 = c5004t1.f28108x;
        this.f23113z = i21;
        i22 = c5004t1.f28109y;
        this.f23082A = i22;
        i23 = c5004t1.f28110z;
        this.f23083B = i23 == -1 ? 0 : c5004t1.f28110z;
        i24 = c5004t1.f28082A;
        this.f23084C = i24 != -1 ? c5004t1.f28082A : 0;
        i25 = c5004t1.f28083B;
        this.f23085D = i25;
        i26 = c5004t1.f28084C;
        this.f23086E = (i26 != 0 || zzxVar == null) ? c5004t1.f28084C : 1;
    }
}
