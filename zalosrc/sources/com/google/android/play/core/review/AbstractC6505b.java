package com.google.android.play.core.review;

import android.content.Context;

/* renamed from: com.google.android.play.core.review.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6505b {
    /* renamed from: a */
    public static InterfaceC6504a m33378a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C6507d(new C6512i(context));
    }
}
