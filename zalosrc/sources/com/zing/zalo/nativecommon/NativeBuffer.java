package com.zing.zalo.nativecommon;

/* loaded from: classes4.dex */
public class NativeBuffer {

    /* renamed from: a */
    private static final String f48387a = NativeBuffer.class.toString();

    private native long nativeCreateBuffer();

    private native void nativeReleasePtr(long j11);

    private native void nativeSaveFile(long j11);

    private native void nativeSetFilePath(long j11, String str);

    private native void nativeWriteByte(long j11, byte[] bArr, int i11);
}
