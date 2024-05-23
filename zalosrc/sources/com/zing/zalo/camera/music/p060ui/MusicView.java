package com.zing.zalo.camera.music.p060ui;

import ag0.C0815e1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1563j0;
import androidx.recyclerview.widget.AbstractC1906a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.music.p060ui.MusicView;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.p077ui.imgdecor.caption.customview.CaptionRoundedTextView;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gf.C19435a;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p139eq.C18573i;
import p208hf.C20027a;
import p208hf.C20028b;
import p237if.C20527a;
import p276jt.C21357l;
import p354n3.C23528a;
import p489rn.C25892l2;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p649xl.C29823gd;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;

/* loaded from: classes3.dex */
public final class MusicView extends FrameLayout {
    public static final C7681a Companion = new C7681a(null);

    /* renamed from: A */
    private int f41355A;

    /* renamed from: B */
    private final InterfaceC24854k f41356B;

    /* renamed from: C */
    private final InterfaceC29232g f41357C;

    /* renamed from: D */
    private AbstractC1906a0 f41358D;

    /* renamed from: E */
    private final RecyclerView.AbstractC1892s f41359E;

    /* renamed from: F */
    private List f41360F;

    /* renamed from: G */
    private int f41361G;

    /* renamed from: p */
    private final HandlerC7686f f41362p;

    /* renamed from: q */
    private C19435a f41363q;

    /* renamed from: r */
    private SongData f41364r;

    /* renamed from: s */
    private Boolean f41365s;

    /* renamed from: t */
    private Animator f41366t;

    /* renamed from: u */
    private Animator f41367u;

    /* renamed from: v */
    private final InterfaceC24854k f41368v;

    /* renamed from: w */
    private InterfaceC7682b f41369w;

    /* renamed from: x */
    private final InterfaceC24854k f41370x;

    /* renamed from: y */
    private final InterfaceC24854k f41371y;

    /* renamed from: z */
    private RecyclerView f41372z;

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$a */
    /* loaded from: classes3.dex */
    public static final class C7681a {
        private C7681a() {
        }

