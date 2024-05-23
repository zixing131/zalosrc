package com.zing.zalo.feed.reactions.dialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import as.InterfaceC2332g;
import as.InterfaceC2333h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p542ub.InterfaceC27218a;
import xl0.InterfaceC30161b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.feed.reactions.dialog.a */
/* loaded from: classes4.dex */
public final class C8848a extends KeyEventCallbackC17462c implements InterfaceC30161b {

    /* renamed from: I */
    private final InterfaceC27218a f47268I;

    /* renamed from: J */
    private a f47269J;

    /* renamed from: K */
    private FeedReactionPanelView f47270K;

    /* renamed from: L */
    private final int f47271L;

    /* renamed from: com.zing.zalo.feed.reactions.dialog.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final b f47272a;

        /* renamed from: b */
        private final c f47273b;

        /* renamed from: c */
        private final InterfaceC2333h f47274c;

        public a(b bVar, c cVar, InterfaceC2333h interfaceC2333h) {
            AbstractC19074t.m100208f(bVar, "positionInfo");
            AbstractC19074t.m100208f(cVar, "reactionPanelUIComponent");
            this.f47272a = bVar;
            this.f47273b = cVar;
            this.f47274c = interfaceC2333h;
        }

        /* renamed from: a */
        public final InterfaceC2333h m47267a() {
            return this.f47274c;
        }

        /* renamed from: b */
        public final b m47268b() {
            return this.f47272a;
        }

        /* renamed from: c */
        public final c m47269c() {
            return this.f47273b;
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final int f47275a;

        /* renamed from: b */
        private final int f47276b;

        /* renamed from: c */
        private final int f47277c;

        /* renamed from: d */
        private final a f47278d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.zing.zalo.feed.reactions.dialog.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: p */
            public static final a f47279p = new a("CENTER", 0);

            /* renamed from: q */
            public static final a f47280q = new a("ANCHOR_BY_X", 1);

            /* renamed from: r */
            private static final /* synthetic */ a[] f47281r;

            /* renamed from: s */
            private static final /* synthetic */ InterfaceC30165a f47282s;

            static {
                a[] m47274b = m47274b();
                f47281r = m47274b;
                f47282s = AbstractC30166b.m148796a(m47274b);
            }

            private a(String str, int i11) {
            }

            /* renamed from: b */
            private static final /* synthetic */ a[] m47274b() {
                return new a[]{f47279p, f47280q};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f47281r.clone();
            }
        }

        public b(int i11, int i12, int i13) {
            this(i11, i12, i13, null, 8, null);
        }

        /* renamed from: a */
        public final a m47270a() {
            return this.f47278d;
        }

        /* renamed from: b */
        public final int m47271b() {
            return this.f47277c;
        }

        /* renamed from: c */
        public final int m47272c() {
            return this.f47275a;
        }

        /* renamed from: d */
        public final int m47273d() {
            return this.f47276b;
        }

        public b(int i11, int i12, int i13, a aVar) {
            AbstractC19074t.m100208f(aVar, "horizontalPosition");
            this.f47275a = i11;
            this.f47276b = i12;
            this.f47277c = i13;
            this.f47278d = aVar;
        }

        public /* synthetic */ b(int i11, int i12, int i13, a aVar, int i14, AbstractC19060k abstractC19060k) {
            this(i11, i12, i13, (i14 & 8) != 0 ? a.f47279p : aVar);
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.a$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final List f47283a;

        /* renamed from: b */
        private final Drawable f47284b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            this(list, null, 2, 0 == true ? 1 : 0);
            AbstractC19074t.m100208f(list, "listReactionDrawable");
        }

        /* renamed from: a */
        public final List m47275a() {
            return this.f47283a;
        }

        /* renamed from: b */
        public final Drawable m47276b() {
            return this.f47284b;
        }

        public c(List list, Drawable drawable) {
            AbstractC19074t.m100208f(list, "listReactionDrawable");
            this.f47283a = list;
            this.f47284b = drawable;
        }

