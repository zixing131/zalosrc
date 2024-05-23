package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x80 implements q40 {

    /* renamed from: a */
    private final b80 f30383a;

    /* renamed from: b */
    private final pl0 f30384b;

    /* renamed from: c */
    final /* synthetic */ y80 f30385c;

    public x80(y80 y80Var, b80 b80Var, pl0 pl0Var) {
        this.f30385c = y80Var;
        this.f30383a = b80Var;
        this.f30384b = pl0Var;
    }

    @Override // com.google.android.gms.internal.ads.q40
    /* renamed from: a */
    public final void mo21975a(JSONObject jSONObject) {
        b80 b80Var;
        m80 m80Var;
        try {
            try {
                pl0 pl0Var = this.f30384b;
                m80Var = this.f30385c.f30831a;
                pl0Var.zzd(m80Var.mo24491a(jSONObject));
                b80Var = this.f30383a;
            } catch (IllegalStateException unused) {
                b80Var = this.f30383a;
            } catch (JSONException e11) {
                this.f30384b.zze(e11);
                b80Var = this.f30383a;
            }
            b80Var.m20433g();
        } catch (Throwable th2) {
            this.f30383a.m20433g();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final void zza(String str) {
        b80 b80Var;
        try {
            if (str == null) {
                this.f30384b.zze(new zzbtz());
            } else {
                this.f30384b.zze(new zzbtz(str));
            }
            b80Var = this.f30383a;
        } catch (IllegalStateException unused) {
            b80Var = this.f30383a;
        } catch (Throwable th2) {
            this.f30383a.m20433g();
            throw th2;
        }
        b80Var.m20433g();
    }
}
