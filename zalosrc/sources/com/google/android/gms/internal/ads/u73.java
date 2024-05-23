package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class u73 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m26863a(int i11) {
        return (int) (Integer.rotateLeft((int) (i11 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m26864b(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m26863a(hashCode);
    }
}
