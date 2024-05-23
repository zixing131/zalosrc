package gh0;

import android.content.Context;
import hh0.AbstractC20065c;
import hh0.AbstractC20066d;
import p327lm.AsyncTaskC22525e;
import p327lm.AsyncTaskC22526f;

/* renamed from: gh0.a */
/* loaded from: classes.dex */
public class C19447a {

    /* renamed from: b */
    private static final C19447a f96531b = new C19447a();

    /* renamed from: a */
    public boolean f96532a = false;

    /* renamed from: d */
    public static C19447a m101720d() {
        return f96531b;
    }

    /* renamed from: a */
    public String m101721a(Context context) {
        return AbstractC20066d.m104294m(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.brand_preload");
    }

    /* renamed from: b */
    public long m101722b(Context context) {
        return AbstractC20066d.m104292k(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.expiresetting");
    }

    /* renamed from: c */
    public long m101723c(Context context) {
        return AbstractC20066d.m104292k(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.expiredsetting");
    }

    /* renamed from: e */
    public long m101724e(Context context) {
        return AbstractC20066d.m104292k(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.lastimewakeup");
    }

    /* renamed from: f */
    public String m101725f(Context context) {
        return AbstractC20066d.m104294m(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.model_preload");
    }

    /* renamed from: g */
    public String m101726g(Context context) {
        return AbstractC20066d.m104294m(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.preload_default");
    }

    /* renamed from: h */
    public int m101727h(Context context) {
        return AbstractC20066d.m104291j(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.resubmit_interval");
    }

    /* renamed from: i */
    public long m101728i(Context context) {
        long m104292k = AbstractC20066d.m104292k(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.wakeupsetting");
        if (m104292k <= 0) {
            return 600000L;
        }
        return m104292k;
    }

    /* renamed from: j */
    public synchronized void m101729j(Context context, String str) {
        if (this.f96532a) {
            return;
        }
        this.f96532a = true;
        if (m101731l(context)) {
            new AsyncTaskC22526f(context, null, str).execute(context);
            new AsyncTaskC22525e(context, null, str).execute(context);
        }
    }

    /* renamed from: k */
    public boolean m101730k(Context context) {
        if (System.currentTimeMillis() > m101723c(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m101731l(Context context) {
        if (System.currentTimeMillis() > m101722b(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void m101732m(Context context, long j11) {
        AbstractC20066d.m104306y(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.expiresetting", j11);
    }

    /* renamed from: n */
    public void m101733n(Context context, long j11) {
        AbstractC20066d.m104306y(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.expiredsetting", j11);
    }

    /* renamed from: o */
    public void m101734o(Context context, long j11) {
        AbstractC20066d.m104306y(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.lastimewakeup", j11);
    }

    /* renamed from: p */
    public void m101735p(Context context, int i11) {
        AbstractC20066d.m104305x(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.resubmit_interval", i11);
    }

    /* renamed from: q */
    public void m101736q(Context context, long j11) {
        AbstractC20066d.m104306y(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.wakeupsetting", j11);
    }

    /* renamed from: r */
    public void m101737r(Context context, boolean z11) {
        AbstractC20066d.m104303v(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.wakeupenable", z11);
    }

    /* renamed from: s */
    public void m101738s(Context context, String str) {
        AbstractC20066d.m104281A(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.brand_preload", str);
    }

    /* renamed from: t */
    public void m101739t(Context context, boolean z11) {
        AbstractC20066d.m104303v(context, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.settings.outapplogin", z11);
    }

    /* renamed from: u */
    public void m101740u(Context context, String str) {
        AbstractC20066d.m104281A(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.model_preload", str);
    }

    /* renamed from: v */
    public void m101741v(Context context, String str) {
        AbstractC20066d.m104281A(context, "com.zing.zalo.sdk.preload", "com.zing.zalo.sdk.settings.preload.preload_default", str);
    }

    /* renamed from: w */
    public void m101742w(Context context, boolean z11) {
        AbstractC20065c.m104276c(context, "com.zing.zalo.sdk.settings.useWebViewForUnloginZalo", z11);
    }
}
