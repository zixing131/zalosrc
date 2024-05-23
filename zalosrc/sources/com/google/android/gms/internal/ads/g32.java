package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class g32 {

    /* renamed from: c */
    private final String f20383c;

    /* renamed from: d */
    private lq2 f20384d = null;

    /* renamed from: e */
    private iq2 f20385e = null;

    /* renamed from: f */
    private zzu f20386f = null;

    /* renamed from: b */
    private final Map f20382b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    private final List f20381a = Collections.synchronizedList(new ArrayList());

    public g32(String str) {
        this.f20383c = str;
    }

    /* renamed from: h */
    private final void m22267h(iq2 iq2Var, long j11, zze zzeVar, boolean z11) {
        String str = iq2Var.f22352x;
        if (!this.f20382b.containsKey(str)) {
            return;
        }
        if (this.f20385e == null) {
            this.f20385e = iq2Var;
        }
        zzu zzuVar = (zzu) this.f20382b.get(str);
        zzuVar.zzb = j11;
        zzuVar.zzc = zzeVar;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21117S5)).booleanValue() && z11) {
            this.f20386f = zzuVar;
        }
    }

    /* renamed from: a */
    public final zzu m22268a() {
        return this.f20386f;
    }

    /* renamed from: b */
    public final o71 m22269b() {
        return new o71(this.f20385e, "", this, this.f20384d, this.f20383c);
    }

    /* renamed from: c */
    public final List m22270c() {
        return this.f20381a;
    }

    /* renamed from: d */
    public final void m22271d(iq2 iq2Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = iq2Var.f22352x;
        if (this.f20382b.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = iq2Var.f22351w.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, iq2Var.f22351w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21107R5)).booleanValue()) {
            String str6 = iq2Var.f22293G;
            String str7 = iq2Var.f22294H;
            str = str6;
            str2 = str7;
            str3 = iq2Var.f22295I;
            str4 = iq2Var.f22296J;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        zzu zzuVar = new zzu(iq2Var.f22292F, 0L, null, bundle, str, str2, str3, str4);
        this.f20381a.add(zzuVar);
        this.f20382b.put(str5, zzuVar);
    }

    /* renamed from: e */
    public final void m22272e(iq2 iq2Var, long j11, zze zzeVar) {
        m22267h(iq2Var, j11, zzeVar, false);
    }

    /* renamed from: f */
    public final void m22273f(iq2 iq2Var, long j11, zze zzeVar) {
        m22267h(iq2Var, j11, null, true);
    }

    /* renamed from: g */
    public final void m22274g(lq2 lq2Var) {
        this.f20384d = lq2Var;
    }
}
