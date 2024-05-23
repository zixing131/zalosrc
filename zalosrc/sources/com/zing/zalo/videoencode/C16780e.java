package com.zing.zalo.videoencode;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.zing.zalo.videoencode.AbstractC16776a;
import com.zing.zalo.videoencode.exception.VideoEncoderException;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ff0.AbstractC18909f;
import ff0.C18904a;
import ff0.C18905b;
import ff0.C18908e;
import gf0.C19436a;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.videoencode.e */
/* loaded from: classes5.dex */
public class C16780e extends AbstractC16778c {

    /* renamed from: A */
    private boolean f85132A;

    /* renamed from: B */
    private boolean f85133B;

    /* renamed from: C */
    private boolean f85134C;

    /* renamed from: D */
    private boolean f85135D;

    /* renamed from: E */
    private boolean f85136E;

    /* renamed from: F */
    private boolean f85137F;

    /* renamed from: G */
    private boolean f85138G;

    /* renamed from: H */
    private final LinkedList f85139H;

    /* renamed from: I */
    private final LinkedList f85140I;

    /* renamed from: J */
    private final LinkedList f85141J;

    /* renamed from: K */
    private final LinkedList f85142K;

    /* renamed from: L */
    private final LinkedList f85143L;

    /* renamed from: M */
    private final LinkedList f85144M;

    /* renamed from: N */
    private final LinkedList f85145N;

    /* renamed from: O */
    private int f85146O;

    /* renamed from: P */
    private int f85147P;

    /* renamed from: Q */
    private int f85148Q;

    /* renamed from: R */
    private int f85149R;

    /* renamed from: S */
    private int f85150S;

    /* renamed from: T */
    private int f85151T;

    /* renamed from: U */
    private boolean f85152U;

    /* renamed from: V */
    private boolean f85153V;

    /* renamed from: v */
    private HandlerThread f85154v;

    /* renamed from: w */
    private MediaFormat f85155w;

    /* renamed from: x */
    private MediaFormat f85156x;

    /* renamed from: y */
    private MediaFormat f85157y;

    /* renamed from: z */
    private MediaFormat f85158z;

    /* renamed from: com.zing.zalo.videoencode.e$a */
    /* loaded from: classes5.dex */
    public class a extends AbstractC16776a {

        /* renamed from: b */
        long f85159b;

        /* renamed from: c */
        long f85160c;

