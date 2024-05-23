package p329lo;

import bo.C3003l3;
import bo.C3020p0;
import com.zing.zalocore.CoreUtility;
import p304ks.C21927m;
import p604wb.C28905e;
import th.AbstractC26681b;

/* renamed from: lo.c */
/* loaded from: classes4.dex */
public class C22548c {

    /* renamed from: a */
    public boolean f110389a;

    /* renamed from: b */
    public boolean f110390b;

    /* renamed from: c */
    public boolean f110391c;

    /* renamed from: d */
    public String f110392d;

    /* renamed from: e */
    public boolean f110393e;

    /* renamed from: f */
    public boolean f110394f;

    /* renamed from: g */
    public boolean f110395g;

    /* renamed from: h */
    public boolean f110396h;

    /* renamed from: i */
    public boolean f110397i;

    /* renamed from: j */
    public boolean f110398j;

    /* renamed from: k */
    public boolean f110399k;

    /* renamed from: l */
    public boolean f110400l;

    /* renamed from: m */
    public boolean f110401m;

    /* renamed from: n */
    public boolean f110402n;

    /* renamed from: o */
    public boolean f110403o;

    private C22548c(boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25) {
        this.f110389a = z11;
        this.f110390b = z12;
        this.f110391c = z13;
        this.f110392d = str;
        this.f110393e = z14;
        this.f110394f = z15;
        this.f110395g = z16;
        this.f110396h = z17;
        this.f110397i = z18;
        this.f110398j = z19;
        this.f110399k = z21;
        this.f110400l = z22;
        this.f110401m = z23;
        this.f110402n = z24;
        this.f110403o = z25;
    }

    /* renamed from: a */
    public static C22548c m116809a(boolean z11, C3020p0 c3020p0, boolean z12, boolean z13, boolean z14, int i11) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        int i12;
        boolean z24;
        if (c3020p0 == null) {
            return null;
        }
        boolean z25 = !c3020p0.m14493X();
        if (c3020p0.m14498b0() && C28905e.f133812l == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        String str = c3020p0.f12022B.f12282d;
        boolean z26 = c3020p0.f12065x;
        if (!c3020p0.m14494Y() && !z12) {
            z16 = false;
        } else {
            c3020p0.m14494Y();
            z16 = true;
        }
        if (c3020p0.f12022B.f12279a > 0) {
            C21927m.m114302u().m114318P(c3020p0.f12022B.f12280b);
            z17 = true;
        } else {
            z17 = false;
        }
        C3003l3 c3003l3 = c3020p0.f12059r;
        if (c3003l3 != null && c3003l3.f11956a > 0 && !z13) {
            if (!c3020p0.m14494Y() && !c3020p0.f12059r.m14389b(CoreUtility.f89233i)) {
                z24 = false;
            } else {
                z24 = true;
            }
            z18 = z24;
        } else {
            z18 = false;
        }
        boolean z27 = !c3020p0.m14494Y();
        if (c3020p0.m14494Y() && c3020p0.m14485P() && z14) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (c3020p0.m14494Y() && c3020p0.f12042V != null && !z13 && (i12 = c3020p0.f12058q) != 21 && i12 != 23) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (c3020p0.m14494Y() && (i11 == 12 || i11 == 13)) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (c3020p0.m14494Y() && ((i11 == 12 || i11 == 13) && AbstractC26681b.f126377v)) {
            z23 = true;
        } else {
            z23 = false;
        }
        return new C22548c(z11, z25, z15, str, z21, z26, false, z17, z27, z18, false, z16, z19, z22, z23);
    }
}
