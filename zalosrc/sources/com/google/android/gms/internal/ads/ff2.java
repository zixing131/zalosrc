package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ff2 implements rh2 {

    /* renamed from: a */
    private final String f20103a;

    /* renamed from: b */
    private final boolean f20104b;

    /* renamed from: c */
    private final boolean f20105c;

    public ff2(String str, boolean z11, boolean z12) {
        this.f20103a = str;
        this.f20104b = z11;
        this.f20105c = z12;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f20103a.isEmpty()) {
            bundle.putString("inspector_extras", this.f20103a);
        }
        bundle.putInt("test_mode", this.f20104b ? 1 : 0);
        bundle.putInt("linked_device", this.f20105c ? 1 : 0);
    }
}
