package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rg2 implements sh2 {

    /* renamed from: a */
    private final uc3 f27205a;

    /* renamed from: b */
    private final ScheduledExecutorService f27206b;

    /* renamed from: c */
    private final j92 f27207c;

    /* renamed from: d */
    private final Context f27208d;

    /* renamed from: e */
    private final dr2 f27209e;

    /* renamed from: f */
    private final a92 f27210f;

    /* renamed from: g */
    private final wq1 f27211g;

    /* renamed from: h */
    final String f27212h;

    public rg2(uc3 uc3Var, ScheduledExecutorService scheduledExecutorService, String str, j92 j92Var, Context context, dr2 dr2Var, a92 a92Var, wq1 wq1Var) {
        this.f27205a = uc3Var;
        this.f27206b = scheduledExecutorService;
        this.f27212h = str;
        this.f27207c = j92Var;
        this.f27208d = context;
        this.f27209e = dr2Var;
        this.f27210f = a92Var;
        this.f27211g = wq1Var;
    }

    /* renamed from: a */
    public static /* synthetic */ tc3 m26077a(rg2 rg2Var) {
        String str;
        Bundle bundle;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21445z8)).booleanValue()) {
            str = rg2Var.f27209e.f19400f.toLowerCase(Locale.ROOT);
        } else {
            str = rg2Var.f27209e.f19400f;
        }
        Map m23570a = rg2Var.f27207c.m23570a(rg2Var.f27212h, str);
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((f83) m23570a).entrySet().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle3 = rg2Var.f27209e.f19398d.zzm;
            if (bundle3 != null) {
                bundle2 = bundle3.getBundle(str2);
            }
            arrayList.add(rg2Var.m26078c(str2, list, bundle2, true, true));
        }
        Iterator it2 = ((f83) rg2Var.f27207c.m23571b()).entrySet().iterator();
        while (it2.hasNext()) {
            n92 n92Var = (n92) ((Map.Entry) it2.next()).getValue();
            String str3 = n92Var.f25089a;
            Bundle bundle4 = rg2Var.f27209e.f19398d.zzm;
            if (bundle4 != null) {
                bundle = bundle4.getBundle(str3);
            } else {
                bundle = null;
            }
            arrayList.add(rg2Var.m26078c(str3, Collections.singletonList(n92Var.f25092d), bundle, n92Var.f25090b, n92Var.f25091c));
        }
        return kc3.m23871c(arrayList).m23601a(new Callable() { // from class: com.google.android.gms.internal.ads.og2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<tc3> list2 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (tc3 tc3Var : list2) {
                    if (((JSONObject) tc3Var.get()) != null) {
                        jSONArray.put(tc3Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new sg2(jSONArray.toString());
            }
        }, rg2Var.f27205a);
    }

    /* renamed from: c */
    private final ac3 m26078c(final String str, final List list, final Bundle bundle, final boolean z11, final boolean z12) {
        ac3 m20071D = ac3.m20071D(kc3.m23880l(new pb3() { // from class: com.google.android.gms.internal.ads.pg2
            @Override // com.google.android.gms.internal.ads.pb3
            public final tc3 zza() {
                return rg2.this.m26079b(str, list, bundle, z11, z12);
            }
        }, this.f27205a));
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21368s1)).booleanValue()) {
            m20071D = (ac3) kc3.m23883o(m20071D, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21298l1)).longValue(), TimeUnit.MILLISECONDS, this.f27206b);
        }
        return (ac3) kc3.m23874f(m20071D, Throwable.class, new y43() { // from class: com.google.android.gms.internal.ads.qg2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                yk0.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f27205a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ tc3 m26079b(String str, List list, Bundle bundle, boolean z11, boolean z12) {
        pb0 pb0Var;
        pb0 m27689b;
        pl0 pl0Var = new pl0();
        if (z12) {
            this.f27210f.m20038b(str);
            m27689b = this.f27210f.m20037a(str);
        } else {
            try {
                m27689b = this.f27211g.m27689b(str);
            } catch (RemoteException e11) {
                yk0.zzh("Couldn't create RTB adapter : ", e11);
                pb0Var = null;
            }
        }
        pb0Var = m27689b;
        if (pb0Var == null) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21318n1)).booleanValue()) {
                m92.m24498N(str, pl0Var);
            } else {
                throw null;
            }
        } else {
            final m92 m92Var = new m92(str, pb0Var, pl0Var);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21368s1)).booleanValue()) {
                this.f27206b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.ng2
                    @Override // java.lang.Runnable
                    public final void run() {
                        m92.this.zzc();
                    }
                }, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21298l1)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z11) {
                pb0Var.mo20066c4(BinderC4273d.m19913I3(this.f27208d), this.f27212h, bundle, (Bundle) list.get(0), this.f27209e.f19399e, m92Var);
            } else {
                m92Var.zzd();
            }
        }
        return pl0Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23880l(new pb3() { // from class: com.google.android.gms.internal.ads.lg2
            @Override // com.google.android.gms.internal.ads.pb3
            public final tc3 zza() {
                return rg2.m26077a(rg2.this);
            }
        }, this.f27205a);
    }
}
