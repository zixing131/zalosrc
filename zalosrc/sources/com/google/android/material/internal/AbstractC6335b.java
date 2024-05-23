package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6335b {
    /* renamed from: a */
    public static Activity m32554a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
