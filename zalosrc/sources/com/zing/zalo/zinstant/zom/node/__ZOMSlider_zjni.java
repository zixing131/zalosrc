package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMIndicator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class __ZOMSlider_zjni extends __ZOMContainer_zjni {
    private static ZOMSlider _$create(long j11) {
        ZOMSlider zOMSlider = new ZOMSlider();
        synchronized (__ZOM_zjni.__LOCK) {
            __ZOM_zjni._privateStorage.put(zOMSlider, Long.valueOf(j11));
            __ZOM_zjni._privateStorageInverse.put(Long.valueOf(j11), new WeakReference<>(zOMSlider));
        }
        return zOMSlider;
    }

    private static native void __nativeEndScroll(long j11);

    private static native void __nativeFallbackItemsIndexVisible(long j11, long j12, int[] iArr);

    private static native void __nativeOnScroll(long j11);

    private static native void __nativeWillDisplayItem(long j11, int i11);

    private static native void __nativeWillEndDisplayItem(long j11, int i11);

    public static ZOMSlider[] convertPointerArrayToZOMSliderArray(long[] jArr) {
        ZOMSlider[] zOMSliderArr = new ZOMSlider[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMSliderArr[i11] = (ZOMSlider) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMSliderArr;
    }

    public static void nativeEndScroll(ZOMSlider zOMSlider) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMSlider);
        if (pointerFromObject != 0) {
            __nativeEndScroll(pointerFromObject);
        }
    }

    public static void nativeFallbackItemsIndexVisible(ZOMSlider zOMSlider, long j11, int[] iArr) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMSlider);
        if (pointerFromObject != 0) {
            __nativeFallbackItemsIndexVisible(pointerFromObject, j11, iArr);
        }
    }

    public static void nativeOnScroll(ZOMSlider zOMSlider) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMSlider);
        if (pointerFromObject != 0) {
            __nativeOnScroll(pointerFromObject);
        }
    }

    public static void nativeWillDisplayItem(ZOMSlider zOMSlider, int i11) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMSlider);
        if (pointerFromObject != 0) {
            __nativeWillDisplayItem(pointerFromObject, i11);
        }
    }

    public static void nativeWillEndDisplayItem(ZOMSlider zOMSlider, int i11) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMSlider);
        if (pointerFromObject != 0) {
            __nativeWillEndDisplayItem(pointerFromObject, i11);
        }
    }

    private static void requireItemsIndexVisible(long j11, long j12) {
        ZOMSlider zOMSlider = (ZOMSlider) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMSlider != null) {
            zOMSlider.requireItemsIndexVisible(j12);
        }
    }

    private static void scrollToItemAtIndex(long j11, int i11, int i12) {
        ZOMSlider zOMSlider = (ZOMSlider) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMSlider != null) {
            zOMSlider.scrollToItemAtIndex(i11, i12);
        }
    }

    private static void setData(long j11, int i11, int i12, int i13, ZOMIndicator zOMIndicator, int i14, int i15, boolean z11, boolean z12, boolean z13, boolean z14) {
        ZOMSlider zOMSlider = (ZOMSlider) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMSlider != null) {
            zOMSlider.setData(i11, i12, i13, zOMIndicator, i14, i15, z11, z12, z13, z14);
        }
    }
}
