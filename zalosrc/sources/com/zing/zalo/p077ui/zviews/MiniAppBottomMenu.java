package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.rounedlayout.FrameRoundedLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.MiniAppQRView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hb0.AbstractC19959c;
import java.io.Serializable;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import org.json.JSONObject;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p354n3.C23528a;
import p649xl.C30049t7;
import pm0.C24848g0;
import rf0.C25768b;
import rf0.C25770d;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class MiniAppBottomMenu extends MiniAppPopupView implements View.OnClickListener, MiniAppQRView.InterfaceC14608a, InterfaceC0733x {
    public static final C14582a Companion = new C14582a(null);

    /* renamed from: h1 */
    private static final int f75058h1;

    /* renamed from: i1 */
    private static final int f75059i1;

    /* renamed from: j1 */
    private static final int f75060j1;

    /* renamed from: R0 */
    private Context f75061R0;

    /* renamed from: S0 */
    private InterfaceC1756a1 f75062S0;

    /* renamed from: T0 */
    private C25768b.b f75063T0;

    /* renamed from: U0 */
    private C30049t7 f75064U0;

    /* renamed from: V0 */
    private C19609h f75065V0;

    /* renamed from: W0 */
    private C25768b f75066W0;

    /* renamed from: X0 */
    private C25770d f75067X0;

    /* renamed from: Y0 */
    private String f75068Y0;

    /* renamed from: Z0 */
    private InterfaceC1764d0 f75069Z0;

    /* renamed from: a1 */
    private C14583b f75070a1;

    /* renamed from: b1 */
    private float f75071b1;

    /* renamed from: c1 */
    private boolean f75072c1;

    /* renamed from: d1 */
    private boolean f75073d1;

    /* renamed from: e1 */
    private boolean f75074e1 = true;

    /* renamed from: f1 */
    private boolean f75075f1;

    /* renamed from: g1 */
    private InterfaceC14584c f75076g1;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$a */
    /* loaded from: classes6.dex */
    public static final class C14582a {
        private C14582a() {
        }

        public /* synthetic */ C14582a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m81686a() {
            return MiniAppBottomMenu.f75060j1;
        }

        /* renamed from: b */
        public final int m81687b() {
            return MiniAppBottomMenu.f75059i1;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$b */
    /* loaded from: classes6.dex */
    public final class C14583b {

        /* renamed from: a */
        private MiniAppQRView f75077a;

        public C14583b() {
        }

        /* renamed from: a */
        private final void m81688a() {
            if (this.f75077a == null) {
                C30049t7 c30049t7 = MiniAppBottomMenu.this.f75064U0;
                C30049t7 c30049t72 = null;
                if (c30049t7 == null) {
                    AbstractC19074t.m100223u("vb");
                    c30049t7 = null;
                }
                this.f75077a = (MiniAppQRView) c30049t7.f139415R.inflate();
                C30049t7 c30049t73 = MiniAppBottomMenu.this.f75064U0;
                if (c30049t73 == null) {
                    AbstractC19074t.m100223u("vb");
                } else {
                    c30049t72 = c30049t73;
                }
                c30049t72.f139423r.setTranslationY(MiniAppBottomMenu.this.f75071b1);
                MiniAppQRView miniAppQRView = this.f75077a;
                if (miniAppQRView != null) {
                    miniAppQRView.setMiniAppQRListener(MiniAppBottomMenu.this);
                }
            }
        }

        /* renamed from: b */
        public final void m81689b(boolean z11) {
            int i11;
            MiniAppQRView miniAppQRView;
            if (MiniAppBottomMenu.this.f75065V0 == null) {
                return;
            }
            m81688a();
            if (z11 && (miniAppQRView = this.f75077a) != null) {
                C19609h c19609h = MiniAppBottomMenu.this.f75065V0;
                AbstractC19074t.m100205c(c19609h);
                miniAppQRView.m81753f(c19609h);
            }
            C30049t7 c30049t7 = MiniAppBottomMenu.this.f75064U0;
            C30049t7 c30049t72 = null;
            if (c30049t7 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t7 = null;
            }
            c30049t7.f139422q.setDisableTouch(z11);
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            C30049t7 c30049t73 = MiniAppBottomMenu.this.f75064U0;
            if (c30049t73 == null) {
                AbstractC19074t.m100223u("vb");
            } else {
                c30049t72 = c30049t73;
            }
            c30049t72.f139423r.setVisibility(i11);
            if (!z11) {
                MiniAppPopupView.m81730mM(MiniAppBottomMenu.this, false, false, null, 7, null);
            }
        }

        /* renamed from: c */
        public final void m81690c() {
            MiniAppQRView miniAppQRView;
            C19609h c19609h = MiniAppBottomMenu.this.f75065V0;
            if (c19609h != null && (miniAppQRView = this.f75077a) != null) {
                miniAppQRView.m81753f(c19609h);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC14584c {
        /* renamed from: a */
        void mo81413a();
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$d */
    /* loaded from: classes6.dex */
    public static final class C14585d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f75080r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14585d(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f75080r = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81691a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81691a() {
            C14583b c14583b = MiniAppBottomMenu.this.f75070a1;
            if (c14583b == null) {
                AbstractC19074t.m100223u("mAQRViewHolder");
                c14583b = null;
            }
            c14583b.m81689b(false);
            InterfaceC18494a interfaceC18494a = this.f75080r;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$e */
    /* loaded from: classes6.dex */
    static final class C14586e extends AbstractC19075u implements InterfaceC18494a {
        C14586e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            AbstractC0837p0.Companion.m2237f();
            MiniAppBottomMenu miniAppBottomMenu = MiniAppBottomMenu.this;
            C25768b.b bVar = miniAppBottomMenu.f75063T0;
            if (bVar != null) {
                bVar.mo81408k(miniAppBottomMenu.f75068Y0);
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$f */
    /* loaded from: classes6.dex */
    static final class C14587f extends AbstractC19075u implements InterfaceC18494a {
        C14587f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            AbstractC0837p0.Companion.m2237f();
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81397a();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$g */
    /* loaded from: classes6.dex */
    static final class C14588g extends AbstractC19075u implements InterfaceC18494a {
        C14588g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            AbstractC0837p0.Companion.m2237f();
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81403g();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$h */
    /* loaded from: classes6.dex */
    static final class C14589h extends AbstractC19075u implements InterfaceC18494a {
        C14589h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81400d();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$i */
    /* loaded from: classes6.dex */
    static final class C14590i extends AbstractC19075u implements InterfaceC18494a {
        C14590i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            AbstractC0837p0.Companion.m2237f();
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81407j();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$j */
    /* loaded from: classes6.dex */
    static final class C14591j extends AbstractC19075u implements InterfaceC18494a {
        C14591j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            AbstractC0837p0.Companion.m2237f();
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81405h();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$k */
    /* loaded from: classes6.dex */
    static final class C14592k extends AbstractC19075u implements InterfaceC18494a {
        C14592k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24848g0 mo12V4() {
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81398b();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$l */
    /* loaded from: classes6.dex */
    static final class C14593l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f75089r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14593l(String str) {
            super(0);
            this.f75089r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81699a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81699a() {
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81409r3(this.f75089r);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$m */
    /* loaded from: classes6.dex */
    static final class C14594m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f75091r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14594m(String str) {
            super(0);
            this.f75091r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81700a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81700a() {
            C25768b.b bVar = MiniAppBottomMenu.this.f75063T0;
            if (bVar != null) {
                bVar.mo81404g0(this.f75091r);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppBottomMenu$n */
    /* loaded from: classes6.dex */
    public static final class C14595n extends AbstractC19959c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14595n(DragToCloseLayout dragToCloseLayout) {
            super(dragToCloseLayout);
            AbstractC19074t.m100205c(dragToCloseLayout);
        }

        @Override // hb0.AbstractC19959c
        /* renamed from: c */
        public View mo81701c() {
            C30049t7 c30049t7 = MiniAppBottomMenu.this.f75064U0;
            if (c30049t7 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t7 = null;
            }
            FrameLayout frameLayout = c30049t7.f139399B;
            AbstractC19074t.m100207e(frameLayout, "maBgView");
            return frameLayout;
        }

        @Override // hb0.AbstractC19959c
        /* renamed from: f */
        public void mo81702f(boolean z11) {
            if (!z11) {
                C30049t7 c30049t7 = MiniAppBottomMenu.this.f75064U0;
                C14583b c14583b = null;
                if (c30049t7 == null) {
                    AbstractC19074t.m100223u("vb");
                    c30049t7 = null;
                }
                c30049t7.f139399B.setVisibility(8);
                C14583b c14583b2 = MiniAppBottomMenu.this.f75070a1;
                if (c14583b2 == null) {
                    AbstractC19074t.m100223u("mAQRViewHolder");
                } else {
                    c14583b = c14583b2;
                }
                c14583b.m81689b(false);
            }
        }
    }

    static {
        int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118736p(AbstractC16802y.ma_padding_horizontal) * 2);
        f75058h1 = m118722k0;
        int m118736p = m118722k0 / AbstractC23136l9.m118736p(AbstractC16802y.ma_share_item_width);
        f75059i1 = m118736p - 1;
        f75060j1 = m118722k0 / m118736p;
    }

    /* renamed from: CM */
    private final void m81663CM() {
        JSONObject m102614h;
        JSONObject m102614h2;
        String str;
        String str2;
        JSONObject m102614h3;
        JSONObject m102614h4;
        this.f75075f1 = m92676n2() instanceof ZaloLauncherActivity;
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        this.f75068Y0 = aVar.m114621o(this.f75065V0);
        C19609h c19609h = this.f75065V0;
        String str3 = "...";
        Boolean bool = null;
        if (c19609h != null) {
            C30049t7 c30049t7 = this.f75064U0;
            if (c30049t7 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t7 = null;
            }
            c30049t7.f139408K.setText(c19609h.m102619m());
            C23528a c23528a = new C23528a(getContext());
            C30049t7 c30049t72 = this.f75064U0;
            if (c30049t72 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t72 = null;
            }
            C23528a c23528a2 = (C23528a) c23528a.m123612r(c30049t72.f139406I);
            C19609h c19609h2 = this.f75065V0;
            if (c19609h2 != null) {
                str = c19609h2.m102612f();
            } else {
                str = null;
            }
            c23528a2.m123619y(str, C23278z2.f112845a.m120171i1(), 10);
            C30049t7 c30049t73 = this.f75064U0;
            if (c30049t73 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t73 = null;
            }
            RobotoTextView robotoTextView = c30049t73.f139401D;
            C19609h c19609h3 = this.f75065V0;
            if (c19609h3 == null || (m102614h3 = c19609h3.m102614h()) == null || !m102614h3.has("shareUrl")) {
                str2 = "...";
            } else {
                C19609h c19609h4 = this.f75065V0;
                if (c19609h4 != null && (m102614h4 = c19609h4.m102614h()) != null) {
                    str2 = m102614h4.getString("appCategory");
                } else {
                    str2 = null;
                }
            }
            robotoTextView.setText(str2);
        }
        C30049t7 c30049t74 = this.f75064U0;
        if (c30049t74 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t74 = null;
        }
        RobotoTextView robotoTextView2 = c30049t74.f139420W;
        String str4 = this.f75068Y0;
        if (str4 != null && !AbstractC19074t.m100204b(str4, "")) {
            String str5 = this.f75068Y0;
            AbstractC19074t.m100205c(str5);
            str3 = aVar.m114628x(str5);
        }
        robotoTextView2.setText(str3);
        C19609h c19609h5 = this.f75065V0;
        if (c19609h5 != null && (m102614h = c19609h5.m102614h()) != null && m102614h.has("enableFavorite")) {
            C19609h c19609h6 = this.f75065V0;
            if (c19609h6 != null && (m102614h2 = c19609h6.m102614h()) != null) {
                bool = Boolean.valueOf(m102614h2.getBoolean("enableFavorite"));
            }
        } else {
            bool = Boolean.TRUE;
        }
        this.f75074e1 = AbstractC19074t.m100204b(bool, Boolean.TRUE);
        C25768b.b bVar = this.f75063T0;
        if (bVar != null) {
            m81681LM(bVar.mo81402f());
        }
        m81669MM();
    }

    /* renamed from: DM */
    private final void m81664DM(InterfaceC18494a interfaceC18494a) {
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        C30049t7 c30049t7 = this.f75064U0;
        if (c30049t7 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t7 = null;
        }
        DragToCloseLayout dragToCloseLayout = c30049t7.f139423r;
        AbstractC19074t.m100207e(dragToCloseLayout, "dragToCloseQrLayout");
        AbstractC21954k.a.m114604z(aVar, dragToCloseLayout, this.f75071b1, 0L, new C14585d(interfaceC18494a), null, 20, null);
    }

    /* renamed from: EM */
    static /* synthetic */ void m81665EM(MiniAppBottomMenu miniAppBottomMenu, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC18494a = null;
        }
        miniAppBottomMenu.m81664DM(interfaceC18494a);
    }

    /* renamed from: GM */
    public static final void m81666GM(MiniAppBottomMenu miniAppBottomMenu) {
        AbstractC19074t.m100208f(miniAppBottomMenu, "this$0");
        C25770d c25770d = miniAppBottomMenu.f75067X0;
        if (c25770d != null) {
            c25770d.m132907R();
        }
    }

    /* renamed from: HM */
    private final void m81667HM() {
        String str;
        if (!this.f75072c1) {
            return;
        }
        C0708i c0708i = new C0708i();
        if (this.f75073d1) {
            str = "remove";
        } else {
            str = "add";
        }
        c0708i.m1075f("status", str);
        C30049t7 c30049t7 = this.f75064U0;
        if (c30049t7 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t7 = null;
        }
        c30049t7.f139405H.setTrackingExtraData(c0708i);
    }

    /* renamed from: KM */
    public static final void m81668KM(MiniAppBottomMenu miniAppBottomMenu, List list) {
        AbstractC19074t.m100208f(miniAppBottomMenu, "this$0");
        AbstractC19074t.m100208f(list, "it");
        C25768b c25768b = miniAppBottomMenu.f75066W0;
        if (c25768b != null) {
            c25768b.m132895M(list);
        }
    }

    /* renamed from: MM */
    private final void m81669MM() {
        int i11;
        if (m92681pJ()) {
            return;
        }
        C30049t7 c30049t7 = null;
        if (!this.f75075f1) {
            C30049t7 c30049t72 = this.f75064U0;
            if (c30049t72 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t72 = null;
            }
            c30049t72.f139400C.m72881d(C23212s8.m119606n(AbstractC2807a.page_background_03), C23212s8.m119606n(AbstractC2807a.ui_background_pressed));
            i11 = AbstractC2807a.icon_01;
        } else {
            C30049t7 c30049t73 = this.f75064U0;
            if (c30049t73 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t73 = null;
            }
            c30049t73.f139400C.m72881d(C23212s8.m119606n(AbstractC2807a.page_background_03), -1);
            i11 = AbstractC2807a.icon_03;
        }
        C30049t7 c30049t74 = this.f75064U0;
        if (c30049t74 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t74 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c30049t74.f139427v;
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC16803z.zma_minimize, i11));
        C30049t7 c30049t75 = this.f75064U0;
        if (c30049t75 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c30049t7 = c30049t75;
        }
        c30049t7.f139426u.setTextColor(C23212s8.m119606n(i11));
    }

    /* renamed from: FM */
    public final void m81678FM() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.nx
            public /* synthetic */ RunnableC15960nx() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniAppBottomMenu.m81666GM(MiniAppBottomMenu.this);
            }
        });
    }

    /* renamed from: IM */
    public final void m81679IM(InterfaceC14584c interfaceC14584c) {
        this.f75076g1 = interfaceC14584c;
    }

    /* renamed from: JM */
    public final void m81680JM(Context context, InterfaceC1756a1 interfaceC1756a1, C25768b.b bVar) {
        float f11;
        C1761c0 m132905O;
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(interfaceC1756a1, "viewModelStoreOwner");
        AbstractC19074t.m100208f(bVar, "mMAShareListener");
        this.f75061R0 = context;
        this.f75062S0 = interfaceC1756a1;
        this.f75063T0 = bVar;
        this.f75066W0 = new C25768b(context, bVar);
        this.f75067X0 = (C25770d) new C1802w0(interfaceC1756a1, new C1802w0.c()).m9378a(C25770d.class);
        this.f75069Z0 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ox
            public /* synthetic */ C15998ox() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MiniAppBottomMenu.m81668KM(MiniAppBottomMenu.this, (List) obj);
            }
        };
        C25768b.b bVar2 = this.f75063T0;
        if (bVar2 != null) {
            f11 = bVar2.mo81401e();
        } else {
            f11 = 0.0f;
        }
        this.f75071b1 = f11;
        C25770d c25770d = this.f75067X0;
        if (c25770d != null && (m132905O = c25770d.m132905O()) != null) {
            InterfaceC1764d0 interfaceC1764d0 = this.f75069Z0;
            AbstractC19074t.m100205c(interfaceC1764d0);
            m132905O.m9219j(this, interfaceC1764d0);
        }
    }

    /* renamed from: LM */
    public final void m81681LM(boolean z11) {
        int i11;
        int i12;
        int i13;
        this.f75073d1 = z11;
        if (m92681pJ()) {
            return;
        }
        C30049t7 c30049t7 = null;
        if (this.f75074e1) {
            C30049t7 c30049t72 = this.f75064U0;
            if (c30049t72 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t72 = null;
            }
            c30049t72.f139405H.m72881d(C23212s8.m119606n(AbstractC2807a.page_background_03), C23212s8.m119606n(AbstractC2807a.ui_background_pressed));
            i11 = AbstractC2807a.icon_01;
        } else {
            C30049t7 c30049t73 = this.f75064U0;
            if (c30049t73 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t73 = null;
            }
            c30049t73.f139405H.m72881d(C23212s8.m119606n(AbstractC2807a.page_background_03), -1);
            i11 = AbstractC2807a.icon_03;
        }
        C30049t7 c30049t74 = this.f75064U0;
        if (c30049t74 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t74 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c30049t74.f139428w;
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        if (z11) {
            i12 = AbstractC23322a.zds_ic_star_solid_24;
        } else {
            i12 = AbstractC23322a.zds_ic_star_line_24;
        }
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, i12, i11));
        C30049t7 c30049t75 = this.f75064U0;
        if (c30049t75 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t75 = null;
        }
        RobotoTextView robotoTextView = c30049t75.f139425t;
        if (z11) {
            i13 = AbstractC8020f0.str_mini_remove_app_favorite;
        } else {
            i13 = AbstractC8020f0.str_mini_app_favorite;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(i13));
        C30049t7 c30049t76 = this.f75064U0;
        if (c30049t76 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c30049t7 = c30049t76;
        }
        c30049t7.f139425t.setTextColor(C23212s8.m119606n(i11));
        m81667HM();
    }

    /* renamed from: NM */
    public final void m81682NM(C19609h c19609h) {
        this.f75065V0 = c19609h;
        if (this.f75072c1) {
            m81663CM();
            C14583b c14583b = this.f75070a1;
            if (c14583b == null) {
                AbstractC19074t.m100223u("mAQRViewHolder");
                c14583b = null;
            }
            c14583b.m81690c();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Serializable serializable;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        C30049t7 c30049t7 = null;
        if (m92642L3 != null) {
            serializable = m92642L3.getSerializable("EXTRA_MINI_PROGRAM_INFO");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f75065V0 = (C19609h) serializable;
        }
        if (AbstractC0924m0.m3098H3() == 1) {
            C30049t7 c30049t72 = this.f75064U0;
            if (c30049t72 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t72 = null;
            }
            c30049t72.f139400C.setVisibility(0);
            C30049t7 c30049t73 = this.f75064U0;
            if (c30049t73 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t73 = null;
            }
            c30049t73.f139424s.setVisibility(8);
        } else {
            C30049t7 c30049t74 = this.f75064U0;
            if (c30049t74 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t74 = null;
            }
            c30049t74.f139400C.setVisibility(8);
            C30049t7 c30049t75 = this.f75064U0;
            if (c30049t75 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t75 = null;
            }
            c30049t75.f139424s.setVisibility(0);
        }
        C30049t7 c30049t76 = this.f75064U0;
        if (c30049t76 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t76 = null;
        }
        c30049t76.f139417T.setIdTracking("ma_menu_view");
        C30049t7 c30049t77 = this.f75064U0;
        if (c30049t77 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t77 = null;
        }
        c30049t77.f139422q.setDisableTouch(false);
        C30049t7 c30049t78 = this.f75064U0;
        if (c30049t78 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t78 = null;
        }
        c30049t78.f139422q.setDirection(1);
        C30049t7 c30049t79 = this.f75064U0;
        if (c30049t79 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t79 = null;
        }
        c30049t79.f139423r.setDisableTouch(false);
        C30049t7 c30049t710 = this.f75064U0;
        if (c30049t710 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t710 = null;
        }
        c30049t710.f139423r.setDirection(1);
        C30049t7 c30049t711 = this.f75064U0;
        if (c30049t711 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t711 = null;
        }
        ViewGroup.LayoutParams layoutParams = c30049t711.f139423r.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).topMargin = AbstractC23136l9.m118737p0();
        C30049t7 c30049t712 = this.f75064U0;
        if (c30049t712 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t712 = null;
        }
        DragToCloseLayout dragToCloseLayout = c30049t712.f139423r;
        C30049t7 c30049t713 = this.f75064U0;
        if (c30049t713 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t713 = null;
        }
        dragToCloseLayout.setOnDragToCloseListener(new C14595n(c30049t713.f139423r));
        C30049t7 c30049t714 = this.f75064U0;
        if (c30049t714 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t714 = null;
        }
        c30049t714.f139403F.setIdTracking("ma_menu_copy_link");
        C30049t7 c30049t715 = this.f75064U0;
        if (c30049t715 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t715 = null;
        }
        c30049t715.f139410M.setIdTracking("ma_menu_qr_code");
        C30049t7 c30049t716 = this.f75064U0;
        if (c30049t716 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t716 = null;
        }
        c30049t716.f139413P.setIdTracking("ma_menu_shortcut");
        C30049t7 c30049t717 = this.f75064U0;
        if (c30049t717 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t717 = null;
        }
        c30049t717.f139405H.setIdTracking("ma_menu_favorites");
        C30049t7 c30049t718 = this.f75064U0;
        if (c30049t718 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t718 = null;
        }
        c30049t718.f139400C.setIdTracking("ma_menu_floating");
        C30049t7 c30049t719 = this.f75064U0;
        if (c30049t719 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t719 = null;
        }
        c30049t719.f139412O.setIdTracking("ma_menu_reload");
        C30049t7 c30049t720 = this.f75064U0;
        if (c30049t720 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t720 = null;
        }
        c30049t720.f139409L.setIdTracking("ma_menu_permission");
        C30049t7 c30049t721 = this.f75064U0;
        if (c30049t721 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t721 = null;
        }
        c30049t721.f139402E.setIdTracking("ma_menu_close");
        C30049t7 c30049t722 = this.f75064U0;
        if (c30049t722 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t722 = null;
        }
        c30049t722.f139403F.setOnClickListener(this);
        C30049t7 c30049t723 = this.f75064U0;
        if (c30049t723 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t723 = null;
        }
        c30049t723.f139410M.setOnClickListener(this);
        C30049t7 c30049t724 = this.f75064U0;
        if (c30049t724 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t724 = null;
        }
        c30049t724.f139413P.setOnClickListener(this);
        C30049t7 c30049t725 = this.f75064U0;
        if (c30049t725 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t725 = null;
        }
        c30049t725.f139405H.setOnClickListener(this);
        C30049t7 c30049t726 = this.f75064U0;
        if (c30049t726 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t726 = null;
        }
        c30049t726.f139400C.setOnClickListener(this);
        C30049t7 c30049t727 = this.f75064U0;
        if (c30049t727 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t727 = null;
        }
        c30049t727.f139412O.setOnClickListener(this);
        C30049t7 c30049t728 = this.f75064U0;
        if (c30049t728 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t728 = null;
        }
        c30049t728.f139409L.setOnClickListener(this);
        C30049t7 c30049t729 = this.f75064U0;
        if (c30049t729 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t729 = null;
        }
        c30049t729.f139402E.setOnClickListener(this);
        C30049t7 c30049t730 = this.f75064U0;
        if (c30049t730 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t730 = null;
        }
        c30049t730.f139417T.setOnClickListener(this);
        C30049t7 c30049t731 = this.f75064U0;
        if (c30049t731 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t731 = null;
        }
        c30049t731.f139414Q.setIdTracking("ma_menu_header");
        C30049t7 c30049t732 = this.f75064U0;
        if (c30049t732 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t732 = null;
        }
        c30049t732.f139414Q.setOnClickListener(this);
        this.f75070a1 = new C14583b();
        C30049t7 c30049t733 = this.f75064U0;
        if (c30049t733 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t733 = null;
        }
        c30049t733.f139411N.setAdapter(this.f75066W0);
        C30049t7 c30049t734 = this.f75064U0;
        if (c30049t734 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c30049t7 = c30049t734;
        }
        c30049t7.f139411N.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f75072c1 = true;
        InterfaceC14584c interfaceC14584c = this.f75076g1;
        if (interfaceC14584c != null) {
            interfaceC14584c.mo81413a();
        }
        m81667HM();
        m81663CM();
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppQRView.InterfaceC14608a
    /* renamed from: g0 */
    public void mo81683g0(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m81664DM(new C14594m(str));
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MAMenuView";
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30049t7 m148528c = C30049t7.m148528c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148528c, "inflate(...)");
        this.f75064U0 = m148528c;
        if (m148528c == null) {
            AbstractC19074t.m100223u("vb");
            m148528c = null;
        }
        FrameRoundedLayout frameRoundedLayout = m148528c.f139417T;
        AbstractC19074t.m100207e(frameRoundedLayout, "rootView");
        return frameRoundedLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: nM */
    public View mo81268nM() {
        C30049t7 c30049t7 = this.f75064U0;
        if (c30049t7 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t7 = null;
        }
        FrameLayout frameLayout = c30049t7.f139399B;
        AbstractC19074t.m100207e(frameLayout, "maBgView");
        return frameLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: oM */
    public View mo81269oM() {
        C30049t7 c30049t7 = this.f75064U0;
        if (c30049t7 == null) {
            AbstractC19074t.m100223u("vb");
            c30049t7 = null;
        }
        DragToCloseLayout dragToCloseLayout = c30049t7.f139422q;
        AbstractC19074t.m100207e(dragToCloseLayout, "dragToCloseLayout");
        return dragToCloseLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        C30049t7 c30049t7 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ma_menu_copy_link;
        if (num != null && num.intValue() == i11) {
            MiniAppPopupView.m81730mM(this, false, false, new C14586e(), 3, null);
            return;
        }
        int i12 = AbstractC6918a0.ma_menu_qr_code;
        if (num != null && num.intValue() == i12) {
            C30049t7 c30049t72 = this.f75064U0;
            if (c30049t72 == null) {
                AbstractC19074t.m100223u("vb");
                c30049t72 = null;
            }
            c30049t72.f139422q.setVisibility(8);
            C14583b c14583b = this.f75070a1;
            if (c14583b == null) {
                AbstractC19074t.m100223u("mAQRViewHolder");
                c14583b = null;
            }
            c14583b.m81689b(true);
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            C30049t7 c30049t73 = this.f75064U0;
            if (c30049t73 == null) {
                AbstractC19074t.m100223u("vb");
            } else {
                c30049t7 = c30049t73;
            }
            DragToCloseLayout dragToCloseLayout = c30049t7.f139423r;
            AbstractC19074t.m100207e(dragToCloseLayout, "dragToCloseQrLayout");
            AbstractC21954k.a.m114604z(aVar, dragToCloseLayout, 0.0f, 0L, null, null, 28, null);
            return;
        }
        int i13 = AbstractC6918a0.ma_menu_short_cut;
        if (num != null && num.intValue() == i13) {
            MiniAppPopupView.m81730mM(this, false, false, new C14587f(), 3, null);
            return;
        }
        int i14 = AbstractC6918a0.ma_menu_favorite;
        if (num != null && num.intValue() == i14) {
            if (!this.f75074e1) {
                return;
            }
            MiniAppPopupView.m81730mM(this, false, false, new C14588g(), 3, null);
            return;
        }
        int i15 = AbstractC6918a0.ma_menu_add_floating;
        if (num != null && num.intValue() == i15) {
            if (!this.f75075f1) {
                MiniAppPopupView.m81730mM(this, false, false, new C14589h(), 3, null);
                return;
            }
            return;
        }
        int i16 = AbstractC6918a0.ma_menu_reload;
        if (num != null && num.intValue() == i16) {
            MiniAppPopupView.m81730mM(this, false, false, new C14590i(), 3, null);
            return;
        }
        int i17 = AbstractC6918a0.ma_menu_close;
        if (num != null && num.intValue() == i17) {
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
            return;
        }
        int i18 = AbstractC6918a0.rootView;
        if (num != null && num.intValue() == i18) {
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
            return;
        }
        int i19 = AbstractC6918a0.ma_open_info_view;
        if (num != null && num.intValue() == i19) {
            MiniAppPopupView.m81730mM(this, false, false, new C14591j(), 3, null);
            return;
        }
        int i21 = AbstractC6918a0.ma_menu_permission;
        if (num != null && num.intValue() == i21) {
            MiniAppPopupView.m81730mM(this, false, false, new C14592k(), 3, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
        C25770d c25770d;
        C1761c0 m132905O;
        C25768b.b bVar = this.f75063T0;
        if (bVar != null) {
            bVar.onDismiss();
        }
        InterfaceC1764d0 interfaceC1764d0 = this.f75069Z0;
        if (interfaceC1764d0 != null && (c25770d = this.f75067X0) != null && (m132905O = c25770d.m132905O()) != null) {
            m132905O.mo9222o(interfaceC1764d0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppQRView.InterfaceC14608a
    /* renamed from: r3 */
    public void mo81684r3(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m81664DM(new C14593l(str));
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppQRView.InterfaceC14608a
    /* renamed from: zC */
    public void mo81685zC() {
        m81665EM(this, null, 1, null);
    }
}
