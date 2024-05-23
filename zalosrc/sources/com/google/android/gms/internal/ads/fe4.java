package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class fe4 implements gd4 {

    /* renamed from: a */
    private final MediaCodec f20099a;

    /* renamed from: b */
    private ByteBuffer[] f20100b;

    /* renamed from: c */
    private ByteBuffer[] f20101c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ fe4(MediaCodec mediaCodec, ee4 ee4Var) {
        this.f20099a = mediaCodec;
        if (g92.f20474a < 21) {
            this.f20100b = mediaCodec.getInputBuffers();
            this.f20101c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: a */
    public final void mo21994a(int i11, long j11) {
        this.f20099a.releaseOutputBuffer(i11, j11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: b */
    public final ByteBuffer mo21995b(int i11) {
        if (g92.f20474a >= 21) {
            return this.f20099a.getOutputBuffer(i11);
        }
        return ((ByteBuffer[]) g92.m22347h(this.f20101c))[i11];
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: c */
    public final void mo21996c(int i11, int i12, int i13, long j11, int i14) {
        this.f20099a.queueInputBuffer(i11, 0, i13, j11, i14);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: d */
    public final void mo21997d(Surface surface) {
        this.f20099a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: e */
    public final void mo21998e(int i11, int i12, hi3 hi3Var, long j11, int i13) {
        this.f20099a.queueSecureInputBuffer(i11, 0, hi3Var.m22905a(), j11, 0);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: f */
    public final void mo21999f(int i11) {
        this.f20099a.setVideoScalingMode(i11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: g */
    public final void mo22000g(int i11, boolean z11) {
        this.f20099a.releaseOutputBuffer(i11, z11);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: h */
    public final int mo22001h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f20099a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (g92.f20474a < 21) {
                    this.f20101c = this.f20099a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.gd4
    /* renamed from: p */
    public final void mo22002p(Bundle bundle) {
        this.f20099a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final int zza() {
        return this.f20099a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final MediaFormat zzc() {
        return this.f20099a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final ByteBuffer zzf(int i11) {
        if (g92.f20474a >= 21) {
            return this.f20099a.getInputBuffer(i11);
        }
        return ((ByteBuffer[]) g92.m22347h(this.f20100b))[i11];
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final void zzi() {
        this.f20099a.flush();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final void zzl() {
        this.f20100b = null;
        this.f20101c = null;
        this.f20099a.release();
    }

    @Override // com.google.android.gms.internal.ads.gd4
    public final boolean zzr() {
        return false;
    }
}
