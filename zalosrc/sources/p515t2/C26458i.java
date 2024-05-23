package p515t2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import p470r2.C25617c;
import p565v2.AbstractC27460n;
import p565v2.AbstractC27464r;
import p595w2.InterfaceC28696c;

/* renamed from: t2.i */
/* loaded from: classes.dex */
public final class C26458i extends AbstractC26456g {

    /* renamed from: f */
    private final ConnectivityManager f125651f;

    /* renamed from: g */
    private final a f125652g;

    /* renamed from: t2.i$a */
    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String str;
            AbstractC19074t.m100208f(network, "network");
            AbstractC19074t.m100208f(networkCapabilities, "capabilities");
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC26459j.f125654a;
            m11895e.mo11898a(str, "Network capabilities changed: " + networkCapabilities);
            C26458i c26458i = C26458i.this;
            c26458i.m136362g(AbstractC26459j.m136368c(c26458i.f125651f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            AbstractC19074t.m100208f(network, "network");
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC26459j.f125654a;
            m11895e.mo11898a(str, "Network connection lost");
            C26458i c26458i = C26458i.this;
            c26458i.m136362g(AbstractC26459j.m136368c(c26458i.f125651f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26458i(Context context, InterfaceC28696c interfaceC28696c) {
        super(context, interfaceC28696c);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
        Object systemService = m136360d().getSystemService("connectivity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f125651f = (ConnectivityManager) systemService;
        this.f125652g = new a();
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: h */
    public void mo11683h() {
        String str;
        String str2;
        String str3;
        try {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str3 = AbstractC26459j.f125654a;
            m11895e.mo11898a(str3, "Registering network callback");
            AbstractC27464r.m140512a(this.f125651f, this.f125652g);
        } catch (IllegalArgumentException e11) {
            AbstractC2253u m11895e2 = AbstractC2253u.m11895e();
            str2 = AbstractC26459j.f125654a;
            m11895e2.mo11901d(str2, "Received exception while registering network callback", e11);
        } catch (SecurityException e12) {
            AbstractC2253u m11895e3 = AbstractC2253u.m11895e();
            str = AbstractC26459j.f125654a;
            m11895e3.mo11901d(str, "Received exception while registering network callback", e12);
        }
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: i */
    public void mo11684i() {
        String str;
        String str2;
        String str3;
        try {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str3 = AbstractC26459j.f125654a;
            m11895e.mo11898a(str3, "Unregistering network callback");
            AbstractC27460n.m140508c(this.f125651f, this.f125652g);
        } catch (IllegalArgumentException e11) {
            AbstractC2253u m11895e2 = AbstractC2253u.m11895e();
            str2 = AbstractC26459j.f125654a;
            m11895e2.mo11901d(str2, "Received exception while unregistering network callback", e11);
        } catch (SecurityException e12) {
            AbstractC2253u m11895e3 = AbstractC2253u.m11895e();
            str = AbstractC26459j.f125654a;
            m11895e3.mo11901d(str, "Received exception while unregistering network callback", e12);
        }
    }

    @Override // p515t2.AbstractC26456g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C25617c mo136351e() {
        return AbstractC26459j.m136368c(this.f125651f);
    }
}
