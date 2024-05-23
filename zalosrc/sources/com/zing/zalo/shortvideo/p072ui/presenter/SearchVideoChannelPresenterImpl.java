package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchVideoChannelPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19733q;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22775n1;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SearchVideoChannelPresenterImpl extends BasePresenterImpl<InterfaceC22775n1> implements InterfaceC19733q {

    /* renamed from: r */
    private final InterfaceC18170g f52079r;

    /* renamed from: s */
    private boolean f52080s;

    /* renamed from: t */
    private NetworkReceiver f52081t;

    /* renamed from: u */
    private Handler f52082u;

    /* renamed from: v */
    private long f52083v;

    /* renamed from: w */
    private long f52084w;

    /* renamed from: x */
    private final String f52085x;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9988a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52086t;

        /* renamed from: v */
        final /* synthetic */ String f52088v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f52089w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9988a(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f52088v = str;
            this.f52089w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52086t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchVideoChannelPresenterImpl.this.f52079r;
                String str = this.f52088v;
                String str2 = SearchVideoChannelPresenterImpl.this.f52085x;
                LoadMoreInfo loadMoreInfo = this.f52089w;
                this.f52086t = 1;
                obj = interfaceC18170g.mo96625x("search_video_attach", str, str2, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53472r(Continuation continuation) {
            return new C9988a(this.f52088v, this.f52089w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9988a) m53472r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9989b extends AbstractC19075u implements InterfaceC18505l {
        C9989b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53474a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22775n1) SearchVideoChannelPresenterImpl.this.m52968s()).mo54853Kt(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53474a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9990c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52092r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9990c(String str) {
            super(1);
            this.f52092r = str;
        }

        /* renamed from: a */
        public final void m53475a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22775n1) SearchVideoChannelPresenterImpl.this.m52968s()).mo54858lg(this.f52092r, section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53475a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$d */
    /* loaded from: classes5.dex */
    public static final class C9991d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52093t;

        /* renamed from: v */
        final /* synthetic */ String f52095v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9991d(String str, Continuation continuation) {
            super(1, continuation);
            this.f52095v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52093t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchVideoChannelPresenterImpl.this.f52079r;
                String str = this.f52095v;
                String str2 = SearchVideoChannelPresenterImpl.this.f52085x;
                this.f52093t = 1;
                obj = InterfaceC18170g.a.m96636f(interfaceC18170g, "search_video_attach", str, str2, null, this, 8, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53476r(Continuation continuation) {
            return new C9991d(this.f52095v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9991d) m53476r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$e */
    /* loaded from: classes5.dex */
    public static final class C9992e extends AbstractC19075u implements InterfaceC18505l {
        C9992e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53478a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22775n1) SearchVideoChannelPresenterImpl.this.m52968s()).mo54854Lz(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53478a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$f */
    /* loaded from: classes5.dex */
    public static final class C9993f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52098r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9993f(String str) {
            super(1);
            this.f52098r = str;
        }

        /* renamed from: a */
        public final void m53479a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22775n1) SearchVideoChannelPresenterImpl.this.m52968s()).mo54857j6(this.f52098r, section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53479a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9994g extends AbstractC19075u implements InterfaceC18494a {
        C9994g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53480a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53480a() {
            if (SearchVideoChannelPresenterImpl.this.f52080s) {
                SearchVideoChannelPresenterImpl.this.f52080s = false;
                ((InterfaceC22775n1) SearchVideoChannelPresenterImpl.this.m52968s()).mo54855b(SearchVideoChannelPresenterImpl.this.f52080s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchVideoChannelPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9995h extends AbstractC19075u implements InterfaceC18494a {
        C9995h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53481a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53481a() {
            if (!SearchVideoChannelPresenterImpl.this.f52080s) {
                SearchVideoChannelPresenterImpl.this.f52080s = true;
                ((InterfaceC22775n1) SearchVideoChannelPresenterImpl.this.m52968s()).mo54855b(SearchVideoChannelPresenterImpl.this.f52080s);
            }
        }
    }

    public SearchVideoChannelPresenterImpl(InterfaceC18170g interfaceC18170g) {
        long j11;
        String m50769l;
        CoreConfig m51425b;
        Long m51447j;
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f52079r = interfaceC18170g;
        this.f52080s = true;
        this.f52081t = new NetworkReceiver(new C9994g(), new C9995h());
        this.f52082u = new Handler(Looper.getMainLooper());
        C27417l c27417l = C27417l.f129055a;
        ChannelConfig m140381e = c27417l.m140381e();
        if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51447j = m51425b.m51447j()) != null) {
            j11 = m51447j.longValue();
        } else {
            j11 = 0;
        }
        this.f52083v = j11;
        Channel m140377a = c27417l.m140377a();
        this.f52085x = (m140377a == null || (m50769l = m140377a.m50769l()) == null) ? "" : m50769l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m53466E(SearchVideoChannelPresenterImpl searchVideoChannelPresenterImpl, String str) {
        AbstractC19074t.m100208f(searchVideoChannelPresenterImpl, "this$0");
        AbstractC19074t.m100208f(str, "$keyword");
        searchVideoChannelPresenterImpl.mo53469XG(str);
    }

    @Override // h20.InterfaceC19733q
    /* renamed from: XG */
    public void mo53469XG(final String str) {
        AbstractC19074t.m100208f(str, "keyword");
        long j11 = this.f52084w;
        C27417l c27417l = C27417l.f129055a;
        if (j11 <= c27417l.m140382f().m130131a() - this.f52083v) {
            this.f52084w = c27417l.m140382f().m130131a();
            m52966n(new C9991d(str, null), new C9992e(), new C9993f(str));
        } else {
            this.f52082u.removeCallbacksAndMessages(null);
            this.f52082u.postDelayed(new Runnable() { // from class: h20.r
                @Override // java.lang.Runnable
                public final void run() {
                    SearchVideoChannelPresenterImpl.m53466E(SearchVideoChannelPresenterImpl.this, str);
                }
            }, (this.f52084w + this.f52083v) - c27417l.m140382f().m130131a());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22775n1) m52968s()).getContext() != null) {
            this.f52081t.mo53687g();
        }
        m53470so();
    }

    /* renamed from: so */
    public void m53470so() {
        this.f52082u.removeCallbacksAndMessages(null);
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22775n1) m52968s()).getContext();
        if (context != null) {
            this.f52081t.mo53685d(context);
        }
    }

    @Override // h20.InterfaceC19733q
    /* renamed from: xu */
    public void mo53471xu(String str, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9988a(str, loadMoreInfo, null), new C9989b(), new C9990c(str));
    }
}
