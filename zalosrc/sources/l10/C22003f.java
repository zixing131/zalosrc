package l10;

import com.zing.zalo.shortvideo.data.remote.ws.request.WsRequest;
import com.zing.zalocore.connection.socket.NativeWSRequestListener;
import com.zing.zalocore.connection.socket.NativeWebSocket;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l10.InterfaceC22002e;
import on0.C24321d;
import pm0.C24860q;

/* renamed from: l10.f */
/* loaded from: classes5.dex */
public final class C22003f implements InterfaceC22002e {

    /* renamed from: a */
    private final InterfaceC22000c f108369a;

    /* renamed from: b */
    private final int f108370b;

    /* renamed from: c */
    private InterfaceC22001d f108371c;

    /* renamed from: d */
    private InterfaceC22002e.b f108372d;

    /* renamed from: e */
    private boolean f108373e;

    /* renamed from: f */
    private final CopyOnWriteArrayList f108374f;

    /* renamed from: l10.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements NativeWebSocket.InterfaceC17521a {
        a() {
        }

        @Override // com.zing.zalocore.connection.socket.NativeWebSocket.InterfaceC17521a
        /* renamed from: D */
        public void mo93266D(int i11) {
            if (C22003f.this.f108373e && i11 == -1) {
                C22003f.this.f108373e = false;
            }
            if (i11 == 2) {
                C22003f.this.m114889h();
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeWebSocket.InterfaceC17521a
        /* renamed from: a */
        public void mo93267a(int i11, int i12, byte[] bArr) {
            InterfaceC22002e.b bVar = C22003f.this.f108372d;
            if (bVar != null) {
                bVar.mo103462a(i11, i12, bArr);
            }
        }
    }

    public C22003f(InterfaceC22000c interfaceC22000c) {
        AbstractC19074t.m100208f(interfaceC22000c, "authWs");
        this.f108369a = interfaceC22000c;
        this.f108370b = -999;
        this.f108374f = new CopyOnWriteArrayList();
    }

    /* renamed from: h */
    public final void m114889h() {
        if (this.f108373e) {
            return;
        }
        this.f108373e = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f108374f;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C24860q c24860q = (C24860q) it.next();
            mo114883c((WsRequest) c24860q.m129215c(), "forward", (NativeWSRequestListener) c24860q.m129216d());
        }
        copyOnWriteArrayList.clear();
    }

    /* renamed from: i */
    private final synchronized InterfaceC22001d m114890i() {
        InterfaceC22001d interfaceC22001d;
        interfaceC22001d = this.f108371c;
        if (interfaceC22001d == null) {
            interfaceC22001d = new C21999b("wss://" + this.f108369a.mo114875b() + "?zpw_ver=1&zpw_type=25&zpw_sek=." + this.f108369a.mo114874a() + "." + this.f108369a.mo114876c(), new a()).m114877a();
            this.f108371c = interfaceC22001d;
        }
        return interfaceC22001d;
    }

    /* renamed from: j */
    private final void m114891j(WsRequest wsRequest, NativeWSRequestListener nativeWSRequestListener) {
        if (this.f108374f.size() > 0 && wsRequest.m51615c()) {
            this.f108374f.clear();
        } else if (wsRequest.m51617e()) {
            this.f108374f.add(new C24860q(wsRequest, nativeWSRequestListener));
        }
    }

    /* renamed from: k */
    private final void m114892k(InterfaceC22001d interfaceC22001d, WsRequest wsRequest, NativeWSRequestListener nativeWSRequestListener) {
        if (interfaceC22001d == null) {
            return;
        }
        byte[] bytes = wsRequest.m51620h().getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        interfaceC22001d.mo114878a(wsRequest.m51616d().m125477c(), wsRequest.m51618f(), true, bytes, nativeWSRequestListener);
    }

    @Override // l10.InterfaceC22002e
    /* renamed from: a */
    public void mo114881a(InterfaceC22002e.b bVar) {
        this.f108372d = bVar;
    }

    @Override // l10.InterfaceC22002e
    /* renamed from: b */
    public void mo114882b() {
        if (!this.f108369a.isValid()) {
            return;
        }
        InterfaceC22001d m114890i = m114890i();
        if (m114890i.mo114880c() != 2 && m114890i.mo114880c() != 1) {
            m114890i.mo114879b();
        }
    }

    @Override // l10.InterfaceC22002e
    /* renamed from: c */
    public void mo114883c(WsRequest wsRequest, String str, NativeWSRequestListener nativeWSRequestListener) {
        AbstractC19074t.m100208f(nativeWSRequestListener, "listener");
        if (wsRequest != null && this.f108369a.isValid()) {
            InterfaceC22001d m114890i = m114890i();
            if (m114890i.mo114880c() == 2) {
                m114892k(m114890i, wsRequest, nativeWSRequestListener);
                return;
            }
            if (m114890i.mo114880c() != 2 && m114890i.mo114880c() != 1) {
                m114890i.mo114879b();
            }
            m114891j(wsRequest, nativeWSRequestListener);
        }
    }

    @Override // l10.InterfaceC22002e
    public void disconnect() {
        this.f108374f.clear();
        InterfaceC22001d interfaceC22001d = this.f108371c;
        this.f108371c = null;
        if (interfaceC22001d != null) {
            interfaceC22001d.disconnect();
        }
        this.f108373e = false;
        this.f108372d = null;
    }
}
