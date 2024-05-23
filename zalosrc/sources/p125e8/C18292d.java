package p125e8;

import android.os.Bundle;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p014a8.InterfaceC0650a;
import p015a9.InterfaceC0661a;
import p015a9.InterfaceC0662b;
import p153f8.C18821f;
import p183g8.C19293c;
import p183g8.C19294d;
import p183g8.C19295e;
import p183g8.C19296f;
import p183g8.InterfaceC19291a;
import p201h8.C19924c;
import p201h8.InterfaceC19922a;
import p201h8.InterfaceC19923b;

/* renamed from: e8.d */
/* loaded from: classes.dex */
public class C18292d {

    /* renamed from: a */
    private final InterfaceC0661a f92562a;

    /* renamed from: b */
    private volatile InterfaceC19291a f92563b;

    /* renamed from: c */
    private volatile InterfaceC19923b f92564c;

    /* renamed from: d */
    private final List f92565d;

    public C18292d(InterfaceC0661a interfaceC0661a) {
        this(interfaceC0661a, new C19924c(), new C19296f());
    }

    /* renamed from: f */
    private void m97171f() {
        this.f92562a.mo943a(new InterfaceC0661a.a() { // from class: e8.c
            @Override // p015a9.InterfaceC0661a.a
            /* renamed from: a */
            public final void mo944a(InterfaceC0662b interfaceC0662b) {
                C18292d.this.m97174i(interfaceC0662b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m97172g(String str, Bundle bundle) {
        this.f92563b.mo97167a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m97173h(InterfaceC19922a interfaceC19922a) {
        synchronized (this) {
            try {
                if (this.f92564c instanceof C19924c) {
                    this.f92565d.add(interfaceC19922a);
                }
                this.f92564c.mo97166a(interfaceC19922a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m97174i(InterfaceC0662b interfaceC0662b) {
        C18821f.m98795f().m98796b("AnalyticsConnector now available.");
        InterfaceC0650a interfaceC0650a = (InterfaceC0650a) interfaceC0662b.get();
        C19295e c19295e = new C19295e(interfaceC0650a);
        C18293e c18293e = new C18293e();
        if (m97175j(interfaceC0650a, c18293e) != null) {
            C18821f.m98795f().m98796b("Registered Firebase Analytics listener.");
            C19294d c19294d = new C19294d();
            C19293c c19293c = new C19293c(c19295e, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    Iterator it = this.f92565d.iterator();
                    while (it.hasNext()) {
                        c19294d.mo97166a((InterfaceC19922a) it.next());
                    }
                    c18293e.m97180d(c19294d);
                    c18293e.m97181e(c19293c);
                    this.f92564c = c19294d;
                    this.f92563b = c19293c;
                } finally {
                }
            }
            return;
        }
        C18821f.m98795f().m98804k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    private static InterfaceC0650a.a m97175j(InterfaceC0650a interfaceC0650a, C18293e c18293e) {
        InterfaceC0650a.a mo934e = interfaceC0650a.mo934e("clx", c18293e);
        if (mo934e == null) {
            C18821f.m98795f().m98796b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo934e = interfaceC0650a.mo934e("crash", c18293e);
            if (mo934e != null) {
                C18821f.m98795f().m98804k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo934e;
    }

    /* renamed from: d */
    public InterfaceC19291a m97176d() {
        return new InterfaceC19291a() { // from class: e8.b
            @Override // p183g8.InterfaceC19291a
            /* renamed from: a */
            public final void mo97167a(String str, Bundle bundle) {
                C18292d.this.m97172g(str, bundle);
            }
        };
    }

    /* renamed from: e */
    public InterfaceC19923b m97177e() {
        return new InterfaceC19923b() { // from class: e8.a
            @Override // p201h8.InterfaceC19923b
            /* renamed from: a */
            public final void mo97166a(InterfaceC19922a interfaceC19922a) {
                C18292d.this.m97173h(interfaceC19922a);
            }
        };
    }

    public C18292d(InterfaceC0661a interfaceC0661a, InterfaceC19923b interfaceC19923b, InterfaceC19291a interfaceC19291a) {
        this.f92562a = interfaceC0661a;
        this.f92564c = interfaceC19923b;
        this.f92565d = new ArrayList();
        this.f92563b = interfaceC19291a;
        m97171f();
    }
}