        a(AbstractC16776a.a aVar) {
            super(aVar);
            this.f85159b = 0L;
            this.f85160c = 0L;
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: b */
        public void mo89543b(MediaCodec mediaCodec, int i11) {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i11);
            if (inputBuffer == null) {
                return;
            }
            while (!C16780e.this.f85132A) {
                int readSampleData = C16780e.this.f85117f.readSampleData(inputBuffer, 0);
                long sampleTime = C16780e.this.f85117f.getSampleTime();
                if (readSampleData >= 0) {
                    mediaCodec.queueInputBuffer(i11, 0, readSampleData, sampleTime, C16780e.this.f85117f.getSampleFlags());
                }
                C16780e.this.f85132A = !r2.f85117f.advance();
                if (C16780e.this.f85132A) {
                    mediaCodec.queueInputBuffer(i11, 0, 0, 0L, 4);
                }
                C16780e.this.f85146O++;
                C16780e.this.m89598b0();
                if (readSampleData >= 0) {
                    return;
                }
            }
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: c */
        public void mo89544c(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
            boolean z11;
            if ((bufferInfo.flags & 2) != 0) {
                mediaCodec.releaseOutputBuffer(i11, false);
                return;
            }
            if (bufferInfo.size != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            mediaCodec.releaseOutputBuffer(i11, z11);
            long j11 = bufferInfo.presentationTimeUs;
            if (z11) {
                try {
                    C16780e.this.f85119h.m99096c();
                    C16780e.this.f85120i.m99102a();
                } catch (Exception unused) {
                }
                if ((bufferInfo.flags & 4) == 0 && j11 < this.f85159b) {
                    C16780e.this.f85119h.m99098e();
                    return;
                }
                this.f85159b += AbstractC16778c.f85111u;
                if (this.f85160c == 0) {
                    this.f85160c = j11;
                }
                C16780e.this.f85120i.m99103b(false);
                C16780e.this.f85119h.m99099f(this.f85160c * 1000);
                C16780e.this.f85119h.m99100g();
                this.f85160c += AbstractC16778c.f85111u;
                C16780e.this.f85119h.m99098e();
            }
            if ((bufferInfo.flags & 4) != 0) {
                C16780e.this.f85133B = true;
                C16780e.this.f85123l.signalEndOfInputStream();
            }
            C16780e.this.f85147P++;
            C16780e.this.m89598b0();
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: d */
        public void mo89545d(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C16780e.this.f85155w = mediaCodec.getOutputFormat();
        }
    }

    /* renamed from: com.zing.zalo.videoencode.e$b */
    /* loaded from: classes5.dex */
    public class b extends AbstractC16776a {
        b(AbstractC16776a.a aVar) {
            super(aVar);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: b */
        public void mo89543b(MediaCodec mediaCodec, int i11) {
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: c */
        public void mo89544c(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
            C16780e.this.m89600d0(i11, bufferInfo);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: d */
        public void mo89545d(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (C16780e.this.f85127p >= 0) {
                AbstractC20110a.m104544m("video encoder changed its output format again?", new Object[0]);
            }
            C16780e.this.f85157y = mediaCodec.getOutputFormat();
            C16780e.this.m89603g0();
        }
    }

    /* renamed from: com.zing.zalo.videoencode.e$c */
    /* loaded from: classes5.dex */
    public class c extends AbstractC16776a {
        c(AbstractC16776a.a aVar) {
            super(aVar);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: b */
        public void mo89543b(MediaCodec mediaCodec, int i11) {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i11);
            if (inputBuffer == null) {
                return;
            }
            while (!C16780e.this.f85135D) {
                int readSampleData = C16780e.this.f85118g.readSampleData(inputBuffer, 0);
                long sampleTime = C16780e.this.f85118g.getSampleTime();
                if (readSampleData >= 0) {
                    mediaCodec.queueInputBuffer(i11, 0, readSampleData, sampleTime, C16780e.this.f85118g.getSampleFlags());
                }
                C16780e.this.f85135D = !r2.f85118g.advance();
                if (C16780e.this.f85135D) {
                    mediaCodec.queueInputBuffer(i11, 0, 0, 0L, 4);
                }
                C16780e.this.f85149R++;
                C16780e.this.m89598b0();
                if (readSampleData >= 0) {
                    return;
                }
            }
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: c */
        public void mo89544c(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
            mediaCodec.getOutputBuffer(i11);
            if ((bufferInfo.flags & 2) != 0) {
                mediaCodec.releaseOutputBuffer(i11, false);
                return;
            }
            C16780e.this.f85139H.add(Integer.valueOf(i11));
            C16780e.this.f85140I.add(bufferInfo);
            C16780e.this.f85150S++;
            C16780e.this.m89598b0();
            C16780e.this.m89604h0();
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: d */
        public void mo89545d(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C16780e.this.f85156x = mediaCodec.getOutputFormat();
        }
    }

    /* renamed from: com.zing.zalo.videoencode.e$d */
    /* loaded from: classes5.dex */
    public class d extends AbstractC16776a {
        d(AbstractC16776a.a aVar) {
            super(aVar);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: b */
        public void mo89543b(MediaCodec mediaCodec, int i11) {
            C16780e.this.f85141J.add(Integer.valueOf(i11));
            C16780e.this.m89604h0();
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: c */
        public void mo89544c(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
            C16780e.this.m89599c0(i11, bufferInfo);
        }

        @Override // com.zing.zalo.videoencode.AbstractC16776a
        /* renamed from: d */
        public void mo89545d(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (C16780e.this.f85128q >= 0) {
                AbstractC20110a.m104544m("audio encoder changed its output format again?", new Object[0]);
            }
            C16780e.this.f85158z = mediaCodec.getOutputFormat();
            C16780e.this.m89603g0();
        }
    }

    /* renamed from: com.zing.zalo.videoencode.e$e */
    /* loaded from: classes5.dex */
    public static class e extends Handler {

        /* renamed from: a */
        MediaCodec f85165a;

        /* renamed from: b */
        boolean f85166b;

        /* renamed from: c */
        MediaCodec.Callback f85167c;

        /* renamed from: d */
        String f85168d;

        /* renamed from: e */
        MediaFormat f85169e;

        /* renamed from: f */
        Surface f85170f;

        /* renamed from: g */
        boolean f85171g;

        /* renamed from: h */
        boolean f85172h;

        e(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        void m89614a(MediaFormat mediaFormat, Surface surface, MediaCodec.Callback callback) {
            this.f85166b = false;
            this.f85169e = mediaFormat;
            this.f85170f = surface;
            this.f85168d = AbstractC16778c.m89555g(mediaFormat);
            this.f85167c = callback;
            this.f85171g = false;
            this.f85172h = false;
            sendEmptyMessage(0);
            synchronized (this) {
                while (!this.f85171g) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.f85172h) {
                    AbstractC20110a.m104538g("Crash when creating encoder/decoder.", new Object[0]);
                    throw new IllegalStateException("Crash when creating encoder/decoder.");
                }
            }
        }

        /* renamed from: b */
        MediaCodec m89615b() {
            MediaCodec mediaCodec;
            if (Build.VERSION.SDK_INT >= 22) {
                mediaCodec = null;
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    try {
                        if (mediaCodecInfo.getCapabilitiesForType(this.f85168d).isFormatSupported(this.f85169e) && AbstractC18909f.m99113a(mediaCodecInfo, true)) {
                            mediaCodec = MediaCodec.createByCodecName(mediaCodecInfo.getName());
                            try {
                                mediaCodec.configure(this.f85169e, this.f85170f, (MediaCrypto) null, 0);
                                return mediaCodec;
                            } catch (IllegalArgumentException | IllegalStateException unused) {
                                mediaCodec.release();
                            }
                        }
                    } catch (IOException | IllegalArgumentException unused2) {
                    }
                }
            } else {
                mediaCodec = null;
            }
            if (mediaCodec == null) {
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.f85168d);
                createDecoderByType.configure(this.f85169e, this.f85170f, (MediaCrypto) null, 0);
                return createDecoderByType;
            }
            return mediaCodec;
        }

        /* renamed from: c */
        MediaCodec m89616c() {
            return this.f85165a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            MediaCodec m89615b;
            try {
                if (this.f85166b) {
                    m89615b = MediaCodec.createEncoderByType(this.f85168d);
                } else {
                    m89615b = m89615b();
                }
                this.f85165a = m89615b;
            } catch (MediaCodec.CodecException e11) {
                e = e11;
                AbstractC20110a.m104538g("createEncoderByType crash", new Object[0]);
                AbstractC20110a.m104538g(Log.getStackTraceString(e), new Object[0]);
                this.f85172h = true;
                this.f85165a.setCallback(this.f85167c);
                synchronized (this) {
                }
            } catch (IOException e12) {
                e = e12;
                AbstractC20110a.m104538g("createEncoderByType crash", new Object[0]);
                AbstractC20110a.m104538g(Log.getStackTraceString(e), new Object[0]);
                this.f85172h = true;
                this.f85165a.setCallback(this.f85167c);
                synchronized (this) {
                }
            }
            try {
                this.f85165a.setCallback(this.f85167c);
            } catch (Exception e13) {
                AbstractC20110a.m104538g("codec.setCallback crash", new Object[0]);
                AbstractC20110a.m104538g(Log.getStackTraceString(e13), new Object[0]);
                this.f85172h = true;
            }
            synchronized (this) {
                this.f85171g = true;
                notifyAll();
            }
        }
    }

    public C16780e(C19436a c19436a) {
        super(c19436a);
        this.f85155w = null;
        this.f85156x = null;
        this.f85157y = null;
        this.f85158z = null;
        this.f85132A = false;
        this.f85133B = false;
        this.f85134C = false;
        this.f85135D = false;
        this.f85136E = false;
        this.f85137F = false;
        this.f85138G = false;
        this.f85139H = new LinkedList();
        this.f85140I = new LinkedList();
        this.f85141J = new LinkedList();
        this.f85142K = new LinkedList();
        this.f85143L = new LinkedList();
        this.f85144M = new LinkedList();
        this.f85145N = new LinkedList();
        this.f85146O = 0;
        this.f85147P = 0;
        this.f85148Q = 0;
        this.f85149R = 0;
        this.f85150S = 0;
        this.f85151T = 0;
    }

    /* renamed from: T */
    private void m89592T() {
        synchronized (this) {
            while (!this.f85138G) {
                try {
                    if (this.f85152U) {
                        if (this.f85134C) {
                        }
                        try {
                            continue;
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (!this.f85153V) {
                        break;
                    }
                    if (this.f85137F) {
                        break;
                    }
                    continue;
                    wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f85152U) {
            if (this.f85147P != this.f85148Q) {
                AbstractC20110a.m104538g("encoded and decoded video frame counts should match videoDecodedFrameCount: " + this.f85147P + ", videoDecodedFrameCount: " + this.f85147P, new Object[0]);
            }
            if (this.f85147P > this.f85146O) {
                AbstractC20110a.m104538g("decoded frame count should be less than extracted frame count videoDecodedFrameCount <= videoExtractedFrameCount", new Object[0]);
            }
        }
        if (this.f85153V && this.f85139H.size() != 0) {
            AbstractC20110a.m104538g("no frame should be pending: ", new Object[0]);
        }
        if (!this.f85138G) {
            return;
        }
        AbstractC20110a.m104538g("Crash!!! Something's wrong.", new Object[0]);
        throw new IllegalStateException("Crash!!! Something's wrong.");
    }

    /* renamed from: U */
    private MediaCodec m89593U(MediaFormat mediaFormat) {
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(AbstractC16778c.m89555g(mediaFormat));
        createDecoderByType.setCallback(new c(new C18908e(this)));
        createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        return createDecoderByType;
    }

    /* renamed from: V */
    private MediaCodec m89594V(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
        MediaCodec createByCodecName = MediaCodec.createByCodecName(mediaCodecInfo.getName());
        createByCodecName.setCallback(new d(new C18908e(this)));
        createByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        createByCodecName.start();
        return createByCodecName;
    }

    /* renamed from: Y */
    private synchronized Exception m89595Y() {
        try {
            MediaExtractor mediaExtractor = this.f85117f;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            e = null;
        } catch (Exception e11) {
            e = e11;
            AbstractC20110a.m104538g("error while releasing videoExtractor", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e), new Object[0]);
        }
        try {
            MediaExtractor mediaExtractor2 = this.f85118g;
            if (mediaExtractor2 != null) {
                mediaExtractor2.release();
            }
        } catch (Exception e12) {
            AbstractC20110a.m104538g("error while releasing audioExtractor", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e12), new Object[0]);
            if (e == null) {
                e = e12;
            }
        }
        try {
            MediaCodec mediaCodec = this.f85121j;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.f85121j.release();
            }
        } catch (Exception e13) {
            AbstractC20110a.m104538g("error while releasing videoDecoder", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e13), new Object[0]);
            if (e == null) {
                e = e13;
            }
        }
        try {
            C18905b c18905b = this.f85120i;
            if (c18905b != null) {
                c18905b.m99105d();
            }
        } catch (Exception e14) {
            AbstractC20110a.m104538g("error while releasing outputSurface", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e14), new Object[0]);
            if (e == null) {
                e = e14;
            }
        }
        try {
            MediaCodec mediaCodec2 = this.f85123l;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
                this.f85123l.release();
            }
        } catch (Exception e15) {
            AbstractC20110a.m104538g("error while releasing videoEncoder", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e15), new Object[0]);
            if (e == null) {
                e = e15;
            }
        }
        try {
            MediaCodec mediaCodec3 = this.f85122k;
            if (mediaCodec3 != null) {
                mediaCodec3.stop();
                this.f85122k.release();
            }
        } catch (Exception e16) {
            AbstractC20110a.m104538g("error while releasing audioDecoder", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e16), new Object[0]);
            if (e == null) {
                e = e16;
            }
        }
        try {
            MediaCodec mediaCodec4 = this.f85124m;
            if (mediaCodec4 != null) {
                mediaCodec4.stop();
                this.f85124m.release();
            }
        } catch (Exception e17) {
            AbstractC20110a.m104538g("error while releasing audioEncoder", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e17), new Object[0]);
            if (e == null) {
                e = e17;
            }
        }
        try {
            MediaMuxer mediaMuxer = this.f85125n;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.f85125n.release();
            }
        } catch (Exception e18) {
            AbstractC20110a.m104538g("error while releasing muxer", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e18), new Object[0]);
            if (e == null) {
                e = e18;
            }
        }
        try {
            C18904a c18904a = this.f85119h;
            if (c18904a != null) {
                c18904a.m99097d();
            }
        } catch (Exception e19) {
            AbstractC20110a.m104538g("error while releasing inputSurface", new Object[0]);
            AbstractC20110a.m104538g(Log.getStackTraceString(e19), new Object[0]);
            if (e == null) {
                e = e19;
            }
        }
        HandlerThread handlerThread = this.f85154v;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f85117f = null;
        this.f85118g = null;
        this.f85120i = null;
        this.f85119h = null;
        this.f85121j = null;
        this.f85122k = null;
        this.f85123l = null;
        this.f85124m = null;
        this.f85125n = null;
        this.f85154v = null;
        return e;
    }

