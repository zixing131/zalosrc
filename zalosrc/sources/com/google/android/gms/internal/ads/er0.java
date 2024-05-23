package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class er0 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ List f19757a;

    /* renamed from: b */
    final /* synthetic */ String f19758b;

    /* renamed from: c */
    final /* synthetic */ Uri f19759c;

    /* renamed from: d */
    final /* synthetic */ ir0 f19760d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public er0(ir0 ir0Var, List list, String str, Uri uri) {
        this.f19760d = ir0Var;
        this.f19757a = list;
        this.f19758b = str;
        this.f19759c = uri;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        yk0.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.f19759c)));
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f19760d.m23351r((Map) obj, this.f19757a, this.f19758b);
    }
}
