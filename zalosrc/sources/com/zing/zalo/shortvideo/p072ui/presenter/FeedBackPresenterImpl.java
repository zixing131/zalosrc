package com.zing.zalo.shortvideo.p072ui.presenter;

import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import f10.EnumC18694f;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19723g;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22733d0;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class FeedBackPresenterImpl extends BasePresenterImpl<InterfaceC22733d0> implements InterfaceC19723g {

    /* renamed from: r */
    private final InterfaceC18170g f51746r;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.FeedBackPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9880a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51747t;

        /* renamed from: v */
        final /* synthetic */ String f51749v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9880a(String str, Continuation continuation) {
            super(1, continuation);
            this.f51749v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51747t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = FeedBackPresenterImpl.this.f51746r;
                String str = this.f51749v;
                this.f51747t = 1;
                obj = interfaceC18170g.mo96556E0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53189r(Continuation continuation) {
            return new C9880a(this.f51749v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9880a) m53189r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.FeedBackPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9881b extends AbstractC19075u implements InterfaceC18505l {
        C9881b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53191a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22733d0) FeedBackPresenterImpl.this.m52968s()).mo54310ie(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53191a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.FeedBackPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9882c extends AbstractC19075u implements InterfaceC18505l {
        C9882c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53192a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            ((InterfaceC22733d0) FeedBackPresenterImpl.this.m52968s()).mo54311jo();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53192a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    public FeedBackPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51746r = interfaceC18170g;
    }

    @Override // h20.InterfaceC19723g
    /* renamed from: Sy */
    public void mo53188Sy(String str) {
        AbstractC19074t.m100208f(str, "msg");
        m52966n(new C9880a(str, null), new C9881b(), new C9882c());
    }
}
