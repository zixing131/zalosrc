package com.zing.zalo.p077ui.group.bottomsheet.invitees;

import a70.C0640b;
import a70.C0643e;
import a70.InterfaceC0641c;
import ac.InterfaceC0733x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.group.bottomsheet.invitees.BottomSheetInviteesView;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseMemberItemModuleView;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.concurrent.Callable;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p649xl.C29976p4;
import p716zh.C31973j5;
import p716zh.C32002l4;
import v50.C27870vb;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes5.dex */
public final class BottomSheetInviteesView extends BottomSheetZaloViewWithAnim implements InterfaceC0641c, ZaloView.InterfaceC17421f, View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC0733x {
    public static final C11896c Companion = new C11896c(null);

    /* renamed from: W0 */
    private C29976p4 f61977W0;

    /* renamed from: X0 */
    private C0640b f61978X0;

    /* renamed from: Y0 */
    private C0643e f61979Y0;

    /* renamed from: Z0 */
    private ContactProfile f61980Z0;

    /* renamed from: a1 */
    private C23528a f61981a1;

    /* renamed from: b1 */
    private C11895b f61982b1;

    /* renamed from: c1 */
    private HashMap f61983c1 = new HashMap();

    /* renamed from: d1 */
    private Handler f61984d1 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: a70.g
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m66123tM;
            m66123tM = BottomSheetInviteesView.m66123tM(BottomSheetInviteesView.this, message);
            return m66123tM;
        }
    });

    /* loaded from: classes5.dex */
    public final class MemberRowModuleView extends BaseMemberItemModuleView implements InterfaceC11894a {
        public MemberRowModuleView(Context context, C23528a c23528a) {
            super(context, c23528a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public static final void m66134a0(ContactProfile contactProfile, BottomSheetInviteesView bottomSheetInviteesView, C16719g c16719g) {
            AbstractC19074t.m100208f(contactProfile, "$contactProfile");
            AbstractC19074t.m100208f(bottomSheetInviteesView, "this$0");
            try {
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                AbstractC23211s7.m119583p(bottomSheetInviteesView.m92676n2(), new C27870vb(str).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public static final void m66135b0(BottomSheetInviteesView bottomSheetInviteesView, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(bottomSheetInviteesView, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contactProfile");
            C0643e c0643e = bottomSheetInviteesView.f61979Y0;
            if (c0643e == null) {
                AbstractC19074t.m100223u("mPresenter");
                c0643e = null;
            }
            c0643e.m921Kp(contactProfile);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public static final void m66136c0(BottomSheetInviteesView bottomSheetInviteesView, ContactProfile contactProfile, View view) {
            String str;
            AbstractC19074t.m100208f(bottomSheetInviteesView, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contactProfile");
            try {
                if (!bottomSheetInviteesView.m66128sM().containsKey(contactProfile.f42434r)) {
                    str = "1591072";
                } else {
                    str = "1591073";
                }
                AbstractC23647d.m123897g(str);
                String str2 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                AbstractC23211s7.m119583p(bottomSheetInviteesView.m92676n2(), new C27870vb(str2).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public static final void m66137d0(BottomSheetInviteesView bottomSheetInviteesView, ContactProfile contactProfile, View view) {
            C17487o0 c17487o0;
            AbstractC19074t.m100208f(bottomSheetInviteesView, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contactProfile");
            if (bottomSheetInviteesView.m92650VI() != null) {
                C32002l4 m154287a = C32002l4.Companion.m154287a(37);
                String str = contactProfile.f42434r;
                ZaloView m92650VI = bottomSheetInviteesView.m92650VI();
                if (m92650VI != null) {
                    c17487o0 = m92650VI.m92662fJ();
                } else {
                    c17487o0 = null;
                }
                AbstractC23211s7.m119561A(str, m154287a, c17487o0);
            }
        }

        @Override // com.zing.zalo.p077ui.group.bottomsheet.invitees.BottomSheetInviteesView.InterfaceC11894a
        /* renamed from: D */
        public void mo66138D(final ContactProfile contactProfile, int i11) {
            int i12;
            int i13;
            AbstractC19074t.m100208f(contactProfile, "contactProfile");
            try {
                C16719g c16719g = this.f64549L;
                if (i11 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c16719g.mo44614b1(i12);
                this.f64550M.f108888M0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
                this.f64550M.f108888M0.m111959G1(contactProfile.m40383Q(true, false));
                if (contactProfile.m40381O0() && !TextUtils.isEmpty(contactProfile.f42455y)) {
                    this.f64551N.mo44614b1(0);
                    this.f64551N.m111959G1(contactProfile.f42455y);
                } else if (contactProfile.m40374K0()) {
                    this.f64551N.mo44614b1(0);
                    boolean z11 = !BottomSheetInviteesView.this.m66128sM().containsKey(contactProfile.f42434r);
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
                this.f64552O.m115429C1(false, false);
                this.f64552O.m115433q1(contactProfile);
                if (AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i)) {
                    this.f64555R.mo44614b1(8);
                } else if (contactProfile.f42352K0 > 0) {
                    this.f64555R.mo44614b1(8);
                    this.f64555R.mo89109M0(null);
                } else if (contactProfile.m40381O0()) {
                    this.f64555R.mo44614b1(8);
                } else {
                    this.f64555R.mo44614b1(0);
                    if (!AbstractC21935u.m114554u(contactProfile.f42434r) && !AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                        this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_addfriend));
                        AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType2_medium);
                        C22126c0 c22126c02 = this.f64555R;
                        final BottomSheetInviteesView bottomSheetInviteesView = BottomSheetInviteesView.this;
                        c22126c02.mo89109M0(new C16719g.c() { // from class: a70.i
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g2) {
                                BottomSheetInviteesView.MemberRowModuleView.m66135b0(BottomSheetInviteesView.this, contactProfile, c16719g2);
                            }
                        });
                    }
                    this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes_short));
                    AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType1_small);
                    C22126c0 c22126c03 = this.f64555R;
                    final BottomSheetInviteesView bottomSheetInviteesView2 = BottomSheetInviteesView.this;
                    c22126c03.mo89109M0(new C16719g.c() { // from class: a70.h
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g2) {
                            BottomSheetInviteesView.MemberRowModuleView.m66134a0(ContactProfile.this, bottomSheetInviteesView2, c16719g2);
                        }
                    });
                }
                if (contactProfile.m40381O0()) {
                    setOnClickListener(null);
                }
                if (AbstractC25495a.m132079d(contactProfile.mo2478b())) {
                    final BottomSheetInviteesView bottomSheetInviteesView3 = BottomSheetInviteesView.this;
                    setOnClickListener(new View.OnClickListener() { // from class: a70.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BottomSheetInviteesView.MemberRowModuleView.m66136c0(BottomSheetInviteesView.this, contactProfile, view);
                        }
                    });
                } else {
                    final BottomSheetInviteesView bottomSheetInviteesView4 = BottomSheetInviteesView.this;
                    setOnClickListener(new View.OnClickListener() { // from class: a70.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BottomSheetInviteesView.MemberRowModuleView.m66137d0(BottomSheetInviteesView.this, contactProfile, view);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.group.bottomsheet.invitees.BottomSheetInviteesView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11894a {
        /* renamed from: D */
        void mo66138D(ContactProfile contactProfile, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.group.bottomsheet.invitees.BottomSheetInviteesView$b */
    /* loaded from: classes5.dex */
    public final class C11895b extends RecyclerView.AbstractC1880g {
        public C11895b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void mo9990A(C11897d c11897d, int i11) {
            AbstractC19074t.m100208f(c11897d, "holder");
            C0640b c0640b = BottomSheetInviteesView.this.f61978X0;
            if (c0640b == null) {
                AbstractC19074t.m100223u("mArgs");
                c0640b = null;
            }
            Object obj = c0640b.m913d().get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            c11897d.mo66138D((ContactProfile) obj, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public C11897d mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            BottomSheetInviteesView bottomSheetInviteesView = BottomSheetInviteesView.this;
            return new C11897d(new MemberRowModuleView(bottomSheetInviteesView.f72421L0.getContext(), BottomSheetInviteesView.this.m66127rM()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            C0640b c0640b = BottomSheetInviteesView.this.f61978X0;
            if (c0640b == null) {
                AbstractC19074t.m100223u("mArgs");
                c0640b = null;
            }
            return c0640b.m913d().size();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.bottomsheet.invitees.BottomSheetInviteesView$c */
    /* loaded from: classes5.dex */
    public static final class C11896c {
        private C11896c() {
        }

        public /* synthetic */ C11896c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.bottomsheet.invitees.BottomSheetInviteesView$d */
    /* loaded from: classes5.dex */
    public static final class C11897d extends RecyclerView.AbstractC1876c0 implements InterfaceC11894a {

        /* renamed from: I */
        private final ModulesView f61987I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11897d(ModulesView modulesView) {
            super(modulesView);
            AbstractC19074t.m100208f(modulesView, "itemView");
            this.f61987I = modulesView;
        }

        @Override // com.zing.zalo.p077ui.group.bottomsheet.invitees.BottomSheetInviteesView.InterfaceC11894a
        /* renamed from: D */
        public void mo66138D(ContactProfile contactProfile, int i11) {
            AbstractC19074t.m100208f(contactProfile, "contactProfile");
            ViewParent viewParent = this.f61987I;
            if (viewParent instanceof InterfaceC11894a) {
                ((InterfaceC11894a) viewParent).mo66138D(contactProfile, i11);
            }
        }
    }

    /* renamed from: qM */
    private final void m66122qM() {
        C23744a.Companion.m124119a().m124115b(this, 52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final boolean m66123tM(BottomSheetInviteesView bottomSheetInviteesView, Message message) {
        ZaloView m92650VI;
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(bottomSheetInviteesView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        try {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Object obj = message.obj;
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.control.ContactProfile");
                        ContactProfile contactProfile = (ContactProfile) obj;
                        bottomSheetInviteesView.f61980Z0 = contactProfile;
                        if (contactProfile != null) {
                            bottomSheetInviteesView.f72421L0.showDialog(1);
                        }
                    }
                } else {
                    Object obj2 = message.obj;
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type android.os.Bundle");
                    Bundle bundle = (Bundle) obj2;
                    if (bottomSheetInviteesView.f72421L0.m92672lJ() && bottomSheetInviteesView.m92650VI() != null && (m92650VI = bottomSheetInviteesView.m92650VI()) != null && (m92662fJ = m92650VI.m92662fJ()) != null) {
                        m92662fJ.m93066i2(WriteInvitationView.class, bundle, 0, 1, true);
                    }
                }
            } else {
                C11895b c11895b = bottomSheetInviteesView.f61982b1;
                if (c11895b != null) {
                    c11895b.m10008p();
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: uM */
    private final void m66124uM(ContactProfile contactProfile) {
        TrackingSource trackingSource = new TrackingSource(31);
        trackingSource.m40677a("sourceView", 22);
        C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
        AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.Companion.m154287a(37)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: a70.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m66125vM;
                m66125vM = BottomSheetInviteesView.m66125vM(BottomSheetInviteesView.this);
                return m66125vM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final Void m66125vM(BottomSheetInviteesView bottomSheetInviteesView) {
        AbstractC19074t.m100208f(bottomSheetInviteesView, "this$0");
        bottomSheetInviteesView.f61984d1.sendEmptyMessageDelayed(1, 500L);
        return null;
    }

    /* renamed from: xM */
    private final void m66126xM() {
        C23744a.Companion.m124119a().m124117e(this, 52);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f61978X0 = C0640b.m911b(m92642L3());
        C0643e c0643e = new C0643e(this);
        this.f61979Y0 = c0643e;
        C0640b c0640b = this.f61978X0;
        if (c0640b == null) {
            AbstractC19074t.m100223u("mArgs");
            c0640b = null;
        }
        c0643e.mo995Nd(c0640b, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43164m(AbstractC8020f0.str_close, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.btn_accept_Invitation, this);
            return aVar.m43152a();
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                ContactProfile contactProfile = this.f61980Z0;
                if (contactProfile != null) {
                    m66124uM(contactProfile);
                }
                this.f61980Z0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        m66126xM();
        super.mo40200KJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29976p4 c29976p4 = this.f61977W0;
        if (c29976p4 == null) {
            AbstractC19074t.m100223u("binding");
            c29976p4 = null;
        }
        RecyclerView recyclerView = c29976p4.f138952y;
        AbstractC19074t.m100207e(recyclerView, "rvInviteContactList");
        return recyclerView;
    }

    @Override // a70.InterfaceC0641c
    /* renamed from: Rz */
    public void mo916Rz(int i11, Object obj) {
        AbstractC19074t.m100208f(obj, "obj");
        Handler handler = this.f61984d1;
        handler.sendMessage(handler.obtainMessage(i11, obj));
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: T2 */
    public void mo42955T2(float f11) {
        super.mo42955T2(f11);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        if (f11 == bottomSheetLayout.f68983q) {
            bottomSheetLayout.setEnableScrollY(true);
        } else {
            bottomSheetLayout.setEnableScrollY(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        C11895b c11895b;
        C0640b c0640b = this.f61978X0;
        if (c0640b == null) {
            AbstractC19074t.m100223u("mArgs");
            c0640b = null;
        }
        if (c0640b.m915f() == null) {
            ZaloView m92650VI = m92650VI();
            if (m92650VI != null) {
                m92650VI.finish();
                return;
            }
            return;
        }
        super.mo37122XJ(z11, z12);
        if (z12 && (c11895b = this.f61982b1) != null) {
            c11895b.m10008p();
        }
    }

    @Override // a70.InterfaceC0641c
    /* renamed from: cr */
    public void mo917cr(int i11) {
        if (this.f72421L0.m92672lJ()) {
            ToastUtils.showMess(m92652XI(i11));
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
        C29976p4 m148357c = C29976p4.m148357c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m148357c, "inflate(...)");
        this.f61977W0 = m148357c;
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
        return "BottomSheetInviteesView";
    }

    @Override // a70.InterfaceC0641c
    /* renamed from: k */
    public ZaloView mo918k() {
        return this;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 10099 && i12 == -1) {
            this.f61984d1.sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (view.getId() == AbstractC6918a0.btn_close) {
            close();
        }
    }

    /* renamed from: rM */
    public final C23528a m66127rM() {
        return this.f61981a1;
    }

    /* renamed from: sM */
    public final HashMap m66128sM() {
        return this.f61983c1;
    }

    @Override // a70.InterfaceC0641c
    public void sendEmptyMessageDelayed(int i11, long j11) {
        this.f61984d1.sendEmptyMessageDelayed(i11, j11);
    }

    /* renamed from: wM */
    public final void m66129wM() {
        C29976p4 c29976p4 = this.f61977W0;
        C0640b c0640b = null;
        if (c29976p4 == null) {
            AbstractC19074t.m100223u("binding");
            c29976p4 = null;
        }
        C0640b c0640b2 = this.f61978X0;
        if (c0640b2 == null) {
            AbstractC19074t.m100223u("mArgs");
            c0640b2 = null;
        }
        if (TextUtils.isEmpty(c0640b2.m914e())) {
            c29976p4.f138941A.setVisibility(8);
        } else {
            RobotoTextView robotoTextView = c29976p4.f138941A;
            robotoTextView.setVisibility(0);
            C0640b c0640b3 = this.f61978X0;
            if (c0640b3 == null) {
                AbstractC19074t.m100223u("mArgs");
                c0640b3 = null;
            }
            robotoTextView.setText(c0640b3.m914e());
        }
        RobotoTextView robotoTextView2 = c29976p4.f138942B;
        int i11 = AbstractC8020f0.str_num_people;
        Object[] objArr = new Object[1];
        C0640b c0640b4 = this.f61978X0;
        if (c0640b4 == null) {
            AbstractC19074t.m100223u("mArgs");
        } else {
            c0640b = c0640b4;
        }
        objArr[0] = Integer.valueOf(c0640b.m913d().size());
        robotoTextView2.setText(AbstractC23136l9.m118746s0(i11, objArr));
        C11895b c11895b = this.f61982b1;
        if (c11895b != null) {
            c11895b.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        ZaloView m92650VI;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 52) {
            String valueOf = String.valueOf(objArr[0]);
            C0640b c0640b = this.f61978X0;
            String str = null;
            if (c0640b == null) {
                AbstractC19074t.m100223u("mArgs");
                c0640b = null;
            }
            C31973j5 m915f = c0640b.m915f();
            if (m915f != null) {
                str = m915f.m153781r();
            }
            if (AbstractC19074t.m100204b(valueOf, "group_" + str) && (m92650VI = m92650VI()) != null) {
                m92650VI.finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f61981a1 = new C23528a(this.f72421L0.getContext());
        this.f61982b1 = new C11895b();
        C29976p4 c29976p4 = this.f61977W0;
        C29976p4 c29976p42 = null;
        if (c29976p4 == null) {
            AbstractC19074t.m100223u("binding");
            c29976p4 = null;
        }
        RecyclerView recyclerView = c29976p4.f138952y;
        recyclerView.setAdapter(this.f61982b1);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C29976p4 c29976p43 = this.f61977W0;
        if (c29976p43 == null) {
            AbstractC19074t.m100223u("binding");
            c29976p43 = null;
        }
        c29976p43.f138945r.setOnClickListener(this);
        C29976p4 c29976p44 = this.f61977W0;
        if (c29976p44 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29976p42 = c29976p44;
        }
        c29976p42.f138947t.setOnClickListener(this);
        m78540jM(0);
        m78539iM(true);
        m66129wM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        m66122qM();
        super.mo40210zJ(zaloActivity);
    }
}
