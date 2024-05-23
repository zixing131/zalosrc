package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class is2 implements z71 {

    /* renamed from: p */
    private final HashSet f22393p = new HashSet();

    /* renamed from: q */
    private final Context f22394q;

    /* renamed from: r */
    private final lk0 f22395r;

    public is2(Context context, lk0 lk0Var) {
        this.f22394q = context;
        this.f22395r = lk0Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final synchronized void mo20715a(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.f22395r.m24318h(this.f22393p);
        }
    }

    /* renamed from: b */
    public final Bundle m23385b() {
        return this.f22395r.m24320j(this.f22394q, this);
    }

    /* renamed from: c */
    public final synchronized void m23386c(HashSet hashSet) {
        this.f22393p.clear();
        this.f22393p.addAll(hashSet);
    }
}
