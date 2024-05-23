package p714zf;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.nio.ByteBuffer;
import th.AbstractC26689j;

/* renamed from: zf.k */
/* loaded from: classes3.dex */
public class C31820k {

    /* renamed from: a */
    private MediaCodec f145996a;

    /* renamed from: b */
    private C31812c f145997b;

    /* renamed from: c */
    private final C31822m f145998c;

    /* renamed from: d */
    private int f145999d;

    /* renamed from: e */
    private long f146000e;

    /* renamed from: g */
    private MediaCodec.BufferInfo f146002g;

    /* renamed from: h */
    private final EGLContext f146003h;

    /* renamed from: j */
    private final InterfaceC31818i f146005j;

    /* renamed from: n */
    private final int f146009n;

    /* renamed from: o */
    private final int f146010o;

    /* renamed from: p */
    private final int f146011p;

    /* renamed from: f */
    private long f146001f = 41666666;

    /* renamed from: i */
    private boolean f146004i = false;

    /* renamed from: k */
    private final float[] f146006k = new float[16];

    /* renamed from: l */
    private final float[] f146007l = new float[16];

    /* renamed from: m */
    private final float[] f146008m = new float[16];

    /* renamed from: zf.k$a */
    /* loaded from: classes3.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (C31820k.this.f146005j != null) {
                    C31820k.this.f146005j.mo1981t();
                }
                C31820k.this.m152873g();
                if (C31820k.this.f146005j != null) {
                    C31820k.this.f146005j.mo1967c();
                }
            } catch (Throwable th2) {
                if (C31820k.this.f146005j != null) {
                    C31820k.this.f146005j.mo1967c();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31820k(InterfaceC31818i interfaceC31818i, EGLContext eGLContext, C31822m c31822m, int i11, int i12, int i13) {
        this.f146003h = eGLContext;
        this.f146005j = interfaceC31818i;
        this.f145998c = c31822m;
        this.f146009n = i11;
        this.f146010o = i12;
        this.f146011p = i13;
        try {
            m152872e(i11, i12, i13);
        } catch (IOException e11) {
            throw new RuntimeException("MediaCodecAVEncoder start recording failed", e11);
        }
    }

    /* renamed from: c */
    private void m152870c(boolean z11) {
        AbstractC20110a.m104535d("drainEncoder(" + z11 + ")", new Object[0]);
        if (z11) {
            AbstractC20110a.m104535d("sending EOS to encoder", new Object[0]);
            this.f145996a.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f145996a.getOutputBuffers();
        while (true) {
            int dequeueOutputBuffer = this.f145996a.dequeueOutputBuffer(this.f146002g, 2000L);
            if (dequeueOutputBuffer == -1) {
                if (z11) {
                    AbstractC20110a.m104535d("no output available, spinning to await EOS", new Object[0]);
                } else {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = this.f145996a.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                if (!this.f145998c.f146016c) {
                    MediaFormat outputFormat = this.f145996a.getOutputFormat();
                    AbstractC20110a.m104535d("encoder output format changed: %s", outputFormat);
                    this.f145999d = this.f145998c.m152889e(outputFormat);
                    AbstractC20110a.m104535d("runEncoder: start", new Object[0]);
                } else {
                    throw new RuntimeException("format changed twice");
                }
            } else if (dequeueOutputBuffer < 0) {
                AbstractC20110a.m104545n("unexpected result from encoder.dequeueOutputBuffer: %s", Integer.valueOf(dequeueOutputBuffer));
            } else {
                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.f146002g;
                    if (bufferInfo.size != 0 && this.f145998c.f146016c) {
                        byteBuffer.position(bufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.f146002g;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        this.f145998c.m152891o(this.f145999d, byteBuffer, this.f146002g);
                        AbstractC20110a.m104535d("sent " + this.f146002g.size + " bytes to muxer", new Object[0]);
                    }
                    this.f145996a.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.f146002g.flags & 4) != 0) {
                        if (!z11) {
                            AbstractC20110a.m104545n("reached end of stream unexpectedly", new Object[0]);
                            return;
                        } else {
                            AbstractC20110a.m104535d("end of stream reached", new Object[0]);
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                }
            }
        }
    }

    /* renamed from: d */
    private void m152871d(int i11, int i12) {
        Matrix.orthoM(this.f146006k, 0, 0.0f, i11, 0.0f, i12, 0.0f, 100.0f);
        Matrix.setLookAtM(this.f146007l, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f146008m, 0, this.f146006k, 0, this.f146007l, 0);
    }

    /* renamed from: e */
    private void m152872e(int i11, int i12, int i13) {
        AbstractC20110a.m104535d("video/avc output " + i11 + "x" + i12 + " @" + i13, new Object[0]);
        this.f146002g = new MediaCodec.BufferInfo();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i11, i12);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i13);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", AbstractC26689j.f126437c);
        AbstractC20110a.m104535d("format: %s", createVideoFormat);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f145996a = createEncoderByType;
        createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f145997b = new C31812c(this.f145996a.createInputSurface(), this.f146003h);
        this.f145999d = -1;
        this.f146001f = 33333333L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m152873g() {
        try {
            try {
                this.f145997b.m152846c();
                m152871d(this.f146009n, this.f146010o);
                long currentTimeMillis = System.currentTimeMillis();
                loop0: while (true) {
                    int i11 = 0;
                    while (this.f146004i) {
                        m152870c(false);
                        if (!this.f146004i) {
                            break loop0;
                        }
                        long nanoTime = System.nanoTime() - this.f146000e;
                        long j11 = this.f146001f;
                        if (nanoTime < j11) {
                            try {
                                Thread.sleep((j11 - nanoTime) / 1000000);
                            } catch (Exception unused) {
                            }
                        }
                        this.f146000e = System.nanoTime();
                        GLES20.glViewport(0, 0, this.f146009n, this.f146010o);
                        InterfaceC31818i interfaceC31818i = this.f146005j;
                        if (interfaceC31818i != null) {
                            if (!interfaceC31818i.mo1971h()) {
                                Thread.sleep(20L);
                            }
                        } else {
                            AbstractC20110a.m104538g("mRecordingDrawer is null, video will record black!!", new Object[0]);
                        }
                        this.f145997b.m152848e(System.nanoTime());
                        AbstractC20110a.m104535d("sending frame to encoder", new Object[0]);
                        this.f145997b.m152849f();
                        i11++;
                        if (System.currentTimeMillis() - currentTimeMillis > 1000) {
                            break;
                        }
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    AbstractC20110a.m104535d("Video Encoder: FPS %s", Long.valueOf((i11 * 1000) / (currentTimeMillis2 - currentTimeMillis)));
                    currentTimeMillis = currentTimeMillis2;
                }
                m152870c(true);
                AbstractC20110a.m104535d("runEncoder: stop", new Object[0]);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            m152874f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m152874f() {
        AbstractC20110a.m104535d("releasing encoder objects", new Object[0]);
        MediaCodec mediaCodec = this.f145996a;
        if (mediaCodec != null) {
            try {
                try {
                    mediaCodec.stop();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                try {
                    this.f145997b.m152847d();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                this.f145996a.release();
                this.f145996a = null;
            }
        }
        C31822m c31822m = this.f145998c;
        if (c31822m != null) {
            c31822m.m152890m();
        }
    }

    /* renamed from: h */
    public void m152875h() {
        if (this.f146004i) {
            return;
        }
        this.f145996a.start();
        this.f146004i = true;
        new a("Z:VideoEncoder").start();
    }

    /* renamed from: i */
    public void m152876i() {
        this.f146004i = false;
    }
}
