package com.google.common.collect;

/* renamed from: com.google.common.collect.b */
/* loaded from: classes3.dex */
abstract class AbstractC6518b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m33406a(int i11) {
        return (int) (Integer.rotateLeft((int) (i11 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m33407b(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m33406a(hashCode);
    }
}
