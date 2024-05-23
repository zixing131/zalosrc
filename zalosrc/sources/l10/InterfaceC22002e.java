package l10;

import com.zing.zalo.shortvideo.data.remote.ws.request.WsRequest;
import com.zing.zalocore.connection.socket.NativeWSRequestListener;

/* renamed from: l10.e */
/* loaded from: classes5.dex */
public interface InterfaceC22002e {

    /* renamed from: l10.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m114884a(InterfaceC22002e interfaceC22002e, WsRequest wsRequest, String str, NativeWSRequestListener nativeWSRequestListener, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    str = null;
                }
                interfaceC22002e.mo114883c(wsRequest, str, nativeWSRequestListener);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
    }

    /* renamed from: l10.e$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo103462a(int i11, int i12, byte[] bArr);
    }

    /* renamed from: a */
    void mo114881a(b bVar);

    /* renamed from: b */
    void mo114882b();

    /* renamed from: c */
    void mo114883c(WsRequest wsRequest, String str, NativeWSRequestListener nativeWSRequestListener);

    void disconnect();
}
