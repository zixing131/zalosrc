package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.AbstractC2151i0;
import androidx.work.C2138c;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.C2256x;
import androidx.work.EnumC2254v;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            AbstractC2151i0.m11548l(context.getApplicationContext(), new C2138c.a().m11484a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(InterfaceC4271b interfaceC4271b) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        zzb(context);
        try {
            AbstractC2151i0 m11547h = AbstractC2151i0.m11547h(context);
            m11547h.mo11549a("offline_ping_sender_work");
            m11547h.m11551c((C2256x) ((C2256x.a) ((C2256x.a) new C2256x.a(OfflinePingSender.class).m11869j(new C2142e.a().m11514b(EnumC2254v.CONNECTED).m11513a())).m11862a("offline_ping_sender_work")).m11863b());
        } catch (IllegalStateException e11) {
            yk0.zzk("Failed to instantiate WorkManager.", e11);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(InterfaceC4271b interfaceC4271b, String str, String str2) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        zzb(context);
        C2142e m11513a = new C2142e.a().m11514b(EnumC2254v.CONNECTED).m11513a();
        try {
            AbstractC2151i0.m11547h(context).m11551c((C2256x) ((C2256x.a) ((C2256x.a) ((C2256x.a) new C2256x.a(OfflineNotificationPoster.class).m11869j(m11513a)).m11873n(new C2148h.a().m11539f("uri", str).m11539f("gws_query_id", str2).m11534a())).m11862a("offline_notification_work")).m11863b());
            return true;
        } catch (IllegalStateException e11) {
            yk0.zzk("Failed to instantiate WorkManager.", e11);
            return false;
        }
    }
}
