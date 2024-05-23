package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public abstract class ne3 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f25164a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static me3 m24909a(String str) {
        Iterator it = f25164a.iterator();
        if (it.hasNext()) {
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
