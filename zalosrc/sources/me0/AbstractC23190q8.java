package me0;

import android.content.Context;

/* renamed from: me0.q8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23190q8 {
    /* renamed from: a */
    public static String m119489a(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, new String(str));
        } catch (IllegalArgumentException e11) {
            throw e11;
        } catch (Exception unused) {
            return "";
        }
    }
}
