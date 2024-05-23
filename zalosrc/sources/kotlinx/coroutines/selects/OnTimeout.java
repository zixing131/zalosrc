package kotlinx.coroutines.selects;

import en0.InterfaceC18510q;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import kotlinx.coroutines.DelayKt;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class OnTimeout {

    /* renamed from: a */
    private final long f107504a;

    public OnTimeout(long j11) {
        this.f107504a = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m113825c(final SelectInstance selectInstance, Object obj) {
        if (this.f107504a <= 0) {
            selectInstance.mo113855d(C24848g0.f119245a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.OnTimeout$register$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                SelectInstance.this.mo113857f(this, C24848g0.f119245a);
            }
        };
        AbstractC19074t.m100206d(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        InterfaceC27315f context = selectInstance.getContext();
        selectInstance.mo113856e(DelayKt.m112667c(context).mo112658y(this.f107504a, runnable, context));
    }

    /* renamed from: b */
    public final SelectClause0 m113826b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f107507y;
        AbstractC19074t.m100206d(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause0Impl(this, (InterfaceC18510q) AbstractC19069o0.m100188e(onTimeout$selectClause$1, 3), null, 4, null);
    }
}
