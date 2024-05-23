package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ii2 implements sh2 {

    /* renamed from: a */
    private final Context f22183a;

    /* renamed from: b */
    private final ScheduledExecutorService f22184b;

    /* renamed from: c */
    private final Executor f22185c;

    /* renamed from: d */
    private final int f22186d;

    /* renamed from: e */
    private final yj0 f22187e;

    public ii2(yj0 yj0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i11, byte[] bArr) {
        this.f22187e = yj0Var;
        this.f22183a = context;
        this.f22184b = scheduledExecutorService;
        this.f22185c = executor;
        this.f22186d = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ji2 m23268a(Throwable th2) {
        String string;
        zzaw.zzb();
        ContentResolver contentResolver = this.f22183a.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new ji2(null, string);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21072O0)).booleanValue()) {
            return kc3.m23874f((ac3) kc3.m23883o(kc3.m23881m(ac3.m20071D(this.f22187e.m28221a(this.f22183a, this.f22186d)), new y43() { // from class: com.google.android.gms.internal.ads.gi2
                @Override // com.google.android.gms.internal.ads.y43
                public final Object apply(Object obj) {
                    AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                    info.getClass();
                    return new ji2(info, null);
                }
            }, this.f22185c), ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21082P0)).longValue(), TimeUnit.MILLISECONDS, this.f22184b), Throwable.class, new y43() { // from class: com.google.android.gms.internal.ads.hi2
                @Override // com.google.android.gms.internal.ads.y43
                public final Object apply(Object obj) {
                    return ii2.this.m23268a((Throwable) obj);
                }
            }, this.f22185c);
        }
        return kc3.m23876h(new Exception("Did not ad Ad ID into query param."));
    }
}
