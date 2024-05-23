package com.google.android.gms.internal.play_billing;

import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import p664y.AbstractC30228a;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.l2 */
/* loaded from: classes2.dex */
public final class C5793l2 implements InterfaceC5835s2 {

    /* renamed from: o */
    private static final int[] f33346o = new int[0];

    /* renamed from: p */
    private static final Unsafe f33347p = AbstractC5770h3.m30259l();

    /* renamed from: a */
    private final int[] f33348a;

    /* renamed from: b */
    private final Object[] f33349b;

    /* renamed from: c */
    private final int f33350c;

    /* renamed from: d */
    private final int f33351d;

    /* renamed from: e */
    private final InterfaceC5775i2 f33352e;

    /* renamed from: f */
    private final boolean f33353f;

    /* renamed from: g */
    private final int[] f33354g;

    /* renamed from: h */
    private final int f33355h;

    /* renamed from: i */
    private final int f33356i;

    /* renamed from: j */
    private final AbstractC5858w1 f33357j;

    /* renamed from: k */
    private final AbstractC5865x2 f33358k;

    /* renamed from: l */
    private final AbstractC5875z0 f33359l;

    /* renamed from: m */
    private final C5805n2 f33360m;

    /* renamed from: n */
    private final C5738c2 f33361n;

    private C5793l2(int[] iArr, Object[] objArr, int i11, int i12, InterfaceC5775i2 interfaceC5775i2, int i13, boolean z11, int[] iArr2, int i14, int i15, C5805n2 c5805n2, AbstractC5858w1 abstractC5858w1, AbstractC5865x2 abstractC5865x2, AbstractC5875z0 abstractC5875z0, C5738c2 c5738c2) {
        this.f33348a = iArr;
        this.f33349b = objArr;
        this.f33350c = i11;
        this.f33351d = i12;
        boolean z12 = false;
        if (abstractC5875z0 != null && abstractC5875z0.mo30156c(interfaceC5775i2)) {
            z12 = true;
        }
        this.f33353f = z12;
        this.f33354g = iArr2;
        this.f33355h = i14;
        this.f33356i = i15;
        this.f33360m = c5805n2;
        this.f33357j = abstractC5858w1;
        this.f33358k = abstractC5865x2;
        this.f33359l = abstractC5875z0;
        this.f33352e = interfaceC5775i2;
        this.f33361n = c5738c2;
    }

    /* renamed from: A */
    private static int m30321A(Object obj, long j11) {
        return ((Integer) AbstractC5770h3.m30258k(obj, j11)).intValue();
    }

    /* renamed from: B */
    private final int m30322B(int i11) {
        return this.f33348a[i11 + 2];
    }

