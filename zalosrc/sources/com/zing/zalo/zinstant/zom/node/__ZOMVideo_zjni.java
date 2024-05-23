package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMVideo_zjni extends __ZOM_zjni {
    private static ZOMVideo _$create(long j11) {
        ZOMVideo zOMVideo = new ZOMVideo();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMVideo, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMVideo));
        }
        return zOMVideo;
    }

    public static ZOMVideo[] convertPointerArrayToZOMVideoArray(long[] jArr) {
        ZOMVideo[] zOMVideoArr = new ZOMVideo[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMVideoArr[i11] = (ZOMVideo) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMVideoArr;
    }

    private static void setData(long j11, byte[] bArr, byte[] bArr2, int i11) {
        ZOMVideo zOMVideo = (ZOMVideo) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMVideo != null) {
            zOMVideo.setData(bArr, bArr2, i11);
        }
    }
}
