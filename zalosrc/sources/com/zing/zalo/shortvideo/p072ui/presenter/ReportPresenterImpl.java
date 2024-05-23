package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import f10.EnumC18694f;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19727k;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22739e1;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class ReportPresenterImpl extends BasePresenterImpl<InterfaceC22739e1> implements InterfaceC19727k {

    /* renamed from: r */
    private final InterfaceC18170g f51968r;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ReportPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9946a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51969t;

        /* renamed from: v */
        final /* synthetic */ String f51971v;

        /* renamed from: w */
        final /* synthetic */ String f51972w;

        /* renamed from: x */
        final /* synthetic */ String f51973x;

        /* renamed from: y */
        final /* synthetic */ String f51974y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9946a(String str, String str2, String str3, String str4, Continuation continuation) {
            super(1, continuation);
            this.f51971v = str;
            this.f51972w = str2;
            this.f51973x = str3;
            this.f51974y = str4;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51969t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = ReportPresenterImpl.this.f51968r;
                String str = this.f51971v;
                String str2 = this.f51972w;
                String str3 = this.f51973x;
                String str4 = this.f51974y;
                this.f51969t = 1;
                obj = interfaceC18170g.mo96620u0(str, str2, str3, str4, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53374r(Continuation continuation) {
            return new C9946a(this.f51971v, this.f51972w, this.f51973x, this.f51974y, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9946a) m53374r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ReportPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9947b extends AbstractC19075u implements InterfaceC18505l {
        C9947b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53376a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22739e1) ReportPresenterImpl.this.m52968s()).mo54713Ry(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53376a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ReportPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9948c extends AbstractC19075u implements InterfaceC18505l {
        C9948c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53377a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            ((InterfaceC22739e1) ReportPresenterImpl.this.m52968s()).mo54714uE();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53377a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    public ReportPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51968r = interfaceC18170g;
    }

    @Override // h20.InterfaceC19727k
    /* renamed from: Qx */
    public void mo53373Qx(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "objectType");
        AbstractC19074t.m100208f(str2, "objectId");
        AbstractC19074t.m100208f(str3, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str4, "msg");
        m52966n(new C9946a(str, str2, str3, str4, null), new C9947b(), new C9948c());
    }
}
