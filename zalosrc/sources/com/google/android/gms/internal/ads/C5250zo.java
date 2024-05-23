package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.zo */
/* loaded from: classes2.dex */
public final class C5250zo extends AbstractC4431dl {

    /* renamed from: Q */
    private final Context f31622Q;

    /* renamed from: R */
    private final C4362bp f31623R;

    /* renamed from: S */
    private final C4656jp f31624S;

    /* renamed from: T */
    private final boolean f31625T;

    /* renamed from: U */
    private final long[] f31626U;

    /* renamed from: V */
    private zzasw[] f31627V;

    /* renamed from: W */
    private C5139wo f31628W;

    /* renamed from: X */
    private Surface f31629X;

    /* renamed from: Y */
    private Surface f31630Y;

    /* renamed from: Z */
    private boolean f31631Z;

    /* renamed from: a0 */
    private long f31632a0;

    /* renamed from: b0 */
    private long f31633b0;

    /* renamed from: c0 */
    private int f31634c0;

    /* renamed from: d0 */
    private int f31635d0;

    /* renamed from: e0 */
    private int f31636e0;

    /* renamed from: f0 */
    private float f31637f0;

    /* renamed from: g0 */
    private int f31638g0;

    /* renamed from: h0 */
    private int f31639h0;

    /* renamed from: i0 */
    private int f31640i0;

    /* renamed from: j0 */
    private float f31641j0;

    /* renamed from: k0 */
    private int f31642k0;

    /* renamed from: l0 */
    private int f31643l0;

    /* renamed from: m0 */
    private int f31644m0;

    /* renamed from: n0 */
    private float f31645n0;

    /* renamed from: o0 */
    private long f31646o0;

    /* renamed from: p0 */
    private int f31647p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5250zo(Context context, InterfaceC4505fl interfaceC4505fl, long j11, Handler handler, InterfaceC4693kp interfaceC4693kp, int i11) {
        super(2, interfaceC4505fl, null, false);
        boolean z11 = false;
        this.f31622Q = context.getApplicationContext();
        this.f31623R = new C4362bp(context);
        this.f31624S = new C4656jp(handler, interfaceC4693kp);
        if (AbstractC4916qo.f26898a <= 22 && "foster".equals(AbstractC4916qo.f26899b) && "NVIDIA".equals(AbstractC4916qo.f26900c)) {
            z11 = true;
        }
        this.f31625T = z11;
        this.f31626U = new long[10];
        this.f31646o0 = -9223372036854775807L;
        this.f31632a0 = -9223372036854775807L;
        this.f31638g0 = -1;
        this.f31639h0 = -1;
        this.f31641j0 = -1.0f;
        this.f31637f0 = -1.0f;
        m28568S();
    }

