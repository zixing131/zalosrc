package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.concurrent.atomic.AtomicBoolean;
import p199h6.C19882a;

/* loaded from: classes.dex */
public final class o90 {

    /* renamed from: b */
    private static o90 f25500b;

    /* renamed from: a */
    private final AtomicBoolean f25501a = new AtomicBoolean(false);

    o90() {
    }

    /* renamed from: a */
    public static o90 m25103a() {
        if (f25500b == null) {
            f25500b = new o90();
        }
        return f25500b;
    }

    /* renamed from: b */
    public final Thread m25104b(final Context context, final String str) {
        if (!this.f25501a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.n90
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                AbstractC4554gx.m22622c(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21237f0)).booleanValue());
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21307m0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((us0) bl0.m20569b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new al0() { // from class: com.google.android.gms.internal.ads.m90
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.al0
                        public final Object zza(Object obj) {
                            return ts0.m26733N(obj);
                        }
                    })).mo26396o4(BinderC4273d.m19913I3(context2), new l90(C19882a.m103572k(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | zzcgs | NullPointerException e11) {
                    yk0.zzl("#007 Could not call remote method.", e11);
                }
            }
        });
        thread.start();
        return thread;
    }
}
