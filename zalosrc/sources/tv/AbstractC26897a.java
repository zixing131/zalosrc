package tv;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23041d2;
import me0.AbstractC23129l2;
import p239ih.C20551a;
import p559uv.C27373c;
import th.AbstractC26689j;

/* renamed from: tv.a */
/* loaded from: classes4.dex */
public abstract class AbstractC26897a {
    /* renamed from: a */
    public static Map m138615a(String str) {
        return m138616b(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    /* renamed from: b */
    public static Map m138616b(String str, File file) {
        Map map;
        long j11;
        ?? r22 = ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE;
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        try {
            try {
                ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
                try {
                    String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                    if (!TextUtils.isEmpty(metadata)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION, metadata);
                    }
                    String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                    if (!TextUtils.isEmpty(metadata2)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE, metadata2);
                    }
                    String metadata3 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE);
                    if (!TextUtils.isEmpty(metadata3)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE, metadata3);
                    }
                    String metadata4 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE);
                    if (!TextUtils.isEmpty(metadata4)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE, metadata4);
                    }
                    String metadata5 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                    if (!TextUtils.isEmpty(metadata5)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH, metadata5);
                    }
                    String metadata6 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                    if (!TextUtils.isEmpty(metadata6)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT, metadata6);
                    }
                    String metadata7 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC);
                    if (!TextUtils.isEmpty(metadata7)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC, metadata7);
                    }
                    String metadata8 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC);
                    if (!TextUtils.isEmpty(metadata8)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC, metadata8);
                    }
                    String metadata9 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE);
                    if (!TextUtils.isEmpty(metadata9)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE, metadata9);
                    }
                    String metadata10 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL);
                    if (!TextUtils.isEmpty(metadata10)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL, metadata10);
                    }
                    String metadata11 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                    if (!TextUtils.isEmpty(metadata11)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION, metadata11);
                        j11 = Long.parseLong(metadata11);
                    } else {
                        j11 = 0;
                    }
                    String metadata12 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE);
                    if (!TextUtils.isEmpty(metadata12)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE, metadata12);
                    }
                    String metadata13 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                    if (!TextUtils.isEmpty(metadata13)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, metadata13);
                    } else {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, "");
                    }
                    String metadata14 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION_ISO_6709);
                    if (!TextUtils.isEmpty(metadata14)) {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION_ISO_6709, metadata14);
                    } else {
                        hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION_ISO_6709, "");
                    }
                    r22 = hashMap;
                    if (file != null && j11 > 0) {
                        try {
                            Bitmap bitmap = zVideoUtilMetadata.getBitmap(j11 * 500, 2);
                            if (bitmap != null) {
                                r22.put("has_frame", "true");
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), fileOutputStream);
                                    fileOutputStream.close();
                                    AbstractC20110a.m104541j("Extracted frame", new Object[0]);
                                } finally {
                                }
                            } else {
                                AbstractC20110a.m104541j("Failed to extract frame", new Object[0]);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                zVideoUtilMetadata.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    AbstractC20110a.m104541j(r22.toString(), new Object[0]);
                    zVideoUtilMetadata.close();
                    map = r22;
                } catch (Throwable th5) {
                    th = th5;
                    r22 = hashMap;
                }
            } catch (Exception e11) {
                e = e11;
                r22 = hashMap;
                AbstractC20110a.m104539h(e);
                map = r22;
                return map;
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.m104539h(e);
            map = r22;
            return map;
        }
        return map;
    }

    /* renamed from: c */
    public static Map m138617c(String str) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                if (!TextUtils.isEmpty(metadata)) {
                    hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH, metadata);
                }
                String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                if (!TextUtils.isEmpty(metadata2)) {
                    hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT, metadata2);
                }
                String metadata3 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                if (!TextUtils.isEmpty(metadata3)) {
                    hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION, metadata3);
                }
                String metadata4 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                if (!TextUtils.isEmpty(metadata4)) {
                    hashMap.put(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION, metadata4);
                }
                AbstractC20110a.m104541j(hashMap.toString(), new Object[0]);
                zVideoUtilMetadata.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return hashMap;
    }

    /* renamed from: d */
    public static boolean m138618d(C27373c c27373c) {
        Map m138615a = m138615a(c27373c.m140220E());
        if (m138615a.isEmpty()) {
            return false;
        }
        try {
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH)) {
                String str = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                Objects.requireNonNull(str);
                int parseInt = Integer.parseInt(str);
                c27373c.m140246c0(parseInt);
                if (!c27373c.f128943P && !c27373c.f128942O) {
                    c27373c.m140252f0(parseInt);
                }
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT)) {
                String str2 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                Objects.requireNonNull(str2);
                int parseInt2 = Integer.parseInt(str2);
                c27373c.m140245b0(parseInt2);
                if (!c27373c.f128943P && !c27373c.f128942O) {
                    c27373c.m140241Z(parseInt2);
                }
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION) && !c27373c.f128943P && !c27373c.f128942O) {
                String str3 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                Objects.requireNonNull(str3);
                c27373c.m140234S(Integer.parseInt(str3));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION)) {
                String str4 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                Objects.requireNonNull(str4);
                c27373c.m140226K(Long.parseLong(str4));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC)) {
                String str5 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC);
                Objects.requireNonNull(str5);
                c27373c.m140239X(str5);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE)) {
                String str6 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                Objects.requireNonNull(str6);
                c27373c.m140238W(Integer.parseInt(str6));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE)) {
                String str7 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE);
                Objects.requireNonNull(str7);
                c27373c.m140240Y((int) Double.parseDouble(str7));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE)) {
                String str8 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE);
                Objects.requireNonNull(str8);
                c27373c.m140248d0(Integer.parseInt(str8));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL)) {
                String str9 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL);
                Objects.requireNonNull(str9);
                c27373c.m140243a0(Integer.parseInt(str9));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC)) {
                String str10 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC);
                Objects.requireNonNull(str10);
                c27373c.m140223H(str10);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE)) {
                String str11 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE);
                Objects.requireNonNull(str11);
                c27373c.m140222G(Integer.parseInt(str11));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE)) {
                String str12 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE);
                Objects.requireNonNull(str12);
                long parseLong = Long.parseLong(str12);
                c27373c.m140227L(parseLong / 1048576);
                c27373c.m140228M(parseLong);
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: e */
    public static void m138619e(C27373c c27373c) {
        try {
            Map m138617c = m138617c(c27373c.m140220E());
            if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH)) {
                String str = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                Objects.requireNonNull(str);
                int parseInt = Integer.parseInt(str);
                c27373c.m140252f0(parseInt);
                c27373c.m140246c0(parseInt);
            }
            if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT)) {
                String str2 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                Objects.requireNonNull(str2);
                int parseInt2 = Integer.parseInt(str2);
                c27373c.m140241Z(parseInt2);
                c27373c.m140245b0(parseInt2);
            }
            if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION)) {
                String str3 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                Objects.requireNonNull(str3);
                c27373c.m140234S(Integer.parseInt(str3));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    public static boolean m138620f(C27373c c27373c) {
        return m138621g(c27373c, true);
    }

    /* renamed from: g */
    public static boolean m138621g(C27373c c27373c, boolean z11) {
        String str;
        double[] dArr;
        Map m138615a = m138615a(c27373c.m140220E());
        if (m138615a.isEmpty()) {
            return false;
        }
        try {
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH)) {
                String str2 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                Objects.requireNonNull(str2);
                int parseInt = Integer.parseInt(str2);
                c27373c.m140246c0(parseInt);
                c27373c.m140252f0(parseInt);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT)) {
                String str3 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                Objects.requireNonNull(str3);
                int parseInt2 = Integer.parseInt(str3);
                c27373c.m140245b0(parseInt2);
                c27373c.m140241Z(parseInt2);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION)) {
                String str4 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                Objects.requireNonNull(str4);
                c27373c.m140234S(Integer.parseInt(str4));
            }
            if (z11 && m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION)) {
                String str5 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                Objects.requireNonNull(str5);
                c27373c.m140226K(Long.parseLong(str5));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC)) {
                String str6 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_CODEC);
                Objects.requireNonNull(str6);
                c27373c.m140239X(str6);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE)) {
                String str7 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_BITRATE);
                Objects.requireNonNull(str7);
                c27373c.m140238W(Integer.parseInt(str7));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE)) {
                String str8 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_FRAMERATE);
                Objects.requireNonNull(str8);
                c27373c.m140240Y((int) Double.parseDouble(str8));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE)) {
                String str9 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_PROFILE);
                Objects.requireNonNull(str9);
                c27373c.m140248d0(Integer.parseInt(str9));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL)) {
                String str10 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_LEVEL);
                Objects.requireNonNull(str10);
                c27373c.m140243a0(Integer.parseInt(str10));
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC)) {
                String str11 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_CODEC);
                Objects.requireNonNull(str11);
                c27373c.m140223H(str11);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE)) {
                String str12 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_AUDIO_BITRATE);
                Objects.requireNonNull(str12);
                c27373c.m140222G(Integer.parseInt(str12));
            }
            String str13 = "";
            if (!m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                str = "";
            } else {
                str = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                Objects.requireNonNull(str);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION_ISO_6709)) {
                str13 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION_ISO_6709);
                Objects.requireNonNull(str13);
            }
            if (m138615a.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE)) {
                String str14 = (String) m138615a.get(ZVideoUtilMetadata.ZMETADATA_KEY_FILESIZE);
                Objects.requireNonNull(str14);
                long parseLong = Long.parseLong(str14);
                c27373c.m140227L(parseLong / 1048576);
                c27373c.m140228M(parseLong);
            }
            if (!TextUtils.isEmpty(str)) {
                dArr = AbstractC23129l2.m118632a(str);
            } else if (!TextUtils.isEmpty(str13)) {
                dArr = AbstractC23129l2.m118632a(str13);
            } else {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        C20551a.m106809d(mediaMetadataRetriever, c27373c.m140220E());
                        dArr = AbstractC23129l2.m118632a(mediaMetadataRetriever.extractMetadata(23));
                    } finally {
                        mediaMetadataRetriever.release();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    mediaMetadataRetriever.release();
                    dArr = null;
                }
            }
            if (dArr != null && dArr.length == 2) {
                c27373c.m140229N((float) dArr[0]);
                c27373c.m140230O((float) dArr[1]);
            }
            double m118219r = AbstractC23041d2.m118219r(c27373c.m140220E());
            if (m118219r > 0.0d) {
                c27373c.m140224I((long) m118219r);
            }
            if (c27373c.m140256j() <= 0) {
                long m118224w = AbstractC23041d2.m118224w(c27373c.m140220E());
                if (m118224w > 0) {
                    c27373c.m140227L(m118224w / 1048576);
                    c27373c.m140228M(m118224w);
                }
            }
            AbstractC20110a.m104541j("parseVideoMetadataUsingFfmpeg>>> url= " + c27373c.m140220E() + "\nvideo width= " + c27373c.m140221F() + "\nvideo height= " + c27373c.m140272z() + "\nrotation= " + c27373c.m140265s() + "\nduration= " + c27373c.m140254h() + "\nvideo codec= " + c27373c.m140270x() + "\nvideo bitrate= " + c27373c.m140269w() + "\nvideo frameRate= " + c27373c.m140271y() + "\nvideo profile= " + c27373c.m140219D() + "\nvideo level= " + c27373c.m140216A() + "\naudio codec= " + c27373c.m140249e() + "\naudio bitrate= " + c27373c.m140247d() + "\nlon= " + c27373c.m140259m() + "\nlat= " + c27373c.m140258l() + "\nfileSize= " + c27373c.m140256j(), new Object[0]);
            return true;
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
            return false;
        }
    }

    /* renamed from: h */
    public static void m138622h(C27373c c27373c) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    C20551a.m106809d(mediaMetadataRetriever, c27373c.m140220E());
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    if (extractMetadata != null) {
                        c27373c.m140252f0(Integer.parseInt(extractMetadata));
                    }
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    if (extractMetadata2 != null) {
                        c27373c.m140241Z(Integer.parseInt(extractMetadata2));
                    }
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata3 != null) {
                        c27373c.m140234S(Integer.parseInt(extractMetadata3));
                    }
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata4 != null) {
                        c27373c.m140226K(Long.parseLong(extractMetadata4));
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
    }
}
