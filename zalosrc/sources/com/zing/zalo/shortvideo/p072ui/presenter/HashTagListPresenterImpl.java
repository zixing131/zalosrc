package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.CollectionVideo;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19724h;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22742f0;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class HashTagListPresenterImpl extends BasePresenterImpl<InterfaceC22742f0> implements InterfaceC19724h {

    /* renamed from: r */
    private final InterfaceC18170g f51752r;

    /* renamed from: s */
    private Section f51753s;

    /* renamed from: t */
    private boolean f51754t;

    /* renamed from: u */
    private String f51755u;

    /* renamed from: v */
    private String f51756v;

    /* renamed from: w */
    private NetworkReceiver f51757w;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9883a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51758t;

        C9883a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51758t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = HashTagListPresenterImpl.this.f51752r;
                String str = HashTagListPresenterImpl.this.f51756v;
                this.f51758t = 1;
                obj = InterfaceC18170g.a.m96640j(interfaceC18170g, str, null, this, 2, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53203r(Continuation continuation) {
            return new C9883a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9883a) m53203r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9884b extends AbstractC19075u implements InterfaceC18505l {
        C9884b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53205a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54385d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53205a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9885c extends AbstractC19075u implements InterfaceC18505l {
        C9885c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53206a(CollectionVideo collectionVideo) {
            AbstractC19074t.m100208f(collectionVideo, "result");
            HashTagListPresenterImpl.this.f51753s = collectionVideo.m50803b();
            InterfaceC22742f0 interfaceC22742f0 = (InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s();
            String m50804c = collectionVideo.m50804c();
            if (m50804c == null) {
                m50804c = "";
            }
            interfaceC22742f0.mo54388of(m50804c);
            ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54387o(collectionVideo.m50803b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53206a((CollectionVideo) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9886d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51762t;

        C9886d(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51762t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = HashTagListPresenterImpl.this.f51752r;
                String str = HashTagListPresenterImpl.this.f51755u;
                this.f51762t = 1;
                obj = InterfaceC18170g.a.m96641k(interfaceC18170g, str, null, this, 2, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53207r(Continuation continuation) {
            return new C9886d(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9886d) m53207r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9887e extends AbstractC19075u implements InterfaceC18505l {
        C9887e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53209a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54385d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53209a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9888f extends AbstractC19075u implements InterfaceC18505l {
        C9888f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53210a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            HashTagListPresenterImpl.this.f51753s = section;
            ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54387o(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53210a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9889g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51766t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51768v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9889g(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51768v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51766t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = HashTagListPresenterImpl.this.f51752r;
                String str = HashTagListPresenterImpl.this.f51755u;
                LoadMoreInfo loadMoreInfo = this.f51768v;
                this.f51766t = 1;
                obj = interfaceC18170g.mo96628y0(str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53211r(Continuation continuation) {
            return new C9889g(this.f51768v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9889g) m53211r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9890h extends AbstractC19075u implements InterfaceC18505l {
        C9890h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53213a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54385d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53213a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9891i extends AbstractC19075u implements InterfaceC18505l {
        C9891i() {
            super(1);
        }

        /* renamed from: a */
        public final void m53214a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54386e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53214a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9892j extends AbstractC19075u implements InterfaceC18494a {
        C9892j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53215a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53215a() {
            if (HashTagListPresenterImpl.this.f51754t) {
                HashTagListPresenterImpl.this.f51754t = false;
                ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54384b(HashTagListPresenterImpl.this.f51754t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.HashTagListPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9893k extends AbstractC19075u implements InterfaceC18494a {
        C9893k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53216a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53216a() {
            if (!HashTagListPresenterImpl.this.f51754t) {
                HashTagListPresenterImpl.this.f51754t = true;
                ((InterfaceC22742f0) HashTagListPresenterImpl.this.m52968s()).mo54384b(HashTagListPresenterImpl.this.f51754t);
            }
        }
    }

    public HashTagListPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51752r = interfaceC18170g;
        this.f51754t = true;
        this.f51755u = "";
        this.f51756v = "";
        this.f51757w = new NetworkReceiver(new C9892j(), new C9893k());
    }

    /* renamed from: F */
    private final boolean m53197F() {
        boolean z11;
        String str = this.f51756v;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    @Override // h20.InterfaceC19724h
    /* renamed from: G */
    public Section mo53200G() {
        return this.f51753s;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22742f0) m52968s()).getContext() != null) {
            this.f51757w.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19724h
    /* renamed from: a */
    public void mo53201a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9889g(loadMoreInfo, null), new C9890h(), new C9891i());
    }

    @Override // h20.InterfaceC19724h
    /* renamed from: i */
    public void mo53202i() {
        if (m53197F()) {
            m52966n(new C9883a(null), new C9884b(), new C9885c());
        } else {
            m52966n(new C9886d(null), new C9887e(), new C9888f());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        String str;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("HASH_TAG_LIST");
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        this.f51755u = str;
        if (bundle != null) {
            str2 = bundle.getString("COLLECTION_ID");
        }
        if (str2 != null) {
            str3 = str2;
        }
        this.f51756v = str3;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22742f0) m52968s()).getContext();
        if (context != null) {
            this.f51757w.mo53685d(context);
        }
    }
}
