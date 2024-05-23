package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class w83 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m27579a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m27580b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