        public /* synthetic */ C7681a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21357l.b m39417a(String str, int i11) {
            AbstractC19074t.m100208f(str, "fontPath");
            C21357l.b bVar = new C21357l.b();
            bVar.f104095b = str;
            bVar.f104097d = -1;
            bVar.f104098e = 0;
            bVar.f104099f = 0;
            bVar.f104106m = i11;
            bVar.f104107n = 0;
            bVar.f104108o = AbstractC23222t7.f112552c;
            bVar.f104109p = 1.0f;
            return bVar;
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7682b {
        /* renamed from: l */
        void mo38331l();

        /* renamed from: m */
        void mo38332m(C20028b c20028b);

        /* renamed from: n */
        void mo38333n();

        /* renamed from: o */
        void mo38334o();

        /* renamed from: p */
        void mo38335p(C25892l2.c cVar);
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$c */
    /* loaded from: classes3.dex */
    static final class C7683c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41373q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7683c(Context context) {
            super(0);
            this.f41373q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(this.f41373q);
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$d */
    /* loaded from: classes3.dex */
    static final class C7684d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.camera.music.ui.MusicView$d$a */
        /* loaded from: classes3.dex */
        public static final class a implements C25892l2.a {

            /* renamed from: a */
            final /* synthetic */ MusicView f41375a;

            a(MusicView musicView) {
                this.f41375a = musicView;
            }

            @Override // p489rn.C25892l2.a
            /* renamed from: a */
            public void mo39420a(int i11, C25892l2.c cVar) {
                int i12;
                if (cVar != null) {
                    i12 = cVar.m133553a();
                } else {
                    i12 = -1;
                }
                if (i12 != -1 && this.f41375a.f41355A != i12) {
                    this.f41375a.f41355A = i12;
                    InterfaceC7682b musicViewListener = this.f41375a.getMusicViewListener();
                    if (musicViewListener != null) {
                        MusicView musicView = this.f41375a;
                        musicViewListener.mo38335p(cVar);
                        musicView.m39385H(i11, true);
                    }
                }
            }
        }

        C7684d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25892l2 mo12V4() {
            return new C25892l2(MusicView.this.f41363q.m101600c(), new a(MusicView.this));
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$e */
    /* loaded from: classes3.dex */
    static final class C7685e extends AbstractC19075u implements InterfaceC18494a {
        C7685e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29823gd mo12V4() {
            C29823gd m148001a = C29823gd.m148001a(MusicView.this);
            AbstractC19074t.m100207e(m148001a, "bind(...)");
            return m148001a;
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$f */
    /* loaded from: classes3.dex */
    public static final class HandlerC7686f extends Handler {

        /* renamed from: com.zing.zalo.camera.music.ui.MusicView$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ C29823gd f41378p;

            a(C29823gd c29823gd) {
                this.f41378p = c29823gd;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                this.f41378p.f137906y.setVisibility(8);
            }
        }

        HandlerC7686f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 1000) {
                C29823gd binding = MusicView.this.getBinding();
                MusicView musicView = MusicView.this;
                Animator fadeOutAlertAnim = musicView.getFadeOutAlertAnim();
                if (fadeOutAlertAnim != null && fadeOutAlertAnim.isRunning()) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(binding.f137906y, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new a(binding));
                ofFloat.start();
                musicView.setFadeOutAlertAnim(ofFloat);
                return;
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$g */
    /* loaded from: classes3.dex */
    public static final class C7687g extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final int f41379a = AbstractC23222t7.f112586t;

        /* renamed from: b */
        private int f41380b = -1;

        /* renamed from: c */
        private int f41381c = -1;

        /* renamed from: com.zing.zalo.camera.music.ui.MusicView$g$a */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ View f41382p;

            /* renamed from: q */
            final /* synthetic */ RecyclerView f41383q;

            public a(View view, RecyclerView recyclerView) {
                this.f41382p = view;
                this.f41383q = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41383q.m9853S0();
            }
        }

        /* renamed from: com.zing.zalo.camera.music.ui.MusicView$g$b */
        /* loaded from: classes3.dex */
        public static final class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ View f41384p;

            /* renamed from: q */
            final /* synthetic */ RecyclerView f41385q;

            public b(View view, RecyclerView recyclerView) {
                this.f41384p = view;
                this.f41385q = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41385q.m9853S0();
            }
        }

        C7687g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int m9912a = ((RecyclerView.LayoutParams) layoutParams).m9912a();
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (m9912a == 0) {
                if (view.getWidth() != this.f41380b) {
                    AbstractC19074t.m100207e(ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(view, new a(view, recyclerView)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
                }
                this.f41380b = view.getWidth();
                rect.left = (recyclerView.getWidth() / 2) - (view.getWidth() / 2);
                if (linearLayoutManager.m10127i() > 1) {
                    rect.right = this.f41379a / 2;
                    return;
                } else {
                    rect.right = rect.left;
                    return;
                }
            }
            if (m9912a == linearLayoutManager.m10127i() - 1) {
                if (view.getWidth() != this.f41381c) {
                    AbstractC19074t.m100207e(ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(view, new b(view, recyclerView)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
                }
                this.f41381c = view.getWidth();
                rect.right = (recyclerView.getWidth() / 2) - (view.getWidth() / 2);
                rect.left = this.f41379a / 2;
                return;
            }
            int i11 = this.f41379a;
            rect.left = i11 / 2;
            rect.right = i11 / 2;
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$h */
    /* loaded from: classes3.dex */
    static final class C7688h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41386q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7688h(Context context) {
            super(0);
            this.f41386q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmoothScrollLinearLayoutManager mo12V4() {
            return new SmoothScrollLinearLayoutManager(this.f41386q, 0, false);
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$i */
    /* loaded from: classes3.dex */
    static final class C7689i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41387q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7689i(Context context) {
            super(0);
            this.f41387q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18573i mo12V4() {
            C18573i c18573i = new C18573i(this.f41387q);
            Context context = this.f41387q;
            c18573i.m89106L().m89028L(-1, -2);
            c18573i.m111957E1(true);
            c18573i.m111980v1(TextUtils.TruncateAt.END);
            c18573i.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            c18573i.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            c18573i.m111958F1(AbstractC8020f0.str_compose_feed_bar_add_song);
            return c18573i;
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$j */
    /* loaded from: classes3.dex */
    public static final class C7690j extends RecyclerView.AbstractC1892s {
        C7690j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            int i12;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                try {
                    if (recyclerView.getVisibility() == 0) {
                        AbstractC1906a0 abstractC1906a0 = MusicView.this.f41358D;
                        if (abstractC1906a0 == null) {
                            AbstractC19074t.m100223u("snapHelper");
                            abstractC1906a0 = null;
                        }
                        View mo10402h = abstractC1906a0.mo10402h(MusicView.this.getLayoutManager());
                        if (mo10402h != null) {
                            C25892l2.c m133546P = MusicView.this.getAdapterStoryEffects().m133546P(recyclerView.m9817A0(mo10402h));
                            if (m133546P != null) {
                                i12 = m133546P.m133553a();
                            } else {
                                i12 = -1;
                            }
                            if (i12 != -1 && MusicView.this.f41355A != i12) {
                                MusicView.this.f41355A = i12;
                                InterfaceC7682b musicViewListener = MusicView.this.getMusicViewListener();
                                if (musicViewListener != null) {
                                    MusicView musicView = MusicView.this;
                                    musicView.getAdapterStoryEffects().m133549T(musicView.f41355A);
                                    musicViewListener.mo38335p(m133546P);
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$k */
    /* loaded from: classes3.dex */
    public static final class C7691k extends AnimatorListenerAdapter {
        C7691k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            MusicView.this.f41362p.removeMessages(1000);
            MusicView.this.f41362p.sendEmptyMessageDelayed(1000, 2000L);
        }
    }

    /* renamed from: com.zing.zalo.camera.music.ui.MusicView$l */
    /* loaded from: classes3.dex */
    static final class C7692l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C7692l f41390q = new C7692l();

        C7692l() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C25892l2.c cVar) {
            AbstractC19074t.m100208f(cVar, "item");
            return Boolean.valueOf(C20527a.m106641c(cVar.m133553a()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        List m131502j;
        AbstractC19074t.m100208f(context, "context");
        this.f41362p = new HandlerC7686f(Looper.getMainLooper());
        this.f41363q = C19435a.f96406a;
        m129210a = AbstractC24856m.m129210a(new C7689i(context));
        this.f41368v = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C7683c(context));
        this.f41370x = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C7685e());
        this.f41371y = m129210a3;
        this.f41355A = -1;
        m129210a4 = AbstractC24856m.m129210a(new C7684d());
        this.f41356B = m129210a4;
        this.f41357C = AbstractC29233h.m145990a(new C7688h(context));
        this.f41359E = new C7690j();
        m131502j = AbstractC25368s.m131502j();
        this.f41360F = m131502j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m39379A(C29823gd c29823gd) {
        AbstractC19074t.m100208f(c29823gd, "$this_with");
        c29823gd.f137904w.m9837K1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m39380B(MusicView musicView, View view) {
        AbstractC19074t.m100208f(musicView, "this$0");
        musicView.m39384F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m39381C(MusicView musicView, View view) {
        AbstractC19074t.m100208f(musicView, "this$0");
        InterfaceC7682b interfaceC7682b = musicView.f41369w;
        if (interfaceC7682b != null) {
            interfaceC7682b.mo38334o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m39382D(MusicView musicView, View view) {
        AbstractC19074t.m100208f(musicView, "this$0");
        InterfaceC7682b interfaceC7682b = musicView.f41369w;
        if (interfaceC7682b != null) {
            interfaceC7682b.mo38331l();
        }
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154346U(C32002l4.Companion.m154287a(7).m154284u(87)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m39383E(View view) {
    }

    /* renamed from: F */
    private final void m39384F() {
        this.f41361G = (this.f41361G + 1) % this.f41360F.size();
        InterfaceC7682b interfaceC7682b = this.f41369w;
        if (interfaceC7682b != null) {
            interfaceC7682b.mo38332m(getSelectedFont());
        }
        m39411M(getSelectedFont());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m39385H(final int i11, final boolean z11) {
        RecyclerView recyclerView = this.f41372z;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView = null;
        }
        recyclerView.post(new Runnable() { // from class: hf.i
            @Override // java.lang.Runnable
            public final void run() {
                MusicView.m39386I(z11, this, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m39386I(final boolean z11, final MusicView musicView, final int i11) {
        AbstractC19074t.m100208f(musicView, "this$0");
        RecyclerView recyclerView = null;
        try {
            if (z11) {
                RecyclerView recyclerView2 = musicView.f41372z;
                if (recyclerView2 == null) {
                    AbstractC19074t.m100223u("recyclerView");
                    recyclerView2 = null;
                }
                recyclerView2.mo9854S1(i11);
            } else {
                RecyclerView recyclerView3 = musicView.f41372z;
                if (recyclerView3 == null) {
                    AbstractC19074t.m100223u("recyclerView");
                    recyclerView3 = null;
                }
                recyclerView3.m9837K1(i11);
            }
            RecyclerView recyclerView4 = musicView.f41372z;
            if (recyclerView4 == null) {
                AbstractC19074t.m100223u("recyclerView");
            } else {
                recyclerView = recyclerView4;
            }
            recyclerView.post(new Runnable() { // from class: hf.j
                @Override // java.lang.Runnable
                public final void run() {
                    MusicView.m39387J(MusicView.this, i11, z11);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m39387J(MusicView musicView, int i11, boolean z11) {
        AbstractC19074t.m100208f(musicView, "this$0");
        View mo9732P = musicView.getLayoutManager().mo9732P(i11);
        if (mo9732P != null) {
            AbstractC1906a0 abstractC1906a0 = musicView.f41358D;
            RecyclerView recyclerView = null;
            if (abstractC1906a0 == null) {
                AbstractC19074t.m100223u("snapHelper");
                abstractC1906a0 = null;
            }
            int[] mo10398c = abstractC1906a0.mo10398c(musicView.getLayoutManager(), mo9732P);
            if (mo10398c != null) {
                if (mo10398c[0] != 0 || mo10398c[1] != 0) {
                    if (z11) {
                        RecyclerView recyclerView2 = musicView.f41372z;
                        if (recyclerView2 == null) {
                            AbstractC19074t.m100223u("recyclerView");
                        } else {
                            recyclerView = recyclerView2;
                        }
                        recyclerView.m9845O1(mo10398c[0], mo10398c[1]);
                        return;
                    }
                    RecyclerView recyclerView3 = musicView.f41372z;
                    if (recyclerView3 == null) {
                        AbstractC19074t.m100223u("recyclerView");
                    } else {
                        recyclerView = recyclerView3;
                    }
                    recyclerView.scrollBy(mo10398c[0], mo10398c[1]);
                }
            }
        }
    }

    private final C23528a getAQuery() {
        return (C23528a) this.f41370x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C25892l2 getAdapterStoryEffects() {
        return (C25892l2) this.f41356B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29823gd getBinding() {
        return (C29823gd) this.f41371y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmoothScrollLinearLayoutManager getLayoutManager() {
        return (SmoothScrollLinearLayoutManager) this.f41357C.getValue();
    }

    private final C18573i getMarqueeModule() {
        return (C18573i) this.f41368v.getValue();
    }

    private final C20028b getSelectedFont() {
        int size = this.f41360F.size();
        int i11 = this.f41361G;
        if (i11 >= 0 && i11 < size) {
            return (C20028b) this.f41360F.get(i11);
        }
        return null;
    }

    /* renamed from: w */
    public static final C21357l.b m39405w(String str, int i11) {
        return Companion.m39417a(str, i11);
    }

    /* renamed from: y */
    private final void m39406y() {
        final C29823gd binding = getBinding();
        ViewGroup.LayoutParams layoutParams = binding.f137900s.getRoot().getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        binding.f137900s.getRoot().setLayoutParams(layoutParams2);
        binding.f137900s.f137398u.mo69681L(getMarqueeModule());
        binding.f137900s.getRoot().setOnClickListener(new View.OnClickListener() { // from class: hf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.m39407z(MusicView.this, view);
            }
        });
        ZRecyclerView zRecyclerView = binding.f137904w;
        AbstractC19074t.m100207e(zRecyclerView, "recyclerViewStoryEffects");
        this.f41372z = zRecyclerView;
        binding.f137904w.setMaxVelocity(100);
        binding.f137904w.setEnableScaleX(true);
        binding.f137904w.setLayoutManager(getLayoutManager());
        binding.f137904w.setAdapter(getAdapterStoryEffects());
        RecyclerView recyclerView = this.f41372z;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView = null;
        }
        recyclerView.m9816A(new C7687g());
        binding.f137904w.m9826E(this.f41359E);
        binding.f137904w.setClipToPadding(false);
        C20027a c20027a = new C20027a();
        this.f41358D = c20027a;
        c20027a.mo10397b(binding.f137904w);
        postDelayed(new Runnable() { // from class: hf.d
            @Override // java.lang.Runnable
            public final void run() {
                MusicView.m39379A(C29823gd.this);
            }
        }, 200L);
        binding.f137905x.setOnClickListener(new View.OnClickListener() { // from class: hf.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.m39380B(MusicView.this, view);
            }
        });
        binding.f137898q.setOnClickListener(new View.OnClickListener() { // from class: hf.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.m39381C(MusicView.this, view);
            }
        });
        binding.f137899r.setOnClickListener(new View.OnClickListener() { // from class: hf.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.m39382D(MusicView.this, view);
            }
        });
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: hf.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.m39383E(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m39407z(MusicView musicView, View view) {
        AbstractC19074t.m100208f(musicView, "this$0");
        InterfaceC7682b interfaceC7682b = musicView.f41369w;
        if (interfaceC7682b != null) {
            interfaceC7682b.mo38333n();
        }
    }

    /* renamed from: G */
    public final void m39408G() {
        this.f41355A = getAdapterStoryEffects().m133547R();
    }

    /* renamed from: K */
    public final void m39409K() {
        Animator animator = this.f41366t;
        if (animator != null && animator.isRunning()) {
            return;
        }
        C29823gd binding = getBinding();
        binding.f137906y.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(binding.f137906y, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new C7691k());
        ofFloat.start();
        this.f41366t = ofFloat;
    }

    /* renamed from: L */
    public final void m39410L(boolean z11) {
        int i11;
        try {
            if (!AbstractC19074t.m100204b(Boolean.valueOf(z11), this.f41365s)) {
                this.f41365s = Boolean.valueOf(z11);
                if (z11) {
                    getAdapterStoryEffects().m133548S(this.f41363q.m101600c());
                } else {
                    List m101600c = this.f41363q.m101600c();
                    AbstractC25378x.m131542D(m101600c, C7692l.f41390q);
                    getAdapterStoryEffects().m133548S(m101600c);
                }
            }
            int m133550V = getAdapterStoryEffects().m133550V();
            C25892l2.c m133546P = getAdapterStoryEffects().m133546P(m133550V);
            if (m133546P != null) {
                i11 = m133546P.m133553a();
            } else {
                i11 = this.f41355A;
            }
            this.f41355A = i11;
            m39385H(m133550V, false);
            InterfaceC7682b interfaceC7682b = this.f41369w;
            if (interfaceC7682b != null) {
                interfaceC7682b.mo38335p(m133546P);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: M */
    public final void m39411M(C20028b c20028b) {
        if (c20028b != null) {
            CaptionRoundedTextView captionRoundedTextView = getBinding().f137905x;
            captionRoundedTextView.setText(c20028b.m103963a());
            Typeface m101602e = this.f41363q.m101602e(c20028b.m103965c(), c20028b.m103964b());
            if (m101602e != null) {
                captionRoundedTextView.setTypeface(m101602e);
            }
            captionRoundedTextView.setDrawStroke(true);
            captionRoundedTextView.setDrawBackground(false);
            captionRoundedTextView.setStrokeColor(1694498815);
            captionRoundedTextView.setTextColor(-1);
        }
    }

    /* renamed from: N */
    public final void m39412N(int i11) {
        int i12 = 0;
        for (Object obj : this.f41360F) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((C20028b) obj).m103965c() == i11) {
                this.f41361G = i12;
            }
            i12 = i13;
        }
        m39411M(getSelectedFont());
    }

    public final View getBottomPanel() {
        LinearLayout linearLayout = getBinding().f137901t;
        AbstractC19074t.m100207e(linearLayout, "musicBottomPanel");
        return linearLayout;
    }

    public final Animator getFadeInAlertAnim() {
        return this.f41366t;
    }

    public final Animator getFadeOutAlertAnim() {
        return this.f41367u;
    }

    public final View getMusicOnBoardingTarget() {
        View view = getBinding().f137902u;
        AbstractC19074t.m100207e(view, "musicOnboardingTarget");
        return view;
    }

    public final InterfaceC7682b getMusicViewListener() {
        return this.f41369w;
    }

    public final SongData getSongData() {
        return this.f41364r;
    }

    public final StoryMusicAttachment getStoryMusicAttachmentInfo() {
        String str;
        int i11;
        SongData songData = this.f41364r;
        if (songData == null || (str = songData.m45160e()) == null) {
            str = "";
        }
        String str2 = str;
        int i12 = this.f41355A;
        C20028b selectedFont = getSelectedFont();
        if (selectedFont != null) {
            i11 = selectedFont.m103965c();
        } else {
            i11 = -1;
        }
        return new StoryMusicAttachment(str2, i12, i11, 0.0d, 0.0d, 0.0d, 0.0d, 120, null);
    }

    public final View getTopPanel() {
        FrameLayout frameLayout = getBinding().f137903v;
        AbstractC19074t.m100207e(frameLayout, "musicTopPanel");
        return frameLayout;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m39406y();
    }

    /* renamed from: s */
    public final void m39413s(SongData songData) {
        C29823gd binding = getBinding();
        if (songData != null) {
            if (songData.m45165j()) {
                AbstractC23136l9.m118744r1(binding.f137900s.f137396s, 0);
                AbstractC23136l9.m118744r1(binding.f137900s.f137395r, 8);
            } else {
                AbstractC23136l9.m118744r1(binding.f137900s.f137396s, 8);
                AbstractC23136l9.m118744r1(binding.f137900s.f137395r, 0);
            }
        }
    }

    public final void setEditingSong(SongData songData) {
        this.f41364r = songData;
        C29823gd binding = getBinding();
        if (songData != null) {
            if (songData.m45165j()) {
                AbstractC23136l9.m118744r1(binding.f137900s.f137396s, 0);
                AbstractC23136l9.m118744r1(binding.f137900s.f137395r, 8);
            } else {
                AbstractC23136l9.m118744r1(binding.f137900s.f137396s, 8);
                ((C23528a) getAQuery().m123612r(binding.f137900s.f137395r)).m123618x(songData.m45163h(), C23278z2.m120143n());
                binding.f137900s.f137395r.setBackgroundResource(AbstractC16803z.bg_song_thumb_story_music);
                AbstractC23136l9.m118744r1(binding.f137900s.f137395r, 0);
            }
            getMarqueeModule().m111959G1(songData.m45164i());
            return;
        }
        AbstractC23136l9.m118744r1(binding.f137900s.f137396s, 8);
        binding.f137900s.f137395r.setImageResource(AbstractC16803z.ic_post_story_music);
        binding.f137900s.f137395r.setBackground(null);
    }

    public final void setFadeInAlertAnim(Animator animator) {
        this.f41366t = animator;
    }

    public final void setFadeOutAlertAnim(Animator animator) {
        this.f41367u = animator;
    }

    public final void setMusicViewListener(InterfaceC7682b interfaceC7682b) {
        this.f41369w = interfaceC7682b;
    }

    public final void setSelectedVisual(int i11) {
        this.f41355A = i11;
        getAdapterStoryEffects().m133549T(this.f41355A);
    }

    public final void setSongData(SongData songData) {
        this.f41364r = songData;
    }

    /* renamed from: u */
    public final void m39414u() {
        this.f41362p.removeMessages(1000);
        this.f41362p.sendEmptyMessage(1000);
    }

    /* renamed from: v */
    public final void m39415v() {
        m39385H(getAdapterStoryEffects().m133550V(), false);
    }

    /* renamed from: x */
    public final void m39416x() {
        this.f41360F = this.f41363q.m101599b();
        m39411M(getSelectedFont());
    }
}
