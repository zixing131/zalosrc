package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class pd2 implements rh2 {

    /* renamed from: a */
    public final int f26170a;

    /* renamed from: b */
    public final boolean f26171b;

    /* renamed from: c */
    public final boolean f26172c;

    /* renamed from: d */
    public final int f26173d;

    /* renamed from: e */
    public final int f26174e;

    /* renamed from: f */
    public final int f26175f;

    /* renamed from: g */
    public final int f26176g;

    /* renamed from: h */
    public final int f26177h;

    /* renamed from: i */
    public final float f26178i;

    /* renamed from: j */
    public final boolean f26179j;

    public pd2(int i11, boolean z11, boolean z12, int i12, int i13, int i14, int i15, int i16, float f11, boolean z13) {
        this.f26170a = i11;
        this.f26171b = z11;
        this.f26172c = z12;
        this.f26173d = i12;
        this.f26174e = i13;
        this.f26175f = i14;
        this.f26176g = i15;
        this.f26177h = i16;
        this.f26178i = f11;
        this.f26179j = z13;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f26170a);
        bundle.putBoolean("ma", this.f26171b);
        bundle.putBoolean("sp", this.f26172c);
        bundle.putInt("muv", this.f26173d);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20970D8)).booleanValue()) {
            bundle.putInt("muv_min", this.f26174e);
            bundle.putInt("muv_max", this.f26175f);
        }
        bundle.putInt("rm", this.f26176g);
        bundle.putInt("riv", this.f26177h);
        bundle.putFloat("android_app_volume", this.f26178i);
        bundle.putBoolean("android_app_muted", this.f26179j);
    }
}
