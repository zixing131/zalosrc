package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.b */
/* loaded from: classes2.dex */
abstract class AbstractC5728b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m30171a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
