package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzch {
    private static List zzb;
    private static final Map zza = new HashMap();
    private static final Object zzc = new Object();

    public static List zza(String str) {
        ArrayList arrayList;
        int maxSupportedInstances;
        Object obj = zzc;
        synchronized (obj) {
            Map map = zza;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (zzb == null) {
                            zzb = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : zzb) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                hashMap.put("profileLevels", arrayList2);
                                int i11 = Build.VERSION.SDK_INT;
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap.put("bitRatesBps", zzb(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", zzb(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", zzb(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", zzb(videoCapabilities.getSupportedHeights()));
                                if (i11 >= 23) {
                                    maxSupportedInstances = capabilitiesForType.getMaxSupportedInstances();
                                    hashMap.put("instancesLimit", Integer.valueOf(maxSupportedInstances));
                                }
                                arrayList.add(hashMap);
                            }
                        }
                        zza.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e11) {
                e = e11;
                HashMap hashMap2 = new HashMap();
                hashMap2.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                zza.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e12) {
                e = e12;
                HashMap hashMap22 = new HashMap();
                hashMap22.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(hashMap22);
                zza.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    @TargetApi(21)
    private static Integer[] zzb(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
