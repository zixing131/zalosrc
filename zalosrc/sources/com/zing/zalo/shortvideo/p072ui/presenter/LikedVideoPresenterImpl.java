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
import h20.InterfaceC19725i;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22750h0;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class LikedVideoPresenterImpl extends BasePresenterImpl<InterfaceC22750h0> implements InterfaceC19725i {

    /* renamed from: r */
    private final InterfaceC18170g f51773r;

    /* renamed from: s */
    private Section f51774s;

    /* renamed from: t */
    private boolean f51775t;

    /* renamed from: u */
    private NetworkReceiver f51776u;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9894a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51777t;

        C9894a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51777t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = LikedVideoPresenterImpl.this.f51773r;
                this.f51777t = 1;
                obj = InterfaceC18170g.a.m96643m(interfaceC18170g, null, this, 1, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53224r(Continuation continuation) {
            return new C9894a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9894a) m53224r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9895b extends AbstractC19075u implements InterfaceC18505l {
        C9895b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53226a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22750h0) LikedVideoPresenterImpl.this.m52968s()).mo54412d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53226a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9896c extends AbstractC19075u implements InterfaceC18505l {
        C9896c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53227a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            LikedVideoPresenterImpl.this.f51774s = section;
            ((InterfaceC22750h0) LikedVideoPresenterImpl.this.m52968s()).mo54414o(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53227a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9897d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51781t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51783v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9897d(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51783v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51781t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = LikedVideoPresenterImpl.this.f51773r;
                LoadMoreInfo loadMoreInfo = this.f51783v;
                this.f51781t = 1;
                obj = interfaceC18170g.mo96583b0(loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53228r(Continuation continuation) {
            return new C9897d(this.f51783v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9897d) m53228r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9898e extends AbstractC19075u implements InterfaceC18505l {
        C9898e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53230a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22750h0) LikedVideoPresenterImpl.this.m52968s()).mo54412d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53230a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9899f extends AbstractC19075u implements InterfaceC18505l {
        C9899f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53231a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22750h0) LikedVideoPresenterImpl.this.m52968s()).mo54413e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53231a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9900g extends AbstractC19075u implements InterfaceC18494a {
        C9900g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53232a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53232a() {
            if (LikedVideoPresenterImpl.this.f51775t) {
                LikedVideoPresenterImpl.this.f51775t = false;
                ((InterfaceC22750h0) LikedVideoPresenterImpl.this.m52968s()).mo54411b(LikedVideoPresenterImpl.this.f51775t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LikedVideoPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9901h extends AbstractC19075u implements InterfaceC18494a {
        C9901h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53233a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53233a() {
            if (!LikedVideoPresenterImpl.this.f51775t) {
                LikedVideoPresenterImpl.this.f51775t = true;
                ((InterfaceC22750h0) LikedVideoPresenterImpl.this.m52968s()).mo54411b(LikedVideoPresenterImpl.this.f51775t);
            }
        }
    }

    public LikedVideoPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51773r = interfaceC18170g;
        this.f51775t = true;
        this.f51776u = new NetworkReceiver(new C9900g(), new C9901h());
    }

    @Override // h20.InterfaceC19725i
    /* renamed from: G */
    public Section mo53221G() {
        return this.f51774s;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22750h0) m52968s()).getContext() != null) {
            this.f51776u.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19725i
    /* renamed from: a */
    public void mo53222a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9897d(loadMoreInfo, null), new C9898e(), new C9899f());
    }

    @Override // h20.InterfaceC19725i
    /* renamed from: i */
    public void mo53223i() {
        m52966n(new C9894a(null), new C9895b(), new C9896c());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22750h0) m52968s()).getContext();
        if (context != null) {
            this.f51776u.mo53685d(context);
        }
    }
}
