package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.VideoLocationData;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19738v;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22730c2;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class VideoLocationPresenterImpl extends BasePresenterImpl<InterfaceC22730c2> implements InterfaceC19738v {

    /* renamed from: r */
    private final InterfaceC18170g f52127r;

    /* renamed from: s */
    private VideoLocationData f52128s;

    /* renamed from: t */
    private boolean f52129t;

    /* renamed from: u */
    private String f52130u;

    /* renamed from: v */
    private NetworkReceiver f52131v;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C10000a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52132t;

        C10000a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52132t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoLocationPresenterImpl.this.f52127r;
                String str = VideoLocationPresenterImpl.this.f52130u;
                this.f52132t = 1;
                obj = interfaceC18170g.mo96562I(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53508r(Continuation continuation) {
            return new C10000a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10000a) m53508r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C10001b extends AbstractC19075u implements InterfaceC18505l {
        C10001b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53510a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22730c2) VideoLocationPresenterImpl.this.m52968s()).mo55140d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53510a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C10002c extends AbstractC19075u implements InterfaceC18505l {
        C10002c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53511a(VideoLocationData videoLocationData) {
            AbstractC19074t.m100208f(videoLocationData, "result");
            VideoLocationPresenterImpl.this.f52128s = videoLocationData;
            ((InterfaceC22730c2) VideoLocationPresenterImpl.this.m52968s()).mo55138S5(videoLocationData);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53511a((VideoLocationData) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C10003d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52136t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f52138v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10003d(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f52138v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52136t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoLocationPresenterImpl.this.f52127r;
                String str = VideoLocationPresenterImpl.this.f52130u;
                LoadMoreInfo loadMoreInfo = this.f52138v;
                this.f52136t = 1;
                obj = interfaceC18170g.mo96565L(str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53512r(Continuation continuation) {
            return new C10003d(this.f52138v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10003d) m53512r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C10004e extends AbstractC19075u implements InterfaceC18505l {
        C10004e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53514a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22730c2) VideoLocationPresenterImpl.this.m52968s()).mo55140d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53514a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C10005f extends AbstractC19075u implements InterfaceC18505l {
        C10005f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53515a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22730c2) VideoLocationPresenterImpl.this.m52968s()).mo55141e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53515a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C10006g extends AbstractC19075u implements InterfaceC18494a {
        C10006g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53516a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53516a() {
            if (VideoLocationPresenterImpl.this.f52129t) {
                VideoLocationPresenterImpl.this.f52129t = false;
                ((InterfaceC22730c2) VideoLocationPresenterImpl.this.m52968s()).mo55139b(VideoLocationPresenterImpl.this.f52129t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoLocationPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C10007h extends AbstractC19075u implements InterfaceC18494a {
        C10007h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53517a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53517a() {
            if (!VideoLocationPresenterImpl.this.f52129t) {
                VideoLocationPresenterImpl.this.f52129t = true;
                ((InterfaceC22730c2) VideoLocationPresenterImpl.this.m52968s()).mo55139b(VideoLocationPresenterImpl.this.f52129t);
            }
        }
    }

    public VideoLocationPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f52127r = interfaceC18170g;
        this.f52129t = true;
        this.f52130u = "";
        this.f52131v = new NetworkReceiver(new C10006g(), new C10007h());
    }

    @Override // h20.InterfaceC19738v
    /* renamed from: Qh */
    public VideoLocationData mo53505Qh() {
        return this.f52128s;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22730c2) m52968s()).getContext() != null) {
            this.f52131v.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19738v
    /* renamed from: a */
    public void mo53506a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C10003d(loadMoreInfo, null), new C10004e(), new C10005f());
    }

    @Override // h20.InterfaceC19738v
    /* renamed from: i */
    public void mo53507i() {
        m52966n(new C10000a(null), new C10001b(), new C10002c());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("VIDEO_LOCATION_VALUE");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f52130u = str;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22730c2) m52968s()).getContext();
        if (context != null) {
            this.f52131v.mo53685d(context);
        }
    }
}
