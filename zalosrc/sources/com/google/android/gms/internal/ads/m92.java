package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m92 extends rb0 {

    /* renamed from: p */
    private final String f24435p;

    /* renamed from: q */
    private final pb0 f24436q;

    /* renamed from: r */
    private final pl0 f24437r;

    /* renamed from: s */
    private final JSONObject f24438s;

    /* renamed from: t */
    private boolean f24439t;

    public m92(String str, pb0 pb0Var, pl0 pl0Var) {
        JSONObject jSONObject = new JSONObject();
        this.f24438s = jSONObject;
        this.f24439t = false;
        this.f24437r = pl0Var;
        this.f24435p = str;
        this.f24436q = pb0Var;
        try {
            jSONObject.put("adapter_version", pb0Var.zzf().toString());
            jSONObject.put("sdk_version", pb0Var.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* renamed from: N */
    public static synchronized void m24498N(String str, pl0 pl0Var) {
        synchronized (m92.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21378t1)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    pl0Var.zzd(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Q */
    private final synchronized void m24499Q(String str, int i11) {
        if (this.f24439t) {
            return;
        }
        try {
            this.f24438s.put("signal_error", str);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21378t1)).booleanValue()) {
                this.f24438s.put("signal_error_code", i11);
            }
        } catch (JSONException unused) {
        }
        this.f24437r.zzd(this.f24438s);
        this.f24439t = true;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    /* renamed from: W */
    public final synchronized void mo24500W(zze zzeVar) {
        m24499Q(zzeVar.zzb, 2);
    }

    @Override // com.google.android.gms.internal.ads.sb0
    /* renamed from: c */
    public final synchronized void mo24501c(String str) {
        if (this.f24439t) {
            return;
        }
        if (str == null) {
            mo24502j("Adapter returned null signals");
            return;
        }
        try {
            this.f24438s.put("signals", str);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21378t1)).booleanValue()) {
                this.f24438s.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f24437r.zzd(this.f24438s);
        this.f24439t = true;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    /* renamed from: j */
    public final synchronized void mo24502j(String str) {
        m24499Q(str, 2);
    }

    public final synchronized void zzc() {
        m24499Q("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f24439t) {
            return;
        }
        try {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21378t1)).booleanValue()) {
                this.f24438s.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f24437r.zzd(this.f24438s);
        this.f24439t = true;
    }
}
