package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class pz1 {

    /* renamed from: a */
    private final uc3 f26575a;

    /* renamed from: b */
    private final xy1 f26576b;

    /* renamed from: c */
    private final d04 f26577c;

    public pz1(uc3 uc3Var, xy1 xy1Var, d04 d04Var) {
        this.f26575a = uc3Var;
        this.f26576b = xy1Var;
        this.f26577c = d04Var;
    }

    /* renamed from: g */
    private final tc3 m25614g(final zzcbc zzcbcVar, oz1 oz1Var, final oz1 oz1Var2, final qb3 qb3Var) {
        tc3 m23875g;
        String str = zzcbcVar.f32004s;
        zzt.zzp();
        if (zzs.zzy(str)) {
            m23875g = kc3.m23876h(new zzedj(1));
        } else {
            m23875g = kc3.m23875g(oz1Var.mo23472a(zzcbcVar), ExecutionException.class, new qb3() { // from class: com.google.android.gms.internal.ads.gz1
                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return kc3.m23876h(((ExecutionException) obj).getCause());
                }
            }, this.f26575a);
        }
        return kc3.m23875g(kc3.m23882n(ac3.m20071D(m23875g), qb3Var, this.f26575a), zzedj.class, new qb3() { // from class: com.google.android.gms.internal.ads.nz1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return pz1.this.m25616b(oz1Var2, zzcbcVar, qb3Var, (zzedj) obj);
            }
        }, this.f26575a);
    }

    /* renamed from: a */
    public final tc3 m25615a(final zzcbc zzcbcVar) {
        qb3 qb3Var = new qb3() { // from class: com.google.android.gms.internal.ads.kz1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                zzcbc zzcbcVar2 = zzcbc.this;
                zzcbcVar2.f32010y = new String(ea3.m21652a((InputStream) obj), w43.f29782c);
                return kc3.m23877i(zzcbcVar2);
            }
        };
        final xy1 xy1Var = this.f26576b;
        return m25614g(zzcbcVar, new oz1() { // from class: com.google.android.gms.internal.ads.lz1
            @Override // com.google.android.gms.internal.ads.oz1
            /* renamed from: a */
            public final tc3 mo23472a(zzcbc zzcbcVar2) {
                return xy1.this.m28078b(zzcbcVar2);
            }
        }, new oz1() { // from class: com.google.android.gms.internal.ads.mz1
            @Override // com.google.android.gms.internal.ads.oz1
            /* renamed from: a */
            public final tc3 mo23472a(zzcbc zzcbcVar2) {
                return pz1.this.m25617c(zzcbcVar2);
            }
        }, qb3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ tc3 m25616b(oz1 oz1Var, zzcbc zzcbcVar, qb3 qb3Var, zzedj zzedjVar) {
        return kc3.m23882n(oz1Var.mo23472a(zzcbcVar), qb3Var, this.f26575a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m25617c(zzcbc zzcbcVar) {
        return ((h02) this.f26577c.zzb()).m22664N(zzcbcVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ tc3 m25618d(zzcbc zzcbcVar) {
        String str;
        xy1 xy1Var = this.f26576b;
        if (((Boolean) AbstractC4482ez.f19863d.m24091e()).booleanValue()) {
            str = zzcbcVar.f32008w;
        } else {
            str = zzcbcVar.f32010y;
        }
        return xy1Var.m28079c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ tc3 m25619e(zzcbc zzcbcVar) {
        String str;
        h02 h02Var = (h02) this.f26577c.zzb();
        if (((Boolean) AbstractC4482ez.f19863d.m24091e()).booleanValue()) {
            str = zzcbcVar.f32008w;
        } else {
            str = zzcbcVar.f32010y;
        }
        return h02Var.m22666W4(str);
    }

    /* renamed from: f */
    public final tc3 m25620f(zzcbc zzcbcVar) {
        if (AbstractC4831oe.m25172g(zzcbcVar.f32010y)) {
            return kc3.m23876h(new zzebh(2, "Pool key missing from removeUrl call."));
        }
        return m25614g(zzcbcVar, new oz1() { // from class: com.google.android.gms.internal.ads.iz1
            @Override // com.google.android.gms.internal.ads.oz1
            /* renamed from: a */
            public final tc3 mo23472a(zzcbc zzcbcVar2) {
                return pz1.this.m25618d(zzcbcVar2);
            }
        }, new oz1() { // from class: com.google.android.gms.internal.ads.jz1
            @Override // com.google.android.gms.internal.ads.oz1
            /* renamed from: a */
            public final tc3 mo23472a(zzcbc zzcbcVar2) {
                return pz1.this.m25619e(zzcbcVar2);
            }
        }, new qb3() { // from class: com.google.android.gms.internal.ads.hz1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return kc3.m23877i(null);
            }
        });
    }
}
