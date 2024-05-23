package l10;

import com.zing.zalocore.connection.socket.NativeWebSocket;
import fn0.AbstractC19074t;

/* renamed from: l10.b */
/* loaded from: classes5.dex */
public final class C21999b {

    /* renamed from: a */
    private final String f108367a;

    /* renamed from: b */
    private final NativeWebSocket.InterfaceC17521a f108368b;

    public C21999b(String str, NativeWebSocket.InterfaceC17521a interfaceC17521a) {
        AbstractC19074t.m100208f(str, "connectUrl");
        AbstractC19074t.m100208f(interfaceC17521a, "listener");
        this.f108367a = str;
        this.f108368b = interfaceC17521a;
    }

    /* renamed from: a */
    public final InterfaceC22001d m114877a() {
        return new C22004g(this.f108367a, this.f108368b);
    }
}
