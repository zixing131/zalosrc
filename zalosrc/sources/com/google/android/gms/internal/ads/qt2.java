package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class qt2 {

    /* renamed from: a */
    private final jt2 f26952a;

    /* renamed from: b */
    private final tc3 f26953b;

    /* renamed from: c */
    private boolean f26954c = false;

    /* renamed from: d */
    private boolean f26955d = false;

    public qt2(final os2 os2Var, final it2 it2Var, final jt2 jt2Var) {
        this.f26952a = jt2Var;
        this.f26953b = kc3.m23875g(kc3.m23882n(it2Var.mo23391b(jt2Var), new qb3() { // from class: com.google.android.gms.internal.ads.ot2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return qt2.this.m25874b(it2Var, os2Var, jt2Var, (ws2) obj);
            }
        }, jt2Var.zzb()), Exception.class, new qb3() { // from class: com.google.android.gms.internal.ads.pt2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return qt2.this.m25875c(it2Var, (Exception) obj);
            }
        }, jt2Var.zzb());
    }

    /* renamed from: a */
    public final synchronized tc3 m25873a(jt2 jt2Var) {
        if (!this.f26955d && !this.f26954c) {
            if (this.f26952a.zza() != null && jt2Var.zza() != null && this.f26952a.zza().equals(jt2Var.zza())) {
                this.f26954c = true;
                return this.f26953b;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ tc3 m25874b(it2 it2Var, os2 os2Var, jt2 jt2Var, ws2 ws2Var) {
        synchronized (this) {
            try {
                this.f26955d = true;
                it2Var.mo23390a(ws2Var);
                if (!this.f26954c) {
                    os2Var.mo25251a(jt2Var.zza(), ws2Var);
                    return kc3.m23877i(null);
                }
                return kc3.m23877i(new ht2(ws2Var, jt2Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m25875c(it2 it2Var, Exception exc) {
        synchronized (this) {
            this.f26955d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void m25876d(gc3 gc3Var) {
        kc3.m23886r(kc3.m23882n(this.f26953b, new qb3() { // from class: com.google.android.gms.internal.ads.nt2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return kc3.m23878j();
            }
        }, this.f26952a.zzb()), gc3Var, this.f26952a.zzb());
    }
}
