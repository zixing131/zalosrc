package com.zing.zalo.zview;

import android.os.Bundle;
import com.zing.zalo.zview.ZaloView;
import p665y0.C30245g;

/* renamed from: com.zing.zalo.zview.t */
/* loaded from: classes.dex */
public abstract class AbstractC17504t {

    /* renamed from: a */
    private static final C30245g f89196a = new C30245g();

    /* renamed from: b */
    private static Class m93126b(ClassLoader classLoader, String str) {
        C30245g c30245g = f89196a;
        Class cls = (Class) c30245g.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c30245g.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: c */
    public static Class m93127c(ClassLoader classLoader, String str) {
        try {
            return m93126b(classLoader, str);
        } catch (ClassCastException e11) {
            throw new ZaloView.InstantiationException("Unable to instantiate zalo view " + str + ": make sure class is a valid subclass of ZaloView", e11);
        } catch (ClassNotFoundException e12) {
            throw new ZaloView.InstantiationException("Unable to instantiate zalo view " + str + ": make sure class name exists", e12);
        }
    }

    /* renamed from: a */
    public abstract ZaloView mo93098a(ClassLoader classLoader, String str, Bundle bundle);
}
