package com.zing.zalo.p077ui.mycloud.gridtab;

import ag0.C0814e0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C17014k0;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import dj.C17994q1;
import dj.C17997r1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19620d0;
import gw.C19660u0;
import java.util.ArrayList;
import java.util.List;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.C25630b;
import p588vw.C28644j;
import p716zh.C32027n;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.AbstractRunnableC28185s6;
import vg.C28020b3;
import vg.C28203u6;
import w50.C28770b;

/* loaded from: classes6.dex */
public class GridChatItemViewBase extends ModulesView implements C28770b.a, AnimationTarget, AbstractRunnableC28185s6.b, C17945a0.x {

    /* renamed from: K */
    private C16716d f65644K;

    /* renamed from: L */
    private C16716d f65645L;

    /* renamed from: M */
    private C21693c f65646M;

    /* renamed from: N */
    private C22126c0 f65647N;

    /* renamed from: O */
    private C22126c0 f65648O;

    /* renamed from: P */
    private C16971e f65649P;

    /* renamed from: Q */
    private C22126c0 f65650Q;

    /* renamed from: R */
    private C16719g f65651R;

    /* renamed from: S */
    private C21691a f65652S;

    /* renamed from: T */
    private C21693c f65653T;

    /* renamed from: U */
    private C21693c f65654U;

    /* renamed from: V */
    private C17014k0 f65655V;

    /* renamed from: W */
    private C21693c f65656W;

    /* renamed from: a0 */
    private C21693c f65657a0;

    /* renamed from: b0 */
    private C21693c f65658b0;

    /* renamed from: c0 */
    private boolean f65659c0;

    /* renamed from: d0 */
    private String f65660d0;

    /* renamed from: e0 */
    private String f65661e0;

    /* renamed from: f0 */
    private boolean f65662f0;

    /* renamed from: g0 */
    private C17997r1 f65663g0;

    /* renamed from: h0 */
    private int f65664h0;

    /* renamed from: i0 */
    private boolean f65665i0;

    /* renamed from: j0 */
    private MessageId f65666j0;

    /* renamed from: k0 */
    private C3977j f65667k0;

    /* renamed from: l0 */
    private final Drawable f65668l0;

    /* renamed from: m0 */
    private C23528a f65669m0;

    /* renamed from: n0 */
    private MyCloudMessageItem f65670n0;

    /* renamed from: o0 */
    private int f65671o0;

    /* renamed from: p0 */
    private int f65672p0;

    /* renamed from: q0 */
    private int f65673q0;

    /* renamed from: r0 */
    private int f65674r0;

    /* renamed from: s0 */
    private C28770b f65675s0;

    /* renamed from: t0 */
    private boolean f65676t0;

    /* renamed from: u0 */
    private boolean f65677u0;

    /* renamed from: v0 */
    private Drawable f65678v0;

    /* renamed from: w0 */
    private Drawable f65679w0;

    /* renamed from: x0 */
    private BaseMyCloudTabView.AbstractC12510b f65680x0;

    /* renamed from: y0 */
    private InterfaceC27158o2 f65681y0;

    /* renamed from: z0 */
    private boolean f65682z0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatItemViewBase$a */
    /* loaded from: classes6.dex */
    public static final class C12568a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ MyCloudMessageItem f65683q;

