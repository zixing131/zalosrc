package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f90 implements q40 {

    /* renamed from: a */
    private final pl0 f20072a;

    /* renamed from: b */
    final /* synthetic */ g90 f20073b;

    public f90(g90 g90Var, pl0 pl0Var) {
        this.f20073b = g90Var;
        this.f20072a = pl0Var;
    }

    @Override // com.google.android.gms.internal.ads.q40
    /* renamed from: a */
    public final void mo21975a(JSONObject jSONObject) {
        try {
            this.f20072a.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e11) {
            this.f20072a.zze(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f20072a.zze(new zzbtz());
            } else {
                this.f20072a.zze(new zzbtz(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
