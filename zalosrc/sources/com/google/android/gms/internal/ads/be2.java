package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class be2 implements sh2 {

    /* renamed from: a */
    private final uc3 f17717a;

    /* renamed from: b */
    private final br1 f17718b;

    /* renamed from: c */
    private final String f17719c;

    /* renamed from: d */
    private final dr2 f17720d;

    public be2(uc3 uc3Var, br1 br1Var, dr2 dr2Var, String str) {
        this.f17717a = uc3Var;
        this.f17718b = br1Var;
        this.f17720d = dr2Var;
        this.f17719c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ce2 m20489a() {
        return new ce2(this.f17718b.m20653b(this.f17720d.f19400f, this.f17719c), this.f17718b.m20652a());
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f17717a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ae2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return be2.this.m20489a();
            }
        });
    }
}
