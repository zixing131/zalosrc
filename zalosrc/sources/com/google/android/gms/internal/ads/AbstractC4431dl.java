package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dl */
/* loaded from: classes2.dex */
public abstract class AbstractC4431dl extends AbstractC5056ug {

    /* renamed from: P */
    private static final byte[] f19290P = AbstractC4916qo.m25840p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f19291A;

    /* renamed from: B */
    private ByteBuffer[] f19292B;

    /* renamed from: C */
    private long f19293C;

    /* renamed from: D */
    private int f19294D;

    /* renamed from: E */
    private int f19295E;

    /* renamed from: F */
    private boolean f19296F;

    /* renamed from: G */
    private boolean f19297G;

    /* renamed from: H */
    private int f19298H;

    /* renamed from: I */
    private int f19299I;

    /* renamed from: J */
    private boolean f19300J;

    /* renamed from: K */
    private boolean f19301K;

    /* renamed from: L */
    private boolean f19302L;

    /* renamed from: M */
    private boolean f19303M;

    /* renamed from: N */
    private boolean f19304N;

    /* renamed from: O */
    protected C4356bj f19305O;

    /* renamed from: i */
    private final InterfaceC4505fl f19306i;

    /* renamed from: j */
    private final C4392cj f19307j;

    /* renamed from: k */
    private final C4392cj f19308k;

    /* renamed from: l */
    private final C4648jh f19309l;

    /* renamed from: m */
    private final List f19310m;

    /* renamed from: n */
    private final MediaCodec.BufferInfo f19311n;

    /* renamed from: o */
    private zzasw f19312o;

    /* renamed from: p */
    private MediaCodec f19313p;

    /* renamed from: q */
    private C4394cl f19314q;

    /* renamed from: r */
    private boolean f19315r;

    /* renamed from: s */
    private boolean f19316s;

    /* renamed from: t */
    private boolean f19317t;

    /* renamed from: u */
    private boolean f19318u;

    /* renamed from: v */
    private boolean f19319v;

    /* renamed from: w */
    private boolean f19320w;

    /* renamed from: x */
    private boolean f19321x;

    /* renamed from: y */
    private boolean f19322y;

    /* renamed from: z */
    private boolean f19323z;

