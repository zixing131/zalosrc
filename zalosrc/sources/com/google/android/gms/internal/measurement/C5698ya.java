package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.AbstractC1158c0;
import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ya */
/* loaded from: classes.dex */
public final class C5698ya implements InterfaceC5393gb {

    /* renamed from: p */
    private static final int[] f32930p = new int[0];

    /* renamed from: q */
    private static final Unsafe f32931q = AbstractC5648vb.m29792l();

    /* renamed from: a */
    private final int[] f32932a;

    /* renamed from: b */
    private final Object[] f32933b;

    /* renamed from: c */
    private final int f32934c;

    /* renamed from: d */
    private final int f32935d;

    /* renamed from: e */
    private final InterfaceC5647va f32936e;

    /* renamed from: f */
    private final boolean f32937f;

    /* renamed from: g */
    private final boolean f32938g;

    /* renamed from: h */
    private final int[] f32939h;

    /* renamed from: i */
    private final int f32940i;

    /* renamed from: j */
    private final int f32941j;

    /* renamed from: k */
    private final AbstractC5443ja f32942k;

    /* renamed from: l */
    private final AbstractC5478lb f32943l;

    /* renamed from: m */
    private final AbstractC5442j9 f32944m;

    /* renamed from: n */
    private final C5291ab f32945n;

    /* renamed from: o */
    private final C5562qa f32946o;

    private C5698ya(int[] iArr, Object[] objArr, int i11, int i12, InterfaceC5647va interfaceC5647va, boolean z11, boolean z12, int[] iArr2, int i13, int i14, C5291ab c5291ab, AbstractC5443ja abstractC5443ja, AbstractC5478lb abstractC5478lb, AbstractC5442j9 abstractC5442j9, C5562qa c5562qa) {
        this.f32932a = iArr;
        this.f32933b = objArr;
        this.f32934c = i11;
        this.f32935d = i12;
        this.f32938g = z11;
        boolean z13 = false;
        if (abstractC5442j9 != null && abstractC5442j9.mo29283c(interfaceC5647va)) {
            z13 = true;
        }
        this.f32937f = z13;
        this.f32939h = iArr2;
        this.f32940i = i13;
        this.f32941j = i14;
        this.f32945n = c5291ab;
        this.f32942k = abstractC5443ja;
        this.f32943l = abstractC5478lb;
        this.f32944m = abstractC5442j9;
        this.f32936e = interfaceC5647va;
        this.f32946o = c5562qa;
    }

    /* renamed from: A */
    private static boolean m30048A(Object obj, long j11) {
        return ((Boolean) AbstractC5648vb.m29791k(obj, j11)).booleanValue();
    }

    /* renamed from: B */
    private static final void m30049B(int i11, Object obj, InterfaceC5326cc interfaceC5326cc) {
        if (obj instanceof String) {
            interfaceC5326cc.mo29006d(i11, (String) obj);
        } else {
            interfaceC5326cc.mo29002I(i11, (AbstractC5679x8) obj);
        }
    }

