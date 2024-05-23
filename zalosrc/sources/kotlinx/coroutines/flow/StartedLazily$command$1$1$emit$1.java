package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m145345f = "SharingStarted.kt", m145346l = {158}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class StartedLazily$command$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f107149s;

    /* renamed from: t */
    final /* synthetic */ StartedLazily$command$1.C218611 f107150t;

    /* renamed from: u */
    int f107151u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C218611 c218611, Continuation continuation) {
        super(continuation);
        this.f107150t = c218611;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107149s = obj;
        this.f107151u |= Integer.MIN_VALUE;
        return this.f107150t.m113495a(0, this);
    }
}
