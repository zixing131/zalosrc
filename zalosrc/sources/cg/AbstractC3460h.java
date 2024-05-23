package cg;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtil;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import me0.AbstractC23009a3;
import p239ih.C20551a;
import p239ih.C20556f;
import p493rt.C25977a;
import th.AbstractC26689j;

/* renamed from: cg.h */
/* loaded from: classes3.dex */
public abstract class AbstractC3460h {
    /* renamed from: a */
    public static int m17433a(int i11, int i12, int i13, float f11) {
        return (int) (f11 * 0.07f * i13 * i11 * i12);
    }

    /* renamed from: b */
    public static int m17434b(int i11, int i12, long j11) {
        return ((int) (j11 / (i11 + i12))) * 1000;
    }

    /* renamed from: c */
    public static long m17435c(int i11, int i12, long j11) {
        if (j11 < 1000) {
            j11 = 1000;
        }
        return (i11 + i12) * (j11 / 1000);
    }

    /* renamed from: d */
    public static long m17436d(String str, int i11, long j11) {
        int i12;
        int i13;
        int i14;
        long j12 = 0;
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                int i15 = 0;
                if (!TextUtils.isEmpty(metadata)) {
                    i12 = Integer.parseInt(metadata);
                } else {
                    i12 = 0;
                }
                String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                if (!TextUtils.isEmpty(metadata2)) {
                    i13 = Integer.parseInt(metadata2);
                } else {
                    i13 = 0;
                }
                String metadata3 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                if (!TextUtils.isEmpty(metadata3)) {
                    i14 = Integer.parseInt(metadata3);
                } else {
                    i14 = 0;
                }
                String metadata4 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE);
                if (!TextUtils.isEmpty(metadata4)) {
                    i15 = Integer.parseInt(metadata4);
                }
                C25977a m133806c = C25977a.m133806c(i12, i13, AbstractC26689j.m137077D(i11), AbstractC26689j.m137106o(i11).m40328a());
                if (i14 > 0) {
                    i14 = Math.min(i14, m133806c.f123942c);
                }
                j12 = m17434b(i14, i15, j11);
                zVideoUtilMetadata.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return j12;
    }

    /* renamed from: e */
    public static long m17437e(int i11, int i12, long j11, int i13) {
        try {
            return m17435c(C25977a.m133806c(i11, i12, AbstractC26689j.m137077D(i13), AbstractC26689j.m137106o(i13).m40328a()).f123942c, 131072, j11) / 8388608;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 0L;
        }
    }

    /* renamed from: f */
    public static long m17438f(String str, int i11) {
        long j11;
        int i12;
        int i13;
        int i14;
        long j12 = 0;
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                if (!TextUtils.isEmpty(metadata)) {
                    j11 = Long.parseLong(metadata);
                } else {
                    j11 = 0;
                }
                String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                int i15 = 0;
                if (!TextUtils.isEmpty(metadata2)) {
                    i12 = Integer.parseInt(metadata2);
                } else {
                    i12 = 0;
                }
                String metadata3 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                if (!TextUtils.isEmpty(metadata3)) {
                    i13 = Integer.parseInt(metadata3);
                } else {
                    i13 = 0;
                }
                String metadata4 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                if (!TextUtils.isEmpty(metadata4)) {
                    i14 = Integer.parseInt(metadata4);
                } else {
                    i14 = 0;
                }
                String metadata5 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE);
                if (!TextUtils.isEmpty(metadata5)) {
                    i15 = Integer.parseInt(metadata5);
                }
                C25977a m133806c = C25977a.m133806c(i12, i13, AbstractC26689j.m137077D(i11), AbstractC26689j.m137106o(i11).m40328a());
                if (i14 > 0) {
                    i14 = Math.min(i14, m133806c.f123942c);
                }
                j12 = m17435c(i14, i15, j11) / 8388608;
                zVideoUtilMetadata.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return j12;
    }

    /* renamed from: g */
    public static String m17439g(int i11) {
        String str;
        String str2;
        int i12 = (i11 / 1000) % 60;
        int i13 = (i11 / 60000) % 60;
        if (i12 > 9) {
            str = String.valueOf(i12);
        } else {
            str = "0" + i12;
        }
        if (i13 > 9) {
            str2 = String.valueOf(i13);
        } else {
            str2 = "0" + i13;
        }
        return str2 + ":" + str;
    }

    /* renamed from: h */
    public static String m17440h(long j11) {
        Object obj;
        Object obj2;
        try {
            long j12 = j11 / 1000;
            long j13 = j12 / 60;
            long j14 = j12 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            if (j13 > 9) {
                obj = Long.valueOf(j13);
            } else {
                obj = "0" + j13;
            }
            sb2.append(obj);
            sb2.append(":");
            if (j14 > 9) {
                obj2 = Long.valueOf(j14);
            } else {
                obj2 = "0" + j14;
            }
            sb2.append(obj2);
            return sb2.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: i */
    public static void m17441i(String str, File file, int i11, boolean z11) {
        Bitmap bitmap;
        Bitmap m117965p;
        if (str != null && file != null && i11 > 0) {
            try {
                C20556f c20556f = new C20556f(str);
                if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                    try {
                        ZVideoUtil.getInstance();
                        bitmap = ZVideoUtil.extractFirstFrame(ZAbstractBase.reformatVideoPath(str), i11, z11 ? 1 : 0);
                    } catch (IllegalArgumentException e11) {
                        AbstractC20110a.m104539h(e11);
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            C20551a.m106809d(mediaMetadataRetriever, str);
                            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                            if (frameAtTime != null && !AbstractC23009a3.m117951b(frameAtTime, i11, i11) && (m117965p = AbstractC23009a3.m117965p(frameAtTime, i11, i11)) != null) {
                                frameAtTime.recycle();
                                frameAtTime = m117965p;
                            }
                            mediaMetadataRetriever.release();
                            bitmap = frameAtTime;
                        } catch (Throwable th2) {
                            mediaMetadataRetriever.release();
                            throw th2;
                        }
                    }
                    if (bitmap != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), fileOutputStream);
                            bitmap.recycle();
                            fileOutputStream.close();
                        } finally {
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
    }

    /* renamed from: j */
    public static long m17442j(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        long m17443k = m17443k(str);
        if (m17443k <= 0) {
            return m17444l(str);
        }
        return m17443k;
    }

    /* renamed from: k */
    private static long m17443k(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long j11 = 0;
        try {
            try {
                try {
                    C20551a.m106809d(mediaMetadataRetriever, str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata != null && extractMetadata.length() > 0) {
                        j11 = Long.parseLong(extractMetadata);
                    }
                    mediaMetadataRetriever.release();
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                AbstractC20110a.m104539h(e12);
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
            mediaMetadataRetriever.release();
        }
        return j11;
    }

    /* renamed from: l */
    private static long m17444l(String str) {
        long j11 = 0;
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                j11 = Long.parseLong(zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION));
                zVideoUtilMetadata.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return j11;
    }

    /* renamed from: m */
    public static int m17445m(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int m17446n = m17446n(str);
        if (m17446n == -1) {
            return m17447o(str);
        }
        return m17446n;
    }

    /* renamed from: n */
    private static int m17446n(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int i11 = -1;
        try {
            try {
                try {
                    C20551a.m106809d(mediaMetadataRetriever, str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null && extractMetadata.length() > 0) {
                        i11 = Integer.parseInt(extractMetadata);
                    }
                    mediaMetadataRetriever.release();
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                AbstractC20110a.m104539h(e12);
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
            mediaMetadataRetriever.release();
        }
        return i11;
    }

    /* renamed from: o */
    private static int m17447o(String str) {
        int i11 = 0;
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                if (metadata != null && metadata.length() > 0) {
                    i11 = Integer.parseInt(metadata);
                }
                zVideoUtilMetadata.close();
            } catch (Throwable th2) {
                try {
                    zVideoUtilMetadata.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i11;
    }

    /* renamed from: p */
    public static int[] m17448p(String str) {
        int[] iArr = new int[2];
        if (TextUtils.isEmpty(str)) {
            return iArr;
        }
        int[] m17449q = m17449q(str);
        if (m17449q[0] == 0 && m17449q[1] == 0) {
            return m17450r(str);
        }
        return m17449q;
    }

    /* renamed from: q */
    private static int[] m17449q(String str) {
        int[] iArr = new int[2];
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
        }
        try {
            try {
                C20551a.m106809d(mediaMetadataRetriever, str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                if (extractMetadata != null && extractMetadata.length() > 0) {
                    iArr[0] = Integer.parseInt(extractMetadata);
                }
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null && extractMetadata2.length() > 0) {
                    iArr[1] = Integer.parseInt(extractMetadata2);
                }
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                mediaMetadataRetriever.release();
            }
            return iArr;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e13) {
                AbstractC20110a.m104539h(e13);
            }
            throw th2;
        }
    }

    /* renamed from: r */
    private static int[] m17450r(String str) {
        int[] iArr = new int[2];
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                if (metadata != null && metadata.length() > 0) {
                    iArr[0] = Integer.parseInt(metadata);
                }
                String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                if (metadata2 != null && metadata2.length() > 0) {
                    iArr[1] = Integer.parseInt(metadata2);
                }
                zVideoUtilMetadata.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return iArr;
    }

    /* renamed from: s */
    private static boolean m17451s(String str, int i11, int i12) {
        if (TextUtils.equals(str, ZVideoUtilMetadata.VIDEO_CODEC_H264) && ((i11 == 66 || i11 == 578) && i12 <= 41)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m17452t(int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, long j11) {
        boolean z11;
        boolean z12;
        int i19;
        int i21;
        if (!AbstractC26689j.m137080G(i11).m137161b(i12, i13, i14, i15, i17, i18, j11)) {
            return false;
        }
        float m137077D = AbstractC26689j.m137077D(i11);
        float m137083J = AbstractC26689j.m137083J(i11);
        if (Math.min(i12, i13) > m137077D) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i16 > 1000000) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean m17451s = m17451s(str, i17, i18);
        if (z11 || z12 || !m17451s) {
            return true;
        }
        float min = Math.min(i12, i13) / m137077D;
        if (min >= 1.0f) {
            i19 = (int) (i12 / min);
            i21 = (int) (i13 / min);
        } else {
            i19 = i12;
            i21 = i13;
        }
        if (i15 <= m17433a(i19, i21, 24, m137083J) * 1.2f) {
            return false;
        }
        return true;
    }
}
