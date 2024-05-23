package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzaz;

/* loaded from: classes2.dex */
public final class py1 extends if0 {

    /* renamed from: p */
    final /* synthetic */ qy1 f26573p;

    public py1(qy1 qy1Var) {
        this.f26573p = qy1Var;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    /* renamed from: O3 */
    public final void mo22817O3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f26573p.f26995p.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.jf0
    /* renamed from: n2 */
    public final void mo22818n2(zzaz zzazVar) {
        this.f26573p.f26995p.zze(new zzay(zzazVar.zza, zzazVar.zzb));
    }
}
