package com.zing.zalo.p062db;

/* loaded from: classes3.dex */
public class BackupRestoreUtils {
    /* renamed from: a */
    public static int m41398a(String str, String str2, String str3) {
        return decodeFile(str, str2, str3.getBytes());
    }

    public static native long compress(String str, String str2);

    public static native long compressWithLevel(String str, String str2, int i11);

    public static native int convertAndroidDbtoCross(String str, String str2, String str3, long j11, int i11);

    public static native int convertIosDbtoCross(String str, String str2, String str3, long j11, int i11);

    public static native long deCompress(String str, String str2);

    public static native int decodeFile(String str, String str2, byte[] bArr);

    public static native int decrypt(String str, String str2, byte[] bArr, int i11);

    public static native int encodeFile(String str, String str2, byte[] bArr, int i11);

    public static native int encrypt(String str, String str2, byte[] bArr, int i11);

    public static native int moduleBackup(long j11, String str, int[] iArr, String[] strArr);

    @Deprecated
    public static native int moduleCleanDatabase(long j11, String str, String[] strArr);

    @Deprecated
    public static native int moduleCleanFileDatabase(String str, String str2, String[] strArr);

    @Deprecated
    public static native int moduleResizeDatabase(String str, int i11, String[] strArr);
}
