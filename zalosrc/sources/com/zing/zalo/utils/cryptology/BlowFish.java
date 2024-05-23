package com.zing.zalo.utils.cryptology;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23044d5;

/* loaded from: classes4.dex */
public class BlowFish {

    /* renamed from: a */
    private long f84907a;

    public BlowFish(byte[] bArr) {
        AbstractC23044d5.m118231d(CoreUtility.getAppContext(), EnumC16739a.f84885b0);
        this.f84907a = nativeInitContext(bArr);
    }

    private static native long nativeDecrypt(long j11, long j12);

    private static native long nativeEncrypt(long j11, long j12);

    private static native long nativeInitContext(byte[] bArr);

    private static native long nativeReleaseContext(long j11);

    /* renamed from: a */
    public long m89290a(long j11) {
        return nativeDecrypt(this.f84907a, j11);
    }

    /* renamed from: b */
    public long m89291b(long j11) {
        return nativeEncrypt(this.f84907a, j11);
    }

    /* renamed from: c */
    public void m89292c() {
        try {
            long j11 = this.f84907a;
            if (j11 != 0) {
                nativeReleaseContext(j11);
                this.f84907a = 0L;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    protected void finalize() {
        m89292c();
        super.finalize();
    }
}
