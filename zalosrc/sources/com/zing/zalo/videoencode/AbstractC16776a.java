package com.zing.zalo.videoencode;

import android.media.MediaCodec;
import android.media.MediaFormat;

/* renamed from: com.zing.zalo.videoencode.a */
/* loaded from: classes5.dex */
public abstract class AbstractC16776a extends MediaCodec.Callback {

    /* renamed from: a */
    private final a f85106a;

    /* renamed from: com.zing.zalo.videoencode.a$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo89546a(Exception exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC16776a(a aVar) {
        this.f85106a = aVar;
    }

    /* renamed from: a */
    private void m89542a(Exception exc) {
        if ((exc instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) exc).isTransient()) {
            return;
        }
        this.f85106a.mo89546a(exc);
    }

    /* renamed from: b */
    public abstract void mo89543b(MediaCodec mediaCodec, int i11);

    /* renamed from: c */
    public abstract void mo89544c(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo);

    /* renamed from: d */
    public abstract void mo89545d(MediaCodec mediaCodec, MediaFormat mediaFormat);

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        m89542a(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        try {
            mo89543b(mediaCodec, i11);
        } catch (Exception e11) {
            m89542a(e11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        try {
            mo89544c(mediaCodec, i11, bufferInfo);
        } catch (Exception e11) {
            m89542a(e11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        try {
            mo89545d(mediaCodec, mediaFormat);
        } catch (Exception e11) {
            m89542a(e11);
        }
    }
}
