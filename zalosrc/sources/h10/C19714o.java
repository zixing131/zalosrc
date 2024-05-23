package h10;

import com.zing.zalo.shortvideo.data.remote.ws.request.WsRequest;
import com.zing.zalocore.connection.socket.NativeWSRequestListener;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import l10.C21998a;
import l10.C22003f;
import l10.InterfaceC22002e;
import m10.C22714b;
import n10.C23522e;
import n10.InterfaceC23520c;
import v00.C27417l;

/* renamed from: h10.o */
/* loaded from: classes5.dex */
public final class C19714o implements InterfaceC22002e.b {

    /* renamed from: a */
    private final C21998a f97841a;

    /* renamed from: b */
    private final InterfaceC23520c f97842b;

    /* renamed from: c */
    private final C22714b f97843c;

    /* renamed from: d */
    private a f97844d;

    /* renamed from: e */
    private InterfaceC22002e f97845e;

    /* renamed from: h10.o$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: e */
        void mo103426e(int i11, int i12, String str);
    }

    public C19714o(C21998a c21998a, InterfaceC23520c interfaceC23520c, C22714b c22714b) {
        AbstractC19074t.m100208f(c21998a, "auth");
        AbstractC19074t.m100208f(interfaceC23520c, "extractBodyFactory");
        AbstractC19074t.m100208f(c22714b, "masterRes");
        this.f97841a = c21998a;
        this.f97842b = interfaceC23520c;
        this.f97843c = c22714b;
        C22003f c22003f = new C22003f(c21998a);
        this.f97845e = c22003f;
        c22003f.mo114881a(this);
    }

    /* renamed from: g */
    private final synchronized InterfaceC22002e m103460g() {
        InterfaceC22002e interfaceC22002e;
        interfaceC22002e = this.f97845e;
        if (interfaceC22002e == null) {
            interfaceC22002e = new C22003f(this.f97841a);
            interfaceC22002e.mo114881a(this);
            this.f97845e = interfaceC22002e;
        }
        return interfaceC22002e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m103461h(WsRequest wsRequest, NativeWSRequestListener nativeWSRequestListener) {
        InterfaceC22002e.a.m114884a(m103460g(), wsRequest, null, nativeWSRequestListener, 2, null);
    }

    @Override // l10.InterfaceC22002e.b
    /* renamed from: a */
    public void mo103462a(int i11, int i12, byte[] bArr) {
        if (bArr != null && bArr.length != 0 && i11 != 1 && i12 != 1) {
            try {
                String str = (String) this.f97842b.mo123439a(bArr).mo123437a(bArr);
                a aVar = this.f97844d;
                if (aVar != null) {
                    aVar.mo103426e(i11, i12, str);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public final void m103463e(a aVar) {
        AbstractC19074t.m100208f(aVar, "listenerAllEvent");
        this.f97844d = aVar;
        m103460g().mo114882b();
    }

    /* renamed from: f */
    public final void m103464f() {
        InterfaceC22002e interfaceC22002e = this.f97845e;
        this.f97845e = null;
        if (interfaceC22002e != null) {
            interfaceC22002e.mo114881a(null);
        }
        if (interfaceC22002e != null) {
            interfaceC22002e.disconnect();
        }
    }

    public /* synthetic */ C19714o(C21998a c21998a, InterfaceC23520c interfaceC23520c, C22714b c22714b, int i11, AbstractC19060k abstractC19060k) {
        this(c21998a, (i11 & 2) != 0 ? new C23522e() : interfaceC23520c, (i11 & 4) != 0 ? new C22714b(C27417l.f129055a.m140384h()) : c22714b);
    }
}
