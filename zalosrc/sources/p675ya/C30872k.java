package p675ya;

import com.google.zxing.AbstractC6847b;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: ya.k */
/* loaded from: classes3.dex */
public class C30872k {

    /* renamed from: i */
    static final C30872k[] f142437i;

    /* renamed from: j */
    private static C30872k[] f142438j;

    /* renamed from: a */
    private final boolean f142439a;

    /* renamed from: b */
    private final int f142440b;

    /* renamed from: c */
    private final int f142441c;

    /* renamed from: d */
    public final int f142442d;

    /* renamed from: e */
    public final int f142443e;

    /* renamed from: f */
    private final int f142444f;

    /* renamed from: g */
    private final int f142445g;

    /* renamed from: h */
    private final int f142446h;

    static {
        C30872k[] c30872kArr = {new C30872k(false, 3, 5, 8, 8, 1), new C30872k(false, 5, 7, 10, 10, 1), new C30872k(true, 5, 7, 16, 6, 1), new C30872k(false, 8, 10, 12, 12, 1), new C30872k(true, 10, 11, 14, 6, 2), new C30872k(false, 12, 12, 14, 14, 1), new C30872k(true, 16, 14, 24, 10, 1), new C30872k(false, 18, 14, 16, 16, 1), new C30872k(false, 22, 18, 18, 18, 1), new C30872k(true, 22, 18, 16, 10, 2), new C30872k(false, 30, 20, 20, 20, 1), new C30872k(true, 32, 24, 16, 14, 2), new C30872k(false, 36, 24, 22, 22, 1), new C30872k(false, 44, 28, 24, 24, 1), new C30872k(true, 49, 28, 22, 14, 2), new C30872k(false, 62, 36, 14, 14, 4), new C30872k(false, 86, 42, 16, 16, 4), new C30872k(false, 114, 48, 18, 18, 4), new C30872k(false, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 56, 20, 20, 4), new C30872k(false, 174, 68, 22, 22, 4), new C30872k(false, 204, 84, 24, 24, 4, 102, 42), new C30872k(false, 280, 112, 14, 14, 16, 140, 56), new C30872k(false, 368, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 16, 16, 16, 92, 36), new C30872k(false, 456, 192, 18, 18, 16, 114, 48), new C30872k(false, 576, 224, 20, 20, 16, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, 56), new C30872k(false, 696, 272, 22, 22, 16, 174, 68), new C30872k(false, 816, 336, 24, 24, 16, 136, 56), new C30872k(false, 1050, 408, 18, 18, 36, 175, 68), new C30872k(false, 1304, 496, 20, 20, 36, 163, 62), new C30865d()};
        f142437i = c30872kArr;
        f142438j = c30872kArr;
    }

    public C30872k(boolean z11, int i11, int i12, int i13, int i14, int i15) {
        this(z11, i11, i12, i13, i14, i15, i11, i12);
    }

    /* renamed from: e */
    private int m150070e() {
        int i11 = this.f142444f;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i12;
    }

    /* renamed from: k */
    private int m150071k() {
        int i11 = this.f142444f;
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: l */
    public static C30872k m150072l(int i11, EnumC30873l enumC30873l, AbstractC6847b abstractC6847b, AbstractC6847b abstractC6847b2, boolean z11) {
        for (C30872k c30872k : f142438j) {
            if ((enumC30873l != EnumC30873l.FORCE_SQUARE || !c30872k.f142439a) && ((enumC30873l != EnumC30873l.FORCE_RECTANGLE || c30872k.f142439a) && i11 <= c30872k.f142440b)) {
                return c30872k;
            }
        }
        if (!z11) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i11);
    }

    /* renamed from: a */
    public final int m150073a() {
        return this.f142440b;
    }

    /* renamed from: b */
    public int mo150017b(int i11) {
        return this.f142445g;
    }

    /* renamed from: c */
    public final int m150074c() {
        return this.f142441c;
    }

    /* renamed from: d */
    public final int m150075d(int i11) {
        return this.f142446h;
    }

    /* renamed from: f */
    public int mo150018f() {
        return this.f142440b / this.f142445g;
    }

    /* renamed from: g */
    public final int m150076g() {
        return m150071k() * this.f142443e;
    }

    /* renamed from: h */
    public final int m150077h() {
        return m150070e() * this.f142442d;
    }

    /* renamed from: i */
    public final int m150078i() {
        return m150076g() + (m150071k() * 2);
    }

    /* renamed from: j */
    public final int m150079j() {
        return m150077h() + (m150070e() * 2);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f142439a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        sb2.append(this.f142442d);
        sb2.append('x');
        sb2.append(this.f142443e);
        sb2.append(", symbol size ");
        sb2.append(m150079j());
        sb2.append('x');
        sb2.append(m150078i());
        sb2.append(", symbol data size ");
        sb2.append(m150077h());
        sb2.append('x');
        sb2.append(m150076g());
        sb2.append(", codewords ");
        sb2.append(this.f142440b);
        sb2.append('+');
        sb2.append(this.f142441c);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30872k(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f142439a = z11;
        this.f142440b = i11;
        this.f142441c = i12;
        this.f142442d = i13;
        this.f142443e = i14;
        this.f142444f = i15;
        this.f142445g = i16;
        this.f142446h = i17;
    }
}