    /* renamed from: Z */
    public synchronized void m89596Z(Exception exc) {
        try {
            if (this.f85152U) {
                this.f85134C = true;
            }
            if (this.f85153V) {
                this.f85137F = true;
            }
            this.f85138G = true;
            m89565k("[VHACE] handleMediaCodecCallbackException");
            m89565k("[VHACE] " + Log.getStackTraceString(exc));
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a0 */
    private boolean m89597a0() {
        if (this.f85126o.m101629w() == 0 && this.f85126o.m101630x() == 1.0f && !this.f85126o.m101632z() && !this.f85126o.m101631y()) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public void m89598b0() {
    }

    /* renamed from: c0 */
    public void m89599c0(int i11, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f85129r) {
            this.f85142K.add(Integer.valueOf(i11));
            this.f85143L.add(bufferInfo);
            return;
        }
        ByteBuffer outputBuffer = this.f85124m.getOutputBuffer(i11);
        if ((bufferInfo.flags & 2) != 0) {
            this.f85124m.releaseOutputBuffer(i11, false);
            return;
        }
        if (bufferInfo.size != 0 && outputBuffer != null) {
            this.f85125n.writeSampleData(this.f85128q, outputBuffer, bufferInfo);
        }
        this.f85124m.releaseOutputBuffer(i11, false);
        this.f85151T++;
        if ((bufferInfo.flags & 4) != 0) {
            synchronized (this) {
                this.f85137F = true;
                notifyAll();
            }
        }
        m89598b0();
    }

    /* renamed from: d0 */
    public void m89600d0(int i11, MediaCodec.BufferInfo bufferInfo) {
        float m101628v;
        if (!this.f85129r) {
            this.f85144M.add(Integer.valueOf(i11));
            this.f85145N.add(bufferInfo);
            return;
        }
        ByteBuffer outputBuffer = this.f85123l.getOutputBuffer(i11);
        if ((bufferInfo.flags & 2) != 0) {
            this.f85123l.releaseOutputBuffer(i11, false);
            return;
        }
        if (bufferInfo.size != 0 && outputBuffer != null) {
            this.f85125n.writeSampleData(this.f85127p, outputBuffer, bufferInfo);
            if (bufferInfo.presentationTimeUs > 0 && (bufferInfo.flags & 4) == 0) {
                if (this.f85126o.m101625s() != 0) {
                    m101628v = this.f85126o.m101625s();
                } else {
                    m101628v = this.f85126o.m101628v();
                }
                this.f85116e = (int) (((float) (bufferInfo.presentationTimeUs * 100)) / (m101628v * 1000000.0f));
            }
            if (this.f85126o.m101610d() != null) {
                this.f85126o.m101610d().mo50435a(this.f85116e);
            }
            int i12 = this.f85116e;
            if (i12 % 10 == 0) {
                m89565k(String.format("[VHACE] progressing: %s", Integer.valueOf(i12)));
            }
        }
        this.f85123l.releaseOutputBuffer(i11, false);
        this.f85148Q++;
        if ((bufferInfo.flags & 4) != 0) {
            synchronized (this) {
                try {
                    this.f85116e = 100;
                    if (this.f85126o.m101610d() != null) {
                        this.f85126o.m101610d().mo50435a(this.f85116e);
                    }
                    m89565k(String.format("[VHACE] progressing: %s", Integer.valueOf(this.f85116e)));
                    this.f85134C = true;
                    notifyAll();
                } finally {
                }
            }
        }
        m89598b0();
    }

    /* renamed from: e0 */
    private void m89601e0() {
        this.f85153V = true;
    }

    /* renamed from: f0 */
    private void m89602f0() {
        this.f85152U = true;
    }

    /* renamed from: g0 */
    public void m89603g0() {
        if (!this.f85129r) {
            if (!this.f85153V || this.f85158z != null) {
                boolean z11 = this.f85152U;
                if (!z11 || this.f85157y != null) {
                    if (z11) {
                        AbstractC20110a.m104535d("muxer: adding video track.", new Object[0]);
                        this.f85127p = this.f85125n.addTrack(this.f85157y);
                    }
                    if (this.f85153V) {
                        AbstractC20110a.m104535d("muxer: adding audio track.", new Object[0]);
                        this.f85128q = this.f85125n.addTrack(this.f85158z);
                    }
                    AbstractC20110a.m104535d("muxer: starting", new Object[0]);
                    this.f85125n.start();
                    this.f85129r = true;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f85145N.poll();
                        if (bufferInfo == null) {
                            break;
                        } else {
                            m89600d0(((Integer) this.f85144M.poll()).intValue(), bufferInfo);
                        }
                    }
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f85143L.poll();
                        if (bufferInfo2 != null) {
                            m89599c0(((Integer) this.f85142K.poll()).intValue(), bufferInfo2);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h0 */
    public void m89604h0() {
        if (this.f85141J.size() != 0 && this.f85139H.size() != 0) {
            int intValue = ((Integer) this.f85139H.poll()).intValue();
            int intValue2 = ((Integer) this.f85141J.poll()).intValue();
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f85140I.poll();
            ByteBuffer inputBuffer = this.f85124m.getInputBuffer(intValue2);
            int i11 = bufferInfo.size;
            long j11 = bufferInfo.presentationTimeUs;
            if (i11 >= 0) {
                ByteBuffer duplicate = this.f85122k.getOutputBuffer(intValue).duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + i11);
                inputBuffer.position(0);
                inputBuffer.put(duplicate);
                this.f85124m.queueInputBuffer(intValue2, 0, i11, j11, bufferInfo.flags);
            }
            this.f85122k.releaseOutputBuffer(intValue, false);
            if ((bufferInfo.flags & 4) != 0) {
                this.f85136E = true;
            }
            m89598b0();
        }
    }

    /* renamed from: W */
    protected MediaCodec m89612W(MediaFormat mediaFormat, Surface surface) {
        HandlerThread handlerThread = new HandlerThread("Z:VideoHardwareDecoder");
        this.f85154v = handlerThread;
        handlerThread.start();
        e eVar = new e(this.f85154v.getLooper());
        eVar.m89614a(mediaFormat, surface, new a(new C18908e(this)));
        MediaCodec m89616c = eVar.m89616c();
        m89616c.start();
        return m89616c;
    }

    /* renamed from: X */
    protected MediaCodec m89613X(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, AtomicReference atomicReference) {
        MediaCodec createByCodecName = MediaCodec.createByCodecName(mediaCodecInfo.getName());
        createByCodecName.setCallback(new b(new C18908e(this)));
        createByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        atomicReference.set(createByCodecName.createInputSurface());
        createByCodecName.start();
        return createByCodecName;
    }

    @Override // com.zing.zalo.videoencode.AbstractC16778c
    /* renamed from: a */
    public int mo89540a() {
        int i11;
        m89570r(this.f85126o.m101622p(), this.f85126o.m101621o());
        m89571s(this.f85126o.m101613g());
        m89569q(this.f85126o.m101620n());
        if (!m89597a0()) {
            m89601e0();
        }
        m89602f0();
        try {
            RunnableC16779d.m89572a(this);
            return 0;
        } catch (Throwable th2) {
            if (th2 instanceof VideoEncoderException) {
                i11 = th2.m89617a();
            } else {
                i11 = -1;
            }
            m89565k(String.format(Locale.US, "[VHACE] Exception: error:%s, msg:%s", Integer.valueOf(i11), th2.getMessage()));
            return i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a8  */
    @Override // com.zing.zalo.videoencode.AbstractC16778c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo89541d() {
        Exception exc;
        int m101612f;
        long currentTimeMillis = System.currentTimeMillis();
        m89565k("[VHACE] Start transcode");
        if (this.f85126o.m101610d() != null) {
            this.f85126o.m101610d().mo50440f(2);
        }
        this.f85155w = null;
        this.f85156x = null;
        this.f85157y = null;
        this.f85158z = null;
        this.f85127p = -1;
        this.f85128q = -1;
        this.f85132A = false;
        this.f85133B = false;
        this.f85134C = false;
        this.f85135D = false;
        this.f85136E = false;
        this.f85137F = false;
        this.f85138G = false;
        this.f85129r = false;
        this.f85146O = 0;
        this.f85147P = 0;
        this.f85148Q = 0;
        this.f85149R = 0;
        this.f85150S = 0;
        this.f85151T = 0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", this.f85126o.m101613g());
        jSONObject.put("dst", this.f85126o.m101620n());
        jSONObject.put("rotation", this.f85126o.m101623q());
        jSONObject.put("oriWidth", this.f85126o.m101619m());
        jSONObject.put("oriHeight", this.f85126o.m101618l());
        jSONObject.put("resWidth", this.f85126o.m101622p());
        jSONObject.put("resHeight", this.f85126o.m101621o());
        jSONObject.put("bitrate", this.f85126o.m101627u());
        jSONObject.put("frameRate", this.f85126o.m101611e());
        jSONObject.put("iframeInterval", this.f85126o.m101612f());
        jSONObject.put("duration", this.f85126o.m101628v());
        jSONObject.put("audioCodec", this.f85126o.m101609c());
        jSONObject.put("videoMode", this.f85126o.m101629w());
        jSONObject.put(ZMediaPlayer.OPTION_PLAYER_KEY_NUMBER_OF_LOOP, this.f85126o.m101616j());
        jSONObject.put("speed", this.f85126o.m101630x());
        jSONObject.put("trimStart", this.f85126o.m101626t());
        jSONObject.put("forceI", this.f85126o.m101632z() ? 1 : 0);
        jSONObject.put("mute", this.f85126o.m101631y());
        m89565k("[VHACE] Transcode config: " + jSONObject);
        MediaCodecInfo m89559p = AbstractC16778c.m89559p("video/avc");
        if (m89559p == null) {
            AbstractC20110a.m104538g("Unable to find an appropriate codec for %s", "video/avc");
            return;
        }
        MediaCodecInfo m89559p2 = AbstractC16778c.m89559p("audio/mp4a-latm");
        try {
            if (m89559p2 == null) {
                AbstractC20110a.m104538g("Unable to find an appropriate codec for %s", "audio/mp4a-latm");
                return;
            }
            try {
                this.f85125n = m89561c();
                if (this.f85152U) {
                    MediaExtractor m89560b = m89560b();
                    this.f85117f = m89560b;
                    int m89563f = m89563f(m89560b);
                    if (m89563f != -1) {
                        AbstractC16778c.f85111u = 1000000 / this.f85126o.m101611e();
                        MediaFormat trackFormat = this.f85117f.getTrackFormat(m89563f);
                        if (trackFormat.containsKey("rotation-degrees")) {
                            trackFormat.setInteger("rotation-degrees", 0);
                        }
                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f85112a, this.f85113b);
                        createVideoFormat.setInteger("color-format", 2130708361);
                        createVideoFormat.setInteger("bitrate", this.f85126o.m101627u());
                        createVideoFormat.setInteger("frame-rate", this.f85126o.m101611e());
                        if (this.f85126o.m101632z()) {
                            m101612f = 0;
                        } else {
                            m101612f = this.f85126o.m101612f();
                        }
                        createVideoFormat.setInteger("i-frame-interval", m101612f);
                        AtomicReference atomicReference = new AtomicReference();
                        this.f85123l = m89613X(m89559p, createVideoFormat, atomicReference);
                        C18904a c18904a = new C18904a((Surface) atomicReference.get());
                        this.f85119h = c18904a;
                        c18904a.m99096c();
                        C18905b c18905b = new C18905b(this.f85126o.m101624r());
                        this.f85120i = c18905b;
                        this.f85121j = m89612W(trackFormat, c18905b.m99104c());
                        this.f85119h.m99098e();
                    } else {
                        AbstractC20110a.m104538g("missing video track in test video", new Object[0]);
                        this.f85152U = false;
                    }
                }
                if (this.f85153V) {
                    MediaExtractor m89560b2 = m89560b();
                    this.f85118g = m89560b2;
                    int m89562e = m89562e(m89560b2);
                    if (m89562e != -1) {
                        MediaFormat trackFormat2 = this.f85118g.getTrackFormat(m89562e);
                        int i11 = AbstractC16778c.f85110t;
                        int i12 = AbstractC16778c.f85109s;
                        if (trackFormat2.containsKey("sample-rate")) {
                            i11 = trackFormat2.getInteger("sample-rate");
                        }
                        if (trackFormat2.containsKey("channel-count")) {
                            i12 = trackFormat2.getInteger("channel-count");
                        }
                        int i13 = 131072;
                        if (131072 > this.f85126o.m101608b()) {
                            i13 = this.f85126o.m101608b();
                        }
                        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i11, i12);
                        createAudioFormat.setInteger("bitrate", i13);
                        createAudioFormat.setInteger("aac-profile", 2);
                        this.f85124m = m89594V(m89559p2, createAudioFormat);
                        this.f85122k = m89593U(trackFormat2);
                    } else {
                        AbstractC20110a.m104538g("missing audio track in test video", new Object[0]);
                        this.f85153V = false;
                    }
                }
                m89592T();
                e = m89595Y();
            } catch (Exception e11) {
                e = e11;
                AbstractC20110a.m104538g("doEncodeVideo crashed!!!", new Object[0]);
                AbstractC20110a.m104538g(Log.getStackTraceString(e), new Object[0]);
                Exception m89595Y = m89595Y();
                if (m89595Y != null) {
                    exc = m89595Y;
                }
            }
            if (e == null) {
                exc = null;
                if (exc != null) {
                    m89565k(String.format(Locale.US, "[VHACE] Encode time: %s (millisecond)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    return;
                }
                throw new VideoEncoderException(-1, exc);
            }
            exc = e;
            if (exc != null) {
            }
        } catch (Throwable th2) {
            m89595Y();
            throw th2;
        }
    }
}
