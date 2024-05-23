package com.zing.zalo.zmedia.view;

import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.util.HashMap;
import me0.AbstractC23254w8;
import p173fz.C19172a;
import p471r3.EnumC25629a;
import pl0.AbstractC24827h;

/* renamed from: com.zing.zalo.zmedia.view.g */
/* loaded from: classes7.dex */
public abstract class AbstractC17358g {

    /* renamed from: a */
    private static Context f88506a = CoreUtility.getAppContext();

    /* renamed from: b */
    public static final String[] f88507b = {"m3u8", "ism", "ts", "webm", "mkv", "flv", "mp4"};

    /* renamed from: c */
    private static final HashMap f88508c = new HashMap();

    /* renamed from: com.zing.zalo.zmedia.view.g$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        int f88509a = 0;

        /* renamed from: b */
        int f88510b = 0;

        /* renamed from: c */
        double f88511c = 0.0d;

        /* renamed from: d */
        long f88512d = 0;

        /* renamed from: e */
        String f88513e;

        private a() {
        }

        /* renamed from: b */
        public static a m92499b(ZVideoUtilMetadata zVideoUtilMetadata) {
            a aVar = new a();
            try {
                String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                if (metadata != null && metadata.length() > 0) {
                    aVar.f88509a = Integer.parseInt(metadata);
                }
            } catch (Exception unused) {
            }
            try {
                String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                if (metadata2 != null && metadata2.length() > 0) {
                    aVar.f88510b = Integer.parseInt(metadata2);
                }
            } catch (Exception unused2) {
            }
            try {
                String metadata3 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE);
                if (metadata3 != null && metadata3.length() > 0) {
                    aVar.f88511c = Double.parseDouble(metadata3);
                }
            } catch (Exception unused3) {
            }
            try {
                String metadata4 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                if (metadata4 != null && metadata4.length() > 0) {
                    aVar.f88512d = Long.parseLong(metadata4);
                }
            } catch (Exception unused4) {
            }
            try {
                String metadata5 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC);
                if (metadata5 != null && metadata5.length() > 0) {
                    aVar.f88513e = metadata5;
                }
            } catch (Exception unused5) {
            }
            AbstractC20110a.m104543l("ZVideoViewProxy").mo104556o(8, "Video size: " + aVar.f88509a + " x " + aVar.f88510b + ", frame rate: " + aVar.f88511c, new Object[0]);
            return aVar;
        }

        /* renamed from: a */
        public boolean m92500a() {
            return this.f88509a <= 0 || this.f88510b <= 0 || this.f88511c <= 0.0d;
        }
    }

    /* renamed from: a */
    private static MediaExtractor m92488a(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        if (AbstractC23254w8.m119859g(str)) {
            try {
                ParcelFileDescriptor openFileDescriptor = m92490c().getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    try {
                        mediaExtractor.setDataSource(openFileDescriptor.getFileDescriptor());
                    } finally {
                    }
                }
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else {
            mediaExtractor.setDataSource(str);
        }
        return mediaExtractor;
    }

    /* renamed from: b */
    public static int m92489b(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static Context m92490c() {
        return f88506a;
    }

    /* renamed from: d */
    public static EnumC25629a m92491d() {
        if (AbstractC3972e.m18765V()) {
            return EnumC25629a.IN_BITMAP;
        }
        return EnumC25629a.DEFAULT;
    }

    /* renamed from: e */
    private static MediaCodecInfo m92492e(MediaFormat mediaFormat) {
        try {
            String string = mediaFormat.getString("mime");
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (!mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.startsWith("video") && str.equalsIgnoreCase(string) && !AbstractC24827h.m129087o(mediaCodecInfo, string)) {
                            return mediaCodecInfo;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: f */
    public static Rect m92493f(View view) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:            if (r7 == null) goto L71;     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static MediaFormat m92494g(String str) {
        Throwable th2;
        MediaExtractor mediaExtractor;
        try {
            mediaExtractor = m92488a(str);
        } catch (Exception e11) {
            e = e11;
            mediaExtractor = null;
        } catch (Throwable th3) {
            th2 = th3;
            mediaExtractor = null;
            if (mediaExtractor != null) {
            }
            throw th2;
        }
        try {
            try {
                int trackCount = mediaExtractor.getTrackCount();
                for (int i11 = 0; i11 < trackCount; i11++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i11);
                    String string = trackFormat.getString("mime");
                    if (string != null && string.startsWith("video/")) {
                        if (Build.VERSION.SDK_INT == 21) {
                            trackFormat.setString("frame-rate", null);
                        }
                        mediaExtractor.release();
                        return trackFormat;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                throw th2;
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.m104539h(e);
        }
        mediaExtractor.release();
        return null;
    }

    /* renamed from: h */
    public static boolean m92495h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashMap hashMap = f88508c;
        if (hashMap.containsKey(str)) {
            if (hashMap.get(str) != Boolean.TRUE) {
                return false;
            }
            return true;
        }
        boolean m92496i = m92496i(str);
        hashMap.put(str, Boolean.valueOf(m92496i));
        return m92496i;
    }

    /* renamed from: i */
    private static boolean m92496i(String str) {
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                MediaFormat m92494g = m92494g(str);
                if (m92494g == null) {
                    zVideoUtilMetadata.close();
                    return false;
                }
                String string = m92494g.getString("mime");
                AbstractC20110a.m104543l("ZVideoViewProxy").mo104556o(8, "Video track mime type: " + string, new Object[0]);
                a m92499b = a.m92499b(zVideoUtilMetadata);
                if (m92499b.m92500a()) {
                    zVideoUtilMetadata.close();
                    return false;
                }
                MediaCodecInfo m92492e = m92492e(m92494g);
                if (m92492e == null) {
                    zVideoUtilMetadata.close();
                    return false;
                }
                AbstractC20110a.m104543l("ZVideoViewProxy").mo104556o(8, "Supported type: " + m92492e.getSupportedTypes()[0], new Object[0]);
                MediaCodecInfo.VideoCapabilities videoCapabilities = m92492e.getCapabilitiesForType(string).getVideoCapabilities();
                AbstractC20110a.m104543l("ZVideoViewProxy").mo104556o(8, "Frame rate support: " + videoCapabilities.getSupportedFrameRatesFor(m92499b.f88509a, m92499b.f88510b).toString(), new Object[0]);
                boolean areSizeAndRateSupported = videoCapabilities.areSizeAndRateSupported(m92499b.f88509a, m92499b.f88510b, m92499b.f88511c);
                AbstractC20110a.m104543l("ZVideoViewProxy").mo104556o(8, "Hardware support: " + areSizeAndRateSupported, new Object[0]);
                if (areSizeAndRateSupported) {
                    boolean m129082j = AbstractC24827h.m129082j(C19172a.m100600k("device_classification@class_value", 1), m92499b.f88512d, m92499b.f88511c, m92499b.f88513e, m92499b.f88509a, m92499b.f88510b);
                    zVideoUtilMetadata.close();
                    return m129082j;
                }
                zVideoUtilMetadata.close();
                return false;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m92497j(View view, int i11, int i12) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect m92493f = m92493f(view);
        if (i11 < m92493f.left || i11 >= m92493f.right || i12 < m92493f.top || i12 >= m92493f.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static void m92498k(View view, int i11) {
        if (view != null) {
            view.setVisibility(i11);
        }
    }
}
