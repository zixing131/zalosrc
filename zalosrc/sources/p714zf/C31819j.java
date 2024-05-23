package p714zf;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;
import mm0.AbstractC23350e;

/* renamed from: zf.j */
/* loaded from: classes3.dex */
public class C31819j {

    /* renamed from: j */
    private static final String f145985j = "j";

    /* renamed from: a */
    private MediaFormat f145986a;

    /* renamed from: b */
    private MediaCodec f145987b;

    /* renamed from: c */
    private int f145988c;

    /* renamed from: d */
    private final C31822m f145989d;

    /* renamed from: e */
    private MediaCodec.BufferInfo f145990e;

    /* renamed from: f */
    private final InterfaceC31810a f145991f;

    /* renamed from: g */
    private boolean f145992g = false;

    /* renamed from: h */
    private int f145993h = 0;

    /* renamed from: i */
    private long f145994i = 0;

    /* renamed from: zf.j$a */
    /* loaded from: classes3.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C31819j.this.m152863e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31819j(InterfaceC31810a interfaceC31810a, C31822m c31822m) {
        this.f145991f = interfaceC31810a;
        this.f145989d = c31822m;
        try {
            m152862c();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m152861b(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, boolean z11) {
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 1000L);
            if (dequeueOutputBuffer == -1) {
                if (z11) {
                    int i11 = this.f145993h + 1;
                    this.f145993h = i11;
                    if (i11 > 10) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                if (!this.f145989d.f146016c) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    this.f145988c = this.f145989d.m152888d(outputFormat);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("encoder output format changed: ");
                    sb2.append(outputFormat);
                    sb2.append(". Added track index: ");
                    sb2.append(this.f145988c);
                } else {
                    throw new RuntimeException("format changed after muxer start");
                }
            } else if (dequeueOutputBuffer < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unexpected result from encoder.dequeueOutputBuffer: ");
                sb3.append(dequeueOutputBuffer);
            } else {
                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer != null) {
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0 && this.f145989d.f146016c) {
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        this.f145989d.m152891o(this.f145988c, byteBuffer, bufferInfo);
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        return;
                    }
                } else {
                    throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                }
            }
        }
    }

    /* renamed from: c */
    private void m152862c() {
        this.f145990e = new MediaCodec.BufferInfo();
        MediaFormat mediaFormat = new MediaFormat();
        this.f145986a = mediaFormat;
        mediaFormat.setString("mime", "audio/mp4a-latm");
        this.f145986a.setInteger("aac-profile", 2);
        this.f145986a.setInteger("sample-rate", 44100);
        this.f145986a.setInteger("channel-count", 1);
        this.f145986a.setInteger("bitrate", 32000);
        this.f145986a.setInteger("max-input-size", 600000);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(m152864f("audio/mp4a-latm"));
        this.f145987b = createEncoderByType;
        createEncoderByType.configure(this.f145986a, (Surface) null, (MediaCrypto) null, 1);
        this.f145988c = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m152863e() {
        long j11;
        int i11;
        try {
            try {
                this.f145991f.start();
                boolean z11 = false;
                while (true) {
                    boolean z12 = this.f145992g;
                    boolean z13 = true;
                    if (!z12 || z11) {
                        break;
                    }
                    if (!z12) {
                        z11 = true;
                    }
                    m152861b(this.f145987b, this.f145990e, false);
                    try {
                        ByteBuffer[] inputBuffers = this.f145987b.getInputBuffers();
                        int dequeueInputBuffer = this.f145987b.dequeueInputBuffer(-1L);
                        if (dequeueInputBuffer >= 0) {
                            ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                            byteBuffer.clear();
                            int mo152839a = this.f145991f.mo152839a(byteBuffer, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                            if (mo152839a < 0) {
                                AbstractC23350e.m122774d(f145985j, "runEncoder: unexpected error while read data " + mo152839a);
                            } else {
                                z13 = z11;
                            }
                            try {
                                long nanoTime = System.nanoTime() / 1000;
                                long j12 = this.f145994i;
                                if (nanoTime <= j12) {
                                    j11 = j12 + 9643;
                                } else {
                                    j11 = nanoTime;
                                }
                                this.f145994i = j11;
                                MediaCodec mediaCodec = this.f145987b;
                                if (z13) {
                                    i11 = 4;
                                } else {
                                    i11 = 0;
                                }
                                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, mo152839a, j11, i11);
                                z11 = z13;
                            } catch (Throwable th2) {
                                th = th2;
                                z11 = z13;
                                th.printStackTrace();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                this.f145991f.stop();
                m152861b(this.f145987b, this.f145990e, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            m152865d();
        } catch (Throwable th4) {
            m152865d();
            throw th4;
        }
    }

    /* renamed from: f */
    private String m152864f(String str) {
        String str2 = null;
        for (int i11 = 0; i11 < MediaCodecList.getCodecCount(); i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str3 : codecInfoAt.getSupportedTypes()) {
                    if (str3.equalsIgnoreCase(str)) {
                        return str3;
                    }
                    if (str2 == null) {
                        str2 = str3;
                    }
                }
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m152865d() {
        MediaCodec mediaCodec = this.f145987b;
        if (mediaCodec != null) {
            try {
                try {
                    mediaCodec.stop();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                this.f145987b.release();
                this.f145987b = null;
            }
        }
        C31822m c31822m = this.f145989d;
        if (c31822m != null) {
            c31822m.m152890m();
        }
    }

    /* renamed from: g */
    public void m152866g() {
        if (this.f145992g) {
            return;
        }
        this.f145987b.start();
        this.f145992g = true;
        new a("Z:AudioEncoder").start();
    }

    /* renamed from: h */
    public void m152867h() {
        this.f145992g = false;
    }
}
