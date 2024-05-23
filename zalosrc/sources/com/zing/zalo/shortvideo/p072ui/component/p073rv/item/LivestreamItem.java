package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import b10.AbstractC2488g;
import c20.C3220j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.data.utils.AbstractC9464a;
import com.zing.zalo.shortvideo.p072ui.widget.GridLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LivestreamCommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionButton;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import ln0.AbstractC22543l;
import mj0.AbstractC23322a;
import p10.EnumC24601e;
import p354n3.C23528a;
import p379o3.AbstractRunnableC23992c;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25062w;
import q20.C25083f;
import q20.C25092o;
import r20.AbstractC25622b;
import r20.C25624d;
import r20.C25626f;
import r20.C25627g;
import r20.C25628h;
import s20.AbstractC26104f;
import s20.AbstractC26105g;
import s20.AbstractC26108j;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class LivestreamItem extends FrameLayout {
    public static final C9613b Companion = new C9613b(null);

    /* renamed from: A */
    private final int f50728A;

    /* renamed from: B */
    private final int f50729B;

    /* renamed from: C */
    private final int f50730C;

    /* renamed from: D */
    private final int f50731D;

    /* renamed from: E */
    private final int f50732E;

    /* renamed from: F */
    private final int f50733F;

    /* renamed from: G */
    private final int f50734G;

    /* renamed from: H */
    private final int f50735H;

    /* renamed from: I */
    private final int f50736I;

    /* renamed from: J */
    private final int f50737J;

    /* renamed from: K */
    private final int f50738K;

    /* renamed from: L */
    private final int f50739L;

    /* renamed from: M */
    private final int f50740M;

    /* renamed from: N */
    private final int f50741N;

    /* renamed from: O */
    private final int f50742O;

    /* renamed from: P */
    private final int f50743P;

    /* renamed from: Q */
    private final int f50744Q;

    /* renamed from: R */
    private final int f50745R;

    /* renamed from: S */
    private final int f50746S;

    /* renamed from: T */
    private final int f50747T;

    /* renamed from: U */
    private final int f50748U;

    /* renamed from: V */
    private final int f50749V;

    /* renamed from: W */
    private final int f50750W;

    /* renamed from: a0 */
    private final int f50751a0;

    /* renamed from: b0 */
    private final int f50752b0;

    /* renamed from: c0 */
    private final int f50753c0;

    /* renamed from: d0 */
    private final C3220j f50754d0;

    /* renamed from: e0 */
    private final Handler f50755e0;

    /* renamed from: f0 */
    private final Handler f50756f0;

    /* renamed from: g0 */
    private boolean f50757g0;

    /* renamed from: h0 */
    private float f50758h0;

    /* renamed from: i0 */
    private final long f50759i0;

    /* renamed from: j0 */
    private AbstractC25622b f50760j0;

    /* renamed from: k0 */
    private boolean f50761k0;

    /* renamed from: l0 */
    private float f50762l0;

    /* renamed from: m0 */
    private int f50763m0;

    /* renamed from: n0 */
    private int f50764n0;

    /* renamed from: o0 */
    private int f50765o0;

    /* renamed from: p */
    private InterfaceC9612a f50766p;

    /* renamed from: p0 */
    private VelocityTracker f50767p0;

    /* renamed from: q */
    private final int f50768q;

    /* renamed from: q0 */
    private MotionEvent f50769q0;

    /* renamed from: r */
    private final int f50770r;

    /* renamed from: r0 */
    private MotionEvent f50771r0;

    /* renamed from: s */
    private final int f50772s;

    /* renamed from: s0 */
    private MotionEvent f50773s0;

    /* renamed from: t */
    private final int f50774t;

    /* renamed from: t0 */
    private int f50775t0;

    /* renamed from: u */
    private final int f50776u;

    /* renamed from: u0 */
    private boolean f50777u0;

    /* renamed from: v */
    private final int f50778v;

    /* renamed from: v0 */
    private LivestreamData f50779v0;

    /* renamed from: w */
    private final int f50780w;

    /* renamed from: w0 */
    private C25062w f50781w0;

    /* renamed from: x */
    private final int f50782x;

    /* renamed from: y */
    private final int f50783y;

    /* renamed from: z */
    private final int f50784z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9612a {
        /* renamed from: a */
        void mo52267a();

        /* renamed from: b */
        void mo52268b();

        /* renamed from: c */
        void mo52269c();

        /* renamed from: d */
        void mo52270d();

        /* renamed from: e */
        void mo52271e();

        /* renamed from: f */
        void mo52272f();

        /* renamed from: g */
        void mo52273g();

        /* renamed from: h */
        void mo52274h();

        /* renamed from: i */
        void mo52275i();

        /* renamed from: j */
        void mo52276j();

        /* renamed from: k */
        void mo52277k();

        /* renamed from: l */
        void mo52278l(boolean z11);

        /* renamed from: m */
        void mo52279m();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$b */
    /* loaded from: classes5.dex */
    public static final class C9613b {
        private C9613b() {
        }

        public /* synthetic */ C9613b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$c */
    /* loaded from: classes5.dex */
    public static final class C9614c extends AbstractC19075u implements InterfaceC18494a {
        C9614c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52280a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52280a() {
            LivestreamItem.this.m52187D0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$d */
    /* loaded from: classes5.dex */
    public static final class C9615d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25062w f50787r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9615d(C25062w c25062w) {
            super(1);
            this.f50787r = c25062w;
        }

        /* renamed from: a */
        public final void m52281a(float f11) {
            LivestreamItem.this.m52185C0((-f11) / this.f50787r.f120390t.getMeasuredWidth());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52281a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$e */
    /* loaded from: classes5.dex */
    public static final class C9616e extends AbstractC19075u implements InterfaceC18494a {
        C9616e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52282a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52282a() {
            LivestreamItem.this.m52187D0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$f */
    /* loaded from: classes5.dex */
    public static final class C9617f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25062w f50790r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9617f(C25062w c25062w) {
            super(1);
            this.f50790r = c25062w;
        }

        /* renamed from: a */
        public final void m52283a(float f11) {
            LivestreamItem.this.m52185C0((-f11) / this.f50790r.f120390t.getMeasuredWidth());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52283a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$g */
    /* loaded from: classes5.dex */
    public static final class C9618g extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ C25062w f50792m1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$g$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50793t;

            /* renamed from: u */
            final /* synthetic */ Bitmap f50794u;

            /* renamed from: v */
            final /* synthetic */ LivestreamItem f50795v;

            /* renamed from: w */
            final /* synthetic */ C25062w f50796w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32729a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50797t;

                /* renamed from: u */
                final /* synthetic */ C25062w f50798u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50799v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32729a(C25062w c25062w, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50798u = c25062w;
                    this.f50799v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32729a(this.f50798u, this.f50799v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50797t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50798u.f120368L.setImageBitmap(this.f50799v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32729a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, LivestreamItem livestreamItem, C25062w c25062w, Continuation continuation) {
                super(2, continuation);
                this.f50794u = bitmap;
                this.f50795v = livestreamItem;
                this.f50796w = c25062w;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f50794u, this.f50795v, this.f50796w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50793t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f50794u, 100.0f);
                    if (m130014a != null) {
                        LivestreamItem livestreamItem = this.f50795v;
                        C25062w c25062w = this.f50796w;
                        c25083f.m130015c(m130014a, livestreamItem.f50753c0);
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32729a c32729a = new C32729a(c25062w, m130014a, null);
                        this.f50793t = 1;
                        if (BuildersKt.m112534g(m112681c, c32729a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
                AbstractRunnableC23992c.m125520D();
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9618g(C25062w c25062w) {
            this.f50792m1 = c25062w;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, LivestreamItem.this, this.f50792m1, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$h */
    /* loaded from: classes5.dex */
    public static final class C9619h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9619h f50800q = new C9619h();

        C9619h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52286a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52286a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$i */
    /* loaded from: classes5.dex */
    public static final class C9620i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9620i f50801q = new C9620i();

        C9620i() {
            super(1);
        }

        /* renamed from: a */
        public final void m52287a(float f11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52287a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$j */
    /* loaded from: classes5.dex */
    static final class C9621j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25062w f50802q;

        /* renamed from: r */
        final /* synthetic */ LivestreamItem f50803r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9621j(C25062w c25062w, LivestreamItem livestreamItem) {
            super(1);
            this.f50802q = c25062w;
            this.f50803r = livestreamItem;
        }

        /* renamed from: a */
        public final void m52288a(View view) {
            Boolean bool;
            AbstractC19074t.m100208f(view, "it");
            Object tag = this.f50802q.f120378V.getTag();
            if (tag instanceof Boolean) {
                bool = (Boolean) tag;
            } else {
                bool = null;
            }
            if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                InterfaceC9612a callback = this.f50803r.getCallback();
                if (callback != null) {
                    callback.mo52277k();
                    return;
                }
                return;
            }
            InterfaceC9612a callback2 = this.f50803r.getCallback();
            if (callback2 != null) {
                callback2.mo52271e();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52288a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$k */
    /* loaded from: classes5.dex */
    static final class C9622k extends AbstractC19075u implements InterfaceC18505l {
        C9622k() {
            super(1);
        }

        /* renamed from: a */
        public final void m52289a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52273g();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52289a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$l */
    /* loaded from: classes5.dex */
    static final class C9623l extends AbstractC19075u implements InterfaceC18505l {
        C9623l() {
            super(1);
        }

        /* renamed from: a */
        public final void m52290a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52272f();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52290a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$m */
    /* loaded from: classes5.dex */
    static final class C9624m extends AbstractC19075u implements InterfaceC18494a {
        C9624m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52291a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52291a() {
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52274h();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$n */
    /* loaded from: classes5.dex */
    static final class C9625n extends AbstractC19075u implements InterfaceC18505l {
        C9625n() {
            super(1);
        }

        /* renamed from: a */
        public final void m52292a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52267a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52292a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$o */
    /* loaded from: classes5.dex */
    static final class C9626o extends AbstractC19075u implements InterfaceC18505l {
        C9626o() {
            super(1);
        }

        /* renamed from: a */
        public final void m52293a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52267a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52293a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$p */
    /* loaded from: classes5.dex */
    static final class C9627p extends AbstractC19075u implements InterfaceC18505l {
        C9627p() {
            super(1);
        }

        /* renamed from: a */
        public final void m52294a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52275i();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52294a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$q */
    /* loaded from: classes5.dex */
    static final class C9628q extends AbstractC19075u implements InterfaceC18505l {
        C9628q() {
            super(1);
        }

        /* renamed from: a */
        public final void m52295a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52270d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52295a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$r */
    /* loaded from: classes5.dex */
    static final class C9629r extends AbstractC19075u implements InterfaceC18505l {
        C9629r() {
            super(1);
        }

        /* renamed from: a */
        public final void m52296a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9612a callback = LivestreamItem.this.getCallback();
            if (callback != null) {
                callback.mo52269c();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52296a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$s */
    /* loaded from: classes5.dex */
    static final class C9630s extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25062w f50812q;

        /* renamed from: r */
        final /* synthetic */ LivestreamItem f50813r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9630s(C25062w c25062w, LivestreamItem livestreamItem) {
            super(1);
            this.f50812q = c25062w;
            this.f50813r = livestreamItem;
        }

        /* renamed from: a */
        public final void m52297a(View view) {
            AbstractC19074t.m100208f(view, "it");
            LinearLayout linearLayout = this.f50812q.f120365I;
            AbstractC19074t.m100207e(linearLayout, "lytError");
            AbstractC26112n.m134367H(linearLayout);
            InterfaceC9612a callback = this.f50813r.getCallback();
            if (callback != null) {
                callback.mo52268b();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52297a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$t */
    /* loaded from: classes5.dex */
    public static final class C9631t extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ C25062w f50815m1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$t$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50816t;

            /* renamed from: u */
            final /* synthetic */ Bitmap f50817u;

            /* renamed from: v */
            final /* synthetic */ LivestreamItem f50818v;

            /* renamed from: w */
            final /* synthetic */ C25062w f50819w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem$t$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32730a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50820t;

                /* renamed from: u */
                final /* synthetic */ C25062w f50821u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50822v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32730a(C25062w c25062w, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50821u = c25062w;
                    this.f50822v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32730a(this.f50821u, this.f50822v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50820t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50821u.f120369M.setImageBitmap(this.f50822v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32730a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, LivestreamItem livestreamItem, C25062w c25062w, Continuation continuation) {
                super(2, continuation);
                this.f50817u = bitmap;
                this.f50818v = livestreamItem;
                this.f50819w = c25062w;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f50817u, this.f50818v, this.f50819w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50816t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f50817u, 100.0f);
                    if (m130014a != null) {
                        LivestreamItem livestreamItem = this.f50818v;
                        C25062w c25062w = this.f50819w;
                        c25083f.m130015c(m130014a, livestreamItem.f50753c0);
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32730a c32730a = new C32730a(c25062w, m130014a, null);
                        this.f50816t = 1;
                        if (BuildersKt.m112534g(m112681c, c32730a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
                AbstractRunnableC23992c.m125520D();
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9631t(C25062w c25062w) {
            this.f50815m1 = c25062w;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, LivestreamItem.this, this.f50815m1, null), 3, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        setWillNotDraw(false);
        setMotionEventSplittingEnabled(false);
        this.f50768q = AbstractC26112n.m134365F(this);
        this.f50770r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_padding);
        this.f50772s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_live_height);
        this.f50774t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_live_padding);
        this.f50776u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_live_to_info);
        this.f50778v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_live_margin_top);
        this.f50780w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_live_margin_bottom);
        this.f50782x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_height);
        this.f50783y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_margin_top);
        this.f50784z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_margin_bottom);
        this.f50728A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_avatar_size);
        this.f50729B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_avatar_margin);
        this.f50730C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_avatar_to_info);
        this.f50731D = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_info_to_follow);
        this.f50732E = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_follow_width);
        this.f50733F = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_follow_height);
        this.f50734G = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_card_follow_margin);
        this.f50735H = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_info_to_buttons);
        this.f50736I = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_button_size);
        this.f50737J = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_header_extra_info_height);
        this.f50738K = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_footer_button_size);
        this.f50739L = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_footer_button_spacing);
        this.f50740M = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_rotate_button_height);
        this.f50741N = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_rotate_button_margin);
        this.f50742O = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_comment_margin_right);
        this.f50743P = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_loading_bar_size);
        this.f50744Q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_end_avatar_size);
        this.f50745R = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_end_divider_width);
        this.f50746S = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_livestream_end_divider_height);
        this.f50747T = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_ended_avatar_to_iv_close);
        this.f50748U = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_ended_avatar_to_title);
        this.f50749V = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_ended_title_to_duration);
        this.f50750W = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_ended_duration_to_divider);
        this.f50751a0 = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_ended_divider_to_tv_more);
        this.f50752b0 = AbstractC26112n.m134433y(this, AbstractC27407b.zch_simple_item_livestream_ended_tv_more_to_box);
        this.f50753c0 = AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain);
        this.f50754d0 = new C3220j();
        this.f50755e0 = new Handler(Looper.getMainLooper());
        this.f50756f0 = new Handler(Looper.getMainLooper());
        this.f50757g0 = true;
        this.f50758h0 = 1.0f;
        this.f50759i0 = 3000L;
        this.f50761k0 = true;
        this.f50762l0 = 1.0f;
    }

    /* renamed from: A */
    private final void m52181A(boolean z11, boolean z12) {
        String string;
        C25062w c25062w = null;
        if (z11) {
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w2 = null;
            }
            c25062w2.f120378V.setText("");
            C25062w c25062w3 = this.f50781w0;
            if (c25062w3 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w3 = null;
            }
            SimpleShadowTextView simpleShadowTextView = c25062w3.f120378V;
            if (z12) {
                string = getContext().getString(AbstractC27413h.zch_popup_ekyc_unverified_zalo_acc);
            } else {
                string = getContext().getString(AbstractC27413h.zch_livestream_can_not_comment);
            }
            simpleShadowTextView.setHint(string);
            C25062w c25062w4 = this.f50781w0;
            if (c25062w4 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w4 = null;
            }
            c25062w4.f120378V.setEnabled(z12);
        } else {
            C25062w c25062w5 = this.f50781w0;
            if (c25062w5 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w5 = null;
            }
            c25062w5.f120378V.setHint(getContext().getString(AbstractC27413h.zch_item_livestream_comment_hint));
            C25062w c25062w6 = this.f50781w0;
            if (c25062w6 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w6 = null;
            }
            c25062w6.f120378V.setEnabled(true);
        }
        C25062w c25062w7 = this.f50781w0;
        if (c25062w7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w7;
        }
        c25062w.f120378V.setTag(Boolean.valueOf(z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m52182A0(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: B */
    private final void m52183B(float f11, float f12, float f13, float f14, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f12 >= f11 && f12 <= f13 && f14 != 0.0f) {
            C25624d c25624d = new C25624d(new C25626f(f12));
            c25624d.m132328c(new AbstractC25622b.r() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.q
                @Override // r20.AbstractC25622b.r
                /* renamed from: a */
                public final void mo52475a(AbstractC25622b abstractC25622b, float f15, float f16) {
                    LivestreamItem.m52186D(InterfaceC18505l.this, abstractC25622b, f15, f16);
                }
            });
            c25624d.m132327b(new AbstractC25622b.q() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.r
                @Override // r20.AbstractC25622b.q
                /* renamed from: a */
                public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f15, float f16) {
                    LivestreamItem.m52188E(InterfaceC18494a.this, abstractC25622b, z11, f15, f16);
                }
            });
            c25624d.m132372u(f14);
            c25624d.m132371t(f11);
            c25624d.m132370s(f13);
            c25624d.m132369r(0.1f);
            c25624d.mo132336n();
            this.f50760j0 = c25624d;
            return;
        }
        interfaceC18494a.mo12V4();
    }

    /* renamed from: C */
    static /* synthetic */ void m52184C(LivestreamItem livestreamItem, float f11, float f12, float f13, float f14, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            interfaceC18494a = C9619h.f50800q;
        }
        if ((i11 & 32) != 0) {
            interfaceC18505l = C9620i.f50801q;
        }
        livestreamItem.m52183B(f11, f12, f13, f14, interfaceC18494a, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public final void m52185C0(float f11) {
        this.f50762l0 = f11;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m52186D(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public final void m52187D0(boolean z11) {
        C25062w c25062w = null;
        if (z11) {
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w2;
            }
            c25062w.f120395y.setImageResource(AbstractC23322a.zch_ic_close_comment_shadow_line_24);
        } else {
            C25062w c25062w3 = this.f50781w0;
            if (c25062w3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w3;
            }
            c25062w.f120395y.setImageResource(AbstractC23322a.zch_ic_comment_shadow_line_24);
        }
        this.f50761k0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m52188E(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m52189F0(LivestreamItem livestreamItem, int i11, Long l11, Long l12, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        livestreamItem.m52246E0(i11, l11, l12, z11);
    }

    /* renamed from: G */
    private final void m52190G(boolean z11, String str) {
        C25062w c25062w = null;
        if ((str == null || str.length() == 0) && z11) {
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w2;
            }
            ImageView imageView = c25062w.f120392v;
            AbstractC19074t.m100207e(imageView, "btnFooterShare");
            AbstractC26112n.m134367H(imageView);
            return;
        }
        C25062w c25062w3 = this.f50781w0;
        if (c25062w3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w3;
        }
        ImageView imageView2 = c25062w.f120392v;
        AbstractC19074t.m100207e(imageView2, "btnFooterShare");
        AbstractC26112n.m134431w0(imageView2);
    }

    /* renamed from: G0 */
    private final void m52191G0(boolean z11) {
        C25062w c25062w = null;
        if (z11) {
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w2;
            }
            c25062w.f120385c0.setBackgroundResource(AbstractC27406a.zch_black_a50);
            return;
        }
        C25062w c25062w3 = this.f50781w0;
        if (c25062w3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w3;
        }
        View view = c25062w.f120385c0;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1291845632, 0, 0, 218103808, 1711276032, -1509949440});
        view.setBackground(gradientDrawable);
    }

    /* renamed from: I */
    private final boolean m52192I(View view, int i11, int i12) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (i11 >= rect.left && i11 <= rect.right && i12 >= rect.top && i12 <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private final boolean m52193J() {
        if (getMeasuredWidth() < getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m52194K(LivestreamItem livestreamItem, View view) {
        AbstractC19074t.m100208f(livestreamItem, "this$0");
        livestreamItem.f50755e0.removeCallbacksAndMessages(null);
        if (livestreamItem.m52193J()) {
            livestreamItem.f50757g0 = true;
        } else {
            livestreamItem.f50757g0 = !livestreamItem.f50757g0;
            livestreamItem.m52237r0();
        }
        livestreamItem.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m52195L(LivestreamItem livestreamItem, View view) {
        AbstractC19074t.m100208f(livestreamItem, "this$0");
        InterfaceC9612a interfaceC9612a = livestreamItem.f50766p;
        if (interfaceC9612a != null) {
            interfaceC9612a.mo52276j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m52196M(LivestreamItem livestreamItem, View view) {
        float f11;
        AbstractC19074t.m100208f(livestreamItem, "this$0");
        if (livestreamItem.f50761k0) {
            f11 = 1.0f;
        } else {
            f11 = -1.0f;
        }
        livestreamItem.m52239u(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m52197N(LivestreamItem livestreamItem, View view) {
        AbstractC19074t.m100208f(livestreamItem, "this$0");
        InterfaceC9612a interfaceC9612a = livestreamItem.f50766p;
        if (interfaceC9612a != null) {
            interfaceC9612a.mo52279m();
        }
    }

    /* renamed from: O */
    private final Rect m52198O(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int measuredWidth = c25062w.f120390t.getMeasuredWidth();
        int measuredWidth2 = c25062w.f120368L.getMeasuredWidth() + i11;
        m52203T(z11, i11, i12, measuredWidth2, i14);
        m52201R(z11, i11, i12, measuredWidth2, i14);
        m52202S(z11, i11, i12, measuredWidth2, i14 - m52200Q(z11, i11, i12, measuredWidth2, i14).height());
        m52199P(z11, measuredWidth2, i12, measuredWidth2 + measuredWidth, i14);
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: P */
    private final Rect m52199P(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        View view = c25062w.f120390t;
        AbstractC19074t.m100207e(view, "bgdComment");
        AbstractC26112n.m134383X(view, i12, i11);
        int i15 = this.f50770r + i12;
        LivestreamCommentLayout livestreamCommentLayout = c25062w.f120364H;
        AbstractC19074t.m100207e(livestreamCommentLayout, "lytComment");
        AbstractC26112n.m134383X(livestreamCommentLayout, i15, i11);
        int i16 = this.f50770r;
        SimpleShadowTextView simpleShadowTextView = c25062w.f120378V;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtFooterComment");
        AbstractC26112n.m134381V(simpleShadowTextView, i14 - i16, i11 + i16);
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: Q */
    private final Rect m52200Q(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int i15 = i13 - this.f50770r;
        LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
        AbstractC26112n.m134384Y(livestreamRotateButton, i14, i15);
        int i16 = i15 - (this.f50738K + this.f50739L);
        ImageView imageView = c25062w.f120391u;
        AbstractC19074t.m100207e(imageView, "btnFooterMore");
        if (AbstractC26112n.m134378S(imageView)) {
            ImageView imageView2 = c25062w.f120391u;
            AbstractC19074t.m100207e(imageView2, "btnFooterMore");
            AbstractC26112n.m134384Y(imageView2, i14, i16);
        }
        return new Rect(i11, i14, i13, i14);
    }

    /* renamed from: R */
    private final Rect m52201R(boolean z11, int i11, int i12, int i13, int i14) {
        int top;
        int top2;
        int i15;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        SimpleShadowTextView simpleShadowTextView = c25062w.f120379W;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtHeaderLive");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            int paddingLeft = (this.f50770r - c25062w.f120393w.getPaddingLeft()) + i11;
            int i16 = this.f50770r + ((this.f50772s - this.f50736I) / 2) + i12;
            ImageView imageView = c25062w.f120393w;
            AbstractC19074t.m100207e(imageView, "btnHeaderBack");
            AbstractC26112n.m134383X(imageView, i16, paddingLeft);
            int i17 = paddingLeft + this.f50736I;
            top = this.f50770r + i12;
            SimpleShadowTextView simpleShadowTextView2 = c25062w.f120379W;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtHeaderLive");
            AbstractC26112n.m134383X(simpleShadowTextView2, top, i17);
            int measuredWidth = i17 + c25062w.f120379W.getMeasuredWidth() + this.f50776u;
            SimpleShadowTextView simpleShadowTextView3 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvHeaderViewer");
            AbstractC26112n.m134383X(simpleShadowTextView3, top, measuredWidth);
            top2 = this.f50772s + top;
            i15 = this.f50780w;
        } else {
            int paddingLeft2 = (this.f50770r - c25062w.f120393w.getPaddingLeft()) + i11;
            int i18 = this.f50770r + ((this.f50782x - this.f50736I) / 2) + i12;
            ImageView imageView2 = c25062w.f120393w;
            AbstractC19074t.m100207e(imageView2, "btnHeaderBack");
            AbstractC26112n.m134383X(imageView2, i18, paddingLeft2);
            int i19 = paddingLeft2 + this.f50736I;
            int i21 = this.f50770r + i12;
            View view = c25062w.f120384b0;
            AbstractC19074t.m100207e(view, "vieHeaderCard");
            AbstractC26112n.m134383X(view, i21, i19);
            int i22 = this.f50729B;
            int i23 = i19 + i22;
            int i24 = i21 + i22;
            AvatarImageView avatarImageView = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView, "aivHeaderAvatar");
            AbstractC26112n.m134383X(avatarImageView, i24, i23);
            int i25 = this.f50728A;
            int i26 = i23 + this.f50730C + i25;
            int measuredHeight = i24 + (((i25 - c25062w.f120380X.getMeasuredHeight()) - c25062w.f120372P.getMeasuredHeight()) / 2);
            SimpleShadowTextView simpleShadowTextView4 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tvHeaderViewer");
            if (AbstractC26112n.m134376Q(simpleShadowTextView4)) {
                AvatarImageView avatarImageView2 = c25062w.f120388r;
                AbstractC19074t.m100207e(avatarImageView2, "aivHeaderAvatar");
                measuredHeight = AbstractC26112n.m134424t(avatarImageView2) - (c25062w.f120380X.getMeasuredHeight() / 2);
            }
            FitUsernameTextView fitUsernameTextView = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtHeaderName");
            AbstractC26112n.m134383X(fitUsernameTextView, measuredHeight, i26);
            SimpleShadowTextView simpleShadowTextView5 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView5, "tvHeaderViewer");
            if (AbstractC26112n.m134378S(simpleShadowTextView5)) {
                int measuredHeight2 = measuredHeight + c25062w.f120380X.getMeasuredHeight();
                SimpleShadowTextView simpleShadowTextView6 = c25062w.f120372P;
                AbstractC19074t.m100207e(simpleShadowTextView6, "tvHeaderViewer");
                AbstractC26112n.m134383X(simpleShadowTextView6, measuredHeight2, i26);
            }
            SimpleShadowTextView simpleShadowTextView7 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView7, "btnHeaderFollow");
            if (AbstractC26112n.m134378S(simpleShadowTextView7)) {
                int right = c25062w.f120384b0.getRight() - this.f50734G;
                int top3 = c25062w.f120384b0.getTop() + this.f50734G;
                SimpleShadowTextView simpleShadowTextView8 = c25062w.f120396z;
                AbstractC19074t.m100207e(simpleShadowTextView8, "btnHeaderFollow");
                AbstractC26112n.m134384Y(simpleShadowTextView8, top3, right);
            }
            top = c25062w.f120384b0.getTop();
            top2 = c25062w.f120384b0.getTop() + this.f50782x;
            i15 = this.f50784z;
        }
        int i27 = top2 + i15;
        int i28 = i13 - this.f50770r;
        ImageView imageView3 = c25062w.f120395y;
        AbstractC19074t.m100207e(imageView3, "btnHeaderComment");
        AbstractC26112n.m134384Y(imageView3, top, i28);
        int i29 = i28 - (this.f50738K + this.f50739L);
        ImageView imageView4 = c25062w.f120357A;
        AbstractC19074t.m100207e(imageView4, "btnHeaderMinimize");
        AbstractC26112n.m134384Y(imageView4, top, i29);
        int i31 = i29 - (this.f50738K + this.f50739L);
        ImageView imageView5 = c25062w.f120392v;
        AbstractC19074t.m100207e(imageView5, "btnFooterShare");
        if (AbstractC26112n.m134378S(imageView5)) {
            ImageView imageView6 = c25062w.f120392v;
            AbstractC19074t.m100207e(imageView6, "btnFooterShare");
            AbstractC26112n.m134384Y(imageView6, top, i31);
        }
        int paddingLeft3 = ((this.f50770r + i11) + this.f50736I) - c25062w.f120393w.getPaddingLeft();
        SimpleShadowTextView simpleShadowTextView9 = c25062w.f120381Y;
        AbstractC19074t.m100207e(simpleShadowTextView9, "txtHeaderTag");
        AbstractC26112n.m134383X(simpleShadowTextView9, i27, paddingLeft3);
        return new Rect(i11, i12, i13, i27 + c25062w.f120381Y.getMeasuredHeight());
    }

    /* renamed from: S */
    private final Rect m52202S(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int measuredWidth = i13 - c25062w.f120367K.getMeasuredWidth();
        int measuredHeight = i14 - c25062w.f120367K.getMeasuredHeight();
        ReactionLayout reactionLayout = c25062w.f120367K;
        AbstractC19074t.m100207e(reactionLayout, "lytReaction");
        AbstractC26112n.m134383X(reactionLayout, measuredHeight, measuredWidth);
        return new Rect(measuredWidth, measuredHeight, i13, i14);
    }

    /* renamed from: T */
    private final Rect m52203T(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        this.f50754d0.m16329b(z11, i11, i12, i13, i14);
        RecyclingImageView recyclingImageView = c25062w.f120368L;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134383X(recyclingImageView, i12, i11);
        View view = c25062w.f120385c0;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, i12, i11);
        ProgressBar progressBar = c25062w.f120389s;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            int i15 = this.f50743P;
            int i16 = ((i13 - i11) - i15) / 2;
            int i17 = ((i14 - i12) - i15) / 2;
            ProgressBar progressBar2 = c25062w.f120389s;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134383X(progressBar2, i17, i16);
        }
        LinearLayout linearLayout = c25062w.f120366J;
        AbstractC19074t.m100207e(linearLayout, "lytInform");
        if (AbstractC26112n.m134378S(linearLayout)) {
            int measuredWidth = ((i13 - i11) - c25062w.f120366J.getMeasuredWidth()) / 2;
            int measuredHeight = ((i14 - i12) - c25062w.f120366J.getMeasuredHeight()) / 2;
            LinearLayout linearLayout2 = c25062w.f120366J;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134383X(linearLayout2, measuredHeight, measuredWidth);
        }
        LinearLayout linearLayout3 = c25062w.f120365I;
        AbstractC19074t.m100207e(linearLayout3, "lytError");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            int measuredWidth2 = ((i13 - i11) - c25062w.f120365I.getMeasuredWidth()) / 2;
            int measuredHeight2 = ((i14 - i12) - c25062w.f120365I.getMeasuredHeight()) / 2;
            LinearLayout linearLayout4 = c25062w.f120365I;
            AbstractC19074t.m100207e(linearLayout4, "lytError");
            AbstractC26112n.m134383X(linearLayout4, measuredHeight2, measuredWidth2);
        }
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: U */
    private final Rect m52204U(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (this.f50775t0 > 0) {
            i15 = -1073741824;
        } else {
            i15 = 0;
        }
        m52211a0(z11, i11, i12, i13, i14);
        int i17 = this.f50768q + i12;
        m52208Y(z11, i11 + i15, i17, i13 + i15, i14);
        int height = i14 - m52207X(z11, i11, i17, i13, i14).height();
        m52209Z(z11, i11, i12, i13, height);
        int i18 = this.f50775t0;
        if (i18 > 0) {
            height = i14 - i18;
            i16 = this.f50770r;
        } else {
            i16 = this.f50770r;
        }
        m52205V(z11, i11, i12, i13, height - i16);
        LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
        if (AbstractC26112n.m134378S(livestreamRotateButton)) {
            int i19 = i13 - this.f50741N;
            int min = Math.min(c25062w.f120370N.getBottom() - this.f50741N, c25062w.f120364H.getTop() - this.f50770r);
            LivestreamRotateButton livestreamRotateButton2 = c25062w.f120358B;
            AbstractC19074t.m100207e(livestreamRotateButton2, "btnRotate");
            AbstractC26112n.m134382W(livestreamRotateButton2, min, i19 + i15);
        }
        LinearLayout linearLayout = c25062w.f120366J;
        AbstractC19074t.m100207e(linearLayout, "lytInform");
        if (AbstractC26112n.m134378S(linearLayout)) {
            int i21 = this.f50770r + i11;
            int top = ((c25062w.f120364H.getTop() + c25062w.f120381Y.getBottom()) - c25062w.f120366J.getMeasuredHeight()) / 2;
            LinearLayout linearLayout2 = c25062w.f120366J;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134383X(linearLayout2, top, i21 + i15);
        }
        LinearLayout linearLayout3 = c25062w.f120365I;
        AbstractC19074t.m100207e(linearLayout3, "lytError");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            int i22 = this.f50770r + i11;
            int top2 = ((c25062w.f120364H.getTop() + c25062w.f120381Y.getBottom()) - c25062w.f120365I.getMeasuredHeight()) / 2;
            LinearLayout linearLayout4 = c25062w.f120365I;
            AbstractC19074t.m100207e(linearLayout4, "lytError");
            AbstractC26112n.m134383X(linearLayout4, top2, i22 + i15);
        }
        m52206W(z11, i11, i12 + this.f50768q, i13, i14);
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: V */
    private final Rect m52205V(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        LivestreamCommentLayout livestreamCommentLayout = c25062w.f120364H;
        AbstractC19074t.m100207e(livestreamCommentLayout, "lytComment");
        AbstractC26112n.m134381V(livestreamCommentLayout, i14, i11);
        return new Rect(i11, i14 - c25062w.f120364H.getMeasuredHeight(), c25062w.f120364H.getMeasuredWidth() + i11, i14);
    }

    /* renamed from: W */
    private final Rect m52206W(boolean z11, int i11, int i12, int i13, int i14) {
        int top;
        int i15;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        RecyclingImageView recyclingImageView = c25062w.f120369M;
        AbstractC19074t.m100207e(recyclingImageView, "rivBgEnd");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            RecyclingImageView recyclingImageView2 = c25062w.f120369M;
            AbstractC19074t.m100207e(recyclingImageView2, "rivBgEnd");
            AbstractC26112n.m134383X(recyclingImageView2, i12, i11);
            SimpleShadowTextView simpleShadowTextView = c25062w.f120379W;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtHeaderLive");
            if (AbstractC26112n.m134378S(simpleShadowTextView)) {
                top = this.f50778v + i12;
                i15 = (this.f50772s - this.f50736I) / 2;
            } else {
                top = c25062w.f120384b0.getTop();
                i15 = (this.f50782x - this.f50736I) / 2;
            }
            int i16 = top + i15;
            int paddingRight = (i13 - this.f50770r) + c25062w.f120394x.getPaddingRight();
            ImageView imageView = c25062w.f120362F;
            AbstractC19074t.m100207e(imageView, "ivCloseEnd");
            AbstractC26112n.m134384Y(imageView, i16, paddingRight);
            int m134422s = AbstractC26112n.m134422s(this) - (c25062w.f120387q.getMeasuredWidth() / 2);
            int bottom = c25062w.f120362F.getBottom() + this.f50747T;
            AvatarImageView avatarImageView = c25062w.f120387q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatarEnd");
            AbstractC26112n.m134383X(avatarImageView, bottom, m134422s);
            int bottom2 = c25062w.f120387q.getBottom() + this.f50748U;
            int m134422s2 = AbstractC26112n.m134422s(this) - (c25062w.f120371O.getMeasuredWidth() / 2);
            EllipsizedTextView ellipsizedTextView = c25062w.f120371O;
            AbstractC19074t.m100207e(ellipsizedTextView, "tvEndLive");
            AbstractC26112n.m134383X(ellipsizedTextView, bottom2, m134422s2);
            int bottom3 = c25062w.f120371O.getBottom() + this.f50749V;
            int m134422s3 = AbstractC26112n.m134422s(this) - (c25062w.f120373Q.getMeasuredWidth() / 2);
            EllipsizedTextView ellipsizedTextView2 = c25062w.f120373Q;
            AbstractC19074t.m100207e(ellipsizedTextView2, "tvLiveDuration");
            AbstractC26112n.m134383X(ellipsizedTextView2, bottom3, m134422s3);
            int bottom4 = c25062w.f120373Q.getBottom() + this.f50750W;
            int m134422s4 = AbstractC26112n.m134422s(this) - (c25062w.f120359C.getMeasuredWidth() / 2);
            View view = c25062w.f120359C;
            AbstractC19074t.m100207e(view, "endDivider");
            AbstractC26112n.m134383X(view, bottom4, m134422s4);
            int bottom5 = c25062w.f120359C.getBottom() + this.f50751a0;
            int m134422s5 = AbstractC26112n.m134422s(this) - (c25062w.f120374R.getMeasuredWidth() / 2);
            EllipsizedTextView ellipsizedTextView3 = c25062w.f120374R;
            AbstractC19074t.m100207e(ellipsizedTextView3, "tvMoreLive");
            AbstractC26112n.m134383X(ellipsizedTextView3, bottom5, m134422s5);
            int bottom6 = c25062w.f120374R.getBottom() + this.f50752b0;
            GridLayout gridLayout = c25062w.f120360D;
            AbstractC19074t.m100207e(gridLayout, "glMoreLive");
            AbstractC26112n.m134383X(gridLayout, bottom6, i11);
        }
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: X */
    private final Rect m52207X(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int i15 = this.f50770r;
        int i16 = i13 - i15;
        int i17 = i14 - (i15 + this.f50738K);
        ImageView imageView = c25062w.f120392v;
        AbstractC19074t.m100207e(imageView, "btnFooterShare");
        if (AbstractC26112n.m134378S(imageView)) {
            ImageView imageView2 = c25062w.f120392v;
            AbstractC19074t.m100207e(imageView2, "btnFooterShare");
            AbstractC26112n.m134384Y(imageView2, i17, i16);
            i16 -= this.f50738K + this.f50739L;
        }
        ImageView imageView3 = c25062w.f120391u;
        AbstractC19074t.m100207e(imageView3, "btnFooterMore");
        if (AbstractC26112n.m134378S(imageView3)) {
            ImageView imageView4 = c25062w.f120391u;
            AbstractC19074t.m100207e(imageView4, "btnFooterMore");
            AbstractC26112n.m134384Y(imageView4, i17, i16);
            i16 -= this.f50738K + this.f50739L;
        }
        SimpleShadowTextView simpleShadowTextView = c25062w.f120378V;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtFooterComment");
        AbstractC26112n.m134384Y(simpleShadowTextView, i17, i16);
        return new Rect(i11, i17, i13, i14);
    }

    /* renamed from: Y */
    private final Rect m52208Y(boolean z11, int i11, int i12, int i13, int i14) {
        int top;
        int top2;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        SimpleShadowTextView simpleShadowTextView = c25062w.f120379W;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtHeaderLive");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            int i15 = this.f50770r + i11;
            int i16 = this.f50778v + i12;
            SimpleShadowTextView simpleShadowTextView2 = c25062w.f120379W;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtHeaderLive");
            AbstractC26112n.m134383X(simpleShadowTextView2, i16, i15);
            int measuredWidth = i15 + c25062w.f120379W.getMeasuredWidth() + this.f50776u;
            SimpleShadowTextView simpleShadowTextView3 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvHeaderViewer");
            AbstractC26112n.m134383X(simpleShadowTextView3, i16, measuredWidth);
            int i17 = this.f50772s;
            top = ((i17 - this.f50736I) / 2) + i16;
            top2 = i16 + i17 + this.f50780w;
        } else {
            int i18 = this.f50770r + i11;
            int i19 = this.f50783y + i12;
            View view = c25062w.f120384b0;
            AbstractC19074t.m100207e(view, "vieHeaderCard");
            AbstractC26112n.m134383X(view, i19, i18);
            int i21 = this.f50729B;
            int i22 = i18 + i21;
            int i23 = i19 + i21;
            AvatarImageView avatarImageView = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView, "aivHeaderAvatar");
            AbstractC26112n.m134383X(avatarImageView, i23, i22);
            int i24 = this.f50728A;
            int i25 = i22 + this.f50730C + i24;
            int measuredHeight = i23 + (((i24 - c25062w.f120380X.getMeasuredHeight()) - c25062w.f120372P.getMeasuredHeight()) / 2);
            SimpleShadowTextView simpleShadowTextView4 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tvHeaderViewer");
            if (AbstractC26112n.m134376Q(simpleShadowTextView4)) {
                AvatarImageView avatarImageView2 = c25062w.f120388r;
                AbstractC19074t.m100207e(avatarImageView2, "aivHeaderAvatar");
                measuredHeight = AbstractC26112n.m134424t(avatarImageView2) - (c25062w.f120380X.getMeasuredHeight() / 2);
            }
            FitUsernameTextView fitUsernameTextView = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtHeaderName");
            AbstractC26112n.m134383X(fitUsernameTextView, measuredHeight, i25);
            SimpleShadowTextView simpleShadowTextView5 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView5, "tvHeaderViewer");
            if (AbstractC26112n.m134378S(simpleShadowTextView5)) {
                int measuredHeight2 = measuredHeight + c25062w.f120380X.getMeasuredHeight();
                SimpleShadowTextView simpleShadowTextView6 = c25062w.f120372P;
                AbstractC19074t.m100207e(simpleShadowTextView6, "tvHeaderViewer");
                AbstractC26112n.m134383X(simpleShadowTextView6, measuredHeight2, i25);
            }
            SimpleShadowTextView simpleShadowTextView7 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView7, "btnHeaderFollow");
            if (AbstractC26112n.m134378S(simpleShadowTextView7)) {
                int right = c25062w.f120384b0.getRight() - this.f50734G;
                int top3 = c25062w.f120384b0.getTop() + this.f50734G;
                SimpleShadowTextView simpleShadowTextView8 = c25062w.f120396z;
                AbstractC19074t.m100207e(simpleShadowTextView8, "btnHeaderFollow");
                AbstractC26112n.m134384Y(simpleShadowTextView8, top3, right);
            }
            top = ((this.f50782x - this.f50736I) / 2) + c25062w.f120384b0.getTop();
            top2 = c25062w.f120384b0.getTop() + this.f50782x + this.f50784z;
        }
        int paddingRight = (i13 - this.f50770r) + c25062w.f120394x.getPaddingRight();
        ImageView imageView = c25062w.f120394x;
        AbstractC19074t.m100207e(imageView, "btnHeaderClose");
        AbstractC26112n.m134384Y(imageView, top, paddingRight);
        int i26 = paddingRight - this.f50736I;
        ImageView imageView2 = c25062w.f120357A;
        AbstractC19074t.m100207e(imageView2, "btnHeaderMinimize");
        AbstractC26112n.m134384Y(imageView2, top, i26);
        int i27 = this.f50770r + i11;
        SimpleShadowTextView simpleShadowTextView9 = c25062w.f120381Y;
        AbstractC19074t.m100207e(simpleShadowTextView9, "txtHeaderTag");
        AbstractC26112n.m134383X(simpleShadowTextView9, top2, i27);
        return new Rect(i11, i12, i13, top2 + this.f50737J);
    }

    /* renamed from: Z */
    private final Rect m52209Z(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int measuredWidth = i13 - c25062w.f120367K.getMeasuredWidth();
        int measuredHeight = i14 - c25062w.f120367K.getMeasuredHeight();
        ReactionLayout reactionLayout = c25062w.f120367K;
        AbstractC19074t.m100207e(reactionLayout, "lytReaction");
        AbstractC26112n.m134383X(reactionLayout, measuredHeight, measuredWidth);
        return new Rect(measuredWidth, measuredHeight, i13, i14);
    }

    /* renamed from: a0 */
    private final Rect m52211a0(boolean z11, int i11, int i12, int i13, int i14) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        this.f50754d0.m16329b(z11, i11, i12, i13, i14);
        RecyclingImageView recyclingImageView = c25062w.f120368L;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134383X(recyclingImageView, i12, i11);
        View view = c25062w.f120385c0;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, i12, i11);
        ProgressBar progressBar = c25062w.f120389s;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            RecyclingImageView recyclingImageView2 = c25062w.f120370N;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            int m134422s = AbstractC26112n.m134422s(recyclingImageView2) - (this.f50743P / 2);
            RecyclingImageView recyclingImageView3 = c25062w.f120370N;
            AbstractC19074t.m100207e(recyclingImageView3, "rivThumbnail");
            int m134424t = AbstractC26112n.m134424t(recyclingImageView3) - (this.f50743P / 2);
            ProgressBar progressBar2 = c25062w.f120389s;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134383X(progressBar2, m134424t, m134422s);
        }
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: b0 */
    private final Size m52213b0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (this.f50781w0 == null) {
            AbstractC19074t.m100223u("binding");
        }
        int i13 = size / 3;
        int i14 = size - ((int) (i13 * this.f50762l0));
        m52223g0(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i12);
        m52219e0(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i12);
        int height = (size2 - this.f50770r) - m52217d0(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i12).getHeight();
        m52221f0(View.MeasureSpec.makeMeasureSpec((height * 2) / 5, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        m52215c0(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
        return new Size(size, size2);
    }

    /* renamed from: c0 */
    private final Size m52215c0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        View view = c25062w.f120390t;
        AbstractC19074t.m100207e(view, "bgdComment");
        AbstractC26112n.m134431w0(view);
        View view2 = c25062w.f120390t;
        AbstractC19074t.m100207e(view2, "bgdComment");
        AbstractC26112n.m134387a0(view2, size, 1073741824, size2, 1073741824);
        LivestreamCommentLayout livestreamCommentLayout = c25062w.f120364H;
        AbstractC19074t.m100207e(livestreamCommentLayout, "lytComment");
        int i13 = this.f50770r;
        AbstractC26112n.m134387a0(livestreamCommentLayout, size, 1073741824, (((size2 - i13) - i13) - this.f50738K) - i13, 1073741824);
        SimpleShadowTextView simpleShadowTextView = c25062w.f120378V;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtFooterComment");
        AbstractC26112n.m134387a0(simpleShadowTextView, size - (this.f50770r * 2), 1073741824, this.f50738K, 1073741824);
        return new Size(size, size2);
    }

    /* renamed from: d0 */
    private final Size m52217d0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        ImageView imageView = c25062w.f120391u;
        AbstractC19074t.m100207e(imageView, "btnFooterMore");
        if (AbstractC26112n.m134378S(imageView)) {
            ImageView imageView2 = c25062w.f120391u;
            AbstractC19074t.m100207e(imageView2, "btnFooterMore");
            int i13 = this.f50738K;
            AbstractC26112n.m134387a0(imageView2, i13, 1073741824, i13, 1073741824);
        }
        LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
        LivestreamRotateButton.m52301c(livestreamRotateButton, false, 1, null);
        LivestreamRotateButton livestreamRotateButton2 = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton2, "btnRotate");
        int i14 = this.f50738K;
        AbstractC26112n.m134387a0(livestreamRotateButton2, i14, 1073741824, i14, 1073741824);
        return new Size(size, 0);
    }

    /* renamed from: e0 */
    private final Size m52219e0(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        ImageView imageView = c25062w.f120393w;
        AbstractC19074t.m100207e(imageView, "btnHeaderBack");
        AbstractC26112n.m134431w0(imageView);
        ImageView imageView2 = c25062w.f120393w;
        AbstractC19074t.m100207e(imageView2, "btnHeaderBack");
        int i14 = this.f50736I;
        AbstractC26112n.m134387a0(imageView2, i14, 1073741824, i14, 1073741824);
        SimpleShadowTextView simpleShadowTextView = c25062w.f120379W;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtHeaderLive");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25062w.f120379W;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtHeaderLive");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, this.f50772s, 1073741824);
            SimpleShadowTextView simpleShadowTextView3 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvHeaderViewer");
            if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
                SimpleShadowTextView simpleShadowTextView4 = c25062w.f120372P;
                AbstractC19074t.m100207e(simpleShadowTextView4, "tvHeaderViewer");
                AbstractC26112n.m134387a0(simpleShadowTextView4, 0, 0, this.f50772s, 1073741824);
            }
            i13 = this.f50770r + this.f50772s + this.f50780w;
            View view = c25062w.f120384b0;
            AbstractC19074t.m100207e(view, "vieHeaderCard");
            AbstractC26112n.m134367H(view);
            AvatarImageView avatarImageView = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView, "aivHeaderAvatar");
            AbstractC26112n.m134367H(avatarImageView);
            FitUsernameTextView fitUsernameTextView = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtHeaderName");
            AbstractC26112n.m134367H(fitUsernameTextView);
            SimpleShadowTextView simpleShadowTextView5 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView5, "btnHeaderFollow");
            AbstractC26112n.m134367H(simpleShadowTextView5);
        } else {
            int paddingLeft = ((((((size - this.f50770r) - this.f50736I) + c25062w.f120393w.getPaddingLeft()) - this.f50770r) - (this.f50738K * 3)) - (this.f50739L * 2)) - this.f50735H;
            AvatarImageView avatarImageView2 = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView2, "aivHeaderAvatar");
            AbstractC26112n.m134431w0(avatarImageView2);
            AvatarImageView avatarImageView3 = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView3, "aivHeaderAvatar");
            int i15 = this.f50728A;
            AbstractC26112n.m134387a0(avatarImageView3, i15, 1073741824, i15, 1073741824);
            int i16 = this.f50729B;
            int i17 = this.f50728A;
            int i18 = this.f50730C;
            int i19 = paddingLeft - ((i16 + i17) + i18);
            int i21 = i16 + i17 + i18;
            SimpleShadowTextView simpleShadowTextView6 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView6, "btnHeaderFollow");
            if (AbstractC26112n.m134378S(simpleShadowTextView6)) {
                SimpleShadowTextView simpleShadowTextView7 = c25062w.f120396z;
                AbstractC19074t.m100207e(simpleShadowTextView7, "btnHeaderFollow");
                AbstractC26112n.m134387a0(simpleShadowTextView7, this.f50732E, 1073741824, this.f50733F, 1073741824);
                int i22 = this.f50732E;
                int i23 = this.f50731D;
                i19 -= i22 + i23;
                i21 += i22 + i23;
            }
            int i24 = this.f50734G;
            int i25 = i19 - i24;
            int i26 = i21 + i24;
            FitUsernameTextView fitUsernameTextView2 = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView2, "txtHeaderName");
            AbstractC26112n.m134431w0(fitUsernameTextView2);
            FitUsernameTextView fitUsernameTextView3 = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView3, "txtHeaderName");
            AbstractC26112n.m134387a0(fitUsernameTextView3, i25, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView8 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView8, "tvHeaderViewer");
            if (AbstractC26112n.m134378S(simpleShadowTextView8)) {
                SimpleShadowTextView simpleShadowTextView9 = c25062w.f120372P;
                AbstractC19074t.m100207e(simpleShadowTextView9, "tvHeaderViewer");
                AbstractC26112n.m134387a0(simpleShadowTextView9, i25, Integer.MIN_VALUE, 0, 0);
            }
            int max = i26 + Math.max(c25062w.f120380X.getMeasuredWidth(), c25062w.f120372P.getMeasuredWidth());
            View view2 = c25062w.f120384b0;
            AbstractC19074t.m100207e(view2, "vieHeaderCard");
            AbstractC26112n.m134431w0(view2);
            View view3 = c25062w.f120384b0;
            AbstractC19074t.m100207e(view3, "vieHeaderCard");
            AbstractC26112n.m134387a0(view3, max, 1073741824, this.f50782x, 1073741824);
            i13 = this.f50770r + this.f50782x + this.f50784z;
        }
        ImageView imageView3 = c25062w.f120392v;
        AbstractC19074t.m100207e(imageView3, "btnFooterShare");
        if (AbstractC26112n.m134378S(imageView3)) {
            ImageView imageView4 = c25062w.f120392v;
            AbstractC19074t.m100207e(imageView4, "btnFooterShare");
            int i27 = this.f50738K;
            AbstractC26112n.m134387a0(imageView4, i27, 1073741824, i27, 1073741824);
        }
        ImageView imageView5 = c25062w.f120357A;
        AbstractC19074t.m100207e(imageView5, "btnHeaderMinimize");
        int i28 = this.f50738K;
        AbstractC26112n.m134387a0(imageView5, i28, 1073741824, i28, 1073741824);
        ImageView imageView6 = c25062w.f120395y;
        AbstractC19074t.m100207e(imageView6, "btnHeaderComment");
        AbstractC26112n.m134431w0(imageView6);
        ImageView imageView7 = c25062w.f120395y;
        AbstractC19074t.m100207e(imageView7, "btnHeaderComment");
        int i29 = this.f50738K;
        AbstractC26112n.m134387a0(imageView7, i29, 1073741824, i29, 1073741824);
        ImageView imageView8 = c25062w.f120394x;
        AbstractC19074t.m100207e(imageView8, "btnHeaderClose");
        AbstractC26112n.m134367H(imageView8);
        SimpleShadowTextView simpleShadowTextView10 = c25062w.f120381Y;
        AbstractC19074t.m100207e(simpleShadowTextView10, "txtHeaderTag");
        AbstractC26112n.m134387a0(simpleShadowTextView10, 0, 0, 0, 0);
        return new Size(size, i13 + c25062w.f120381Y.getMeasuredHeight());
    }

    /* renamed from: f0 */
    private final Size m52221f0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        ReactionLayout reactionLayout = c25062w.f120367K;
        AbstractC19074t.m100207e(reactionLayout, "lytReaction");
        AbstractC26112n.m134387a0(reactionLayout, size, 1073741824, size2, 1073741824);
        return new Size(size, size2);
    }

    /* renamed from: g0 */
    private final Size m52223g0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        this.f50754d0.m16330c(i11, i12);
        RecyclingImageView recyclingImageView = c25062w.f120368L;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134387a0(recyclingImageView, size, 1073741824, size2, 1073741824);
        View view = c25062w.f120385c0;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        ProgressBar progressBar = c25062w.f120389s;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            ProgressBar progressBar2 = c25062w.f120389s;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            int i13 = this.f50743P;
            AbstractC26112n.m134387a0(progressBar2, i13, 1073741824, i13, 1073741824);
        }
        LinearLayout linearLayout = c25062w.f120366J;
        AbstractC19074t.m100207e(linearLayout, "lytInform");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25062w.f120366J;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134387a0(linearLayout2, size - (this.f50770r * 2), 1073741824, 0, 0);
        }
        LinearLayout linearLayout3 = c25062w.f120365I;
        AbstractC19074t.m100207e(linearLayout3, "lytError");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            LinearLayout linearLayout4 = c25062w.f120365I;
            AbstractC19074t.m100207e(linearLayout4, "lytError");
            AbstractC26112n.m134387a0(linearLayout4, size - (this.f50770r * 2), 1073741824, 0, 0);
        }
        return new Size(size, size2);
    }

    /* renamed from: h0 */
    private final Size m52225h0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int height = m52233l0(i11, i12).getHeight();
        int height2 = m52231k0(i11, i12).getHeight();
        m52236n0(i11, i12);
        int i13 = size - this.f50742O;
        int measuredHeight = (((size2 - this.f50768q) - height) - this.f50770r) - c25062w.f120370N.getMeasuredHeight();
        int i14 = this.f50770r;
        int max = Math.max((size2 * 3) / 10, ((measuredHeight - i14) - i14) - height2);
        if (this.f50775t0 > 0) {
            max = (max * 3) / 4;
        }
        m52227i0(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        m52235m0(View.MeasureSpec.makeMeasureSpec((size * 3) / 10, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 / 3, 1073741824));
        LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
        if (AbstractC26112n.m134378S(livestreamRotateButton)) {
            LivestreamRotateButton livestreamRotateButton2 = c25062w.f120358B;
            AbstractC19074t.m100207e(livestreamRotateButton2, "btnRotate");
            AbstractC26112n.m134387a0(livestreamRotateButton2, 0, 0, this.f50740M, 1073741824);
        }
        LinearLayout linearLayout = c25062w.f120366J;
        AbstractC19074t.m100207e(linearLayout, "lytInform");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25062w.f120366J;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134387a0(linearLayout2, size - (this.f50770r * 2), 1073741824, 0, 0);
        }
        LinearLayout linearLayout3 = c25062w.f120365I;
        AbstractC19074t.m100207e(linearLayout3, "lytError");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            LinearLayout linearLayout4 = c25062w.f120365I;
            AbstractC19074t.m100207e(linearLayout4, "lytError");
            AbstractC26112n.m134387a0(linearLayout4, size - (this.f50770r * 2), 1073741824, 0, 0);
        }
        m52229j0(i11, i12);
        return new Size(size, size2);
    }

    /* renamed from: i0 */
    private final Size m52227i0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        View view = c25062w.f120390t;
        AbstractC19074t.m100207e(view, "bgdComment");
        AbstractC26112n.m134367H(view);
        LivestreamCommentLayout livestreamCommentLayout = c25062w.f120364H;
        AbstractC19074t.m100207e(livestreamCommentLayout, "lytComment");
        AbstractC26112n.m134387a0(livestreamCommentLayout, size, 1073741824, size2, 1073741824);
        return new Size(size, size2);
    }

    /* renamed from: j0 */
    private final Size m52229j0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        RecyclingImageView recyclingImageView = c25062w.f120369M;
        AbstractC19074t.m100207e(recyclingImageView, "rivBgEnd");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            RecyclingImageView recyclingImageView2 = c25062w.f120369M;
            AbstractC19074t.m100207e(recyclingImageView2, "rivBgEnd");
            AbstractC26112n.m134387a0(recyclingImageView2, size, 1073741824, size2, 1073741824);
            ImageView imageView = c25062w.f120362F;
            AbstractC19074t.m100207e(imageView, "ivCloseEnd");
            int i13 = this.f50736I;
            AbstractC26112n.m134387a0(imageView, i13, 1073741824, i13, 1073741824);
            AvatarImageView avatarImageView = c25062w.f120387q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatarEnd");
            int i14 = this.f50744Q;
            AbstractC26112n.m134387a0(avatarImageView, i14, 1073741824, i14, 1073741824);
            EllipsizedTextView ellipsizedTextView = c25062w.f120371O;
            AbstractC19074t.m100207e(ellipsizedTextView, "tvEndLive");
            AbstractC26112n.m134387a0(ellipsizedTextView, 0, 0, 0, 0);
            EllipsizedTextView ellipsizedTextView2 = c25062w.f120373Q;
            AbstractC19074t.m100207e(ellipsizedTextView2, "tvLiveDuration");
            AbstractC26112n.m134387a0(ellipsizedTextView2, 0, 0, 0, 0);
            View view = c25062w.f120359C;
            AbstractC19074t.m100207e(view, "endDivider");
            AbstractC26112n.m134387a0(view, this.f50745R, 1073741824, this.f50746S, 1073741824);
            EllipsizedTextView ellipsizedTextView3 = c25062w.f120374R;
            AbstractC19074t.m100207e(ellipsizedTextView3, "tvMoreLive");
            AbstractC26112n.m134387a0(ellipsizedTextView3, 0, 0, 0, 0);
            GridLayout gridLayout = c25062w.f120360D;
            AbstractC19074t.m100207e(gridLayout, "glMoreLive");
            AbstractC26112n.m134387a0(gridLayout, size, 1073741824, 0, 0);
        }
        return new Size(size, size2);
    }

    /* renamed from: k0 */
    private final Size m52231k0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f50738K + this.f50770r;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        int i14 = size - (this.f50770r * 2);
        ImageView imageView = c25062w.f120391u;
        AbstractC19074t.m100207e(imageView, "btnFooterMore");
        if (AbstractC26112n.m134378S(imageView)) {
            ImageView imageView2 = c25062w.f120391u;
            AbstractC19074t.m100207e(imageView2, "btnFooterMore");
            int i15 = this.f50738K;
            AbstractC26112n.m134387a0(imageView2, i15, 1073741824, i15, 1073741824);
            i14 -= this.f50739L + this.f50738K;
        }
        ImageView imageView3 = c25062w.f120392v;
        AbstractC19074t.m100207e(imageView3, "btnFooterShare");
        if (AbstractC26112n.m134378S(imageView3)) {
            ImageView imageView4 = c25062w.f120392v;
            AbstractC19074t.m100207e(imageView4, "btnFooterShare");
            int i16 = this.f50738K;
            AbstractC26112n.m134387a0(imageView4, i16, 1073741824, i16, 1073741824);
            i14 -= this.f50739L + this.f50738K;
        }
        SimpleShadowTextView simpleShadowTextView = c25062w.f120378V;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtFooterComment");
        AbstractC26112n.m134387a0(simpleShadowTextView, i14, 1073741824, this.f50738K, 1073741824);
        this.f50754d0.m16333f(i13);
        return new Size(size, i13);
    }

    /* renamed from: l0 */
    private final Size m52233l0(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        SimpleShadowTextView simpleShadowTextView = c25062w.f120379W;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtHeaderLive");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25062w.f120379W;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtHeaderLive");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, this.f50772s, 1073741824);
            SimpleShadowTextView simpleShadowTextView3 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvHeaderViewer");
            if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
                SimpleShadowTextView simpleShadowTextView4 = c25062w.f120372P;
                AbstractC19074t.m100207e(simpleShadowTextView4, "tvHeaderViewer");
                AbstractC26112n.m134387a0(simpleShadowTextView4, 0, 0, this.f50772s, 1073741824);
            }
            int i14 = this.f50778v;
            int i15 = this.f50772s;
            i13 = i14 + i15 + this.f50780w;
            this.f50754d0.m16335h(i14 + i15);
            this.f50754d0.m16334g(this.f50780w + this.f50737J + this.f50770r);
            View view = c25062w.f120384b0;
            AbstractC19074t.m100207e(view, "vieHeaderCard");
            AbstractC26112n.m134367H(view);
            AvatarImageView avatarImageView = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView, "aivHeaderAvatar");
            AbstractC26112n.m134367H(avatarImageView);
            FitUsernameTextView fitUsernameTextView = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtHeaderName");
            AbstractC26112n.m134367H(fitUsernameTextView);
            SimpleShadowTextView simpleShadowTextView5 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView5, "btnHeaderFollow");
            AbstractC26112n.m134367H(simpleShadowTextView5);
        } else {
            int i16 = this.f50770r;
            int paddingRight = ((((size - i16) - this.f50735H) - i16) - (this.f50736I * 2)) + c25062w.f120394x.getPaddingRight();
            AvatarImageView avatarImageView2 = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView2, "aivHeaderAvatar");
            AbstractC26112n.m134431w0(avatarImageView2);
            AvatarImageView avatarImageView3 = c25062w.f120388r;
            AbstractC19074t.m100207e(avatarImageView3, "aivHeaderAvatar");
            int i17 = this.f50728A;
            AbstractC26112n.m134387a0(avatarImageView3, i17, 1073741824, i17, 1073741824);
            int i18 = this.f50729B;
            int i19 = this.f50728A;
            int i21 = this.f50730C;
            int i22 = paddingRight - ((i18 + i19) + i21);
            int i23 = i18 + i19 + i21;
            SimpleShadowTextView simpleShadowTextView6 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView6, "btnHeaderFollow");
            if (AbstractC26112n.m134378S(simpleShadowTextView6)) {
                SimpleShadowTextView simpleShadowTextView7 = c25062w.f120396z;
                AbstractC19074t.m100207e(simpleShadowTextView7, "btnHeaderFollow");
                AbstractC26112n.m134387a0(simpleShadowTextView7, this.f50732E, 1073741824, this.f50733F, 1073741824);
                int i24 = this.f50732E;
                int i25 = this.f50731D;
                i22 -= i24 + i25;
                i23 += i24 + i25;
            }
            int i26 = this.f50734G;
            int i27 = i22 - i26;
            int i28 = i23 + i26;
            FitUsernameTextView fitUsernameTextView2 = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView2, "txtHeaderName");
            AbstractC26112n.m134431w0(fitUsernameTextView2);
            FitUsernameTextView fitUsernameTextView3 = c25062w.f120380X;
            AbstractC19074t.m100207e(fitUsernameTextView3, "txtHeaderName");
            AbstractC26112n.m134387a0(fitUsernameTextView3, i27, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView8 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView8, "tvHeaderViewer");
            if (AbstractC26112n.m134378S(simpleShadowTextView8)) {
                SimpleShadowTextView simpleShadowTextView9 = c25062w.f120372P;
                AbstractC19074t.m100207e(simpleShadowTextView9, "tvHeaderViewer");
                AbstractC26112n.m134387a0(simpleShadowTextView9, i27, Integer.MIN_VALUE, 0, 0);
            }
            int max = i28 + Math.max(c25062w.f120380X.getMeasuredWidth(), c25062w.f120372P.getMeasuredWidth());
            View view2 = c25062w.f120384b0;
            AbstractC19074t.m100207e(view2, "vieHeaderCard");
            AbstractC26112n.m134431w0(view2);
            View view3 = c25062w.f120384b0;
            AbstractC19074t.m100207e(view3, "vieHeaderCard");
            AbstractC26112n.m134387a0(view3, max, 1073741824, this.f50782x, 1073741824);
            int i29 = this.f50783y;
            int i31 = this.f50782x;
            i13 = i29 + i31 + this.f50784z;
            this.f50754d0.m16335h(i29 + i31);
            this.f50754d0.m16334g(this.f50784z + this.f50737J + this.f50770r);
        }
        ImageView imageView = c25062w.f120357A;
        AbstractC19074t.m100207e(imageView, "btnHeaderMinimize");
        int i32 = this.f50736I;
        AbstractC26112n.m134387a0(imageView, i32, 1073741824, i32, 1073741824);
        ImageView imageView2 = c25062w.f120394x;
        AbstractC19074t.m100207e(imageView2, "btnHeaderClose");
        AbstractC26112n.m134431w0(imageView2);
        ImageView imageView3 = c25062w.f120394x;
        AbstractC19074t.m100207e(imageView3, "btnHeaderClose");
        int i33 = this.f50736I;
        AbstractC26112n.m134387a0(imageView3, i33, 1073741824, i33, 1073741824);
        ImageView imageView4 = c25062w.f120395y;
        AbstractC19074t.m100207e(imageView4, "btnHeaderComment");
        AbstractC26112n.m134367H(imageView4);
        ImageView imageView5 = c25062w.f120393w;
        AbstractC19074t.m100207e(imageView5, "btnHeaderBack");
        AbstractC26112n.m134367H(imageView5);
        SimpleShadowTextView simpleShadowTextView10 = c25062w.f120381Y;
        AbstractC19074t.m100207e(simpleShadowTextView10, "txtHeaderTag");
        AbstractC26112n.m134387a0(simpleShadowTextView10, 0, 0, 0, 0);
        return new Size(size, i13 + this.f50737J);
    }

    /* renamed from: m0 */
    private final Size m52235m0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        ReactionLayout reactionLayout = c25062w.f120367K;
        AbstractC19074t.m100207e(reactionLayout, "lytReaction");
        AbstractC26112n.m134387a0(reactionLayout, size, 1073741824, size2, 1073741824);
        return new Size(size, size2);
    }

    /* renamed from: n0 */
    private final Size m52236n0(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        this.f50754d0.m16331d(i11, i12);
        RecyclingImageView recyclingImageView = c25062w.f120368L;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134387a0(recyclingImageView, size, 1073741824, size2, 1073741824);
        View view = c25062w.f120385c0;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        ProgressBar progressBar = c25062w.f120389s;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            ProgressBar progressBar2 = c25062w.f120389s;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            int i13 = this.f50743P;
            AbstractC26112n.m134387a0(progressBar2, i13, 1073741824, i13, 1073741824);
        }
        return new Size(size, size2);
    }

    /* renamed from: r0 */
    private final void m52237r0() {
        if (this.f50757g0) {
            this.f50755e0.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.p
                @Override // java.lang.Runnable
                public final void run() {
                    LivestreamItem.m52238s0(LivestreamItem.this);
                }
            }, this.f50759i0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m52238s0(LivestreamItem livestreamItem) {
        AbstractC19074t.m100208f(livestreamItem, "this$0");
        livestreamItem.f50757g0 = false;
        livestreamItem.invalidate();
    }

    /* renamed from: u */
    private final void m52239u(float f11) {
        float m116579b;
        float m116579b2;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (f11 <= 0.0f && (f11 != 0.0f || this.f50762l0 >= 0.5f)) {
            m52243y0((-c25062w.f120390t.getMeasuredWidth()) * this.f50762l0, -c25062w.f120390t.getMeasuredWidth(), f11, new C9616e(), new C9617f(c25062w));
            return;
        }
        float f12 = (-c25062w.f120390t.getMeasuredWidth()) * this.f50762l0;
        m116579b = AbstractC22543l.m116579b(c25062w.f120390t.getMeasuredWidth() * this.f50762l0 * 10.0f, this.f50764n0);
        m116579b2 = AbstractC22543l.m116579b(m116579b, f11);
        m52184C(this, -c25062w.f120390t.getMeasuredWidth(), f12, 0.0f, m116579b2, new C9614c(), new C9615d(c25062w), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m52240u0(LivestreamItem livestreamItem) {
        AbstractC19074t.m100208f(livestreamItem, "this$0");
        C25062w c25062w = livestreamItem.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120358B.m52304b(true);
    }

    /* renamed from: w0 */
    private final void m52241w0(boolean z11) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (z11) {
            RecyclingImageView recyclingImageView = c25062w.f120369M;
            AbstractC19074t.m100207e(recyclingImageView, "rivBgEnd");
            AbstractC26112n.m134431w0(recyclingImageView);
            ImageView imageView = c25062w.f120362F;
            AbstractC19074t.m100207e(imageView, "ivCloseEnd");
            AbstractC26112n.m134431w0(imageView);
            AvatarImageView avatarImageView = c25062w.f120387q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatarEnd");
            AbstractC26112n.m134431w0(avatarImageView);
            EllipsizedTextView ellipsizedTextView = c25062w.f120371O;
            AbstractC19074t.m100207e(ellipsizedTextView, "tvEndLive");
            AbstractC26112n.m134431w0(ellipsizedTextView);
            EllipsizedTextView ellipsizedTextView2 = c25062w.f120373Q;
            AbstractC19074t.m100207e(ellipsizedTextView2, "tvLiveDuration");
            AbstractC26112n.m134431w0(ellipsizedTextView2);
            return;
        }
        RecyclingImageView recyclingImageView2 = c25062w.f120369M;
        AbstractC19074t.m100207e(recyclingImageView2, "rivBgEnd");
        AbstractC26112n.m134367H(recyclingImageView2);
        ImageView imageView2 = c25062w.f120362F;
        AbstractC19074t.m100207e(imageView2, "ivCloseEnd");
        AbstractC26112n.m134367H(imageView2);
        AvatarImageView avatarImageView2 = c25062w.f120387q;
        AbstractC19074t.m100207e(avatarImageView2, "aivAvatarEnd");
        AbstractC26112n.m134367H(avatarImageView2);
        EllipsizedTextView ellipsizedTextView3 = c25062w.f120371O;
        AbstractC19074t.m100207e(ellipsizedTextView3, "tvEndLive");
        AbstractC26112n.m134367H(ellipsizedTextView3);
        EllipsizedTextView ellipsizedTextView4 = c25062w.f120373Q;
        AbstractC19074t.m100207e(ellipsizedTextView4, "tvLiveDuration");
        AbstractC26112n.m134367H(ellipsizedTextView4);
        EllipsizedTextView ellipsizedTextView5 = c25062w.f120374R;
        AbstractC19074t.m100207e(ellipsizedTextView5, "tvMoreLive");
        AbstractC26112n.m134367H(ellipsizedTextView5);
        GridLayout gridLayout = c25062w.f120360D;
        AbstractC19074t.m100207e(gridLayout, "glMoreLive");
        AbstractC26112n.m134367H(gridLayout);
    }

    /* renamed from: x */
    private final void m52242x(LivestreamData livestreamData) {
        Boolean mo146377p = AbstractC28684a.Companion.m143692z().mo146377p(livestreamData.m51010b().m50769l());
        if (mo146377p != null) {
            livestreamData.m51010b().m50770l0(mo146377p.booleanValue());
        }
        C25062w c25062w = this.f50781w0;
        String str = null;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        String m50769l = livestreamData.m51010b().m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        }
        if (AbstractC19074t.m100204b(m50769l, str)) {
            SimpleShadowTextView simpleShadowTextView = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnHeaderFollow");
            AbstractC26112n.m134367H(simpleShadowTextView);
        } else if (livestreamData.m51010b().m50741Q()) {
            SimpleShadowTextView simpleShadowTextView2 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView2, "btnHeaderFollow");
            AbstractC26112n.m134367H(simpleShadowTextView2);
        } else {
            SimpleShadowTextView simpleShadowTextView3 = c25062w.f120396z;
            AbstractC19074t.m100207e(simpleShadowTextView3, "btnHeaderFollow");
            AbstractC26112n.m134431w0(simpleShadowTextView3);
        }
    }

    /* renamed from: y0 */
    private final void m52243y0(float f11, float f12, float f13, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f11 == f12 && f13 == 0.0f) {
            interfaceC18505l.mo205i9(Float.valueOf(f12));
            interfaceC18494a.mo12V4();
            return;
        }
        C25627g c25627g = new C25627g(new C25626f(f11));
        C25628h c25628h = new C25628h();
        c25628h.m132386d(1.0f);
        c25628h.m132388f(1000.0f);
        c25627g.m132382t(c25628h);
        c25627g.m132328c(new AbstractC25622b.r() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.w
            @Override // r20.AbstractC25622b.r
            /* renamed from: a */
            public final void mo52475a(AbstractC25622b abstractC25622b, float f14, float f15) {
                LivestreamItem.m52244z0(InterfaceC18505l.this, abstractC25622b, f14, f15);
            }
        });
        c25627g.m132327b(new AbstractC25622b.q() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.x
            @Override // r20.AbstractC25622b.q
            /* renamed from: a */
            public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f14, float f15) {
                LivestreamItem.m52182A0(InterfaceC18494a.this, abstractC25622b, z11, f14, f15);
            }
        });
        c25627g.m132335m(f13);
        c25627g.m132380q(f12);
        this.f50760j0 = c25627g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m52244z0(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* renamed from: B0 */
    public final void m52245B0(List list) {
        AbstractC19074t.m100208f(list, "comment");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120364H.m55759h(list);
    }

    /* renamed from: E0 */
    public final void m52246E0(int i11, Long l11, Long l12, boolean z11) {
        float f11;
        long j11;
        long j12;
        LivestreamData livestreamData = this.f50779v0;
        if (livestreamData != null) {
            livestreamData.m51011b0(i11);
        }
        if (l11 != null) {
            l11.longValue();
            LivestreamData livestreamData2 = this.f50779v0;
            if (livestreamData2 != null) {
                livestreamData2.m51009a0(l11.longValue());
            }
        }
        if (l12 != null) {
            l12.longValue();
            LivestreamData livestreamData3 = this.f50779v0;
            if (livestreamData3 != null) {
                livestreamData3.m50993J(l12.longValue());
            }
        }
        LivestreamData livestreamData4 = this.f50779v0;
        if (livestreamData4 != null) {
            f11 = livestreamData4.m51022j();
        } else {
            f11 = 1.0f;
        }
        EnumC24601e enumC24601e = EnumC24601e.f118373r;
        if (i11 != enumC24601e.m128090c()) {
            setThumbnailVisible(false);
            setLoadingVisible(false);
        }
        EnumC24601e enumC24601e2 = EnumC24601e.f118374s;
        if (i11 != enumC24601e2.m128090c()) {
            m52241w0(false);
        }
        boolean z12 = true;
        C25062w c25062w = null;
        String str = null;
        C25062w c25062w2 = null;
        C25062w c25062w3 = null;
        C25062w c25062w4 = null;
        if (i11 == EnumC24601e.f118375t.m128090c()) {
            m52264x0(false);
            C25062w c25062w5 = this.f50781w0;
            if (c25062w5 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w5 = null;
            }
            LinearLayout linearLayout = c25062w5.f120366J;
            AbstractC19074t.m100207e(linearLayout, "lytInform");
            AbstractC26112n.m134431w0(linearLayout);
            SimpleShadowTextView simpleShadowTextView = c25062w5.f120382Z;
            int i12 = AbstractC27413h.zch_livestream_schedule_start_at;
            Object[] objArr = new Object[1];
            LivestreamData livestreamData5 = this.f50779v0;
            if (livestreamData5 != null) {
                long m51024l = livestreamData5.m51024l();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                str = AbstractC26105g.m134340g(m51024l, context);
            }
            objArr[0] = str;
            simpleShadowTextView.setText(AbstractC26112n.m134366G(this, i12, objArr));
            return;
        }
        if (i11 == enumC24601e.m128090c()) {
            C25062w c25062w6 = this.f50781w0;
            if (c25062w6 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w2 = c25062w6;
            }
            LinearLayout linearLayout2 = c25062w2.f120366J;
            AbstractC19074t.m100207e(linearLayout2, "lytInform");
            AbstractC26112n.m134367H(linearLayout2);
            return;
        }
        if (i11 == EnumC24601e.f118376u.m128090c()) {
            if (f11 <= 1.0f) {
                z12 = false;
            }
            m52264x0(z12);
            C25062w c25062w7 = this.f50781w0;
            if (c25062w7 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w3 = c25062w7;
            }
            LinearLayout linearLayout3 = c25062w3.f120366J;
            AbstractC19074t.m100207e(linearLayout3, "lytInform");
            AbstractC26112n.m134431w0(linearLayout3);
            c25062w3.f120382Z.setText(AbstractC26112n.m134366G(this, AbstractC27413h.zch_livestream_paused, new Object[0]));
            return;
        }
        if (i11 == EnumC24601e.f118377v.m128090c()) {
            if (f11 <= 1.0f) {
                z12 = false;
            }
            m52264x0(z12);
            C25062w c25062w8 = this.f50781w0;
            if (c25062w8 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w4 = c25062w8;
            }
            LinearLayout linearLayout4 = c25062w4.f120366J;
            AbstractC19074t.m100207e(linearLayout4, "lytInform");
            AbstractC26112n.m134431w0(linearLayout4);
            c25062w4.f120382Z.setText(AbstractC26112n.m134366G(this, AbstractC27413h.zch_item_livestream_no_signal, new Object[0]));
            return;
        }
        if (i11 == enumC24601e2.m128090c()) {
            C25062w c25062w9 = this.f50781w0;
            if (c25062w9 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w9;
            }
            LivestreamData livestreamData6 = this.f50779v0;
            if (livestreamData6 != null) {
                AvatarImageView avatarImageView = c25062w.f120387q;
                AbstractC19074t.m100207e(avatarImageView, "aivAvatarEnd");
                AvatarImageView.m55927l(avatarImageView, null, null, livestreamData6.m51010b().m50754c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
                C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25062w.f120369M);
                c23528a.m123599d();
                String m50754c = livestreamData6.m51010b().m50754c();
                C24003n c24003n = new C24003n(C25092o.f120501a.m130066e(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null);
                C9631t c9631t = new C9631t(c25062w);
                c9631t.m125609e1(true);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m52241w0(true);
            LivestreamData livestreamData7 = this.f50779v0;
            if (livestreamData7 != null) {
                j11 = livestreamData7.m51013d();
            } else {
                j11 = 0;
            }
            long j13 = 1000;
            long j14 = j11 * j13;
            LivestreamData livestreamData8 = this.f50779v0;
            if (livestreamData8 != null) {
                j12 = livestreamData8.m51028p();
            } else {
                j12 = 0;
            }
            Long.signum(j12);
            long j15 = j14 - (j12 * j13);
            if (j15 > 0) {
                c25062w.f120373Q.setText(AbstractC26112n.m134366G(this, AbstractC27413h.zch_livestream_duration, AbstractC26105g.m134341h(j15)));
                return;
            }
            EllipsizedTextView ellipsizedTextView = c25062w.f120373Q;
            AbstractC19074t.m100207e(ellipsizedTextView, "tvLiveDuration");
            AbstractC26112n.m134374O(ellipsizedTextView);
        }
    }

    /* renamed from: F */
    public final void m52247F() {
        boolean z11;
        boolean m100204b = AbstractC19074t.m100204b(C27417l.f129055a.m140378b().m51248x(), Boolean.FALSE);
        boolean m12572b = AbstractC2488g.m12572b(this.f50779v0);
        boolean m12573c = AbstractC2488g.m12573c(this.f50779v0);
        boolean z12 = false;
        if (!m12572b && !m12573c) {
            z11 = m100204b;
        } else {
            z11 = false;
        }
        if (m12572b || m12573c || m100204b) {
            z12 = true;
        }
        m52181A(z12, z11);
    }

    /* renamed from: H */
    public final void m52248H(String str, Long l11) {
        String str2;
        AbstractC19074t.m100208f(str, "liveId");
        if (l11 != null) {
            LivestreamData livestreamData = this.f50779v0;
            C25062w c25062w = null;
            if (livestreamData != null) {
                str2 = livestreamData.m51016f();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                boolean m51719b = AbstractC9464a.m51719b(l11, 1L);
                boolean m51719b2 = AbstractC9464a.m51719b(l11, 2L);
                boolean m51719b3 = AbstractC9464a.m51719b(l11, 8L);
                if (m51719b) {
                    C25062w c25062w2 = this.f50781w0;
                    if (c25062w2 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25062w2 = null;
                    }
                    SimpleShadowTextView simpleShadowTextView = c25062w2.f120372P;
                    AbstractC19074t.m100207e(simpleShadowTextView, "tvHeaderViewer");
                    AbstractC26112n.m134367H(simpleShadowTextView);
                } else {
                    C25062w c25062w3 = this.f50781w0;
                    if (c25062w3 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25062w3 = null;
                    }
                    SimpleShadowTextView simpleShadowTextView2 = c25062w3.f120372P;
                    AbstractC19074t.m100207e(simpleShadowTextView2, "tvHeaderViewer");
                    AbstractC26112n.m134431w0(simpleShadowTextView2);
                }
                C25062w c25062w4 = this.f50781w0;
                if (c25062w4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25062w4 = null;
                }
                c25062w4.f120367K.m56101w(m51719b2);
                if (m51719b3) {
                    C25062w c25062w5 = this.f50781w0;
                    if (c25062w5 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c25062w = c25062w5;
                    }
                    ReactionLayout reactionLayout = c25062w.f120367K;
                    AbstractC19074t.m100207e(reactionLayout, "lytReaction");
                    AbstractC26112n.m134367H(reactionLayout);
                    return;
                }
                C25062w c25062w6 = this.f50781w0;
                if (c25062w6 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25062w = c25062w6;
                }
                ReactionLayout reactionLayout2 = c25062w.f120367K;
                AbstractC19074t.m100207e(reactionLayout2, "lytReaction");
                AbstractC26112n.m134431w0(reactionLayout2);
            }
        }
    }

    /* renamed from: H0 */
    public final void m52249H0(long j11, long j12) {
        long j13;
        LivestreamData livestreamData = this.f50779v0;
        if (livestreamData != null) {
            livestreamData.m50999R(j12);
        }
        C25062w c25062w = this.f50781w0;
        C25062w c25062w2 = null;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120372P.setText(AbstractC26105g.m134334a(j12));
        LivestreamData livestreamData2 = this.f50779v0;
        if (livestreamData2 != null) {
            j13 = livestreamData2.m51019h();
        } else {
            j13 = -1;
        }
        if (j13 < j11) {
            C25062w c25062w3 = this.f50781w0;
            if (c25062w3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w2 = c25062w3;
            }
            c25062w2.f120367K.m56097M(j11);
            LivestreamData livestreamData3 = this.f50779v0;
            if (livestreamData3 != null) {
                livestreamData3.m50997O(j11);
            }
        }
    }

    /* renamed from: I0 */
    public final void m52250I0(String str) {
        AbstractC19074t.m100208f(str, "statusMsg");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120364H.m55770z(str);
    }

    /* renamed from: J0 */
    public final void m52251J0(String str, String str2) {
        String str3;
        LivestreamData livestreamData;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "id");
        LivestreamData livestreamData2 = this.f50779v0;
        String str4 = null;
        if (livestreamData2 != null) {
            str3 = livestreamData2.m51016f();
        } else {
            str3 = null;
        }
        if (AbstractC19074t.m100204b(str3, str2)) {
            LivestreamData livestreamData3 = this.f50779v0;
            if (livestreamData3 != null) {
                str4 = livestreamData3.m51030t();
            }
            if ((str4 == null || str4.length() == 0) && (livestreamData = this.f50779v0) != null) {
                livestreamData.m51015e0(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC9612a interfaceC9612a;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f50781w0 == null) {
            AbstractC19074t.m100223u("binding");
        }
        C25062w c25062w = null;
        if (motionEvent.getAction() == 0) {
            this.f50769q0 = AbstractC26104f.m134330a(motionEvent);
            this.f50771r0 = null;
        }
        this.f50773s0 = AbstractC26104f.m134330a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            MotionEvent motionEvent2 = this.f50769q0;
            if (motionEvent2 == null) {
                motionEvent2 = motionEvent;
            }
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w2;
            }
            AbstractC19074t.m100207e(c25062w.f120364H, "lytComment");
            if ((!m52192I(r1, (int) motionEvent2.getX(), (int) motionEvent2.getY())) && (interfaceC9612a = this.f50766p) != null) {
                interfaceC9612a.mo52274h();
            }
        }
        if (this.f50777u0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC9612a getCallback() {
        return this.f50766p;
    }

    public final LivestreamData getCurrentStream() {
        return this.f50779v0;
    }

    public final RecyclingImageView getThumbnailView() {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        RecyclingImageView recyclingImageView = c25062w.f120370N;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        return recyclingImageView;
    }

    public final C3220j getVideoLayoutor() {
        return this.f50754d0;
    }

    /* renamed from: n */
    public final void m52252n(List list) {
        AbstractC19074t.m100208f(list, "comment");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120364H.m55760i(list);
    }

    /* renamed from: o0 */
    public final void m52253o0() {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120364H.m55767s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50756f0.removeCallbacksAndMessages(null);
        this.f50755e0.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f50757g0) {
            float f11 = this.f50758h0;
            if (f11 < 1.0f) {
                setControlAlpha(Math.min(f11 + 0.05f, 1.0f));
                invalidate();
                return;
            }
            return;
        }
        float f12 = this.f50758h0;
        if (f12 > 0.0f) {
            setControlAlpha(Math.max(f12 - 0.05f, 0.0f));
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f50763m0 = viewConfiguration.getScaledTouchSlop();
        this.f50764n0 = viewConfiguration.getScaledMinimumFlingVelocity() * 10;
        this.f50765o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        C25062w m129960a = C25062w.m129960a(this);
        AbstractC19074t.m100207e(m129960a, "bind(...)");
        this.f50754d0.m16338k(this.f50768q);
        C3220j c3220j = this.f50754d0;
        RecyclingImageView recyclingImageView = m129960a.f120370N;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        c3220j.m16339l(recyclingImageView);
        m129960a.f120385c0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivestreamItem.m52194K(LivestreamItem.this, view);
            }
        });
        m129960a.f120393w.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivestreamItem.m52195L(LivestreamItem.this, view);
            }
        });
        ImageView imageView = m129960a.f120394x;
        AbstractC19074t.m100207e(imageView, "btnHeaderClose");
        AbstractC26112n.m134407k0(imageView, new C9625n());
        ImageView imageView2 = m129960a.f120362F;
        AbstractC19074t.m100207e(imageView2, "ivCloseEnd");
        AbstractC26112n.m134407k0(imageView2, new C9626o());
        m129960a.f120395y.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivestreamItem.m52196M(LivestreamItem.this, view);
            }
        });
        ImageView imageView3 = m129960a.f120357A;
        AbstractC19074t.m100207e(imageView3, "btnHeaderMinimize");
        AbstractC26112n.m134407k0(imageView3, new C9627p());
        View view = m129960a.f120384b0;
        AbstractC19074t.m100207e(view, "vieHeaderCard");
        AbstractC26112n.m134407k0(view, new C9628q());
        SimpleShadowTextView simpleShadowTextView = m129960a.f120396z;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnHeaderFollow");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9629r());
        SimpleShadowTextView simpleShadowTextView2 = m129960a.f120372P;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvHeaderViewer");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26112n.m134401h0(simpleShadowTextView2, C27280g.m139659b(context, AbstractC23322a.zds_ic_user_solid_16, AbstractC27406a.zch_text_inverse_subtle));
        SimpleShadowTextView simpleShadowTextView3 = m129960a.f120377U;
        AbstractC19074t.m100207e(simpleShadowTextView3, "txtErrorRetry");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        AbstractC26112n.m134401h0(simpleShadowTextView3, C27280g.m139659b(context2, AbstractC23322a.zds_ic_retry_solid_16, AbstractC27406a.zch_text_secondary));
        SimpleShadowTextView simpleShadowTextView4 = m129960a.f120377U;
        AbstractC19074t.m100207e(simpleShadowTextView4, "txtErrorRetry");
        AbstractC26112n.m134391c0(simpleShadowTextView4, AbstractC26112n.m134426u(this, AbstractC27406a.zch_white_a10), AbstractC26105g.m134347n(6));
        SimpleShadowTextView simpleShadowTextView5 = m129960a.f120377U;
        AbstractC19074t.m100207e(simpleShadowTextView5, "txtErrorRetry");
        AbstractC26112n.m134407k0(simpleShadowTextView5, new C9630s(m129960a, this));
        m129960a.f120358B.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LivestreamItem.m52197N(LivestreamItem.this, view2);
            }
        });
        SimpleShadowTextView simpleShadowTextView6 = m129960a.f120378V;
        AbstractC19074t.m100207e(simpleShadowTextView6, "txtFooterComment");
        AbstractC26112n.m134407k0(simpleShadowTextView6, new C9621j(m129960a, this));
        ImageView imageView4 = m129960a.f120391u;
        AbstractC19074t.m100207e(imageView4, "btnFooterMore");
        AbstractC26112n.m134407k0(imageView4, new C9622k());
        ImageView imageView5 = m129960a.f120392v;
        AbstractC19074t.m100207e(imageView5, "btnFooterShare");
        AbstractC26112n.m134407k0(imageView5, new C9623l());
        m129960a.f120363G.setOnListClickListener(new C9624m());
        this.f50781w0 = m129960a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        AbstractC25622b abstractC25622b = this.f50760j0;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        if (c25062w.f120367K.m56102z() && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        ImageView imageView = c25062w.f120395y;
        AbstractC19074t.m100207e(imageView, "btnHeaderComment");
        boolean contains = AbstractC26112n.m134360A(imageView).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        ReactionButton reactionButton = c25062w.f120367K.getBinding().f120179q;
        AbstractC19074t.m100207e(reactionButton, "btnReaction");
        boolean m52192I = m52192I(reactionButton, (int) motionEvent.getX(), (int) motionEvent.getY());
        if (this.f50758h0 < 1.0f && motionEvent.getX() <= c25062w.f120385c0.getRight() && !contains && !m52192I) {
            return true;
        }
        onTouchEvent(motionEvent);
        if (this.f50767p0 != null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f50781w0 == null) {
            AbstractC19074t.m100223u("binding");
        }
        if (m52193J()) {
            m52204U(z11, 0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            m52198O(z11, 0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (this.f50781w0 == null) {
            AbstractC19074t.m100223u("binding");
        }
        if (size < size2) {
            m52225h0(i11, i12);
            InterfaceC9612a interfaceC9612a = this.f50766p;
            if (interfaceC9612a != null) {
                interfaceC9612a.mo52278l(false);
            }
        } else {
            m52213b0(i11, i12);
            InterfaceC9612a interfaceC9612a2 = this.f50766p;
            if (interfaceC9612a2 != null) {
                interfaceC9612a2.mo52278l(true);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        boolean z11;
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (m52193J()) {
            c25062w.f120357A.setBackgroundResource(AbstractC27408c.zch_bg_ripple_circle);
            c25062w.f120361E.setImageResource(AbstractC23322a.zch_ic_horizontal_to_landscape_line_24);
            View view = c25062w.f120385c0;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1291845632, 0, 0, 218103808, 1711276032, -1509949440});
            view.setBackground(gradientDrawable);
            c25062w.f120385c0.setAlpha(1.0f);
            m52185C0(0.0f);
        } else {
            c25062w.f120357A.setBackgroundResource(AbstractC27408c.zch_bg_button_livestream);
            View view2 = c25062w.f120385c0;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColors(new int[]{-1728053248, 1073741824, 0, 0, 0, 0});
            view2.setBackground(gradientDrawable2);
        }
        if (this.f50762l0 == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        m52187D0(z11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        AbstractC19074t.m100208f(motionEvent, "event");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        AbstractC25622b abstractC25622b = this.f50760j0;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        if (c25062w.f120367K.m56102z()) {
            c25062w.f120367K.m56100v();
            return true;
        }
        ImageView imageView = c25062w.f120395y;
        AbstractC19074t.m100207e(imageView, "btnHeaderComment");
        boolean contains = AbstractC26112n.m134360A(imageView).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        ReactionButton reactionButton = c25062w.f120367K.getBinding().f120179q;
        AbstractC19074t.m100207e(reactionButton, "btnReaction");
        boolean m52192I = m52192I(reactionButton, (int) motionEvent.getX(), (int) motionEvent.getY());
        if (this.f50758h0 < 1.0f && motionEvent.getX() <= c25062w.f120385c0.getRight() && motionEvent.getAction() == 1 && this.f50767p0 == null && !contains && !m52192I) {
            c25062w.f120385c0.callOnClick();
            return true;
        }
        if (m52193J()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float f11 = 0.0f;
            if (action != 2) {
                VelocityTracker velocityTracker2 = this.f50767p0;
                if (velocityTracker2 != null) {
                    AbstractC19074t.m100205c(velocityTracker2);
                    velocityTracker2.addMovement(motionEvent);
                    VelocityTracker velocityTracker3 = this.f50767p0;
                    AbstractC19074t.m100205c(velocityTracker3);
                    velocityTracker3.computeCurrentVelocity(1000, this.f50765o0);
                    VelocityTracker velocityTracker4 = this.f50767p0;
                    AbstractC19074t.m100205c(velocityTracker4);
                    C24860q m134357b = AbstractC26108j.m134357b(velocityTracker4, this.f50764n0, this.f50765o0);
                    boolean booleanValue = ((Boolean) m134357b.m129213a()).booleanValue();
                    float floatValue = ((Number) m134357b.m129214b()).floatValue();
                    if (booleanValue) {
                        f11 = floatValue;
                    }
                    m52239u(f11);
                    this.f50767p0 = null;
                }
                this.f50771r0 = null;
            } else {
                MotionEvent motionEvent2 = this.f50771r0;
                if (motionEvent2 != null && this.f50767p0 == null && AbstractC26104f.m134332c(motionEvent2, motionEvent, this.f50763m0)) {
                    VelocityTracker obtain = VelocityTracker.obtain();
                    this.f50767p0 = obtain;
                    AbstractC19074t.m100205c(obtain);
                    obtain.addMovement(motionEvent2);
                    this.f50771r0 = AbstractC26104f.m134330a(motionEvent);
                }
                MotionEvent motionEvent3 = this.f50771r0;
                if (motionEvent3 != null && (velocityTracker = this.f50767p0) != null) {
                    AbstractC19074t.m100205c(velocityTracker);
                    velocityTracker.addMovement(motionEvent);
                    float x11 = motionEvent.getX() - motionEvent3.getX();
                    if (this.f50761k0) {
                        m52185C0(Math.min(Math.max(0.0f, 1.0f - (x11 / c25062w.f120390t.getMeasuredWidth())), 1.0f));
                    } else {
                        m52185C0(Math.min(Math.max(0.0f, (-x11) / c25062w.f120390t.getMeasuredWidth()), 1.0f));
                    }
                }
            }
        } else {
            this.f50771r0 = AbstractC26104f.m134330a(motionEvent);
            this.f50767p0 = null;
        }
        return true;
    }

    /* renamed from: p */
    public final void m52254p(InteractEventResponse.InteractItem interactItem) {
        AbstractC19074t.m100208f(interactItem, "interact");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        c25062w.f120364H.m55761j(interactItem);
    }

    /* renamed from: p0 */
    public final void m52255p0() {
        C25062w c25062w = null;
        this.f50756f0.removeCallbacksAndMessages(null);
        this.f50755e0.removeCallbacksAndMessages(null);
        setThumbnailVisible(true);
        C25062w c25062w2 = this.f50781w0;
        if (c25062w2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w2;
        }
        c25062w.f120364H.m55765n();
        SimpleShadowTextView simpleShadowTextView = c25062w.f120375S;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvNewCmtNum");
        AbstractC26112n.m134367H(simpleShadowTextView);
        RecyclingImageView recyclingImageView = c25062w.f120369M;
        AbstractC19074t.m100207e(recyclingImageView, "rivBgEnd");
        AbstractC26112n.m134367H(recyclingImageView);
        ImageView imageView = c25062w.f120362F;
        AbstractC19074t.m100207e(imageView, "ivCloseEnd");
        AbstractC26112n.m134367H(imageView);
        AvatarImageView avatarImageView = c25062w.f120387q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatarEnd");
        AbstractC26112n.m134367H(avatarImageView);
        EllipsizedTextView ellipsizedTextView = c25062w.f120371O;
        AbstractC19074t.m100207e(ellipsizedTextView, "tvEndLive");
        AbstractC26112n.m134367H(ellipsizedTextView);
        EllipsizedTextView ellipsizedTextView2 = c25062w.f120373Q;
        AbstractC19074t.m100207e(ellipsizedTextView2, "tvLiveDuration");
        AbstractC26112n.m134367H(ellipsizedTextView2);
        EllipsizedTextView ellipsizedTextView3 = c25062w.f120374R;
        AbstractC19074t.m100207e(ellipsizedTextView3, "tvMoreLive");
        AbstractC26112n.m134367H(ellipsizedTextView3);
        GridLayout gridLayout = c25062w.f120360D;
        AbstractC19074t.m100207e(gridLayout, "glMoreLive");
        AbstractC26112n.m134367H(gridLayout);
        c25062w.f120378V.setText("");
    }

    /* renamed from: q */
    public final C9440a m52256q(GetCommentLiveRes.CommentData commentData) {
        AbstractC19074t.m100208f(commentData, "comment");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        return c25062w.f120364H.m55762k(commentData);
    }

    /* renamed from: q0 */
    public final void m52257q0() {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
        LivestreamRotateButton.m52302e(livestreamRotateButton, false, 1, null);
    }

    /* renamed from: r */
    public final void m52258r(int i11) {
        LivestreamData livestreamData;
        C25062w c25062w = this.f50781w0;
        Long l11 = null;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        ReactionLayout reactionLayout = c25062w.f120367K;
        LivestreamData livestreamData2 = this.f50779v0;
        if (livestreamData2 != null) {
            l11 = Long.valueOf(livestreamData2.m51019h());
        }
        Long m56098p = reactionLayout.m56098p(l11, i11);
        if (m56098p != null && m56098p.longValue() > 0 && (livestreamData = this.f50779v0) != null) {
            livestreamData.m50997O(m56098p.longValue());
        }
    }

    /* renamed from: s */
    public final void m52259s(String str, InteractEventResponse.InteractItem interactItem) {
        String str2;
        AbstractC19074t.m100208f(interactItem, "interact");
        LivestreamData livestreamData = this.f50779v0;
        C25062w c25062w = null;
        if (livestreamData != null) {
            str2 = livestreamData.m51016f();
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str2, str)) {
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w2;
            }
            c25062w.f120364H.m55763l(interactItem);
        }
    }

    public final void setCallback(InterfaceC9612a interfaceC9612a) {
        this.f50766p = interfaceC9612a;
    }

    public final void setCommentBoxHeight(int i11) {
        boolean z11;
        this.f50775t0 = i11;
        requestLayout();
        if (m52193J()) {
            boolean z12 = false;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f50777u0 = z11;
            C25062w c25062w = this.f50781w0;
            if (c25062w == null) {
                AbstractC19074t.m100223u("binding");
                c25062w = null;
            }
            c25062w.f120364H.m55768x(this.f50777u0);
            if (i11 > 0) {
                z12 = true;
            }
            m52191G0(z12);
        }
    }

    public final void setControlAlpha(float f11) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (m52193J()) {
            View[] viewArr = {c25062w.f120379W, c25062w.f120384b0, c25062w.f120388r, c25062w.f120380X, c25062w.f120372P, c25062w.f120396z, c25062w.f120357A, c25062w.f120394x, c25062w.f120381Y, c25062w.f120358B, c25062w.f120364H, c25062w.f120367K, c25062w.f120378V, c25062w.f120391u, c25062w.f120392v};
            for (int i11 = 0; i11 < 15; i11++) {
                viewArr[i11].setAlpha(f11);
            }
        } else {
            View[] viewArr2 = {c25062w.f120393w, c25062w.f120379W, c25062w.f120384b0, c25062w.f120388r, c25062w.f120380X, c25062w.f120372P, c25062w.f120396z, c25062w.f120357A, c25062w.f120381Y, c25062w.f120391u, c25062w.f120392v, c25062w.f120358B, c25062w.f120385c0};
            for (int i12 = 0; i12 < 13; i12++) {
                viewArr2[i12].setAlpha(f11);
            }
            LivestreamCommentLayout livestreamCommentLayout = c25062w.f120364H;
            AbstractC19074t.m100207e(livestreamCommentLayout, "lytComment");
            SimpleShadowTextView simpleShadowTextView = c25062w.f120378V;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtFooterComment");
            View[] viewArr3 = {livestreamCommentLayout, simpleShadowTextView};
            for (int i13 = 0; i13 < 2; i13++) {
                viewArr3[i13].setAlpha(1.0f);
            }
        }
        this.f50758h0 = f11;
    }

    public final void setCurrentStream(LivestreamData livestreamData) {
        this.f50779v0 = livestreamData;
    }

    public final void setFooterText(CharSequence charSequence) {
        if (charSequence != null) {
            C25062w c25062w = this.f50781w0;
            if (c25062w == null) {
                AbstractC19074t.m100223u("binding");
                c25062w = null;
            }
            c25062w.f120378V.setText(charSequence);
        }
    }

    public final void setLoadingVisible(boolean z11) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (z11) {
            ProgressBar progressBar = c25062w.f120389s;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
        } else {
            ProgressBar progressBar2 = c25062w.f120389s;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134367H(progressBar2);
        }
    }

    public final void setOrientationMode(boolean z11) {
        this.f50777u0 = z11;
        C25062w c25062w = null;
        if (z11) {
            m52237r0();
            this.f50756f0.removeCallbacksAndMessages(null);
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
                c25062w2 = null;
            }
            c25062w2.f120364H.m55769y(true);
            C25062w c25062w3 = this.f50781w0;
            if (c25062w3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w3;
            }
            c25062w.f120364H.m55764m(true);
            return;
        }
        this.f50755e0.removeCallbacksAndMessages(null);
        C25062w c25062w4 = this.f50781w0;
        if (c25062w4 == null) {
            AbstractC19074t.m100223u("binding");
            c25062w4 = null;
        }
        c25062w4.f120364H.m55769y(false);
        C25062w c25062w5 = this.f50781w0;
        if (c25062w5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w5;
        }
        c25062w.f120364H.m55764m(false);
        this.f50757g0 = true;
        invalidate();
    }

    public final void setThumbnailVisible(boolean z11) {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (z11) {
            RecyclingImageView recyclingImageView = c25062w.f120368L;
            AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
            AbstractC26112n.m134431w0(recyclingImageView);
            RecyclingImageView recyclingImageView2 = c25062w.f120370N;
            AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
            AbstractC26112n.m134431w0(recyclingImageView2);
            return;
        }
        RecyclingImageView recyclingImageView3 = c25062w.f120368L;
        AbstractC19074t.m100207e(recyclingImageView3, "rivBackground");
        AbstractC26112n.m134367H(recyclingImageView3);
        RecyclingImageView recyclingImageView4 = c25062w.f120370N;
        AbstractC19074t.m100207e(recyclingImageView4, "rivThumbnail");
        AbstractC26112n.m134367H(recyclingImageView4);
    }

    /* renamed from: t0 */
    public final void m52260t0() {
        this.f50756f0.removeCallbacksAndMessages(null);
        this.f50756f0.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.y
            @Override // java.lang.Runnable
            public final void run() {
                LivestreamItem.m52240u0(LivestreamItem.this);
            }
        }, this.f50759i0);
    }

    /* renamed from: v */
    public final void m52261v(LivestreamData livestreamData, ReactionLayout.InterfaceC10806b interfaceC10806b) {
        String str;
        AbstractC19074t.m100208f(livestreamData, "livestreamData");
        String m50769l = livestreamData.m51010b().m50769l();
        C27417l c27417l = C27417l.f129055a;
        Channel m140377a = c27417l.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        } else {
            str = null;
        }
        boolean m100204b = AbstractC19074t.m100204b(m50769l, str);
        boolean m51243p = c27417l.m140378b().m51243p();
        this.f50779v0 = livestreamData;
        m52265y(livestreamData);
        m52242x(livestreamData);
        m52246E0(livestreamData.m51029q(), Long.valueOf(livestreamData.m51028p()), Long.valueOf(livestreamData.m51013d()), true);
        m52248H(livestreamData.m51016f(), livestreamData.m51008a());
        m52247F();
        m52190G(m51243p, livestreamData.m51025m());
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        if (livestreamData.m51022j() > 1.0f) {
            LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
            AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
            AbstractC26112n.m134431w0(livestreamRotateButton);
        } else {
            LivestreamRotateButton livestreamRotateButton2 = c25062w.f120358B;
            AbstractC19074t.m100207e(livestreamRotateButton2, "btnRotate");
            AbstractC26112n.m134367H(livestreamRotateButton2);
        }
        c25062w.f120367K.setCallback(interfaceC10806b);
        AvatarImageView avatarImageView = c25062w.f120388r;
        AbstractC19074t.m100207e(avatarImageView, "aivHeaderAvatar");
        AvatarImageView.m55927l(avatarImageView, null, null, livestreamData.m51010b().m50754c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
        c25062w.f120380X.setText(livestreamData.m51010b().m50775o());
        c25062w.f120367K.m56099u();
        c25062w.f120367K.m56097M(livestreamData.m51019h());
        c25062w.f120372P.setText(AbstractC26105g.m134334a(livestreamData.m51021i()));
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25062w.f120368L);
        c23528a.m123599d();
        String m50754c = livestreamData.m51010b().m50754c();
        C24003n c24003n = new C24003n(C25092o.f120501a.m130066e(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null);
        C9618g c9618g = new C9618g(c25062w);
        c9618g.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        if (m100204b) {
            SimpleShadowTextView simpleShadowTextView = c25062w.f120379W;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtHeaderLive");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            SimpleShadowTextView simpleShadowTextView2 = c25062w.f120372P;
            int i11 = this.f50774t;
            simpleShadowTextView2.setPadding(i11, 0, i11, 0);
            c25062w.f120372P.setBackgroundResource(AbstractC27408c.zch_bg_button_livestream);
            SimpleShadowTextView simpleShadowTextView3 = c25062w.f120372P;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvHeaderViewer");
            AbstractC26112n.m134425t0(simpleShadowTextView3, AbstractC27406a.zch_text_primary);
            ImageView imageView = c25062w.f120391u;
            AbstractC19074t.m100207e(imageView, "btnFooterMore");
            AbstractC26112n.m134367H(imageView);
            return;
        }
        SimpleShadowTextView simpleShadowTextView4 = c25062w.f120379W;
        AbstractC19074t.m100207e(simpleShadowTextView4, "txtHeaderLive");
        AbstractC26112n.m134367H(simpleShadowTextView4);
        SimpleShadowTextView simpleShadowTextView5 = c25062w.f120372P;
        AbstractC19074t.m100207e(simpleShadowTextView5, "tvHeaderViewer");
        simpleShadowTextView5.setPadding(0, 0, 0, 0);
        c25062w.f120372P.setBackground(null);
        SimpleShadowTextView simpleShadowTextView6 = c25062w.f120372P;
        AbstractC19074t.m100207e(simpleShadowTextView6, "tvHeaderViewer");
        AbstractC26112n.m134425t0(simpleShadowTextView6, AbstractC27406a.zch_text_inverse_subtle);
        ImageView imageView2 = c25062w.f120391u;
        AbstractC19074t.m100207e(imageView2, "btnFooterMore");
        AbstractC26112n.m134431w0(imageView2);
    }

    /* renamed from: v0 */
    public final void m52262v0() {
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        LinearLayout linearLayout = c25062w.f120365I;
        AbstractC19074t.m100207e(linearLayout, "lytError");
        AbstractC26112n.m134431w0(linearLayout);
    }

    /* renamed from: w */
    public final void m52263w(LivestreamData livestreamData, List list) {
        AbstractC19074t.m100208f(livestreamData, "livestreamData");
        AbstractC19074t.m100208f(list, "payloads");
        if (AbstractC19074t.m100204b(list.get(0), "FOLLOW")) {
            m52242x(livestreamData);
        }
    }

    /* renamed from: x0 */
    public final void m52264x0(boolean z11) {
        C25062w c25062w = null;
        if (z11) {
            C25062w c25062w2 = this.f50781w0;
            if (c25062w2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25062w = c25062w2;
            }
            LivestreamRotateButton livestreamRotateButton = c25062w.f120358B;
            AbstractC19074t.m100207e(livestreamRotateButton, "btnRotate");
            AbstractC26112n.m134431w0(livestreamRotateButton);
            return;
        }
        C25062w c25062w3 = this.f50781w0;
        if (c25062w3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w3;
        }
        LivestreamRotateButton livestreamRotateButton2 = c25062w.f120358B;
        AbstractC19074t.m100207e(livestreamRotateButton2, "btnRotate");
        AbstractC26112n.m134367H(livestreamRotateButton2);
    }

    /* renamed from: y */
    public final void m52265y(LivestreamData livestreamData) {
        AbstractC19074t.m100208f(livestreamData, "stream");
        C25062w c25062w = this.f50781w0;
        if (c25062w == null) {
            AbstractC19074t.m100223u("binding");
            c25062w = null;
        }
        RecyclingImageView recyclingImageView = c25062w.f120370N;
        this.f50754d0.m16337j(livestreamData.m51022j());
    }

    /* renamed from: z */
    public final void m52266z(String str, List list) {
        String str2;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(list, "cmtIds");
        LivestreamData livestreamData = this.f50779v0;
        C25062w c25062w = null;
        if (livestreamData != null) {
            str2 = livestreamData.m51016f();
        } else {
            str2 = null;
        }
        if (!AbstractC19074t.m100204b(str, str2)) {
            return;
        }
        C25062w c25062w2 = this.f50781w0;
        if (c25062w2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25062w = c25062w2;
        }
        c25062w.f120364H.m55766q(list);
    }
}
