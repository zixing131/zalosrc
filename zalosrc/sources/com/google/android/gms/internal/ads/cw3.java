package com.google.android.gms.internal.ads;

import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p664y.AbstractC30228a;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class cw3 implements tw3 {

    /* renamed from: q */
    private static final int[] f19005q = new int[0];

    /* renamed from: r */
    private static final Unsafe f19006r = ix3.m23455q();

    /* renamed from: a */
    private final int[] f19007a;

    /* renamed from: b */
    private final Object[] f19008b;

    /* renamed from: c */
    private final int f19009c;

    /* renamed from: d */
    private final int f19010d;

    /* renamed from: e */
    private final zv3 f19011e;

    /* renamed from: f */
    private final boolean f19012f;

    /* renamed from: g */
    private final boolean f19013g;

    /* renamed from: h */
    private final boolean f19014h;

    /* renamed from: i */
    private final int[] f19015i;

    /* renamed from: j */
    private final int f19016j;

    /* renamed from: k */
    private final int f19017k;

    /* renamed from: l */
    private final ov3 f19018l;

    /* renamed from: m */
    private final xw3 f19019m;

    /* renamed from: n */
    private final hu3 f19020n;

    /* renamed from: o */
    private final ew3 f19021o;

    /* renamed from: p */
    private final uv3 f19022p;

    private cw3(int[] iArr, Object[] objArr, int i11, int i12, zv3 zv3Var, boolean z11, boolean z12, int[] iArr2, int i13, int i14, ew3 ew3Var, ov3 ov3Var, xw3 xw3Var, hu3 hu3Var, uv3 uv3Var, byte[] bArr) {
        this.f19007a = iArr;
        this.f19008b = objArr;
        this.f19009c = i11;
        this.f19010d = i12;
        this.f19013g = zv3Var instanceof tu3;
        this.f19014h = z11;
        boolean z13 = false;
        if (hu3Var != null && hu3Var.mo23030h(zv3Var)) {
            z13 = true;
        }
        this.f19012f = z13;
        this.f19015i = iArr2;
        this.f19016j = i13;
        this.f19017k = i14;
        this.f19021o = ew3Var;
        this.f19018l = ov3Var;
        this.f19019m = xw3Var;
        this.f19020n = hu3Var;
        this.f19011e = zv3Var;
        this.f19022p = uv3Var;
    }

    /* renamed from: A */
    private final boolean m21186A(Object obj, int i11, int i12) {
        if (ix3.m23450l(obj, m21205U(i12) & 1048575) == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private static boolean m21187B(Object obj, long j11) {
        return ((Boolean) ix3.m23454p(obj, j11)).booleanValue();
    }

    /* renamed from: C */
    private final void m21188C(Object obj, cu3 cu3Var) {
        int i11;
        if (!this.f19012f) {
            int length = this.f19007a.length;
            Unsafe unsafe = f19006r;
            int i12 = 1048575;
            int i13 = 0;
            int i14 = 0;
            int i15 = 1048575;
            while (i13 < length) {
                int m21208j = m21208j(i13);
                int[] iArr = this.f19007a;
                int i16 = iArr[i13];
                int m21207i = m21207i(m21208j);
                if (m21207i <= 17) {
                    int i17 = iArr[i13 + 2];
                    int i18 = i17 & i12;
                    if (i18 != i15) {
                        i14 = unsafe.getInt(obj, i18);
                        i15 = i18;
                    }
                    i11 = 1 << (i17 >>> 20);
                } else {
                    i11 = 0;
                }
                long j11 = m21208j & i12;
                switch (m21207i) {
                    case 0:
                        if ((i14 & i11) == 0) {
                            break;
                        } else {
                            cu3Var.m21093q(i16, ix3.m23448j(obj, j11));
                            continue;
                        }
                    case 1:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21102z(i16, ix3.m23449k(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21071E(i16, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21087j(i16, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21069C(i16, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21100x(i16, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21098v(i16, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21089m(i16, ix3.m23438H(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i14 & i11) != 0) {
                            m21190E(i16, unsafe.getObject(obj, j11), cu3Var);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21073G(i16, unsafe.getObject(obj, j11), m21211m(i13));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21091o(i16, (mt3) unsafe.getObject(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21085h(i16, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21096t(i16, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21074H(i16, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21076J(i16, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21078a(i16, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21080c(i16, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i14 & i11) != 0) {
                            cu3Var.m21068B(i16, unsafe.getObject(obj, j11), m21211m(i13));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        vw3.m27407l(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 19:
                        vw3.m27411p(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 20:
                        vw3.m27414s(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 21:
                        vw3.m27369B(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 22:
                        vw3.m27413r(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 23:
                        vw3.m27410o(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 24:
                        vw3.m27409n(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 25:
                        vw3.m27405j(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        continue;
                    case 26:
                        vw3.m27420y(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var);
                        break;
                    case 27:
                        vw3.m27415t(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, m21211m(i13));
                        break;
                    case 28:
                        vw3.m27406k(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var);
                        break;
                    case 29:
                        vw3.m27421z(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        vw3.m27408m(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        break;
                    case 31:
                        vw3.m27416u(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        vw3.m27417v(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        break;
                    case 33:
                        vw3.m27418w(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        break;
                    case 34:
                        vw3.m27419x(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, false);
                        break;
                    case 35:
                        vw3.m27407l(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 36:
                        vw3.m27411p(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 37:
                        vw3.m27414s(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 38:
                        vw3.m27369B(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 39:
                        vw3.m27413r(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 40:
                        vw3.m27410o(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        vw3.m27409n(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 42:
                        vw3.m27405j(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 43:
                        vw3.m27421z(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                        vw3.m27408m(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 45:
                        vw3.m27416u(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 46:
                        vw3.m27417v(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 47:
                        vw3.m27418w(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 48:
                        vw3.m27419x(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, true);
                        break;
                    case 49:
                        vw3.m27412q(this.f19007a[i13], (List) unsafe.getObject(obj, j11), cu3Var, m21211m(i13));
                        break;
                    case 50:
                        m21189D(cu3Var, i16, unsafe.getObject(obj, j11), i13);
                        break;
                    case 51:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21093q(i16, m21194J(obj, j11));
                            break;
                        }
                        break;
                    case 52:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21102z(i16, m21195K(obj, j11));
                            break;
                        }
                        break;
                    case 53:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21071E(i16, m21209k(obj, j11));
                            break;
                        }
                        break;
                    case 54:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21087j(i16, m21209k(obj, j11));
                            break;
                        }
                        break;
                    case 55:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21069C(i16, m21198N(obj, j11));
                            break;
                        }
                        break;
                    case 56:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21100x(i16, m21209k(obj, j11));
                            break;
                        }
                        break;
                    case 57:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21098v(i16, m21198N(obj, j11));
                            break;
                        }
                        break;
                    case 58:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21089m(i16, m21187B(obj, j11));
                            break;
                        }
                        break;
                    case 59:
                        if (m21186A(obj, i16, i13)) {
                            m21190E(i16, unsafe.getObject(obj, j11), cu3Var);
                            break;
                        }
                        break;
                    case 60:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21073G(i16, unsafe.getObject(obj, j11), m21211m(i13));
                            break;
                        }
                        break;
                    case 61:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21091o(i16, (mt3) unsafe.getObject(obj, j11));
                            break;
                        }
                        break;
                    case 62:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21085h(i16, m21198N(obj, j11));
                            break;
                        }
                        break;
                    case 63:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21096t(i16, m21198N(obj, j11));
                            break;
                        }
                        break;
                    case 64:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21074H(i16, m21198N(obj, j11));
                            break;
                        }
                        break;
                    case 65:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21076J(i16, m21209k(obj, j11));
                            break;
                        }
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21078a(i16, m21198N(obj, j11));
                            break;
                        }
                        break;
                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21080c(i16, m21209k(obj, j11));
                            break;
                        }
                        break;
                    case 68:
                        if (m21186A(obj, i16, i13)) {
                            cu3Var.m21068B(i16, unsafe.getObject(obj, j11), m21211m(i13));
                            break;
                        }
                        break;
                }
                i13 += 3;
                i12 = 1048575;
            }
            xw3 xw3Var = this.f19019m;
            xw3Var.mo20345r(xw3Var.mo20332d(obj), cu3Var);
            return;
        }
        this.f19020n.mo23023a(obj);
        throw null;
    }

    /* renamed from: D */
    private final void m21189D(cu3 cu3Var, int i11, Object obj, int i12) {
        if (obj == null) {
            return;
        }
        AbstractC30228a.m149044a(m21213o(i12));
        throw null;
    }

    /* renamed from: E */
    private static final void m21190E(int i11, Object obj, cu3 cu3Var) {
        if (obj instanceof String) {
            cu3Var.m21083f(i11, (String) obj);
        } else {
            cu3Var.m21091o(i11, (mt3) obj);
        }
    }

    /* renamed from: G */
    static yw3 m21191G(Object obj) {
        tu3 tu3Var = (tu3) obj;
        yw3 yw3Var = tu3Var.zzc;
        if (yw3Var == yw3.m28369c()) {
            yw3 m28371e = yw3.m28371e();
            tu3Var.zzc = m28371e;
            return m28371e;
        }
        return yw3Var;
    }

    /* renamed from: H */
    public static cw3 m21192H(Class cls, wv3 wv3Var, ew3 ew3Var, ov3 ov3Var, xw3 xw3Var, hu3 hu3Var, uv3 uv3Var) {
        if (wv3Var instanceof jw3) {
            return m21193I((jw3) wv3Var, ew3Var, ov3Var, xw3Var, hu3Var, uv3Var);
        }
        AbstractC30228a.m149044a(wv3Var);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static cw3 m21193I(jw3 jw3Var, ew3 ew3Var, ov3 ov3Var, xw3 xw3Var, hu3 hu3Var, uv3 uv3Var) {
        int i11;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        char charAt11;
        int i25;
        int i26;
        int i27;
        int[] iArr2;
        int i28;
        int i29;
        int i31;
        int objectFieldOffset;
        int i32;
        Object[] objArr;
        String str;
        int i33;
        int i34;
        int i35;
        Field m21214p;
        char charAt12;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field m21214p2;
        Object obj2;
        Field m21214p3;
        int i39;
        char charAt13;
        int i41;
        char charAt14;
        int i42;
        char charAt15;
        int i43;
        char charAt16;
        boolean z11 = jw3Var.zzc() == 2;
        String m23766a = jw3Var.m23766a();
        int length = m23766a.length();
        char c11 = 55296;
        if (m23766a.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i11 = i44 + 1;
                if (m23766a.charAt(i44) < 55296) {
                    break;
                }
                i44 = i11;
            }
        } else {
            i11 = 1;
        }
        int i45 = i11 + 1;
        int charAt17 = m23766a.charAt(i11);
        if (charAt17 >= 55296) {
            int i46 = charAt17 & 8191;
            int i47 = 13;
            while (true) {
                i43 = i45 + 1;
                charAt16 = m23766a.charAt(i45);
                if (charAt16 < 55296) {
                    break;
                }
                i46 |= (charAt16 & 8191) << i47;
                i47 += 13;
                i45 = i43;
            }
            charAt17 = i46 | (charAt16 << i47);
            i45 = i43;
        }
        if (charAt17 == 0) {
            iArr = f19005q;
            i13 = 0;
            charAt = 0;
            i15 = 0;
            charAt2 = 0;
            i14 = 0;
            charAt3 = 0;
            i12 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt18 = m23766a.charAt(i45);
            if (charAt18 >= 55296) {
                int i49 = charAt18 & 8191;
                int i51 = 13;
                while (true) {
                    i24 = i48 + 1;
                    charAt11 = m23766a.charAt(i48);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i49 |= (charAt11 & 8191) << i51;
                    i51 += 13;
                    i48 = i24;
                }
                charAt18 = i49 | (charAt11 << i51);
                i48 = i24;
            }
            int i52 = i48 + 1;
            int charAt19 = m23766a.charAt(i48);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i23 = i52 + 1;
                    charAt10 = m23766a.charAt(i52);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i53 |= (charAt10 & 8191) << i54;
                    i54 += 13;
                    i52 = i23;
                }
                charAt19 = i53 | (charAt10 << i54);
                i52 = i23;
            }
            int i55 = i52 + 1;
            charAt = m23766a.charAt(i52);
            if (charAt >= 55296) {
                int i56 = charAt & 8191;
                int i57 = 13;
                while (true) {
                    i22 = i55 + 1;
                    charAt9 = m23766a.charAt(i55);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i56 |= (charAt9 & 8191) << i57;
                    i57 += 13;
                    i55 = i22;
                }
                charAt = i56 | (charAt9 << i57);
                i55 = i22;
            }
            int i58 = i55 + 1;
            int charAt20 = m23766a.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i61 = 13;
                while (true) {
                    i21 = i58 + 1;
                    charAt8 = m23766a.charAt(i58);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i59 |= (charAt8 & 8191) << i61;
                    i61 += 13;
                    i58 = i21;
                }
                charAt20 = i59 | (charAt8 << i61);
                i58 = i21;
            }
            int i62 = i58 + 1;
            charAt2 = m23766a.charAt(i58);
            if (charAt2 >= 55296) {
                int i63 = charAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    charAt7 = m23766a.charAt(i62);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i63 |= (charAt7 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                charAt2 = i63 | (charAt7 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            int charAt21 = m23766a.charAt(i62);
            if (charAt21 >= 55296) {
                int i66 = charAt21 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    charAt6 = m23766a.charAt(i65);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i66 |= (charAt6 & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                charAt21 = i66 | (charAt6 << i67);
                i65 = i18;
            }
            int i68 = i65 + 1;
            int charAt22 = m23766a.charAt(i65);
            if (charAt22 >= 55296) {
                int i69 = charAt22 & 8191;
                int i71 = 13;
                while (true) {
                    i17 = i68 + 1;
                    charAt5 = m23766a.charAt(i68);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i69 |= (charAt5 & 8191) << i71;
                    i71 += 13;
                    i68 = i17;
                }
                charAt22 = i69 | (charAt5 << i71);
                i68 = i17;
            }
            int i72 = i68 + 1;
            charAt3 = m23766a.charAt(i68);
            if (charAt3 >= 55296) {
                int i73 = charAt3 & 8191;
                int i74 = 13;
                while (true) {
                    i16 = i72 + 1;
                    charAt4 = m23766a.charAt(i72);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i73 |= (charAt4 & 8191) << i74;
                    i74 += 13;
                    i72 = i16;
                }
                charAt3 = i73 | (charAt4 << i74);
                i72 = i16;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i12 = charAt18 + charAt18 + charAt19;
            i13 = charAt18;
            i45 = i72;
            int i75 = charAt21;
            i14 = charAt20;
            i15 = i75;
        }
        Unsafe unsafe = f19006r;
        Object[] m23767b = jw3Var.m23767b();
        Class<?> cls = jw3Var.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i76 = charAt3 + i15;
        int i77 = charAt3;
        int i78 = i76;
        int i79 = 0;
        int i81 = 0;
        while (i45 < length) {
            int i82 = i45 + 1;
            int charAt23 = m23766a.charAt(i45);
            if (charAt23 >= c11) {
                int i83 = charAt23 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i42 = i84 + 1;
                    charAt15 = m23766a.charAt(i84);
                    if (charAt15 < c11) {
                        break;
                    }
                    i83 |= (charAt15 & 8191) << i85;
                    i85 += 13;
                    i84 = i42;
                }
                charAt23 = i83 | (charAt15 << i85);
                i25 = i42;
            } else {
                i25 = i82;
            }
            int i86 = i25 + 1;
            int charAt24 = m23766a.charAt(i25);
            if (charAt24 >= c11) {
                int i87 = charAt24 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i41 = i88 + 1;
                    charAt14 = m23766a.charAt(i88);
                    i26 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i87 |= (charAt14 & 8191) << i89;
                    i89 += 13;
                    i88 = i41;
                    length = i26;
                }
                charAt24 = i87 | (charAt14 << i89);
                i27 = i41;
            } else {
                i26 = length;
                i27 = i86;
            }
            int i91 = charAt24 & 255;
            int i92 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i81] = i79;
                i81++;
            }
            if (i91 >= 51) {
                int i93 = i27 + 1;
                int charAt25 = m23766a.charAt(i27);
                if (charAt25 >= 55296) {
                    int i94 = charAt25 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i39 = i95 + 1;
                        charAt13 = m23766a.charAt(i95);
                        i29 = i14;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i94 |= (charAt13 & 8191) << i96;
                        i96 += 13;
                        i95 = i39;
                        i14 = i29;
                    }
                    charAt25 = i94 | (charAt13 << i96);
                    i37 = i39;
                } else {
                    i29 = i14;
                    i37 = i93;
                }
                int i97 = i91 - 51;
                int i98 = i37;
                if (i97 == 9 || i97 == 17) {
                    int i99 = i79 / 3;
                    i38 = i12 + 1;
                    objArr2[i99 + i99 + 1] = m23767b[i12];
                } else {
                    if (i97 == 12 && !z11) {
                        int i100 = i79 / 3;
                        i38 = i12 + 1;
                        objArr2[i100 + i100 + 1] = m23767b[i12];
                    }
                    int i101 = charAt25 + charAt25;
                    obj = m23767b[i101];
                    if (!(obj instanceof Field)) {
                        m21214p2 = (Field) obj;
                    } else {
                        m21214p2 = m21214p(cls, (String) obj);
                        m23767b[i101] = m21214p2;
                    }
                    iArr2 = iArr3;
                    i28 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m21214p2);
                    int i102 = i101 + 1;
                    obj2 = m23767b[i102];
                    if (!(obj2 instanceof Field)) {
                        m21214p3 = (Field) obj2;
                    } else {
                        m21214p3 = m21214p(cls, (String) obj2);
                        m23767b[i102] = m21214p3;
                    }
                    str = m23766a;
                    i33 = i13;
                    objArr = objArr2;
                    i31 = i12;
                    i34 = i98;
                    i32 = (int) unsafe.objectFieldOffset(m21214p3);
                    objectFieldOffset = objectFieldOffset2;
                    i35 = 0;
                }
                i12 = i38;
                int i1012 = charAt25 + charAt25;
                obj = m23767b[i1012];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i28 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m21214p2);
                int i1022 = i1012 + 1;
                obj2 = m23767b[i1022];
                if (!(obj2 instanceof Field)) {
                }
                str = m23766a;
                i33 = i13;
                objArr = objArr2;
                i31 = i12;
                i34 = i98;
                i32 = (int) unsafe.objectFieldOffset(m21214p3);
                objectFieldOffset = objectFieldOffset22;
                i35 = 0;
            } else {
                iArr2 = iArr3;
                i28 = charAt;
                i29 = i14;
                int i103 = i12 + 1;
                Field m21214p4 = m21214p(cls, (String) m23767b[i12]);
                if (i91 == 9 || i91 == 17) {
                    int i104 = i79 / 3;
                    objArr2[i104 + i104 + 1] = m21214p4.getType();
                } else {
                    if (i91 == 27 || i91 == 49) {
                        int i105 = i79 / 3;
                        i36 = i12 + 2;
                        objArr2[i105 + i105 + 1] = m23767b[i103];
                    } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                        if (!z11) {
                            int i106 = i79 / 3;
                            i36 = i12 + 2;
                            objArr2[i106 + i106 + 1] = m23767b[i103];
                        }
                    } else if (i91 == 50) {
                        int i107 = i77 + 1;
                        iArr[i77] = i79;
                        int i108 = i79 / 3;
                        int i109 = i108 + i108;
                        int i110 = i12 + 2;
                        objArr2[i109] = m23767b[i103];
                        if ((charAt24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0) {
                            i103 = i12 + 3;
                            objArr2[i109 + 1] = m23767b[i110];
                            i77 = i107;
                        } else {
                            i77 = i107;
                            i31 = i110;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m21214p4);
                            i32 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i91 > 17) {
                                str = m23766a;
                                i33 = i13;
                                i34 = i27;
                                i35 = 0;
                            } else {
                                int i111 = i27 + 1;
                                int charAt26 = m23766a.charAt(i27);
                                if (charAt26 >= 55296) {
                                    int i112 = charAt26 & 8191;
                                    int i113 = 13;
                                    while (true) {
                                        i34 = i111 + 1;
                                        charAt12 = m23766a.charAt(i111);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i112 |= (charAt12 & 8191) << i113;
                                        i113 += 13;
                                        i111 = i34;
                                    }
                                    charAt26 = i112 | (charAt12 << i113);
                                } else {
                                    i34 = i111;
                                }
                                int i114 = i13 + i13 + (charAt26 / 32);
                                Object obj3 = m23767b[i114];
                                str = m23766a;
                                if (obj3 instanceof Field) {
                                    m21214p = (Field) obj3;
                                } else {
                                    m21214p = m21214p(cls, (String) obj3);
                                    m23767b[i114] = m21214p;
                                }
                                i33 = i13;
                                i35 = charAt26 % 32;
                                i32 = (int) unsafe.objectFieldOffset(m21214p);
                            }
                            if (i91 >= 18 && i91 <= 49) {
                                iArr[i78] = objectFieldOffset;
                                i78++;
                            }
                        }
                    }
                    i31 = i36;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m21214p4);
                    i32 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = m23766a;
                    i33 = i13;
                    i34 = i27;
                    i35 = 0;
                    if (i91 >= 18) {
                        iArr[i78] = objectFieldOffset;
                        i78++;
                    }
                }
                i31 = i103;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m21214p4);
                i32 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = m23766a;
                i33 = i13;
                i34 = i27;
                i35 = 0;
                if (i91 >= 18) {
                }
            }
            int i115 = i79 + 1;
            iArr2[i79] = charAt23;
            int i116 = i79 + 2;
            iArr2[i115] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i91 << 20) | objectFieldOffset;
            i79 += 3;
            iArr2[i116] = (i35 << 20) | i32;
            i13 = i33;
            i12 = i31;
            charAt = i28;
            charAt3 = i92;
            i45 = i34;
            length = i26;
            objArr2 = objArr;
            m23766a = str;
            iArr3 = iArr2;
            i14 = i29;
            c11 = 55296;
        }
        return new cw3(iArr3, objArr2, charAt, i14, jw3Var.zza(), z11, false, iArr, charAt3, i76, ew3Var, ov3Var, xw3Var, hu3Var, uv3Var, null);
    }

    /* renamed from: J */
    private static double m21194J(Object obj, long j11) {
        return ((Double) ix3.m23454p(obj, j11)).doubleValue();
    }

    /* renamed from: K */
    private static float m21195K(Object obj, long j11) {
        return ((Float) ix3.m23454p(obj, j11)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003c. Please report as an issue. */
    /* renamed from: L */
    private final int m21196L(Object obj) {
        int i11;
        int m20733f;
        int m20733f2;
        int m20733f3;
        int m20734g;
        int m20733f4;
        int m20728G;
        int m20733f5;
        int m20733f6;
        int mo22168p;
        int m20733f7;
        int i12;
        int m27390W;
        int m27378K;
        int m20732e;
        int m20733f8;
        int i13;
        int m20733f9;
        int m20733f10;
        int m20733f11;
        int m20734g2;
        int m20733f12;
        int mo22168p2;
        int m20733f13;
        int i14;
        Unsafe unsafe = f19006r;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i16 < this.f19007a.length) {
            int m21208j = m21208j(i16);
            int[] iArr = this.f19007a;
            int i21 = iArr[i16];
            int m21207i = m21207i(m21208j);
            if (m21207i <= 17) {
                int i22 = iArr[i16 + 2];
                int i23 = i22 & i15;
                i11 = 1 << (i22 >>> 20);
                if (i23 != i19) {
                    i18 = unsafe.getInt(obj, i23);
                    i19 = i23;
                }
            } else {
                i11 = 0;
            }
            long j11 = m21208j & i15;
            switch (m21207i) {
                case 0:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f = bu3.m20733f(i21 << 3);
                        m20733f5 = m20733f + 8;
                        i17 += m20733f5;
                        break;
                    }
                case 1:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f2 = bu3.m20733f(i21 << 3);
                        m20733f5 = m20733f2 + 4;
                        i17 += m20733f5;
                        break;
                    }
                case 2:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j11);
                        m20733f3 = bu3.m20733f(i21 << 3);
                        m20734g = bu3.m20734g(j12);
                        i17 += m20733f3 + m20734g;
                        break;
                    }
                case 3:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j11);
                        m20733f3 = bu3.m20733f(i21 << 3);
                        m20734g = bu3.m20734g(j13);
                        i17 += m20733f3 + m20734g;
                        break;
                    }
                case 4:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j11);
                        m20733f4 = bu3.m20733f(i21 << 3);
                        m20728G = bu3.m20728G(i24);
                        i12 = m20733f4 + m20728G;
                        i17 += i12;
                        break;
                    }
                case 5:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f = bu3.m20733f(i21 << 3);
                        m20733f5 = m20733f + 8;
                        i17 += m20733f5;
                        break;
                    }
                case 6:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f2 = bu3.m20733f(i21 << 3);
                        m20733f5 = m20733f2 + 4;
                        i17 += m20733f5;
                        break;
                    }
                case 7:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f5 = bu3.m20733f(i21 << 3) + 1;
                        i17 += m20733f5;
                        break;
                    }
                case 8:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof mt3) {
                            m20733f6 = bu3.m20733f(i21 << 3);
                            mo22168p = ((mt3) object).mo22168p();
                            m20733f7 = bu3.m20733f(mo22168p);
                            i12 = m20733f6 + m20733f7 + mo22168p;
                            i17 += i12;
                            break;
                        } else {
                            m20733f4 = bu3.m20733f(i21 << 3);
                            m20728G = bu3.m20731d((String) object);
                            i12 = m20733f4 + m20728G;
                            i17 += i12;
                        }
                    }
                case 9:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f5 = vw3.m27384Q(i21, unsafe.getObject(obj, j11), m21211m(i16));
                        i17 += m20733f5;
                        break;
                    }
                case 10:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        mt3 mt3Var = (mt3) unsafe.getObject(obj, j11);
                        m20733f6 = bu3.m20733f(i21 << 3);
                        mo22168p = mt3Var.mo22168p();
                        m20733f7 = bu3.m20733f(mo22168p);
                        i12 = m20733f6 + m20733f7 + mo22168p;
                        i17 += i12;
                        break;
                    }
                case 11:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j11);
                        m20733f4 = bu3.m20733f(i21 << 3);
                        m20728G = bu3.m20733f(i25);
                        i12 = m20733f4 + m20728G;
                        i17 += i12;
                        break;
                    }
                case 12:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i26 = unsafe.getInt(obj, j11);
                        m20733f4 = bu3.m20733f(i21 << 3);
                        m20728G = bu3.m20728G(i26);
                        i12 = m20733f4 + m20728G;
                        i17 += i12;
                        break;
                    }
                case 13:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f2 = bu3.m20733f(i21 << 3);
                        m20733f5 = m20733f2 + 4;
                        i17 += m20733f5;
                        break;
                    }
                case 14:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f = bu3.m20733f(i21 << 3);
                        m20733f5 = m20733f + 8;
                        i17 += m20733f5;
                        break;
                    }
                case 15:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i27 = unsafe.getInt(obj, j11);
                        m20733f4 = bu3.m20733f(i21 << 3);
                        m20728G = bu3.m20733f((i27 >> 31) ^ (i27 + i27));
                        i12 = m20733f4 + m20728G;
                        i17 += i12;
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if ((i11 & i18) == 0) {
                        break;
                    } else {
                        long j14 = unsafe.getLong(obj, j11);
                        i17 += bu3.m20733f(i21 << 3) + bu3.m20734g((j14 >> 63) ^ (j14 + j14));
                        break;
                    }
                case 17:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        m20733f5 = bu3.m20727F(i21, (zv3) unsafe.getObject(obj, j11), m21211m(i16));
                        i17 += m20733f5;
                        break;
                    }
                case 18:
                    m20733f5 = vw3.m27377J(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 19:
                    m20733f5 = vw3.m27375H(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 20:
                    m20733f5 = vw3.m27382O(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 21:
                    m20733f5 = vw3.m27393Z(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 22:
                    m20733f5 = vw3.m27380M(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 23:
                    m20733f5 = vw3.m27377J(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 24:
                    m20733f5 = vw3.m27375H(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 25:
                    m20733f5 = vw3.m27368A(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m20733f5;
                    break;
                case 26:
                    m27390W = vw3.m27390W(i21, (List) unsafe.getObject(obj, j11));
                    i17 += m27390W;
                    break;
                case 27:
                    m27390W = vw3.m27385R(i21, (List) unsafe.getObject(obj, j11), m21211m(i16));
                    i17 += m27390W;
                    break;
                case 28:
                    m27390W = vw3.m27372E(i21, (List) unsafe.getObject(obj, j11));
                    i17 += m27390W;
                    break;
                case 29:
                    m27390W = vw3.m27391X(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m27390W;
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    m27390W = vw3.m27373F(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m27390W;
                    break;
                case 31:
                    m27390W = vw3.m27375H(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m27390W;
                    break;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    m27390W = vw3.m27377J(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m27390W;
                    break;
                case 33:
                    m27390W = vw3.m27386S(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m27390W;
                    break;
                case 34:
                    m27390W = vw3.m27388U(i21, (List) unsafe.getObject(obj, j11), false);
                    i17 += m27390W;
                    break;
                case 35:
                    m27378K = vw3.m27378K((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 36:
                    m27378K = vw3.m27376I((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 37:
                    m27378K = vw3.m27383P((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 38:
                    m27378K = vw3.m27395a0((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 39:
                    m27378K = vw3.m27381N((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 40:
                    m27378K = vw3.m27378K((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    m27378K = vw3.m27376I((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 42:
                    m27378K = vw3.m27371D((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 43:
                    m27378K = vw3.m27392Y((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    m27378K = vw3.m27374G((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 45:
                    m27378K = vw3.m27376I((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 46:
                    m27378K = vw3.m27378K((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 47:
                    m27378K = vw3.m27387T((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 48:
                    m27378K = vw3.m27389V((List) unsafe.getObject(obj, j11));
                    if (m27378K > 0) {
                        m20732e = bu3.m20732e(i21);
                        m20733f8 = bu3.m20733f(m27378K);
                        i13 = m20732e + m20733f8;
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 49:
                    m27390W = vw3.m27379L(i21, (List) unsafe.getObject(obj, j11), m21211m(i16));
                    i17 += m27390W;
                    break;
                case 50:
                    uv3.m27072a(i21, unsafe.getObject(obj, j11), m21213o(i16));
                    break;
                case 51:
                    if (m21186A(obj, i21, i16)) {
                        m20733f9 = bu3.m20733f(i21 << 3);
                        m27390W = m20733f9 + 8;
                        i17 += m27390W;
                    }
                    break;
                case 52:
                    if (m21186A(obj, i21, i16)) {
                        m20733f10 = bu3.m20733f(i21 << 3);
                        m27390W = m20733f10 + 4;
                        i17 += m27390W;
                    }
                    break;
                case 53:
                    if (m21186A(obj, i21, i16)) {
                        long m21209k = m21209k(obj, j11);
                        m20733f11 = bu3.m20733f(i21 << 3);
                        m20734g2 = bu3.m20734g(m21209k);
                        i17 += m20733f11 + m20734g2;
                    }
                    break;
                case 54:
                    if (m21186A(obj, i21, i16)) {
                        long m21209k2 = m21209k(obj, j11);
                        m20733f11 = bu3.m20733f(i21 << 3);
                        m20734g2 = bu3.m20734g(m21209k2);
                        i17 += m20733f11 + m20734g2;
                    }
                    break;
                case 55:
                    if (m21186A(obj, i21, i16)) {
                        int m21198N = m21198N(obj, j11);
                        i13 = bu3.m20733f(i21 << 3);
                        m27378K = bu3.m20728G(m21198N);
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 56:
                    if (m21186A(obj, i21, i16)) {
                        m20733f9 = bu3.m20733f(i21 << 3);
                        m27390W = m20733f9 + 8;
                        i17 += m27390W;
                    }
                    break;
                case 57:
                    if (m21186A(obj, i21, i16)) {
                        m20733f10 = bu3.m20733f(i21 << 3);
                        m27390W = m20733f10 + 4;
                        i17 += m27390W;
                    }
                    break;
                case 58:
                    if (m21186A(obj, i21, i16)) {
                        m27390W = bu3.m20733f(i21 << 3) + 1;
                        i17 += m27390W;
                    }
                    break;
                case 59:
                    if (m21186A(obj, i21, i16)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof mt3) {
                            m20733f12 = bu3.m20733f(i21 << 3);
                            mo22168p2 = ((mt3) object2).mo22168p();
                            m20733f13 = bu3.m20733f(mo22168p2);
                            i14 = m20733f12 + m20733f13 + mo22168p2;
                            i17 += i14;
                        } else {
                            i13 = bu3.m20733f(i21 << 3);
                            m27378K = bu3.m20731d((String) object2);
                            i14 = i13 + m27378K;
                            i17 += i14;
                        }
                    }
                    break;
                case 60:
                    if (m21186A(obj, i21, i16)) {
                        m27390W = vw3.m27384Q(i21, unsafe.getObject(obj, j11), m21211m(i16));
                        i17 += m27390W;
                    }
                    break;
                case 61:
                    if (m21186A(obj, i21, i16)) {
                        mt3 mt3Var2 = (mt3) unsafe.getObject(obj, j11);
                        m20733f12 = bu3.m20733f(i21 << 3);
                        mo22168p2 = mt3Var2.mo22168p();
                        m20733f13 = bu3.m20733f(mo22168p2);
                        i14 = m20733f12 + m20733f13 + mo22168p2;
                        i17 += i14;
                    }
                    break;
                case 62:
                    if (m21186A(obj, i21, i16)) {
                        int m21198N2 = m21198N(obj, j11);
                        i13 = bu3.m20733f(i21 << 3);
                        m27378K = bu3.m20733f(m21198N2);
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 63:
                    if (m21186A(obj, i21, i16)) {
                        int m21198N3 = m21198N(obj, j11);
                        i13 = bu3.m20733f(i21 << 3);
                        m27378K = bu3.m20728G(m21198N3);
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case 64:
                    if (m21186A(obj, i21, i16)) {
                        m20733f10 = bu3.m20733f(i21 << 3);
                        m27390W = m20733f10 + 4;
                        i17 += m27390W;
                    }
                    break;
                case 65:
                    if (m21186A(obj, i21, i16)) {
                        m20733f9 = bu3.m20733f(i21 << 3);
                        m27390W = m20733f9 + 8;
                        i17 += m27390W;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m21186A(obj, i21, i16)) {
                        int m21198N4 = m21198N(obj, j11);
                        i13 = bu3.m20733f(i21 << 3);
                        m27378K = bu3.m20733f((m21198N4 >> 31) ^ (m21198N4 + m21198N4));
                        i14 = i13 + m27378K;
                        i17 += i14;
                    }
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m21186A(obj, i21, i16)) {
                        long m21209k3 = m21209k(obj, j11);
                        i17 += bu3.m20733f(i21 << 3) + bu3.m20734g((m21209k3 >> 63) ^ (m21209k3 + m21209k3));
                    }
                    break;
                case 68:
                    if (m21186A(obj, i21, i16)) {
                        m27390W = bu3.m20727F(i21, (zv3) unsafe.getObject(obj, j11), m21211m(i16));
                        i17 += m27390W;
                    }
                    break;
            }
            i16 += 3;
            i15 = 1048575;
        }
        xw3 xw3Var = this.f19019m;
        int mo20329a = i17 + xw3Var.mo20329a(xw3Var.mo20332d(obj));
        if (!this.f19012f) {
            return mo20329a;
        }
        this.f19020n.mo23023a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0033. Please report as an issue. */
    /* renamed from: M */
    private final int m21197M(Object obj) {
        int m20733f;
        int m20733f2;
        int m20733f3;
        int m20734g;
        int m20733f4;
        int m20728G;
        int m20733f5;
        int m20733f6;
        int mo22168p;
        int m20733f7;
        int m27384Q;
        int m20732e;
        int m20733f8;
        int i11;
        Unsafe unsafe = f19006r;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19007a.length; i13 += 3) {
            int m21208j = m21208j(i13);
            int m21207i = m21207i(m21208j);
            int i14 = this.f19007a[i13];
            long j11 = m21208j & 1048575;
            if (m21207i >= lu3.f24087b0.m24376b() && m21207i <= lu3.f24100o0.m24376b()) {
                int i15 = this.f19007a[i13 + 2];
            }
            switch (m21207i) {
                case 0:
                    if (m21222x(obj, i13)) {
                        m20733f = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f + 8;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m21222x(obj, i13)) {
                        m20733f2 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f2 + 4;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m21222x(obj, i13)) {
                        long m23452n = ix3.m23452n(obj, j11);
                        m20733f3 = bu3.m20733f(i14 << 3);
                        m20734g = bu3.m20734g(m23452n);
                        i12 += m20733f3 + m20734g;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m21222x(obj, i13)) {
                        long m23452n2 = ix3.m23452n(obj, j11);
                        m20733f3 = bu3.m20733f(i14 << 3);
                        m20734g = bu3.m20734g(m23452n2);
                        i12 += m20733f3 + m20734g;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m21222x(obj, i13)) {
                        int m23450l = ix3.m23450l(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20728G(m23450l);
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m21222x(obj, i13)) {
                        m20733f = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f + 8;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m21222x(obj, i13)) {
                        m20733f2 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f2 + 4;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m21222x(obj, i13)) {
                        m20733f5 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f5 + 1;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m21222x(obj, i13)) {
                        break;
                    } else {
                        Object m23454p = ix3.m23454p(obj, j11);
                        if (m23454p instanceof mt3) {
                            m20733f6 = bu3.m20733f(i14 << 3);
                            mo22168p = ((mt3) m23454p).mo22168p();
                            m20733f7 = bu3.m20733f(mo22168p);
                            i11 = m20733f6 + m20733f7 + mo22168p;
                            i12 += i11;
                            break;
                        } else {
                            m20733f4 = bu3.m20733f(i14 << 3);
                            m20728G = bu3.m20731d((String) m23454p);
                            i11 = m20733f4 + m20728G;
                            i12 += i11;
                        }
                    }
                case 9:
                    if (m21222x(obj, i13)) {
                        m27384Q = vw3.m27384Q(i14, ix3.m23454p(obj, j11), m21211m(i13));
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m21222x(obj, i13)) {
                        mt3 mt3Var = (mt3) ix3.m23454p(obj, j11);
                        m20733f6 = bu3.m20733f(i14 << 3);
                        mo22168p = mt3Var.mo22168p();
                        m20733f7 = bu3.m20733f(mo22168p);
                        i11 = m20733f6 + m20733f7 + mo22168p;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m21222x(obj, i13)) {
                        int m23450l2 = ix3.m23450l(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20733f(m23450l2);
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m21222x(obj, i13)) {
                        int m23450l3 = ix3.m23450l(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20728G(m23450l3);
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m21222x(obj, i13)) {
                        m20733f2 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f2 + 4;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m21222x(obj, i13)) {
                        m20733f = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f + 8;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m21222x(obj, i13)) {
                        int m23450l4 = ix3.m23450l(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20733f((m23450l4 >> 31) ^ (m23450l4 + m23450l4));
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m21222x(obj, i13)) {
                        long m23452n3 = ix3.m23452n(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20734g((m23452n3 >> 63) ^ (m23452n3 + m23452n3));
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m21222x(obj, i13)) {
                        m27384Q = bu3.m20727F(i14, (zv3) ix3.m23454p(obj, j11), m21211m(i13));
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m27384Q = vw3.m27377J(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 19:
                    m27384Q = vw3.m27375H(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 20:
                    m27384Q = vw3.m27382O(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 21:
                    m27384Q = vw3.m27393Z(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 22:
                    m27384Q = vw3.m27380M(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 23:
                    m27384Q = vw3.m27377J(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 24:
                    m27384Q = vw3.m27375H(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 25:
                    m27384Q = vw3.m27368A(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 26:
                    m27384Q = vw3.m27390W(i14, (List) ix3.m23454p(obj, j11));
                    i12 += m27384Q;
                    break;
                case 27:
                    m27384Q = vw3.m27385R(i14, (List) ix3.m23454p(obj, j11), m21211m(i13));
                    i12 += m27384Q;
                    break;
                case 28:
                    m27384Q = vw3.m27372E(i14, (List) ix3.m23454p(obj, j11));
                    i12 += m27384Q;
                    break;
                case 29:
                    m27384Q = vw3.m27391X(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    m27384Q = vw3.m27373F(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 31:
                    m27384Q = vw3.m27375H(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    m27384Q = vw3.m27377J(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 33:
                    m27384Q = vw3.m27386S(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 34:
                    m27384Q = vw3.m27388U(i14, (List) ix3.m23454p(obj, j11), false);
                    i12 += m27384Q;
                    break;
                case 35:
                    m20728G = vw3.m27378K((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m20728G = vw3.m27376I((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m20728G = vw3.m27383P((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m20728G = vw3.m27395a0((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m20728G = vw3.m27381N((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m20728G = vw3.m27378K((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    m20728G = vw3.m27376I((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m20728G = vw3.m27371D((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m20728G = vw3.m27392Y((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    m20728G = vw3.m27374G((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m20728G = vw3.m27376I((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m20728G = vw3.m27378K((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m20728G = vw3.m27387T((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m20728G = vw3.m27389V((List) unsafe.getObject(obj, j11));
                    if (m20728G > 0) {
                        m20732e = bu3.m20732e(i14);
                        m20733f8 = bu3.m20733f(m20728G);
                        m20733f4 = m20732e + m20733f8;
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m27384Q = vw3.m27379L(i14, (List) ix3.m23454p(obj, j11), m21211m(i13));
                    i12 += m27384Q;
                    break;
                case 50:
                    uv3.m27072a(i14, ix3.m23454p(obj, j11), m21213o(i13));
                    break;
                case 51:
                    if (m21186A(obj, i14, i13)) {
                        m20733f = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f + 8;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m21186A(obj, i14, i13)) {
                        m20733f2 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f2 + 4;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m21186A(obj, i14, i13)) {
                        long m21209k = m21209k(obj, j11);
                        m20733f3 = bu3.m20733f(i14 << 3);
                        m20734g = bu3.m20734g(m21209k);
                        i12 += m20733f3 + m20734g;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m21186A(obj, i14, i13)) {
                        long m21209k2 = m21209k(obj, j11);
                        m20733f3 = bu3.m20733f(i14 << 3);
                        m20734g = bu3.m20734g(m21209k2);
                        i12 += m20733f3 + m20734g;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m21186A(obj, i14, i13)) {
                        int m21198N = m21198N(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20728G(m21198N);
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m21186A(obj, i14, i13)) {
                        m20733f = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f + 8;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m21186A(obj, i14, i13)) {
                        m20733f2 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f2 + 4;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m21186A(obj, i14, i13)) {
                        m20733f5 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f5 + 1;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m21186A(obj, i14, i13)) {
                        break;
                    } else {
                        Object m23454p2 = ix3.m23454p(obj, j11);
                        if (m23454p2 instanceof mt3) {
                            m20733f6 = bu3.m20733f(i14 << 3);
                            mo22168p = ((mt3) m23454p2).mo22168p();
                            m20733f7 = bu3.m20733f(mo22168p);
                            i11 = m20733f6 + m20733f7 + mo22168p;
                            i12 += i11;
                            break;
                        } else {
                            m20733f4 = bu3.m20733f(i14 << 3);
                            m20728G = bu3.m20731d((String) m23454p2);
                            i11 = m20733f4 + m20728G;
                            i12 += i11;
                        }
                    }
                case 60:
                    if (m21186A(obj, i14, i13)) {
                        m27384Q = vw3.m27384Q(i14, ix3.m23454p(obj, j11), m21211m(i13));
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m21186A(obj, i14, i13)) {
                        mt3 mt3Var2 = (mt3) ix3.m23454p(obj, j11);
                        m20733f6 = bu3.m20733f(i14 << 3);
                        mo22168p = mt3Var2.mo22168p();
                        m20733f7 = bu3.m20733f(mo22168p);
                        i11 = m20733f6 + m20733f7 + mo22168p;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m21186A(obj, i14, i13)) {
                        int m21198N2 = m21198N(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20733f(m21198N2);
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m21186A(obj, i14, i13)) {
                        int m21198N3 = m21198N(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20728G(m21198N3);
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m21186A(obj, i14, i13)) {
                        m20733f2 = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f2 + 4;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m21186A(obj, i14, i13)) {
                        m20733f = bu3.m20733f(i14 << 3);
                        m27384Q = m20733f + 8;
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m21186A(obj, i14, i13)) {
                        int m21198N4 = m21198N(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20733f((m21198N4 >> 31) ^ (m21198N4 + m21198N4));
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m21186A(obj, i14, i13)) {
                        long m21209k3 = m21209k(obj, j11);
                        m20733f4 = bu3.m20733f(i14 << 3);
                        m20728G = bu3.m20734g((m21209k3 >> 63) ^ (m21209k3 + m21209k3));
                        i11 = m20733f4 + m20728G;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m21186A(obj, i14, i13)) {
                        m27384Q = bu3.m20727F(i14, (zv3) ix3.m23454p(obj, j11), m21211m(i13));
                        i12 += m27384Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        xw3 xw3Var = this.f19019m;
        return i12 + xw3Var.mo20329a(xw3Var.mo20332d(obj));
    }

    /* renamed from: N */
    private static int m21198N(Object obj, long j11) {
        return ((Integer) ix3.m23454p(obj, j11)).intValue();
    }

    /* renamed from: O */
    private final int m21199O(Object obj, byte[] bArr, int i11, int i12, int i13, long j11, ys3 ys3Var) {
        Unsafe unsafe = f19006r;
        Object m21213o = m21213o(i13);
        Object object = unsafe.getObject(obj, j11);
        if (uv3.m27073b(object)) {
            tv3 m26784b = tv3.m26781a().m26784b();
            uv3.m27074c(m26784b, object);
            unsafe.putObject(obj, j11, m26784b);
        }
        AbstractC30228a.m149044a(m21213o);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    /* renamed from: P */
    private final int m21200P(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, ys3 ys3Var) {
        Unsafe unsafe = f19006r;
        long j12 = this.f19007a[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(obj, j11, Double.valueOf(Double.longBitsToDouble(zs3.m28611n(bArr, i11))));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 8;
                }
                return i11;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(obj, j11, Float.valueOf(Float.intBitsToFloat(zs3.m28599b(bArr, i11))));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 4;
                }
                return i11;
            case 53:
            case 54:
                if (i15 == 0) {
                    int m28610m = zs3.m28610m(bArr, i11, ys3Var);
                    unsafe.putObject(obj, j11, Long.valueOf(ys3Var.f31091b));
                    unsafe.putInt(obj, j12, i14);
                    return m28610m;
                }
                return i11;
            case 55:
            case 62:
                if (i15 == 0) {
                    int m28607j = zs3.m28607j(bArr, i11, ys3Var);
                    unsafe.putObject(obj, j11, Integer.valueOf(ys3Var.f31090a));
                    unsafe.putInt(obj, j12, i14);
                    return m28607j;
                }
                return i11;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(obj, j11, Long.valueOf(zs3.m28611n(bArr, i11)));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 8;
                }
                return i11;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(obj, j11, Integer.valueOf(zs3.m28599b(bArr, i11)));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 4;
                }
                return i11;
            case 58:
                if (i15 == 0) {
                    int m28610m2 = zs3.m28610m(bArr, i11, ys3Var);
                    unsafe.putObject(obj, j11, Boolean.valueOf(ys3Var.f31091b != 0));
                    unsafe.putInt(obj, j12, i14);
                    return m28610m2;
                }
                return i11;
            case 59:
                if (i15 == 2) {
                    int m28607j2 = zs3.m28607j(bArr, i11, ys3Var);
                    int i19 = ys3Var.f31090a;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j11, "");
                    } else {
                        if ((i16 & 536870912) != 0 && !nx3.m25040j(bArr, m28607j2, m28607j2 + i19)) {
                            throw zzgrq.m28820d();
                        }
                        unsafe.putObject(obj, j11, new String(bArr, m28607j2, i19, dv3.f19426b));
                        m28607j2 += i19;
                    }
                    unsafe.putInt(obj, j12, i14);
                    return m28607j2;
                }
                return i11;
            case 60:
                if (i15 == 2) {
                    int m28601d = zs3.m28601d(m21211m(i18), bArr, i11, i12, ys3Var);
                    Object object = unsafe.getInt(obj, j12) == i14 ? unsafe.getObject(obj, j11) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j11, ys3Var.f31092c);
                    } else {
                        unsafe.putObject(obj, j11, dv3.m21552g(object, ys3Var.f31092c));
                    }
                    unsafe.putInt(obj, j12, i14);
                    return m28601d;
                }
                return i11;
            case 61:
                if (i15 == 2) {
                    int m28598a = zs3.m28598a(bArr, i11, ys3Var);
                    unsafe.putObject(obj, j11, ys3Var.f31092c);
                    unsafe.putInt(obj, j12, i14);
                    return m28598a;
                }
                return i11;
            case 63:
                if (i15 == 0) {
                    int m28607j3 = zs3.m28607j(bArr, i11, ys3Var);
                    int i21 = ys3Var.f31090a;
                    xu3 m21210l = m21210l(i18);
                    if (m21210l != null && !m21210l.mo20775a(i21)) {
                        m21191G(obj).m28376h(i13, Long.valueOf(i21));
                    } else {
                        unsafe.putObject(obj, j11, Integer.valueOf(i21));
                        unsafe.putInt(obj, j12, i14);
                    }
                    return m28607j3;
                }
                return i11;
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                if (i15 == 0) {
                    int m28607j4 = zs3.m28607j(bArr, i11, ys3Var);
                    unsafe.putObject(obj, j11, Integer.valueOf(vt3.m27352e(ys3Var.f31090a)));
                    unsafe.putInt(obj, j12, i14);
                    return m28607j4;
                }
                return i11;
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                if (i15 == 0) {
                    int m28610m3 = zs3.m28610m(bArr, i11, ys3Var);
                    unsafe.putObject(obj, j11, Long.valueOf(vt3.m27353f(ys3Var.f31091b)));
                    unsafe.putInt(obj, j12, i14);
                    return m28610m3;
                }
                return i11;
            case 68:
                if (i15 == 3) {
                    int m28600c = zs3.m28600c(m21211m(i18), bArr, i11, i12, (i13 & (-8)) | 4, ys3Var);
                    Object object2 = unsafe.getInt(obj, j12) == i14 ? unsafe.getObject(obj, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j11, ys3Var.f31092c);
                    } else {
                        unsafe.putObject(obj, j11, dv3.m21552g(object2, ys3Var.f31092c));
                    }
                    unsafe.putInt(obj, j12, i14);
                    return m28600c;
                }
                return i11;
            default:
                return i11;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0082. Please report as an issue. */
    /* renamed from: Q */
    private final int m21201Q(Object obj, byte[] bArr, int i11, int i12, ys3 ys3Var) {
        int i13;
        int i14;
        int m21203S;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        int i18;
        int i19;
        int m28610m;
        int m28601d;
        int i21;
        int i22;
        int i23;
        cw3 cw3Var = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i24 = i12;
        ys3 ys3Var2 = ys3Var;
        Unsafe unsafe2 = f19006r;
        int i25 = 1048575;
        int i26 = -1;
        int i27 = i11;
        int i28 = -1;
        int i29 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (i27 < i24) {
            int i33 = i27 + 1;
            byte b11 = bArr2[i27];
            if (b11 < 0) {
                i14 = zs3.m28608k(b11, bArr2, i33, ys3Var2);
                i13 = ys3Var2.f31090a;
            } else {
                i13 = b11;
                i14 = i33;
            }
            int i34 = i13 >>> 3;
            int i35 = i13 & 7;
            if (i34 > i28) {
                m21203S = cw3Var.m21204T(i34, i29 / 3);
            } else {
                m21203S = cw3Var.m21203S(i34);
            }
            int i36 = m21203S;
            if (i36 == i26) {
                i15 = i14;
                i16 = i34;
                unsafe = unsafe2;
                i17 = 0;
            } else {
                int[] iArr = cw3Var.f19007a;
                int i37 = iArr[i36 + 1];
                int m21207i = m21207i(i37);
                long j11 = i37 & i25;
                if (m21207i <= 17) {
                    int i38 = iArr[i36 + 2];
                    int i39 = 1 << (i38 >>> 20);
                    int i41 = i38 & 1048575;
                    if (i41 != i32) {
                        if (i32 != 1048575) {
                            unsafe2.putInt(obj2, i32, i31);
                        }
                        if (i41 != 1048575) {
                            i31 = unsafe2.getInt(obj2, i41);
                        }
                        i32 = i41;
                    }
                    switch (m21207i) {
                        case 0:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i19 = i14;
                            i16 = i34;
                            if (i35 == 1) {
                                ix3.m23464z(obj2, j11, Double.longBitsToDouble(zs3.m28611n(bArr2, i19)));
                                i27 = i19 + 8;
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 1:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i19 = i14;
                            i16 = i34;
                            if (i35 == 5) {
                                ix3.m23431A(obj2, j11, Float.intBitsToFloat(zs3.m28599b(bArr2, i19)));
                                i27 = i19 + 4;
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 2:
                        case 3:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i19 = i14;
                            i16 = i34;
                            if (i35 == 0) {
                                m28610m = zs3.m28610m(bArr2, i19, ys3Var2);
                                unsafe2.putLong(obj, j11, ys3Var2.f31091b);
                                i31 |= i39;
                                i27 = m28610m;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 4:
                        case 11:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i19 = i14;
                            i16 = i34;
                            if (i35 == 0) {
                                i27 = zs3.m28607j(bArr2, i19, ys3Var2);
                                unsafe2.putInt(obj2, j11, ys3Var2.f31090a);
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 5:
                        case 14:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 1) {
                                i19 = i14;
                                unsafe2.putLong(obj, j11, zs3.m28611n(bArr2, i14));
                                i27 = i19 + 8;
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 6:
                        case 13:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 5) {
                                unsafe2.putInt(obj2, j11, zs3.m28599b(bArr2, i14));
                                i27 = i14 + 4;
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 7:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 0) {
                                i27 = zs3.m28610m(bArr2, i14, ys3Var2);
                                ix3.m23462x(obj2, j11, ys3Var2.f31091b != 0);
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 8:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 2) {
                                if ((536870912 & i37) == 0) {
                                    i27 = zs3.m28604g(bArr2, i14, ys3Var2);
                                } else {
                                    i27 = zs3.m28605h(bArr2, i14, ys3Var2);
                                }
                                unsafe2.putObject(obj2, j11, ys3Var2.f31092c);
                                i31 |= i39;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 9:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 2) {
                                m28601d = zs3.m28601d(cw3Var.m21211m(i18), bArr2, i14, i24, ys3Var2);
                                Object object = unsafe2.getObject(obj2, j11);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j11, ys3Var2.f31092c);
                                } else {
                                    unsafe2.putObject(obj2, j11, dv3.m21552g(object, ys3Var2.f31092c));
                                }
                                i31 |= i39;
                                i27 = m28601d;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 10:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 2) {
                                m28601d = zs3.m28598a(bArr2, i14, ys3Var2);
                                unsafe2.putObject(obj2, j11, ys3Var2.f31092c);
                                i31 |= i39;
                                i27 = m28601d;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 12:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 0) {
                                m28601d = zs3.m28607j(bArr2, i14, ys3Var2);
                                unsafe2.putInt(obj2, j11, ys3Var2.f31090a);
                                i31 |= i39;
                                i27 = m28601d;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case 15:
                            ys3Var2 = ys3Var;
                            i18 = i36;
                            i16 = i34;
                            if (i35 == 0) {
                                m28601d = zs3.m28607j(bArr2, i14, ys3Var2);
                                unsafe2.putInt(obj2, j11, vt3.m27352e(ys3Var2.f31090a));
                                i31 |= i39;
                                i27 = m28601d;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            if (i35 != 0) {
                                i16 = i34;
                                i18 = i36;
                                i19 = i14;
                                i15 = i19;
                                unsafe = unsafe2;
                                i17 = i18;
                                break;
                            } else {
                                ys3Var2 = ys3Var;
                                m28610m = zs3.m28610m(bArr2, i14, ys3Var2);
                                i18 = i36;
                                i16 = i34;
                                unsafe2.putLong(obj, j11, vt3.m27353f(ys3Var2.f31091b));
                                i31 |= i39;
                                i27 = m28610m;
                                i29 = i18;
                                i28 = i16;
                                break;
                            }
                        default:
                            i16 = i34;
                            i18 = i36;
                            i19 = i14;
                            i15 = i19;
                            unsafe = unsafe2;
                            i17 = i18;
                            break;
                    }
                } else {
                    ys3Var2 = ys3Var;
                    i18 = i36;
                    int i42 = i14;
                    i16 = i34;
                    if (m21207i == 27) {
                        if (i35 == 2) {
                            cv3 cv3Var = (cv3) unsafe2.getObject(obj2, j11);
                            if (!cv3Var.zzc()) {
                                int size = cv3Var.size();
                                cv3Var = cv3Var.mo21159c(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j11, cv3Var);
                            }
                            i27 = zs3.m28602e(cw3Var.m21211m(i18), i13, bArr, i42, i12, cv3Var, ys3Var);
                            i31 = i31;
                            i29 = i18;
                            i28 = i16;
                        } else {
                            i21 = i42;
                            i22 = i31;
                            i23 = i32;
                            unsafe = unsafe2;
                            i17 = i18;
                        }
                    } else if (m21207i <= 49) {
                        i22 = i31;
                        i23 = i32;
                        unsafe = unsafe2;
                        i17 = i18;
                        i27 = m21202R(obj, bArr, i42, i12, i13, i16, i35, i18, i37, m21207i, j11, ys3Var);
                        if (i27 != i42) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i24 = i12;
                            ys3Var2 = ys3Var;
                            i32 = i23;
                            i28 = i16;
                            i31 = i22;
                            i29 = i17;
                            unsafe2 = unsafe;
                            i26 = -1;
                            i25 = 1048575;
                            cw3Var = this;
                        } else {
                            i15 = i27;
                            i32 = i23;
                            i31 = i22;
                        }
                    } else {
                        i21 = i42;
                        i22 = i31;
                        i23 = i32;
                        unsafe = unsafe2;
                        i17 = i18;
                        if (m21207i != 50) {
                            i27 = m21200P(obj, bArr, i21, i12, i13, i16, i35, i37, m21207i, j11, i17, ys3Var);
                            if (i27 != i21) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i24 = i12;
                                ys3Var2 = ys3Var;
                                i32 = i23;
                                i28 = i16;
                                i31 = i22;
                                i29 = i17;
                                unsafe2 = unsafe;
                                i26 = -1;
                                i25 = 1048575;
                                cw3Var = this;
                            } else {
                                i15 = i27;
                                i32 = i23;
                                i31 = i22;
                            }
                        } else if (i35 == 2) {
                            i27 = m21199O(obj, bArr, i21, i12, i17, j11, ys3Var);
                            if (i27 != i21) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i24 = i12;
                                ys3Var2 = ys3Var;
                                i32 = i23;
                                i28 = i16;
                                i31 = i22;
                                i29 = i17;
                                unsafe2 = unsafe;
                                i26 = -1;
                                i25 = 1048575;
                                cw3Var = this;
                            } else {
                                i15 = i27;
                                i32 = i23;
                                i31 = i22;
                            }
                        }
                    }
                    i15 = i21;
                    i32 = i23;
                    i31 = i22;
                }
                i26 = -1;
                i25 = 1048575;
            }
            i27 = zs3.m28606i(i13, bArr, i15, i12, m21191G(obj), ys3Var);
            cw3Var = this;
            obj2 = obj;
            bArr2 = bArr;
            i24 = i12;
            ys3Var2 = ys3Var;
            i28 = i16;
            i29 = i17;
            unsafe2 = unsafe;
            i26 = -1;
            i25 = 1048575;
        }
        int i43 = i31;
        int i44 = i32;
        Unsafe unsafe3 = unsafe2;
        if (i44 != 1048575) {
            unsafe3.putInt(obj, i44, i43);
        }
        if (i27 == i12) {
            return i27;
        }
        throw zzgrq.m28823g();
    }

    /* renamed from: R */
    private final int m21202R(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, ys3 ys3Var) {
        int i18;
        int i19;
        int m28609l;
        int i21 = i11;
        Unsafe unsafe = f19006r;
        cv3 cv3Var = (cv3) unsafe.getObject(obj, j12);
        if (!cv3Var.zzc()) {
            int size = cv3Var.size();
            cv3Var = cv3Var.mo21159c(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j12, cv3Var);
        }
        switch (i17) {
            case 18:
            case 35:
                if (i15 == 2) {
                    AbstractC30228a.m149044a(cv3Var);
                    int m28607j = zs3.m28607j(bArr, i21, ys3Var);
                    int i22 = ys3Var.f31090a + m28607j;
                    if (m28607j < i22) {
                        Double.longBitsToDouble(zs3.m28611n(bArr, m28607j));
                        throw null;
                    }
                    if (m28607j == i22) {
                        return m28607j;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 1) {
                    AbstractC30228a.m149044a(cv3Var);
                    Double.longBitsToDouble(zs3.m28611n(bArr, i11));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    AbstractC30228a.m149044a(cv3Var);
                    int m28607j2 = zs3.m28607j(bArr, i21, ys3Var);
                    int i23 = ys3Var.f31090a + m28607j2;
                    if (m28607j2 < i23) {
                        Float.intBitsToFloat(zs3.m28599b(bArr, m28607j2));
                        throw null;
                    }
                    if (m28607j2 == i23) {
                        return m28607j2;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 5) {
                    AbstractC30228a.m149044a(cv3Var);
                    Float.intBitsToFloat(zs3.m28599b(bArr, i11));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    pv3 pv3Var = (pv3) cv3Var;
                    int m28607j3 = zs3.m28607j(bArr, i21, ys3Var);
                    int i24 = ys3Var.f31090a + m28607j3;
                    while (m28607j3 < i24) {
                        m28607j3 = zs3.m28610m(bArr, m28607j3, ys3Var);
                        pv3Var.m25559j(ys3Var.f31091b);
                    }
                    if (m28607j3 == i24) {
                        return m28607j3;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 0) {
                    pv3 pv3Var2 = (pv3) cv3Var;
                    int m28610m = zs3.m28610m(bArr, i21, ys3Var);
                    pv3Var2.m25559j(ys3Var.f31091b);
                    while (m28610m < i12) {
                        int m28607j4 = zs3.m28607j(bArr, m28610m, ys3Var);
                        if (i13 != ys3Var.f31090a) {
                            return m28610m;
                        }
                        m28610m = zs3.m28610m(bArr, m28607j4, ys3Var);
                        pv3Var2.m25559j(ys3Var.f31091b);
                    }
                    return m28610m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return zs3.m28603f(bArr, i21, cv3Var, ys3Var);
                }
                if (i15 == 0) {
                    return zs3.m28609l(i13, bArr, i11, i12, cv3Var, ys3Var);
                }
                break;
            case 23:
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
            case 40:
            case 46:
                if (i15 == 2) {
                    pv3 pv3Var3 = (pv3) cv3Var;
                    int m28607j5 = zs3.m28607j(bArr, i21, ys3Var);
                    int i25 = ys3Var.f31090a + m28607j5;
                    while (m28607j5 < i25) {
                        pv3Var3.m25559j(zs3.m28611n(bArr, m28607j5));
                        m28607j5 += 8;
                    }
                    if (m28607j5 == i25) {
                        return m28607j5;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 1) {
                    pv3 pv3Var4 = (pv3) cv3Var;
                    pv3Var4.m25559j(zs3.m28611n(bArr, i11));
                    while (true) {
                        i18 = i21 + 8;
                        if (i18 < i12) {
                            i21 = zs3.m28607j(bArr, i18, ys3Var);
                            if (i13 == ys3Var.f31090a) {
                                pv3Var4.m25559j(zs3.m28611n(bArr, i21));
                            }
                        }
                    }
                    return i18;
                }
                break;
            case 24:
            case 31:
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
            case 45:
                if (i15 == 2) {
                    uu3 uu3Var = (uu3) cv3Var;
                    int m28607j6 = zs3.m28607j(bArr, i21, ys3Var);
                    int i26 = ys3Var.f31090a + m28607j6;
                    while (m28607j6 < i26) {
                        uu3Var.mo27068f(zs3.m28599b(bArr, m28607j6));
                        m28607j6 += 4;
                    }
                    if (m28607j6 == i26) {
                        return m28607j6;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 5) {
                    uu3 uu3Var2 = (uu3) cv3Var;
                    uu3Var2.mo27068f(zs3.m28599b(bArr, i11));
                    while (true) {
                        i19 = i21 + 4;
                        if (i19 < i12) {
                            i21 = zs3.m28607j(bArr, i19, ys3Var);
                            if (i13 == ys3Var.f31090a) {
                                uu3Var2.mo27068f(zs3.m28599b(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    AbstractC30228a.m149044a(cv3Var);
                    int m28607j7 = zs3.m28607j(bArr, i21, ys3Var);
                    int i27 = ys3Var.f31090a + m28607j7;
                    if (m28607j7 < i27) {
                        zs3.m28610m(bArr, m28607j7, ys3Var);
                        throw null;
                    }
                    if (m28607j7 == i27) {
                        return m28607j7;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 0) {
                    AbstractC30228a.m149044a(cv3Var);
                    zs3.m28610m(bArr, i21, ys3Var);
                    long j13 = ys3Var.f31091b;
                    throw null;
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        i21 = zs3.m28607j(bArr, i21, ys3Var);
                        int i28 = ys3Var.f31090a;
                        if (i28 < 0) {
                            throw zzgrq.m28822f();
                        }
                        if (i28 == 0) {
                            cv3Var.add("");
                        } else {
                            cv3Var.add(new String(bArr, i21, i28, dv3.f19426b));
                            i21 += i28;
                        }
                        while (i21 < i12) {
                            int m28607j8 = zs3.m28607j(bArr, i21, ys3Var);
                            if (i13 != ys3Var.f31090a) {
                                break;
                            } else {
                                i21 = zs3.m28607j(bArr, m28607j8, ys3Var);
                                int i29 = ys3Var.f31090a;
                                if (i29 < 0) {
                                    throw zzgrq.m28822f();
                                }
                                if (i29 == 0) {
                                    cv3Var.add("");
                                } else {
                                    cv3Var.add(new String(bArr, i21, i29, dv3.f19426b));
                                    i21 += i29;
                                }
                            }
                        }
                        break;
                    } else {
                        i21 = zs3.m28607j(bArr, i21, ys3Var);
                        int i31 = ys3Var.f31090a;
                        if (i31 < 0) {
                            throw zzgrq.m28822f();
                        }
                        if (i31 == 0) {
                            cv3Var.add("");
                        } else {
                            int i32 = i21 + i31;
                            if (nx3.m25040j(bArr, i21, i32)) {
                                cv3Var.add(new String(bArr, i21, i31, dv3.f19426b));
                                i21 = i32;
                            } else {
                                throw zzgrq.m28820d();
                            }
                        }
                        while (i21 < i12) {
                            int m28607j9 = zs3.m28607j(bArr, i21, ys3Var);
                            if (i13 != ys3Var.f31090a) {
                                break;
                            } else {
                                i21 = zs3.m28607j(bArr, m28607j9, ys3Var);
                                int i33 = ys3Var.f31090a;
                                if (i33 < 0) {
                                    throw zzgrq.m28822f();
                                }
                                if (i33 == 0) {
                                    cv3Var.add("");
                                } else {
                                    int i34 = i21 + i33;
                                    if (nx3.m25040j(bArr, i21, i34)) {
                                        cv3Var.add(new String(bArr, i21, i33, dv3.f19426b));
                                        i21 = i34;
                                    } else {
                                        throw zzgrq.m28820d();
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i15 == 2) {
                    return zs3.m28602e(m21211m(i16), i13, bArr, i11, i12, cv3Var, ys3Var);
                }
                break;
            case 28:
                if (i15 == 2) {
                    int m28607j10 = zs3.m28607j(bArr, i21, ys3Var);
                    int i35 = ys3Var.f31090a;
                    if (i35 >= 0) {
                        if (i35 > bArr.length - m28607j10) {
                            throw zzgrq.m28825j();
                        }
                        if (i35 == 0) {
                            cv3Var.add(mt3.f24751q);
                        } else {
                            cv3Var.add(mt3.m24727J(bArr, m28607j10, i35));
                            m28607j10 += i35;
                        }
                        while (m28607j10 < i12) {
                            int m28607j11 = zs3.m28607j(bArr, m28607j10, ys3Var);
                            if (i13 != ys3Var.f31090a) {
                                return m28607j10;
                            }
                            m28607j10 = zs3.m28607j(bArr, m28607j11, ys3Var);
                            int i36 = ys3Var.f31090a;
                            if (i36 >= 0) {
                                if (i36 > bArr.length - m28607j10) {
                                    throw zzgrq.m28825j();
                                }
                                if (i36 == 0) {
                                    cv3Var.add(mt3.f24751q);
                                } else {
                                    cv3Var.add(mt3.m24727J(bArr, m28607j10, i36));
                                    m28607j10 += i36;
                                }
                            } else {
                                throw zzgrq.m28822f();
                            }
                        }
                        return m28607j10;
                    }
                    throw zzgrq.m28822f();
                }
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                if (i15 == 2) {
                    m28609l = zs3.m28603f(bArr, i21, cv3Var, ys3Var);
                } else if (i15 == 0) {
                    m28609l = zs3.m28609l(i13, bArr, i11, i12, cv3Var, ys3Var);
                }
                tu3 tu3Var = (tu3) obj;
                yw3 yw3Var = tu3Var.zzc;
                Object m27398c = vw3.m27398c(i14, cv3Var, m21210l(i16), yw3Var != yw3.m28369c() ? yw3Var : null, this.f19019m);
                if (m27398c == null) {
                    return m28609l;
                }
                tu3Var.zzc = (yw3) m27398c;
                return m28609l;
            case 33:
            case 47:
                if (i15 == 2) {
                    uu3 uu3Var3 = (uu3) cv3Var;
                    int m28607j12 = zs3.m28607j(bArr, i21, ys3Var);
                    int i37 = ys3Var.f31090a + m28607j12;
                    while (m28607j12 < i37) {
                        m28607j12 = zs3.m28607j(bArr, m28607j12, ys3Var);
                        uu3Var3.mo27068f(vt3.m27352e(ys3Var.f31090a));
                    }
                    if (m28607j12 == i37) {
                        return m28607j12;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 0) {
                    uu3 uu3Var4 = (uu3) cv3Var;
                    int m28607j13 = zs3.m28607j(bArr, i21, ys3Var);
                    uu3Var4.mo27068f(vt3.m27352e(ys3Var.f31090a));
                    while (m28607j13 < i12) {
                        int m28607j14 = zs3.m28607j(bArr, m28607j13, ys3Var);
                        if (i13 != ys3Var.f31090a) {
                            return m28607j13;
                        }
                        m28607j13 = zs3.m28607j(bArr, m28607j14, ys3Var);
                        uu3Var4.mo27068f(vt3.m27352e(ys3Var.f31090a));
                    }
                    return m28607j13;
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    pv3 pv3Var5 = (pv3) cv3Var;
                    int m28607j15 = zs3.m28607j(bArr, i21, ys3Var);
                    int i38 = ys3Var.f31090a + m28607j15;
                    while (m28607j15 < i38) {
                        m28607j15 = zs3.m28610m(bArr, m28607j15, ys3Var);
                        pv3Var5.m25559j(vt3.m27353f(ys3Var.f31091b));
                    }
                    if (m28607j15 == i38) {
                        return m28607j15;
                    }
                    throw zzgrq.m28825j();
                }
                if (i15 == 0) {
                    pv3 pv3Var6 = (pv3) cv3Var;
                    int m28610m2 = zs3.m28610m(bArr, i21, ys3Var);
                    pv3Var6.m25559j(vt3.m27353f(ys3Var.f31091b));
                    while (m28610m2 < i12) {
                        int m28607j16 = zs3.m28607j(bArr, m28610m2, ys3Var);
                        if (i13 != ys3Var.f31090a) {
                            return m28610m2;
                        }
                        m28610m2 = zs3.m28610m(bArr, m28607j16, ys3Var);
                        pv3Var6.m25559j(vt3.m27353f(ys3Var.f31091b));
                    }
                    return m28610m2;
                }
                break;
            default:
                if (i15 == 3) {
                    tw3 m21211m = m21211m(i16);
                    int i39 = (i13 & (-8)) | 4;
                    int m28600c = zs3.m28600c(m21211m, bArr, i11, i12, i39, ys3Var);
                    cv3Var.add(ys3Var.f31092c);
                    while (m28600c < i12) {
                        int m28607j17 = zs3.m28607j(bArr, m28600c, ys3Var);
                        if (i13 != ys3Var.f31090a) {
                            return m28600c;
                        }
                        m28600c = zs3.m28600c(m21211m, bArr, m28607j17, i12, i39, ys3Var);
                        cv3Var.add(ys3Var.f31092c);
                    }
                    return m28600c;
                }
                break;
        }
        return i21;
    }

    /* renamed from: S */
    private final int m21203S(int i11) {
        if (i11 >= this.f19009c && i11 <= this.f19010d) {
            return m21206h(i11, 0);
        }
        return -1;
    }

    /* renamed from: T */
    private final int m21204T(int i11, int i12) {
        if (i11 >= this.f19009c && i11 <= this.f19010d) {
            return m21206h(i11, i12);
        }
        return -1;
    }

    /* renamed from: U */
    private final int m21205U(int i11) {
        return this.f19007a[i11 + 2];
    }

    /* renamed from: h */
    private final int m21206h(int i11, int i12) {
        int length = (this.f19007a.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.f19007a[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    /* renamed from: i */
    private static int m21207i(int i11) {
        return (i11 >>> 20) & 255;
    }

    /* renamed from: j */
    private final int m21208j(int i11) {
        return this.f19007a[i11 + 1];
    }

    /* renamed from: k */
    private static long m21209k(Object obj, long j11) {
        return ((Long) ix3.m23454p(obj, j11)).longValue();
    }

    /* renamed from: l */
    private final xu3 m21210l(int i11) {
        int i12 = i11 / 3;
        return (xu3) this.f19008b[i12 + i12 + 1];
    }

    /* renamed from: m */
    private final tw3 m21211m(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        tw3 tw3Var = (tw3) this.f19008b[i13];
        if (tw3Var != null) {
            return tw3Var;
        }
        tw3 m23057b = hw3.m23056a().m23057b((Class) this.f19008b[i13 + 1]);
        this.f19008b[i13] = m23057b;
        return m23057b;
    }

    /* renamed from: n */
    private final Object m21212n(Object obj, int i11, Object obj2, xw3 xw3Var) {
        int i12 = this.f19007a[i11];
        Object m23454p = ix3.m23454p(obj, m21208j(i11) & 1048575);
        if (m23454p == null) {
            return obj2;
        }
        if (m21210l(i11) == null) {
            return obj2;
        }
        AbstractC30228a.m149044a(m21213o(i11));
        throw null;
    }

    /* renamed from: o */
    private final Object m21213o(int i11) {
        int i12 = i11 / 3;
        return this.f19008b[i12 + i12];
    }

    /* renamed from: p */
    private static Field m21214p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: q */
    private final void m21215q(Object obj, Object obj2, int i11) {
        long m21208j = m21208j(i11) & 1048575;
        if (!m21222x(obj2, i11)) {
            return;
        }
        Object m23454p = ix3.m23454p(obj, m21208j);
        Object m23454p2 = ix3.m23454p(obj2, m21208j);
        if (m23454p != null && m23454p2 != null) {
            ix3.m23434D(obj, m21208j, dv3.m21552g(m23454p, m23454p2));
            m21218t(obj, i11);
        } else if (m23454p2 != null) {
            ix3.m23434D(obj, m21208j, m23454p2);
            m21218t(obj, i11);
        }
    }

    /* renamed from: r */
    private final void m21216r(Object obj, Object obj2, int i11) {
        Object obj3;
        int m21208j = m21208j(i11);
        int i12 = this.f19007a[i11];
        long j11 = m21208j & 1048575;
        if (!m21186A(obj2, i12, i11)) {
            return;
        }
        if (m21186A(obj, i12, i11)) {
            obj3 = ix3.m23454p(obj, j11);
        } else {
            obj3 = null;
        }
        Object m23454p = ix3.m23454p(obj2, j11);
        if (obj3 != null && m23454p != null) {
            ix3.m23434D(obj, j11, dv3.m21552g(obj3, m23454p));
            m21219u(obj, i12, i11);
        } else if (m23454p != null) {
            ix3.m23434D(obj, j11, m23454p);
            m21219u(obj, i12, i11);
        }
    }

    /* renamed from: s */
    private final void m21217s(Object obj, int i11, kw3 kw3Var) {
        if (m21221w(i11)) {
            ix3.m23434D(obj, i11 & 1048575, kw3Var.mo24054a());
        } else if (this.f19013g) {
            ix3.m23434D(obj, i11 & 1048575, kw3Var.zzt());
        } else {
            ix3.m23434D(obj, i11 & 1048575, kw3Var.zzp());
        }
    }

    /* renamed from: t */
    private final void m21218t(Object obj, int i11) {
        int m21205U = m21205U(i11);
        long j11 = 1048575 & m21205U;
        if (j11 == 1048575) {
            return;
        }
        ix3.m23432B(obj, j11, (1 << (m21205U >>> 20)) | ix3.m23450l(obj, j11));
    }

    /* renamed from: u */
    private final void m21219u(Object obj, int i11, int i12) {
        ix3.m23432B(obj, m21205U(i12) & 1048575, i11);
    }

    /* renamed from: v */
    private final boolean m21220v(Object obj, Object obj2, int i11) {
        if (m21222x(obj, i11) == m21222x(obj2, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private static boolean m21221w(int i11) {
        return (i11 & 536870912) != 0;
    }

    /* renamed from: x */
    private final boolean m21222x(Object obj, int i11) {
        int m21205U = m21205U(i11);
        long j11 = m21205U & 1048575;
        if (j11 == 1048575) {
            int m21208j = m21208j(i11);
            long j12 = m21208j & 1048575;
            switch (m21207i(m21208j)) {
                case 0:
                    if (Double.doubleToRawLongBits(ix3.m23448j(obj, j12)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(ix3.m23449k(obj, j12)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (ix3.m23452n(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (ix3.m23452n(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (ix3.m23450l(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (ix3.m23452n(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (ix3.m23450l(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return ix3.m23438H(obj, j12);
                case 8:
                    Object m23454p = ix3.m23454p(obj, j12);
                    if (m23454p instanceof String) {
                        if (((String) m23454p).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (m23454p instanceof mt3) {
                        if (mt3.f24751q.equals(m23454p)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (ix3.m23454p(obj, j12) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (mt3.f24751q.equals(ix3.m23454p(obj, j12))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (ix3.m23450l(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (ix3.m23450l(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (ix3.m23450l(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (ix3.m23452n(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (ix3.m23450l(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (ix3.m23452n(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (ix3.m23454p(obj, j12) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((ix3.m23450l(obj, j11) & (1 << (m21205U >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private final boolean m21223y(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return m21222x(obj, i11);
        }
        if ((i13 & i14) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private static boolean m21224z(Object obj, int i11, tw3 tw3Var) {
        return tw3Var.mo21229d(ix3.m23454p(obj, i11 & 1048575));
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03a7, code lost:            if (r0 != r19) goto L349;     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03a9, code lost:            r15 = r30;        r14 = r31;        r12 = r32;        r2 = r33;        r13 = r34;        r11 = r35;        r9 = r36;        r5 = r19;        r1 = r20;        r3 = r22;        r6 = r23;     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03c3, code lost:            r2 = r0;        r7 = r20;        r6 = r23;        r0 = r35;     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03ec, code lost:            if (r0 != r15) goto L349;     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0412, code lost:            if (r0 != r15) goto L349;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008e. Please report as an issue. */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m21225F(Object obj, byte[] bArr, int i11, int i12, int i13, ys3 ys3Var) {
        Unsafe unsafe;
        int i14;
        cw3 cw3Var;
        Object obj2;
        int i15;
        int m21203S;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        ys3 ys3Var2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int m28605h;
        cw3 cw3Var2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i38 = i12;
        int i39 = i13;
        ys3 ys3Var3 = ys3Var;
        Unsafe unsafe2 = f19006r;
        int i41 = i11;
        int i42 = 0;
        int i43 = -1;
        int i44 = 0;
        int i45 = 0;
        int i46 = 1048575;
        while (true) {
            if (i41 < i38) {
                int i47 = i41 + 1;
                byte b11 = bArr2[i41];
                if (b11 < 0) {
                    int m28608k = zs3.m28608k(b11, bArr2, i47, ys3Var3);
                    i15 = ys3Var3.f31090a;
                    i47 = m28608k;
                } else {
                    i15 = b11;
                }
                int i48 = i15 >>> 3;
                int i49 = i15 & 7;
                if (i48 > i43) {
                    m21203S = cw3Var2.m21204T(i48, i44 / 3);
                } else {
                    m21203S = cw3Var2.m21203S(i48);
                }
                int i51 = m21203S;
                if (i51 == -1) {
                    i16 = i48;
                    i17 = i47;
                    i18 = i15;
                    i19 = i45;
                    unsafe = unsafe2;
                    i21 = i39;
                    i22 = 0;
                } else {
                    int[] iArr = cw3Var2.f19007a;
                    int i52 = iArr[i51 + 1];
                    int m21207i = m21207i(i52);
                    int i53 = i47;
                    long j11 = i52 & 1048575;
                    int i54 = i15;
                    if (m21207i <= 17) {
                        int i55 = iArr[i51 + 2];
                        int i56 = 1 << (i55 >>> 20);
                        int i57 = i55 & 1048575;
                        if (i57 != i46) {
                            i27 = i51;
                            if (i46 != 1048575) {
                                unsafe2.putInt(obj3, i46, i45);
                            }
                            i26 = i57;
                            i28 = unsafe2.getInt(obj3, i57);
                        } else {
                            i27 = i51;
                            i26 = i46;
                            i28 = i45;
                        }
                        switch (m21207i) {
                            case 0:
                                i29 = i48;
                                i31 = i27;
                                i32 = i53;
                                bArr2 = bArr;
                                if (i49 == 1) {
                                    ix3.m23464z(obj3, j11, Double.longBitsToDouble(zs3.m28611n(bArr2, i32)));
                                    i41 = i32 + 8;
                                    i45 = i28 | i56;
                                    i38 = i12;
                                    i43 = i29;
                                    i42 = i54;
                                    i46 = i26;
                                    i44 = i31;
                                    i39 = i13;
                                    break;
                                } else {
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 1:
                                i29 = i48;
                                i31 = i27;
                                i32 = i53;
                                bArr2 = bArr;
                                if (i49 == 5) {
                                    ix3.m23431A(obj3, j11, Float.intBitsToFloat(zs3.m28599b(bArr2, i32)));
                                    i41 = i32 + 4;
                                    i45 = i28 | i56;
                                    i38 = i12;
                                    i43 = i29;
                                    i42 = i54;
                                    i46 = i26;
                                    i44 = i31;
                                    i39 = i13;
                                    break;
                                } else {
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 2:
                            case 3:
                                i29 = i48;
                                i31 = i27;
                                i32 = i53;
                                bArr2 = bArr;
                                if (i49 == 0) {
                                    int m28610m = zs3.m28610m(bArr2, i32, ys3Var3);
                                    unsafe2.putLong(obj, j11, ys3Var3.f31091b);
                                    i45 = i28 | i56;
                                    i38 = i12;
                                    i41 = m28610m;
                                    i43 = i29;
                                    i42 = i54;
                                    i46 = i26;
                                    i44 = i31;
                                    i39 = i13;
                                    break;
                                } else {
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 4:
                            case 11:
                                i29 = i48;
                                i31 = i27;
                                i32 = i53;
                                bArr2 = bArr;
                                if (i49 == 0) {
                                    i41 = zs3.m28607j(bArr2, i32, ys3Var3);
                                    unsafe2.putInt(obj3, j11, ys3Var3.f31090a);
                                    i45 = i28 | i56;
                                    i38 = i12;
                                    i43 = i29;
                                    i42 = i54;
                                    i46 = i26;
                                    i44 = i31;
                                    i39 = i13;
                                    break;
                                } else {
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 5:
                            case 14:
                                i29 = i48;
                                i33 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 1) {
                                    i31 = i33;
                                    i54 = i35;
                                    i32 = i34;
                                    unsafe2.putLong(obj, j11, zs3.m28611n(bArr2, i34));
                                    i41 = i32 + 8;
                                    i45 = i28 | i56;
                                    i38 = i12;
                                    i43 = i29;
                                    i42 = i54;
                                    i46 = i26;
                                    i44 = i31;
                                    i39 = i13;
                                    break;
                                } else {
                                    i31 = i33;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 6:
                            case 13:
                                i29 = i48;
                                i33 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 5) {
                                    unsafe2.putInt(obj3, j11, zs3.m28599b(bArr2, i34));
                                    int i58 = i34 + 4;
                                    i45 = i28 | i56;
                                    i44 = i33;
                                    i41 = i58;
                                    i43 = i29;
                                    i42 = i35;
                                    i46 = i26;
                                    i38 = i12;
                                    i39 = i13;
                                    break;
                                } else {
                                    i31 = i33;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 7:
                                i37 = i12;
                                i29 = i48;
                                i33 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 0) {
                                    int m28610m2 = zs3.m28610m(bArr2, i34, ys3Var3);
                                    ix3.m23462x(obj3, j11, ys3Var3.f31091b != 0);
                                    int i59 = i28 | i56;
                                    i44 = i33;
                                    i41 = m28610m2;
                                    i46 = i26;
                                    i45 = i59;
                                    i43 = i29;
                                    i39 = i13;
                                    int i61 = i35;
                                    i38 = i37;
                                    i42 = i61;
                                    break;
                                } else {
                                    i31 = i33;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 8:
                                i37 = i12;
                                i29 = i48;
                                i33 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 2) {
                                    if ((536870912 & i52) == 0) {
                                        m28605h = zs3.m28604g(bArr2, i34, ys3Var3);
                                    } else {
                                        m28605h = zs3.m28605h(bArr2, i34, ys3Var3);
                                    }
                                    unsafe2.putObject(obj3, j11, ys3Var3.f31092c);
                                    i45 = i28 | i56;
                                    i44 = i33;
                                    i41 = m28605h;
                                    i43 = i29;
                                    i46 = i26;
                                    i39 = i13;
                                    int i612 = i35;
                                    i38 = i37;
                                    i42 = i612;
                                    break;
                                } else {
                                    i31 = i33;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 9:
                                i29 = i48;
                                i36 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 2) {
                                    i37 = i12;
                                    i41 = zs3.m28601d(cw3Var2.m21211m(i36), bArr2, i34, i37, ys3Var3);
                                    if ((i28 & i56) == 0) {
                                        unsafe2.putObject(obj3, j11, ys3Var3.f31092c);
                                    } else {
                                        unsafe2.putObject(obj3, j11, dv3.m21552g(unsafe2.getObject(obj3, j11), ys3Var3.f31092c));
                                    }
                                    i45 = i28 | i56;
                                    i44 = i36;
                                    i43 = i29;
                                    i46 = i26;
                                    i39 = i13;
                                    int i6122 = i35;
                                    i38 = i37;
                                    i42 = i6122;
                                    break;
                                } else {
                                    i31 = i36;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 10:
                                i29 = i48;
                                i36 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 2) {
                                    i41 = zs3.m28598a(bArr2, i34, ys3Var3);
                                    unsafe2.putObject(obj3, j11, ys3Var3.f31092c);
                                    i45 = i28 | i56;
                                    i44 = i36;
                                    i43 = i29;
                                    i42 = i35;
                                    i46 = i26;
                                    i38 = i12;
                                    i39 = i13;
                                    break;
                                } else {
                                    i31 = i36;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case 12:
                                i29 = i48;
                                i36 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 0) {
                                    i41 = zs3.m28607j(bArr2, i34, ys3Var3);
                                    int i62 = ys3Var3.f31090a;
                                    xu3 m21210l = cw3Var2.m21210l(i36);
                                    if (m21210l != null && !m21210l.mo20775a(i62)) {
                                        m21191G(obj).m28376h(i35, Long.valueOf(i62));
                                        i45 = i28;
                                        i44 = i36;
                                        i43 = i29;
                                        i42 = i35;
                                        i46 = i26;
                                        i38 = i12;
                                        i39 = i13;
                                    } else {
                                        unsafe2.putInt(obj3, j11, i62);
                                        i45 = i28 | i56;
                                        i44 = i36;
                                        i43 = i29;
                                        i42 = i35;
                                        i46 = i26;
                                        i38 = i12;
                                        i39 = i13;
                                        break;
                                    }
                                } else {
                                    i31 = i36;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                                break;
                            case 15:
                                i29 = i48;
                                i36 = i27;
                                i34 = i53;
                                i35 = i54;
                                bArr2 = bArr;
                                if (i49 == 0) {
                                    i41 = zs3.m28607j(bArr2, i34, ys3Var3);
                                    unsafe2.putInt(obj3, j11, vt3.m27352e(ys3Var3.f31090a));
                                    i45 = i28 | i56;
                                    i44 = i36;
                                    i43 = i29;
                                    i42 = i35;
                                    i46 = i26;
                                    i38 = i12;
                                    i39 = i13;
                                    break;
                                } else {
                                    i31 = i36;
                                    i54 = i35;
                                    i32 = i34;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                i29 = i48;
                                int i63 = i27;
                                if (i49 == 0) {
                                    bArr2 = bArr;
                                    int m28610m3 = zs3.m28610m(bArr2, i53, ys3Var3);
                                    i35 = i54;
                                    unsafe2.putLong(obj, j11, vt3.m27353f(ys3Var3.f31091b));
                                    i45 = i28 | i56;
                                    i44 = i63;
                                    i41 = m28610m3;
                                    i43 = i29;
                                    i42 = i35;
                                    i46 = i26;
                                    i38 = i12;
                                    i39 = i13;
                                    break;
                                } else {
                                    i54 = i54;
                                    i32 = i53;
                                    i31 = i63;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                            default:
                                if (i49 == 3) {
                                    int i64 = i27;
                                    i41 = zs3.m28600c(cw3Var2.m21211m(i64), bArr, i53, i12, (i48 << 3) | 4, ys3Var);
                                    if ((i28 & i56) == 0) {
                                        unsafe2.putObject(obj3, j11, ys3Var3.f31092c);
                                    } else {
                                        unsafe2.putObject(obj3, j11, dv3.m21552g(unsafe2.getObject(obj3, j11), ys3Var3.f31092c));
                                    }
                                    i45 = i28 | i56;
                                    bArr2 = bArr;
                                    i38 = i12;
                                    i44 = i64;
                                    i42 = i54;
                                    i43 = i48;
                                    i46 = i26;
                                    i39 = i13;
                                    break;
                                } else {
                                    i29 = i48;
                                    i31 = i27;
                                    i32 = i53;
                                    i21 = i13;
                                    i19 = i28;
                                    unsafe = unsafe2;
                                    i16 = i29;
                                    i17 = i32;
                                    i18 = i54;
                                    i46 = i26;
                                    i22 = i31;
                                    break;
                                }
                        }
                    } else {
                        bArr2 = bArr;
                        if (m21207i != 27) {
                            i19 = i45;
                            i24 = i46;
                            i22 = i51;
                            if (m21207i <= 49) {
                                i16 = i48;
                                unsafe = unsafe2;
                                i41 = m21202R(obj, bArr, i53, i12, i54, i16, i49, i22, i52, m21207i, j11, ys3Var);
                            } else {
                                i16 = i48;
                                unsafe = unsafe2;
                                i25 = i53;
                                if (m21207i != 50) {
                                    i41 = m21200P(obj, bArr, i25, i12, i54, i16, i49, i52, m21207i, j11, i22, ys3Var);
                                } else if (i49 == 2) {
                                    i41 = m21199O(obj, bArr, i25, i12, i22, j11, ys3Var);
                                }
                            }
                        } else if (i49 == 2) {
                            cv3 cv3Var = (cv3) unsafe2.getObject(obj3, j11);
                            if (!cv3Var.zzc()) {
                                int size = cv3Var.size();
                                cv3Var = cv3Var.mo21159c(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j11, cv3Var);
                            }
                            i42 = i54;
                            i26 = i46;
                            i41 = zs3.m28602e(cw3Var2.m21211m(i51), i42, bArr, i53, i12, cv3Var, ys3Var);
                            i38 = i12;
                            i44 = i51;
                            i43 = i48;
                            i45 = i45;
                            i46 = i26;
                            i39 = i13;
                        } else {
                            i19 = i45;
                            i24 = i46;
                            i16 = i48;
                            unsafe = unsafe2;
                            i25 = i53;
                            i22 = i51;
                        }
                        i21 = i13;
                        i17 = i25;
                        i18 = i54;
                        i46 = i24;
                    }
                }
                if (i18 != i21 || i21 == 0) {
                    int i65 = i21;
                    if (this.f19012f) {
                        ys3Var2 = ys3Var;
                        if (ys3Var2.f31093d != gu3.m22615a()) {
                            i23 = i16;
                            ys3Var2.f31093d.m22617c(this.f19011e, i23);
                            i41 = zs3.m28606i(i18, bArr, i17, i12, m21191G(obj), ys3Var);
                            obj3 = obj;
                            bArr2 = bArr;
                            i38 = i12;
                            i42 = i18;
                            cw3Var2 = this;
                            i43 = i23;
                            i45 = i19;
                            i44 = i22;
                            i39 = i65;
                            ys3Var3 = ys3Var2;
                            unsafe2 = unsafe;
                        } else {
                            i23 = i16;
                        }
                    } else {
                        i23 = i16;
                        ys3Var2 = ys3Var;
                    }
                    i41 = zs3.m28606i(i18, bArr, i17, i12, m21191G(obj), ys3Var);
                    obj3 = obj;
                    bArr2 = bArr;
                    i38 = i12;
                    i42 = i18;
                    cw3Var2 = this;
                    i43 = i23;
                    i45 = i19;
                    i44 = i22;
                    i39 = i65;
                    ys3Var3 = ys3Var2;
                    unsafe2 = unsafe;
                } else {
                    cw3Var = this;
                    i14 = i21;
                    i41 = i17;
                    i42 = i18;
                    i45 = i19;
                }
            } else {
                unsafe = unsafe2;
                i14 = i39;
                cw3Var = cw3Var2;
            }
        }
        if (i46 != 1048575) {
            obj2 = obj;
            unsafe.putInt(obj2, i46, i45);
        } else {
            obj2 = obj;
        }
        for (int i66 = cw3Var.f19016j; i66 < cw3Var.f19017k; i66++) {
            cw3Var.m21212n(obj2, cw3Var.f19015i[i66], null, cw3Var.f19019m);
        }
        if (i14 == 0) {
            if (i41 != i12) {
                throw zzgrq.m28823g();
            }
        } else if (i41 > i12 || i42 != i14) {
            throw zzgrq.m28823g();
        }
        return i41;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: a */
    public final void mo21226a(Object obj) {
        int i11;
        int i12 = this.f19016j;
        while (true) {
            i11 = this.f19017k;
            if (i12 >= i11) {
                break;
            }
            long m21208j = m21208j(this.f19015i[i12]) & 1048575;
            Object m23454p = ix3.m23454p(obj, m21208j);
            if (m23454p != null) {
                ((tv3) m23454p).m26785c();
                ix3.m23434D(obj, m21208j, m23454p);
            }
            i12++;
        }
        int length = this.f19015i.length;
        while (i11 < length) {
            this.f19018l.mo23761b(obj, this.f19015i[i11]);
            i11++;
        }
        this.f19019m.mo20341m(obj);
        if (this.f19012f) {
            this.f19020n.mo23027e(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: b */
    public final void mo21227b(Object obj, Object obj2) {
        obj2.getClass();
        for (int i11 = 0; i11 < this.f19007a.length; i11 += 3) {
            int m21208j = m21208j(i11);
            long j11 = 1048575 & m21208j;
            int i12 = this.f19007a[i11];
            switch (m21207i(m21208j)) {
                case 0:
                    if (m21222x(obj2, i11)) {
                        ix3.m23464z(obj, j11, ix3.m23448j(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m21222x(obj2, i11)) {
                        ix3.m23431A(obj, j11, ix3.m23449k(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m21222x(obj2, i11)) {
                        ix3.m23433C(obj, j11, ix3.m23452n(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m21222x(obj2, i11)) {
                        ix3.m23433C(obj, j11, ix3.m23452n(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m21222x(obj2, i11)) {
                        ix3.m23432B(obj, j11, ix3.m23450l(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m21222x(obj2, i11)) {
                        ix3.m23433C(obj, j11, ix3.m23452n(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m21222x(obj2, i11)) {
                        ix3.m23432B(obj, j11, ix3.m23450l(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m21222x(obj2, i11)) {
                        ix3.m23462x(obj, j11, ix3.m23438H(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m21222x(obj2, i11)) {
                        ix3.m23434D(obj, j11, ix3.m23454p(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m21215q(obj, obj2, i11);
                    break;
                case 10:
                    if (m21222x(obj2, i11)) {
                        ix3.m23434D(obj, j11, ix3.m23454p(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m21222x(obj2, i11)) {
                        ix3.m23432B(obj, j11, ix3.m23450l(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m21222x(obj2, i11)) {
                        ix3.m23432B(obj, j11, ix3.m23450l(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m21222x(obj2, i11)) {
                        ix3.m23432B(obj, j11, ix3.m23450l(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m21222x(obj2, i11)) {
                        ix3.m23433C(obj, j11, ix3.m23452n(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m21222x(obj2, i11)) {
                        ix3.m23432B(obj, j11, ix3.m23450l(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m21222x(obj2, i11)) {
                        ix3.m23433C(obj, j11, ix3.m23452n(obj2, j11));
                        m21218t(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m21215q(obj, obj2, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                case 31:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                case 42:
                case 43:
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f19018l.mo23762c(obj, obj2, j11);
                    break;
                case 50:
                    vw3.m27404i(this.f19022p, obj, obj2, j11);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m21186A(obj2, i12, i11)) {
                        ix3.m23434D(obj, j11, ix3.m23454p(obj2, j11));
                        m21219u(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m21216r(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m21186A(obj2, i12, i11)) {
                        ix3.m23434D(obj, j11, ix3.m23454p(obj2, j11));
                        m21219u(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m21216r(obj, obj2, i11);
                    break;
            }
        }
        vw3.m27401f(this.f19019m, obj, obj2);
        if (this.f19012f) {
            vw3.m27400e(this.f19020n, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo21228c(Object obj, Object obj2) {
        boolean m27403h;
        int length = this.f19007a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int m21208j = m21208j(i11);
            long j11 = m21208j & 1048575;
            switch (m21207i(m21208j)) {
                case 0:
                    if (m21220v(obj, obj2, i11) && Double.doubleToLongBits(ix3.m23448j(obj, j11)) == Double.doubleToLongBits(ix3.m23448j(obj2, j11))) {
                    }
                    return false;
                case 1:
                    if (m21220v(obj, obj2, i11) && Float.floatToIntBits(ix3.m23449k(obj, j11)) == Float.floatToIntBits(ix3.m23449k(obj2, j11))) {
                    }
                    return false;
                case 2:
                    if (m21220v(obj, obj2, i11) && ix3.m23452n(obj, j11) == ix3.m23452n(obj2, j11)) {
                    }
                    return false;
                case 3:
                    if (m21220v(obj, obj2, i11) && ix3.m23452n(obj, j11) == ix3.m23452n(obj2, j11)) {
                    }
                    return false;
                case 4:
                    if (m21220v(obj, obj2, i11) && ix3.m23450l(obj, j11) == ix3.m23450l(obj2, j11)) {
                    }
                    return false;
                case 5:
                    if (m21220v(obj, obj2, i11) && ix3.m23452n(obj, j11) == ix3.m23452n(obj2, j11)) {
                    }
                    return false;
                case 6:
                    if (m21220v(obj, obj2, i11) && ix3.m23450l(obj, j11) == ix3.m23450l(obj2, j11)) {
                    }
                    return false;
                case 7:
                    if (m21220v(obj, obj2, i11) && ix3.m23438H(obj, j11) == ix3.m23438H(obj2, j11)) {
                    }
                    return false;
                case 8:
                    if (m21220v(obj, obj2, i11) && vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11))) {
                    }
                    return false;
                case 9:
                    if (m21220v(obj, obj2, i11) && vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11))) {
                    }
                    return false;
                case 10:
                    if (m21220v(obj, obj2, i11) && vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11))) {
                    }
                    return false;
                case 11:
                    if (m21220v(obj, obj2, i11) && ix3.m23450l(obj, j11) == ix3.m23450l(obj2, j11)) {
                    }
                    return false;
                case 12:
                    if (m21220v(obj, obj2, i11) && ix3.m23450l(obj, j11) == ix3.m23450l(obj2, j11)) {
                    }
                    return false;
                case 13:
                    if (m21220v(obj, obj2, i11) && ix3.m23450l(obj, j11) == ix3.m23450l(obj2, j11)) {
                    }
                    return false;
                case 14:
                    if (m21220v(obj, obj2, i11) && ix3.m23452n(obj, j11) == ix3.m23452n(obj2, j11)) {
                    }
                    return false;
                case 15:
                    if (m21220v(obj, obj2, i11) && ix3.m23450l(obj, j11) == ix3.m23450l(obj2, j11)) {
                    }
                    return false;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m21220v(obj, obj2, i11) && ix3.m23452n(obj, j11) == ix3.m23452n(obj2, j11)) {
                    }
                    return false;
                case 17:
                    if (m21220v(obj, obj2, i11) && vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11))) {
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                case 31:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                case 42:
                case 43:
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    m27403h = vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11));
                    if (m27403h) {
                        return false;
                    }
                case 50:
                    m27403h = vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11));
                    if (m27403h) {
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                case 68:
                    long m21205U = m21205U(i11) & 1048575;
                    if (ix3.m23450l(obj, m21205U) == ix3.m23450l(obj2, m21205U) && vw3.m27403h(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11))) {
                    }
                    return false;
                default:
            }
        }
        if (!this.f19019m.mo20332d(obj).equals(this.f19019m.mo20332d(obj2))) {
            return false;
        }
        if (!this.f19012f) {
            return true;
        }
        this.f19020n.mo23023a(obj);
        this.f19020n.mo23023a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: d */
    public final boolean mo21229d(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f19016j) {
            int i16 = this.f19015i[i15];
            int i17 = this.f19007a[i16];
            int m21208j = m21208j(i16);
            int i18 = this.f19007a[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f19006r.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i13;
                i12 = i14;
            }
            if ((268435456 & m21208j) != 0 && !m21223y(obj, i16, i11, i12, i21)) {
                return false;
            }
            int m21207i = m21207i(m21208j);
            if (m21207i != 9 && m21207i != 17) {
                if (m21207i != 27) {
                    if (m21207i != 60 && m21207i != 68) {
                        if (m21207i != 49) {
                            if (m21207i == 50 && !((tv3) ix3.m23454p(obj, m21208j & 1048575)).isEmpty()) {
                                AbstractC30228a.m149044a(m21213o(i16));
                                throw null;
                            }
                        }
                    } else if (m21186A(obj, i17, i16) && !m21224z(obj, m21208j, m21211m(i16))) {
                        return false;
                    }
                }
                List list = (List) ix3.m23454p(obj, m21208j & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    tw3 m21211m = m21211m(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!m21211m.mo21229d(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (m21223y(obj, i16, i11, i12, i21) && !m21224z(obj, m21208j, m21211m(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        if (!this.f19012f) {
            return true;
        }
        this.f19020n.mo23023a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0080. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: e */
    public final void mo21230e(Object obj, kw3 kw3Var, gu3 gu3Var) {
        gu3Var.getClass();
        xw3 xw3Var = this.f19019m;
        hu3 hu3Var = this.f19020n;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = kw3Var.zzc();
                int m21203S = m21203S(zzc);
                if (m21203S < 0) {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i11 = this.f19016j; i11 < this.f19017k; i11++) {
                            obj2 = m21212n(obj, this.f19015i[i11], obj2, xw3Var);
                        }
                        if (obj2 != null) {
                            xw3Var.mo20342n(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object mo23025c = !this.f19012f ? null : hu3Var.mo23025c(gu3Var, this.f19011e, zzc);
                    if (mo23025c != null) {
                        hu3Var.mo23024b(obj);
                        obj2 = hu3Var.mo23026d(kw3Var, mo23025c, gu3Var, null, obj2, xw3Var);
                    } else {
                        xw3Var.mo20344q(kw3Var);
                        if (obj2 == null) {
                            obj2 = xw3Var.mo20331c(obj);
                        }
                        if (!xw3Var.m28056p(obj2, kw3Var)) {
                            for (int i12 = this.f19016j; i12 < this.f19017k; i12++) {
                                obj2 = m21212n(obj, this.f19015i[i12], obj2, xw3Var);
                            }
                            if (obj2 != null) {
                                xw3Var.mo20342n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int m21208j = m21208j(m21203S);
                    try {
                        switch (m21207i(m21208j)) {
                            case 0:
                                ix3.m23464z(obj, m21208j & 1048575, kw3Var.zza());
                                m21218t(obj, m21203S);
                                break;
                            case 1:
                                ix3.m23431A(obj, m21208j & 1048575, kw3Var.zzb());
                                m21218t(obj, m21203S);
                                break;
                            case 2:
                                ix3.m23433C(obj, m21208j & 1048575, kw3Var.zzl());
                                m21218t(obj, m21203S);
                                break;
                            case 3:
                                ix3.m23433C(obj, m21208j & 1048575, kw3Var.zzo());
                                m21218t(obj, m21203S);
                                break;
                            case 4:
                                ix3.m23432B(obj, m21208j & 1048575, kw3Var.zzg());
                                m21218t(obj, m21203S);
                                break;
                            case 5:
                                ix3.m23433C(obj, m21208j & 1048575, kw3Var.zzk());
                                m21218t(obj, m21203S);
                                break;
                            case 6:
                                ix3.m23432B(obj, m21208j & 1048575, kw3Var.zzf());
                                m21218t(obj, m21203S);
                                break;
                            case 7:
                                ix3.m23462x(obj, m21208j & 1048575, kw3Var.zzN());
                                m21218t(obj, m21203S);
                                break;
                            case 8:
                                m21217s(obj, m21208j, kw3Var);
                                m21218t(obj, m21203S);
                                break;
                            case 9:
                                if (m21222x(obj, m21203S)) {
                                    long j11 = m21208j & 1048575;
                                    ix3.m23434D(obj, j11, dv3.m21552g(ix3.m23454p(obj, j11), kw3Var.mo24066m(m21211m(m21203S), gu3Var)));
                                    break;
                                } else {
                                    ix3.m23434D(obj, m21208j & 1048575, kw3Var.mo24066m(m21211m(m21203S), gu3Var));
                                    m21218t(obj, m21203S);
                                    break;
                                }
                            case 10:
                                ix3.m23434D(obj, m21208j & 1048575, kw3Var.zzp());
                                m21218t(obj, m21203S);
                                break;
                            case 11:
                                ix3.m23432B(obj, m21208j & 1048575, kw3Var.zzj());
                                m21218t(obj, m21203S);
                                break;
                            case 12:
                                int zze = kw3Var.zze();
                                xu3 m21210l = m21210l(m21203S);
                                if (m21210l != null && !m21210l.mo20775a(zze)) {
                                    obj2 = vw3.m27399d(zzc, zze, obj2, xw3Var);
                                    break;
                                }
                                ix3.m23432B(obj, m21208j & 1048575, zze);
                                m21218t(obj, m21203S);
                                break;
                            case 13:
                                ix3.m23432B(obj, m21208j & 1048575, kw3Var.zzh());
                                m21218t(obj, m21203S);
                                break;
                            case 14:
                                ix3.m23433C(obj, m21208j & 1048575, kw3Var.zzm());
                                m21218t(obj, m21203S);
                                break;
                            case 15:
                                ix3.m23432B(obj, m21208j & 1048575, kw3Var.zzi());
                                m21218t(obj, m21203S);
                                break;
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                ix3.m23433C(obj, m21208j & 1048575, kw3Var.zzn());
                                m21218t(obj, m21203S);
                                break;
                            case 17:
                                if (m21222x(obj, m21203S)) {
                                    long j12 = m21208j & 1048575;
                                    ix3.m23434D(obj, j12, dv3.m21552g(ix3.m23454p(obj, j12), kw3Var.mo24068o(m21211m(m21203S), gu3Var)));
                                    break;
                                } else {
                                    ix3.m23434D(obj, m21208j & 1048575, kw3Var.mo24068o(m21211m(m21203S), gu3Var));
                                    m21218t(obj, m21203S);
                                    break;
                                }
                            case 18:
                                kw3Var.mo24057d(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 19:
                                kw3Var.mo24065l(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 20:
                                kw3Var.mo24056c(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 21:
                                kw3Var.mo24067n(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 22:
                                kw3Var.mo24059f(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 23:
                                kw3Var.mo24063j(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 24:
                                kw3Var.mo24062i(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 25:
                                kw3Var.mo24064k(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 26:
                                if (m21221w(m21208j)) {
                                    ((wt3) kw3Var).m27724u(this.f19018l.mo23760a(obj, m21208j & 1048575), true);
                                    break;
                                } else {
                                    ((wt3) kw3Var).m27724u(this.f19018l.mo23760a(obj, m21208j & 1048575), false);
                                    break;
                                }
                            case 27:
                                kw3Var.mo24073t(this.f19018l.mo23760a(obj, m21208j & 1048575), m21211m(m21203S), gu3Var);
                                break;
                            case 28:
                                kw3Var.mo24058e(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 29:
                                kw3Var.mo24072s(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                List mo23760a = this.f19018l.mo23760a(obj, m21208j & 1048575);
                                kw3Var.mo24055b(mo23760a);
                                obj2 = vw3.m27398c(zzc, mo23760a, m21210l(m21203S), obj2, xw3Var);
                                break;
                            case 31:
                                kw3Var.mo24061h(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                kw3Var.mo24060g(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 33:
                                kw3Var.mo24071r(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 34:
                                kw3Var.mo24070q(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 35:
                                kw3Var.mo24057d(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 36:
                                kw3Var.mo24065l(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 37:
                                kw3Var.mo24056c(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 38:
                                kw3Var.mo24067n(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 39:
                                kw3Var.mo24059f(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 40:
                                kw3Var.mo24063j(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                kw3Var.mo24062i(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 42:
                                kw3Var.mo24064k(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 43:
                                kw3Var.mo24072s(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                List mo23760a2 = this.f19018l.mo23760a(obj, m21208j & 1048575);
                                kw3Var.mo24055b(mo23760a2);
                                obj2 = vw3.m27398c(zzc, mo23760a2, m21210l(m21203S), obj2, xw3Var);
                                break;
                            case 45:
                                kw3Var.mo24061h(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 46:
                                kw3Var.mo24060g(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 47:
                                kw3Var.mo24071r(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 48:
                                kw3Var.mo24070q(this.f19018l.mo23760a(obj, m21208j & 1048575));
                                break;
                            case 49:
                                kw3Var.mo24069p(this.f19018l.mo23760a(obj, m21208j & 1048575), m21211m(m21203S), gu3Var);
                                break;
                            case 50:
                                Object m21213o = m21213o(m21203S);
                                long m21208j2 = m21208j(m21203S) & 1048575;
                                Object m23454p = ix3.m23454p(obj, m21208j2);
                                if (m23454p != null) {
                                    if (uv3.m27073b(m23454p)) {
                                        Object m26784b = tv3.m26781a().m26784b();
                                        uv3.m27074c(m26784b, m23454p);
                                        ix3.m23434D(obj, m21208j2, m26784b);
                                        m23454p = m26784b;
                                    }
                                } else {
                                    m23454p = tv3.m26781a().m26784b();
                                    ix3.m23434D(obj, m21208j2, m23454p);
                                }
                                AbstractC30228a.m149044a(m21213o);
                                throw null;
                                break;
                            case 51:
                                ix3.m23434D(obj, m21208j & 1048575, Double.valueOf(kw3Var.zza()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 52:
                                ix3.m23434D(obj, m21208j & 1048575, Float.valueOf(kw3Var.zzb()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 53:
                                ix3.m23434D(obj, m21208j & 1048575, Long.valueOf(kw3Var.zzl()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 54:
                                ix3.m23434D(obj, m21208j & 1048575, Long.valueOf(kw3Var.zzo()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 55:
                                ix3.m23434D(obj, m21208j & 1048575, Integer.valueOf(kw3Var.zzg()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 56:
                                ix3.m23434D(obj, m21208j & 1048575, Long.valueOf(kw3Var.zzk()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 57:
                                ix3.m23434D(obj, m21208j & 1048575, Integer.valueOf(kw3Var.zzf()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 58:
                                ix3.m23434D(obj, m21208j & 1048575, Boolean.valueOf(kw3Var.zzN()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 59:
                                m21217s(obj, m21208j, kw3Var);
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 60:
                                if (m21186A(obj, zzc, m21203S)) {
                                    long j13 = m21208j & 1048575;
                                    ix3.m23434D(obj, j13, dv3.m21552g(ix3.m23454p(obj, j13), kw3Var.mo24066m(m21211m(m21203S), gu3Var)));
                                } else {
                                    ix3.m23434D(obj, m21208j & 1048575, kw3Var.mo24066m(m21211m(m21203S), gu3Var));
                                    m21218t(obj, m21203S);
                                }
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 61:
                                ix3.m23434D(obj, m21208j & 1048575, kw3Var.zzp());
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 62:
                                ix3.m23434D(obj, m21208j & 1048575, Integer.valueOf(kw3Var.zzj()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 63:
                                int zze2 = kw3Var.zze();
                                xu3 m21210l2 = m21210l(m21203S);
                                if (m21210l2 != null && !m21210l2.mo20775a(zze2)) {
                                    obj2 = vw3.m27399d(zzc, zze2, obj2, xw3Var);
                                    break;
                                }
                                ix3.m23434D(obj, m21208j & 1048575, Integer.valueOf(zze2));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 64:
                                ix3.m23434D(obj, m21208j & 1048575, Integer.valueOf(kw3Var.zzh()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 65:
                                ix3.m23434D(obj, m21208j & 1048575, Long.valueOf(kw3Var.zzm()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                ix3.m23434D(obj, m21208j & 1048575, Integer.valueOf(kw3Var.zzi()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                ix3.m23434D(obj, m21208j & 1048575, Long.valueOf(kw3Var.zzn()));
                                m21219u(obj, zzc, m21203S);
                                break;
                            case 68:
                                ix3.m23434D(obj, m21208j & 1048575, kw3Var.mo24068o(m21211m(m21203S), gu3Var));
                                m21219u(obj, zzc, m21203S);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = xw3Var.mo20334f();
                                }
                                if (!xw3Var.m28056p(obj2, kw3Var)) {
                                    for (int i13 = this.f19016j; i13 < this.f19017k; i13++) {
                                        obj2 = m21212n(obj, this.f19015i[i13], obj2, xw3Var);
                                    }
                                    if (obj2 != null) {
                                        xw3Var.mo20342n(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzgrp unused) {
                        xw3Var.mo20344q(kw3Var);
                        if (obj2 == null) {
                            obj2 = xw3Var.mo20331c(obj);
                        }
                        if (!xw3Var.m28056p(obj2, kw3Var)) {
                            for (int i14 = this.f19016j; i14 < this.f19017k; i14++) {
                                obj2 = m21212n(obj, this.f19015i[i14], obj2, xw3Var);
                            }
                            if (obj2 != null) {
                                xw3Var.mo20342n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                for (int i15 = this.f19016j; i15 < this.f19017k; i15++) {
                    obj2 = m21212n(obj, this.f19015i[i15], obj2, xw3Var);
                }
                if (obj2 != null) {
                    xw3Var.mo20342n(obj, obj2);
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: f */
    public final void mo21231f(Object obj, cu3 cu3Var) {
        if (this.f19014h) {
            if (!this.f19012f) {
                int length = this.f19007a.length;
                for (int i11 = 0; i11 < length; i11 += 3) {
                    int m21208j = m21208j(i11);
                    int i12 = this.f19007a[i11];
                    switch (m21207i(m21208j)) {
                        case 0:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21093q(i12, ix3.m23448j(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21102z(i12, ix3.m23449k(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21071E(i12, ix3.m23452n(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21087j(i12, ix3.m23452n(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21069C(i12, ix3.m23450l(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21100x(i12, ix3.m23452n(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21098v(i12, ix3.m23450l(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21089m(i12, ix3.m23438H(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m21222x(obj, i11)) {
                                m21190E(i12, ix3.m23454p(obj, m21208j & 1048575), cu3Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21073G(i12, ix3.m23454p(obj, m21208j & 1048575), m21211m(i11));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21091o(i12, (mt3) ix3.m23454p(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21085h(i12, ix3.m23450l(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21096t(i12, ix3.m23450l(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21074H(i12, ix3.m23450l(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21076J(i12, ix3.m23452n(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21078a(i12, ix3.m23450l(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21080c(i12, ix3.m23452n(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m21222x(obj, i11)) {
                                cu3Var.m21068B(i12, ix3.m23454p(obj, m21208j & 1048575), m21211m(i11));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            vw3.m27407l(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 19:
                            vw3.m27411p(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 20:
                            vw3.m27414s(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 21:
                            vw3.m27369B(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 22:
                            vw3.m27413r(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 23:
                            vw3.m27410o(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 24:
                            vw3.m27409n(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 25:
                            vw3.m27405j(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 26:
                            vw3.m27420y(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var);
                            break;
                        case 27:
                            vw3.m27415t(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, m21211m(i11));
                            break;
                        case 28:
                            vw3.m27406k(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var);
                            break;
                        case 29:
                            vw3.m27421z(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            vw3.m27408m(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 31:
                            vw3.m27416u(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            vw3.m27417v(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 33:
                            vw3.m27418w(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 34:
                            vw3.m27419x(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, false);
                            break;
                        case 35:
                            vw3.m27407l(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 36:
                            vw3.m27411p(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 37:
                            vw3.m27414s(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 38:
                            vw3.m27369B(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 39:
                            vw3.m27413r(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 40:
                            vw3.m27410o(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            vw3.m27409n(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 42:
                            vw3.m27405j(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 43:
                            vw3.m27421z(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            vw3.m27408m(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 45:
                            vw3.m27416u(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 46:
                            vw3.m27417v(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 47:
                            vw3.m27418w(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 48:
                            vw3.m27419x(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, true);
                            break;
                        case 49:
                            vw3.m27412q(i12, (List) ix3.m23454p(obj, m21208j & 1048575), cu3Var, m21211m(i11));
                            break;
                        case 50:
                            m21189D(cu3Var, i12, ix3.m23454p(obj, m21208j & 1048575), i11);
                            break;
                        case 51:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21093q(i12, m21194J(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21102z(i12, m21195K(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21071E(i12, m21209k(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21087j(i12, m21209k(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21069C(i12, m21198N(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21100x(i12, m21209k(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21098v(i12, m21198N(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21089m(i12, m21187B(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m21186A(obj, i12, i11)) {
                                m21190E(i12, ix3.m23454p(obj, m21208j & 1048575), cu3Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21073G(i12, ix3.m23454p(obj, m21208j & 1048575), m21211m(i11));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21091o(i12, (mt3) ix3.m23454p(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21085h(i12, m21198N(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21096t(i12, m21198N(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21074H(i12, m21198N(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21076J(i12, m21209k(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21078a(i12, m21198N(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21080c(i12, m21209k(obj, m21208j & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m21186A(obj, i12, i11)) {
                                cu3Var.m21068B(i12, ix3.m23454p(obj, m21208j & 1048575), m21211m(i11));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                xw3 xw3Var = this.f19019m;
                xw3Var.mo20345r(xw3Var.mo20332d(obj), cu3Var);
                return;
            }
            this.f19020n.mo23023a(obj);
            throw null;
        }
        m21188C(obj, cu3Var);
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: g */
    public final void mo21232g(Object obj, byte[] bArr, int i11, int i12, ys3 ys3Var) {
        if (this.f19014h) {
            m21201Q(obj, bArr, i11, i12, ys3Var);
        } else {
            m21225F(obj, bArr, i11, i12, 0, ys3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.tw3
    public final int zza(Object obj) {
        if (this.f19014h) {
            return m21197M(obj);
        }
        return m21196L(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.tw3
    public final int zzb(Object obj) {
        int i11;
        int m21548c;
        int length = this.f19007a.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int m21208j = m21208j(i13);
            int i14 = this.f19007a[i13];
            long j11 = 1048575 & m21208j;
            int i15 = 37;
            switch (m21207i(m21208j)) {
                case 0:
                    i11 = i12 * 53;
                    m21548c = dv3.m21548c(Double.doubleToLongBits(ix3.m23448j(obj, j11)));
                    i12 = i11 + m21548c;
                    break;
                case 1:
                    i11 = i12 * 53;
                    m21548c = Float.floatToIntBits(ix3.m23449k(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 2:
                    i11 = i12 * 53;
                    m21548c = dv3.m21548c(ix3.m23452n(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 3:
                    i11 = i12 * 53;
                    m21548c = dv3.m21548c(ix3.m23452n(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 4:
                    i11 = i12 * 53;
                    m21548c = ix3.m23450l(obj, j11);
                    i12 = i11 + m21548c;
                    break;
                case 5:
                    i11 = i12 * 53;
                    m21548c = dv3.m21548c(ix3.m23452n(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 6:
                    i11 = i12 * 53;
                    m21548c = ix3.m23450l(obj, j11);
                    i12 = i11 + m21548c;
                    break;
                case 7:
                    i11 = i12 * 53;
                    m21548c = dv3.m21546a(ix3.m23438H(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 8:
                    i11 = i12 * 53;
                    m21548c = ((String) ix3.m23454p(obj, j11)).hashCode();
                    i12 = i11 + m21548c;
                    break;
                case 9:
                    Object m23454p = ix3.m23454p(obj, j11);
                    if (m23454p != null) {
                        i15 = m23454p.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    m21548c = ix3.m23454p(obj, j11).hashCode();
                    i12 = i11 + m21548c;
                    break;
                case 11:
                    i11 = i12 * 53;
                    m21548c = ix3.m23450l(obj, j11);
                    i12 = i11 + m21548c;
                    break;
                case 12:
                    i11 = i12 * 53;
                    m21548c = ix3.m23450l(obj, j11);
                    i12 = i11 + m21548c;
                    break;
                case 13:
                    i11 = i12 * 53;
                    m21548c = ix3.m23450l(obj, j11);
                    i12 = i11 + m21548c;
                    break;
                case 14:
                    i11 = i12 * 53;
                    m21548c = dv3.m21548c(ix3.m23452n(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 15:
                    i11 = i12 * 53;
                    m21548c = ix3.m23450l(obj, j11);
                    i12 = i11 + m21548c;
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    i11 = i12 * 53;
                    m21548c = dv3.m21548c(ix3.m23452n(obj, j11));
                    i12 = i11 + m21548c;
                    break;
                case 17:
                    Object m23454p2 = ix3.m23454p(obj, j11);
                    if (m23454p2 != null) {
                        i15 = m23454p2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                case 31:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                case 42:
                case 43:
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    m21548c = ix3.m23454p(obj, j11).hashCode();
                    i12 = i11 + m21548c;
                    break;
                case 50:
                    i11 = i12 * 53;
                    m21548c = ix3.m23454p(obj, j11).hashCode();
                    i12 = i11 + m21548c;
                    break;
                case 51:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21548c(Double.doubleToLongBits(m21194J(obj, j11)));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = Float.floatToIntBits(m21195K(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21548c(m21209k(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21548c(m21209k(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = m21198N(obj, j11);
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21548c(m21209k(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = m21198N(obj, j11);
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21546a(m21187B(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = ((String) ix3.m23454p(obj, j11)).hashCode();
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = ix3.m23454p(obj, j11).hashCode();
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = ix3.m23454p(obj, j11).hashCode();
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = m21198N(obj, j11);
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = m21198N(obj, j11);
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = m21198N(obj, j11);
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21548c(m21209k(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = m21198N(obj, j11);
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = dv3.m21548c(m21209k(obj, j11));
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m21186A(obj, i14, i13)) {
                        i11 = i12 * 53;
                        m21548c = ix3.m23454p(obj, j11).hashCode();
                        i12 = i11 + m21548c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.f19019m.mo20332d(obj).hashCode();
        if (!this.f19012f) {
            return hashCode;
        }
        this.f19020n.mo23023a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    public final Object zze() {
        return ((tu3) this.f19011e).mo20044D(4, null, null);
    }
}
