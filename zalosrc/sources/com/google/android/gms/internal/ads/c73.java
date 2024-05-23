package com.google.android.gms.internal.ads;

import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class c73 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20815a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
