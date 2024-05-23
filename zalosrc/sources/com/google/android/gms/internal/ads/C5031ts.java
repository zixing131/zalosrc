package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ts */
/* loaded from: classes2.dex */
public final class C5031ts {

    /* renamed from: a */
    InterfaceC4982sg f28526a;

    /* renamed from: b */
    boolean f28527b;

    /* renamed from: c */
    private final ExecutorService f28528c;

    public C5031ts() {
        this.f28528c = nk0.f25222b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m26732b(Context context) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21191a4)).booleanValue()) {
            try {
                this.f28526a = (InterfaceC4982sg) bl0.m20569b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new al0() { // from class: com.google.android.gms.internal.ads.ps
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        return AbstractBinderC4945rg.m26075N(obj);
                    }
                });
                this.f28526a.mo25704O1(BinderC4273d.m19913I3(context), "GMA_SDK");
                this.f28527b = true;
            } catch (RemoteException | zzcgs | NullPointerException unused) {
                yk0.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public C5031ts(final Context context) {
        ExecutorService executorService = nk0.f25222b;
        this.f28528c = executorService;
        AbstractC4554gx.m22622c(context);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21000G8)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.os
                @Override // java.lang.Runnable
                public final void run() {
                    C5031ts.this.m26732b(context);
                }
            });
        } else {
            m26732b(context);
        }
    }
}
