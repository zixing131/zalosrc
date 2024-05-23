package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kq */
/* loaded from: classes2.dex */
public final class C4694kq {

    /* renamed from: a */
    private final Object f23432a = new Object();

    /* renamed from: b */
    private C4621iq f23433b = null;

    /* renamed from: c */
    private boolean f23434c = false;

    /* renamed from: a */
    public final Activity m24014a() {
        synchronized (this.f23432a) {
            try {
                C4621iq c4621iq = this.f23433b;
                if (c4621iq != null) {
                    return c4621iq.m23323a();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final Context m24015b() {
        synchronized (this.f23432a) {
            try {
                C4621iq c4621iq = this.f23433b;
                if (c4621iq != null) {
                    return c4621iq.m23324b();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m24016c(InterfaceC4657jq interfaceC4657jq) {
        synchronized (this.f23432a) {
            try {
                if (this.f23433b == null) {
                    this.f23433b = new C4621iq();
                }
                this.f23433b.m23325f(interfaceC4657jq);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m24017d(Context context) {
        Application application;
        synchronized (this.f23432a) {
            try {
                if (!this.f23434c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    if (application == null) {
                        yk0.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.f23433b == null) {
                        this.f23433b = new C4621iq();
                    }
                    this.f23433b.m23326g(application, context);
                    this.f23434c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m24018e(InterfaceC4657jq interfaceC4657jq) {
        synchronized (this.f23432a) {
            try {
                C4621iq c4621iq = this.f23433b;
                if (c4621iq == null) {
                    return;
                }
                c4621iq.m23327h(interfaceC4657jq);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
