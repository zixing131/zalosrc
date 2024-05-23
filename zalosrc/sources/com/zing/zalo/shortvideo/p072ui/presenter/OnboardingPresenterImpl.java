package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import f10.EnumC18694f;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22810w0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class OnboardingPresenterImpl extends BasePresenterImpl<InterfaceC22810w0> implements InterfaceC10057e {

    /* renamed from: r */
    private final InterfaceC18170g f51954r;

    /* renamed from: s */
    private boolean f51955s;

    /* renamed from: t */
    private NetworkReceiver f51956t;

    /* renamed from: u */
    private BreakSlot f51957u;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9938a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51958t;

        C9938a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51958t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = OnboardingPresenterImpl.this.f51954r;
                this.f51958t = 1;
                obj = interfaceC18170g.mo96595h0(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53362r(Continuation continuation) {
            return new C9938a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9938a) m53362r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9939b extends AbstractC19075u implements InterfaceC18505l {
        C9939b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53364a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22810w0) OnboardingPresenterImpl.this.m52968s()).mo54651d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53364a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9940c extends AbstractC19075u implements InterfaceC18505l {
        C9940c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53365a(BreakSlot breakSlot) {
            AbstractC19074t.m100208f(breakSlot, "it");
            OnboardingPresenterImpl.this.f51957u = breakSlot;
            ((InterfaceC22810w0) OnboardingPresenterImpl.this.m52968s()).mo54652rd(breakSlot);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53365a((BreakSlot) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9941d extends AbstractC19075u implements InterfaceC18494a {
        C9941d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53366a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53366a() {
            if (OnboardingPresenterImpl.this.f51955s) {
                OnboardingPresenterImpl.this.f51955s = false;
                ((InterfaceC22810w0) OnboardingPresenterImpl.this.m52968s()).mo54650b(OnboardingPresenterImpl.this.f51955s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9942e extends AbstractC19075u implements InterfaceC18494a {
        C9942e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53367a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53367a() {
            if (!OnboardingPresenterImpl.this.f51955s) {
                OnboardingPresenterImpl.this.f51955s = true;
                ((InterfaceC22810w0) OnboardingPresenterImpl.this.m52968s()).mo54650b(OnboardingPresenterImpl.this.f51955s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9943f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51964t;

        C9943f(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51964t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = OnboardingPresenterImpl.this.f51954r;
                BreakSlot breakSlot = OnboardingPresenterImpl.this.f51957u;
                this.f51964t = 1;
                obj = interfaceC18170g.mo96559G(breakSlot, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53368r(Continuation continuation) {
            return new C9943f(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9943f) m53368r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9944g extends AbstractC19075u implements InterfaceC18505l {
        C9944g() {
            super(1);
        }

        /* renamed from: a */
        public final void m53370a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22810w0) OnboardingPresenterImpl.this.m52968s()).mo54649To(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53370a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.OnboardingPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9945h extends AbstractC19075u implements InterfaceC18505l {
        C9945h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53371a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            ((InterfaceC22810w0) OnboardingPresenterImpl.this.m52968s()).mo54649To(null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53371a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    public OnboardingPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f51954r = interfaceC18170g;
        this.f51955s = true;
        this.f51956t = new NetworkReceiver(new C9941d(), new C9942e());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10057e
    /* renamed from: Q8 */
    public void mo53359Q8(boolean z11) {
        m52966n(new C9943f(null), new C9944g(), new C9945h());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10057e
    /* renamed from: Y8 */
    public void mo53360Y8() {
        m52966n(new C9938a(null), new C9939b(), new C9940c());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22810w0) m52968s()).getContext() != null) {
            this.f51956t.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10057e
    /* renamed from: r1 */
    public BreakSlot mo53361r1() {
        return this.f51957u;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22810w0) m52968s()).getContext();
        if (context != null) {
            this.f51956t.mo53685d(context);
        }
    }
}
