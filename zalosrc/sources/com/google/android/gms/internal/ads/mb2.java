package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class mb2 implements rh2 {

    /* renamed from: a */
    private final boolean f24459a;

    public mb2(boolean z11) {
        this.f24459a = z11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (true != this.f24459a) {
            str = "0";
        } else {
            str = "1";
        }
        bundle.putString("adid_p", str);
    }
}
