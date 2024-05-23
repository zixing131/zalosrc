package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC4205o;
import p342m6.AbstractC22888j;
import p355n4.AbstractC23536a;
import p355n4.InterfaceC23537b;

/* loaded from: classes2.dex */
public abstract class fs2 {

    /* renamed from: a */
    static AbstractC22888j f20274a;

    /* renamed from: b */
    public static InterfaceC23537b f20275b;

    /* renamed from: c */
    private static final Object f20276c = new Object();

    /* renamed from: a */
    public static AbstractC22888j m22157a(Context context) {
        AbstractC22888j abstractC22888j;
        m22158b(context, false);
        synchronized (f20276c) {
            abstractC22888j = f20274a;
        }
        return abstractC22888j;
    }

    /* renamed from: b */
    public static void m22158b(Context context, boolean z11) {
        synchronized (f20276c) {
            try {
                if (f20275b == null) {
                    f20275b = AbstractC23536a.m123621a(context);
                }
                AbstractC22888j abstractC22888j = f20274a;
                if (abstractC22888j == null || ((abstractC22888j.mo117587p() && !f20274a.mo117588q()) || (z11 && f20274a.mo117587p()))) {
                    f20274a = ((InterfaceC23537b) AbstractC4205o.m19723l(f20275b, "the appSetIdClient shouldn't be null")).mo123622d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
