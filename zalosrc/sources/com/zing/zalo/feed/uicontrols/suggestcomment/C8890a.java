package com.zing.zalo.feed.uicontrols.suggestcomment;

import ag0.C0815e1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2259a;
import bo.C2971f1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.FeedItemCommentInputBarModulesView;
import com.zing.zalo.feed.uicontrols.suggestcomment.C8890a;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.stickers.FeedStickerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20814p0;
import is.C20820s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p361nb.C23648e;
import p471r3.C25630b;
import p583vq.C28570b;
import p588vw.C28644j;
import p588vw.C28652r;
import pm0.C24848g0;
import qm0.AbstractC25378x;
import th.AbstractC26683d;
import vg.AbstractC28245z3;

/* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a */
/* loaded from: classes4.dex */
public final class C8890a extends RecyclerView.AbstractC1880g {
    public static final b Companion = new b(null);

    /* renamed from: A */
    private InterfaceC2259a f47568A;

    /* renamed from: r */
    private final Context f47569r;

    /* renamed from: s */
    private f f47570s;

    /* renamed from: t */
    private C23528a f47571t;

    /* renamed from: u */
    private List f47572u;

    /* renamed from: v */
    private String f47573v;

    /* renamed from: w */
    private C3020p0 f47574w;

    /* renamed from: x */
    private C3000l0 f47575x;

    /* renamed from: y */
    private boolean f47576y;

    /* renamed from: z */
    private boolean f47577z;

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$a */
    /* loaded from: classes4.dex */
    public final class a extends g {

        /* renamed from: K */
        private final View f47578K;

        /* renamed from: L */
        private final StickerView f47579L;

        /* renamed from: M */
        final /* synthetic */ C8890a f47580M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8890a c8890a, View view) {
            super(c8890a, view);
            AbstractC19074t.m100208f(view, "view");
            this.f47580M = c8890a;
            this.f47578K = view;
            this.f47579L = (StickerView) view.findViewById(AbstractC6918a0.bt_close);
        }