    /* renamed from: R */
    private static int m28567R(zzasw zzaswVar) {
        int i11 = zzaswVar.f31816B;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    /* renamed from: S */
    private final void m28568S() {
        this.f31642k0 = -1;
        this.f31643l0 = -1;
        this.f31645n0 = -1.0f;
        this.f31644m0 = -1;
    }

    /* renamed from: T */
    private final void m28569T() {
        if (this.f31634c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f31624S.m23705d(this.f31634c0, elapsedRealtime - this.f31633b0);
            this.f31634c0 = 0;
            this.f31633b0 = elapsedRealtime;
        }
    }

    /* renamed from: U */
    private final void m28570U() {
        int i11 = this.f31642k0;
        int i12 = this.f31638g0;
        if (i11 == i12 && this.f31643l0 == this.f31639h0 && this.f31644m0 == this.f31640i0 && this.f31645n0 == this.f31641j0) {
            return;
        }
        this.f31624S.m23709h(i12, this.f31639h0, this.f31640i0, this.f31641j0);
        this.f31642k0 = this.f31638g0;
        this.f31643l0 = this.f31639h0;
        this.f31644m0 = this.f31640i0;
        this.f31645n0 = this.f31641j0;
    }

    /* renamed from: V */
    private final void m28571V() {
        if (this.f31642k0 == -1 && this.f31643l0 == -1) {
            return;
        }
        this.f31624S.m23709h(this.f31638g0, this.f31639h0, this.f31640i0, this.f31641j0);
    }

    /* renamed from: W */
    private static boolean m28572W(long j11) {
        return j11 < -30000;
    }

    /* renamed from: X */
    private final boolean m28573X(boolean z11) {
        if (AbstractC4916qo.f26898a < 23) {
            return false;
        }
        if (z11 && !zzbax.m28697b(this.f31622Q)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: B */
    protected final void mo21460B(C4394cl c4394cl, MediaCodec mediaCodec, zzasw zzaswVar, MediaCrypto mediaCrypto) {
        char c11;
        int i11;
        zzasw[] zzaswVarArr = this.f31627V;
        int i12 = zzaswVar.f31840y;
        int i13 = zzaswVar.f31841z;
        int i14 = zzaswVar.f31837v;
        if (i14 == -1) {
            String str = zzaswVar.f31836u;
            if (i12 != -1 && i13 != -1) {
                int i15 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                if (c11 != 0 && c11 != 1) {
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 == 4 || c11 == 5) {
                                i11 = i12 * i13;
                                i14 = (i11 * 3) / (i15 + i15);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(AbstractC4916qo.f26901d)) {
                        i11 = AbstractC4916qo.m25828d(i12, 16) * AbstractC4916qo.m25828d(i13, 16) * 256;
                        i15 = 2;
                        i14 = (i11 * 3) / (i15 + i15);
                    }
                }
                i11 = i12 * i13;
                i15 = 2;
                i14 = (i11 * 3) / (i15 + i15);
            }
            i14 = -1;
        }
        int length = zzaswVarArr.length;
        C5139wo c5139wo = new C5139wo(i12, i13, i14);
        this.f31628W = c5139wo;
        boolean z11 = this.f31625T;
        MediaFormat m28687b = zzaswVar.m28687b();
        m28687b.setInteger("max-width", c5139wo.f30035a);
        m28687b.setInteger("max-height", c5139wo.f30036b);
        int i16 = c5139wo.f30037c;
        if (i16 != -1) {
            m28687b.setInteger("max-input-size", i16);
        }
        if (z11) {
            m28687b.setInteger("auto-frc", 0);
        }
        if (this.f31629X == null) {
            AbstractC4361bo.m20613e(m28573X(c4394cl.f18472d));
            if (this.f31630Y == null) {
                this.f31630Y = zzbax.m28696a(this.f31622Q, c4394cl.f18472d);
            }
            this.f31629X = this.f31630Y;
        }
        mediaCodec.configure(m28687b, this.f31629X, (MediaCrypto) null, 0);
        int i17 = AbstractC4916qo.f26898a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: C */
    protected final void mo21461C(String str, long j11, long j12) {
        this.f31624S.m23703b(str, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: D */
    public final void mo21462D(zzasw zzaswVar) {
        super.mo21462D(zzaswVar);
        this.f31624S.m23707f(zzaswVar);
        float f11 = zzaswVar.f31817C;
        if (f11 == -1.0f) {
            f11 = 1.0f;
        }
        this.f31637f0 = f11;
        this.f31636e0 = m28567R(zzaswVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: E */
    protected final void mo21463E(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z11 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z11 = true;
        }
        if (z11) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f31638g0 = integer;
        if (z11) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f31639h0 = integer2;
        float f11 = this.f31637f0;
        this.f31641j0 = f11;
        if (AbstractC4916qo.f26898a >= 21) {
            int i11 = this.f31636e0;
            if (i11 == 90 || i11 == 270) {
                int i12 = this.f31638g0;
                this.f31638g0 = integer2;
                this.f31639h0 = i12;
                this.f31641j0 = 1.0f / f11;
            }
        } else {
            this.f31640i0 = this.f31636e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: G */
    protected final boolean mo21465G(long j11, long j12, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i11, int i12, long j13, boolean z11) {
        while (true) {
            int i13 = this.f31647p0;
            if (i13 == 0) {
                break;
            }
            long[] jArr = this.f31626U;
            long j14 = jArr[0];
            if (j13 < j14) {
                break;
            }
            this.f31646o0 = j14;
            int i14 = i13 - 1;
            this.f31647p0 = i14;
            System.arraycopy(jArr, 1, jArr, 0, i14);
        }
        long j15 = j13 - this.f31646o0;
        if (z11) {
            m28576Q(mediaCodec, i11, j15);
            return true;
        }
        long j16 = j13 - j11;
        if (this.f31629X == this.f31630Y) {
            if (!m28572W(j16)) {
                return false;
            }
            m28576Q(mediaCodec, i11, j15);
            return true;
        }
        if (!this.f31631Z) {
            if (AbstractC4916qo.f26898a >= 21) {
                m28575P(mediaCodec, i11, j15, System.nanoTime());
            } else {
                m28574O(mediaCodec, i11, j15);
            }
            return true;
        }
        if (zzb() != 2) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long nanoTime = System.nanoTime();
        long m20639a = this.f31623R.m20639a(j13, ((j16 - ((elapsedRealtime * 1000) - j12)) * 1000) + nanoTime);
        long j17 = (m20639a - nanoTime) / 1000;
        if (m28572W(j17)) {
            AbstractC4841oo.m25224a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i11, false);
            AbstractC4841oo.m25225b();
            C4356bj c4356bj = this.f19305O;
            c4356bj.f17767f++;
            this.f31634c0++;
            int i15 = this.f31635d0 + 1;
            this.f31635d0 = i15;
            c4356bj.f17768g = Math.max(i15, c4356bj.f17768g);
            if (this.f31634c0 == -1) {
                m28569T();
            }
            return true;
        }
        if (AbstractC4916qo.f26898a >= 21) {
            if (j17 < 50000) {
                m28575P(mediaCodec, i11, j15, m20639a);
                return true;
            }
        } else if (j17 < 30000) {
            if (j17 > 11000) {
                try {
                    Thread.sleep((j17 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            m28574O(mediaCodec, i11, j15);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: K */
    protected final void mo21469K(C4392cj c4392cj) {
        int i11 = AbstractC4916qo.f26898a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: L */
    public final void mo21470L() {
        try {
            super.mo21470L();
        } finally {
            Surface surface = this.f31630Y;
            if (surface != null) {
                if (this.f31629X == surface) {
                    this.f31629X = null;
                }
                surface.release();
                this.f31630Y = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: M */
    protected final boolean mo21471M(MediaCodec mediaCodec, boolean z11, zzasw zzaswVar, zzasw zzaswVar2) {
        if (zzaswVar.f31836u.equals(zzaswVar2.f31836u) && m28567R(zzaswVar) == m28567R(zzaswVar2)) {
            if (z11 || (zzaswVar.f31840y == zzaswVar2.f31840y && zzaswVar.f31841z == zzaswVar2.f31841z)) {
                int i11 = zzaswVar2.f31840y;
                C5139wo c5139wo = this.f31628W;
                if (i11 <= c5139wo.f30035a && zzaswVar2.f31841z <= c5139wo.f30036b && zzaswVar2.f31837v <= c5139wo.f30037c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: N */
    protected final boolean mo21472N(C4394cl c4394cl) {
        if (this.f31629X == null && !m28573X(c4394cl.f18472d)) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    protected final void m28574O(MediaCodec mediaCodec, int i11, long j11) {
        m28570U();
        AbstractC4841oo.m25224a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i11, true);
        AbstractC4841oo.m25225b();
        this.f19305O.f17765d++;
        this.f31635d0 = 0;
        m28577y();
    }

    /* renamed from: P */
    protected final void m28575P(MediaCodec mediaCodec, int i11, long j11, long j12) {
        m28570U();
        AbstractC4841oo.m25224a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i11, j12);
        AbstractC4841oo.m25225b();
        this.f19305O.f17765d++;
        this.f31635d0 = 0;
        m28577y();
    }

    /* renamed from: Q */
    protected final void m28576Q(MediaCodec mediaCodec, int i11, long j11) {
        AbstractC4841oo.m25224a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i11, false);
        AbstractC4841oo.m25225b();
        this.f19305O.f17766e++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: b */
    public final boolean mo21474b() {
        Surface surface;
        if (super.mo21474b() && (this.f31631Z || (((surface = this.f31630Y) != null && this.f31629X == surface) || m21466H() == null))) {
            this.f31632a0 = -9223372036854775807L;
            return true;
        }
        if (this.f31632a0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f31632a0) {
            return true;
        }
        this.f31632a0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5168xg
    /* renamed from: c */
    public final void mo25714c(int i11, Object obj) {
        if (i11 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f31630Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C4394cl m21467I = m21467I();
                    if (m21467I != null && m28573X(m21467I.f18472d)) {
                        surface = zzbax.m28696a(this.f31622Q, m21467I.f18472d);
                        this.f31630Y = surface;
                    }
                }
            }
            if (this.f31629X != surface) {
                this.f31629X = surface;
                int zzb = zzb();
                if (zzb == 1 || zzb == 2) {
                    MediaCodec m21466H = m21466H();
                    if (AbstractC4916qo.f26898a >= 23 && m21466H != null && surface != null) {
                        m21466H.setOutputSurface(surface);
                    } else {
                        mo21470L();
                        m21468J();
                    }
                }
                if (surface != null && surface != this.f31630Y) {
                    m28571V();
                    this.f31631Z = false;
                    int i12 = AbstractC4916qo.f26898a;
                    if (zzb == 2) {
                        this.f31632a0 = -9223372036854775807L;
                        return;
                    }
                    return;
                }
                m28568S();
                this.f31631Z = false;
                int i13 = AbstractC4916qo.f26898a;
                return;
            }
            if (surface != null && surface != this.f31630Y) {
                m28571V();
                if (this.f31631Z) {
                    this.f31624S.m23708g(this.f31629X);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: i */
    public final void mo21475i() {
        this.f31638g0 = -1;
        this.f31639h0 = -1;
        this.f31641j0 = -1.0f;
        this.f31637f0 = -1.0f;
        this.f31646o0 = -9223372036854775807L;
        this.f31647p0 = 0;
        m28568S();
        this.f31631Z = false;
        int i11 = AbstractC4916qo.f26898a;
        this.f31623R.m20640b();
        try {
            super.mo21475i();
        } finally {
            this.f19305O.m20528a();
            this.f31624S.m23704c(this.f19305O);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: j */
    public final void mo21476j(boolean z11) {
        super.mo21476j(z11);
        int i11 = m26926g().f25636a;
        this.f31624S.m23706e(this.f19305O);
        this.f31623R.m20641c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: s */
    public final void mo21478s(long j11, boolean z11) {
        super.mo21478s(j11, z11);
        this.f31631Z = false;
        int i11 = AbstractC4916qo.f26898a;
        this.f31635d0 = 0;
        int i12 = this.f31647p0;
        if (i12 != 0) {
            this.f31646o0 = this.f31626U[i12 - 1];
            this.f31647p0 = 0;
        }
        this.f31632a0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: t */
    protected final void mo25715t() {
        this.f31634c0 = 0;
        this.f31633b0 = SystemClock.elapsedRealtime();
        this.f31632a0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: u */
    protected final void mo25716u() {
        m28569T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: v */
    protected final void mo26927v(zzasw[] zzaswVarArr, long j11) {
        this.f31627V = zzaswVarArr;
        if (this.f31646o0 == -9223372036854775807L) {
            this.f31646o0 = j11;
            return;
        }
        int i11 = this.f31647p0;
        if (i11 == 10) {
            long j12 = this.f31626U[9];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
        } else {
            this.f31647p0 = i11 + 1;
        }
        this.f31626U[this.f31647p0 - 1] = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: x */
    protected final int mo21479x(InterfaceC4505fl interfaceC4505fl, zzasw zzaswVar) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = zzaswVar.f31836u;
        int i15 = 0;
        if (!AbstractC4545go.m22494b(str)) {
            return 0;
        }
        zzauv zzauvVar = zzaswVar.f31839x;
        if (zzauvVar != null) {
            z11 = false;
            for (int i16 = 0; i16 < zzauvVar.f31850r; i16++) {
                z11 |= zzauvVar.m28693a(i16).f31847t;
            }
        } else {
            z11 = false;
        }
        C4394cl m24941c = AbstractC4801nl.m24941c(str, z11);
        if (m24941c == null) {
            return 1;
        }
        boolean m20930e = m24941c.m20930e(zzaswVar.f31833r);
        if (m20930e && (i13 = zzaswVar.f31840y) > 0 && (i14 = zzaswVar.f31841z) > 0) {
            if (AbstractC4916qo.f26898a >= 21) {
                m20930e = m24941c.m20931f(i13, i14, zzaswVar.f31815A);
            } else {
                if (i13 * i14 <= AbstractC4801nl.m24939a()) {
                    m20930e = true;
                } else {
                    m20930e = false;
                }
                if (!m20930e) {
                    int i17 = zzaswVar.f31840y;
                    int i18 = zzaswVar.f31841z;
                    String str2 = AbstractC4916qo.f26902e;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FalseCheck [legacyFrameSize, ");
                    sb2.append(i17);
                    sb2.append("x");
                    sb2.append(i18);
                    sb2.append("] [");
                    sb2.append(str2);
                    sb2.append("]");
                }
            }
        }
        if (true != m24941c.f18470b) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        if (true == m24941c.f18471c) {
            i15 = 16;
        }
        if (true != m20930e) {
            i12 = 2;
        } else {
            i12 = 3;
        }
        return i12 | i11 | i15;
    }

    /* renamed from: y */
    final void m28577y() {
        if (!this.f31631Z) {
            this.f31631Z = true;
            this.f31624S.m23708g(this.f31629X);
        }
    }
}
