package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class hx0 extends zzcl {

    /* renamed from: A */
    private final vr2 f21936A;

    /* renamed from: B */
    private boolean f21937B = false;

    /* renamed from: p */
    private final Context f21938p;

    /* renamed from: q */
    private final zzcgv f21939q;

    /* renamed from: r */
    private final wq1 f21940r;

    /* renamed from: s */
    private final e32 f21941s;

    /* renamed from: t */
    private final j92 f21942t;

    /* renamed from: u */
    private final hv1 f21943u;

    /* renamed from: v */
    private final dj0 f21944v;

    /* renamed from: w */
    private final br1 f21945w;

    /* renamed from: x */
    private final cw1 f21946x;

    /* renamed from: y */
    private final C5001sz f21947y;

    /* renamed from: z */
    private final xw2 f21948z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hx0(Context context, zzcgv zzcgvVar, wq1 wq1Var, e32 e32Var, j92 j92Var, hv1 hv1Var, dj0 dj0Var, br1 br1Var, cw1 cw1Var, C5001sz c5001sz, xw2 xw2Var, vr2 vr2Var) {
        this.f21938p = context;
        this.f21939q = zzcgvVar;
        this.f21940r = wq1Var;
        this.f21941s = e32Var;
        this.f21942t = j92Var;
        this.f21943u = hv1Var;
        this.f21944v = dj0Var;
        this.f21945w = br1Var;
        this.f21946x = cw1Var;
        this.f21947y = c5001sz;
        this.f21948z = xw2Var;
        this.f21936A = vr2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m23061N(Runnable runnable) {
        AbstractC4205o.m19717f("Adapters must be initialized on the main thread.");
        Map m20557e = zzt.zzo().m22936h().zzh().m20557e();
        if (m20557e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                yk0.zzk("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (!this.f21940r.m27691d()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it = m20557e.values().iterator();
        while (it.hasNext()) {
            for (p90 p90Var : ((q90) it.next()).f26679a) {
                String str = p90Var.f26123k;
                for (String str2 : p90Var.f26115c) {
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, new ArrayList());
                    }
                    if (str != null) {
                        ((Collection) hashMap.get(str2)).add(str);
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            try {
                f32 mo21611a = this.f21941s.mo21611a(str3, jSONObject);
                if (mo21611a != null) {
                    yr2 yr2Var = (yr2) mo21611a.f19949b;
                    if (!yr2Var.m28304a() && yr2Var.m28303C()) {
                        yr2Var.m28316m(this.f21938p, (y42) mo21611a.f19950c, (List) entry.getValue());
                        yk0.zze("Initialized rewarded video mediation adapter " + str3);
                    }
                }
            } catch (zzfek e11) {
                yk0.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m23062a() {
        this.f21947y.m26457a(new xe0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        if (zzt.zzo().m22936h().zzO()) {
            if (!zzt.zzs().zzj(this.f21938p, zzt.zzo().m22936h().zzl(), this.f21939q.f32030p)) {
                zzt.zzo().m22936h().zzB(false);
                zzt.zzo().m22936h().zzA("");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        fs2.m22158b(this.f21938p, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return this.f21939q.f32030p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        return this.f21943u.m23044g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        this.f21942t.m23574f(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        this.f21943u.m23045l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzj() {
        if (this.f21937B) {
            yk0.zzj("Mobile ads is initialized already.");
            return;
        }
        AbstractC4554gx.m22622c(this.f21938p);
        zzt.zzo().m22943r(this.f21938p, this.f21939q);
        zzt.zzc().m27995i(this.f21938p);
        this.f21937B = true;
        this.f21943u.m23051r();
        this.f21942t.m23572d();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21240f3)).booleanValue()) {
            this.f21945w.m20654c();
        }
        this.f21946x.m21176g();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
            kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dx0
                @Override // java.lang.Runnable
                public final void run() {
                    hx0.this.zzb();
                }
            });
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20950B8)).booleanValue()) {
            kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cx0
                @Override // java.lang.Runnable
                public final void run() {
                    hx0.this.m23062a();
                }
            });
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21349q2)).booleanValue()) {
            kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ex0
                @Override // java.lang.Runnable
                public final void run() {
                    hx0.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, InterfaceC4271b interfaceC4271b) {
        String str2;
        String str3;
        Runnable runnable;
        AbstractC4554gx.m22622c(this.f21938p);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21260h3)).booleanValue()) {
            zzt.zzp();
            str2 = zzs.zzo(this.f21938p);
        } else {
            str2 = "";
        }
        boolean z11 = true;
        if (true != TextUtils.isEmpty(str2)) {
            str3 = str2;
        } else {
            str3 = str;
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21230e3)).booleanValue();
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21032K0;
        boolean booleanValue2 = booleanValue | ((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue();
        if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
            final Runnable runnable2 = (Runnable) BinderC4273d.m19914Q(interfaceC4271b);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.fx0
                @Override // java.lang.Runnable
                public final void run() {
                    final hx0 hx0Var = hx0.this;
                    final Runnable runnable3 = runnable2;
                    kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gx0
                        @Override // java.lang.Runnable
                        public final void run() {
                            hx0.this.m23061N(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z11 = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z11) {
            zzt.zza().zza(this.f21938p, this.f21939q, str3, runnable3, this.f21948z);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
        this.f21946x.m21177h(zzcyVar, bw1.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(InterfaceC4271b interfaceC4271b, String str) {
        if (interfaceC4271b == null) {
            yk0.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        if (context == null) {
            yk0.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzasVar = new zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.f21939q.f32030p);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(v90 v90Var) {
        this.f21936A.m27339e(v90Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzo(boolean z11) {
        zzt.zzr().zzc(z11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzp(float f11) {
        zzt.zzr().zzd(f11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzq(String str) {
        AbstractC4554gx.m22622c(this.f21938p);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21230e3)).booleanValue()) {
                zzt.zza().zza(this.f21938p, this.f21939q, str, null, this.f21948z);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(i60 i60Var) {
        this.f21943u.m23052s(i60Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) {
        this.f21944v.m21421v(this.f21938p, zzezVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized boolean zzt() {
        return zzt.zzr().zze();
    }
}
