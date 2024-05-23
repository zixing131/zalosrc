package com.zing.zalo.zinstant.zom.node;

/* loaded from: classes.dex */
public class __ZOMMedia_zjni extends __ZOM_zjni {
    private static native int __getCurrentTimeMills(long j11);

    private static native void __onComplete(long j11);

    private static native void __onError(long j11, String str);

    private static native void __onPause(long j11);

    private static native void __onPlay(long j11);

    private static native void __onTimeChanged(long j11, int i11, int i12);

    private static native void __setDuration(long j11, int i11);

    public static ZOMMedia[] convertPointerArrayToZOMMediaArray(long[] jArr) {
        ZOMMedia[] zOMMediaArr = new ZOMMedia[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMMediaArr[i11] = (ZOMMedia) __ZOM_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMMediaArr;
    }

    public static int getCurrentTimeMills(ZOMMedia zOMMedia) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            return __getCurrentTimeMills(pointerFromObject);
        }
        return 0;
    }

    public static void onComplete(ZOMMedia zOMMedia) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            __onComplete(pointerFromObject);
        }
    }

    public static void onError(ZOMMedia zOMMedia, String str) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            __onError(pointerFromObject, str);
        }
    }

    public static void onPause(ZOMMedia zOMMedia) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            __onPause(pointerFromObject);
        }
    }

    public static void onPlay(ZOMMedia zOMMedia) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            __onPlay(pointerFromObject);
        }
    }

    public static void onTimeChanged(ZOMMedia zOMMedia, int i11, int i12) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            __onTimeChanged(pointerFromObject, i11, i12);
        }
    }

    private static void pause(long j11) {
        ZOMMedia zOMMedia = (ZOMMedia) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMMedia != null) {
            zOMMedia.pause();
        }
    }

    private static void play(long j11, int i11) {
        ZOMMedia zOMMedia = (ZOMMedia) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMMedia != null) {
            zOMMedia.play(i11);
        }
    }

    private static void seekTo(long j11, int i11) {
        ZOMMedia zOMMedia = (ZOMMedia) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMMedia != null) {
            zOMMedia.seekTo(i11);
        }
    }

    private static void setData(long j11, byte[] bArr, int i11) {
        ZOMMedia zOMMedia = (ZOMMedia) __ZOM_zjni.getObjectFromPointer(j11);
        if (zOMMedia != null) {
            zOMMedia.setData(bArr, i11);
        }
    }

    public static void setDuration(ZOMMedia zOMMedia, int i11) {
        long pointerFromObject = __ZOM_zjni.getPointerFromObject(zOMMedia);
        if (pointerFromObject != 0) {
            __setDuration(pointerFromObject, i11);
        }
    }
}
