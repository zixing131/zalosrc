package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class ob4 implements ba4 {

    /* renamed from: W */
    private static final Object f25535W = new Object();

    /* renamed from: X */
    private static ExecutorService f25536X;

    /* renamed from: Y */
    private static int f25537Y;

    /* renamed from: A */
    private boolean f25538A;

    /* renamed from: B */
    private boolean f25539B;

    /* renamed from: C */
    private long f25540C;

    /* renamed from: D */
    private float f25541D;

    /* renamed from: E */
    private n94[] f25542E;

    /* renamed from: F */
    private ByteBuffer[] f25543F;

    /* renamed from: G */
    private ByteBuffer f25544G;

    /* renamed from: H */
    private int f25545H;

    /* renamed from: I */
    private ByteBuffer f25546I;

    /* renamed from: J */
    private byte[] f25547J;

    /* renamed from: K */
    private int f25548K;

    /* renamed from: L */
    private int f25549L;

    /* renamed from: M */
    private boolean f25550M;

    /* renamed from: N */
    private boolean f25551N;

    /* renamed from: O */
    private boolean f25552O;

    /* renamed from: P */
    private boolean f25553P;

    /* renamed from: Q */
    private int f25554Q;

    /* renamed from: R */
    private d54 f25555R;

    /* renamed from: S */
    private long f25556S;

    /* renamed from: T */
    private boolean f25557T;

    /* renamed from: U */
    private boolean f25558U;

    /* renamed from: V */
    private final za4 f25559V;

    /* renamed from: a */
    private final l94 f25560a;

    /* renamed from: b */
    private final ia4 f25561b;

    /* renamed from: c */
    private final ac4 f25562c;

    /* renamed from: d */
    private final n94[] f25563d;

    /* renamed from: e */
    private final n94[] f25564e;

    /* renamed from: f */
    private final ya1 f25565f;

    /* renamed from: g */
    private final ga4 f25566g;

    /* renamed from: h */
    private final ArrayDeque f25567h;

    /* renamed from: i */
    private jb4 f25568i;

    /* renamed from: j */
    private final cb4 f25569j;

    /* renamed from: k */
    private final cb4 f25570k;

    /* renamed from: l */
    private final na4 f25571l;

    /* renamed from: m */
    private i94 f25572m;

    /* renamed from: n */
    private aa4 f25573n;

    /* renamed from: o */
    private ya4 f25574o;

    /* renamed from: p */
    private ya4 f25575p;

    /* renamed from: q */
    private AudioTrack f25576q;

    /* renamed from: r */
    private b44 f25577r;

    /* renamed from: s */
    private bb4 f25578s;

    /* renamed from: t */
    private bb4 f25579t;

    /* renamed from: u */
    private final kc0 f25580u;

    /* renamed from: v */
    private long f25581v;

    /* renamed from: w */
    private long f25582w;

    /* renamed from: x */
    private long f25583x;

    /* renamed from: y */
    private long f25584y;

    /* renamed from: z */
    private int f25585z;

    public /* synthetic */ ob4(oa4 oa4Var, kb4 kb4Var) {
        l94 l94Var;
        za4 za4Var;
        l94Var = oa4Var.f25525a;
        this.f25560a = l94Var;
        za4Var = oa4Var.f25527c;
        this.f25559V = za4Var;
        int i11 = g92.f20474a;
        this.f25571l = oa4Var.f25526b;
        ya1 ya1Var = new ya1(w81.f29846a);
        this.f25565f = ya1Var;
        ya1Var.m28167e();
        this.f25566g = new ga4(new eb4(this, null));
        ia4 ia4Var = new ia4();
        this.f25561b = ia4Var;
        ac4 ac4Var = new ac4();
        this.f25562c = ac4Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new wb4(), ia4Var, ac4Var);
        Collections.addAll(arrayList, za4Var.m28468e());
        this.f25563d = (n94[]) arrayList.toArray(new n94[0]);
        this.f25564e = new n94[]{new rb4()};
        this.f25541D = 1.0f;
        this.f25577r = b44.f17580c;
        this.f25554Q = 0;
        this.f25555R = new d54(0, 0.0f);
        kc0 kc0Var = kc0.f23208d;
        this.f25579t = new bb4(kc0Var, false, 0L, 0L, null);
        this.f25580u = kc0Var;
        this.f25549L = -1;
        this.f25542E = new n94[0];
        this.f25543F = new ByteBuffer[0];
        this.f25567h = new ArrayDeque();
        this.f25569j = new cb4(100L);
        this.f25570k = new cb4(100L);
    }

    /* renamed from: A */
    private final void m25119A(long j11) {
        ByteBuffer byteBuffer;
        int length = this.f25542E.length;
        int i11 = length;
        while (i11 >= 0) {
            if (i11 > 0) {
                byteBuffer = this.f25543F[i11 - 1];
            } else {
                byteBuffer = this.f25544G;
                if (byteBuffer == null) {
                    byteBuffer = n94.f25095a;
                }
            }
            if (i11 == length) {
                m25122D(byteBuffer, j11);
            } else {
                n94 n94Var = this.f25542E[i11];
                if (i11 > this.f25549L) {
                    n94Var.mo20072a(byteBuffer);
                }
                ByteBuffer zzb = n94Var.zzb();
                this.f25543F[i11] = zzb;
                if (zzb.hasRemaining()) {
                    i11++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i11--;
            }
        }
    }

    /* renamed from: B */
    private final void m25120B(kc0 kc0Var, boolean z11) {
        bb4 m25138v = m25138v();
        if (kc0Var.equals(m25138v.f17685a) && z11 == m25138v.f17686b) {
            return;
        }
        bb4 bb4Var = new bb4(kc0Var, z11, -9223372036854775807L, -9223372036854775807L, null);
        if (m25124F()) {
            this.f25578s = bb4Var;
        } else {
            this.f25579t = bb4Var;
        }
    }

    /* renamed from: C */
    private final void m25121C() {
        if (!m25124F()) {
            return;
        }
        if (g92.f20474a >= 21) {
            this.f25576q.setVolume(this.f25541D);
            return;
        }
        AudioTrack audioTrack = this.f25576q;
        float f11 = this.f25541D;
        audioTrack.setStereoVolume(f11, f11);
    }

    /* renamed from: D */
    private final void m25122D(ByteBuffer byteBuffer, long j11) {
        int write;
        aa4 aa4Var;
        a44 a44Var;
        a44 a44Var2;
        boolean z11;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.f25546I;
        boolean z12 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z11 = true;
            } else {
                z11 = false;
            }
            v71.m27173d(z11);
        } else {
            this.f25546I = byteBuffer;
            if (g92.f20474a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f25547J;
                if (bArr == null || bArr.length < remaining) {
                    this.f25547J = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f25547J, 0, remaining);
                byteBuffer.position(position);
                this.f25548K = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i11 = g92.f20474a;
        if (i11 < 21) {
            int m22385a = this.f25566g.m22385a(this.f25583x);
            if (m22385a > 0) {
                write = this.f25576q.write(this.f25547J, this.f25548K, Math.min(remaining2, m22385a));
                if (write > 0) {
                    this.f25548K += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            } else {
                write = 0;
            }
        } else {
            write = this.f25576q.write(byteBuffer, remaining2, 1);
        }
        this.f25556S = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((i11 < 24 || write != -6) && write != -32) {
                z12 = false;
            }
            if (z12) {
                m25141y();
            }
            zznx zznxVar = new zznx(write, this.f25575p.f30861a, z12);
            aa4 aa4Var2 = this.f25573n;
            if (aa4Var2 != null) {
                aa4Var2.mo20042a(zznxVar);
            }
            if (!zznxVar.f32151q) {
                this.f25570k.m20859b(zznxVar);
                return;
            }
            throw zznxVar;
        }
        this.f25570k.m20858a();
        if (m25125G(this.f25576q)) {
            if (this.f25584y > 0) {
                this.f25558U = false;
            }
            if (this.f25552O && (aa4Var = this.f25573n) != null && write < remaining2 && !this.f25558U) {
                vb4 vb4Var = ((tb4) aa4Var).f28283a;
                a44Var = vb4Var.f29266L0;
                if (a44Var != null) {
                    a44Var2 = vb4Var.f29266L0;
                    a44Var2.zza();
                }
            }
        }
        int i12 = this.f25575p.f30863c;
        if (i12 == 0) {
            this.f25583x += write;
        }
        if (write == remaining2) {
            if (i12 != 0) {
                if (byteBuffer != this.f25544G) {
                    z12 = false;
                }
                v71.m27175f(z12);
                this.f25584y += this.f25585z * this.f25545H;
            }
            this.f25546I = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m25123E() {
        boolean z11;
        int i11;
        n94[] n94VarArr;
        if (this.f25549L == -1) {
            this.f25549L = 0;
            z11 = true;
            i11 = this.f25549L;
            n94VarArr = this.f25542E;
            if (i11 < n94VarArr.length) {
                n94 n94Var = n94VarArr[i11];
                if (z11) {
                    n94Var.zzd();
                }
                m25119A(-9223372036854775807L);
                if (!n94Var.zzh()) {
                    return false;
                }
                this.f25549L++;
                z11 = true;
                i11 = this.f25549L;
                n94VarArr = this.f25542E;
                if (i11 < n94VarArr.length) {
                    ByteBuffer byteBuffer = this.f25546I;
                    if (byteBuffer != null) {
                        m25122D(byteBuffer, -9223372036854775807L);
                        if (this.f25546I != null) {
                            return false;
                        }
                    }
                    this.f25549L = -1;
                    return true;
                }
            }
        } else {
            z11 = false;
            i11 = this.f25549L;
            n94VarArr = this.f25542E;
            if (i11 < n94VarArr.length) {
            }
        }
    }

    /* renamed from: F */
    private final boolean m25124F() {
        return this.f25576q != null;
    }

    /* renamed from: G */
    private static boolean m25125G(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (g92.f20474a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: H */
    private final boolean m25126H() {
        if ("audio/raw".equals(this.f25575p.f30861a.f23099l)) {
            int i11 = this.f25575p.f30861a.f23082A;
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static /* synthetic */ void m25133q(AudioTrack audioTrack, ya1 ya1Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            ya1Var.m28167e();
            synchronized (f25535W) {
                try {
                    int i11 = f25537Y - 1;
                    f25537Y = i11;
                    if (i11 == 0) {
                        f25536X.shutdown();
                        f25536X = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            ya1Var.m28167e();
            synchronized (f25535W) {
                try {
                    int i12 = f25537Y - 1;
                    f25537Y = i12;
                    if (i12 == 0) {
                        f25536X.shutdown();
                        f25536X = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* renamed from: s */
    public final long m25135s() {
        if (this.f25575p.f30863c == 0) {
            return this.f25581v / r0.f30862b;
        }
        return this.f25582w;
    }

    /* renamed from: t */
    public final long m25136t() {
        if (this.f25575p.f30863c == 0) {
            return this.f25583x / r0.f30864d;
        }
        return this.f25584y;
    }

    /* renamed from: u */
    private final AudioTrack m25137u(ya4 ya4Var) {
        try {
            return ya4Var.m28175b(false, this.f25577r, this.f25554Q);
        } catch (zznu e11) {
            aa4 aa4Var = this.f25573n;
            if (aa4Var != null) {
                aa4Var.mo20042a(e11);
            }
            throw e11;
        }
    }

    /* renamed from: v */
    private final bb4 m25138v() {
        bb4 bb4Var = this.f25578s;
        if (bb4Var == null) {
            if (!this.f25567h.isEmpty()) {
                return (bb4) this.f25567h.getLast();
            }
            return this.f25579t;
        }
        return bb4Var;
    }

    /* renamed from: w */
    private final void m25139w(long j11) {
        kc0 kc0Var;
        boolean z11;
        y94 y94Var;
        if (m25126H()) {
            za4 za4Var = this.f25559V;
            kc0Var = m25138v().f17685a;
            za4Var.m28466c(kc0Var);
        } else {
            kc0Var = kc0.f23208d;
        }
        kc0 kc0Var2 = kc0Var;
        if (m25126H()) {
            za4 za4Var2 = this.f25559V;
            boolean z12 = m25138v().f17686b;
            za4Var2.m28467d(z12);
            z11 = z12;
        } else {
            z11 = false;
        }
        this.f25567h.add(new bb4(kc0Var2, z11, Math.max(0L, j11), this.f25575p.m28174a(m25136t()), null));
        n94[] n94VarArr = this.f25575p.f30869i;
        ArrayList arrayList = new ArrayList();
        for (n94 n94Var : n94VarArr) {
            if (n94Var.zzg()) {
                arrayList.add(n94Var);
            } else {
                n94Var.zzc();
            }
        }
        int size = arrayList.size();
        this.f25542E = (n94[]) arrayList.toArray(new n94[size]);
        this.f25543F = new ByteBuffer[size];
        m25140x();
        aa4 aa4Var = this.f25573n;
        if (aa4Var != null) {
            y94Var = ((tb4) aa4Var).f28283a.f29257C0;
            y94Var.m28161s(z11);
        }
    }

    /* renamed from: x */
    private final void m25140x() {
        int i11 = 0;
        while (true) {
            n94[] n94VarArr = this.f25542E;
            if (i11 < n94VarArr.length) {
                n94 n94Var = n94VarArr[i11];
                n94Var.zzc();
                this.f25543F[i11] = n94Var.zzb();
                i11++;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    private final void m25141y() {
        if (!this.f25575p.m28176c()) {
            return;
        }
        this.f25557T = true;
    }

    /* renamed from: z */
    private final void m25142z() {
        if (!this.f25551N) {
            this.f25551N = true;
            this.f25566g.m22387c(m25136t());
            this.f25576q.stop();
        }
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: a */
    public final boolean mo20456a() {
        if (!m25124F()) {
            return true;
        }
        if (this.f25550M && !zzt()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: b */
    public final int mo20457b(C4671k3 c4671k3) {
        if ("audio/raw".equals(c4671k3.f23099l)) {
            if (!g92.m22364v(c4671k3.f23082A)) {
                lr1.m24356e("DefaultAudioSink", "Invalid PCM encoding: " + c4671k3.f23082A);
                return 0;
            }
            if (c4671k3.f23082A == 2) {
                return 2;
            }
            return 1;
        }
        if (!this.f25557T) {
            int i11 = g92.f20474a;
        }
        if (this.f25560a.m24183a(c4671k3) == null) {
            return 0;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: c */
    public final void mo20458c(C4671k3 c4671k3, int i11, int[] iArr) {
        int i12;
        n94[] n94VarArr;
        int intValue;
        int i13;
        int intValue2;
        int i14;
        int i15;
        boolean z11;
        int m22322P;
        int[] iArr2;
        if ("audio/raw".equals(c4671k3.f23099l)) {
            v71.m27173d(g92.m22364v(c4671k3.f23082A));
            i13 = g92.m22331Y(c4671k3.f23082A, c4671k3.f23112y);
            n94[] n94VarArr2 = this.f25563d;
            this.f25562c.m20079k(c4671k3.f23083B, c4671k3.f23084C);
            if (g92.f20474a < 21 && c4671k3.f23112y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i16 = 0; i16 < 6; i16++) {
                    iArr2[i16] = i16;
                }
            } else {
                iArr2 = iArr;
            }
            this.f25561b.m23151i(iArr2);
            m94 m94Var = new m94(c4671k3.f23113z, c4671k3.f23112y, c4671k3.f23082A);
            for (n94 n94Var : n94VarArr2) {
                try {
                    m94 mo22775b = n94Var.mo22775b(m94Var);
                    if (true == n94Var.zzg()) {
                        m94Var = mo22775b;
                    }
                } catch (zznf e11) {
                    throw new zznt(e11, c4671k3);
                }
            }
            int i17 = m94Var.f24446c;
            int i18 = m94Var.f24444a;
            int i19 = m94Var.f24445b;
            int m22326T = g92.m22326T(i19);
            n94VarArr = n94VarArr2;
            i15 = g92.m22331Y(i17, i19);
            i14 = i18;
            i12 = 0;
            intValue = i17;
            intValue2 = m22326T;
        } else {
            n94[] n94VarArr3 = new n94[0];
            int i21 = c4671k3.f23113z;
            int i22 = g92.f20474a;
            Pair m24183a = this.f25560a.m24183a(c4671k3);
            if (m24183a != null) {
                i12 = 2;
                n94VarArr = n94VarArr3;
                intValue = ((Integer) m24183a.first).intValue();
                i13 = -1;
                intValue2 = ((Integer) m24183a.second).intValue();
                i14 = i21;
                i15 = -1;
            } else {
                throw new zznt("Unable to configure passthrough for: ".concat(String.valueOf(c4671k3)), c4671k3);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i14, intValue2, intValue);
        if (minBufferSize != -2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        int i23 = 250000;
        if (i12 != 0) {
            if (i12 != 1) {
                int i24 = 5;
                if (intValue == 5) {
                    i23 = 500000;
                    intValue = 5;
                } else {
                    i24 = intValue;
                }
                m22322P = ha3.m22772a((i23 * qb4.m25681b(intValue)) / 1000000);
                i15 = i15;
                intValue = i24;
            } else {
                m22322P = ha3.m22772a((qb4.m25681b(intValue) * 50000000) / 1000000);
            }
        } else {
            m22322P = g92.m22322P(minBufferSize * 4, qb4.m25680a(250000, i14, i15), qb4.m25680a(750000, i14, i15));
        }
        int max = (((Math.max(minBufferSize, m22322P) + i15) - 1) / i15) * i15;
        if (intValue != 0) {
            if (intValue2 != 0) {
                this.f25557T = false;
                ya4 ya4Var = new ya4(c4671k3, i13, i12, i15, i14, intValue2, intValue, max, n94VarArr);
                if (m25124F()) {
                    this.f25574o = ya4Var;
                    return;
                } else {
                    this.f25575p = ya4Var;
                    return;
                }
            }
            throw new zznt("Invalid output channel config (mode=" + i12 + ") for: " + String.valueOf(c4671k3), c4671k3);
        }
        throw new zznt("Invalid output encoding (mode=" + i12 + ") for: " + String.valueOf(c4671k3), c4671k3);
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: d */
    public final long mo20459d(boolean z11) {
        long m22338c0;
        if (m25124F() && !this.f25539B) {
            long min = Math.min(this.f25566g.m22386b(z11), this.f25575p.m28174a(m25136t()));
            while (!this.f25567h.isEmpty() && min >= ((bb4) this.f25567h.getFirst()).f17688d) {
                this.f25579t = (bb4) this.f25567h.remove();
            }
            bb4 bb4Var = this.f25579t;
            long j11 = min - bb4Var.f17688d;
            if (bb4Var.f17685a.equals(kc0.f23208d)) {
                m22338c0 = this.f25579t.f17687c + j11;
            } else if (this.f25567h.isEmpty()) {
                m22338c0 = this.f25559V.m28464a(j11) + this.f25579t.f17687c;
            } else {
                bb4 bb4Var2 = (bb4) this.f25567h.getFirst();
                m22338c0 = bb4Var2.f17687c - g92.m22338c0(bb4Var2.f17688d - min, this.f25579t.f17685a.f23210a);
            }
            return m22338c0 + this.f25575p.m28174a(this.f25559V.m28465b());
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: e */
    public final void mo20460e(d54 d54Var) {
        if (this.f25555R.equals(d54Var)) {
            return;
        }
        int i11 = d54Var.f19106a;
        if (this.f25576q != null) {
            int i12 = this.f25555R.f19106a;
        }
        this.f25555R = d54Var;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: f */
    public final void mo20461f(kc0 kc0Var) {
        m25120B(new kc0(g92.m22307A(kc0Var.f23210a, 0.1f, 8.0f), g92.m22307A(kc0Var.f23211b, 0.1f, 8.0f)), m25138v().f17686b);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x01b4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ca A[RETURN] */
    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo20462g(ByteBuffer byteBuffer, long j11, int i11) {
        boolean z11;
        AudioTrack m25137u;
        boolean z12;
        i94 i94Var;
        boolean z13;
        boolean z14;
        int m23638a;
        int i12;
        int i13;
        int i14;
        byte b11;
        int i15;
        int i16;
        int i17;
        ByteBuffer byteBuffer2 = this.f25544G;
        if (byteBuffer2 == null || byteBuffer == byteBuffer2) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        if (this.f25574o != null) {
            if (!m25123E()) {
                return false;
            }
            ya4 ya4Var = this.f25574o;
            ya4 ya4Var2 = this.f25575p;
            if (ya4Var2.f30863c == ya4Var.f30863c && ya4Var2.f30867g == ya4Var.f30867g && ya4Var2.f30865e == ya4Var.f30865e && ya4Var2.f30866f == ya4Var.f30866f && ya4Var2.f30864d == ya4Var.f30864d) {
                this.f25575p = ya4Var;
                this.f25574o = null;
                if (m25125G(this.f25576q)) {
                    if (this.f25576q.getPlayState() == 3) {
                        this.f25576q.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f25576q;
                    C4671k3 c4671k3 = this.f25575p.f30861a;
                    audioTrack.setOffloadDelayPadding(c4671k3.f23083B, c4671k3.f23084C);
                    this.f25558U = true;
                }
            } else {
                m25142z();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            m25139w(j11);
        }
        if (!m25124F()) {
            try {
                if (!this.f25565f.m28166d()) {
                    return false;
                }
                try {
                    ya4 ya4Var3 = this.f25575p;
                    ya4Var3.getClass();
                    m25137u = m25137u(ya4Var3);
                } catch (zznu e11) {
                    ya4 ya4Var4 = this.f25575p;
                    if (ya4Var4.f30868h > 1000000) {
                        ya4 ya4Var5 = new ya4(ya4Var4.f30861a, ya4Var4.f30862b, ya4Var4.f30863c, ya4Var4.f30864d, ya4Var4.f30865e, ya4Var4.f30866f, ya4Var4.f30867g, 1000000, ya4Var4.f30869i);
                        try {
                            m25137u = m25137u(ya4Var5);
                            this.f25575p = ya4Var5;
                        } catch (zznu e12) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e11, e12);
                            } catch (Exception unused) {
                            }
                            m25141y();
                            throw e11;
                        }
                    }
                    m25141y();
                    throw e11;
                }
                this.f25576q = m25137u;
                if (m25125G(m25137u)) {
                    AudioTrack audioTrack2 = this.f25576q;
                    if (this.f25568i == null) {
                        this.f25568i = new jb4(this);
                    }
                    this.f25568i.m23594a(audioTrack2);
                    AudioTrack audioTrack3 = this.f25576q;
                    C4671k3 c4671k32 = this.f25575p.f30861a;
                    audioTrack3.setOffloadDelayPadding(c4671k32.f23083B, c4671k32.f23084C);
                }
                if (g92.f20474a >= 31 && (i94Var = this.f25572m) != null) {
                    ma4.m24529a(this.f25576q, i94Var);
                }
                this.f25554Q = this.f25576q.getAudioSessionId();
                ga4 ga4Var = this.f25566g;
                AudioTrack audioTrack4 = this.f25576q;
                ya4 ya4Var6 = this.f25575p;
                if (ya4Var6.f30863c == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ga4Var.m22389e(audioTrack4, z12, ya4Var6.f30867g, ya4Var6.f30864d, ya4Var6.f30868h);
                m25121C();
                int i18 = this.f25555R.f19106a;
                this.f25539B = true;
            } catch (zznu e13) {
                if (!e13.f32148q) {
                    this.f25569j.m20859b(e13);
                    return false;
                }
                throw e13;
            }
        }
        this.f25569j.m20858a();
        if (this.f25539B) {
            this.f25540C = Math.max(0L, j11);
            this.f25538A = false;
            this.f25539B = false;
            m25139w(j11);
            if (this.f25552O) {
                zzh();
            }
        }
        if (!this.f25566g.m22394j(m25136t())) {
            return false;
        }
        if (this.f25544G == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z13 = true;
            } else {
                z13 = false;
            }
            v71.m27173d(z13);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            ya4 ya4Var7 = this.f25575p;
            if (ya4Var7.f30863c != 0 && this.f25585z == 0) {
                int i19 = ya4Var7.f30867g;
                switch (i19) {
                    case 5:
                    case 6:
                    case 18:
                        z14 = true;
                        m23638a = jl4.m23638a(byteBuffer);
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                            return z14;
                        }
                        break;
                    case 7:
                    case 8:
                        int i21 = gm4.f20749d;
                        int position = byteBuffer.position();
                        byte b12 = byteBuffer.get(position);
                        if (b12 != -2) {
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i14 = (byteBuffer.get(position + 4) & 1) << 6;
                                    i15 = byteBuffer.get(position + 5) & 252;
                                    i13 = 2;
                                    i12 = (i15 >> i13) | i14;
                                    z14 = true;
                                } else {
                                    i13 = 2;
                                    i14 = (byteBuffer.get(position + 5) & 7) << 4;
                                    b11 = byteBuffer.get(position + 6);
                                }
                            } else {
                                i13 = 2;
                                i14 = (byteBuffer.get(position + 4) & 7) << 4;
                                b11 = byteBuffer.get(position + 7);
                            }
                            i15 = b11 & 60;
                            i12 = (i15 >> i13) | i14;
                            z14 = true;
                        } else {
                            z14 = true;
                            i12 = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                        }
                        m23638a = (i12 + (z14 ? 1 : 0)) * 32;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                    case 9:
                        m23638a = AbstractC4446e.m21586c(g92.m22327U(byteBuffer, byteBuffer.position()));
                        if (m23638a == -1) {
                            throw new IllegalArgumentException();
                        }
                        z14 = true;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                    case 10:
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        m23638a = 1024;
                        z14 = true;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                    case 11:
                    case 12:
                        m23638a = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                        z14 = true;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException("Unexpected audio encoding: " + i19);
                    case 14:
                        int i22 = jl4.f22872g;
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i23 = position2;
                        while (true) {
                            if (i23 <= limit) {
                                if ((g92.m22327U(byteBuffer, i23 + 4) & (-2)) == -126718022) {
                                    i16 = i23 - position2;
                                } else {
                                    i23++;
                                }
                            } else {
                                i16 = -1;
                            }
                        }
                        if (i16 == -1) {
                            m23638a = 0;
                        } else {
                            int i24 = byteBuffer.get(byteBuffer.position() + i16 + 7);
                            int position3 = byteBuffer.position() + i16;
                            if ((i24 & 255) == 187) {
                                i17 = 9;
                            } else {
                                i17 = 8;
                            }
                            m23638a = (40 << ((byteBuffer.get(position3 + i17) >> 4) & 7)) * 16;
                        }
                        z14 = true;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                    case 15:
                        m23638a = 512;
                        z14 = true;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                    case 17:
                        int i25 = ml4.f24648b;
                        byte[] bArr = new byte[16];
                        int position4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position4);
                        m23638a = ml4.m24628a(new wz1(bArr, 16)).f23974c;
                        z14 = true;
                        this.f25585z = m23638a;
                        if (m23638a == 0) {
                        }
                        break;
                }
            }
            if (this.f25578s != null) {
                if (!m25123E()) {
                    return false;
                }
                m25139w(j11);
                this.f25578s = null;
            }
            long m25135s = this.f25540C + (((m25135s() - this.f25562c.m20077i()) * 1000000) / this.f25575p.f30861a.f23113z);
            if (!this.f25538A && Math.abs(m25135s - j11) > 200000) {
                this.f25573n.mo20042a(new zznw(j11, m25135s));
                this.f25538A = true;
            }
            if (this.f25538A) {
                if (!m25123E()) {
                    return false;
                }
                long j12 = j11 - m25135s;
                this.f25540C += j12;
                this.f25538A = false;
                m25139w(j11);
                aa4 aa4Var = this.f25573n;
                if (aa4Var != null && j12 != 0) {
                    ((tb4) aa4Var).f28283a.m27206X();
                }
            }
            if (this.f25575p.f30863c == 0) {
                this.f25581v += byteBuffer.remaining();
            } else {
                this.f25582w += this.f25585z * i11;
            }
            this.f25544G = byteBuffer;
            this.f25545H = i11;
        }
        m25119A(j11);
        if (!this.f25544G.hasRemaining()) {
            this.f25544G = null;
            this.f25545H = 0;
            return true;
        }
        if (!this.f25566g.m22393i(m25136t())) {
            return false;
        }
        lr1.m24356e("DefaultAudioSink", "Resetting stalled audio track");
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: h */
    public final void mo20463h(boolean z11) {
        m25120B(m25138v().f17685a, z11);
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: i */
    public final void mo20464i(i94 i94Var) {
        this.f25572m = i94Var;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: j */
    public final void mo20465j(aa4 aa4Var) {
        this.f25573n = aa4Var;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: k */
    public final void mo20466k(b44 b44Var) {
        if (this.f25577r.equals(b44Var)) {
            return;
        }
        this.f25577r = b44Var;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: l */
    public final void mo20467l(int i11) {
        boolean z11;
        if (this.f25554Q != i11) {
            this.f25554Q = i11;
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f25553P = z11;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: m */
    public final void mo20468m(float f11) {
        if (this.f25541D != f11) {
            this.f25541D = f11;
            m25121C();
        }
    }

    @Override // com.google.android.gms.internal.ads.ba4
    /* renamed from: n */
    public final boolean mo20469n(C4671k3 c4671k3) {
        if (mo20457b(c4671k3) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final kc0 zzc() {
        return m25138v().f17685a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.ja4.<init>(android.media.AudioTrack, com.google.android.gms.internal.ads.ya1):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.google.android.gms.internal.ads.ba4
    public final void zze() {
        /*
            r12 = this;
            boolean r0 = r12.m25124F()
            if (r0 == 0) goto Lb4
            r0 = 0
            r12.f25581v = r0
            r12.f25582w = r0
            r12.f25583x = r0
            r12.f25584y = r0
            r2 = 0
            r12.f25558U = r2
            r12.f25585z = r2
            com.google.android.gms.internal.ads.bb4 r11 = new com.google.android.gms.internal.ads.bb4
            com.google.android.gms.internal.ads.bb4 r3 = r12.m25138v()
            com.google.android.gms.internal.ads.kc0 r4 = r3.f17685a
            com.google.android.gms.internal.ads.bb4 r3 = r12.m25138v()
            boolean r5 = r3.f17686b
            r6 = 0
            r8 = 0
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r8, r10)
            r12.f25579t = r11
            r12.f25540C = r0
            r0 = 0
            r12.f25578s = r0
            java.util.ArrayDeque r1 = r12.f25567h
            r1.clear()
            r12.f25544G = r0
            r12.f25545H = r2
            r12.f25546I = r0
            r12.f25551N = r2
            r12.f25550M = r2
            r1 = -1
            r12.f25549L = r1
            com.google.android.gms.internal.ads.ac4 r1 = r12.f25562c
            r1.m20078j()
            r12.m25140x()
            com.google.android.gms.internal.ads.ga4 r1 = r12.f25566g
            boolean r1 = r1.m22392h()
            if (r1 == 0) goto L5a
            android.media.AudioTrack r1 = r12.f25576q
            r1.pause()
        L5a:
            android.media.AudioTrack r1 = r12.f25576q
            boolean r1 = m25125G(r1)
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.jb4 r1 = r12.f25568i
            r1.getClass()
            android.media.AudioTrack r3 = r12.f25576q
            r1.m23595b(r3)
        L6c:
            int r1 = com.google.android.gms.internal.ads.g92.f20474a
            r3 = 21
            if (r1 >= r3) goto L78
            boolean r1 = r12.f25553P
            if (r1 != 0) goto L78
            r12.f25554Q = r2
        L78:
            com.google.android.gms.internal.ads.ya4 r1 = r12.f25574o
            if (r1 == 0) goto L80
            r12.f25575p = r1
            r12.f25574o = r0
        L80:
            com.google.android.gms.internal.ads.ga4 r1 = r12.f25566g
            r1.m22388d()
            android.media.AudioTrack r1 = r12.f25576q
            com.google.android.gms.internal.ads.ya1 r2 = r12.f25565f
            r2.m28165c()
            java.lang.Object r3 = com.google.android.gms.internal.ads.ob4.f25535W
            monitor-enter(r3)
            java.util.concurrent.ExecutorService r4 = com.google.android.gms.internal.ads.ob4.f25536X     // Catch: java.lang.Throwable -> L9c
            if (r4 != 0) goto L9e
            java.lang.String r4 = "ExoPlayer:AudioTrackReleaseThread"
            java.util.concurrent.ExecutorService r4 = com.google.android.gms.internal.ads.g92.m22359q(r4)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.ob4.f25536X = r4     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L9c:
            r0 = move-exception
            goto Lb2
        L9e:
            int r4 = com.google.android.gms.internal.ads.ob4.f25537Y     // Catch: java.lang.Throwable -> L9c
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.ob4.f25537Y = r4     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.ExecutorService r4 = com.google.android.gms.internal.ads.ob4.f25536X     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.internal.ads.ja4 r5 = new com.google.android.gms.internal.ads.ja4     // Catch: java.lang.Throwable -> L9c
            r5.<init>()     // Catch: java.lang.Throwable -> L9c
            r4.execute(r5)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            r12.f25576q = r0
            goto Lb4
        Lb2:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            throw r0
        Lb4:
            com.google.android.gms.internal.ads.cb4 r0 = r12.f25570k
            r0.m20858a()
            com.google.android.gms.internal.ads.cb4 r0 = r12.f25569j
            r0.m20858a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ob4.zze():void");
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final void zzf() {
        this.f25538A = true;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final void zzg() {
        this.f25552O = false;
        if (m25124F() && this.f25566g.m22395k()) {
            this.f25576q.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final void zzh() {
        this.f25552O = true;
        if (m25124F()) {
            this.f25566g.m22390f();
            this.f25576q.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final void zzi() {
        if (!this.f25550M && m25124F() && m25123E()) {
            m25142z();
            this.f25550M = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final void zzj() {
        zze();
        for (n94 n94Var : this.f25563d) {
            n94Var.zzf();
        }
        n94[] n94VarArr = this.f25564e;
        int length = n94VarArr.length;
        for (int i11 = 0; i11 <= 0; i11++) {
            n94VarArr[i11].zzf();
        }
        this.f25552O = false;
        this.f25557T = false;
    }

    @Override // com.google.android.gms.internal.ads.ba4
    public final boolean zzt() {
        if (m25124F() && this.f25566g.m22391g(m25136t())) {
            return true;
        }
        return false;
    }
}
