package com.zing.zalo.p077ui.maintab.msg;

import ag0.C0855y0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2345f;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.maintab.msg.AbstractC12211a;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.p077ui.moduleview.message.DeletedThreadMsgModuleView;
import com.zing.zalo.p077ui.moduleview.message.FooterTabReadLaterModuleView;
import com.zing.zalo.p077ui.moduleview.message.GroupInvitationBoxModuleView;
import com.zing.zalo.p077ui.moduleview.message.MediaBoxModuleView;
import com.zing.zalo.p077ui.moduleview.message.NormalMsgModuleView;
import com.zing.zalo.p077ui.moduleview.message.PromotedModuleView;
import com.zing.zalo.p077ui.moduleview.message.ReadLaterConversationSuggestModuleView;
import com.zing.zalo.p077ui.moduleview.message.ReadLaterEmptyModuleView;
import com.zing.zalo.p077ui.moduleview.message.RemindEventMsgModuleView;
import com.zing.zalo.p077ui.moduleview.message.SeeMoreSuggestAddChatLabelModuleView;
import com.zing.zalo.p077ui.moduleview.message.StrangerBoxModuleView;
import com.zing.zalo.p077ui.moduleview.message.SuggestFriendItemModuleView;
import com.zing.zalo.p077ui.moduleview.message.SuggestFriendSeeMoreModuleView;
import com.zing.zalo.p077ui.moduleview.message.TabMsgItemModulesView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ZinstantAdItemView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p132ej.C18447i;
import p132ej.C18448j;
import p132ej.C18449k;
import p132ej.C18451m;
import p132ej.C18452n;
import p132ej.C18456r;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p716zh.C31862c;
import p716zh.C32041nd;

/* renamed from: com.zing.zalo.ui.maintab.msg.j */
/* loaded from: classes5.dex */
public class C12260j extends AbstractC12211a {

    /* renamed from: G */
    private static final String f63834G = "j";

    /* renamed from: H */
    public static C0855y0 f63835H = new C0855y0();

    /* renamed from: A */
    ZinstantAdItemView.InterfaceC13555d f63836A;

    /* renamed from: s */
    public AbstractC22055v0.l f63843s;

    /* renamed from: t */
    public C23528a f63844t;

    /* renamed from: u */
    public List f63845u;

    /* renamed from: w */
    public AbstractC12211a.b f63847w;

    /* renamed from: x */
    public AbstractC12211a.a f63848x;

    /* renamed from: y */
    public NormalMsgModuleView.InterfaceC12426b f63849y;

    /* renamed from: z */
    InterfaceC13567b1.a f63850z;

    /* renamed from: r */
    private List f63842r = new ArrayList();

    /* renamed from: v */
    private int f63846v = 0;

    /* renamed from: B */
    public HashMap f63837B = new HashMap();

    /* renamed from: C */
    private boolean f63838C = true;

    /* renamed from: D */
    private boolean f63839D = true;

    /* renamed from: E */
    private boolean f63840E = true;

    /* renamed from: F */
    private boolean f63841F = false;

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$a */
    /* loaded from: classes5.dex */
    public class a extends b {

        /* renamed from: J */
        public TabMsgItemModulesView f63851J;

