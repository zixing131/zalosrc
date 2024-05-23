package cl0;

import bl0.C2839e;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import vk0.C28284f;
import xk0.InterfaceC29697d;

/* renamed from: cl0.n */
/* loaded from: classes7.dex */
public final class C3584n implements InterfaceC29697d {

    /* renamed from: a */
    private final C28284f f15148a;

    public C3584n(C28284f c28284f) {
        AbstractC19074t.m100208f(c28284f, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        this.f15148a = c28284f;
    }

    @Override // xk0.InterfaceC29697d
    /* renamed from: a */
    public Object mo18187a(Continuation continuation) {
        return new C2839e(null, this.f15148a, 1, null);
    }
}
