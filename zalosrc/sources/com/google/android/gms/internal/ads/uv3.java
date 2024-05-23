package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class uv3 {
    /* renamed from: a */
    public static final int m27072a(int i11, Object obj, Object obj2) {
        tv3 tv3Var = (tv3) obj;
        AbstractC30228a.m149044a(obj2);
        if (!tv3Var.isEmpty()) {
            Iterator it = tv3Var.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final boolean m27073b(Object obj) {
        if (!((tv3) obj).m26787f()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final Object m27074c(Object obj, Object obj2) {
        tv3 tv3Var = (tv3) obj;
        tv3 tv3Var2 = (tv3) obj2;
        if (!tv3Var2.isEmpty()) {
            if (!tv3Var.m26787f()) {
                tv3Var = tv3Var.m26784b();
            }
            tv3Var.m26786e(tv3Var2);
        }
        return tv3Var;
    }
}
