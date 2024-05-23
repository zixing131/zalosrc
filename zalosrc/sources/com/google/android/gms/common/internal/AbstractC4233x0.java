package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.common.internal.x0 */
/* loaded from: classes.dex */
public abstract class AbstractC4233x0 {

    /* renamed from: a */
    private static final Object f16670a = new Object();

    /* renamed from: b */
    private static boolean f16671b;

    /* renamed from: c */
    private static String f16672c;

    /* renamed from: d */
    private static int f16673d;

    /* renamed from: a */
    public static int m19809a(Context context) {
        m19810b(context);
        return f16673d;
    }

    /* renamed from: b */
    private static void m19810b(Context context) {
        Bundle bundle;
        synchronized (f16670a) {
            try {
                if (f16671b) {
                    return;
                }
                f16671b = true;
                try {
                    bundle = C21472e.m111067a(context).m111061c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e11);
                }
                if (bundle == null) {
                    return;
                }
                f16672c = bundle.getString("com.google.app.id");
                f16673d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
