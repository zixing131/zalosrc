package kotlinx.coroutines.selects;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectImplementation;

/* loaded from: classes7.dex */
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {

    /* renamed from: v */
    private final List f107560v;

    /* renamed from: B */
    static /* synthetic */ Object m113884B(UnbiasedSelectImplementation unbiasedSelectImplementation, Continuation continuation) {
        unbiasedSelectImplementation.m113885C();
        return super.mo113858p(continuation);
    }

    /* renamed from: C */
    private final void m113885C() {
        try {
            Collections.shuffle(this.f107560v);
            Iterator it = this.f107560v.iterator();
            while (it.hasNext()) {
                SelectImplementation.m113852w(this, (SelectImplementation.ClauseData) it.next(), false, 1, null);
            }
        } finally {
            this.f107560v.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    /* renamed from: a */
    public void mo113830a(SelectClause0 selectClause0, InterfaceC18505l interfaceC18505l) {
        this.f107560v.add(new SelectImplementation.ClauseData(selectClause0.mo113837d(), selectClause0.mo113834a(), selectClause0.mo113836c(), SelectKt.m113874i(), interfaceC18505l, selectClause0.mo113835b()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    /* renamed from: c */
    public void mo113831c(SelectClause1 selectClause1, InterfaceC18509p interfaceC18509p) {
        this.f107560v.add(new SelectImplementation.ClauseData(selectClause1.mo113837d(), selectClause1.mo113834a(), selectClause1.mo113836c(), null, interfaceC18509p, selectClause1.mo113835b()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    /* renamed from: p */
    public Object mo113858p(Continuation continuation) {
        return m113884B(this, continuation);
    }
}
