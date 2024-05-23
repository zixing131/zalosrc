package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class xh2 implements rh2 {

    /* renamed from: a */
    public final boolean f30455a;

    /* renamed from: b */
    public final boolean f30456b;

    /* renamed from: c */
    public final String f30457c;

    /* renamed from: d */
    public final boolean f30458d;

    /* renamed from: e */
    public final boolean f30459e;

    /* renamed from: f */
    public final boolean f30460f;

    /* renamed from: g */
    public final String f30461g;

    /* renamed from: h */
    public final ArrayList f30462h;

    /* renamed from: i */
    public final String f30463i;

    /* renamed from: j */
    public final String f30464j;

    /* renamed from: k */
    public final String f30465k;

    /* renamed from: l */
    public final boolean f30466l;

    /* renamed from: m */
    public final String f30467m;

    /* renamed from: n */
    public final long f30468n;

    /* renamed from: o */
    public final boolean f30469o;

    public xh2(boolean z11, boolean z12, String str, boolean z13, boolean z14, boolean z15, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z16, String str6, long j11, boolean z17) {
        this.f30455a = z11;
        this.f30456b = z12;
        this.f30457c = str;
        this.f30458d = z13;
        this.f30459e = z14;
        this.f30460f = z15;
        this.f30461g = str2;
        this.f30462h = arrayList;
        this.f30463i = str3;
        this.f30464j = str4;
        this.f30465k = str5;
        this.f30466l = z16;
        this.f30467m = str6;
        this.f30468n = j11;
        this.f30469o = z17;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f30455a);
        bundle.putBoolean("coh", this.f30456b);
        bundle.putString("gl", this.f30457c);
        bundle.putBoolean("simulator", this.f30458d);
        bundle.putBoolean("is_latchsky", this.f30459e);
        bundle.putBoolean("is_sidewinder", this.f30460f);
        bundle.putString("hl", this.f30461g);
        if (!this.f30462h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f30462h);
        }
        bundle.putString("mv", this.f30463i);
        bundle.putString("submodel", this.f30467m);
        Bundle m24982a = nr2.m24982a(bundle, "device");
        bundle.putBundle("device", m24982a);
        m24982a.putString("build", this.f30465k);
        m24982a.putLong("remaining_data_partition_space", this.f30468n);
        Bundle m24982a2 = nr2.m24982a(m24982a, "browser");
        m24982a.putBundle("browser", m24982a2);
        m24982a2.putBoolean("is_browser_custom_tabs_capable", this.f30466l);
        if (!TextUtils.isEmpty(this.f30464j)) {
            Bundle m24982a3 = nr2.m24982a(m24982a, "play_store");
            m24982a.putBundle("play_store", m24982a3);
            m24982a3.putString("package_version", this.f30464j);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21110R8)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f30469o);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21090P8)).booleanValue()) {
            bundle.putBoolean("gotmt_l", ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue());
            bundle.putBoolean("gotmt_i", ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21050L8)).booleanValue());
        }
    }
}
