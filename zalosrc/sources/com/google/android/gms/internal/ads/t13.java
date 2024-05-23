package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class t13 {

    /* renamed from: a */
    final w13 f28113a;

    /* renamed from: b */
    final boolean f28114b;

    private t13(w13 w13Var) {
        this.f28113a = w13Var;
        this.f28114b = w13Var != null;
    }

    /* renamed from: b */
    public static t13 m26534b(Context context, String str, String str2) {
        w13 u13Var;
        try {
            try {
                try {
                    IBinder m19929d = DynamiteModule.m19920e(context, DynamiteModule.f16815b, ModuleDescriptor.MODULE_ID).m19929d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (m19929d == null) {
                        u13Var = null;
                    } else {
                        IInterface queryLocalInterface = m19929d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof w13) {
                            u13Var = (w13) queryLocalInterface;
                        } else {
                            u13Var = new u13(m19929d);
                        }
                    }
                    u13Var.mo26825s2(BinderC4273d.m19913I3(context), str, null);
                    return new t13(u13Var);
                } catch (Exception e11) {
                    throw new zzfob(e11);
                }
            } catch (RemoteException | zzfob | NullPointerException | SecurityException unused) {
                return new t13(new x13());
            }
        } catch (Exception e12) {
            throw new zzfob(e12);
        }
    }

    /* renamed from: c */
    public static t13 m26535c() {
        return new t13(new x13());
    }

    /* renamed from: a */
    public final s13 m26536a(byte[] bArr) {
        return new s13(this, bArr, null);
    }
}
