package com.zing.zalo.zinstant.zom.node;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMImage_zjni extends __ZOM_zjni {
    private static ZOMImage _$create(long j11) {
        ZOMImage zOMImage = new ZOMImage();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMImage, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMImage));
        }
        return zOMImage;
    }

    public static ZOMImage[] convertPointerArrayToZOMImageArray(long[] jArr) {
        ZOMImage[] zOMImageArr = new ZOMImage[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMImageArr[i11] = (ZOMImage) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMImageArr;
    }

    private static void setData(long j11, byte[] bArr, byte[] bArr2, int i11, int i12, boolean z11, int i13, boolean z12, Object[] objArr, int i14, boolean z13) {
        ZOMImage zOMImage = (ZOMImage) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMImage != null) {
            zOMImage.setData(bArr, bArr2, i11, i12, z11, i13, z12, objArr, i14, z13);
        }
    }
}
