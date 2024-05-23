package com.zing.zalo.alias;

import android.os.Build;
import android.os.Bundle;
import com.zing.zalo.SensitiveData;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.alias.a */
/* loaded from: classes3.dex */
public final class C7291a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f39957a;

    /* renamed from: b */
    private String f39958b;

    /* renamed from: c */
    private String f39959c;

    /* renamed from: d */
    private String f39960d;

    /* renamed from: e */
    private Integer f39961e;

    /* renamed from: f */
    private String f39962f;

    /* renamed from: g */
    private String f39963g;

    /* renamed from: h */
    private SensitiveData f39964h;

    /* renamed from: com.zing.zalo.alias.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7291a m37157a(Bundle bundle) {
            SensitiveData sensitiveData;
            Object parcelable;
            if (bundle == null) {
                return null;
            }
            C7291a c7291a = new C7291a();
            c7291a.m37156o(bundle.getString("STR_PROFILE_UID"));
            c7291a.m37151j(bundle.getString("STR_PROFILE_DPN"));
            c7291a.m37155n(bundle.getString("STR_SUGGEST_TEXT"));
            c7291a.m37152k(bundle.getString("STR_HINT_TEXT"));
            c7291a.m37149h(Integer.valueOf(bundle.getInt("INT_ACTION_FROM")));
            c7291a.m37154m(bundle.getString("STR_SOURCE_START_VIEW", ""));
            c7291a.m37150i(bundle.getString("STR_LOG_CHAT_TYPE", "0"));
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("EXTRA_SENSITIVE_DATA", SensitiveData.class);
                sensitiveData = (SensitiveData) parcelable;
            } else {
                sensitiveData = (SensitiveData) bundle.getParcelable("EXTRA_SENSITIVE_DATA");
            }
            c7291a.m37153l(sensitiveData);
            return c7291a;
        }
    }

    /* renamed from: a */
    public final Integer m37142a() {
        return this.f39961e;
    }

    /* renamed from: b */
    public final String m37143b() {
        return this.f39963g;
    }

    /* renamed from: c */
    public final String m37144c() {
        return this.f39958b;
    }

    /* renamed from: d */
    public final SensitiveData m37145d() {
        return this.f39964h;
    }

    /* renamed from: e */
    public final String m37146e() {
        return this.f39962f;
    }

    /* renamed from: f */
    public final String m37147f() {
        return this.f39959c;
    }

    /* renamed from: g */
    public final String m37148g() {
        return this.f39957a;
    }

    /* renamed from: h */
    public final void m37149h(Integer num) {
        this.f39961e = num;
    }

    /* renamed from: i */
    public final void m37150i(String str) {
        this.f39963g = str;
    }

    /* renamed from: j */
    public final void m37151j(String str) {
        this.f39958b = str;
    }

    /* renamed from: k */
    public final void m37152k(String str) {
        this.f39960d = str;
    }

    /* renamed from: l */
    public final void m37153l(SensitiveData sensitiveData) {
        this.f39964h = sensitiveData;
    }

    /* renamed from: m */
    public final void m37154m(String str) {
        this.f39962f = str;
    }

    /* renamed from: n */
    public final void m37155n(String str) {
        this.f39959c = str;
    }

    /* renamed from: o */
    public final void m37156o(String str) {
        this.f39957a = str;
    }
}
