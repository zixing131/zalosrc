package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t70 implements c40 {

    /* renamed from: a */
    final /* synthetic */ b70 f28248a;

    /* renamed from: b */
    final /* synthetic */ zzca f28249b;

    /* renamed from: c */
    final /* synthetic */ h80 f28250c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t70(h80 h80Var, C4830od c4830od, b70 b70Var, zzca zzcaVar) {
        this.f28250c = h80Var;
        this.f28248a = b70Var;
        this.f28249b = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.c40, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        Object obj2;
        int i11;
        obj2 = this.f28250c.f21572a;
        synchronized (obj2) {
            try {
                yk0.zzi("JS Engine is requesting an update");
                i11 = this.f28250c.f21580i;
                if (i11 == 0) {
                    yk0.zzi("Starting reload.");
                    this.f28250c.f21580i = 2;
                    this.f28250c.m22726d(null);
                }
                this.f28248a.mo23137j0("/requestReload", this.f28249b.zza());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
