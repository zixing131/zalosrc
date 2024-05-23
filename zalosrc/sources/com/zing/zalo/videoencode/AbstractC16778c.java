package com.zing.zalo.videoencode;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.zing.zalocore.CoreUtility;
import ff0.C18904a;
import ff0.C18905b;
import gf0.C19436a;
import ho0.AbstractC20110a;
import java.io.IOException;
import me0.AbstractC23254w8;

/* renamed from: com.zing.zalo.videoencode.c */
/* loaded from: classes5.dex */
public abstract class AbstractC16778c {

    /* renamed from: s */
    static int f85109s = 2;

    /* renamed from: t */
    static int f85110t = 44100;

    /* renamed from: u */
    static long f85111u = 33333;

    /* renamed from: c */
    private String f85114c;

    /* renamed from: d */
    private String f85115d;

    /* renamed from: o */
    final C19436a f85126o;

    /* renamed from: a */
    protected int f85112a = -1;

    /* renamed from: b */
    protected int f85113b = -1;

    /* renamed from: e */
    int f85116e = 0;

    /* renamed from: f */
    MediaExtractor f85117f = null;

    /* renamed from: g */
    MediaExtractor f85118g = null;

    /* renamed from: h */
    C18904a f85119h = null;

    /* renamed from: i */
    C18905b f85120i = null;

    /* renamed from: j */
    MediaCodec f85121j = null;

    /* renamed from: k */
    MediaCodec f85122k = null;

    /* renamed from: l */
    MediaCodec f85123l = null;

    /* renamed from: m */
    MediaCodec f85124m = null;

    /* renamed from: n */
    MediaMuxer f85125n = null;

    /* renamed from: p */
    int f85127p = -1;

    /* renamed from: q */
    int f85128q = -1;

    /* renamed from: r */
    boolean f85129r = false;

    /* renamed from: com.zing.zalo.videoencode.c$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo50435a(int i11);

        /* renamed from: b */
        void mo50436b(String str, int i11);

        /* renamed from: c */
        void mo50437c(String str);

        /* renamed from: d */
        void mo50438d(int i11, String str, int i12, long j11);

        /* renamed from: e */
        void mo50439e(int i11, String str, long j11, long j12, long j13);

        /* renamed from: f */
        void mo50440f(int i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC16778c(C19436a c19436a) {
        this.f85126o = c19436a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m89555g(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime");
    }

    /* renamed from: h */
    private static boolean m89556h(MediaFormat mediaFormat) {
        return m89555g(mediaFormat).startsWith("audio/");
    }

    /* renamed from: i */
    private static boolean m89557i(MediaFormat mediaFormat) {
        return m89555g(mediaFormat).startsWith("video/");
    }

    /* renamed from: o */
    public static AbstractC16778c m89558o(int i11, C19436a c19436a) {
        if (i11 != 1) {
            if (i11 != 2) {
                return new C16777b(c19436a);
            }
            return new C16780e(c19436a);
        }
        return new VideoNativeCompressEncoder(c19436a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static MediaCodecInfo m89559p(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract int mo89540a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaExtractor m89560b() {
        MediaExtractor mediaExtractor = new MediaExtractor();
        if (AbstractC23254w8.m119859g(this.f85114c)) {
            try {
                ParcelFileDescriptor openFileDescriptor = CoreUtility.getAppContext().getContentResolver().openFileDescriptor(Uri.parse(this.f85114c), "r");
                if (openFileDescriptor != null) {
                    mediaExtractor.setDataSource(openFileDescriptor.getFileDescriptor());
                    openFileDescriptor.close();
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else {
            mediaExtractor.setDataSource(this.f85114c);
        }
        return mediaExtractor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public MediaMuxer m89561c() {
        MediaMuxer mediaMuxer = new MediaMuxer(this.f85115d, 0);
        mediaMuxer.setLocation((float) this.f85126o.m101614h(), (float) this.f85126o.m101615i());
        mediaMuxer.setOrientationHint(this.f85126o.m101623q());
        return mediaMuxer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo89541d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m89562e(MediaExtractor mediaExtractor) {
        for (int i11 = 0; i11 < mediaExtractor.getTrackCount(); i11++) {
            if (m89556h(mediaExtractor.getTrackFormat(i11))) {
                mediaExtractor.selectTrack(i11);
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m89563f(MediaExtractor mediaExtractor) {
        for (int i11 = 0; i11 < mediaExtractor.getTrackCount(); i11++) {
            if (m89557i(mediaExtractor.getTrackFormat(i11))) {
                mediaExtractor.selectTrack(i11);
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void m89564j(long j11, long j12, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        long j13 = (int) ((((float) j11) / ((float) j12)) * 1000.0f);
        m89568n(i11, null, currentTimeMillis - j13, currentTimeMillis, j13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m89565k(String str) {
        if (this.f85126o.m101610d() != null) {
            this.f85126o.m101610d().mo50437c(str);
        } else {
            AbstractC20110a.m104543l("[VideoCompress]").mo104548a(str, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m89566l(int i11, String str, int i12) {
        m89567m(i11, str, i12, 0L);
    }

    /* renamed from: m */
    protected void m89567m(int i11, String str, int i12, long j11) {
        if (this.f85126o.m101610d() != null) {
            this.f85126o.m101610d().mo50438d(i11, str, i12, j11);
        }
    }

    /* renamed from: n */
    protected void m89568n(int i11, String str, long j11, long j12, long j13) {
        if (this.f85126o.m101610d() != null) {
            this.f85126o.m101610d().mo50439e(i11, str, j11, j12, j13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m89569q(String str) {
        this.f85115d = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m89570r(int i11, int i12) {
        if (i11 % 16 != 0 || i12 % 16 != 0) {
            AbstractC20110a.m104545n("WARNING: width or height not multiple of 16", new Object[0]);
        }
        this.f85112a = i11;
        this.f85113b = i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void m89571s(String str) {
        this.f85114c = str;
    }
}
