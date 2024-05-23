package pl0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: pl0.h */
/* loaded from: classes.dex */
public abstract class AbstractC24827h {

    /* renamed from: b */
    private static Map f119174b;

    /* renamed from: c */
    private static Map f119175c;

    /* renamed from: d */
    private static Map f119176d;

    /* renamed from: e */
    private static Map f119177e;

    /* renamed from: f */
    private static Map f119178f;

    /* renamed from: g */
    private static Map f119179g;

    /* renamed from: a */
    public static final int[] f119173a = {10485760, 12582912, 18874368, 25165824, 33554432, 47185920};

    /* renamed from: h */
    private static final Integer f119180h = -1;

    /* renamed from: pl0.h$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        public MediaCodecInfo f119181a;

        /* renamed from: b */
        public int f119182b = 0;

        /* renamed from: c */
        public String f119183c;

        /* renamed from: b */
        private static String m129090b(int i11) {
            if (i11 == 1) {
                return "1";
            }
            if (i11 == 2) {
                return "1b";
            }
            switch (i11) {
                case 4:
                    return "11";
                case 8:
                    return "12";
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    return "13";
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    return "2";
                case 64:
                    return "21";
                case 128:
                    return "22";
                case 256:
                    return "3";
                case 512:
                    return "31";
                case 1024:
                    return "32";
                case ZVideoUtilMetadata.FF_PROFILE_H264_INTRA /* 2048 */:
                    return "4";
                case 4096:
                    return "41";
                case 8192:
                    return "42";
                case 16384:
                    return "5";
                case 32768:
                    return "51";
                case 65536:
                    return "52";
                case 131072:
                    return "6";
                case 262144:
                    return "61";
                case 524288:
                    return "62";
                default:
                    return "Unknown";
            }
        }

        /* renamed from: c */
        private static String m129091c(int i11) {
            if (i11 == 1) {
                return "MainTierLevel1";
            }
            if (i11 == 2) {
                return "HighTierLevel1";
            }
            switch (i11) {
                case 4:
                    return "MainTierLevel2";
                case 8:
                    return "HighTierLevel2";
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    return "HEVCMainTierLevel21";
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    return "HighTierLevel21";
                case 64:
                    return "MainTierLevel3";
                case 128:
                    return "HighTierLevel3";
                case 256:
                    return "MainTierLevel31";
                case 512:
                    return "HighTierLevel31";
                case 1024:
                    return "MainTierLevel4";
                case ZVideoUtilMetadata.FF_PROFILE_H264_INTRA /* 2048 */:
                    return "HighTierLevel4";
                case 4096:
                    return "MainTierLevel41";
                case 8192:
                    return "HighTierLevel41";
                case 16384:
                    return "MainTierLevel5";
                case 32768:
                    return "HighTierLevel5";
                case 65536:
                    return "MainTierLevel51";
                case 131072:
                    return "HighTierLevel51";
                case 262144:
                    return "MainTierLevel52";
                case 524288:
                    return "HighTierLevel52";
                case ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE /* 1048576 */:
                    return "MainTierLevel6";
                case 2097152:
                    return "HighTierLevel6";
                case 4194304:
                    return "MainTierLevel61";
                case 8388608:
                    return "HighTierLevel61";
                case 16777216:
                    return "MainTierLevel62";
                case 33554432:
                    return "HighTierLevel62";
                default:
                    return "Unknown";
            }
        }

        /* renamed from: d */
        public static String m129092d(String str, int i11, int i12) {
            if (str.contains("avc")) {
                return String.format(Locale.US, " %s Profile Level %s (%d,%d)", m129093e(i11), m129090b(i12), Integer.valueOf(i11), Integer.valueOf(i12));
            }
            if (str.contains("hevc")) {
                return String.format(Locale.US, " %s Profile Level %s (%d,%d)", m129094f(i11), m129091c(i12), Integer.valueOf(i11), Integer.valueOf(i12));
            }
            return "";
        }

