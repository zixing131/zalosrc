package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import e10.InterfaceC18170g;
import en0.InterfaceC18509p;
import f10.C18691c;
import f10.C18692d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C24994c2;
import q20.AbstractC25089l;
import q20.C25097t;
import s20.AbstractC26112n;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public class UploadCropImagePageView extends CropImagePageView {
    public static final C10489a Companion = new C10489a(null);

    /* renamed from: D0 */
    private final CoroutineScope f53407D0 = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadCropImagePageView$a */
    /* loaded from: classes5.dex */
    public static final class C10489a {
        private C10489a() {
        }

        public /* synthetic */ C10489a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadCropImagePageView$b */
    /* loaded from: classes5.dex */
    static final class C10490b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53408t;

        /* renamed from: u */
        final /* synthetic */ Uri f53409u;

        /* renamed from: v */
        final /* synthetic */ UploadCropImagePageView f53410v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadCropImagePageView$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ UploadCropImagePageView f53411p;

            /* renamed from: q */
            final /* synthetic */ Uri f53412q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadCropImagePageView$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32744a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f53413t;

                /* renamed from: u */
                final /* synthetic */ UploadCropImagePageView f53414u;

                /* renamed from: v */
                final /* synthetic */ C18692d f53415v;

                /* renamed from: w */
                final /* synthetic */ Uri f53416w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32744a(UploadCropImagePageView uploadCropImagePageView, C18692d c18692d, Uri uri, Continuation continuation) {
                    super(2, continuation);
                    this.f53414u = uploadCropImagePageView;
                    this.f53415v = c18692d;
                    this.f53416w = uri;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32744a(this.f53414u, this.f53415v, this.f53416w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f53413t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C24994c2 c24994c2 = (C24994c2) this.f53414u.m55556SK();
                        if (c24994c2 != null) {
                            SimpleShadowTextView simpleShadowTextView = c24994c2.f119819s;
                            AbstractC19074t.m100207e(simpleShadowTextView, "btnDone");
                            AbstractC26112n.m134431w0(simpleShadowTextView);
                            ProgressBar progressBar = c24994c2.f119817q;
                            AbstractC19074t.m100207e(progressBar, "barLoading");
                            AbstractC26112n.m134367H(progressBar);
                        }
                        if (!this.f53414u.mo54244fL(((C18691c) this.f53415v).m98594b())) {
                            UploadCropImagePageView uploadCropImagePageView = this.f53414u;
                            Intent intent = new Intent();
                            intent.putExtra("xUploadedZmcId", ((C18691c) this.f53415v).m98594b());
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            uploadCropImagePageView.mo50035CK(-1, intent);
                            this.f53414u.finish();
                        }
                        AbstractC25089l.Companion.m130046b(this.f53416w.getPath());
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32744a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(UploadCropImagePageView uploadCropImagePageView, Uri uri) {
                this.f53411p = uploadCropImagePageView;
                this.f53412q = uri;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C18692d c18692d, Continuation continuation) {
                Object m142578e;
                if (c18692d instanceof C18691c) {
                    Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new C32744a(this.f53411p, c18692d, this.f53412q, null), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (m112534g == m142578e) {
                        return m112534g;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadCropImagePageView$b$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f53417t;

            /* renamed from: u */
            final /* synthetic */ UploadCropImagePageView f53418u;

            /* renamed from: v */
            final /* synthetic */ Exception f53419v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(UploadCropImagePageView uploadCropImagePageView, Exception exc, Continuation continuation) {
                super(2, continuation);
                this.f53418u = uploadCropImagePageView;
                this.f53419v = exc;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f53418u, this.f53419v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f53417t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C24994c2 c24994c2 = (C24994c2) this.f53418u.m55556SK();
                    if (c24994c2 != null) {
                        SimpleShadowTextView simpleShadowTextView = c24994c2.f119819s;
                        AbstractC19074t.m100207e(simpleShadowTextView, "btnDone");
                        AbstractC26112n.m134431w0(simpleShadowTextView);
                        ProgressBar progressBar = c24994c2.f119817q;
                        AbstractC19074t.m100207e(progressBar, "barLoading");
                        AbstractC26112n.m134367H(progressBar);
                    }
                    if (!this.f53418u.mo54243eL(this.f53419v)) {
                        C25097t.f120556a.m130155r(this.f53418u.getContext(), this.f53419v);
                    }
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
        C10490b(Uri uri, UploadCropImagePageView uploadCropImagePageView, Continuation continuation) {
            super(2, continuation);
            this.f53409u = uri;
            this.f53410v = uploadCropImagePageView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10490b(this.f53409u, this.f53410v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53408t;
            try {
            } catch (Exception e11) {
                if (!this.f53410v.mo60294yp()) {
                    MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                    b bVar = new b(this.f53410v, e11, null);
                    this.f53408t = 2;
                    if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                String path = this.f53409u.getPath();
                AbstractC19074t.m100205c(path);
                Flow mo96617t = m143667D.mo96617t(path);
                a aVar = new a(this.f53410v, this.f53409u);
                this.f53408t = 1;
                if (mo96617t.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10490b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        CoroutineScopeKt.m112639c(this.f53407D0, null, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CropImagePageView
    /* renamed from: cL */
    public final boolean mo54233cL(Uri uri) {
        AbstractC19074t.m100208f(uri, "result");
        C24994c2 c24994c2 = (C24994c2) m55556SK();
        if (c24994c2 != null) {
            SimpleShadowTextView simpleShadowTextView = c24994c2.f119819s;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnDone");
            AbstractC26112n.m134367H(simpleShadowTextView);
            ProgressBar progressBar = c24994c2.f119817q;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
        }
        BuildersKt__Builders_commonKt.m112540d(this.f53407D0, null, null, new C10490b(uri, this, null), 3, null);
        return true;
    }

    /* renamed from: eL */
    public boolean mo54243eL(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        return false;
    }

    /* renamed from: fL */
    public boolean mo54244fL(String str) {
        AbstractC19074t.m100208f(str, "zmcId");
        return false;
    }
}
