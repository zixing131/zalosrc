package com.zing.zalo.p077ui.chat.rightmenu;

import ag0.C0815e1;
import am.C0943w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import ci.C3514m;
import com.androidquery.util.C3977j;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$ChatGroupDescModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$ChatHeaderItemModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$ChatSettingModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$EventSuggestionRowModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$SettingHorizontalModuleView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.ZinstantQuickActionView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.ZaloView;
import hd0.C20005c;
import id0.C20518d;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import ki0.C21740h;
import l80.C22122a0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p056cj.C3535c;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p396ol.C24302e;
import p461qu.AbstractC25495a;
import p716zh.C31862c;
import p716zh.C31973j5;
import p716zh.C32175x6;
import ui0.C27280g;
import x70.C29428k0;

/* loaded from: classes5.dex */
public class ChatInfoAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    View f60775r;

    /* renamed from: s */
    LayoutInflater f60776s;

    /* renamed from: t */
    C23528a f60777t;

    /* renamed from: u */
    private InterfaceC11689d f60778u;

    /* renamed from: v */
    public C3535c f60779v = null;

    /* renamed from: w */
    public ZinstantQuickActionView f60780w = null;

    /* renamed from: x */
    ArrayList f60781x = new ArrayList();

    /* loaded from: classes5.dex */
    public class GalleryRecentThumbsModuleView extends ModulesView implements InterfaceC11686a {

        /* renamed from: K */
        C11685a[] f60782K;

        /* renamed from: L */
        C3977j[] f60783L;

        /* renamed from: M */
        C16716d f60784M;

        /* renamed from: N */
        C16716d f60785N;

        /* renamed from: O */
        C21693c f60786O;

        /* renamed from: P */
        C21740h f60787P;

        /* renamed from: Q */
        private final List f60788Q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$GalleryRecentThumbsModuleView$a */
        /* loaded from: classes5.dex */
        public class C11685a extends C16716d {

            /* renamed from: M0 */
            C22122a0 f60790M0;

            /* renamed from: N0 */
            RecyclingImageView f60791N0;

            /* renamed from: O0 */
            MediaStoreItem f60792O0;

            /* renamed from: P0 */
            C29428k0 f60793P0;

            /* renamed from: Q0 */
            C21693c f60794Q0;

            /* renamed from: R0 */
            C21693c f60795R0;

            /* renamed from: S0 */
            C21740h f60796S0;

            /* renamed from: T0 */
            int f60797T0;

            /* renamed from: U0 */
            int f60798U0;

            /* renamed from: V0 */
            int f60799V0;

            /* renamed from: W0 */
            Context f60800W0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$GalleryRecentThumbsModuleView$a$a */
            /* loaded from: classes5.dex */
            public class a extends C22122a0 {

                /* renamed from: f1 */
                Paint f60802f1;

                /* renamed from: g1 */
                final RectF f60803g1;

                a(Context context) {
                    super(context);
                    this.f60803g1 = new RectF();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
                /* renamed from: o0 */
                public void mo44775o0(Canvas canvas) {
                    super.mo44775o0(canvas);
                    if (this.f60802f1 == null) {
                        Paint paint = new Paint();
                        this.f60802f1 = paint;
                        paint.setStyle(Paint.Style.STROKE);
                        this.f60802f1.setAntiAlias(true);
                        this.f60802f1.setColor(C23212s8.m119607o(this.f84786r, AbstractC16781w.ImagePlaceHolderColor));
                        this.f60802f1.setStrokeWidth(AbstractC23136l9.m118742r(1.0f) * 0.5f);
                    }
                    this.f60803g1.set(0.0f, 0.0f, C11685a.this.f60798U0 - AbstractC23136l9.m118742r(1.0f), C11685a.this.f60799V0);
                    canvas.drawRoundRect(this.f60803g1, AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(2.0f), this.f60802f1);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$GalleryRecentThumbsModuleView$a$b */
            /* loaded from: classes5.dex */
            public class b implements C29428k0.h {

                /* renamed from: a */
                final /* synthetic */ MediaStoreItem f60805a;

                b(MediaStoreItem mediaStoreItem) {
                    this.f60805a = mediaStoreItem;
                }

                @Override // x70.C29428k0.h
                /* renamed from: a */
                public void mo65107a(C29428k0.a aVar, C32175x6 c32175x6) {
                }

                @Override // x70.C29428k0.h
                /* renamed from: b */
                public void mo65108b(C29428k0.a aVar, C32175x6 c32175x6) {
                    MediaStoreItem mediaStoreItem = this.f60805a;
                    if (mediaStoreItem == C11685a.this.f60792O0 && mediaStoreItem.m40596j0()) {
                        C11685a.this.m65103s1(true);
                    }
                }
            }

            public C11685a(Context context, int i11, int i12, int i13) {
                super(context);
                this.f60792O0 = null;
                this.f60793P0 = null;
                this.f60797T0 = 0;
                this.f60800W0 = context;
                this.f60798U0 = i11;
                this.f60799V0 = i12;
                m89106L().m89028L(i11, i12).m89032P(AbstractC23136l9.m118742r(1.0f), 0, AbstractC23136l9.m118742r(1.0f), 0);
                this.f60791N0 = new RecyclingImageView(context);
                m65106r1(i13);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s1 */
            public void m65103s1(boolean z11) {
                if (z11) {
                    this.f60790M0.m89087B0(AbstractC16803z.thumb_right_menu_bg);
                    MediaStoreItem mediaStoreItem = this.f60792O0;
                    if (mediaStoreItem != null && mediaStoreItem.m40602n0()) {
                        this.f60790M0.mo111926w1(AbstractC16803z.ic_rolled_video);
                    } else {
                        this.f60790M0.mo111926w1(AbstractC16803z.ic_rolled_photo);
                    }
                    this.f60795R0.mo44614b1(4);
                    this.f60790M0.m111929z1(4);
                    return;
                }
                this.f60790M0.m89085A0(null);
                this.f60790M0.m115386T1(null);
                this.f60790M0.m111929z1(5);
            }

            /* renamed from: p1 */
            void m65104p1(MediaStoreItem mediaStoreItem) {
                if (mediaStoreItem != this.f60792O0) {
                    m65105q1();
                }
                this.f60792O0 = mediaStoreItem;
                if (this.f60793P0 == null) {
                    if (C24302e.m126898v()) {
                        this.f60793P0 = new C29428k0(2, this.f60800W0, ChatInfoAdapter.this.f60777t, this.f60790M0, this.f60791N0, new C29428k0.i(mediaStoreItem.m40599m()));
                    } else {
                        this.f60793P0 = new C29428k0(2, this.f60800W0, ChatInfoAdapter.this.f60777t, this.f60790M0, this.f60791N0, new C29428k0.g(mediaStoreItem));
                    }
                    this.f60793P0.m146624Z(C27280g.m139658a(this.f60800W0, AbstractC16803z.thumb_right_menu_bg));
                    this.f60793P0.m146627c0(new b(mediaStoreItem));
                }
                if (this.f60792O0.m40596j0()) {
                    m65103s1(true);
                } else {
                    m65103s1(false);
                    this.f60793P0.m146623O();
                }
            }

            /* renamed from: q1 */
            void m65105q1() {
                C29428k0 c29428k0 = this.f60793P0;
                if (c29428k0 != null) {
                    c29428k0.m146630z();
                    this.f60793P0 = null;
                }
            }

            /* renamed from: r1 */
            public void m65106r1(int i11) {
                if (this.f60797T0 != i11) {
                    while (getModules().size() > 0) {
                        m89006m1((C16719g) getModules().get(0));
                    }
                }
                if (i11 == 1) {
                    if (this.f60790M0 == null) {
                        a aVar = new a(this.f60800W0);
                        this.f60790M0 = aVar;
                        aVar.m89106L().m89025I(true).m89028L(-1, -1);
                        this.f60790M0.mo111927x1(AbstractC23136l9.m118742r(2.0f));
                        this.f60790M0.m111929z1(5);
                    }
                    m89001g1(this.f60790M0);
                    if (this.f60795R0 == null) {
                        C21693c c21693c = new C21693c(this.f60800W0);
                        this.f60795R0 = c21693c;
                        c21693c.m89106L().m89025I(true).m89028L(AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(30.0f));
                        this.f60795R0.mo111925v1(AbstractC23136l9.m118665N(this.f60800W0, AbstractC16803z.icn_csc_play_small));
                    }
                    m89001g1(this.f60795R0);
                    if (this.f60796S0 == null) {
                        C21740h c21740h = new C21740h(this.f60800W0, AbstractC23136l9.m118655I(AbstractC16802y.label_text_size), C23212s8.m119607o(this.f60800W0, AbstractC21196a.TextColor1), true);
                        this.f60796S0 = c21740h;
                        c21740h.m111958F1(AbstractC8020f0.str_label_gif);
                        this.f60796S0.mo111965M1(1);
                        this.f60796S0.m89085A0(AbstractC23136l9.m118665N(this.f60800W0, AbstractC16803z.bg_gif_label));
                        C16718f m89036T = this.f60796S0.m89106L().m89028L(-2, -2).m89046b0(AbstractC23136l9.m118742r(2.0f)).m89047c0(AbstractC23136l9.m118742r(2.0f)).m89034R(AbstractC23136l9.m118742r(3.0f)).m89036T(AbstractC23136l9.m118742r(3.0f));
                        Boolean bool = Boolean.TRUE;
                        m89036T.m89073z(bool).m89018B(bool);
                    }
                    m89001g1(this.f60796S0);
                } else {
                    m89087B0(AbstractC16803z.thumb_right_menu_more_bg);
                    m89106L().m89029M(12);
                    if (this.f60794Q0 == null) {
                        C21693c c21693c2 = new C21693c(this.f60800W0);
                        this.f60794Q0 = c21693c2;
                        c21693c2.m89106L().m89026J(true);
                        this.f60794Q0.mo111925v1(AbstractC23136l9.m118665N(this.f60800W0, AbstractC16803z.icn_khomedia_rightmenu_arrow));
                    }
                    m89001g1(this.f60794Q0);
                    m65105q1();
                }
                this.f60797T0 = i11;
            }
        }

        public GalleryRecentThumbsModuleView(Context context, InterfaceC11689d interfaceC11689d) {
            super(context);
            int i11;
            this.f60782K = new C11685a[5];
            this.f60788Q = new ArrayList();
            ChatInfoAdapter.this.f60778u = interfaceC11689d;
            C16716d c16716d = new C16716d(context);
            this.f60784M = c16716d;
            c16716d.m89106L().m89028L(-1, -2).m89033Q(AbstractC23222t7.f112586t).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr) + AbstractC23222t7.f112514B + AbstractC23222t7.f112586t).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr));
            C20005c[] c20005cArr = new C20005c[6];
            for (int i12 = 0; i12 < 6; i12++) {
                c20005cArr[i12] = new C20005c().m103822e(i12 / 5.0f);
            }
            int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_icon_left_size);
            int m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_icon_left_margin_right);
            int m118725l0 = ((((AbstractC23136l9.m118725l0(context) - (AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr) * 2)) - m118655I) - m118655I2) - (AbstractC23136l9.m118742r(1.0f) * 4)) / 5;
            this.f60783L = new C3977j[5];
            int i13 = 0;
            while (i13 < 5) {
                this.f60783L[i13] = new C3977j(context);
                C11685a[] c11685aArr = this.f60782K;
                if (i13 < 4) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                int i14 = i13;
                c11685aArr[i14] = new C11685a(context, m118725l0, m118725l0, i11);
                i13 = i14 + 1;
                this.f60782K[i14].m89106L().m89058j0(c20005cArr[i14]).m89052g0(c20005cArr[i13]);
                this.f60784M.m89001g1(this.f60782K[i14]);
            }
            m88987U(-1, -2);
            mo69681L(this.f60784M);
            C16716d c16716d2 = new C16716d(context);
            this.f60785N = c16716d2;
            c16716d2.m89087B0(AbstractC16803z.entry_right_menu_empty_bg);
            this.f60785N.m89106L().m89028L(-1, AbstractC23136l9.m118742r(64.0f)).m89047c0(AbstractC23136l9.m118742r(11.0f)).m89036T(AbstractC23136l9.m118742r(4.0f)).m89033Q(AbstractC23222t7.f112586t).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr) + m118655I + m118655I2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr));
            mo69681L(this.f60785N);
            C21693c c21693c = new C21693c(context);
            this.f60786O = c21693c;
            c21693c.m89106L().m89027K(true).m89034R(AbstractC23136l9.m118742r(11.0f)).m89035S(AbstractC23136l9.m118742r(15.0f)).m89028L(AbstractC23136l9.m118742r(42.0f), AbstractC23136l9.m118742r(42.0f));
            this.f60786O.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.icn_khomedia_rightmenu_kho_empty_group));
            this.f60785N.m89001g1(this.f60786O);
            C21740h c21740h = new C21740h(context);
            this.f60787P = c21740h;
            c21740h.m89106L().m89054h0(this.f60786O).m89027K(true).m89028L(-1, -2);
            this.f60787P.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            this.f60787P.setMaxScaledTextSize(AbstractC23222t7.f112588u);
            this.f60787P.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            this.f60785N.m89001g1(this.f60787P);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public /* synthetic */ void m65096Y(C16719g c16719g) {
            ChatInfoAdapter.this.f60778u.mo65110P3(false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public /* synthetic */ void m65097a0(C16719g c16719g) {
            ChatInfoAdapter.this.f60778u.mo65110P3(false, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public /* synthetic */ void m65098b0(C16719g c16719g) {
            ChatInfoAdapter.this.f60778u.mo65110P3(true, false);
        }

        /* renamed from: c0 */
        private void m65099c0() {
            try {
                int size = this.f60788Q.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C11685a c11685a = this.f60782K[i11];
                    if (c11685a != null) {
                        c11685a.m65106r1(1);
                        this.f60782K[i11].mo44614b1(0);
                        this.f60782K[i11].m65104p1((MediaStoreItem) this.f60788Q.get(i11));
                        this.f60782K[i11].mo89109M0(new C16719g.c() { // from class: h60.f
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                ChatInfoAdapter.GalleryRecentThumbsModuleView.this.m65096Y(c16719g);
                            }
                        });
                    }
                }
                this.f60782K[size].m65106r1(2);
                this.f60782K[size].mo44614b1(0);
                this.f60782K[size].mo89109M0(new C16719g.c() { // from class: h60.g
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        ChatInfoAdapter.GalleryRecentThumbsModuleView.this.m65097a0(c16719g);
                    }
                });
                for (int i12 = size + 1; i12 < 5; i12++) {
                    C11685a c11685a2 = this.f60782K[i12];
                    if (c11685a2 != null) {
                        c11685a2.mo44614b1(4);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: d0 */
        private void m65100d0() {
            int i11;
            float f11;
            boolean z11;
            int i12;
            MediaStoreItem mediaStoreItem;
            int size = this.f60788Q.size();
            int i13 = 0;
            for (int i14 = 0; i14 < 4; i14++) {
                if (i14 < size) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && this.f60782K[i14].m89144k0()) {
                    this.f60782K[i14].m65105q1();
                }
                C11685a c11685a = this.f60782K[i14];
                if (z11) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                c11685a.mo44614b1(i12);
                if (i14 < size) {
                    mediaStoreItem = (MediaStoreItem) this.f60788Q.get(i14);
                } else {
                    mediaStoreItem = null;
                }
                this.f60782K[i14].f60795R0.mo44614b1(4);
                this.f60782K[i14].f60796S0.mo44614b1(4);
                if (mediaStoreItem != null && mediaStoreItem.m40602n0()) {
                    this.f60782K[i14].f60795R0.mo44614b1(0);
                }
            }
            this.f60785N.mo89109M0(new C16719g.c() { // from class: h60.h
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatInfoAdapter.GalleryRecentThumbsModuleView.this.m65098b0(c16719g);
                }
            });
            float f12 = 1.0f;
            if (size > 0 && !this.f60784M.m89144k0()) {
                this.f60785N.m89135c1(((C20518d) new C20518d().m106593j(200L)).mo106594k(0.0f));
                this.f60785N.mo44614b1(8);
                this.f60784M.mo44614b1(0);
                this.f60784M.mo89158x0(1.0f);
            } else {
                C16716d c16716d = this.f60785N;
                if (size > 0) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                c16716d.mo44614b1(i11);
                C16716d c16716d2 = this.f60785N;
                if (size > 0) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                c16716d2.mo89158x0(f11);
                C16716d c16716d3 = this.f60784M;
                if (size <= 0) {
                    i13 = 8;
                }
                c16716d3.mo44614b1(i13);
                C16716d c16716d4 = this.f60784M;
                if (size <= 0) {
                    f12 = 0.0f;
                }
                c16716d4.mo89158x0(f12);
            }
            if (this.f60786O != null && this.f60787P != null) {
                if (AbstractC25495a.m132078c(ChatInfoAdapter.this.f60779v.m17944I0())) {
                    this.f60786O.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.icn_khomedia_rightmenu_kho_empty_group));
                    this.f60787P.m111958F1(AbstractC8020f0.str_right_menu_kho_empty_thumb_send2me_ver2);
                } else {
                    this.f60786O.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.illus_empty_photos));
                    this.f60787P.m111958F1(AbstractC8020f0.str_right_menu_kho_empty_thumb_1v1_ver2);
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
        /* renamed from: f */
        public void mo65101f(C11690e c11690e, int i11) {
            try {
                C3514m c3514m = ((C11688c) c11690e).f60807b;
                this.f60788Q.clear();
                if (c3514m != null) {
                    List m17755a = c3514m.m17755a();
                    if (m17755a.size() < 4) {
                        this.f60788Q.addAll(m17755a);
                    } else {
                        this.f60788Q.addAll(m17755a.subList(0, 4));
                    }
                }
                m65100d0();
                m65099c0();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11686a {
        /* renamed from: f */
        void mo65101f(C11690e c11690e, int i11);
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$b */
    /* loaded from: classes5.dex */
    public static class C11687b extends C11690e {
        public C11687b() {
            super(12);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$c */
    /* loaded from: classes5.dex */
    public static class C11688c extends C11690e {

        /* renamed from: b */
        public C3514m f60807b;

        public C11688c() {
            super(2);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC11689d {
        /* renamed from: P1 */
        void mo65109P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c);

        /* renamed from: P3 */
        void mo65110P3(boolean z11, boolean z12);

        /* renamed from: Q3 */
        void mo65111Q3();

        /* renamed from: R3 */
        void mo65112R3(C31862c c31862c, String str, String str2);

        /* renamed from: S3 */
        void mo65113S3(int i11);
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$e */
    /* loaded from: classes5.dex */
    public static class C11690e {

        /* renamed from: a */
        private final int f60808a;

        public C11690e(int i11) {
            this.f60808a = i11;
        }

        /* renamed from: b */
        public int m65115b() {
            return this.f60808a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$f */
    /* loaded from: classes5.dex */
    public static class C11691f extends C11690e {

        /* renamed from: b */
        public C31862c f60809b;

        public C11691f(C31862c c31862c) {
            super(m65116c(c31862c.f146309b));
            this.f60809b = c31862c;
        }

        /* renamed from: c */
        public static int m65116c(int i11) {
            if (i11 == 0) {
                return 5;
            }
            if (i11 == 1) {
                return 6;
            }
            if (i11 == 2) {
                return 7;
            }
            if (i11 == 3) {
                return 8;
            }
            if (i11 != 4) {
                return i11 != 5 ? -1 : 10;
            }
            return 9;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$g */
    /* loaded from: classes5.dex */
    public static class C11692g extends C11690e {

        /* renamed from: s */
        private static final SparseIntArray f60810s;

        /* renamed from: b */
        public final int f60811b;

        /* renamed from: c */
        public int f60812c;

        /* renamed from: d */
        public String f60813d;

        /* renamed from: e */
        public String f60814e;

        /* renamed from: f */
        public Spannable f60815f;

        /* renamed from: g */
        public int f60816g;

        /* renamed from: h */
        public boolean f60817h;

        /* renamed from: i */
        public boolean f60818i;

        /* renamed from: j */
        public boolean f60819j;

        /* renamed from: k */
        public boolean f60820k;

        /* renamed from: l */
        public boolean f60821l;

        /* renamed from: m */
        public boolean f60822m;

        /* renamed from: n */
        public int f60823n;

        /* renamed from: o */
        public boolean f60824o;

        /* renamed from: p */
        public boolean f60825p;

        /* renamed from: q */
        public C7904b f60826q;

        /* renamed from: r */
        public boolean f60827r;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f60810s = sparseIntArray;
            sparseIntArray.put(503050979, 68);
            sparseIntArray.put(-1585799242, 70);
        }

        public C11692g(int i11, int i12) {
            super(1);
            this.f60816g = 0;
            this.f60817h = false;
            this.f60821l = true;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60825p = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i11;
            this.f60812c = i12;
        }

        /* renamed from: c */
        public static int m65117c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return f60810s.get(str.hashCode(), -1);
        }

        /* renamed from: d */
        public int m65118d() {
            return this.f60811b;
        }

        /* renamed from: e */
        public void m65119e(Context context, int i11, int i12) {
            if (i11 >= 0 && i12 >= 0) {
                this.f60815f.setSpan(new ForegroundColorSpan(C23212s8.m119607o(context, AbstractC21196a.TextColor2)), i11, i12, 33);
                this.f60815f.setSpan(new RelativeSizeSpan(0.8666667f), i11, i12, 33);
            }
        }

        /* renamed from: f */
        public void m65120f(boolean z11, boolean z12) {
            this.f60819j = z11;
            this.f60820k = z12;
        }

        public C11692g(int i11, int i12, boolean z11, boolean z12) {
            super(1);
            this.f60816g = 0;
            this.f60817h = false;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i11;
            this.f60812c = i12;
            this.f60821l = z11;
            this.f60825p = z12;
        }

        public C11692g(int i11, int i12, int i13) {
            super(1);
            this.f60817h = false;
            this.f60821l = true;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60825p = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i11;
            this.f60812c = i13;
            this.f60816g = i12;
        }

        public C11692g(int i11, int i12, int i13, boolean z11, boolean z12) {
            super(1);
            this.f60817h = false;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i11;
            this.f60812c = i13;
            this.f60821l = z11;
            this.f60825p = z12;
            this.f60816g = i12;
        }

        public C11692g(int i11, int i12, String str, boolean z11) {
            super(1);
            this.f60817h = false;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i11;
            this.f60813d = str;
            this.f60821l = z11;
            this.f60825p = !z11;
            this.f60816g = i12;
        }

        public C11692g(int i11, int i12, int i13, String str, boolean z11) {
            super(i11);
            this.f60817h = false;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i12;
            this.f60813d = str;
            this.f60821l = z11;
            this.f60825p = !z11;
            this.f60816g = i13;
        }

        public C11692g(int i11, int i12, Spannable spannable, boolean z11) {
            super(1);
            this.f60817h = false;
            this.f60822m = false;
            this.f60823n = 0;
            this.f60824o = false;
            this.f60826q = null;
            this.f60827r = false;
            this.f60811b = i11;
            this.f60815f = spannable;
            this.f60821l = z11;
            this.f60825p = !z11;
            this.f60816g = i12;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$h */
    /* loaded from: classes5.dex */
    public static class C11693h extends C11690e {

        /* renamed from: b */
        public ArrayList f60828b;

        /* renamed from: c */
        public boolean f60829c;

        public C11693h(ArrayList arrayList, boolean z11) {
            super(4);
            this.f60828b = arrayList;
            this.f60829c = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$i */
    /* loaded from: classes5.dex */
    public static class C11694i extends C11696k {

        /* renamed from: I */
        public ModulesView f60830I;

        public C11694i(ModulesView modulesView) {
            super(modulesView);
            this.f60830I = modulesView;
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.C11696k, com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
        /* renamed from: f */
        public void mo65101f(C11690e c11690e, int i11) {
            try {
                super.mo65101f(c11690e, i11);
                ViewParent viewParent = this.f60830I;
                if (viewParent instanceof InterfaceC11686a) {
                    ((InterfaceC11686a) viewParent).mo65101f(c11690e, i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$j */
    /* loaded from: classes5.dex */
    public class C11695j extends C11696k implements InterfaceC13567b1.a {

        /* renamed from: I */
        QuickActionViewLayout f60831I;

        public C11695j(QuickActionViewLayout quickActionViewLayout) {
            super(quickActionViewLayout);
            this.f60831I = quickActionViewLayout;
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            C0815e1.m2075D().m2092K(c31862c, str, i11);
            ChatInfoAdapter.this.f60778u.mo65112R3(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            ChatInfoAdapter.this.f60778u.mo65109P1(quickActionViewLayout, c31862c);
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.C11696k, com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
        /* renamed from: f */
        public void mo65101f(C11690e c11690e, int i11) {
            if (c11690e instanceof C11691f) {
                this.f60831I.m75818b(((C11691f) c11690e).f60809b, this);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$k */
    /* loaded from: classes5.dex */
    public static class C11696k extends RecyclerView.AbstractC1876c0 implements InterfaceC11686a {
        public C11696k(View view) {
            super(view);
        }

        /* renamed from: f */
        public void mo65101f(C11690e c11690e, int i11) {
        }
    }

    public ChatInfoAdapter(ZaloView zaloView, C23528a c23528a, InterfaceC11689d interfaceC11689d, View view) {
        this.f60776s = LayoutInflater.from(zaloView.m92648SI());
        this.f60777t = c23528a;
        this.f60778u = interfaceC11689d;
        this.f60775r = view;
    }

    /* renamed from: N */
    public C11690e m65087N(int i11) {
        if (i11 >= 0 && i11 < this.f60781x.size()) {
            return (C11690e) this.f60781x.get(i11);
        }
        return null;
    }

    /* renamed from: O */
    public int m65088O() {
        for (int i11 = 0; i11 < this.f60781x.size(); i11++) {
            if (((C11690e) this.f60781x.get(i11)).f60808a == 1 && ((C11692g) this.f60781x.get(i11)).m65118d() == 61) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public int m65089P(int i11) {
        for (int i12 = 0; i12 < this.f60781x.size(); i12++) {
            if (((C11690e) this.f60781x.get(i12)).f60808a == 1 && ((C11692g) this.f60781x.get(i12)).m65118d() == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C11696k c11696k, int i11) {
        c11696k.mo65101f(m65087N(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C11696k mo9992C(ViewGroup viewGroup, int i11) {
        final Context context = viewGroup.getContext();
        boolean z11 = false;
        switch (i11) {
            case 0:
                return new C11696k(this.f60775r);
            case 1:
                return new C11694i(new ChatInfoModuleViews$ChatSettingModuleView(context, this.f60777t, this.f60778u));
            case 2:
                return new C11694i(new GalleryRecentThumbsModuleView(context, this.f60778u));
            case 3:
                return new C11694i(new ChatInfoModuleViews$ChatHeaderItemModuleView(context));
            case 4:
                C31973j5 m4472f = C0943w.f3447a.m4472f(this.f60779v.m17944I0());
                if (m4472f != null) {
                    z11 = m4472f.m153747Y();
                }
                return new C11694i(new ChatInfoModuleViews$SettingHorizontalModuleView(context, this.f60777t, this.f60778u, z11));
            case 5:
                return new C11695j(new QuickActionViewLayout(context, 0));
            case 6:
                return new C11695j(new QuickActionViewLayout(context, 1));
            case 7:
                return new C11695j(new QuickActionViewLayout(context, 2));
            case 8:
                return new C11695j(new QuickActionViewLayout(context, 3));
            case 9:
                return new C11695j(new QuickActionViewLayout(context, 4));
            case 10:
                return new C11695j(new QuickActionViewLayout(context, 5));
            case 11:
                return new C11694i(new ChatInfoModuleViews$EventSuggestionRowModuleView(context));
            case 12:
                return new C11694i(new ChatInfoModuleViews$ChatHeaderItemModuleView(context) { // from class: com.zing.zalo.ui.moduleview.chatinfo.ChatInfoModuleViews$EmptyChatHeaderItemModuleView
                    @Override // com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$ChatHeaderItemModuleView, com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
                    /* renamed from: f */
                    public void mo65101f(ChatInfoAdapter.C11690e c11690e, int i12) {
                        this.f64541M.mo44614b1(8);
                        this.f64541M.mo89109M0(null);
                        this.f64543O.mo44614b1(8);
                    }
                });
            case 13:
                return new C11694i(new ChatInfoModuleViews$ChatGroupDescModuleView(context, this.f60777t, this.f60778u));
            default:
                return new C11696k(this.f60776s.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false));
        }
    }

    /* renamed from: S */
    public void m65092S(List list) {
        this.f60781x.clear();
        this.f60781x.add(new C11690e(0));
        if (list != null) {
            this.f60781x.addAll(list);
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f60781x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C11690e m65087N = m65087N(i11);
        if (m65087N != null) {
            return m65087N.m65115b();
        }
        return -1;
    }
}
