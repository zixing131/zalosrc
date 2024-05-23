package com.zing.zalo.feed.mvp.storyarchive;

import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.C3054x;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView;
import com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard;
import com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveOnboardingBottomSheetView;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.DimHightLightView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.uicontrol.ScrollControlGridLayoutManager;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import er.C18577a;
import er.C18578b;
import er.C18587k;
import er.C18588l;
import er.C18589m;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import fr.C19134g;
import gg0.AbstractC19444a;
import gr.C19589a;
import ho0.AbstractC20110a;
import i40.AbstractC20279i;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23212s8;
import o70.C24099q0;
import p205hc.C19965d;
import p542ub.InterfaceC27218a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p649xl.C29939n3;
import p649xl.C30156zc;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class StoryArchiveView extends SlidableZaloView {
    public static final C8739a Companion = new C8739a(null);

    /* renamed from: d1 */
    private static final int f46981d1 = AbstractC23136l9.m118655I(AbstractC16802y.story_archive_card_spacing);

    /* renamed from: e1 */
    private static boolean f46982e1;

    /* renamed from: P0 */
    private final InterfaceC24854k f46983P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18587k.class), new C8750l(new C8749k(this)), new C8762x());

    /* renamed from: Q0 */
    private C30156zc f46984Q0;

    /* renamed from: R0 */
    private C29939n3 f46985R0;

    /* renamed from: S0 */
    private SwipeRefreshListView f46986S0;

    /* renamed from: T0 */
    private RecyclerView f46987T0;

    /* renamed from: U0 */
    private RecyclerView.AbstractC1887n f46988U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f46989V0;

    /* renamed from: W0 */
    private final InterfaceC29232g f46990W0;

    /* renamed from: X0 */
    private boolean f46991X0;

    /* renamed from: Y0 */
    private boolean f46992Y0;

    /* renamed from: Z0 */
    private DimHightLightView f46993Z0;

    /* renamed from: a1 */
    private boolean f46994a1;

    /* renamed from: b1 */
    private int f46995b1;

    /* renamed from: c1 */
    private final HandlerC8742d f46996c1;

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$a */
    /* loaded from: classes4.dex */
    public static final class C8739a {
        private C8739a() {
        }

        public /* synthetic */ C8739a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m46884a() {
            return StoryArchiveView.f46981d1;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$b */
    /* loaded from: classes4.dex */
    static final class C8740b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8740b f46997q = new C8740b();

        C8740b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19134g mo12V4() {
            return new C19134g();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$c */
    /* loaded from: classes4.dex */
    public static final class C8741c extends AnimatorListenerAdapter {
        C8741c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            StoryArchiveView.this.f46992Y0 = true;
            StoryArchiveView.this.m46881VM();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$d */
    /* loaded from: classes4.dex */
    public static final class HandlerC8742d extends Handler {
        HandlerC8742d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 3000) {
                StoryArchiveView.this.m46840IM();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$e */
    /* loaded from: classes4.dex */
    public static final class C8743e extends AbstractC11859g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8743e(RecyclerView recyclerView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            super(recyclerView, (StateListDrawable) drawable, drawable2, (StateListDrawable) drawable3, drawable4);
            AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            AbstractC19074t.m100206d(drawable3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
            StoryArchiveView.this.m46844MM().m10008p();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$f */
    /* loaded from: classes4.dex */
    public static final class C8744f implements C19134g.b {
        C8744f() {
        }

        @Override // fr.C19134g.b
        /* renamed from: a */
        public void mo46886a(boolean z11) {
            if (z11) {
                StoryArchiveView.this.m46858dN();
            } else {
                StoryArchiveView.this.m46857cN();
            }
        }

        @Override // fr.C19134g.b
        /* renamed from: b */
        public void mo46887b(boolean z11) {
            int i11;
            if (z11) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            StoryArchiveView.this.m46859eN(true, i11);
        }

        @Override // fr.C19134g.b
        /* renamed from: c */
        public void mo46888c(int i11) {
            StoryArchiveView.this.m46849RM().m98123t0(i11);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$g */
    /* loaded from: classes4.dex */
    public static final class C8745g extends RecyclerView.AbstractC1887n {
        C8745g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            if (StoryArchiveView.this.m46844MM().m100415Y(m9817A0)) {
                return;
            }
            int m100413W = StoryArchiveView.this.m46844MM().m100413W();
            if (m9817A0 < m100413W + 3) {
                rect.top = 0;
            } else {
                rect.top = StoryArchiveView.Companion.m46884a();
            }
            int i11 = (m9817A0 - m100413W) % 3;
            if (i11 == 0) {
                rect.left = 0;
                rect.right = StoryArchiveView.Companion.m46884a() / 2;
            } else if (i11 == 2) {
                rect.left = StoryArchiveView.Companion.m46884a() / 2;
                rect.right = 0;
            } else {
                C8739a c8739a = StoryArchiveView.Companion;
                rect.left = c8739a.m46884a() / 2;
                rect.right = c8739a.m46884a() / 2;
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$h */
    /* loaded from: classes4.dex */
    public static final class C8746h extends RecyclerView.AbstractC1892s {
        C8746h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 1) {
                StoryArchiveView.this.m46842KM();
                StoryArchiveView.this.f46991X0 = true;
            }
            if (i11 != 0) {
                SwipeRefreshListView swipeRefreshListView = StoryArchiveView.this.f46986S0;
                if (swipeRefreshListView == null) {
                    AbstractC19074t.m100223u("swipeRefreshView");
                    swipeRefreshListView = null;
                }
                swipeRefreshListView.m88202K();
                StoryArchiveView.this.f46996c1.removeMessages(3000);
                return;
            }
            if (!StoryArchiveView.this.f46996c1.hasMessages(3000) && !StoryArchiveView.this.f46992Y0) {
                StoryArchiveView.this.f46996c1.sendEmptyMessageDelayed(3000, 400L);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                int m9740Y1 = StoryArchiveView.this.m46847PM().m9740Y1();
                int m9745c2 = StoryArchiveView.this.m46847PM().m9745c2();
                int m10127i = StoryArchiveView.this.m46847PM().m10127i();
                if (m9740Y1 <= 5 && StoryArchiveView.this.m46844MM().m100414X() == 0) {
                    StoryArchiveView.this.m46859eN(true, -1);
                } else if (m9745c2 >= m10127i - 5 && StoryArchiveView.this.m46844MM().m100410T() == 0) {
                    StoryArchiveView.this.m46859eN(true, 0);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$i */
    /* loaded from: classes4.dex */
    static final class C8747i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends GridLayoutManager.AbstractC1865b {

            /* renamed from: e */
            final /* synthetic */ StoryArchiveView f47005e;

            a(StoryArchiveView storyArchiveView) {
                this.f47005e = storyArchiveView;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
            /* renamed from: f */
            public int mo9682f(int i11) {
                if (this.f47005e.m46844MM().m100415Y(i11)) {
                    return 3;
                }
                return 1;
            }
        }

        C8747i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScrollControlGridLayoutManager mo12V4() {
            ScrollControlGridLayoutManager scrollControlGridLayoutManager = new ScrollControlGridLayoutManager(StoryArchiveView.this.getContext(), 3, 1, false);
            scrollControlGridLayoutManager.m9671f3(new a(StoryArchiveView.this));
            return scrollControlGridLayoutManager;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$j */
    /* loaded from: classes4.dex */
    public static final class C8748j implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f47006p;

        C8748j(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f47006p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f47006p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f47006p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$k */
    /* loaded from: classes4.dex */
    public static final class C8749k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f47007q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8749k(ZaloView zaloView) {
            super(0);
            this.f47007q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f47007q;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$l */
    /* loaded from: classes4.dex */
    public static final class C8750l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f47008q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8750l(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f47008q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f47008q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$m */
    /* loaded from: classes4.dex */
    public static final class C8751m extends AbstractC19075u implements InterfaceC18505l {
        C8751m() {
            super(1);
        }

        /* renamed from: a */
        public final void m46892a(C18577a c18577a) {
            boolean z11;
            if (c18577a.m98041b() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int m98042c = c18577a.m98042c();
            if (m98042c != 0) {
                if (m98042c != 1) {
                    if (m98042c == 2) {
                        StoryArchiveView.this.m46844MM().m100419g0(false, true, c18577a.m98040a(), z11);
                        return;
                    }
                    return;
                }
                StoryArchiveView.this.m46844MM().m100419g0(true, false, c18577a.m98040a(), z11);
                return;
            }
            StoryArchiveView.this.m46844MM().m100409R(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46892a((C18577a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$n */
    /* loaded from: classes4.dex */
    public static final class C8752n extends AbstractC19075u implements InterfaceC18505l {
        C8752n() {
            super(1);
        }

        /* renamed from: a */
        public final void m46893a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            StoryArchiveView.this.m46852XM();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46893a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$o */
    /* loaded from: classes4.dex */
    public static final class C8753o extends AbstractC19075u implements InterfaceC18505l {
        C8753o() {
            super(1);
        }

        /* renamed from: a */
        public final void m46894a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            StoryArchiveView.this.m46859eN(false, 0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46894a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$p */
    /* loaded from: classes4.dex */
    public static final class C8754p extends AbstractC19075u implements InterfaceC18505l {
        C8754p() {
            super(1);
        }

        /* renamed from: a */
        public final void m46895a(List list) {
            StoryArchiveView storyArchiveView = StoryArchiveView.this;
            AbstractC19074t.m100205c(list);
            storyArchiveView.m46837FM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46895a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$q */
    /* loaded from: classes4.dex */
    public static final class C8755q extends AbstractC19075u implements InterfaceC18505l {
        C8755q() {
            super(1);
        }

        /* renamed from: a */
        public final void m46896a(C3054x c3054x) {
            StoryArchiveView storyArchiveView = StoryArchiveView.this;
            AbstractC19074t.m100205c(c3054x);
            storyArchiveView.m46838GM(c3054x);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46896a((C3054x) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$r */
    /* loaded from: classes4.dex */
    public static final class C8756r extends AbstractC19075u implements InterfaceC18505l {
        C8756r() {
            super(1);
        }

        /* renamed from: a */
        public final void m46897a(boolean z11) {
            StoryArchiveView.this.m46853YM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46897a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$s */
    /* loaded from: classes4.dex */
    public static final class C8757s extends AbstractC19075u implements InterfaceC18505l {
        C8757s() {
            super(1);
        }

        /* renamed from: a */
        public final void m46898a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            SwipeRefreshListView swipeRefreshListView = StoryArchiveView.this.f46986S0;
            if (swipeRefreshListView == null) {
                AbstractC19074t.m100223u("swipeRefreshView");
                swipeRefreshListView = null;
            }
            if (!swipeRefreshListView.m88207P()) {
                StoryArchiveView.this.m46845NM().f140146q.m88209V();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46898a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$t */
    /* loaded from: classes4.dex */
    public static final class C8758t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$t$a */
        /* loaded from: classes4.dex */
        public static final class a extends StoryDetailsView.AbstractC15101b0 {

            /* renamed from: a */
            final /* synthetic */ StoryArchiveView f47017a;

            a(StoryArchiveView storyArchiveView) {
                this.f47017a = storyArchiveView;
            }

            @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
            /* renamed from: a */
            public AbstractC20279i.a mo17180a(C31980jc c31980jc) {
                int m98120o0;
                if (c31980jc != null && (m98120o0 = this.f47017a.m46849RM().m98120o0(c31980jc.m153825r())) != -1) {
                    int m100413W = m98120o0 + this.f47017a.m46844MM().m100413W();
                    RecyclerView recyclerView = this.f47017a.f46987T0;
                    if (recyclerView == null) {
                        AbstractC19074t.m100223u("recyclerView");
                        recyclerView = null;
                    }
                    RecyclerView.AbstractC1876c0 m9900t0 = recyclerView.m9900t0(m100413W);
                    if (m9900t0 instanceof C19134g.f) {
                        return AbstractC20279i.m105893a(((C19134g.f) m9900t0).m100431k0());
                    }
                }
                return super.mo17180a(c31980jc);
            }

            @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
            /* renamed from: e */
            public void mo17197e(C31980jc c31980jc) {
                if (c31980jc != null) {
                    this.f47017a.m46849RM().m98122s0(c31980jc.m153825r());
                }
            }

            @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
            /* renamed from: f */
            public void mo17198f(C31980jc c31980jc, C32123ta c32123ta) {
                this.f47017a.m46849RM().m98122s0(c32123ta);
            }
        }

        C8758t() {
            super(1);
        }

        /* renamed from: a */
        public final void m46899a(C18589m c18589m) {
            StoryArchiveView.this.m46842KM();
            int m98130d = c18589m.m98130d();
            String m98129c = c18589m.m98129c();
            boolean m98127a = c18589m.m98127a();
            boolean m98128b = c18589m.m98128b();
            StoryArchiveView storyArchiveView = StoryArchiveView.this;
            AbstractC22055v0.m115125O(m98130d, m98129c, m98127a, m98128b, storyArchiveView, 1000, new a(storyArchiveView), null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46899a((C18589m) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$u */
    /* loaded from: classes4.dex */
    public static final class C8759u extends AbstractC19075u implements InterfaceC18505l {
        C8759u() {
            super(1);
        }

        /* renamed from: a */
        public final void m46900a(int i11) {
            RecyclerView recyclerView = StoryArchiveView.this.f46987T0;
            if (recyclerView == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView = null;
            }
            recyclerView.mo9854S1(StoryArchiveView.this.m46844MM().m100413W() + i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46900a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$v */
    /* loaded from: classes4.dex */
    public static final class C8760v extends AbstractC19075u implements InterfaceC18505l {
        C8760v() {
            super(1);
        }

        /* renamed from: a */
        public final void m46901a(Integer num) {
            StoryArchiveView storyArchiveView = StoryArchiveView.this;
            int m100413W = storyArchiveView.m46844MM().m100413W();
            AbstractC19074t.m100205c(num);
            storyArchiveView.f46995b1 = m100413W + num.intValue();
            StoryArchiveView.this.m46847PM().m9721B2(StoryArchiveView.this.f46995b1, 0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46901a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$w */
    /* loaded from: classes4.dex */
    public static final class C8761w extends AbstractC19075u implements InterfaceC18505l {
        C8761w() {
            super(1);
        }

        /* renamed from: a */
        public final void m46902a(Long l11) {
            if (!StoryArchiveView.this.f46996c1.hasMessages(3000)) {
                HandlerC8742d handlerC8742d = StoryArchiveView.this.f46996c1;
                AbstractC19074t.m100205c(l11);
                handlerC8742d.sendEmptyMessageDelayed(3000, l11.longValue());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46902a((Long) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView$x */
    /* loaded from: classes4.dex */
    static final class C8762x extends AbstractC19075u implements InterfaceC18494a {
        C8762x() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return StoryArchiveView.this.m46850SM();
        }
    }

    public StoryArchiveView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C8740b.f46997q);
        this.f46989V0 = m129210a;
        this.f46990W0 = AbstractC29233h.m145990a(new C8747i());
        this.f46995b1 = -1;
        this.f46996c1 = new HandlerC8742d(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m46837FM(List list) {
        m46853YM(false);
        SwipeRefreshListView swipeRefreshListView = this.f46986S0;
        SwipeRefreshListView swipeRefreshListView2 = null;
        if (swipeRefreshListView == null) {
            AbstractC19074t.m100223u("swipeRefreshView");
            swipeRefreshListView = null;
        }
        swipeRefreshListView.m88202K();
        SwipeRefreshListView swipeRefreshListView3 = this.f46986S0;
        if (swipeRefreshListView3 == null) {
            AbstractC19074t.m100223u("swipeRefreshView");
            swipeRefreshListView3 = null;
        }
        if (swipeRefreshListView3.getVisibility() != 0) {
            SwipeRefreshListView swipeRefreshListView4 = this.f46986S0;
            if (swipeRefreshListView4 == null) {
                AbstractC19074t.m100223u("swipeRefreshView");
            } else {
                swipeRefreshListView2 = swipeRefreshListView4;
            }
            swipeRefreshListView2.setVisibility(0);
        }
        m46844MM().m100416b0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public final void m46838GM(C3054x c3054x) {
        m46853YM(false);
        SwipeRefreshListView swipeRefreshListView = this.f46986S0;
        SwipeRefreshListView swipeRefreshListView2 = null;
        if (swipeRefreshListView == null) {
            AbstractC19074t.m100223u("swipeRefreshView");
            swipeRefreshListView = null;
        }
        if (swipeRefreshListView.getVisibility() != 0) {
            SwipeRefreshListView swipeRefreshListView3 = this.f46986S0;
            if (swipeRefreshListView3 == null) {
                AbstractC19074t.m100223u("swipeRefreshView");
            } else {
                swipeRefreshListView2 = swipeRefreshListView3;
            }
            swipeRefreshListView2.setVisibility(0);
        }
        m46844MM().m100418e0(c3054x);
    }

    /* renamed from: HM */
    private final void m46839HM() {
        m46849RM().m98106T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final void m46840IM() {
        try {
            if (this.f46995b1 != -1) {
                View mo9732P = m46847PM().mo9732P(this.f46995b1);
                if (mo9732P instanceof StoryArchiveCard) {
                    ((StoryArchiveCard) mo9732P).m46915a0(new C8741c());
                    int[] iArr = new int[2];
                    ((StoryArchiveCard) mo9732P).getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    m46882WM(new Rect(i11, i12, ((StoryArchiveCard) mo9732P).getMeasuredWidth() + i11, ((StoryArchiveCard) mo9732P).getMeasuredHeight() + i12));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: JM */
    private final boolean m46841JM(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (abstractC1876c0 instanceof C19134g.f) {
            View view = ((C19134g.f) abstractC1876c0).f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            int measuredHeight = view.getMeasuredHeight();
            int m118713h0 = AbstractC23136l9.m118713h0();
            view.getLocationOnScreen(new int[2]);
            if (m118713h0 - r2[1] >= measuredHeight * 0.8f) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final void m46842KM() {
        try {
            int m9740Y1 = m46847PM().m9740Y1();
            int m9745c2 = m46847PM().m9745c2();
            if (m9740Y1 > m9745c2) {
                return;
            }
            while (true) {
                RecyclerView recyclerView = this.f46987T0;
                if (recyclerView == null) {
                    AbstractC19074t.m100223u("recyclerView");
                    recyclerView = null;
                }
                RecyclerView.AbstractC1876c0 m9900t0 = recyclerView.m9900t0(m9740Y1);
                if (m9900t0 instanceof C19134g.f) {
                    ((C19134g.f) m9900t0).m100430j0();
                }
                if (m9740Y1 != m9745c2) {
                    m9740Y1++;
                } else {
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: LM */
    private final void m46843LM() {
        int m116580c;
        int m9745c2 = m46847PM().m9745c2();
        RecyclerView recyclerView = this.f46987T0;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView = null;
        }
        RecyclerView.AbstractC1876c0 m9900t0 = recyclerView.m9900t0(m9745c2);
        while (!m46841JM(m9900t0) && m9745c2 > 0) {
            m9745c2--;
            RecyclerView recyclerView2 = this.f46987T0;
            if (recyclerView2 == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView2 = null;
            }
            m9900t0 = recyclerView2.m9900t0(m9745c2);
        }
        C18587k m46849RM = m46849RM();
        m116580c = AbstractC22543l.m116580c(m9745c2 - m46844MM().m100413W(), 0);
        m46849RM.m98105O0(m116580c, this.f46991X0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final C19134g m46844MM() {
        return (C19134g) this.f46989V0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public final C30156zc m46845NM() {
        C30156zc c30156zc = this.f46984Q0;
        AbstractC19074t.m100205c(c30156zc);
        return c30156zc;
    }

    /* renamed from: OM */
    private final C29939n3 m46846OM() {
        C29939n3 c29939n3 = this.f46985R0;
        AbstractC19074t.m100205c(c29939n3);
        return c29939n3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public final ScrollControlGridLayoutManager m46847PM() {
        return (ScrollControlGridLayoutManager) this.f46990W0.getValue();
    }

    /* renamed from: QM */
    private final List m46848QM() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19589a(1, null, false, null, null, 0, 0, null, false, 510, null));
        arrayList.add(new C19589a(6, null, false, null, null, 0, 0, null, false, 510, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public final C18587k m46849RM() {
        return (C18587k) this.f46983P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final C18588l m46850SM() {
        return new C18588l(C18578b.f93336a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m46851UM(StoryArchiveView storyArchiveView) {
        AbstractC19074t.m100208f(storyArchiveView, "this$0");
        storyArchiveView.m46859eN(false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public final void m46852XM() {
        if (this.f72421L0.m92676n2() == null) {
            return;
        }
        AbstractC0924m0.m3670ao(false);
        Bundle bundle = new Bundle();
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        AbstractC19074t.m100205c(m92676n2);
        m92676n2.mo35579p().m93066i2(StoryArchiveOnboardingBottomSheetView.class, bundle, 1019, 1, true);
        f46982e1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public final void m46853YM(final boolean z11) {
        long j11;
        if (!z11) {
            j11 = 1000;
        } else {
            j11 = 0;
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: er.f
            @Override // java.lang.Runnable
            public final void run() {
                StoryArchiveView.m46854ZM(StoryArchiveView.this, z11);
            }
        }, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m46854ZM(StoryArchiveView storyArchiveView, boolean z11) {
        AbstractC19074t.m100208f(storyArchiveView, "this$0");
        SwipeRefreshListView swipeRefreshListView = storyArchiveView.f46986S0;
        if (swipeRefreshListView == null) {
            AbstractC19074t.m100223u("swipeRefreshView");
            swipeRefreshListView = null;
        }
        swipeRefreshListView.setRefreshing(z11);
    }

    /* renamed from: aN */
    private final void m46855aN(boolean z11, Rect rect) {
        ViewParent viewParent;
        try {
            if (z11 == this.f46994a1) {
                return;
            }
            this.f46994a1 = z11;
            if (z11) {
                if (this.f46993Z0 == null) {
                    DimHightLightView dimHightLightView = new DimHightLightView(getContext());
                    this.f46993Z0 = dimHightLightView;
                    dimHightLightView.setElevation(m92651WI().getDimension(AbstractC17454d.width_shadow_action_bar));
                }
                DimHightLightView dimHightLightView2 = this.f46993Z0;
                if (dimHightLightView2 != null) {
                    viewParent = dimHightLightView2.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent == null) {
                    m46845NM().getRoot().addView(this.f46993Z0, new ViewGroup.LayoutParams(-1, -1));
                }
                DimHightLightView dimHightLightView3 = this.f46993Z0;
                if (dimHightLightView3 != null) {
                    dimHightLightView3.setVisibility(0);
                }
                DimHightLightView dimHightLightView4 = this.f46993Z0;
                if (dimHightLightView4 != null) {
                    dimHightLightView4.m75683h(rect);
                }
                DimHightLightView dimHightLightView5 = this.f46993Z0;
                if (dimHightLightView5 != null) {
                    dimHightLightView5.setAlpha(0.0f);
                }
                DimHightLightView dimHightLightView6 = this.f46993Z0;
                if (dimHightLightView6 != null) {
                    dimHightLightView6.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                return;
            }
            DimHightLightView dimHightLightView7 = this.f46993Z0;
            if (dimHightLightView7 != null) {
                dimHightLightView7.m75681c();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: bN */
    private final void m46856bN() {
        m46849RM().m98121p0().m9219j(this, new C19965d(new C8753o()));
        m46849RM().m98119n0().m9219j(this, new C8748j(new C8754p()));
        m46849RM().m98110b0().m9219j(this, new C8748j(new C8755q()));
        m46849RM().m98117l0().m9219j(this, new C19965d(new C8756r()));
        m46849RM().m98118m0().m9219j(this, new C19965d(new C8757s()));
        m46849RM().m98114h0().m9219j(this, new C8748j(new C8758t()));
        m46849RM().m98112f0().m9219j(this, new C19965d(new C8759u()));
        m46849RM().m98116j0().m9219j(this, new C8748j(new C8760v()));
        m46849RM().m98115i0().m9219j(this, new C8748j(new C8761w()));
        m46849RM().m98111c0().m9219j(this, new C8748j(new C8751m()));
        m46849RM().m98113g0().m9219j(this, new C19965d(new C8752n()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public final void m46857cN() {
        AbstractC22055v0.m115134X(this, null, new SensitiveData("profile_story_archived_post_story", "social_story", null, 4, null), new TrackingSource(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final void m46858dN() {
        m46849RM().m98124w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public final void m46859eN(boolean z11, int i11) {
        m46849RM().m98125y0(z11, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m46849RM().m98098B0(C8763a.Companion.m46907a(m92642L3()));
        m46849RM().m98108X();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f46984Q0 = C30156zc.m148788c(layoutInflater, viewGroup, false);
        this.f46985R0 = C29939n3.m148269a(m46845NM().getRoot());
        m46880TM();
        m46883i2();
        CustomRelativeLayout root = m46845NM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f46984Q0 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        boolean z11 = f46982e1;
        if (z11) {
            bundle.putBoolean("SAVE_STORY_ARCHIVE_ONBOARDING_STATE", z11);
        }
    }

    /* renamed from: TM */
    public final void m46880TM() {
        C30156zc m46845NM = m46845NM();
        m46844MM().m100417d0(new C8744f());
        SwipeRefreshListView swipeRefreshListView = m46845NM.f140146q;
        AbstractC19074t.m100207e(swipeRefreshListView, "swipeRefreshLayout");
        this.f46986S0 = swipeRefreshListView;
        m46845NM.f140146q.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: er.g
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                StoryArchiveView.m46851UM(StoryArchiveView.this);
            }
        });
        m46845NM.f140146q.setContainerViewSnackBar(m46845NM.getRoot());
        RecyclerView recyclerView = m46845NM.f140146q.f83582p0;
        AbstractC19074t.m100207e(recyclerView, "mRecyclerView");
        this.f46987T0 = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        RecyclerView recyclerView3 = this.f46987T0;
        if (recyclerView3 == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(m46847PM());
        RecyclerView recyclerView4 = this.f46987T0;
        if (recyclerView4 == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setAdapter(m46844MM());
        RecyclerView recyclerView5 = this.f46987T0;
        if (recyclerView5 == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setBackgroundColor(C23212s8.m119606n(AbstractC16781w.StoryPrimaryBackgroundColor));
        RecyclerView recyclerView6 = this.f46987T0;
        if (recyclerView6 == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView6 = null;
        }
        recyclerView6.m9816A(new C8745g());
        RecyclerView recyclerView7 = this.f46987T0;
        if (recyclerView7 == null) {
            AbstractC19074t.m100223u("recyclerView");
        } else {
            recyclerView2 = recyclerView7;
        }
        recyclerView2.m9826E(new C8746h());
    }

    /* renamed from: VM */
    public void m46881VM() {
        m46855aN(false, null);
    }

    /* renamed from: WM */
    public void m46882WM(Rect rect) {
        m46855aN(true, rect);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        m46843LM();
        m46849RM().m98103J0();
        m46849RM().m98107W();
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StoryArchiveView";
    }

    /* renamed from: i2 */
    public final void m46883i2() {
        RecyclerView recyclerView = this.f46987T0;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView = null;
        }
        C8743e c8743e = new C8743e(recyclerView, AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent));
        c8743e.m65929g0(m46846OM().f138754q);
        c8743e.m114844Y(3);
        this.f46988U0 = c8743e;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i11, i12, intent);
        int i13 = 0;
        if (i11 != 1000) {
            if (i11 != 1019) {
                if (i11 == 11116 && i12 == -1) {
                    if (AbstractC0924m0.m3216L5() != 2) {
                        AbstractC0924m0.m3850go(1);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
                    bundle2.putInt("TAB_ID", C24099q0.Companion.m125984a().m125977u());
                    InterfaceC27218a m92676n2 = m92676n2();
                    AbstractC19074t.m100205c(m92676n2);
                    m92676n2.mo35579p().m93069k2(MainTabView.class, bundle2, 1, true);
                    return;
                }
                return;
            }
            f46982e1 = false;
            m46849RM().m98097A0();
            return;
        }
        if (i12 == -1) {
            ArrayList<String> arrayList = null;
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                arrayList = bundle.getStringArrayList("EXTRA_RESULT_DELETED_STORY_IDS");
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                m46849RM().m98109Z(arrayList);
            }
            if (bundle != null) {
                i13 = bundle.getInt("EXTRA_RESULT_VIEWED_STORY_COUNT");
            }
            if (i13 > 0) {
                m46849RM().m98104K0(i13);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 115) {
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            AbstractC22055v0.m115126P(this, null, new SensitiveData("profile_story_archived_post_story", "social_story", null, 4, null), new TrackingSource(6));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m46856bN();
        m46839HM();
        boolean z11 = false;
        if (bundle != null && bundle.getBoolean("SAVE_STORY_ARCHIVE_ONBOARDING_STATE", false)) {
            z11 = true;
        }
        f46982e1 = z11;
        if (z11) {
            m46837FM(m46848QM());
        }
    }
}