        public /* synthetic */ c(List list, Drawable drawable, int i11, AbstractC19060k abstractC19060k) {
            this(list, (i11 & 2) != 0 ? AbstractC23136l9.m118663M(AbstractC16803z.feed_reaction_bar_background) : drawable);
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2332g {

        /* renamed from: b */
        final /* synthetic */ a f47286b;

        d(a aVar) {
            this.f47286b = aVar;
        }

        @Override // as.InterfaceC2332g
        /* renamed from: a */
        public void mo12286a() {
            C8848a.this.dismiss();
        }

        @Override // as.InterfaceC2332g
        /* renamed from: b */
        public void mo12287b(int i11) {
            C8848a.this.dismiss();
            InterfaceC2333h m47267a = this.f47286b.m47267a();
            if (m47267a != null) {
                m47267a.mo12288b(i11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8848a(InterfaceC27218a interfaceC27218a) {
        super(interfaceC27218a.getContext());
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        this.f47268I = interfaceC27218a;
        this.f47271L = AbstractC17484n.Companion.m92931b();
    }

    /* renamed from: M */
    private final int m47261M(b bVar) {
        int m47273d = ((bVar.m47273d() - this.f47271L) - (FeedReactionContentView.Companion.m47255a() + AbstractC23222t7.f112562h)) - AbstractC23222t7.f112528I;
        if (m47273d >= AbstractC23222t7.f112534M) {
            return m47273d;
        }
        return (bVar.m47273d() - this.f47271L) + bVar.m47271b() + AbstractC23222t7.f112528I;
    }

    /* renamed from: N */
    private final void m47262N() {
        InterfaceC27218a interfaceC27218a = this.f47268I;
        if (interfaceC27218a instanceof ZaloActivity) {
            ((ZaloActivity) interfaceC27218a).m35555T1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m47263P(C8848a c8848a) {
        AbstractC19074t.m100208f(c8848a, "this$0");
        c8848a.m92867k().m92904k().requestLayout();
    }

    /* renamed from: Q */
    private final void m47264Q() {
        InterfaceC27218a interfaceC27218a = this.f47268I;
        if (interfaceC27218a instanceof ZaloActivity) {
            ((ZaloActivity) interfaceC27218a).m35568e2(this);
        }
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: K */
    public void mo13822K() {
        super.mo13822K();
        AbstractC19444a.m101694b(new Runnable() { // from class: as.f
            @Override // java.lang.Runnable
            public final void run() {
                C8848a.m47263P(C8848a.this);
            }
        }, 50L);
    }

    @Override // xl0.InterfaceC30161b
    /* renamed from: Kl */
    public boolean mo47265Kl(MotionEvent motionEvent) {
        if (m92868m()) {
            FeedReactionPanelView feedReactionPanelView = this.f47270K;
            if (feedReactionPanelView != null) {
                feedReactionPanelView.m47259b(motionEvent);
                return true;
            }
            return true;
        }
        m47264Q();
        return false;
    }

    /* renamed from: O */
    public final void m47266O(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        this.f47269J = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        a aVar = this.f47269J;
        if (aVar != null) {
            Context m92865i = m92865i();
            AbstractC19074t.m100207e(m92865i, "getContext(...)");
            FeedReactionPanelView feedReactionPanelView = new FeedReactionPanelView(m92865i, aVar.m47269c());
            feedReactionPanelView.setFeedReactionPanelListener(new d(aVar));
            this.f47270K = feedReactionPanelView;
            C17465f m92867k = m92867k();
            m92867k.m92889H(-1, -1);
            m92867k.m92890I(1);
            m92867k.m92895b(131072);
            m92867k.m92895b(Integer.MIN_VALUE);
            m92867k.m92897d(2);
            if (aVar.m47268b().m47270a() == b.a.f47279p) {
                m92867k.m92901h().gravity = 49;
            } else {
                m92867k.m92901h().gravity = 8388659;
                m92867k.m92901h().x = aVar.m47268b().m47272c();
            }
            m92867k.m92901h().y = m47261M(aVar.m47268b());
            if (Build.VERSION.SDK_INT >= 28) {
                m92867k().m92904k().setOutlineAmbientShadowColor(Color.parseColor("#800D0D0D"));
                m92867k().m92904k().setOutlineSpotShadowColor(Color.parseColor("#800D0D0D"));
                m92867k().m92904k().setElevation(AbstractC23222t7.f112562h);
            } else {
                m92867k().m92904k().setElevation(AbstractC23222t7.f112554d);
            }
            m92867k().m92904k().setBackground(aVar.m47269c().m47276b());
            m92852C(feedReactionPanelView, new ViewGroup.MarginLayoutParams(-2, -2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: s */
    public void mo13766s() {
        super.mo13766s();
        m47262N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: t */
    public void mo13767t() {
        super.mo13767t();
        m47264Q();
        FeedReactionPanelView feedReactionPanelView = this.f47270K;
        if (feedReactionPanelView != null) {
            feedReactionPanelView.m47258a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8848a(InterfaceC27218a interfaceC27218a, a aVar) {
        this(interfaceC27218a);
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        AbstractC19074t.m100208f(aVar, "params");
        m47266O(aVar);
    }
}
