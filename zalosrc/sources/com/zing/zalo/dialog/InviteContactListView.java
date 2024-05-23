package com.zing.zalo.dialog;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.InviteContactListView;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseMemberItemModuleView;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.ManageGroupLinkView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23161o1;
import me0.AbstractC23211s7;
import me0.AbstractC23216t1;
import me0.AbstractC23222t7;
import me0.AbstractC23262x6;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p716zh.C31973j5;
import p716zh.C32002l4;
import p716zh.C32076q5;
import v50.C27870vb;
import vg.C28203u6;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes3.dex */
public class InviteContactListView extends BottomSheetZaloViewWithAnim implements ZaloView.InterfaceC17421f, View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC0733x {

    /* renamed from: X0 */
    ContactProfile f43502X0;

    /* renamed from: Y0 */
    C23528a f43503Y0;

    /* renamed from: Z0 */
    View f43504Z0;

    /* renamed from: a1 */
    RecyclerView f43505a1;

    /* renamed from: b1 */
    C7985f f43506b1;

    /* renamed from: c1 */
    View f43507c1;

    /* renamed from: d1 */
    TextView f43508d1;

    /* renamed from: e1 */
    TextView f43509e1;

    /* renamed from: f1 */
    LinearLayout f43510f1;

    /* renamed from: g1 */
    View f43511g1;

    /* renamed from: h1 */
    RobotoTextView f43512h1;

    /* renamed from: i1 */
    LinearLayout f43513i1;

    /* renamed from: j1 */
    RobotoTextView f43514j1;

    /* renamed from: k1 */
    RobotoTextView f43515k1;

    /* renamed from: l1 */
    TextView f43516l1;

    /* renamed from: o1 */
    C31973j5 f43519o1;

    /* renamed from: p1 */
    C32076q5 f43520p1;

    /* renamed from: w1 */
    ContactProfile f43527w1;

    /* renamed from: W0 */
    ArrayList f43501W0 = new ArrayList();

    /* renamed from: m1 */
    int f43517m1 = 0;

    /* renamed from: n1 */
    String f43518n1 = "";

    /* renamed from: q1 */
    boolean f43521q1 = false;

    /* renamed from: r1 */
    ArrayList f43522r1 = new ArrayList();

    /* renamed from: s1 */
    HashMap f43523s1 = new HashMap();

    /* renamed from: t1 */
    String f43524t1 = "";

    /* renamed from: u1 */
    Handler f43525u1 = new Handler(new C7980a());

    /* renamed from: v1 */
    boolean f43526v1 = false;

    /* renamed from: x1 */
    boolean f43528x1 = false;

    /* renamed from: y1 */
    public String f43529y1 = "";

    /* loaded from: classes3.dex */
    public class MemberRowModuleView extends BaseMemberItemModuleView {

        /* renamed from: W */
        protected C32076q5 f43530W;

