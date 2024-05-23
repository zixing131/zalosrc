package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19731o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22759j1;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;

/* loaded from: classes5.dex */
public final class SearchPresenterImpl extends BasePresenterImpl<InterfaceC22759j1> implements InterfaceC19731o {

    /* renamed from: r */
    private final InterfaceC29280a f52045r;

    /* renamed from: s */
    private final InterfaceC18170g f52046s;

    /* renamed from: t */
    private boolean f52047t;

    /* renamed from: u */
    private NetworkReceiver f52048u;

    /* renamed from: v */
    private Handler f52049v;

    /* renamed from: w */
    private long f52050w;

    /* renamed from: x */
    private long f52051x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$a */
    /* loaded from: classes5.dex */
    public static final class C9979a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52052t;

        /* renamed from: v */
        final /* synthetic */ String f52054v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9979a(String str, Continuation continuation) {
            super(1, continuation);
            this.f52054v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52052t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchPresenterImpl.this.f52046s;
                String str = this.f52054v;
                this.f52052t = 1;
                obj = interfaceC18170g.mo96601k0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53447r(Continuation continuation) {
            return new C9979a(this.f52054v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9979a) m53447r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$b */
    /* loaded from: classes5.dex */
    public static final class C9980b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52056r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9980b(String str) {
            super(1);
            this.f52056r = str;
        }

        /* renamed from: a */
        public final void m53449a(List list) {
            AbstractC19074t.m100208f(list, "result");
            ((InterfaceC22759j1) SearchPresenterImpl.this.m52968s()).mo54819YE(this.f52056r, list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53449a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9981c extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52057t;

        C9981c(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52057t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchPresenterImpl.this.f52046s;
                this.f52057t = 1;
                obj = interfaceC18170g.mo96570Q(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53450r(Continuation continuation) {
            return new C9981c(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9981c) m53450r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9982d extends AbstractC19075u implements InterfaceC18505l {
        C9982d() {
            super(1);
        }

        /* renamed from: a */
        public final void m53452a(List list) {
            AbstractC19074t.m100208f(list, "result");
            ((InterfaceC22759j1) SearchPresenterImpl.this.m52968s()).mo54816FF(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53452a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9983e extends AbstractC19075u implements InterfaceC18494a {
        C9983e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53453a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53453a() {
            if (SearchPresenterImpl.this.f52047t) {
                SearchPresenterImpl.this.f52047t = false;
                ((InterfaceC22759j1) SearchPresenterImpl.this.m52968s()).mo54821b(SearchPresenterImpl.this.f52047t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9984f extends AbstractC19075u implements InterfaceC18494a {
        C9984f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53454a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53454a() {
            if (!SearchPresenterImpl.this.f52047t) {
                SearchPresenterImpl.this.f52047t = true;
                ((InterfaceC22759j1) SearchPresenterImpl.this.m52968s()).mo54821b(SearchPresenterImpl.this.f52047t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9985g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52062t;

        /* renamed from: v */
        final /* synthetic */ String f52064v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9985g(String str, Continuation continuation) {
            super(1, continuation);
            this.f52064v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52062t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchPresenterImpl.this.f52046s;
                String str = this.f52064v;
                this.f52062t = 1;
                obj = InterfaceC18170g.a.m96635e(interfaceC18170g, str, null, this, 2, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53455r(Continuation continuation) {
            return new C9985g(this.f52064v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9985g) m53455r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9986h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52066r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9986h(String str) {
            super(1);
            this.f52066r = str;
        }

        /* renamed from: a */
        public final void m53457a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22759j1) SearchPresenterImpl.this.m52968s()).mo54820ak(this.f52066r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53457a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9987i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52068r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18505l {

            /* renamed from: t */
            int f52069t;

            /* renamed from: u */
            final /* synthetic */ SearchPresenterImpl f52070u;

            /* renamed from: v */
            final /* synthetic */ List f52071v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchPresenterImpl searchPresenterImpl, List list, Continuation continuation) {
                super(1, continuation);
                this.f52070u = searchPresenterImpl;
                this.f52071v = list;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                int m131511r;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f52069t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f52070u.f52046s;
                    List list = this.f52071v;
                    m131511r = AbstractC25370t.m131511r(list, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Channel) it.next()).m50769l());
                    }
                    this.f52069t = 1;
                    obj = interfaceC18170g.mo96560G0(arrayList, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                return obj;
            }

            /* renamed from: r */
            public final Continuation m53459r(Continuation continuation) {
                return new a(this.f52070u, this.f52071v, continuation);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object mo205i9(Continuation continuation) {
                return ((a) m53459r(continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$i$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ SearchAllResult f52072q;

            /* renamed from: r */
            final /* synthetic */ SearchPresenterImpl f52073r;

            /* renamed from: s */
            final /* synthetic */ String f52074s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SearchAllResult searchAllResult, SearchPresenterImpl searchPresenterImpl, String str) {
                super(1);
                this.f52072q = searchAllResult;
                this.f52073r = searchPresenterImpl;
                this.f52074s = str;
            }

            /* renamed from: a */
            public final void m53461a(Throwable th2) {
                List m131502j;
                AbstractC19074t.m100208f(th2, "it");
                Section m51137a = this.f52072q.m51137a();
                m131502j = AbstractC25368s.m131502j();
                m51137a.m51172q(m131502j);
                ((InterfaceC22759j1) this.f52073r.m52968s()).mo54818Rq(this.f52074s, this.f52072q);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53461a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchPresenterImpl$i$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ List f52075q;

            /* renamed from: r */
            final /* synthetic */ SearchPresenterImpl f52076r;

            /* renamed from: s */
            final /* synthetic */ String f52077s;

            /* renamed from: t */
            final /* synthetic */ SearchAllResult f52078t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, SearchPresenterImpl searchPresenterImpl, String str, SearchAllResult searchAllResult) {
                super(1);
                this.f52075q = list;
                this.f52076r = searchPresenterImpl;
                this.f52077s = str;
                this.f52078t = searchAllResult;
            }

            /* renamed from: a */
            public final void m53462a(List list) {
                AbstractC19074t.m100208f(list, "personalizes");
                int i11 = 0;
                for (Object obj : this.f52075q) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    ((Channel) obj).m50744T((PersonalizeChannel) list.get(i11));
                    i11 = i12;
                }
                ((InterfaceC22759j1) this.f52076r.m52968s()).mo54818Rq(this.f52077s, this.f52078t);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53462a((List) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9987i(String str) {
            super(1);
            this.f52068r = str;
        }

        /* renamed from: a */
        public final void m53458a(SearchAllResult searchAllResult) {
            List m51168m;
            AbstractC19074t.m100208f(searchAllResult, "result");
            Section m51137a = searchAllResult.m51137a();
            C24848g0 c24848g0 = null;
            if (m51137a != null && (m51168m = m51137a.m51168m()) != null) {
                if (!(!m51168m.isEmpty())) {
                    m51168m = null;
                }
                if (m51168m != null) {
                    SearchPresenterImpl searchPresenterImpl = SearchPresenterImpl.this;
                    String str = this.f52068r;
                    searchPresenterImpl.m52966n(new a(searchPresenterImpl, m51168m, null), new b(searchAllResult, searchPresenterImpl, str), new c(m51168m, searchPresenterImpl, str, searchAllResult));
                    c24848g0 = C24848g0.f119245a;
                }
            }
            if (c24848g0 == null) {
                ((InterfaceC22759j1) SearchPresenterImpl.this.m52968s()).mo54818Rq(this.f52068r, searchAllResult);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53458a((SearchAllResult) obj);
            return C24848g0.f119245a;
        }
    }

    public SearchPresenterImpl(InterfaceC29280a interfaceC29280a, InterfaceC18170g interfaceC18170g) {
        long j11;
        CoreConfig m51425b;
        Long m51448k;
        AbstractC19074t.m100208f(interfaceC29280a, "cacheRepository");
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f52045r = interfaceC29280a;
        this.f52046s = interfaceC18170g;
        this.f52047t = true;
        this.f52048u = new NetworkReceiver(new C9983e(), new C9984f());
        this.f52049v = new Handler(Looper.getMainLooper());
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51448k = m51425b.m51448k()) != null) {
            j11 = m51448k.longValue();
        } else {
            j11 = 0;
        }
        this.f52050w = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m53438D(SearchPresenterImpl searchPresenterImpl, String str) {
        AbstractC19074t.m100208f(searchPresenterImpl, "this$0");
        AbstractC19074t.m100208f(str, "$keyword");
        searchPresenterImpl.mo53443m4(str);
    }

    @Override // h20.InterfaceC19731o
    /* renamed from: Y7 */
    public void mo53441Y7() {
        BasePresenterImpl.m52963o(this, new C9981c(null), null, new C9982d(), 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22759j1) m52968s()).getContext() != null) {
            this.f52048u.mo53687g();
        }
        mo53444so();
    }

    @Override // h20.InterfaceC19731o
    /* renamed from: fl */
    public void mo53442fl() {
        ((InterfaceC22759j1) m52968s()).mo54817Hw(this.f52045r.mo146338m());
    }

    @Override // h20.InterfaceC19731o
    /* renamed from: m4 */
    public void mo53443m4(final String str) {
        AbstractC19074t.m100208f(str, "keyword");
        long j11 = this.f52051x;
        C27417l c27417l = C27417l.f129055a;
        if (j11 <= c27417l.m140382f().m130131a() - this.f52050w) {
            this.f52051x = c27417l.m140382f().m130131a();
            BasePresenterImpl.m52963o(this, new C9979a(str, null), null, new C9980b(str), 2, null);
        } else {
            this.f52049v.removeCallbacksAndMessages(null);
            this.f52049v.postDelayed(new Runnable() { // from class: h20.p
                @Override // java.lang.Runnable
                public final void run() {
                    SearchPresenterImpl.m53438D(SearchPresenterImpl.this, str);
                }
            }, (this.f52051x + this.f52050w) - c27417l.m140382f().m130131a());
        }
    }

    @Override // h20.InterfaceC19731o
    /* renamed from: so */
    public void mo53444so() {
        this.f52049v.removeCallbacksAndMessages(null);
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22759j1) m52968s()).getContext();
        if (context != null) {
            this.f52048u.mo53685d(context);
        }
    }

    @Override // h20.InterfaceC19731o
    /* renamed from: y4 */
    public void mo53445y4(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        m52966n(new C9985g(str, null), new C9986h(str), new C9987i(str));
        this.f52045r.mo146317S(str);
        mo53442fl();
    }

    @Override // h20.InterfaceC19731o
    /* renamed from: zl */
    public void mo53446zl(String str) {
        this.f52045r.mo146318T(str);
        mo53442fl();
    }
}
