package com.zing.zalo.p077ui.chat.chatrow;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17952c1;
import gg0.AbstractC19444a;
import id0.C20518d;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31973j5;
import p716zh.C32006l8;
import vg.C28194t6;
import vg.C28203u6;
import x20.C29299a;

/* loaded from: classes5.dex */
public class ChatEmptyView extends ModulesView implements C28194t6.f {

    /* renamed from: f0 */
    public static int f57105f0 = 3;

    /* renamed from: K */
    String f57106K;

    /* renamed from: L */
    C32006l8 f57107L;

    /* renamed from: M */
    C23528a f57108M;

    /* renamed from: N */
    InterfaceC11322a f57109N;

    /* renamed from: O */
    C16716d f57110O;

    /* renamed from: P */
    C16716d f57111P;

    /* renamed from: Q */
    C16716d f57112Q;

    /* renamed from: R */
    C21693c f57113R;

    /* renamed from: S */
    C24003n f57114S;

    /* renamed from: T */
    C22129e f57115T;

    /* renamed from: U */
    C22126c0 f57116U;

    /* renamed from: V */
    C22126c0 f57117V;

    /* renamed from: W */
    ArrayList f57118W;

    /* renamed from: a0 */
    C3977j f57119a0;

    /* renamed from: b0 */
    C17952c1 f57120b0;

    /* renamed from: c0 */
    ChatEmptyView f57121c0;

    /* renamed from: d0 */
    int f57122d0;