    /* renamed from: C */
    private final int m30323C(int i11, int i12) {
        int length = (this.f33348a.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.f33348a[i14];
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

    /* renamed from: D */
    private static int m30324D(int i11) {
        return (i11 >>> 20) & 255;
    }

    /* renamed from: E */
    private final int m30325E(int i11) {
        return this.f33348a[i11 + 1];
    }

    /* renamed from: F */
    private static long m30326F(Object obj, long j11) {
        return ((Long) AbstractC5770h3.m30258k(obj, j11)).longValue();
    }

    /* renamed from: G */
    private final InterfaceC5792l1 m30327G(int i11) {
        int i12 = i11 / 3;
        return (InterfaceC5792l1) this.f33349b[i12 + i12 + 1];
    }

    /* renamed from: H */
    private final InterfaceC5835s2 m30328H(int i11) {
        Object[] objArr = this.f33349b;
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        InterfaceC5835s2 interfaceC5835s2 = (InterfaceC5835s2) objArr[i13];
        if (interfaceC5835s2 != null) {
            return interfaceC5835s2;
        }
        InterfaceC5835s2 m30432b = C5823q2.m30431a().m30432b((Class) objArr[i13 + 1]);
        this.f33349b[i13] = m30432b;
        return m30432b;
    }

    /* renamed from: I */
    private final Object m30329I(int i11) {
        int i12 = i11 / 3;
        return this.f33349b[i12 + i12];
    }

    /* renamed from: J */
    private final Object m30330J(Object obj, int i11) {
        InterfaceC5835s2 m30328H = m30328H(i11);
        int m30325E = m30325E(i11) & 1048575;
        if (!m30341o(obj, i11)) {
            return m30328H.zze();
        }
        Object object = f33347p.getObject(obj, m30325E);
        if (m30344r(object)) {
            return object;
        }
        Object zze = m30328H.zze();
        if (object != null) {
            m30328H.mo30353b(zze, object);
        }
        return zze;
    }

    /* renamed from: K */
    private final Object m30331K(Object obj, int i11, int i12) {
        InterfaceC5835s2 m30328H = m30328H(i12);
        if (!m30345s(obj, i11, i12)) {
            return m30328H.zze();
        }
        Object object = f33347p.getObject(obj, m30325E(i12) & 1048575);
        if (m30344r(object)) {
            return object;
        }
        Object zze = m30328H.zze();
        if (object != null) {
            m30328H.mo30353b(zze, object);
        }
        return zze;
    }

    /* renamed from: L */
    private static Field m30332L(Class cls, String str) {
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

    /* renamed from: g */
    private static void m30333g(Object obj) {
        if (m30344r(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: h */
    private final void m30334h(Object obj, Object obj2, int i11) {
        if (!m30341o(obj2, i11)) {
            return;
        }
        int m30325E = m30325E(i11) & 1048575;
        Unsafe unsafe = f33347p;
        long j11 = m30325E;
        Object object = unsafe.getObject(obj2, j11);
        if (object != null) {
            InterfaceC5835s2 m30328H = m30328H(i11);
            if (!m30341o(obj, i11)) {
                if (!m30344r(object)) {
                    unsafe.putObject(obj, j11, object);
                } else {
                    Object zze = m30328H.zze();
                    m30328H.mo30353b(zze, object);
                    unsafe.putObject(obj, j11, zze);
                }
                m30336j(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!m30344r(object2)) {
                Object zze2 = m30328H.zze();
                m30328H.mo30353b(zze2, object2);
                unsafe.putObject(obj, j11, zze2);
                object2 = zze2;
            }
            m30328H.mo30353b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f33348a[i11] + " is present but null: " + obj2.toString());
    }

    /* renamed from: i */
    private final void m30335i(Object obj, Object obj2, int i11) {
        int i12 = this.f33348a[i11];
        if (!m30345s(obj2, i12, i11)) {
            return;
        }
        int m30325E = m30325E(i11) & 1048575;
        Unsafe unsafe = f33347p;
        long j11 = m30325E;
        Object object = unsafe.getObject(obj2, j11);
        if (object != null) {
            InterfaceC5835s2 m30328H = m30328H(i11);
            if (!m30345s(obj, i12, i11)) {
                if (!m30344r(object)) {
                    unsafe.putObject(obj, j11, object);
                } else {
                    Object zze = m30328H.zze();
                    m30328H.mo30353b(zze, object);
                    unsafe.putObject(obj, j11, zze);
                }
                m30337k(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!m30344r(object2)) {
                Object zze2 = m30328H.zze();
                m30328H.mo30353b(zze2, object2);
                unsafe.putObject(obj, j11, zze2);
                object2 = zze2;
            }
            m30328H.mo30353b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f33348a[i11] + " is present but null: " + obj2.toString());
    }

    /* renamed from: j */
    private final void m30336j(Object obj, int i11) {
        int m30322B = m30322B(i11);
        long j11 = 1048575 & m30322B;
        if (j11 == 1048575) {
            return;
        }
        AbstractC5770h3.m30269v(obj, j11, (1 << (m30322B >>> 20)) | AbstractC5770h3.m30255h(obj, j11));
    }

    /* renamed from: k */
    private final void m30337k(Object obj, int i11, int i12) {
        AbstractC5770h3.m30269v(obj, m30322B(i12) & 1048575, i11);
    }

    /* renamed from: l */
    private final void m30338l(Object obj, int i11, Object obj2) {
        f33347p.putObject(obj, m30325E(i11) & 1048575, obj2);
        m30336j(obj, i11);
    }

    /* renamed from: m */
    private final void m30339m(Object obj, int i11, int i12, Object obj2) {
        f33347p.putObject(obj, m30325E(i12) & 1048575, obj2);
        m30337k(obj, i11, i12);
    }

    /* renamed from: n */
    private final boolean m30340n(Object obj, Object obj2, int i11) {
        if (m30341o(obj, i11) == m30341o(obj2, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final boolean m30341o(Object obj, int i11) {
        int m30322B = m30322B(i11);
        long j11 = m30322B & 1048575;
        if (j11 == 1048575) {
            int m30325E = m30325E(i11);
            long j12 = m30325E & 1048575;
            switch (m30324D(m30325E)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC5770h3.m30253f(obj, j12)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC5770h3.m30254g(obj, j12)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC5770h3.m30256i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC5770h3.m30256i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC5770h3.m30255h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC5770h3.m30256i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC5770h3.m30255h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC5770h3.m30244B(obj, j12);
                case 8:
                    Object m30258k = AbstractC5770h3.m30258k(obj, j12);
                    if (m30258k instanceof String) {
                        if (((String) m30258k).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (m30258k instanceof AbstractC5803n0) {
                        if (AbstractC5803n0.f33371q.equals(m30258k)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC5770h3.m30258k(obj, j12) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC5803n0.f33371q.equals(AbstractC5770h3.m30258k(obj, j12))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC5770h3.m30255h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC5770h3.m30255h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC5770h3.m30255h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC5770h3.m30256i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC5770h3.m30255h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (AbstractC5770h3.m30256i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC5770h3.m30258k(obj, j12) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC5770h3.m30255h(obj, j11) & (1 << (m30322B >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final boolean m30342p(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return m30341o(obj, i11);
        }
        if ((i13 & i14) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private static boolean m30343q(Object obj, int i11, InterfaceC5835s2 interfaceC5835s2) {
        return interfaceC5835s2.mo30355d(AbstractC5770h3.m30258k(obj, i11 & 1048575));
    }

    /* renamed from: r */
    private static boolean m30344r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5774i1) {
            return ((AbstractC5774i1) obj).m30291p();
        }
        return true;
    }

    /* renamed from: s */
    private final boolean m30345s(Object obj, int i11, int i12) {
        if (AbstractC5770h3.m30255h(obj, m30322B(i12) & 1048575) == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private static boolean m30346t(Object obj, long j11) {
        return ((Boolean) AbstractC5770h3.m30258k(obj, j11)).booleanValue();
    }

    /* renamed from: u */
    private static final void m30347u(int i11, Object obj, InterfaceC5806n3 interfaceC5806n3) {
        if (obj instanceof String) {
            interfaceC5806n3.mo30391d(i11, (String) obj);
        } else {
            interfaceC5806n3.mo30385G(i11, (AbstractC5803n0) obj);
        }
    }

    /* renamed from: w */
    static C5871y2 m30348w(Object obj) {
        AbstractC5774i1 abstractC5774i1 = (AbstractC5774i1) obj;
        C5871y2 c5871y2 = abstractC5774i1.zzc;
        if (c5871y2 == C5871y2.m30568c()) {
            C5871y2 m30570f = C5871y2.m30570f();
            abstractC5774i1.zzc = m30570f;
            return m30570f;
        }
        return c5871y2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5793l2 m30349x(Class cls, InterfaceC5751e2 interfaceC5751e2, C5805n2 c5805n2, AbstractC5858w1 abstractC5858w1, AbstractC5865x2 abstractC5865x2, AbstractC5875z0 abstractC5875z0, C5738c2 c5738c2) {
        int i11;
        int charAt;
        int charAt2;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        char charAt10;
        int i26;
        int i27;
        int i28;
        int i29;
        C5829r2 c5829r2;
        int i31;
        String str;
        int i32;
        int i33;
        int i34;
        int i35;
        Field m30332L;
        char charAt11;
        int i36;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        int i43;
        Object obj;
        Field m30332L2;
        Object obj2;
        Field m30332L3;
        int i44;
        char charAt12;
        int i45;
        char charAt13;
        int i46;
        char charAt14;
        int i47;
        char charAt15;
        if (interfaceC5751e2 instanceof C5829r2) {
            C5829r2 c5829r22 = (C5829r2) interfaceC5751e2;
            String m30441a = c5829r22.m30441a();
            int length = m30441a.length();
            char c11 = 55296;
            if (m30441a.charAt(0) >= 55296) {
                int i48 = 1;
                while (true) {
                    i11 = i48 + 1;
                    if (m30441a.charAt(i48) < 55296) {
                        break;
                    }
                    i48 = i11;
                }
            } else {
                i11 = 1;
            }
            int i49 = i11 + 1;
            int charAt16 = m30441a.charAt(i11);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i47 = i49 + 1;
                    charAt15 = m30441a.charAt(i49);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i51 |= (charAt15 & 8191) << i52;
                    i52 += 13;
                    i49 = i47;
                }
                charAt16 = i51 | (charAt15 << i52);
                i49 = i47;
            }
            if (charAt16 == 0) {
                iArr = f33346o;
                i15 = 0;
                charAt = 0;
                charAt2 = 0;
                i13 = 0;
                i16 = 0;
                i12 = 0;
                i14 = 0;
            } else {
                int i53 = i49 + 1;
                int charAt17 = m30441a.charAt(i49);
                if (charAt17 >= 55296) {
                    int i54 = charAt17 & 8191;
                    int i55 = 13;
                    while (true) {
                        i25 = i53 + 1;
                        charAt10 = m30441a.charAt(i53);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i54 |= (charAt10 & 8191) << i55;
                        i55 += 13;
                        i53 = i25;
                    }
                    charAt17 = i54 | (charAt10 << i55);
                    i53 = i25;
                }
                int i56 = i53 + 1;
                int charAt18 = m30441a.charAt(i53);
                if (charAt18 >= 55296) {
                    int i57 = charAt18 & 8191;
                    int i58 = 13;
                    while (true) {
                        i24 = i56 + 1;
                        charAt9 = m30441a.charAt(i56);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i57 |= (charAt9 & 8191) << i58;
                        i58 += 13;
                        i56 = i24;
                    }
                    charAt18 = i57 | (charAt9 << i58);
                    i56 = i24;
                }
                int i59 = i56 + 1;
                int charAt19 = m30441a.charAt(i56);
                if (charAt19 >= 55296) {
                    int i61 = charAt19 & 8191;
                    int i62 = 13;
                    while (true) {
                        i23 = i59 + 1;
                        charAt8 = m30441a.charAt(i59);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i61 |= (charAt8 & 8191) << i62;
                        i62 += 13;
                        i59 = i23;
                    }
                    charAt19 = i61 | (charAt8 << i62);
                    i59 = i23;
                }
                int i63 = i59 + 1;
                int charAt20 = m30441a.charAt(i59);
                if (charAt20 >= 55296) {
                    int i64 = charAt20 & 8191;
                    int i65 = 13;
                    while (true) {
                        i22 = i63 + 1;
                        charAt7 = m30441a.charAt(i63);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i64 |= (charAt7 & 8191) << i65;
                        i65 += 13;
                        i63 = i22;
                    }
                    charAt20 = i64 | (charAt7 << i65);
                    i63 = i22;
                }
                int i66 = i63 + 1;
                charAt = m30441a.charAt(i63);
                if (charAt >= 55296) {
                    int i67 = charAt & 8191;
                    int i68 = 13;
                    while (true) {
                        i21 = i66 + 1;
                        charAt6 = m30441a.charAt(i66);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i67 |= (charAt6 & 8191) << i68;
                        i68 += 13;
                        i66 = i21;
                    }
                    charAt = i67 | (charAt6 << i68);
                    i66 = i21;
                }
                int i69 = i66 + 1;
                charAt2 = m30441a.charAt(i66);
                if (charAt2 >= 55296) {
                    int i71 = charAt2 & 8191;
                    int i72 = 13;
                    while (true) {
                        i19 = i69 + 1;
                        charAt5 = m30441a.charAt(i69);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i71 |= (charAt5 & 8191) << i72;
                        i72 += 13;
                        i69 = i19;
                    }
                    charAt2 = i71 | (charAt5 << i72);
                    i69 = i19;
                }
                int i73 = i69 + 1;
                int charAt21 = m30441a.charAt(i69);
                if (charAt21 >= 55296) {
                    int i74 = charAt21 & 8191;
                    int i75 = 13;
                    while (true) {
                        i18 = i73 + 1;
                        charAt4 = m30441a.charAt(i73);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i74 |= (charAt4 & 8191) << i75;
                        i75 += 13;
                        i73 = i18;
                    }
                    charAt21 = i74 | (charAt4 << i75);
                    i73 = i18;
                }
                int i76 = i73 + 1;
                int charAt22 = m30441a.charAt(i73);
                if (charAt22 >= 55296) {
                    int i77 = charAt22 & 8191;
                    int i78 = 13;
                    while (true) {
                        i17 = i76 + 1;
                        charAt3 = m30441a.charAt(i76);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i77 |= (charAt3 & 8191) << i78;
                        i78 += 13;
                        i76 = i17;
                    }
                    charAt22 = i77 | (charAt3 << i78);
                    i76 = i17;
                }
                i12 = charAt17 + charAt17 + charAt18;
                iArr = new int[charAt22 + charAt2 + charAt21];
                i13 = charAt19;
                i14 = charAt22;
                i15 = charAt17;
                i16 = charAt20;
                i49 = i76;
            }
            Unsafe unsafe = f33347p;
            Object[] m30442b = c5829r22.m30442b();
            Class<?> cls2 = c5829r22.zza().getClass();
            int i79 = i14 + charAt2;
            int i81 = charAt + charAt;
            int[] iArr2 = new int[charAt * 3];
            Object[] objArr = new Object[i81];
            int i82 = i14;
            int i83 = i79;
            int i84 = 0;
            int i85 = 0;
            while (i49 < length) {
                int i86 = i49 + 1;
                int charAt23 = m30441a.charAt(i49);
                if (charAt23 >= c11) {
                    int i87 = charAt23 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i46 = i88 + 1;
                        charAt14 = m30441a.charAt(i88);
                        if (charAt14 < c11) {
                            break;
                        }
                        i87 |= (charAt14 & 8191) << i89;
                        i89 += 13;
                        i88 = i46;
                    }
                    charAt23 = i87 | (charAt14 << i89);
                    i26 = i46;
                } else {
                    i26 = i86;
                }
                int i91 = i26 + 1;
                int charAt24 = m30441a.charAt(i26);
                if (charAt24 >= c11) {
                    int i92 = charAt24 & 8191;
                    int i93 = i91;
                    int i94 = 13;
                    while (true) {
                        i45 = i93 + 1;
                        charAt13 = m30441a.charAt(i93);
                        if (charAt13 < c11) {
                            break;
                        }
                        i92 |= (charAt13 & 8191) << i94;
                        i94 += 13;
                        i93 = i45;
                    }
                    charAt24 = i92 | (charAt13 << i94);
                    i27 = i45;
                } else {
                    i27 = i91;
                }
                if ((charAt24 & 1024) != 0) {
                    iArr[i84] = i85;
                    i84++;
                }
                int i95 = charAt24 & 255;
                int i96 = charAt24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                int i97 = length;
                if (i95 >= 51) {
                    int i98 = i27 + 1;
                    int charAt25 = m30441a.charAt(i27);
                    char c12 = 55296;
                    if (charAt25 >= 55296) {
                        int i99 = 13;
                        int i100 = charAt25 & 8191;
                        int i101 = i98;
                        while (true) {
                            i44 = i101 + 1;
                            charAt12 = m30441a.charAt(i101);
                            if (charAt12 < c12) {
                                break;
                            }
                            i100 |= (charAt12 & 8191) << i99;
                            i99 += 13;
                            i101 = i44;
                            c12 = 55296;
                        }
                        charAt25 = i100 | (charAt12 << i99);
                        i42 = i44;
                    } else {
                        i42 = i98;
                    }
                    int i102 = i42;
                    int i103 = i95 - 51;
                    i29 = i16;
                    if (i103 != 9 && i103 != 17) {
                        if (i103 == 12) {
                            if (c5829r22.zzc() != 1 && i96 == 0) {
                                i96 = 0;
                            } else {
                                i43 = i12 + 1;
                                int i104 = i85 / 3;
                                objArr[i104 + i104 + 1] = m30442b[i12];
                            }
                        }
                        int i105 = charAt25 + charAt25;
                        obj = m30442b[i105];
                        if (!(obj instanceof Field)) {
                            m30332L2 = (Field) obj;
                        } else {
                            m30332L2 = m30332L(cls2, (String) obj);
                            m30442b[i105] = m30332L2;
                        }
                        i28 = i13;
                        i35 = (int) unsafe.objectFieldOffset(m30332L2);
                        int i106 = i105 + 1;
                        obj2 = m30442b[i106];
                        if (!(obj2 instanceof Field)) {
                            m30332L3 = (Field) obj2;
                        } else {
                            m30332L3 = m30332L(cls2, (String) obj2);
                            m30442b[i106] = m30332L3;
                        }
                        c5829r2 = c5829r22;
                        str = m30441a;
                        i34 = i12;
                        i32 = i102;
                        i31 = (int) unsafe.objectFieldOffset(m30332L3);
                        i33 = 0;
                    } else {
                        i43 = i12 + 1;
                        int i107 = i85 / 3;
                        objArr[i107 + i107 + 1] = m30442b[i12];
                    }
                    i12 = i43;
                    int i1052 = charAt25 + charAt25;
                    obj = m30442b[i1052];
                    if (!(obj instanceof Field)) {
                    }
                    i28 = i13;
                    i35 = (int) unsafe.objectFieldOffset(m30332L2);
                    int i1062 = i1052 + 1;
                    obj2 = m30442b[i1062];
                    if (!(obj2 instanceof Field)) {
                    }
                    c5829r2 = c5829r22;
                    str = m30441a;
                    i34 = i12;
                    i32 = i102;
                    i31 = (int) unsafe.objectFieldOffset(m30332L3);
                    i33 = 0;
                } else {
                    i28 = i13;
                    i29 = i16;
                    int i108 = i12 + 1;
                    Field m30332L4 = m30332L(cls2, (String) m30442b[i12]);
                    if (i95 == 9 || i95 == 17) {
                        c5829r2 = c5829r22;
                        int i109 = i85 / 3;
                        objArr[i109 + i109 + 1] = m30332L4.getType();
                    } else {
                        if (i95 != 27) {
                            if (i95 == 49) {
                                i37 = i12 + 2;
                                c5829r2 = c5829r22;
                                i36 = 1;
                            } else if (i95 != 12 && i95 != 30 && i95 != 44) {
                                if (i95 == 50) {
                                    int i110 = i12 + 2;
                                    int i111 = i82 + 1;
                                    iArr[i82] = i85;
                                    int i112 = i85 / 3;
                                    int i113 = i112 + i112;
                                    objArr[i113] = m30442b[i108];
                                    if (i96 != 0) {
                                        i108 = i12 + 3;
                                        objArr[i113 + 1] = m30442b[i110];
                                        i82 = i111;
                                    } else {
                                        i108 = i110;
                                        i82 = i111;
                                        i96 = 0;
                                    }
                                }
                                c5829r2 = c5829r22;
                            } else {
                                c5829r2 = c5829r22;
                                if (c5829r22.zzc() != 1 && i96 == 0) {
                                    i96 = 0;
                                } else {
                                    i37 = i12 + 2;
                                    int i114 = i85 / 3;
                                    objArr[i114 + i114 + 1] = m30442b[i108];
                                    i108 = i37;
                                }
                            }
                        } else {
                            c5829r2 = c5829r22;
                            i36 = 1;
                            i37 = i12 + 2;
                        }
                        int i115 = i85 / 3;
                        objArr[i115 + i115 + i36] = m30442b[i108];
                        i108 = i37;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(m30332L4);
                    i31 = 1048575;
                    if ((charAt24 & 4096) != 0 && i95 <= 17) {
                        int i116 = i27 + 1;
                        int charAt26 = m30441a.charAt(i27);
                        if (charAt26 >= 55296) {
                            int i117 = charAt26 & 8191;
                            int i118 = 13;
                            while (true) {
                                i32 = i116 + 1;
                                charAt11 = m30441a.charAt(i116);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i117 |= (charAt11 & 8191) << i118;
                                i118 += 13;
                                i116 = i32;
                            }
                            charAt26 = i117 | (charAt11 << i118);
                        } else {
                            i32 = i116;
                        }
                        int i119 = i15 + i15 + (charAt26 / 32);
                        Object obj3 = m30442b[i119];
                        str = m30441a;
                        if (obj3 instanceof Field) {
                            m30332L = (Field) obj3;
                        } else {
                            m30332L = m30332L(cls2, (String) obj3);
                            m30442b[i119] = m30332L;
                        }
                        i33 = charAt26 % 32;
                        i31 = (int) unsafe.objectFieldOffset(m30332L);
                    } else {
                        str = m30441a;
                        i32 = i27;
                        i33 = 0;
                    }
                    if (i95 >= 18 && i95 <= 49) {
                        iArr[i83] = objectFieldOffset;
                        i83++;
                    }
                    i34 = i108;
                    i35 = objectFieldOffset;
                }
                int i120 = i85 + 1;
                iArr2[i85] = charAt23;
                int i121 = i85 + 2;
                if ((charAt24 & 512) != 0) {
                    i38 = 536870912;
                } else {
                    i38 = 0;
                }
                if ((charAt24 & 256) != 0) {
                    i39 = 268435456;
                } else {
                    i39 = 0;
                }
                if (i96 != 0) {
                    i41 = Integer.MIN_VALUE;
                } else {
                    i41 = 0;
                }
                iArr2[i120] = i35 | i39 | i38 | i41 | (i95 << 20);
                i85 += 3;
                iArr2[i121] = (i33 << 20) | i31;
                i12 = i34;
                i49 = i32;
                length = i97;
                c5829r22 = c5829r2;
                m30441a = str;
                i16 = i29;
                i13 = i28;
                c11 = 55296;
            }
            C5829r2 c5829r23 = c5829r22;
            return new C5793l2(iArr2, objArr, i13, i16, c5829r23.zza(), c5829r23.zzc(), false, iArr, i14, i79, c5805n2, abstractC5858w1, abstractC5865x2, abstractC5875z0, c5738c2);
        }
        AbstractC30228a.m149044a(interfaceC5751e2);
        throw null;
    }

    /* renamed from: y */
    private static double m30350y(Object obj, long j11) {
        return ((Double) AbstractC5770h3.m30258k(obj, j11)).doubleValue();
    }

    /* renamed from: z */
    private static float m30351z(Object obj, long j11) {
        return ((Float) AbstractC5770h3.m30258k(obj, j11)).floatValue();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: a */
    public final void mo30352a(Object obj) {
        if (m30344r(obj)) {
            if (obj instanceof AbstractC5774i1) {
                AbstractC5774i1 abstractC5774i1 = (AbstractC5774i1) obj;
                abstractC5774i1.m30289n(Integer.MAX_VALUE);
                abstractC5774i1.zza = 0;
                abstractC5774i1.m30288l();
            }
            int[] iArr = this.f33348a;
            for (int i11 = 0; i11 < iArr.length; i11 += 3) {
                int m30325E = m30325E(i11);
                int i12 = 1048575 & m30325E;
                int m30324D = m30324D(m30325E);
                long j11 = i12;
                if (m30324D != 9) {
                    if (m30324D != 60 && m30324D != 68) {
                        switch (m30324D) {
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
                                this.f33357j.mo30465a(obj, j11);
                                break;
                            case 50:
                                Unsafe unsafe = f33347p;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((C5731b2) object).m30178c();
                                    unsafe.putObject(obj, j11, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (m30345s(obj, this.f33348a[i11], i11)) {
                        m30328H(i11).mo30352a(f33347p.getObject(obj, j11));
                    }
                }
                if (m30341o(obj, i11)) {
                    m30328H(i11).mo30352a(f33347p.getObject(obj, j11));
                }
            }
            this.f33358k.mo30559g(obj);
            if (this.f33353f) {
                this.f33359l.mo30155b(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: b */
    public final void mo30353b(Object obj, Object obj2) {
        m30333g(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.f33348a.length; i11 += 3) {
            int m30325E = m30325E(i11);
            int i12 = 1048575 & m30325E;
            int[] iArr = this.f33348a;
            int m30324D = m30324D(m30325E);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (m30324D) {
                case 0:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30267t(obj, j11, AbstractC5770h3.m30253f(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30268u(obj, j11, AbstractC5770h3.m30254g(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30270w(obj, j11, AbstractC5770h3.m30256i(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30270w(obj, j11, AbstractC5770h3.m30256i(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30269v(obj, j11, AbstractC5770h3.m30255h(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30270w(obj, j11, AbstractC5770h3.m30256i(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30269v(obj, j11, AbstractC5770h3.m30255h(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30265r(obj, j11, AbstractC5770h3.m30244B(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30271x(obj, j11, AbstractC5770h3.m30258k(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m30334h(obj, obj2, i11);
                    break;
                case 10:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30271x(obj, j11, AbstractC5770h3.m30258k(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30269v(obj, j11, AbstractC5770h3.m30255h(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30269v(obj, j11, AbstractC5770h3.m30255h(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30269v(obj, j11, AbstractC5770h3.m30255h(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30270w(obj, j11, AbstractC5770h3.m30256i(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30269v(obj, j11, AbstractC5770h3.m30255h(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m30341o(obj2, i11)) {
                        AbstractC5770h3.m30270w(obj, j11, AbstractC5770h3.m30256i(obj2, j11));
                        m30336j(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m30334h(obj, obj2, i11);
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
                    this.f33357j.mo30466b(obj, obj2, j11);
                    break;
                case 50:
                    int i14 = AbstractC5847u2.f33438d;
                    AbstractC5770h3.m30271x(obj, j11, C5738c2.m30197a(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11)));
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
                    if (m30345s(obj2, i13, i11)) {
                        AbstractC5770h3.m30271x(obj, j11, AbstractC5770h3.m30258k(obj2, j11));
                        m30337k(obj, i13, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m30335i(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m30345s(obj2, i13, i11)) {
                        AbstractC5770h3.m30271x(obj, j11, AbstractC5770h3.m30258k(obj2, j11));
                        m30337k(obj, i13, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m30335i(obj, obj2, i11);
                    break;
            }
        }
        AbstractC5847u2.m30519v(this.f33358k, obj, obj2);
        if (!this.f33353f) {
            return;
        }
        this.f33359l.mo30154a(obj2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo30354c(Object obj, Object obj2) {
        boolean m30503f;
        for (int i11 = 0; i11 < this.f33348a.length; i11 += 3) {
            int m30325E = m30325E(i11);
            long j11 = m30325E & 1048575;
            switch (m30324D(m30325E)) {
                case 0:
                    if (m30340n(obj, obj2, i11) && Double.doubleToLongBits(AbstractC5770h3.m30253f(obj, j11)) == Double.doubleToLongBits(AbstractC5770h3.m30253f(obj2, j11))) {
                    }
                    return false;
                case 1:
                    if (m30340n(obj, obj2, i11) && Float.floatToIntBits(AbstractC5770h3.m30254g(obj, j11)) == Float.floatToIntBits(AbstractC5770h3.m30254g(obj2, j11))) {
                    }
                    return false;
                case 2:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30256i(obj, j11) == AbstractC5770h3.m30256i(obj2, j11)) {
                    }
                    return false;
                case 3:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30256i(obj, j11) == AbstractC5770h3.m30256i(obj2, j11)) {
                    }
                    return false;
                case 4:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30255h(obj, j11) == AbstractC5770h3.m30255h(obj2, j11)) {
                    }
                    return false;
                case 5:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30256i(obj, j11) == AbstractC5770h3.m30256i(obj2, j11)) {
                    }
                    return false;
                case 6:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30255h(obj, j11) == AbstractC5770h3.m30255h(obj2, j11)) {
                    }
                    return false;
                case 7:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30244B(obj, j11) == AbstractC5770h3.m30244B(obj2, j11)) {
                    }
                    return false;
                case 8:
                    if (m30340n(obj, obj2, i11) && AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11))) {
                    }
                    return false;
                case 9:
                    if (m30340n(obj, obj2, i11) && AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11))) {
                    }
                    return false;
                case 10:
                    if (m30340n(obj, obj2, i11) && AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11))) {
                    }
                    return false;
                case 11:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30255h(obj, j11) == AbstractC5770h3.m30255h(obj2, j11)) {
                    }
                    return false;
                case 12:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30255h(obj, j11) == AbstractC5770h3.m30255h(obj2, j11)) {
                    }
                    return false;
                case 13:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30255h(obj, j11) == AbstractC5770h3.m30255h(obj2, j11)) {
                    }
                    return false;
                case 14:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30256i(obj, j11) == AbstractC5770h3.m30256i(obj2, j11)) {
                    }
                    return false;
                case 15:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30255h(obj, j11) == AbstractC5770h3.m30255h(obj2, j11)) {
                    }
                    return false;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m30340n(obj, obj2, i11) && AbstractC5770h3.m30256i(obj, j11) == AbstractC5770h3.m30256i(obj2, j11)) {
                    }
                    return false;
                case 17:
                    if (m30340n(obj, obj2, i11) && AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11))) {
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
                    m30503f = AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11));
                    if (m30503f) {
                        return false;
                    }
                case 50:
                    m30503f = AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11));
                    if (m30503f) {
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
                    long m30322B = m30322B(i11) & 1048575;
                    if (AbstractC5770h3.m30255h(obj, m30322B) == AbstractC5770h3.m30255h(obj2, m30322B) && AbstractC5847u2.m30503f(AbstractC5770h3.m30258k(obj, j11), AbstractC5770h3.m30258k(obj2, j11))) {
                    }
                    return false;
                default:
            }
        }
        if (!this.f33358k.mo30556d(obj).equals(this.f33358k.mo30556d(obj2))) {
            return false;
        }
        if (!this.f33353f) {
            return true;
        }
        this.f33359l.mo30154a(obj);
        this.f33359l.mo30154a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: d */
    public final boolean mo30355d(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f33355h) {
            int[] iArr = this.f33354g;
            int[] iArr2 = this.f33348a;
            int i16 = iArr[i15];
            int i17 = iArr2[i16];
            int m30325E = m30325E(i16);
            int i18 = this.f33348a[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f33347p.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i13;
                i12 = i14;
            }
            if ((268435456 & m30325E) != 0 && !m30342p(obj, i16, i11, i12, i21)) {
                return false;
            }
            int m30324D = m30324D(m30325E);
            if (m30324D != 9 && m30324D != 17) {
                if (m30324D != 27) {
                    if (m30324D != 60 && m30324D != 68) {
                        if (m30324D != 49) {
                            if (m30324D == 50 && !((C5731b2) AbstractC5770h3.m30258k(obj, m30325E & 1048575)).isEmpty()) {
                                AbstractC30228a.m149044a(m30329I(i16));
                                throw null;
                            }
                        }
                    } else if (m30345s(obj, i17, i16) && !m30343q(obj, m30325E, m30328H(i16))) {
                        return false;
                    }
                }
                List list = (List) AbstractC5770h3.m30258k(obj, m30325E & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC5835s2 m30328H = m30328H(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!m30328H.mo30355d(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (m30342p(obj, i16, i11, i12, i21) && !m30343q(obj, m30325E, m30328H(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        if (!this.f33353f) {
            return true;
        }
        this.f33359l.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: e */
    public final void mo30356e(Object obj, InterfaceC5806n3 interfaceC5806n3) {
        int i11;
        int i12;
        int i13;
        if (!this.f33353f) {
            int[] iArr = this.f33348a;
            Unsafe unsafe = f33347p;
            int i14 = 1048575;
            int i15 = 1048575;
            int i16 = 0;
            int i17 = 0;
            while (i17 < iArr.length) {
                int m30325E = m30325E(i17);
                int[] iArr2 = this.f33348a;
                int m30324D = m30324D(m30325E);
                int i18 = iArr2[i17];
                if (m30324D <= 17) {
                    int i19 = iArr2[i17 + 2];
                    int i21 = i19 & i14;
                    if (i21 != i15) {
                        if (i21 == i14) {
                            i16 = 0;
                        } else {
                            i16 = unsafe.getInt(obj, i21);
                        }
                        i15 = i21;
                    }
                    i11 = i15;
                    i12 = i16;
                    i13 = 1 << (i19 >>> 20);
                } else {
                    i11 = i15;
                    i12 = i16;
                    i13 = 0;
                }
                long j11 = m30325E & i14;
                switch (m30324D) {
                    case 0:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30396i(i18, AbstractC5770h3.m30253f(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30413z(i18, AbstractC5770h3.m30254g(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30392e(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30383E(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30405r(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30388a(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30406s(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30390c(i18, AbstractC5770h3.m30244B(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            m30347u(i18, unsafe.getObject(obj, j11), interfaceC5806n3);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30386H(i18, unsafe.getObject(obj, j11), m30328H(i17));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30385G(i18, (AbstractC5803n0) unsafe.getObject(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30403p(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30410w(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30398k(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30407t(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30399l(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30402o(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m30342p(obj, i17, i11, i12, i13)) {
                            interfaceC5806n3.mo30387I(i18, unsafe.getObject(obj, j11), m30328H(i17));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        AbstractC5847u2.m30522y(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 19:
                        AbstractC5847u2.m30494C(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 20:
                        AbstractC5847u2.m30496E(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 21:
                        AbstractC5847u2.m30502e(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 22:
                        AbstractC5847u2.m30495D(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 23:
                        AbstractC5847u2.m30493B(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 24:
                        AbstractC5847u2.m30492A(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 25:
                        AbstractC5847u2.m30521x(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 26:
                        int i22 = this.f33348a[i17];
                        List list = (List) unsafe.getObject(obj, j11);
                        int i23 = AbstractC5847u2.f33438d;
                        if (list != null && !list.isEmpty()) {
                            interfaceC5806n3.mo30412y(i22, list);
                            break;
                        }
                        break;
                    case 27:
                        int i24 = this.f33348a[i17];
                        List list2 = (List) unsafe.getObject(obj, j11);
                        InterfaceC5835s2 m30328H = m30328H(i17);
                        int i25 = AbstractC5847u2.f33438d;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i26 = 0; i26 < list2.size(); i26++) {
                                ((C5851v0) interfaceC5806n3).mo30386H(i24, list2.get(i26), m30328H);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i27 = this.f33348a[i17];
                        List list3 = (List) unsafe.getObject(obj, j11);
                        int i28 = AbstractC5847u2.f33438d;
                        if (list3 != null && !list3.isEmpty()) {
                            interfaceC5806n3.mo30389b(i27, list3);
                            break;
                        }
                        break;
                    case 29:
                        AbstractC5847u2.m30501d(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        AbstractC5847u2.m30523z(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 31:
                        AbstractC5847u2.m30497F(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        AbstractC5847u2.m30498a(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 33:
                        AbstractC5847u2.m30499b(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 34:
                        AbstractC5847u2.m30500c(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, false);
                        break;
                    case 35:
                        AbstractC5847u2.m30522y(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 36:
                        AbstractC5847u2.m30494C(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 37:
                        AbstractC5847u2.m30496E(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 38:
                        AbstractC5847u2.m30502e(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 39:
                        AbstractC5847u2.m30495D(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 40:
                        AbstractC5847u2.m30493B(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        AbstractC5847u2.m30492A(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 42:
                        AbstractC5847u2.m30521x(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 43:
                        AbstractC5847u2.m30501d(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                        AbstractC5847u2.m30523z(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 45:
                        AbstractC5847u2.m30497F(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 46:
                        AbstractC5847u2.m30498a(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 47:
                        AbstractC5847u2.m30499b(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 48:
                        AbstractC5847u2.m30500c(this.f33348a[i17], (List) unsafe.getObject(obj, j11), interfaceC5806n3, true);
                        break;
                    case 49:
                        int i29 = this.f33348a[i17];
                        List list4 = (List) unsafe.getObject(obj, j11);
                        InterfaceC5835s2 m30328H2 = m30328H(i17);
                        int i31 = AbstractC5847u2.f33438d;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i32 = 0; i32 < list4.size(); i32++) {
                                ((C5851v0) interfaceC5806n3).mo30387I(i29, list4.get(i32), m30328H2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j11) != null) {
                            AbstractC30228a.m149044a(m30329I(i17));
                            throw null;
                        }
                        break;
                    case 51:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30396i(i18, m30350y(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30413z(i18, m30351z(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30392e(i18, m30326F(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30383E(i18, m30326F(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30405r(i18, m30321A(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30388a(i18, m30326F(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30406s(i18, m30321A(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30390c(i18, m30346t(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m30345s(obj, i18, i17)) {
                            m30347u(i18, unsafe.getObject(obj, j11), interfaceC5806n3);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30386H(i18, unsafe.getObject(obj, j11), m30328H(i17));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30385G(i18, (AbstractC5803n0) unsafe.getObject(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30403p(i18, m30321A(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30410w(i18, m30321A(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30398k(i18, m30321A(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30407t(i18, m30326F(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30399l(i18, m30321A(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30402o(i18, m30326F(obj, j11));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m30345s(obj, i18, i17)) {
                            interfaceC5806n3.mo30387I(i18, unsafe.getObject(obj, j11), m30328H(i17));
                            break;
                        } else {
                            break;
                        }
                }
                i17 += 3;
                i15 = i11;
                i16 = i12;
                i14 = 1048575;
            }
            AbstractC5865x2 abstractC5865x2 = this.f33358k;
            abstractC5865x2.mo30561i(abstractC5865x2.mo30556d(obj), interfaceC5806n3);
            return;
        }
        this.f33359l.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: f */
    public final void mo30357f(Object obj, byte[] bArr, int i11, int i12, C5729b0 c5729b0) {
        m30358v(obj, bArr, i11, i12, 0, c5729b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ce7, code lost:            if (r13 == 1048575) goto L1267;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0ce9, code lost:            r35.putInt(r7, r13, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0cef, code lost:            r2 = r0.f33355h;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0cf3, code lost:            if (r2 >= r0.f33356i) goto L1400;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0cf5, code lost:            r3 = r0.f33354g;        r4 = r0.f33348a;        r3 = r3[r2];        r4 = r4[r3];        r4 = com.google.android.gms.internal.play_billing.AbstractC5770h3.m30258k(r7, r0.m30325E(r3) & 1048575);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d07, code lost:            if (r4 != null) goto L1273;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d0e, code lost:            if (r0.m30327G(r3) != null) goto L1401;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d13, code lost:            r4 = (com.google.android.gms.internal.play_billing.C5731b2) r4;        p664y.AbstractC30228a.m149044a(r0.m30329I(r3));     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d1c, code lost:            throw null;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d10, code lost:            r2 = r2 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d1d, code lost:            if (r9 != 0) goto L1284;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d21, code lost:            if (r8 != r36) goto L1282;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d28, code lost:            throw com.google.android.gms.internal.play_billing.zzff.m30587e();     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d2f, code lost:            return r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d2b, code lost:            if (r8 > r36) goto L1288;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d2d, code lost:            if (r11 != r9) goto L1288;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d34, code lost:            throw com.google.android.gms.internal.play_billing.zzff.m30587e();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x0508. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x09bb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:511:0x00b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x094b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0c75 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0c89 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0059 A[SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m30358v(Object obj, byte[] bArr, int i11, int i12, int i13, C5729b0 c5729b0) {
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int m30323C;
        int i19;
        byte[] bArr2;
        C5729b0 c5729b02;
        int i21;
        int i22;
        int i23;
        int m30189g;
        C5869y0 c5869y0;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        byte[] bArr3;
        C5729b0 c5729b03;
        Unsafe unsafe2;
        int i31;
        int i32;
        int i33;
        int i34;
        int m30195m;
        int i35;
        Unsafe unsafe3;
        int i36;
        int i37;
        byte[] bArr4;
        int i38;
        int i39;
        Unsafe unsafe4;
        int m30190h;
        Unsafe unsafe5;
        int i41;
        int i42;
        int i43;
        int m30188f;
        byte[] bArr5;
        int i44;
        int m30192j;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i51;
        int m30193k;
        int i52;
        Unsafe unsafe6;
        byte[] bArr6;
        int i53;
        int m30183a;
        Unsafe unsafe7;
        byte[] bArr7;
        int i54;
        int m30190h2;
        C5793l2 c5793l2 = this;
        Object obj2 = obj;
        byte[] bArr8 = bArr;
        int i55 = i12;
        int i56 = i13;
        C5729b0 c5729b04 = c5729b0;
        m30333g(obj);
        Unsafe unsafe8 = f33347p;
        int i57 = 0;
        int i58 = i11;
        int i59 = -1;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 1048575;
        while (true) {
            if (i58 < i55) {
                int i65 = i58 + 1;
                byte b11 = bArr8[i58];
                if (b11 < 0) {
                    i16 = AbstractC5736c0.m30191i(b11, bArr8, i65, c5729b04);
                    i15 = c5729b04.f33237a;
                } else {
                    i15 = b11;
                    i16 = i65;
                }
                int i66 = i15 >>> 3;
                if (i66 > i59) {
                    m30323C = (i66 < c5793l2.f33350c || i66 > c5793l2.f33351d) ? -1 : c5793l2.m30323C(i66, i61 / 3);
                } else if (i66 < c5793l2.f33350c || i66 > c5793l2.f33351d) {
                    i17 = -1;
                    i18 = -1;
                    if (i18 != i17) {
                        unsafe = unsafe8;
                        i14 = i56;
                        i19 = i64;
                        bArr2 = bArr8;
                        i61 = 0;
                        c5729b02 = c5729b04;
                        i21 = i16;
                        i22 = i66;
                        i23 = i15;
                    } else {
                        int i67 = i15 & 7;
                        int[] iArr = c5793l2.f33348a;
                        int i68 = iArr[i18 + 1];
                        int m30324D = m30324D(i68);
                        long j11 = i68 & 1048575;
                        int i69 = i16;
                        if (m30324D <= 17) {
                            int i71 = iArr[i18 + 2];
                            int i72 = 1 << (i71 >>> 20);
                            int i73 = 1048575;
                            int i74 = i71 & 1048575;
                            if (i74 != i64) {
                                if (i64 != 1048575) {
                                    unsafe8.putInt(obj2, i64, i63);
                                    i73 = 1048575;
                                }
                                i63 = i74 == i73 ? 0 : unsafe8.getInt(obj2, i74);
                                i24 = i74;
                            } else {
                                i24 = i64;
                            }
                            switch (m30324D) {
                                case 0:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 1) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i31 = i28 + 8;
                                        i63 |= i72;
                                        AbstractC5770h3.m30267t(obj2, j11, Double.longBitsToDouble(AbstractC5736c0.m30196n(bArr3, i28)));
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = i31;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i75 = i29;
                                        bArr8 = bArr3;
                                        i62 = i75;
                                    }
                                case 1:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 5) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i31 = i28 + 4;
                                        i63 |= i72;
                                        AbstractC5770h3.m30268u(obj2, j11, Float.intBitsToFloat(AbstractC5736c0.m30184b(bArr3, i28)));
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = i31;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i752 = i29;
                                        bArr8 = bArr3;
                                        i62 = i752;
                                    }
                                case 2:
                                case 3:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 0) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        int m30193k2 = AbstractC5736c0.m30193k(bArr3, i28, c5729b03);
                                        unsafe2.putLong(obj, j11, c5729b03.f33238b);
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = m30193k2;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i7522 = i29;
                                        bArr8 = bArr3;
                                        i62 = i7522;
                                    }
                                case 4:
                                case 11:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 0) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        i31 = AbstractC5736c0.m30190h(bArr3, i28, c5729b03);
                                        unsafe2.putInt(obj2, j11, c5729b03.f33237a);
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = i31;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i75222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i75222;
                                    }
                                case 5:
                                case 14:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 1) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i32 = i28 + 8;
                                        i63 |= i72;
                                        unsafe2.putLong(obj, j11, AbstractC5736c0.m30196n(bArr3, i28));
                                        i55 = i12;
                                        i56 = i13;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i58 = i32;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i752222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i752222;
                                    }
                                case 6:
                                case 13:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 5) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i31 = i28 + 4;
                                        i63 |= i72;
                                        unsafe2.putInt(obj2, j11, AbstractC5736c0.m30184b(bArr3, i28));
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = i31;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i7522222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i7522222;
                                    }
                                case 7:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 0) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        i31 = AbstractC5736c0.m30193k(bArr3, i28, c5729b03);
                                        AbstractC5770h3.m30265r(obj2, j11, c5729b03.f33238b != 0);
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = i31;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i75222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i75222222;
                                    }
                                case 8:
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 2) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        if ((i68 & 536870912) != 0) {
                                            int i76 = i63 | i72;
                                            int m30190h3 = AbstractC5736c0.m30190h(bArr3, i28, c5729b03);
                                            int i77 = c5729b03.f33237a;
                                            if (i77 < 0) {
                                                throw zzff.m30586d();
                                            }
                                            if (i77 == 0) {
                                                c5729b03.f33239c = "";
                                                i33 = i76;
                                            } else {
                                                int i78 = AbstractC5800m3.f33367b;
                                                int length = bArr3.length;
                                                if ((((length - m30190h3) - i77) | m30190h3 | i77) >= 0) {
                                                    int i79 = m30190h3 + i77;
                                                    char[] cArr = new char[i77];
                                                    int i81 = 0;
                                                    while (m30190h3 < i79) {
                                                        byte b12 = bArr3[m30190h3];
                                                        if (AbstractC5776i3.m30295d(b12)) {
                                                            m30190h3++;
                                                            cArr[i81] = (char) b12;
                                                            i81++;
                                                        } else {
                                                            while (m30190h3 < i79) {
                                                                int i82 = m30190h3 + 1;
                                                                byte b13 = bArr3[m30190h3];
                                                                if (AbstractC5776i3.m30295d(b13)) {
                                                                    cArr[i81] = (char) b13;
                                                                    i81++;
                                                                    m30190h3 = i82;
                                                                    while (m30190h3 < i79) {
                                                                        byte b14 = bArr3[m30190h3];
                                                                        if (AbstractC5776i3.m30295d(b14)) {
                                                                            m30190h3++;
                                                                            cArr[i81] = (char) b14;
                                                                            i81++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i83 = i76;
                                                                    if (b13 < -32) {
                                                                        if (i82 < i79) {
                                                                            m30190h3 += 2;
                                                                            AbstractC5776i3.m30294c(b13, bArr3[i82], cArr, i81);
                                                                            i81++;
                                                                        } else {
                                                                            throw zzff.m30585c();
                                                                        }
                                                                    } else if (b13 < -16) {
                                                                        if (i82 < i79 - 1) {
                                                                            int i84 = m30190h3 + 2;
                                                                            m30190h3 += 3;
                                                                            AbstractC5776i3.m30293b(b13, bArr3[i82], bArr3[i84], cArr, i81);
                                                                            i76 = i83;
                                                                            i81++;
                                                                        } else {
                                                                            throw zzff.m30585c();
                                                                        }
                                                                    } else if (i82 < i79 - 2) {
                                                                        byte b15 = bArr3[i82];
                                                                        int i85 = m30190h3 + 3;
                                                                        byte b16 = bArr3[m30190h3 + 2];
                                                                        m30190h3 += 4;
                                                                        AbstractC5776i3.m30292a(b13, b15, b16, bArr3[i85], cArr, i81);
                                                                        i81 += 2;
                                                                    } else {
                                                                        throw zzff.m30585c();
                                                                    }
                                                                    i76 = i83;
                                                                }
                                                            }
                                                            i33 = i76;
                                                            c5729b03.f33239c = new String(cArr, 0, i81);
                                                            m30190h3 = i79;
                                                        }
                                                    }
                                                    while (m30190h3 < i79) {
                                                    }
                                                    i33 = i76;
                                                    c5729b03.f33239c = new String(cArr, 0, i81);
                                                    m30190h3 = i79;
                                                } else {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m30190h3), Integer.valueOf(i77)));
                                                }
                                            }
                                            i31 = m30190h3;
                                            i63 = i33;
                                        } else {
                                            i31 = AbstractC5736c0.m30190h(bArr3, i28, c5729b03);
                                            int i86 = c5729b03.f33237a;
                                            if (i86 < 0) {
                                                throw zzff.m30586d();
                                            }
                                            int i87 = i63 | i72;
                                            if (i86 == 0) {
                                                c5729b03.f33239c = "";
                                            } else {
                                                c5729b03.f33239c = new String(bArr3, i31, i86, AbstractC5804n1.f33376b);
                                                i31 += i86;
                                            }
                                            i63 = i87;
                                        }
                                        unsafe2.putObject(obj2, j11, c5729b03.f33239c);
                                        i55 = i12;
                                        i56 = i13;
                                        i58 = i31;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i752222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i752222222;
                                    }
                                    break;
                                case 9:
                                    i34 = i12;
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 2) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        Object m30330J = c5793l2.m30330J(obj2, i25);
                                        m30195m = AbstractC5736c0.m30195m(m30330J, c5793l2.m30328H(i25), bArr, i28, i12, c5729b0);
                                        c5793l2.m30338l(obj2, i25, m30330J);
                                        i56 = i13;
                                        i55 = i34;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        i58 = m30195m;
                                        int i7522222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i7522222222;
                                    }
                                case 10:
                                    i34 = i12;
                                    i56 = i13;
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 2) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        m30195m = AbstractC5736c0.m30183a(bArr3, i28, c5729b03);
                                        unsafe2.putObject(obj2, j11, c5729b03.f33239c);
                                        i55 = i34;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        i58 = m30195m;
                                        int i75222222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i75222222222;
                                    }
                                case 12:
                                    i56 = i13;
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 0) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        int m30190h4 = AbstractC5736c0.m30190h(bArr3, i28, c5729b03);
                                        int i88 = c5729b03.f33237a;
                                        i32 = m30190h4;
                                        InterfaceC5792l1 m30327G = c5793l2.m30327G(i25);
                                        if ((i68 & Integer.MIN_VALUE) != 0 && m30327G != null && !m30327G.mo30302a(i88)) {
                                            m30348w(obj).m30578j(i29, Long.valueOf(i88));
                                        } else {
                                            i63 |= i72;
                                            unsafe2.putInt(obj2, j11, i88);
                                        }
                                        i55 = i12;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i58 = i32;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i752222222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i752222222222;
                                    }
                                case 15:
                                    i34 = i12;
                                    i56 = i13;
                                    c5729b03 = c5729b04;
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    unsafe2 = unsafe8;
                                    i29 = i15;
                                    bArr3 = bArr;
                                    if (i67 != 0) {
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        m30195m = AbstractC5736c0.m30190h(bArr3, i28, c5729b03);
                                        unsafe2.putInt(obj2, j11, AbstractC5827r0.m30439a(c5729b03.f33237a));
                                        i55 = i34;
                                        unsafe8 = unsafe2;
                                        c5729b04 = c5729b03;
                                        i61 = i25;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        i58 = m30195m;
                                        int i7522222222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i7522222222222;
                                    }
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                    i25 = i18;
                                    i26 = i24;
                                    i27 = i66;
                                    i28 = i69;
                                    i29 = i15;
                                    if (i67 != 0) {
                                        bArr3 = bArr;
                                        c5729b03 = c5729b04;
                                        unsafe2 = unsafe8;
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        i63 |= i72;
                                        bArr3 = bArr;
                                        int m30193k3 = AbstractC5736c0.m30193k(bArr3, i28, c5729b04);
                                        unsafe8.putLong(obj, j11, AbstractC5827r0.m30440b(c5729b04.f33238b));
                                        i55 = i12;
                                        i56 = i13;
                                        unsafe8 = unsafe8;
                                        c5729b04 = c5729b04;
                                        i61 = i25;
                                        i58 = m30193k3;
                                        i59 = i27;
                                        i57 = 0;
                                        i64 = i26;
                                        int i75222222222222 = i29;
                                        bArr8 = bArr3;
                                        i62 = i75222222222222;
                                    }
                                default:
                                    if (i67 != 3) {
                                        i25 = i18;
                                        i26 = i24;
                                        i27 = i66;
                                        i28 = i69;
                                        i29 = i15;
                                        bArr3 = bArr;
                                        c5729b03 = c5729b04;
                                        unsafe2 = unsafe8;
                                        i19 = i26;
                                        i14 = i13;
                                        i21 = i28;
                                        unsafe = unsafe2;
                                        i61 = i25;
                                        i23 = i29;
                                        i22 = i27;
                                        c5729b02 = c5729b03;
                                        bArr2 = bArr3;
                                        break;
                                    } else {
                                        int i89 = i63 | i72;
                                        Object m30330J2 = c5793l2.m30330J(obj2, i18);
                                        int i91 = i18;
                                        i58 = AbstractC5736c0.m30194l(m30330J2, c5793l2.m30328H(i18), bArr, i69, i12, (i66 << 3) | 4, c5729b0);
                                        c5793l2.m30338l(obj2, i91, m30330J2);
                                        i64 = i24;
                                        i56 = i13;
                                        i63 = i89;
                                        i61 = i91;
                                        i62 = i15;
                                        i59 = i66;
                                        i57 = 0;
                                        bArr8 = bArr;
                                        i55 = i12;
                                    }
                            }
                        } else {
                            i19 = i64;
                            int i92 = i66;
                            C5729b0 c5729b05 = c5729b04;
                            int i93 = i15;
                            int i94 = i18;
                            Unsafe unsafe9 = unsafe8;
                            if (m30324D != 27) {
                                i36 = i94;
                                i37 = i69;
                                bArr4 = bArr;
                                i35 = i63;
                                if (m30324D > 49) {
                                    c5729b05 = c5729b05;
                                    i38 = i92;
                                    unsafe3 = unsafe9;
                                    if (m30324D != 50) {
                                        Unsafe unsafe10 = f33347p;
                                        long j12 = iArr[i36 + 2] & 1048575;
                                        switch (m30324D) {
                                            case 51:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 1) {
                                                    i51 = i48 + 8;
                                                    unsafe10.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(AbstractC5736c0.m30196n(bArr2, i48))));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    if (i51 == i48) {
                                                        i14 = i13;
                                                        i21 = i51;
                                                        i61 = i49;
                                                        i63 = i35;
                                                        break;
                                                    } else {
                                                        unsafe8 = unsafe;
                                                        i55 = i12;
                                                        i56 = i13;
                                                        i59 = i22;
                                                        i62 = i23;
                                                        c5729b04 = c5729b02;
                                                        i61 = i49;
                                                        i63 = i35;
                                                        i57 = 0;
                                                        i58 = i51;
                                                        bArr8 = bArr2;
                                                        i64 = i19;
                                                        break;
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                            case 52:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 5) {
                                                    i51 = i48 + 4;
                                                    unsafe10.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(AbstractC5736c0.m30184b(bArr2, i48))));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 0) {
                                                    m30193k = AbstractC5736c0.m30193k(bArr2, i48, c5729b02);
                                                    unsafe10.putObject(obj2, j11, Long.valueOf(c5729b02.f33238b));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    i51 = m30193k;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 0) {
                                                    i51 = AbstractC5736c0.m30190h(bArr2, i48, c5729b02);
                                                    unsafe10.putObject(obj2, j11, Integer.valueOf(c5729b02.f33237a));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 1) {
                                                    i51 = i48 + 8;
                                                    unsafe10.putObject(obj2, j11, Long.valueOf(AbstractC5736c0.m30196n(bArr2, i48)));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 5) {
                                                    i51 = i48 + 4;
                                                    unsafe10.putObject(obj2, j11, Integer.valueOf(AbstractC5736c0.m30184b(bArr2, i48)));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 58:
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 0) {
                                                    m30193k = AbstractC5736c0.m30193k(bArr2, i48, c5729b02);
                                                    unsafe10.putObject(obj2, j11, Boolean.valueOf(c5729b02.f33238b != 0));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    i51 = m30193k;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 59:
                                                i48 = i37;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                obj2 = obj;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                if (i67 == 2) {
                                                    int m30190h5 = AbstractC5736c0.m30190h(bArr2, i48, c5729b02);
                                                    int i95 = c5729b02.f33237a;
                                                    if (i95 == 0) {
                                                        i49 = i36;
                                                        unsafe10.putObject(obj2, j11, "");
                                                    } else {
                                                        i49 = i36;
                                                        int i96 = m30190h5 + i95;
                                                        if ((i68 & 536870912) != 0 && !AbstractC5800m3.m30366e(bArr2, m30190h5, i96)) {
                                                            throw zzff.m30585c();
                                                        }
                                                        unsafe10.putObject(obj2, j11, new String(bArr2, m30190h5, i95, AbstractC5804n1.f33376b));
                                                        m30190h5 = i96;
                                                    }
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    i51 = m30190h5;
                                                    if (i51 == i48) {
                                                    }
                                                } else {
                                                    i49 = i36;
                                                    i51 = i48;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                break;
                                            case 60:
                                                obj2 = obj;
                                                i48 = i37;
                                                i52 = i36;
                                                i22 = i38;
                                                i23 = i93;
                                                c5729b02 = c5729b05;
                                                if (i67 == 2) {
                                                    Object m30331K = c5793l2.m30331K(obj2, i22, i52);
                                                    bArr2 = bArr4;
                                                    unsafe = unsafe3;
                                                    i51 = AbstractC5736c0.m30195m(m30331K, c5793l2.m30328H(i52), bArr, i48, i12, c5729b0);
                                                    c5793l2.m30339m(obj2, i22, i52, m30331K);
                                                    i49 = i52;
                                                    i48 = i48;
                                                    if (i51 == i48) {
                                                    }
                                                } else {
                                                    bArr2 = bArr4;
                                                    unsafe = unsafe3;
                                                    i49 = i52;
                                                    i51 = i48;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                i48 = i37;
                                                unsafe6 = unsafe3;
                                                bArr6 = bArr4;
                                                i23 = i93;
                                                c5729b02 = c5729b05;
                                                obj2 = obj;
                                                i53 = i36;
                                                i22 = i38;
                                                if (i67 == 2) {
                                                    m30183a = AbstractC5736c0.m30183a(bArr6, i48, c5729b02);
                                                    unsafe10.putObject(obj2, j11, c5729b02.f33239c);
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    bArr2 = bArr6;
                                                    i51 = m30183a;
                                                    i49 = i53;
                                                    unsafe = unsafe6;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                bArr2 = bArr6;
                                                i49 = i53;
                                                unsafe = unsafe6;
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 63:
                                                i48 = i37;
                                                unsafe6 = unsafe3;
                                                bArr6 = bArr4;
                                                c5729b02 = c5729b05;
                                                obj2 = obj;
                                                i53 = i36;
                                                i22 = i38;
                                                if (i67 == 0) {
                                                    m30183a = AbstractC5736c0.m30190h(bArr6, i48, c5729b02);
                                                    int i97 = c5729b02.f33237a;
                                                    InterfaceC5792l1 m30327G2 = c5793l2.m30327G(i53);
                                                    if (m30327G2 != null && !m30327G2.mo30302a(i97)) {
                                                        i23 = i93;
                                                        m30348w(obj).m30578j(i23, Long.valueOf(i97));
                                                    } else {
                                                        i23 = i93;
                                                        unsafe10.putObject(obj2, j11, Integer.valueOf(i97));
                                                        unsafe10.putInt(obj2, j12, i22);
                                                    }
                                                    bArr2 = bArr6;
                                                    i51 = m30183a;
                                                    i49 = i53;
                                                    unsafe = unsafe6;
                                                    if (i51 == i48) {
                                                    }
                                                } else {
                                                    i23 = i93;
                                                    bArr2 = bArr6;
                                                    i49 = i53;
                                                    unsafe = unsafe6;
                                                    i51 = i48;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                break;
                                            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                i48 = i37;
                                                unsafe7 = unsafe3;
                                                bArr7 = bArr4;
                                                i54 = i93;
                                                c5729b02 = c5729b05;
                                                obj2 = obj;
                                                i52 = i36;
                                                i22 = i38;
                                                if (i67 == 0) {
                                                    m30190h2 = AbstractC5736c0.m30190h(bArr7, i48, c5729b02);
                                                    unsafe10.putObject(obj2, j11, Integer.valueOf(AbstractC5827r0.m30439a(c5729b02.f33237a)));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    bArr2 = bArr7;
                                                    i51 = m30190h2;
                                                    unsafe = unsafe7;
                                                    i23 = i54;
                                                    i49 = i52;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                bArr2 = bArr7;
                                                unsafe = unsafe7;
                                                i23 = i54;
                                                i49 = i52;
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                i48 = i37;
                                                unsafe7 = unsafe3;
                                                bArr7 = bArr4;
                                                i54 = i93;
                                                c5729b02 = c5729b05;
                                                obj2 = obj;
                                                i52 = i36;
                                                i22 = i38;
                                                if (i67 == 0) {
                                                    m30190h2 = AbstractC5736c0.m30193k(bArr7, i48, c5729b02);
                                                    unsafe10.putObject(obj2, j11, Long.valueOf(AbstractC5827r0.m30440b(c5729b02.f33238b)));
                                                    unsafe10.putInt(obj2, j12, i22);
                                                    bArr2 = bArr7;
                                                    i51 = m30190h2;
                                                    unsafe = unsafe7;
                                                    i23 = i54;
                                                    i49 = i52;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                bArr2 = bArr7;
                                                unsafe = unsafe7;
                                                i23 = i54;
                                                i49 = i52;
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                            case 68:
                                                if (i67 == 3) {
                                                    obj2 = obj;
                                                    Object m30331K2 = c5793l2.m30331K(obj2, i38, i36);
                                                    i52 = i36;
                                                    i48 = i37;
                                                    c5729b02 = c5729b05;
                                                    int m30194l = AbstractC5736c0.m30194l(m30331K2, c5793l2.m30328H(i36), bArr, i48, i12, (i93 & (-8)) | 4, c5729b0);
                                                    c5793l2.m30339m(obj2, i38, i52, m30331K2);
                                                    bArr2 = bArr4;
                                                    unsafe = unsafe3;
                                                    i51 = m30194l;
                                                    i23 = i93;
                                                    i22 = i38;
                                                    i49 = i52;
                                                    if (i51 == i48) {
                                                    }
                                                } else {
                                                    obj2 = obj;
                                                    c5729b02 = c5729b05;
                                                    i48 = i37;
                                                    unsafe = unsafe3;
                                                    bArr2 = bArr4;
                                                    i23 = i93;
                                                    i49 = i36;
                                                    i22 = i38;
                                                    i51 = i48;
                                                    if (i51 == i48) {
                                                    }
                                                }
                                                break;
                                            default:
                                                obj2 = obj;
                                                i48 = i37;
                                                i49 = i36;
                                                i22 = i38;
                                                unsafe = unsafe3;
                                                c5729b02 = c5729b05;
                                                bArr2 = bArr4;
                                                i23 = i93;
                                                i51 = i48;
                                                if (i51 == i48) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i67 == 2) {
                                            Unsafe unsafe11 = f33347p;
                                            Object m30329I = c5793l2.m30329I(i36);
                                            Object object = unsafe11.getObject(obj, j11);
                                            if (!((C5731b2) object).m30180f()) {
                                                C5731b2 m30177b = C5731b2.m30174a().m30177b();
                                                C5738c2.m30197a(m30177b, object);
                                                unsafe11.putObject(obj, j11, m30177b);
                                            }
                                            AbstractC30228a.m149044a(m30329I);
                                            throw null;
                                        }
                                        obj2 = obj;
                                        i14 = i13;
                                        i21 = i37;
                                        unsafe = unsafe3;
                                        i63 = i35;
                                        i61 = i36;
                                        i22 = i38;
                                    }
                                } else {
                                    long j13 = i68;
                                    Unsafe unsafe12 = f33347p;
                                    InterfaceC5798m1 interfaceC5798m1 = (InterfaceC5798m1) unsafe12.getObject(obj2, j11);
                                    if (!interfaceC5798m1.zzc()) {
                                        int size = interfaceC5798m1.size();
                                        interfaceC5798m1 = interfaceC5798m1.mo30360c(size == 0 ? 10 : size + size);
                                        unsafe12.putObject(obj2, j11, interfaceC5798m1);
                                    }
                                    InterfaceC5798m1 interfaceC5798m12 = interfaceC5798m1;
                                    switch (m30324D) {
                                        case 18:
                                        case 35:
                                            bArr4 = bArr;
                                            i39 = i12;
                                            c5729b05 = c5729b05;
                                            i59 = i92;
                                            unsafe4 = unsafe9;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30190h = AbstractC5736c0.m30190h(bArr4, i37, c5729b05);
                                                int i98 = c5729b05.f33237a + m30190h;
                                                if (m30190h < i98) {
                                                    Double.longBitsToDouble(AbstractC5736c0.m30196n(bArr4, m30190h));
                                                    throw null;
                                                }
                                                if (m30190h != i98) {
                                                    throw zzff.m30588g();
                                                }
                                                if (m30190h != i37) {
                                                    obj2 = obj;
                                                    i21 = m30190h;
                                                    i61 = i36;
                                                    i22 = i59;
                                                    unsafe = unsafe4;
                                                    i63 = i35;
                                                    i14 = i13;
                                                    break;
                                                } else {
                                                    i56 = i13;
                                                    i55 = i39;
                                                    i61 = i36;
                                                    unsafe8 = unsafe4;
                                                    c5729b04 = c5729b05;
                                                    i62 = i93;
                                                    i64 = i19;
                                                    i63 = i35;
                                                    i57 = 0;
                                                    obj2 = obj;
                                                    i58 = m30190h;
                                                    bArr8 = bArr4;
                                                    break;
                                                }
                                            } else {
                                                if (i67 == 1) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    Double.longBitsToDouble(AbstractC5736c0.m30196n(bArr4, i37));
                                                    throw null;
                                                }
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                        case 19:
                                        case 36:
                                            bArr4 = bArr;
                                            i39 = i12;
                                            c5729b05 = c5729b05;
                                            i59 = i92;
                                            unsafe4 = unsafe9;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30190h = AbstractC5736c0.m30190h(bArr4, i37, c5729b05);
                                                int i99 = c5729b05.f33237a + m30190h;
                                                if (m30190h < i99) {
                                                    Float.intBitsToFloat(AbstractC5736c0.m30184b(bArr4, m30190h));
                                                    throw null;
                                                }
                                                if (m30190h != i99) {
                                                    throw zzff.m30588g();
                                                }
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 5) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    Float.intBitsToFloat(AbstractC5736c0.m30184b(bArr4, i37));
                                                    throw null;
                                                }
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            bArr4 = bArr;
                                            i39 = i12;
                                            c5729b05 = c5729b05;
                                            i59 = i92;
                                            unsafe4 = unsafe9;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30190h = AbstractC5736c0.m30190h(bArr4, i37, c5729b05);
                                                int i100 = c5729b05.f33237a + m30190h;
                                                if (m30190h < i100) {
                                                    AbstractC5736c0.m30193k(bArr4, m30190h, c5729b05);
                                                    throw null;
                                                }
                                                if (m30190h != i100) {
                                                    throw zzff.m30588g();
                                                }
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 0) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    AbstractC5736c0.m30193k(bArr4, i37, c5729b05);
                                                    long j14 = c5729b05.f33238b;
                                                    throw null;
                                                }
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            bArr4 = bArr;
                                            unsafe5 = unsafe9;
                                            i39 = i12;
                                            i41 = i36;
                                            i42 = i37;
                                            c5729b05 = c5729b05;
                                            i43 = i92;
                                            if (i67 == 2) {
                                                m30188f = AbstractC5736c0.m30188f(bArr4, i42, interfaceC5798m12, c5729b05);
                                                unsafe4 = unsafe5;
                                                m30190h = m30188f;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 0) {
                                                    unsafe4 = unsafe5;
                                                    i37 = i42;
                                                    i36 = i41;
                                                    i59 = i43;
                                                    m30190h = AbstractC5736c0.m30192j(i93, bArr, i42, i12, interfaceC5798m12, c5729b0);
                                                    if (m30190h != i37) {
                                                    }
                                                }
                                                unsafe4 = unsafe5;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                        case 40:
                                        case 46:
                                            bArr4 = bArr;
                                            unsafe5 = unsafe9;
                                            i39 = i12;
                                            i41 = i36;
                                            i42 = i37;
                                            c5729b05 = c5729b05;
                                            i43 = i92;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30188f = AbstractC5736c0.m30190h(bArr4, i42, c5729b05);
                                                int i101 = c5729b05.f33237a + m30188f;
                                                if (m30188f < i101) {
                                                    AbstractC5736c0.m30196n(bArr4, m30188f);
                                                    throw null;
                                                }
                                                if (m30188f != i101) {
                                                    throw zzff.m30588g();
                                                }
                                                unsafe4 = unsafe5;
                                                m30190h = m30188f;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 1) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    AbstractC5736c0.m30196n(bArr4, i42);
                                                    throw null;
                                                }
                                                unsafe4 = unsafe5;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                        case 45:
                                            bArr4 = bArr;
                                            unsafe5 = unsafe9;
                                            i39 = i12;
                                            i41 = i36;
                                            i42 = i37;
                                            c5729b05 = c5729b05;
                                            i43 = i92;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30188f = AbstractC5736c0.m30190h(bArr4, i42, c5729b05);
                                                int i102 = c5729b05.f33237a + m30188f;
                                                if (m30188f < i102) {
                                                    AbstractC5736c0.m30184b(bArr4, m30188f);
                                                    throw null;
                                                }
                                                if (m30188f != i102) {
                                                    throw zzff.m30588g();
                                                }
                                                unsafe4 = unsafe5;
                                                m30190h = m30188f;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 5) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    AbstractC5736c0.m30184b(bArr4, i42);
                                                    throw null;
                                                }
                                                unsafe4 = unsafe5;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            bArr4 = bArr;
                                            unsafe5 = unsafe9;
                                            i39 = i12;
                                            i41 = i36;
                                            i42 = i37;
                                            c5729b05 = c5729b05;
                                            i43 = i92;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30188f = AbstractC5736c0.m30190h(bArr4, i42, c5729b05);
                                                int i103 = c5729b05.f33237a + m30188f;
                                                if (m30188f < i103) {
                                                    AbstractC5736c0.m30193k(bArr4, m30188f, c5729b05);
                                                    throw null;
                                                }
                                                if (m30188f != i103) {
                                                    throw zzff.m30588g();
                                                }
                                                unsafe4 = unsafe5;
                                                m30190h = m30188f;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 0) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    AbstractC5736c0.m30193k(bArr4, i42, c5729b05);
                                                    long j15 = c5729b05.f33238b;
                                                    throw null;
                                                }
                                                unsafe4 = unsafe5;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            unsafe5 = unsafe9;
                                            i39 = i12;
                                            i41 = i36;
                                            i42 = i37;
                                            i43 = i92;
                                            bArr4 = bArr;
                                            c5729b05 = c5729b05;
                                            if (i67 == 2) {
                                                if ((j13 & 536870912) == 0) {
                                                    m30188f = AbstractC5736c0.m30190h(bArr4, i42, c5729b05);
                                                    int i104 = c5729b05.f33237a;
                                                    if (i104 < 0) {
                                                        throw zzff.m30586d();
                                                    }
                                                    if (i104 == 0) {
                                                        interfaceC5798m12.add("");
                                                    } else {
                                                        interfaceC5798m12.add(new String(bArr4, m30188f, i104, AbstractC5804n1.f33376b));
                                                        m30188f += i104;
                                                    }
                                                    while (m30188f < i39) {
                                                        int m30190h6 = AbstractC5736c0.m30190h(bArr4, m30188f, c5729b05);
                                                        if (i93 == c5729b05.f33237a) {
                                                            m30188f = AbstractC5736c0.m30190h(bArr4, m30190h6, c5729b05);
                                                            int i105 = c5729b05.f33237a;
                                                            if (i105 < 0) {
                                                                throw zzff.m30586d();
                                                            }
                                                            if (i105 == 0) {
                                                                interfaceC5798m12.add("");
                                                            } else {
                                                                interfaceC5798m12.add(new String(bArr4, m30188f, i105, AbstractC5804n1.f33376b));
                                                                m30188f += i105;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    m30188f = AbstractC5736c0.m30190h(bArr4, i42, c5729b05);
                                                    int i106 = c5729b05.f33237a;
                                                    if (i106 < 0) {
                                                        throw zzff.m30586d();
                                                    }
                                                    if (i106 == 0) {
                                                        interfaceC5798m12.add("");
                                                    } else {
                                                        int i107 = m30188f + i106;
                                                        if (AbstractC5800m3.m30366e(bArr4, m30188f, i107)) {
                                                            interfaceC5798m12.add(new String(bArr4, m30188f, i106, AbstractC5804n1.f33376b));
                                                            m30188f = i107;
                                                        } else {
                                                            throw zzff.m30585c();
                                                        }
                                                    }
                                                    while (m30188f < i39) {
                                                        int m30190h7 = AbstractC5736c0.m30190h(bArr4, m30188f, c5729b05);
                                                        if (i93 == c5729b05.f33237a) {
                                                            m30188f = AbstractC5736c0.m30190h(bArr4, m30190h7, c5729b05);
                                                            int i108 = c5729b05.f33237a;
                                                            if (i108 < 0) {
                                                                throw zzff.m30586d();
                                                            }
                                                            if (i108 == 0) {
                                                                interfaceC5798m12.add("");
                                                            } else {
                                                                int i109 = m30188f + i108;
                                                                if (AbstractC5800m3.m30366e(bArr4, m30188f, i109)) {
                                                                    interfaceC5798m12.add(new String(bArr4, m30188f, i108, AbstractC5804n1.f33376b));
                                                                    m30188f = i109;
                                                                } else {
                                                                    throw zzff.m30585c();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                unsafe4 = unsafe5;
                                                m30190h = m30188f;
                                                i37 = i42;
                                                i36 = i41;
                                                i59 = i43;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            i37 = i42;
                                            i36 = i41;
                                            i59 = i43;
                                            m30190h = i37;
                                            if (m30190h != i37) {
                                            }
                                            break;
                                        case 27:
                                            bArr5 = bArr;
                                            if (i67 == 2) {
                                                c5793l2 = this;
                                                i39 = i12;
                                                int m30187e = AbstractC5736c0.m30187e(c5793l2.m30328H(i36), i93, bArr, i37, i12, interfaceC5798m12, c5729b0);
                                                unsafe4 = unsafe9;
                                                bArr4 = bArr;
                                                i37 = i37;
                                                i59 = i92;
                                                c5729b05 = c5729b05;
                                                m30190h = m30187e;
                                                i36 = i36;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                i39 = i12;
                                                c5793l2 = this;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            bArr5 = bArr;
                                            if (i67 == 2) {
                                                m30190h = AbstractC5736c0.m30190h(bArr5, i37, c5729b05);
                                                int i110 = c5729b05.f33237a;
                                                if (i110 >= 0) {
                                                    if (i110 > bArr5.length - m30190h) {
                                                        throw zzff.m30588g();
                                                    }
                                                    if (i110 == 0) {
                                                        interfaceC5798m12.add(AbstractC5803n0.f33371q);
                                                    } else {
                                                        interfaceC5798m12.add(AbstractC5803n0.m30372s(bArr5, m30190h, i110));
                                                        m30190h += i110;
                                                    }
                                                    while (m30190h < i12) {
                                                        int m30190h8 = AbstractC5736c0.m30190h(bArr5, m30190h, c5729b05);
                                                        if (i93 == c5729b05.f33237a) {
                                                            m30190h = AbstractC5736c0.m30190h(bArr5, m30190h8, c5729b05);
                                                            int i111 = c5729b05.f33237a;
                                                            if (i111 >= 0) {
                                                                if (i111 > bArr5.length - m30190h) {
                                                                    throw zzff.m30588g();
                                                                }
                                                                if (i111 == 0) {
                                                                    interfaceC5798m12.add(AbstractC5803n0.f33371q);
                                                                } else {
                                                                    interfaceC5798m12.add(AbstractC5803n0.m30372s(bArr5, m30190h, i111));
                                                                    m30190h += i111;
                                                                }
                                                            } else {
                                                                throw zzff.m30586d();
                                                            }
                                                        } else {
                                                            i59 = i92;
                                                            i39 = i12;
                                                            c5793l2 = this;
                                                            bArr4 = bArr5;
                                                            c5729b05 = c5729b05;
                                                            unsafe4 = unsafe9;
                                                            if (m30190h != i37) {
                                                            }
                                                        }
                                                    }
                                                    i59 = i92;
                                                    i39 = i12;
                                                    c5793l2 = this;
                                                    bArr4 = bArr5;
                                                    c5729b05 = c5729b05;
                                                    unsafe4 = unsafe9;
                                                    if (m30190h != i37) {
                                                    }
                                                } else {
                                                    throw zzff.m30586d();
                                                }
                                            } else {
                                                i59 = i92;
                                                i39 = i12;
                                                c5793l2 = this;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                            bArr5 = bArr;
                                            i44 = i12;
                                            if (i67 == 2) {
                                                m30192j = AbstractC5736c0.m30188f(bArr5, i37, interfaceC5798m12, c5729b05);
                                            } else if (i67 == 0) {
                                                m30192j = AbstractC5736c0.m30192j(i93, bArr, i37, i12, interfaceC5798m12, c5729b0);
                                            } else {
                                                c5793l2 = this;
                                                i39 = i44;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            InterfaceC5792l1 m30327G3 = c5793l2.m30327G(i36);
                                            AbstractC5865x2 abstractC5865x2 = c5793l2.f33358k;
                                            int i112 = AbstractC5847u2.f33438d;
                                            if (m30327G3 == null) {
                                                i45 = m30192j;
                                                i46 = i92;
                                            } else if (interfaceC5798m12 instanceof RandomAccess) {
                                                int size2 = interfaceC5798m12.size();
                                                Object obj3 = null;
                                                int i113 = 0;
                                                int i114 = 0;
                                                while (i113 < size2) {
                                                    int i115 = m30192j;
                                                    int intValue = ((Integer) interfaceC5798m12.get(i113)).intValue();
                                                    if (m30327G3.mo30302a(intValue)) {
                                                        if (i113 != i114) {
                                                            interfaceC5798m12.set(i114, Integer.valueOf(intValue));
                                                        }
                                                        i114++;
                                                        i47 = i92;
                                                    } else {
                                                        i47 = i92;
                                                        obj3 = AbstractC5847u2.m30518u(obj2, i47, intValue, obj3, abstractC5865x2);
                                                    }
                                                    i113++;
                                                    i92 = i47;
                                                    m30192j = i115;
                                                }
                                                i45 = m30192j;
                                                i46 = i92;
                                                if (i114 != size2) {
                                                    interfaceC5798m12.subList(i114, size2).clear();
                                                }
                                            } else {
                                                i45 = m30192j;
                                                i46 = i92;
                                                Iterator it = interfaceC5798m12.iterator();
                                                Object obj4 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!m30327G3.mo30302a(intValue2)) {
                                                        obj4 = AbstractC5847u2.m30518u(obj2, i46, intValue2, obj4, abstractC5865x2);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i59 = i46;
                                            i39 = i44;
                                            m30190h = i45;
                                            c5793l2 = this;
                                            bArr4 = bArr5;
                                            c5729b05 = c5729b05;
                                            unsafe4 = unsafe9;
                                            if (m30190h != i37) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr5 = bArr;
                                            i44 = i12;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30190h = AbstractC5736c0.m30190h(bArr5, i37, c5729b05);
                                                int i116 = c5729b05.f33237a + m30190h;
                                                if (m30190h < i116) {
                                                    AbstractC5736c0.m30190h(bArr5, m30190h, c5729b05);
                                                    AbstractC5827r0.m30439a(c5729b05.f33237a);
                                                    throw null;
                                                }
                                                if (m30190h != i116) {
                                                    throw zzff.m30588g();
                                                }
                                                i39 = i44;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 0) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    AbstractC5736c0.m30190h(bArr5, i37, c5729b05);
                                                    AbstractC5827r0.m30439a(c5729b05.f33237a);
                                                    throw null;
                                                }
                                                i39 = i44;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr5 = bArr;
                                            i44 = i12;
                                            if (i67 == 2) {
                                                AbstractC30228a.m149044a(interfaceC5798m12);
                                                m30190h = AbstractC5736c0.m30190h(bArr5, i37, c5729b05);
                                                int i117 = c5729b05.f33237a + m30190h;
                                                if (m30190h < i117) {
                                                    AbstractC5736c0.m30193k(bArr5, m30190h, c5729b05);
                                                    AbstractC5827r0.m30440b(c5729b05.f33238b);
                                                    throw null;
                                                }
                                                if (m30190h != i117) {
                                                    throw zzff.m30588g();
                                                }
                                                i39 = i44;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                if (i67 == 0) {
                                                    AbstractC30228a.m149044a(interfaceC5798m12);
                                                    AbstractC5736c0.m30193k(bArr5, i37, c5729b05);
                                                    AbstractC5827r0.m30440b(c5729b05.f33238b);
                                                    throw null;
                                                }
                                                i39 = i44;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                        default:
                                            if (i67 == 3) {
                                                int i118 = (i93 & (-8)) | 4;
                                                InterfaceC5835s2 m30328H = c5793l2.m30328H(i36);
                                                m30190h = AbstractC5736c0.m30185c(m30328H, bArr, i37, i12, i118, c5729b0);
                                                interfaceC5798m12.add(c5729b05.f33239c);
                                                i44 = i12;
                                                while (true) {
                                                    if (m30190h < i44) {
                                                        int m30190h9 = AbstractC5736c0.m30190h(bArr, m30190h, c5729b05);
                                                        if (i93 == c5729b05.f33237a) {
                                                            m30190h = AbstractC5736c0.m30185c(m30328H, bArr, m30190h9, i12, i118, c5729b0);
                                                            interfaceC5798m12.add(c5729b05.f33239c);
                                                            m30328H = m30328H;
                                                        } else {
                                                            bArr5 = bArr;
                                                        }
                                                    } else {
                                                        bArr5 = bArr;
                                                    }
                                                }
                                                i39 = i44;
                                                i59 = i92;
                                                bArr4 = bArr5;
                                                c5729b05 = c5729b05;
                                                unsafe4 = unsafe9;
                                                if (m30190h != i37) {
                                                }
                                            } else {
                                                bArr4 = bArr;
                                                i39 = i12;
                                                c5729b05 = c5729b05;
                                                i59 = i92;
                                                unsafe4 = unsafe9;
                                                m30190h = i37;
                                                if (m30190h != i37) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (i67 == 2) {
                                InterfaceC5798m1 interfaceC5798m13 = (InterfaceC5798m1) unsafe9.getObject(obj2, j11);
                                if (!interfaceC5798m13.zzc()) {
                                    int size3 = interfaceC5798m13.size();
                                    interfaceC5798m13 = interfaceC5798m13.mo30360c(size3 == 0 ? 10 : size3 + size3);
                                    unsafe9.putObject(obj2, j11, interfaceC5798m13);
                                }
                                unsafe8 = unsafe9;
                                i58 = AbstractC5736c0.m30187e(c5793l2.m30328H(i94), i93, bArr, i69, i12, interfaceC5798m13, c5729b0);
                                i61 = i94;
                                c5729b04 = c5729b05;
                                i62 = i93;
                                i64 = i19;
                                i63 = i63;
                                i59 = i92;
                                i56 = i13;
                                bArr8 = bArr;
                                i55 = i12;
                                i57 = 0;
                            } else {
                                i35 = i63;
                                unsafe3 = unsafe9;
                                i36 = i94;
                                i37 = i69;
                                bArr4 = bArr;
                                i38 = i92;
                                i14 = i13;
                                i21 = i37;
                                unsafe = unsafe3;
                                i63 = i35;
                                i61 = i36;
                                i22 = i38;
                            }
                            c5729b02 = c5729b05;
                            bArr2 = bArr4;
                            i23 = i93;
                        }
                    }
                    if (i23 == i14 || i14 == 0) {
                        if (!c5793l2.f33353f && (c5869y0 = c5729b02.f33240d) != C5869y0.f33449c) {
                            c5869y0.m30567b(c5793l2.f33352e, i22);
                            m30189g = AbstractC5736c0.m30189g(i23, bArr, i21, i12, m30348w(obj), c5729b0);
                        } else {
                            m30189g = AbstractC5736c0.m30189g(i23, bArr, i21, i12, m30348w(obj), c5729b0);
                        }
                        unsafe8 = unsafe;
                        i55 = i12;
                        i56 = i14;
                        i62 = i23;
                        c5729b04 = c5729b02;
                        i57 = 0;
                        i59 = i22;
                        bArr8 = bArr2;
                        i64 = i19;
                        i58 = m30189g;
                    } else {
                        i58 = i21;
                        i62 = i23;
                        i64 = i19;
                    }
                } else {
                    m30323C = c5793l2.m30323C(i66, i57);
                }
                i18 = m30323C;
                i17 = -1;
                if (i18 != i17) {
                }
                if (i23 == i14) {
                }
                if (!c5793l2.f33353f) {
                }
                m30189g = AbstractC5736c0.m30189g(i23, bArr, i21, i12, m30348w(obj), c5729b0);
                unsafe8 = unsafe;
                i55 = i12;
                i56 = i14;
                i62 = i23;
                c5729b04 = c5729b02;
                i57 = 0;
                i59 = i22;
                bArr8 = bArr2;
                i64 = i19;
                i58 = m30189g;
            } else {
                unsafe = unsafe8;
                i14 = i56;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0057. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    public final int zza(Object obj) {
        int i11;
        int i12;
        int i13;
        int m30488y;
        int m30488y2;
        int m30489z;
        int m30488y3;
        int m30488y4;
        int m30488y5;
        int m30488y6;
        int m30511n;
        int m30510m;
        int size;
        int m30488y7;
        int m30488y8;
        int m30488y9;
        int m30508k;
        int m30488y10;
        int m30488y11;
        int i14;
        Unsafe unsafe = f33347p;
        boolean z11 = false;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f33348a.length) {
            int m30325E = m30325E(i18);
            int m30324D = m30324D(m30325E);
            int[] iArr = this.f33348a;
            int i21 = iArr[i18];
            int i22 = iArr[i18 + 2];
            int i23 = i22 & i15;
            if (m30324D <= 17) {
                if (i23 != i16) {
                    if (i23 == i15) {
                        i17 = 0;
                    } else {
                        i17 = unsafe.getInt(obj, i23);
                    }
                    i16 = i23;
                }
                i13 = 1 << (i22 >>> 20);
                i11 = i16;
                i12 = i17;
            } else {
                i11 = i16;
                i12 = i17;
                i13 = 0;
            }
            int i24 = m30325E & i15;
            if (m30324D >= EnumC5744d1.f33277b0.m30201b()) {
                EnumC5744d1.f33290o0.m30201b();
            }
            long j11 = i24;
            switch (m30324D) {
                case 0:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y + 8;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 1:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y2 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y2 + 4;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 2:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30489z = AbstractC5845u0.m30489z(unsafe.getLong(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 3:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30489z = AbstractC5845u0.m30489z(unsafe.getLong(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 4:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30489z = AbstractC5845u0.m30485v(unsafe.getInt(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 5:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y + 8;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 6:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y2 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y2 + 4;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 7:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y4 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y4 + 1;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 8:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        int i25 = i21 << 3;
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof AbstractC5803n0) {
                            int i26 = AbstractC5845u0.f33433d;
                            int mo30241g = ((AbstractC5803n0) object).mo30241g();
                            m30488y5 = AbstractC5845u0.m30488y(mo30241g) + mo30241g;
                            m30488y6 = AbstractC5845u0.m30488y(i25);
                            m30511n = m30488y6 + m30488y5;
                            i19 += m30511n;
                            i18 += 3;
                            i16 = i11;
                            i17 = i12;
                            z11 = false;
                            i15 = 1048575;
                        } else {
                            m30489z = AbstractC5845u0.m30487x((String) object);
                            m30488y3 = AbstractC5845u0.m30488y(i25);
                            m30511n = m30488y3 + m30489z;
                            i19 += m30511n;
                            i18 += 3;
                            i16 = i11;
                            i17 = i12;
                            z11 = false;
                            i15 = 1048575;
                        }
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 9:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30511n = AbstractC5847u2.m30511n(i21, unsafe.getObject(obj, j11), m30328H(i18));
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 10:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        AbstractC5803n0 abstractC5803n0 = (AbstractC5803n0) unsafe.getObject(obj, j11);
                        int i27 = AbstractC5845u0.f33433d;
                        int mo30241g2 = abstractC5803n0.mo30241g();
                        m30488y5 = AbstractC5845u0.m30488y(mo30241g2) + mo30241g2;
                        m30488y6 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y6 + m30488y5;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 11:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30489z = AbstractC5845u0.m30488y(unsafe.getInt(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 12:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30489z = AbstractC5845u0.m30485v(unsafe.getInt(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 13:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y2 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y2 + 4;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 14:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30488y = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y + 8;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 15:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        int i28 = unsafe.getInt(obj, j11);
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = AbstractC5845u0.m30488y((i28 >> 31) ^ (i28 + i28));
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        long j12 = unsafe.getLong(obj, j11);
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = AbstractC5845u0.m30489z((j12 >> 63) ^ (j12 + j12));
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 17:
                    if (m30342p(obj, i18, i11, i12, i13)) {
                        m30511n = AbstractC5845u0.m30484u(i21, (InterfaceC5775i2) unsafe.getObject(obj, j11), m30328H(i18));
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 18:
                    m30511n = AbstractC5847u2.m30507j(i21, (List) unsafe.getObject(obj, j11), z11);
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 19:
                    m30511n = AbstractC5847u2.m30505h(i21, (List) unsafe.getObject(obj, j11), z11);
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j11);
                    int i29 = AbstractC5847u2.f33438d;
                    if (list.size() != 0) {
                        m30510m = AbstractC5847u2.m30510m(list) + (list.size() * AbstractC5845u0.m30488y(i21 << 3));
                        i19 += m30510m;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30510m = 0;
                    i19 += m30510m;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j11);
                    int i31 = AbstractC5847u2.f33438d;
                    size = list2.size();
                    if (size != 0) {
                        m30488y3 = AbstractC5847u2.m30515r(list2);
                        m30488y7 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = size * m30488y7;
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i32 = AbstractC5847u2.f33438d;
                    size = list3.size();
                    if (size != 0) {
                        m30488y3 = AbstractC5847u2.m30509l(list3);
                        m30488y7 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = size * m30488y7;
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 23:
                    m30511n = AbstractC5847u2.m30507j(i21, (List) unsafe.getObject(obj, j11), z11);
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 24:
                    m30511n = AbstractC5847u2.m30505h(i21, (List) unsafe.getObject(obj, j11), z11);
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j11);
                    int i33 = AbstractC5847u2.f33438d;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        m30511n = size2 * (AbstractC5845u0.m30488y(i21 << 3) + 1);
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j11);
                    int i34 = AbstractC5847u2.f33438d;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z12 = list5 instanceof InterfaceC5822q1;
                        m30510m = AbstractC5845u0.m30488y(i21 << 3) * size3;
                        if (z12) {
                            InterfaceC5822q1 interfaceC5822q1 = (InterfaceC5822q1) list5;
                            for (int i35 = 0; i35 < size3; i35++) {
                                Object zzf = interfaceC5822q1.zzf(i35);
                                if (zzf instanceof AbstractC5803n0) {
                                    int mo30241g3 = ((AbstractC5803n0) zzf).mo30241g();
                                    m30510m += AbstractC5845u0.m30488y(mo30241g3) + mo30241g3;
                                } else {
                                    m30510m += AbstractC5845u0.m30487x((String) zzf);
                                }
                            }
                        } else {
                            for (int i36 = 0; i36 < size3; i36++) {
                                Object obj2 = list5.get(i36);
                                if (obj2 instanceof AbstractC5803n0) {
                                    int mo30241g4 = ((AbstractC5803n0) obj2).mo30241g();
                                    m30510m += AbstractC5845u0.m30488y(mo30241g4) + mo30241g4;
                                } else {
                                    m30510m += AbstractC5845u0.m30487x((String) obj2);
                                }
                            }
                        }
                        i19 += m30510m;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30510m = 0;
                    i19 += m30510m;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j11);
                    InterfaceC5835s2 m30328H = m30328H(i18);
                    int i37 = AbstractC5847u2.f33438d;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        m30488y8 = 0;
                    } else {
                        m30488y8 = AbstractC5845u0.m30488y(i21 << 3) * size4;
                        for (int i38 = 0; i38 < size4; i38++) {
                            m30488y8 += AbstractC5845u0.m30486w((InterfaceC5775i2) list6.get(i38), m30328H);
                        }
                    }
                    i19 += m30488y8;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j11);
                    int i39 = AbstractC5847u2.f33438d;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        m30488y9 = 0;
                    } else {
                        m30488y9 = size5 * AbstractC5845u0.m30488y(i21 << 3);
                        for (int i41 = 0; i41 < list7.size(); i41++) {
                            int mo30241g5 = ((AbstractC5803n0) list7.get(i41)).mo30241g();
                            m30488y9 += AbstractC5845u0.m30488y(mo30241g5) + mo30241g5;
                        }
                    }
                    i19 += m30488y9;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j11);
                    int i42 = AbstractC5847u2.f33438d;
                    size = list8.size();
                    if (size != 0) {
                        m30488y3 = AbstractC5847u2.m30514q(list8);
                        m30488y7 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = size * m30488y7;
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    List list9 = (List) unsafe.getObject(obj, j11);
                    int i43 = AbstractC5847u2.f33438d;
                    size = list9.size();
                    if (size != 0) {
                        m30488y3 = AbstractC5847u2.m30504g(list9);
                        m30488y7 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = size * m30488y7;
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 31:
                    m30511n = AbstractC5847u2.m30505h(i21, (List) unsafe.getObject(obj, j11), z11);
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    m30511n = AbstractC5847u2.m30507j(i21, (List) unsafe.getObject(obj, j11), z11);
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j11);
                    int i44 = AbstractC5847u2.f33438d;
                    size = list10.size();
                    if (size != 0) {
                        m30488y3 = AbstractC5847u2.m30512o(list10);
                        m30488y7 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = size * m30488y7;
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j11);
                    int i45 = AbstractC5847u2.f33438d;
                    size = list11.size();
                    if (size != 0) {
                        m30488y3 = AbstractC5847u2.m30513p(list11);
                        m30488y7 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = size * m30488y7;
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                    m30511n = 0;
                    i19 += m30511n;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 35:
                    m30508k = AbstractC5847u2.m30508k((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 36:
                    m30508k = AbstractC5847u2.m30506i((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 37:
                    m30508k = AbstractC5847u2.m30510m((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 38:
                    m30508k = AbstractC5847u2.m30515r((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 39:
                    m30508k = AbstractC5847u2.m30509l((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 40:
                    m30508k = AbstractC5847u2.m30508k((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    m30508k = AbstractC5847u2.m30506i((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j11);
                    int i46 = AbstractC5847u2.f33438d;
                    m30508k = list12.size();
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 43:
                    m30508k = AbstractC5847u2.m30514q((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    m30508k = AbstractC5847u2.m30504g((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 45:
                    m30508k = AbstractC5847u2.m30506i((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 46:
                    m30508k = AbstractC5847u2.m30508k((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 47:
                    m30508k = AbstractC5847u2.m30512o((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 48:
                    m30508k = AbstractC5847u2.m30513p((List) unsafe.getObject(obj, j11));
                    if (m30508k > 0) {
                        m30488y10 = AbstractC5845u0.m30488y(m30508k);
                        m30488y11 = AbstractC5845u0.m30488y(i21 << 3);
                        m30488y9 = m30488y11 + m30488y10 + m30508k;
                        i19 += m30488y9;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j11);
                    InterfaceC5835s2 m30328H2 = m30328H(i18);
                    int i47 = AbstractC5847u2.f33438d;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        for (int i48 = 0; i48 < size6; i48++) {
                            i14 += AbstractC5845u0.m30484u(i21, (InterfaceC5775i2) list13.get(i48), m30328H2);
                        }
                    }
                    i19 += i14;
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 50:
                    C5731b2 c5731b2 = (C5731b2) unsafe.getObject(obj, j11);
                    AbstractC30228a.m149044a(m30329I(i18));
                    if (c5731b2.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c5731b2.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
                case 51:
                    if (m30345s(obj, i21, i18)) {
                        m30488y = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y + 8;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 52:
                    if (m30345s(obj, i21, i18)) {
                        m30488y2 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y2 + 4;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 53:
                    if (m30345s(obj, i21, i18)) {
                        m30489z = AbstractC5845u0.m30489z(m30326F(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 54:
                    if (m30345s(obj, i21, i18)) {
                        m30489z = AbstractC5845u0.m30489z(m30326F(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 55:
                    if (m30345s(obj, i21, i18)) {
                        m30489z = AbstractC5845u0.m30485v(m30321A(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 56:
                    if (m30345s(obj, i21, i18)) {
                        m30488y = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y + 8;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 57:
                    if (m30345s(obj, i21, i18)) {
                        m30488y2 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y2 + 4;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 58:
                    if (m30345s(obj, i21, i18)) {
                        m30488y4 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y4 + 1;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 59:
                    if (m30345s(obj, i21, i18)) {
                        int i49 = i21 << 3;
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof AbstractC5803n0) {
                            int i51 = AbstractC5845u0.f33433d;
                            int mo30241g6 = ((AbstractC5803n0) object2).mo30241g();
                            m30488y5 = AbstractC5845u0.m30488y(mo30241g6) + mo30241g6;
                            m30488y6 = AbstractC5845u0.m30488y(i49);
                            m30511n = m30488y6 + m30488y5;
                            i19 += m30511n;
                            i18 += 3;
                            i16 = i11;
                            i17 = i12;
                            z11 = false;
                            i15 = 1048575;
                        } else {
                            m30489z = AbstractC5845u0.m30487x((String) object2);
                            m30488y3 = AbstractC5845u0.m30488y(i49);
                            m30511n = m30488y3 + m30489z;
                            i19 += m30511n;
                            i18 += 3;
                            i16 = i11;
                            i17 = i12;
                            z11 = false;
                            i15 = 1048575;
                        }
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 60:
                    if (m30345s(obj, i21, i18)) {
                        m30511n = AbstractC5847u2.m30511n(i21, unsafe.getObject(obj, j11), m30328H(i18));
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 61:
                    if (m30345s(obj, i21, i18)) {
                        AbstractC5803n0 abstractC5803n02 = (AbstractC5803n0) unsafe.getObject(obj, j11);
                        int i52 = AbstractC5845u0.f33433d;
                        int mo30241g7 = abstractC5803n02.mo30241g();
                        m30488y5 = AbstractC5845u0.m30488y(mo30241g7) + mo30241g7;
                        m30488y6 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y6 + m30488y5;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 62:
                    if (m30345s(obj, i21, i18)) {
                        m30489z = AbstractC5845u0.m30488y(m30321A(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 63:
                    if (m30345s(obj, i21, i18)) {
                        m30489z = AbstractC5845u0.m30485v(m30321A(obj, j11));
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 64:
                    if (m30345s(obj, i21, i18)) {
                        m30488y2 = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y2 + 4;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 65:
                    if (m30345s(obj, i21, i18)) {
                        m30488y = AbstractC5845u0.m30488y(i21 << 3);
                        m30511n = m30488y + 8;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m30345s(obj, i21, i18)) {
                        int m30321A = m30321A(obj, j11);
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = AbstractC5845u0.m30488y((m30321A >> 31) ^ (m30321A + m30321A));
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m30345s(obj, i21, i18)) {
                        long m30326F = m30326F(obj, j11);
                        m30488y3 = AbstractC5845u0.m30488y(i21 << 3);
                        m30489z = AbstractC5845u0.m30489z((m30326F >> 63) ^ (m30326F + m30326F));
                        m30511n = m30488y3 + m30489z;
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                case 68:
                    if (m30345s(obj, i21, i18)) {
                        m30511n = AbstractC5845u0.m30484u(i21, (InterfaceC5775i2) unsafe.getObject(obj, j11), m30328H(i18));
                        i19 += m30511n;
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    } else {
                        i18 += 3;
                        i16 = i11;
                        i17 = i12;
                        z11 = false;
                        i15 = 1048575;
                    }
                default:
                    i18 += 3;
                    i16 = i11;
                    i17 = i12;
                    z11 = false;
                    i15 = 1048575;
            }
        }
        AbstractC5865x2 abstractC5865x2 = this.f33358k;
        int mo30553a = i19 + abstractC5865x2.mo30553a(abstractC5865x2.mo30556d(obj));
        if (!this.f33353f) {
            return mo30553a;
        }
        this.f33359l.mo30154a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    public final int zzb(Object obj) {
        int i11;
        long doubleToLongBits;
        int i12;
        int floatToIntBits;
        int i13;
        int i14 = 0;
        for (int i15 = 0; i15 < this.f33348a.length; i15 += 3) {
            int m30325E = m30325E(i15);
            int[] iArr = this.f33348a;
            int i16 = 1048575 & m30325E;
            int m30324D = m30324D(m30325E);
            int i17 = iArr[i15];
            long j11 = i16;
            int i18 = 37;
            switch (m30324D) {
                case 0:
                    i11 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(AbstractC5770h3.m30253f(obj, j11));
                    byte[] bArr = AbstractC5804n1.f33378d;
                    i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i12 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(AbstractC5770h3.m30254g(obj, j11));
                    i14 = i12 + floatToIntBits;
                    break;
                case 2:
                    i11 = i14 * 53;
                    doubleToLongBits = AbstractC5770h3.m30256i(obj, j11);
                    byte[] bArr2 = AbstractC5804n1.f33378d;
                    i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i11 = i14 * 53;
                    doubleToLongBits = AbstractC5770h3.m30256i(obj, j11);
                    byte[] bArr3 = AbstractC5804n1.f33378d;
                    i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30255h(obj, j11);
                    i14 = i12 + floatToIntBits;
                    break;
                case 5:
                    i11 = i14 * 53;
                    doubleToLongBits = AbstractC5770h3.m30256i(obj, j11);
                    byte[] bArr4 = AbstractC5804n1.f33378d;
                    i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30255h(obj, j11);
                    i14 = i12 + floatToIntBits;
                    break;
                case 7:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5804n1.m30375a(AbstractC5770h3.m30244B(obj, j11));
                    i14 = i12 + floatToIntBits;
                    break;
                case 8:
                    i12 = i14 * 53;
                    floatToIntBits = ((String) AbstractC5770h3.m30258k(obj, j11)).hashCode();
                    i14 = i12 + floatToIntBits;
                    break;
                case 9:
                    i13 = i14 * 53;
                    Object m30258k = AbstractC5770h3.m30258k(obj, j11);
                    if (m30258k != null) {
                        i18 = m30258k.hashCode();
                    }
                    i14 = i13 + i18;
                    break;
                case 10:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30258k(obj, j11).hashCode();
                    i14 = i12 + floatToIntBits;
                    break;
                case 11:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30255h(obj, j11);
                    i14 = i12 + floatToIntBits;
                    break;
                case 12:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30255h(obj, j11);
                    i14 = i12 + floatToIntBits;
                    break;
                case 13:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30255h(obj, j11);
                    i14 = i12 + floatToIntBits;
                    break;
                case 14:
                    i11 = i14 * 53;
                    doubleToLongBits = AbstractC5770h3.m30256i(obj, j11);
                    byte[] bArr5 = AbstractC5804n1.f33378d;
                    i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30255h(obj, j11);
                    i14 = i12 + floatToIntBits;
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    i11 = i14 * 53;
                    doubleToLongBits = AbstractC5770h3.m30256i(obj, j11);
                    byte[] bArr6 = AbstractC5804n1.f33378d;
                    i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i14 * 53;
                    Object m30258k2 = AbstractC5770h3.m30258k(obj, j11);
                    if (m30258k2 != null) {
                        i18 = m30258k2.hashCode();
                    }
                    i14 = i13 + i18;
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
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30258k(obj, j11).hashCode();
                    i14 = i12 + floatToIntBits;
                    break;
                case 50:
                    i12 = i14 * 53;
                    floatToIntBits = AbstractC5770h3.m30258k(obj, j11).hashCode();
                    i14 = i12 + floatToIntBits;
                    break;
                case 51:
                    if (m30345s(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m30350y(obj, j11));
                        byte[] bArr7 = AbstractC5804n1.f33378d;
                        i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(m30351z(obj, j11));
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m30345s(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = m30326F(obj, j11);
                        byte[] bArr8 = AbstractC5804n1.f33378d;
                        i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m30345s(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = m30326F(obj, j11);
                        byte[] bArr9 = AbstractC5804n1.f33378d;
                        i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = m30321A(obj, j11);
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m30345s(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = m30326F(obj, j11);
                        byte[] bArr10 = AbstractC5804n1.f33378d;
                        i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = m30321A(obj, j11);
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = AbstractC5804n1.m30375a(m30346t(obj, j11));
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = ((String) AbstractC5770h3.m30258k(obj, j11)).hashCode();
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = AbstractC5770h3.m30258k(obj, j11).hashCode();
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = AbstractC5770h3.m30258k(obj, j11).hashCode();
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = m30321A(obj, j11);
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = m30321A(obj, j11);
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = m30321A(obj, j11);
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m30345s(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = m30326F(obj, j11);
                        byte[] bArr11 = AbstractC5804n1.f33378d;
                        i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = m30321A(obj, j11);
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m30345s(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = m30326F(obj, j11);
                        byte[] bArr12 = AbstractC5804n1.f33378d;
                        i14 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m30345s(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = AbstractC5770h3.m30258k(obj, j11).hashCode();
                        i14 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i14 * 53) + this.f33358k.mo30556d(obj).hashCode();
        if (!this.f33353f) {
            return hashCode;
        }
        this.f33359l.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    public final Object zze() {
        return ((AbstractC5774i1) this.f33352e).m30286g();
    }
}
