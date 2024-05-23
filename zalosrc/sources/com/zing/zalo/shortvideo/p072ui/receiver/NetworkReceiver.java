package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import q20.C25078a;
import q20.C25090m;

/* loaded from: classes5.dex */
public final class NetworkReceiver extends BaseBroadcastReceiver {

    /* renamed from: e */
    private final InterfaceC18494a f52438e;

    /* renamed from: f */
    private final InterfaceC18494a f52439f;

    /* renamed from: g */
    private ConnectivityManager f52440g;

    /* renamed from: h */
    private ConnectivityManager.NetworkCallback f52441h;

    /* renamed from: i */
    private boolean f52442i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NetworkReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10083a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10083a f52443q = new C10083a();

        C10083a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53744a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53744a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NetworkReceiver$b */
    /* loaded from: classes5.dex */
    public static final class C10084b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10084b f52444q = new C10084b();

        C10084b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53745a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53745a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NetworkReceiver$c */
    /* loaded from: classes5.dex */
    public static final class C10085c extends AbstractC19075u implements InterfaceC18494a {
        C10085c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53746a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53746a() {
            NetworkReceiver.this.m53742k().mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NetworkReceiver$d */
    /* loaded from: classes5.dex */
    public static final class C10086d extends AbstractC19075u implements InterfaceC18494a {
        C10086d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53747a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53747a() {
            NetworkReceiver.this.m53743l().mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NetworkReceiver$e */
    /* loaded from: classes5.dex */
    public static final class C10087e extends ConnectivityManager.NetworkCallback {
        C10087e() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC19074t.m100208f(network, "network");
            if (!NetworkReceiver.this.f52442i) {
                NetworkReceiver.this.f52442i = true;
                NetworkReceiver.this.m53741n();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC19074t.m100208f(network, "network");
            if (NetworkReceiver.this.f52442i) {
                NetworkReceiver.this.f52442i = false;
                NetworkReceiver.this.m53741n();
            }
        }
    }

    public NetworkReceiver() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: m */
    private final void m53740m(Context context) {
        this.f52442i = C25090m.f120499a.m130050b(context);
        m53741n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m53741n() {
        if (this.f52442i) {
            m53686e(new C10085c());
        } else {
            m53686e(new C10086d());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: b */
    protected IntentFilter mo51933b() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: d */
    public void mo53685d(Context context) {
        AbstractC19074t.m100208f(context, "ctx");
        if (C25078a.f120479a.m130000b()) {
            this.f52441h = new C10087e();
            Object systemService = context.getSystemService("connectivity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            this.f52440g = connectivityManager;
            ConnectivityManager.NetworkCallback networkCallback = this.f52441h;
            if (networkCallback != null && connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(networkCallback);
            }
        } else {
            super.mo53685d(context);
        }
        m53740m(context);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: g */
    public void mo53687g() {
        ConnectivityManager connectivityManager;
        if (C25078a.f120479a.m130000b()) {
            ConnectivityManager.NetworkCallback networkCallback = this.f52441h;
            if (networkCallback != null && (connectivityManager = this.f52440g) != null) {
                connectivityManager.unregisterNetworkCallback(networkCallback);
                return;
            }
            return;
        }
        super.mo53687g();
    }

    /* renamed from: k */
    public final InterfaceC18494a m53742k() {
        return this.f52439f;
    }

    /* renamed from: l */
    public final InterfaceC18494a m53743l() {
        return this.f52438e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        if (this.f52442i != C25090m.f120499a.m130050b(context)) {
            this.f52442i = !this.f52442i;
            m53741n();
        }
    }

    public /* synthetic */ NetworkReceiver(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C10083a.f52443q : interfaceC18494a, (i11 & 2) != 0 ? C10084b.f52444q : interfaceC18494a2);
    }

    public NetworkReceiver(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(interfaceC18494a, "doOnLost");
        AbstractC19074t.m100208f(interfaceC18494a2, "doOnConnected");
        this.f52438e = interfaceC18494a;
        this.f52439f = interfaceC18494a2;
    }
}
