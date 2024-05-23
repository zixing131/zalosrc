package p233i9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.C6576e;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;
import p319l9.AbstractC22153b;
import p319l9.C22152a;
import p441q9.C25197k;
import p476r9.C25698f;

/* renamed from: i9.e */
/* loaded from: classes3.dex */
public class C20432e {

    /* renamed from: i */
    private static final C22152a f100600i = C22152a.m115524e();

    /* renamed from: a */
    private final Map f100601a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C6662a f100602b;

    /* renamed from: c */
    private final C25698f f100603c;

    /* renamed from: d */
    private Boolean f100604d;

    /* renamed from: e */
    private final C6576e f100605e;

    /* renamed from: f */
    private final InterfaceC0662b f100606f;

    /* renamed from: g */
    private final InterfaceC2661e f100607g;

    /* renamed from: h */
    private final InterfaceC0662b f100608h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20432e(C6576e c6576e, InterfaceC0662b interfaceC0662b, InterfaceC2661e interfaceC2661e, InterfaceC0662b interfaceC0662b2, RemoteConfigManager remoteConfigManager, C6662a c6662a, SessionManager sessionManager) {
        this.f100604d = null;
        this.f100605e = c6576e;
        this.f100606f = interfaceC0662b;
        this.f100607g = interfaceC2661e;
        this.f100608h = interfaceC0662b2;
        if (c6576e == null) {
            this.f100604d = Boolean.FALSE;
            this.f100602b = c6662a;
            this.f100603c = new C25698f(new Bundle());
            return;
        }
        C25197k.m130415k().m130432r(c6576e, interfaceC2661e, interfaceC0662b2);
        Context m33612j = c6576e.m33612j();
        C25698f m106435a = m106435a(m33612j);
        this.f100603c = m106435a;
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC0662b);
        this.f100602b = c6662a;
        c6662a.m34061P(m106435a);
        c6662a.m34060O(m33612j);
        sessionManager.setApplicationContext(m33612j);
        this.f100604d = c6662a.m34066j();
        C22152a c22152a = f100600i;
        if (c22152a.m115531h() && m106438d()) {
            c22152a.m115529f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", AbstractC22153b.m115536b(c6576e.m33614m().m33682e(), m33612j.getPackageName())));
        }
    }

    /* renamed from: a */
    private static C25698f m106435a(Context context) {
        Bundle bundle;
        C25698f c25698f;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No perf enable meta data found ");
            sb2.append(e11.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            c25698f = new C25698f(bundle);
        } else {
            c25698f = new C25698f();
        }
        return c25698f;
    }

    /* renamed from: c */
    public static C20432e m106436c() {
        return (C20432e) C6576e.m33601k().m33611i(C20432e.class);
    }

    /* renamed from: b */
    public Map m106437b() {
        return new HashMap(this.f100601a);
    }

    /* renamed from: d */
    public boolean m106438d() {
        Boolean bool = this.f100604d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C6576e.m33601k().m33616s();
    }
}
