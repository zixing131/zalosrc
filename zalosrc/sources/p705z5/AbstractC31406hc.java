package p705z5;

import android.os.SystemClock;

/* renamed from: z5.hc */
/* loaded from: classes2.dex */
public abstract class AbstractC31406hc {
    /* renamed from: a */
    public static void m152248a(C31615wb c31615wb, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        c31615wb.m152362c(m152249b(i11, i12, j11, i13, i14, i15, i16), EnumC31360e8.INPUT_IMAGE_CONSTRUCTION);
    }

    /* renamed from: b */
    private static C31392gc m152249b(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        return new C31392gc(i11, i12, i15, i13, i14, SystemClock.elapsedRealtime() - j11, i16);
    }
}
