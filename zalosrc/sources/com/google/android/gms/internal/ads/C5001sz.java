package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sz */
/* loaded from: classes2.dex */
public final class C5001sz {

    /* renamed from: a */
    private final Context f28062a;

    public C5001sz(Context context) {
        this.f28062a = context;
    }

    /* renamed from: a */
    public final void m26457a(ze0 ze0Var) {
        try {
            ((C5038tz) bl0.m20569b(this.f28062a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new al0() { // from class: com.google.android.gms.internal.ads.rz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.al0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof C5038tz) {
                        return (C5038tz) queryLocalInterface;
                    }
                    return new C5038tz(obj);
                }
            })).m26798E(ze0Var);
        } catch (RemoteException e11) {
            yk0.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e11.getMessage())));
        } catch (zzcgs e12) {
            yk0.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e12.getMessage())));
        }
    }
}
