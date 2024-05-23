package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class sf0 implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f27661a;

    /* renamed from: b */
    final /* synthetic */ uf0 f27662b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sf0(uf0 uf0Var, Context context) {
        this.f27662b = uf0Var;
        this.f27661a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        WeakHashMap weakHashMap;
        rf0 m25700a;
        WeakHashMap weakHashMap2;
        weakHashMap = this.f27662b.f28844a;
        tf0 tf0Var = (tf0) weakHashMap.get(this.f27661a);
        if (tf0Var != null && tf0Var.f28302a + ((Long) AbstractC4851oy.f25991a.m24091e()).longValue() >= zzt.zzB().mo105913a()) {
            m25700a = new qf0(this.f27661a, tf0Var.f28303b).m25700a();
        } else {
            m25700a = new qf0(this.f27661a).m25700a();
        }
        uf0 uf0Var = this.f27662b;
        weakHashMap2 = uf0Var.f28844a;
        weakHashMap2.put(this.f27661a, new tf0(uf0Var, m25700a));
        return m25700a;
    }
}
