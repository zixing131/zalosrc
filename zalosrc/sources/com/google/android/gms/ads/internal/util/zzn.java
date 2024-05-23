package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.C4555gy;
import com.google.android.gms.internal.ads.InterfaceC4444dy;
import com.google.android.gms.internal.ads.x04;
import p468r0.C25593d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn implements InterfaceC4444dy {
    final /* synthetic */ C4555gy zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzs zzsVar, C4555gy c4555gy, Context context, Uri uri) {
        this.zza = c4555gy;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4444dy
    public final void zza() {
        C25593d m132189a = new C25593d.a(this.zza.m22630a()).m132189a();
        m132189a.f122359a.setPackage(x04.m27799a(this.zzb));
        m132189a.m132187a(this.zzb, this.zzc);
        this.zza.m22635f((Activity) this.zzb);
    }
}
