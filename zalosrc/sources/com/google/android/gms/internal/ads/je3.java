package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class je3 {
    /* renamed from: a */
    public static ie3 m23608a(String str) {
        ie3 ie3Var = (ie3) df3.m21376j().get(str);
        if (ie3Var != null) {
            return ie3Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
