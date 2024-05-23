package xa0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.toolstorage.list.C13434b;
import fn0.AbstractC19074t;
import p213hl.C20087c;
import p534u1.AbstractC26941a;
import wd0.C28923c;

/* renamed from: xa0.n */
/* loaded from: classes6.dex */
public final class C29567n implements C1802w0.b {

    /* renamed from: a */
    private final C20087c f136473a;

    /* renamed from: b */
    private final C28923c f136474b;

    public C29567n(C20087c c20087c, C28923c c28923c) {
        AbstractC19074t.m100208f(c20087c, "mToolStorageRepo");
        AbstractC19074t.m100208f(c28923c, "deleteConversationUseCase");
        this.f136473a = c20087c;
        this.f136474b = c28923c;
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        return new C13434b(this.f136473a, this.f136474b);
    }
}
