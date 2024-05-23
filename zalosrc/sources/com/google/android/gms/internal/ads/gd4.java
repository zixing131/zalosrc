package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface gd4 {
    /* renamed from: a */
    void mo21994a(int i11, long j11);

    /* renamed from: b */
    ByteBuffer mo21995b(int i11);

    /* renamed from: c */
    void mo21996c(int i11, int i12, int i13, long j11, int i14);

    /* renamed from: d */
    void mo21997d(Surface surface);

    /* renamed from: e */
    void mo21998e(int i11, int i12, hi3 hi3Var, long j11, int i13);

    /* renamed from: f */
    void mo21999f(int i11);

    /* renamed from: g */
    void mo22000g(int i11, boolean z11);

    /* renamed from: h */
    int mo22001h(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: p */
    void mo22002p(Bundle bundle);

    int zza();

    MediaFormat zzc();

    ByteBuffer zzf(int i11);

    void zzi();

    void zzl();

    boolean zzr();
}
