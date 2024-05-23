package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.p9 */
/* loaded from: classes2.dex */
final class C4863p9 implements InterfaceC4419d9 {

    /* renamed from: a */
    private File f26111a = null;

    /* renamed from: b */
    final /* synthetic */ Context f26112b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4863p9(Context context) {
        this.f26112b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4419d9
    public final File zza() {
        if (this.f26111a == null) {
            this.f26111a = new File(this.f26112b.getCacheDir(), "volley");
        }
        return this.f26111a;
    }
}
