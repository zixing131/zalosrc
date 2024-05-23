package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class kd4 extends pu3 {

    /* renamed from: A0 */
    private static final byte[] f23222A0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private C4671k3 f23223A;

    /* renamed from: B */
    private MediaCrypto f23224B;

    /* renamed from: C */
    private boolean f23225C;

    /* renamed from: D */
    private long f23226D;

    /* renamed from: E */
    private float f23227E;

    /* renamed from: F */
    private float f23228F;

    /* renamed from: G */
    private gd4 f23229G;

    /* renamed from: H */
    private C4671k3 f23230H;

    /* renamed from: I */
    private MediaFormat f23231I;

    /* renamed from: J */
    private boolean f23232J;

    /* renamed from: K */
    private float f23233K;

    /* renamed from: L */
    private ArrayDeque f23234L;

    /* renamed from: M */
    private zzqp f23235M;

    /* renamed from: N */
    private hd4 f23236N;

    /* renamed from: O */
    private int f23237O;

    /* renamed from: P */
    private boolean f23238P;

    /* renamed from: Q */
    private boolean f23239Q;

    /* renamed from: R */
    private boolean f23240R;

    /* renamed from: S */
    private boolean f23241S;

    /* renamed from: T */
    private boolean f23242T;

    /* renamed from: U */
    private boolean f23243U;

    /* renamed from: V */
    private boolean f23244V;

    /* renamed from: W */
    private boolean f23245W;

    /* renamed from: X */
    private boolean f23246X;

    /* renamed from: Y */
    private bd4 f23247Y;

    /* renamed from: Z */
    private long f23248Z;

    /* renamed from: a0 */
    private int f23249a0;

    /* renamed from: b0 */
    private int f23250b0;

    /* renamed from: c0 */
    private ByteBuffer f23251c0;

    /* renamed from: d0 */
    private boolean f23252d0;

    /* renamed from: e0 */
    private boolean f23253e0;

    /* renamed from: f0 */
    private boolean f23254f0;

    /* renamed from: g0 */
    private boolean f23255g0;

    /* renamed from: h0 */
    private boolean f23256h0;

    /* renamed from: i0 */
    private boolean f23257i0;

    /* renamed from: j0 */
    private int f23258j0;

    /* renamed from: k0 */
    private int f23259k0;

    /* renamed from: l0 */
    private int f23260l0;

    /* renamed from: m */
    private final fd4 f23261m;

    /* renamed from: m0 */
    private boolean f23262m0;

    /* renamed from: n */
    private final md4 f23263n;

    /* renamed from: n0 */
    private boolean f23264n0;

    /* renamed from: o */
    private final float f23265o;

    /* renamed from: o0 */
    private boolean f23266o0;

    /* renamed from: p */
    private final il3 f23267p;

    /* renamed from: p0 */
    private long f23268p0;

    /* renamed from: q */
    private final il3 f23269q;

    /* renamed from: q0 */
    private long f23270q0;

    /* renamed from: r */
    private final il3 f23271r;

    /* renamed from: r0 */
    private boolean f23272r0;

    /* renamed from: s */
    private final ad4 f23273s;

    /* renamed from: s0 */
    private boolean f23274s0;

    /* renamed from: t */
    private final b62 f23275t;

    /* renamed from: t0 */
    private boolean f23276t0;

    /* renamed from: u */
    private final ArrayList f23277u;

    /* renamed from: u0 */
    protected lv3 f23278u0;

    /* renamed from: v */
    private final MediaCodec.BufferInfo f23279v;

    /* renamed from: v0 */
    private long f23280v0;

    /* renamed from: w */
    private final long[] f23281w;

    /* renamed from: w0 */
    private long f23282w0;

    /* renamed from: x */
    private final long[] f23283x;

    /* renamed from: x0 */
    private int f23284x0;

    /* renamed from: y */
    private final long[] f23285y;

    /* renamed from: y0 */
    private kc4 f23286y0;

    /* renamed from: z */
    private C4671k3 f23287z;

    /* renamed from: z0 */
    private kc4 f23288z0;

    public kd4(int i11, fd4 fd4Var, md4 md4Var, boolean z11, float f11) {
        super(i11);
        this.f23261m = fd4Var;
        md4Var.getClass();
        this.f23263n = md4Var;
        this.f23265o = f11;
        this.f23267p = new il3(0, 0);
        this.f23269q = new il3(0, 0);
        this.f23271r = new il3(2, 0);
        ad4 ad4Var = new ad4();
        this.f23273s = ad4Var;
        this.f23275t = new b62(10);
        this.f23277u = new ArrayList();
        this.f23279v = new MediaCodec.BufferInfo();
        this.f23227E = 1.0f;
        this.f23228F = 1.0f;
        this.f23226D = -9223372036854775807L;
        this.f23281w = new long[10];
        this.f23283x = new long[10];
        this.f23285y = new long[10];
        this.f23280v0 = -9223372036854775807L;
        this.f23282w0 = -9223372036854775807L;
        ad4Var.m23294i(0);
        ad4Var.f22217c.order(ByteOrder.nativeOrder());
        this.f23233K = -1.0f;
        this.f23237O = 0;
        this.f23258j0 = 0;
        this.f23249a0 = -1;
        this.f23250b0 = -1;
        this.f23248Z = -9223372036854775807L;
        this.f23268p0 = -9223372036854775807L;
        this.f23270q0 = -9223372036854775807L;
        this.f23259k0 = 0;
        this.f23260l0 = 0;
    }

    /* renamed from: I */
    private final void m23897I() {
        this.f23256h0 = false;
        this.f23273s.mo20090b();
        this.f23271r.mo20090b();
        this.f23255g0 = false;
        this.f23254f0 = false;
    }

    /* renamed from: J */
    private final void m23898J() {
        if (this.f23262m0) {
            this.f23259k0 = 1;
            this.f23260l0 = 3;
        } else {
            m23920l0();
            m23919j0();
        }
    }

    /* renamed from: P */
    private final void m23899P() {
        try {
            throw null;
        } catch (MediaCryptoException e11) {
            throw m25549s(e11, this.f23287z, false, 6006);
        }
    }

    /* renamed from: Q */
    private final boolean m23900Q() {
        if (this.f23262m0) {
            this.f23259k0 = 1;
            if (!this.f23239Q && !this.f23241S) {
                this.f23260l0 = 2;
            } else {
                this.f23260l0 = 3;
                return false;
            }
        } else {
            m23899P();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* renamed from: R */
    private final boolean m23901R() {
        gd4 gd4Var = this.f23229G;
        boolean z11 = 0;
        if (gd4Var == null || this.f23259k0 == 2 || this.f23272r0) {
            return false;
        }
        if (this.f23249a0 < 0) {
            int zza = gd4Var.zza();
            this.f23249a0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f23269q.f22217c = this.f23229G.zzf(zza);
            this.f23269q.mo20090b();
        }
        if (this.f23259k0 == 1) {
            if (!this.f23246X) {
                this.f23264n0 = true;
                this.f23229G.mo21996c(this.f23249a0, 0, 0, 0L, 4);
                m23910u0();
            }
            this.f23259k0 = 2;
            return false;
        }
        if (this.f23244V) {
            this.f23244V = false;
            this.f23269q.f22217c.put(f23222A0);
            this.f23229G.mo21996c(this.f23249a0, 0, 38, 0L, 0);
            m23910u0();
            this.f23262m0 = true;
            return true;
        }
        if (this.f23258j0 == 1) {
            for (int i11 = 0; i11 < this.f23230H.f23101n.size(); i11++) {
                this.f23269q.f22217c.put((byte[]) this.f23230H.f23101n.get(i11));
            }
            this.f23258j0 = 2;
        }
        int position = this.f23269q.f22217c.position();
        h34 m25551u = m25551u();
        try {
            int m25548r = m25548r(m25551u, this.f23269q, 0);
            if (mo20801e()) {
                this.f23270q0 = this.f23268p0;
            }
            if (m25548r == -3) {
                return false;
            }
            if (m25548r == -5) {
                if (this.f23258j0 == 2) {
                    this.f23269q.mo20090b();
                    this.f23258j0 = 1;
                }
                mo22051H(m25551u);
                return true;
            }
            il3 il3Var = this.f23269q;
            if (il3Var.m22009g()) {
                if (this.f23258j0 == 2) {
                    il3Var.mo20090b();
                    this.f23258j0 = 1;
                }
                this.f23272r0 = true;
                if (!this.f23262m0) {
                    m23909t0();
                    return false;
                }
                try {
                    if (!this.f23246X) {
                        this.f23264n0 = true;
                        this.f23229G.mo21996c(this.f23249a0, 0, 0, 0L, 4);
                        m23910u0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e11) {
                    throw m25549s(e11, this.f23287z, false, g92.m22328V(e11.getErrorCode()));
                }
            }
            if (!this.f23262m0 && !il3Var.m22010h()) {
                il3Var.mo20090b();
                if (this.f23258j0 == 2) {
                    this.f23258j0 = 1;
                }
                return true;
            }
            boolean m23296k = il3Var.m23296k();
            if (m23296k) {
                il3Var.f22216b.m22906b(position);
            }
            if (this.f23238P && !m23296k) {
                ByteBuffer byteBuffer = this.f23269q.f22217c;
                byte[] bArr = AbstractC4557h.f21470a;
                int position2 = byteBuffer.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 < position2) {
                        int i15 = byteBuffer.get(i12) & 255;
                        if (i13 == 3) {
                            if (i15 == 1) {
                                if ((byteBuffer.get(i14) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i12 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
                                    break;
                                }
                                i15 = 1;
                            }
                        } else if (i15 == 0) {
                            i13++;
                        }
                        if (i15 != 0) {
                            i13 = 0;
                        }
                        i12 = i14;
                    } else {
                        byteBuffer.clear();
                        break;
                    }
                }
                if (this.f23269q.f22217c.position() == 0) {
                    return true;
                }
                this.f23238P = false;
            }
            il3 il3Var2 = this.f23269q;
            long j11 = il3Var2.f22219e;
            bd4 bd4Var = this.f23247Y;
            if (bd4Var != null) {
                j11 = bd4Var.m20482b(this.f23287z, il3Var2);
                this.f23268p0 = Math.max(this.f23268p0, this.f23247Y.m20481a(this.f23287z));
            }
            long j12 = j11;
            if (this.f23269q.m22008f()) {
                this.f23277u.add(Long.valueOf(j12));
            }
            if (this.f23276t0) {
                this.f23275t.m20411d(j12, this.f23287z);
                this.f23276t0 = false;
            }
            this.f23268p0 = Math.max(this.f23268p0, j12);
            this.f23269q.m23295j();
            il3 il3Var3 = this.f23269q;
            if (il3Var3.m22007e()) {
                mo22067i0(il3Var3);
            }
            mo22063Z(this.f23269q);
            try {
                if (m23296k) {
                    this.f23229G.mo21998e(this.f23249a0, 0, this.f23269q.f22216b, j12, 0);
                } else {
                    this.f23229G.mo21996c(this.f23249a0, 0, this.f23269q.f22217c.limit(), j12, 0);
                }
                m23910u0();
                this.f23262m0 = true;
                this.f23258j0 = 0;
                lv3 lv3Var = this.f23278u0;
                z11 = lv3Var.f24128c + 1;
                lv3Var.f24128c = z11;
                return true;
            } catch (MediaCodec.CryptoException e12) {
                throw m25549s(e12, this.f23287z, z11, g92.m22328V(e12.getErrorCode()));
            }
        } catch (zzgh e13) {
            mo22057M(e13);
            m23903T(0);
            m23906X();
            return true;
        }
    }

    /* renamed from: S */
    private final boolean m23902S() {
        return this.f23250b0 >= 0;
    }

    /* renamed from: T */
    private final boolean m23903T(int i11) {
        h34 m25551u = m25551u();
        this.f23267p.mo20090b();
        int m25548r = m25548r(m25551u, this.f23267p, i11 | 4);
        if (m25548r == -5) {
            mo22051H(m25551u);
            return true;
        }
        if (m25548r == -4 && this.f23267p.m22009g()) {
            this.f23272r0 = true;
            m23909t0();
            return false;
        }
        return false;
    }

    /* renamed from: U */
    private final boolean m23904U(long j11) {
        if (this.f23226D != -9223372036854775807L && SystemClock.elapsedRealtime() - j11 >= this.f23226D) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    private final boolean m23905V(C4671k3 c4671k3) {
        if (g92.f20474a >= 23 && this.f23229G != null && this.f23260l0 != 3 && mo20807n() != 0) {
            float mo22047E = mo22047E(this.f23228F, c4671k3, m25547p());
            float f11 = this.f23233K;
            if (f11 == mo22047E) {
                return true;
            }
            if (mo22047E == -1.0f) {
                m23898J();
                return false;
            }
            if (f11 == -1.0f && mo22047E <= this.f23265o) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo22047E);
            this.f23229G.mo22002p(bundle);
            this.f23233K = mo22047E;
        }
        return true;
    }

    /* renamed from: X */
    private final void m23906X() {
        try {
            this.f23229G.zzi();
        } finally {
            mo22069m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r0 */
    public static boolean m23907r0(C4671k3 c4671k3) {
        if (c4671k3.f23086E != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:            if ("stvm8".equals(r5) == false) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ad, code lost:            if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L92;     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0266  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m23908s0(hd4 hd4Var, MediaCrypto mediaCrypto) {
        float mo22047E;
        gd4 fe4Var;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str;
        String str2 = hd4Var.f21638a;
        int i12 = g92.f20474a;
        float f11 = -1.0f;
        if (i12 < 23) {
            mo22047E = -1.0f;
        } else {
            mo22047E = mo22047E(this.f23228F, this.f23287z, m25547p());
        }
        if (mo22047E > this.f23265o) {
            f11 = mo22047E;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        ed4 mo22055K = mo22055K(hd4Var, this.f23287z, null, f11);
        if (i12 >= 31) {
            jd4.m23607a(mo22055K, m25553w());
        }
        try {
            Trace.beginSection("createCodec:" + str2);
            if (i12 >= 23 && i12 >= 31) {
                int m23844b = k70.m23844b(mo22055K.f19595c.f23099l);
                lr1.m24355d("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(g92.m22357o(m23844b)));
                fe4Var = new oc4(m23844b, false).m25156c(mo22055K);
            } else {
                try {
                    hd4 hd4Var2 = mo22055K.f19593a;
                    hd4Var2.getClass();
                    String str3 = hd4Var2.f21638a;
                    Trace.beginSection("createCodec:".concat(String.valueOf(str3)));
                    MediaCodec createByCodecName = MediaCodec.createByCodecName(str3);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        createByCodecName.configure(mo22055K.f19594b, mo22055K.f19596d, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        createByCodecName.start();
                        Trace.endSection();
                        fe4Var = new fe4(createByCodecName, null);
                    } catch (IOException | RuntimeException e11) {
                        e = e11;
                        mediaCodec = createByCodecName;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (RuntimeException e13) {
                    e = e13;
                }
            }
            this.f23229G = fe4Var;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f23236N = hd4Var;
            this.f23233K = f11;
            this.f23230H = this.f23287z;
            if (i12 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str4 = g92.f20477d;
                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                    i11 = 2;
                    this.f23237O = i11;
                    C4671k3 c4671k3 = this.f23230H;
                    if (i12 >= 21 && c4671k3.f23101n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f23238P = z11;
                    if (i12 != 19 && g92.f20477d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f23239Q = z12;
                    if (i12 != 29 && "c2.android.aac.decoder".equals(str2)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f23240R = z13;
                    if (i12 <= 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                        if (i12 <= 19) {
                            String str5 = g92.f20475b;
                            if (!"hb2000".equals(str5)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str2)) {
                            }
                        }
                        z14 = false;
                        this.f23241S = z14;
                        if (i12 != 21 && "OMX.google.aac.decoder".equals(str2)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f23242T = z15;
                        if (i12 < 21 && "OMX.SEC.mp3.dec".equals(str2) && "samsung".equals(g92.f20476c)) {
                            str = g92.f20475b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z16 = true;
                                this.f23243U = z16;
                                String str6 = hd4Var.f21638a;
                                if ((i12 > 25 && "OMX.rk.video_decoder.avc".equals(str6)) || ((i12 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6))) || ("Amazon".equals(g92.f20476c) && "AFTS".equals(g92.f20477d) && hd4Var.f21643f))) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                this.f23246X = z17;
                                this.f23229G.zzr();
                                if ("c2.android.mp3.decoder".equals(hd4Var.f21638a)) {
                                    this.f23247Y = new bd4();
                                }
                                if (mo20807n() == 2) {
                                    this.f23248Z = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.f23278u0.f24126a++;
                                mo22058N(str2, mo22055K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                        }
                        z16 = false;
                        this.f23243U = z16;
                        String str62 = hd4Var.f21638a;
                        if (i12 > 25) {
                        }
                        z17 = false;
                        this.f23246X = z17;
                        this.f23229G.zzr();
                        if ("c2.android.mp3.decoder".equals(hd4Var.f21638a)) {
                        }
                        if (mo20807n() == 2) {
                        }
                        this.f23278u0.f24126a++;
                        mo22058N(str2, mo22055K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z14 = true;
                    this.f23241S = z14;
                    if (i12 != 21) {
                    }
                    z15 = false;
                    this.f23242T = z15;
                    if (i12 < 21) {
                        str = g92.f20475b;
                        if (!str.startsWith("baffin")) {
                        }
                        z16 = true;
                        this.f23243U = z16;
                        String str622 = hd4Var.f21638a;
                        if (i12 > 25) {
                        }
                        z17 = false;
                        this.f23246X = z17;
                        this.f23229G.zzr();
                        if ("c2.android.mp3.decoder".equals(hd4Var.f21638a)) {
                        }
                        if (mo20807n() == 2) {
                        }
                        this.f23278u0.f24126a++;
                        mo22058N(str2, mo22055K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z16 = false;
                    this.f23243U = z16;
                    String str6222 = hd4Var.f21638a;
                    if (i12 > 25) {
                    }
                    z17 = false;
                    this.f23246X = z17;
                    this.f23229G.zzr();
                    if ("c2.android.mp3.decoder".equals(hd4Var.f21638a)) {
                    }
                    if (mo20807n() == 2) {
                    }
                    this.f23278u0.f24126a++;
                    mo22058N(str2, mo22055K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            if (i12 < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                String str7 = g92.f20475b;
                if ("flounder".equals(str7) || "flounder_lte".equals(str7) || "grouper".equals(str7) || "tilapia".equals(str7)) {
                    i11 = 1;
                    this.f23237O = i11;
                    C4671k3 c4671k32 = this.f23230H;
                    if (i12 >= 21) {
                    }
                    z11 = false;
                    this.f23238P = z11;
                    if (i12 != 19) {
                    }
                    z12 = false;
                    this.f23239Q = z12;
                    if (i12 != 29) {
                    }
                    z13 = false;
                    this.f23240R = z13;
                    if (i12 <= 23) {
                    }
                    if (i12 <= 19) {
                    }
                    z14 = false;
                    this.f23241S = z14;
                    if (i12 != 21) {
                    }
                    z15 = false;
                    this.f23242T = z15;
                    if (i12 < 21) {
                    }
                    z16 = false;
                    this.f23243U = z16;
                    String str62222 = hd4Var.f21638a;
                    if (i12 > 25) {
                    }
                    z17 = false;
                    this.f23246X = z17;
                    this.f23229G.zzr();
                    if ("c2.android.mp3.decoder".equals(hd4Var.f21638a)) {
                    }
                    if (mo20807n() == 2) {
                    }
                    this.f23278u0.f24126a++;
                    mo22058N(str2, mo22055K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            i11 = 0;
            this.f23237O = i11;
            C4671k3 c4671k322 = this.f23230H;
            if (i12 >= 21) {
            }
            z11 = false;
            this.f23238P = z11;
            if (i12 != 19) {
            }
            z12 = false;
            this.f23239Q = z12;
            if (i12 != 29) {
            }
            z13 = false;
            this.f23240R = z13;
            if (i12 <= 23) {
            }
            if (i12 <= 19) {
            }
            z14 = false;
            this.f23241S = z14;
            if (i12 != 21) {
            }
            z15 = false;
            this.f23242T = z15;
            if (i12 < 21) {
            }
            z16 = false;
            this.f23243U = z16;
            String str622222 = hd4Var.f21638a;
            if (i12 > 25) {
            }
            z17 = false;
            this.f23246X = z17;
            this.f23229G.zzr();
            if ("c2.android.mp3.decoder".equals(hd4Var.f21638a)) {
            }
            if (mo20807n() == 2) {
            }
            this.f23278u0.f24126a++;
            mo22058N(str2, mo22055K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* renamed from: t0 */
    private final void m23909t0() {
        int i11 = this.f23260l0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    this.f23274s0 = true;
                    mo23913a0();
                    return;
                } else {
                    m23920l0();
                    m23919j0();
                    return;
                }
            }
            m23906X();
            m23899P();
            return;
        }
        m23906X();
    }

    /* renamed from: u0 */
    private final void m23910u0() {
        this.f23249a0 = -1;
        this.f23269q.f22217c = null;
    }

    /* renamed from: v0 */
    private final void m23911v0() {
        this.f23250b0 = -1;
        this.f23251c0 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: A */
    public void mo22044A() {
        try {
            m23897I();
            m23920l0();
        } finally {
            this.f23288z0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: D */
    protected final void mo23912D(C4671k3[] c4671k3Arr, long j11, long j12) {
        boolean z11 = true;
        if (this.f23282w0 == -9223372036854775807L) {
            if (this.f23280v0 != -9223372036854775807L) {
                z11 = false;
            }
            v71.m27175f(z11);
            this.f23280v0 = j11;
            this.f23282w0 = j12;
            return;
        }
        int i11 = this.f23284x0;
        if (i11 == 10) {
            lr1.m24356e("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f23283x[9]);
        } else {
            this.f23284x0 = i11 + 1;
        }
        long[] jArr = this.f23281w;
        int i12 = this.f23284x0 - 1;
        jArr[i12] = j11;
        this.f23283x[i12] = j12;
        this.f23285y[i12] = this.f23268p0;
    }

    /* renamed from: E */
    protected abstract float mo22047E(float f11, C4671k3 c4671k3, C4671k3[] c4671k3Arr);

    /* renamed from: F */
    protected abstract int mo22048F(md4 md4Var, C4671k3 c4671k3);

    /* renamed from: G */
    protected abstract lw3 mo22049G(hd4 hd4Var, C4671k3 c4671k3, C4671k3 c4671k32);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:            if (m23900Q() == false) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:            if (m23900Q() == false) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:            if (m23900Q() == false) goto L31;     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw3 mo22051H(h34 h34Var) {
        boolean z11;
        int i11;
        boolean z12 = true;
        this.f23276t0 = true;
        C4671k3 c4671k3 = h34Var.f21525a;
        c4671k3.getClass();
        if (c4671k3.f23099l != null) {
            kc4 kc4Var = h34Var.f21526b;
            this.f23288z0 = kc4Var;
            this.f23287z = c4671k3;
            if (this.f23254f0) {
                this.f23256h0 = true;
                return null;
            }
            gd4 gd4Var = this.f23229G;
            if (gd4Var == null) {
                this.f23234L = null;
                m23919j0();
                return null;
            }
            hd4 hd4Var = this.f23236N;
            C4671k3 c4671k32 = this.f23230H;
            kc4 kc4Var2 = this.f23286y0;
            if (kc4Var2 == kc4Var) {
                if (kc4Var == kc4Var2 || g92.f20474a >= 23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v71.m27175f(z11);
                lw3 mo22049G = mo22049G(hd4Var, c4671k32, c4671k3);
                int i12 = mo22049G.f24263d;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (m23905V(c4671k3)) {
                                this.f23230H = c4671k3;
                                if (kc4Var != kc4Var2) {
                                }
                            }
                            i11 = 16;
                        } else {
                            if (m23905V(c4671k3)) {
                                this.f23257i0 = true;
                                this.f23258j0 = 1;
                                int i13 = this.f23237O;
                                if (i13 != 2 && (i13 != 1 || c4671k3.f23104q != c4671k32.f23104q || c4671k3.f23105r != c4671k32.f23105r)) {
                                    z12 = false;
                                }
                                this.f23244V = z12;
                                this.f23230H = c4671k3;
                                if (kc4Var != kc4Var2) {
                                }
                            }
                            i11 = 16;
                        }
                    } else {
                        if (m23905V(c4671k3)) {
                            this.f23230H = c4671k3;
                            if (kc4Var == kc4Var2) {
                                if (this.f23262m0) {
                                    this.f23259k0 = 1;
                                    if (!this.f23239Q && !this.f23241S) {
                                        this.f23260l0 = 1;
                                    } else {
                                        this.f23260l0 = 3;
                                        i11 = 2;
                                    }
                                }
                            }
                        }
                        i11 = 16;
                    }
                    if (mo22049G.f24263d == 0 && (this.f23229G != gd4Var || this.f23260l0 == 3)) {
                        return new lw3(hd4Var.f21638a, c4671k32, c4671k3, 0, i11);
                    }
                    return mo22049G;
                }
                m23898J();
                i11 = 0;
                if (mo22049G.f24263d == 0) {
                }
                return mo22049G;
            }
            if (kc4Var != null && kc4Var2 != null && g92.f20474a >= 23) {
                UUID uuid = da4.f19170e;
                UUID uuid2 = da4.f19166a;
                if (!uuid.equals(uuid2)) {
                    uuid.equals(uuid2);
                }
            }
            m23898J();
            return new lw3(hd4Var.f21638a, c4671k32, c4671k3, 0, 128);
        }
        throw m25549s(new IllegalArgumentException(), c4671k3, false, 4005);
    }

    /* renamed from: K */
    protected abstract ed4 mo22055K(hd4 hd4Var, C4671k3 c4671k3, MediaCrypto mediaCrypto, float f11);

    /* renamed from: L */
    protected abstract List mo22056L(md4 md4Var, C4671k3 c4671k3, boolean z11);

    /* renamed from: M */
    protected abstract void mo22057M(Exception exc);

    /* renamed from: N */
    protected abstract void mo22058N(String str, ed4 ed4Var, long j11, long j12);

    /* renamed from: O */
    protected abstract void mo22059O(String str);

    /* renamed from: W */
    protected abstract void mo22060W(C4671k3 c4671k3, MediaFormat mediaFormat);

    /* renamed from: Y */
    protected abstract void mo22062Y();

    /* renamed from: Z */
    protected abstract void mo22063Z(il3 il3Var);

    /* renamed from: a0 */
    protected void mo23913a0() {
    }

    /* renamed from: b0 */
    protected abstract boolean mo22064b0(long j11, long j12, gd4 gd4Var, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, C4671k3 c4671k3);

    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: c */
    public void mo20799c(float f11, float f12) {
        this.f23227E = f11;
        this.f23228F = f12;
        m23905V(this.f23230H);
    }

    /* renamed from: c0 */
    protected boolean mo23914c0(C4671k3 c4671k3) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public final float m23915d0() {
        return this.f23227E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public final long m23916e0() {
        return this.f23282w0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f0 */
    public final gd4 m23917f0() {
        return this.f23229G;
    }

    @Override // com.google.android.gms.internal.ads.d44
    /* renamed from: g */
    public final int mo21264g(C4671k3 c4671k3) {
        try {
            return mo22048F(this.f23263n, c4671k3);
        } catch (zzqz e11) {
            throw m25549s(e11, c4671k3, false, 4002);
        }
    }

    /* renamed from: g0 */
    protected zzqm mo22065g0(Throwable th2, hd4 hd4Var) {
        return new zzqm(th2, hd4Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h0 */
    public final hd4 m23918h0() {
        return this.f23236N;
    }

    /* renamed from: i0 */
    protected void mo22067i0(il3 il3Var) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: zzqp -> 0x008c, TryCatch #0 {zzqp -> 0x008c, blocks: (B:29:0x0065, B:75:0x006a, B:77:0x0080, B:78:0x0091, B:32:0x009f, B:34:0x00a7, B:35:0x00af, B:37:0x00b3, B:52:0x00dc, B:54:0x00fc, B:55:0x0105, B:60:0x010e, B:61:0x0110, B:62:0x00ff, B:70:0x0111, B:72:0x0114, B:73:0x011e, B:82:0x0094, B:83:0x009e, B:48:0x00cb, B:64:0x00db, B:40:0x00c2), top: B:28:0x0065, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: zzqp -> 0x008c, TryCatch #0 {zzqp -> 0x008c, blocks: (B:29:0x0065, B:75:0x006a, B:77:0x0080, B:78:0x0091, B:32:0x009f, B:34:0x00a7, B:35:0x00af, B:37:0x00b3, B:52:0x00dc, B:54:0x00fc, B:55:0x0105, B:60:0x010e, B:61:0x0110, B:62:0x00ff, B:70:0x0111, B:72:0x0114, B:73:0x011e, B:82:0x0094, B:83:0x009e, B:48:0x00cb, B:64:0x00db, B:40:0x00c2), top: B:28:0x0065, inners: #1, #2, #3 }] */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23919j0() {
        C4671k3 c4671k3;
        zzqp zzqpVar;
        if (this.f23229G == null && !this.f23254f0 && (c4671k3 = this.f23287z) != null) {
            if (this.f23288z0 == null && mo23914c0(c4671k3)) {
                C4671k3 c4671k32 = this.f23287z;
                m23897I();
                String str = c4671k32.f23099l;
                if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    this.f23273s.m20093o(1);
                } else {
                    this.f23273s.m20093o(32);
                }
                this.f23254f0 = true;
                return;
            }
            kc4 kc4Var = this.f23288z0;
            this.f23286y0 = kc4Var;
            C4671k3 c4671k33 = this.f23287z;
            String str2 = c4671k33.f23099l;
            if (kc4Var != null && lc4.f23818a) {
                zzpi m23887a = kc4Var.m23887a();
                throw m25549s(m23887a, this.f23287z, false, m23887a.f32153p);
            }
            try {
                if (this.f23234L == null) {
                    try {
                        List mo22056L = mo22056L(this.f23263n, c4671k33, false);
                        mo22056L.isEmpty();
                        this.f23234L = new ArrayDeque();
                        if (!mo22056L.isEmpty()) {
                            this.f23234L.add((hd4) mo22056L.get(0));
                        }
                        this.f23235M = null;
                    } catch (zzqz e11) {
                        throw new zzqp(this.f23287z, (Throwable) e11, false, -49998);
                    }
                }
                if (!this.f23234L.isEmpty()) {
                    hd4 hd4Var = (hd4) this.f23234L.peekFirst();
                    while (this.f23229G == null) {
                        hd4 hd4Var2 = (hd4) this.f23234L.peekFirst();
                        if (!mo22070q0(hd4Var2)) {
                            return;
                        }
                        try {
                            m23908s0(hd4Var2, null);
                        } catch (Exception e12) {
                            if (hd4Var2 == hd4Var) {
                                try {
                                    lr1.m24356e("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                    Thread.sleep(50L);
                                    m23908s0(hd4Var2, null);
                                } catch (Exception e13) {
                                    lr1.m24357f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(hd4Var2)), e13);
                                    this.f23234L.removeFirst();
                                    zzqp zzqpVar2 = new zzqp(this.f23287z, (Throwable) e13, false, hd4Var2);
                                    mo22057M(zzqpVar2);
                                    zzqpVar = this.f23235M;
                                    if (zzqpVar != null) {
                                        this.f23235M = zzqpVar2;
                                    } else {
                                        this.f23235M = zzqp.m28834a(zzqpVar, zzqpVar2);
                                    }
                                    if (!this.f23234L.isEmpty()) {
                                        throw this.f23235M;
                                    }
                                }
                            } else {
                                throw e12;
                                break;
                            }
                            lr1.m24357f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(hd4Var2)), e13);
                            this.f23234L.removeFirst();
                            zzqp zzqpVar22 = new zzqp(this.f23287z, (Throwable) e13, false, hd4Var2);
                            mo22057M(zzqpVar22);
                            zzqpVar = this.f23235M;
                            if (zzqpVar != null) {
                            }
                            if (!this.f23234L.isEmpty()) {
                            }
                        }
                    }
                    this.f23234L = null;
                    return;
                }
                throw new zzqp(this.f23287z, (Throwable) null, false, -49999);
            } catch (zzqp e14) {
                throw m25549s(e14, this.f23287z, false, 4001);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo22068k0(long j11) {
        while (true) {
            int i11 = this.f23284x0;
            if (i11 != 0 && j11 >= this.f23285y[0]) {
                long[] jArr = this.f23281w;
                this.f23280v0 = jArr[0];
                this.f23282w0 = this.f23283x[0];
                int i12 = i11 - 1;
                this.f23284x0 = i12;
                System.arraycopy(jArr, 1, jArr, 0, i12);
                long[] jArr2 = this.f23283x;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f23284x0);
                long[] jArr3 = this.f23285y;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f23284x0);
                mo22062Y();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l0 */
    public final void m23920l0() {
        try {
            gd4 gd4Var = this.f23229G;
            if (gd4Var != null) {
                gd4Var.zzl();
                this.f23278u0.f24127b++;
                mo22059O(this.f23236N.f21638a);
            }
        } finally {
            this.f23229G = null;
            this.f23224B = null;
            this.f23286y0 = null;
            m23921n0();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.c44
    /* renamed from: m */
    public final void mo20806m(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kd4.mo20806m(long, long):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo22069m0() {
        m23910u0();
        m23911v0();
        this.f23248Z = -9223372036854775807L;
        this.f23264n0 = false;
        this.f23262m0 = false;
        this.f23244V = false;
        this.f23245W = false;
        this.f23252d0 = false;
        this.f23253e0 = false;
        this.f23277u.clear();
        this.f23268p0 = -9223372036854775807L;
        this.f23270q0 = -9223372036854775807L;
        bd4 bd4Var = this.f23247Y;
        if (bd4Var != null) {
            bd4Var.m20483c();
        }
        this.f23259k0 = 0;
        this.f23260l0 = 0;
        this.f23258j0 = this.f23257i0 ? 1 : 0;
    }

    /* renamed from: n0 */
    protected final void m23921n0() {
        mo22069m0();
        this.f23247Y = null;
        this.f23234L = null;
        this.f23236N = null;
        this.f23230H = null;
        this.f23231I = null;
        this.f23232J = false;
        this.f23266o0 = false;
        this.f23233K = -1.0f;
        this.f23237O = 0;
        this.f23238P = false;
        this.f23239Q = false;
        this.f23240R = false;
        this.f23241S = false;
        this.f23242T = false;
        this.f23243U = false;
        this.f23246X = false;
        this.f23257i0 = false;
        this.f23258j0 = 0;
        this.f23225C = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public final boolean m23922o0() {
        boolean m23923p0 = m23923p0();
        if (m23923p0) {
            m23919j0();
        }
        return m23923p0;
    }

    /* renamed from: p0 */
    protected final boolean m23923p0() {
        boolean z11;
        if (this.f23229G == null) {
            return false;
        }
        int i11 = this.f23260l0;
        if (i11 != 3 && !this.f23239Q && ((!this.f23240R || this.f23266o0) && (!this.f23241S || !this.f23264n0))) {
            if (i11 == 2) {
                int i12 = g92.f20474a;
                if (i12 >= 23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v71.m27175f(z11);
                if (i12 >= 23) {
                    try {
                        m23899P();
                    } catch (zzha e11) {
                        lr1.m24357f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e11);
                        m23920l0();
                        return true;
                    }
                }
            }
            m23906X();
            return false;
        }
        m23920l0();
        return true;
    }

    /* renamed from: q0 */
    protected boolean mo22070q0(hd4 hd4Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: x */
    public void mo22071x() {
        this.f23287z = null;
        this.f23280v0 = -9223372036854775807L;
        this.f23282w0 = -9223372036854775807L;
        this.f23284x0 = 0;
        m23923p0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: y */
    public void mo22072y(boolean z11, boolean z12) {
        this.f23278u0 = new lv3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: z */
    public void mo22074z(long j11, boolean z11) {
        this.f23272r0 = false;
        this.f23274s0 = false;
        if (this.f23254f0) {
            this.f23273s.mo20090b();
            this.f23271r.mo20090b();
            this.f23255g0 = false;
        } else {
            m23922o0();
        }
        b62 b62Var = this.f23275t;
        if (b62Var.m20408a() > 0) {
            this.f23276t0 = true;
        }
        b62Var.m20412e();
        int i11 = this.f23284x0;
        if (i11 != 0) {
            int i12 = i11 - 1;
            this.f23282w0 = this.f23283x[i12];
            this.f23280v0 = this.f23281w[i12];
            this.f23284x0 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.c44
    public boolean zzM() {
        return this.f23274s0;
    }

    @Override // com.google.android.gms.internal.ads.c44
    public boolean zzN() {
        if (this.f23287z == null) {
            return false;
        }
        if (!m25546o() && !m23902S()) {
            if (this.f23248Z == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f23248Z) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d44
    public final int zze() {
        return 8;
    }
}
