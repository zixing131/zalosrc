package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.v90;

/* loaded from: classes2.dex */
public class LiteSdkInfo extends zzci {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public v90 getAdapterCreator() {
        return new s90();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public zzeh getLiteSdkVersion() {
        return new zzeh(ModuleDescriptor.MODULE_VERSION, 223104000, "21.3.0");
    }
}
