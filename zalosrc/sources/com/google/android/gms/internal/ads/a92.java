package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a92 {

    /* renamed from: a */
    private final ConcurrentHashMap f16980a = new ConcurrentHashMap();

    /* renamed from: b */
    private final wq1 f16981b;

    public a92(wq1 wq1Var) {
        this.f16981b = wq1Var;
    }

    /* renamed from: a */
    public final pb0 m20037a(String str) {
        if (this.f16980a.containsKey(str)) {
            return (pb0) this.f16980a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void m20038b(String str) {
        try {
            this.f16980a.put(str, this.f16981b.m27689b(str));
        } catch (RemoteException e11) {
            yk0.zzh("Couldn't create RTB adapter : ", e11);
        }
    }
}
