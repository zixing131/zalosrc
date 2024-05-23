package com.zing.zalo.p077ui.moduleview.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView;
import com.zing.zalo.p077ui.moduleview.search.MediaStoreItemLinkModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17450b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hd0.C20003a;
import id0.C20518d;
import java.util.Locale;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23228u2;
import me0.C23212s8;
import me0.C23250w4;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class MediaStoreItemLinkModuleView extends ModulesView implements C16719g.c {

    /* renamed from: K */
    private final int f65113K;

    /* renamed from: L */
    private final int f65114L;

    /* renamed from: M */
    private final int f65115M;

    /* renamed from: N */
    private final int f65116N;

    /* renamed from: O */
    private C21693c f65117O;

    /* renamed from: P */
    private C22126c0 f65118P;

    /* renamed from: Q */
    private C22126c0 f65119Q;

    /* renamed from: R */
    private C22126c0 f65120R;

    /* renamed from: S */
    private C22126c0 f65121S;

    /* renamed from: T */
    private C21693c f65122T;

    /* renamed from: U */
    private C16719g f65123U;

    /* renamed from: V */
    private C16716d f65124V;

    /* renamed from: W */
    private InterfaceC12454a f65125W;

    /* renamed from: a0 */
    private C23528a f65126a0;

    /* renamed from: b0 */
    private C3977j f65127b0;

    /* renamed from: c0 */
    private C21691a f65128c0;

    /* renamed from: d0 */
    private Drawable f65129d0;

    /* renamed from: e0 */
    private Drawable f65130e0;

    /* renamed from: f0 */
    private MediaStoreItem f65131f0;

    /* renamed from: g0 */
    private Runnable f65132g0;

    /* renamed from: h0 */
    private Handler f65133h0;

    /* renamed from: i0 */
    private boolean f65134i0;

    /* renamed from: j0 */
    private final InterfaceC24854k f65135j0;

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemLinkModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12454a {
        /* renamed from: a */
        void mo69921a(View view);

        /* renamed from: b */
        void mo69922b(View view);

        /* renamed from: c */
        void mo69923c(MediaStoreItem mediaStoreItem, boolean z11);

        /* renamed from: d */
        void mo69924d(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView);
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemLinkModuleView$b */
    /* loaded from: classes6.dex */
    static final class C12455b extends AbstractC19075u implements InterfaceC18494a {
        C12455b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(MediaStoreItemLinkModuleView.this.getContext(), 80.0f));
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemLinkModuleView$c */
    /* loaded from: classes6.dex */
    public static final class C12456c extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ boolean f65138m1;

        C12456c(boolean z11) {
            this.f65138m1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                C21693c c21693c = MediaStoreItemLinkModuleView.this.f65117O;
                C21693c c21693c2 = null;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("imvThumb");
                    c21693c = null;
                }
                if (c21693c.m89133b0() != null) {
                    C21693c c21693c3 = MediaStoreItemLinkModuleView.this.f65117O;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("imvThumb");
                        c21693c3 = null;
                    }
                    if (AbstractC19074t.m100204b(c21693c3.m89133b0(), str) && c3979l != null) {
                        C3977j c3977j = MediaStoreItemLinkModuleView.this.f65127b0;
                        AbstractC19074t.m100205c(c3977j);
                        c3977j.setImageInfo(c3979l, false);
                        if (this.f65138m1) {
                            C21693c c21693c4 = MediaStoreItemLinkModuleView.this.f65117O;
                            if (c21693c4 == null) {
                                AbstractC19074t.m100223u("imvThumb");
                            } else {
                                c21693c2 = c21693c4;
                            }
                            c21693c2.mo111924u1(c3979l.m18839c());
                            return;
                        }
                        C21693c c21693c5 = MediaStoreItemLinkModuleView.this.f65117O;
                        if (c21693c5 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                            c21693c5 = null;
                        }
                        c21693c5.mo111924u1(c3979l.m18839c());
                        C21693c c21693c6 = MediaStoreItemLinkModuleView.this.f65117O;
                        if (c21693c6 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                        } else {
                            c21693c2 = c21693c6;
                        }
                        c21693c2.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemLinkModuleView(Context context, boolean z11) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f65113K = AbstractC23136l9.m118742r(48.0f);
        this.f65114L = AbstractC23136l9.m118742r(48.0f);
        this.f65115M = AbstractC23136l9.m118742r(12.0f);
        this.f65116N = AbstractC23136l9.m118742r(16.0f);
        this.f65133h0 = new Handler(Looper.getMainLooper());
        m129210a = AbstractC24856m.m129210a(new C12455b());
        this.f65135j0 = m129210a;
        this.f65134i0 = z11;
        m69913e0(context);
    }

    /* renamed from: d0 */
    private final void m69912d0() {
        Runnable runnable = this.f65132g0;
        if (runnable != null) {
            Handler handler = this.f65133h0;
            AbstractC19074t.m100205c(runnable);
            handler.removeCallbacks(runnable);
            this.f65132g0 = null;
        }
    }

    /* renamed from: e0 */
    private final void m69913e0(final Context context) {
        C16716d c16716d;
        mo44090O();
        this.f65126a0 = new C23528a(context);
        this.f65127b0 = new C3977j(context);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89060k0(-1).m89030N(-2).m89044a0(this.f65115M);
        c16716d2.m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
        this.f65124V = c16716d2;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89030N(this.f65114L).m89060k0(this.f65113K).m89034R(this.f65116N).m89035S(this.f65116N).m89027K(true).m89041Y(1);
        c21693c.m111929z1(5);
        c21693c.mo111926w1(AbstractC16803z.ic_link_broken);
        c21693c.mo111927x1(AbstractC23136l9.m118742r(6.0f));
        this.f65117O = c21693c;
        C16716d c16716d3 = this.f65124V;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d3 = null;
        }
        C21693c c21693c2 = this.f65117O;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c21693c2 = null;
        }
        c16716d3.m89001g1(c21693c2);
        if (this.f65134i0) {
            if (this.f65129d0 == null) {
                this.f65129d0 = AbstractC23136l9.m118665N(context, AbstractC16803z.ic_unchecked_radio_button_header);
            }
            if (this.f65130e0 == null) {
                this.f65130e0 = AbstractC23136l9.m118665N(context, AbstractC16803z.btn_radio_on_holo_light);
            }
            C21691a c21691a = new C21691a(context);
            C16718f m89106L = c21691a.m89106L();
            Drawable drawable = this.f65129d0;
            AbstractC19074t.m100205c(drawable);
            C16718f m89060k0 = m89106L.m89060k0(drawable.getIntrinsicWidth() + (this.f65116N * 2));
            Drawable drawable2 = this.f65129d0;
            AbstractC19074t.m100205c(drawable2);
            m89060k0.m89030N(drawable2.getIntrinsicHeight() + (this.f65116N * 2)).m89041Y(this.f65116N).m89027K(true).m89017A(Boolean.TRUE);
            c21691a.m111906k1(this.f65129d0);
            c21691a.m111905j1(this.f65130e0);
            c21691a.mo89107L0(new C16719g.b() { // from class: q80.h
                @Override // com.zing.zalo.uidrawing.C16719g.b
                /* renamed from: a */
                public final void mo945a(C16719g c16719g, boolean z11) {
                    MediaStoreItemLinkModuleView.m69916h0(MediaStoreItemLinkModuleView.this, context, c16719g, z11);
                }
            });
            this.f65128c0 = c21691a;
            C16716d c16716d4 = this.f65124V;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d4 = null;
            }
            C21691a c21691a2 = this.f65128c0;
            AbstractC19074t.m100205c(c21691a2);
            c16716d4.m89001g1(c21691a2);
        } else {
            C21693c c21693c3 = new C21693c(context);
            c21693c3.m89106L().m89030N(-2).m89060k0(-2).m89041Y(this.f65116N).m89027K(true).m89017A(Boolean.TRUE);
            c21693c3.m111929z1(5);
            c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_more_horizontal_solid_24, AbstractC2807a.icon_01));
            c21693c3.mo89109M0(new C16719g.c() { // from class: q80.i
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    MediaStoreItemLinkModuleView.m69917i0(MediaStoreItemLinkModuleView.this, c16719g);
                }
            });
            this.f65122T = c21693c3;
            C16716d c16716d5 = this.f65124V;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d5 = null;
            }
            C21693c c21693c4 = this.f65122T;
            AbstractC19074t.m100205c(c21693c4);
            c16716d5.m89001g1(c21693c4);
        }
        m69919l0();
        C16716d c16716d6 = new C16716d(context);
        C16718f m89027K = c16716d6.m89106L().m89030N(-2).m89060k0(-2).m89027K(true);
        C16719g c16719g = this.f65117O;
        if (c16719g == null) {
            AbstractC19074t.m100223u("imvThumb");
            c16719g = null;
        }
        m89027K.m89054h0(c16719g).m89049e0(this.f65122T);
        if (this.f65134i0) {
            c16716d6.m89106L().m89049e0(this.f65128c0);
        }
        C16716d c16716d7 = new C16716d(context);
        C16718f m89106L2 = c16716d7.m89106L();
        Boolean bool = Boolean.TRUE;
        C16718f m89017A = m89106L2.m89017A(bool);
        TabMsgCommonItemModuleView.C12429a c12429a = TabMsgCommonItemModuleView.Companion;
        m89017A.m89034R(c12429a.m69863c()).m89035S(c12429a.m69864d()).m89028L(-2, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m89106L().m89025I(true).m89028L(-2, -2).m89017A(bool);
        c16716d7.m89001g1(c22126c0);
        this.f65121S = c22126c0;
        c16716d6.m89001g1(c16716d7);
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89060k0(-1).m89030N(-2).m89050f0(new C20003a(true, c16716d7));
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.mo111965M1(1);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(11.0f));
        this.f65118P = c22126c02;
        c16716d6.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(context);
        C16718f m89030N = c22126c03.m89106L().m89060k0(-1).m89030N(-2);
        C22126c0 c22126c04 = this.f65118P;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c04 = null;
        }
        m89030N.m89023G(c22126c04).m89050f0(new C20003a(true, c16716d7));
        c22126c03.m111953A1(2);
        c22126c03.m111980v1(truncateAt);
        c22126c03.m111962J1(C23212s8.m119607o(context, AbstractC16781w.SearchGlobalTitleItemSearch));
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        this.f65120R = c22126c03;
        c16716d6.m89001g1(c22126c03);
        C22126c0 c22126c05 = new C22126c0(context);
        C16718f m89036T = c22126c05.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22126c0 c22126c06 = this.f65120R;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c22126c06 = null;
        }
        m89036T.m89023G(c22126c06).m89050f0(new C20003a(true, c16716d7));
        c22126c05.m111953A1(1);
        c22126c05.m111980v1(truncateAt);
        c22126c05.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c05.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f65119Q = c22126c05;
        c16716d6.m89001g1(c22126c05);
        C16716d c16716d8 = this.f65124V;
        C16716d c16716d9 = c16716d8;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d9 = null;
        }
        c16716d9.m89001g1(c16716d6);
        C16716d c16716d10 = this.f65124V;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d10 = null;
        }
        c16716d10.mo89109M0(new C16719g.c() { // from class: q80.j
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                MediaStoreItemLinkModuleView.m69914f0(MediaStoreItemLinkModuleView.this, c16719g2);
            }
        });
        C16716d c16716d11 = this.f65124V;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d11 = null;
        }
        c16716d11.m89111N0(new C16719g.d() { // from class: q80.k
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g2) {
                MediaStoreItemLinkModuleView.m69915g0(MediaStoreItemLinkModuleView.this, c16719g2);
            }
        });
        C16716d c16716d12 = this.f65124V;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d = null;
        } else {
            c16716d = c16716d12;
        }
        mo69681L(c16716d);
        C16719g c16719g2 = new C16719g(context);
        c16719g2.m89106L().m89030N(1).m89060k0(-1).m89034R(getMarginLeftBottomLineStyleContent()).m89072y(bool);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f65123U = c16719g2;
        AbstractC19074t.m100205c(c16719g2);
        mo69681L(c16719g2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m69914f0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        if (mediaStoreItemLinkModuleView.f65134i0 && (c21691a = mediaStoreItemLinkModuleView.f65128c0) != null) {
            AbstractC19074t.m100205c(c21691a);
            AbstractC19074t.m100205c(mediaStoreItemLinkModuleView.f65128c0);
            c21691a.m111904i1(!r1.m89141i0(), true);
            return;
        }
        InterfaceC12454a interfaceC12454a = mediaStoreItemLinkModuleView.f65125W;
        if (interfaceC12454a != null) {
            AbstractC19074t.m100205c(interfaceC12454a);
            interfaceC12454a.mo69924d(mediaStoreItemLinkModuleView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m69915g0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        if (mediaStoreItemLinkModuleView.f65134i0 && (c21691a = mediaStoreItemLinkModuleView.f65128c0) != null) {
            AbstractC19074t.m100205c(c21691a);
            AbstractC19074t.m100205c(mediaStoreItemLinkModuleView.f65128c0);
            c21691a.m111904i1(!r1.m89141i0(), true);
            return;
        }
        InterfaceC12454a interfaceC12454a = mediaStoreItemLinkModuleView.f65125W;
        if (interfaceC12454a != null) {
            AbstractC19074t.m100205c(interfaceC12454a);
            interfaceC12454a.mo69921a(mediaStoreItemLinkModuleView);
        }
    }

    private final MediaStoreItem getItemData() {
        MediaStoreItem mediaStoreItem = this.f65131f0;
        if (mediaStoreItem != null) {
            return mediaStoreItem;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m69916h0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, Context context, C16719g c16719g, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        InterfaceC12454a interfaceC12454a = mediaStoreItemLinkModuleView.f65125W;
        if (interfaceC12454a != null) {
            AbstractC19074t.m100205c(interfaceC12454a);
            interfaceC12454a.mo69923c(mediaStoreItemLinkModuleView.getItemData(), z11);
        }
        if (z11) {
            mediaStoreItemLinkModuleView.setBackgroundColor(C23212s8.m119607o(context, AbstractC17450b.ItemBackgroundSelectedColor2));
        } else {
            mediaStoreItemLinkModuleView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m69917i0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC23647d.m123897g("1001516");
        InterfaceC12454a interfaceC12454a = mediaStoreItemLinkModuleView.f65125W;
        if (interfaceC12454a != null) {
            AbstractC19074t.m100205c(interfaceC12454a);
            interfaceC12454a.mo69922b(mediaStoreItemLinkModuleView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m69918k0(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, String str, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, "this$0");
        AbstractC19074t.m100208f(str, "$thumbUrl");
        C23528a c23528a = mediaStoreItemLinkModuleView.f65126a0;
        AbstractC19074t.m100205c(c23528a);
        ((C23528a) c23528a.m123612r(mediaStoreItemLinkModuleView.f65127b0)).m123579C(str, C23278z2.m120126f0(), new C12456c(z11));
    }

    /* renamed from: l0 */
    private final void m69919l0() {
        if (this.f65131f0 != null) {
            C21691a c21691a = this.f65128c0;
            if (c21691a != null) {
                AbstractC19074t.m100205c(c21691a);
                MediaStoreItem mediaStoreItem = this.f65131f0;
                AbstractC19074t.m100205c(mediaStoreItem);
                c21691a.mo89091D0(mediaStoreItem.m40597k0());
            }
            MediaStoreItem mediaStoreItem2 = this.f65131f0;
            AbstractC19074t.m100205c(mediaStoreItem2);
            if (mediaStoreItem2.m40597k0()) {
                setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC17450b.ItemBackgroundSelectedColor2));
                return;
            } else {
                setBackgroundColor(0);
                return;
            }
        }
        setBackgroundColor(0);
    }

    public final C16719g getCline() {
        return this.f65123U;
    }

    public final int getMarginLeftBottomLineStyleContent() {
        return ((Number) this.f65135j0.getValue()).intValue();
    }

    public final Rect getRectView() {
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            C16716d c16716d = this.f65124V;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d = null;
            }
            int m89114P = c16716d.m89114P() + i11;
            C16716d c16716d2 = this.f65124V;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d2 = null;
            }
            return new Rect(i11, i12, m89114P, c16716d2.m89112O() + i12);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0005, B:6:0x001d, B:7:0x002f, B:9:0x0052, B:10:0x0058, B:13:0x006c, B:16:0x0089, B:18:0x008d, B:19:0x0091, B:20:0x00ab, B:22:0x00af, B:23:0x00b5, B:25:0x00b9, B:27:0x00bf, B:30:0x00c6, B:33:0x00cf, B:34:0x00d3, B:36:0x00f0, B:38:0x00fc, B:39:0x0101, B:43:0x010e, B:45:0x0116, B:46:0x0136, B:50:0x011a, B:52:0x011e, B:54:0x0124, B:56:0x0128, B:57:0x012d, B:59:0x009e, B:61:0x00a2, B:62:0x00a6), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[Catch: Exception -> 0x002b, TRY_ENTER, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0005, B:6:0x001d, B:7:0x002f, B:9:0x0052, B:10:0x0058, B:13:0x006c, B:16:0x0089, B:18:0x008d, B:19:0x0091, B:20:0x00ab, B:22:0x00af, B:23:0x00b5, B:25:0x00b9, B:27:0x00bf, B:30:0x00c6, B:33:0x00cf, B:34:0x00d3, B:36:0x00f0, B:38:0x00fc, B:39:0x0101, B:43:0x010e, B:45:0x0116, B:46:0x0136, B:50:0x011a, B:52:0x011e, B:54:0x0124, B:56:0x0128, B:57:0x012d, B:59:0x009e, B:61:0x00a2, B:62:0x00a6), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0005, B:6:0x001d, B:7:0x002f, B:9:0x0052, B:10:0x0058, B:13:0x006c, B:16:0x0089, B:18:0x008d, B:19:0x0091, B:20:0x00ab, B:22:0x00af, B:23:0x00b5, B:25:0x00b9, B:27:0x00bf, B:30:0x00c6, B:33:0x00cf, B:34:0x00d3, B:36:0x00f0, B:38:0x00fc, B:39:0x0101, B:43:0x010e, B:45:0x0116, B:46:0x0136, B:50:0x011a, B:52:0x011e, B:54:0x0124, B:56:0x0128, B:57:0x012d, B:59:0x009e, B:61:0x00a2, B:62:0x00a6), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0005, B:6:0x001d, B:7:0x002f, B:9:0x0052, B:10:0x0058, B:13:0x006c, B:16:0x0089, B:18:0x008d, B:19:0x0091, B:20:0x00ab, B:22:0x00af, B:23:0x00b5, B:25:0x00b9, B:27:0x00bf, B:30:0x00c6, B:33:0x00cf, B:34:0x00d3, B:36:0x00f0, B:38:0x00fc, B:39:0x0101, B:43:0x010e, B:45:0x0116, B:46:0x0136, B:50:0x011a, B:52:0x011e, B:54:0x0124, B:56:0x0128, B:57:0x012d, B:59:0x009e, B:61:0x00a2, B:62:0x00a6), top: B:2:0x0005 }] */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m69920j0(MediaStoreItem mediaStoreItem, boolean z11) {
        String str;
        C22126c0 c22126c0;
        MediaStoreItem mediaStoreItem2;
        C21693c c21693c;
        final String m95131f5;
        C17945a0 m40599m;
        String m94854B4;
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        try {
            m69912d0();
            this.f65131f0 = mediaStoreItem;
            AbstractC19074t.m100205c(mediaStoreItem);
            String str2 = "";
            if (TextUtils.isEmpty(mediaStoreItem.m40599m().m95090b5())) {
                str = "";
            } else {
                MediaStoreItem mediaStoreItem3 = this.f65131f0;
                AbstractC19074t.m100205c(mediaStoreItem3);
                str = mediaStoreItem3.m40599m().m95090b5();
            }
            AbstractC19074t.m100205c(str);
            String m119702a = AbstractC23228u2.m119702a(str);
            AbstractC19074t.m100207e(m119702a, "getDomainName(...)");
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String upperCase = m119702a.toUpperCase(locale);
            AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
            C22126c0 c22126c02 = this.f65118P;
            C21693c c21693c2 = null;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c22126c02 = null;
            }
            c22126c02.m111959G1(upperCase);
            MediaStoreItem mediaStoreItem4 = this.f65131f0;
            AbstractC19074t.m100205c(mediaStoreItem4);
            if (!TextUtils.isEmpty(mediaStoreItem4.m40578V())) {
                MediaStoreItem mediaStoreItem5 = this.f65131f0;
                AbstractC19074t.m100205c(mediaStoreItem5);
                CharSequence m40578V = mediaStoreItem5.m40578V();
                MediaStoreItem mediaStoreItem6 = this.f65131f0;
                AbstractC19074t.m100205c(mediaStoreItem6);
                if (!AbstractC19074t.m100204b(m40578V, mediaStoreItem6.m40599m().m95090b5())) {
                    C22126c0 c22126c03 = this.f65120R;
                    if (c22126c03 == null) {
                        AbstractC19074t.m100223u("tvSubtitle");
                        c22126c03 = null;
                    }
                    MediaStoreItem mediaStoreItem7 = this.f65131f0;
                    AbstractC19074t.m100205c(mediaStoreItem7);
                    c22126c03.m111959G1(mediaStoreItem7.m40578V());
                    c22126c0 = this.f65119Q;
                    if (c22126c0 == null) {
                        AbstractC19074t.m100223u("tvExtraInfo");
                        c22126c0 = null;
                    }
                    mediaStoreItem2 = this.f65131f0;
                    if (mediaStoreItem2 != null && (m40599m = mediaStoreItem2.m40599m()) != null && (m94854B4 = m40599m.m94854B4()) != null) {
                        str2 = m94854B4;
                    }
                    c22126c0.m111959G1(str2);
                    c21693c = this.f65117O;
                    if (c21693c == null) {
                        AbstractC19074t.m100223u("imvThumb");
                        c21693c = null;
                    }
                    c21693c.mo111926w1(AbstractC16803z.ic_link_broken);
                    MediaStoreItem mediaStoreItem8 = this.f65131f0;
                    AbstractC19074t.m100205c(mediaStoreItem8);
                    m95131f5 = mediaStoreItem8.m40599m().m95131f5();
                    AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
                    if (TextUtils.isEmpty(m95131f5)) {
                        final boolean m125696L2 = C23999j.m125696L2(m95131f5, C23278z2.m120126f0());
                        C21693c c21693c3 = this.f65117O;
                        if (c21693c3 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                        } else {
                            c21693c2 = c21693c3;
                        }
                        c21693c2.m89129Y0(m95131f5);
                        Runnable runnable = new Runnable() { // from class: q80.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaStoreItemLinkModuleView.m69918k0(MediaStoreItemLinkModuleView.this, m95131f5, m125696L2);
                            }
                        };
                        if (!m125696L2 && z11) {
                            if (C23250w4.f112644a.m119843q()) {
                                runnable.run();
                            }
                        }
                        runnable.run();
                    } else if (!TextUtils.isEmpty(upperCase)) {
                        C21693c c21693c4 = this.f65117O;
                        if (c21693c4 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                        } else {
                            c21693c2 = c21693c4;
                        }
                        c21693c2.mo111925v1(C23250w4.f112644a.m119821H(upperCase, str));
                    }
                    m69919l0();
                }
            }
            C22126c0 c22126c04 = this.f65120R;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
                c22126c04 = null;
            }
            c22126c04.m111959G1("Link");
            c22126c0 = this.f65119Q;
            if (c22126c0 == null) {
            }
            mediaStoreItem2 = this.f65131f0;
            if (mediaStoreItem2 != null) {
                str2 = m94854B4;
            }
            c22126c0.m111959G1(str2);
            c21693c = this.f65117O;
            if (c21693c == null) {
            }
            c21693c.mo111926w1(AbstractC16803z.ic_link_broken);
            MediaStoreItem mediaStoreItem82 = this.f65131f0;
            AbstractC19074t.m100205c(mediaStoreItem82);
            m95131f5 = mediaStoreItem82.m40599m().m95131f5();
            AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
            if (TextUtils.isEmpty(m95131f5)) {
            }
            m69919l0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void setCline(C16719g c16719g) {
        this.f65123U = c16719g;
    }

    public final void setEnableMultiSelect(boolean z11) {
        if (this.f65134i0 != z11) {
            this.f65134i0 = z11;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m69913e0(context);
            m69919l0();
        }
    }

    public final void setLinkListener(InterfaceC12454a interfaceC12454a) {
        this.f65125W = interfaceC12454a;
    }

    public final void setPaddingTopLayoutLinkFile(int i11) {
        C16716d c16716d = this.f65124V;
        if (c16716d == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d = null;
        }
        c16716d.m89106L().m89042Z(0, i11, 0, AbstractC23136l9.m118742r(12.0f));
    }

    public final void setShowMenuButton(boolean z11) {
        int i11;
        C21693c c21693c = this.f65122T;
        if (c21693c != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21693c.mo44614b1(i11);
        }
    }

    public final void setTimeline(String str) {
        try {
            C22126c0 c22126c0 = this.f65121S;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("tvTime");
                c22126c0 = null;
            }
            if (str == null) {
                str = "";
            }
            c22126c0.m111959G1(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void setVisibilityCline(boolean z11) {
        int i11;
        C16719g c16719g = this.f65123U;
        if (c16719g != null) {
            AbstractC19074t.m100205c(c16719g);
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
        AbstractC19074t.m100208f(context, "context");
        this.f65113K = AbstractC23136l9.m118742r(48.0f);
        this.f65114L = AbstractC23136l9.m118742r(48.0f);
        this.f65115M = AbstractC23136l9.m118742r(12.0f);
        this.f65116N = AbstractC23136l9.m118742r(16.0f);
        this.f65133h0 = new Handler(Looper.getMainLooper());
        m129210a = AbstractC24856m.m129210a(new C12455b());
        this.f65135j0 = m129210a;
        m69913e0(context);
    }
}
