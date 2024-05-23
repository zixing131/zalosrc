package com.zing.zalocore.connection.socket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class NativeE2ee {
    private static native void NativeE2eeCleanCacheGroupE2ee(int i11, int i12, int i13, int i14);

    private static native int NativeE2eeEncryptVideoCtr(String str, String str2, byte[] bArr, byte[] bArr2);

    private static native void NativeE2eeHandleInitE2ee(byte[] bArr, int i11, int i12, int i13, int i14, long j11, Object obj);

    private static native void NativeE2eeHandleInitE2eeGroup(byte[] bArr, int i11, int i12, int i13, int i14, long j11, Object obj);

    /* renamed from: a */
    public static int m93169a() {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            return nativeGetLocalIdE2ee();
        }
        return -1;
    }

    /* renamed from: b */
    public static int m93170b(int i11, boolean z11) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            return nativeGenSenderGroupKeyE2ee(i11, z11);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m93171c(int i11) {
        if (LoaderUtils.m93166b()) {
            nativeE2eSetIsUseNewSubmitKey(i11);
        }
    }

    /* renamed from: d */
    public static void m93172d(int i11, int i12, int i13) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            nativeE2eeDeleteGroupKey(i11, i12, i13);
        }
    }

    /* renamed from: e */
    public static void m93173e(boolean z11, int i11) {
        if (LoaderUtils.m93166b()) {
            nativeSetE2eeConfig(z11 ? 1 : 0, i11);
        }
    }

    /* renamed from: f */
    public static void m93174f(byte[] bArr, int i11, int i12, int i13, int i14, long j11, NativeE2eeListener nativeE2eeListener) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            NativeE2eeHandleInitE2eeGroup(bArr, i11, i12, i13, i14, j11, nativeE2eeListener);
        } else {
            nativeE2eeListener.onRequestComplete(null, -1);
        }
    }

    /* renamed from: g */
    public static void m93175g(byte[] bArr, int i11, int i12, int i13, NativeE2eeListener nativeE2eeListener) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            nativeE2eeDecryptGroup(bArr, i11, i12, i13, nativeE2eeListener);
        } else {
            nativeE2eeListener.onRequestComplete(null, -1);
        }
    }

    /* renamed from: h */
    public static void m93176h(byte[] bArr, int i11, int i12, long j11, NativeE2eeListener nativeE2eeListener) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            nativeE2eeDecrypt(bArr, i11, i12, j11, nativeE2eeListener);
        } else {
            nativeE2eeListener.onRequestComplete(null, -1);
        }
    }

    /* renamed from: i */
    public static void m93177i(byte[] bArr, int i11, int i12, NativeE2eeListener nativeE2eeListener) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            nativeE2eeEncrypt(bArr, i11, i12, nativeE2eeListener);
        } else {
            nativeE2eeListener.onRequestComplete(null, -1);
        }
    }

    /* renamed from: j */
    public static void m93178j(int i11) {
        if (LoaderUtils.m93166b()) {
            nativeSetLimitCounter(i11);
        }
    }

    /* renamed from: k */
    public static void m93179k(int i11, int i12) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            nativeE2eeDeleteSession(i11, i12);
        }
    }

    /* renamed from: l */
    public static void m93180l(byte[] bArr, int i11, int i12, int i13, int i14, long j11, NativeE2eeListener nativeE2eeListener) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            NativeE2eeHandleInitE2ee(bArr, i11, i12, i13, i14, j11, nativeE2eeListener);
        } else {
            nativeE2eeListener.onRequestComplete(null, -1);
        }
    }

    /* renamed from: m */
    public static void m93181m(byte[] bArr, int i11, int i12, NativeE2eeListener nativeE2eeListener) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            nativeE2eeEncryptGroup(bArr, i11, i12, nativeE2eeListener);
        } else {
            nativeE2eeListener.onRequestComplete(null, -1);
        }
    }

    /* renamed from: n */
    public static boolean m93182n(int i11, int i12, int i13) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            return nativeE2eeHasGroupKey(i11, i12, i13);
        }
        return false;
    }

    private static native void nativeE2eSetIsUseNewSubmitKey(int i11);

    private static native void nativeE2eeDecrypt(byte[] bArr, int i11, int i12, long j11, Object obj);

    private static native void nativeE2eeDecryptGroup(byte[] bArr, int i11, int i12, int i13, Object obj);

    private static native void nativeE2eeDeleteGroupKey(int i11, int i12, int i13);

    private static native void nativeE2eeDeleteSession(int i11, int i12);

    private static native void nativeE2eeEncrypt(byte[] bArr, int i11, int i12, Object obj);

    private static native void nativeE2eeEncryptGroup(byte[] bArr, int i11, int i12, Object obj);

    private static native boolean nativeE2eeHasGroupKey(int i11, int i12, int i13);

    private static native int nativeE2eeHasSession(int i11, int i12);

    private static native int nativeGenSenderGroupKeyE2ee(int i11, boolean z11);

    private static native int nativeGetLocalIdE2ee();

    private static native int nativeGetLocalIdE2eeOfUid(int i11, int i12);

    private static native void nativeSetE2eeConfig(int i11, int i12);

    private static native void nativeSetLimitCounter(int i11);

    private static native void nativeSetLimitCounterGroup(int i11);

    private static native void nativeTestE2eeDeleteSession(int i11, int i12);

    /* renamed from: o */
    public static int m93183o(int i11, int i12) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            return nativeGetLocalIdE2eeOfUid(i11, i12);
        }
        return -1;
    }

    /* renamed from: p */
    public static void m93184p(int i11) {
        if (LoaderUtils.m93166b()) {
            nativeSetLimitCounterGroup(i11);
        }
    }

    /* renamed from: q */
    public static int m93185q(int i11, int i12) {
        if (LoaderUtils.m93166b() && NativeSocket.m93204B()) {
            return nativeE2eeHasSession(i11, i12);
        }
        return -2;
    }
}
