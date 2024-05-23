package p714zf;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.zing.zalo.zvideoutil.ZFFmpegMuxer;
import java.io.File;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import me0.AbstractC23237v1;
import p714zf.AbstractC31817h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zf.m */
/* loaded from: classes3.dex */
public class C31822m {

    /* renamed from: a */
    private MediaMuxer f146014a;

    /* renamed from: g */
    private final String f146020g;

    /* renamed from: h */
    private final String f146021h;

    /* renamed from: i */
    private final File f146022i;

    /* renamed from: j */
    AbstractC31817h.b f146023j;

    /* renamed from: p */
    private int f146029p;

    /* renamed from: q */
    private int f146030q;

    /* renamed from: r */
    private byte[] f146031r;

    /* renamed from: s */
    private ByteBuffer f146032s;

    /* renamed from: u */
    private ByteBuffer f146034u;

    /* renamed from: v */
    private long[] f146035v;

    /* renamed from: w */
    private long[] f146036w;

    /* renamed from: b */
    private ZFFmpegMuxer f146015b = null;

    /* renamed from: c */
    boolean f146016c = false;

    /* renamed from: e */
    private int f146018e = 0;

    /* renamed from: f */
    private int f146019f = 0;

    /* renamed from: k */
    int f146024k = 2;

    /* renamed from: l */
    private final Object f146025l = new Object();

    /* renamed from: m */
    private boolean f146026m = false;

    /* renamed from: n */
    private int f146027n = -1;

    /* renamed from: o */
    private int f146028o = -1;

    /* renamed from: t */
    private int f146033t = 0;

    /* renamed from: x */
    private boolean f146037x = false;

    /* renamed from: d */
    private final boolean f146017d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31822m(String str, double d11, double d12) {
        this.f146020g = str;
        MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
        this.f146014a = mediaMuxer;
        try {
            mediaMuxer.setLocation((float) d12, (float) d11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String m152882h = m152882h(this.f146020g);
        this.f146021h = m152882h;
        if (m152882h != null) {
            this.f146022i = new File(m152882h);
        } else {
            this.f146022i = null;
        }
    }

    /* renamed from: b */
    private void m152878b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f146034u == null) {
            this.f146034u = ByteBuffer.allocateDirect(1024);
        }
        int i11 = bufferInfo.size;
        this.f146029p = i11;
        int i12 = i11 + 7;
        this.f146030q = i12;
        m152879c(this.f146031r, i12);
        byteBuffer.get(this.f146031r, 7, this.f146029p);
        this.f146034u.position(bufferInfo.offset);
        this.f146034u.limit(bufferInfo.offset + this.f146030q);
        try {
            this.f146034u.put(this.f146031r, 0, this.f146030q);
            this.f146034u.position(bufferInfo.offset);
            bufferInfo.size = this.f146030q;
        } catch (BufferOverflowException unused) {
            this.f146034u.put(this.f146031r, 0, this.f146030q);
        }
    }

    /* renamed from: c */
    private void m152879c(byte[] bArr, int i11) {
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = 80;
        bArr[3] = (byte) ((i11 >> 11) + 64);
        bArr[4] = (byte) ((i11 & 2047) >> 3);
        bArr[5] = (byte) (((i11 & 7) << 5) + 31);
        bArr[6] = -4;
    }

    /* renamed from: f */
    private void m152880f(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f146033t = bufferInfo.size;
        this.f146032s = ByteBuffer.allocateDirect(byteBuffer.capacity() + this.f146033t);
        int i11 = bufferInfo.size;
        byte[] bArr = new byte[i11];
        byteBuffer.get(bArr, bufferInfo.offset, i11);
        byteBuffer.position(bufferInfo.offset);
        this.f146032s.put(bArr, 0, bufferInfo.size);
    }

    /* renamed from: g */
    private boolean m152881g() {
        return this.f146015b != null && this.f146017d;
    }

    /* renamed from: h */
    private static String m152882h(String str) {
        if (str.endsWith(".m3u8")) {
            return str.substring(0, str.length() - 5) + ".jpg";
        }
        if (str.endsWith(".mp4")) {
            return str.substring(0, str.length() - 4) + ".jpg";
        }
        return null;
    }

    /* renamed from: i */
    private long m152883i(long j11, int i11) {
        long[] jArr = this.f146035v;
        long j12 = jArr[i11];
        if (j12 == 0) {
            jArr[i11] = j11;
            return 0L;
        }
        return m152884j(j11 - j12, i11);
    }

