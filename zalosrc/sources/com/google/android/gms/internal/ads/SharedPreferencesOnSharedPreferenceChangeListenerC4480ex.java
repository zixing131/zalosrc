package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.AbstractC4150d;
import org.json.JSONException;
import org.json.JSONObject;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.internal.ads.ex */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4480ex implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    private Context f19851g;

    /* renamed from: a */
    private final Object f19845a = new Object();

    /* renamed from: b */
    private final ConditionVariable f19846b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f19847c = false;

    /* renamed from: d */
    volatile boolean f19848d = false;

    /* renamed from: e */
    private SharedPreferences f19849e = null;

    /* renamed from: f */
    private Bundle f19850f = new Bundle();

    /* renamed from: h */
    private JSONObject f19852h = new JSONObject();

    /* renamed from: f */
    private final void m21822f() {
        if (this.f19849e == null) {
            return;
        }
        try {
            this.f19852h = new JSONObject((String) AbstractC4627ix.m23430a(new a63() { // from class: com.google.android.gms.internal.ads.bx
                public /* synthetic */ C4370bx() {
                }

                @Override // com.google.android.gms.internal.ads.a63
                public final Object zza() {
                    return SharedPreferencesOnSharedPreferenceChangeListenerC4480ex.this.m21825d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public final Object m21823b(AbstractC5184xw abstractC5184xw) {
        if (!this.f19846b.block(5000L)) {
            synchronized (this.f19845a) {
                try {
                    if (!this.f19848d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f19847c || this.f19849e == null) {
            synchronized (this.f19845a) {
                if (this.f19847c && this.f19849e != null) {
                }
                return abstractC5184xw.m28039m();
            }
        }
        if (abstractC5184xw.m28037e() == 2) {
            Bundle bundle = this.f19850f;
            if (bundle == null) {
                return abstractC5184xw.m28039m();
            }
            return abstractC5184xw.mo26197b(bundle);
        }
        if (abstractC5184xw.m28037e() == 1 && this.f19852h.has(abstractC5184xw.m28040n())) {
            return abstractC5184xw.mo26196a(this.f19852h);
        }
        return AbstractC4627ix.m23430a(new a63() { // from class: com.google.android.gms.internal.ads.ax

            /* renamed from: q */
            public final /* synthetic */ AbstractC5184xw f17475q;

            public /* synthetic */ C4333ax(AbstractC5184xw abstractC5184xw2) {
                r2 = abstractC5184xw2;
            }

            @Override // com.google.android.gms.internal.ads.a63
            public final Object zza() {
                return SharedPreferencesOnSharedPreferenceChangeListenerC4480ex.this.m21824c(r2);
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ Object m21824c(AbstractC5184xw abstractC5184xw) {
        return abstractC5184xw.mo26198c(this.f19849e);
    }

    /* renamed from: d */
    public final /* synthetic */ String m21825d() {
        return this.f19849e.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void m21826e(Context context) {
        Context applicationContext;
        if (this.f19847c) {
            return;
        }
        synchronized (this.f19845a) {
            try {
                if (this.f19847c) {
                    return;
                }
                if (!this.f19848d) {
                    this.f19848d = true;
                }
                if (context.getApplicationContext() == null) {
                    applicationContext = context;
                } else {
                    applicationContext = context.getApplicationContext();
                }
                this.f19851g = applicationContext;
                try {
                    this.f19850f = C21472e.m111067a(applicationContext).m111061c(this.f19851g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context m19581e = AbstractC4150d.m19581e(context);
                    if (m19581e != null || (m19581e = context.getApplicationContext()) != null) {
                        context = m19581e;
                    }
                    if (context == null) {
                        return;
                    }
                    zzay.zzb();
                    SharedPreferences m28646a = C5258zw.m28646a(context);
                    this.f19849e = m28646a;
                    if (m28646a != null) {
                        m28646a.registerOnSharedPreferenceChangeListener(this);
                    }
                    AbstractC4927qz.m25922c(new C4406cx(this));
                    m21822f();
                    this.f19847c = true;
                } finally {
                    this.f19848d = false;
                    this.f19846b.open();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m21822f();
        }
    }
}
