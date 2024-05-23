package com.google.protobuf;

import com.adtima.Adtima;
import com.google.protobuf.AbstractC6810i1;
import com.google.protobuf.InterfaceC6813j1;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p664y.AbstractC30228a;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.l0 */
/* loaded from: classes3.dex */
public final class C6817l0 implements InterfaceC6839w0 {

    /* renamed from: r */
    private static final int[] f37358r = new int[0];

    /* renamed from: s */
    private static final Unsafe f37359s = AbstractC6804g1.m34841D();

    /* renamed from: a */
    private final int[] f37360a;

    /* renamed from: b */
    private final Object[] f37361b;

    /* renamed from: c */
    private final int f37362c;

    /* renamed from: d */
    private final int f37363d;

    /* renamed from: e */
    private final InterfaceC6809i0 f37364e;

    /* renamed from: f */
    private final boolean f37365f;

    /* renamed from: g */
    private final boolean f37366g;

    /* renamed from: h */
    private final boolean f37367h;

    /* renamed from: i */
    private final boolean f37368i;

    /* renamed from: j */
    private final int[] f37369j;

    /* renamed from: k */
    private final int f37370k;

    /* renamed from: l */
    private final int f37371l;

    /* renamed from: m */
    private final InterfaceC6821n0 f37372m;

    /* renamed from: n */
    private final AbstractC6842y f37373n;

    /* renamed from: o */
    private final AbstractC6792c1 f37374o;

    /* renamed from: p */
    private final AbstractC6814k f37375p;

    /* renamed from: q */
    private final InterfaceC6794d0 f37376q;

