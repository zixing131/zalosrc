package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class w24 extends e64 implements m14 {

    /* renamed from: j0 */
    public static final /* synthetic */ int f29679j0 = 0;

    /* renamed from: A */
    private final q44 f29680A;

    /* renamed from: B */
    private final long f29681B;

    /* renamed from: C */
    private int f29682C;

    /* renamed from: D */
    private int f29683D;

    /* renamed from: E */
    private boolean f29684E;

    /* renamed from: F */
    private int f29685F;

    /* renamed from: G */
    private f44 f29686G;

    /* renamed from: H */
    private jg0 f29687H;

    /* renamed from: I */
    private f00 f29688I;

    /* renamed from: J */
    private f00 f29689J;

    /* renamed from: K */
    private C4671k3 f29690K;

    /* renamed from: L */
    private C4671k3 f29691L;

    /* renamed from: M */
    private AudioTrack f29692M;

    /* renamed from: N */
    private Object f29693N;

    /* renamed from: O */
    private Surface f29694O;

    /* renamed from: P */
    private int f29695P;

    /* renamed from: Q */
    private int f29696Q;

    /* renamed from: R */
    private int f29697R;

    /* renamed from: S */
    private lv3 f29698S;

    /* renamed from: T */
    private lv3 f29699T;

    /* renamed from: U */
    private int f29700U;

    /* renamed from: V */
    private b44 f29701V;

    /* renamed from: W */
    private float f29702W;

    /* renamed from: X */
    private boolean f29703X;

    /* renamed from: Y */
    private u61 f29704Y;

    /* renamed from: Z */
    private boolean f29705Z;

    /* renamed from: a0 */
    private boolean f29706a0;

    /* renamed from: b */
    final bj4 f29707b;

    /* renamed from: b0 */
    private vf4 f29708b0;

    /* renamed from: c */
    final jg0 f29709c;

    /* renamed from: c0 */
    private s41 f29710c0;

    /* renamed from: d */
    private final ya1 f29711d;

    /* renamed from: d0 */
    private f00 f29712d0;

    /* renamed from: e */
    private final Context f29713e;

    /* renamed from: e0 */
    private v34 f29714e0;

    /* renamed from: f */
    private final jk0 f29715f;

    /* renamed from: f0 */
    private int f29716f0;

    /* renamed from: g */
    private final c44[] f29717g;

    /* renamed from: g0 */
    private long f29718g0;

    /* renamed from: h */
    private final aj4 f29719h;

    /* renamed from: h0 */
    private final x14 f29720h0;

    /* renamed from: i */
    private final di1 f29721i;

    /* renamed from: i0 */
    private zg4 f29722i0;

    /* renamed from: j */
    private final f34 f29723j;

    /* renamed from: k */
    private final jo1 f29724k;

    /* renamed from: l */
    private final CopyOnWriteArraySet f29725l;

    /* renamed from: m */
    private final ho0 f29726m;

    /* renamed from: n */
    private final List f29727n;

    /* renamed from: o */
    private final boolean f29728o;

    /* renamed from: p */
    private final ff4 f29729p;

    /* renamed from: q */
    private final r44 f29730q;

    /* renamed from: r */
    private final Looper f29731r;

    /* renamed from: s */
    private final ij4 f29732s;

    /* renamed from: t */
    private final w81 f29733t;

    /* renamed from: u */
    private final s24 f29734u;

    /* renamed from: v */
    private final u24 f29735v;

    /* renamed from: w */
    private final mp3 f29736w;

    /* renamed from: x */
    private final qt3 f29737x;

    /* renamed from: y */
    private final o44 f29738y;

    /* renamed from: z */
    private final p44 f29739z;

    static {
        AbstractC4368bv.m20759b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.r44, com.google.android.gms.internal.ads.hj4, java.lang.Object] */
    public w24(l14 l14Var, jk0 jk0Var) {
        Context applicationContext;
        ?? apply;
        s24 s24Var;
        u24 u24Var;
        Handler handler;
        c44[] m22993a;
        aj4 aj4Var;
        mj4 m24613c;
        Looper looper;
        w81 w81Var;
        jo1 jo1Var;
        CopyOnWriteArraySet copyOnWriteArraySet;
        bj4 bj4Var;
        x14 x14Var;
        int i11;
        i94 m24109a;
        i94 i94Var;
        i34 i34Var;
        f44 f44Var;
        Object obj;
        w24 w24Var = this;
        ya1 ya1Var = new ya1(w81.f29846a);
        w24Var.f29711d = ya1Var;
        try {
            lr1.m24355d("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta02] [" + g92.f20478e + "]");
            applicationContext = l14Var.f23675a.getApplicationContext();
            w24Var.f29713e = applicationContext;
            apply = l14Var.f23682h.apply(l14Var.f23676b);
            w24Var.f29730q = apply;
            w24Var.f29701V = l14Var.f23684j;
            w24Var.f29695P = l14Var.f23685k;
            w24Var.f29703X = false;
            w24Var.f29681B = l14Var.f23689o;
            s24Var = new s24(w24Var, null);
            w24Var.f29734u = s24Var;
            u24Var = new u24(null);
            w24Var.f29735v = u24Var;
            handler = new Handler(l14Var.f23683i);
            m22993a = ((f14) l14Var.f23677c).f19928p.m22993a(handler, s24Var, s24Var, s24Var, s24Var);
            w24Var.f29717g = m22993a;
            int length = m22993a.length;
            aj4Var = (aj4) l14Var.f23679e.zza();
            w24Var.f29719h = aj4Var;
            w24Var.f29729p = l14.m24104a(((g14) l14Var.f23678d).f20370p);
            m24613c = mj4.m24613c(((j14) l14Var.f23681g).f22597p);
            w24Var.f29732s = m24613c;
            w24Var.f29728o = l14Var.f23686l;
            w24Var.f29686G = l14Var.f23687m;
            looper = l14Var.f23683i;
            w24Var.f29731r = looper;
            w81Var = l14Var.f23676b;
            w24Var.f29733t = w81Var;
            w24Var.f29715f = jk0Var;
            jo1Var = new jo1(looper, w81Var, new hm1() { // from class: com.google.android.gms.internal.ads.w14
                public /* synthetic */ w14() {
                }

                @Override // com.google.android.gms.internal.ads.hm1
                /* renamed from: a */
                public final void mo20402a(Object obj2, C4336b c4336b) {
                }
            });
            w24Var.f29724k = jo1Var;
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            w24Var.f29725l = copyOnWriteArraySet;
            w24Var.f29727n = new ArrayList();
            w24Var.f29722i0 = new zg4(0);
            int length2 = m22993a.length;
            bj4Var = new bj4(new e44[2], new ui4[2], q21.f26605b, null);
            w24Var.f29707b = bj4Var;
            w24Var.f29726m = new ho0();
            ne0 ne0Var = new ne0();
            ne0Var.m24906c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            aj4Var.mo20139c();
            ne0Var.m24907d(29, true);
            jg0 m24908e = ne0Var.m24908e();
            w24Var.f29709c = m24908e;
            ne0 ne0Var2 = new ne0();
            ne0Var2.m24905b(m24908e);
            ne0Var2.m24904a(4);
            ne0Var2.m24904a(10);
            w24Var.f29687H = ne0Var2.m24908e();
            w24Var.f29721i = w81Var.mo27578a(looper, null);
            x14Var = new x14(w24Var);
            w24Var.f29720h0 = x14Var;
            w24Var.f29714e0 = v34.m27153g(bj4Var);
            apply.mo25963U(jk0Var, looper);
            i11 = g92.f20474a;
            if (i11 < 31) {
                m24109a = new i94();
            } else {
                m24109a = l24.m24109a(applicationContext, w24Var, l14Var.f23690p);
            }
            i94Var = m24109a;
            i34Var = (i34) l14Var.f23680f.zza();
            f44Var = w24Var.f29686G;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            w24Var = this;
            w24Var.f29723j = new f34(m22993a, aj4Var, bj4Var, i34Var, m24613c, 0, false, apply, f44Var, l14Var.f23692r, l14Var.f23688n, false, looper, w81Var, x14Var, i94Var, null);
            w24Var.f29702W = 1.0f;
            f00 f00Var = f00.f19888v;
            w24Var.f29688I = f00Var;
            w24Var.f29689J = f00Var;
            w24Var.f29712d0 = f00Var;
            w24Var.f29716f0 = -1;
            if (i11 < 21) {
                AudioTrack audioTrack = w24Var.f29692M;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    w24Var.f29692M.release();
                    obj = null;
                    w24Var.f29692M = null;
                } else {
                    obj = null;
                }
                if (w24Var.f29692M == null) {
                    w24Var.f29692M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                w24Var.f29700U = w24Var.f29692M.getAudioSessionId();
            } else {
                obj = null;
                w24Var.f29700U = g92.m22325S(applicationContext);
            }
            w24Var.f29704Y = new u61(c83.m20832w(), 0L);
            w24Var.f29705Z = true;
            apply.getClass();
            jo1Var.m23690b(apply);
            m24613c.mo23276a(new Handler(looper), apply);
            copyOnWriteArraySet.add(s24Var);
            Object obj2 = obj;
            w24Var.f29736w = new mp3(l14Var.f23675a, handler, s24Var);
            w24Var.f29737x = new qt3(l14Var.f23675a, handler, s24Var);
            g92.m22362t(obj2, obj2);
            o44 o44Var = new o44(l14Var.f23675a, handler, s24Var);
            w24Var.f29738y = o44Var;
            int i12 = w24Var.f29701V.f17582a;
            o44Var.m25086f(3);
            w24Var.f29739z = new p44(l14Var.f23675a);
            w24Var.f29680A = new q44(l14Var.f23675a);
            w24Var.f29708b0 = m27466N(o44Var);
            w24Var.f29710c0 = s41.f27527e;
            aj4Var.mo20138b(w24Var.f29701V);
            w24Var.m27470R(1, 10, Integer.valueOf(w24Var.f29700U));
            w24Var.m27470R(2, 10, Integer.valueOf(w24Var.f29700U));
            w24Var.m27470R(1, 3, w24Var.f29701V);
            w24Var.m27470R(2, 4, Integer.valueOf(w24Var.f29695P));
            w24Var.m27470R(2, 5, 0);
            w24Var.m27470R(1, 9, Boolean.valueOf(w24Var.f29703X));
            w24Var.m27470R(2, 7, u24Var);
            w24Var.m27470R(6, 8, u24Var);
            ya1Var.m28167e();
        } catch (Throwable th3) {
            th = th3;
            w24Var = this;
            w24Var.f29711d.m28167e();
            throw th;
        }
    }

    /* renamed from: H */
    private final int m27460H() {
        if (this.f29714e0.f29164a.m24700o()) {
            return this.f29716f0;
        }
        v34 v34Var = this.f29714e0;
        return v34Var.f29164a.mo23650n(v34Var.f29165b.f20363a, this.f29726m).f21855c;
    }

    /* renamed from: I */
    public static int m27461I(boolean z11, int i11) {
        return (!z11 || i11 == 1) ? 1 : 2;
    }

    /* renamed from: J */
    private final long m27462J(v34 v34Var) {
        if (v34Var.f29164a.m24700o()) {
            return g92.m22344f0(this.f29718g0);
        }
        if (v34Var.f29165b.m22262b()) {
            return v34Var.f29181r;
        }
        mr0 mr0Var = v34Var.f29164a;
        gf4 gf4Var = v34Var.f29165b;
        long j11 = v34Var.f29181r;
        m27464L(mr0Var, gf4Var, j11);
        return j11;
    }

    /* renamed from: K */
    private static long m27463K(v34 v34Var) {
        jq0 jq0Var = new jq0();
        ho0 ho0Var = new ho0();
        v34Var.f29164a.mo23650n(v34Var.f29165b.f20363a, ho0Var);
        long j11 = v34Var.f29166c;
        if (j11 == -9223372036854775807L) {
            long j12 = v34Var.f29164a.mo20109e(ho0Var.f21855c, jq0Var, 0L).f22940k;
            return 0L;
        }
        return j11;
    }

    /* renamed from: L */
    private final long m27464L(mr0 mr0Var, gf4 gf4Var, long j11) {
        mr0Var.mo23650n(gf4Var.f20363a, this.f29726m);
        return j11;
    }

    /* renamed from: M */
    private final Pair m27465M(mr0 mr0Var, int i11, long j11) {
        if (mr0Var.m24700o()) {
            this.f29716f0 = i11;
            if (j11 == -9223372036854775807L) {
                j11 = 0;
            }
            this.f29718g0 = j11;
            return null;
        }
        if (i11 == -1 || i11 >= mr0Var.mo20107c()) {
            i11 = mr0Var.mo23646g(false);
            long j12 = mr0Var.mo20109e(i11, this.f19536a, 0L).f22940k;
            j11 = g92.m22352j0(0L);
        }
        return mr0Var.m24698l(this.f19536a, this.f29726m, i11, g92.m22344f0(j11));
    }

    /* renamed from: N */
    public static vf4 m27466N(o44 o44Var) {
        return new vf4(0, o44Var.m25084b(), o44Var.m25083a());
    }

    /* renamed from: O */
    private final v34 m27467O(v34 v34Var, mr0 mr0Var, Pair pair) {
        boolean z11;
        gf4 gf4Var;
        dh4 dh4Var;
        gf4 gf4Var2;
        bj4 bj4Var;
        List list;
        v34 m27156b;
        long j11;
        if (mr0Var.m24700o() || pair != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        mr0 mr0Var2 = v34Var.f29164a;
        v34 m27160f = v34Var.m27160f(mr0Var);
        if (mr0Var.m24700o()) {
            gf4 m27154h = v34.m27154h();
            long m22344f0 = g92.m22344f0(this.f29718g0);
            v34 m27155a = m27160f.m27156b(m27154h, m22344f0, m22344f0, m22344f0, 0L, dh4.f19249d, this.f29707b, c83.m20832w()).m27155a(m27154h);
            m27155a.f29179p = m27155a.f29181r;
            return m27155a;
        }
        Object obj = m27160f.f29165b.f20363a;
        int i11 = g92.f20474a;
        boolean z12 = !obj.equals(pair.first);
        if (z12) {
            gf4Var = new gf4(pair.first);
        } else {
            gf4Var = m27160f.f29165b;
        }
        gf4 gf4Var3 = gf4Var;
        long longValue = ((Long) pair.second).longValue();
        long m22344f02 = g92.m22344f0(zzk());
        if (!mr0Var2.m24700o()) {
            mr0Var2.mo23650n(obj, this.f29726m);
        }
        if (!z12 && longValue >= m22344f02) {
            if (longValue == m22344f02) {
                int mo20105a = mr0Var.mo20105a(m27160f.f29174k.f20363a);
                if (mo20105a == -1 || mr0Var.mo20108d(mo20105a, this.f29726m, false).f21855c != mr0Var.mo23650n(gf4Var3.f20363a, this.f29726m).f21855c) {
                    mr0Var.mo23650n(gf4Var3.f20363a, this.f29726m);
                    if (gf4Var3.m22262b()) {
                        j11 = this.f29726m.m22985g(gf4Var3.f20364b, gf4Var3.f20365c);
                    } else {
                        j11 = this.f29726m.f21856d;
                    }
                    m27156b = m27160f.m27156b(gf4Var3, m27160f.f29181r, m27160f.f29181r, m27160f.f29167d, j11 - m27160f.f29181r, m27160f.f29171h, m27160f.f29172i, m27160f.f29173j).m27155a(gf4Var3);
                    m27156b.f29179p = j11;
                } else {
                    return m27160f;
                }
            } else {
                v71.m27175f(!gf4Var3.m22262b());
                long max = Math.max(0L, m27160f.f29180q - (longValue - m22344f02));
                long j12 = m27160f.f29179p;
                if (m27160f.f29174k.equals(m27160f.f29165b)) {
                    j12 = longValue + max;
                }
                m27156b = m27160f.m27156b(gf4Var3, longValue, longValue, longValue, max, m27160f.f29171h, m27160f.f29172i, m27160f.f29173j);
                m27156b.f29179p = j12;
            }
            return m27156b;
        }
        v71.m27175f(!gf4Var3.m22262b());
        if (z12) {
            dh4Var = dh4.f19249d;
        } else {
            dh4Var = m27160f.f29171h;
        }
        dh4 dh4Var2 = dh4Var;
        if (z12) {
            gf4Var2 = gf4Var3;
            bj4Var = this.f29707b;
        } else {
            gf4Var2 = gf4Var3;
            bj4Var = m27160f.f29172i;
        }
        bj4 bj4Var2 = bj4Var;
        if (z12) {
            list = c83.m20832w();
        } else {
            list = m27160f.f29173j;
        }
        v34 m27155a2 = m27160f.m27156b(gf4Var2, longValue, longValue, longValue, 0L, dh4Var2, bj4Var2, list).m27155a(gf4Var2);
        m27155a2.f29179p = longValue;
        return m27155a2;
    }

    /* renamed from: P */
    private final y34 m27468P(x34 x34Var) {
        int i11;
        int m27460H = m27460H();
        f34 f34Var = this.f29723j;
        mr0 mr0Var = this.f29714e0.f29164a;
        if (m27460H == -1) {
            i11 = 0;
        } else {
            i11 = m27460H;
        }
        return new y34(f34Var, x34Var, mr0Var, i11, this.f29733t, f34Var.m21928P());
    }

    /* renamed from: Q */
    public final void m27469Q(int i11, int i12) {
        if (i11 == this.f29696Q && i12 == this.f29697R) {
            return;
        }
        this.f29696Q = i11;
        this.f29697R = i12;
        jo1 jo1Var = this.f29724k;
        jo1Var.m23692d(24, new gl1() { // from class: com.google.android.gms.internal.ads.a24

            /* renamed from: a */
            public final /* synthetic */ int f16882a;

            /* renamed from: b */
            public final /* synthetic */ int f16883b;

            public /* synthetic */ a24(int i112, int i122) {
                r1 = i112;
                r2 = i122;
            }

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                int i13 = r1;
                int i14 = r2;
                int i15 = w24.f29679j0;
                ((ih0) obj).mo23260r(i13, i14);
            }
        });
        jo1Var.m23691c();
    }

    /* renamed from: R */
    private final void m27470R(int i11, int i12, Object obj) {
        c44[] c44VarArr = this.f29717g;
        int length = c44VarArr.length;
        for (int i13 = 0; i13 < 2; i13++) {
            c44 c44Var = c44VarArr[i13];
            if (c44Var.zzb() == i11) {
                y34 m27468P = m27468P(c44Var);
                m27468P.m28113f(i12);
                m27468P.m28112e(obj);
                m27468P.m28111d();
            }
        }
    }

    /* renamed from: S */
    public final void m27471S() {
        m27470R(1, 2, Float.valueOf(this.f29702W * this.f29737x.m25881a()));
    }

    /* renamed from: T */
    public final void m27472T(Object obj) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        c44[] c44VarArr = this.f29717g;
        int length = c44VarArr.length;
        int i11 = 0;
        while (true) {
            z11 = true;
            if (i11 >= 2) {
                break;
            }
            c44 c44Var = c44VarArr[i11];
            if (c44Var.zzb() == 2) {
                y34 m27468P = m27468P(c44Var);
                m27468P.m28113f(1);
                m27468P.m28112e(obj);
                m27468P.m28111d();
                arrayList.add(m27468P);
            }
            i11++;
        }
        Object obj2 = this.f29693N;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y34) it.next()).m28116i(this.f29681B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z11 = false;
            Object obj3 = this.f29693N;
            Surface surface = this.f29694O;
            if (obj3 == surface) {
                surface.release();
                this.f29694O = null;
            }
        } else {
            z11 = false;
        }
        this.f29693N = obj;
        if (z11) {
            m27473U(false, zzha.m28832d(new zzjf(3), ZAbstractBase.ZVU_BLEND_GEN_THUMB));
        }
    }

    /* renamed from: U */
    private final void m27473U(boolean z11, zzha zzhaVar) {
        boolean z12;
        v34 v34Var = this.f29714e0;
        v34 m27155a = v34Var.m27155a(v34Var.f29165b);
        m27155a.f29179p = m27155a.f29181r;
        m27155a.f29180q = 0L;
        v34 m27159e = m27155a.m27159e(1);
        if (zzhaVar != null) {
            m27159e = m27159e.m27158d(zzhaVar);
        }
        v34 v34Var2 = m27159e;
        this.f29682C++;
        this.f29723j.m21933X();
        if (v34Var2.f29164a.m24700o() && !this.f29714e0.f29164a.m24700o()) {
            z12 = true;
        } else {
            z12 = false;
        }
        m27475W(v34Var2, 0, 1, false, z12, 4, m27462J(v34Var2), -1);
    }

    /* renamed from: V */
    public final void m27474V(boolean z11, int i11, int i12) {
        boolean z12;
        int i13 = 0;
        if (z11 && i11 != -1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && i11 != 1) {
            i13 = 1;
        }
        v34 v34Var = this.f29714e0;
        if (v34Var.f29175l == z12 && v34Var.f29176m == i13) {
            return;
        }
        this.f29682C++;
        v34 m27157c = v34Var.m27157c(z12, i13);
        this.f29723j.m21932W(z12, i13);
        m27475W(m27157c, 0, i12, false, false, 5, -9223372036854775807L, -1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.n14.<init>(com.google.android.gms.internal.ads.au, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0286  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m27475W(com.google.android.gms.internal.ads.v34 r44, int r45, int r46, boolean r47, boolean r48, int r49, long r50, int r52) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w24.m27475W(com.google.android.gms.internal.ads.v34, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: X */
    public final void m27476X() {
        int zzh = zzh();
        if (zzh != 2 && zzh != 3) {
            return;
        }
        m27477Y();
        boolean z11 = this.f29714e0.f29178o;
        zzq();
        zzq();
    }

    /* renamed from: Y */
    private final void m27477Y() {
        IllegalStateException illegalStateException;
        this.f29711d.m28164b();
        if (Thread.currentThread() != this.f29731r.getThread()) {
            String m22349i = g92.m22349i("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f29731r.getThread().getName());
            if (!this.f29705Z) {
                if (this.f29706a0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                lr1.m24357f("ExoPlayerImpl", m22349i, illegalStateException);
                this.f29706a0 = true;
                return;
            }
            throw new IllegalStateException(m22349i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static boolean m27478Z(v34 v34Var) {
        if (v34Var.f29168e == 3 && v34Var.f29175l && v34Var.f29176m == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m27495o(w24 w24Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        w24Var.m27472T(surface);
        w24Var.f29694O = surface;
    }

    /* renamed from: A */
    public final void m27500A(if4 if4Var) {
        boolean z11;
        m27477Y();
        List singletonList = Collections.singletonList(if4Var);
        m27477Y();
        m27477Y();
        m27460H();
        zzl();
        this.f29682C++;
        if (!this.f29727n.isEmpty()) {
            int size = this.f29727n.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                this.f29727n.remove(i11);
            }
            this.f29722i0 = this.f29722i0.m28509h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < singletonList.size(); i12++) {
            s34 s34Var = new s34((if4) singletonList.get(i12), this.f29728o);
            arrayList.add(s34Var);
            this.f29727n.add(i12, new v24(s34Var.f27516b, s34Var.f27515a.m20504C()));
        }
        this.f29722i0 = this.f29722i0.m28508g(0, arrayList.size());
        z34 z34Var = new z34(this.f29727n, this.f29722i0, null);
        if (!z34Var.m24700o() && z34Var.mo20107c() < 0) {
            throw new zzag(z34Var, -1, -9223372036854775807L);
        }
        int mo23646g = z34Var.mo23646g(false);
        v34 m27467O = m27467O(this.f29714e0, z34Var, m27465M(z34Var, mo23646g, -9223372036854775807L));
        int i13 = m27467O.f29168e;
        if (mo23646g != -1 && i13 != 1) {
            i13 = 4;
            if (!z34Var.m24700o() && mo23646g < z34Var.mo20107c()) {
                i13 = 2;
            }
        }
        v34 m27159e = m27467O.m27159e(i13);
        this.f29723j.m21935Z(arrayList, mo23646g, g92.m22344f0(-9223372036854775807L), this.f29722i0);
        if (!this.f29714e0.f29165b.f20363a.equals(m27159e.f29165b.f20363a) && !this.f29714e0.f29164a.m24700o()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m27475W(m27159e, 0, 1, false, z11, 4, m27462J(m27159e), -1);
    }

    /* renamed from: B */
    public final void m27501B(boolean z11) {
        m27477Y();
        int m25882b = this.f29737x.m25882b(z11, zzh());
        m27474V(z11, m25882b, m27461I(z11, m25882b));
    }

    /* renamed from: C */
    public final void m27502C(boolean z11) {
        this.f29705Z = false;
    }

    /* renamed from: D */
    public final void m27503D(Surface surface) {
        int i11;
        m27477Y();
        m27472T(surface);
        if (surface == null) {
            i11 = 0;
        } else {
            i11 = -1;
        }
        m27469Q(i11, i11);
    }

    /* renamed from: E */
    public final void m27504E(float f11) {
        m27477Y();
        float m22307A = g92.m22307A(f11, 0.0f, 1.0f);
        if (this.f29702W == m22307A) {
            return;
        }
        this.f29702W = m22307A;
        m27471S();
        jo1 jo1Var = this.f29724k;
        jo1Var.m23692d(22, new gl1() { // from class: com.google.android.gms.internal.ads.c24

            /* renamed from: a */
            public final /* synthetic */ float f18093a;

            public /* synthetic */ c24(float m22307A2) {
                r1 = m22307A2;
            }

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                float f12 = r1;
                int i11 = w24.f29679j0;
                ((ih0) obj).mo23264v(f12);
            }
        });
        jo1Var.m23691c();
    }

    /* renamed from: F */
    public final void m27505F() {
        m27477Y();
        m27477Y();
        this.f29737x.m25882b(zzq(), 1);
        m27473U(false, null);
        this.f29704Y = new u61(c83.m20832w(), this.f29714e0.f29181r);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    /* renamed from: a */
    public final void mo22693a(int i11, long j11) {
        m27477Y();
        this.f29730q.zzx();
        mr0 mr0Var = this.f29714e0.f29164a;
        if (i11 >= 0 && (mr0Var.m24700o() || i11 < mr0Var.mo20107c())) {
            int i12 = 1;
            this.f29682C++;
            if (zzs()) {
                lr1.m24356e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                d34 d34Var = new d34(this.f29714e0);
                d34Var.m21258a(1);
                this.f29720h0.f30301a.m27512u(d34Var);
                return;
            }
            if (zzh() != 1) {
                i12 = 2;
            }
            int zzf = zzf();
            v34 m27467O = m27467O(this.f29714e0.m27159e(i12), mr0Var, m27465M(mr0Var, i11, j11));
            this.f29723j.m21931V(mr0Var, i11, g92.m22344f0(j11));
            m27475W(m27467O, 0, 1, true, true, 1, m27462J(m27467O), zzf);
            return;
        }
        throw new zzag(mr0Var, i11, j11);
    }

    /* renamed from: b */
    public final zzha m27506b() {
        m27477Y();
        return this.f29714e0.f29169f;
    }

    /* renamed from: b0 */
    public final int m27507b0() {
        m27477Y();
        int length = this.f29717g.length;
        return 2;
    }

    /* renamed from: c0 */
    public final long m27508c0() {
        m27477Y();
        if (zzs()) {
            v34 v34Var = this.f29714e0;
            if (v34Var.f29174k.equals(v34Var.f29165b)) {
                return g92.m22352j0(this.f29714e0.f29179p);
            }
            return m27509d0();
        }
        m27477Y();
        if (this.f29714e0.f29164a.m24700o()) {
            return this.f29718g0;
        }
        v34 v34Var2 = this.f29714e0;
        long j11 = 0;
        if (v34Var2.f29174k.f20366d != v34Var2.f29165b.f20366d) {
            return g92.m22352j0(v34Var2.f29164a.mo20109e(zzf(), this.f19536a, 0L).f22941l);
        }
        long j12 = v34Var2.f29179p;
        if (this.f29714e0.f29174k.m22262b()) {
            v34 v34Var3 = this.f29714e0;
            v34Var3.f29164a.mo23650n(v34Var3.f29174k.f20363a, this.f29726m).m22986h(this.f29714e0.f29174k.f20364b);
        } else {
            j11 = j12;
        }
        v34 v34Var4 = this.f29714e0;
        m27464L(v34Var4.f29164a, v34Var4.f29174k, j11);
        return g92.m22352j0(j11);
    }

    /* renamed from: d0 */
    public final long m27509d0() {
        m27477Y();
        if (!zzs()) {
            mr0 zzn = zzn();
            if (zzn.m24700o()) {
                return -9223372036854775807L;
            }
            return g92.m22352j0(zzn.mo20109e(zzf(), this.f19536a, 0L).f22941l);
        }
        v34 v34Var = this.f29714e0;
        gf4 gf4Var = v34Var.f29165b;
        v34Var.f29164a.mo23650n(gf4Var.f20363a, this.f29726m);
        return g92.m22352j0(this.f29726m.m22985g(gf4Var.f20364b, gf4Var.f20365c));
    }

    /* renamed from: s */
    public final void m27510s(u44 u44Var) {
        r44 r44Var = this.f29730q;
        u44Var.getClass();
        r44Var.mo25965W(u44Var);
    }

    /* renamed from: t */
    public final /* synthetic */ void m27511t(d34 d34Var) {
        long j11;
        boolean z11;
        long j12;
        boolean z12;
        int i11 = this.f29682C - d34Var.f19074c;
        this.f29682C = i11;
        boolean z13 = true;
        if (d34Var.f19075d) {
            this.f29683D = d34Var.f19076e;
            this.f29684E = true;
        }
        if (d34Var.f19077f) {
            this.f29685F = d34Var.f19078g;
        }
        if (i11 == 0) {
            mr0 mr0Var = d34Var.f19073b.f29164a;
            if (!this.f29714e0.f29164a.m24700o() && mr0Var.m24700o()) {
                this.f29716f0 = -1;
                this.f29718g0 = 0L;
            }
            if (!mr0Var.m24700o()) {
                List m28431y = ((z34) mr0Var).m28431y();
                if (m28431y.size() == this.f29727n.size()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v71.m27175f(z12);
                for (int i12 = 0; i12 < m28431y.size(); i12++) {
                    ((v24) this.f29727n.get(i12)).f29139b = (mr0) m28431y.get(i12);
                }
            }
            if (this.f29684E) {
                if (d34Var.f19073b.f29165b.equals(this.f29714e0.f29165b) && d34Var.f19073b.f29167d == this.f29714e0.f29181r) {
                    z13 = false;
                }
                if (z13) {
                    if (!mr0Var.m24700o() && !d34Var.f19073b.f29165b.m22262b()) {
                        v34 v34Var = d34Var.f19073b;
                        gf4 gf4Var = v34Var.f29165b;
                        j12 = v34Var.f29167d;
                        m27464L(mr0Var, gf4Var, j12);
                    } else {
                        j12 = d34Var.f19073b.f29167d;
                    }
                    z11 = z13;
                    j11 = j12;
                } else {
                    j11 = -9223372036854775807L;
                    z11 = z13;
                }
            } else {
                j11 = -9223372036854775807L;
                z11 = false;
            }
            this.f29684E = false;
            m27475W(d34Var.f19073b, 1, this.f29685F, false, z11, this.f29683D, j11, -1);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void m27512u(d34 d34Var) {
        this.f29721i.mo20005e(new Runnable() { // from class: com.google.android.gms.internal.ads.y14

            /* renamed from: q */
            public final /* synthetic */ d34 f30725q;

            public /* synthetic */ y14(d34 d34Var2) {
                r2 = d34Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w24.this.m27511t(r2);
            }
        });
    }

    /* renamed from: v */
    public final /* synthetic */ void m27513v(ih0 ih0Var) {
        ih0Var.mo23254P(this.f29687H);
    }

    /* renamed from: x */
    public final void m27514x() {
        m27477Y();
        boolean zzq = zzq();
        int i11 = 2;
        int m25882b = this.f29737x.m25882b(zzq, 2);
        m27474V(zzq, m25882b, m27461I(zzq, m25882b));
        v34 v34Var = this.f29714e0;
        if (v34Var.f29168e != 1) {
            return;
        }
        v34 m27158d = v34Var.m27158d(null);
        if (true == m27158d.f29164a.m24700o()) {
            i11 = 4;
        }
        v34 m27159e = m27158d.m27159e(i11);
        this.f29682C++;
        this.f29723j.m21930U();
        m27475W(m27159e, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    /* renamed from: y */
    public final void m27515y() {
        AudioTrack audioTrack;
        lr1.m24355d("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta02] [" + g92.f20478e + "] [" + AbstractC4368bv.m20758a() + "]");
        m27477Y();
        if (g92.f20474a < 21 && (audioTrack = this.f29692M) != null) {
            audioTrack.release();
            this.f29692M = null;
        }
        this.f29738y.m25085e();
        this.f29737x.m25883d();
        if (!this.f29723j.m21934Y()) {
            jo1 jo1Var = this.f29724k;
            jo1Var.m23692d(10, z14.f31326a);
            jo1Var.m23691c();
        }
        this.f29724k.m23693e();
        this.f29721i.mo20003c(null);
        this.f29732s.mo23277b(this.f29730q);
        v34 m27159e = this.f29714e0.m27159e(1);
        this.f29714e0 = m27159e;
        v34 m27155a = m27159e.m27155a(m27159e.f29165b);
        this.f29714e0 = m27155a;
        m27155a.f29179p = m27155a.f29181r;
        this.f29714e0.f29180q = 0L;
        this.f29730q.mo25979p();
        this.f29719h.mo20137a();
        Surface surface = this.f29694O;
        if (surface != null) {
            surface.release();
            this.f29694O = null;
        }
        this.f29704Y = new u61(c83.m20832w(), 0L);
    }

    /* renamed from: z */
    public final void m27516z(u44 u44Var) {
        this.f29730q.mo25970e(u44Var);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zzd() {
        m27477Y();
        if (zzs()) {
            return this.f29714e0.f29165b.f20364b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zze() {
        m27477Y();
        if (zzs()) {
            return this.f29714e0.f29165b.f20365c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zzf() {
        m27477Y();
        int m27460H = m27460H();
        if (m27460H == -1) {
            return 0;
        }
        return m27460H;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zzg() {
        m27477Y();
        if (this.f29714e0.f29164a.m24700o()) {
            return 0;
        }
        v34 v34Var = this.f29714e0;
        return v34Var.f29164a.mo20105a(v34Var.f29165b.f20363a);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zzh() {
        m27477Y();
        return this.f29714e0.f29168e;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zzi() {
        m27477Y();
        return this.f29714e0.f29176m;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final int zzj() {
        m27477Y();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final long zzk() {
        m27477Y();
        if (zzs()) {
            v34 v34Var = this.f29714e0;
            v34Var.f29164a.mo23650n(v34Var.f29165b.f20363a, this.f29726m);
            v34 v34Var2 = this.f29714e0;
            if (v34Var2.f29166c == -9223372036854775807L) {
                long j11 = v34Var2.f29164a.mo20109e(zzf(), this.f19536a, 0L).f22940k;
                return g92.m22352j0(0L);
            }
            return g92.m22352j0(0L) + g92.m22352j0(this.f29714e0.f29166c);
        }
        return zzl();
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final long zzl() {
        m27477Y();
        return g92.m22352j0(m27462J(this.f29714e0));
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final long zzm() {
        m27477Y();
        return g92.m22352j0(this.f29714e0.f29180q);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final mr0 zzn() {
        m27477Y();
        return this.f29714e0.f29164a;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final q21 zzo() {
        m27477Y();
        return this.f29714e0.f29172i.f17774d;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final boolean zzq() {
        m27477Y();
        return this.f29714e0.f29175l;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final boolean zzr() {
        m27477Y();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final boolean zzs() {
        m27477Y();
        return this.f29714e0.f29165b.m22262b();
    }
}
