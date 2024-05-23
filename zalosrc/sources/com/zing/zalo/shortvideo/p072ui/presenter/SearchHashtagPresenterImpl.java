package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19730n;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22755i1;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SearchHashtagPresenterImpl extends BasePresenterImpl<InterfaceC22755i1> implements InterfaceC19730n {

    /* renamed from: r */
    private final InterfaceC18170g f52033r;

    /* renamed from: s */
    private boolean f52034s;

    /* renamed from: t */
    private NetworkReceiver f52035t;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchHashtagPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9974a extends AbstractC19075u implements InterfaceC18494a {
        C9974a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53430a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53430a() {
            if (SearchHashtagPresenterImpl.this.f52034s) {
                SearchHashtagPresenterImpl.this.f52034s = false;
                ((InterfaceC22755i1) SearchHashtagPresenterImpl.this.m52968s()).mo54787b(SearchHashtagPresenterImpl.this.f52034s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchHashtagPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9975b extends AbstractC19075u implements InterfaceC18494a {
        C9975b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53431a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53431a() {
            if (!SearchHashtagPresenterImpl.this.f52034s) {
                SearchHashtagPresenterImpl.this.f52034s = true;
                ((InterfaceC22755i1) SearchHashtagPresenterImpl.this.m52968s()).mo54787b(SearchHashtagPresenterImpl.this.f52034s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchHashtagPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9976c extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52038t;

        /* renamed from: v */
        final /* synthetic */ String f52040v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f52041w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9976c(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f52040v = str;
            this.f52041w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52038t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchHashtagPresenterImpl.this.f52033r;
                String str = this.f52040v;
                LoadMoreInfo loadMoreInfo = this.f52041w;
                this.f52038t = 1;
                obj = interfaceC18170g.mo96627y(str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53432r(Continuation continuation) {
            return new C9976c(this.f52040v, this.f52041w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9976c) m53432r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchHashtagPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9977d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52043r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9977d(String str) {
            super(1);
            this.f52043r = str;
        }

        /* renamed from: a */
        public final void m53434a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22755i1) SearchHashtagPresenterImpl.this.m52968s()).mo54790p(this.f52043r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53434a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchHashtagPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9978e extends AbstractC19075u implements InterfaceC18505l {
        C9978e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53435a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22755i1) SearchHashtagPresenterImpl.this.m52968s()).mo54788e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53435a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    public SearchHashtagPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f52033r = interfaceC18170g;
        this.f52034s = true;
        this.f52035t = new NetworkReceiver(new C9974a(), new C9975b());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22755i1) m52968s()).getContext() != null) {
            this.f52035t.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19730n
    /* renamed from: t */
    public void mo53429t(String str, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9976c(str, loadMoreInfo, null), new C9977d(str), new C9978e());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22755i1) m52968s()).getContext();
        if (context != null) {
            this.f52035t.mo53685d(context);
        }
    }
}
