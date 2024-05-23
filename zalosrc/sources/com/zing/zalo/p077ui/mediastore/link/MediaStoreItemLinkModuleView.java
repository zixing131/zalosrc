package com.zing.zalo.p077ui.mediastore.link;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.mediastore.link.MediaStoreItemLinkModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import id0.C20518d;
import java.util.List;
import java.util.Locale;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23250w4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p560uw.EnumC27374a;
import p716zh.C31944h6;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import ui0.C27280g;
import vc0.InterfaceC27965d;
import vc0.InterfaceC27968g;

/* loaded from: classes6.dex */
public final class MediaStoreItemLinkModuleView extends ModulesView implements C16719g.c, InterfaceC27968g {

    /* renamed from: K */
    private int f64376K;

    /* renamed from: L */
    private int f64377L;

    /* renamed from: M */
    private int f64378M;

    /* renamed from: N */
    private int f64379N;

    /* renamed from: O */
    private C21693c f64380O;

    /* renamed from: P */
    private C22126c0 f64381P;

    /* renamed from: Q */
    private C22126c0 f64382Q;

    /* renamed from: R */
    private C22126c0 f64383R;

    /* renamed from: S */
    private C21693c f64384S;

    /* renamed from: T */
    private C16719g f64385T;

    /* renamed from: U */
    private C16716d f64386U;

    /* renamed from: V */
    private InterfaceC12373a f64387V;

    /* renamed from: W */
    private C23528a f64388W;

    /* renamed from: a0 */
    private C3977j f64389a0;

    /* renamed from: b0 */
    private C21691a f64390b0;

    /* renamed from: c0 */
    private final InterfaceC24854k f64391c0;

    /* renamed from: d0 */
    private final InterfaceC24854k f64392d0;

    /* renamed from: e0 */
    private MediaStoreItem f64393e0;

    /* renamed from: f0 */
    private Runnable f64394f0;

    /* renamed from: g0 */
    private Handler f64395g0;

    /* renamed from: h0 */
    private boolean f64396h0;

    /* renamed from: i0 */
    private C16716d f64397i0;

    /* renamed from: j0 */
    private C16716d f64398j0;

    /* renamed from: k0 */
    private C16977g f64399k0;

    /* renamed from: l0 */
    private int f64400l0;

    /* renamed from: com.zing.zalo.ui.mediastore.link.MediaStoreItemLinkModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12373a {
        /* renamed from: a */
        void mo36876a(MediaStoreItem mediaStoreItem, boolean z11, int i11);

        /* renamed from: b */
        void mo36877b(View view, MediaStoreItem mediaStoreItem);

        /* renamed from: c */
        void mo36878c(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, MediaStoreItem mediaStoreItem);

        /* renamed from: d */
        void mo36879d(View view, MediaStoreItem mediaStoreItem, int i11);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.link.MediaStoreItemLinkModuleView$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12374b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64401a;