    /* renamed from: D */
    static C5495mb m30050D(Object obj) {
        AbstractC5612t9 abstractC5612t9 = (AbstractC5612t9) obj;
        C5495mb c5495mb = abstractC5612t9.zzc;
        if (c5495mb == C5495mb.m29441c()) {
            C5495mb m29443f = C5495mb.m29443f();
            abstractC5612t9.zzc = m29443f;
            return m29443f;
        }
        return c5495mb;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5698ya m30051E(Class cls, InterfaceC5596sa interfaceC5596sa, C5291ab c5291ab, AbstractC5443ja abstractC5443ja, AbstractC5478lb abstractC5478lb, AbstractC5442j9 abstractC5442j9, C5562qa c5562qa) {
        int i11;
        int charAt;
        int charAt2;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        char charAt8;
        int i23;
        char charAt9;
        int i24;
        char charAt10;
        boolean z11;
        int i25;
        int i26;
        int i27;
        C5376fb c5376fb;
        int i28;
        int objectFieldOffset;
        Class<?> cls2;
        int i29;
        int i31;
        int i32;
        Field m30071l;
        char charAt11;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field m30071l2;
        Object obj2;
        Field m30071l3;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i41;
        char charAt14;
        int i42;
        char charAt15;
        if (interfaceC5596sa instanceof C5376fb) {
            C5376fb c5376fb2 = (C5376fb) interfaceC5596sa;
            int zzc = c5376fb2.zzc();
            String m29142a = c5376fb2.m29142a();
            int length = m29142a.length();
            int i43 = 0;
            int i44 = 55296;
            if (m29142a.charAt(0) >= 55296) {
                int i45 = 1;
                while (true) {
                    i11 = i45 + 1;
                    if (m29142a.charAt(i45) < 55296) {
                        break;
                    }
                    i45 = i11;
                }
            } else {
                i11 = 1;
            }
            int i46 = i11 + 1;
            int charAt16 = m29142a.charAt(i11);
            if (charAt16 >= 55296) {
                int i47 = charAt16 & 8191;
                int i48 = 13;
                while (true) {
                    i42 = i46 + 1;
                    charAt15 = m29142a.charAt(i46);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i47 |= (charAt15 & 8191) << i48;
                    i48 += 13;
                    i46 = i42;
                }
                charAt16 = i47 | (charAt15 << i48);
                i46 = i42;
            }
            if (charAt16 == 0) {
                iArr = f32930p;
                i12 = 0;
                i13 = 0;
                charAt = 0;
                charAt2 = 0;
                i15 = 0;
                i14 = 0;
            } else {
                int i49 = i46 + 1;
                int charAt17 = m29142a.charAt(i46);
                if (charAt17 >= 55296) {
                    int i51 = charAt17 & 8191;
                    int i52 = 13;
                    while (true) {
                        i24 = i49 + 1;
                        charAt10 = m29142a.charAt(i49);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i51 |= (charAt10 & 8191) << i52;
                        i52 += 13;
                        i49 = i24;
                    }
                    charAt17 = i51 | (charAt10 << i52);
                    i49 = i24;
                }
                int i53 = i49 + 1;
                int charAt18 = m29142a.charAt(i49);
                if (charAt18 >= 55296) {
                    int i54 = charAt18 & 8191;
                    int i55 = 13;
                    while (true) {
                        i23 = i53 + 1;
                        charAt9 = m29142a.charAt(i53);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i54 |= (charAt9 & 8191) << i55;
                        i55 += 13;
                        i53 = i23;
                    }
                    charAt18 = i54 | (charAt9 << i55);
                    i53 = i23;
                }
                int i56 = i53 + 1;
                int charAt19 = m29142a.charAt(i53);
                if (charAt19 >= 55296) {
                    int i57 = charAt19 & 8191;
                    int i58 = 13;
                    while (true) {
                        i22 = i56 + 1;
                        charAt8 = m29142a.charAt(i56);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i57 |= (charAt8 & 8191) << i58;
                        i58 += 13;
                        i56 = i22;
                    }
                    charAt19 = i57 | (charAt8 << i58);
                    i56 = i22;
                }
                int i59 = i56 + 1;
                int charAt20 = m29142a.charAt(i56);
                if (charAt20 >= 55296) {
                    int i61 = charAt20 & 8191;
                    int i62 = 13;
                    while (true) {
                        i21 = i59 + 1;
                        charAt7 = m29142a.charAt(i59);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i61 |= (charAt7 & 8191) << i62;
                        i62 += 13;
                        i59 = i21;
                    }
                    charAt20 = i61 | (charAt7 << i62);
                    i59 = i21;
                }
                int i63 = i59 + 1;
                charAt = m29142a.charAt(i59);
                if (charAt >= 55296) {
                    int i64 = charAt & 8191;
                    int i65 = 13;
                    while (true) {
                        i19 = i63 + 1;
                        charAt6 = m29142a.charAt(i63);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i64 |= (charAt6 & 8191) << i65;
                        i65 += 13;
                        i63 = i19;
                    }
                    charAt = i64 | (charAt6 << i65);
                    i63 = i19;
                }
                int i66 = i63 + 1;
                charAt2 = m29142a.charAt(i63);
                if (charAt2 >= 55296) {
                    int i67 = charAt2 & 8191;
                    int i68 = 13;
                    while (true) {
                        i18 = i66 + 1;
                        charAt5 = m29142a.charAt(i66);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i67 |= (charAt5 & 8191) << i68;
                        i68 += 13;
                        i66 = i18;
                    }
                    charAt2 = i67 | (charAt5 << i68);
                    i66 = i18;
                }
                int i69 = i66 + 1;
                int charAt21 = m29142a.charAt(i66);
                if (charAt21 >= 55296) {
                    int i71 = charAt21 & 8191;
                    int i72 = 13;
                    while (true) {
                        i17 = i69 + 1;
                        charAt4 = m29142a.charAt(i69);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i71 |= (charAt4 & 8191) << i72;
                        i72 += 13;
                        i69 = i17;
                    }
                    charAt21 = i71 | (charAt4 << i72);
                    i69 = i17;
                }
                int i73 = i69 + 1;
                int charAt22 = m29142a.charAt(i69);
                if (charAt22 >= 55296) {
                    int i74 = charAt22 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i16 = i75 + 1;
                        charAt3 = m29142a.charAt(i75);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i74 |= (charAt3 & 8191) << i76;
                        i76 += 13;
                        i75 = i16;
                    }
                    charAt22 = i74 | (charAt3 << i76);
                    i73 = i16;
                }
                int i77 = charAt22 + charAt2 + charAt21;
                int i78 = charAt17 + charAt17 + charAt18;
                int[] iArr2 = new int[i77];
                i43 = charAt17;
                iArr = iArr2;
                i12 = charAt19;
                i13 = i78;
                i14 = charAt22;
                i46 = i73;
                i15 = charAt20;
            }
            Unsafe unsafe = f32931q;
            Object[] m29143b = c5376fb2.m29143b();
            Class<?> cls3 = c5376fb2.zza().getClass();
            int i79 = i14 + charAt2;
            int i81 = charAt + charAt;
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr = new Object[i81];
            int i82 = i14;
            int i83 = i79;
            int i84 = 0;
            int i85 = 0;
            while (true) {
                if (zzc == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i46 < length) {
                    int i86 = i46 + 1;
                    int charAt23 = m29142a.charAt(i46);
                    if (charAt23 >= i44) {
                        int i87 = charAt23 & 8191;
                        int i88 = i86;
                        int i89 = 13;
                        while (true) {
                            i41 = i88 + 1;
                            charAt14 = m29142a.charAt(i88);
                            i25 = zzc;
                            if (charAt14 < 55296) {
                                break;
                            }
                            i87 |= (charAt14 & 8191) << i89;
                            i89 += 13;
                            i88 = i41;
                            zzc = i25;
                        }
                        charAt23 = i87 | (charAt14 << i89);
                        i26 = i41;
                    } else {
                        i25 = zzc;
                        i26 = i86;
                    }
                    int i91 = i26 + 1;
                    int charAt24 = m29142a.charAt(i26);
                    int i92 = length;
                    char c11 = 55296;
                    if (charAt24 >= 55296) {
                        int i93 = charAt24 & 8191;
                        int i94 = 13;
                        while (true) {
                            i39 = i91 + 1;
                            charAt13 = m29142a.charAt(i91);
                            if (charAt13 < c11) {
                                break;
                            }
                            i93 |= (charAt13 & 8191) << i94;
                            i94 += 13;
                            i91 = i39;
                            c11 = 55296;
                        }
                        charAt24 = i93 | (charAt13 << i94);
                        i91 = i39;
                    }
                    if ((charAt24 & 1024) != 0) {
                        iArr[i84] = i85;
                        i84++;
                    }
                    int i95 = charAt24 & 255;
                    int i96 = i15;
                    if (i95 >= 51) {
                        int i97 = i91 + 1;
                        int charAt25 = m29142a.charAt(i91);
                        if (charAt25 >= 55296) {
                            int i98 = charAt25 & 8191;
                            int i99 = i97;
                            int i100 = 13;
                            while (true) {
                                i38 = i99 + 1;
                                charAt12 = m29142a.charAt(i99);
                                i27 = i12;
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i98 |= (charAt12 & 8191) << i100;
                                i100 += 13;
                                i99 = i38;
                                i12 = i27;
                            }
                            charAt25 = i98 | (charAt12 << i100);
                            i36 = i38;
                        } else {
                            i27 = i12;
                            i36 = i97;
                        }
                        int i101 = i95 - 51;
                        int i102 = i36;
                        if (i101 != 9 && i101 != 17) {
                            if (i101 == 12 && !z11) {
                                int i103 = i85 / 3;
                                i37 = i13 + 1;
                                objArr[i103 + i103 + 1] = m29143b[i13];
                            }
                            int i104 = charAt25 + charAt25;
                            obj = m29143b[i104];
                            if (!(obj instanceof Field)) {
                                m30071l2 = (Field) obj;
                            } else {
                                m30071l2 = m30071l(cls3, (String) obj);
                                m29143b[i104] = m30071l2;
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m30071l2);
                            int i105 = i104 + 1;
                            obj2 = m29143b[i105];
                            if (!(obj2 instanceof Field)) {
                                m30071l3 = (Field) obj2;
                            } else {
                                m30071l3 = m30071l(cls3, (String) obj2);
                                m29143b[i105] = m30071l3;
                            }
                            i32 = (int) unsafe.objectFieldOffset(m30071l3);
                            cls2 = cls3;
                            i29 = i102;
                            i31 = 0;
                            c5376fb = c5376fb2;
                        } else {
                            int i106 = i85 / 3;
                            i37 = i13 + 1;
                            objArr[i106 + i106 + 1] = m29143b[i13];
                        }
                        i13 = i37;
                        int i1042 = charAt25 + charAt25;
                        obj = m29143b[i1042];
                        if (!(obj instanceof Field)) {
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m30071l2);
                        int i1052 = i1042 + 1;
                        obj2 = m29143b[i1052];
                        if (!(obj2 instanceof Field)) {
                        }
                        i32 = (int) unsafe.objectFieldOffset(m30071l3);
                        cls2 = cls3;
                        i29 = i102;
                        i31 = 0;
                        c5376fb = c5376fb2;
                    } else {
                        i27 = i12;
                        int i107 = i13 + 1;
                        Field m30071l4 = m30071l(cls3, (String) m29143b[i13]);
                        c5376fb = c5376fb2;
                        if (i95 != 9 && i95 != 17) {
                            if (i95 != 27 && i95 != 49) {
                                if (i95 != 12 && i95 != 30 && i95 != 44) {
                                    if (i95 == 50) {
                                        int i108 = i82 + 1;
                                        iArr[i82] = i85;
                                        int i109 = i85 / 3;
                                        int i110 = i13 + 2;
                                        int i111 = i109 + i109;
                                        objArr[i111] = m29143b[i107];
                                        if ((charAt24 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0) {
                                            objArr[i111 + 1] = m29143b[i110];
                                            i82 = i108;
                                            i28 = i13 + 3;
                                        } else {
                                            i82 = i108;
                                            i28 = i110;
                                        }
                                        objectFieldOffset = (int) unsafe.objectFieldOffset(m30071l4);
                                        if ((charAt24 & 4096) != 4096 && i95 <= 17) {
                                            int i112 = i91 + 1;
                                            int charAt26 = m29142a.charAt(i91);
                                            if (charAt26 >= 55296) {
                                                int i113 = charAt26 & 8191;
                                                int i114 = 13;
                                                while (true) {
                                                    i29 = i112 + 1;
                                                    charAt11 = m29142a.charAt(i112);
                                                    if (charAt11 < 55296) {
                                                        break;
                                                    }
                                                    i113 |= (charAt11 & 8191) << i114;
                                                    i114 += 13;
                                                    i112 = i29;
                                                }
                                                charAt26 = i113 | (charAt11 << i114);
                                            } else {
                                                i29 = i112;
                                            }
                                            int i115 = i43 + i43 + (charAt26 / 32);
                                            Object obj3 = m29143b[i115];
                                            if (obj3 instanceof Field) {
                                                m30071l = (Field) obj3;
                                            } else {
                                                m30071l = m30071l(cls3, (String) obj3);
                                                m29143b[i115] = m30071l;
                                            }
                                            cls2 = cls3;
                                            i32 = (int) unsafe.objectFieldOffset(m30071l);
                                            i31 = charAt26 % 32;
                                        } else {
                                            cls2 = cls3;
                                            i29 = i91;
                                            i31 = 0;
                                            i32 = 1048575;
                                        }
                                        if (i95 < 18 && i95 <= 49) {
                                            iArr[i83] = objectFieldOffset;
                                            i13 = i28;
                                            i83++;
                                        } else {
                                            i13 = i28;
                                        }
                                    }
                                } else if (!z11) {
                                    int i116 = i85 / 3;
                                    i33 = i13 + 2;
                                    objArr[i116 + i116 + 1] = m29143b[i107];
                                }
                            } else {
                                int i117 = i85 / 3;
                                i33 = i13 + 2;
                                objArr[i117 + i117 + 1] = m29143b[i107];
                            }
                            i28 = i33;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m30071l4);
                            if ((charAt24 & 4096) != 4096) {
                            }
                            cls2 = cls3;
                            i29 = i91;
                            i31 = 0;
                            i32 = 1048575;
                            if (i95 < 18) {
                            }
                            i13 = i28;
                        } else {
                            int i118 = i85 / 3;
                            objArr[i118 + i118 + 1] = m30071l4.getType();
                        }
                        i28 = i107;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m30071l4);
                        if ((charAt24 & 4096) != 4096) {
                        }
                        cls2 = cls3;
                        i29 = i91;
                        i31 = 0;
                        i32 = 1048575;
                        if (i95 < 18) {
                        }
                        i13 = i28;
                    }
                    int i119 = i85 + 1;
                    iArr3[i85] = charAt23;
                    int i120 = i85 + 2;
                    if ((charAt24 & 512) != 0) {
                        i34 = 536870912;
                    } else {
                        i34 = 0;
                    }
                    if ((charAt24 & 256) != 0) {
                        i35 = 268435456;
                    } else {
                        i35 = 0;
                    }
                    iArr3[i119] = i35 | i34 | (i95 << 20) | objectFieldOffset;
                    i85 += 3;
                    iArr3[i120] = (i31 << 20) | i32;
                    cls3 = cls2;
                    length = i92;
                    i46 = i29;
                    i15 = i96;
                    zzc = i25;
                    c5376fb2 = c5376fb;
                    i12 = i27;
                    i44 = 55296;
                } else {
                    return new C5698ya(iArr3, objArr, i12, i15, c5376fb2.zza(), z11, false, iArr, i14, i79, c5291ab, abstractC5443ja, abstractC5478lb, abstractC5442j9, c5562qa);
                }
            }
        } else {
            AbstractC1158c0.m5500a(interfaceC5596sa);
            throw null;
        }
    }

    /* renamed from: F */
    private static double m30052F(Object obj, long j11) {
        return ((Double) AbstractC5648vb.m29791k(obj, j11)).doubleValue();
    }

    /* renamed from: G */
    private static float m30053G(Object obj, long j11) {
        return ((Float) AbstractC5648vb.m29791k(obj, j11)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003c. Please report as an issue. */
    /* renamed from: H */
    private final int m30054H(Object obj) {
        int i11;
        int m29089y;
        int m29089y2;
        int m29090z;
        int m29089y3;
        int m29089y4;
        int m29089y5;
        int m29089y6;
        int m29231R;
        int m29219F;
        int m29089y7;
        int m29089y8;
        int i12;
        int m29089y9;
        int m29089y10;
        int m29089y11;
        int m29089y12;
        Unsafe unsafe = f32931q;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (i14 < this.f32932a.length) {
            int m30064R = m30064R(i14);
            int[] iArr = this.f32932a;
            int i18 = iArr[i14];
            int m30063Q = m30063Q(m30064R);
            if (m30063Q <= 17) {
                int i19 = iArr[i14 + 2];
                int i21 = i19 & i13;
                int i22 = i19 >>> 20;
                if (i21 != i16) {
                    i17 = unsafe.getInt(obj, i21);
                    i16 = i21;
                }
                i11 = 1 << i22;
            } else {
                i11 = 0;
            }
            long j11 = m30064R & i13;
            switch (m30063Q) {
                case 0:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y + 8;
                        i15 += m29089y4;
                        break;
                    }
                case 1:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y2 = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y2 + 4;
                        i15 += m29089y4;
                        break;
                    }
                case 2:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29090z = AbstractC5357e9.m29090z(unsafe.getLong(obj, j11));
                        m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += m29089y3 + m29090z;
                        break;
                    }
                case 3:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29090z = AbstractC5357e9.m29090z(unsafe.getLong(obj, j11));
                        m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += m29089y3 + m29090z;
                        break;
                    }
                case 4:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29090z = AbstractC5357e9.m29086v(unsafe.getInt(obj, j11));
                        m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += m29089y3 + m29090z;
                        break;
                    }
                case 5:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y + 8;
                        i15 += m29089y4;
                        break;
                    }
                case 6:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y2 = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y2 + 4;
                        i15 += m29089y4;
                        break;
                    }
                case 7:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y4 = AbstractC5357e9.m29089y(i18 << 3) + 1;
                        i15 += m29089y4;
                        break;
                    }
                case 8:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof AbstractC5679x8) {
                            int i23 = AbstractC5357e9.f32354d;
                            int mo29551g = ((AbstractC5679x8) object).mo29551g();
                            m29089y5 = AbstractC5357e9.m29089y(mo29551g) + mo29551g;
                            m29089y6 = AbstractC5357e9.m29089y(i18 << 3);
                            m29089y4 = m29089y6 + m29089y5;
                            i15 += m29089y4;
                            break;
                        } else {
                            m29090z = AbstractC5357e9.m29088x((String) object);
                            m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                            i15 += m29089y3 + m29090z;
                            break;
                        }
                    }
                case 9:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y4 = AbstractC5427ib.m29225L(i18, unsafe.getObject(obj, j11), m30067h(i14));
                        i15 += m29089y4;
                        break;
                    }
                case 10:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        AbstractC5679x8 abstractC5679x8 = (AbstractC5679x8) unsafe.getObject(obj, j11);
                        int i24 = AbstractC5357e9.f32354d;
                        int mo29551g2 = abstractC5679x8.mo29551g();
                        m29089y5 = AbstractC5357e9.m29089y(mo29551g2) + mo29551g2;
                        m29089y6 = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y6 + m29089y5;
                        i15 += m29089y4;
                        break;
                    }
                case 11:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29090z = AbstractC5357e9.m29089y(unsafe.getInt(obj, j11));
                        m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += m29089y3 + m29090z;
                        break;
                    }
                case 12:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29090z = AbstractC5357e9.m29086v(unsafe.getInt(obj, j11));
                        m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += m29089y3 + m29090z;
                        break;
                    }
                case 13:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y2 = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y2 + 4;
                        i15 += m29089y4;
                        break;
                    }
                case 14:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y = AbstractC5357e9.m29089y(i18 << 3);
                        m29089y4 = m29089y + 8;
                        i15 += m29089y4;
                        break;
                    }
                case 15:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j11);
                        m29089y3 = AbstractC5357e9.m29089y(i18 << 3);
                        m29090z = AbstractC5357e9.m29089y((i25 >> 31) ^ (i25 + i25));
                        i15 += m29089y3 + m29090z;
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if ((i11 & i17) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j11);
                        i15 += AbstractC5357e9.m29089y(i18 << 3) + AbstractC5357e9.m29090z((j12 >> 63) ^ (j12 + j12));
                        break;
                    }
                case 17:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        m29089y4 = AbstractC5357e9.m29085u(i18, (InterfaceC5647va) unsafe.getObject(obj, j11), m30067h(i14));
                        i15 += m29089y4;
                        break;
                    }
                case 18:
                    m29089y4 = AbstractC5427ib.m29218E(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 19:
                    m29089y4 = AbstractC5427ib.m29216C(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 20:
                    m29089y4 = AbstractC5427ib.m29223J(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 21:
                    m29089y4 = AbstractC5427ib.m29234U(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 22:
                    m29089y4 = AbstractC5427ib.m29221H(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 23:
                    m29089y4 = AbstractC5427ib.m29218E(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 24:
                    m29089y4 = AbstractC5427ib.m29216C(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 25:
                    m29089y4 = AbstractC5427ib.m29262y(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29089y4;
                    break;
                case 26:
                    m29231R = AbstractC5427ib.m29231R(i18, (List) unsafe.getObject(obj, j11));
                    i15 += m29231R;
                    break;
                case 27:
                    m29231R = AbstractC5427ib.m29226M(i18, (List) unsafe.getObject(obj, j11), m30067h(i14));
                    i15 += m29231R;
                    break;
                case 28:
                    m29231R = AbstractC5427ib.m29263z(i18, (List) unsafe.getObject(obj, j11));
                    i15 += m29231R;
                    break;
                case 29:
                    m29231R = AbstractC5427ib.m29232S(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29231R;
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    m29231R = AbstractC5427ib.m29214A(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29231R;
                    break;
                case 31:
                    m29231R = AbstractC5427ib.m29216C(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29231R;
                    break;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    m29231R = AbstractC5427ib.m29218E(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29231R;
                    break;
                case 33:
                    m29231R = AbstractC5427ib.m29227N(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29231R;
                    break;
                case 34:
                    m29231R = AbstractC5427ib.m29229P(i18, (List) unsafe.getObject(obj, j11), false);
                    i15 += m29231R;
                    break;
                case 35:
                    m29219F = AbstractC5427ib.m29219F((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 36:
                    m29219F = AbstractC5427ib.m29217D((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 37:
                    m29219F = AbstractC5427ib.m29224K((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 38:
                    m29219F = AbstractC5427ib.m29235V((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 39:
                    m29219F = AbstractC5427ib.m29222I((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 40:
                    m29219F = AbstractC5427ib.m29219F((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    m29219F = AbstractC5427ib.m29217D((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j11);
                    int i26 = AbstractC5427ib.f32422e;
                    m29219F = list.size();
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 43:
                    m29219F = AbstractC5427ib.m29233T((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    m29219F = AbstractC5427ib.m29215B((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 45:
                    m29219F = AbstractC5427ib.m29217D((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 46:
                    m29219F = AbstractC5427ib.m29219F((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 47:
                    m29219F = AbstractC5427ib.m29228O((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 48:
                    m29219F = AbstractC5427ib.m29230Q((List) unsafe.getObject(obj, j11));
                    if (m29219F > 0) {
                        m29089y7 = AbstractC5357e9.m29089y(m29219F);
                        m29089y8 = AbstractC5357e9.m29089y(i18 << 3);
                        i12 = m29089y8 + m29089y7;
                        i15 += i12 + m29219F;
                    }
                    break;
                case 49:
                    m29231R = AbstractC5427ib.m29220G(i18, (List) unsafe.getObject(obj, j11), m30067h(i14));
                    i15 += m29231R;
                    break;
                case 50:
                    C5562qa.m29562a(i18, unsafe.getObject(obj, j11), m30068i(i14));
                    break;
                case 51:
                    if (m30085z(obj, i18, i14)) {
                        m29089y9 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y9 + 8;
                        i15 += m29231R;
                    }
                    break;
                case 52:
                    if (m30085z(obj, i18, i14)) {
                        m29089y10 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y10 + 4;
                        i15 += m29231R;
                    }
                    break;
                case 53:
                    if (m30085z(obj, i18, i14)) {
                        m29219F = AbstractC5357e9.m29090z(m30065S(obj, j11));
                        i12 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += i12 + m29219F;
                    }
                    break;
                case 54:
                    if (m30085z(obj, i18, i14)) {
                        m29219F = AbstractC5357e9.m29090z(m30065S(obj, j11));
                        i12 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += i12 + m29219F;
                    }
                    break;
                case 55:
                    if (m30085z(obj, i18, i14)) {
                        m29219F = AbstractC5357e9.m29086v(m30055I(obj, j11));
                        i12 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += i12 + m29219F;
                    }
                    break;
                case 56:
                    if (m30085z(obj, i18, i14)) {
                        m29089y9 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y9 + 8;
                        i15 += m29231R;
                    }
                    break;
                case 57:
                    if (m30085z(obj, i18, i14)) {
                        m29089y10 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y10 + 4;
                        i15 += m29231R;
                    }
                    break;
                case 58:
                    if (m30085z(obj, i18, i14)) {
                        m29231R = AbstractC5357e9.m29089y(i18 << 3) + 1;
                        i15 += m29231R;
                    }
                    break;
                case 59:
                    if (m30085z(obj, i18, i14)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof AbstractC5679x8) {
                            int i27 = AbstractC5357e9.f32354d;
                            int mo29551g3 = ((AbstractC5679x8) object2).mo29551g();
                            m29089y11 = AbstractC5357e9.m29089y(mo29551g3) + mo29551g3;
                            m29089y12 = AbstractC5357e9.m29089y(i18 << 3);
                            m29231R = m29089y12 + m29089y11;
                            i15 += m29231R;
                        } else {
                            m29219F = AbstractC5357e9.m29088x((String) object2);
                            i12 = AbstractC5357e9.m29089y(i18 << 3);
                            i15 += i12 + m29219F;
                        }
                    }
                    break;
                case 60:
                    if (m30085z(obj, i18, i14)) {
                        m29231R = AbstractC5427ib.m29225L(i18, unsafe.getObject(obj, j11), m30067h(i14));
                        i15 += m29231R;
                    }
                    break;
                case 61:
                    if (m30085z(obj, i18, i14)) {
                        AbstractC5679x8 abstractC5679x82 = (AbstractC5679x8) unsafe.getObject(obj, j11);
                        int i28 = AbstractC5357e9.f32354d;
                        int mo29551g4 = abstractC5679x82.mo29551g();
                        m29089y11 = AbstractC5357e9.m29089y(mo29551g4) + mo29551g4;
                        m29089y12 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y12 + m29089y11;
                        i15 += m29231R;
                    }
                    break;
                case 62:
                    if (m30085z(obj, i18, i14)) {
                        m29219F = AbstractC5357e9.m29089y(m30055I(obj, j11));
                        i12 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += i12 + m29219F;
                    }
                    break;
                case 63:
                    if (m30085z(obj, i18, i14)) {
                        m29219F = AbstractC5357e9.m29086v(m30055I(obj, j11));
                        i12 = AbstractC5357e9.m29089y(i18 << 3);
                        i15 += i12 + m29219F;
                    }
                    break;
                case 64:
                    if (m30085z(obj, i18, i14)) {
                        m29089y10 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y10 + 4;
                        i15 += m29231R;
                    }
                    break;
                case 65:
                    if (m30085z(obj, i18, i14)) {
                        m29089y9 = AbstractC5357e9.m29089y(i18 << 3);
                        m29231R = m29089y9 + 8;
                        i15 += m29231R;
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m30085z(obj, i18, i14)) {
                        int m30055I = m30055I(obj, j11);
                        i12 = AbstractC5357e9.m29089y(i18 << 3);
                        m29219F = AbstractC5357e9.m29089y((m30055I >> 31) ^ (m30055I + m30055I));
                        i15 += i12 + m29219F;
                    }
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m30085z(obj, i18, i14)) {
                        long m30065S = m30065S(obj, j11);
                        i15 += AbstractC5357e9.m29089y(i18 << 3) + AbstractC5357e9.m29090z((m30065S >> 63) ^ (m30065S + m30065S));
                    }
                    break;
                case 68:
                    if (m30085z(obj, i18, i14)) {
                        m29231R = AbstractC5357e9.m29085u(i18, (InterfaceC5647va) unsafe.getObject(obj, j11), m30067h(i14));
                        i15 += m29231R;
                    }
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
        AbstractC5478lb abstractC5478lb = this.f32943l;
        int mo29424a = i15 + abstractC5478lb.mo29424a(abstractC5478lb.mo29427d(obj));
        if (!this.f32937f) {
            return mo29424a;
        }
        this.f32944m.mo29281a(obj);
        throw null;
    }

    /* renamed from: I */
    private static int m30055I(Object obj, long j11) {
        return ((Integer) AbstractC5648vb.m29791k(obj, j11)).intValue();
    }

    /* renamed from: J */
    private final int m30056J(Object obj, byte[] bArr, int i11, int i12, int i13, long j11, C5458k8 c5458k8) {
        Unsafe unsafe = f32931q;
        Object m30068i = m30068i(i13);
        Object object = unsafe.getObject(obj, j11);
        if (!((C5545pa) object).m29535f()) {
            C5545pa m29532b = C5545pa.m29529a().m29532b();
            C5562qa.m29563b(m29532b, object);
            unsafe.putObject(obj, j11, m29532b);
        }
        AbstractC1158c0.m5500a(m30068i);
        throw null;
    }

    /* renamed from: K */
    private final int m30057K(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, C5458k8 c5458k8) {
        Unsafe unsafe = f32931q;
        long j12 = this.f32932a[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(obj, j11, Double.valueOf(Double.longBitsToDouble(AbstractC5475l8.m29419p(bArr, i11))));
                    int i19 = i11 + 8;
                    unsafe.putInt(obj, j12, i14);
                    return i19;
                }
                break;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(obj, j11, Float.valueOf(Float.intBitsToFloat(AbstractC5475l8.m29405b(bArr, i11))));
                    int i21 = i11 + 4;
                    unsafe.putInt(obj, j12, i14);
                    return i21;
                }
                break;
            case 53:
            case 54:
                if (i15 == 0) {
                    int m29416m = AbstractC5475l8.m29416m(bArr, i11, c5458k8);
                    unsafe.putObject(obj, j11, Long.valueOf(c5458k8.f32458b));
                    unsafe.putInt(obj, j12, i14);
                    return m29416m;
                }
                break;
            case 55:
            case 62:
                if (i15 == 0) {
                    int m29413j = AbstractC5475l8.m29413j(bArr, i11, c5458k8);
                    unsafe.putObject(obj, j11, Integer.valueOf(c5458k8.f32457a));
                    unsafe.putInt(obj, j12, i14);
                    return m29413j;
                }
                break;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(obj, j11, Long.valueOf(AbstractC5475l8.m29419p(bArr, i11)));
                    int i22 = i11 + 8;
                    unsafe.putInt(obj, j12, i14);
                    return i22;
                }
                break;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(obj, j11, Integer.valueOf(AbstractC5475l8.m29405b(bArr, i11)));
                    int i23 = i11 + 4;
                    unsafe.putInt(obj, j12, i14);
                    return i23;
                }
                break;
            case 58:
                if (i15 == 0) {
                    int m29416m2 = AbstractC5475l8.m29416m(bArr, i11, c5458k8);
                    unsafe.putObject(obj, j11, Boolean.valueOf(c5458k8.f32458b != 0));
                    unsafe.putInt(obj, j12, i14);
                    return m29416m2;
                }
                break;
            case 59:
                if (i15 == 2) {
                    int m29413j2 = AbstractC5475l8.m29413j(bArr, i11, c5458k8);
                    int i24 = c5458k8.f32457a;
                    if (i24 == 0) {
                        unsafe.putObject(obj, j11, "");
                    } else {
                        if ((i16 & 536870912) != 0 && !AbstractC5292ac.m28890e(bArr, m29413j2, m29413j2 + i24)) {
                            throw zzll.m30119c();
                        }
                        unsafe.putObject(obj, j11, new String(bArr, m29413j2, i24, AbstractC5290aa.f32257b));
                        m29413j2 += i24;
                    }
                    unsafe.putInt(obj, j12, i14);
                    return m29413j2;
                }
                break;
            case 60:
                if (i15 == 2) {
                    Object m30070k = m30070k(obj, i14, i18);
                    int m29418o = AbstractC5475l8.m29418o(m30070k, m30067h(i18), bArr, i11, i12, c5458k8);
                    m30078s(obj, i14, i18, m30070k);
                    return m29418o;
                }
                break;
            case 61:
                if (i15 == 2) {
                    int m29404a = AbstractC5475l8.m29404a(bArr, i11, c5458k8);
                    unsafe.putObject(obj, j11, c5458k8.f32459c);
                    unsafe.putInt(obj, j12, i14);
                    return m29404a;
                }
                break;
            case 63:
                if (i15 == 0) {
                    int m29413j3 = AbstractC5475l8.m29413j(bArr, i11, c5458k8);
                    int i25 = c5458k8.f32457a;
                    InterfaceC5663w9 m30066g = m30066g(i18);
                    if (m30066g != null && !m30066g.mo29054a(i25)) {
                        m30050D(obj).m29451j(i13, Long.valueOf(i25));
                    } else {
                        unsafe.putObject(obj, j11, Integer.valueOf(i25));
                        unsafe.putInt(obj, j12, i14);
                    }
                    return m29413j3;
                }
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                if (i15 == 0) {
                    int m29413j4 = AbstractC5475l8.m29413j(bArr, i11, c5458k8);
                    unsafe.putObject(obj, j11, Integer.valueOf(AbstractC5306b9.m28949a(c5458k8.f32457a)));
                    unsafe.putInt(obj, j12, i14);
                    return m29413j4;
                }
                break;
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                if (i15 == 0) {
                    int m29416m3 = AbstractC5475l8.m29416m(bArr, i11, c5458k8);
                    unsafe.putObject(obj, j11, Long.valueOf(AbstractC5306b9.m28950b(c5458k8.f32458b)));
                    unsafe.putInt(obj, j12, i14);
                    return m29416m3;
                }
                break;
            case 68:
                if (i15 == 3) {
                    Object m30070k2 = m30070k(obj, i14, i18);
                    int m29417n = AbstractC5475l8.m29417n(m30070k2, m30067h(i18), bArr, i11, i12, (i13 & (-8)) | 4, c5458k8);
                    m30078s(obj, i14, i18, m30070k2);
                    return m29417n;
                }
                break;
        }
        return i11;
    }

    /* renamed from: L */
    private final int m30058L(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, C5458k8 c5458k8) {
        int i18;
        int i19;
        int m29415l;
        int i21 = i11;
        Unsafe unsafe = f32931q;
        InterfaceC5714z9 interfaceC5714z9 = (InterfaceC5714z9) unsafe.getObject(obj, j12);
        if (!interfaceC5714z9.zzc()) {
            int size = interfaceC5714z9.size();
            interfaceC5714z9 = interfaceC5714z9.mo28992c(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j12, interfaceC5714z9);
        }
        Object obj2 = null;
        switch (i17) {
            case 18:
            case 35:
                if (i15 == 2) {
                    AbstractC1158c0.m5500a(interfaceC5714z9);
                    int m29413j = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i22 = c5458k8.f32457a + m29413j;
                    if (m29413j < i22) {
                        Double.longBitsToDouble(AbstractC5475l8.m29419p(bArr, m29413j));
                        throw null;
                    }
                    if (m29413j == i22) {
                        return m29413j;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 1) {
                    AbstractC1158c0.m5500a(interfaceC5714z9);
                    Double.longBitsToDouble(AbstractC5475l8.m29419p(bArr, i11));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    AbstractC1158c0.m5500a(interfaceC5714z9);
                    int m29413j2 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i23 = c5458k8.f32457a + m29413j2;
                    if (m29413j2 < i23) {
                        Float.intBitsToFloat(AbstractC5475l8.m29405b(bArr, m29413j2));
                        throw null;
                    }
                    if (m29413j2 == i23) {
                        return m29413j2;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 5) {
                    AbstractC1158c0.m5500a(interfaceC5714z9);
                    Float.intBitsToFloat(AbstractC5475l8.m29405b(bArr, i11));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    C5460ka c5460ka = (C5460ka) interfaceC5714z9;
                    int m29413j3 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i24 = c5458k8.f32457a + m29413j3;
                    while (m29413j3 < i24) {
                        m29413j3 = AbstractC5475l8.m29416m(bArr, m29413j3, c5458k8);
                        c5460ka.m29367g(c5458k8.f32458b);
                    }
                    if (m29413j3 == i24) {
                        return m29413j3;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 0) {
                    C5460ka c5460ka2 = (C5460ka) interfaceC5714z9;
                    int m29416m = AbstractC5475l8.m29416m(bArr, i21, c5458k8);
                    c5460ka2.m29367g(c5458k8.f32458b);
                    while (m29416m < i12) {
                        int m29413j4 = AbstractC5475l8.m29413j(bArr, m29416m, c5458k8);
                        if (i13 != c5458k8.f32457a) {
                            return m29416m;
                        }
                        m29416m = AbstractC5475l8.m29416m(bArr, m29413j4, c5458k8);
                        c5460ka2.m29367g(c5458k8.f32458b);
                    }
                    return m29416m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return AbstractC5475l8.m29409f(bArr, i21, interfaceC5714z9, c5458k8);
                }
                if (i15 == 0) {
                    return AbstractC5475l8.m29415l(i13, bArr, i11, i12, interfaceC5714z9, c5458k8);
                }
                break;
            case 23:
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
            case 40:
            case 46:
                if (i15 == 2) {
                    C5460ka c5460ka3 = (C5460ka) interfaceC5714z9;
                    int m29413j5 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i25 = c5458k8.f32457a + m29413j5;
                    while (m29413j5 < i25) {
                        c5460ka3.m29367g(AbstractC5475l8.m29419p(bArr, m29413j5));
                        m29413j5 += 8;
                    }
                    if (m29413j5 == i25) {
                        return m29413j5;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 1) {
                    C5460ka c5460ka4 = (C5460ka) interfaceC5714z9;
                    c5460ka4.m29367g(AbstractC5475l8.m29419p(bArr, i11));
                    while (true) {
                        i18 = i21 + 8;
                        if (i18 < i12) {
                            i21 = AbstractC5475l8.m29413j(bArr, i18, c5458k8);
                            if (i13 == c5458k8.f32457a) {
                                c5460ka4.m29367g(AbstractC5475l8.m29419p(bArr, i21));
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
                    C5629u9 c5629u9 = (C5629u9) interfaceC5714z9;
                    int m29413j6 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i26 = c5458k8.f32457a + m29413j6;
                    while (m29413j6 < i26) {
                        c5629u9.m29686f(AbstractC5475l8.m29405b(bArr, m29413j6));
                        m29413j6 += 4;
                    }
                    if (m29413j6 == i26) {
                        return m29413j6;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 5) {
                    C5629u9 c5629u92 = (C5629u9) interfaceC5714z9;
                    c5629u92.m29686f(AbstractC5475l8.m29405b(bArr, i11));
                    while (true) {
                        i19 = i21 + 4;
                        if (i19 < i12) {
                            i21 = AbstractC5475l8.m29413j(bArr, i19, c5458k8);
                            if (i13 == c5458k8.f32457a) {
                                c5629u92.m29686f(AbstractC5475l8.m29405b(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    AbstractC1158c0.m5500a(interfaceC5714z9);
                    int m29413j7 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i27 = c5458k8.f32457a + m29413j7;
                    if (m29413j7 < i27) {
                        AbstractC5475l8.m29416m(bArr, m29413j7, c5458k8);
                        throw null;
                    }
                    if (m29413j7 == i27) {
                        return m29413j7;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 0) {
                    AbstractC1158c0.m5500a(interfaceC5714z9);
                    AbstractC5475l8.m29416m(bArr, i21, c5458k8);
                    long j13 = c5458k8.f32458b;
                    throw null;
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        i21 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                        int i28 = c5458k8.f32457a;
                        if (i28 < 0) {
                            throw zzll.m30120d();
                        }
                        if (i28 == 0) {
                            interfaceC5714z9.add("");
                        } else {
                            interfaceC5714z9.add(new String(bArr, i21, i28, AbstractC5290aa.f32257b));
                            i21 += i28;
                        }
                        while (i21 < i12) {
                            int m29413j8 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                            if (i13 != c5458k8.f32457a) {
                                break;
                            } else {
                                i21 = AbstractC5475l8.m29413j(bArr, m29413j8, c5458k8);
                                int i29 = c5458k8.f32457a;
                                if (i29 < 0) {
                                    throw zzll.m30120d();
                                }
                                if (i29 == 0) {
                                    interfaceC5714z9.add("");
                                } else {
                                    interfaceC5714z9.add(new String(bArr, i21, i29, AbstractC5290aa.f32257b));
                                    i21 += i29;
                                }
                            }
                        }
                        break;
                    } else {
                        i21 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                        int i31 = c5458k8.f32457a;
                        if (i31 < 0) {
                            throw zzll.m30120d();
                        }
                        if (i31 == 0) {
                            interfaceC5714z9.add("");
                        } else {
                            int i32 = i21 + i31;
                            if (AbstractC5292ac.m28890e(bArr, i21, i32)) {
                                interfaceC5714z9.add(new String(bArr, i21, i31, AbstractC5290aa.f32257b));
                                i21 = i32;
                            } else {
                                throw zzll.m30119c();
                            }
                        }
                        while (i21 < i12) {
                            int m29413j9 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                            if (i13 != c5458k8.f32457a) {
                                break;
                            } else {
                                i21 = AbstractC5475l8.m29413j(bArr, m29413j9, c5458k8);
                                int i33 = c5458k8.f32457a;
                                if (i33 < 0) {
                                    throw zzll.m30120d();
                                }
                                if (i33 == 0) {
                                    interfaceC5714z9.add("");
                                } else {
                                    int i34 = i21 + i33;
                                    if (AbstractC5292ac.m28890e(bArr, i21, i34)) {
                                        interfaceC5714z9.add(new String(bArr, i21, i33, AbstractC5290aa.f32257b));
                                        i21 = i34;
                                    } else {
                                        throw zzll.m30119c();
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
                    return AbstractC5475l8.m29408e(m30067h(i16), i13, bArr, i11, i12, interfaceC5714z9, c5458k8);
                }
                break;
            case 28:
                if (i15 == 2) {
                    int m29413j10 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i35 = c5458k8.f32457a;
                    if (i35 >= 0) {
                        if (i35 > bArr.length - m29413j10) {
                            throw zzll.m30122f();
                        }
                        if (i35 == 0) {
                            interfaceC5714z9.add(AbstractC5679x8.f32911q);
                        } else {
                            interfaceC5714z9.add(AbstractC5679x8.m30021s(bArr, m29413j10, i35));
                            m29413j10 += i35;
                        }
                        while (m29413j10 < i12) {
                            int m29413j11 = AbstractC5475l8.m29413j(bArr, m29413j10, c5458k8);
                            if (i13 != c5458k8.f32457a) {
                                return m29413j10;
                            }
                            m29413j10 = AbstractC5475l8.m29413j(bArr, m29413j11, c5458k8);
                            int i36 = c5458k8.f32457a;
                            if (i36 >= 0) {
                                if (i36 > bArr.length - m29413j10) {
                                    throw zzll.m30122f();
                                }
                                if (i36 == 0) {
                                    interfaceC5714z9.add(AbstractC5679x8.f32911q);
                                } else {
                                    interfaceC5714z9.add(AbstractC5679x8.m30021s(bArr, m29413j10, i36));
                                    m29413j10 += i36;
                                }
                            } else {
                                throw zzll.m30120d();
                            }
                        }
                        return m29413j10;
                    }
                    throw zzll.m30120d();
                }
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                if (i15 == 2) {
                    m29415l = AbstractC5475l8.m29409f(bArr, i21, interfaceC5714z9, c5458k8);
                } else if (i15 == 0) {
                    m29415l = AbstractC5475l8.m29415l(i13, bArr, i11, i12, interfaceC5714z9, c5458k8);
                }
                InterfaceC5663w9 m30066g = m30066g(i16);
                AbstractC5478lb abstractC5478lb = this.f32943l;
                int i37 = AbstractC5427ib.f32422e;
                if (m30066g != null) {
                    if (interfaceC5714z9 instanceof RandomAccess) {
                        int size2 = interfaceC5714z9.size();
                        int i38 = 0;
                        for (int i39 = 0; i39 < size2; i39++) {
                            int intValue = ((Integer) interfaceC5714z9.get(i39)).intValue();
                            if (m30066g.mo29054a(intValue)) {
                                if (i39 != i38) {
                                    interfaceC5714z9.set(i38, Integer.valueOf(intValue));
                                }
                                i38++;
                            } else {
                                obj2 = AbstractC5427ib.m29239b(obj, i14, intValue, obj2, abstractC5478lb);
                            }
                        }
                        if (i38 != size2) {
                            interfaceC5714z9.subList(i38, size2).clear();
                            return m29415l;
                        }
                    } else {
                        Iterator it = interfaceC5714z9.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m30066g.mo29054a(intValue2)) {
                                obj2 = AbstractC5427ib.m29239b(obj, i14, intValue2, obj2, abstractC5478lb);
                                it.remove();
                            }
                        }
                    }
                }
                return m29415l;
            case 33:
            case 47:
                if (i15 == 2) {
                    C5629u9 c5629u93 = (C5629u9) interfaceC5714z9;
                    int m29413j12 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i41 = c5458k8.f32457a + m29413j12;
                    while (m29413j12 < i41) {
                        m29413j12 = AbstractC5475l8.m29413j(bArr, m29413j12, c5458k8);
                        c5629u93.m29686f(AbstractC5306b9.m28949a(c5458k8.f32457a));
                    }
                    if (m29413j12 == i41) {
                        return m29413j12;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 0) {
                    C5629u9 c5629u94 = (C5629u9) interfaceC5714z9;
                    int m29413j13 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    c5629u94.m29686f(AbstractC5306b9.m28949a(c5458k8.f32457a));
                    while (m29413j13 < i12) {
                        int m29413j14 = AbstractC5475l8.m29413j(bArr, m29413j13, c5458k8);
                        if (i13 != c5458k8.f32457a) {
                            return m29413j13;
                        }
                        m29413j13 = AbstractC5475l8.m29413j(bArr, m29413j14, c5458k8);
                        c5629u94.m29686f(AbstractC5306b9.m28949a(c5458k8.f32457a));
                    }
                    return m29413j13;
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    C5460ka c5460ka5 = (C5460ka) interfaceC5714z9;
                    int m29413j15 = AbstractC5475l8.m29413j(bArr, i21, c5458k8);
                    int i42 = c5458k8.f32457a + m29413j15;
                    while (m29413j15 < i42) {
                        m29413j15 = AbstractC5475l8.m29416m(bArr, m29413j15, c5458k8);
                        c5460ka5.m29367g(AbstractC5306b9.m28950b(c5458k8.f32458b));
                    }
                    if (m29413j15 == i42) {
                        return m29413j15;
                    }
                    throw zzll.m30122f();
                }
                if (i15 == 0) {
                    C5460ka c5460ka6 = (C5460ka) interfaceC5714z9;
                    int m29416m2 = AbstractC5475l8.m29416m(bArr, i21, c5458k8);
                    c5460ka6.m29367g(AbstractC5306b9.m28950b(c5458k8.f32458b));
                    while (m29416m2 < i12) {
                        int m29413j16 = AbstractC5475l8.m29413j(bArr, m29416m2, c5458k8);
                        if (i13 != c5458k8.f32457a) {
                            return m29416m2;
                        }
                        m29416m2 = AbstractC5475l8.m29416m(bArr, m29413j16, c5458k8);
                        c5460ka6.m29367g(AbstractC5306b9.m28950b(c5458k8.f32458b));
                    }
                    return m29416m2;
                }
                break;
            default:
                if (i15 == 3) {
                    InterfaceC5393gb m30067h = m30067h(i16);
                    int i43 = (i13 & (-8)) | 4;
                    int m29406c = AbstractC5475l8.m29406c(m30067h, bArr, i11, i12, i43, c5458k8);
                    interfaceC5714z9.add(c5458k8.f32459c);
                    while (m29406c < i12) {
                        int m29413j17 = AbstractC5475l8.m29413j(bArr, m29406c, c5458k8);
                        if (i13 != c5458k8.f32457a) {
                            return m29406c;
                        }
                        m29406c = AbstractC5475l8.m29406c(m30067h, bArr, m29413j17, i12, i43, c5458k8);
                        interfaceC5714z9.add(c5458k8.f32459c);
                    }
                    return m29406c;
                }
                break;
        }
        return i21;
    }

    /* renamed from: M */
    private final int m30059M(int i11) {
        if (i11 >= this.f32934c && i11 <= this.f32935d) {
            return m30062P(i11, 0);
        }
        return -1;
    }

    /* renamed from: N */
    private final int m30060N(int i11, int i12) {
        if (i11 >= this.f32934c && i11 <= this.f32935d) {
            return m30062P(i11, i12);
        }
        return -1;
    }

    /* renamed from: O */
    private final int m30061O(int i11) {
        return this.f32932a[i11 + 2];
    }

    /* renamed from: P */
    private final int m30062P(int i11, int i12) {
        int length = (this.f32932a.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.f32932a[i14];
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

    /* renamed from: Q */
    private static int m30063Q(int i11) {
        return (i11 >>> 20) & 255;
    }

    /* renamed from: R */
    private final int m30064R(int i11) {
        return this.f32932a[i11 + 1];
    }

    /* renamed from: S */
    private static long m30065S(Object obj, long j11) {
        return ((Long) AbstractC5648vb.m29791k(obj, j11)).longValue();
    }

    /* renamed from: g */
    private final InterfaceC5663w9 m30066g(int i11) {
        int i12 = i11 / 3;
        return (InterfaceC5663w9) this.f32933b[i12 + i12 + 1];
    }

    /* renamed from: h */
    private final InterfaceC5393gb m30067h(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        InterfaceC5393gb interfaceC5393gb = (InterfaceC5393gb) this.f32933b[i13];
        if (interfaceC5393gb != null) {
            return interfaceC5393gb;
        }
        InterfaceC5393gb m29066b = C5342db.m29065a().m29066b((Class) this.f32933b[i13 + 1]);
        this.f32933b[i13] = m29066b;
        return m29066b;
    }

    /* renamed from: i */
    private final Object m30068i(int i11) {
        int i12 = i11 / 3;
        return this.f32933b[i12 + i12];
    }

    /* renamed from: j */
    private final Object m30069j(Object obj, int i11) {
        InterfaceC5393gb m30067h = m30067h(i11);
        int m30064R = m30064R(i11) & 1048575;
        if (!m30081v(obj, i11)) {
            return m30067h.zze();
        }
        Object object = f32931q.getObject(obj, m30064R);
        if (m30084y(object)) {
            return object;
        }
        Object zze = m30067h.zze();
        if (object != null) {
            m30067h.mo29156b(zze, object);
        }
        return zze;
    }

    /* renamed from: k */
    private final Object m30070k(Object obj, int i11, int i12) {
        InterfaceC5393gb m30067h = m30067h(i12);
        if (!m30085z(obj, i11, i12)) {
            return m30067h.zze();
        }
        Object object = f32931q.getObject(obj, m30064R(i12) & 1048575);
        if (m30084y(object)) {
            return object;
        }
        Object zze = m30067h.zze();
        if (object != null) {
            m30067h.mo29156b(zze, object);
        }
        return zze;
    }

    /* renamed from: l */
    private static Field m30071l(Class cls, String str) {
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

    /* renamed from: m */
    private static void m30072m(Object obj) {
        if (m30084y(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: n */
    private final void m30073n(Object obj, Object obj2, int i11) {
        if (!m30081v(obj2, i11)) {
            return;
        }
        int m30064R = m30064R(i11) & 1048575;
        Unsafe unsafe = f32931q;
        long j11 = m30064R;
        Object object = unsafe.getObject(obj2, j11);
        if (object != null) {
            InterfaceC5393gb m30067h = m30067h(i11);
            if (!m30081v(obj, i11)) {
                if (!m30084y(object)) {
                    unsafe.putObject(obj, j11, object);
                } else {
                    Object zze = m30067h.zze();
                    m30067h.mo29156b(zze, object);
                    unsafe.putObject(obj, j11, zze);
                }
                m30075p(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!m30084y(object2)) {
                Object zze2 = m30067h.zze();
                m30067h.mo29156b(zze2, object2);
                unsafe.putObject(obj, j11, zze2);
                object2 = zze2;
            }
            m30067h.mo29156b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f32932a[i11] + " is present but null: " + obj2.toString());
    }

    /* renamed from: o */
    private final void m30074o(Object obj, Object obj2, int i11) {
        int i12 = this.f32932a[i11];
        if (!m30085z(obj2, i12, i11)) {
            return;
        }
        int m30064R = m30064R(i11) & 1048575;
        Unsafe unsafe = f32931q;
        long j11 = m30064R;
        Object object = unsafe.getObject(obj2, j11);
        if (object != null) {
            InterfaceC5393gb m30067h = m30067h(i11);
            if (!m30085z(obj, i12, i11)) {
                if (!m30084y(object)) {
                    unsafe.putObject(obj, j11, object);
                } else {
                    Object zze = m30067h.zze();
                    m30067h.mo29156b(zze, object);
                    unsafe.putObject(obj, j11, zze);
                }
                m30076q(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!m30084y(object2)) {
                Object zze2 = m30067h.zze();
                m30067h.mo29156b(zze2, object2);
                unsafe.putObject(obj, j11, zze2);
                object2 = zze2;
            }
            m30067h.mo29156b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f32932a[i11] + " is present but null: " + obj2.toString());
    }

    /* renamed from: p */
    private final void m30075p(Object obj, int i11) {
        int m30061O = m30061O(i11);
        long j11 = 1048575 & m30061O;
        if (j11 == 1048575) {
            return;
        }
        AbstractC5648vb.m29802v(obj, j11, (1 << (m30061O >>> 20)) | AbstractC5648vb.m29788h(obj, j11));
    }

    /* renamed from: q */
    private final void m30076q(Object obj, int i11, int i12) {
        AbstractC5648vb.m29802v(obj, m30061O(i12) & 1048575, i11);
    }

    /* renamed from: r */
    private final void m30077r(Object obj, int i11, Object obj2) {
        f32931q.putObject(obj, m30064R(i11) & 1048575, obj2);
        m30075p(obj, i11);
    }

    /* renamed from: s */
    private final void m30078s(Object obj, int i11, int i12, Object obj2) {
        f32931q.putObject(obj, m30064R(i12) & 1048575, obj2);
        m30076q(obj, i11, i12);
    }

    /* renamed from: t */
    private final void m30079t(InterfaceC5326cc interfaceC5326cc, int i11, Object obj, int i12) {
        if (obj == null) {
            return;
        }
        AbstractC1158c0.m5500a(m30068i(i12));
        throw null;
    }

    /* renamed from: u */
    private final boolean m30080u(Object obj, Object obj2, int i11) {
        if (m30081v(obj, i11) == m30081v(obj2, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private final boolean m30081v(Object obj, int i11) {
        int m30061O = m30061O(i11);
        long j11 = m30061O & 1048575;
        if (j11 == 1048575) {
            int m30064R = m30064R(i11);
            long j12 = m30064R & 1048575;
            switch (m30063Q(m30064R)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC5648vb.m29786f(obj, j12)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC5648vb.m29787g(obj, j12)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC5648vb.m29789i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC5648vb.m29789i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC5648vb.m29788h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC5648vb.m29789i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC5648vb.m29788h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC5648vb.m29777B(obj, j12);
                case 8:
                    Object m29791k = AbstractC5648vb.m29791k(obj, j12);
                    if (m29791k instanceof String) {
                        if (((String) m29791k).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (m29791k instanceof AbstractC5679x8) {
                        if (AbstractC5679x8.f32911q.equals(m29791k)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC5648vb.m29791k(obj, j12) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC5679x8.f32911q.equals(AbstractC5648vb.m29791k(obj, j12))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC5648vb.m29788h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC5648vb.m29788h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC5648vb.m29788h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC5648vb.m29789i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC5648vb.m29788h(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (AbstractC5648vb.m29789i(obj, j12) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC5648vb.m29791k(obj, j12) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC5648vb.m29788h(obj, j11) & (1 << (m30061O >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private final boolean m30082w(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return m30081v(obj, i11);
        }
        if ((i13 & i14) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private static boolean m30083x(Object obj, int i11, InterfaceC5393gb interfaceC5393gb) {
        return interfaceC5393gb.mo29158d(AbstractC5648vb.m29791k(obj, i11 & 1048575));
    }

    /* renamed from: y */
    private static boolean m30084y(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5612t9) {
            return ((AbstractC5612t9) obj).m29654x();
        }
        return true;
    }

    /* renamed from: z */
    private final boolean m30085z(Object obj, int i11, int i12) {
        if (AbstractC5648vb.m29788h(obj, m30061O(i12) & 1048575) == i11) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x008b. Please report as an issue. */
    /* renamed from: C */
    public final int m30086C(Object obj, byte[] bArr, int i11, int i12, int i13, C5458k8 c5458k8) {
        Unsafe unsafe;
        int i14;
        C5698ya c5698ya;
        Object obj2;
        int i15;
        int m30059M;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        C5425i9 c5425i9;
        int i24;
        int i25;
        byte[] bArr2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        byte[] bArr3;
        int i34;
        int i35;
        C5698ya c5698ya2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i36 = i12;
        int i37 = i13;
        C5458k8 c5458k82 = c5458k8;
        m30072m(obj);
        Unsafe unsafe2 = f32931q;
        int i38 = -1;
        int i39 = i11;
        int i41 = -1;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 1048575;
        while (true) {
            if (i39 < i36) {
                int i46 = i39 + 1;
                byte b11 = bArr4[i39];
                if (b11 < 0) {
                    int m29414k = AbstractC5475l8.m29414k(b11, bArr4, i46, c5458k82);
                    i15 = c5458k82.f32457a;
                    i46 = m29414k;
                } else {
                    i15 = b11;
                }
                int i47 = i15 >>> 3;
                if (i47 > i41) {
                    m30059M = c5698ya2.m30060N(i47, i42 / 3);
                } else {
                    m30059M = c5698ya2.m30059M(i47);
                }
                int i48 = m30059M;
                if (i48 == i38) {
                    i16 = i47;
                    i17 = i46;
                    i18 = i15;
                    i19 = i44;
                    unsafe = unsafe2;
                    i21 = i37;
                    i22 = 0;
                } else {
                    int i49 = i15 & 7;
                    int[] iArr = c5698ya2.f32932a;
                    int i51 = iArr[i48 + 1];
                    int m30063Q = m30063Q(i51);
                    int i52 = i15;
                    long j11 = i51 & 1048575;
                    if (m30063Q <= 17) {
                        int i53 = iArr[i48 + 2];
                        int i54 = 1 << (i53 >>> 20);
                        int i55 = i53 & 1048575;
                        if (i55 != i45) {
                            if (i45 != 1048575) {
                                unsafe2.putInt(obj3, i45, i44);
                            }
                            i25 = i55;
                            i24 = unsafe2.getInt(obj3, i55);
                        } else {
                            i24 = i44;
                            i25 = i45;
                        }
                        switch (m30063Q) {
                            case 0:
                                bArr2 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i29 = i46;
                                i31 = i54;
                                i32 = i52;
                                if (i49 != 1) {
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    AbstractC5648vb.m29800t(obj3, j11, Double.longBitsToDouble(AbstractC5475l8.m29419p(bArr2, i29)));
                                    i39 = i29 + 8;
                                    i44 = i24 | i31;
                                    i36 = i12;
                                    bArr4 = bArr2;
                                    i42 = i27;
                                    i41 = i26;
                                    i43 = i32;
                                    i38 = -1;
                                    i45 = i28;
                                    i37 = i13;
                                }
                            case 1:
                                bArr2 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i29 = i46;
                                i31 = i54;
                                i32 = i52;
                                if (i49 != 5) {
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    AbstractC5648vb.m29801u(obj3, j11, Float.intBitsToFloat(AbstractC5475l8.m29405b(bArr2, i29)));
                                    i39 = i29 + 4;
                                    i44 = i24 | i31;
                                    i36 = i12;
                                    bArr4 = bArr2;
                                    i42 = i27;
                                    i41 = i26;
                                    i43 = i32;
                                    i38 = -1;
                                    i45 = i28;
                                    i37 = i13;
                                }
                            case 2:
                            case 3:
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i29 = i46;
                                i32 = i52;
                                if (i49 != 0) {
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    int m29416m = AbstractC5475l8.m29416m(bArr, i29, c5458k82);
                                    unsafe2.putLong(obj, j11, c5458k82.f32458b);
                                    i44 = i24 | i54;
                                    bArr4 = bArr;
                                    i42 = i27;
                                    i39 = m29416m;
                                    i41 = i26;
                                    i43 = i32;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i29 = i46;
                                i31 = i54;
                                i32 = i52;
                                if (i49 != 0) {
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    i39 = AbstractC5475l8.m29413j(bArr2, i29, c5458k82);
                                    unsafe2.putInt(obj3, j11, c5458k82.f32457a);
                                    i44 = i24 | i31;
                                    i36 = i12;
                                    bArr4 = bArr2;
                                    i42 = i27;
                                    i41 = i26;
                                    i43 = i32;
                                    i38 = -1;
                                    i45 = i28;
                                    i37 = i13;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                i31 = i54;
                                if (i49 != 1) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    i32 = i33;
                                    i29 = i46;
                                    unsafe2.putLong(obj, j11, AbstractC5475l8.m29419p(bArr2, i46));
                                    i39 = i29 + 8;
                                    i44 = i24 | i31;
                                    i36 = i12;
                                    bArr4 = bArr2;
                                    i42 = i27;
                                    i41 = i26;
                                    i43 = i32;
                                    i38 = -1;
                                    i45 = i28;
                                    i37 = i13;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 5) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j11, AbstractC5475l8.m29405b(bArr3, i46));
                                    i39 = i46 + 4;
                                    i44 = i24 | i54;
                                    bArr4 = bArr3;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case 7:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 0) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    i39 = AbstractC5475l8.m29416m(bArr3, i46, c5458k82);
                                    AbstractC5648vb.m29798r(obj3, j11, c5458k82.f32458b != 0);
                                    i44 = i24 | i54;
                                    bArr4 = bArr3;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case 8:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 2) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    if ((536870912 & i51) == 0) {
                                        i39 = AbstractC5475l8.m29410g(bArr3, i46, c5458k82);
                                    } else {
                                        i39 = AbstractC5475l8.m29411h(bArr3, i46, c5458k82);
                                    }
                                    unsafe2.putObject(obj3, j11, c5458k82.f32459c);
                                    i44 = i24 | i54;
                                    bArr4 = bArr3;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case 9:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 2) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    Object m30069j = c5698ya2.m30069j(obj3, i27);
                                    i39 = AbstractC5475l8.m29418o(m30069j, c5698ya2.m30067h(i27), bArr, i46, i12, c5458k8);
                                    c5698ya2.m30077r(obj3, i27, m30069j);
                                    i44 = i24 | i54;
                                    bArr4 = bArr3;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case 10:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 2) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    i39 = AbstractC5475l8.m29404a(bArr3, i46, c5458k82);
                                    unsafe2.putObject(obj3, j11, c5458k82.f32459c);
                                    i44 = i24 | i54;
                                    bArr4 = bArr3;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case 12:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 0) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    i39 = AbstractC5475l8.m29413j(bArr3, i46, c5458k82);
                                    int i56 = c5458k82.f32457a;
                                    InterfaceC5663w9 m30066g = c5698ya2.m30066g(i27);
                                    if (m30066g != null && !m30066g.mo29054a(i56)) {
                                        m30050D(obj).m29451j(i33, Long.valueOf(i56));
                                        i42 = i27;
                                        i44 = i24;
                                        i43 = i33;
                                        i41 = i26;
                                        i38 = -1;
                                        i36 = i12;
                                        i37 = i13;
                                        bArr4 = bArr3;
                                        i45 = i28;
                                    } else {
                                        unsafe2.putInt(obj3, j11, i56);
                                        i44 = i24 | i54;
                                        bArr4 = bArr3;
                                        i42 = i27;
                                        i43 = i33;
                                        i41 = i26;
                                        i38 = -1;
                                        i45 = i28;
                                        i36 = i12;
                                        i37 = i13;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 0) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    i39 = AbstractC5475l8.m29413j(bArr3, i46, c5458k82);
                                    unsafe2.putInt(obj3, j11, AbstractC5306b9.m28949a(c5458k82.f32457a));
                                    i44 = i24 | i54;
                                    bArr4 = bArr3;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                i26 = i47;
                                i27 = i48;
                                i28 = i25;
                                i33 = i52;
                                if (i49 != 0) {
                                    i32 = i33;
                                    i29 = i46;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    int m29416m2 = AbstractC5475l8.m29416m(bArr, i46, c5458k82);
                                    unsafe2.putLong(obj, j11, AbstractC5306b9.m28950b(c5458k82.f32458b));
                                    i44 = i24 | i54;
                                    bArr4 = bArr;
                                    i39 = m29416m2;
                                    i42 = i27;
                                    i43 = i33;
                                    i41 = i26;
                                    i38 = -1;
                                    i45 = i28;
                                    i36 = i12;
                                    i37 = i13;
                                }
                            default:
                                if (i49 != 3) {
                                    i26 = i47;
                                    i27 = i48;
                                    i28 = i25;
                                    i29 = i46;
                                    i32 = i52;
                                    i45 = i28;
                                    i21 = i13;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i24;
                                    i17 = i29;
                                    i16 = i26;
                                    i18 = i32;
                                    break;
                                } else {
                                    Object m30069j2 = c5698ya2.m30069j(obj3, i48);
                                    i39 = AbstractC5475l8.m29417n(m30069j2, c5698ya2.m30067h(i48), bArr, i46, i12, (i47 << 3) | 4, c5458k8);
                                    c5698ya2.m30077r(obj3, i48, m30069j2);
                                    i44 = i24 | i54;
                                    bArr4 = bArr;
                                    i45 = i25;
                                    i42 = i48;
                                    i43 = i52;
                                    i41 = i47;
                                    i38 = -1;
                                    i36 = i12;
                                    i37 = i13;
                                }
                        }
                    } else {
                        int i57 = i46;
                        if (m30063Q != 27) {
                            i19 = i44;
                            i34 = i45;
                            if (m30063Q <= 49) {
                                unsafe = unsafe2;
                                i22 = i48;
                                i16 = i47;
                                i39 = m30058L(obj, bArr, i57, i12, i52, i47, i49, i48, i51, m30063Q, j11, c5458k8);
                                if (i39 != i57) {
                                    c5698ya2 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i36 = i12;
                                    i37 = i13;
                                    c5458k82 = c5458k8;
                                    i44 = i19;
                                    i43 = i52;
                                    i45 = i34;
                                    i42 = i22;
                                    i41 = i16;
                                    unsafe2 = unsafe;
                                    i38 = -1;
                                } else {
                                    i17 = i39;
                                    i18 = i52;
                                    i45 = i34;
                                    i21 = i13;
                                }
                            } else {
                                unsafe = unsafe2;
                                i22 = i48;
                                i16 = i47;
                                i35 = i57;
                                if (m30063Q != 50) {
                                    i39 = m30057K(obj, bArr, i35, i12, i52, i16, i49, i51, m30063Q, j11, i22, c5458k8);
                                    if (i39 != i35) {
                                        c5698ya2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i36 = i12;
                                        i37 = i13;
                                        c5458k82 = c5458k8;
                                        i44 = i19;
                                        i43 = i52;
                                        i45 = i34;
                                        i42 = i22;
                                        i41 = i16;
                                        unsafe2 = unsafe;
                                        i38 = -1;
                                    } else {
                                        i17 = i39;
                                        i18 = i52;
                                        i45 = i34;
                                        i21 = i13;
                                    }
                                } else if (i49 == 2) {
                                    i39 = m30056J(obj, bArr, i35, i12, i22, j11, c5458k8);
                                    if (i39 != i35) {
                                        c5698ya2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i36 = i12;
                                        i37 = i13;
                                        c5458k82 = c5458k8;
                                        i44 = i19;
                                        i43 = i52;
                                        i45 = i34;
                                        i42 = i22;
                                        i41 = i16;
                                        unsafe2 = unsafe;
                                        i38 = -1;
                                    } else {
                                        i17 = i39;
                                        i18 = i52;
                                        i45 = i34;
                                        i21 = i13;
                                    }
                                }
                            }
                        } else if (i49 == 2) {
                            InterfaceC5714z9 interfaceC5714z9 = (InterfaceC5714z9) unsafe2.getObject(obj3, j11);
                            if (!interfaceC5714z9.zzc()) {
                                int size = interfaceC5714z9.size();
                                interfaceC5714z9 = interfaceC5714z9.mo28992c(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j11, interfaceC5714z9);
                            }
                            i39 = AbstractC5475l8.m29408e(c5698ya2.m30067h(i48), i52, bArr, i57, i12, interfaceC5714z9, c5458k8);
                            i36 = i12;
                            i42 = i48;
                            i41 = i47;
                            i44 = i44;
                            i43 = i52;
                            i45 = i45;
                            i38 = -1;
                            bArr4 = bArr;
                            i37 = i13;
                        } else {
                            i19 = i44;
                            i34 = i45;
                            unsafe = unsafe2;
                            i22 = i48;
                            i16 = i47;
                            i35 = i57;
                        }
                        i21 = i13;
                        i17 = i35;
                        i18 = i52;
                        i45 = i34;
                    }
                }
                if (i18 != i21 || i21 == 0) {
                    int i58 = i21;
                    if (this.f32937f && (c5425i9 = c5458k8.f32460d) != C5425i9.f32416c) {
                        i23 = i16;
                        c5425i9.m29213b(this.f32936e, i23);
                        i39 = AbstractC5475l8.m29412i(i18, bArr, i17, i12, m30050D(obj), c5458k8);
                    } else {
                        i23 = i16;
                        i39 = AbstractC5475l8.m29412i(i18, bArr, i17, i12, m30050D(obj), c5458k8);
                    }
                    obj3 = obj;
                    bArr4 = bArr;
                    i36 = i12;
                    i43 = i18;
                    c5698ya2 = this;
                    i41 = i23;
                    i44 = i19;
                    i42 = i22;
                    i38 = -1;
                    i37 = i58;
                    c5458k82 = c5458k8;
                    unsafe2 = unsafe;
                } else {
                    c5698ya = this;
                    i14 = i21;
                    i39 = i17;
                    i43 = i18;
                    i44 = i19;
                }
            } else {
                unsafe = unsafe2;
                i14 = i37;
                c5698ya = c5698ya2;
            }
        }
        if (i45 != 1048575) {
            obj2 = obj;
            unsafe.putInt(obj2, i45, i44);
        } else {
            obj2 = obj;
        }
        for (int i59 = c5698ya.f32940i; i59 < c5698ya.f32941j; i59++) {
            int i61 = c5698ya.f32939h[i59];
            int i62 = c5698ya.f32932a[i61];
            Object m29791k = AbstractC5648vb.m29791k(obj2, c5698ya.m30064R(i61) & 1048575);
            if (m29791k != null && c5698ya.m30066g(i61) != null) {
                AbstractC1158c0.m5500a(c5698ya.m30068i(i61));
                throw null;
            }
        }
        if (i14 == 0) {
            if (i39 != i12) {
                throw zzll.m30121e();
            }
        } else if (i39 > i12 || i43 != i14) {
            throw zzll.m30121e();
        }
        return i39;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: a */
    public final void mo29155a(Object obj) {
        if (!m30084y(obj)) {
            return;
        }
        if (obj instanceof AbstractC5612t9) {
            AbstractC5612t9 abstractC5612t9 = (AbstractC5612t9) obj;
            abstractC5612t9.m29653w(Integer.MAX_VALUE);
            abstractC5612t9.zzb = 0;
            abstractC5612t9.m29652u();
        }
        int length = this.f32932a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int m30064R = m30064R(i11);
            int i12 = 1048575 & m30064R;
            int m30063Q = m30063Q(m30064R);
            long j11 = i12;
            if (m30063Q != 9) {
                if (m30063Q != 60 && m30063Q != 68) {
                    switch (m30063Q) {
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
                            this.f32942k.mo29140a(obj, j11);
                            break;
                        case 50:
                            Unsafe unsafe = f32931q;
                            Object object = unsafe.getObject(obj, j11);
                            if (object != null) {
                                ((C5545pa) object).m29533c();
                                unsafe.putObject(obj, j11, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (m30085z(obj, this.f32932a[i11], i11)) {
                    m30067h(i11).mo29155a(f32931q.getObject(obj, j11));
                }
            }
            if (m30081v(obj, i11)) {
                m30067h(i11).mo29155a(f32931q.getObject(obj, j11));
            }
        }
        this.f32943l.mo29430g(obj);
        if (this.f32937f) {
            this.f32944m.mo29282b(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: b */
    public final void mo29156b(Object obj, Object obj2) {
        m30072m(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.f32932a.length; i11 += 3) {
            int m30064R = m30064R(i11);
            int i12 = this.f32932a[i11];
            long j11 = 1048575 & m30064R;
            switch (m30063Q(m30064R)) {
                case 0:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29800t(obj, j11, AbstractC5648vb.m29786f(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29801u(obj, j11, AbstractC5648vb.m29787g(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29803w(obj, j11, AbstractC5648vb.m29789i(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29803w(obj, j11, AbstractC5648vb.m29789i(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29802v(obj, j11, AbstractC5648vb.m29788h(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29803w(obj, j11, AbstractC5648vb.m29789i(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29802v(obj, j11, AbstractC5648vb.m29788h(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29798r(obj, j11, AbstractC5648vb.m29777B(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29804x(obj, j11, AbstractC5648vb.m29791k(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m30073n(obj, obj2, i11);
                    break;
                case 10:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29804x(obj, j11, AbstractC5648vb.m29791k(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29802v(obj, j11, AbstractC5648vb.m29788h(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29802v(obj, j11, AbstractC5648vb.m29788h(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29802v(obj, j11, AbstractC5648vb.m29788h(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29803w(obj, j11, AbstractC5648vb.m29789i(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29802v(obj, j11, AbstractC5648vb.m29788h(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m30081v(obj2, i11)) {
                        AbstractC5648vb.m29803w(obj, j11, AbstractC5648vb.m29789i(obj2, j11));
                        m30075p(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m30073n(obj, obj2, i11);
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
                    this.f32942k.mo29141b(obj, obj2, j11);
                    break;
                case 50:
                    int i13 = AbstractC5427ib.f32422e;
                    AbstractC5648vb.m29804x(obj, j11, C5562qa.m29563b(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11)));
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
                    if (m30085z(obj2, i12, i11)) {
                        AbstractC5648vb.m29804x(obj, j11, AbstractC5648vb.m29791k(obj2, j11));
                        m30076q(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m30074o(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m30085z(obj2, i12, i11)) {
                        AbstractC5648vb.m29804x(obj, j11, AbstractC5648vb.m29791k(obj2, j11));
                        m30076q(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m30074o(obj, obj2, i11);
                    break;
            }
        }
        AbstractC5427ib.m29240c(this.f32943l, obj, obj2);
        if (!this.f32937f) {
            return;
        }
        this.f32944m.mo29281a(obj2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo29157c(Object obj, Object obj2) {
        boolean m29260w;
        int length = this.f32932a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int m30064R = m30064R(i11);
            long j11 = m30064R & 1048575;
            switch (m30063Q(m30064R)) {
                case 0:
                    if (m30080u(obj, obj2, i11) && Double.doubleToLongBits(AbstractC5648vb.m29786f(obj, j11)) == Double.doubleToLongBits(AbstractC5648vb.m29786f(obj2, j11))) {
                    }
                    return false;
                case 1:
                    if (m30080u(obj, obj2, i11) && Float.floatToIntBits(AbstractC5648vb.m29787g(obj, j11)) == Float.floatToIntBits(AbstractC5648vb.m29787g(obj2, j11))) {
                    }
                    return false;
                case 2:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29789i(obj, j11) == AbstractC5648vb.m29789i(obj2, j11)) {
                    }
                    return false;
                case 3:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29789i(obj, j11) == AbstractC5648vb.m29789i(obj2, j11)) {
                    }
                    return false;
                case 4:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29788h(obj, j11) == AbstractC5648vb.m29788h(obj2, j11)) {
                    }
                    return false;
                case 5:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29789i(obj, j11) == AbstractC5648vb.m29789i(obj2, j11)) {
                    }
                    return false;
                case 6:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29788h(obj, j11) == AbstractC5648vb.m29788h(obj2, j11)) {
                    }
                    return false;
                case 7:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29777B(obj, j11) == AbstractC5648vb.m29777B(obj2, j11)) {
                    }
                    return false;
                case 8:
                    if (m30080u(obj, obj2, i11) && AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11))) {
                    }
                    return false;
                case 9:
                    if (m30080u(obj, obj2, i11) && AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11))) {
                    }
                    return false;
                case 10:
                    if (m30080u(obj, obj2, i11) && AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11))) {
                    }
                    return false;
                case 11:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29788h(obj, j11) == AbstractC5648vb.m29788h(obj2, j11)) {
                    }
                    return false;
                case 12:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29788h(obj, j11) == AbstractC5648vb.m29788h(obj2, j11)) {
                    }
                    return false;
                case 13:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29788h(obj, j11) == AbstractC5648vb.m29788h(obj2, j11)) {
                    }
                    return false;
                case 14:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29789i(obj, j11) == AbstractC5648vb.m29789i(obj2, j11)) {
                    }
                    return false;
                case 15:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29788h(obj, j11) == AbstractC5648vb.m29788h(obj2, j11)) {
                    }
                    return false;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    if (m30080u(obj, obj2, i11) && AbstractC5648vb.m29789i(obj, j11) == AbstractC5648vb.m29789i(obj2, j11)) {
                    }
                    return false;
                case 17:
                    if (m30080u(obj, obj2, i11) && AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11))) {
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
                    m29260w = AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11));
                    if (m29260w) {
                        return false;
                    }
                case 50:
                    m29260w = AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11));
                    if (m29260w) {
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
                    long m30061O = m30061O(i11) & 1048575;
                    if (AbstractC5648vb.m29788h(obj, m30061O) == AbstractC5648vb.m29788h(obj2, m30061O) && AbstractC5427ib.m29260w(AbstractC5648vb.m29791k(obj, j11), AbstractC5648vb.m29791k(obj2, j11))) {
                    }
                    return false;
                default:
            }
        }
        if (!this.f32943l.mo29427d(obj).equals(this.f32943l.mo29427d(obj2))) {
            return false;
        }
        if (!this.f32937f) {
            return true;
        }
        this.f32944m.mo29281a(obj);
        this.f32944m.mo29281a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: d */
    public final boolean mo29158d(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f32940i) {
            int i16 = this.f32939h[i15];
            int i17 = this.f32932a[i16];
            int m30064R = m30064R(i16);
            int i18 = this.f32932a[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f32931q.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i13;
                i12 = i14;
            }
            if ((268435456 & m30064R) != 0 && !m30082w(obj, i16, i11, i12, i21)) {
                return false;
            }
            int m30063Q = m30063Q(m30064R);
            if (m30063Q != 9 && m30063Q != 17) {
                if (m30063Q != 27) {
                    if (m30063Q != 60 && m30063Q != 68) {
                        if (m30063Q != 49) {
                            if (m30063Q == 50 && !((C5545pa) AbstractC5648vb.m29791k(obj, m30064R & 1048575)).isEmpty()) {
                                AbstractC1158c0.m5500a(m30068i(i16));
                                throw null;
                            }
                        }
                    } else if (m30085z(obj, i17, i16) && !m30083x(obj, m30064R, m30067h(i16))) {
                        return false;
                    }
                }
                List list = (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC5393gb m30067h = m30067h(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!m30067h.mo29158d(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (m30082w(obj, i16, i11, i12, i21) && !m30083x(obj, m30064R, m30067h(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        if (!this.f32937f) {
            return true;
        }
        this.f32944m.mo29281a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: e */
    public final void mo29159e(Object obj, InterfaceC5326cc interfaceC5326cc) {
        int i11;
        int i12 = 1048575;
        if (this.f32938g) {
            if (!this.f32937f) {
                int length = this.f32932a.length;
                for (int i13 = 0; i13 < length; i13 += 3) {
                    int m30064R = m30064R(i13);
                    int i14 = this.f32932a[i13];
                    switch (m30063Q(m30064R)) {
                        case 0:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29011i(i14, AbstractC5648vb.m29786f(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29028z(i14, AbstractC5648vb.m29787g(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29007e(i14, AbstractC5648vb.m29789i(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo28998E(i14, AbstractC5648vb.m29789i(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29020r(i14, AbstractC5648vb.m29788h(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29003a(i14, AbstractC5648vb.m29789i(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29021s(i14, AbstractC5648vb.m29788h(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29005c(i14, AbstractC5648vb.m29777B(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m30081v(obj, i13)) {
                                m30049B(i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29001H(i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), m30067h(i13));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29002I(i14, (AbstractC5679x8) AbstractC5648vb.m29791k(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29018p(i14, AbstractC5648vb.m29788h(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29025w(i14, AbstractC5648vb.m29788h(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29013k(i14, AbstractC5648vb.m29788h(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29022t(i14, AbstractC5648vb.m29789i(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29014l(i14, AbstractC5648vb.m29788h(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29017o(i14, AbstractC5648vb.m29789i(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m30081v(obj, i13)) {
                                interfaceC5326cc.mo29000G(i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), m30067h(i13));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            AbstractC5427ib.m29244g(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 19:
                            AbstractC5427ib.m29248k(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 20:
                            AbstractC5427ib.m29251n(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 21:
                            AbstractC5427ib.m29259v(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 22:
                            AbstractC5427ib.m29250m(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 23:
                            AbstractC5427ib.m29247j(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 24:
                            AbstractC5427ib.m29246i(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 25:
                            AbstractC5427ib.m29242e(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 26:
                            AbstractC5427ib.m29257t(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc);
                            break;
                        case 27:
                            AbstractC5427ib.m29252o(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, m30067h(i13));
                            break;
                        case 28:
                            AbstractC5427ib.m29243f(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc);
                            break;
                        case 29:
                            AbstractC5427ib.m29258u(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            AbstractC5427ib.m29245h(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 31:
                            AbstractC5427ib.m29253p(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            AbstractC5427ib.m29254q(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 33:
                            AbstractC5427ib.m29255r(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 34:
                            AbstractC5427ib.m29256s(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, false);
                            break;
                        case 35:
                            AbstractC5427ib.m29244g(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 36:
                            AbstractC5427ib.m29248k(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 37:
                            AbstractC5427ib.m29251n(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 38:
                            AbstractC5427ib.m29259v(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 39:
                            AbstractC5427ib.m29250m(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 40:
                            AbstractC5427ib.m29247j(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            AbstractC5427ib.m29246i(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 42:
                            AbstractC5427ib.m29242e(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 43:
                            AbstractC5427ib.m29258u(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            AbstractC5427ib.m29245h(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 45:
                            AbstractC5427ib.m29253p(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 46:
                            AbstractC5427ib.m29254q(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 47:
                            AbstractC5427ib.m29255r(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 48:
                            AbstractC5427ib.m29256s(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, true);
                            break;
                        case 49:
                            AbstractC5427ib.m29249l(i14, (List) AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc, m30067h(i13));
                            break;
                        case 50:
                            m30079t(interfaceC5326cc, i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), i13);
                            break;
                        case 51:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29011i(i14, m30052F(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29028z(i14, m30053G(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29007e(i14, m30065S(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo28998E(i14, m30065S(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29020r(i14, m30055I(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29003a(i14, m30065S(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29021s(i14, m30055I(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29005c(i14, m30048A(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m30085z(obj, i14, i13)) {
                                m30049B(i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), interfaceC5326cc);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29001H(i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), m30067h(i13));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29002I(i14, (AbstractC5679x8) AbstractC5648vb.m29791k(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29018p(i14, m30055I(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29025w(i14, m30055I(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29013k(i14, m30055I(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29022t(i14, m30065S(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29014l(i14, m30055I(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29017o(i14, m30065S(obj, m30064R & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m30085z(obj, i14, i13)) {
                                interfaceC5326cc.mo29000G(i14, AbstractC5648vb.m29791k(obj, m30064R & 1048575), m30067h(i13));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC5478lb abstractC5478lb = this.f32943l;
                abstractC5478lb.mo29432i(abstractC5478lb.mo29427d(obj), interfaceC5326cc);
                return;
            }
            this.f32944m.mo29281a(obj);
            throw null;
        }
        if (!this.f32937f) {
            int length2 = this.f32932a.length;
            Unsafe unsafe = f32931q;
            int i15 = 0;
            int i16 = 1048575;
            int i17 = 0;
            while (i15 < length2) {
                int m30064R2 = m30064R(i15);
                int[] iArr = this.f32932a;
                int i18 = iArr[i15];
                int m30063Q = m30063Q(m30064R2);
                if (m30063Q <= 17) {
                    int i19 = iArr[i15 + 2];
                    int i21 = i19 & i12;
                    if (i21 != i16) {
                        i17 = unsafe.getInt(obj, i21);
                        i16 = i21;
                    }
                    i11 = 1 << (i19 >>> 20);
                } else {
                    i11 = 0;
                }
                long j11 = m30064R2 & i12;
                switch (m30063Q) {
                    case 0:
                        if ((i17 & i11) == 0) {
                            break;
                        } else {
                            interfaceC5326cc.mo29011i(i18, AbstractC5648vb.m29786f(obj, j11));
                            continue;
                        }
                    case 1:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29028z(i18, AbstractC5648vb.m29787g(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29007e(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo28998E(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29020r(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29003a(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29021s(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29005c(i18, AbstractC5648vb.m29777B(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i17 & i11) != 0) {
                            m30049B(i18, unsafe.getObject(obj, j11), interfaceC5326cc);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29001H(i18, unsafe.getObject(obj, j11), m30067h(i15));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29002I(i18, (AbstractC5679x8) unsafe.getObject(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29018p(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29025w(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29013k(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29022t(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29014l(i18, unsafe.getInt(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29017o(i18, unsafe.getLong(obj, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i17 & i11) != 0) {
                            interfaceC5326cc.mo29000G(i18, unsafe.getObject(obj, j11), m30067h(i15));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        AbstractC5427ib.m29244g(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 19:
                        AbstractC5427ib.m29248k(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 20:
                        AbstractC5427ib.m29251n(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 21:
                        AbstractC5427ib.m29259v(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 22:
                        AbstractC5427ib.m29250m(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 23:
                        AbstractC5427ib.m29247j(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 24:
                        AbstractC5427ib.m29246i(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 25:
                        AbstractC5427ib.m29242e(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        continue;
                    case 26:
                        AbstractC5427ib.m29257t(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc);
                        break;
                    case 27:
                        AbstractC5427ib.m29252o(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, m30067h(i15));
                        break;
                    case 28:
                        AbstractC5427ib.m29243f(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc);
                        break;
                    case 29:
                        AbstractC5427ib.m29258u(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        AbstractC5427ib.m29245h(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        break;
                    case 31:
                        AbstractC5427ib.m29253p(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        AbstractC5427ib.m29254q(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        break;
                    case 33:
                        AbstractC5427ib.m29255r(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        break;
                    case 34:
                        AbstractC5427ib.m29256s(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, false);
                        break;
                    case 35:
                        AbstractC5427ib.m29244g(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 36:
                        AbstractC5427ib.m29248k(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 37:
                        AbstractC5427ib.m29251n(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 38:
                        AbstractC5427ib.m29259v(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 39:
                        AbstractC5427ib.m29250m(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 40:
                        AbstractC5427ib.m29247j(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        AbstractC5427ib.m29246i(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 42:
                        AbstractC5427ib.m29242e(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 43:
                        AbstractC5427ib.m29258u(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                        AbstractC5427ib.m29245h(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 45:
                        AbstractC5427ib.m29253p(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 46:
                        AbstractC5427ib.m29254q(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 47:
                        AbstractC5427ib.m29255r(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 48:
                        AbstractC5427ib.m29256s(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, true);
                        break;
                    case 49:
                        AbstractC5427ib.m29249l(this.f32932a[i15], (List) unsafe.getObject(obj, j11), interfaceC5326cc, m30067h(i15));
                        break;
                    case 50:
                        m30079t(interfaceC5326cc, i18, unsafe.getObject(obj, j11), i15);
                        break;
                    case 51:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29011i(i18, m30052F(obj, j11));
                            break;
                        }
                        break;
                    case 52:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29028z(i18, m30053G(obj, j11));
                            break;
                        }
                        break;
                    case 53:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29007e(i18, m30065S(obj, j11));
                            break;
                        }
                        break;
                    case 54:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo28998E(i18, m30065S(obj, j11));
                            break;
                        }
                        break;
                    case 55:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29020r(i18, m30055I(obj, j11));
                            break;
                        }
                        break;
                    case 56:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29003a(i18, m30065S(obj, j11));
                            break;
                        }
                        break;
                    case 57:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29021s(i18, m30055I(obj, j11));
                            break;
                        }
                        break;
                    case 58:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29005c(i18, m30048A(obj, j11));
                            break;
                        }
                        break;
                    case 59:
                        if (m30085z(obj, i18, i15)) {
                            m30049B(i18, unsafe.getObject(obj, j11), interfaceC5326cc);
                            break;
                        }
                        break;
                    case 60:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29001H(i18, unsafe.getObject(obj, j11), m30067h(i15));
                            break;
                        }
                        break;
                    case 61:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29002I(i18, (AbstractC5679x8) unsafe.getObject(obj, j11));
                            break;
                        }
                        break;
                    case 62:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29018p(i18, m30055I(obj, j11));
                            break;
                        }
                        break;
                    case 63:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29025w(i18, m30055I(obj, j11));
                            break;
                        }
                        break;
                    case 64:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29013k(i18, m30055I(obj, j11));
                            break;
                        }
                        break;
                    case 65:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29022t(i18, m30065S(obj, j11));
                            break;
                        }
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29014l(i18, m30055I(obj, j11));
                            break;
                        }
                        break;
                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29017o(i18, m30065S(obj, j11));
                            break;
                        }
                        break;
                    case 68:
                        if (m30085z(obj, i18, i15)) {
                            interfaceC5326cc.mo29000G(i18, unsafe.getObject(obj, j11), m30067h(i15));
                            break;
                        }
                        break;
                }
                i15 += 3;
                i12 = 1048575;
            }
            AbstractC5478lb abstractC5478lb2 = this.f32943l;
            abstractC5478lb2.mo29432i(abstractC5478lb2.mo29427d(obj), interfaceC5326cc);
            return;
        }
        this.f32944m.mo29281a(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02f0, code lost:            if (r0 != r24) goto L269;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f2, code lost:            r14 = r31;        r12 = r32;        r13 = r34;        r11 = r35;        r2 = r15;        r1 = r23;        r6 = r25;        r7 = r26;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0305, code lost:            r2 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0335, code lost:            if (r0 != r14) goto L269;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0354, code lost:            if (r0 != r14) goto L269;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo29160f(Object obj, byte[] bArr, int i11, int i12, C5458k8 c5458k8) {
        int i13;
        int i14;
        int m30059M;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        Unsafe unsafe2;
        int i18;
        Unsafe unsafe3;
        C5698ya c5698ya;
        Unsafe unsafe4;
        int i19;
        int i21;
        int i22;
        C5698ya c5698ya2 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i23 = i12;
        C5458k8 c5458k82 = c5458k8;
        if (c5698ya2.f32938g) {
            m30072m(obj);
            Unsafe unsafe5 = f32931q;
            int i24 = -1;
            int i25 = 1048575;
            int i26 = i11;
            int i27 = -1;
            int i28 = 0;
            int i29 = 0;
            int i31 = 1048575;
            while (i26 < i23) {
                int i32 = i26 + 1;
                byte b11 = bArr2[i26];
                if (b11 < 0) {
                    i14 = AbstractC5475l8.m29414k(b11, bArr2, i32, c5458k82);
                    i13 = c5458k82.f32457a;
                } else {
                    i13 = b11;
                    i14 = i32;
                }
                int i33 = i13 >>> 3;
                if (i33 > i27) {
                    m30059M = c5698ya2.m30060N(i33, i28 / 3);
                } else {
                    m30059M = c5698ya2.m30059M(i33);
                }
                int i34 = m30059M;
                if (i34 == i24) {
                    i15 = i14;
                    i16 = i33;
                    unsafe = unsafe5;
                    i17 = 0;
                } else {
                    int i35 = i13 & 7;
                    int[] iArr = c5698ya2.f32932a;
                    int i36 = iArr[i34 + 1];
                    int m30063Q = m30063Q(i36);
                    Unsafe unsafe6 = unsafe5;
                    long j11 = i36 & i25;
                    if (m30063Q <= 17) {
                        int i37 = iArr[i34 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i31) {
                            if (i31 != 1048575) {
                                long j12 = i31;
                                unsafe4 = unsafe6;
                                unsafe4.putInt(obj2, j12, i29);
                            } else {
                                unsafe4 = unsafe6;
                            }
                            if (i39 != 1048575) {
                                i29 = unsafe4.getInt(obj2, i39);
                            }
                            unsafe2 = unsafe4;
                            i31 = i39;
                        } else {
                            unsafe2 = unsafe6;
                        }
                        switch (m30063Q) {
                            case 0:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 1) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    AbstractC5648vb.m29800t(obj2, j11, Double.longBitsToDouble(AbstractC5475l8.m29419p(bArr2, i14)));
                                    i26 = i14 + 8;
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 1:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 5) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    AbstractC5648vb.m29801u(obj2, j11, Float.intBitsToFloat(AbstractC5475l8.m29405b(bArr2, i14)));
                                    i26 = i14 + 4;
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 0) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    int m29416m = AbstractC5475l8.m29416m(bArr2, i14, c5458k82);
                                    unsafe3.putLong(obj, j11, c5458k82.f32458b);
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i26 = m29416m;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 0) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    i26 = AbstractC5475l8.m29413j(bArr2, i14, c5458k82);
                                    unsafe3.putInt(obj2, j11, c5458k82.f32457a);
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 1) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    unsafe3.putLong(obj, j11, AbstractC5475l8.m29419p(bArr2, i14));
                                    i26 = i14 + 8;
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 5) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    unsafe3.putInt(obj2, j11, AbstractC5475l8.m29405b(bArr2, i14));
                                    i26 = i14 + 4;
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 7:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 0) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    i26 = AbstractC5475l8.m29416m(bArr2, i14, c5458k82);
                                    AbstractC5648vb.m29798r(obj2, j11, c5458k82.f32458b != 0);
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 8:
                                c5698ya = this;
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 2) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    if ((i36 & 536870912) == 0) {
                                        i26 = AbstractC5475l8.m29410g(bArr2, i14, c5458k82);
                                    } else {
                                        i26 = AbstractC5475l8.m29411h(bArr2, i14, c5458k82);
                                    }
                                    unsafe3.putObject(obj2, j11, c5458k82.f32459c);
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 9:
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 != 2) {
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    c5698ya = this;
                                    Object m30069j = c5698ya.m30069j(obj2, i17);
                                    i26 = AbstractC5475l8.m29418o(m30069j, c5698ya.m30067h(i17), bArr, i14, i12, c5458k8);
                                    c5698ya.m30077r(obj2, i17, m30069j);
                                    i29 |= i38;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = c5698ya;
                                    i23 = i12;
                                    break;
                                }
                            case 10:
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 == 2) {
                                    i26 = AbstractC5475l8.m29404a(bArr2, i14, c5458k82);
                                    unsafe3.putObject(obj2, j11, c5458k82.f32459c);
                                    i29 |= i38;
                                    i23 = i12;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = this;
                                    break;
                                }
                                i15 = i14;
                                unsafe = unsafe3;
                                i31 = i18;
                                break;
                            case 12:
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 == 0) {
                                    i26 = AbstractC5475l8.m29413j(bArr2, i14, c5458k82);
                                    unsafe3.putInt(obj2, j11, c5458k82.f32457a);
                                    i29 |= i38;
                                    i23 = i12;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = this;
                                    break;
                                }
                                i15 = i14;
                                unsafe = unsafe3;
                                i31 = i18;
                                break;
                            case 15:
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                if (i35 == 0) {
                                    i26 = AbstractC5475l8.m29413j(bArr2, i14, c5458k82);
                                    unsafe3.putInt(obj2, j11, AbstractC5306b9.m28949a(c5458k82.f32457a));
                                    i29 |= i38;
                                    i23 = i12;
                                    unsafe5 = unsafe3;
                                    i28 = i17;
                                    i31 = i18;
                                    i27 = i16;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = this;
                                    break;
                                }
                                i15 = i14;
                                unsafe = unsafe3;
                                i31 = i18;
                                break;
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                if (i35 != 0) {
                                    i16 = i33;
                                    i17 = i34;
                                    i18 = i31;
                                    unsafe3 = unsafe2;
                                    i15 = i14;
                                    unsafe = unsafe3;
                                    i31 = i18;
                                    break;
                                } else {
                                    int m29416m2 = AbstractC5475l8.m29416m(bArr2, i14, c5458k82);
                                    unsafe2.putLong(obj, j11, AbstractC5306b9.m28950b(c5458k82.f32458b));
                                    i29 |= i38;
                                    unsafe5 = unsafe2;
                                    i26 = m29416m2;
                                    i28 = i34;
                                    i31 = i31;
                                    i27 = i33;
                                    i25 = 1048575;
                                    i24 = -1;
                                    c5698ya2 = this;
                                    i23 = i12;
                                    break;
                                }
                            default:
                                i16 = i33;
                                i17 = i34;
                                i18 = i31;
                                unsafe3 = unsafe2;
                                i15 = i14;
                                unsafe = unsafe3;
                                i31 = i18;
                                break;
                        }
                    } else {
                        i16 = i33;
                        int i41 = i31;
                        C5698ya c5698ya3 = c5698ya2;
                        i17 = i34;
                        if (m30063Q != 27) {
                            if (m30063Q <= 49) {
                                int i42 = i14;
                                i21 = i29;
                                i22 = i41;
                                unsafe = unsafe6;
                                i26 = m30058L(obj, bArr, i14, i12, i13, i16, i35, i17, i36, m30063Q, j11, c5458k8);
                            } else {
                                i19 = i14;
                                i21 = i29;
                                unsafe = unsafe6;
                                i22 = i41;
                                if (m30063Q != 50) {
                                    i26 = m30057K(obj, bArr, i19, i12, i13, i16, i35, i36, m30063Q, j11, i17, c5458k8);
                                } else if (i35 == 2) {
                                    i26 = m30056J(obj, bArr, i19, i12, i17, j11, c5458k8);
                                }
                            }
                            i25 = 1048575;
                            i24 = -1;
                            c5698ya2 = this;
                        } else if (i35 == 2) {
                            InterfaceC5714z9 interfaceC5714z9 = (InterfaceC5714z9) unsafe6.getObject(obj2, j11);
                            if (!interfaceC5714z9.zzc()) {
                                int size = interfaceC5714z9.size();
                                interfaceC5714z9 = interfaceC5714z9.mo28992c(size == 0 ? 10 : size + size);
                                unsafe6.putObject(obj2, j11, interfaceC5714z9);
                            }
                            i26 = AbstractC5475l8.m29408e(c5698ya3.m30067h(i17), i13, bArr, i14, i12, interfaceC5714z9, c5458k8);
                            i23 = i12;
                            unsafe5 = unsafe6;
                            i29 = i29;
                            i28 = i17;
                            i31 = i41;
                            i27 = i16;
                            i25 = 1048575;
                            c5698ya2 = c5698ya3;
                            i24 = -1;
                        } else {
                            i19 = i14;
                            i21 = i29;
                            unsafe = unsafe6;
                            i22 = i41;
                        }
                        i15 = i19;
                        i29 = i21;
                        i31 = i22;
                        i26 = AbstractC5475l8.m29412i(i13, bArr, i15, i12, m30050D(obj), c5458k8);
                        obj2 = obj;
                        bArr2 = bArr;
                        i23 = i12;
                        c5458k82 = c5458k8;
                        i28 = i17;
                        i27 = i16;
                        unsafe5 = unsafe;
                        i25 = 1048575;
                        i24 = -1;
                        c5698ya2 = this;
                    }
                }
                i26 = AbstractC5475l8.m29412i(i13, bArr, i15, i12, m30050D(obj), c5458k8);
                obj2 = obj;
                bArr2 = bArr;
                i23 = i12;
                c5458k82 = c5458k8;
                i28 = i17;
                i27 = i16;
                unsafe5 = unsafe;
                i25 = 1048575;
                i24 = -1;
                c5698ya2 = this;
            }
            int i43 = i29;
            Unsafe unsafe7 = unsafe5;
            if (i31 != 1048575) {
                unsafe7.putInt(obj, i31, i43);
            }
            if (i26 != i12) {
                throw zzll.m30121e();
            }
            return;
        }
        m30086C(obj, bArr, i11, i12, 0, c5458k8);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0037. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    public final int zza(Object obj) {
        int m29089y;
        int m29089y2;
        int m29090z;
        int m29089y3;
        int m29089y4;
        int m29089y5;
        int m29089y6;
        int m29225L;
        int m29089y7;
        int m29090z2;
        int m29089y8;
        int m29089y9;
        if (this.f32938g) {
            Unsafe unsafe = f32931q;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f32932a.length; i12 += 3) {
                int m30064R = m30064R(i12);
                int m30063Q = m30063Q(m30064R);
                int i13 = this.f32932a[i12];
                int i14 = m30064R & 1048575;
                if (m30063Q >= EnumC5510n9.f32659b0.m29466b() && m30063Q <= EnumC5510n9.f32672o0.m29466b()) {
                    int i15 = this.f32932a[i12 + 2];
                }
                long j11 = i14;
                switch (m30063Q) {
                    case 0:
                        if (m30081v(obj, i12)) {
                            m29089y = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y + 8;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m30081v(obj, i12)) {
                            m29089y2 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y2 + 4;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m30081v(obj, i12)) {
                            m29090z = AbstractC5357e9.m29090z(AbstractC5648vb.m29789i(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m30081v(obj, i12)) {
                            m29090z = AbstractC5357e9.m29090z(AbstractC5648vb.m29789i(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m30081v(obj, i12)) {
                            m29090z = AbstractC5357e9.m29086v(AbstractC5648vb.m29788h(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m30081v(obj, i12)) {
                            m29089y = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y + 8;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m30081v(obj, i12)) {
                            m29089y2 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y2 + 4;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m30081v(obj, i12)) {
                            m29089y4 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y4 + 1;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m30081v(obj, i12)) {
                            Object m29791k = AbstractC5648vb.m29791k(obj, j11);
                            if (m29791k instanceof AbstractC5679x8) {
                                int i16 = i13 << 3;
                                int i17 = AbstractC5357e9.f32354d;
                                int mo29551g = ((AbstractC5679x8) m29791k).mo29551g();
                                m29089y5 = AbstractC5357e9.m29089y(mo29551g) + mo29551g;
                                m29089y6 = AbstractC5357e9.m29089y(i16);
                                m29225L = m29089y6 + m29089y5;
                                i11 += m29225L;
                                break;
                            } else {
                                m29090z = AbstractC5357e9.m29088x((String) m29791k);
                                m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                                i11 += m29089y3 + m29090z;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (m30081v(obj, i12)) {
                            m29225L = AbstractC5427ib.m29225L(i13, AbstractC5648vb.m29791k(obj, j11), m30067h(i12));
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m30081v(obj, i12)) {
                            AbstractC5679x8 abstractC5679x8 = (AbstractC5679x8) AbstractC5648vb.m29791k(obj, j11);
                            int i18 = i13 << 3;
                            int i19 = AbstractC5357e9.f32354d;
                            int mo29551g2 = abstractC5679x8.mo29551g();
                            m29089y5 = AbstractC5357e9.m29089y(mo29551g2) + mo29551g2;
                            m29089y6 = AbstractC5357e9.m29089y(i18);
                            m29225L = m29089y6 + m29089y5;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m30081v(obj, i12)) {
                            m29090z = AbstractC5357e9.m29089y(AbstractC5648vb.m29788h(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m30081v(obj, i12)) {
                            m29090z = AbstractC5357e9.m29086v(AbstractC5648vb.m29788h(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m30081v(obj, i12)) {
                            m29089y2 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y2 + 4;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m30081v(obj, i12)) {
                            m29089y = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y + 8;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m30081v(obj, i12)) {
                            int m29788h = AbstractC5648vb.m29788h(obj, j11);
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            m29090z = AbstractC5357e9.m29089y((m29788h >> 31) ^ (m29788h + m29788h));
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        if (m30081v(obj, i12)) {
                            long m29789i = AbstractC5648vb.m29789i(obj, j11);
                            m29089y7 = AbstractC5357e9.m29089y(i13 << 3);
                            m29090z2 = AbstractC5357e9.m29090z((m29789i + m29789i) ^ (m29789i >> 63));
                            m29225L = m29089y7 + m29090z2;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m30081v(obj, i12)) {
                            m29225L = AbstractC5357e9.m29085u(i13, (InterfaceC5647va) AbstractC5648vb.m29791k(obj, j11), m30067h(i12));
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m29225L = AbstractC5427ib.m29218E(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 19:
                        m29225L = AbstractC5427ib.m29216C(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 20:
                        m29225L = AbstractC5427ib.m29223J(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 21:
                        m29225L = AbstractC5427ib.m29234U(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 22:
                        m29225L = AbstractC5427ib.m29221H(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 23:
                        m29225L = AbstractC5427ib.m29218E(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 24:
                        m29225L = AbstractC5427ib.m29216C(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 25:
                        m29225L = AbstractC5427ib.m29262y(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 26:
                        m29225L = AbstractC5427ib.m29231R(i13, (List) AbstractC5648vb.m29791k(obj, j11));
                        i11 += m29225L;
                        break;
                    case 27:
                        m29225L = AbstractC5427ib.m29226M(i13, (List) AbstractC5648vb.m29791k(obj, j11), m30067h(i12));
                        i11 += m29225L;
                        break;
                    case 28:
                        m29225L = AbstractC5427ib.m29263z(i13, (List) AbstractC5648vb.m29791k(obj, j11));
                        i11 += m29225L;
                        break;
                    case 29:
                        m29225L = AbstractC5427ib.m29232S(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        m29225L = AbstractC5427ib.m29214A(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 31:
                        m29225L = AbstractC5427ib.m29216C(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        m29225L = AbstractC5427ib.m29218E(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 33:
                        m29225L = AbstractC5427ib.m29227N(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 34:
                        m29225L = AbstractC5427ib.m29229P(i13, (List) AbstractC5648vb.m29791k(obj, j11), false);
                        i11 += m29225L;
                        break;
                    case 35:
                        m29090z = AbstractC5427ib.m29219F((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i21 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i21);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        m29090z = AbstractC5427ib.m29217D((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i22 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i22);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        m29090z = AbstractC5427ib.m29224K((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i23 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i23);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        m29090z = AbstractC5427ib.m29235V((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i24 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i24);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        m29090z = AbstractC5427ib.m29222I((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i25 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i25);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        m29090z = AbstractC5427ib.m29219F((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i26 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i26);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        m29090z = AbstractC5427ib.m29217D((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i27 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i27);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j11);
                        int i28 = AbstractC5427ib.f32422e;
                        m29090z = list.size();
                        if (m29090z > 0) {
                            int i29 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i29);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        m29090z = AbstractC5427ib.m29233T((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i31 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i31);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                        m29090z = AbstractC5427ib.m29215B((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i32 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i32);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        m29090z = AbstractC5427ib.m29217D((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i33 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i33);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        m29090z = AbstractC5427ib.m29219F((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i34 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i34);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        m29090z = AbstractC5427ib.m29228O((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i35 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i35);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        m29090z = AbstractC5427ib.m29230Q((List) unsafe.getObject(obj, j11));
                        if (m29090z > 0) {
                            int i36 = i13 << 3;
                            m29089y8 = AbstractC5357e9.m29089y(m29090z);
                            m29089y9 = AbstractC5357e9.m29089y(i36);
                            m29089y3 = m29089y9 + m29089y8;
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        m29225L = AbstractC5427ib.m29220G(i13, (List) AbstractC5648vb.m29791k(obj, j11), m30067h(i12));
                        i11 += m29225L;
                        break;
                    case 50:
                        C5562qa.m29562a(i13, AbstractC5648vb.m29791k(obj, j11), m30068i(i12));
                        break;
                    case 51:
                        if (m30085z(obj, i13, i12)) {
                            m29089y = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y + 8;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m30085z(obj, i13, i12)) {
                            m29089y2 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y2 + 4;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m30085z(obj, i13, i12)) {
                            m29090z = AbstractC5357e9.m29090z(m30065S(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m30085z(obj, i13, i12)) {
                            m29090z = AbstractC5357e9.m29090z(m30065S(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m30085z(obj, i13, i12)) {
                            m29090z = AbstractC5357e9.m29086v(m30055I(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m30085z(obj, i13, i12)) {
                            m29089y = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y + 8;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m30085z(obj, i13, i12)) {
                            m29089y2 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y2 + 4;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m30085z(obj, i13, i12)) {
                            m29089y4 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y4 + 1;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m30085z(obj, i13, i12)) {
                            Object m29791k2 = AbstractC5648vb.m29791k(obj, j11);
                            if (m29791k2 instanceof AbstractC5679x8) {
                                int i37 = i13 << 3;
                                int i38 = AbstractC5357e9.f32354d;
                                int mo29551g3 = ((AbstractC5679x8) m29791k2).mo29551g();
                                m29089y5 = AbstractC5357e9.m29089y(mo29551g3) + mo29551g3;
                                m29089y6 = AbstractC5357e9.m29089y(i37);
                                m29225L = m29089y6 + m29089y5;
                                i11 += m29225L;
                                break;
                            } else {
                                m29090z = AbstractC5357e9.m29088x((String) m29791k2);
                                m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                                i11 += m29089y3 + m29090z;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m30085z(obj, i13, i12)) {
                            m29225L = AbstractC5427ib.m29225L(i13, AbstractC5648vb.m29791k(obj, j11), m30067h(i12));
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m30085z(obj, i13, i12)) {
                            AbstractC5679x8 abstractC5679x82 = (AbstractC5679x8) AbstractC5648vb.m29791k(obj, j11);
                            int i39 = i13 << 3;
                            int i41 = AbstractC5357e9.f32354d;
                            int mo29551g4 = abstractC5679x82.mo29551g();
                            m29089y5 = AbstractC5357e9.m29089y(mo29551g4) + mo29551g4;
                            m29089y6 = AbstractC5357e9.m29089y(i39);
                            m29225L = m29089y6 + m29089y5;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m30085z(obj, i13, i12)) {
                            m29090z = AbstractC5357e9.m29089y(m30055I(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m30085z(obj, i13, i12)) {
                            m29090z = AbstractC5357e9.m29086v(m30055I(obj, j11));
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m30085z(obj, i13, i12)) {
                            m29089y2 = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y2 + 4;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m30085z(obj, i13, i12)) {
                            m29089y = AbstractC5357e9.m29089y(i13 << 3);
                            m29225L = m29089y + 8;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                        if (m30085z(obj, i13, i12)) {
                            int m30055I = m30055I(obj, j11);
                            m29089y3 = AbstractC5357e9.m29089y(i13 << 3);
                            m29090z = AbstractC5357e9.m29089y((m30055I >> 31) ^ (m30055I + m30055I));
                            i11 += m29089y3 + m29090z;
                            break;
                        } else {
                            break;
                        }
                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                        if (m30085z(obj, i13, i12)) {
                            long m30065S = m30065S(obj, j11);
                            m29089y7 = AbstractC5357e9.m29089y(i13 << 3);
                            m29090z2 = AbstractC5357e9.m29090z((m30065S + m30065S) ^ (m30065S >> 63));
                            m29225L = m29089y7 + m29090z2;
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m30085z(obj, i13, i12)) {
                            m29225L = AbstractC5357e9.m29085u(i13, (InterfaceC5647va) AbstractC5648vb.m29791k(obj, j11), m30067h(i12));
                            i11 += m29225L;
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC5478lb abstractC5478lb = this.f32943l;
            return i11 + abstractC5478lb.mo29424a(abstractC5478lb.mo29427d(obj));
        }
        return m30054H(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    public final int zzb(Object obj) {
        int i11;
        long doubleToLongBits;
        int i12;
        int floatToIntBits;
        int length = this.f32932a.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int m30064R = m30064R(i14);
            int i15 = this.f32932a[i14];
            long j11 = 1048575 & m30064R;
            int i16 = 37;
            switch (m30063Q(m30064R)) {
                case 0:
                    i11 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(AbstractC5648vb.m29786f(obj, j11));
                    byte[] bArr = AbstractC5290aa.f32259d;
                    i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i12 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(AbstractC5648vb.m29787g(obj, j11));
                    i13 = i12 + floatToIntBits;
                    break;
                case 2:
                    i11 = i13 * 53;
                    doubleToLongBits = AbstractC5648vb.m29789i(obj, j11);
                    byte[] bArr2 = AbstractC5290aa.f32259d;
                    i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i11 = i13 * 53;
                    doubleToLongBits = AbstractC5648vb.m29789i(obj, j11);
                    byte[] bArr3 = AbstractC5290aa.f32259d;
                    i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29788h(obj, j11);
                    i13 = i12 + floatToIntBits;
                    break;
                case 5:
                    i11 = i13 * 53;
                    doubleToLongBits = AbstractC5648vb.m29789i(obj, j11);
                    byte[] bArr4 = AbstractC5290aa.f32259d;
                    i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29788h(obj, j11);
                    i13 = i12 + floatToIntBits;
                    break;
                case 7:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5290aa.m28882a(AbstractC5648vb.m29777B(obj, j11));
                    i13 = i12 + floatToIntBits;
                    break;
                case 8:
                    i12 = i13 * 53;
                    floatToIntBits = ((String) AbstractC5648vb.m29791k(obj, j11)).hashCode();
                    i13 = i12 + floatToIntBits;
                    break;
                case 9:
                    Object m29791k = AbstractC5648vb.m29791k(obj, j11);
                    if (m29791k != null) {
                        i16 = m29791k.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
                    break;
                case 10:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29791k(obj, j11).hashCode();
                    i13 = i12 + floatToIntBits;
                    break;
                case 11:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29788h(obj, j11);
                    i13 = i12 + floatToIntBits;
                    break;
                case 12:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29788h(obj, j11);
                    i13 = i12 + floatToIntBits;
                    break;
                case 13:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29788h(obj, j11);
                    i13 = i12 + floatToIntBits;
                    break;
                case 14:
                    i11 = i13 * 53;
                    doubleToLongBits = AbstractC5648vb.m29789i(obj, j11);
                    byte[] bArr5 = AbstractC5290aa.f32259d;
                    i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29788h(obj, j11);
                    i13 = i12 + floatToIntBits;
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    i11 = i13 * 53;
                    doubleToLongBits = AbstractC5648vb.m29789i(obj, j11);
                    byte[] bArr6 = AbstractC5290aa.f32259d;
                    i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object m29791k2 = AbstractC5648vb.m29791k(obj, j11);
                    if (m29791k2 != null) {
                        i16 = m29791k2.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
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
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29791k(obj, j11).hashCode();
                    i13 = i12 + floatToIntBits;
                    break;
                case 50:
                    i12 = i13 * 53;
                    floatToIntBits = AbstractC5648vb.m29791k(obj, j11).hashCode();
                    i13 = i12 + floatToIntBits;
                    break;
                case 51:
                    if (m30085z(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m30052F(obj, j11));
                        byte[] bArr7 = AbstractC5290aa.f32259d;
                        i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(m30053G(obj, j11));
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m30085z(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = m30065S(obj, j11);
                        byte[] bArr8 = AbstractC5290aa.f32259d;
                        i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m30085z(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = m30065S(obj, j11);
                        byte[] bArr9 = AbstractC5290aa.f32259d;
                        i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = m30055I(obj, j11);
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m30085z(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = m30065S(obj, j11);
                        byte[] bArr10 = AbstractC5290aa.f32259d;
                        i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = m30055I(obj, j11);
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = AbstractC5290aa.m28882a(m30048A(obj, j11));
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = ((String) AbstractC5648vb.m29791k(obj, j11)).hashCode();
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = AbstractC5648vb.m29791k(obj, j11).hashCode();
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = AbstractC5648vb.m29791k(obj, j11).hashCode();
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = m30055I(obj, j11);
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = m30055I(obj, j11);
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = m30055I(obj, j11);
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m30085z(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = m30065S(obj, j11);
                        byte[] bArr11 = AbstractC5290aa.f32259d;
                        i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = m30055I(obj, j11);
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (m30085z(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = m30065S(obj, j11);
                        byte[] bArr12 = AbstractC5290aa.f32259d;
                        i13 = i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m30085z(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = AbstractC5648vb.m29791k(obj, j11).hashCode();
                        i13 = i12 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i13 * 53) + this.f32943l.mo29427d(obj).hashCode();
        if (!this.f32937f) {
            return hashCode;
        }
        this.f32944m.mo29281a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    public final Object zze() {
        return ((AbstractC5612t9) this.f32936e).m29650k();
    }
}
