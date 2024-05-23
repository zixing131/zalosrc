package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public abstract class bl0 {
    /* renamed from: a */
    public static Context m20568a(Context context) {
        return m20570c(context).m19928b();
    }

    /* renamed from: b */
    public static Object m20569b(Context context, String str, al0 al0Var) {
        try {
            return al0Var.zza(m20570c(context).m19929d(str));
        } catch (Exception e11) {
            throw new zzcgs(e11);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m20570c(Context context) {
        try {
            return DynamiteModule.m19920e(context, DynamiteModule.f16815b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e11) {
            throw new zzcgs(e11);
        }
    }
}
