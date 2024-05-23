package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19735s;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22787q1;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SearchVideoPresenterImpl extends BasePresenterImpl<InterfaceC22787q1> implements InterfaceC19735s {

    /* renamed from: r */
    private final InterfaceC18170g f52101r;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9996a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52102t;

        /* renamed from: v */
        final /* synthetic */ String f52104v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f52105w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9996a(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f52104v = str;
            this.f52105w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52102t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchVideoPresenterImpl.this.f52101r;
                String str = this.f52104v;
                LoadMoreInfo loadMoreInfo = this.f52105w;
                this.f52102t = 1;
                obj = interfaceC18170g.mo96609o0("search_video", str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53484r(Continuation continuation) {
            return new C9996a(this.f52104v, this.f52105w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9996a) m53484r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9997b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52107r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9997b(String str) {
            super(1);
            this.f52107r = str;
        }

        /* renamed from: a */
        public final void m53486a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22787q1) SearchVideoPresenterImpl.this.m52968s()).mo54884p(this.f52107r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53486a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9998c extends AbstractC19075u implements InterfaceC18505l {
        C9998c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53487a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22787q1) SearchVideoPresenterImpl.this.m52968s()).mo54882e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53487a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    public SearchVideoPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f52101r = interfaceC18170g;
    }

    @Override // h20.InterfaceC19735s
    /* renamed from: t */
    public void mo53483t(String str, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9996a(str, loadMoreInfo, null), new C9997b(str), new C9998c());
    }
}
