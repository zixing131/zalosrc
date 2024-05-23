package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import ao.InterfaceC2259a;
import ao.InterfaceC2260b;
import au.C2370r0;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.custom.C11863k;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.animation.AnimationTarget;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import i40.C20275e;
import id0.C20518d;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l80.C22122a0;
import me0.AbstractC23136l9;
import me0.AbstractC23166o6;
import me0.C23212s8;
import me0.C23278z2;
import p139eq.C18565a;
import p348mi.AbstractC23304d;
import p348mi.C23307g;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C24003n;
import p615wn.C29106b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class FeedItemPhotoModuleView extends FeedItemMusicModuleView implements AnimationTarget {
    public static final C8103a Companion = new C8103a(null);

    /* renamed from: z0 */
    private static final int f44570z0 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: l0 */
    public int f44571l0;

    /* renamed from: m0 */
    private C11863k f44572m0;

    /* renamed from: n0 */
    private final InterfaceC24854k f44573n0;

    /* renamed from: o0 */
    private final InterfaceC24854k f44574o0;

    /* renamed from: p0 */
    private final InterfaceC24854k f44575p0;

    /* renamed from: q0 */
    private boolean f44576q0;

    /* renamed from: r0 */
    private C16719g.c f44577r0;

    /* renamed from: s0 */
    private InterfaceC2260b f44578s0;

    /* renamed from: t0 */
    private List f44579t0;

    /* renamed from: u0 */
    private ArrayList f44580u0;

    /* renamed from: v0 */
    private Map f44581v0;

    /* renamed from: w0 */
    private SparseIntArray f44582w0;

    /* renamed from: x0 */
    private int[] f44583x0;

    /* renamed from: y0 */
    private int f44584y0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$a */
    /* loaded from: classes4.dex */
    public static final class C8103a {
        private C8103a() {
        }

        public /* synthetic */ C8103a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$b */
    /* loaded from: classes4.dex */
    public static final class C8104b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8104b f44585q = new C8104b();

        C8104b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18565a mo12V4() {
            return (C18565a) C18565a.Companion.m122672a();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$c */
    /* loaded from: classes4.dex */
    static final class C8105c extends AbstractC19075u implements InterfaceC18505l {
        C8105c() {
            super(1);
        }

        /* renamed from: a */
        public final void m43938a(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "it");
            FeedItemPhotoModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m43938a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$d */
    /* loaded from: classes4.dex */
    static final class C8106d extends AbstractC19075u implements InterfaceC18505l {
        C8106d() {
            super(1);
        }

        /* renamed from: a */
        public final void m43939a(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "it");
            FeedItemPhotoModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m43939a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$e */
    /* loaded from: classes4.dex */
    public static final class C8107e extends AbstractC19075u implements InterfaceC18494a {
        C8107e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16716d mo12V4() {
            return new C16716d(FeedItemPhotoModuleView.this.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$f */
    /* loaded from: classes4.dex */
    public static final class C8108f extends AbstractC19075u implements InterfaceC18494a {
        C8108f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16716d mo12V4() {
            return new C16716d(FeedItemPhotoModuleView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$g */
    /* loaded from: classes4.dex */
    public static final class C8109g extends C20275e {

        /* renamed from: A */
        final /* synthetic */ FeedItemPhotoModuleView f44590A;

        /* renamed from: z */
        final /* synthetic */ C19055h0 f44591z;

        C8109g(C19055h0 c19055h0, FeedItemPhotoModuleView feedItemPhotoModuleView) {
            this.f44591z = c19055h0;
            this.f44590A = feedItemPhotoModuleView;
        }

        @Override // i40.C20275e
        /* renamed from: d */
        public View mo43942d(int i11) {
            if (i11 == this.f44591z.f94931p) {
                return this.f44590A;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoModuleView$h */
    /* loaded from: classes4.dex */
    public static final class C8110h extends C22122a0.d {
        C8110h() {
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c22122a0, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
                FeedItemPhotoModuleView feedItemPhotoModuleView = FeedItemPhotoModuleView.this;
                if (feedItemPhotoModuleView.f44322M == 4) {
                    feedItemPhotoModuleView.getImvPhoto().requestLayout();
                    if (c3979l != null) {
                        C22122a0.d.m115394g(c3979l, c23995f.m125661l());
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public FeedItemPhotoModuleView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f44572m0 = new C11863k(context2);
        m129210a = AbstractC24856m.m129210a(new C8108f());
        this.f44573n0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8104b.f44585q);
        this.f44574o0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8107e());
        this.f44575p0 = m129210a3;
        this.f44579t0 = new ArrayList();
        this.f44580u0 = new ArrayList();
        this.f44581v0 = new HashMap();
        this.f44582w0 = new SparseIntArray();
        this.f44583x0 = new int[]{-1184275, -5723992};
    }

    /* renamed from: E0 */
    private final int m43915E0(ItemAlbumMobile itemAlbumMobile) {
        try {
            if (!this.f44580u0.isEmpty()) {
                int size = this.f44580u0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (AbstractC19074t.m100204b(itemAlbumMobile.f42595r, ((ItemAlbumMobile) this.f44580u0.get(i11)).f42595r)) {
                        return i11;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return -1;
    }

    /* renamed from: F0 */
    private final void m43916F0() {
        try {
            this.f44580u0.clear();
            this.f44581v0.clear();
            for (C3000l0 c3000l0 : this.f44579t0) {
                if (c3000l0.m14322a0() != null) {
                    if (c3000l0.m14322a0().f12058q != 2 && c3000l0.m14322a0().f12058q != 3) {
                    }
                    if (c3000l0.m14322a0().f12023C.f12118i != null) {
                        AbstractC19074t.m100207e(c3000l0.m14322a0().f12023C.f12118i, "listPhotos");
                        if (!r2.isEmpty()) {
                            this.f44580u0.addAll(c3000l0.m14322a0().f12023C.f12118i);
                            Iterator it = c3000l0.m14322a0().f12023C.f12118i.iterator();
                            while (it.hasNext()) {
                                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                                Map map = this.f44581v0;
                                String str = itemAlbumMobile.f42595r;
                                AbstractC19074t.m100207e(str, "picid");
                                C3020p0 m14322a0 = c3000l0.m14322a0();
                                AbstractC19074t.m100207e(m14322a0, "getFeed(...)");
                                map.put(str, m14322a0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G0 */
    private final void m43917G0() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C11863k c11863k = new C11863k(context);
        this.f44572m0 = c11863k;
        c11863k.m111921r1(true);
        this.f44572m0.m111929z1(5);
        mo69681L(this.f44572m0);
    }

    /* renamed from: H0 */
    private final void m43918H0(Context context) {
        m43704i0(context, this.f44322M);
        m43917G0();
        this.f44572m0.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89023G(this.f44326Q);
        setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
    }

    /* renamed from: I0 */
    private final void m43919I0(int i11) {
        if (i11 != 0) {
            if (i11 != 6) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        m43927R0();
                        return;
                    }
                    return;
                }
                m43928S0();
                return;
            }
            m43926Q0();
            return;
        }
        m43929T0();
    }

    /* renamed from: J0 */
    private final void m43920J0(Context context) {
        m43704i0(context, this.f44322M);
        m43917G0();
        this.f44572m0.m89106L().m89060k0(-1).m89030N(-2).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_top)).m89023G(this.f44326Q);
        if (this.f44576q0) {
            this.f44572m0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right));
        } else {
            this.f44572m0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
        }
        this.f44326Q.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
    }

    /* renamed from: K0 */
    private final void m43921K0() {
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
        m43917G0();
        if (this.f44576q0) {
            this.f44572m0.m89106L().m89060k0(-1).m89030N(-2);
        } else {
            this.f44572m0.m89106L().m89060k0(AbstractC23136l9.m118659K(AbstractC16802y.feed_single_photo_size_small)).m89030N(AbstractC23136l9.m118659K(AbstractC16802y.feed_single_photo_size_small)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left));
        }
        this.f44572m0.m65864Z1(this.f44583x0);
    }

    /* renamed from: L0 */
    private final void m43922L0(Context context, int i11) {
        m43704i0(context, i11);
        m43917G0();
        C16718f m89028L = getPhotoContainer().m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89017A(bool).m89023G(this.f44326Q);
        mo69681L(getPhotoContainer());
        getPhotoContainer().m89001g1(this.f44572m0);
        this.f44572m0.m89106L().m89060k0(-1).m89030N(-2);
        if (!this.f44576q0) {
            this.f44572m0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
        }
        this.f44572m0.m65864Z1(this.f44583x0);
    }

    /* renamed from: M0 */
    private final void m43923M0(Context context, int i11) {
        m43702g0();
        m43704i0(context, i11);
        m43917G0();
        m43703h0(i11);
        m88985S(this.f44572m0);
        C16718f m89028L = getPhotoContainer().m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89017A(bool).m89023G(this.f44326Q);
        mo69681L(getPhotoContainer());
        getPhotoContainer().m89001g1(this.f44572m0);
        this.f44572m0.m89106L().m89018B(bool);
        if (this.f44576q0) {
            this.f44572m0.m89106L().m89060k0(-1).m89030N(-2).m89033Q(0);
        } else {
            this.f44572m0.m89106L().m89060k0(AbstractC23136l9.m118659K(AbstractC16802y.feed_single_photo_size_small)).m89030N(AbstractC23136l9.m118659K(AbstractC16802y.feed_single_photo_size_small)).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding));
        }
        this.f44572m0.m65864Z1(this.f44583x0);
        this.f44326Q.f45790f1.m44802G1(FeedItemBaseModuleView.f44318d0);
    }

    /* renamed from: N0 */
    private final void m43924N0() {
        Context context = this.f84675p;
        AbstractC19074t.m100207e(context, "mContext");
        this.f44572m0 = new C11863k(context);
        m43706k0();
        m43701f0();
        this.f44572m0.m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item));
        this.f44572m0.m111921r1(true);
        this.f44572m0.m111929z1(5);
        this.f44572m0.mo44614b1(0);
        mo69681L(this.f44572m0);
        int i11 = this.f44322M;
        if (i11 == 2) {
            this.f44572m0.m89106L().m89028L(AbstractC20814p0.m108611J(), AbstractC20814p0.m108611J());
        } else if (i11 == 3 && !this.f44576q0) {
            int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_single_photo_size_small);
            if (m118655I <= 0) {
                m118655I = AbstractC23136l9.m118742r(155.0f);
            }
            this.f44572m0.m89106L().m89028L(m118655I, m118655I);
        }
        this.f44572m0.m65864Z1(this.f44583x0);
    }

    /* renamed from: P0 */
    private final void m43925P0() {
        C16718f m89028L = getPhotoContainer().m89106L().m89028L(-1, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89018B(bool).m89072y(bool).m89073z(bool).m89017A(bool).m89023G(this.f44326Q);
        mo69681L(getPhotoContainer());
        getOverlayModule().m89106L().m89028L(-1, -2).m89018B(bool).m89072y(bool).m89073z(bool).m89017A(bool);
        getOverlayModule().mo44614b1(8);
        getPhotoContainer().m89001g1(getOverlayModule());
        m88985S(this.f44572m0);
        getPhotoContainer().m89001g1(this.f44572m0);
        getFeedItemMusicLyric().m44970q1(this.f44322M);
        getFeedItemMusicLyric().m89106L().m89028L(-1, AbstractC23136l9.m118736p(AbstractC16802y.box_lyric_height)).m89023G(this.f44572m0).m89034R(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89036T(AbstractC23136l9.m118742r(4.0f));
        getFeedItemMusicLyric().mo44614b1(8);
        getPhotoContainer().m89001g1(getFeedItemMusicLyric());
        getFeedItemSongInfoModule().m44568F1(this.f44322M);
        getFeedItemSongInfoModule().m89106L().m89028L(-1, -2).m89023G(getFeedItemMusicLyric()).m89034R(AbstractC23136l9.m118742r(24.0f)).m89035S(AbstractC23136l9.m118742r(24.0f)).m89036T(AbstractC23136l9.m118742r(16.0f)).m89033Q(AbstractC23136l9.m118742r(16.0f));
        getFeedItemSongInfoModule().mo44614b1(8);
        getPhotoContainer().m89001g1(getFeedItemSongInfoModule());
        getFeedItemSongInfoModule().m44569I1();
    }

    /* renamed from: Q0 */
    private final void m43926Q0() {
        getFeedItemSongInfoModule().m44568F1(this.f44322M);
        int i11 = this.f44572m0.m89106L().f84720p;
        getFeedItemSongInfoModule().m89106L().m89028L(-1, -2).m89023G(this.f44572m0).m89033Q(AbstractC23136l9.m118742r(4.0f)).m89034R(i11).m89035S(this.f44572m0.m89106L().f84722r);
        mo69681L(getFeedItemSongInfoModule());
    }

    /* renamed from: R0 */
    private final void m43927R0() {
        m43925P0();
    }

    /* renamed from: S0 */
    private final void m43928S0() {
        getFeedItemSongInfoModule().m44568F1(this.f44322M);
        getFeedItemSongInfoModule().m89106L().m89028L(-1, -2).m89023G(this.f44572m0).m89036T(AbstractC23136l9.m118742r(12.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left_profile_item));
        mo69681L(getFeedItemSongInfoModule());
    }

    /* renamed from: T0 */
    private final void m43929T0() {
        m43925P0();
    }

    /* renamed from: V0 */
    private final C24860q m43930V0(ItemAlbumMobile itemAlbumMobile) {
        C3979l.b bVar;
        String str = itemAlbumMobile.f42611z;
        if (str.length() == 0) {
            str = itemAlbumMobile.f42607x;
        }
        String str2 = itemAlbumMobile.f42550D;
        if (str2.length() == 0) {
            str2 = itemAlbumMobile.m40526m0();
        }
        int i11 = this.f44322M;
        if (i11 != 4) {
            str = str2;
        }
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            bVar = C3979l.b.UNKNOWN;
        } else {
            bVar = C3979l.b.FEED_THUMBNAIL;
        }
        return new C24860q(str, bVar);
    }

    /* renamed from: X0 */
    public static final void m43931X0(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, View view) {
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11960kf(view, c3000l0, 0, false, null);
        }
    }

    /* renamed from: Y0 */
    public static final void m43932Y0(C3000l0 c3000l0, int i11, C3020p0 c3020p0, FeedItemPhotoModuleView feedItemPhotoModuleView, ItemAlbumMobile itemAlbumMobile, int i12, View view, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource, C16719g c16719g) {
        C3020p0 c3020p02;
        C16719g.c cVar;
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        AbstractC19074t.m100208f(feedItemPhotoModuleView, "this$0");
        AbstractC19074t.m100208f(itemAlbumMobile, "$itemAlbumMobile");
        AbstractC23647d.m123907q(FeedActionZUtils.m47563u(c3000l0, i11), "");
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (c3020p0.m14493X()) {
            return;
        }
        if (feedItemPhotoModuleView.f44322M == 1 && (cVar = feedItemPhotoModuleView.f44577r0) != null) {
            if (cVar != null) {
                cVar.mo929y(c16719g);
                return;
            }
            return;
        }
        C19055h0 c19055h0 = new C19055h0();
        int m43915E0 = feedItemPhotoModuleView.m43915E0(itemAlbumMobile);
        c19055h0.f94931p = m43915E0;
        if (m43915E0 <= -1) {
            m43915E0 = 0;
        }
        c19055h0.f94931p = m43915E0;
        feedItemPhotoModuleView.m43934O0(itemAlbumMobile);
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromFeed", true);
        bundle.putInt("fromTimelineTab", c3000l0.f11896q0);
        bundle.putString("feedId", c3020p0.f12057p);
        bundle.putString("userId", c3020p0.f12022B.f12280b);
        bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
        if (feedItemPhotoModuleView.f44580u0.size() > 1) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int size = feedItemPhotoModuleView.f44580u0.size();
            for (int i13 = 0; i13 < size; i13++) {
                ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile((ItemAlbumMobile) feedItemPhotoModuleView.f44580u0.get(i13));
                if (feedItemPhotoModuleView.f44581v0.get(itemAlbumMobile2.f42595r) != null) {
                    c3020p02 = (C3020p0) feedItemPhotoModuleView.f44581v0.get(itemAlbumMobile2.f42595r);
                } else {
                    c3020p02 = c3020p0;
                }
                if (c3020p02 != null) {
                    itemAlbumMobile2.f42605w = c3020p02.f12022B.f12282d;
                    itemAlbumMobile2.f42564O = c3020p02.f12062u;
                    itemAlbumMobile2.f42599t = c3020p02.f12057p;
                    itemAlbumMobile2.f42548C = itemAlbumMobile2.m40526m0();
                    itemAlbumMobile2.m40528o0(c3020p02);
                }
                arrayList.add(itemAlbumMobile2);
            }
            bundle.putParcelableArrayList("medialist", arrayList);
            bundle.putBoolean("hasGridPhoto", true);
            bundle.putInt("currentIndex", c19055h0.f94931p);
        } else {
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            ItemAlbumMobile itemAlbumMobile3 = new ItemAlbumMobile(itemAlbumMobile);
            itemAlbumMobile3.f42605w = c3020p0.f12022B.f12282d;
            itemAlbumMobile3.f42564O = c3020p0.f12062u;
            itemAlbumMobile3.f42599t = c3020p0.f12057p;
            itemAlbumMobile3.f42548C = itemAlbumMobile3.m40526m0();
            itemAlbumMobile3.m40528o0(c3020p0);
            arrayList2.add(itemAlbumMobile3);
            bundle.putParcelableArrayList("medialist", arrayList2);
        }
        if (c3020p0.m14493X()) {
            bundle.putBoolean("viewOnly", true);
        }
        C8109g c8109g = new C8109g(c19055h0, feedItemPhotoModuleView);
        c8109g.m105886y(true);
        c8109g.m105865K(c19055h0.f94931p);
        feedItemPhotoModuleView.f44582w0.put(0, i12);
        c8109g.m105857C(feedItemPhotoModuleView.f44582w0);
        if (c3000l0.m14322a0() != null && !TextUtils.isEmpty(c3000l0.m14322a0().m14528u())) {
            c8109g.m105885x(false);
        }
        c8109g.m105861G(new C2370r0(view));
        c8109g.m105861G(new C2370r0(view));
        c8109g.m105862H(feedItemPhotoModuleView.f44572m0.m115374E1());
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11941Yk(AbstractC20826v0.m108747A(c16719g), itemAlbumMobile.f42607x, bundle, c8109g, c3020p0, trackingSource, true);
        }
        AbstractC23647d.m123893c();
    }

    /* renamed from: Z0 */
    public static final void m43933Z0(FeedItemPhotoModuleView feedItemPhotoModuleView, C3020p0 c3020p0, C16719g c16719g) {
        AbstractC19074t.m100208f(feedItemPhotoModuleView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        InterfaceC2260b interfaceC2260b = feedItemPhotoModuleView.f44578s0;
        if (interfaceC2260b != null) {
            interfaceC2260b.mo11977a(c3020p0, 0);
        }
    }

    private final C18565a getBackgroundFeedPhotoHelper() {
        return (C18565a) this.f44574o0.getValue();
    }

    private final C16716d getOverlayModule() {
        return (C16716d) this.f44575p0.getValue();
    }

    public final C16716d getPhotoContainer() {
        return (C16716d) this.f44573n0.getValue();
    }

    /* renamed from: O0 */
    public final void m43934O0(ItemAlbumMobile itemAlbumMobile) {
        AbstractC19074t.m100208f(itemAlbumMobile, "item");
        try {
            if (!this.f44580u0.isEmpty()) {
                this.f44582w0.clear();
                int m43915E0 = m43915E0(itemAlbumMobile);
                int size = this.f44580u0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (i11 == m43915E0) {
                        this.f44582w0.put(i11, 0);
                    } else {
                        this.f44582w0.put(i11, 2);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U0 */
    public final void m43935U0() {
        this.f44572m0.m65958z2();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
        AbstractC19074t.m100208f(c29106b, "dataObject");
        setFeedContent(c29106b.f134937a);
        m43696Y(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134941e, c29106b.f134942f);
        mo43698b0(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, true, c29106b.f134943g, c29106b.f134940d);
        m43936W0(c29106b.f134937a, 0, 0, null, c29106b.f134940d, c29106b.f134944h, c29106b.f134941e);
        m43700e0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:            if (fn0.AbstractC19074t.m100204b(r3, r2) != false) goto L105;     */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43936W0(C3000l0 c3000l0, int i11, int i12, View view, boolean z11, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a) {
        ItemAlbumMobile itemAlbumMobile;
        C24003n m120114b0;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            setScaleOption(m14324b0);
            if (!AbstractC23304d.f113420o2 && this.f44322M == 2) {
                setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.i3

                    /* renamed from: q */
                    public final /* synthetic */ C3000l0 f45423q;

                    public /* synthetic */ ViewOnClickListenerC8300i3(C3000l0 c3000l02) {
                        r2 = c3000l02;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FeedItemPhotoModuleView.m43931X0(InterfaceC2259a.this, r2, view2);
                    }
                });
            }
            ArrayList arrayList = m14324b0.f12023C.f12118i;
            if (arrayList == null || arrayList.size() <= 0 || (itemAlbumMobile = (ItemAlbumMobile) m14324b0.f12023C.f12118i.get(0)) == null) {
                return;
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            setTag(format);
            this.f44572m0.mo44614b1(0);
            this.f44572m0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.j3

                /* renamed from: q */
                public final /* synthetic */ int f45437q;

                /* renamed from: r */
                public final /* synthetic */ C3020p0 f45438r;

                /* renamed from: s */
                public final /* synthetic */ FeedItemPhotoModuleView f45439s;

                /* renamed from: t */
                public final /* synthetic */ ItemAlbumMobile f45440t;

                /* renamed from: u */
                public final /* synthetic */ int f45441u;

                /* renamed from: v */
                public final /* synthetic */ View f45442v;

                /* renamed from: w */
                public final /* synthetic */ InterfaceC2259a f45443w;

                /* renamed from: x */
                public final /* synthetic */ TrackingSource f45444x;

                public /* synthetic */ C8309j3(int i112, C3020p0 m14324b02, FeedItemPhotoModuleView this, ItemAlbumMobile itemAlbumMobile2, int i122, View view2, InterfaceC2259a interfaceC2259a2, TrackingSource trackingSource2) {
                    r2 = i112;
                    r3 = m14324b02;
                    r4 = this;
                    r5 = itemAlbumMobile2;
                    r6 = i122;
                    r7 = view2;
                    r8 = interfaceC2259a2;
                    r9 = trackingSource2;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedItemPhotoModuleView.m43932Y0(C3000l0.this, r2, r3, r4, r5, r6, r7, r8, r9, c16719g);
                }
            });
            this.f44572m0.m89111N0(new C16719g.d() { // from class: com.zing.zalo.feed.components.k3

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f45462q;

                public /* synthetic */ C8317k3(C3020p0 m14324b02) {
                    r2 = m14324b02;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    FeedItemPhotoModuleView.m43933Z0(FeedItemPhotoModuleView.this, r2, c16719g);
                }
            });
            boolean z12 = AbstractC23304d.m120536g().f147980a;
            int i13 = this.f44322M;
            if (i13 != 2 && i13 != 3) {
                if (i13 != 4) {
                    m120114b0 = C23278z2.m120111a0();
                    m120114b0.f116276q = true;
                } else {
                    m120114b0 = C23278z2.m120108Z();
                }
            } else {
                m120114b0 = C23278z2.m120114b0();
            }
            C24860q m43930V0 = m43930V0(itemAlbumMobile2);
            String str = (String) m43930V0.m129213a();
            C3979l.b bVar = (C3979l.b) m43930V0.m129214b();
            String str2 = (String) this.f44572m0.getTag(AbstractC6918a0.tag_photo_id_social_image_module);
            C20518d c20518d = null;
            if (str2 != null) {
                if (str2.length() == 0) {
                }
            }
            String str3 = itemAlbumMobile2.f42550D;
            if (str3 != null) {
                if (str3.length() == 0) {
                }
                m120114b0.f116261b = null;
                this.f44572m0.setTag(AbstractC6918a0.tag_photo_id_social_image_module, str);
                if (this.f44572m0.m115373D1() != null || m120114b0.f116261b != null) {
                    c20518d = new C20518d();
                }
                C22122a0.d m115396b = new C8110h().m115397c(c20518d).m115396b(6);
                AbstractC19074t.m100207e(m115396b, "animSource(...)");
                this.f44572m0.m115380N1(this.f44324O, str, m120114b0, bVar, m115396b, AbstractC23166o6.Companion.m119338b(this.f44322M));
            }
            Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed);
            m120114b0.f116261b = m118665N;
            this.f44572m0.mo111925v1(m118665N);
            this.f44572m0.setTag(AbstractC6918a0.tag_photo_id_social_image_module, str);
            if (this.f44572m0.m115373D1() != null) {
            }
            c20518d = new C20518d();
            C22122a0.d m115396b2 = new C8110h().m115397c(c20518d).m115396b(6);
            AbstractC19074t.m100207e(m115396b2, "animSource(...)");
            this.f44572m0.m115380N1(this.f44324O, str, m120114b0, bVar, m115396b2, AbstractC23166o6.Companion.m119338b(this.f44322M));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final ArrayList<ItemAlbumMobile> getAllPhotoUrls() {
        return this.f44580u0;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return AbstractC20826v0.m108795Y(this.f44572m0);
    }

    public final boolean getCanDisplayFullSizePhoto() {
        return this.f44576q0;
    }

    public final int[] getColorsLoading() {
        return this.f44583x0;
    }

    public final C11863k getImvPhoto() {
        return this.f44572m0;
    }

    public final List<C3000l0> getLstAllFeeds() {
        return this.f44579t0;
    }

    public final SparseIntArray getMMapPositions() {
        return this.f44582w0;
    }

    public final InterfaceC2260b getMPhotoLongClickListener() {
        return this.f44578s0;
    }

    public final Map<String, C3020p0> getMapPicIdFeedItem() {
        return this.f44581v0;
    }

    public final C16719g.c getOnGroupPhotoClickListener() {
        return this.f44577r0;
    }

    public final int getShrinkHeight() {
        return this.f44584y0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            this.f44576q0 = C23278z2.m120139l1();
            this.f44322M = i11;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 6) {
                                if (i11 == 11) {
                                    m43918H0(context);
                                }
                            } else {
                                m43920J0(context);
                            }
                        } else {
                            m43922L0(context, i11);
                        }
                    } else {
                        m43924N0();
                    }
                } else {
                    m43923M0(context, i11);
                }
            } else {
                m43921K0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43705j0(context, this.f44322M);
        m43919I0(this.f44322M);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getFeedItemSongInfoModule().m44570J1();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getFeedItemSongInfoModule().m44571K1();
    }

    public final void setAllPhotoUrls(ArrayList<ItemAlbumMobile> arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f44580u0 = arrayList;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public final void setCanDisplayFullSizePhoto(boolean z11) {
        this.f44576q0 = z11;
    }

    public final void setColorsLoading(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<set-?>");
        this.f44583x0 = iArr;
    }

    public final void setFeedList(List<? extends C3000l0> list) {
        if (list != null) {
            this.f44579t0 = list;
        }
        m43916F0();
    }

    public final void setImvPhoto(C11863k c11863k) {
        AbstractC19074t.m100208f(c11863k, "<set-?>");
        this.f44572m0 = c11863k;
    }

    public final void setLstAllFeeds(List<? extends C3000l0> list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f44579t0 = list;
    }

    public final void setMMapPositions(SparseIntArray sparseIntArray) {
        AbstractC19074t.m100208f(sparseIntArray, "<set-?>");
        this.f44582w0 = sparseIntArray;
    }

    public final void setMPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        this.f44578s0 = interfaceC2260b;
    }

    public final void setMapPicIdFeedItem(Map<String, C3020p0> map) {
        AbstractC19074t.m100208f(map, "<set-?>");
        this.f44581v0 = map;
    }

    public final void setOnGroupPhotoClickListener(C16719g.c cVar) {
        this.f44577r0 = cVar;
    }

    public final void setPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        this.f44578s0 = interfaceC2260b;
    }

    public final void setScaleOption(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        C23307g c23307g;
        int i11;
        try {
            int i12 = this.f44322M;
            if (i12 != 1) {
                int i13 = 2;
                if (i12 != 2) {
                    if (this.f44576q0 && c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (c23307g = c3025q0.f12119j) != null) {
                        int i14 = c23307g.f113474a;
                        if (i14 > 0 && (i11 = c23307g.f113475b) > 0) {
                            this.f44572m0.m65868d2(i11 / i14);
                            this.f44572m0.m65867c2(f44570z0);
                            C11863k c11863k = this.f44572m0;
                            if (this.f44322M != 11) {
                                i13 = 7;
                            }
                            c11863k.m65869e2(i13);
                            this.f44572m0.m65866b2(this.f44571l0);
                        } else if (i12 == 4) {
                            this.f44572m0.m65869e2(0);
                        } else {
                            this.f44572m0.m65869e2(1);
                        }
                    } else {
                        this.f44572m0.m65868d2(-1.0f);
                        if (this.f44322M == 4) {
                            this.f44572m0.m65869e2(0);
                        } else {
                            this.f44572m0.m65869e2(1);
                        }
                    }
                    this.f44572m0.requestLayout();
                }
            }
            this.f44572m0.m65869e2(1);
            this.f44572m0.requestLayout();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final void setShrinkHeight(int i11) {
        if (i11 > 0 && i11 != this.f44584y0 && this.f44322M == 11) {
            this.f44584y0 = i11;
            float m89114P = this.f44572m0.m89114P();
            float m89112O = this.f44572m0.m89112O();
            if (m89114P > 0.0f && m89112O > this.f44584y0) {
                this.f44572m0.m65869e2(3);
                this.f44572m0.m65868d2((m89112O - this.f44584y0) / m89114P);
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: t0 */
    protected void mo43876t0() {
        C3020p0 m14322a0;
        C3025q0 c3025q0;
        ArrayList arrayList;
        Object m131207g0;
        C3000l0 c3000l0 = this.f44331V;
        if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null && (c3025q0 = m14322a0.f12023C) != null && (arrayList = c3025q0.f12118i) != null) {
            m131207g0 = AbstractC25332a0.m131207g0(arrayList, 0);
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) m131207g0;
            if (itemAlbumMobile != null) {
                if (getFeedMusicData() != null) {
                    C18565a backgroundFeedPhotoHelper = getBackgroundFeedPhotoHelper();
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    String str = itemAlbumMobile.f42548C;
                    AbstractC19074t.m100207e(str, "thumbnail");
                    backgroundFeedPhotoHelper.m98028e(context, str, 0, new C8105c());
                    return;
                }
                C18565a backgroundFeedPhotoHelper2 = getBackgroundFeedPhotoHelper();
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                backgroundFeedPhotoHelper2.m98029h(context2, new C8106d());
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: u0 */
    protected void mo43877u0(C3000l0 c3000l0, Integer num) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: v0 */
    protected void mo43878v0() {
        C3020p0 m14322a0;
        C3000l0 c3000l0 = this.f44331V;
        if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null) {
            getFeedItemSongInfoModule().m44572M1(m14322a0);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: w0 */
    protected void mo43879w0() {
        getOverlayModule().mo44614b1(8);
        this.f44572m0.mo111927x1(AbstractC23136l9.m118742r(0.0f));
        if (this.f44576q0) {
            this.f44572m0.m89106L().m89031O(AbstractC23136l9.m118742r(0.0f));
        } else {
            this.f44572m0.m89106L().m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left)).m89036T(0).m89035S(0).m89033Q(0);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: x0 */
    protected void mo43880x0() {
        getOverlayModule().mo44614b1(0);
        C16716d overlayModule = getOverlayModule();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        overlayModule.m89085A0(C27280g.m139658a(context, AbstractC16803z.bg_music_feed_item_overlay));
        this.f44572m0.mo111927x1(AbstractC23136l9.m118742r(4.0f));
        if (this.f44576q0) {
            this.f44572m0.m89106L().m89032P(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f), 0);
        } else {
            this.f44572m0.m89106L().m89032P(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f), 0);
        }
    }

    public FeedItemPhotoModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f44572m0 = new C11863k(context2);
        m129210a = AbstractC24856m.m129210a(new C8108f());
        this.f44573n0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8104b.f44585q);
        this.f44574o0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8107e());
        this.f44575p0 = m129210a3;
        this.f44579t0 = new ArrayList();
        this.f44580u0 = new ArrayList();
        this.f44581v0 = new HashMap();
        this.f44582w0 = new SparseIntArray();
        this.f44583x0 = new int[]{-1184275, -5723992};
    }
}
