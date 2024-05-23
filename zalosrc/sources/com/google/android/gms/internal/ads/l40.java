package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l40 implements com.google.android.gms.ads.internal.overlay.zzx {

    /* renamed from: a */
    boolean f23722a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f23723b;

    /* renamed from: c */
    final /* synthetic */ zza f23724c;

    /* renamed from: d */
    final /* synthetic */ Map f23725d;

    /* renamed from: e */
    final /* synthetic */ Map f23726e;

    public l40(n40 n40Var, boolean z11, zza zzaVar, Map map, Map map2) {
        this.f23723b = z11;
        this.f23724c = zzaVar;
        this.f23725d = map;
        this.f23726e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z11) {
        if (!this.f23722a) {
            if (z11 && this.f23723b) {
                ((pf1) this.f23724c).zzq();
            }
            this.f23722a = true;
            this.f23725d.put((String) this.f23726e.get("event_id"), Boolean.valueOf(z11));
            ((x60) this.f23724c).mo23552V("openIntentAsync", this.f23725d);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i11) {
    }
}