        public MemberRowModuleView(Context context, C23528a c23528a) {
            super(context, c23528a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public /* synthetic */ void m42966c0(ContactProfile contactProfile, C16719g c16719g) {
            InviteContactListView.this.m42950LM(contactProfile.f42455y);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public /* synthetic */ void m42967d0(ContactProfile contactProfile, C16719g c16719g) {
            try {
                AbstractC23211s7.m119583p(InviteContactListView.this.m92676n2(), new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public /* synthetic */ void m42968e0(ContactProfile contactProfile, C16719g c16719g) {
            try {
                AbstractC23211s7.m119583p(InviteContactListView.this.m92676n2(), new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public /* synthetic */ void m42969f0(ContactProfile contactProfile, C16719g c16719g) {
            InviteContactListView.this.m42959zM(contactProfile);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public /* synthetic */ void m42970g0(ContactProfile contactProfile, View view) {
            String str;
            try {
                if (!InviteContactListView.this.f43523s1.containsKey(contactProfile.f42434r)) {
                    str = "1591072";
                } else {
                    str = "1591073";
                }
                AbstractC23647d.m123897g(str);
                AbstractC23211s7.m119583p(InviteContactListView.this.m92676n2(), new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public /* synthetic */ void m42971h0(ContactProfile contactProfile, View view) {
            if (InviteContactListView.this.m92650VI() != null) {
                AbstractC23211s7.m119561A(contactProfile.f42434r, C32002l4.m154264g(35), InviteContactListView.this.m92650VI().m92662fJ());
            }
        }

        /* renamed from: D */
        public void mo42972D(final ContactProfile contactProfile, int i11) {
            int i12;
            int i13;
            if (contactProfile == null) {
                return;
            }
            try {
                C16719g c16719g = this.f64549L;
                if (i11 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c16719g.mo44614b1(i12);
                C22124b0 c22124b0 = this.f64550M;
                c22124b0.m115407x1(C23212s8.m119607o(c22124b0.getContext(), AbstractC21196a.TextColor1));
                this.f64550M.m115406w1(contactProfile.m40383Q(true, false));
                if (contactProfile.m40381O0() && !TextUtils.isEmpty(contactProfile.f42455y)) {
                    this.f64551N.mo44614b1(0);
                    this.f64551N.m111959G1(contactProfile.f42455y);
                } else if (AbstractC25495a.m132079d(contactProfile.mo2478b())) {
                    this.f64551N.mo44614b1(0);
                    boolean z11 = !InviteContactListView.this.f43523s1.containsKey(contactProfile.f42434r);
                    C22126c0 c22126c0 = this.f64551N;
                    if (z11) {
                        i13 = AbstractC8020f0.str_added_to_group;
                    } else {
                        i13 = AbstractC8020f0.str_not_yet_added_to_group;
                    }
                    c22126c0.m111959G1(AbstractC23136l9.m118743r0(i13));
                } else {
                    this.f64551N.mo44614b1(8);
                }
                this.f64552O.m115439w1(C23278z2.m120143n());
                this.f64552O.m115433q1(contactProfile);
                if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                    this.f64555R.mo44614b1(8);
                } else if (contactProfile.f42352K0 > 0) {
                    this.f64555R.mo44614b1(8);
                    this.f64555R.mo89109M0(null);
                } else {
                    int i14 = InviteContactListView.this.f43517m1;
                    if (i14 != 21) {
                        switch (i14) {
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                this.f64555R.mo44614b1(0);
                                if (InviteContactListView.this.f43517m1 == 14) {
                                    this.f64555R.m111958F1(AbstractC8020f0.resend);
                                } else {
                                    this.f64555R.m111958F1(AbstractC8020f0.str_send);
                                }
                                this.f64555R.mo89109M0(new C16719g.c() { // from class: bn.q0
                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                    /* renamed from: y */
                                    public final void mo929y(C16719g c16719g2) {
                                        InviteContactListView.MemberRowModuleView.this.m42966c0(contactProfile, c16719g2);
                                    }
                                });
                                break;
                            default:
                                if (contactProfile.m40381O0()) {
                                    this.f64555R.mo44614b1(8);
                                    break;
                                } else {
                                    this.f64555R.mo44614b1(0);
                                    if (!AbstractC21935u.m114554u(contactProfile.f42434r) && !AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                                        this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_addfriend));
                                        AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType2_medium);
                                        this.f64555R.mo89109M0(new C16719g.c() { // from class: bn.t0
                                            @Override // com.zing.zalo.uidrawing.C16719g.c
                                            /* renamed from: y */
                                            public final void mo929y(C16719g c16719g2) {
                                                InviteContactListView.MemberRowModuleView.this.m42969f0(contactProfile, c16719g2);
                                            }
                                        });
                                        break;
                                    }
                                    this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes_short));
                                    AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType1_small);
                                    this.f64555R.mo89109M0(new C16719g.c() { // from class: bn.s0
                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g2) {
                                            InviteContactListView.MemberRowModuleView.this.m42968e0(contactProfile, c16719g2);
                                        }
                                    });
                                }
                                break;
                        }
                    } else {
                        this.f64552O.m115431E1(0, AbstractC23222t7.f112556e, true);
                        this.f64555R.mo44614b1(8);
                        this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_group));
                        this.f64555R.mo89109M0(new C16719g.c() { // from class: bn.r0
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g2) {
                                InviteContactListView.MemberRowModuleView.this.m42967d0(contactProfile, c16719g2);
                            }
                        });
                    }
                }
                if (contactProfile.m40381O0()) {
                    setOnClickListener(null);
                }
                if (AbstractC25495a.m132079d(contactProfile.mo2478b())) {
                    setOnClickListener(new View.OnClickListener() { // from class: bn.u0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InviteContactListView.MemberRowModuleView.this.m42970g0(contactProfile, view);
                        }
                    });
                } else {
                    setOnClickListener(new View.OnClickListener() { // from class: bn.v0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InviteContactListView.MemberRowModuleView.this.m42971h0(contactProfile, view);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        public void setGroupMemberInfo(C32076q5 c32076q5) {
            this.f43530W = c32076q5;
        }
    }

    /* loaded from: classes3.dex */
    public class UndoAddMemberRowModuleView extends MemberRowModuleView {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.dialog.InviteContactListView$UndoAddMemberRowModuleView$a */
        /* loaded from: classes3.dex */
        public class C7979a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ String f43533a;

            /* renamed from: b */
            final /* synthetic */ ContactProfile f43534b;

            C7979a(String str, ContactProfile contactProfile) {
                this.f43533a = str;
                this.f43534b = contactProfile;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m42979e(String str) {
                InviteContactListView.this.f43512h1.setEnabled(!r0.m42929AM());
                InviteContactListView inviteContactListView = InviteContactListView.this;
                inviteContactListView.mo78936E(inviteContactListView.m92653YI(AbstractC8020f0.str_undo_add_member_successfully, str));
                UndoAddMemberRowModuleView.this.f64555R.mo89099H0(false);
                UndoAddMemberRowModuleView.this.setAlpha(0.3f);
                InviteContactListView.this.mo49315c4();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m42980f() {
                InviteContactListView.this.f43512h1.setEnabled(!r0.m42929AM());
                UndoAddMemberRowModuleView.this.f64555R.mo89099H0(false);
                UndoAddMemberRowModuleView.this.setAlpha(0.3f);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                InviteContactListView.this.mo49315c4();
                boolean z11 = false;
                InviteContactListView.this.f43521q1 = false;
                try {
                    if (c20096c.m104491c() == 17029) {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_user_no_longer_member_of_group, this.f43534b.m40383Q(true, false)));
                        InviteContactListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.dialog.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                InviteContactListView.UndoAddMemberRowModuleView.C7979a.this.m42980f();
                            }
                        });
                        return;
                    }
                    C31973j5 c31973j5 = InviteContactListView.this.f43519o1;
                    if (c31973j5 != null && c31973j5.m153747Y()) {
                        z11 = true;
                    }
                    ToastUtils.m89261i(c20096c, z11);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                InviteContactListView inviteContactListView = InviteContactListView.this;
                inviteContactListView.f43521q1 = false;
                final String str = this.f43533a;
                inviteContactListView.mo70710wy(new Runnable() { // from class: com.zing.zalo.dialog.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteContactListView.UndoAddMemberRowModuleView.C7979a.this.m42979e(str);
                    }
                });
            }
        }

        public UndoAddMemberRowModuleView(Context context, C23528a c23528a) {
            super(context, c23528a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public /* synthetic */ void m42975k0(ContactProfile contactProfile, String str, C16719g c16719g) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(contactProfile.f42434r);
            InviteContactListView.this.m42946wM(arrayList, new C7979a(str, contactProfile));
            AbstractC23647d.m123897g("10070002");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public /* synthetic */ void m42976l0(ContactProfile contactProfile, View view) {
            if (getAlpha() == 0.3f && InviteContactListView.this.f43517m1 == 20) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_user_no_longer_member_of_group, contactProfile.m40383Q(true, false)));
            } else if (InviteContactListView.this.m92650VI() != null) {
                AbstractC23211s7.m119561A(contactProfile.f42434r, C32002l4.m154264g(35), InviteContactListView.this.m92650VI().m92662fJ());
            }
        }

        @Override // com.zing.zalo.dialog.InviteContactListView.MemberRowModuleView
        /* renamed from: D */
        public void mo42972D(final ContactProfile contactProfile, int i11) {
            if (contactProfile == null) {
                return;
            }
            try {
                final String m40383Q = contactProfile.m40383Q(true, false);
                C22124b0 c22124b0 = this.f64550M;
                c22124b0.m115407x1(C23212s8.m119607o(c22124b0.getContext(), AbstractC21196a.TextColor1));
                this.f64550M.m115406w1(m40383Q);
                if (contactProfile.m40381O0() && !TextUtils.isEmpty(contactProfile.f42455y)) {
                    this.f64551N.mo44614b1(0);
                    this.f64551N.m111959G1(contactProfile.f42455y);
                } else {
                    this.f64551N.mo44614b1(8);
                }
                int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_Ma);
                int m118742r = AbstractC23136l9.m118742r(13.0f);
                this.f64549L.mo44614b1(8);
                C16716d c16716d = new C16716d(getContext());
                c16716d.m89106L().m89028L(m118655I, m118655I).m89036T(AbstractC23136l9.m118742r(6.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89027K(true).m89023G(this.f64549L);
                C22129e c22129e = new C22129e(getContext(), m118655I);
                this.f64552O = c22129e;
                c22129e.m115440x1(AbstractC16803z.default_avatar);
                m88985S(this.f64552O);
                c16716d.m89001g1(this.f64552O);
                if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                    C21693c c21693c = new C21693c(getContext());
                    C16718f m89028L = c21693c.m89106L().m89028L(-2, -2);
                    Boolean bool = Boolean.TRUE;
                    m89028L.m89017A(bool).m89072y(bool).m89029M(10);
                    c21693c.mo111926w1(AbstractC16803z.ic_banned);
                    c16716d.m89001g1(c21693c);
                }
                if (contactProfile.f42430p1) {
                    C21693c c21693c2 = new C21693c(getContext());
                    C16718f m89028L2 = c21693c2.m89106L().m89028L(m118742r, m118742r);
                    Boolean bool2 = Boolean.TRUE;
                    m89028L2.m89017A(bool2).m89072y(bool2).m89029M(10);
                    c21693c2.m89087B0(AbstractC16803z.online_status_green_ic_with_stroke_one);
                    c16716d.m89001g1(c21693c2);
                }
                mo69681L(c16716d);
                this.f64552O.m115439w1(C23278z2.m120143n());
                this.f64552O.m115433q1(contactProfile);
                this.f64555R.m111979u1(false);
                if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                    this.f64555R.mo44614b1(8);
                } else if (contactProfile.f42352K0 > 0) {
                    this.f64555R.mo44614b1(8);
                    this.f64555R.mo89109M0(null);
                } else {
                    this.f64555R.mo44614b1(0);
                    AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType2_medium);
                    this.f64555R.m111959G1(InviteContactListView.this.m92652XI(AbstractC8020f0.str_undo_add_member));
                    C32076q5 c32076q5 = this.f43530W;
                    if (c32076q5 != null && !c32076q5.m154725n(contactProfile.f42434r)) {
                        this.f64555R.mo89099H0(false);
                        setAlpha(0.3f);
                    }
                    this.f64555R.mo89109M0(new C16719g.c() { // from class: bn.w0
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            InviteContactListView.UndoAddMemberRowModuleView.this.m42975k0(contactProfile, m40383Q, c16719g);
                        }
                    });
                }
                if (contactProfile.m40381O0()) {
                    setOnClickListener(null);
                } else {
                    setOnClickListener(new View.OnClickListener() { // from class: bn.x0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InviteContactListView.UndoAddMemberRowModuleView.this.m42976l0(contactProfile, view);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.dialog.InviteContactListView$a */
    /* loaded from: classes3.dex */
    class C7980a implements Handler.Callback {
        C7980a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            InviteContactListView inviteContactListView = InviteContactListView.this;
                            ContactProfile contactProfile = (ContactProfile) message.obj;
                            inviteContactListView.f43502X0 = contactProfile;
                            if (contactProfile != null) {
                                inviteContactListView.f72421L0.showDialog(1);
                            }
                        }
                    } else {
                        Bundle bundle = (Bundle) message.obj;
                        if (InviteContactListView.this.f72421L0.m92672lJ() && InviteContactListView.this.m92650VI() != null) {
                            InviteContactListView.this.m92650VI().m92662fJ().m93066i2(WriteInvitationView.class, bundle, 0, 1, true);
                        }
                    }
                } else {
                    C7985f c7985f = InviteContactListView.this.f43506b1;
                    if (c7985f != null) {
                        c7985f.m10008p();
                    }
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.InviteContactListView$b */
    /* loaded from: classes3.dex */
    public class C7981b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f43537a;

        C7981b(StringBuilder sb2) {
            this.f43537a = sb2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m42982d(StringBuilder sb2) {
            InviteContactListView.this.f43512h1.setEnabled(false);
            InviteContactListView inviteContactListView = InviteContactListView.this;
            inviteContactListView.mo78936E(inviteContactListView.m92653YI(AbstractC8020f0.str_undo_add_member_successfully, sb2.toString()));
            InviteContactListView.this.f43506b1.m10008p();
            InviteContactListView.this.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InviteContactListView inviteContactListView = InviteContactListView.this;
            boolean z11 = false;
            inviteContactListView.f43521q1 = false;
            inviteContactListView.mo49315c4();
            try {
                C31973j5 c31973j5 = InviteContactListView.this.f43519o1;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    z11 = true;
                }
                AbstractC23161o1.m119321f(c20096c, z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InviteContactListView inviteContactListView = InviteContactListView.this;
            inviteContactListView.f43521q1 = false;
            final StringBuilder sb2 = this.f43537a;
            inviteContactListView.mo70710wy(new Runnable() { // from class: com.zing.zalo.dialog.e
                @Override // java.lang.Runnable
                public final void run() {
                    InviteContactListView.C7981b.this.m42982d(sb2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.InviteContactListView$c */
    /* loaded from: classes3.dex */
    public class C7982c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f43539a;

        C7982c(ContactProfile contactProfile) {
            this.f43539a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InviteContactListView inviteContactListView = InviteContactListView.this;
            boolean z11 = false;
            inviteContactListView.f43521q1 = false;
            inviteContactListView.mo49315c4();
            try {
                if (c20096c.m104491c() == 17029) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_user_no_longer_member_of_group, this.f43539a.m40383Q(true, false)));
                    return;
                }
                C31973j5 c31973j5 = InviteContactListView.this.f43519o1;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    z11 = true;
                }
                ToastUtils.m89261i(c20096c, z11);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InviteContactListView inviteContactListView = InviteContactListView.this;
            inviteContactListView.f43521q1 = false;
            inviteContactListView.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.InviteContactListView$d */
    /* loaded from: classes3.dex */
    public class C7983d implements InterfaceC20094a {
        C7983d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m42984d() {
            InviteContactListView.this.m42947IM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InviteContactListView.this.f43526v1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                    if (jSONObject.optInt("enable") == 1) {
                        String optString = jSONObject.optString("link");
                        C31973j5 c31973j5 = InviteContactListView.this.f43519o1;
                        if (c31973j5 != null) {
                            c31973j5.m153714E0(optString);
                        }
                    } else {
                        InviteContactListView.this.f43519o1.m153714E0("");
                    }
                    ((CommonZaloview) InviteContactListView.this).f72827B0.post(new Runnable() { // from class: com.zing.zalo.dialog.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            InviteContactListView.C7983d.this.m42984d();
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                InviteContactListView.this.f43526v1 = false;
            } catch (Throwable th2) {
                InviteContactListView.this.f43526v1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.InviteContactListView$e */
    /* loaded from: classes3.dex */
    public class C7984e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f43542a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.dialog.InviteContactListView$e$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f43544a;

            a(ContactProfile contactProfile) {
                this.f43544a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f43544a.f42434r);
            }
        }

        C7984e(ContactProfile contactProfile) {
            this.f43542a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m42986d() {
            if (InviteContactListView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(InviteContactListView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
            }
            ContactProfile contactProfile = InviteContactListView.this.f43527w1;
            if (contactProfile != null && !AbstractC21935u.m114558y(contactProfile.f42434r)) {
                contactProfile.f42330D = 0L;
                C18644n.m98531l().m98543e(contactProfile);
                C0824j.m2153b(new a(contactProfile));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InviteContactListView inviteContactListView = InviteContactListView.this;
            inviteContactListView.f43528x1 = false;
            inviteContactListView.f72421L0.mo49315c4();
            if (InviteContactListView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(InviteContactListView.this.m92652XI(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            InviteContactListView inviteContactListView = InviteContactListView.this;
            inviteContactListView.f43528x1 = false;
            inviteContactListView.mo49315c4();
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && !jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.isNull("isRequested")) {
                        i11 = 0;
                    } else {
                        i11 = jSONObject2.getInt("isRequested");
                    }
                    if (jSONObject2.isNull("isFriend")) {
                        i12 = 0;
                    } else {
                        i12 = jSONObject2.getInt("isFriend");
                    }
                    if (jSONObject2.isNull("isRequesting")) {
                        i13 = 0;
                    } else {
                        i13 = jSONObject2.getInt("isRequesting");
                    }
                    int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                    int optInt2 = jSONObject2.optInt("ranking", 0);
                    if (optInt == 1) {
                        if (i11 == 0 && i13 == 0) {
                            if (i12 == 0) {
                                if (!AbstractC21935u.m114558y(InviteContactListView.this.f43527w1.f42434r)) {
                                    TrackingSource trackingSource = new TrackingSource(InviteContactListView.this.f43527w1.f42373R0);
                                    trackingSource.m40677a("sourceView", 22);
                                    C21927m.m114302u().m114330e0(InviteContactListView.this.f43527w1.f42434r, trackingSource);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("uid", InviteContactListView.this.f43527w1.f42434r);
                                    bundle.putString("dpn", InviteContactListView.this.f43527w1.f42437s);
                                    bundle.putString("avatar", InviteContactListView.this.f43527w1.f42446v);
                                    bundle.putString("phone", InviteContactListView.this.f43527w1.f42455y);
                                    Handler handler = InviteContactListView.this.f43525u1;
                                    handler.sendMessage(handler.obtainMessage(2, bundle));
                                    return;
                                }
                                if (InviteContactListView.this.f72421L0.m92672lJ()) {
                                    ToastUtils.showMess(InviteContactListView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                                }
                                InviteContactListView.this.f43525u1.sendEmptyMessage(1);
                                AbstractC23074g2.m118375a(0, InviteContactListView.this.f43527w1.f42434r, "", 5);
                                return;
                            }
                            if (i12 == 1) {
                                if (InviteContactListView.this.m92676n2() != null) {
                                    InviteContactListView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.dialog.g
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            InviteContactListView.C7984e.this.m42986d();
                                        }
                                    });
                                }
                                AbstractC23074g2.m118375a(0, InviteContactListView.this.f43527w1.f42434r, "", 5);
                                return;
                            }
                            return;
                        }
                        if (i13 != 0) {
                            ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(this.f43542a.f42434r);
                            if (mo98491j != null) {
                                mo98491j.f42369Q = optInt2;
                            }
                            C7960e.m41971c6().m42566vd(this.f43542a.f42434r, optInt2);
                            InviteContactListView inviteContactListView2 = InviteContactListView.this;
                            Handler handler2 = inviteContactListView2.f43525u1;
                            handler2.sendMessage(handler2.obtainMessage(3, inviteContactListView2.f43527w1));
                            return;
                        }
                        AbstractC23063f2.m118349a(InviteContactListView.this.f43527w1);
                        ToastUtils.showMess(InviteContactListView.this.m92652XI(AbstractC8020f0.str_already_send_friend_request_new));
                        AbstractC23074g2.m118375a(0, InviteContactListView.this.f43527w1.f42434r, "", 5);
                        return;
                    }
                    if (optInt < 0) {
                        if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                            if (!AbstractC23216t1.m119641f(InviteContactListView.this.f72421L0, optInt, false)) {
                                ToastUtils.m89259g(optInt);
                                return;
                            }
                            return;
                        }
                        InviteContactListView.this.f43529y1 = AbstractC23161o1.m119317b(optInt);
                        if (!TextUtils.isEmpty(InviteContactListView.this.f43529y1)) {
                            ToastUtils.showMess(InviteContactListView.this.f43529y1);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.dialog.InviteContactListView$f */
    /* loaded from: classes3.dex */
    public class C7985f extends RecyclerView.AbstractC1880g {
        public C7985f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void mo9990A(C7986g c7986g, int i11) {
            MemberRowModuleView memberRowModuleView = c7986g.f43547I;
            if (memberRowModuleView != null) {
                memberRowModuleView.f43530W = InviteContactListView.this.m42958yM();
            }
            c7986g.m42989D((ContactProfile) InviteContactListView.this.f43501W0.get(i11), i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public C7986g mo9992C(ViewGroup viewGroup, int i11) {
            MemberRowModuleView undoAddMemberRowModuleView;
            if (InviteContactListView.this.f43517m1 != 20) {
                InviteContactListView inviteContactListView = InviteContactListView.this;
                undoAddMemberRowModuleView = new MemberRowModuleView(inviteContactListView.f72421L0.getContext(), InviteContactListView.this.f43503Y0);
            } else {
                InviteContactListView inviteContactListView2 = InviteContactListView.this;
                undoAddMemberRowModuleView = new UndoAddMemberRowModuleView(inviteContactListView2.f72421L0.getContext(), InviteContactListView.this.f43503Y0);
            }
            return new C7986g(undoAddMemberRowModuleView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return InviteContactListView.this.f43501W0.size();
        }
    }

    /* renamed from: com.zing.zalo.dialog.InviteContactListView$g */
    /* loaded from: classes3.dex */
    public static class C7986g extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public MemberRowModuleView f43547I;

        public C7986g(MemberRowModuleView memberRowModuleView) {
            super(memberRowModuleView);
            this.f43547I = memberRowModuleView;
        }

        /* renamed from: D */
        public void m42989D(ContactProfile contactProfile, int i11) {
            MemberRowModuleView memberRowModuleView = this.f43547I;
            if (memberRowModuleView != null) {
                memberRowModuleView.mo42972D(contactProfile, i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public boolean m42929AM() {
        ArrayList arrayList = this.f43501W0;
        if (arrayList == null || arrayList.size() < 1) {
            return false;
        }
        C32076q5 m42958yM = m42958yM();
        Iterator it = this.f43501W0.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (m42958yM != null && m42958yM.m154725n(contactProfile.f42434r)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ Void m42930BM() {
        this.f43525u1.sendEmptyMessageDelayed(1, 500L);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m42931CM(View view) {
        ContactProfile contactProfile;
        AbstractC23647d.m123897g("10070006");
        ArrayList arrayList = this.f43501W0;
        if (arrayList != null) {
            contactProfile = (ContactProfile) arrayList.get(0);
        } else {
            contactProfile = null;
        }
        if (contactProfile == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(contactProfile.f42434r);
        m42946wM(arrayList2, new C7982c(contactProfile));
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m42932DM(View view) {
        close();
        AbstractC23647d.m123897g("10070007");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m42933EM(View view) {
        int i11;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        C32076q5 m42958yM = m42958yM();
        Iterator it = this.f43501W0.iterator();
        String str = "";
        int i12 = 0;
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (m42958yM != null && m42958yM.m154725n(contactProfile.f42434r)) {
                arrayList.add(contactProfile.f42434r);
                if (i12 < 3) {
                    sb2.append(str);
                    sb2.append(contactProfile.m40383Q(true, false));
                    i12++;
                    str = ", ";
                }
            }
        }
        if (i12 < arrayList.size()) {
            sb2.append(" ");
            if (arrayList.size() - i12 > 1) {
                i11 = AbstractC8020f0.str_and_num_others;
            } else {
                i11 = AbstractC8020f0.str_and_one_other;
            }
            sb2.append(m92653YI(i11, Integer.valueOf(arrayList.size() - i12)));
        }
        m42946wM(arrayList, new C7981b(sb2));
        m42952NM();
        AbstractC23647d.m123897g("10070004");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m42934FM(View view) {
        m42952NM();
        AbstractC23647d.m123897g("10070005");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m42935GM(View view) {
        AbstractC23647d.m123897g("10070003");
        if (this.f43501W0 == null) {
            return;
        }
        m42951MM(Html.fromHtml(m92652XI(AbstractC8020f0.str_undo_all_added_member_confirm_text)), new View.OnClickListener() { // from class: bn.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InviteContactListView.this.m42933EM(view2);
            }
        }, new View.OnClickListener() { // from class: bn.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InviteContactListView.this.m42934FM(view2);
            }
        });
    }

    /* renamed from: HM */
    private void m42936HM(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(31);
            trackingSource.m40677a("sourceView", 22);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(35)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: bn.m0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m42930BM;
                    m42930BM = InviteContactListView.this.m42930BM();
                    return m42930BM;
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public void m42946wM(ArrayList arrayList, InterfaceC20094a interfaceC20094a) {
        if (this.f43521q1) {
            return;
        }
        this.f43521q1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1715q3(this.f43518n1, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return super.mo39014DJ(i11);
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43164m(AbstractC8020f0.str_close, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.btn_accept_Invitation, this);
        return aVar.m43152a();
    }

    /* renamed from: IM */
    void m42947IM() {
        C31973j5 c31973j5;
        int size = this.f43501W0.size();
        switch (this.f43517m1) {
            case 0:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_group_strangers_invited_failed_dialog_msg);
                break;
            case 1:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_not_in_phonebook);
                break;
            case 2:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_full_group_limit);
                break;
            case 3:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_prevent_msg_from_strangers);
                break;
            case 4:
            case 10:
            default:
                this.f43508d1.setVisibility(8);
                this.f43511g1.setVisibility(8);
                break;
            case 5:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_other_reasons);
                break;
            case 6:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_need_join_approval);
                break;
            case 7:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_already_in_pending_list);
                break;
            case 8:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_banned_from_group);
                break;
            case 9:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_invitee_prevent_add_group_v2);
                break;
            case 11:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_phone_had_invited);
                break;
            case 12:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_max_invited_phone_users_in_week);
                break;
            case 13:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_phone_receive_had_quota);
                break;
            case 14:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_success_invite_non_zalo_users);
                break;
            case 15:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_failed_cannot_invite_phone);
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_success_invite_stranger_via_phone_number);
                break;
            case 17:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_hint_detail_invitee_is_existed_in_group);
                break;
            case 18:
                this.f43508d1.setVisibility(0);
                this.f43508d1.setText(AbstractC8020f0.str_failed_invitee_non_searchable_by_phonenumber_hint_detail);
                break;
            case 19:
                this.f43505a1.setVisibility(8);
                this.f43508d1.setVisibility(0);
                this.f43516l1.setVisibility(0);
                C31973j5 c31973j52 = this.f43519o1;
                if (c31973j52 != null) {
                    if (TextUtils.isEmpty(c31973j52.m153773n())) {
                        if (this.f43519o1.m153778p0()) {
                            this.f43508d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_bottom_sheet_info_group_link_no_link_for_owner));
                            this.f43516l1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_action_reactivate_group_link));
                            break;
                        } else {
                            this.f43508d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_bottom_sheet_info_group_link_no_link));
                            this.f43516l1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_action_contact_owner));
                            break;
                        }
                    } else {
                        this.f43516l1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_action_share_group_link));
                        if (this.f43519o1.m153778p0()) {
                            this.f43508d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_bottom_sheet_info_group_link_have_link_for_owner));
                            break;
                        } else {
                            this.f43508d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_bottom_sheet_info_group_link_have_link));
                            break;
                        }
                    }
                }
                break;
            case 20:
                m42948JM();
                break;
            case 21:
                AbstractC23647d.m123897g("1591071");
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f43524t1);
                if (m141809c != null) {
                    String m40385R = m141809c.m40385R(true, true, true);
                    this.f43508d1.setVisibility(0);
                    int size2 = this.f43501W0.size() - this.f43522r1.size();
                    if (size2 == this.f43501W0.size()) {
                        this.f43508d1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_desc_bottom_sheet_invite_to_multi_group_3, m40385R, Integer.valueOf(size2), Integer.valueOf(this.f43501W0.size())));
                        break;
                    } else if (size2 > 0) {
                        this.f43508d1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_desc_bottom_sheet_invite_to_multi_group, m40385R, Integer.valueOf(size2), Integer.valueOf(this.f43501W0.size())));
                        break;
                    } else {
                        this.f43508d1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_desc_bottom_sheet_invite_to_multi_group_2, m40385R));
                        break;
                    }
                }
                break;
        }
        if (this.f43517m1 == 19 && (c31973j5 = this.f43519o1) != null) {
            if (TextUtils.isEmpty(c31973j5.m153773n())) {
                this.f43509e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_bottom_sheet_info_group_link_no_link));
            } else {
                this.f43509e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_bottom_sheet_info_group_link_have_link));
            }
        }
        int i11 = this.f43517m1;
        if (i11 == 21) {
            this.f43509e1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_details, Integer.valueOf(size)));
        } else if (i11 != 20) {
            this.f43509e1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_num_people, Integer.valueOf(size)));
        }
    }

    /* renamed from: JM */
    void m42948JM() {
        int m118742r = AbstractC23136l9.m118742r(32.0f);
        this.f43508d1.setPadding(m118742r, 0, m118742r, AbstractC23136l9.m118742r(26.0f));
        this.f43508d1.setTextSize(13.0f);
        this.f43508d1.setLineSpacing(10.0f, 1.0f);
        this.f43510f1.setVisibility(0);
        this.f43509e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_undo_request_friend));
        this.f43511g1.setVisibility(8);
        ArrayList arrayList = this.f43501W0;
        if (arrayList != null && arrayList.size() <= 1) {
            m42951MM(Html.fromHtml(m92652XI(AbstractC8020f0.str_undo_add_one_member_confirm_text)), new View.OnClickListener() { // from class: bn.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InviteContactListView.this.m42931CM(view);
                }
            }, new View.OnClickListener() { // from class: bn.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InviteContactListView.this.m42932DM(view);
                }
            });
        } else {
            m42952NM();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                ContactProfile contactProfile = this.f43502X0;
                if (contactProfile != null) {
                    m42936HM(contactProfile);
                }
                this.f43502X0 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: KM */
    void m42949KM() {
        try {
            C23744a.m124114c().m124117e(this, 52);
            C23744a.m124114c().m124117e(this, 27);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LM */
    void m42950LM(String str) {
        try {
            if (str.trim().equals("")) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_the_phone_number_invalid));
            }
            String str2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_sms_invite_install_zalo_src_group_v2, AbstractC23262x6.m120003p(AbstractC23304d.f113368c0.f42437s, false)) + " " + AbstractC23306f.m120583H().m110204g().f110069d;
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            this.f72421L0.startActivityForResult(intent, 1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: MM */
    void m42951MM(Spanned spanned, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        AbstractC23136l9.m118744r1(this.f43513i1, 0);
        AbstractC23136l9.m118744r1(this.f43505a1, 8);
        AbstractC23136l9.m118744r1(this.f43512h1, 8);
        AbstractC23136l9.m118744r1(this.f43509e1, 8);
        AbstractC23136l9.m118744r1(this.f43514j1, 0);
        AbstractC23136l9.m118744r1(this.f43515k1, 0);
        AbstractC23136l9.m118744r1(this.f43508d1, 0);
        TextView textView = this.f43508d1;
        if (textView != null) {
            textView.setText(spanned);
        }
        RobotoTextView robotoTextView = this.f43514j1;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener2);
        }
        RobotoTextView robotoTextView2 = this.f43515k1;
        if (robotoTextView2 != null) {
            robotoTextView2.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: NM */
    void m42952NM() {
        this.f43508d1.setText(Html.fromHtml(m92652XI(AbstractC8020f0.str_group_undo_multi_add_member_title)));
        AbstractC23136l9.m118744r1(this.f43505a1, 0);
        AbstractC23136l9.m118744r1(this.f43513i1, 8);
        AbstractC23136l9.m118744r1(this.f43512h1, 0);
        AbstractC23136l9.m118744r1(this.f43514j1, 8);
        AbstractC23136l9.m118744r1(this.f43515k1, 8);
        AbstractC23136l9.m118744r1(this.f43508d1, 0);
        this.f43512h1.setEnabled(!m42929AM());
        this.f43512h1.setOnClickListener(new View.OnClickListener() { // from class: bn.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteContactListView.this.m42935GM(view);
            }
        });
    }

    /* renamed from: OM */
    void m42953OM() {
        ArrayList arrayList;
        C32076q5 m42958yM;
        if (this.f43517m1 == 20 && (arrayList = this.f43501W0) != null && arrayList.size() > 0 && (m42958yM = m42958yM()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.f43501W0.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (contactProfile != null && m42958yM.m154725n(contactProfile.f42434r)) {
                    arrayList2.add(0, contactProfile);
                } else {
                    arrayList2.add(contactProfile);
                }
            }
            this.f43501W0 = arrayList2;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        return this.f43505a1;
    }

    /* renamed from: PM */
    void m42954PM() {
        this.f43520p1 = null;
        m42958yM();
        this.f43525u1.sendEmptyMessage(1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m42949KM();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: T2 */
    public void mo42955T2(float f11) {
        boolean z11;
        super.mo42955T2(f11);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        if (bottomSheetLayout.getTranslationY() == this.f72454M0.f68983q) {
            z11 = true;
        } else {
            z11 = false;
        }
        bottomSheetLayout.setEnableScrollY(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m42949KM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z12) {
            this.f43506b1.m10008p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return AbstractC23136l9.m118742r(300.0f);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        this.f43504Z0 = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.invite_contact_list_dialog_view, (ViewGroup) linearLayout, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setEnableScrollY(false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "InviteContactListView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 10099 && i12 == -1) {
                    this.f43525u1.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                return;
            }
            if (i12 == -1 && this.f43517m1 == 19) {
                this.f43516l1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_action_activated_group_link));
                this.f43516l1.setEnabled(false);
                return;
            }
            return;
        }
        if (i12 == -1) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, android.view.View.OnClickListener
    public void onClick(View view) {
        C31973j5 c31973j5;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_close) {
            close();
            return;
        }
        if (id2 == AbstractC6918a0.btn_action && this.f43517m1 == 19 && (c31973j5 = this.f43519o1) != null) {
            if (TextUtils.isEmpty(c31973j5.m153773n())) {
                if (this.f43519o1.m153778p0()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_group_id", this.f43518n1);
                    bundle.putBoolean("BOL_EXTRA_IS_GROUP_OWNER", this.f43519o1.m153778p0());
                    bundle.putBoolean("EXTRA_IS_FINISH_VIEW", true);
                    if (m92650VI() != null) {
                        m92650VI().m92662fJ().m93066i2(ManageGroupLinkView.class, bundle, 2, 1, true);
                        return;
                    }
                    return;
                }
                C31973j5 c31973j52 = this.f43519o1;
                if (c31973j52 != null) {
                    AbstractC23211s7.m119572e(c31973j52.m153758f(), m92676n2(), "");
                    return;
                }
                return;
            }
            C31973j5 c31973j53 = this.f43519o1;
            if (c31973j53 != null && !TextUtils.isEmpty(c31973j53.m153773n())) {
                close();
                String m153773n = this.f43519o1.m153773n();
                Bundle bundle2 = new Bundle();
                bundle2.putString("linktoShare", m153773n);
                bundle2.putBoolean("bol_share_in_app", true);
                if (m92650VI() != null && m92650VI().m92662fJ() != null) {
                    m92650VI().m92662fJ().m93069k2(ShareView.class, bundle2, 0, true);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m42956vM();
    }

    /* renamed from: vM */
    void m42956vM() {
        try {
            C23744a.m124114c().m124115b(this, 52);
            C23744a.m124114c().m124115b(this, 27);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 27) {
            if (i11 == 52) {
                if (String.valueOf(objArr[0]).equals("group_" + this.f43519o1.m153781r())) {
                    close();
                    return;
                }
                return;
            }
            return;
        }
        if (objArr != null && objArr.length >= 3 && TextUtils.equals((String) objArr[0], this.f43518n1)) {
            m42954PM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        this.f43517m1 = 0;
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_DATA");
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    JSONArray optJSONArray = jSONObject.optJSONArray("contacts");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                            if (optJSONObject != null) {
                                InviteContactProfile inviteContactProfile = new InviteContactProfile(optJSONObject);
                                ContactProfile m141811g = C28203u6.f131407a.m141811g(inviteContactProfile.f42434r);
                                if (m141811g != null) {
                                    this.f43501W0.add(m141811g);
                                } else {
                                    this.f43501W0.add(inviteContactProfile);
                                }
                            }
                        }
                    }
                    this.f43517m1 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    if (jSONObject.has("groupId")) {
                        this.f43518n1 = jSONObject.getString("groupId");
                        this.f43519o1 = C0943w.m4462l().m4472f(this.f43518n1);
                        m42957xM();
                    } else if (m92642L3.containsKey("GROUP_ID")) {
                        this.f43518n1 = m92642L3.getString("GROUP_ID");
                        this.f43519o1 = C0943w.m4462l().m4472f(this.f43518n1);
                        m42957xM();
                    }
                    if (jSONObject.has("groupIdsInviteFailed")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("groupIdsInviteFailed");
                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                            String string2 = jSONArray.getString(i12);
                            this.f43522r1.add(string2);
                            this.f43523s1.put(string2, string2);
                        }
                    }
                    if (jSONObject.has("userId")) {
                        this.f43524t1 = jSONObject.getString("userId");
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
        m42953OM();
        this.f43503Y0 = new C23528a(this.f72421L0.getContext());
        this.f43505a1 = (RecyclerView) this.f43504Z0.findViewById(AbstractC6918a0.rv_invite_contact_list);
        C7985f c7985f = new C7985f();
        this.f43506b1 = c7985f;
        this.f43505a1.setAdapter(c7985f);
        this.f43505a1.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext(), 1, false));
        this.f43510f1 = (LinearLayout) this.f43504Z0.findViewById(AbstractC6918a0.layout_header);
        this.f43507c1 = this.f43504Z0.findViewById(AbstractC6918a0.popup_content_container);
        this.f43508d1 = (TextView) this.f43504Z0.findViewById(AbstractC6918a0.tv_hint);
        this.f43509e1 = (TextView) this.f43504Z0.findViewById(AbstractC6918a0.tv_title);
        this.f43511g1 = this.f43504Z0.findViewById(AbstractC6918a0.top_divider);
        this.f43512h1 = (RobotoTextView) this.f43504Z0.findViewById(AbstractC6918a0.btn_recall_all_add_member);
        this.f43513i1 = (LinearLayout) this.f43504Z0.findViewById(AbstractC6918a0.bottom_button_layout_container);
        this.f43514j1 = (RobotoTextView) this.f43504Z0.findViewById(AbstractC6918a0.btn_cancel);
        this.f43515k1 = (RobotoTextView) this.f43504Z0.findViewById(AbstractC6918a0.btn_sure);
        TextView textView = (TextView) this.f43504Z0.findViewById(AbstractC6918a0.btn_action);
        this.f43516l1 = textView;
        textView.setOnClickListener(this);
        m78540jM(0);
        m78539iM(true);
        m42947IM();
        this.f43504Z0.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
    }

    /* renamed from: xM */
    void m42957xM() {
        if (this.f43526v1) {
            return;
        }
        this.f43526v1 = true;
        if (!TextUtils.isEmpty(this.f43518n1)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C7983d());
            c0766k.mo1780y3(this.f43518n1);
        }
    }

    /* renamed from: yM */
    C32076q5 m42958yM() {
        if (this.f43520p1 == null) {
            this.f43520p1 = C0943w.m4462l().m4476k(this.f43518n1);
        }
        return this.f43520p1;
    }

    /* renamed from: zM */
    public void m42959zM(ContactProfile contactProfile) {
        if (this.f43528x1 || !AbstractC23138m0.m118770b()) {
            return;
        }
        this.f72421L0.mo46829Y();
        this.f43528x1 = true;
        this.f43527w1 = contactProfile;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C7984e(contactProfile));
        c0766k.mo1615ca(contactProfile.f42434r);
    }
}
