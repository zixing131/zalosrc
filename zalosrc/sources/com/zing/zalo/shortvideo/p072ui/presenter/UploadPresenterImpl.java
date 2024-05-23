package com.zing.zalo.shortvideo.p072ui.presenter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.SearchHashTag;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.presenter.UploadPresenterImpl;
import e10.C18173j;
import e10.InterfaceC18170g;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import h20.InterfaceC19736t;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import m20.InterfaceC22811w1;
import p559uv.C27373c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q20.C25078a;
import qm0.AbstractC25370t;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class UploadPresenterImpl extends BasePresenterImpl<InterfaceC22811w1> implements InterfaceC19736t {

    /* renamed from: r */
    private final InterfaceC18170g f52109r;

    /* renamed from: s */
    private C27373c f52110s;

    /* renamed from: t */
    private Long f52111t;

    /* renamed from: u */
    private Handler f52112u;

    /* renamed from: v */
    private long f52113v;

    /* renamed from: w */
    private long f52114w;

    /* renamed from: x */
    private final CoroutineScope f52115x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.UploadPresenterImpl$a */
    /* loaded from: classes5.dex */
    public static final class C9999a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52116t;

        /* renamed from: u */
        private /* synthetic */ Object f52117u;

        /* renamed from: w */
        final /* synthetic */ String f52119w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.UploadPresenterImpl$a$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f52120t;

            /* renamed from: u */
            final /* synthetic */ UploadPresenterImpl f52121u;

            /* renamed from: v */
            final /* synthetic */ String f52122v;

            /* renamed from: w */
            final /* synthetic */ Section f52123w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UploadPresenterImpl uploadPresenterImpl, String str, Section section, Continuation continuation) {
                super(2, continuation);
                this.f52121u = uploadPresenterImpl;
                this.f52122v = str;
                this.f52123w = section;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f52121u, this.f52122v, this.f52123w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f52120t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ((InterfaceC22811w1) this.f52121u.m52968s()).mo55062IA(this.f52122v, this.f52123w);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.UploadPresenterImpl$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f52124t;

            /* renamed from: u */
            final /* synthetic */ UploadPresenterImpl f52125u;

            /* renamed from: v */
            final /* synthetic */ Exception f52126v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(UploadPresenterImpl uploadPresenterImpl, Exception exc, Continuation continuation) {
                super(2, continuation);
                this.f52125u = uploadPresenterImpl;
                this.f52126v = exc;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f52125u, this.f52126v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f52124t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ((InterfaceC22811w1) this.f52125u.m52968s()).mo55061Cs(this.f52126v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9999a(String str, Continuation continuation) {
            super(2, continuation);
            this.f52119w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C9999a c9999a = new C9999a(this.f52119w, continuation);
            c9999a.f52117u = obj;
            return c9999a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52116t;
            try {
            } catch (Exception e11) {
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                b bVar = new b(UploadPresenterImpl.this, e11, null);
                this.f52117u = null;
                this.f52116t = 3;
                if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                    }
                    return C24848g0.f119245a;
                }
                coroutineScope = (CoroutineScope) this.f52117u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                coroutineScope = (CoroutineScope) this.f52117u;
                if (!CoroutineScopeKt.m112642f(coroutineScope)) {
                    return C24848g0.f119245a;
                }
                InterfaceC18170g m53496z = UploadPresenterImpl.this.m53496z();
                String str = this.f52119w;
                this.f52117u = coroutineScope;
                this.f52116t = 1;
                obj = InterfaceC18170g.a.m96637g(m53496z, str, null, this, 2, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            if (CoroutineScopeKt.m112642f(coroutineScope)) {
                List<SearchHashTag> m51168m = section.m51168m();
                m131511r = AbstractC25370t.m131511r(m51168m, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                for (SearchHashTag searchHashTag : m51168m) {
                    arrayList.add(SearchHashTag.m51142b(searchHashTag, "#" + searchHashTag.m51145c(), 0L, 2, null));
                }
                Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
                MainCoroutineDispatcher m112681c2 = Dispatchers.m112681c();
                a aVar = new a(UploadPresenterImpl.this, this.f52119w, section2, null);
                this.f52117u = null;
                this.f52116t = 2;
                if (BuildersKt.m112534g(m112681c2, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9999a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public UploadPresenterImpl(InterfaceC18170g interfaceC18170g) {
        long j11;
        CoreConfig m51425b;
        Long m51448k;
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f52109r = interfaceC18170g;
        this.f52112u = new Handler(Looper.getMainLooper());
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51448k = m51425b.m51448k()) != null) {
            j11 = m51448k.longValue();
        } else {
            j11 = 0;
        }
        this.f52113v = j11;
        this.f52115x = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m53488B(UploadPresenterImpl uploadPresenterImpl, String str) {
        AbstractC19074t.m100208f(uploadPresenterImpl, "this$0");
        AbstractC19074t.m100208f(str, "$keyword");
        uploadPresenterImpl.mo53494m4(str);
    }

    @Override // h20.InterfaceC19736t
    /* renamed from: Jh */
    public void mo53490Jh() {
        if (this.f52110s == null) {
            ((InterfaceC22811w1) m52968s()).mo55064jr(new FileNotFoundException());
            return;
        }
        C18173j m96886b = C18173j.Companion.m96886b();
        C27373c c27373c = this.f52110s;
        AbstractC19074t.m100205c(c27373c);
        m96886b.m96877D(c27373c, ((InterfaceC22811w1) m52968s()).mo55065vz(), this.f52111t, ((InterfaceC22811w1) m52968s()).mo55063aq());
        ((InterfaceC22811w1) m52968s()).finish();
    }

    @Override // h20.InterfaceC19736t
    /* renamed from: K7 */
    public C27373c mo53491K7() {
        return this.f52110s;
    }

    @Override // h20.InterfaceC19736t
    /* renamed from: XB */
    public void mo53492XB(Bundle bundle, boolean z11) {
        Serializable serializable;
        C27373c c27373c;
        Serializable serializable2;
        Long l11 = null;
        if (C25078a.f120479a.m130005g()) {
            if (bundle != null) {
                serializable2 = bundle.getSerializable("EXTRA_VIDEO_INFO", C27373c.class);
                c27373c = (C27373c) serializable2;
            }
            c27373c = null;
        } else {
            if (bundle != null) {
                serializable = bundle.getSerializable("EXTRA_VIDEO_INFO");
            } else {
                serializable = null;
            }
            if (serializable instanceof C27373c) {
                c27373c = (C27373c) serializable;
            }
            c27373c = null;
        }
        this.f52110s = c27373c;
        if (!z11) {
            if (bundle != null) {
                l11 = Long.valueOf(bundle.getLong("xTaskId"));
            }
            this.f52111t = l11;
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        this.f52112u.removeCallbacksAndMessages(null);
        mo52967p(true);
        CoroutineScopeKt.m112639c(this.f52115x, null, 1, null);
        AbstractC1765e.m9273b(this, interfaceC1801w);
    }

    @Override // h20.InterfaceC19736t
    /* renamed from: Ye */
    public void mo53493Ye() {
        JobKt__JobKt.m112768g(this.f52115x.mo9207O(), null, 1, null);
    }

    @Override // h20.InterfaceC19736t
    /* renamed from: m4 */
    public void mo53494m4(final String str) {
        AbstractC19074t.m100208f(str, "keyword");
        long j11 = this.f52114w;
        C27417l c27417l = C27417l.f129055a;
        if (j11 <= c27417l.m140382f().m130131a() - this.f52113v) {
            this.f52114w = c27417l.m140382f().m130131a();
            BuildersKt__Builders_commonKt.m112540d(this.f52115x, null, null, new C9999a(str, null), 3, null);
        } else {
            this.f52112u.removeCallbacksAndMessages(null);
            this.f52112u.postDelayed(new Runnable() { // from class: h20.u
                @Override // java.lang.Runnable
                public final void run() {
                    UploadPresenterImpl.m53488B(UploadPresenterImpl.this, str);
                }
            }, (this.f52114w + this.f52113v) - c27417l.m140382f().m130131a());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        mo53492XB(bundle, false);
    }

    @Override // h20.InterfaceC19736t
    /* renamed from: xb */
    public String mo53495xb() {
        C27373c c27373c = this.f52110s;
        if (c27373c != null) {
            return c27373c.m140268v();
        }
        return null;
    }

    /* renamed from: z */
    public final InterfaceC18170g m53496z() {
        return this.f52109r;
    }
}
