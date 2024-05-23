package com.zing.zalo.shortvideo.p072ui.presenter;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import m20.InterfaceC22717a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public abstract class BasePresenterImpl<T extends InterfaceC22717a> implements InterfaceC10053a {

    /* renamed from: p */
    protected InterfaceC22717a f51445p;

    /* renamed from: q */
    private final CoroutineScope f51446q = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BasePresenterImpl$a */
    /* loaded from: classes5.dex */
    public static final class C9783a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9783a f51447q = new C9783a();

        C9783a() {
            super(1);
        }

        /* renamed from: a */
        public final void m52973a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52973a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BasePresenterImpl$b */
    /* loaded from: classes5.dex */
    public static final class C9784b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9784b f51448q = new C9784b();

        C9784b() {
            super(1);
        }

        /* renamed from: a */
        public final void m52974a(Object obj) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52974a(obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BasePresenterImpl$c */
    /* loaded from: classes5.dex */
    public static final class C9785c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51449t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f51450u;

        /* renamed from: v */
        final /* synthetic */ BasePresenterImpl f51451v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f51452w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18505l f51453x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BasePresenterImpl$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f51454q;

            /* renamed from: r */
            final /* synthetic */ Object f51455r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, Object obj) {
                super(0);
                this.f51454q = interfaceC18505l;
                this.f51455r = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m52976a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m52976a() {
                this.f51454q.mo205i9(this.f51455r);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BasePresenterImpl$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f51456q;

            /* renamed from: r */
            final /* synthetic */ Exception f51457r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC18505l interfaceC18505l, Exception exc) {
                super(0);
                this.f51456q = interfaceC18505l;
                this.f51457r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m52977a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m52977a() {
                this.f51456q.mo205i9(this.f51457r);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9785c(InterfaceC18505l interfaceC18505l, BasePresenterImpl basePresenterImpl, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3, Continuation continuation) {
            super(2, continuation);
            this.f51450u = interfaceC18505l;
            this.f51451v = basePresenterImpl;
            this.f51452w = interfaceC18505l2;
            this.f51453x = interfaceC18505l3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9785c(this.f51450u, this.f51451v, this.f51452w, this.f51453x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51449t;
            try {
            } catch (Exception e11) {
                BasePresenterImpl basePresenterImpl = this.f51451v;
                b bVar = new b(this.f51453x, e11);
                this.f51449t = 3;
                if (basePresenterImpl.m52971w(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18505l interfaceC18505l = this.f51450u;
                this.f51449t = 1;
                obj = interfaceC18505l.mo205i9(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            BasePresenterImpl basePresenterImpl2 = this.f51451v;
            a aVar = new a(this.f51452w, obj);
            this.f51449t = 2;
            if (basePresenterImpl2.m52971w(aVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9785c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BasePresenterImpl$d */
    /* loaded from: classes5.dex */
    public static final class C9786d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51458t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f51459u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9786d(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f51459u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9786d(this.f51459u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f51458t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f51459u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9786d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m52963o(BasePresenterImpl basePresenterImpl, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                interfaceC18505l2 = C9783a.f51447q;
            }
            if ((i11 & 4) != 0) {
                interfaceC18505l3 = C9784b.f51448q;
            }
            basePresenterImpl.m52966n(interfaceC18505l, interfaceC18505l2, interfaceC18505l3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTask");
    }

    /* renamed from: r */
    public static /* synthetic */ void m52964r(BasePresenterImpl basePresenterImpl, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            basePresenterImpl.mo52967p(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endTask");
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: D5 */
    public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9272a(this, interfaceC1801w);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: Lb */
    public void mo52965Lb(InterfaceC22717a interfaceC22717a) {
        AbstractC19074t.m100208f(interfaceC22717a, "page");
        m52972x(interfaceC22717a);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Ro */
    public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9275d(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        mo52967p(true);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public /* synthetic */ void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9277f(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: mr */
    public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9274c(this, interfaceC1801w);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m52966n(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3) {
        AbstractC19074t.m100208f(interfaceC18505l, "single");
        AbstractC19074t.m100208f(interfaceC18505l2, "fallback");
        AbstractC19074t.m100208f(interfaceC18505l3, "consumer");
        BuildersKt__Builders_commonKt.m112540d(this.f51446q, null, null, new C9785c(interfaceC18505l, this, interfaceC18505l3, interfaceC18505l2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo52967p(boolean z11) {
        InterfaceC27315f mo9207O = this.f51446q.mo9207O();
        if (z11) {
            JobKt__JobKt.m112765d(mo9207O, null, 1, null);
        } else {
            JobKt__JobKt.m112768g(mo9207O, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final InterfaceC22717a m52968s() {
        InterfaceC22717a interfaceC22717a = this.f51445p;
        if (interfaceC22717a != null) {
            return interfaceC22717a;
        }
        AbstractC19074t.m100223u("pageContract");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final CoroutineScope m52969u() {
        return this.f51446q;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        InterfaceC10053a.a.m53670a(this, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final Object m52971w(InterfaceC18494a interfaceC18494a, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new C9786d(interfaceC18494a, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9276e(this, interfaceC1801w);
    }

    /* renamed from: x */
    protected final void m52972x(InterfaceC22717a interfaceC22717a) {
        AbstractC19074t.m100208f(interfaceC22717a, "<set-?>");
        this.f51445p = interfaceC22717a;
    }
}
