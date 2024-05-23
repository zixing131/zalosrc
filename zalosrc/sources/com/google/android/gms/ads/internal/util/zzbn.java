package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.AbstractC4530g9;
import com.google.android.gms.internal.ads.AbstractC4788n8;
import com.google.android.gms.internal.ads.C4639j8;
import com.google.android.gms.internal.ads.C4937r8;
import com.google.android.gms.internal.ads.pl0;
import com.google.android.gms.internal.ads.xk0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbn extends AbstractC4788n8 {
    private final pl0 zza;
    private final xk0 zzb;

    public zzbn(String str, Map map, pl0 pl0Var) {
        super(0, str, new zzbm(pl0Var));
        this.zza = pl0Var;
        xk0 xk0Var = new xk0(null);
        this.zzb = xk0Var;
        xk0Var.m27912d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4788n8
    public final C4937r8 zzh(C4639j8 c4639j8) {
        return C4937r8.m25991b(c4639j8, AbstractC4530g9.m22303b(c4639j8));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4788n8
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        C4639j8 c4639j8 = (C4639j8) obj;
        this.zzb.m27914f(c4639j8.f22716c, c4639j8.f22714a);
        xk0 xk0Var = this.zzb;
        byte[] bArr = c4639j8.f22715b;
        if (xk0.m27903l() && bArr != null) {
            xk0Var.m27916h(bArr);
        }
        this.zza.zzd(c4639j8);
    }
}