        static {
            int[] iArr = new int[EnumC27374a.values().length];
            try {
                iArr[EnumC27374a.f128968u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27374a.f128967t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64401a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.link.MediaStoreItemLinkModuleView$c */
    /* loaded from: classes6.dex */
    static final class C12375c extends AbstractC19075u implements InterfaceC18494a {
        C12375c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreItemLinkModuleView.this.getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.link.MediaStoreItemLinkModuleView$d */
    /* loaded from: classes6.dex */
    static final class C12376d extends AbstractC19075u implements InterfaceC18494a {
        C12376d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreItemLinkModuleView.this.getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.link.MediaStoreItemLinkModuleView$e */
    /* loaded from: classes6.dex */
    public static final class C12377e extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ boolean f64405m1;

        C12377e(boolean z11) {
            this.f64405m1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                C21693c c21693c = MediaStoreItemLinkModuleView.this.f64380O;
                C21693c c21693c2 = null;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("imvThumb");
                    c21693c = null;
                }
                if (c21693c.m89133b0() != null) {
                    C21693c c21693c3 = MediaStoreItemLinkModuleView.this.f64380O;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("imvThumb");
                        c21693c3 = null;
                    }
                    if (AbstractC19074t.m100204b(c21693c3.m89133b0(), str) && c3979l != null) {
                        C3977j c3977j = MediaStoreItemLinkModuleView.this.f64389a0;
                        if (c3977j != null) {
                            c3977j.setImageInfo(c3979l, false);
                        }
                        if (this.f64405m1) {
                            C21693c c21693c4 = MediaStoreItemLinkModuleView.this.f64380O;
                            if (c21693c4 == null) {
                                AbstractC19074t.m100223u("imvThumb");
                            } else {
                                c21693c2 = c21693c4;
                            }
                            c21693c2.mo111924u1(c3979l.m18839c());
                            return;
                        }
                        C21693c c21693c5 = MediaStoreItemLinkModuleView.this.f64380O;
                        if (c21693c5 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                            c21693c5 = null;
                        }
                        c21693c5.mo111924u1(c3979l.m18839c());
                        C21693c c21693c6 = MediaStoreItemLinkModuleView.this.f64380O;
                        if (c21693c6 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                        } else {
                            c21693c2 = c21693c6;
                        }
                        c21693c2.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemLinkModuleView(Context context, boolean z11) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f64376K = AbstractC23136l9.m118742r(66.0f);
        this.f64377L = AbstractC23136l9.m118742r(66.0f);
        this.f64378M = AbstractC23136l9.m118742r(12.0f);
        this.f64379N = AbstractC23136l9.m118742r(16.0f);
        m129210a = AbstractC24856m.m129210a(new C12376d());
        this.f64391c0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12375c());
        this.f64392d0 = m129210a2;
        this.f64395g0 = new Handler(Looper.getMainLooper());
        this.f64396h0 = z11;
        m69554d0(context);
    }

    /* renamed from: c0 */
    private final void m69553c0() {
        Runnable runnable = this.f64394f0;
        if (runnable != null) {
            this.f64395g0.removeCallbacks(runnable);
            this.f64394f0 = null;
        }
    }

    /* renamed from: d0 */
    private final void m69554d0(Context context) {
        int i11;
        int i12;
        setId(AbstractC6918a0.link_tab_item);
        mo44090O();
        this.f64388W = new C23528a(context);
        this.f64389a0 = new C3977j(context);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89060k0(-1).m89030N(-2).m89044a0(this.f64378M);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f64386U = c16716d;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89030N(this.f64377L).m89060k0(this.f64376K);
        c21693c.m111929z1(5);
        c21693c.mo111926w1(AbstractC16803z.chat_icloud_default);
        c21693c.mo111927x1(AbstractC23136l9.m118742r(6.0f));
        this.f64380O = c21693c;
        C16977g c16977g = new C16977g(context);
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
        c16974f.m90971u(EnumC16980h.SIZE_24);
        c16977g.m90983u1(c16974f);
        c16977g.m89106L().m89028L(-2, -2).m89025I(true);
        this.f64399k0 = c16977g;
        C16716d c16716d2 = new C16716d(context);
        C16977g c16977g2 = this.f64399k0;
        C16716d c16716d3 = null;
        if (c16977g2 == null) {
            AbstractC19074t.m100223u("badgeWarning");
            c16977g2 = null;
        }
        c16716d2.m89001g1(c16977g2);
        c16716d2.m89106L().m89028L(this.f64376K, this.f64377L).m89025I(true);
        c16716d2.m89085A0(C27280g.m139658a(context, AbstractC16803z.badge_warning_background));
        this.f64397i0 = c16716d2;
        C16716d c16716d4 = new C16716d(context);
        c16716d4.m89106L().m89028L(-2, -2).m89034R(this.f64379N).m89035S(this.f64379N).m89041Y(1);
        C21693c c21693c2 = this.f64380O;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c21693c2 = null;
        }
        c16716d4.m89001g1(c21693c2);
        this.f64398j0 = c16716d4;
        C16716d c16716d5 = this.f64386U;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d5 = null;
        }
        C16716d c16716d6 = this.f64398j0;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("thumbGroupModule");
            c16716d6 = null;
        }
        c16716d5.m89001g1(c16716d6);
        if (this.f64396h0) {
            Drawable mDrawableNormal = getMDrawableNormal();
            if (mDrawableNormal != null) {
                i11 = mDrawableNormal.getIntrinsicWidth();
            } else {
                i11 = AbstractC23222t7.f112514B;
            }
            Drawable mDrawableNormal2 = getMDrawableNormal();
            if (mDrawableNormal2 != null) {
                i12 = mDrawableNormal2.getIntrinsicHeight();
            } else {
                i12 = AbstractC23222t7.f112514B;
            }
            Size size = new Size(i11, i12);
            C21691a c21691a = new C21691a(context);
            c21691a.m89106L().m89060k0(size.getWidth() + (this.f64379N * 2)).m89030N(size.getHeight() + (this.f64379N * 2)).m89041Y(this.f64379N).m89027K(true).m89017A(Boolean.TRUE);
            c21691a.m111906k1(getMDrawableNormal());
            c21691a.m111905j1(getMDrawableChecked());
            c21691a.mo89093E0(false);
            this.f64390b0 = c21691a;
            C16716d c16716d7 = this.f64386U;
            if (c16716d7 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d7 = null;
            }
            c16716d7.m89001g1(c21691a);
        } else {
            C21693c c21693c3 = new C21693c(context);
            c21693c3.m89106L().m89030N(-2).m89060k0(-2).m89041Y(this.f64379N).m89027K(true).m89017A(Boolean.TRUE);
            c21693c3.m111929z1(5);
            c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_more_horizontal_solid_24, AbstractC2807a.icon_01));
            this.f64384S = c21693c3;
            C16716d c16716d8 = this.f64386U;
            if (c16716d8 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d8 = null;
            }
            c16716d8.m89001g1(c21693c3);
        }
        C16716d c16716d9 = new C16716d(context);
        C16718f m89027K = c16716d9.m89106L().m89030N(-2).m89060k0(-2).m89027K(true);
        C16716d c16716d10 = this.f64398j0;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("thumbGroupModule");
            c16716d10 = null;
        }
        m89027K.m89054h0(c16716d10).m89049e0(this.f64384S);
        if (this.f64396h0) {
            c16716d9.m89106L().m89049e0(this.f64390b0);
        }
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89060k0(-1).m89030N(-2);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(10.0f));
        this.f64381P = c22126c0;
        c16716d9.m89001g1(c22126c0);
        C22126c0 c22126c02 = new C22126c0(context);
        C16718f m89030N = c22126c02.m89106L().m89060k0(-1).m89030N(-2);
        C22126c0 c22126c03 = this.f64381P;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c03 = null;
        }
        m89030N.m89023G(c22126c03);
        c22126c02.m111953A1(2);
        c22126c02.m111980v1(truncateAt);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        this.f64383R = c22126c02;
        c16716d9.m89001g1(c22126c02);
        C22126c0 c22126c04 = new C22126c0(context);
        C16718f m89036T = c22126c04.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22126c0 c22126c05 = this.f64383R;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c22126c05 = null;
        }
        m89036T.m89023G(c22126c05);
        c22126c04.m111953A1(1);
        c22126c04.m111980v1(truncateAt);
        c22126c04.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c04.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f64382Q = c22126c04;
        c16716d9.m89001g1(c22126c04);
        C16716d c16716d11 = this.f64386U;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d11 = null;
        }
        c16716d11.m89001g1(c16716d9);
        C16716d c16716d12 = this.f64386U;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d12 = null;
        }
        mo69681L(c16716d12);
        C16719g c16719g = new C16719g(context);
        C16718f m89034R = c16719g.m89106L().m89030N(1).m89060k0(-1).m89034R(AbstractC23136l9.m118742r(98.0f));
        C16716d c16716d13 = this.f64386U;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
        } else {
            c16716d3 = c16716d13;
        }
        m89034R.m89023G(c16716d3);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64385T = c16719g;
        mo69681L(c16719g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m69555g0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, String str, boolean z11) {
        C23528a c23528a;
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC19074t.m100208f(str, "$thumbUrl");
        C23528a c23528a2 = mediaStoreItemLinkModuleView.f64388W;
        if (c23528a2 != null && (c23528a = (C23528a) c23528a2.m123612r(mediaStoreItemLinkModuleView.f64389a0)) != null) {
        }
    }

    private final MediaStoreItem getItemData() {
        MediaStoreItem mediaStoreItem = this.f64393e0;
        if (mediaStoreItem != null) {
            return mediaStoreItem;
        }
        return null;
    }

    private final Drawable getMDrawableChecked() {
        return (Drawable) this.f64392d0.getValue();
    }

    private final Drawable getMDrawableNormal() {
        return (Drawable) this.f64391c0.getValue();
    }

    private final Rect getRectView() {
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            C16716d c16716d = this.f64386U;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d = null;
            }
            int m89114P = c16716d.m89114P() + i11;
            C16716d c16716d2 = this.f64386U;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d2 = null;
            }
            return new Rect(i11, i12, m89114P, c16716d2.m89112O() + i12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: h0 */
    private final void m69556h0(final MediaStoreItem mediaStoreItem, final int i11) {
        C21693c c21693c = this.f64384S;
        if (c21693c != null) {
            c21693c.mo89109M0(new C16719g.c() { // from class: b80.b
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    MediaStoreItemLinkModuleView.m69557i0(MediaStoreItemLinkModuleView.this, mediaStoreItem, c16719g);
                }
            });
        }
        C16716d c16716d = this.f64386U;
        C16716d c16716d2 = null;
        if (c16716d == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d = null;
        }
        c16716d.mo89109M0(new C16719g.c() { // from class: b80.c
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaStoreItemLinkModuleView.m69558j0(MediaStoreItemLinkModuleView.this, mediaStoreItem, c16719g);
            }
        });
        C16716d c16716d3 = this.f64386U;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
        } else {
            c16716d2 = c16716d3;
        }
        c16716d2.m89111N0(new C16719g.d() { // from class: b80.d
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                MediaStoreItemLinkModuleView.m69559k0(MediaStoreItemLinkModuleView.this, mediaStoreItem, i11, c16719g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m69557i0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        AbstractC23647d.m123897g("1001516");
        InterfaceC12373a interfaceC12373a = mediaStoreItemLinkModuleView.f64387V;
        if (interfaceC12373a != null) {
            interfaceC12373a.mo36877b(mediaStoreItemLinkModuleView, mediaStoreItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m69558j0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        if (mediaStoreItemLinkModuleView.f64396h0) {
            InterfaceC12373a interfaceC12373a = mediaStoreItemLinkModuleView.f64387V;
            if (interfaceC12373a != null) {
                interfaceC12373a.mo36876a(mediaStoreItem, !mediaStoreItem.m40597k0(), mediaStoreItemLinkModuleView.f64400l0);
                return;
            }
            return;
        }
        InterfaceC12373a interfaceC12373a2 = mediaStoreItemLinkModuleView.f64387V;
        if (interfaceC12373a2 != null) {
            interfaceC12373a2.mo36878c(mediaStoreItemLinkModuleView, mediaStoreItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m69559k0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, MediaStoreItem mediaStoreItem, int i11, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        InterfaceC12373a interfaceC12373a = mediaStoreItemLinkModuleView.f64387V;
        if (interfaceC12373a != null) {
            interfaceC12373a.mo36879d(mediaStoreItemLinkModuleView, mediaStoreItem, i11);
        }
    }

    /* renamed from: l0 */
    private final void m69560l0(EnumC27374a enumC27374a) {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16974f c16974f = new C16974f(context);
        c16974f.m90971u(EnumC16980h.SIZE_24);
        int i11 = C12374b.f64401a[enumC27374a.ordinal()];
        C16977g c16977g = null;
        if (i11 != 1) {
            if (i11 == 2) {
                c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
                C16716d c16716d = this.f64397i0;
                if (c16716d == null) {
                    AbstractC19074t.m100223u("badgeWarningThumbGroup");
                    c16716d = null;
                }
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                c16716d.m89085A0(C27280g.m139660c(context2, AbstractC16803z.badge_warning_background, AbstractC2807a.accent_yellow_background_subtle));
            }
        } else {
            c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_DANGER);
            C16716d c16716d2 = this.f64397i0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("badgeWarningThumbGroup");
                c16716d2 = null;
            }
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            c16716d2.m89085A0(C27280g.m139660c(context3, AbstractC16803z.badge_warning_background, AbstractC2807a.accent_orange_background_subtle));
        }
        C16977g c16977g2 = this.f64399k0;
        if (c16977g2 == null) {
            AbstractC19074t.m100223u("badgeWarning");
        } else {
            c16977g = c16977g2;
        }
        c16977g.m90983u1(c16974f);
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m69561n0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mediaStoreItemLinkModuleView.m69564m0(z11);
    }

    @Override // vc0.InterfaceC27968g
    /* renamed from: F */
    public void mo69522F() {
        boolean z11;
        C21691a c21691a = this.f64390b0;
        if (c21691a != null) {
            MediaStoreItem itemData = getItemData();
            if (itemData != null) {
                z11 = itemData.m40597k0();
            } else {
                z11 = false;
            }
            c21691a.mo89091D0(z11);
        }
    }

    @Override // vc0.InterfaceC27968g
    /* renamed from: J */
    public Rect mo69523J(int i11) {
        Rect rectView = getRectView();
        if (rectView == null) {
            return new Rect();
        }
        return rectView;
    }

    /* renamed from: e0 */
    public final void m69562e0() {
        try {
            C21693c c21693c = this.f64380O;
            if (c21693c == null) {
                AbstractC19074t.m100223u("imvThumb");
                c21693c = null;
            }
            c21693c.m89129Y0(null);
            m69553c0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f0 */
    public final void m69563f0(C7905c c7905c, int i11, boolean z11) {
        String str;
        if (c7905c != null) {
            try {
                MediaStoreItem m40788g = c7905c.m40788g();
                if (m40788g != null) {
                    this.f64400l0 = i11;
                    m69553c0();
                    this.f64393e0 = m40788g;
                    String m153552r = C31944h6.m153552r(m40788g.m40579W());
                    if (m153552r != null) {
                        Locale locale = Locale.getDefault();
                        AbstractC19074t.m100207e(locale, "getDefault(...)");
                        str = m153552r.toUpperCase(locale);
                        AbstractC19074t.m100207e(str, "toUpperCase(...)");
                    } else {
                        str = null;
                    }
                    C22126c0 c22126c0 = this.f64381P;
                    if (c22126c0 == null) {
                        AbstractC19074t.m100223u("tvTitle");
                        c22126c0 = null;
                    }
                    c22126c0.m111959G1(str);
                    if (m40788g.m40599m().m95287w7()) {
                        C22126c0 c22126c02 = this.f64383R;
                        if (c22126c02 == null) {
                            AbstractC19074t.m100223u("tvSubtitle");
                            c22126c02 = null;
                        }
                        c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.unsafe_link_warning));
                    } else {
                        if (!TextUtils.isEmpty(m40788g.m40578V()) && !AbstractC19074t.m100204b(m40788g.m40578V(), m40788g.m40599m().m95090b5())) {
                            C22126c0 c22126c03 = this.f64383R;
                            if (c22126c03 == null) {
                                AbstractC19074t.m100223u("tvSubtitle");
                                c22126c03 = null;
                            }
                            c22126c03.m111959G1(m40788g.m40578V());
                        }
                        C22126c0 c22126c04 = this.f64383R;
                        if (c22126c04 == null) {
                            AbstractC19074t.m100223u("tvSubtitle");
                            c22126c04 = null;
                        }
                        String m95090b5 = m40788g.m40599m().m95090b5();
                        if (m95090b5.length() == 0) {
                            m95090b5 = "Link";
                        }
                        c22126c04.m111959G1(m95090b5);
                    }
                    String m94862C4 = m40788g.m40599m().m94862C4();
                    if (m94862C4 == null) {
                        m94862C4 = "";
                    }
                    String m119788L = C23250w4.m119788L(m94862C4, m40788g.m40599m().m94854B4());
                    C22126c0 c22126c05 = this.f64382Q;
                    if (c22126c05 == null) {
                        AbstractC19074t.m100223u("tvExtraInfo");
                        c22126c05 = null;
                    }
                    c22126c05.m111959G1(m119788L);
                    C21693c c21693c = this.f64380O;
                    if (c21693c == null) {
                        AbstractC19074t.m100223u("imvThumb");
                        c21693c = null;
                    }
                    c21693c.mo111926w1(AbstractC16803z.chat_icloud_default);
                    final String m95266u2 = m40788g.m40599m().m95266u2();
                    AbstractC19074t.m100207e(m95266u2, "extractThumbUrl(...)");
                    boolean m95026V0 = m40788g.m40599m().m95026V0();
                    C16716d c16716d = this.f64398j0;
                    if (c16716d == null) {
                        AbstractC19074t.m100223u("thumbGroupModule");
                        c16716d = null;
                    }
                    c16716d.m89003j1();
                    if (m40788g.m40599m().m95287w7()) {
                        EnumC27374a m95097c4 = m40788g.m40599m().m95097c4();
                        AbstractC19074t.m100207e(m95097c4, "getMsgWarningTypeLink(...)");
                        m69560l0(m95097c4);
                        C16716d c16716d2 = this.f64398j0;
                        if (c16716d2 == null) {
                            AbstractC19074t.m100223u("thumbGroupModule");
                            c16716d2 = null;
                        }
                        C16716d c16716d3 = this.f64397i0;
                        if (c16716d3 == null) {
                            AbstractC19074t.m100223u("badgeWarningThumbGroup");
                            c16716d3 = null;
                        }
                        c16716d2.m89001g1(c16716d3);
                    } else if (!TextUtils.isEmpty(m95266u2) && m95026V0) {
                        C16716d c16716d4 = this.f64398j0;
                        if (c16716d4 == null) {
                            AbstractC19074t.m100223u("thumbGroupModule");
                            c16716d4 = null;
                        }
                        C21693c c21693c2 = this.f64380O;
                        if (c21693c2 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                            c21693c2 = null;
                        }
                        c16716d4.m89001g1(c21693c2);
                        final boolean m125696L2 = C23999j.m125696L2(m95266u2, C23278z2.m120126f0());
                        C21693c c21693c3 = this.f64380O;
                        if (c21693c3 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                            c21693c3 = null;
                        }
                        c21693c3.m89129Y0(m95266u2);
                        Runnable runnable = new Runnable() { // from class: b80.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaStoreItemLinkModuleView.m69555g0(MediaStoreItemLinkModuleView.this, m95266u2, m125696L2);
                            }
                        };
                        if (!m125696L2 && z11) {
                            if (C23250w4.f112644a.m119843q()) {
                                runnable.run();
                            }
                        }
                        runnable.run();
                    } else {
                        C16716d c16716d5 = this.f64398j0;
                        if (c16716d5 == null) {
                            AbstractC19074t.m100223u("thumbGroupModule");
                            c16716d5 = null;
                        }
                        C21693c c21693c4 = this.f64380O;
                        if (c21693c4 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                            c21693c4 = null;
                        }
                        c16716d5.m89001g1(c21693c4);
                        if (str != null && str.length() != 0) {
                            C21693c c21693c5 = this.f64380O;
                            if (c21693c5 == null) {
                                AbstractC19074t.m100223u("imvThumb");
                                c21693c5 = null;
                            }
                            c21693c5.mo111925v1(C23250w4.f112644a.m119821H(str, m40788g.m40579W()));
                        }
                    }
                    m69561n0(this, false, 1, null);
                    m69556h0(m40788g, i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // vc0.InterfaceC27968g
    public List<InterfaceC27965d> getDragItems() {
        List<InterfaceC27965d> m131506n;
        m131506n = AbstractC25368s.m131506n(getItemData());
        return m131506n;
    }

    @Override // vc0.InterfaceC27968g
    public int getDragPosition() {
        return this.f64400l0;
    }

    /* renamed from: m0 */
    public final void m69564m0(boolean z11) {
        C21691a c21691a;
        MediaStoreItem mediaStoreItem = this.f64393e0;
        if (mediaStoreItem != null) {
            C21691a c21691a2 = this.f64390b0;
            if ((c21691a2 == null || c21691a2.m89141i0() != mediaStoreItem.m40597k0()) && (c21691a = this.f64390b0) != null) {
                c21691a.m111904i1(mediaStoreItem.m40597k0(), z11);
            }
        }
    }

    public final void setEnableMultiSelect(boolean z11) {
        if (this.f64396h0 != z11) {
            this.f64396h0 = z11;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m69554d0(context);
            m69561n0(this, false, 1, null);
        }
    }

    public final void setLinkListener(InterfaceC12373a interfaceC12373a) {
        this.f64387V = interfaceC12373a;
    }

    public final void setPaddingTopLayoutLinkFile(int i11) {
        C16716d c16716d = this.f64386U;
        if (c16716d == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d = null;
        }
        c16716d.m89106L().m89042Z(0, i11, 0, AbstractC23136l9.m118742r(12.0f));
    }

    public final void setVisibilityCline(boolean z11) {
        int i11;
        C16719g c16719g = this.f64385T;
        if (c16719g != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c16719g.mo44614b1(i11);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "module");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemLinkModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f64376K = AbstractC23136l9.m118742r(66.0f);
        this.f64377L = AbstractC23136l9.m118742r(66.0f);
        this.f64378M = AbstractC23136l9.m118742r(12.0f);
        this.f64379N = AbstractC23136l9.m118742r(16.0f);
        m129210a = AbstractC24856m.m129210a(new C12376d());
        this.f64391c0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12375c());
        this.f64392d0 = m129210a2;
        this.f64395g0 = new Handler(Looper.getMainLooper());
        m69554d0(context);
    }
}