    public AbstractC4431dl(int i11, InterfaceC4505fl interfaceC4505fl, InterfaceC4503fj interfaceC4503fj, boolean z11) {
        super(i11);
        boolean z12;
        if (AbstractC4916qo.f26898a >= 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4361bo.m20613e(z12);
        this.f19306i = interfaceC4505fl;
        this.f19307j = new C4392cj(0);
        this.f19308k = new C4392cj(0);
        this.f19309l = new C4648jh();
        this.f19310m = new ArrayList();
        this.f19311n = new MediaCodec.BufferInfo();
        this.f19298H = 0;
        this.f19299I = 0;
    }

    /* renamed from: y */
    private final void m21457y() {
        if (this.f19299I == 2) {
            mo21470L();
            m21468J();
        } else {
            this.f19303M = true;
            mo21464F();
        }
    }

    /* renamed from: z */
    private final boolean m21458z() {
        MediaCodec mediaCodec = this.f19313p;
        if (mediaCodec == null || this.f19299I == 2 || this.f19302L) {
            return false;
        }
        if (this.f19294D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.f19294D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            C4392cj c4392cj = this.f19307j;
            c4392cj.f18447c = this.f19291A[dequeueInputBuffer];
            c4392cj.mo20906b();
        }
        if (this.f19299I == 1) {
            if (!this.f19318u) {
                this.f19301K = true;
                this.f19313p.queueInputBuffer(this.f19294D, 0, 0, 0L, 4);
                this.f19294D = -1;
            }
            this.f19299I = 2;
            return false;
        }
        if (this.f19322y) {
            this.f19322y = false;
            ByteBuffer byteBuffer = this.f19307j.f18447c;
            byte[] bArr = f19290P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f19313p;
            int i11 = this.f19294D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i11, 0, 38, 0L, 0);
            this.f19294D = -1;
            this.f19300J = true;
            return true;
        }
        if (this.f19298H == 1) {
            for (int i12 = 0; i12 < this.f19312o.f31838w.size(); i12++) {
                this.f19307j.f18447c.put((byte[]) this.f19312o.f31838w.get(i12));
            }
            this.f19298H = 2;
        }
        int position = this.f19307j.f18447c.position();
        int m26925f = m26925f(this.f19309l, this.f19307j, false);
        if (m26925f == -3) {
            return false;
        }
        if (m26925f == -5) {
            if (this.f19298H == 2) {
                this.f19307j.mo20906b();
                this.f19298H = 1;
            }
            mo21462D(this.f19309l.f22819a);
            return true;
        }
        C4392cj c4392cj2 = this.f19307j;
        if (c4392cj2.m26971f()) {
            if (this.f19298H == 2) {
                c4392cj2.mo20906b();
                this.f19298H = 1;
            }
            this.f19302L = true;
            if (!this.f19300J) {
                m21457y();
                return false;
            }
            try {
                if (!this.f19318u) {
                    this.f19301K = true;
                    this.f19313p.queueInputBuffer(this.f19294D, 0, 0, 0L, 4);
                    this.f19294D = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e11) {
                throw zzasi.m28676a(e11, m26924e());
            }
        }
        if (this.f19304N && !c4392cj2.m26972g()) {
            c4392cj2.mo20906b();
            if (this.f19298H == 2) {
                this.f19298H = 1;
            }
            return true;
        }
        this.f19304N = false;
        boolean m20908i = c4392cj2.m20908i();
        if (this.f19315r && !m20908i) {
            ByteBuffer byteBuffer2 = c4392cj2.f18447c;
            byte[] bArr2 = AbstractC4582ho.f21849a;
            int position2 = byteBuffer2.position();
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = i13 + 1;
                if (i15 < position2) {
                    int i16 = byteBuffer2.get(i13) & 255;
                    if (i14 == 3) {
                        if (i16 == 1) {
                            if ((byteBuffer2.get(i15) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer2.duplicate();
                                duplicate.position(i13 - 3);
                                duplicate.limit(position2);
                                byteBuffer2.position(0);
                                byteBuffer2.put(duplicate);
                                break;
                            }
                            i16 = 1;
                        }
                    } else if (i16 == 0) {
                        i14++;
                    }
                    if (i16 != 0) {
                        i14 = 0;
                    }
                    i13 = i15;
                } else {
                    byteBuffer2.clear();
                    break;
                }
            }
            if (this.f19307j.f18447c.position() == 0) {
                return true;
            }
            this.f19315r = false;
        }
        try {
            C4392cj c4392cj3 = this.f19307j;
            long j11 = c4392cj3.f18448d;
            if (c4392cj3.m26970e()) {
                this.f19310m.add(Long.valueOf(j11));
            }
            this.f19307j.f18447c.flip();
            mo21469K(this.f19307j);
            if (m20908i) {
                MediaCodec.CryptoInfo m20134a = this.f19307j.f18446b.m20134a();
                if (position != 0) {
                    if (m20134a.numBytesOfClearData == null) {
                        m20134a.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = m20134a.numBytesOfClearData;
                    iArr[0] = iArr[0] + position;
                }
                this.f19313p.queueSecureInputBuffer(this.f19294D, 0, m20134a, j11, 0);
            } else {
                this.f19313p.queueInputBuffer(this.f19294D, 0, this.f19307j.f18447c.limit(), j11, 0);
            }
            this.f19294D = -1;
            this.f19300J = true;
            this.f19298H = 0;
            this.f19305O.f17764c++;
            return true;
        } catch (MediaCodec.CryptoException e12) {
            throw zzasi.m28676a(e12, m26924e());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public C4394cl mo21459A(InterfaceC4505fl interfaceC4505fl, zzasw zzaswVar, boolean z11) {
        return AbstractC4801nl.m24941c(zzaswVar.f31836u, false);
    }

    /* renamed from: B */
    protected abstract void mo21460B(C4394cl c4394cl, MediaCodec mediaCodec, zzasw zzaswVar, MediaCrypto mediaCrypto);

    /* renamed from: C */
    protected abstract void mo21461C(String str, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:            if (r6.f31841z == r0.f31841z) goto L25;     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21462D(zzasw zzaswVar) {
        zzauv zzauvVar;
        zzasw zzaswVar2 = this.f19312o;
        this.f19312o = zzaswVar;
        zzauv zzauvVar2 = zzaswVar.f31839x;
        if (zzaswVar2 == null) {
            zzauvVar = null;
        } else {
            zzauvVar = zzaswVar2.f31839x;
        }
        if (!AbstractC4916qo.m25839o(zzauvVar2, zzauvVar) && this.f19312o.f31839x != null) {
            throw zzasi.m28676a(new IllegalStateException("Media requires a DrmSessionManager"), m26924e());
        }
        MediaCodec mediaCodec = this.f19313p;
        boolean z11 = true;
        if (mediaCodec != null && mo21471M(mediaCodec, this.f19314q.f18470b, zzaswVar2, this.f19312o)) {
            this.f19297G = true;
            this.f19298H = 1;
            if (this.f19317t) {
                zzasw zzaswVar3 = this.f19312o;
                if (zzaswVar3.f31840y == zzaswVar2.f31840y) {
                }
            }
            z11 = false;
            this.f19322y = z11;
            return;
        }
        if (this.f19300J) {
            this.f19299I = 1;
        } else {
            mo21470L();
            m21468J();
        }
    }

    /* renamed from: E */
    protected abstract void mo21463E(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: F */
    protected void mo21464F() {
    }

    /* renamed from: G */
    protected abstract boolean mo21465G(long j11, long j12, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i11, int i12, long j13, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final MediaCodec m21466H() {
        return this.f19313p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final C4394cl m21467I() {
        return this.f19314q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21468J() {
        zzasw zzaswVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j11;
        if (this.f19313p == null && (zzaswVar = this.f19312o) != null) {
            C4394cl c4394cl = this.f19314q;
            if (c4394cl == null) {
                try {
                    c4394cl = mo21459A(this.f19306i, zzaswVar, false);
                    this.f19314q = c4394cl;
                    if (c4394cl == null) {
                        throw zzasi.m28676a(new zzawt(this.f19312o, (Throwable) null, false, -49999), m26924e());
                    }
                } catch (zzawz e11) {
                    throw zzasi.m28676a(new zzawt(this.f19312o, (Throwable) e11, false, -49998), m26924e());
                }
            }
            if (!mo21472N(c4394cl)) {
                return;
            }
            String str = this.f19314q.f18469a;
            zzasw zzaswVar2 = this.f19312o;
            int i11 = AbstractC4916qo.f26898a;
            if (i11 < 21 && zzaswVar2.f31838w.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f19315r = z11;
            if (i11 < 18 || ((i11 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i11 == 19 && AbstractC4916qo.f26901d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f19316s = z12;
            try {
                if (i11 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                    String str2 = AbstractC4916qo.f26899b;
                    if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                        z13 = true;
                        this.f19317t = z13;
                        if (i11 > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        this.f19318u = z14;
                        if ((i11 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i11 <= 19 && "hb2000".equals(AbstractC4916qo.f26899b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f19319v = z15;
                        if (i11 != 21 && "OMX.google.aac.decoder".equals(str)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f19320w = z16;
                        zzasw zzaswVar3 = this.f19312o;
                        if (i11 > 18 && zzaswVar3.f31821G == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        this.f19321x = z17;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        AbstractC4841oo.m25224a("createCodec:" + str);
                        this.f19313p = MediaCodec.createByCodecName(str);
                        AbstractC4841oo.m25225b();
                        AbstractC4841oo.m25224a("configureCodec");
                        mo21460B(this.f19314q, this.f19313p, this.f19312o, null);
                        AbstractC4841oo.m25225b();
                        AbstractC4841oo.m25224a("startCodec");
                        this.f19313p.start();
                        AbstractC4841oo.m25225b();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo21461C(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.f19291A = this.f19313p.getInputBuffers();
                        this.f19292B = this.f19313p.getOutputBuffers();
                        if (zzb() != 2) {
                            j11 = SystemClock.elapsedRealtime() + 1000;
                        } else {
                            j11 = -9223372036854775807L;
                        }
                        this.f19293C = j11;
                        this.f19294D = -1;
                        this.f19295E = -1;
                        this.f19304N = true;
                        this.f19305O.f17762a++;
                        return;
                    }
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                AbstractC4841oo.m25224a("createCodec:" + str);
                this.f19313p = MediaCodec.createByCodecName(str);
                AbstractC4841oo.m25225b();
                AbstractC4841oo.m25224a("configureCodec");
                mo21460B(this.f19314q, this.f19313p, this.f19312o, null);
                AbstractC4841oo.m25225b();
                AbstractC4841oo.m25224a("startCodec");
                this.f19313p.start();
                AbstractC4841oo.m25225b();
                long elapsedRealtime22 = SystemClock.elapsedRealtime();
                mo21461C(str, elapsedRealtime22, elapsedRealtime22 - elapsedRealtime3);
                this.f19291A = this.f19313p.getInputBuffers();
                this.f19292B = this.f19313p.getOutputBuffers();
                if (zzb() != 2) {
                }
                this.f19293C = j11;
                this.f19294D = -1;
                this.f19295E = -1;
                this.f19304N = true;
                this.f19305O.f17762a++;
                return;
            } catch (Exception e12) {
                throw zzasi.m28676a(new zzawt(this.f19312o, (Throwable) e12, false, str), m26924e());
            }
            z13 = false;
            this.f19317t = z13;
            if (i11 > 17) {
            }
            z14 = false;
            this.f19318u = z14;
            if (i11 > 23) {
            }
            z15 = false;
            this.f19319v = z15;
            if (i11 != 21) {
            }
            z16 = false;
            this.f19320w = z16;
            zzasw zzaswVar32 = this.f19312o;
            if (i11 > 18) {
            }
            z17 = false;
            this.f19321x = z17;
        }
    }

    /* renamed from: K */
    protected void mo21469K(C4392cj c4392cj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void mo21470L() {
        this.f19293C = -9223372036854775807L;
        this.f19294D = -1;
        this.f19295E = -1;
        this.f19296F = false;
        this.f19310m.clear();
        this.f19291A = null;
        this.f19292B = null;
        this.f19314q = null;
        this.f19297G = false;
        this.f19300J = false;
        this.f19315r = false;
        this.f19316s = false;
        this.f19317t = false;
        this.f19318u = false;
        this.f19319v = false;
        this.f19321x = false;
        this.f19322y = false;
        this.f19323z = false;
        this.f19301K = false;
        this.f19298H = 0;
        this.f19299I = 0;
        this.f19307j.f18447c = null;
        MediaCodec mediaCodec = this.f19313p;
        if (mediaCodec != null) {
            this.f19305O.f17763b++;
            try {
                mediaCodec.stop();
                try {
                    this.f19313p.release();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f19313p.release();
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* renamed from: M */
    protected boolean mo21471M(MediaCodec mediaCodec, boolean z11, zzasw zzaswVar, zzasw zzaswVar2) {
        return false;
    }

    /* renamed from: N */
    protected boolean mo21472N(C4394cl c4394cl) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4797nh
    /* renamed from: a */
    public final int mo21473a(zzasw zzaswVar) {
        try {
            return mo21479x(this.f19306i, zzaswVar);
        } catch (zzawz e11) {
            throw zzasi.m28676a(e11, m26924e());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: b */
    public boolean mo21474b() {
        if (this.f19312o == null) {
            return false;
        }
        if (!m26923d() && this.f19295E < 0) {
            if (this.f19293C == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f19293C) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: i */
    public void mo21475i() {
        this.f19312o = null;
        mo21470L();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: j */
    public void mo21476j(boolean z11) {
        this.f19305O = new C4356bj();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: p */
    public final void mo21477p(long j11, long j12) {
        boolean mo21465G;
        int dequeueOutputBuffer;
        boolean z11;
        if (this.f19303M) {
            mo21464F();
            return;
        }
        if (this.f19312o == null) {
            this.f19308k.mo20906b();
            int m26925f = m26925f(this.f19309l, this.f19308k, true);
            if (m26925f == -5) {
                mo21462D(this.f19309l.f22819a);
            } else {
                if (m26925f == -4) {
                    AbstractC4361bo.m20613e(this.f19308k.m26971f());
                    this.f19302L = true;
                    m21457y();
                    return;
                }
                return;
            }
        }
        m21468J();
        if (this.f19313p != null) {
            AbstractC4841oo.m25224a("drainAndFeed");
            while (true) {
                if (this.f19295E < 0) {
                    if (this.f19320w && this.f19301K) {
                        try {
                            dequeueOutputBuffer = this.f19313p.dequeueOutputBuffer(this.f19311n, 0L);
                            this.f19295E = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            m21457y();
                            if (this.f19303M) {
                                mo21470L();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.f19313p.dequeueOutputBuffer(this.f19311n, 0L);
                        this.f19295E = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.f19323z) {
                            this.f19323z = false;
                            this.f19313p.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.f19295E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f19311n;
                            if ((bufferInfo.flags & 4) != 0) {
                                m21457y();
                                this.f19295E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.f19292B[this.f19295E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f19311n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j13 = this.f19311n.presentationTimeUs;
                            int size = this.f19310m.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                    if (((Long) this.f19310m.get(i11)).longValue() == j13) {
                                        this.f19310m.remove(i11);
                                        z11 = true;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    z11 = false;
                                    break;
                                }
                            }
                            this.f19296F = z11;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f19313p.getOutputFormat();
                        if (this.f19317t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f19323z = true;
                        } else {
                            if (this.f19321x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            mo21463E(this.f19313p, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.f19292B = this.f19313p.getOutputBuffers();
                    } else if (this.f19318u && (this.f19302L || this.f19299I == 2)) {
                        m21457y();
                    }
                }
                if (this.f19320w && this.f19301K) {
                    try {
                        MediaCodec mediaCodec = this.f19313p;
                        ByteBuffer[] byteBufferArr = this.f19292B;
                        int i12 = this.f19295E;
                        ByteBuffer byteBuffer2 = byteBufferArr[i12];
                        MediaCodec.BufferInfo bufferInfo3 = this.f19311n;
                        mo21465G = mo21465G(j11, j12, mediaCodec, byteBuffer2, i12, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f19296F);
                    } catch (IllegalStateException unused2) {
                        m21457y();
                        if (this.f19303M) {
                            mo21470L();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.f19313p;
                    ByteBuffer[] byteBufferArr2 = this.f19292B;
                    int i13 = this.f19295E;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i13];
                    MediaCodec.BufferInfo bufferInfo4 = this.f19311n;
                    mo21465G = mo21465G(j11, j12, mediaCodec2, byteBuffer3, i13, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f19296F);
                }
                if (!mo21465G) {
                    break;
                }
                long j14 = this.f19311n.presentationTimeUs;
                this.f19295E = -1;
            }
            do {
            } while (m21458z());
            AbstractC4841oo.m25225b();
        } else {
            m26928w(j11);
            this.f19308k.mo20906b();
            int m26925f2 = m26925f(this.f19309l, this.f19308k, false);
            if (m26925f2 == -5) {
                mo21462D(this.f19309l.f22819a);
            } else if (m26925f2 == -4) {
                AbstractC4361bo.m20613e(this.f19308k.m26971f());
                this.f19302L = true;
                m21457y();
            }
        }
        this.f19305O.m20528a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: s */
    public void mo21478s(long j11, boolean z11) {
        this.f19302L = false;
        this.f19303M = false;
        if (this.f19313p != null) {
            this.f19293C = -9223372036854775807L;
            this.f19294D = -1;
            this.f19295E = -1;
            this.f19304N = true;
            this.f19296F = false;
            this.f19310m.clear();
            this.f19322y = false;
            this.f19323z = false;
            if (!this.f19316s && (!this.f19319v || !this.f19301K)) {
                if (this.f19299I != 0) {
                    mo21470L();
                    m21468J();
                } else {
                    this.f19313p.flush();
                    this.f19300J = false;
                }
            } else {
                mo21470L();
                m21468J();
            }
            if (this.f19297G && this.f19312o != null) {
                this.f19298H = 1;
            }
        }
    }

    /* renamed from: x */
    protected abstract int mo21479x(InterfaceC4505fl interfaceC4505fl, zzasw zzaswVar);

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public boolean zzE() {
        return this.f19303M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4797nh
    public final int zze() {
        return 4;
    }
}
