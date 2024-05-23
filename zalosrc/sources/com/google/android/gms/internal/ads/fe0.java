package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class fe0 {

    /* renamed from: d */
    private static qj0 f20092d;

    /* renamed from: a */
    private final Context f20093a;

    /* renamed from: b */
    private final AdFormat f20094b;

    /* renamed from: c */
    private final zzdr f20095c;

    public fe0(Context context, AdFormat adFormat, zzdr zzdrVar) {
        this.f20093a = context;
        this.f20094b = adFormat;
        this.f20095c = zzdrVar;
    }

    /* renamed from: a */
    public static qj0 m21992a(Context context) {
        qj0 qj0Var;
        synchronized (fe0.class) {
            try {
                if (f20092d == null) {
                    f20092d = zzaw.zza().zzq(context, new s90());
                }
                qj0Var = f20092d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qj0Var;
    }

    /* renamed from: b */
    public final void m21993b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zza;
        qj0 m21992a = m21992a(this.f20093a);
        if (m21992a == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        InterfaceC4271b m19913I3 = BinderC4273d.m19913I3(this.f20093a);
        zzdr zzdrVar = this.f20095c;
        if (zzdrVar == null) {
            zza = new zzm().zza();
        } else {
            zza = zzp.zza.zza(this.f20093a, zzdrVar);
        }
        try {
            m21992a.zze(m19913I3, new zzcfk(null, this.f20094b.name(), null, zza), new ee0(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
