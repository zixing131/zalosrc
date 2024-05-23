package p293k9;

import com.google.firebase.C6576e;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;

/* renamed from: k9.a */
/* loaded from: classes3.dex */
public class C21598a {

    /* renamed from: a */
    private final C6576e f104948a;

    /* renamed from: b */
    private final InterfaceC2661e f104949b;

    /* renamed from: c */
    private final InterfaceC0662b f104950c;

    /* renamed from: d */
    private final InterfaceC0662b f104951d;

    public C21598a(C6576e c6576e, InterfaceC2661e interfaceC2661e, InterfaceC0662b interfaceC0662b, InterfaceC0662b interfaceC0662b2) {
        this.f104948a = c6576e;
        this.f104949b = interfaceC2661e;
        this.f104950c = interfaceC0662b;
        this.f104951d = interfaceC0662b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6662a m111519a() {
        return C6662a.m34042g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C6576e m111520b() {
        return this.f104948a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceC2661e m111521c() {
        return this.f104949b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC0662b m111522d() {
        return this.f104950c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public RemoteConfigManager m111523e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public SessionManager m111524f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC0662b m111525g() {
        return this.f104951d;
    }
}