    /* renamed from: j */
    private long m152884j(long j11, int i11) {
        long[] jArr = this.f146036w;
        long j12 = jArr[i11];
        if (j12 >= j11) {
            long j13 = j12 + 9643;
            jArr[i11] = j13;
            return j13;
        }
        jArr[i11] = j11;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m152885k(String str, String str2, Bitmap bitmap) {
        try {
            this.f146037x = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    private void m152886l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f146032s.position(this.f146033t);
        this.f146032s.put(byteBuffer);
    }

    /* renamed from: n */
    private void m152887n() {
        int i11 = this.f146018e + 1;
        this.f146018e = i11;
        if (i11 == this.f146024k) {
            try {
                this.f146022i.delete();
                MediaMuxer mediaMuxer = this.f146014a;
                if (mediaMuxer != null) {
                    mediaMuxer.start();
                } else {
                    ZFFmpegMuxer zFFmpegMuxer = this.f146015b;
                    if (zFFmpegMuxer != null) {
                        zFFmpegMuxer.start();
                    }
                }
                AbstractC23237v1.m119714b("record", "muxer started");
                this.f146016c = true;
                AbstractC31817h.b bVar = this.f146023j;
                if (bVar != null) {
                    bVar.mo38629a(this.f146020g);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                AbstractC31817h.b bVar2 = this.f146023j;
                if (bVar2 != null) {
                    bVar2.mo38629a(null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m152888d(MediaFormat mediaFormat) {
        this.f146027n = -1;
        synchronized (this.f146025l) {
            try {
                MediaMuxer mediaMuxer = this.f146014a;
                if (mediaMuxer != null) {
                    this.f146027n = mediaMuxer.addTrack(mediaFormat);
                } else {
                    ZFFmpegMuxer zFFmpegMuxer = this.f146015b;
                    if (zFFmpegMuxer != null) {
                        this.f146027n = zFFmpegMuxer.setAudioStream(mediaFormat.getInteger("channel-count"), mediaFormat.getInteger("sample-rate"), 0);
                    }
                }
                this.f146026m = true;
                this.f146025l.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m152887n();
        return this.f146027n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m152889e(MediaFormat mediaFormat) {
        this.f146028o = -1;
        synchronized (this.f146025l) {
            if (!this.f146026m) {
                try {
                    this.f146025l.wait(500L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
        MediaMuxer mediaMuxer = this.f146014a;
        if (mediaMuxer != null) {
            this.f146028o = mediaMuxer.addTrack(mediaFormat);
        } else {
            ZFFmpegMuxer zFFmpegMuxer = this.f146015b;
            if (zFFmpegMuxer != null) {
                this.f146028o = zFFmpegMuxer.setVideoStream(0, mediaFormat.getInteger("width"), mediaFormat.getInteger("height"));
            }
        }
        m152887n();
        return this.f146028o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m152890m() {
        int i11 = this.f146019f + 1;
        this.f146019f = i11;
        if (i11 == this.f146024k) {
            try {
                MediaMuxer mediaMuxer = this.f146014a;
                if (mediaMuxer != null) {
                    mediaMuxer.stop();
                    this.f146014a.release();
                    AbstractC31817h.b bVar = this.f146023j;
                    if (bVar != null) {
                        bVar.mo38631c(this.f146020g, false);
                        return;
                    }
                    return;
                }
                ZFFmpegMuxer zFFmpegMuxer = this.f146015b;
                if (zFFmpegMuxer != null) {
                    zFFmpegMuxer.stop();
                    AbstractC31817h.b bVar2 = this.f146023j;
                    if (bVar2 != null) {
                        bVar2.mo38631c(this.f146020g, false);
                    }
                    this.f146015b.quitHandler();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                AbstractC31817h.b bVar3 = this.f146023j;
                if (bVar3 != null) {
                    bVar3.mo38631c(null, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m152891o(int i11, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i12;
        ByteBuffer byteBuffer2;
        MediaMuxer mediaMuxer = this.f146014a;
        if (mediaMuxer != null) {
            if ((bufferInfo.flags & 2) != 0 || bufferInfo.size == 0) {
                return;
            }
            mediaMuxer.writeSampleData(i11, byteBuffer, bufferInfo);
            return;
        }
        if (this.f146015b != null) {
            if ((bufferInfo.flags & 2) != 0) {
                if (i11 == this.f146028o) {
                    m152880f(byteBuffer, bufferInfo);
                    return;
                }
                return;
            }
            if (i11 == this.f146027n && m152881g()) {
                m152878b(byteBuffer, bufferInfo);
            }
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            long m152883i = m152883i(bufferInfo.presentationTimeUs, i11);
            bufferInfo.presentationTimeUs = m152883i;
            int i13 = bufferInfo.flags;
            if ((i13 & 1) == 1) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i14 = this.f146028o;
            if (i11 == i14 && (i13 & 1) != 0) {
                m152886l(byteBuffer, bufferInfo);
                this.f146015b.writeAVPacket(1, this.f146032s, bufferInfo.offset, bufferInfo.size + this.f146033t, i12, bufferInfo.presentationTimeUs);
            } else if (i11 == i14) {
                this.f146015b.writeAVPacket(1, byteBuffer, bufferInfo.offset, bufferInfo.size, i12, m152883i);
            } else {
                ZFFmpegMuxer zFFmpegMuxer = this.f146015b;
                if (m152881g()) {
                    byteBuffer2 = this.f146034u;
                } else {
                    byteBuffer2 = byteBuffer;
                }
                zFFmpegMuxer.writeAVPacket(0, byteBuffer2, i12, bufferInfo.size, bufferInfo.flags, bufferInfo.presentationTimeUs);
            }
            if (i11 == this.f146028o && !this.f146037x && this.f146022i != null && this.f146017d) {
                this.f146015b.extractFirstImageFrame(this.f146020g, this.f146021h, 0, new ZFFmpegMuxer.VideoThumbListener() { // from class: zf.l
                    @Override // com.zing.zalo.zvideoutil.ZFFmpegMuxer.VideoThumbListener
                    public final void onReceiveVideoThumb(String str, String str2, Bitmap bitmap) {
                        C31822m.this.m152885k(str, str2, bitmap);
                    }
                });
            }
        }
    }
}