        /* renamed from: k0 */
        public static final void m47474k0(C8890a c8890a, View view) {
            AbstractC19074t.m100208f(c8890a, "this$0");
            f m47462W = c8890a.m47462W();
            if (m47462W != null) {
                m47462W.mo46559c();
            }
            c8890a.m47456Z();
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.g
        /* renamed from: i0 */
        public void mo47475i0(C2988i3 c2988i3, int i11) {
            AbstractC19074t.m100208f(c2988i3, "suggestCommentData");
            this.f47579L.setOnClickListener(new View.OnClickListener() { // from class: hs.a
                public /* synthetic */ ViewOnClickListenerC20116a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8890a.a.m47474k0(C8890a.this, view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$c */
    /* loaded from: classes4.dex */
    public final class c extends g {

        /* renamed from: K */
        private final View f47581K;

        /* renamed from: L */
        private final RelativeLayout f47582L;

        /* renamed from: M */
        private RobotoTextView f47583M;

        /* renamed from: N */
        private boolean f47584N;

        /* renamed from: O */
        final /* synthetic */ C8890a f47585O;

        /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: r */
            final /* synthetic */ int f47587r;

            /* renamed from: s */
            final /* synthetic */ C8890a f47588s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, C8890a c8890a) {
                super(0);
                this.f47587r = i11;
                this.f47588s = c8890a;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m47481a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m47481a() {
                f m47462W;
                c.this.f47584N = false;
                int i11 = this.f47587r;
                if (i11 >= 0 && i11 < this.f47588s.f47572u.size() && (m47462W = this.f47588s.m47462W()) != null) {
                    m47462W.mo46560d((C2988i3) this.f47588s.f47572u.get(this.f47587r), this.f47588s.m47463X(), this.f47587r);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8890a c8890a, View view) {
            super(c8890a, view);
            AbstractC19074t.m100208f(view, "view");
            this.f47585O = c8890a;
            this.f47581K = view;
            this.f47582L = (RelativeLayout) view.findViewById(AbstractC6918a0.suggestTextContainer);
            this.f47583M = (RobotoTextView) view.findViewById(AbstractC6918a0.suggest_text);
        }

        /* renamed from: l0 */
        public static final void m47478l0(c cVar, int i11, View view) {
            AbstractC19074t.m100208f(cVar, "this$0");
            cVar.m47479m0(i11);
        }

        /* renamed from: m0 */
        private final void m47479m0(int i11) {
            if (!this.f47584N && this.f47582L != null) {
                this.f47584N = true;
                a aVar = new a(i11, this.f47585O);
                C8890a c8890a = this.f47585O;
                RelativeLayout relativeLayout = this.f47582L;
                AbstractC19074t.m100207e(relativeLayout, "suggestTextContainer");
                c8890a.m47457d0(relativeLayout, aVar);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.g
        /* renamed from: i0 */
        public void mo47475i0(C2988i3 c2988i3, int i11) {
            AbstractC19074t.m100208f(c2988i3, "suggestCommentData");
            CharSequence m143353D = C28652r.m143349v().m143353D(c2988i3.m14162a());
            if (!TextUtils.isEmpty(m143353D)) {
                this.f47583M.setText(m143353D);
                AbstractC20814p0.m108676w(m143353D, this.f47583M);
            } else {
                this.f47583M.setText("");
            }
            this.f47582L.setOnClickListener(new View.OnClickListener() { // from class: hs.b

                /* renamed from: q */
                public final /* synthetic */ int f99213q;

                public /* synthetic */ ViewOnClickListenerC20117b(int i112) {
                    r2 = i112;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8890a.c.m47478l0(C8890a.c.this, r2, view);
                }
            });
        }

        /* renamed from: n0 */
        public final void m47480n0() {
            if (AbstractC26683d.f126393l) {
                AbstractC28245z3.m142218a(this.f47583M.getText(), this.f47583M);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$d */
    /* loaded from: classes4.dex */
    public final class d extends g {

        /* renamed from: K */
        private final FeedItemCommentInputBarModulesView f47589K;

        /* renamed from: L */
        private FeedItemCommentInputBarModulesView f47590L;

        /* renamed from: M */
        final /* synthetic */ C8890a f47591M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C8890a c8890a, FeedItemCommentInputBarModulesView feedItemCommentInputBarModulesView) {
            super(c8890a, feedItemCommentInputBarModulesView);
            AbstractC19074t.m100208f(feedItemCommentInputBarModulesView, "view");
            this.f47591M = c8890a;
            this.f47589K = feedItemCommentInputBarModulesView;
            this.f47590L = feedItemCommentInputBarModulesView;
        }

        /* renamed from: k0 */
        public static final void m47483k0(C8890a c8890a, View view, Bundle bundle) {
            AbstractC19074t.m100208f(c8890a, "this$0");
            if (C28570b.m142996a().m142998b(2) && bundle != null) {
                InterfaceC2259a m47461V = c8890a.m47461V();
                if (m47461V != null) {
                    m47461V.mo11919Eu(c8890a.f47574w, c8890a.f47575x, "", bundle);
                    return;
                }
                return;
            }
            InterfaceC2259a m47461V2 = c8890a.m47461V();
            if (m47461V2 != null) {
                m47461V2.mo11960kf(view, c8890a.f47575x, 0, true, bundle);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.g
        /* renamed from: i0 */
        public void mo47475i0(C2988i3 c2988i3, int i11) {
            int i12;
            AbstractC19074t.m100208f(c2988i3, "suggestCommentData");
            boolean z11 = true;
            if (this.f47591M.mo10003k() != 1) {
                z11 = false;
            }
            ViewGroup.LayoutParams layoutParams = this.f47590L.getLayoutParams();
            if (!z11) {
                i12 = (int) (AbstractC23136l9.m118731n0(this.f47591M.m47460U()) * 0.55d);
            } else {
                i12 = -1;
            }
            layoutParams.width = i12;
            this.f47590L.setOnCommentInputBarClickListener(new FeedItemCommentInputBarModulesView.InterfaceC8087a() { // from class: hs.c
                public /* synthetic */ C20118c() {
                }

                @Override // com.zing.zalo.feed.components.FeedItemCommentInputBarModulesView.InterfaceC8087a
                /* renamed from: a */
                public final void mo43730a(View view, Bundle bundle) {
                    C8890a.d.m47483k0(C8890a.this, view, bundle);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$e */
    /* loaded from: classes4.dex */
    public final class e extends g {

        /* renamed from: K */
        private final View f47592K;

        /* renamed from: L */
        private final RelativeLayout f47593L;

        /* renamed from: M */
        private FeedStickerView f47594M;

        /* renamed from: N */
        private boolean f47595N;

        /* renamed from: O */
        final /* synthetic */ C8890a f47596O;

        /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: r */
            final /* synthetic */ int f47598r;

            /* renamed from: s */
            final /* synthetic */ C8890a f47599s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, C8890a c8890a) {
                super(0);
                this.f47598r = i11;
                this.f47599s = c8890a;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m47489a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m47489a() {
                f m47462W;
                e.this.f47595N = false;
                int i11 = this.f47598r;
                if (i11 >= 0 && i11 < this.f47599s.f47572u.size() && (m47462W = this.f47599s.m47462W()) != null) {
                    m47462W.mo46560d((C2988i3) this.f47599s.f47572u.get(this.f47598r), this.f47599s.m47463X(), this.f47598r);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8890a c8890a, View view) {
            super(c8890a, view);
            AbstractC19074t.m100208f(view, "view");
            this.f47596O = c8890a;
            this.f47592K = view;
            this.f47593L = (RelativeLayout) view.findViewById(AbstractC6918a0.sticker_container);
            this.f47594M = (FeedStickerView) view.findViewById(AbstractC6918a0.feed_sticker);
            int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.feed_comment_input_box_height);
            this.f47594M.m56564m(m118736p, m118736p);
        }

        /* renamed from: l0 */
        public static final void m47486l0(e eVar, int i11, View view) {
            AbstractC19074t.m100208f(eVar, "this$0");
            eVar.m47487m0(i11);
        }

        /* renamed from: m0 */
        private final void m47487m0(int i11) {
            if (!this.f47595N && this.f47593L != null) {
                this.f47595N = true;
                a aVar = new a(i11, this.f47596O);
                C8890a c8890a = this.f47596O;
                RelativeLayout relativeLayout = this.f47593L;
                AbstractC19074t.m100207e(relativeLayout, "stickerContainer");
                c8890a.m47457d0(relativeLayout, aVar);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.g
        /* renamed from: i0 */
        public void mo47475i0(C2988i3 c2988i3, int i11) {
            AbstractC19074t.m100208f(c2988i3, "suggestCommentData");
            C25630b m14163b = c2988i3.m14163b();
            if (m14163b != null) {
                C8890a c8890a = this.f47596O;
                C2971f1 c2971f1 = new C2971f1(null, null, false, null, null, 31, null);
                c2971f1.m14060g("suggest_comment_");
                c2971f1.m14061h(c8890a.f47573v + i11);
                c2971f1.m14059f(C28644j.m143233Y().m143282P0(m14163b));
                FeedStickerView feedStickerView = this.f47594M;
                AbstractC19074t.m100207e(feedStickerView, "feedStickerView");
                C20820s0.m108740n(feedStickerView, c2971f1, c8890a.f47571t);
            }
            this.f47593L.setOnClickListener(new View.OnClickListener() { // from class: hs.d

                /* renamed from: q */
                public final /* synthetic */ int f99216q;

                public /* synthetic */ ViewOnClickListenerC20119d(int i112) {
                    r2 = i112;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8890a.e.m47486l0(C8890a.e.this, r2, view);
                }
            });
        }

        /* renamed from: n0 */
        public final void m47488n0() {
            FeedStickerView feedStickerView = this.f47594M;
            if (feedStickerView != null) {
                feedStickerView.m56563l();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$f */
    /* loaded from: classes4.dex */
    public interface f {
        /* renamed from: c */
        void mo46559c();

        /* renamed from: d */
        void mo46560d(C2988i3 c2988i3, int i11, int i12);
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$g */
    /* loaded from: classes4.dex */
    public abstract class g extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f47600I;

        /* renamed from: J */
        final /* synthetic */ C8890a f47601J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C8890a c8890a, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f47601J = c8890a;
            this.f47600I = view;
        }

        /* renamed from: i0 */
        public abstract void mo47475i0(C2988i3 c2988i3, int i11);
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$h */
    /* loaded from: classes4.dex */
    public final class h extends g {

        /* renamed from: K */
        private final View f47602K;

        /* renamed from: L */
        final /* synthetic */ C8890a f47603L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C8890a c8890a, View view) {
            super(c8890a, view);
            AbstractC19074t.m100208f(view, "view");
            this.f47603L = c8890a;
            this.f47602K = view;
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.g
        /* renamed from: i0 */
        public void mo47475i0(C2988i3 c2988i3, int i11) {
            AbstractC19074t.m100208f(c2988i3, "suggestCommentData");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final i f47604q = new i();

        i() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C2988i3 c2988i3) {
            AbstractC19074t.m100208f(c2988i3, "it");
            return Boolean.valueOf(c2988i3.m14165d());
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.a$j */
    /* loaded from: classes4.dex */
    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f47605p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f47606q;

        j(View view, InterfaceC18494a interfaceC18494a) {
            this.f47605p = view;
            this.f47606q = interfaceC18494a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            this.f47605p.setScaleX(1.0f);
            this.f47605p.setScaleY(1.0f);
            this.f47606q.mo12V4();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            this.f47605p.setScaleX(1.0f);
            this.f47605p.setScaleY(1.0f);
            this.f47606q.mo12V4();
        }
    }

    public C8890a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f47569r = context;
        this.f47571t = new C23528a(context);
        this.f47572u = new ArrayList();
        this.f47573v = "";
    }

    /* renamed from: Z */
    public final void m47456Z() {
        C0815e1.m2075D().m2100V(new C23648e(14, "", 0, "close_list_suggest_comment", new String[0]), false);
    }

    /* renamed from: d0 */
    public final void m47457d0(View view, InterfaceC18494a interfaceC18494a) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.9f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.9f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 0.9f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.9f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new j(view, interfaceC18494a));
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    /* renamed from: S */
    public final boolean m47458S() {
        boolean m131542D;
        m131542D = AbstractC25378x.m131542D(this.f47572u, i.f47604q);
        return m131542D;
    }

    /* renamed from: T */
    public final int m47459T() {
        if (this.f47572u.size() <= 0) {
            return 0;
        }
        return ((C2988i3) this.f47572u.get(0)).m14164c();
    }

    /* renamed from: U */
    public final Context m47460U() {
        return this.f47569r;
    }

    /* renamed from: V */
    public final InterfaceC2259a m47461V() {
        return this.f47568A;
    }

    /* renamed from: W */
    public final f m47462W() {
        return this.f47570s;
    }

    /* renamed from: X */
    public final int m47463X() {
        if (this.f47576y) {
            return this.f47572u.size() - 1;
        }
        return this.f47572u.size();
    }

    /* renamed from: Y */
    public final boolean m47464Y() {
        Object obj;
        Iterator it = this.f47572u.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C2988i3) obj).m14166e()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: a0 */
    public void mo9990A(g gVar, int i11) {
        AbstractC19074t.m100208f(gVar, "holder");
        gVar.mo47475i0((C2988i3) this.f47572u.get(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0 */
    public g mo9992C(ViewGroup viewGroup, int i11) {
        g aVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return new h(this, new View(this.f47569r));
                    }
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.feed_item_footer_comment_input, viewGroup, false);
                    AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type com.zing.zalo.feed.components.FeedItemCommentInputBarModulesView");
                    FeedItemCommentInputBarModulesView feedItemCommentInputBarModulesView = (FeedItemCommentInputBarModulesView) inflate;
                    feedItemCommentInputBarModulesView.m43729W(feedItemCommentInputBarModulesView.getContext());
                    aVar = new d(this, feedItemCommentInputBarModulesView);
                } else {
                    aVar = new e(this, LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.feed_comment_suggest_sticker, viewGroup, false));
                }
            } else {
                aVar = new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.feed_emoji_suggestion_item, viewGroup, false));
            }
        } else {
            aVar = new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.feed_suggest_comment_close_button, viewGroup, false));
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: c0 */
    public void mo9996G(g gVar) {
        AbstractC19074t.m100208f(gVar, "holder");
        super.mo9996G(gVar);
        if (gVar instanceof e) {
            ((e) gVar).m47488n0();
        } else if (gVar instanceof c) {
            ((c) gVar).m47480n0();
        }
    }

    /* renamed from: e0 */
    public final void m47468e0(List list, String str, boolean z11) {
        AbstractC19074t.m100208f(list, "suggestCommentList");
        AbstractC19074t.m100208f(str, "feedId");
        this.f47576y = z11;
        if (z11) {
            list.add(new C2988i3(-1));
        }
        this.f47572u = list;
        this.f47573v = str;
    }

    /* renamed from: f0 */
    public final void m47469f0(List list, String str, boolean z11, C3020p0 c3020p0, C3000l0 c3000l0, boolean z12) {
        AbstractC19074t.m100208f(list, "suggestCommentList");
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        m47468e0(list, str, z11);
        this.f47574w = c3020p0;
        this.f47575x = c3000l0;
        if (z12) {
            list.add(0, new C2988i3(3));
        }
    }

    /* renamed from: g0 */
    public final void m47470g0(InterfaceC2259a interfaceC2259a) {
        this.f47568A = interfaceC2259a;
    }

    /* renamed from: h0 */
    public final void m47471h0(f fVar) {
        this.f47570s = fVar;
    }

    /* renamed from: i0 */
    public final void m47472i0(boolean z11) {
        this.f47577z = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f47572u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C2988i3) this.f47572u.get(i11)).m14164c();
    }
}
