package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$SettingHorizontalModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20005c;
import java.util.ArrayList;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p037bk.C2827a;
import p133ek.AbstractC18458a;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ChatInfoModuleViews$SettingHorizontalModuleView extends ModulesView implements ChatInfoAdapter.InterfaceC11686a {

    /* renamed from: K */
    C16719g f64572K;

    /* renamed from: L */
    C16716d f64573L;

    /* renamed from: M */
    C23528a f64574M;

    /* renamed from: N */
    ChatInfoAdapter.InterfaceC11689d f64575N;

    /* renamed from: O */
    int f64576O;

    /* renamed from: P */
    int f64577P;

    /* renamed from: Q */
    C12406a[] f64578Q;

    /* renamed from: R */
    C20005c[] f64579R;

    /* renamed from: com.zing.zalo.ui.moduleview.chatinfo.ChatInfoModuleViews$SettingHorizontalModuleView$a */
    /* loaded from: classes6.dex */
    public class C12406a extends C16716d {

        /* renamed from: M0 */
        C16716d f64580M0;

        /* renamed from: N0 */
        C22126c0 f64581N0;

        /* renamed from: O0 */
        C21693c f64582O0;

        /* renamed from: P0 */
        C21693c f64583P0;

        /* renamed from: Q0 */
        C3977j f64584Q0;

        /* renamed from: R0 */
        int f64585R0;

        /* renamed from: S0 */
        boolean f64586S0;

        public C12406a(Context context, boolean z11) {
            super(context);
            this.f64584Q0 = new C3977j(context);
            m89106L().m89028L(-1, -1).m89046b0(AbstractC23136l9.m118655I(AbstractC16802y.chat_horizontal_item_padding_lr)).m89048d0(ChatInfoModuleViews$SettingHorizontalModuleView.this.f64576O).m89033Q(AbstractC23222t7.f112566j).m89047c0(AbstractC23136l9.m118655I(AbstractC16802y.chat_horizontal_item_padding_lr)).m89044a0(ChatInfoModuleViews$SettingHorizontalModuleView.this.f64577P);
            C16716d c16716d = new C16716d(context);
            this.f64580M0 = c16716d;
            c16716d.m89106L().m89028L(AbstractC23136l9.m118742r(60.0f), AbstractC23136l9.m118742r(48.0f)).m89026J(true);
            C21693c c21693c = new C21693c(context);
            this.f64582O0 = c21693c;
            c21693c.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_grey_with_corners));
            C16718f m89106L = this.f64582O0.m89106L();
            int i11 = AbstractC23222t7.f112532K;
            m89106L.m89028L(i11, i11).m89033Q(AbstractC23222t7.f112566j).m89025I(true);
            this.f64582O0.m111929z1(3);
            C21693c c21693c2 = new C21693c(context);
            this.f64583P0 = c21693c2;
            c21693c2.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_right_menu_item_bg_number_notif));
            C16718f m89035S = this.f64583P0.m89106L().m89028L(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f)).m89036T(ChatInfoModuleViews$SettingHorizontalModuleView.this.f64576O).m89035S(AbstractC23136l9.m118742r(10.0f));
            Boolean bool = Boolean.TRUE;
            m89035S.m89017A(bool).m89018B(bool);
            this.f64580M0.m89001g1(this.f64582O0);
            this.f64580M0.m89001g1(this.f64583P0);
            C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_horizontal_item_text_size), C23212s8.m119607o(context, AbstractC21196a.TextColor1), false);
            this.f64581N0 = c22126c0;
            c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
            this.f64581N0.m89106L().m89028L(-2, -2).m89038V(AbstractC23136l9.m118742r(80.0f)).m89023G(this.f64580M0).m89026J(true);
            this.f64581N0.m115422R1();
            m89001g1(this.f64580M0);
            m89001g1(this.f64581N0);
            m89087B0(AbstractC16803z.stencils_contact_bg);
            this.f64586S0 = z11;
        }

        /* renamed from: q1 */
        public /* synthetic */ void m69702q1(ChatInfoAdapter.C11692g c11692g, C16719g c16719g) {
            int i11 = c11692g.f60811b;
            if (i11 != 48) {
                ChatInfoAdapter.InterfaceC11689d interfaceC11689d = ChatInfoModuleViews$SettingHorizontalModuleView.this.f64575N;
                if (interfaceC11689d != null) {
                    interfaceC11689d.mo65113S3(i11);
                    return;
                }
                return;
            }
            ChatInfoAdapter.InterfaceC11689d interfaceC11689d2 = ChatInfoModuleViews$SettingHorizontalModuleView.this.f64575N;
            if (interfaceC11689d2 != null) {
                interfaceC11689d2.mo65111Q3();
                AbstractC23647d.m123897g("1591017");
            }
        }

        /* renamed from: p1 */
        public void m69703p1(ChatInfoAdapter.C11692g c11692g) {
            String str;
            int i11;
            this.f64585R0 = c11692g.f60811b;
            this.f64581N0.m111959G1(AbstractC23136l9.m118743r0(c11692g.f60812c));
            int i12 = 8;
            this.f64583P0.mo44614b1(8);
            int i13 = c11692g.f60811b;
            if (i13 != 14) {
                if (i13 != 22) {
                    if (i13 != 26) {
                        if (i13 != 60) {
                            if (i13 != 33) {
                                if (i13 != 34) {
                                    if (i13 != 48 && i13 != 49) {
                                        if (i13 != 64) {
                                            if (i13 == 65) {
                                                this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_profile));
                                            }
                                        } else {
                                            this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_info));
                                        }
                                    } else {
                                        this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_share_right_menu));
                                    }
                                } else {
                                    this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_khomedia_rightmenu_star_filled));
                                    this.f64581N0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.cm_removefavorite_zalouser));
                                }
                            } else {
                                this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_khomedia_rightmenu_star));
                                this.f64581N0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.markfavorite_zalouser));
                            }
                        } else {
                            if (this.f64586S0) {
                                i11 = AbstractC16803z.ic_community_add_2;
                            } else {
                                i11 = AbstractC16803z.ic_group_add_2;
                            }
                            this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), i11));
                            C21693c c21693c = this.f64583P0;
                            if (c11692g.f60822m) {
                                i12 = 0;
                            }
                            c21693c.mo44614b1(i12);
                        }
                    } else {
                        this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_search));
                    }
                } else if (!c11692g.f60820k) {
                    this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_noti_off));
                    this.f64581N0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_on_notif_newmsg_v2));
                } else {
                    this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_noti));
                    this.f64581N0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_off_notif_newmsg_v2));
                }
            } else {
                this.f64582O0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_brush));
                C2827a m2516G = AbstractC23306f.m120562A().m2516G();
                if (m2516G.m13669f() && m2516G.m13668e()) {
                    if (!TextUtils.isEmpty(m2516G.m13666c())) {
                        AbstractC23268y2.m120034h(ChatInfoModuleViews$SettingHorizontalModuleView.this.f64574M, this.f64584Q0, this.f64582O0, m2516G.m13666c(), C23278z2.m120067E0(), false);
                    }
                    C21693c c21693c2 = this.f64583P0;
                    if (m2516G.m13671h()) {
                        i12 = 0;
                    }
                    c21693c2.mo44614b1(i12);
                    if (m2516G.m13667d().containsKey(AbstractC18458a.f93019a)) {
                        str = (String) m2516G.m13667d().get(AbstractC18458a.f93019a);
                    } else if (m2516G.m13667d().containsKey("en")) {
                        str = (String) m2516G.m13667d().get("en");
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.f64581N0.m111959G1(str);
                    }
                } else {
                    this.f64583P0.mo44614b1(8);
                }
            }
            mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.chatinfo.a

                /* renamed from: q */
                public final /* synthetic */ ChatInfoAdapter.C11692g f64589q;

                public /* synthetic */ C12407a(ChatInfoAdapter.C11692g c11692g2) {
                    r2 = c11692g2;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatInfoModuleViews$SettingHorizontalModuleView.C12406a.this.m69702q1(r2, c16719g);
                }
            });
        }
    }

    public ChatInfoModuleViews$SettingHorizontalModuleView(Context context, C23528a c23528a, ChatInfoAdapter.InterfaceC11689d interfaceC11689d, boolean z11) {
        super(context);
        float f11;
        this.f64576O = AbstractC23136l9.m118742r(4.0f);
        this.f64577P = AbstractC23136l9.m118742r(12.0f);
        this.f64578Q = new C12406a[4];
        this.f64579R = new C20005c[5];
        this.f64574M = c23528a;
        this.f64575N = interfaceC11689d;
        boolean z12 = context instanceof ZaloBubbleActivity;
        m88987U(-1, -2);
        C16719g c16719g = new C16719g(context);
        this.f64572K = c16719g;
        c16719g.m89106L().m89028L(-1, 1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_padding_lr));
        this.f64572K.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        C16716d c16716d = new C16716d(context);
        this.f64573L = c16716d;
        C16718f m89023G = c16716d.m89106L().m89028L(-1, -2).m89023G(this.f64572K);
        if (z12) {
            f11 = 10.0f;
        } else {
            f11 = 28.0f;
        }
        m89023G.m89034R(AbstractC23136l9.m118742r(f11)).m89035S(AbstractC23136l9.m118742r(z12 ? 10.0f : 28.0f));
        int i11 = 0;
        int i12 = 0;
        while (true) {
            C20005c[] c20005cArr = this.f64579R;
            if (i12 >= c20005cArr.length) {
                break;
            }
            c20005cArr[i12] = new C20005c().m103822e(i12 / 4.0f);
            i12++;
        }
        while (i11 < 4) {
            this.f64578Q[i11] = new C12406a(context, z11);
            int i13 = i11 + 1;
            this.f64578Q[i11].m89106L().m89058j0(this.f64579R[i11]).m89052g0(this.f64579R[i13]);
            this.f64573L.m89001g1(this.f64578Q[i11]);
            i11 = i13;
        }
        mo69681L(this.f64572K);
        mo69681L(this.f64573L);
    }

    /* renamed from: V */
    public Rect m69700V(int i11) {
        for (C12406a c12406a : this.f64578Q) {
            if (c12406a.f64585R0 == i11) {
                return new Rect(c12406a.m89096G(), 0, c12406a.m89096G() + c12406a.getCurrentWidth(), (c12406a.m89090D() + c12406a.getCurrentHeight()) - AbstractC23136l9.m118742r(10.0f));
            }
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
    /* renamed from: f */
    public void mo65101f(ChatInfoAdapter.C11690e c11690e, int i11) {
        if (c11690e instanceof ChatInfoAdapter.C11693h) {
            ChatInfoAdapter.C11693h c11693h = (ChatInfoAdapter.C11693h) c11690e;
            ArrayList arrayList = c11693h.f60828b;
            int i12 = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                this.f64578Q[i13].mo44614b1(8);
            }
            if (arrayList != null && arrayList.size() != 0) {
                int min = Math.min(4, arrayList.size());
                float f11 = ((4 - min) * 0.25f) / 2.0f;
                for (int i14 = 0; i14 < min + 1; i14++) {
                    this.f64579R[i14].m103822e(f11);
                    f11 += 0.25f;
                }
                for (int i15 = 0; i15 < min; i15++) {
                    ChatInfoAdapter.C11692g c11692g = (ChatInfoAdapter.C11692g) arrayList.get(i15);
                    this.f64578Q[i15].mo44614b1(0);
                    this.f64578Q[i15].m69703p1(c11692g);
                }
                C16719g c16719g = this.f64572K;
                if (c16719g != null) {
                    if (!c11693h.f60829c) {
                        i12 = 8;
                    }
                    c16719g.mo44614b1(i12);
                }
            }
        }
    }
}
