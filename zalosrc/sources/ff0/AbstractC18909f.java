package ff0;

import android.media.MediaCodecInfo;
import android.os.Build;

/* renamed from: ff0.f */
/* loaded from: classes5.dex */
public abstract class AbstractC18909f {
    /* renamed from: a */
    public static boolean m99113a(MediaCodecInfo mediaCodecInfo, boolean z11) {
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (mediaCodecInfo.isEncoder() || lowerCase.endsWith(".secure")) {
            return false;
        }
        if (!z11) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26 && lowerCase.equals("OMX.MTK.AUDIO.DECODER.RAW") && Build.DEVICE.equals("R9")) {
                return false;
            }
            if (i11 <= 23 && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(lowerCase)) {
                return false;
            }
            if (i11 <= 32 && "OMX.qti.audio.decoder.flac".equals(lowerCase)) {
                return false;
            }
            return true;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return false;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("arc.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 24 && (("OMX.SEC.aac.dec".equals(lowerCase) || "OMX.Exynos.AAC.Decoder".equals(lowerCase)) && "samsung".equals(Build.MANUFACTURER))) {
            String str = Build.DEVICE;
            if (str.startsWith("zeroflte") || str.startsWith("zerolte") || str.startsWith("zenlte") || "SC-05G".equals(str) || "marinelteatt".equals(str) || "404SC".equals(str) || "SC-04G".equals(str) || "SCV31".equals(str)) {
                return false;
            }
        }
        if (i12 <= 22) {
            String str2 = Build.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(lowerCase) || "OMX.Exynos.AVC.Decoder.secure".equals(lowerCase))) {
                return false;
            }
        }
        if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(lowerCase)) {
            return false;
        }
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(lowerCase) && "mcv5a".equals(Build.DEVICE)) {
            return false;
        }
        return true;
    }
}
