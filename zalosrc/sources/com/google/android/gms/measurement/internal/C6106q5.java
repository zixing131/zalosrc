package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
/* loaded from: classes.dex */
public final class C6106q5 {

    /* renamed from: a */
    final Context f34367a;

    /* renamed from: b */
    String f34368b;

    /* renamed from: c */
    String f34369c;

    /* renamed from: d */
    String f34370d;

    /* renamed from: e */
    Boolean f34371e;

    /* renamed from: f */
    long f34372f;

    /* renamed from: g */
    zzcl f34373g;

    /* renamed from: h */
    boolean f34374h;

    /* renamed from: i */
    final Long f34375i;

    /* renamed from: j */
    String f34376j;

    public C6106q5(Context context, zzcl zzclVar, Long l11) {
        this.f34374h = true;
        AbstractC4205o.m19722k(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC4205o.m19722k(applicationContext);
        this.f34367a = applicationContext;
        this.f34375i = l11;
        if (zzclVar != null) {
            this.f34373g = zzclVar;
            this.f34368b = zzclVar.f32978u;
            this.f34369c = zzclVar.f32977t;
            this.f34370d = zzclVar.f32976s;
            this.f34374h = zzclVar.f32975r;
            this.f34372f = zzclVar.f32974q;
            this.f34376j = zzclVar.f32980w;
            Bundle bundle = zzclVar.f32979v;
            if (bundle != null) {
                this.f34371e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
