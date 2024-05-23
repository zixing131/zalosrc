package pk0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import nk0.AbstractC23825g0;
import ok0.InterfaceC24286c;
import ok0.InterfaceC24288e;

/* renamed from: pk0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC24804c implements InterfaceC24803b {

    /* renamed from: a */
    private InterfaceC24803b f119063a;

    @Override // pk0.InterfaceC24803b
    /* renamed from: a */
    public boolean mo128869a(AbstractC23825g0 abstractC23825g0, int i11, String str, InterfaceC24288e interfaceC24288e) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC24288e, "callback");
        InterfaceC24803b interfaceC24803b = this.f119063a;
        if (interfaceC24803b != null) {
            return interfaceC24803b.mo128869a(abstractC23825g0, i11, str, interfaceC24288e);
        }
        return false;
    }

    @Override // pk0.InterfaceC24803b
    /* renamed from: b */
    public boolean mo128870b(AbstractC23825g0 abstractC23825g0, int i11, String str, InterfaceC24286c interfaceC24286c) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC24286c, "animationDrawableCallback");
        InterfaceC24803b interfaceC24803b = this.f119063a;
        if (interfaceC24803b != null) {
            return interfaceC24803b.mo128870b(abstractC23825g0, i11, str, interfaceC24286c);
        }
        return false;
    }

    @Override // pk0.InterfaceC24803b
    /* renamed from: c */
    public boolean mo128871c(AbstractC23825g0 abstractC23825g0, String str, InterfaceC24288e interfaceC24288e, int i11, boolean z11) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC24288e, "bitmapCallback");
        InterfaceC24803b interfaceC24803b = this.f119063a;
        if (interfaceC24803b != null) {
            return interfaceC24803b.mo128871c(abstractC23825g0, str, interfaceC24288e, i11, z11);
        }
        return false;
    }

    @Override // pk0.InterfaceC24803b
    /* renamed from: d */
    public int mo128872d() {
        InterfaceC24803b interfaceC24803b = this.f119063a;
        if (interfaceC24803b != null) {
            return interfaceC24803b.mo128872d();
        }
        return 5;
    }
}
