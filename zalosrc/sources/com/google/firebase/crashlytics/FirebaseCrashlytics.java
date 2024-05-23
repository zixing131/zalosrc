package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.C6576e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p015a9.InterfaceC0661a;
import p035b9.InterfaceC2661e;
import p125e8.AbstractC18295g;
import p125e8.C18292d;
import p153f8.C18819d;
import p153f8.C18820e;
import p153f8.C18821f;
import p232i8.AbstractC20395h;
import p232i8.AbstractC20420u;
import p232i8.C20381a;
import p232i8.C20389e;
import p232i8.C20405m;
import p232i8.C20417s;
import p232i8.C20422w;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;
import p344m8.C22951b;
import p359n8.C23620g;
import p418p8.C24670f;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* renamed from: a */
    final C20405m f36459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$a */
    /* loaded from: classes.dex */
    public class C6562a implements InterfaceC22874c {
        C6562a() {
        }

        @Override // p342m6.InterfaceC22874c
        /* renamed from: a */
        public Object mo27439a(AbstractC22888j abstractC22888j) {
            if (!abstractC22888j.mo117588q()) {
                C18821f.m98795f().m98799e("Error fetching settings.", abstractC22888j.mo117583l());
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$b */
    /* loaded from: classes.dex */
    public class CallableC6563b implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f36460a;

        /* renamed from: b */
        final /* synthetic */ C20405m f36461b;

        /* renamed from: c */
        final /* synthetic */ C24670f f36462c;

        CallableC6563b(boolean z11, C20405m c20405m, C24670f c24670f) {
            this.f36460a = z11;
            this.f36461b = c20405m;
            this.f36462c = c24670f;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (this.f36460a) {
                this.f36461b.m106341j(this.f36462c);
                return null;
            }
            return null;
        }
    }

    private FirebaseCrashlytics(C20405m c20405m) {
        this.f36459a = c20405m;
    }

    /* renamed from: a */
    public static FirebaseCrashlytics m33525a(C6576e c6576e, InterfaceC2661e interfaceC2661e, InterfaceC0661a interfaceC0661a, InterfaceC0661a interfaceC0661a2) {
        Context m33612j = c6576e.m33612j();
        String packageName = m33612j.getPackageName();
        C18821f.m98795f().m98800g("Initializing Firebase Crashlytics " + C20405m.m106335l() + " for " + packageName);
        C23620g c23620g = new C23620g(m33612j);
        C20417s c20417s = new C20417s(c6576e);
        C20422w c20422w = new C20422w(m33612j, packageName, interfaceC2661e, c20417s);
        C18819d c18819d = new C18819d(interfaceC0661a);
        C18292d c18292d = new C18292d(interfaceC0661a2);
        C20405m c20405m = new C20405m(c6576e, c20422w, c18819d, c20417s, c18292d.m97177e(), c18292d.m97176d(), c23620g, AbstractC20420u.m106416c("Crashlytics Exception Handler"));
        String m33680c = c6576e.m33614m().m33680c();
        String m106219o = AbstractC20395h.m106219o(m33612j);
        List<C20389e> m106216l = AbstractC20395h.m106216l(m33612j);
        C18821f.m98795f().m98796b("Mapping file ID is: " + m106219o);
        for (C20389e c20389e : m106216l) {
            C18821f.m98795f().m98796b(String.format("Build id for %s on %s: %s", c20389e.m106187c(), c20389e.m106185a(), c20389e.m106186b()));
        }
        try {
            C20381a m106168a = C20381a.m106168a(m33612j, c20422w, m33680c, m106219o, m106216l, new C18820e(m33612j));
            C18821f.m98795f().m98802i("Installer package name is: " + m106168a.f100417d);
            ExecutorService m106416c = AbstractC20420u.m106416c("com.google.firebase.crashlytics.startup");
            C24670f m128219l = C24670f.m128219l(m33612j, m33680c, c20422w, new C22951b(), m106168a.f100419f, m106168a.f100420g, c23620g, c20417s);
            m128219l.m128227o(m106416c).mo117579h(m106416c, new C6562a());
            AbstractC22894m.m117601c(m106416c, new CallableC6563b(c20405m.m106346r(m106168a, m128219l), c20405m, m128219l));
            return new FirebaseCrashlytics(c20405m);
        } catch (PackageManager.NameNotFoundException e11) {
            C18821f.m98795f().m98799e("Error retrieving app package info.", e11);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) C6576e.m33601k().m33611i(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public AbstractC22888j checkForUnsentReports() {
        return this.f36459a.m106337e();
    }

    public void deleteUnsentReports() {
        this.f36459a.m106338f();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f36459a.m106339g();
    }

    public void log(String str) {
        this.f36459a.m106342n(str);
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            C18821f.m98795f().m98804k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f36459a.m106343o(th2);
        }
    }

    public void sendUnsentReports() {
        this.f36459a.m106347s();
    }

    public void setCrashlyticsCollectionEnabled(boolean z11) {
        this.f36459a.m106348t(Boolean.valueOf(z11));
    }

    public void setCustomKey(String str, boolean z11) {
        this.f36459a.m106349u(str, Boolean.toString(z11));
    }

    public void setCustomKeys(AbstractC18295g abstractC18295g) {
        throw null;
    }

    public void setUserId(String str) {
        this.f36459a.m106350v(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f36459a.m106348t(bool);
    }

    public void setCustomKey(String str, double d11) {
        this.f36459a.m106349u(str, Double.toString(d11));
    }

    public void setCustomKey(String str, float f11) {
        this.f36459a.m106349u(str, Float.toString(f11));
    }

    public void setCustomKey(String str, int i11) {
        this.f36459a.m106349u(str, Integer.toString(i11));
    }

    public void setCustomKey(String str, long j11) {
        this.f36459a.m106349u(str, Long.toString(j11));
    }

    public void setCustomKey(String str, String str2) {
        this.f36459a.m106349u(str, str2);
    }
}
