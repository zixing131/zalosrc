package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class vb4 extends kd4 implements j34 {

    /* renamed from: B0 */
    private final Context f29256B0;

    /* renamed from: C0 */
    private final y94 f29257C0;

    /* renamed from: D0 */
    private final ba4 f29258D0;

    /* renamed from: E0 */
    private int f29259E0;

    /* renamed from: F0 */
    private boolean f29260F0;

    /* renamed from: G0 */
    private C4671k3 f29261G0;

    /* renamed from: H0 */
    private long f29262H0;

    /* renamed from: I0 */
    private boolean f29263I0;

    /* renamed from: J0 */
    private boolean f29264J0;

    /* renamed from: K0 */
    private boolean f29265K0;

    /* renamed from: L0 */
    private a44 f29266L0;

    public vb4(Context context, fd4 fd4Var, md4 md4Var, boolean z11, Handler handler, z94 z94Var, ba4 ba4Var) {
        super(1, fd4Var, md4Var, false, 44100.0f);
        this.f29256B0 = context.getApplicationContext();
        this.f29258D0 = ba4Var;
        this.f29257C0 = new y94(handler, z94Var);
        ba4Var.mo20465j(new tb4(this, null));
    }

    /* renamed from: u0 */
    private final void m27201u0() {
        long mo20459d = this.f29258D0.mo20459d(zzM());
        if (mo20459d != Long.MIN_VALUE) {
            if (!this.f29264J0) {
                mo20459d = Math.max(this.f29262H0, mo20459d);
            }
            this.f29262H0 = mo20459d;
            this.f29264J0 = false;
        }
    }

    /* renamed from: y0 */
    private final int m27204y0(hd4 hd4Var, C4671k3 c4671k3) {
        int i11;
        if ("OMX.google.raw.decoder".equals(hd4Var.f21638a) && (i11 = g92.f20474a) < 24 && (i11 != 23 || !g92.m22366x(this.f29256B0))) {
            return -1;
        }
        return c4671k3.f23100m;
    }

    /* renamed from: z0 */
    private static List m27205z0(md4 md4Var, C4671k3 c4671k3, boolean z11, ba4 ba4Var) {
        hd4 m21356d;
        String str = c4671k3.f23099l;
        if (str == null) {
            return c83.m20832w();
        }
        if (ba4Var.mo20469n(c4671k3) && (m21356d = de4.m21356d()) != null) {
            return c83.m20833x(m21356d);
        }
        List m21358f = de4.m21358f(str, false, false);
        String m21357e = de4.m21357e(c4671k3);
        if (m21357e == null) {
            return c83.m20830u(m21358f);
        }
        List m21358f2 = de4.m21358f(m21357e, false, false);
        z73 m20826p = c83.m20826p();
        m20826p.m28453g(m21358f);
        m20826p.m28453g(m21358f2);
        return m20826p.m28454h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: A */
    public final void mo22044A() {
        try {
            super.mo22044A();
            if (this.f29265K0) {
                this.f29265K0 = false;
                this.f29258D0.zzj();
            }
        } catch (Throwable th2) {
            if (this.f29265K0) {
                this.f29265K0 = false;
                this.f29258D0.zzj();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: B */
    protected final void mo22045B() {
        this.f29258D0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: C */
    protected final void mo22046C() {
        m27201u0();
        this.f29258D0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: E */
    protected final float mo22047E(float f11, C4671k3 c4671k3, C4671k3[] c4671k3Arr) {
        int i11 = -1;
        for (C4671k3 c4671k32 : c4671k3Arr) {
            int i12 = c4671k32.f23113z;
            if (i12 != -1) {
                i11 = Math.max(i11, i12);
            }
        }
        if (i11 == -1) {
            return -1.0f;
        }
        return i11 * f11;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: F */
    protected final int mo22048F(md4 md4Var, C4671k3 c4671k3) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14 = 128;
        if (!k70.m23849g(c4671k3.f23099l)) {
            return 128;
        }
        if (g92.f20474a >= 21) {
            i11 = 32;
        } else {
            i11 = 0;
        }
        int i15 = c4671k3.f23086E;
        boolean m23907r0 = kd4.m23907r0(c4671k3);
        if (m23907r0 && this.f29258D0.mo20469n(c4671k3) && (i15 == 0 || de4.m21356d() != null)) {
            return i11 | 140;
        }
        if (("audio/raw".equals(c4671k3.f23099l) && !this.f29258D0.mo20469n(c4671k3)) || !this.f29258D0.mo20469n(g92.m22343f(2, c4671k3.f23112y, c4671k3.f23113z))) {
            return 129;
        }
        List m27205z0 = m27205z0(md4Var, c4671k3, false, this.f29258D0);
        if (m27205z0.isEmpty()) {
            return 129;
        }
        if (!m23907r0) {
            return 130;
        }
        hd4 hd4Var = (hd4) m27205z0.get(0);
        boolean m22792d = hd4Var.m22792d(c4671k3);
        if (!m22792d) {
            for (int i16 = 1; i16 < m27205z0.size(); i16++) {
                hd4 hd4Var2 = (hd4) m27205z0.get(i16);
                if (hd4Var2.m22792d(c4671k3)) {
                    hd4Var = hd4Var2;
                    z11 = false;
                    m22792d = true;
                    break;
                }
            }
        }
        z11 = true;
        if (true != m22792d) {
            i12 = 3;
        } else {
            i12 = 4;
        }
        int i17 = 8;
        if (m22792d && hd4Var.m22793e(c4671k3)) {
            i17 = 16;
        }
        if (true != hd4Var.f21644g) {
            i13 = 0;
        } else {
            i13 = 64;
        }
        if (true != z11) {
            i14 = 0;
        }
        return i12 | i17 | i11 | i13 | i14;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: G */
    protected final lw3 mo22049G(hd4 hd4Var, C4671k3 c4671k3, C4671k3 c4671k32) {
        int i11;
        int i12;
        lw3 m22791b = hd4Var.m22791b(c4671k3, c4671k32);
        int i13 = m22791b.f24264e;
        if (m27204y0(hd4Var, c4671k32) > this.f29259E0) {
            i13 |= 64;
        }
        String str = hd4Var.f21638a;
        if (i13 != 0) {
            i12 = i13;
            i11 = 0;
        } else {
            i11 = m22791b.f24263d;
            i12 = 0;
        }
        return new lw3(str, c4671k3, c4671k32, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: H */
    public final lw3 mo22051H(h34 h34Var) {
        lw3 mo22051H = super.mo22051H(h34Var);
        this.f29257C0.m28149g(h34Var.f21525a, mo22051H);
        return mo22051H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:            if ("AXON 7 mini".equals(r10) == false) goto L92;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final ed4 mo22055K(hd4 hd4Var, C4671k3 c4671k3, MediaCrypto mediaCrypto, float f11) {
        boolean z11;
        MediaFormat mediaFormat;
        C4671k3 c4671k32;
        C4671k3[] m25547p = m25547p();
        int m27204y0 = m27204y0(hd4Var, c4671k3);
        if (m25547p.length != 1) {
            for (C4671k3 c4671k33 : m25547p) {
                if (hd4Var.m22791b(c4671k3, c4671k33).f24263d != 0) {
                    m27204y0 = Math.max(m27204y0, m27204y0(hd4Var, c4671k33));
                }
            }
        }
        this.f29259E0 = m27204y0;
        String str = hd4Var.f21638a;
        int i11 = g92.f20474a;
        if (i11 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(g92.f20476c)) {
            String str2 = g92.f20475b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z11 = true;
                this.f29260F0 = z11;
                String str3 = hd4Var.f21640c;
                int i12 = this.f29259E0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                mediaFormat.setInteger("channel-count", c4671k3.f23112y);
                mediaFormat.setInteger("sample-rate", c4671k3.f23113z);
                nt1.m25010b(mediaFormat, c4671k3.f23101n);
                nt1.m25009a(mediaFormat, "max-input-size", i12);
                if (i11 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f11 != -1.0f) {
                        if (i11 == 23) {
                            String str4 = g92.f20477d;
                            if (!"ZTE B2017G".equals(str4)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f11);
                    }
                }
                if (i11 <= 28 && "audio/ac4".equals(c4671k3.f23099l)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i11 >= 24 && this.f29258D0.mo20457b(g92.m22343f(4, c4671k3.f23112y, c4671k3.f23113z)) == 2) {
                    mediaFormat.setInteger("pcm-encoding", 4);
                }
                if (i11 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (!"audio/raw".equals(hd4Var.f21639b) && !"audio/raw".equals(c4671k3.f23099l)) {
                    c4671k32 = c4671k3;
                } else {
                    c4671k32 = null;
                }
                this.f29261G0 = c4671k32;
                return ed4.m21696a(hd4Var, mediaFormat, c4671k3, null);
            }
        }
        z11 = false;
        this.f29260F0 = z11;
        String str32 = hd4Var.f21640c;
        int i122 = this.f29259E0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", c4671k3.f23112y);
        mediaFormat.setInteger("sample-rate", c4671k3.f23113z);
        nt1.m25010b(mediaFormat, c4671k3.f23101n);
        nt1.m25009a(mediaFormat, "max-input-size", i122);
        if (i11 >= 23) {
        }
        if (i11 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
        }
        if (!"audio/raw".equals(hd4Var.f21639b)) {
        }
        c4671k32 = null;
        this.f29261G0 = c4671k32;
        return ed4.m21696a(hd4Var, mediaFormat, c4671k3, null);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: L */
    protected final List mo22056L(md4 md4Var, C4671k3 c4671k3, boolean z11) {
        return de4.m21359g(m27205z0(md4Var, c4671k3, false, this.f29258D0), c4671k3);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: M */
    protected final void mo22057M(Exception exc) {
        lr1.m24354c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f29257C0.m28143a(exc);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: N */
    protected final void mo22058N(String str, ed4 ed4Var, long j11, long j12) {
        this.f29257C0.m28145c(str, j11, j12);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: O */
    protected final void mo22059O(String str) {
        this.f29257C0.m28146d(str);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: W */
    protected final void mo22060W(C4671k3 c4671k3, MediaFormat mediaFormat) {
        int i11;
        int i12;
        C4671k3 c4671k32 = this.f29261G0;
        int[] iArr = null;
        if (c4671k32 != null) {
            c4671k3 = c4671k32;
        } else if (m23917f0() != null) {
            if ("audio/raw".equals(c4671k3.f23099l)) {
                i11 = c4671k3.f23082A;
            } else if (g92.f20474a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i11 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i11 = g92.m22330X(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i11 = 2;
            }
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26523s("audio/raw");
            c5004t1.m26518n(i11);
            c5004t1.m26501c(c4671k3.f23083B);
            c5004t1.m26503d(c4671k3.f23084C);
            c5004t1.m26506e0(mediaFormat.getInteger("channel-count"));
            c5004t1.m26524t(mediaFormat.getInteger("sample-rate"));
            C4671k3 m26529y = c5004t1.m26529y();
            if (this.f29260F0 && m26529y.f23112y == 6 && (i12 = c4671k3.f23112y) < 6) {
                iArr = new int[i12];
                for (int i13 = 0; i13 < c4671k3.f23112y; i13++) {
                    iArr[i13] = i13;
                }
            }
            c4671k3 = m26529y;
        }
        try {
            this.f29258D0.mo20458c(c4671k3, 0, iArr);
        } catch (zznt e11) {
            throw m25549s(e11, e11.f32146p, false, 5001);
        }
    }

    /* renamed from: X */
    public final void m27206X() {
        this.f29264J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: Y */
    protected final void mo22062Y() {
        this.f29258D0.zzf();
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: Z */
    protected final void mo22063Z(il3 il3Var) {
        if (this.f29263I0 && !il3Var.m22008f()) {
            if (Math.abs(il3Var.f22219e - this.f29262H0) > 500000) {
                this.f29262H0 = il3Var.f22219e;
            }
            this.f29263I0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: a0 */
    protected final void mo23913a0() {
        try {
            this.f29258D0.zzi();
        } catch (zznx e11) {
            throw m25549s(e11, e11.f32152r, e11.f32151q, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: b0 */
    protected final boolean mo22064b0(long j11, long j12, gd4 gd4Var, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, C4671k3 c4671k3) {
        byteBuffer.getClass();
        if (this.f29261G0 != null && (i12 & 2) != 0) {
            gd4Var.getClass();
            gd4Var.mo22000g(i11, false);
            return true;
        }
        if (z11) {
            if (gd4Var != null) {
                gd4Var.mo22000g(i11, false);
            }
            this.f23278u0.f24131f += i13;
            this.f29258D0.zzf();
            return true;
        }
        try {
            if (!this.f29258D0.mo20462g(byteBuffer, j13, i13)) {
                return false;
            }
            if (gd4Var != null) {
                gd4Var.mo22000g(i11, false);
            }
            this.f23278u0.f24130e += i13;
            return true;
        } catch (zznu e11) {
            throw m25549s(e11, e11.f32149r, e11.f32148q, 5001);
        } catch (zznx e12) {
            throw m25549s(e12, c4671k3, e12.f32151q, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: c0 */
    protected final boolean mo23914c0(C4671k3 c4671k3) {
        return this.f29258D0.mo20469n(c4671k3);
    }

    @Override // com.google.android.gms.internal.ads.c44, com.google.android.gms.internal.ads.d44
    /* renamed from: d */
    public final String mo20800d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.x34
    /* renamed from: h */
    public final void mo22066h(int i11, Object obj) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 6) {
                    switch (i11) {
                        case 9:
                            this.f29258D0.mo20463h(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            this.f29258D0.mo20467l(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.f29266L0 = (a44) obj;
                            return;
                        default:
                            return;
                    }
                }
                this.f29258D0.mo20460e((d54) obj);
                return;
            }
            this.f29258D0.mo20466k((b44) obj);
            return;
        }
        this.f29258D0.mo20468m(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.j34
    /* renamed from: j */
    public final void mo23127j(kc0 kc0Var) {
        this.f29258D0.mo20461f(kc0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: x */
    public final void mo22071x() {
        this.f29265K0 = true;
        try {
            this.f29258D0.zze();
            try {
                super.mo22071x();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.mo22071x();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: y */
    public final void mo22072y(boolean z11, boolean z12) {
        super.mo22072y(z11, z12);
        this.f29257C0.m28148f(this.f23278u0);
        m25552v();
        this.f29258D0.mo20464i(m25553w());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: z */
    public final void mo22074z(long j11, boolean z11) {
        super.mo22074z(j11, z11);
        this.f29258D0.zze();
        this.f29262H0 = j11;
        this.f29263I0 = true;
        this.f29264J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.c44
    public final boolean zzM() {
        if (super.zzM() && this.f29258D0.mo20456a()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.c44
    public final boolean zzN() {
        if (!this.f29258D0.zzt() && !super.zzN()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j34
    public final long zza() {
        if (mo20807n() == 2) {
            m27201u0();
        }
        return this.f29262H0;
    }

    @Override // com.google.android.gms.internal.ads.j34
    public final kc0 zzc() {
        return this.f29258D0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.pu3, com.google.android.gms.internal.ads.c44
    public final j34 zzi() {
        return this;
    }
}
