package ya0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import com.zing.zalo.p077ui.toolstorage.overview.C13461b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import i30.C20222a;
import p089d2.InterfaceC17712d;
import p213hl.C20087c;
import p348mi.AbstractC23306f;
import p716zh.C32034n6;
import ua0.C27214a;

/* renamed from: ya0.n */
/* loaded from: classes6.dex */
public final class C30889n extends AbstractC1754a {

    /* renamed from: d */
    private final C20087c f142484d;

    /* renamed from: e */
    private final C19669z f142485e;

    /* renamed from: f */
    private final C32034n6 f142486f;

    public /* synthetic */ C30889n(C20087c c20087c, C19669z c19669z, C32034n6 c32034n6, InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(c20087c, c19669z, c32034n6, interfaceC17712d, (i11 & 16) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C13461b.class)) {
            C20087c c20087c = this.f142484d;
            C19669z c19669z = this.f142485e;
            C32034n6 c32034n6 = this.f142486f;
            C19669z m120572D0 = AbstractC23306f.m120572D0();
            AbstractC19074t.m100207e(m120572D0, "provideMessageManager(...)");
            return new C13461b(c1780l0, c20087c, c19669z, c32034n6, new C27214a(m120572D0, true, C20222a.b.f100076q));
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30889n(C20087c c20087c, C19669z c19669z, C32034n6 c32034n6, InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(c20087c, "toolStorageRepo");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c32034n6, "localFileCleaner");
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
        this.f142484d = c20087c;
        this.f142485e = c19669z;
        this.f142486f = c32034n6;
    }
}