        public a(TabMsgItemModulesView tabMsgItemModulesView) {
            super(tabMsgItemModulesView);
            this.f63851J = tabMsgItemModulesView;
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            try {
                super.mo68724i0(c18451m, i11, c12260j);
                this.f63851J.mo69822C(c18451m, i11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$b */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private boolean f63853I;

        public b(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            if (this.f63853I) {
                if (c12260j.m68702V()) {
                    this.f7784p.setAlpha(0.5f);
                    this.f7784p.setEnabled(false);
                    this.f7784p.setPadding(AbstractC23222t7.f112534M, 0, 0, 0);
                } else {
                    this.f7784p.setAlpha(1.0f);
                    this.f7784p.setEnabled(true);
                    this.f7784p.setPadding(0, 0, 0, 0);
                }
            }
        }

        /* renamed from: j0 */
        b m68725j0() {
            this.f63853I = true;
            return this;
        }

        /* renamed from: k0 */
        public void m68726k0() {
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$c */
    /* loaded from: classes5.dex */
    public class c extends b {

        /* renamed from: J */
        QuickActionViewLayout f63854J;

        public c(QuickActionViewLayout quickActionViewLayout) {
            super(quickActionViewLayout);
            this.f63854J = quickActionViewLayout;
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            boolean z11;
            super.mo68724i0(c18451m, i11, c12260j);
            C31862c c31862c = ((C18448j) c18451m).f92980e;
            QuickActionViewLayout quickActionViewLayout = this.f63854J;
            if (quickActionViewLayout != null) {
                quickActionViewLayout.m75818b(c31862c, C12260j.this.f63850z);
                QuickActionViewLayout quickActionViewLayout2 = this.f63854J;
                if (c31862c.f146319l && (AbstractC2345f.m12313b(MainApplication.getAppContext()) || AbstractC23165o5.m119333b())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                quickActionViewLayout2.m75819e(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$d */
    /* loaded from: classes5.dex */
    public class d extends b {

        /* renamed from: J */
        public Button f63856J;

        public d(View view) {
            super(view);
            this.f63856J = (Button) view.findViewById(AbstractC6918a0.btn_find_friend_native);
        }

        /* renamed from: m0 */
        public /* synthetic */ void m68728m0(View view) {
            AbstractC12211a.b bVar = C12260j.this.f63847w;
            if (bVar != null) {
                bVar.mo68390xA(3);
            }
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            super.mo68724i0(c18451m, i11, c12260j);
            Button button = this.f63856J;
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: t70.y1
                    public /* synthetic */ ViewOnClickListenerC26578y1() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12260j.d.this.m68728m0(view);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$e */
    /* loaded from: classes5.dex */
    public class e extends b {

        /* renamed from: J */
        LinearLayout f63858J;

        /* renamed from: K */
        RecyclingImageView f63859K;

        /* renamed from: L */
        AvatarImageView f63860L;

        /* renamed from: M */
        RecyclingImageView f63861M;

        /* renamed from: N */
        TextView f63862N;

        /* renamed from: O */
        TextView f63863O;

        /* renamed from: P */
        TextView f63864P;

        /* renamed from: Q */
        Context f63865Q;

        public e(Context context, View view) {
            super(view);
            this.f63865Q = context;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layout_find_more_friends);
            this.f63858J = linearLayout;
            this.f63859K = (RecyclingImageView) linearLayout.findViewById(AbstractC6918a0.buddy_dp);
            this.f63861M = (RecyclingImageView) this.f63858J.findViewById(AbstractC6918a0.ic_close_view);
            this.f63862N = (TextView) this.f63858J.findViewById(AbstractC6918a0.title_find_more);
            this.f63863O = (TextView) this.f63858J.findViewById(AbstractC6918a0.desc_find_more);
            this.f63864P = (TextView) this.f63858J.findViewById(AbstractC6918a0.action_find_more);
            this.f63860L = (AvatarImageView) this.f63858J.findViewById(AbstractC6918a0.image_profile);
        }

        /* renamed from: o0 */
        public /* synthetic */ void m68732o0(View view) {
            AbstractC12211a.b bVar = C12260j.this.f63847w;
            if (bVar != null) {
                bVar.mo68390xA(0);
            }
        }

        /* renamed from: p0 */
        public /* synthetic */ void m68733p0(View view) {
            AbstractC12211a.b bVar = C12260j.this.f63847w;
            if (bVar != null) {
                bVar.mo68390xA(1);
            }
        }

        /* renamed from: q0 */
        public /* synthetic */ void m68734q0(View view) {
            AbstractC12211a.b bVar = C12260j.this.f63847w;
            if (bVar != null) {
                bVar.mo68390xA(2);
            }
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            super.mo68724i0(c18451m, i11, c12260j);
            try {
                if (TextUtils.isEmpty(AbstractC23309i.m122530w5())) {
                    this.f63862N.setText(this.f63865Q.getString(AbstractC8020f0.msg_find_more_friend_title));
                    this.f63863O.setText(this.f63865Q.getString(AbstractC8020f0.msg_find_more_desc_opt_one));
                    this.f63864P.setText(this.f63865Q.getString(AbstractC8020f0.str_cap_start));
                    LinearLayout linearLayout = this.f63858J;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        this.f63858J.setOnClickListener(new View.OnClickListener() { // from class: t70.z1
                            public /* synthetic */ ViewOnClickListenerC26581z1() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C12260j.e.this.m68732o0(view);
                            }
                        });
                    }
                } else {
                    this.f63862N.setText(this.f63865Q.getString(AbstractC8020f0.msg_find_more_friend_title));
                    this.f63863O.setText(this.f63865Q.getString(AbstractC8020f0.msg_find_more_desc_opt_two));
                    this.f63864P.setText(this.f63865Q.getString(AbstractC8020f0.str_cap_start));
                    LinearLayout linearLayout2 = this.f63858J;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                        this.f63858J.setOnClickListener(new View.OnClickListener() { // from class: t70.a2
                            public /* synthetic */ ViewOnClickListenerC26502a2() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C12260j.e.this.m68733p0(view);
                            }
                        });
                    }
                }
                RecyclingImageView recyclingImageView = this.f63859K;
                recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.icn_contact_connect));
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42446v)) {
                    ((C23528a) C12260j.this.f63844t.m123612r(this.f63860L)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
                } else {
                    ((C23528a) C12260j.this.f63844t.m123612r(this.f63860L)).m123615u(AbstractC23136l9.m118665N(this.f63860L.getContext(), AbstractC16803z.default_avatar2));
                }
                this.f63860L.setVisibility(0);
                this.f63861M.setOnClickListener(new View.OnClickListener() { // from class: t70.b2
                    public /* synthetic */ ViewOnClickListenerC26506b2() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12260j.e.this.m68734q0(view);
                    }
                });
            } catch (Exception e11) {
                LinearLayout linearLayout3 = this.f63858J;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                AbstractC23350e.m122774d(C12260j.f63834G, e11.toString());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$f */
    /* loaded from: classes5.dex */
    public static class f extends b {

        /* renamed from: J */
        public ZSimpleGIFView f63867J;

        /* renamed from: K */
        public LinearLayout f63868K;

        /* renamed from: L */
        public LinearLayout f63869L;

        /* renamed from: M */
        public View f63870M;

        /* renamed from: N */
        public View f63871N;

        /* renamed from: O */
        public View f63872O;

        /* renamed from: P */
        public View f63873P;

        /* renamed from: Q */
        public TextView f63874Q;

        /* renamed from: R */
        public TextView f63875R;

        /* renamed from: S */
        public ImageView f63876S;

        /* renamed from: T */
        Context f63877T;

        public f(Context context, View view) {
            super(view);
            this.f63877T = context;
            ZSimpleGIFView zSimpleGIFView = (ZSimpleGIFView) view.findViewById(AbstractC6918a0.simpleGifStickyMsg);
            this.f63867J = zSimpleGIFView;
            zSimpleGIFView.setCropMode(1);
            this.f63868K = (LinearLayout) view.findViewById(AbstractC6918a0.layoutSeeMore);
            this.f63869L = (LinearLayout) view.findViewById(AbstractC6918a0.header_view_list_contact);
            this.f63870M = view.findViewById(AbstractC6918a0.separate_line1);
            this.f63871N = view.findViewById(AbstractC6918a0.separate_line2);
            this.f63872O = view.findViewById(AbstractC6918a0.extra_view_item_end);
            this.f63873P = view.findViewById(AbstractC6918a0.extra_view_separate_top);
            this.f63874Q = (TextView) view.findViewById(AbstractC6918a0.tvTitleSeeMore);
            this.f63875R = (TextView) view.findViewById(AbstractC6918a0.tvTitleSeeMoreCenter);
            this.f63876S = (ImageView) view.findViewById(AbstractC6918a0.icon_next);
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            int i12;
            super.mo68724i0(c18451m, i11, c12260j);
            ContactProfile contactProfile = c18451m.f92992c;
            int i13 = c18451m.f92990a;
            int i14 = 0;
            if (i13 != 4 && i13 != 8) {
                if (i13 == 2) {
                    LinearLayout linearLayout = this.f63868K;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = this.f63869L;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    View view = this.f63872O;
                    if (view != null) {
                        if (contactProfile == null || !contactProfile.f42405d1) {
                            i14 = 8;
                        }
                        view.setVisibility(i14);
                        return;
                    }
                    return;
                }
                if (c18451m instanceof C18452n) {
                    C18452n c18452n = (C18452n) c18451m;
                    if (c18452n.f92995f == 14 && !TextUtils.isEmpty(c18452n.f92999j)) {
                        LinearLayout linearLayout3 = this.f63868K;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                        LinearLayout linearLayout4 = this.f63869L;
                        if (linearLayout4 != null) {
                            linearLayout4.setVisibility(8);
                        }
                        ZSimpleGIFView zSimpleGIFView = this.f63867J;
                        if (zSimpleGIFView != null) {
                            if (zSimpleGIFView.getLayoutParams().height != c18452n.f93002m) {
                                this.f63867J.getLayoutParams().height = c18452n.f93002m;
                                this.f63867J.requestLayout();
                            }
                            int i15 = c18452n.f92998i;
                            if (i15 == 0) {
                                this.f63867J.setVisibility(0);
                                this.f63867J.m88227l(new ZSimpleGIFView.C16554f(c18452n.f92999j, c18452n.f93000k, c18452n.f93001l, c18452n.f93002m, "MsgListAdapter"), i11, null);
                                return;
                            } else {
                                if (i15 == 1) {
                                    this.f63867J.setVisibility(0);
                                    this.f63867J.m88227l(new ZSimpleGIFView.C16554f(c18452n.f92999j, c18452n.f93000k, c18452n.f93001l, c18452n.f93002m, "MsgListAdapter"), i11, null);
                                    this.f63867J.m88224g(100L);
                                    return;
                                }
                                this.f63867J.setVisibility(8);
                                return;
                            }
                        }
                        return;
                    }
                }
                ZSimpleGIFView zSimpleGIFView2 = this.f63867J;
                if (zSimpleGIFView2 != null) {
                    zSimpleGIFView2.setVisibility(8);
                    return;
                }
                return;
            }
            View view2 = this.f63870M;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            TextView textView = this.f63874Q;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f63876S;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View view3 = this.f63873P;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            TextView textView2 = this.f63875R;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            View view4 = this.f63872O;
            if (view4 != null) {
                if (contactProfile != null && contactProfile.f42405d1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                view4.setVisibility(i12);
            }
            LinearLayout linearLayout5 = this.f63868K;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
            LinearLayout linearLayout6 = this.f63869L;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(8);
            }
            View view5 = this.f63871N;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$g */
    /* loaded from: classes5.dex */
    public static class g extends b {

        /* renamed from: J */
        public TextView f63878J;

        /* renamed from: K */
        public TextView f63879K;

        /* renamed from: L */
        Context f63880L;

        public g(Context context, View view) {
            super(view);
            this.f63880L = context;
            this.f63878J = (TextView) view.findViewById(AbstractC6918a0.title_label);
            this.f63879K = (TextView) view.findViewById(AbstractC6918a0.title_funtion);
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            ContactProfile contactProfile;
            super.mo68724i0(c18451m, i11, c12260j);
            if (c18451m != null) {
                contactProfile = c18451m.f92992c;
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                this.f63879K.setVisibility(8);
                this.f63878J.setText(contactProfile.f42437s);
                this.f63878J.setVisibility(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$h */
    /* loaded from: classes5.dex */
    public class h extends b {

        /* renamed from: J */
        public GroupAvatarView f63881J;

        /* renamed from: K */
        public RobotoTextView f63882K;

        /* renamed from: L */
        public RobotoTextView f63883L;

        /* renamed from: M */
        public RoundCornerImageView f63884M;

        /* renamed from: N */
        public TextView f63885N;

        /* renamed from: O */
        Context f63886O;

        /* renamed from: com.zing.zalo.ui.maintab.msg.j$h$a */
        /* loaded from: classes5.dex */
        class a extends C23999j {
            a() {
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                try {
                    if (interfaceC3968a instanceof RoundCornerImageView) {
                        interfaceC3968a.setImageInfo(c3979l, true);
                        if (Build.VERSION.SDK_INT >= 23) {
                            ((RoundCornerImageView) interfaceC3968a).setForeground(AbstractC1388a.m6964f(h.this.f63886O, AbstractC16803z.bg_promote_item_oa_blur));
                        } else {
                            ((RoundCornerImageView) interfaceC3968a).setForegroundResourceCompat(AbstractC16803z.bg_promote_item_oa_blur);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public h(Context context, View view) {
            super(view);
            this.f63886O = context;
            this.f63881J = (GroupAvatarView) view.findViewById(AbstractC6918a0.img_avt);
            this.f63882K = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
            this.f63883L = (RobotoTextView) view.findViewById(AbstractC6918a0.des);
            this.f63884M = (RoundCornerImageView) view.findViewById(AbstractC6918a0.imgBGBlur);
            this.f63885N = (TextView) view.findViewById(AbstractC6918a0.btn_combine_func_1);
        }

        /* renamed from: m0 */
        public /* synthetic */ void m68736m0(C18451m c18451m, int i11, int i12, View view) {
            C12260j.this.getClass();
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            int i12;
            int i13;
            super.mo68724i0(c18451m, i11, c12260j);
            ContactProfile contactProfile = c18451m.f92992c;
            try {
                this.f63882K.setText(contactProfile.m40383Q(true, false).trim());
                this.f63883L.setText(contactProfile.f42436r1);
                AbstractC23268y2.m120027a(this.f63881J, contactProfile, false);
                RoundCornerImageView roundCornerImageView = this.f63884M;
                if (roundCornerImageView != null) {
                    if (c18451m.f92990a == 11) {
                        if (!TextUtils.isEmpty(contactProfile.f42446v) && !C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                            if (C23999j.m125696L2(contactProfile.f42446v, C23278z2.m120113b())) {
                                ((C23528a) C12260j.this.f63844t.m123612r(this.f63884M)).m123579C(contactProfile.f42446v, C23278z2.m120113b(), new a());
                            }
                        }
                        this.f63884M.setImageResource(AbstractC16803z.avatar_blur_default);
                    } else {
                        roundCornerImageView.setBackgroundResource(AbstractC16801x.transparent);
                    }
                }
                if (contactProfile.f42352K0 > 0) {
                    if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                        this.f63885N.setText(this.f63886O.getString(AbstractC8020f0.str_suggest_flow_oa_action));
                        i12 = 3;
                    } else {
                        this.f63885N.setText(this.f63886O.getString(AbstractC8020f0.str_suggest_func_follow_page));
                        i12 = 2;
                    }
                    TextView textView = this.f63885N;
                    if (contactProfile.f42329C1 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    textView.setVisibility(i13);
                } else {
                    i12 = -1;
                }
                this.f63885N.setOnClickListener(new View.OnClickListener() { // from class: t70.c2

                    /* renamed from: q */
                    public final /* synthetic */ C18451m f125755q;

                    /* renamed from: r */
                    public final /* synthetic */ int f125756r;

                    /* renamed from: s */
                    public final /* synthetic */ int f125757s;

                    public /* synthetic */ ViewOnClickListenerC26510c2(C18451m c18451m2, int i112, int i122) {
                        r2 = c18451m2;
                        r3 = i112;
                        r4 = i122;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12260j.h.this.m68736m0(r2, r3, r4, view);
                    }
                });
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f7784p.getLayoutParams();
                if (i112 == 0) {
                    layoutParams.setMargins(C12260j.this.m68697Q(AbstractC16802y.card_oa_nearby_margin_letf_right), 0, C12260j.this.m68697Q(AbstractC16802y.card_oa_nearby_margin), 0);
                } else if (i112 == C12260j.this.mo10003k() - 1) {
                    layoutParams.setMargins(C12260j.this.m68697Q(AbstractC16802y.card_oa_nearby_margin), 0, C12260j.this.m68697Q(AbstractC16802y.card_oa_nearby_margin_letf_right), 0);
                } else {
                    layoutParams.setMargins(C12260j.this.m68697Q(AbstractC16802y.card_oa_nearby_margin), 0, C12260j.this.m68697Q(AbstractC16802y.card_oa_nearby_margin), 0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.j$i */
    /* loaded from: classes5.dex */
    public class i extends b {

        /* renamed from: J */
        ZinstantAdItemView f63889J;

        public i(ZinstantAdItemView zinstantAdItemView) {
            super(zinstantAdItemView);
            this.f63889J = zinstantAdItemView;
        }

        @Override // com.zing.zalo.p077ui.maintab.msg.C12260j.b
        /* renamed from: i0 */
        public void mo68724i0(C18451m c18451m, int i11, C12260j c12260j) {
            boolean z11;
            super.mo68724i0(c18451m, i11, c12260j);
            C32041nd m97773o = ((C18456r) c18451m).m97773o();
            ZinstantAdItemView zinstantAdItemView = this.f63889J;
            C12260j c12260j2 = C12260j.this;
            ZinstantAdItemView.InterfaceC13555d interfaceC13555d = c12260j2.f63836A;
            AbstractC12211a.b bVar = c12260j2.f63847w;
            if (bVar != null && bVar.mo68310EF()) {
                z11 = true;
            } else {
                z11 = false;
            }
            zinstantAdItemView.m75986a(m97773o, interfaceC13555d, z11);
        }
    }

    public C12260j(AbstractC22055v0.l lVar) {
        this.f63843s = lVar;
    }

    /* renamed from: N */
    public static void m68693N() {
        C0855y0 c0855y0 = f63835H;
        if (c0855y0 != null) {
            c0855y0.m2383a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: D */
    public void mo9993D(RecyclerView recyclerView) {
        super.mo9993D(recyclerView);
        m68693N();
    }

    /* renamed from: M */
    public boolean m68694M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!AbstractC25495a.m132081f(str) && !AbstractC25495a.m132084i(str)) {
            if (AbstractC25495a.m132078c(str)) {
                return this.f63839D;
            }
            if (AbstractC21935u.m114519I(str)) {
                return this.f63840E;
            }
            return true;
        }
        return this.f63838C;
    }

    /* renamed from: O */
    public int m68695O(String str) {
        int size;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        List list = this.f63842r;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        for (int i11 = 0; i11 < size; i11++) {
            C18451m c18451m = (C18451m) this.f63842r.get(i11);
            if (c18451m != null && c18451m.mo97719a().equals(str)) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public List m68696P() {
        try {
            return new ArrayList(this.f63842r);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Q */
    int m68697Q(int i11) {
        return (int) (MainApplication.getAppContext().getResources().getDimension(i11) + 0.5f);
    }

    /* renamed from: R */
    public C18451m m68698R(int i11) {
        List list = this.f63842r;
        if (list != null && list.size() > i11) {
            return (C18451m) this.f63842r.get(i11);
        }
        return null;
    }

    /* renamed from: S */
    public int m68699S(HashMap hashMap) {
        int size;
        C18451m c18451m;
        if (hashMap != null) {
            hashMap.clear();
        }
        List list = this.f63842r;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int mo10005m = mo10005m(i12);
            if ((mo10005m == 0 || mo10005m == 1 || mo10005m == 2 || mo10005m == 3) && (c18451m = (C18451m) this.f63842r.get(i12)) != null) {
                String mo97719a = c18451m.mo97719a();
                if (!TextUtils.isEmpty(mo97719a) && m68694M(mo97719a)) {
                    i11++;
                    if (hashMap != null) {
                        hashMap.put(mo97719a, c18451m);
                    }
                }
            }
        }
        return i11;
    }

    /* renamed from: T */
    public int m68700T() {
        return this.f63837B.size();
    }

    /* renamed from: U */
    public HashMap m68701U() {
        return this.f63837B;
    }

    /* renamed from: V */
    public boolean m68702V() {
        if (!this.f63841F && this.f63837B.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W */
    public void mo9990A(b bVar, int i11) {
        C18451m c18451m;
        List list = this.f63842r;
        if (list != null && list.size() > i11) {
            c18451m = (C18451m) this.f63842r.get(i11);
        } else {
            c18451m = new C18451m(1);
            c18451m.f92992c = new ContactProfile("-999");
        }
        bVar.mo68724i0(c18451m, i11, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        switch (i11) {
            case 0:
            case 1:
                return new a(new NormalMsgModuleView(context, this, this.f63849y, 1));
            case 2:
                return new a(new MediaBoxModuleView(context, this));
            case 3:
                return new a(new StrangerBoxModuleView(context, this));
            case 4:
                return new a(new PromotedModuleView(context, this));
            case 5:
            case 6:
            case 7:
                return new f(context, LayoutInflater.from(context).inflate(AbstractC7409c0.messages_edit_row_sticky_gif, viewGroup, false));
            case 8:
                return new a(new SuggestFriendItemModuleView(context, this.f63844t, this));
            case 9:
                return new b(new ReadLaterEmptyModuleView(context));
            case 10:
                return new a(new ReadLaterConversationSuggestModuleView(context, this.f63844t, this));
            case 11:
                return new g(context, LayoutInflater.from(context).inflate(AbstractC7409c0.header_row_global_search, viewGroup, false));
            case 12:
                return new b(new SeeMoreSuggestAddChatLabelModuleView(context));
            case 13:
                return new b(new FooterTabReadLaterModuleView(context, this));
            case 14:
                return new e(context, LayoutInflater.from(context).inflate(AbstractC7409c0.header_view_msg_tab, viewGroup, false));
            case 15:
                return new h(context, LayoutInflater.from(context).inflate(AbstractC7409c0.promote_item_oa, viewGroup, false));
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return new h(context, LayoutInflater.from(context).inflate(AbstractC7409c0.promote_item_oa_bg_blur, viewGroup, false));
            case 17:
                return new a(new SuggestFriendSeeMoreModuleView(context, this.f63844t, this));
            case 18:
                return new c(new QuickActionViewLayout(context, 0));
            case 19:
                return new c(new QuickActionViewLayout(context, 1));
            case 20:
                return new c(new QuickActionViewLayout(context, 2));
            case 21:
                return new c(new QuickActionViewLayout(context, 3));
            case 22:
                return new c(new QuickActionViewLayout(context, 4));
            case 23:
                return new c(new QuickActionViewLayout(context, 5));
            case 24:
                return new a(new RemindEventMsgModuleView(context, this));
            case 25:
                return new d(LayoutInflater.from(context).inflate(AbstractC7409c0.find_friend_from_native_row, viewGroup, false));
            case 26:
                return new i(new ZinstantAdItemView(context)).m68725j0();
            case 27:
                return new a(new GroupInvitationBoxModuleView(context, this));
            case 28:
                return new a(new DeletedThreadMsgModuleView(context, this));
            case 29:
                return new b(LayoutInflater.from(context).inflate(AbstractC7409c0.warning_low_storage_banner, viewGroup, false)).m68725j0();
            default:
                return new b(new View(context));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y */
    public void mo9997H(b bVar) {
        super.mo9997H(bVar);
        bVar.m68726k0();
    }

    /* renamed from: Z */
    public int m68706Z() {
        if (this.f63837B == null) {
            return 0;
        }
        try {
            HashMap hashMap = new HashMap();
            for (C18451m c18451m : this.f63842r) {
                if (c18451m != null && this.f63837B.containsKey(c18451m.mo97719a())) {
                    hashMap.put(c18451m.mo97719a(), 0);
                }
            }
            for (String str : this.f63837B.keySet()) {
                if (!hashMap.containsKey(str)) {
                    this.f63837B.remove(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f63837B.size();
    }

    /* renamed from: a0 */
    public void m68707a0() {
        this.f63837B = new HashMap();
        this.f63841F = false;
        m10008p();
    }

    /* renamed from: b0 */
    public void m68708b0(Bundle bundle) {
        try {
            this.f63841F = bundle.getBoolean("IS_IN_SELECTION_MODE", false);
            this.f63838C = bundle.getBoolean("ACCEPT_VIP_AND_STRANGER", true);
            this.f63840E = bundle.getBoolean("ACCEPT_SELECT_OA", true);
            this.f63839D = bundle.getBoolean("ACCEPT_SELECT_MY_CLOUD", true);
            ArrayList<String> stringArrayList = bundle.getStringArrayList("SELECTED_ITEMS_ID");
            this.f63837B = new HashMap();
            if (stringArrayList != null) {
                for (C18451m c18451m : this.f63842r) {
                    if (c18451m != null && !TextUtils.isEmpty(c18451m.mo97719a()) && stringArrayList.contains(c18451m.mo97719a())) {
                        this.f63837B.put(c18451m.mo97719a(), c18451m);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c0 */
    public void m68709c0(Bundle bundle) {
        if (this.f63837B != null) {
            try {
                bundle.putBoolean("ACCEPT_VIP_AND_STRANGER", this.f63838C);
                bundle.putBoolean("ACCEPT_SELECT_MY_CLOUD", this.f63839D);
                bundle.putBoolean("ACCEPT_SELECT_OA", this.f63840E);
                bundle.putBoolean("IS_IN_SELECTION_MODE", this.f63841F);
                bundle.putStringArrayList("SELECTED_ITEMS_ID", new ArrayList<>(this.f63837B.keySet()));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d0 */
    public void m68710d0(C23528a c23528a) {
        this.f63844t = c23528a;
    }

    /* renamed from: e0 */
    public void m68711e0(boolean z11) {
        this.f63840E = z11;
    }

    /* renamed from: f0 */
    public void m68712f0(boolean z11) {
        this.f63839D = z11;
    }

    /* renamed from: g0 */
    public void m68713g0(boolean z11) {
        this.f63838C = z11;
    }

    /* renamed from: h0 */
    public void m68714h0(List list) {
        this.f63842r = new ArrayList(list);
        AbstractC12211a.a aVar = this.f63848x;
        if (aVar != null) {
            aVar.mo68351YC();
        }
        m10008p();
    }

    /* renamed from: i0 */
    public void m68715i0(int i11) {
        this.f63846v = i11;
    }

    /* renamed from: j0 */
    public void m68716j0(AbstractC12211a.a aVar) {
        this.f63848x = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f63842r.size();
    }

    /* renamed from: k0 */
    public void m68717k0(AbstractC12211a.b bVar) {
        this.f63847w = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (!m10007o()) {
            return super.mo10004l(i11);
        }
        return i11;
    }

    /* renamed from: l0 */
    public void m68718l0(List list) {
        if (list != null) {
            this.f63845u = new ArrayList(list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C18451m m68698R = m68698R(i11);
        if (m68698R instanceof C18447i) {
            return 2;
        }
        if (m68698R instanceof C18449k) {
            return 3;
        }
        if (m68698R instanceof C18452n) {
            return 4;
        }
        if (m68698R != null) {
            ContactProfile contactProfile = m68698R.f92992c;
            int i12 = m68698R.f92990a;
            if (i12 == 2) {
                return 7;
            }
            if (i12 == 3) {
                return 8;
            }
            if (i12 == 39) {
                return 9;
            }
            if (i12 == 40) {
                return 10;
            }
            if (i12 == 8) {
                return 6;
            }
            if (i12 == 41) {
                return 12;
            }
            if (i12 == 42) {
                return 13;
            }
            if (i12 == 4) {
                return 17;
            }
            if (i12 == 5) {
                return 14;
            }
            if (i12 == 6) {
                return 11;
            }
            if (i12 == 9) {
                int i13 = ((C18448j) m68698R).f92980e.f146309b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    return 22;
                                }
                                if (i13 != 5) {
                                    return -1;
                                }
                                return 23;
                            }
                            return 21;
                        }
                        return 20;
                    }
                    return 19;
                }
                return 18;
            }
            if (i12 == 10) {
                return 15;
            }
            if (i12 == 11) {
                return 16;
            }
            if (i12 == 22) {
                return 24;
            }
            if (i12 == 25) {
                return 25;
            }
            if (i12 == 1) {
                if (contactProfile != null) {
                    if (contactProfile.m40424q0() == 14) {
                        return 5;
                    }
                    if (contactProfile.m40374K0()) {
                        contactProfile.m40388T(true);
                        return 1;
                    }
                    return 0;
                }
                return 0;
            }
            if (i12 == 34) {
                return 26;
            }
            if (i12 == 35) {
                return 27;
            }
            if (i12 == 43) {
                return 28;
            }
            if (i12 == 44) {
                return 29;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: m0 */
    public void m68719m0(NormalMsgModuleView.InterfaceC12426b interfaceC12426b) {
        this.f63849y = interfaceC12426b;
    }

    /* renamed from: o0 */
    public void m68720o0(InterfaceC13567b1.a aVar) {
        this.f63850z = aVar;
    }

    /* renamed from: p0 */
    public void m68721p0(ZinstantAdItemView.InterfaceC13555d interfaceC13555d) {
        this.f63836A = interfaceC13555d;
    }

    /* renamed from: q0 */
    public void m68722q0(int i11) {
        try {
            C18451m m68698R = m68698R(i11);
            if (m68698R != null) {
                String mo97719a = m68698R.mo97719a();
                if (TextUtils.isEmpty(mo97719a)) {
                    return;
                }
                if (this.f63837B.containsKey(mo97719a)) {
                    this.f63837B.remove(mo97719a);
                } else {
                    this.f63837B.put(mo97719a, m68698R);
                }
                this.f63841F = true;
                m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r0 */
    public int m68723r0(boolean z11) {
        try {
            HashMap hashMap = this.f63837B;
            if (hashMap == null) {
                return 0;
            }
            hashMap.clear();
            if (z11) {
                m68699S(this.f63837B);
            }
            m10008p();
            return this.f63837B.size();
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }
}