        /* renamed from: e */
        private static String m129093e(int i11) {
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? i11 != 16 ? i11 != 32 ? i11 != 64 ? "Unknown" : "High444" : "High422" : "High10" : "High" : "Extends" : "Main" : "Baseline";
        }

        /* renamed from: f */
        private static String m129094f(int i11) {
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 4096 ? "Unknown" : "Main10HDR10" : "MainStill" : "Main10" : "Main";
        }

        /* renamed from: a */
        public void m129095a(String str) {
            int i11;
            int i12;
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
            if (!AbstractC24827h.m129081i(str)) {
                return;
            }
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.f119181a.getCapabilitiesForType(str);
                if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                    i11 = 0;
                    i12 = 0;
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel != null) {
                            i11 = Math.max(i11, codecProfileLevel.profile);
                            i12 = Math.max(i12, codecProfileLevel.level);
                        }
                    }
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                String.format(Locale.US, "%s", m129092d(str, i11, i12));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m129074b(String str) {
        a m129088p;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.getSupportedTypes() != null) {
                for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                    String.format(Locale.US, "    mime: %s", str2);
                    if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase(str) && (m129088p = m129088p(mediaCodecInfo, str)) != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((a) it.next()).f119181a.getName().equalsIgnoreCase(m129088p.f119181a.getName())) {
                                    break;
                                }
                            } else {
                                arrayList.add(m129088p);
                                String.format(Locale.US, "candidate codec: %s rank=%d", mediaCodecInfo.getName(), Integer.valueOf(m129088p.f119182b));
                                m129088p.m129095a(str);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a aVar = (a) arrayList.get(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            if (aVar2.f119182b > aVar.f119182b) {
                aVar = aVar2;
            }
        }
        if (aVar.f119182b < 600) {
            String.format(Locale.US, "Unacceptable codec: %s", aVar.f119181a.getName());
            return null;
        }
        String.format(Locale.US, "selected codec: %s rank=%d", aVar.f119181a.getName(), Integer.valueOf(aVar.f119182b));
        return aVar.f119181a.getName();
    }

    /* renamed from: c */
    private static synchronized Map m129075c() {
        synchronized (AbstractC24827h.class) {
            Map map = f119176d;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f119176d = treeMap;
            treeMap.put("OMX.Nvidia.h264.decode", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.Nvidia.h264.decode.secure", 300);
            f119176d.put("OMX.Intel.hw_vd.h264", Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE));
            f119176d.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.qcom.video.decoder.avc", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.ittiam.video.decoder.avc", 0);
            f119176d.put("OMX.SEC.avc.dec", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.SEC.AVC.Decoder", 799);
            f119176d.put("OMX.SEC.avcdec", 798);
            f119176d.put("OMX.SEC.avc.sw.dec", 200);
            f119176d.put("OMX.Exynos.avc.dec", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.Exynos.AVC.Decoder", 799);
            f119176d.put("OMX.k3.video.decoder.avc", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.rk.video_decoder.avc", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119176d.put("OMX.MARVELL.VIDEO.H264DECODER", 200);
            f119176d.put("c2.qti.avc.decoder", 600);
            f119176d.put("OMX.hisi.video.decoder.avc", 600);
            f119176d.put("OMX.sprd.h264.decoder", 600);
            f119176d.remove("OMX.Action.Video.Decoder");
            f119176d.remove("OMX.allwinner.video.decoder.avc");
            f119176d.remove("OMX.BRCM.vc4.decoder.avc");
            f119176d.remove("OMX.brcm.video.h264.hw.decoder");
            f119176d.remove("OMX.brcm.video.h264.decoder");
            f119176d.remove("OMX.cosmo.video.decoder.avc");
            f119176d.remove("OMX.duos.h264.decoder");
            f119176d.remove("OMX.hantro.81x0.video.decoder");
            f119176d.remove("OMX.hantro.G1.video.decoder");
            f119176d.remove("OMX.LG.decoder.video.avc");
            f119176d.remove("OMX.MS.AVC.Decoder");
            f119176d.remove("OMX.RENESAS.VIDEO.DECODER.H264");
            f119176d.remove("OMX.RTK.video.decoder");
            f119176d.remove("OMX.ST.VFM.H264Dec");
            f119176d.remove("OMX.vpu.video_decoder.avc");
            f119176d.remove("OMX.WMT.decoder.avc");
            f119176d.remove("OMX.bluestacks.hw.decoder");
            f119176d.put("OMX.google.h264.decoder", 200);
            f119176d.put("OMX.google.h264.lc.decoder", 200);
            f119176d.put("OMX.k3.ffmpeg.decoder", 200);
            f119176d.put("OMX.ffmpeg.video.decoder", 200);
            f119176d.put("OMX.sprd.soft.h264.decoder", 200);
            return f119176d;
        }
    }

    /* renamed from: d */
    private static synchronized Map m129076d() {
        synchronized (AbstractC24827h.class) {
            Map map = f119177e;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f119177e = treeMap;
            treeMap.put("OMX.Nvidia.h265.decode", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119177e.put("OMX.Nvidia.h265.decode.secure", 300);
            f119177e.put("OMX.Intel.sw_vd.h265", Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE));
            f119177e.put("OMX.qcom.video.decoder.hevc", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119177e.put("OMX.qcom.video.decoder.hevc.secure", 300);
            f119177e.put("OMX.Exynos.hevc.dec", 799);
            f119177e.put("c2.exynos.hevc.decoder", 799);
            f119177e.put("omx.img.msvdx.decoder.hevc", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119177e.put("omx.hisi.video.decoder.hevc", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119177e.put("omx.mtk.video.decoder.hevc", 100);
            f119177e.put("omx.mtk.video.decoder.hevc.secure", 100);
            f119177e.put("c2.mtk.hevc.decoder", 100);
            f119177e.put("c2.mtk.hevc.decoder.secure", 100);
            f119177e.put("OMX.google.hevc.decoder", 200);
            return f119177e;
        }
    }

    /* renamed from: e */
    private static synchronized Map m129077e() {
        synchronized (AbstractC24827h.class) {
            Map map = f119175c;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f119175c = treeMap;
            treeMap.put("omx.k3.video.decoder.mpeg4", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119175c.put("omx.mtk.video.decoder.mpeg4", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119175c.put("omx.qcom.video.decoder.mpeg4", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119175c.put("omx.hisi.video.decoder.mpeg4", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119175c.put("omx.exynos.mpeg4.dec", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119175c.put("omx.img.msvdx.decoder.mpeg4", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119175c.put("omx.sprd.mpeg4.decoder", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            return f119175c;
        }
    }

    /* renamed from: f */
    private static synchronized Map m129078f() {
        synchronized (AbstractC24827h.class) {
            Map map = f119174b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f119174b = treeMap;
            treeMap.put("omx.mtk.video.decoder.vp9", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("omx.qcom.video.decoder.vp9", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119174b.put("omx.exynos.vp9.dec", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119174b.put("omx.hisi.video.decoder.vp9", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("omx.sprd.vp9.decoder", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("c2.qti.vp9.decoder", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("omx.qcom.video.decoder.vp8", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119174b.put("omx.exynos.vp8.dec", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            f119174b.put("omx.hisi.video.decoder.vp8", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("omx.img.msvdx.decoder.vp8", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("omx.k3.video.decoder.vp8", 600);
            f119174b.put("omx.mtk.video.decoder.vpx", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            f119174b.put("c2.qti.vp8.decoder", Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING));
            return f119174b;
        }
    }

    /* renamed from: g */
    private static int m129079g(String str) {
        Integer num;
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")) {
            return 100;
        }
        if (!lowerCase.startsWith("omx.pv") && ((!lowerCase.startsWith("omx.sec") || !lowerCase.contains(".sw.")) && !lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.") && ((!lowerCase.startsWith("omx.qti.") || !lowerCase.endsWith("sw")) && !lowerCase.startsWith("c2.google.") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("omx.k3.ffmpeg.") && !lowerCase.startsWith("omx.avcodec.")))) {
            if (!lowerCase.startsWith("omx.ittiam.")) {
                if (!lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !lowerCase.equals("omx.qcom.video.decoder.hevchybrid")) {
                    if (!lowerCase.startsWith("omx.mtk.") && !lowerCase.startsWith("c2.mtk.")) {
                        if (!lowerCase.contains("hevc") && !lowerCase.contains("h265")) {
                            if (!lowerCase.contains("avc") && !lowerCase.contains(ZVideoUtilMetadata.VIDEO_CODEC_H264)) {
                                if (!lowerCase.contains("vp8") && !lowerCase.contains("vp9")) {
                                    if (lowerCase.contains("mp4v")) {
                                        num = (Integer) m129077e().get(lowerCase);
                                    } else {
                                        num = null;
                                    }
                                } else {
                                    num = (Integer) m129078f().get(lowerCase);
                                }
                            } else {
                                num = (Integer) m129075c().get(lowerCase);
                            }
                        } else {
                            num = (Integer) m129076d().get(lowerCase);
                        }
                        if (num != null && num.intValue() > 0) {
                            return num.intValue();
                        }
                    } else if (!lowerCase.contains("hevc") && !lowerCase.contains("h265")) {
                        return 100;
                    }
                }
            }
            return 0;
        }
        return 200;
    }

    /* renamed from: h */
    public static void m129080h() {
        if (f119178f != null) {
            return;
        }
        f119178f = new HashMap();
        HashMap hashMap = new HashMap();
        Integer num = f119180h;
        hashMap.put("__ALL__", num);
        f119178f.put("GOOGLE", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RNE-L22", 26);
        f119178f.put("HUAWEI", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("SM-A600G", 28);
        hashMap3.put("SM-A022F", 29);
        hashMap3.put("SM-J810Y", num);
        hashMap3.put("SM-F936B", num);
        f119178f.put("SAMSUNG", hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("VIVO 1716", num);
        f119178f.put("VIVO", hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap4.put("RMX1971", num);
        f119178f.put("REALME", hashMap5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m129081i(String str) {
        str.contains("hevc");
        return true;
    }

    /* renamed from: j */
    public static boolean m129082j(int i11, long j11, double d11, String str, int i12, int i13) {
        int i14 = i11;
        if (i14 > 5) {
            i14 = 5;
        } else if (i14 < 0) {
            i14 = 0;
        }
        int[] iArr = f119173a;
        if (j11 > iArr[i14]) {
            return true;
        }
        if (d11 > 31.0d) {
            if (!str.contains("hevc") && !str.contains("h265")) {
                int i15 = i14 - 1;
                if (i15 <= 0) {
                    i15 = 0;
                }
                if (j11 <= iArr[i15] && i12 * i13 <= 3686400) {
                    return false;
                }
                return true;
            }
            int i16 = i14 - 2;
            if (i16 <= 0) {
                i16 = 0;
            }
            if (j11 <= iArr[i16] && i12 * i13 <= 2073600) {
                return false;
            }
            return true;
        }
        if (!str.contains("hevc") && !str.contains("h265")) {
            int i17 = i14 - 1;
            if (i17 <= 0) {
                i17 = 0;
            }
            if (j11 <= iArr[i17] && i12 * i13 <= 8294400) {
                return false;
            }
            return true;
        }
        int i18 = i14 - 1;
        if (i18 <= 0) {
            i18 = 0;
        }
        if (j11 <= iArr[i18] && i12 * i13 <= 3686400) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m129083k(String str, String str2, Integer num) {
        if (f119178f == null) {
            m129080h();
        }
        HashMap hashMap = (HashMap) f119178f.get(str.toUpperCase());
        if (hashMap == null) {
            return false;
        }
        Integer num2 = (Integer) hashMap.get("__ALL__");
        if (num2 != null && (num2.equals(num) || num2.equals(f119180h))) {
            return true;
        }
        Integer num3 = (Integer) hashMap.get(str2.toUpperCase());
        if (num3 == null) {
            return false;
        }
        if (!num3.equals(num) && !num3.equals(f119180h)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m129084l(String str, String str2, Integer num) {
        if (f119179g == null) {
            m129089q();
        }
        HashMap hashMap = (HashMap) f119179g.get(str.toUpperCase());
        if (hashMap == null) {
            return false;
        }
        Integer num2 = (Integer) hashMap.get("__ALL__");
        if (num2 != null && (num2.equals(num) || num2.equals(f119180h))) {
            return true;
        }
        Integer num3 = (Integer) hashMap.get(str2.toUpperCase());
        if (num3 == null) {
            return false;
        }
        if (!num3.equals(num) && !num3.equals(f119180h)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m129085m(String str) {
        if (TextUtils.isEmpty(str) || !m129086n()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (TextUtils.isEmpty(lowerCase) || m129079g(lowerCase) < 600) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m129086n() {
        String str = Build.MANUFACTURER;
        if ("LENOVO".equalsIgnoreCase(str)) {
            String str2 = Build.MODEL;
            if ("Lenovo S90-A".equalsIgnoreCase(str2) || "Lenovo S60-a".equalsIgnoreCase(str2) || Build.VERSION.SDK_INT < 22) {
                return false;
            }
            return true;
        }
        if ("YuLong".equalsIgnoreCase(str)) {
            return !"Coolpad A8".equalsIgnoreCase(Build.MODEL);
        }
        if ("asus".equalsIgnoreCase(str)) {
            String str3 = Build.MODEL;
            if ("ASUS_Z010D".equalsIgnoreCase(str3) || "ASUS_Z00RD".equalsIgnoreCase(str3)) {
                return false;
            }
            return true;
        }
        if ("LGE".equalsIgnoreCase(str)) {
            String str4 = Build.MODEL;
            if ("LG-H900".equalsIgnoreCase(str4) || "VS986".equalsIgnoreCase(str4) || "LG-H818".equalsIgnoreCase(str4) || "LG-F500S".equalsIgnoreCase(str4) || "LG-F460K".equals(str4) || "LG-D690".equals(str4)) {
                return false;
            }
            return true;
        }
        if ("HTC".equalsIgnoreCase(str)) {
            return !"0PJA2".equalsIgnoreCase(Build.MODEL);
        }
        if ("motorola".equalsIgnoreCase(str)) {
            return !"XT1092".equalsIgnoreCase(Build.MODEL);
        }
        if ("Sony".equalsIgnoreCase(str)) {
            return !"E6553".equalsIgnoreCase(Build.MODEL);
        }
        if (!"SHARP".equalsIgnoreCase(str)) {
            return true;
        }
        return !"404SH".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: o */
    public static boolean m129087o(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (!str.startsWith("video") || mediaCodecInfo.isEncoder()) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.US);
        if (lowerCase.startsWith("arc.")) {
            return true;
        }
        if (i11 <= 22) {
            String str2 = Build.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equalsIgnoreCase(lowerCase) || "OMX.Exynos.AVC.Decoder.secure".equalsIgnoreCase(lowerCase))) {
                return true;
            }
        }
        if ((Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equalsIgnoreCase(lowerCase)) || "OMX.MTK.VIDEO.DECODER.HEVC".equalsIgnoreCase(mediaCodecInfo.getName()) || lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        if (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static a m129088p(MediaCodecInfo mediaCodecInfo, String str) {
        int m129079g;
        if (!m129081i(str)) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name) || (m129079g = m129079g(name.toLowerCase(Locale.US))) < 600) {
            return null;
        }
        a aVar = new a();
        aVar.f119181a = mediaCodecInfo;
        aVar.f119182b = m129079g;
        aVar.f119183c = str;
        return aVar;
    }

    /* renamed from: q */
    private static void m129089q() {
        if (f119179g != null) {
            return;
        }
        f119179g = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put("SM-C710F", f119180h);
        f119179g.put("SAMSUNG", hashMap);
    }
}
