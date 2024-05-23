package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C5700yc;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* loaded from: classes.dex */
public final class C6118r6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    final /* synthetic */ C6129s6 f34401p;

    public C6118r6(C6129s6 c6129s6) {
        this.f34401p = c6129s6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6127s4 c6127s4;
        Uri uri;
        String stringExtra;
        String str;
        boolean z11;
        try {
            try {
                this.f34401p.f34158a.mo31033c().m31201u().m31108a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    c6127s4 = this.f34401p.f34158a;
                } else {
                    C5700yc.m30087b();
                    Uri uri2 = null;
                    if (!this.f34401p.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33887H0)) {
                        uri2 = intent.getData();
                    } else {
                        Uri data = intent.getData();
                        if (data != null && data.isHierarchical()) {
                            uri = data;
                            if (uri != null && uri.isHierarchical()) {
                                this.f34401p.f34158a.m31381N();
                                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                                    str = "auto";
                                    String str2 = str;
                                    String queryParameter = uri.getQueryParameter("referrer");
                                    if (bundle != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.f34401p.f34158a.mo31037v().m31296z(new RunnableC6107q6(this, z11, uri, str2, queryParameter));
                                    c6127s4 = this.f34401p.f34158a;
                                }
                                str = "gs";
                                String str22 = str;
                                String queryParameter2 = uri.getQueryParameter("referrer");
                                if (bundle != null) {
                                }
                                this.f34401p.f34158a.mo31037v().m31296z(new RunnableC6107q6(this, z11, uri, str22, queryParameter2));
                                c6127s4 = this.f34401p.f34158a;
                            }
                            c6127s4 = this.f34401p.f34158a;
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                uri2 = Uri.parse(string);
                            }
                        }
                    }
                    uri = uri2;
                    if (uri != null) {
                        this.f34401p.f34158a.m31381N();
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                            str = "auto";
                            String str222 = str;
                            String queryParameter22 = uri.getQueryParameter("referrer");
                            if (bundle != null) {
                            }
                            this.f34401p.f34158a.mo31037v().m31296z(new RunnableC6107q6(this, z11, uri, str222, queryParameter22));
                            c6127s4 = this.f34401p.f34158a;
                        }
                        str = "gs";
                        String str2222 = str;
                        String queryParameter222 = uri.getQueryParameter("referrer");
                        if (bundle != null) {
                        }
                        this.f34401p.f34158a.mo31037v().m31296z(new RunnableC6107q6(this, z11, uri, str2222, queryParameter222));
                        c6127s4 = this.f34401p.f34158a;
                    }
                    c6127s4 = this.f34401p.f34158a;
                }
            } catch (RuntimeException e11) {
                this.f34401p.f34158a.mo31033c().m31197q().m31109b("Throwable caught in onActivityCreated", e11);
                c6127s4 = this.f34401p.f34158a;
            }
            c6127s4.m31378K().m30856y(activity, bundle);
        } catch (Throwable th2) {
            this.f34401p.f34158a.m31378K().m30856y(activity, bundle);
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f34401p.f34158a.m31378K().m30857z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f34401p.f34158a.m31378K().m30847A(activity);
        C6153u8 m31380M = this.f34401p.f34158a.m31380M();
        m31380M.f34158a.mo31037v().m31296z(new RunnableC6076n8(m31380M, m31380M.f34158a.mo31031a().mo105914b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C6153u8 m31380M = this.f34401p.f34158a.m31380M();
        m31380M.f34158a.mo31037v().m31296z(new RunnableC6065m8(m31380M, m31380M.f34158a.mo31031a().mo105914b()));
        this.f34401p.f34158a.m31378K().m30848B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f34401p.f34158a.m31378K().m30849C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
