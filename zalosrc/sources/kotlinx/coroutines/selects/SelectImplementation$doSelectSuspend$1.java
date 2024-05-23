package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.selects.SelectImplementation", m145345f = "Select.kt", m145346l = {431, 434}, m145347m = "doSelectSuspend")
/* loaded from: classes7.dex */
public final class SelectImplementation$doSelectSuspend$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f107538s;

    /* renamed from: t */
    /* synthetic */ Object f107539t;

    /* renamed from: u */
    final /* synthetic */ SelectImplementation f107540u;

    /* renamed from: v */
    int f107541v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(SelectImplementation selectImplementation, Continuation continuation) {
        super(continuation);
        this.f107540u = selectImplementation;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m113848r;
        this.f107539t = obj;
        this.f107541v |= Integer.MIN_VALUE;
        m113848r = this.f107540u.m113848r(this);
        return m113848r;
    }
}
