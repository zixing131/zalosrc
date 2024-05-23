package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class qc4 implements gd4 {

    /* renamed from: a */
    private final MediaCodec f26718a;

    /* renamed from: b */
    private final zc4 f26719b;

    /* renamed from: c */
    private final wc4 f26720c;

    /* renamed from: d */
    private boolean f26721d;

    /* renamed from: e */
    private int f26722e = 0;

    public /* synthetic */ qc4(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z11, pc4 pc4Var) {
        this.f26718a = mediaCodec;
        this.f26719b = new zc4(handlerThread);
        this.f26720c = new wc4(mediaCodec, handlerThread2);
    }

    /* renamed from: i */
    public static /* synthetic */ String m25689i(int i11) {
        return m25692l(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: j */
    public static /* synthetic */ String m25690j(int i11) {
        return m25692l(i11, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: k */
    public static /* synthetic */ void m25691k(qc4 qc4Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        qc4Var.f26719b.m28482f(qc4Var.f26718a);
        int i12 = g92.f20474a;
        Trace.beginSection("configureCodec");
        qc4Var.f26718a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        qc4Var.f26720c.m27599f();
        Trace.beginSection("startCodec");
        qc4Var.f26718a.start();
        Trace.endSection();
        qc4Var.f26722e = 1;
    }

    /* renamed from: l */
    public static String m25692l(int i11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 1) {
            sb2.append("Audio");
        } else if (i11 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i11);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: a */
    public final void mo21994a(int i11, long j11) {
        this.f26718a.releaseOutputBuffer(i11, j11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: b */
    public final ByteBuffer mo21995b(int i11) {
        return this.f26718a.getOutputBuffer(i11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: c */
    public final void mo21996c(int i11, int i12, int i13, long j11, int i14) {
        this.f26720c.m27596c(i11, 0, i13, j11, i14);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: d */
    public final void mo21997d(Surface surface) {
        this.f26718a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: e */
    public final void mo21998e(int i11, int i12, hi3 hi3Var, long j11, int i13) {
        this.f26720c.m27597d(i11, 0, hi3Var, j11, 0);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: f */
    public final void mo21999f(int i11) {
        this.f26718a.setVideoScalingMode(i11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: g */
    public final void mo22000g(int i11, boolean z11) {
        this.f26718a.releaseOutputBuffer(i11, z11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: h */
    public final int mo22001h(MediaCodec.BufferInfo bufferInfo) {
        return this.f26719b.m28479b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: p */
    public final void mo22002p(Bundle bundle) {
        this.f26718a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final int zza() {
        return this.f26719b.m28478a();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final MediaFormat zzc() {
        return this.f26719b.m28480c();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final ByteBuffer zzf(int i11) {
        return this.f26718a.getInputBuffer(i11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final void zzi() {
        this.f26720c.m27595b();
        this.f26718a.flush();
        this.f26719b.m28481e();
        this.f26718a.start();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final void zzl() {
        try {
            if (this.f26722e == 1) {
                this.f26720c.m27598e();
                this.f26719b.m28483g();
            }
            this.f26722e = 2;
            if (!this.f26721d) {
                this.f26718a.release();
                this.f26721d = true;
            }
        } catch (Throwable th2) {
            if (!this.f26721d) {
                this.f26718a.release();
                this.f26721d = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final boolean zzr() {
        return false;
    }
}
