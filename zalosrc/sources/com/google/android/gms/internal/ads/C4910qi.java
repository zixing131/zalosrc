package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.qi */
/* loaded from: classes2.dex */
public final class C4910qi extends AbstractC4431dl implements InterfaceC4508fo {

    /* renamed from: Q */
    private final C4391ci f26784Q;

    /* renamed from: R */
    private final C4761mi f26785R;

    /* renamed from: S */
    private boolean f26786S;

    /* renamed from: T */
    private int f26787T;

    /* renamed from: U */
    private int f26788U;

    /* renamed from: V */
    private long f26789V;

    /* renamed from: W */
    private boolean f26790W;

    public C4910qi(InterfaceC4505fl interfaceC4505fl, InterfaceC4503fj interfaceC4503fj, boolean z11, Handler handler, InterfaceC4428di interfaceC4428di) {
        super(1, interfaceC4505fl, null, true);
        this.f26785R = new C4761mi(null, new InterfaceC5094vh[0], new C4873pi(this, null));
        this.f26784Q = new C4391ci(handler, interfaceC4428di);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: A */
    public final C4394cl mo21459A(InterfaceC4505fl interfaceC4505fl, zzasw zzaswVar, boolean z11) {
        return super.mo21459A(interfaceC4505fl, zzaswVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:            if (r3.startsWith("heroqlte") == false) goto L33;     */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void mo21460B(C4394cl c4394cl, MediaCodec mediaCodec, zzasw zzaswVar, MediaCrypto mediaCrypto) {
        boolean z11;
        String str = c4394cl.f18469a;
        if (AbstractC4916qo.f26898a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC4916qo.f26900c)) {
            String str2 = AbstractC4916qo.f26899b;
            z11 = true;
            if (!str2.startsWith("zeroflte")) {
                if (!str2.startsWith("herolte")) {
                }
            }
            this.f26786S = z11;
            mediaCodec.configure(zzaswVar.m28687b(), (Surface) null, (MediaCrypto) null, 0);
        }
        z11 = false;
        this.f26786S = z11;
        mediaCodec.configure(zzaswVar.m28687b(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: C */
    protected final void mo21461C(String str, long j11, long j12) {
        this.f26784Q.m20896d(str, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: D */
    public final void mo21462D(zzasw zzaswVar) {
        int i11;
        super.mo21462D(zzaswVar);
        this.f26784Q.m20899g(zzaswVar);
        if ("audio/raw".equals(zzaswVar.f31836u)) {
            i11 = zzaswVar.f31823I;
        } else {
            i11 = 2;
        }
        this.f26787T = i11;
        this.f26788U = zzaswVar.f31821G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: E */
    protected final void mo21463E(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i11;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f26786S && integer == 6) {
            int i12 = this.f26788U;
            if (i12 < 6) {
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < this.f26788U; i13++) {
                    iArr2[i13] = i13;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i11 = 6;
        } else {
            i11 = integer;
            iArr = null;
        }
        try {
            this.f26785R.m24593e("audio/raw", i11, integer2, this.f26787T, 0, iArr);
        } catch (zzaty e11) {
            throw zzasi.m28676a(e11, m26924e());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: F */
    protected final void mo21464F() {
        try {
            this.f26785R.m24597i();
        } catch (zzaud e11) {
            throw zzasi.m28676a(e11, m26924e());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: G */
    protected final boolean mo21465G(long j11, long j12, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i11, int i12, long j13, boolean z11) {
        if (z11) {
            mediaCodec.releaseOutputBuffer(i11, false);
            this.f19305O.f17766e++;
            this.f26785R.m24594f();
            return true;
        }
        try {
            if (!this.f26785R.m24601m(byteBuffer, j13)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i11, false);
            this.f19305O.f17765d++;
            return true;
        } catch (zzatz | zzaud e11) {
            throw zzasi.m28676a(e11, m26924e());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: b */
    public final boolean mo21474b() {
        if (!this.f26785R.m24602n() && !super.mo21474b()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5168xg
    /* renamed from: c */
    public final void mo25714c(int i11, Object obj) {
        if (i11 != 2) {
            return;
        }
        this.f26785R.m24600l(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4508fo
    /* renamed from: h */
    public final C4722lh mo22103h() {
        return this.f26785R.m24591c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: i */
    public final void mo21475i() {
        try {
            this.f26785R.m24598j();
            try {
                super.mo21475i();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.mo21475i();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: j */
    public final void mo21476j(boolean z11) {
        super.mo21476j(z11);
        this.f26784Q.m20898f(this.f19305O);
        int i11 = m26926g().f25636a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4508fo
    /* renamed from: m */
    public final long mo22104m() {
        long m24590a = this.f26785R.m24590a(zzE());
        if (m24590a != Long.MIN_VALUE) {
            if (!this.f26790W) {
                m24590a = Math.max(this.f26789V, m24590a);
            }
            this.f26789V = m24590a;
            this.f26790W = false;
        }
        return this.f26789V;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4508fo
    /* renamed from: q */
    public final C4722lh mo22105q(C4722lh c4722lh) {
        return this.f26785R.m24592d(c4722lh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: s */
    public final void mo21478s(long j11, boolean z11) {
        super.mo21478s(j11, z11);
        this.f26785R.m24599k();
        this.f26789V = j11;
        this.f26790W = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: t */
    protected final void mo25715t() {
        this.f26785R.m24596h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5056ug
    /* renamed from: u */
    protected final void mo25716u() {
        this.f26785R.m24595g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl
    /* renamed from: x */
    protected final int mo21479x(InterfaceC4505fl interfaceC4505fl, zzasw zzaswVar) {
        int i11;
        int i12;
        int i13;
        String str = zzaswVar.f31836u;
        if (!AbstractC4545go.m22493a(str)) {
            return 0;
        }
        int i14 = AbstractC4916qo.f26898a;
        if (i14 >= 21) {
            i11 = 16;
        } else {
            i11 = 0;
        }
        C4394cl m24941c = AbstractC4801nl.m24941c(str, false);
        if (m24941c == null) {
            return 1;
        }
        int i15 = 3;
        if (i14 >= 21 && (((i12 = zzaswVar.f31822H) != -1 && !m24941c.m20929d(i12)) || ((i13 = zzaswVar.f31821G) != -1 && !m24941c.m20928c(i13)))) {
            i15 = 2;
        }
        return i11 | 4 | i15;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4431dl, com.google.android.gms.internal.ads.InterfaceC4760mh
    public final boolean zzE() {
        if (super.zzE() && this.f26785R.m24603o()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5056ug, com.google.android.gms.internal.ads.InterfaceC4760mh
    public final InterfaceC4508fo zzi() {
        return this;
    }
}
