package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class hh2 implements rh2 {

    /* renamed from: a */
    public final boolean f21749a;

    /* renamed from: b */
    public final boolean f21750b;

    /* renamed from: c */
    public final String f21751c;

    /* renamed from: d */
    public final boolean f21752d;

    /* renamed from: e */
    public final int f21753e;

    /* renamed from: f */
    public final int f21754f;

    /* renamed from: g */
    public final int f21755g;

    public hh2(boolean z11, boolean z12, String str, boolean z13, int i11, int i12, int i13) {
        this.f21749a = z11;
        this.f21750b = z12;
        this.f21751c = str;
        this.f21752d = z13;
        this.f21753e = i11;
        this.f21754f = i12;
        this.f21755g = i13;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f21751c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzay.zzc().m21823b(AbstractC4554gx.f21084P2));
        bundle.putInt("target_api", this.f21753e);
        bundle.putInt("dv", this.f21754f);
        bundle.putInt("lv", this.f21755g);
        Bundle m24982a = nr2.m24982a(bundle, "sdk_env");
        m24982a.putBoolean("mf", ((Boolean) AbstractC5223yy.f31268a.m24091e()).booleanValue());
        m24982a.putBoolean("instant_app", this.f21749a);
        m24982a.putBoolean("lite", this.f21750b);
        m24982a.putBoolean("is_privileged_process", this.f21752d);
        bundle.putBundle("sdk_env", m24982a);
        Bundle m24982a2 = nr2.m24982a(m24982a, "build_meta");
        m24982a2.putString("cl", "474357726");
        m24982a2.putString("rapid_rc", "dev");
        m24982a2.putString("rapid_rollup", "HEAD");
        m24982a.putBundle("build_meta", m24982a2);
    }
}