    /* renamed from: e0 */
    ArrayList f57123e0;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatEmptyView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11322a {
        /* renamed from: a */
        void mo60390a(C32006l8 c32006l8);

        /* renamed from: b */
        void mo60391b();

        /* renamed from: c */
        void mo60392c(ArrayList arrayList, int i11, AnimationTarget animationTarget, C16719g c16719g);
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatEmptyView$b */
    /* loaded from: classes5.dex */
    public class C11323b extends C16716d {

        /* renamed from: M0 */
        C21693c f57124M0;

        /* renamed from: N0 */
        C21693c f57125N0;

        /* renamed from: O0 */
        C21693c f57126O0;

        /* renamed from: P0 */
        C16716d f57127P0;

        /* renamed from: Q0 */
        C21693c f57128Q0;

        /* renamed from: R0 */
        C22126c0 f57129R0;

        /* renamed from: S0 */
        ItemAlbumMobile f57130S0;

        /* renamed from: T0 */
        int f57131T0;

        /* renamed from: U0 */
        C3977j f57132U0;

        /* renamed from: V0 */
        boolean f57133V0;

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatEmptyView$b$a */
        /* loaded from: classes5.dex */
        class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ ChatEmptyView f57135l1;

            /* renamed from: m1 */
            final /* synthetic */ String f57136m1;

            a(ChatEmptyView chatEmptyView, String str) {
                this.f57135l1 = chatEmptyView;
                this.f57136m1 = str;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                if (!C11323b.this.f57133V0 && TextUtils.equals(str, this.f57136m1)) {
                    if (c3979l != null && c3979l.m18839c() != null && (c3979l.m18839c().getWidth() != 1 || c3979l.m18839c().getHeight() != 1)) {
                        C3977j c3977j = C11323b.this.f57132U0;
                        if (c3977j != null) {
                            c3977j.setImageInfo(c3979l, false);
                        }
                        if (c23995f.m125666q() == 4) {
                            C11323b.this.f57124M0.mo111924u1(c3979l.m18839c());
                            return;
                        } else {
                            C11323b.this.f57124M0.mo111924u1(c3979l.m18839c());
                            C11323b.this.f57124M0.m89135c1(new C20518d());
                            return;
                        }
                    }
                    C11323b.this.f57124M0.mo111925v1(C23278z2.m120120d0().f116261b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatEmptyView$b$b */
        /* loaded from: classes5.dex */
        public class b extends SimpleAnimationTarget {

            /* renamed from: p */
            final /* synthetic */ C16719g f57138p;

            b(C16719g c16719g) {
                this.f57138p = c16719g;
            }

            @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
            public Rect getAnimTargetLocationOnScreen() {
                int[] iArr = new int[2];
                ChatEmptyView.this.f57121c0.getLocationOnScreen(iArr);
                int m89096G = iArr[0] + this.f57138p.m89096G();
                int m89098H = iArr[1] + this.f57138p.m89098H();
                return new Rect(m89096G, m89098H, this.f57138p.m89114P() + m89096G, this.f57138p.m89112O() + m89098H);
            }
        }

        public C11323b(Context context, ItemAlbumMobile itemAlbumMobile, final int i11, int i12, int i13, boolean z11) {
            super(context);
            this.f57133V0 = false;
            this.f57132U0 = new C3977j(context);
            this.f57130S0 = itemAlbumMobile;
            this.f57131T0 = i12;
            C21693c c21693c = new C21693c(context);
            this.f57124M0 = c21693c;
            c21693c.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.rounded_8dp_background_normal));
            this.f57124M0.mo111927x1(AbstractC23136l9.m118742r(7.75f));
            this.f57124M0.m111929z1(5);
            this.f57124M0.m89106L().m89028L(this.f57131T0 - AbstractC23136l9.m118742r(0.5f), this.f57131T0 - AbstractC23136l9.m118742r(0.5f));
            String m60854f0 = ChatEmptyView.this.m60854f0(this.f57130S0);
            if (!TextUtils.isEmpty(m60854f0)) {
                this.f57124M0.mo111925v1(C23278z2.m120120d0().f116261b);
                ((C23528a) ChatEmptyView.this.f57108M.m123612r(this.f57132U0)).m123579C(m60854f0, C23278z2.m120120d0(), new a(ChatEmptyView.this, m60854f0));
            } else {
                this.f57124M0.mo111925v1(C23278z2.m120120d0().f116261b);
            }
            C21693c c21693c2 = new C21693c(context);
            this.f57125N0 = c21693c2;
            c21693c2.mo111927x1(AbstractC23136l9.m118742r(7.75f));
            this.f57125N0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.rounded_8dp_background_normal));
            C16718f m89106L = this.f57125N0.m89106L();
            int i14 = this.f57131T0;
            m89106L.m89028L(i14, i14).m89073z(Boolean.TRUE);
            C21693c c21693c3 = new C21693c(context);
            this.f57126O0 = c21693c3;
            c21693c3.mo44614b1(8);
            this.f57126O0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_csc_play_small));
            C16718f m89106L2 = this.f57126O0.m89106L();
            int i15 = this.f57131T0;
            m89106L2.m89028L(i15 / 3, i15 / 3);
            C16716d c16716d = new C16716d(context);
            this.f57127P0 = c16716d;
            c16716d.mo44614b1(8);
            this.f57127P0.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
            this.f57127P0.m89106L().m89025I(true).m89028L(-2, -2);
            C21693c c21693c4 = new C21693c(context);
            this.f57128Q0 = c21693c4;
            c21693c4.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_khomedia_rightmenu_arrow_white));
            this.f57128Q0.m89106L().m89026J(true).m89028L(AbstractC23136l9.m118742r(32.0f), AbstractC23136l9.m118742r(32.0f));
            C22126c0 c22126c0 = new C22126c0(context);
            this.f57129R0 = c22126c0;
            c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            this.f57129R0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
            this.f57129R0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more));
            this.f57129R0.m89106L().m89023G(this.f57128Q0).m89028L(-2, -2);
            this.f57127P0.m89001g1(this.f57128Q0);
            this.f57127P0.m89001g1(this.f57129R0);
            this.f57127P0.m89001g1(this.f57126O0);
            m89001g1(this.f57124M0);
            m89001g1(this.f57125N0);
            m89001g1(this.f57127P0);
            ItemAlbumMobile itemAlbumMobile2 = this.f57130S0;
            if (itemAlbumMobile2 != null && itemAlbumMobile2.f42591p == 2) {
                this.f57127P0.mo44614b1(0);
                this.f57126O0.mo44614b1(0);
                this.f57129R0.mo44614b1(8);
                this.f57128Q0.mo44614b1(8);
            }
            if (i13 > 0) {
                this.f57127P0.mo44614b1(0);
                this.f57125N0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.rounded_8dp_background_dark));
                this.f57126O0.mo44614b1(8);
                if (z11) {
                    this.f57129R0.mo44614b1(0);
                    this.f57129R0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more));
                    this.f57129R0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
                    this.f57128Q0.mo44614b1(0);
                } else {
                    this.f57129R0.mo44614b1(0);
                    this.f57129R0.m111959G1("+" + i13);
                    this.f57129R0.mo111964L1((float) AbstractC23136l9.m118742r(20.0f));
                    this.f57128Q0.mo44614b1(8);
                }
            }
            this.f57124M0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.chatrow.d
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatEmptyView.C11323b.this.m60871p1(i11, c16719g);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p1 */
        public /* synthetic */ void m60871p1(int i11, C16719g c16719g) {
            if (ChatEmptyView.this.f57109N != null) {
                b bVar = new b(c16719g);
                ChatEmptyView chatEmptyView = ChatEmptyView.this;
                chatEmptyView.f57109N.mo60392c(chatEmptyView.f57118W, i11, bVar, c16719g);
            }
        }

        /* renamed from: t1 */
        private void m60872t1() {
            try {
                this.f57133V0 = true;
                this.f57124M0.mo111925v1(AbstractC23170p.m119356n());
                this.f57125N0.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.rounded_8dp_background_normal));
                this.f57127P0.mo44614b1(0);
                this.f57126O0.mo44614b1(8);
                this.f57128Q0.mo44614b1(0);
                this.f57128Q0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_undo_photo));
                this.f57129R0.mo44614b1(0);
                this.f57129R0.m111962J1(-6579301);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: q1 */
        public void m60873q1(int i11) {
            if (this.f57131T0 != i11) {
                this.f57131T0 = i11;
                this.f57124M0.m89106L().m89028L(this.f57131T0 - AbstractC23136l9.m118742r(0.5f), this.f57131T0 - AbstractC23136l9.m118742r(0.5f));
                C16718f m89106L = this.f57125N0.m89106L();
                int i12 = this.f57131T0;
                m89106L.m89028L(i12, i12);
                C16718f m89106L2 = this.f57126O0.m89106L();
                int i13 = this.f57131T0;
                m89106L2.m89028L(i13 / 3, i13 / 3);
            }
        }

        /* renamed from: r1 */
        public void m60874r1() {
            m60872t1();
            this.f57129R0.m111958F1(AbstractC8020f0.str_deleted);
        }

        /* renamed from: s1 */
        public void m60875s1() {
            m60872t1();
            this.f57129R0.m111958F1(AbstractC8020f0.recalled_group_msg);
        }
    }

    public ChatEmptyView(Context context) {
        super(context);
        this.f57122d0 = 0;
        this.f57121c0 = this;
        m60862g0(context);
    }

    /* renamed from: c0 */
    private void m60853c0(C17952c1 c17952c1) {
        String str;
        if (c17952c1 == null) {
            return;
        }
        try {
            this.f57122d0 = 2;
            this.f57115T.m89106L().m89034R(AbstractC23136l9.m118742r(12.0f)).m89028L(AbstractC23136l9.m118742r(60.0f), AbstractC23136l9.m118742r(60.0f));
            this.f57115T.requestLayout();
            this.f57115T.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.chatrow.a
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatEmptyView.this.m60855h0(c16719g);
                }
            });
            ContactProfile contactProfile = new ContactProfile(c17952c1.f90868B);
            contactProfile.f42446v = c17952c1.f90869C;
            contactProfile.f42437s = c17952c1.f90871E;
            if (!TextUtils.isEmpty(c17952c1.f90874H)) {
                contactProfile.f42455y = c17952c1.f90874H;
            }
            if (!TextUtils.isEmpty(c17952c1.f90874H)) {
                str = contactProfile.m40383Q(true, false);
            } else {
                str = c17952c1.f90871E;
            }
            this.f57115T.m115434r1(c17952c1.f90869C);
            this.f57116U.m111959G1(str);
            if (!TextUtils.isEmpty(c17952c1.f90873G)) {
                this.f57117V.m111953A1(100);
                if (!TextUtils.isEmpty(c17952c1.f90873G) && c17952c1.f90882P >= 0 && c17952c1.f90883Q > 0) {
                    StringBuilder sb2 = new StringBuilder(c17952c1.f90873G);
                    int i11 = c17952c1.f90882P;
                    sb2.replace(i11, c17952c1.f90883Q + i11, str);
                    this.f57117V.m111959G1(sb2.toString());
                } else {
                    this.f57117V.m111959G1(c17952c1.f90873G);
                }
                this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public String m60854f0(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            if (Boolean.TRUE.equals(C29299a.f135738a.m146396a().m101506a())) {
                return itemAlbumMobile.f42607x;
            }
            return itemAlbumMobile.f42548C;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m60855h0(C16719g c16719g) {
        InterfaceC11322a interfaceC11322a = this.f57109N;
        if (interfaceC11322a != null) {
            interfaceC11322a.mo60391b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m60856i0(C16719g c16719g) {
        InterfaceC11322a interfaceC11322a = this.f57109N;
        if (interfaceC11322a != null) {
            interfaceC11322a.mo60391b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m60857j0(String str, int i11, C32006l8 c32006l8) {
        try {
            if (TextUtils.equals(str, this.f57106K) && i11 == 0 && c32006l8 != null) {
                this.f57107L = c32006l8;
                m60860d0(c32006l8);
                InterfaceC11322a interfaceC11322a = this.f57109N;
                if (interfaceC11322a != null) {
                    interfaceC11322a.mo60390a(c32006l8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    void m60858a0(C32006l8 c32006l8) {
        this.f57113R.mo44614b1(8);
        this.f57112Q.m89106L().m89044a0(0).m89033Q(AbstractC23136l9.m118742r(150.0f));
        this.f57110O.m89106L().m89041Y(AbstractC23222t7.f112586t);
        this.f57116U.m89106L().m89031O(0);
        this.f57115T.m115434r1(c32006l8.f147276c);
        this.f57116U.m111959G1(AbstractC21935u.m114547n());
        this.f57117V.m111953A1(100);
        this.f57117V.m111959G1(getContext().getString(AbstractC8020f0.chat_empty_layout_text_saved_message));
        this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
    }

    /* renamed from: b0 */
    public void m60859b0(C31973j5 c31973j5) {
        String str;
        try {
            this.f57122d0 = 5;
            this.f57113R.mo44614b1(8);
            this.f57111P.mo44614b1(8);
            this.f57110O.m89106L().m89041Y(AbstractC23222t7.f112586t);
            this.f57112Q.m89106L().m89041Y(0);
            this.f57116U.m89106L().m89031O(0);
            C22126c0 c22126c0 = this.f57116U;
            if (c31973j5 != null) {
                str = c31973j5.m153793y();
            } else {
                str = "";
            }
            c22126c0.m111959G1(str);
            this.f57117V.m111959G1(getContext().getString(AbstractC8020f0.chat_empty_layout_text_friend));
            this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            if (c31973j5 != null) {
                this.f57115T.m115437u1(c31973j5);
            } else {
                this.f57115T.m115441y1(null);
            }
            this.f57115T.mo89109M0(null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d0 */
    void m60860d0(C32006l8 c32006l8) {
        String str;
        String str2;
        C17952c1 c17952c1;
        if (c32006l8 == null) {
            return;
        }
        try {
            if (AbstractC25495a.m132078c(c32006l8.f147278e)) {
                m60858a0(c32006l8);
                return;
            }
            this.f57115T.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.chatrow.c
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatEmptyView.this.m60856i0(c16719g);
                }
            });
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c32006l8.f147278e);
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s)) {
                str = m141809c.m40383Q(true, false);
                if (TextUtils.isEmpty(str)) {
                    str = m141809c.f42437s;
                }
            } else {
                str = c32006l8.f147274a;
            }
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42458z)) {
                str2 = m141809c.f42458z;
            } else {
                str2 = "";
            }
            boolean m114554u = true ^ AbstractC21935u.m114554u(c32006l8.f147278e);
            boolean m114552s = AbstractC21935u.m114552s(false, c32006l8.f147278e);
            this.f57115T.m115434r1(c32006l8.f147276c);
            if (this.f57120b0 == null && m114554u && !m114552s) {
                this.f57113R.mo44614b1(0);
                AbstractC23268y2.m120033g(this.f57108M, this.f57119a0, this.f57113R, c32006l8.f147277d, this.f57114S, false);
                this.f57116U.m111959G1(str);
                this.f57117V.m111953A1(100);
                this.f57117V.m111958F1(AbstractC8020f0.chat_empty_layout_text_stranger);
                this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
                return;
            }
            this.f57116U.m111959G1(str);
            if (this.f57120b0 != null) {
                this.f57117V.m111953A1(100);
                if (!TextUtils.isEmpty(this.f57120b0.f90873G)) {
                    C17952c1 c17952c12 = this.f57120b0;
                    if (c17952c12.f90882P >= 0 && c17952c12.f90883Q > 0) {
                        StringBuilder sb2 = new StringBuilder(c17952c12.f90873G);
                        C17952c1 c17952c13 = this.f57120b0;
                        int i11 = c17952c13.f90882P;
                        sb2.replace(i11, c17952c13.f90883Q + i11, str);
                        this.f57117V.m111959G1(sb2.toString());
                        this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
                    }
                }
                this.f57117V.m111959G1(this.f57120b0.f90873G);
                this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            } else if (!TextUtils.isEmpty(str2)) {
                this.f57117V.m111953A1(3);
                this.f57117V.m111959G1("\"" + ((Object) C28652r.m143349v().m143357H(str2)) + "\"");
                this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            } else {
                this.f57117V.m111953A1(100);
                this.f57117V.m111959G1(getContext().getString(AbstractC8020f0.chat_empty_layout_text_friend));
                this.f57117V.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor2));
            }
            ArrayList arrayList = c32006l8.f147281h;
            if (arrayList != null && arrayList.size() >= 3 && ((c17952c1 = this.f57120b0) == null || c17952c1.f90876J)) {
                this.f57113R.mo44614b1(8);
                this.f57111P.m89106L().m89036T(AbstractC23136l9.m118742r(9.0f));
                m60867n0(c32006l8.f147281h, false);
            } else {
                this.f57113R.mo44614b1(0);
                AbstractC23268y2.m120033g(this.f57108M, this.f57119a0, this.f57113R, c32006l8.f147277d, C23278z2.m120120d0(), false);
                this.f57111P.mo44614b1(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e0 */
    public ArrayList m60861e0(ArrayList arrayList, boolean z11) {
        int i11;
        int m118722k0;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            i11 = Math.min(arrayList.size(), f57105f0);
        } else {
            i11 = 0;
        }
        if (getContext() instanceof Activity) {
            m118722k0 = AbstractC23136l9.m118766z(getContext());
        } else {
            m118722k0 = AbstractC23136l9.m118722k0();
        }
        int i13 = (m118722k0 - this.f57112Q.m89106L().f84720p) - this.f57112Q.m89106L().f84722r;
        int m118742r = AbstractC23136l9.m118742r(3.0f);
        int m118742r2 = ((i13 - ((f57105f0 - 1) * m118742r)) - AbstractC23136l9.m118742r(24.0f)) / f57105f0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (i14 == f57105f0 - 1 && arrayList.size() > f57105f0) {
                i12 = arrayList.size() - f57105f0;
            } else {
                i12 = 0;
            }
            C11323b c11323b = new C11323b(getContext(), (ItemAlbumMobile) arrayList.get(i14), i14, m118742r2, i12, z11);
            c11323b.m89106L().m89034R(i14 * (m118742r2 + m118742r));
            arrayList2.add(c11323b);
        }
        return arrayList2;
    }

    /* renamed from: g0 */
    void m60862g0(Context context) {
        this.f57119a0 = new C3977j(context);
        this.f57108M = new C23528a(context);
        C24003n m120132i0 = C23278z2.m120132i0();
        this.f57114S = m120132i0;
        m120132i0.f116261b = C23278z2.m120071G0().f116261b;
        C21693c c21693c = new C21693c(context);
        this.f57113R = c21693c;
        c21693c.m111928y1(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(0.0f));
        this.f57113R.m111929z1(5);
        C16718f m89028L = this.f57113R.m89106L().m89028L(-1, AbstractC23136l9.m118742r(130.0f));
        Boolean bool = Boolean.TRUE;
        m89028L.m89018B(bool);
        int m118742r = AbstractC23136l9.m118742r(60.0f);
        C22129e c22129e = new C22129e(context, m118742r);
        this.f57115T = c22129e;
        c22129e.m89106L().m89035S(AbstractC23136l9.m118742r(12.0f)).m89028L(m118742r, m118742r).m89073z(bool).m89018B(bool);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f57116U = c22126c0;
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        this.f57116U.m111962J1(C23212s8.m119607o(context, AbstractC16781w.HeaderFormTitleColor));
        this.f57116U.mo111965M1(1);
        this.f57116U.m89106L().m89028L(-1, -2).m89032P(0, AbstractC23222t7.f112554d, 0, 0).m89054h0(this.f57115T);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f57117V = c22126c02;
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f57117V.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f57117V.m89106L().m89028L(-1, -2).m89054h0(this.f57115T).m89023G(this.f57116U);
        C16716d c16716d = new C16716d(context);
        this.f57110O = c16716d;
        c16716d.m89106L().m89028L(-2, -2).m89029M(12).m89073z(bool).m89023G(this.f57113R).m89042Z(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(0.0f));
        this.f57110O.m89001g1(this.f57115T);
        this.f57110O.m89001g1(this.f57116U);
        this.f57110O.m89001g1(this.f57117V);
        C16716d c16716d2 = new C16716d(context);
        this.f57111P = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89073z(bool).m89023G(this.f57110O);
        C16716d c16716d3 = new C16716d(context);
        this.f57112Q = c16716d3;
        c16716d3.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.rounded_bubble_chat_background_normal));
        this.f57112Q.m89106L().m89028L(-1, -2).m89044a0(AbstractC23136l9.m118742r(12.0f)).m89034R(AbstractC23136l9.m118742r(30.0f)).m89035S(AbstractC23136l9.m118742r(30.0f)).m89036T(AbstractC23136l9.m118742r(10.0f)).m89033Q(AbstractC23136l9.m118742r(110.0f));
        this.f57112Q.m89001g1(this.f57113R);
        this.f57112Q.m89001g1(this.f57110O);
        this.f57112Q.m89001g1(this.f57111P);
        mo69681L(this.f57112Q);
    }

    public C16716d getMainContainer() {
        return this.f57112Q;
    }

    public int getUiMode() {
        return this.f57122d0;
    }

    /* renamed from: k0 */
    public void m60863k0(MessageId messageId, boolean z11, boolean z12) {
        ArrayList arrayList;
        if (this.f57111P.m89144k0() && (arrayList = this.f57123e0) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11323b c11323b = (C11323b) it.next();
                if (c11323b.f57130S0.m40496C() != null && c11323b.f57130S0.m40496C().equals(messageId)) {
                    if (z11) {
                        c11323b.m60875s1();
                        return;
                    } else {
                        if (z12) {
                            c11323b.m60874r1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: l0 */
    void m60864l0() {
        try {
            this.f57113R.setTag(1090453505, null);
            this.f57113R.setTag(1090453509, null);
            this.f57113R.mo111924u1(null);
            this.f57115T.setTag(1090453505, null);
            this.f57115T.setTag(1090453509, null);
            this.f57115T.m115441y1(null);
            this.f57113R.mo44614b1(8);
            this.f57116U.m111959G1("");
            this.f57117V.m111959G1("");
            this.f57115T.mo89109M0(null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m0 */
    public void m60865m0(String str, boolean z11) {
        try {
            if (TextUtils.equals(this.f57106K, str) && this.f57107L != null && !C28194t6.m141765b().m141770f(this.f57107L)) {
                InterfaceC11322a interfaceC11322a = this.f57109N;
                if (interfaceC11322a != null) {
                    interfaceC11322a.mo60390a(this.f57107L);
                    return;
                }
                return;
            }
            this.f57106K = str;
            this.f57107L = null;
            if (z11) {
                m60864l0();
            }
            if (!TextUtils.isEmpty(this.f57106K)) {
                if (AbstractC25495a.m132078c(this.f57106K)) {
                    this.f57122d0 = 3;
                    C28194t6.m141765b().m141769e(this.f57106K, this);
                } else {
                    this.f57122d0 = 1;
                    C28194t6.m141765b().m141768d(this.f57106K, this);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // vg.C28194t6.f
    /* renamed from: n */
    public void mo60866n(final int i11, final String str, final C32006l8 c32006l8) {
        try {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.b
                @Override // java.lang.Runnable
                public final void run() {
                    ChatEmptyView.this.m60857j0(str, i11, c32006l8);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n0 */
    public void m60867n0(ArrayList arrayList, boolean z11) {
        this.f57118W = arrayList;
        this.f57111P.mo44614b1(0);
        this.f57111P.m89106L().m89042Z(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(0.0f));
        ArrayList m60861e0 = m60861e0(arrayList, z11);
        this.f57123e0 = m60861e0;
        this.f57111P.m89002h1(m60861e0);
    }

    /* renamed from: o0 */
    public void m60868o0(ArrayList arrayList, int i11) {
        if (i11 <= 0) {
            return;
        }
        int m118742r = AbstractC23136l9.m118742r(3.0f);
        int m118742r2 = ((i11 - ((f57105f0 - 1) * m118742r)) - AbstractC23136l9.m118742r(24.0f)) / f57105f0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            C11323b c11323b = (C11323b) arrayList.get(i12);
            c11323b.m60873q1(m118742r2);
            c11323b.m89106L().m89034R((m118742r2 + m118742r) * i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        ArrayList arrayList = this.f57123e0;
        if (arrayList != null) {
            m60868o0(arrayList, (View.MeasureSpec.getSize(i11) - this.f57112Q.m89106L().f84720p) - this.f57112Q.m89106L().f84722r);
        }
        super.onMeasure(i11, i12);
    }

    /* renamed from: p0 */
    public void m60869p0(int i11, int i12, int i13, int i14) {
        C16716d c16716d = this.f57112Q;
        if (c16716d != null) {
            c16716d.m89106L().m89032P(i11, i12, i13, i14);
        }
    }

    public void setData(C17952c1 c17952c1) {
        this.f57120b0 = c17952c1;
        m60853c0(c17952c1);
        m60865m0(this.f57120b0.f90868B, false);
    }

    public void setListener(InterfaceC11322a interfaceC11322a) {
        this.f57109N = interfaceC11322a;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        C16716d c16716d = this.f57112Q;
        if (c16716d != null) {
            c16716d.mo44614b1(i11);
        }
    }
}
