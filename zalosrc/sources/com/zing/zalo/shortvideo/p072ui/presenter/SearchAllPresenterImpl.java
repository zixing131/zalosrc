package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.SearchAllData;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19728l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22747g1;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SearchAllPresenterImpl extends BasePresenterImpl<InterfaceC22747g1> implements InterfaceC19728l {

    /* renamed from: r */
    private final InterfaceC18170g f51977r;

    /* renamed from: s */
    private boolean f51978s;

    /* renamed from: t */
    private NetworkReceiver f51979t;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9949a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51980t;

        /* renamed from: v */
        final /* synthetic */ String f51982v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9949a(String str, Continuation continuation) {
            super(1, continuation);
            this.f51982v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51980t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchAllPresenterImpl.this.f51977r;
                String str = this.f51982v;
                this.f51980t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, str, null, null, null, null, null, this, 62, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53386r(Continuation continuation) {
            return new C9949a(this.f51982v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9949a) m53386r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9950b extends AbstractC19075u implements InterfaceC18505l {
        C9950b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53388a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54740l0(true, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53388a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9951c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51985r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9951c(String str) {
            super(1);
            this.f51985r = str;
        }

        /* renamed from: a */
        public final void m53389a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54731L2(this.f51985r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53389a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9952d extends AbstractC19075u implements InterfaceC18494a {
        C9952d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53390a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53390a() {
            if (SearchAllPresenterImpl.this.f51978s) {
                SearchAllPresenterImpl.this.f51978s = false;
                ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54736b(SearchAllPresenterImpl.this.f51978s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9953e extends AbstractC19075u implements InterfaceC18494a {
        C9953e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53391a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53391a() {
            if (!SearchAllPresenterImpl.this.f51978s) {
                SearchAllPresenterImpl.this.f51978s = true;
                ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54736b(SearchAllPresenterImpl.this.f51978s);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9954f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51988t;

        /* renamed from: v */
        final /* synthetic */ String f51990v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f51991w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9954f(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51990v = str;
            this.f51991w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51988t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchAllPresenterImpl.this.f51977r;
                String str = this.f51990v;
                LoadMoreInfo loadMoreInfo = this.f51991w;
                this.f51988t = 1;
                obj = interfaceC18170g.mo96609o0("search_all", str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53392r(Continuation continuation) {
            return new C9954f(this.f51990v, this.f51991w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9954f) m53392r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9955g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51993r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9955g(String str) {
            super(1);
            this.f51993r = str;
        }

        /* renamed from: a */
        public final void m53394a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54741p(this.f51993r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53394a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9956h extends AbstractC19075u implements InterfaceC18505l {
        C9956h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53395a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            SearchAllPresenterImpl.this.m53380D(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53395a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9957i extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51995t;

        /* renamed from: v */
        final /* synthetic */ String f51997v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9957i(String str, Continuation continuation) {
            super(1, continuation);
            this.f51997v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51995t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = SearchAllPresenterImpl.this.f51977r;
                String str = this.f51997v;
                this.f51995t = 1;
                obj = InterfaceC18170g.a.m96645o(interfaceC18170g, str, null, null, null, this, 14, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53396r(Continuation continuation) {
            return new C9957i(this.f51997v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9957i) m53396r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9958j extends AbstractC19075u implements InterfaceC18505l {
        C9958j() {
            super(1);
        }

        /* renamed from: a */
        public final void m53398a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54740l0(false, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53398a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.SearchAllPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9959k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f52000r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9959k(String str) {
            super(1);
            this.f52000r = str;
        }

        /* renamed from: a */
        public final void m53399a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22747g1) SearchAllPresenterImpl.this.m52968s()).mo54743z1(this.f52000r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53399a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    public SearchAllPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f51977r = interfaceC18170g;
        this.f51978s = true;
        this.f51979t = new NetworkReceiver(new C9952d(), new C9953e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m53380D(Section section) {
        ArrayList arrayList = new ArrayList();
        Iterator it = section.m51168m().iterator();
        while (it.hasNext()) {
            arrayList.add(new SearchAllData((Video) it.next()));
        }
        ((InterfaceC22747g1) m52968s()).mo54738e(new Section(arrayList, 0L, section.m51169n(), 2, (AbstractC19060k) null));
    }

    @Override // h20.InterfaceC19728l
    /* renamed from: B2 */
    public void mo53383B2(String str) {
        AbstractC19074t.m100208f(str, "id");
        m52966n(new C9957i(str, null), new C9958j(), new C9959k(str));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22747g1) m52968s()).getContext() != null) {
            this.f51979t.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19728l
    /* renamed from: a2 */
    public void mo53384a2(String str) {
        AbstractC19074t.m100208f(str, "id");
        m52966n(new C9949a(str, null), new C9950b(), new C9951c(str));
    }

    @Override // h20.InterfaceC19728l
    /* renamed from: t */
    public void mo53385t(String str, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9954f(str, loadMoreInfo, null), new C9955g(str), new C9956h());
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
        Context context = ((InterfaceC22747g1) m52968s()).getContext();
        if (context != null) {
            this.f51979t.mo53685d(context);
        }
    }
}
