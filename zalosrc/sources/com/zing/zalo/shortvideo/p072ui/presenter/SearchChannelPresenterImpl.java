package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19729m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22751h1;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SearchChannelPresenterImpl extends BasePresenterImpl<InterfaceC22751h1> implements InterfaceC19729m {

    /* renamed from: r */
    private final InterfaceC18170g f52001r;

    /* renamed from: s */
    private boolean f52002s;

    /* renamed from: t */
    private NetworkReceiver f52003t;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9960a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52004t;

        /* renamed from: v */
        final /* synthetic */ String f52006v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9960a(String str, Continuation continuation) {
            super(1, continuation);
            this.f52006v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52004t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchChannelPresenterImpl.this.f52001r;
                String str = this.f52006v;
                this.f52004t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, str, null, null, null, null, null, this, 62, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53408r(Continuation continuation) {
            return new C9960a(this.f52006v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9960a) m53408r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9961b extends AbstractC19075u implements InterfaceC18505l {
        C9961b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53410a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54767l0(true, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53410a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9962c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52009r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9962c(String str) {
            super(1);
            this.f52009r = str;
        }

        /* renamed from: a */
        public final void m53411a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54762L2(this.f52009r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53411a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$d */
    /* loaded from: classes5.dex */
    public static final class C9963d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52010t;

        /* renamed from: v */
        final /* synthetic */ List f52012v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9963d(List list, Continuation continuation) {
            super(1, continuation);
            this.f52012v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52010t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchChannelPresenterImpl.this.f52001r;
                List list = this.f52012v;
                this.f52010t = 1;
                obj = interfaceC18170g.mo96560G0(list, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53412r(Continuation continuation) {
            return new C9963d(this.f52012v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9963d) m53412r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$e */
    /* loaded from: classes5.dex */
    public static final class C9964e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52014r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9964e(String str) {
            super(1);
            this.f52014r = str;
        }

        /* renamed from: a */
        public final void m53414a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54769p(this.f52014r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53414a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$f */
    /* loaded from: classes5.dex */
    public static final class C9965f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Section f52015q;

        /* renamed from: r */
        final /* synthetic */ SearchChannelPresenterImpl f52016r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9965f(Section section, SearchChannelPresenterImpl searchChannelPresenterImpl) {
            super(1);
            this.f52015q = section;
            this.f52016r = searchChannelPresenterImpl;
        }

        /* renamed from: a */
        public final void m53415a(List list) {
            Object obj;
            AbstractC19074t.m100208f(list, "result");
            for (Channel channel : this.f52015q.m51168m()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((PersonalizeChannel) obj).m51102a(), channel.m50769l())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PersonalizeChannel personalizeChannel = (PersonalizeChannel) obj;
                if (personalizeChannel != null) {
                    channel.m50744T(personalizeChannel);
                }
            }
            ((InterfaceC22751h1) this.f52016r.m52968s()).mo54766e(this.f52015q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53415a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9966g extends AbstractC19075u implements InterfaceC18494a {
        C9966g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53416a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53416a() {
            if (SearchChannelPresenterImpl.this.f52002s) {
                SearchChannelPresenterImpl.this.f52002s = false;
                ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54765b(SearchChannelPresenterImpl.this.f52002s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9967h extends AbstractC19075u implements InterfaceC18494a {
        C9967h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53417a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53417a() {
            if (!SearchChannelPresenterImpl.this.f52002s) {
                SearchChannelPresenterImpl.this.f52002s = true;
                ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54765b(SearchChannelPresenterImpl.this.f52002s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9968i extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52019t;

        /* renamed from: v */
        final /* synthetic */ String f52021v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f52022w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9968i(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f52021v = str;
            this.f52022w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52019t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchChannelPresenterImpl.this.f52001r;
                String str = this.f52021v;
                LoadMoreInfo loadMoreInfo = this.f52022w;
                this.f52019t = 1;
                obj = interfaceC18170g.mo96622v0(str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53418r(Continuation continuation) {
            return new C9968i(this.f52021v, this.f52022w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9968i) m53418r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9969j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52024r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9969j(String str) {
            super(1);
            this.f52024r = str;
        }

        /* renamed from: a */
        public final void m53420a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54769p(this.f52024r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53420a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9970k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52026r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9970k(String str) {
            super(1);
            this.f52026r = str;
        }

        /* renamed from: a */
        public final void m53421a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            SearchChannelPresenterImpl.this.m53402D(this.f52026r, section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53421a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$l */
    /* loaded from: classes5.dex */
    static final class C9971l extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52027t;

        /* renamed from: v */
        final /* synthetic */ String f52029v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9971l(String str, Continuation continuation) {
            super(1, continuation);
            this.f52029v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52027t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchChannelPresenterImpl.this.f52001r;
                String str = this.f52029v;
                this.f52027t = 1;
                obj = InterfaceC18170g.a.m96645o(interfaceC18170g, str, null, null, null, this, 14, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53422r(Continuation continuation) {
            return new C9971l(this.f52029v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9971l) m53422r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C9972m extends AbstractC19075u implements InterfaceC18505l {
        C9972m() {
            super(1);
        }

        /* renamed from: a */
        public final void m53424a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54767l0(false, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53424a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchChannelPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9973n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52032r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9973n(String str) {
            super(1);
            this.f52032r = str;
        }

        /* renamed from: a */
        public final void m53425a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22751h1) SearchChannelPresenterImpl.this.m52968s()).mo54770z1(this.f52032r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53425a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    public SearchChannelPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f52001r = interfaceC18170g;
        this.f52002s = true;
        this.f52003t = new NetworkReceiver(new C9966g(), new C9967h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m53402D(String str, Section section) {
        int m131511r;
        List m51168m = section.m51168m();
        m131511r = AbstractC25370t.m131511r(m51168m, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m51168m.iterator();
        while (it.hasNext()) {
            arrayList.add(((Channel) it.next()).m50769l());
        }
        m52966n(new C9963d(arrayList, null), new C9964e(str), new C9965f(section, this));
    }

    @Override // h20.InterfaceC19729m
    /* renamed from: B2 */
    public void mo53405B2(String str) {
        AbstractC19074t.m100208f(str, "id");
        m52966n(new C9971l(str, null), new C9972m(), new C9973n(str));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22751h1) m52968s()).getContext() != null) {
            this.f52003t.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19729m
    /* renamed from: a2 */
    public void mo53406a2(String str) {
        AbstractC19074t.m100208f(str, "id");
        m52966n(new C9960a(str, null), new C9961b(), new C9962c(str));
    }

    @Override // h20.InterfaceC19729m
    /* renamed from: t */
    public void mo53407t(String str, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9968i(str, loadMoreInfo, null), new C9969j(str), new C9970k(str));
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
        Context context = ((InterfaceC22751h1) m52968s()).getContext();
        if (context != null) {
            this.f52003t.mo53685d(context);
        }
    }
}
