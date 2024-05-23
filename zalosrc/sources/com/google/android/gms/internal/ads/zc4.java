package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zc4 extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f31455b;

    /* renamed from: c */
    private Handler f31456c;

    /* renamed from: h */
    private MediaFormat f31461h;

    /* renamed from: i */
    private MediaFormat f31462i;

    /* renamed from: j */
    private MediaCodec.CodecException f31463j;

    /* renamed from: k */
    private long f31464k;

    /* renamed from: l */
    private boolean f31465l;

    /* renamed from: m */
    private IllegalStateException f31466m;

    /* renamed from: a */
    private final Object f31454a = new Object();

    /* renamed from: d */
    private final dd4 f31457d = new dd4();

    /* renamed from: e */
    private final dd4 f31458e = new dd4();

    /* renamed from: f */
    private final ArrayDeque f31459f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f31460g = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zc4(HandlerThread handlerThread) {
        this.f31455b = handlerThread;
    }

    /* renamed from: d */
    public static /* synthetic */ void m28472d(zc4 zc4Var) {
        synchronized (zc4Var.f31454a) {
            try {
                if (zc4Var.f31465l) {
                    return;
                }
                long j11 = zc4Var.f31464k - 1;
                zc4Var.f31464k = j11;
                if (j11 > 0) {
                    return;
                }
                if (j11 < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (zc4Var.f31454a) {
                        zc4Var.f31466m = illegalStateException;
                    }
                    return;
                }
                zc4Var.m28474i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    private final void m28473h(MediaFormat mediaFormat) {
        this.f31458e.m21349b(-2);
        this.f31460g.add(mediaFormat);
    }

    /* renamed from: i */
    private final void m28474i() {
        if (!this.f31460g.isEmpty()) {
            this.f31462i = (MediaFormat) this.f31460g.getLast();
        }
        this.f31457d.m21350c();
        this.f31458e.m21350c();
        this.f31459f.clear();
        this.f31460g.clear();
        this.f31463j = null;
    }

    /* renamed from: j */
    private final void m28475j() {
        IllegalStateException illegalStateException = this.f31466m;
        if (illegalStateException == null) {
            return;
        }
        this.f31466m = null;
        throw illegalStateException;
    }

    /* renamed from: k */
    private final void m28476k() {
        MediaCodec.CodecException codecException = this.f31463j;
        if (codecException == null) {
            return;
        }
        this.f31463j = null;
        throw codecException;
    }

    /* renamed from: l */
    private final boolean m28477l() {
        return this.f31464k > 0 || this.f31465l;
    }

    /* renamed from: a */
    public final int m28478a() {
        synchronized (this.f31454a) {
            try {
                int i11 = -1;
                if (m28477l()) {
                    return -1;
                }
                m28475j();
                m28476k();
                if (!this.f31457d.m21351d()) {
                    i11 = this.f31457d.m21348a();
                }
                return i11;
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final int m28479b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f31454a) {
            try {
                if (m28477l()) {
                    return -1;
                }
                m28475j();
                m28476k();
                if (this.f31458e.m21351d()) {
                    return -1;
                }
                int m21348a = this.f31458e.m21348a();
                if (m21348a >= 0) {
                    v71.m27171b(this.f31461h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f31459f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (m21348a == -2) {
                    this.f31461h = (MediaFormat) this.f31460g.remove();
                    m21348a = -2;
                }
                return m21348a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final MediaFormat m28480c() {
        MediaFormat mediaFormat;
        synchronized (this.f31454a) {
            try {
                mediaFormat = this.f31461h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final void m28481e() {
        synchronized (this.f31454a) {
            this.f31464k++;
            Handler handler = this.f31456c;
            int i11 = g92.f20474a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xc4
                @Override // java.lang.Runnable
                public final void run() {
                    zc4.m28472d(zc4.this);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m28482f(MediaCodec mediaCodec) {
        boolean z11;
        if (this.f31456c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f31455b.start();
        Handler handler = new Handler(this.f31455b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f31456c = handler;
    }

    /* renamed from: g */
    public final void m28483g() {
        synchronized (this.f31454a) {
            this.f31465l = true;
            this.f31455b.quit();
            m28474i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f31454a) {
            this.f31463j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        synchronized (this.f31454a) {
            this.f31457d.m21349b(i11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f31454a) {
            try {
                MediaFormat mediaFormat = this.f31462i;
                if (mediaFormat != null) {
                    m28473h(mediaFormat);
                    this.f31462i = null;
                }
                this.f31458e.m21349b(i11);
                this.f31459f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f31454a) {
            m28473h(mediaFormat);
            this.f31462i = null;
        }
    }
}
