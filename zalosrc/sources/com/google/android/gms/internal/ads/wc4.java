package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wc4 {

    /* renamed from: g */
    private static final ArrayDeque f29882g = new ArrayDeque();

    /* renamed from: h */
    private static final Object f29883h = new Object();

    /* renamed from: a */
    private final MediaCodec f29884a;

    /* renamed from: b */
    private final HandlerThread f29885b;

    /* renamed from: c */
    private Handler f29886c;

    /* renamed from: d */
    private final AtomicReference f29887d;

    /* renamed from: e */
    private final ya1 f29888e;

    /* renamed from: f */
    private boolean f29889f;

    public wc4(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ya1 ya1Var = new ya1(w81.f29846a);
        this.f29884a = mediaCodec;
        this.f29885b = handlerThread;
        this.f29888e = ya1Var;
        this.f29887d = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void m27590a(wc4 wc4Var, Message message) {
        uc4 uc4Var;
        int i11 = message.what;
        uc4 uc4Var2 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    rc4.m26067a(wc4Var.f29887d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    wc4Var.f29888e.m28167e();
                }
                if (uc4Var2 == null) {
                    ArrayDeque arrayDeque = f29882g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(uc4Var2);
                    }
                    return;
                }
                return;
            }
            uc4Var = (uc4) message.obj;
            int i12 = uc4Var.f28826a;
            MediaCodec.CryptoInfo cryptoInfo = uc4Var.f28829d;
            long j11 = uc4Var.f28830e;
            int i13 = uc4Var.f28831f;
            try {
                synchronized (f29883h) {
                    wc4Var.f29884a.queueSecureInputBuffer(i12, 0, cryptoInfo, j11, i13);
                }
            } catch (RuntimeException e11) {
                rc4.m26067a(wc4Var.f29887d, null, e11);
            }
        } else {
            uc4Var = (uc4) message.obj;
            try {
                wc4Var.f29884a.queueInputBuffer(uc4Var.f28826a, 0, uc4Var.f28828c, uc4Var.f28830e, uc4Var.f28831f);
            } catch (RuntimeException e12) {
                rc4.m26067a(wc4Var.f29887d, null, e12);
            }
        }
        uc4Var2 = uc4Var;
        if (uc4Var2 == null) {
        }
    }

    /* renamed from: g */
    private static uc4 m27591g() {
        ArrayDeque arrayDeque = f29882g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new uc4();
                }
                return (uc4) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    private final void m27592h() {
        RuntimeException runtimeException = (RuntimeException) this.f29887d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    /* renamed from: i */
    private static byte[] m27593i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: j */
    private static int[] m27594j(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: b */
    public final void m27595b() {
        if (this.f29889f) {
            try {
                Handler handler = this.f29886c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.f29888e.m28165c();
                Handler handler2 = this.f29886c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f29888e.m28163a();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    /* renamed from: c */
    public final void m27596c(int i11, int i12, int i13, long j11, int i14) {
        m27592h();
        uc4 m27591g = m27591g();
        m27591g.m26913a(i11, 0, i13, j11, i14);
        Handler handler = this.f29886c;
        int i15 = g92.f20474a;
        handler.obtainMessage(0, m27591g).sendToTarget();
    }

    /* renamed from: d */
    public final void m27597d(int i11, int i12, hi3 hi3Var, long j11, int i13) {
        m27592h();
        uc4 m27591g = m27591g();
        m27591g.m26913a(i11, 0, 0, j11, 0);
        MediaCodec.CryptoInfo cryptoInfo = m27591g.f28829d;
        cryptoInfo.numSubSamples = hi3Var.f21773f;
        cryptoInfo.numBytesOfClearData = m27594j(hi3Var.f21771d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m27594j(hi3Var.f21772e, cryptoInfo.numBytesOfEncryptedData);
        byte[] m27593i = m27593i(hi3Var.f21769b, cryptoInfo.key);
        m27593i.getClass();
        cryptoInfo.key = m27593i;
        byte[] m27593i2 = m27593i(hi3Var.f21768a, cryptoInfo.iv);
        m27593i2.getClass();
        cryptoInfo.iv = m27593i2;
        cryptoInfo.mode = hi3Var.f21770c;
        if (g92.f20474a >= 24) {
            vc4.m27208a();
            cryptoInfo.setPattern(AbstractC5207yi.m28218a(hi3Var.f21774g, hi3Var.f21775h));
        }
        this.f29886c.obtainMessage(1, m27591g).sendToTarget();
    }

    /* renamed from: e */
    public final void m27598e() {
        if (this.f29889f) {
            m27595b();
            this.f29885b.quit();
        }
        this.f29889f = false;
    }

    /* renamed from: f */
    public final void m27599f() {
        if (!this.f29889f) {
            this.f29885b.start();
            this.f29886c = new tc4(this, this.f29885b.getLooper());
            this.f29889f = true;
        }
    }
}