    private C6817l0(int[] iArr, Object[] objArr, int i11, int i12, InterfaceC6809i0 interfaceC6809i0, boolean z11, boolean z12, int[] iArr2, int i13, int i14, InterfaceC6821n0 interfaceC6821n0, AbstractC6842y abstractC6842y, AbstractC6792c1 abstractC6792c1, AbstractC6814k abstractC6814k, InterfaceC6794d0 interfaceC6794d0) {
        boolean z13;
        this.f37360a = iArr;
        this.f37361b = objArr;
        this.f37362c = i11;
        this.f37363d = i12;
        this.f37366g = interfaceC6809i0 instanceof AbstractC6826q;
        this.f37367h = z11;
        if (abstractC6814k != null && abstractC6814k.mo34991d(interfaceC6809i0)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f37365f = z13;
        this.f37368i = z12;
        this.f37369j = iArr2;
        this.f37370k = i13;
        this.f37371l = i14;
        this.f37372m = interfaceC6821n0;
        this.f37373n = abstractC6842y;
        this.f37374o = abstractC6792c1;
        this.f37375p = abstractC6814k;
        this.f37364e = interfaceC6809i0;
        this.f37376q = interfaceC6794d0;
    }

    /* renamed from: A */
    private static List m34999A(Object obj, long j11) {
        return (List) AbstractC6804g1.m34840C(obj, j11);
    }

    /* renamed from: B */
    private static long m35000B(Object obj, long j11) {
        return AbstractC6804g1.m34838A(obj, j11);
    }

    /* renamed from: C */
    private void m35001C(Object obj, Object obj2, int i11) {
        long m35008J = m35008J(m35019U(i11));
        if (!m35037s(obj2, i11)) {
            return;
        }
        Object m34840C = AbstractC6804g1.m34840C(obj, m35008J);
        Object m34840C2 = AbstractC6804g1.m34840C(obj2, m35008J);
        if (m34840C != null && m34840C2 != null) {
            AbstractC6804g1.m34855R(obj, m35008J, AbstractC6830s.m35136h(m34840C, m34840C2));
            m35016R(obj, i11);
        } else if (m34840C2 != null) {
            AbstractC6804g1.m34855R(obj, m35008J, m34840C2);
            m35016R(obj, i11);
        }
    }

    /* renamed from: D */
    private void m35002D(Object obj, Object obj2, int i11) {
        Object obj3;
        int m35019U = m35019U(i11);
        int m35007I = m35007I(i11);
        long m35008J = m35008J(m35019U);
        if (!m35043y(obj2, m35007I, i11)) {
            return;
        }
        if (m35043y(obj, m35007I, i11)) {
            obj3 = AbstractC6804g1.m34840C(obj, m35008J);
        } else {
            obj3 = null;
        }
        Object m34840C = AbstractC6804g1.m34840C(obj2, m35008J);
        if (obj3 != null && m34840C != null) {
            AbstractC6804g1.m34855R(obj, m35008J, AbstractC6830s.m35136h(obj3, m34840C));
            m35017S(obj, m35007I, i11);
        } else if (m34840C != null) {
            AbstractC6804g1.m34855R(obj, m35008J, m34840C);
            m35017S(obj, m35007I, i11);
        }
    }

    /* renamed from: E */
    private void m35003E(Object obj, Object obj2, int i11) {
        int m35019U = m35019U(i11);
        long m35008J = m35008J(m35019U);
        int m35007I = m35007I(i11);
        switch (m35018T(m35019U)) {
            case 0:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34851N(obj, m35008J, AbstractC6804g1.m34881x(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 1:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34852O(obj, m35008J, AbstractC6804g1.m34882y(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 2:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34854Q(obj, m35008J, AbstractC6804g1.m34838A(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 3:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34854Q(obj, m35008J, AbstractC6804g1.m34838A(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 4:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34853P(obj, m35008J, AbstractC6804g1.m34883z(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 5:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34854Q(obj, m35008J, AbstractC6804g1.m34838A(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 6:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34853P(obj, m35008J, AbstractC6804g1.m34883z(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 7:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34845H(obj, m35008J, AbstractC6804g1.m34875r(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 8:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34855R(obj, m35008J, AbstractC6804g1.m34840C(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 9:
                m35001C(obj, obj2, i11);
                return;
            case 10:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34855R(obj, m35008J, AbstractC6804g1.m34840C(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 11:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34853P(obj, m35008J, AbstractC6804g1.m34883z(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 12:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34853P(obj, m35008J, AbstractC6804g1.m34883z(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 13:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34853P(obj, m35008J, AbstractC6804g1.m34883z(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 14:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34854Q(obj, m35008J, AbstractC6804g1.m34838A(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 15:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34853P(obj, m35008J, AbstractC6804g1.m34883z(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                if (m35037s(obj2, i11)) {
                    AbstractC6804g1.m34854Q(obj, m35008J, AbstractC6804g1.m34838A(obj2, m35008J));
                    m35016R(obj, i11);
                    return;
                }
                return;
            case 17:
                m35001C(obj, obj2, i11);
                return;
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
                this.f37373n.mo35163d(obj, obj2, m35008J);
                return;
            case 50:
                AbstractC6843y0.m35170D(this.f37376q, obj, obj2, m35008J);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m35043y(obj2, m35007I, i11)) {
                    AbstractC6804g1.m34855R(obj, m35008J, AbstractC6804g1.m34840C(obj2, m35008J));
                    m35017S(obj, m35007I, i11);
                    return;
                }
                return;
            case 60:
                m35002D(obj, obj2, i11);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                if (m35043y(obj2, m35007I, i11)) {
                    AbstractC6804g1.m34855R(obj, m35008J, AbstractC6804g1.m34840C(obj2, m35008J));
                    m35017S(obj, m35007I, i11);
                    return;
                }
                return;
            case 68:
                m35002D(obj, obj2, i11);
                return;
            default:
                return;
        }
    }

    /* renamed from: F */
    public static C6817l0 m35004F(Class cls, InterfaceC6803g0 interfaceC6803g0, InterfaceC6821n0 interfaceC6821n0, AbstractC6842y abstractC6842y, AbstractC6792c1 abstractC6792c1, AbstractC6814k abstractC6814k, InterfaceC6794d0 interfaceC6794d0) {
        if (interfaceC6803g0 instanceof C6837v0) {
            return m35006H((C6837v0) interfaceC6803g0, interfaceC6821n0, abstractC6842y, abstractC6792c1, abstractC6814k, interfaceC6794d0);
        }
        AbstractC30228a.m149044a(interfaceC6803g0);
        return m35005G(null, interfaceC6821n0, abstractC6842y, abstractC6792c1, abstractC6814k, interfaceC6794d0);
    }

    /* renamed from: G */
    static C6817l0 m35005G(AbstractC6786a1 abstractC6786a1, InterfaceC6821n0 interfaceC6821n0, AbstractC6842y abstractC6842y, AbstractC6792c1 abstractC6792c1, AbstractC6814k abstractC6814k, InterfaceC6794d0 interfaceC6794d0) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0254  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C6817l0 m35006H(C6837v0 c6837v0, InterfaceC6821n0 interfaceC6821n0, AbstractC6842y abstractC6842y, AbstractC6792c1 abstractC6792c1, AbstractC6814k abstractC6814k, InterfaceC6794d0 interfaceC6794d0) {
        int i11;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        char charAt8;
        int i17;
        char charAt9;
        int i18;
        char charAt10;
        int i19;
        char charAt11;
        int i21;
        char charAt12;
        int i22;
        char charAt13;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int objectFieldOffset;
        String str;
        boolean z11;
        Object[] objArr;
        int i29;
        int i31;
        int i32;
        Field m35015Q;
        char charAt14;
        int i33;
        int i34;
        Object obj;
        Field m35015Q2;
        Object obj2;
        Field m35015Q3;
        int i35;
        char charAt15;
        int i36;
        char charAt16;
        int i37;
        char charAt17;
        int i38;
        char charAt18;
        boolean z12 = c6837v0.mo34837c() == EnumC6831s0.PROTO3;
        String m35153e = c6837v0.m35153e();
        int length = m35153e.length();
        char c11 = 55296;
        if (m35153e.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i11 = i39 + 1;
                if (m35153e.charAt(i39) < 55296) {
                    break;
                }
                i39 = i11;
            }
        } else {
            i11 = 1;
        }
        int i41 = i11 + 1;
        int charAt19 = m35153e.charAt(i11);
        if (charAt19 >= 55296) {
            int i42 = charAt19 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt18 = m35153e.charAt(i41);
                if (charAt18 < 55296) {
                    break;
                }
                i42 |= (charAt18 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            charAt19 = i42 | (charAt18 << i43);
            i41 = i38;
        }
        if (charAt19 == 0) {
            iArr = f37358r;
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            charAt4 = 0;
            charAt5 = 0;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt20 = m35153e.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    charAt13 = m35153e.charAt(i44);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i45 |= (charAt13 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                charAt20 = i45 | (charAt13 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int charAt21 = m35153e.charAt(i44);
            if (charAt21 >= 55296) {
                int i48 = charAt21 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    charAt12 = m35153e.charAt(i47);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i48 |= (charAt12 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                charAt21 = i48 | (charAt12 << i49);
                i47 = i21;
            }
            int i51 = i47 + 1;
            charAt = m35153e.charAt(i47);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i19 = i51 + 1;
                    charAt11 = m35153e.charAt(i51);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i52 |= (charAt11 & 8191) << i53;
                    i53 += 13;
                    i51 = i19;
                }
                charAt = i52 | (charAt11 << i53);
                i51 = i19;
            }
            int i54 = i51 + 1;
            charAt2 = m35153e.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i18 = i54 + 1;
                    charAt10 = m35153e.charAt(i54);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i55 |= (charAt10 & 8191) << i56;
                    i56 += 13;
                    i54 = i18;
                }
                charAt2 = i55 | (charAt10 << i56);
                i54 = i18;
            }
            int i57 = i54 + 1;
            charAt3 = m35153e.charAt(i54);
            if (charAt3 >= 55296) {
                int i58 = charAt3 & 8191;
                int i59 = 13;
                while (true) {
                    i17 = i57 + 1;
                    charAt9 = m35153e.charAt(i57);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i58 |= (charAt9 & 8191) << i59;
                    i59 += 13;
                    i57 = i17;
                }
                charAt3 = i58 | (charAt9 << i59);
                i57 = i17;
            }
            int i61 = i57 + 1;
            charAt4 = m35153e.charAt(i57);
            if (charAt4 >= 55296) {
                int i62 = charAt4 & 8191;
                int i63 = 13;
                while (true) {
                    i16 = i61 + 1;
                    charAt8 = m35153e.charAt(i61);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i62 |= (charAt8 & 8191) << i63;
                    i63 += 13;
                    i61 = i16;
                }
                charAt4 = i62 | (charAt8 << i63);
                i61 = i16;
            }
            int i64 = i61 + 1;
            int charAt22 = m35153e.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i15 = i64 + 1;
                    charAt7 = m35153e.charAt(i64);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i65 |= (charAt7 & 8191) << i66;
                    i66 += 13;
                    i64 = i15;
                }
                charAt22 = i65 | (charAt7 << i66);
                i64 = i15;
            }
            int i67 = i64 + 1;
            charAt5 = m35153e.charAt(i64);
            if (charAt5 >= 55296) {
                int i68 = charAt5 & 8191;
                int i69 = 13;
                while (true) {
                    i14 = i67 + 1;
                    charAt6 = m35153e.charAt(i67);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i68 |= (charAt6 & 8191) << i69;
                    i69 += 13;
                    i67 = i14;
                }
                charAt5 = i68 | (charAt6 << i69);
                i67 = i14;
            }
            iArr = new int[charAt5 + charAt4 + charAt22];
            i12 = (charAt20 * 2) + charAt21;
            i13 = charAt20;
            i41 = i67;
        }
        Unsafe unsafe = f37359s;
        Object[] m35152d = c6837v0.m35152d();
        Class<?> cls = c6837v0.mo34836b().getClass();
        int[] iArr2 = new int[charAt3 * 3];
        Object[] objArr2 = new Object[charAt3 * 2];
        int i71 = charAt5 + charAt4;
        int i72 = charAt5;
        int i73 = i71;
        int i74 = 0;
        int i75 = 0;
        while (i41 < length) {
            int i76 = i41 + 1;
            int charAt23 = m35153e.charAt(i41);
            if (charAt23 >= c11) {
                int i77 = charAt23 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i37 = i78 + 1;
                    charAt17 = m35153e.charAt(i78);
                    if (charAt17 < c11) {
                        break;
                    }
                    i77 |= (charAt17 & 8191) << i79;
                    i79 += 13;
                    i78 = i37;
                }
                charAt23 = i77 | (charAt17 << i79);
                i23 = i37;
            } else {
                i23 = i76;
            }
            int i81 = i23 + 1;
            int charAt24 = m35153e.charAt(i23);
            if (charAt24 >= c11) {
                int i82 = charAt24 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i36 = i83 + 1;
                    charAt16 = m35153e.charAt(i83);
                    i24 = length;
                    if (charAt16 < 55296) {
                        break;
                    }
                    i82 |= (charAt16 & 8191) << i84;
                    i84 += 13;
                    i83 = i36;
                    length = i24;
                }
                charAt24 = i82 | (charAt16 << i84);
                i25 = i36;
            } else {
                i24 = length;
                i25 = i81;
            }
            int i85 = charAt24 & 255;
            int i86 = charAt5;
            if ((charAt24 & 1024) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int i87 = i74;
            if (i85 >= 51) {
                int i88 = i25 + 1;
                int charAt25 = m35153e.charAt(i25);
                char c12 = 55296;
                if (charAt25 >= 55296) {
                    int i89 = charAt25 & 8191;
                    int i91 = 13;
                    while (true) {
                        i35 = i88 + 1;
                        charAt15 = m35153e.charAt(i88);
                        if (charAt15 < c12) {
                            break;
                        }
                        i89 |= (charAt15 & 8191) << i91;
                        i91 += 13;
                        i88 = i35;
                        c12 = 55296;
                    }
                    charAt25 = i89 | (charAt15 << i91);
                    i88 = i35;
                }
                int i92 = i85 - 51;
                int i93 = i88;
                if (i92 == 9 || i92 == 17) {
                    i34 = i12 + 1;
                    objArr2[((i75 / 3) * 2) + 1] = m35152d[i12];
                } else {
                    if (i92 == 12 && !z12) {
                        i34 = i12 + 1;
                        objArr2[((i75 / 3) * 2) + 1] = m35152d[i12];
                    }
                    int i94 = charAt25 * 2;
                    obj = m35152d[i94];
                    if (!(obj instanceof Field)) {
                        m35015Q2 = (Field) obj;
                    } else {
                        m35015Q2 = m35015Q(cls, (String) obj);
                        m35152d[i94] = m35015Q2;
                    }
                    i26 = charAt;
                    i27 = charAt2;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m35015Q2);
                    int i95 = i94 + 1;
                    obj2 = m35152d[i95];
                    if (!(obj2 instanceof Field)) {
                        m35015Q3 = (Field) obj2;
                    } else {
                        m35015Q3 = m35015Q(cls, (String) obj2);
                        m35152d[i95] = m35015Q3;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(m35015Q3);
                    str = m35153e;
                    z11 = z12;
                    objArr = objArr2;
                    i31 = i93;
                    i29 = objectFieldOffset3;
                    objectFieldOffset = objectFieldOffset2;
                    i32 = 0;
                }
                i12 = i34;
                int i942 = charAt25 * 2;
                obj = m35152d[i942];
                if (!(obj instanceof Field)) {
                }
                i26 = charAt;
                i27 = charAt2;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m35015Q2);
                int i952 = i942 + 1;
                obj2 = m35152d[i952];
                if (!(obj2 instanceof Field)) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(m35015Q3);
                str = m35153e;
                z11 = z12;
                objArr = objArr2;
                i31 = i93;
                i29 = objectFieldOffset32;
                objectFieldOffset = objectFieldOffset22;
                i32 = 0;
            } else {
                i26 = charAt;
                i27 = charAt2;
                int i96 = i12 + 1;
                Field m35015Q4 = m35015Q(cls, (String) m35152d[i12]);
                if (i85 == 9 || i85 == 17) {
                    objArr2[((i75 / 3) * 2) + 1] = m35015Q4.getType();
                } else {
                    if (i85 == 27 || i85 == 49) {
                        i33 = i12 + 2;
                        objArr2[((i75 / 3) * 2) + 1] = m35152d[i96];
                    } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                        if (!z12) {
                            i33 = i12 + 2;
                            objArr2[((i75 / 3) * 2) + 1] = m35152d[i96];
                        }
                    } else if (i85 == 50) {
                        int i97 = i72 + 1;
                        iArr[i72] = i75;
                        int i98 = (i75 / 3) * 2;
                        int i99 = i12 + 2;
                        objArr2[i98] = m35152d[i96];
                        if ((charAt24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0) {
                            i96 = i12 + 3;
                            objArr2[i98 + 1] = m35152d[i99];
                            i72 = i97;
                        } else {
                            i72 = i97;
                            i28 = i99;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m35015Q4);
                            i12 = i28;
                            if ((charAt24 & 4096) == 4096 || i85 > 17) {
                                str = m35153e;
                                z11 = z12;
                                objArr = objArr2;
                                i29 = 1048575;
                                i31 = i25;
                                i32 = 0;
                            } else {
                                int i100 = i25 + 1;
                                int charAt26 = m35153e.charAt(i25);
                                if (charAt26 >= 55296) {
                                    int i101 = charAt26 & 8191;
                                    int i102 = 13;
                                    while (true) {
                                        i31 = i100 + 1;
                                        charAt14 = m35153e.charAt(i100);
                                        if (charAt14 < 55296) {
                                            break;
                                        }
                                        i101 |= (charAt14 & 8191) << i102;
                                        i102 += 13;
                                        i100 = i31;
                                    }
                                    charAt26 = i101 | (charAt14 << i102);
                                } else {
                                    i31 = i100;
                                }
                                int i103 = (i13 * 2) + (charAt26 / 32);
                                Object obj3 = m35152d[i103];
                                str = m35153e;
                                if (obj3 instanceof Field) {
                                    m35015Q = (Field) obj3;
                                } else {
                                    m35015Q = m35015Q(cls, (String) obj3);
                                    m35152d[i103] = m35015Q;
                                }
                                z11 = z12;
                                objArr = objArr2;
                                i32 = charAt26 % 32;
                                i29 = (int) unsafe.objectFieldOffset(m35015Q);
                            }
                            if (i85 >= 18 && i85 <= 49) {
                                iArr[i73] = objectFieldOffset;
                                i73++;
                            }
                        }
                    }
                    i28 = i33;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m35015Q4);
                    i12 = i28;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = m35153e;
                    z11 = z12;
                    objArr = objArr2;
                    i29 = 1048575;
                    i31 = i25;
                    i32 = 0;
                    if (i85 >= 18) {
                        iArr[i73] = objectFieldOffset;
                        i73++;
                    }
                }
                i28 = i96;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m35015Q4);
                i12 = i28;
                if ((charAt24 & 4096) == 4096) {
                }
                str = m35153e;
                z11 = z12;
                objArr = objArr2;
                i29 = 1048575;
                i31 = i25;
                i32 = 0;
                if (i85 >= 18) {
                }
            }
            int i104 = i75 + 1;
            iArr2[i75] = charAt23;
            int i105 = i75 + 2;
            iArr2[i104] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i85 << 20) | objectFieldOffset;
            i75 += 3;
            iArr2[i105] = (i32 << 20) | i29;
            z12 = z11;
            objArr2 = objArr;
            charAt = i26;
            charAt5 = i86;
            i41 = i31;
            length = i24;
            m35153e = str;
            i74 = i87;
            charAt2 = i27;
            c11 = 55296;
        }
        return new C6817l0(iArr2, objArr2, charAt, charAt2, c6837v0.mo34836b(), z12, false, iArr, charAt5, i71, interfaceC6821n0, abstractC6842y, abstractC6792c1, abstractC6814k, interfaceC6794d0);
    }

    /* renamed from: I */
    private int m35007I(int i11) {
        return this.f37360a[i11];
    }

    /* renamed from: J */
    private static long m35008J(int i11) {
        return i11 & 1048575;
    }

    /* renamed from: K */
    private static boolean m35009K(Object obj, long j11) {
        return ((Boolean) AbstractC6804g1.m34840C(obj, j11)).booleanValue();
    }

    /* renamed from: L */
    private static double m35010L(Object obj, long j11) {
        return ((Double) AbstractC6804g1.m34840C(obj, j11)).doubleValue();
    }

    /* renamed from: M */
    private static float m35011M(Object obj, long j11) {
        return ((Float) AbstractC6804g1.m34840C(obj, j11)).floatValue();
    }

    /* renamed from: N */
    private static int m35012N(Object obj, long j11) {
        return ((Integer) AbstractC6804g1.m34840C(obj, j11)).intValue();
    }

    /* renamed from: O */
    private static long m35013O(Object obj, long j11) {
        return ((Long) AbstractC6804g1.m34840C(obj, j11)).longValue();
    }

    /* renamed from: P */
    private int m35014P(int i11) {
        return this.f37360a[i11 + 2];
    }

    /* renamed from: Q */
    private static Field m35015Q(Class cls, String str) {
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

    /* renamed from: R */
    private void m35016R(Object obj, int i11) {
        int m35014P = m35014P(i11);
        long j11 = 1048575 & m35014P;
        if (j11 == 1048575) {
            return;
        }
        AbstractC6804g1.m34853P(obj, j11, (1 << (m35014P >>> 20)) | AbstractC6804g1.m34883z(obj, j11));
    }

    /* renamed from: S */
    private void m35017S(Object obj, int i11, int i12) {
        AbstractC6804g1.m34853P(obj, m35014P(i12) & 1048575, i11);
    }

    /* renamed from: T */
    private static int m35018T(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    /* renamed from: U */
    private int m35019U(int i11) {
        return this.f37360a[i11 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m35020V(Object obj, InterfaceC6813j1 interfaceC6813j1) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i11;
        int i12;
        if (this.f37365f) {
            C6820n mo34989b = this.f37375p.mo34989b(obj);
            if (!mo34989b.m35074j()) {
                it = mo34989b.m35076n();
                entry = (Map.Entry) it.next();
                length = this.f37360a.length;
                Unsafe unsafe = f37359s;
                int i13 = 1048575;
                i11 = 0;
                int i14 = 1048575;
                int i15 = 0;
                while (i11 < length) {
                    int m35019U = m35019U(i11);
                    int m35007I = m35007I(i11);
                    int m35018T = m35018T(m35019U);
                    if (m35018T <= 17) {
                        int i16 = this.f37360a[i11 + 2];
                        int i17 = i16 & i13;
                        if (i17 != i14) {
                            i15 = unsafe.getInt(obj, i17);
                            i14 = i17;
                        }
                        i12 = 1 << (i16 >>> 20);
                    } else {
                        i12 = 0;
                    }
                    while (entry != null && this.f37375p.mo34988a(entry) <= m35007I) {
                        this.f37375p.mo34993f(interfaceC6813j1, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    long m35008J = m35008J(m35019U);
                    switch (m35018T) {
                        case 0:
                            if ((i12 & i15) == 0) {
                                break;
                            } else {
                                interfaceC6813j1.mo34945t(m35007I, m35028j(obj, m35008J));
                                continue;
                            }
                        case 1:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34918H(m35007I, m35030l(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34951z(m35007I, unsafe.getLong(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34932g(m35007I, unsafe.getLong(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34936k(m35007I, unsafe.getInt(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34949x(m35007I, unsafe.getLong(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34929d(m35007I, unsafe.getInt(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34911A(m35007I, m35027i(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i12 & i15) != 0) {
                                m35024Z(m35007I, unsafe.getObject(obj, m35008J), interfaceC6813j1);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34948w(m35007I, unsafe.getObject(obj, m35008J), m35032n(i11));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34935j(m35007I, (AbstractC6799f) unsafe.getObject(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34944s(m35007I, unsafe.getInt(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34921K(m35007I, unsafe.getInt(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34912B(m35007I, unsafe.getInt(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34937l(m35007I, unsafe.getLong(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34924N(m35007I, unsafe.getInt(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34941p(m35007I, unsafe.getLong(obj, m35008J));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i12 & i15) != 0) {
                                interfaceC6813j1.mo34934i(m35007I, unsafe.getObject(obj, m35008J), m35032n(i11));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            AbstractC6843y0.m35179M(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 19:
                            AbstractC6843y0.m35183Q(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 20:
                            AbstractC6843y0.m35186T(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 21:
                            AbstractC6843y0.m35196b0(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 22:
                            AbstractC6843y0.m35185S(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 23:
                            AbstractC6843y0.m35182P(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 24:
                            AbstractC6843y0.m35181O(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 25:
                            AbstractC6843y0.m35177K(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 26:
                            AbstractC6843y0.m35192Z(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1);
                            break;
                        case 27:
                            AbstractC6843y0.m35187U(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, m35032n(i11));
                            break;
                        case 28:
                            AbstractC6843y0.m35178L(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1);
                            break;
                        case 29:
                            AbstractC6843y0.m35194a0(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            AbstractC6843y0.m35180N(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 31:
                            AbstractC6843y0.m35188V(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            AbstractC6843y0.m35189W(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 33:
                            AbstractC6843y0.m35190X(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 34:
                            AbstractC6843y0.m35191Y(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, false);
                            continue;
                        case 35:
                            AbstractC6843y0.m35179M(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 36:
                            AbstractC6843y0.m35183Q(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 37:
                            AbstractC6843y0.m35186T(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 38:
                            AbstractC6843y0.m35196b0(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 39:
                            AbstractC6843y0.m35185S(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 40:
                            AbstractC6843y0.m35182P(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            AbstractC6843y0.m35181O(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 42:
                            AbstractC6843y0.m35177K(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 43:
                            AbstractC6843y0.m35194a0(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            AbstractC6843y0.m35180N(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 45:
                            AbstractC6843y0.m35188V(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 46:
                            AbstractC6843y0.m35189W(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 47:
                            AbstractC6843y0.m35190X(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 48:
                            AbstractC6843y0.m35191Y(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, true);
                            break;
                        case 49:
                            AbstractC6843y0.m35184R(m35007I(i11), (List) unsafe.getObject(obj, m35008J), interfaceC6813j1, m35032n(i11));
                            break;
                        case 50:
                            m35023Y(interfaceC6813j1, m35007I, unsafe.getObject(obj, m35008J), i11);
                            break;
                        case 51:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34945t(m35007I, m35010L(obj, m35008J));
                                break;
                            }
                            break;
                        case 52:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34918H(m35007I, m35011M(obj, m35008J));
                                break;
                            }
                            break;
                        case 53:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34951z(m35007I, m35013O(obj, m35008J));
                                break;
                            }
                            break;
                        case 54:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34932g(m35007I, m35013O(obj, m35008J));
                                break;
                            }
                            break;
                        case 55:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34936k(m35007I, m35012N(obj, m35008J));
                                break;
                            }
                            break;
                        case 56:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34949x(m35007I, m35013O(obj, m35008J));
                                break;
                            }
                            break;
                        case 57:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34929d(m35007I, m35012N(obj, m35008J));
                                break;
                            }
                            break;
                        case 58:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34911A(m35007I, m35009K(obj, m35008J));
                                break;
                            }
                            break;
                        case 59:
                            if (m35043y(obj, m35007I, i11)) {
                                m35024Z(m35007I, unsafe.getObject(obj, m35008J), interfaceC6813j1);
                                break;
                            }
                            break;
                        case 60:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34948w(m35007I, unsafe.getObject(obj, m35008J), m35032n(i11));
                                break;
                            }
                            break;
                        case 61:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34935j(m35007I, (AbstractC6799f) unsafe.getObject(obj, m35008J));
                                break;
                            }
                            break;
                        case 62:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34944s(m35007I, m35012N(obj, m35008J));
                                break;
                            }
                            break;
                        case 63:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34921K(m35007I, m35012N(obj, m35008J));
                                break;
                            }
                            break;
                        case 64:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34912B(m35007I, m35012N(obj, m35008J));
                                break;
                            }
                            break;
                        case 65:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34937l(m35007I, m35013O(obj, m35008J));
                                break;
                            }
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34924N(m35007I, m35012N(obj, m35008J));
                                break;
                            }
                            break;
                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34941p(m35007I, m35013O(obj, m35008J));
                                break;
                            }
                            break;
                        case 68:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34934i(m35007I, unsafe.getObject(obj, m35008J), m35032n(i11));
                                break;
                            }
                            break;
                    }
                    i11 += 3;
                    i13 = 1048575;
                }
                while (entry != null) {
                    this.f37375p.mo34993f(interfaceC6813j1, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
                m35025a0(this.f37374o, obj, interfaceC6813j1);
            }
        }
        it = null;
        entry = null;
        length = this.f37360a.length;
        Unsafe unsafe2 = f37359s;
        int i132 = 1048575;
        i11 = 0;
        int i142 = 1048575;
        int i152 = 0;
        while (i11 < length) {
        }
        while (entry != null) {
        }
        m35025a0(this.f37374o, obj, interfaceC6813j1);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m35021W(Object obj, InterfaceC6813j1 interfaceC6813j1) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i11;
        if (this.f37365f) {
            C6820n mo34989b = this.f37375p.mo34989b(obj);
            if (!mo34989b.m35074j()) {
                it = mo34989b.m35076n();
                entry = (Map.Entry) it.next();
                length = this.f37360a.length;
                for (i11 = 0; i11 < length; i11 += 3) {
                    int m35019U = m35019U(i11);
                    int m35007I = m35007I(i11);
                    while (entry != null && this.f37375p.mo34988a(entry) <= m35007I) {
                        this.f37375p.mo34993f(interfaceC6813j1, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (m35018T(m35019U)) {
                        case 0:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34945t(m35007I, m35028j(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34918H(m35007I, m35030l(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34951z(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34932g(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34936k(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34949x(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34929d(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34911A(m35007I, m35027i(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m35037s(obj, i11)) {
                                m35024Z(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34948w(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(i11));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34935j(m35007I, (AbstractC6799f) AbstractC6804g1.m34840C(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34944s(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34921K(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34912B(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34937l(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34924N(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34941p(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m35037s(obj, i11)) {
                                interfaceC6813j1.mo34934i(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(i11));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            AbstractC6843y0.m35179M(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 19:
                            AbstractC6843y0.m35183Q(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 20:
                            AbstractC6843y0.m35186T(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 21:
                            AbstractC6843y0.m35196b0(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 22:
                            AbstractC6843y0.m35185S(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 23:
                            AbstractC6843y0.m35182P(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 24:
                            AbstractC6843y0.m35181O(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 25:
                            AbstractC6843y0.m35177K(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 26:
                            AbstractC6843y0.m35192Z(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                            break;
                        case 27:
                            AbstractC6843y0.m35187U(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, m35032n(i11));
                            break;
                        case 28:
                            AbstractC6843y0.m35178L(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                            break;
                        case 29:
                            AbstractC6843y0.m35194a0(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            AbstractC6843y0.m35180N(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 31:
                            AbstractC6843y0.m35188V(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            AbstractC6843y0.m35189W(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 33:
                            AbstractC6843y0.m35190X(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 34:
                            AbstractC6843y0.m35191Y(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 35:
                            AbstractC6843y0.m35179M(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 36:
                            AbstractC6843y0.m35183Q(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 37:
                            AbstractC6843y0.m35186T(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 38:
                            AbstractC6843y0.m35196b0(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 39:
                            AbstractC6843y0.m35185S(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 40:
                            AbstractC6843y0.m35182P(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            AbstractC6843y0.m35181O(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 42:
                            AbstractC6843y0.m35177K(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 43:
                            AbstractC6843y0.m35194a0(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            AbstractC6843y0.m35180N(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 45:
                            AbstractC6843y0.m35188V(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 46:
                            AbstractC6843y0.m35189W(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 47:
                            AbstractC6843y0.m35190X(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 48:
                            AbstractC6843y0.m35191Y(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 49:
                            AbstractC6843y0.m35184R(m35007I(i11), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, m35032n(i11));
                            break;
                        case 50:
                            m35023Y(interfaceC6813j1, m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), i11);
                            break;
                        case 51:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34945t(m35007I, m35010L(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34918H(m35007I, m35011M(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34951z(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34932g(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34936k(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34949x(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34929d(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34911A(m35007I, m35009K(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m35043y(obj, m35007I, i11)) {
                                m35024Z(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34948w(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(i11));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34935j(m35007I, (AbstractC6799f) AbstractC6804g1.m34840C(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34944s(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34921K(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34912B(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34937l(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34924N(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34941p(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m35043y(obj, m35007I, i11)) {
                                interfaceC6813j1.mo34934i(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(i11));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f37375p.mo34993f(interfaceC6813j1, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
                m35025a0(this.f37374o, obj, interfaceC6813j1);
            }
        }
        it = null;
        entry = null;
        length = this.f37360a.length;
        while (i11 < length) {
        }
        while (entry != null) {
        }
        m35025a0(this.f37374o, obj, interfaceC6813j1);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m35022X(Object obj, InterfaceC6813j1 interfaceC6813j1) {
        Iterator it;
        Map.Entry entry;
        int length;
        m35025a0(this.f37374o, obj, interfaceC6813j1);
        if (this.f37365f) {
            C6820n mo34989b = this.f37375p.mo34989b(obj);
            if (!mo34989b.m35074j()) {
                it = mo34989b.m35071e();
                entry = (Map.Entry) it.next();
                for (length = this.f37360a.length - 3; length >= 0; length -= 3) {
                    int m35019U = m35019U(length);
                    int m35007I = m35007I(length);
                    while (entry != null && this.f37375p.mo34988a(entry) > m35007I) {
                        this.f37375p.mo34993f(interfaceC6813j1, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (m35018T(m35019U)) {
                        case 0:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34945t(m35007I, m35028j(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34918H(m35007I, m35030l(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34951z(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34932g(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34936k(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34949x(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34929d(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34911A(m35007I, m35027i(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m35037s(obj, length)) {
                                m35024Z(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34948w(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34935j(m35007I, (AbstractC6799f) AbstractC6804g1.m34840C(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34944s(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34921K(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34912B(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34937l(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34924N(m35007I, m35036r(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34941p(m35007I, m35000B(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m35037s(obj, length)) {
                                interfaceC6813j1.mo34934i(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            AbstractC6843y0.m35179M(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 19:
                            AbstractC6843y0.m35183Q(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 20:
                            AbstractC6843y0.m35186T(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 21:
                            AbstractC6843y0.m35196b0(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 22:
                            AbstractC6843y0.m35185S(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 23:
                            AbstractC6843y0.m35182P(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 24:
                            AbstractC6843y0.m35181O(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 25:
                            AbstractC6843y0.m35177K(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 26:
                            AbstractC6843y0.m35192Z(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                            break;
                        case 27:
                            AbstractC6843y0.m35187U(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, m35032n(length));
                            break;
                        case 28:
                            AbstractC6843y0.m35178L(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                            break;
                        case 29:
                            AbstractC6843y0.m35194a0(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            AbstractC6843y0.m35180N(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 31:
                            AbstractC6843y0.m35188V(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            AbstractC6843y0.m35189W(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 33:
                            AbstractC6843y0.m35190X(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 34:
                            AbstractC6843y0.m35191Y(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, false);
                            break;
                        case 35:
                            AbstractC6843y0.m35179M(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 36:
                            AbstractC6843y0.m35183Q(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 37:
                            AbstractC6843y0.m35186T(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 38:
                            AbstractC6843y0.m35196b0(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 39:
                            AbstractC6843y0.m35185S(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 40:
                            AbstractC6843y0.m35182P(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            AbstractC6843y0.m35181O(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 42:
                            AbstractC6843y0.m35177K(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 43:
                            AbstractC6843y0.m35194a0(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            AbstractC6843y0.m35180N(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 45:
                            AbstractC6843y0.m35188V(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 46:
                            AbstractC6843y0.m35189W(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 47:
                            AbstractC6843y0.m35190X(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 48:
                            AbstractC6843y0.m35191Y(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, true);
                            break;
                        case 49:
                            AbstractC6843y0.m35184R(m35007I(length), (List) AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1, m35032n(length));
                            break;
                        case 50:
                            m35023Y(interfaceC6813j1, m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), length);
                            break;
                        case 51:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34945t(m35007I, m35010L(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34918H(m35007I, m35011M(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34951z(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34932g(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34936k(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34949x(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34929d(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34911A(m35007I, m35009K(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m35043y(obj, m35007I, length)) {
                                m35024Z(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), interfaceC6813j1);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34948w(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34935j(m35007I, (AbstractC6799f) AbstractC6804g1.m34840C(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34944s(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34921K(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34912B(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34937l(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34924N(m35007I, m35012N(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34941p(m35007I, m35013O(obj, m35008J(m35019U)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m35043y(obj, m35007I, length)) {
                                interfaceC6813j1.mo34934i(m35007I, AbstractC6804g1.m34840C(obj, m35008J(m35019U)), m35032n(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f37375p.mo34993f(interfaceC6813j1, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    /* renamed from: Y */
    private void m35023Y(InterfaceC6813j1 interfaceC6813j1, int i11, Object obj, int i12) {
        if (obj != null) {
            interfaceC6813j1.mo34917G(i11, this.f37376q.mo34764b(m35031m(i12)), this.f37376q.mo34765c(obj));
        }
    }

    /* renamed from: Z */
    private void m35024Z(int i11, Object obj, InterfaceC6813j1 interfaceC6813j1) {
        if (obj instanceof String) {
            interfaceC6813j1.mo34931f(i11, (String) obj);
        } else {
            interfaceC6813j1.mo34935j(i11, (AbstractC6799f) obj);
        }
    }

    /* renamed from: a0 */
    private void m35025a0(AbstractC6792c1 abstractC6792c1, Object obj, InterfaceC6813j1 interfaceC6813j1) {
        abstractC6792c1.mo34759h(abstractC6792c1.mo34752a(obj), interfaceC6813j1);
    }

    /* renamed from: h */
    private boolean m35026h(Object obj, Object obj2, int i11) {
        if (m35037s(obj, i11) == m35037s(obj2, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m35027i(Object obj, long j11) {
        return AbstractC6804g1.m34875r(obj, j11);
    }

    /* renamed from: j */
    private static double m35028j(Object obj, long j11) {
        return AbstractC6804g1.m34881x(obj, j11);
    }

    /* renamed from: k */
    private boolean m35029k(Object obj, Object obj2, int i11) {
        int m35019U = m35019U(i11);
        long m35008J = m35008J(m35019U);
        switch (m35018T(m35019U)) {
            case 0:
                if (!m35026h(obj, obj2, i11) || Double.doubleToLongBits(AbstractC6804g1.m34881x(obj, m35008J)) != Double.doubleToLongBits(AbstractC6804g1.m34881x(obj2, m35008J))) {
                    return false;
                }
                return true;
            case 1:
                if (!m35026h(obj, obj2, i11) || Float.floatToIntBits(AbstractC6804g1.m34882y(obj, m35008J)) != Float.floatToIntBits(AbstractC6804g1.m34882y(obj2, m35008J))) {
                    return false;
                }
                return true;
            case 2:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34838A(obj, m35008J) != AbstractC6804g1.m34838A(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 3:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34838A(obj, m35008J) != AbstractC6804g1.m34838A(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 4:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34883z(obj, m35008J) != AbstractC6804g1.m34883z(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 5:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34838A(obj, m35008J) != AbstractC6804g1.m34838A(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 6:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34883z(obj, m35008J) != AbstractC6804g1.m34883z(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 7:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34875r(obj, m35008J) != AbstractC6804g1.m34875r(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 8:
                if (!m35026h(obj, obj2, i11) || !AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J))) {
                    return false;
                }
                return true;
            case 9:
                if (!m35026h(obj, obj2, i11) || !AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J))) {
                    return false;
                }
                return true;
            case 10:
                if (!m35026h(obj, obj2, i11) || !AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J))) {
                    return false;
                }
                return true;
            case 11:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34883z(obj, m35008J) != AbstractC6804g1.m34883z(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 12:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34883z(obj, m35008J) != AbstractC6804g1.m34883z(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 13:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34883z(obj, m35008J) != AbstractC6804g1.m34883z(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 14:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34838A(obj, m35008J) != AbstractC6804g1.m34838A(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 15:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34883z(obj, m35008J) != AbstractC6804g1.m34883z(obj2, m35008J)) {
                    return false;
                }
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                if (!m35026h(obj, obj2, i11) || AbstractC6804g1.m34838A(obj, m35008J) != AbstractC6804g1.m34838A(obj2, m35008J)) {
                    return false;
                }
                return true;
            case 17:
                if (!m35026h(obj, obj2, i11) || !AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J))) {
                    return false;
                }
                return true;
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
                return AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J));
            case 50:
                return AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J));
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
                if (!m35042x(obj, obj2, i11) || !AbstractC6843y0.m35175I(AbstractC6804g1.m34840C(obj, m35008J), AbstractC6804g1.m34840C(obj2, m35008J))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: l */
    private static float m35030l(Object obj, long j11) {
        return AbstractC6804g1.m34882y(obj, j11);
    }

    /* renamed from: m */
    private Object m35031m(int i11) {
        return this.f37361b[(i11 / 3) * 2];
    }

    /* renamed from: n */
    private InterfaceC6839w0 m35032n(int i11) {
        int i12 = (i11 / 3) * 2;
        InterfaceC6839w0 interfaceC6839w0 = (InterfaceC6839w0) this.f37361b[i12];
        if (interfaceC6839w0 != null) {
            return interfaceC6839w0;
        }
        InterfaceC6839w0 m35143c = C6833t0.m35141a().m35143c((Class) this.f37361b[i12 + 1]);
        this.f37361b[i12] = m35143c;
        return m35143c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0060. Please report as an issue. */
    /* renamed from: o */
    private int m35033o(Object obj) {
        int i11;
        int i12;
        int m34637i;
        int m34632d;
        int m34612F;
        int m35203i;
        int m34622P;
        int m34624R;
        Unsafe unsafe = f37359s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (i14 < this.f37360a.length) {
            int m35019U = m35019U(i14);
            int m35007I = m35007I(i14);
            int m35018T = m35018T(m35019U);
            if (m35018T <= 17) {
                i11 = this.f37360a[i14 + 2];
                int i18 = i11 & i13;
                i12 = 1 << (i11 >>> 20);
                if (i18 != i16) {
                    i17 = unsafe.getInt(obj, i18);
                    i16 = i18;
                }
            } else {
                i11 = (!this.f37368i || m35018T < EnumC6822o.f37418d0.m35084b() || m35018T > EnumC6822o.f37431q0.m35084b()) ? 0 : this.f37360a[i14 + 2] & i13;
                i12 = 0;
            }
            long m35008J = m35008J(m35019U);
            switch (m35018T) {
                case 0:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        m34637i = CodedOutputStream.m34637i(m35007I, 0.0d);
                        i15 += m34637i;
                        break;
                    }
                case 1:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        m34637i = CodedOutputStream.m34645q(m35007I, 0.0f);
                        i15 += m34637i;
                        break;
                    }
                case 2:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        m34637i = CodedOutputStream.m34652x(m35007I, unsafe.getLong(obj, m35008J));
                        i15 += m34637i;
                        break;
                    }
                case 3:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        m34637i = CodedOutputStream.m34625S(m35007I, unsafe.getLong(obj, m35008J));
                        i15 += m34637i;
                        break;
                    }
                case 4:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        m34637i = CodedOutputStream.m34650v(m35007I, unsafe.getInt(obj, m35008J));
                        i15 += m34637i;
                        break;
                    }
                case 5:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        m34637i = CodedOutputStream.m34643o(m35007I, 0L);
                        i15 += m34637i;
                        break;
                    }
                case 6:
                    if ((i17 & i12) != 0) {
                        m34637i = CodedOutputStream.m34641m(m35007I, 0);
                        i15 += m34637i;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34632d(m35007I, true);
                        i15 += m34632d;
                    }
                    break;
                case 8:
                    if ((i17 & i12) != 0) {
                        Object object = unsafe.getObject(obj, m35008J);
                        if (object instanceof AbstractC6799f) {
                            m34632d = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) object);
                        } else {
                            m34632d = CodedOutputStream.m34620N(m35007I, (String) object);
                        }
                        i15 += m34632d;
                    }
                    break;
                case 9:
                    if ((i17 & i12) != 0) {
                        m34632d = AbstractC6843y0.m35209o(m35007I, unsafe.getObject(obj, m35008J), m35032n(i14));
                        i15 += m34632d;
                    }
                    break;
                case 10:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) unsafe.getObject(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 11:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34623Q(m35007I, unsafe.getInt(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 12:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34639k(m35007I, unsafe.getInt(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 13:
                    if ((i17 & i12) != 0) {
                        m34612F = CodedOutputStream.m34612F(m35007I, 0);
                        i15 += m34612F;
                    }
                    break;
                case 14:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34614H(m35007I, 0L);
                        i15 += m34632d;
                    }
                    break;
                case 15:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34616J(m35007I, unsafe.getInt(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34618L(m35007I, unsafe.getLong(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 17:
                    if ((i17 & i12) != 0) {
                        m34632d = CodedOutputStream.m34647s(m35007I, (InterfaceC6809i0) unsafe.getObject(obj, m35008J), m35032n(i14));
                        i15 += m34632d;
                    }
                    break;
                case 18:
                    m34632d = AbstractC6843y0.m35202h(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 19:
                    m34632d = AbstractC6843y0.m35200f(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 20:
                    m34632d = AbstractC6843y0.m35207m(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 21:
                    m34632d = AbstractC6843y0.m35218x(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 22:
                    m34632d = AbstractC6843y0.m35205k(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 23:
                    m34632d = AbstractC6843y0.m35202h(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 24:
                    m34632d = AbstractC6843y0.m35200f(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 25:
                    m34632d = AbstractC6843y0.m35193a(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 26:
                    m34632d = AbstractC6843y0.m35215u(m35007I, (List) unsafe.getObject(obj, m35008J));
                    i15 += m34632d;
                    break;
                case 27:
                    m34632d = AbstractC6843y0.m35210p(m35007I, (List) unsafe.getObject(obj, m35008J), m35032n(i14));
                    i15 += m34632d;
                    break;
                case 28:
                    m34632d = AbstractC6843y0.m35197c(m35007I, (List) unsafe.getObject(obj, m35008J));
                    i15 += m34632d;
                    break;
                case 29:
                    m34632d = AbstractC6843y0.m35216v(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    m34632d = AbstractC6843y0.m35198d(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 31:
                    m34632d = AbstractC6843y0.m35200f(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    m34632d = AbstractC6843y0.m35202h(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 33:
                    m34632d = AbstractC6843y0.m35211q(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 34:
                    m34632d = AbstractC6843y0.m35213s(m35007I, (List) unsafe.getObject(obj, m35008J), false);
                    i15 += m34632d;
                    break;
                case 35:
                    m35203i = AbstractC6843y0.m35203i((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 36:
                    m35203i = AbstractC6843y0.m35201g((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 37:
                    m35203i = AbstractC6843y0.m35208n((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 38:
                    m35203i = AbstractC6843y0.m35219y((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 39:
                    m35203i = AbstractC6843y0.m35206l((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 40:
                    m35203i = AbstractC6843y0.m35203i((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    m35203i = AbstractC6843y0.m35201g((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 42:
                    m35203i = AbstractC6843y0.m35195b((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 43:
                    m35203i = AbstractC6843y0.m35217w((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    m35203i = AbstractC6843y0.m35199e((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 45:
                    m35203i = AbstractC6843y0.m35201g((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 46:
                    m35203i = AbstractC6843y0.m35203i((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 47:
                    m35203i = AbstractC6843y0.m35212r((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 48:
                    m35203i = AbstractC6843y0.m35214t((List) unsafe.getObject(obj, m35008J));
                    if (m35203i > 0) {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i11, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34612F = m34622P + m34624R + m35203i;
                        i15 += m34612F;
                    }
                    break;
                case 49:
                    m34632d = AbstractC6843y0.m35204j(m35007I, (List) unsafe.getObject(obj, m35008J), m35032n(i14));
                    i15 += m34632d;
                    break;
                case 50:
                    m34632d = this.f37376q.mo34767e(m35007I, unsafe.getObject(obj, m35008J), m35031m(i14));
                    i15 += m34632d;
                    break;
                case 51:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34637i(m35007I, 0.0d);
                        i15 += m34632d;
                    }
                    break;
                case 52:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34645q(m35007I, 0.0f);
                        i15 += m34632d;
                    }
                    break;
                case 53:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34652x(m35007I, m35013O(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 54:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34625S(m35007I, m35013O(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 55:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34650v(m35007I, m35012N(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 56:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34643o(m35007I, 0L);
                        i15 += m34632d;
                    }
                    break;
                case 57:
                    if (m35043y(obj, m35007I, i14)) {
                        m34612F = CodedOutputStream.m34641m(m35007I, 0);
                        i15 += m34612F;
                    }
                    break;
                case 58:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34632d(m35007I, true);
                        i15 += m34632d;
                    }
                    break;
                case 59:
                    if (m35043y(obj, m35007I, i14)) {
                        Object object2 = unsafe.getObject(obj, m35008J);
                        if (object2 instanceof AbstractC6799f) {
                            m34632d = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) object2);
                        } else {
                            m34632d = CodedOutputStream.m34620N(m35007I, (String) object2);
                        }
                        i15 += m34632d;
                    }
                    break;
                case 60:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = AbstractC6843y0.m35209o(m35007I, unsafe.getObject(obj, m35008J), m35032n(i14));
                        i15 += m34632d;
                    }
                    break;
                case 61:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) unsafe.getObject(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 62:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34623Q(m35007I, m35012N(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 63:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34639k(m35007I, m35012N(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 64:
                    if (m35043y(obj, m35007I, i14)) {
                        m34612F = CodedOutputStream.m34612F(m35007I, 0);
                        i15 += m34612F;
                    }
                    break;
                case 65:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34614H(m35007I, 0L);
                        i15 += m34632d;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34616J(m35007I, m35012N(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34618L(m35007I, m35013O(obj, m35008J));
                        i15 += m34632d;
                    }
                    break;
                case 68:
                    if (m35043y(obj, m35007I, i14)) {
                        m34632d = CodedOutputStream.m34647s(m35007I, (InterfaceC6809i0) unsafe.getObject(obj, m35008J), m35032n(i14));
                        i15 += m34632d;
                    }
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
        int m35035q = i15 + m35035q(this.f37374o, obj);
        return this.f37365f ? m35035q + this.f37375p.mo34989b(obj).m35073h() : m35035q;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /* renamed from: p */
    private int m35034p(Object obj) {
        int m34637i;
        int m35203i;
        int m34622P;
        int m34624R;
        Unsafe unsafe = f37359s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37360a.length; i12 += 3) {
            int m35019U = m35019U(i12);
            int m35018T = m35018T(m35019U);
            int m35007I = m35007I(i12);
            long m35008J = m35008J(m35019U);
            int i13 = (m35018T < EnumC6822o.f37418d0.m35084b() || m35018T > EnumC6822o.f37431q0.m35084b()) ? 0 : this.f37360a[i12 + 2] & 1048575;
            switch (m35018T) {
                case 0:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34637i(m35007I, 0.0d);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34645q(m35007I, 0.0f);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34652x(m35007I, AbstractC6804g1.m34838A(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34625S(m35007I, AbstractC6804g1.m34838A(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34650v(m35007I, AbstractC6804g1.m34883z(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34643o(m35007I, 0L);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34641m(m35007I, 0);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34632d(m35007I, true);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m35037s(obj, i12)) {
                        Object m34840C = AbstractC6804g1.m34840C(obj, m35008J);
                        if (m34840C instanceof AbstractC6799f) {
                            m34637i = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) m34840C);
                        } else {
                            m34637i = CodedOutputStream.m34620N(m35007I, (String) m34840C);
                        }
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m35037s(obj, i12)) {
                        m34637i = AbstractC6843y0.m35209o(m35007I, AbstractC6804g1.m34840C(obj, m35008J), m35032n(i12));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) AbstractC6804g1.m34840C(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34623Q(m35007I, AbstractC6804g1.m34883z(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34639k(m35007I, AbstractC6804g1.m34883z(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34612F(m35007I, 0);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34614H(m35007I, 0L);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34616J(m35007I, AbstractC6804g1.m34883z(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34618L(m35007I, AbstractC6804g1.m34838A(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m35037s(obj, i12)) {
                        m34637i = CodedOutputStream.m34647s(m35007I, (InterfaceC6809i0) AbstractC6804g1.m34840C(obj, m35008J), m35032n(i12));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m34637i = AbstractC6843y0.m35202h(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 19:
                    m34637i = AbstractC6843y0.m35200f(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 20:
                    m34637i = AbstractC6843y0.m35207m(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 21:
                    m34637i = AbstractC6843y0.m35218x(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 22:
                    m34637i = AbstractC6843y0.m35205k(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 23:
                    m34637i = AbstractC6843y0.m35202h(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 24:
                    m34637i = AbstractC6843y0.m35200f(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 25:
                    m34637i = AbstractC6843y0.m35193a(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 26:
                    m34637i = AbstractC6843y0.m35215u(m35007I, m34999A(obj, m35008J));
                    i11 += m34637i;
                    break;
                case 27:
                    m34637i = AbstractC6843y0.m35210p(m35007I, m34999A(obj, m35008J), m35032n(i12));
                    i11 += m34637i;
                    break;
                case 28:
                    m34637i = AbstractC6843y0.m35197c(m35007I, m34999A(obj, m35008J));
                    i11 += m34637i;
                    break;
                case 29:
                    m34637i = AbstractC6843y0.m35216v(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    m34637i = AbstractC6843y0.m35198d(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 31:
                    m34637i = AbstractC6843y0.m35200f(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    m34637i = AbstractC6843y0.m35202h(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 33:
                    m34637i = AbstractC6843y0.m35211q(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 34:
                    m34637i = AbstractC6843y0.m35213s(m35007I, m34999A(obj, m35008J), false);
                    i11 += m34637i;
                    break;
                case 35:
                    m35203i = AbstractC6843y0.m35203i((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 36:
                    m35203i = AbstractC6843y0.m35201g((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 37:
                    m35203i = AbstractC6843y0.m35208n((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 38:
                    m35203i = AbstractC6843y0.m35219y((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 39:
                    m35203i = AbstractC6843y0.m35206l((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 40:
                    m35203i = AbstractC6843y0.m35203i((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    m35203i = AbstractC6843y0.m35201g((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 42:
                    m35203i = AbstractC6843y0.m35195b((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 43:
                    m35203i = AbstractC6843y0.m35217w((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    m35203i = AbstractC6843y0.m35199e((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 45:
                    m35203i = AbstractC6843y0.m35201g((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 46:
                    m35203i = AbstractC6843y0.m35203i((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 47:
                    m35203i = AbstractC6843y0.m35212r((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 48:
                    m35203i = AbstractC6843y0.m35214t((List) unsafe.getObject(obj, m35008J));
                    if (m35203i <= 0) {
                        break;
                    } else {
                        if (this.f37368i) {
                            unsafe.putInt(obj, i13, m35203i);
                        }
                        m34622P = CodedOutputStream.m34622P(m35007I);
                        m34624R = CodedOutputStream.m34624R(m35203i);
                        m34637i = m34622P + m34624R + m35203i;
                        i11 += m34637i;
                        break;
                    }
                case 49:
                    m34637i = AbstractC6843y0.m35204j(m35007I, m34999A(obj, m35008J), m35032n(i12));
                    i11 += m34637i;
                    break;
                case 50:
                    m34637i = this.f37376q.mo34767e(m35007I, AbstractC6804g1.m34840C(obj, m35008J), m35031m(i12));
                    i11 += m34637i;
                    break;
                case 51:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34637i(m35007I, 0.0d);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34645q(m35007I, 0.0f);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34652x(m35007I, m35013O(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34625S(m35007I, m35013O(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34650v(m35007I, m35012N(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34643o(m35007I, 0L);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34641m(m35007I, 0);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34632d(m35007I, true);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m35043y(obj, m35007I, i12)) {
                        Object m34840C2 = AbstractC6804g1.m34840C(obj, m35008J);
                        if (m34840C2 instanceof AbstractC6799f) {
                            m34637i = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) m34840C2);
                        } else {
                            m34637i = CodedOutputStream.m34620N(m35007I, (String) m34840C2);
                        }
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = AbstractC6843y0.m35209o(m35007I, AbstractC6804g1.m34840C(obj, m35008J), m35032n(i12));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34635g(m35007I, (AbstractC6799f) AbstractC6804g1.m34840C(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34623Q(m35007I, m35012N(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34639k(m35007I, m35012N(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34612F(m35007I, 0);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34614H(m35007I, 0L);
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34616J(m35007I, m35012N(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34618L(m35007I, m35013O(obj, m35008J));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m35043y(obj, m35007I, i12)) {
                        m34637i = CodedOutputStream.m34647s(m35007I, (InterfaceC6809i0) AbstractC6804g1.m34840C(obj, m35008J), m35032n(i12));
                        i11 += m34637i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i11 + m35035q(this.f37374o, obj);
    }

    /* renamed from: q */
    private int m35035q(AbstractC6792c1 abstractC6792c1, Object obj) {
        return abstractC6792c1.mo34753b(abstractC6792c1.mo34752a(obj));
    }

    /* renamed from: r */
    private static int m35036r(Object obj, long j11) {
        return AbstractC6804g1.m34883z(obj, j11);
    }

    /* renamed from: s */
    private boolean m35037s(Object obj, int i11) {
        int m35014P = m35014P(i11);
        long j11 = 1048575 & m35014P;
        if (j11 == 1048575) {
            int m35019U = m35019U(i11);
            long m35008J = m35008J(m35019U);
            switch (m35018T(m35019U)) {
                case 0:
                    if (AbstractC6804g1.m34881x(obj, m35008J) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (AbstractC6804g1.m34882y(obj, m35008J) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC6804g1.m34838A(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC6804g1.m34838A(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC6804g1.m34883z(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC6804g1.m34838A(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC6804g1.m34883z(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC6804g1.m34875r(obj, m35008J);
                case 8:
                    Object m34840C = AbstractC6804g1.m34840C(obj, m35008J);
                    if (m34840C instanceof String) {
                        return !((String) m34840C).isEmpty();
                    }
                    if (m34840C instanceof AbstractC6799f) {
                        return !AbstractC6799f.f37259q.equals(m34840C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC6804g1.m34840C(obj, m35008J) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC6799f.f37259q.equals(AbstractC6804g1.m34840C(obj, m35008J));
                case 11:
                    if (AbstractC6804g1.m34883z(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC6804g1.m34883z(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC6804g1.m34883z(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC6804g1.m34838A(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC6804g1.m34883z(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (AbstractC6804g1.m34838A(obj, m35008J) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC6804g1.m34840C(obj, m35008J) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC6804g1.m34883z(obj, j11) & (1 << (m35014P >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m35038t(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return m35037s(obj, i11);
        }
        if ((i13 & i14) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private static boolean m35039u(Object obj, int i11, InterfaceC6839w0 interfaceC6839w0) {
        return interfaceC6839w0.mo35048d(AbstractC6804g1.m34840C(obj, m35008J(i11)));
    }

    /* renamed from: v */
    private boolean m35040v(Object obj, int i11, int i12) {
        List list = (List) AbstractC6804g1.m34840C(obj, m35008J(i11));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC6839w0 m35032n = m35032n(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!m35032n.mo35048d(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    private boolean m35041w(Object obj, int i11, int i12) {
        Map mo34765c = this.f37376q.mo34765c(AbstractC6804g1.m34840C(obj, m35008J(i11)));
        if (mo34765c.isEmpty()) {
            return true;
        }
        if (this.f37376q.mo34764b(m35031m(i12)).f37244c.m34984b() != AbstractC6810i1.c.MESSAGE) {
            return true;
        }
        InterfaceC6839w0 interfaceC6839w0 = null;
        for (Object obj2 : mo34765c.values()) {
            if (interfaceC6839w0 == null) {
                interfaceC6839w0 = C6833t0.m35141a().m35143c(obj2.getClass());
            }
            if (!interfaceC6839w0.mo35048d(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    private boolean m35042x(Object obj, Object obj2, int i11) {
        long m35014P = m35014P(i11) & 1048575;
        if (AbstractC6804g1.m34883z(obj, m35014P) == AbstractC6804g1.m34883z(obj2, m35014P)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private boolean m35043y(Object obj, int i11, int i12) {
        if (AbstractC6804g1.m34883z(obj, m35014P(i12) & 1048575) == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private static boolean m35044z(int i11) {
        return (i11 & 268435456) != 0;
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: a */
    public void mo35045a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i11 = 0; i11 < this.f37360a.length; i11 += 3) {
            m35003E(obj, obj2, i11);
        }
        AbstractC6843y0.m35171E(this.f37374o, obj, obj2);
        if (this.f37365f) {
            AbstractC6843y0.m35169C(this.f37375p, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: b */
    public void mo35046b(Object obj, InterfaceC6813j1 interfaceC6813j1) {
        if (interfaceC6813j1.mo34950y() == InterfaceC6813j1.a.DESCENDING) {
            m35022X(obj, interfaceC6813j1);
        } else if (this.f37367h) {
            m35021W(obj, interfaceC6813j1);
        } else {
            m35020V(obj, interfaceC6813j1);
        }
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: c */
    public void mo35047c(Object obj) {
        int i11;
        int i12 = this.f37370k;
        while (true) {
            i11 = this.f37371l;
            if (i12 >= i11) {
                break;
            }
            long m35008J = m35008J(m35019U(this.f37369j[i12]));
            Object m34840C = AbstractC6804g1.m34840C(obj, m35008J);
            if (m34840C != null) {
                AbstractC6804g1.m34855R(obj, m35008J, this.f37376q.mo34766d(m34840C));
            }
            i12++;
        }
        int length = this.f37369j.length;
        while (i11 < length) {
            this.f37373n.mo35162c(obj, this.f37369j[i11]);
            i11++;
        }
        this.f37374o.mo34755d(obj);
        if (this.f37365f) {
            this.f37375p.mo34992e(obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: d */
    public final boolean mo35048d(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f37370k) {
            int i16 = this.f37369j[i15];
            int m35007I = m35007I(i16);
            int m35019U = m35019U(i16);
            int i17 = this.f37360a[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i14 = f37359s.getInt(obj, i18);
                }
                i12 = i14;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i14;
            }
            if (m35044z(m35019U) && !m35038t(obj, i16, i11, i12, i19)) {
                return false;
            }
            int m35018T = m35018T(m35019U);
            if (m35018T != 9 && m35018T != 17) {
                if (m35018T != 27) {
                    if (m35018T != 60 && m35018T != 68) {
                        if (m35018T != 49) {
                            if (m35018T == 50 && !m35041w(obj, m35019U, i16)) {
                                return false;
                            }
                        }
                    } else if (m35043y(obj, m35007I, i16) && !m35039u(obj, m35019U, m35032n(i16))) {
                        return false;
                    }
                }
                if (!m35040v(obj, m35019U, i16)) {
                    return false;
                }
            } else if (m35038t(obj, i16, i11, i12, i19) && !m35039u(obj, m35019U, m35032n(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        if (this.f37365f && !this.f37375p.mo34989b(obj).m35075k()) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: e */
    public int mo35049e(Object obj) {
        if (this.f37367h) {
            return m35034p(obj);
        }
        return m35033o(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: f */
    public int mo35050f(Object obj) {
        int i11;
        int m35134f;
        int length = this.f37360a.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int m35019U = m35019U(i13);
            int m35007I = m35007I(i13);
            long m35008J = m35008J(m35019U);
            int i14 = 37;
            switch (m35018T(m35019U)) {
                case 0:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35134f(Double.doubleToLongBits(AbstractC6804g1.m34881x(obj, m35008J)));
                    i12 = i11 + m35134f;
                    break;
                case 1:
                    i11 = i12 * 53;
                    m35134f = Float.floatToIntBits(AbstractC6804g1.m34882y(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 2:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35134f(AbstractC6804g1.m34838A(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 3:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35134f(AbstractC6804g1.m34838A(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 4:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34883z(obj, m35008J);
                    i12 = i11 + m35134f;
                    break;
                case 5:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35134f(AbstractC6804g1.m34838A(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 6:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34883z(obj, m35008J);
                    i12 = i11 + m35134f;
                    break;
                case 7:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35131c(AbstractC6804g1.m34875r(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 8:
                    i11 = i12 * 53;
                    m35134f = ((String) AbstractC6804g1.m34840C(obj, m35008J)).hashCode();
                    i12 = i11 + m35134f;
                    break;
                case 9:
                    Object m34840C = AbstractC6804g1.m34840C(obj, m35008J);
                    if (m34840C != null) {
                        i14 = m34840C.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 10:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34840C(obj, m35008J).hashCode();
                    i12 = i11 + m35134f;
                    break;
                case 11:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34883z(obj, m35008J);
                    i12 = i11 + m35134f;
                    break;
                case 12:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34883z(obj, m35008J);
                    i12 = i11 + m35134f;
                    break;
                case 13:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34883z(obj, m35008J);
                    i12 = i11 + m35134f;
                    break;
                case 14:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35134f(AbstractC6804g1.m34838A(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 15:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34883z(obj, m35008J);
                    i12 = i11 + m35134f;
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    i11 = i12 * 53;
                    m35134f = AbstractC6830s.m35134f(AbstractC6804g1.m34838A(obj, m35008J));
                    i12 = i11 + m35134f;
                    break;
                case 17:
                    Object m34840C2 = AbstractC6804g1.m34840C(obj, m35008J);
                    if (m34840C2 != null) {
                        i14 = m34840C2.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
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
                    m35134f = AbstractC6804g1.m34840C(obj, m35008J).hashCode();
                    i12 = i11 + m35134f;
                    break;
                case 50:
                    i11 = i12 * 53;
                    m35134f = AbstractC6804g1.m34840C(obj, m35008J).hashCode();
                    i12 = i11 + m35134f;
                    break;
                case 51:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35134f(Double.doubleToLongBits(m35010L(obj, m35008J)));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = Float.floatToIntBits(m35011M(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35134f(m35013O(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35134f(m35013O(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = m35012N(obj, m35008J);
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35134f(m35013O(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = m35012N(obj, m35008J);
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35131c(m35009K(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = ((String) AbstractC6804g1.m34840C(obj, m35008J)).hashCode();
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6804g1.m34840C(obj, m35008J).hashCode();
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6804g1.m34840C(obj, m35008J).hashCode();
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = m35012N(obj, m35008J);
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = m35012N(obj, m35008J);
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = m35012N(obj, m35008J);
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35134f(m35013O(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = m35012N(obj, m35008J);
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6830s.m35134f(m35013O(obj, m35008J));
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m35043y(obj, m35007I, i13)) {
                        i11 = i12 * 53;
                        m35134f = AbstractC6804g1.m34840C(obj, m35008J).hashCode();
                        i12 = i11 + m35134f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.f37374o.mo34752a(obj).hashCode();
        if (this.f37365f) {
            return (hashCode * 53) + this.f37375p.mo34989b(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.InterfaceC6839w0
    /* renamed from: g */
    public boolean mo35051g(Object obj, Object obj2) {
        int length = this.f37360a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!m35029k(obj, obj2, i11)) {
                return false;
            }
        }
        if (!this.f37374o.mo34752a(obj).equals(this.f37374o.mo34752a(obj2))) {
            return false;
        }
        if (this.f37365f) {
            return this.f37375p.mo34989b(obj).equals(this.f37375p.mo34989b(obj2));
        }
        return true;
    }
}
