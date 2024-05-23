package l10;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.connection.socket.NativeWSRequestListener;
import com.zing.zalocore.connection.socket.NativeWebSocket;
import fn0.AbstractC19074t;

/* renamed from: l10.g */
/* loaded from: classes5.dex */
public final class C22004g implements InterfaceC22001d {

    /* renamed from: a */
    private NativeWebSocket f108376a;

    public C22004g(String str, NativeWebSocket.InterfaceC17521a interfaceC17521a) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC17521a, "listener");
        this.f108376a = new NativeWebSocket(str, interfaceC17521a);
    }

    @Override // l10.InterfaceC22001d
    /* renamed from: a */
    public void mo114878a(int i11, int i12, boolean z11, byte[] bArr, NativeWSRequestListener nativeWSRequestListener) {
        AbstractC19074t.m100208f(bArr, "payload");
        AbstractC19074t.m100208f(nativeWSRequestListener, "callback");
        this.f108376a.m93265d(i11, i12, z11, bArr, nativeWSRequestListener);
    }

    @Override // l10.InterfaceC22001d
    /* renamed from: b */
    public void mo114879b() {
        this.f108376a.m93262a();
    }

    @Override // l10.InterfaceC22001d
    /* renamed from: c */
    public int mo114880c() {
        return this.f108376a.m93264c();
    }

    @Override // l10.InterfaceC22001d
    public void disconnect() {
        this.f108376a.m93263b();
    }
}