        /* renamed from: r */
        final /* synthetic */ GridChatItemViewBase f65684r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12568a(MyCloudMessageItem myCloudMessageItem, GridChatItemViewBase gridChatItemViewBase) {
            super(0);
            this.f65683q = myCloudMessageItem;
            this.f65684r = gridChatItemViewBase;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m70894a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m70894a() {
            if (this.f65683q.m71033m().m94849A8()) {
                GridChatItemViewBase gridChatItemViewBase = this.f65684r;
                Context context = gridChatItemViewBase.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                gridChatItemViewBase.m70850G0(context);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatItemViewBase$b */
    /* loaded from: classes6.dex */
    public static final class C12569b extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ MyCloudMessageItem f65685A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12569b(MyCloudMessageItem myCloudMessageItem, List list) {
            super(GridChatItemViewBase.this, list, 1050);
            this.f65685A = myCloudMessageItem;
        }

        /* renamed from: h */
        public static final void m70896h(GridChatItemViewBase gridChatItemViewBase) {
            AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
            C16971e c16971e = gridChatItemViewBase.f65649P;
            if (c16971e != null) {
                c16971e.m90886N1(gridChatItemViewBase.f65661e0);
            }
            C22126c0 c22126c0 = gridChatItemViewBase.f65650Q;
            if (c22126c0 != null) {
                c22126c0.m111959G1(gridChatItemViewBase.f65660d0);
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            String str;
            String str2;
            super.mo61137c(arrayList);
            if (arrayList != null && arrayList.size() > 0 && arrayList.get(0) != null) {
                String str3 = "";
                if (this.f65685A == GridChatItemViewBase.this.getData()) {
                    GridChatItemViewBase gridChatItemViewBase = GridChatItemViewBase.this;
                    ContactProfile contactProfile = (ContactProfile) arrayList.get(0);
                    String str4 = null;
                    if (contactProfile != null) {
                        str2 = contactProfile.m40383Q(true, false);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    gridChatItemViewBase.f65660d0 = str2;
                    GridChatItemViewBase gridChatItemViewBase2 = GridChatItemViewBase.this;
                    ContactProfile contactProfile2 = (ContactProfile) arrayList.get(0);
                    if (contactProfile2 != null) {
                        str4 = contactProfile2.f42446v;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    gridChatItemViewBase2.f65661e0 = str4;
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.x
                        public /* synthetic */ RunnableC12620x() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GridChatItemViewBase.C12569b.m70896h(GridChatItemViewBase.this);
                        }
                    });
                }
                C7960e m41971c6 = C7960e.m41971c6();
                ContactProfile contactProfile3 = (ContactProfile) arrayList.get(0);
                ContactProfile contactProfile4 = (ContactProfile) arrayList.get(0);
                if (contactProfile4 != null && (str = contactProfile4.f42434r) != null) {
                    str3 = str;
                }
                m41971c6.m42221O7(contactProfile3, AbstractC21935u.m114558y(str3));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatItemViewBase$c */
    /* loaded from: classes6.dex */
    public static final class C12570c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C17945a0 f65687l1;

        /* renamed from: m1 */
        final /* synthetic */ MessageId f65688m1;

        /* renamed from: n1 */
        final /* synthetic */ GridChatItemViewBase f65689n1;

        C12570c(C17945a0 c17945a0, MessageId messageId, GridChatItemViewBase gridChatItemViewBase) {
            this.f65687l1 = c17945a0;
            this.f65688m1 = messageId;
            this.f65689n1 = gridChatItemViewBase;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                MessageId m95029V3 = this.f65687l1.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                if (AbstractC19074t.m100204b(this.f65688m1, m95029V3) && c3979l != null && c3979l.m18839c() != null) {
                    C3977j replyDumpImageView = this.f65689n1.getReplyDumpImageView();
                    if (replyDumpImageView != null) {
                        replyDumpImageView.setImageInfo(c3979l, false);
                    }
                    C21693c c21693c = this.f65689n1.f65646M;
                    if (c21693c != null) {
                        c21693c.mo111925v1(new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c()));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatItemViewBase$d */
    /* loaded from: classes6.dex */
    public static final class C12571d extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ MessageId f65690a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f65691b;

        /* renamed from: c */
        final /* synthetic */ GridChatItemViewBase f65692c;

        C12571d(MessageId messageId, C17945a0 c17945a0, GridChatItemViewBase gridChatItemViewBase) {
            this.f65690a = messageId;
            this.f65691b = c17945a0;
            this.f65692c = gridChatItemViewBase;
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            C21693c c21693c;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                if (AbstractC19074t.m100204b(this.f65690a, this.f65691b.m95029V3()) && c3979l.m18839c() != null && (c21693c = this.f65692c.f65646M) != null) {
                    c21693c.mo111925v1(new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c()));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatItemViewBase$e */
    /* loaded from: classes6.dex */
    public static final class C12572e extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ MessageId f65694m1;

        C12572e(MessageId messageId) {
            this.f65694m1 = messageId;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (GridChatItemViewBase.this.getHasReply() && GridChatItemViewBase.this.getHasReplyImage() && AbstractC19074t.m100204b(this.f65694m1, GridChatItemViewBase.this.getReplyMessageId()) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    C3977j replyDumpImageView = GridChatItemViewBase.this.getReplyDumpImageView();
                    if (replyDumpImageView != null) {
                        replyDumpImageView.setImageInfo(c3979l, false);
                    }
                    C21693c c21693c = GridChatItemViewBase.this.f65646M;
                    if (c21693c != null) {
                        c21693c.mo111925v1(new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c()));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatItemViewBase$f */
    /* loaded from: classes6.dex */
    public static final class C12573f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12573f f65695q = new C12573f();

        C12573f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m70897a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m70897a() {
        }
    }

    public GridChatItemViewBase(Context context) {
        super(context);
        this.f65660d0 = "";
        this.f65661e0 = "";
        this.f65668l0 = C23278z2.m120122e().f116261b;
        this.f65669m0 = new C23528a(MainApplication.Companion.m35500c());
        this.f65675s0 = new C28770b();
        m70890J0();
    }

    /* renamed from: B0 */
    private final void m70846B0(C17945a0 c17945a0) {
        String str;
        C17997r1 m95275v4 = c17945a0.m95275v4();
        this.f65663g0 = m95275v4;
        if (m95275v4 == null) {
            this.f65662f0 = false;
            return;
        }
        boolean m95251s7 = c17945a0.m95251s7();
        this.f65662f0 = m95251s7;
        C17997r1 c17997r1 = this.f65663g0;
        if (c17997r1 != null && m95251s7) {
            this.f65666j0 = c17997r1.m95689f();
            int m95687d = c17997r1.m95687d();
            this.f65664h0 = m95687d;
            if (m95687d != -1 && m95687d != 1 && m95687d != 41) {
                if (m95687d != 49) {
                    if (m95687d != 52 && m95687d != 56 && m95687d != 59) {
                        if (m95687d != 31 && m95687d != 32 && m95687d != 36 && m95687d != 37) {
                            switch (m95687d) {
                                case 43:
                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                case 46:
                                    break;
                                case 45:
                                    break;
                                default:
                                    C17969i0 m95690g = c17997r1.m95690g();
                                    if (m95690g != null) {
                                        str = m95690g.f91013r;
                                    } else {
                                        str = null;
                                    }
                                    this.f65665i0 = !TextUtils.isEmpty(str);
                                    return;
                            }
                        }
                    }
                }
                this.f65665i0 = true;
                return;
            }
            this.f65665i0 = false;
        }
    }

    /* renamed from: D0 */
    private final void m70847D0() {
        int i11;
        m70852K0();
        if (this.f65644K == null) {
            C16716d c16716d = new C16716d(getContext());
            int i12 = 0;
            c16716d.m89106L().m89028L(-1, -2).m89018B(Boolean.TRUE).m89029M(16).m89042Z(0, AbstractC23222t7.f112562h, 0, 0);
            c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.t
                public /* synthetic */ C12616t() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GridChatItemViewBase.m70848E0(GridChatItemViewBase.this, c16719g);
                }
            });
            c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.u
                public /* synthetic */ C12617u() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    GridChatItemViewBase.m70849F0(GridChatItemViewBase.this, c16719g);
                }
            });
            this.f65644K = c16716d;
            C22126c0 c22126c0 = new C22126c0(getContext());
            c22126c0.m89106L().m89028L(-2, -2).m89034R(AbstractC23222t7.f112576o);
            Context context = c22126c0.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall));
            c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_02));
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_from));
            C16716d c16716d2 = this.f65644K;
            if (c16716d2 != null) {
                c16716d2.m89001g1(c22126c0);
            }
            int i13 = AbstractC23222t7.f112586t;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            C16971e c16971e = new C16971e(context2, EnumC16949e.SIZE_16);
            c16971e.m89106L().m89028L(i13, i13).m89034R(AbstractC23222t7.f112562h).m89054h0(c22126c0);
            C16716d c16716d3 = this.f65644K;
            if (c16716d3 != null) {
                c16716d3.m89001g1(c16971e);
            }
            this.f65649P = c16971e;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            Drawable m139660c = C27280g.m139660c(context3, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_01);
            int i14 = this.f65673q0;
            if (c22126c0.m89114P() > 0) {
                i11 = c22126c0.m89114P();
            } else {
                i11 = AbstractC23222t7.f112580q;
            }
            int i15 = (i14 - i11) - i13;
            if (m139660c != null) {
                i12 = m139660c.getIntrinsicWidth();
            }
            int i16 = (i15 - i12) - AbstractC23222t7.f112535N;
            C22126c0 c22126c02 = new C22126c0(getContext());
            c22126c02.m89106L().m89028L(-2, -2).m89054h0(this.f65649P).m89034R(AbstractC23222t7.f112556e).m89038V(i16);
            Context context4 = c22126c02.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            new C26707f(c22126c02).m137318a(C26705d.m137293a(context4, AbstractC2814h.t_xxsmall));
            c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC2807a.text_01));
            c22126c02.m111980v1(TextUtils.TruncateAt.END);
            c22126c02.m111953A1(1);
            C16716d c16716d4 = this.f65644K;
            if (c16716d4 != null) {
                c16716d4.m89001g1(c22126c02);
            }
            this.f65650Q = c22126c02;
            C16716d c16716d5 = this.f65644K;
            if (c16716d5 != null) {
                C21693c c21693c = new C21693c(getContext());
                c21693c.m89106L().m89028L(-2, -2).m89034R(AbstractC23222t7.f112566j).m89035S(AbstractC23222t7.f112576o).m89054h0(this.f65650Q);
                c21693c.mo111925v1(m139660c);
                c16716d5.m89001g1(c21693c);
            }
            C16716d c16716d6 = this.f65644K;
            if (c16716d6 != null) {
                C22126c0 c22126c03 = new C22126c0(getContext());
                c22126c03.m89106L().m89028L(-1, AbstractC23136l9.m118742r(0.5f)).m89023G(this.f65649P).m89036T(AbstractC23222t7.f112562h);
                c22126c03.mo89161z0(C23212s8.m119607o(c22126c03.getContext(), AbstractC2807a.divider_02));
                c16716d6.m89001g1(c22126c03);
            }
        }
        C16971e c16971e2 = this.f65649P;
        if (c16971e2 != null) {
            c16971e2.m90886N1(this.f65661e0);
        }
        C22126c0 c22126c04 = this.f65650Q;
        if (c22126c04 != null) {
            c22126c04.m111959G1(this.f65660d0);
        }
        C16716d c16716d7 = this.f65644K;
        if (c16716d7 != null) {
            mo69681L(c16716d7);
        }
    }

    /* renamed from: E0 */
    public static final void m70848E0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && (abstractC12510b = gridChatItemViewBase.f65680x0) != null) {
            abstractC12510b.mo70402u(m71033m);
        }
    }

    /* renamed from: F0 */
    public static final void m70849F0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
        if (myCloudMessageItem != null && (interfaceC27158o2 = gridChatItemViewBase.f65681y0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, gridChatItemViewBase.f65672p0, null, 4, null);
        }
    }

    /* renamed from: G0 */
    public final void m70850G0(Context context) {
        if (this.f65658b0 == null) {
            Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_cloud_slash_solid_24, AbstractC2807a.icon_04);
            C21693c c21693c = new C21693c(context);
            c21693c.mo111925v1(m139660c);
            c21693c.m89085A0(AbstractC23136l9.m118663M(AbstractC16803z.bg_out_cloud_icon));
            c21693c.m89106L().m89060k0(AbstractC23136l9.m118742r(20.0f)).m89030N(AbstractC23136l9.m118742r(20.0f)).m89034R(AbstractC23222t7.f112562h).m89033Q(AbstractC23222t7.f112562h).m89072y(Boolean.TRUE).m89041Y(AbstractC23222t7.f112552c);
            this.f65658b0 = c21693c;
        }
        C21693c c21693c2 = this.f65658b0;
        if (c21693c2 != null) {
            mo69681L(c21693c2);
        }
    }

    /* renamed from: H0 */
    private final void m70851H0(C17997r1 c17997r1, C17945a0 c17945a0) {
        int i11;
        if (this.f65645L == null) {
            C16716d c16716d = new C16716d(getContext());
            c16716d.m89106L().m89028L(-1, -2).m89018B(Boolean.TRUE).m89034R(AbstractC23222t7.f112576o).m89036T(AbstractC23222t7.f112576o).m89035S(AbstractC23222t7.f112576o).m89029M(16);
            this.f65645L = c16716d;
            C22126c0 c22126c0 = new C22126c0(getContext());
            c22126c0.m89106L().m89028L(AbstractC23222t7.f112554d, AbstractC23222t7.f112528I);
            c22126c0.mo89161z0(C23212s8.m119607o(c22126c0.getContext(), AbstractC16781w.AppPrimaryColor));
            C16716d c16716d2 = this.f65645L;
            if (c16716d2 != null) {
                c16716d2.m89001g1(c22126c0);
            }
            C21693c c21693c = new C21693c(getContext());
            C16718f m89106L = c21693c.m89106L();
            int i12 = AbstractC23222t7.f112528I;
            m89106L.m89028L(i12, i12).m89054h0(c22126c0).m89034R(AbstractC23222t7.f112566j);
            C16716d c16716d3 = this.f65645L;
            if (c16716d3 != null) {
                c16716d3.m89001g1(c21693c);
            }
            this.f65646M = c21693c;
            C22126c0 c22126c02 = new C22126c0(getContext());
            c22126c02.m89106L().m89028L(-2, -2).m89054h0(this.f65646M).m89034R(AbstractC23222t7.f112566j);
            c22126c02.mo111964L1(AbstractC23222t7.f112576o);
            c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC21196a.TextColor1));
            c22126c02.m111953A1(1);
            c22126c02.mo111965M1(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c02.m111980v1(truncateAt);
            C16716d c16716d4 = this.f65645L;
            if (c16716d4 != null) {
                c16716d4.m89001g1(c22126c02);
            }
            this.f65647N = c22126c02;
            C22126c0 c22126c03 = new C22126c0(getContext());
            c22126c03.m89106L().m89028L(-2, -2).m89054h0(this.f65646M).m89023G(this.f65647N).m89034R(AbstractC23222t7.f112566j).m89036T(AbstractC23222t7.f112552c);
            c22126c03.mo111964L1(AbstractC23222t7.f112574n);
            c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC21196a.TextColor2));
            c22126c03.m111953A1(1);
            c22126c03.m111980v1(truncateAt);
            C16716d c16716d5 = this.f65645L;
            if (c16716d5 != null) {
                c16716d5.m89001g1(c22126c03);
            }
            this.f65648O = c22126c03;
        }
        C16716d c16716d6 = this.f65645L;
        if (c16716d6 != null) {
            mo69681L(c16716d6);
        }
        C19660u0 m102704x = AbstractC19620d0.m102704x(c17997r1, "204278670");
        C22126c0 c22126c04 = this.f65647N;
        if (c22126c04 != null) {
            c22126c04.m111959G1(m102704x.m103092b());
        }
        C22126c0 c22126c05 = this.f65648O;
        if (c22126c05 != null) {
            c22126c05.m111959G1(m102704x.m103091a());
        }
        C21693c c21693c2 = this.f65646M;
        if (c21693c2 != null) {
            if (this.f65662f0 && this.f65665i0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21693c2.mo44614b1(i11);
        }
        if (this.f65662f0 && this.f65665i0) {
            m70891L0(c17997r1, c17945a0);
        }
    }

    /* renamed from: K0 */
    private final void m70852K0() {
        C17945a0 m71033m;
        C17994q1 m95239r4;
        C32027n c32027n;
        List m131496e;
        this.f65660d0 = "";
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && (m95239r4 = m71033m.m95239r4()) != null && (c32027n = m95239r4.f91143e) != null) {
            String valueOf = String.valueOf(c32027n.m154472m());
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, valueOf, false, 2, null);
            if (m141800i == null) {
                m131496e = AbstractC25366r.m131496e(valueOf);
                new C12569b(myCloudMessageItem, m131496e).m141750b();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                this.f65660d0 = m118743r0;
                this.f65661e0 = "";
                return;
            }
            String m40383Q = m141800i.m40383Q(true, false);
            AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
            this.f65660d0 = m40383Q;
            String str = m141800i.f42446v;
            AbstractC19074t.m100207e(str, "avt");
            this.f65661e0 = str;
        }
    }

    /* renamed from: M0 */
    private final void m70853M0(boolean z11) {
        InterfaceC27158o2 interfaceC27158o2;
        int i11;
        C21693c c21693c = this.f65653T;
        if (c21693c != null) {
            Context context = getContext();
            if (z11) {
                i11 = AbstractC16803z.bg_black60_corner_8;
            } else {
                i11 = AbstractC16803z.bg_transparent_corner_8;
            }
            c21693c.m89085A0(AbstractC23136l9.m118665N(context, i11));
        }
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null && (interfaceC27158o2 = this.f65681y0) != null) {
            interfaceC27158o2.mo70518a(myCloudMessageItem, z11);
        }
    }

    /* renamed from: N0 */
    public static final void m70854N0(GridChatItemViewBase gridChatItemViewBase) {
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        try {
            MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
            if (myCloudMessageItem != null) {
                gridChatItemViewBase.mo70893x0(myCloudMessageItem, gridChatItemViewBase.f65672p0, gridChatItemViewBase.f65673q0, gridChatItemViewBase.f65674r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P0 */
    private final void m70855P0() {
        C21693c c21693c = this.f65646M;
        if (c21693c != null) {
            c21693c.mo111925v1(this.f65668l0);
        }
    }

    /* renamed from: S0 */
    private final void m70856S0() {
        C17945a0 m71033m;
        if (this.f65654U == null) {
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89028L(-1, -1);
            c21693c.m89085A0(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.bg_overlay_white_corner_8));
            c21693c.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.q
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GridChatItemViewBase.m70857T0(c16719g);
                }
            });
            c21693c.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.r
                public /* synthetic */ C12614r() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    GridChatItemViewBase.m70858U0(GridChatItemViewBase.this, c16719g);
                }
            });
            this.f65654U = c21693c;
        }
        C16719g c16719g = this.f65654U;
        if (c16719g != null) {
            mo69681L(c16719g);
        }
        int i11 = 0;
        if (this.f65655V == null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C17014k0 c17014k0 = new C17014k0(context, AbstractC2814h.ProgressBar_Horizontal);
            c17014k0.m89106L().m89028L(-2, -2).m89072y(Boolean.TRUE).m89033Q(AbstractC23222t7.f112576o).m89034R(AbstractC23222t7.f112576o).m89035S(AbstractC23222t7.f112576o);
            c17014k0.m91065j1(false);
            c17014k0.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.s
                public /* synthetic */ C12615s() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g2) {
                    GridChatItemViewBase.m70860V0(GridChatItemViewBase.this, c16719g2);
                }
            });
            this.f65655V = c17014k0;
        }
        C17014k0 c17014k02 = this.f65655V;
        if (c17014k02 != null) {
            MyCloudMessageItem myCloudMessageItem = this.f65670n0;
            if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
                i11 = AbstractC22543l.m116580c(m71033m.m95001S2(), 10);
            }
            c17014k02.m91066k1(i11);
            mo69681L(c17014k02);
        }
    }

    /* renamed from: T0 */
    public static final void m70857T0(C16719g c16719g) {
    }

    /* renamed from: U0 */
    public static final void m70858U0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
        if (myCloudMessageItem != null && (interfaceC27158o2 = gridChatItemViewBase.f65681y0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, gridChatItemViewBase.f65672p0, null, 4, null);
        }
    }

    /* renamed from: V0 */
    public static final void m70860V0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
        if (myCloudMessageItem != null && (interfaceC27158o2 = gridChatItemViewBase.f65681y0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, gridChatItemViewBase.f65672p0, null, 4, null);
        }
    }

    /* renamed from: q0 */
    private final void m70880q0() {
        boolean z11;
        Context context;
        int i11;
        if (this.f65678v0 == null) {
            this.f65678v0 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
        if (this.f65679w0 == null) {
            this.f65679w0 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
        if (this.f65653T == null) {
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89028L(-1, -1);
            c21693c.m89085A0(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.bg_black60_corner_8));
            this.f65653T = c21693c;
            c21693c.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.w
                public /* synthetic */ C12619w() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GridChatItemViewBase.m70881r0(GridChatItemViewBase.this, c16719g);
                }
            });
            C21693c c21693c2 = this.f65653T;
            if (c21693c2 != null) {
                c21693c2.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.m
                    public /* synthetic */ C12609m() {
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.d
                    /* renamed from: f */
                    public final void mo942f(C16719g c16719g) {
                        GridChatItemViewBase.m70882s0(GridChatItemViewBase.this, c16719g);
                    }
                });
            }
        }
        C21693c c21693c3 = this.f65653T;
        if (c21693c3 != null) {
            MyCloudMessageItem myCloudMessageItem = this.f65670n0;
            if (myCloudMessageItem != null && myCloudMessageItem.m71022f()) {
                context = getContext();
                i11 = AbstractC16803z.bg_black60_corner_8;
            } else {
                context = getContext();
                i11 = AbstractC16803z.bg_transparent_corner_8;
            }
            c21693c3.m89085A0(AbstractC23136l9.m118665N(context, i11));
            mo69681L(c21693c3);
        }
        if (this.f65652S == null) {
            C21691a c21691a = new C21691a(getContext());
            c21691a.m89106L().m89060k0(AbstractC23222t7.f112514B).m89030N(AbstractC23222t7.f112514B).m89017A(Boolean.TRUE).m89036T(AbstractC23222t7.f112566j).m89035S(AbstractC23222t7.f112566j);
            c21691a.m111906k1(this.f65678v0);
            c21691a.m111905j1(this.f65679w0);
            c21691a.mo89107L0(new C16719g.b() { // from class: com.zing.zalo.ui.mycloud.gridtab.n
                public /* synthetic */ C12610n() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.b
                /* renamed from: a */
                public final void mo945a(C16719g c16719g, boolean z12) {
                    GridChatItemViewBase.m70883t0(GridChatItemViewBase.this, c16719g, z12);
                }
            });
            this.f65652S = c21691a;
        }
        C21691a c21691a2 = this.f65652S;
        if (c21691a2 != null) {
            MyCloudMessageItem myCloudMessageItem2 = this.f65670n0;
            if (myCloudMessageItem2 != null) {
                z11 = myCloudMessageItem2.m71022f();
            } else {
                z11 = false;
            }
            c21691a2.mo89091D0(z11);
            mo69681L(c21691a2);
        }
    }

    /* renamed from: r0 */
    public static final void m70881r0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        if (gridChatItemViewBase.f65682z0 && (c21691a = gridChatItemViewBase.f65652S) != null) {
            c21691a.mo89091D0(!c21691a.m89141i0());
        }
    }

    /* renamed from: s0 */
    public static final void m70882s0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        if (gridChatItemViewBase.f65682z0 && (myCloudMessageItem = gridChatItemViewBase.f65670n0) != null && (interfaceC27158o2 = gridChatItemViewBase.f65681y0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, gridChatItemViewBase.f65672p0, null, 4, null);
        }
    }

    /* renamed from: t0 */
    public static final void m70883t0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g, boolean z11) {
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
        if (myCloudMessageItem == null || z11 != myCloudMessageItem.m71022f()) {
            gridChatItemViewBase.m70853M0(z11);
        }
    }

    /* renamed from: u0 */
    private final void m70884u0() {
        if (this.f65656W == null) {
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89028L(-1, -1);
            c21693c.m89085A0(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.bg_black60_corner_8));
            this.f65656W = c21693c;
        }
        C21693c c21693c2 = this.f65656W;
        if (c21693c2 != null) {
            mo69681L(c21693c2);
        }
        if (this.f65657a0 == null) {
            C21693c c21693c3 = new C21693c(getContext());
            c21693c3.m89106L().m89028L(-2, -2).m89025I(true).m89041Y(AbstractC23222t7.f112556e);
            Context context = c21693c3.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_retry_line_24, AbstractC2807a.icon_04));
            c21693c3.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.v
                public /* synthetic */ C12618v() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GridChatItemViewBase.m70885v0(GridChatItemViewBase.this, c16719g);
                }
            });
            this.f65657a0 = c21693c3;
        }
        C21693c c21693c4 = this.f65657a0;
        if (c21693c4 != null) {
            mo69681L(c21693c4);
        }
    }

    /* renamed from: v0 */
    public static final void m70885v0(GridChatItemViewBase gridChatItemViewBase, C16719g c16719g) {
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        MyCloudMessageItem myCloudMessageItem = gridChatItemViewBase.f65670n0;
        if (myCloudMessageItem != null && !myCloudMessageItem.m71033m().m95098c6()) {
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = gridChatItemViewBase.f65680x0;
            if (abstractC12510b != null) {
                abstractC12510b.mo70407z(myCloudMessageItem.m71033m());
            }
            gridChatItemViewBase.mo70893x0(myCloudMessageItem, gridChatItemViewBase.f65672p0, gridChatItemViewBase.f65673q0, gridChatItemViewBase.f65674r0);
        }
    }

    /* renamed from: y0 */
    public static final boolean m70886y0(GridChatItemViewBase gridChatItemViewBase, MyCloudMessageItem myCloudMessageItem, int i11, View view) {
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        AbstractC19074t.m100208f(myCloudMessageItem, "$data");
        InterfaceC27158o2 interfaceC27158o2 = gridChatItemViewBase.f65681y0;
        if (interfaceC27158o2 != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, i11, null, 4, null);
            return false;
        }
        return false;
    }

    /* renamed from: z0 */
    public static final void m70887z0(MyCloudMessageItem myCloudMessageItem, GridChatItemViewBase gridChatItemViewBase) {
        AbstractC19074t.m100208f(myCloudMessageItem, "$data");
        AbstractC19074t.m100208f(gridChatItemViewBase, "this$0");
        AbstractC3489d.m17517y(myCloudMessageItem.m71033m(), gridChatItemViewBase.mo70844O0());
    }

    /* renamed from: A0 */
    public void m70888A0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        int m70889I0 = m70889I0(c17945a0);
        if (m70889I0 != 0) {
            this.f65675s0.m143924q(c17945a0, m70889I0, this);
        }
    }

    /* renamed from: C0 */
    public C16719g mo70813C0() {
        return null;
    }

    /* renamed from: G */
    public void mo61268G(int i11, MessageId messageId) {
        C17945a0 m71033m;
        C17014k0 c17014k0;
        int m116580c;
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && AbstractC19074t.m100204b(messageId, m71033m.m95029V3()) && (c17014k0 = this.f65655V) != null) {
            m116580c = AbstractC22543l.m116580c(m71033m.m94982Q2(), 10);
            c17014k0.m91066k1(m116580c);
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: H */
    public void mo61269H(MessageId messageId, boolean z11) {
    }

    /* renamed from: I0 */
    public int m70889I0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (!c17945a0.m95032V6() || c17945a0.m95219o8() || c17945a0.m95091b6()) {
            return 0;
        }
        if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95316z8()) {
            return 0;
        }
        if (c17945a0.m95180k8()) {
            if (((byte) c17945a0.m95107d3()) != 5) {
                return 0;
            }
            byte m95089b4 = (byte) c17945a0.m95089b4();
            if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                return 0;
            }
        } else {
            byte m95089b42 = (byte) c17945a0.m95089b4();
            if (m95089b42 == 1) {
                if (!C0814e0.m2059e(c17945a0.m95029V3())) {
                    return 0;
                }
            } else if (m95089b42 != 2 && m95089b42 != 3 && m95089b42 != 4) {
                return 0;
            }
        }
        return 9;
    }

    /* renamed from: J0 */
    public final void m70890J0() {
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_primarycolor_corner_8dp));
        this.f65651R = mo70813C0();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x000a, B:5:0x000e, B:7:0x0012, B:9:0x0016, B:10:0x0027, B:30:0x007c, B:32:0x0082, B:36:0x0057, B:38:0x005d, B:39:0x0064, B:41:0x006a, B:43:0x0076, B:44:0x00a7, B:46:0x00ad, B:48:0x00b5, B:50:0x00c8, B:52:0x00cc, B:55:0x00db, B:57:0x00e5, B:59:0x00e9, B:65:0x00ee, B:67:0x00f2, B:70:0x00fd, B:72:0x0103, B:74:0x011c, B:76:0x0127, B:78:0x012b, B:82:0x012f, B:84:0x013e, B:86:0x0159, B:88:0x015d, B:92:0x0172, B:94:0x0176), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m70891L0(C17997r1 c17997r1, C17945a0 c17945a0) {
        C21693c c21693c;
        C21693c c21693c2;
        AbstractC19074t.m100208f(c17997r1, "replyChatContent");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        try {
            if (this.f65662f0 && this.f65665i0) {
                if (this.f65667k0 == null) {
                    this.f65667k0 = new C3977j(MainApplication.Companion.m35500c());
                }
                m70855P0();
                int m95687d = c17997r1.m95687d();
                if (m95687d != 31) {
                    if (m95687d != 36) {
                        if (m95687d != 43) {
                            if (m95687d != 46) {
                                String str = "";
                                if (m95687d != 32 && m95687d != 44 && m95687d != 49) {
                                    if (m95687d != 37) {
                                        if (m95687d != 38) {
                                        }
                                    } else if (c17997r1.m95690g() != null) {
                                        str = c17997r1.m95690g().f91014s;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        MessageId m95689f = c17997r1.m95689f();
                                        AbstractC19074t.m100207e(m95689f, "getMessageId(...)");
                                        C12572e c12572e = new C12572e(m95689f);
                                        c12572e.m125611h1(26000, 0);
                                        ((C23528a) this.f65669m0.m123612r(this.f65667k0)).m123579C(str, C23278z2.m120122e(), c12572e);
                                        return;
                                    }
                                    return;
                                }
                                if (c17997r1.m95690g() != null) {
                                    str = c17997r1.m95690g().f91013r;
                                    if (TextUtils.isEmpty(str)) {
                                        str = c17997r1.m95690g().f91014s;
                                    }
                                }
                                if (TextUtils.isEmpty(str)) {
                                }
                            } else if (c17997r1.m95690g() != null && (c17997r1.m95690g() instanceof C17990p0)) {
                                C17969i0 m95690g = c17997r1.m95690g();
                                AbstractC19074t.m100206d(m95690g, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                                C17990p0 c17990p0 = (C17990p0) m95690g;
                                String str2 = c17990p0.f91115D;
                                if (c17990p0.m95670k()) {
                                    C21693c c21693c3 = this.f65646M;
                                    if (c21693c3 != null) {
                                        c21693c3.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_folder));
                                        return;
                                    }
                                    return;
                                }
                                Drawable m142197h = AbstractC28236y3.m142197h(getContext(), str2);
                                if (m142197h != null && (c21693c2 = this.f65646M) != null) {
                                    c21693c2.mo111925v1(m142197h);
                                }
                            }
                        } else {
                            C21693c c21693c4 = this.f65646M;
                            if (c21693c4 != null) {
                                c21693c4.mo111925v1(AbstractC11531v0.Companion.m62622w1());
                            }
                        }
                    } else if (c17997r1.m95694k() != null) {
                        c17997r1.m95706w(C28644j.m143233Y().m143282P0(c17997r1.m95694k()));
                        C25630b m95694k = c17997r1.m95694k();
                        if (m95694k.m132448z()) {
                            C28020b3 c28020b3 = C28020b3.f130648a;
                            AbstractC19074t.m100205c(m95694k);
                            Bitmap m141206w = c28020b3.m141206w(m95694k);
                            if (m141206w != null && (c21693c = this.f65646M) != null) {
                                c21693c.mo111924u1(m141206w);
                                return;
                            }
                            return;
                        }
                        MessageId m95029V3 = c17945a0.m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        if (C25630b.f122553O.m132451c(m95694k)) {
                            ((C23528a) this.f65669m0.m123612r(this.f65667k0)).m123579C(m95694k.m132444v(), C23278z2.m120068F(), new C12570c(c17945a0, m95029V3, this));
                            return;
                        }
                        C3977j c3977j = this.f65667k0;
                        if (c3977j != null) {
                            C28020b3 c28020b32 = C28020b3.f130648a;
                            C23528a c23528a = this.f65669m0;
                            AbstractC19074t.m100205c(m95694k);
                            C28020b3.m141166H(c28020b32, c3977j, c23528a, m95694k, null, false, new C12571d(m95029V3, c17945a0, this), 12, null);
                        }
                    }
                } else {
                    C21693c c21693c5 = this.f65646M;
                    if (c21693c5 != null) {
                        c21693c5.mo111925v1(AbstractC11531v0.Companion.m62626y1());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: O0 */
    public InterfaceC18494a mo70844O0() {
        return C12573f.f65695q;
    }

    /* renamed from: Q0 */
    public void mo70814Q0() {
        C17945a0 m71033m;
        this.f65662f0 = false;
        this.f65663g0 = null;
        this.f65664h0 = 0;
        this.f65665i0 = false;
        this.f65666j0 = null;
        this.f65671o0 = this.f65674r0;
        this.f65676t0 = false;
        this.f65677u0 = false;
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            m71033m.m94997R9(this);
        }
        this.f65670n0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0011, B:12:0x0018, B:14:0x0020, B:16:0x0026, B:19:0x0030, B:21:0x0036, B:27:0x0043, B:32:0x0047, B:34:0x004e, B:37:0x005d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0011, B:12:0x0018, B:14:0x0020, B:16:0x0026, B:19:0x0030, B:21:0x0036, B:27:0x0043, B:32:0x0047, B:34:0x004e, B:37:0x005d), top: B:2:0x0005 }] */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo70892R0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            if (c17945a0.m95032V6() && !c17945a0.m95219o8() && !c17945a0.m95091b6()) {
                boolean z11 = false;
                if (!c17945a0.m94871D7()) {
                    if (!c17945a0.m95120e6()) {
                        if (c17945a0.m95316z8()) {
                        }
                        if (!c17945a0.m95180k8()) {
                            byte m95107d3 = (byte) c17945a0.m95107d3();
                            if (z11 && m95107d3 != 5 && m95107d3 == 3) {
                                setRetryVisible(true);
                                return;
                            }
                            return;
                        }
                        byte m95089b4 = (byte) c17945a0.m95089b4();
                        if (m95089b4 == 1) {
                            setRetryVisible(!C0814e0.m2059e(c17945a0.m95029V3()));
                            return;
                        } else {
                            if (m95089b4 == 0) {
                                setRetryVisible(true);
                                return;
                            }
                            return;
                        }
                    }
                }
                z11 = true;
                if (!c17945a0.m95180k8()) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final C23528a getAQuery() {
        return this.f65669m0;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return null;
    }

    public final C21691a getCheckBoxModule() {
        return this.f65652S;
    }

    public final int getContentHeight() {
        return this.f65671o0;
    }

    public final MyCloudMessageItem getData() {
        return this.f65670n0;
    }

    public final BaseMyCloudTabView.AbstractC12510b getDelegate() {
        return this.f65680x0;
    }

    public final boolean getEnableMultiSelection() {
        return this.f65682z0;
    }

    public final boolean getHasReply() {
        return this.f65662f0;
    }

    public final boolean getHasReplyImage() {
        return this.f65665i0;
    }

    public final int getItemHeight() {
        return this.f65674r0;
    }

    public final int getItemWidth() {
        return this.f65673q0;
    }

    public final C28770b getMExternalStates() {
        return this.f65675s0;
    }

    public final boolean getMRetryVisible() {
        return this.f65676t0;
    }

    public final int getPosition() {
        return this.f65672p0;
    }

    public final C17997r1 getReplyChatContent() {
        return this.f65663g0;
    }

    public final C16716d getReplyContentView() {
        return this.f65645L;
    }

    public final C3977j getReplyDumpImageView() {
        return this.f65667k0;
    }

    public final MessageId getReplyMessageId() {
        return this.f65666j0;
    }

    public final int getReplyMsgType() {
        return this.f65664h0;
    }

    public final C21693c getRetryModule() {
        return this.f65657a0;
    }

    public final InterfaceC27158o2 getSelectEventListener() {
        return this.f65681y0;
    }

    protected final boolean getShowLoadingProgress() {
        return this.f65677u0;
    }

    public final C16716d getViewOriginalMsgView() {
        return this.f65644K;
    }

    public final boolean getViewOriginalMsgVisible() {
        return this.f65659c0;
    }

    /* renamed from: m */
    public void mo61273m(int i11, MessageId messageId) {
        C17945a0 m71033m;
        C17014k0 c17014k0;
        int m116580c;
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && AbstractC19074t.m100204b(messageId, m71033m.m95029V3()) && (c17014k0 = this.f65655V) != null) {
            m116580c = AbstractC22543l.m116580c(m71033m.m95001S2(), 10);
            c17014k0.m91066k1(m116580c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C17945a0 m71033m;
        super.onDetachedFromWindow();
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
            m71033m.m94997R9(this);
        }
    }

    @Override // w50.C28770b.a
    /* renamed from: p */
    public void mo61097p(C17945a0 c17945a0, boolean z11) {
        C17945a0 c17945a02;
        MyCloudMessageItem myCloudMessageItem = this.f65670n0;
        if (myCloudMessageItem != null) {
            c17945a02 = myCloudMessageItem.m71033m();
        } else {
            c17945a02 = null;
        }
        if (c17945a0 == c17945a02 && z11) {
            if (c17945a0 != null) {
                c17945a0.m95045W9(this.f65675s0);
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.l
                public /* synthetic */ RunnableC12608l() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GridChatItemViewBase.m70854N0(GridChatItemViewBase.this);
                }
            });
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: s */
    public void mo61274s(MessageId messageId, String str, boolean z11) {
    }

    protected final void setAQuery(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f65669m0 = c23528a;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public final void setCheckBoModuleState(boolean z11) {
        int i11;
        C21693c c21693c = this.f65653T;
        if (c21693c != null) {
            Context context = getContext();
            if (z11) {
                i11 = AbstractC16803z.bg_black60_corner_8;
            } else {
                i11 = AbstractC16803z.bg_transparent_corner_8;
            }
            c21693c.m89085A0(AbstractC23136l9.m118665N(context, i11));
        }
        C21691a c21691a = this.f65652S;
        if (c21691a != null) {
            c21691a.mo89091D0(z11);
        }
    }

    protected final void setCheckBoxModule(C21691a c21691a) {
        this.f65652S = c21691a;
    }

    public final void setContentHeight(int i11) {
        this.f65671o0 = i11;
    }

    public final void setData(MyCloudMessageItem myCloudMessageItem) {
        this.f65670n0 = myCloudMessageItem;
    }

    public final void setDelegate(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f65680x0 = abstractC12510b;
    }

    public final void setEnableMultiSelection(boolean z11) {
        this.f65682z0 = z11;
    }

    protected final void setHasReply(boolean z11) {
        this.f65662f0 = z11;
    }

    public final void setHasReplyImage(boolean z11) {
        this.f65665i0 = z11;
    }

    protected final void setItemHeight(int i11) {
        this.f65674r0 = i11;
    }

    protected final void setItemWidth(int i11) {
        this.f65673q0 = i11;
    }

    public final void setMExternalStates(C28770b c28770b) {
        AbstractC19074t.m100208f(c28770b, "<set-?>");
        this.f65675s0 = c28770b;
    }

    protected final void setMRetryVisible(boolean z11) {
        this.f65676t0 = z11;
    }

    protected final void setPosition(int i11) {
        this.f65672p0 = i11;
    }

    public final void setReplyChatContent(C17997r1 c17997r1) {
        this.f65663g0 = c17997r1;
    }

    protected final void setReplyContentView(C16716d c16716d) {
        this.f65645L = c16716d;
    }

    public final void setReplyDumpImageView(C3977j c3977j) {
        this.f65667k0 = c3977j;
    }

    public final void setReplyMessageId(MessageId messageId) {
        this.f65666j0 = messageId;
    }

    public final void setReplyMsgType(int i11) {
        this.f65664h0 = i11;
    }

    protected final void setRetryModule(C21693c c21693c) {
        this.f65657a0 = c21693c;
    }

    public final void setRetryVisible(boolean z11) {
        MyCloudMessageItem myCloudMessageItem;
        C17945a0 m71033m;
        this.f65676t0 = z11;
        if (z11 && (myCloudMessageItem = this.f65670n0) != null && (m71033m = myCloudMessageItem.m71033m()) != null && m71033m.m95139g1()) {
            this.f65676t0 = false;
        }
    }

    public final void setSelectEventListener(InterfaceC27158o2 interfaceC27158o2) {
        this.f65681y0 = interfaceC27158o2;
    }

    public final void setShowLoadingProgress(boolean z11) {
        this.f65677u0 = z11;
    }

    protected final void setViewOriginalMsgView(C16716d c16716d) {
        this.f65644K = c16716d;
    }

    protected final void setViewOriginalMsgVisible(boolean z11) {
        this.f65659c0 = z11;
    }

    /* renamed from: w0 */
    public void mo70815w0() {
    }

    /* renamed from: x0 */
    public void mo70893x0(MyCloudMessageItem myCloudMessageItem, int i11, int i12, int i13) {
        boolean z11;
        C17997r1 c17997r1;
        AbstractC19074t.m100208f(myCloudMessageItem, "data");
        this.f65673q0 = i12;
        this.f65674r0 = i13;
        mo44090O();
        mo70814Q0();
        C17945a0 m71033m = myCloudMessageItem.m71033m();
        this.f65672p0 = i11;
        this.f65675s0.m143917j(m71033m.m94930K3());
        mo70892R0(m71033m);
        m70888A0(m71033m);
        this.f65670n0 = myCloudMessageItem;
        this.f65671o0 = i13;
        if (C21373a.f104231a.m110802n() && m71033m.m94898G6()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f65659c0 = z11;
        if (z11) {
            m70847D0();
            this.f65671o0 -= AbstractC23222t7.f112524G;
        }
        m70846B0(m71033m);
        if (this.f65662f0 && (c17997r1 = this.f65663g0) != null) {
            m70851H0(c17997r1, m71033m);
            this.f65671o0 -= AbstractC23222t7.f112545X;
        }
        C16719g c16719g = this.f65651R;
        if (c16719g != null) {
            if (this.f65659c0 && this.f65644K != null) {
                c16719g.m89106L().m89023G(this.f65644K);
                c16719g.m89106L().m89018B(Boolean.FALSE);
            } else if (this.f65662f0 && this.f65645L != null) {
                c16719g.m89106L().m89023G(this.f65645L);
                c16719g.m89106L().m89018B(Boolean.FALSE);
            } else {
                c16719g.m89106L().m89018B(Boolean.TRUE);
            }
            mo69681L(c16719g);
            mo70815w0();
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.mycloud.gridtab.o

            /* renamed from: q */
            public final /* synthetic */ MyCloudMessageItem f65792q;

            /* renamed from: r */
            public final /* synthetic */ int f65793r;

            public /* synthetic */ ViewOnLongClickListenerC12611o(MyCloudMessageItem myCloudMessageItem2, int i112) {
                r2 = myCloudMessageItem2;
                r3 = i112;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m70886y0;
                m70886y0 = GridChatItemViewBase.m70886y0(GridChatItemViewBase.this, r2, r3, view);
                return m70886y0;
            }
        });
        if (this.f65677u0 && !this.f65676t0) {
            m70856S0();
            myCloudMessageItem2.m71033m().m94859Bb(this);
        }
        if (this.f65676t0) {
            m70884u0();
        }
        if (this.f65682z0) {
            m70880q0();
        }
        myCloudMessageItem2.m71033m().m94884F1();
        if (myCloudMessageItem2.m71033m().m95063Y5()) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.p

                /* renamed from: q */
                public final /* synthetic */ GridChatItemViewBase f65795q;

                public /* synthetic */ RunnableC12612p(GridChatItemViewBase this) {
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GridChatItemViewBase.m70887z0(MyCloudMessageItem.this, r2);
                }
            });
        }
        if (!myCloudMessageItem2.m71033m().m95276v6() && !myCloudMessageItem2.m71033m().m95316z8() && myCloudMessageItem2.m71033m().m94849A8()) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m70850G0(context);
        }
        if (!myCloudMessageItem2.m71033m().m95276v6() && !myCloudMessageItem2.m71033m().m95316z8()) {
            AbstractC3489d.m17517y(myCloudMessageItem2.m71033m(), new C12568a(myCloudMessageItem2, this));
        }
    }
}
