package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class si4 extends xi4 {

    /* renamed from: k */
    private static final j93 f27707k = j93.m23575b(new Comparator() { // from class: com.google.android.gms.internal.ads.rh4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i11 = si4.f27709m;
            if (num.intValue() == -1) {
                if (num2.intValue() != -1) {
                    return -1;
                }
                return 0;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* renamed from: l */
    private static final j93 f27708l = j93.m23575b(new Comparator() { // from class: com.google.android.gms.internal.ads.sh4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i11 = si4.f27709m;
            return 0;
        }
    });

    /* renamed from: m */
    public static final /* synthetic */ int f27709m = 0;

    /* renamed from: d */
    private final Object f27710d;

    /* renamed from: e */
    public final Context f27711e;

    /* renamed from: f */
    private final boolean f27712f;

    /* renamed from: g */
    private ai4 f27713g;

    /* renamed from: h */
    private li4 f27714h;

    /* renamed from: i */
    private b44 f27715i;

    /* renamed from: j */
    private final gh4 f27716j;

    public si4(Context context) {
        Context context2;
        gh4 gh4Var = new gh4();
        ai4 m20129d = ai4.m20129d(context);
        this.f27710d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f27711e = context2;
        this.f27716j = gh4Var;
        this.f27713g = m20129d;
        this.f27715i = b44.f17580c;
        boolean z11 = false;
        if (context != null && g92.m22366x(context)) {
            z11 = true;
        }
        this.f27712f = z11;
        if (!z11 && context != null && g92.f20474a >= 32) {
            this.f27714h = li4.m24303a(context);
        }
        if (this.f27713g.f17079M && context == null) {
            lr1.m24356e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public static int m26324j(C4671k3 c4671k3, String str, boolean z11) {
        if (!TextUtils.isEmpty(str) && str.equals(c4671k3.f23090c)) {
            return 4;
        }
        String m26327n = m26327n(str);
        String m26327n2 = m26327n(c4671k3.f23090c);
        if (m26327n2 != null && m26327n != null) {
            if (!m26327n2.startsWith(m26327n) && !m26327n.startsWith(m26327n2)) {
                if (!g92.m22315I(m26327n2, "-")[0].equals(g92.m22315I(m26327n, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z11 || m26327n2 != null) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static String m26327n(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:            if (r1 != 3) goto L42;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean m26329q(si4 si4Var, C4671k3 c4671k3) {
        boolean z11;
        char c11;
        li4 li4Var;
        synchronized (si4Var.f27710d) {
            try {
                z11 = true;
                if (si4Var.f27713g.f17079M && !si4Var.f27712f && c4671k3.f23112y > 2) {
                    String str = c4671k3.f23099l;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        if (c11 != 0) {
                            if (c11 != 1) {
                                if (c11 != 2) {
                                }
                            }
                        }
                        if (g92.f20474a >= 32) {
                            li4 li4Var2 = si4Var.f27714h;
                            if (li4Var2 != null) {
                                if (!li4Var2.m24309g()) {
                                }
                            }
                        }
                    }
                    if (g92.f20474a < 32 || (li4Var = si4Var.f27714h) == null || !li4Var.m24309g() || !li4Var.m24307e() || !si4Var.f27714h.m24308f() || !si4Var.f27714h.m24306d(si4Var.f27715i, c4671k3)) {
                        z11 = false;
                    }
                }
            } finally {
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static boolean m26330r(int i11, boolean z11) {
        int i12 = i11 & 7;
        if (i12 != 4) {
            return z11 && i12 == 3;
        }
        return true;
    }

    /* renamed from: s */
    private static void m26331s(dh4 dh4Var, my0 my0Var, Map map) {
        for (int i11 = 0; i11 < dh4Var.f19251a; i11++) {
            AbstractC30228a.m149044a(my0Var.f24934y.get(dh4Var.m21393b(i11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m26332t() {
        boolean z11;
        li4 li4Var;
        synchronized (this.f27710d) {
            try {
                z11 = false;
                if (this.f27713g.f17079M && !this.f27712f && g92.f20474a >= 32 && (li4Var = this.f27714h) != null && li4Var.m24309g()) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            m20144h();
        }
    }

    /* renamed from: u */
    private static final Pair m26333u(int i11, wi4 wi4Var, int[][][] iArr, ni4 ni4Var, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 2; i12++) {
            if (i11 == wi4Var.m27624c(i12)) {
                dh4 m27625d = wi4Var.m27625d(i12);
                for (int i13 = 0; i13 < m27625d.f19251a; i13++) {
                    jt0 m21393b = m27625d.m21393b(i13);
                    List mo24290a = ni4Var.mo24290a(i12, m21393b, iArr[i12][i13]);
                    int i14 = m21393b.f22986a;
                    int i15 = 1;
                    boolean[] zArr = new boolean[1];
                    int i16 = 0;
                    while (i16 <= 0) {
                        oi4 oi4Var = (oi4) mo24290a.get(i16);
                        int mo24607b = oi4Var.mo24607b();
                        if (!zArr[i16] && mo24607b != 0) {
                            if (mo24607b == i15) {
                                randomAccess = c83.m20833x(oi4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oi4Var);
                                for (int i17 = i16 + 1; i17 <= 0; i17++) {
                                    oi4 oi4Var2 = (oi4) mo24290a.get(i17);
                                    if (oi4Var2.mo24607b() == 2 && oi4Var.mo24608c(oi4Var2)) {
                                        arrayList2.add(oi4Var2);
                                        zArr[i17] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i16++;
                        i15 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((oi4) list.get(i18)).f25655r;
        }
        oi4 oi4Var3 = (oi4) list.get(0);
        return Pair.create(new ti4(oi4Var3.f25654q, iArr2, 0), Integer.valueOf(oi4Var3.f25653p));
    }

    @Override // com.google.android.gms.internal.ads.aj4
    /* renamed from: a */
    public final void mo20137a() {
        li4 li4Var;
        synchronized (this.f27710d) {
            try {
                if (g92.f20474a >= 32 && (li4Var = this.f27714h) != null) {
                    li4Var.m24305c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.mo20137a();
    }

    @Override // com.google.android.gms.internal.ads.aj4
    /* renamed from: b */
    public final void mo20138b(b44 b44Var) {
        boolean z11;
        synchronized (this.f27710d) {
            z11 = !this.f27715i.equals(b44Var);
            this.f27715i = b44Var;
        }
        if (z11) {
            m26332t();
        }
    }

    @Override // com.google.android.gms.internal.ads.aj4
    /* renamed from: c */
    public final boolean mo20139c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    /* renamed from: i */
    protected final Pair mo26334i(wi4 wi4Var, int[][][] iArr, final int[] iArr2, gf4 gf4Var, mr0 mr0Var) {
        final ai4 ai4Var;
        int i11;
        final boolean z11;
        final String str;
        int[] iArr3;
        int length;
        ui4 m22441a;
        li4 li4Var;
        int[][][] iArr4 = iArr;
        synchronized (this.f27710d) {
            try {
                ai4Var = this.f27713g;
                if (ai4Var.f17079M && g92.f20474a >= 32 && (li4Var = this.f27714h) != null) {
                    Looper myLooper = Looper.myLooper();
                    v71.m27171b(myLooper);
                    li4Var.m24304b(this, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i12 = 2;
        ti4[] ti4VarArr = new ti4[2];
        Pair m26333u = m26333u(2, wi4Var, iArr4, new ni4() { // from class: com.google.android.gms.internal.ads.nh4
            /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
            @Override // com.google.android.gms.internal.ads.ni4
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List mo24290a(int i13, jt0 jt0Var, int[] iArr5) {
                boolean z12;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                Point point;
                int i19;
                int i21;
                boolean z13;
                boolean z14;
                ai4 ai4Var2 = ai4.this;
                int[] iArr6 = iArr2;
                int i22 = si4.f27709m;
                int i23 = iArr6[i13];
                int i24 = ai4Var2.f24918i;
                int i25 = ai4Var2.f24919j;
                boolean z15 = ai4Var2.f24920k;
                int i26 = Integer.MAX_VALUE;
                if (i24 != Integer.MAX_VALUE) {
                    if (i25 != Integer.MAX_VALUE) {
                        int i27 = 0;
                        int i28 = Integer.MAX_VALUE;
                        while (true) {
                            int i29 = jt0Var.f22986a;
                            if (i27 > 0) {
                                break;
                            }
                            C4671k3 m23747b = jt0Var.m23747b(i27);
                            int i31 = m23747b.f23104q;
                            if (i31 > 0 && (i14 = m23747b.f23105r) > 0) {
                                if (z15) {
                                    if (i31 <= i14) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (i24 <= i25) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (z13 != z14) {
                                        i16 = i24;
                                        i15 = i25;
                                        i17 = i31 * i16;
                                        i18 = i14 * i15;
                                        if (i17 < i18) {
                                            point = new Point(i15, g92.m22321O(i18, i31));
                                        } else {
                                            point = new Point(g92.m22321O(i17, i14), i16);
                                        }
                                        i19 = m23747b.f23104q;
                                        int i32 = m23747b.f23105r;
                                        i21 = i19 * i32;
                                        if (i19 >= ((int) (point.x * 0.98f)) && i32 >= ((int) (point.y * 0.98f)) && i21 < i28) {
                                            i28 = i21;
                                        }
                                    }
                                }
                                i15 = i24;
                                i16 = i25;
                                i17 = i31 * i16;
                                i18 = i14 * i15;
                                if (i17 < i18) {
                                }
                                i19 = m23747b.f23104q;
                                int i322 = m23747b.f23105r;
                                i21 = i19 * i322;
                                if (i19 >= ((int) (point.x * 0.98f))) {
                                    i28 = i21;
                                }
                            }
                            i27++;
                        }
                        i26 = i28;
                    }
                } else {
                    i26 = Integer.MAX_VALUE;
                }
                z73 m20826p = c83.m20826p();
                int i33 = 0;
                while (true) {
                    int i34 = jt0Var.f22986a;
                    if (i33 <= 0) {
                        int m23808a = jt0Var.m23747b(i33).m23808a();
                        if (i26 == Integer.MAX_VALUE || (m23808a != -1 && m23808a <= i26)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m20826p.m28452f(new ri4(i13, jt0Var, i33, ai4Var2, iArr5[i33], i23, z12));
                        i33++;
                    } else {
                        return m20826p.m28454h();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.oh4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                r73 m25988i = r73.m25988i();
                pi4 pi4Var = new Comparator() { // from class: com.google.android.gms.internal.ads.pi4
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ri4.m26082e((ri4) obj3, (ri4) obj4);
                    }
                };
                r73 mo25415b = m25988i.mo25416c((ri4) Collections.max(list, pi4Var), (ri4) Collections.max(list2, pi4Var), pi4Var).mo25415b(list.size(), list2.size());
                qi4 qi4Var = new Comparator() { // from class: com.google.android.gms.internal.ads.qi4
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ri4.m26081d((ri4) obj3, (ri4) obj4);
                    }
                };
                return mo25415b.mo25416c((ri4) Collections.max(list, qi4Var), (ri4) Collections.max(list2, qi4Var), qi4Var).mo25414a();
            }
        });
        if (m26333u != null) {
            ti4VarArr[((Integer) m26333u.second).intValue()] = (ti4) m26333u.first;
        }
        int i13 = 0;
        while (true) {
            i11 = 1;
            if (i13 >= 2) {
                z11 = false;
                break;
            }
            if (wi4Var.m27624c(i13) == 2 && wi4Var.m27625d(i13).f19251a > 0) {
                z11 = true;
                break;
            }
            i13++;
        }
        Pair m26333u2 = m26333u(1, wi4Var, iArr4, new ni4() { // from class: com.google.android.gms.internal.ads.lh4
            @Override // com.google.android.gms.internal.ads.ni4
            /* renamed from: a */
            public final List mo24290a(int i14, jt0 jt0Var, int[] iArr5) {
                final si4 si4Var = si4.this;
                ai4 ai4Var2 = ai4Var;
                boolean z12 = z11;
                k53 k53Var = new k53() { // from class: com.google.android.gms.internal.ads.kh4
                    @Override // com.google.android.gms.internal.ads.k53
                    public final boolean zza(Object obj) {
                        return si4.m26329q(si4.this, (C4671k3) obj);
                    }
                };
                z73 m20826p = c83.m20826p();
                int i15 = 0;
                while (true) {
                    int i16 = jt0Var.f22986a;
                    if (i15 <= 0) {
                        m20826p.m28452f(new th4(i14, jt0Var, i15, ai4Var2, iArr5[i15], z12, k53Var));
                        i15++;
                    } else {
                        return m20826p.m28454h();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.mh4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((th4) Collections.max((List) obj)).m26614d((th4) Collections.max((List) obj2));
            }
        });
        if (m26333u2 != null) {
            ti4VarArr[((Integer) m26333u2.second).intValue()] = (ti4) m26333u2.first;
        }
        if (m26333u2 == null) {
            str = null;
        } else {
            Object obj = m26333u2.first;
            str = ((ti4) obj).f28380a.m23747b(((ti4) obj).f28381b[0]).f23090c;
        }
        int i14 = 3;
        Pair m26333u3 = m26333u(3, wi4Var, iArr4, new ni4() { // from class: com.google.android.gms.internal.ads.ph4
            @Override // com.google.android.gms.internal.ads.ni4
            /* renamed from: a */
            public final List mo24290a(int i15, jt0 jt0Var, int[] iArr5) {
                ai4 ai4Var2 = ai4.this;
                String str2 = str;
                int i16 = si4.f27709m;
                z73 m20826p = c83.m20826p();
                int i17 = 0;
                while (true) {
                    int i18 = jt0Var.f22986a;
                    if (i17 <= 0) {
                        m20826p.m28452f(new mi4(i15, jt0Var, i17, ai4Var2, iArr5[i17], str2));
                        i17++;
                    } else {
                        return m20826p.m28454h();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.qh4
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((mi4) ((List) obj2).get(0)).m24609d((mi4) ((List) obj3).get(0));
            }
        });
        if (m26333u3 != null) {
            ti4VarArr[((Integer) m26333u3.second).intValue()] = (ti4) m26333u3.first;
        }
        int i15 = 0;
        while (i15 < i12) {
            int m27624c = wi4Var.m27624c(i15);
            if (m27624c != i12 && m27624c != i11 && m27624c != i14) {
                dh4 m27625d = wi4Var.m27625d(i15);
                int[][] iArr5 = iArr4[i15];
                int i16 = 0;
                jt0 jt0Var = null;
                int i17 = 0;
                vh4 vh4Var = null;
                while (i16 < m27625d.f19251a) {
                    jt0 m21393b = m27625d.m21393b(i16);
                    int[] iArr6 = iArr5[i16];
                    vh4 vh4Var2 = vh4Var;
                    int i18 = 0;
                    while (true) {
                        int i19 = m21393b.f22986a;
                        if (i18 <= 0) {
                            if (m26330r(iArr6[i18], ai4Var.f17080N)) {
                                vh4 vh4Var3 = new vh4(m21393b.m23747b(i18), iArr6[i18]);
                                if (vh4Var2 == null || vh4Var3.compareTo(vh4Var2) > 0) {
                                    vh4Var2 = vh4Var3;
                                    i17 = i18;
                                    jt0Var = m21393b;
                                }
                            }
                            i18++;
                        }
                    }
                    i16++;
                    vh4Var = vh4Var2;
                }
                ti4VarArr[i15] = jt0Var == null ? null : new ti4(jt0Var, new int[]{i17}, 0);
            }
            i15++;
            iArr4 = iArr;
            i12 = 2;
            i11 = 1;
            i14 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i21 = 0; i21 < 2; i21++) {
            m26331s(wi4Var.m27625d(i21), ai4Var, hashMap);
        }
        m26331s(wi4Var.m27626e(), ai4Var, hashMap);
        for (int i22 = 0; i22 < 2; i22++) {
            AbstractC30228a.m149044a(hashMap.get(Integer.valueOf(wi4Var.m27624c(i22))));
        }
        int i23 = 0;
        for (int i24 = 2; i23 < i24; i24 = 2) {
            dh4 m27625d2 = wi4Var.m27625d(i23);
            if (ai4Var.m20133g(i23, m27625d2)) {
                ai4Var.m20131e(i23, m27625d2);
                ti4VarArr[i23] = null;
            }
            i23++;
        }
        int i25 = 0;
        for (int i26 = 2; i25 < i26; i26 = 2) {
            int m27624c2 = wi4Var.m27624c(i25);
            if (ai4Var.m20132f(i25) || ai4Var.f24935z.contains(Integer.valueOf(m27624c2))) {
                ti4VarArr[i25] = null;
            }
            i25++;
        }
        gh4 gh4Var = this.f27716j;
        ij4 m20142f = m20142f();
        c83 m22898b = hh4.m22898b(ti4VarArr);
        int i27 = 2;
        ui4[] ui4VarArr = new ui4[2];
        int i28 = 0;
        while (i28 < i27) {
            ti4 ti4Var = ti4VarArr[i28];
            if (ti4Var != null && (length = (iArr3 = ti4Var.f28381b).length) != 0) {
                if (length == 1) {
                    m22441a = new vi4(ti4Var.f28380a, iArr3[0], 0, 0, null);
                } else {
                    m22441a = gh4Var.m22441a(ti4Var.f28380a, iArr3, 0, m20142f, (c83) m22898b.get(i28));
                }
                ui4VarArr[i28] = m22441a;
            }
            i28++;
            i27 = 2;
        }
        e44[] e44VarArr = new e44[i27];
        for (int i29 = 0; i29 < i27; i29++) {
            e44VarArr[i29] = (ai4Var.m20132f(i29) || ai4Var.f24935z.contains(Integer.valueOf(wi4Var.m27624c(i29))) || (wi4Var.m27624c(i29) != -2 && ui4VarArr[i29] == null)) ? null : e44.f19514a;
        }
        return Pair.create(e44VarArr, ui4VarArr);
    }

    /* renamed from: k */
    public final ai4 m26335k() {
        ai4 ai4Var;
        synchronized (this.f27710d) {
            ai4Var = this.f27713g;
        }
        return ai4Var;
    }

    /* renamed from: p */
    public final void m26336p(yh4 yh4Var) {
        boolean z11;
        ai4 ai4Var = new ai4(yh4Var);
        synchronized (this.f27710d) {
            z11 = !this.f27713g.equals(ai4Var);
            this.f27713g = ai4Var;
        }
        if (z11) {
            if (ai4Var.f17079M && this.f27711e == null) {
                lr1.m24356e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            m20144h();
        }
    }
}
