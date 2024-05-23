package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ct2 {

    /* renamed from: a */
    private final HashMap f18541a = new HashMap();

    /* renamed from: a */
    public final bt2 m21016a(ss2 ss2Var, Context context, ks2 ks2Var, it2 it2Var) {
        bt2 bt2Var = (bt2) this.f18541a.get(ss2Var);
        if (bt2Var == null) {
            ps2 ps2Var = new ps2(zzffx.m28812t(ss2Var, context));
            bt2 bt2Var2 = new bt2(ps2Var, new kt2(ps2Var, ks2Var, it2Var));
            this.f18541a.put(ss2Var, bt2Var2);
            return bt2Var2;
        }
        return bt2Var;
    }
}
