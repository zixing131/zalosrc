package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19719c;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22732d;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class BookmarkListPresenterImpl extends BasePresenterImpl<InterfaceC22732d> implements InterfaceC19719c {

    /* renamed from: r */
    private final InterfaceC18170g f51518r;

    /* renamed from: s */
    private Section f51519s;

    /* renamed from: t */
    private boolean f51520t;

    /* renamed from: u */
    private NetworkReceiver f51521u;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9815a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51522t;

        C9815a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51522t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BookmarkListPresenterImpl.this.f51518r;
                this.f51522t = 1;
                obj = InterfaceC18170g.a.m96639i(interfaceC18170g, null, this, 1, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53040r(Continuation continuation) {
            return new C9815a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9815a) m53040r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9816b extends AbstractC19075u implements InterfaceC18505l {
        C9816b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53042a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22732d) BookmarkListPresenterImpl.this.m52968s()).mo53950d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53042a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9817c extends AbstractC19075u implements InterfaceC18505l {
        C9817c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53043a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            BookmarkListPresenterImpl.this.f51519s = section;
            ((InterfaceC22732d) BookmarkListPresenterImpl.this.m52968s()).mo53952o(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53043a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9818d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51526t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51528v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9818d(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51528v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51526t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BookmarkListPresenterImpl.this.f51518r;
                LoadMoreInfo loadMoreInfo = this.f51528v;
                this.f51526t = 1;
                obj = interfaceC18170g.mo96618t0(loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53044r(Continuation continuation) {
            return new C9818d(this.f51528v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9818d) m53044r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9819e extends AbstractC19075u implements InterfaceC18505l {
        C9819e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53046a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22732d) BookmarkListPresenterImpl.this.m52968s()).mo53950d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53046a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9820f extends AbstractC19075u implements InterfaceC18505l {
        C9820f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53047a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22732d) BookmarkListPresenterImpl.this.m52968s()).mo53951e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53047a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9821g extends AbstractC19075u implements InterfaceC18494a {
        C9821g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53048a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53048a() {
            if (BookmarkListPresenterImpl.this.f51520t) {
                BookmarkListPresenterImpl.this.f51520t = false;
                ((InterfaceC22732d) BookmarkListPresenterImpl.this.m52968s()).mo53949b(BookmarkListPresenterImpl.this.f51520t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BookmarkListPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9822h extends AbstractC19075u implements InterfaceC18494a {
        C9822h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53049a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53049a() {
            if (!BookmarkListPresenterImpl.this.f51520t) {
                BookmarkListPresenterImpl.this.f51520t = true;
                ((InterfaceC22732d) BookmarkListPresenterImpl.this.m52968s()).mo53949b(BookmarkListPresenterImpl.this.f51520t);
            }
        }
    }

    public BookmarkListPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51518r = interfaceC18170g;
        this.f51520t = true;
        this.f51521u = new NetworkReceiver(new C9821g(), new C9822h());
    }

    @Override // h20.InterfaceC19719c
    /* renamed from: G */
    public Section mo53037G() {
        return this.f51519s;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22732d) m52968s()).getContext() != null) {
            this.f51521u.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19719c
    /* renamed from: a */
    public void mo53038a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9818d(loadMoreInfo, null), new C9819e(), new C9820f());
    }

    @Override // h20.InterfaceC19719c
    /* renamed from: i */
    public void mo53039i() {
        m52966n(new C9815a(null), new C9816b(), new C9817c());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22732d) m52968s()).getContext();
        if (context != null) {
            this.f51521u.mo53685d(context);
        }
    }
}
