package d70;

import bi.C2804c;
import bi.C2806e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.utils.ToastUtils;
import d70.C17811j;
import fn0.AbstractC19074t;
import gw.C19669z;
import hm0.C20096c;
import me0.AbstractC23088h5;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p348mi.AbstractC23309i;
import vg.AbstractC28025b8;
import vg.C28023b6;

/* renamed from: d70.j */
/* loaded from: classes5.dex */
public final class C17811j extends AbstractC19962a implements InterfaceC17805d {

    /* renamed from: t */
    private C2804c f90059t;

    /* renamed from: u */
    private final C19669z f90060u;

    /* renamed from: v */
    private boolean f90061v;

    /* renamed from: w */
    private final a f90062w;

    /* renamed from: d70.j$a */
    /* loaded from: classes5.dex */
    public static final class a extends C2804c.a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC17806e f90063a;

        /* renamed from: b */
        final /* synthetic */ C17811j f90064b;

        a(InterfaceC17806e interfaceC17806e, C17811j c17811j) {
            this.f90063a = interfaceC17806e;
            this.f90064b = c17811j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m94056i(InterfaceC17806e interfaceC17806e) {
            AbstractC19074t.m100208f(interfaceC17806e, "$mvpView");
            AbstractC23088h5.m118426g();
            if (interfaceC17806e.mo45894h0()) {
                ToastUtils.m89266n(AbstractC8020f0.add_to_ignore_list, new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static final void m94057j(InterfaceC17806e interfaceC17806e, C20096c c20096c, C17811j c17811j) {
            AbstractC19074t.m100208f(interfaceC17806e, "$mvpView");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            AbstractC19074t.m100208f(c17811j, "this$0");
            interfaceC17806e.mo49315c4();
            if (c20096c.m104491c() == 0) {
                c17811j.f90060u.m103198O0();
                interfaceC17806e.mo59032jx(AbstractC8020f0.str_decline_invitation_successfully_message);
                C17811j.m94049Pp(c17811j, false, 1, null);
                return;
            }
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            if (m104492d.length() > 0) {
                String m104492d2 = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d2, "getError_message(...)");
                interfaceC17806e.mo78936E(m104492d2);
                return;
            }
            interfaceC17806e.mo59032jx(AbstractC8020f0.error_general);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m94058k(InterfaceC17806e interfaceC17806e, C17811j c17811j, C20096c c20096c) {
            AbstractC19074t.m100208f(interfaceC17806e, "$mvpView");
            AbstractC19074t.m100208f(c17811j, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            interfaceC17806e.mo49315c4();
            c17811j.m94051Np(false);
            if (c20096c.m104491c() == 0) {
                C17811j.m94049Pp(c17811j, false, 1, null);
            } else {
                interfaceC17806e.mo66175j0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m94059l(C17811j c17811j, InterfaceC17806e interfaceC17806e) {
            AbstractC19074t.m100208f(c17811j, "this$0");
            AbstractC19074t.m100208f(interfaceC17806e, "$mvpView");
            if (c17811j.f90059t.m13567x()) {
                C17811j.m94049Pp(c17811j, false, 1, null);
            } else {
                interfaceC17806e.mo46829Y();
            }
        }

        @Override // bi.C2804c.a
        /* renamed from: a */
        public void mo13569a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() == 0) {
                final InterfaceC17806e interfaceC17806e = this.f90063a;
                interfaceC17806e.mo70710wy(new Runnable() { // from class: d70.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17811j.a.m94056i(InterfaceC17806e.this);
                    }
                });
            } else if (this.f90063a.mo45894h0()) {
                ToastUtils.m89259g(c20096c.m104491c());
            }
        }

        @Override // bi.C2804c.a
        /* renamed from: b */
        public void mo13570b(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final InterfaceC17806e interfaceC17806e = this.f90063a;
            final C17811j c17811j = this.f90064b;
            interfaceC17806e.mo70710wy(new Runnable() { // from class: d70.i
                @Override // java.lang.Runnable
                public final void run() {
                    C17811j.a.m94057j(InterfaceC17806e.this, c20096c, c17811j);
                }
            });
        }

        @Override // bi.C2804c.a
        /* renamed from: c */
        public void mo13571c(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final InterfaceC17806e interfaceC17806e = this.f90063a;
            final C17811j c17811j = this.f90064b;
            interfaceC17806e.mo70710wy(new Runnable() { // from class: d70.f
                @Override // java.lang.Runnable
                public final void run() {
                    C17811j.a.m94058k(InterfaceC17806e.this, c17811j, c20096c);
                }
            });
        }

        @Override // bi.C2804c.a
        /* renamed from: d */
        public void mo13572d() {
            final InterfaceC17806e interfaceC17806e = this.f90063a;
            final C17811j c17811j = this.f90064b;
            interfaceC17806e.mo70710wy(new Runnable() { // from class: d70.g
                @Override // java.lang.Runnable
                public final void run() {
                    C17811j.a.m94059l(C17811j.this, interfaceC17806e);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17811j(InterfaceC17806e interfaceC17806e, C2804c c2804c, C19669z c19669z) {
        super(interfaceC17806e);
        AbstractC19074t.m100208f(interfaceC17806e, "mvpView");
        AbstractC19074t.m100208f(c2804c, "groupInvitationBoxController");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        this.f90059t = c2804c;
        this.f90060u = c19669z;
        this.f90062w = new a(interfaceC17806e, this);
    }

    /* renamed from: Kp */
    private final void m94047Kp() {
        C2806e c2806e = C2806e.f11255a;
        if (c2806e.m13577b() > 0) {
            c2806e.m13586k(0);
            AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
            this.f90060u.m103198O0();
            C28023b6.m141250h0().m141282F();
            AbstractC28025b8.m141442M("tip.grouptab");
        }
    }

    /* renamed from: Op */
    private final void m94048Op(boolean z11) {
        ((InterfaceC17806e) m103742Dp()).mo66176si(this.f90059t.m13568y(), z11);
    }

    /* renamed from: Pp */
    static /* synthetic */ void m94049Pp(C17811j c17811j, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        c17811j.m94048Op(z11);
    }

    @Override // d70.InterfaceC17805d
    /* renamed from: B8 */
    public void mo94040B8() {
        m94049Pp(this, false, 1, null);
        m94047Kp();
    }

    @Override // d70.InterfaceC17805d
    /* renamed from: Be */
    public void mo94041Be() {
        m94049Pp(this, false, 1, null);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        C2804c.f11236a.m13561N(this.f90062w);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Mp, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C17804c c17804c, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c17804c, interfaceC19968g);
        C2804c.f11236a.m13558J(this.f90062w);
        m94047Kp();
    }

    /* renamed from: Np */
    public final void m94051Np(boolean z11) {
        this.f90061v = z11;
    }

    @Override // d70.InterfaceC17805d
    /* renamed from: Wc */
    public void mo94042Wc(GroupInvitationInfo groupInvitationInfo, Boolean bool, Boolean bool2) {
        boolean z11;
        AbstractC19074t.m100208f(groupInvitationInfo, "invitationInfo");
        ((InterfaceC17806e) m103742Dp()).mo46829Y();
        C2804c c2804c = C2804c.f11236a;
        if (bool2 != null && bool2.booleanValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        c2804c.m13566v(groupInvitationInfo, z11);
        if (bool != null && bool.booleanValue()) {
            c2804c.m13563n(groupInvitationInfo.m40892j(), 5);
        }
    }

    @Override // d70.InterfaceC17805d
    /* renamed from: jb */
    public void mo94043jb() {
        if (!this.f90061v) {
            this.f90061v = true;
            if (this.f90059t.m13567x()) {
                m94049Pp(this, false, 1, null);
            }
            this.f90059t.m13556D();
        }
    }

    @Override // d70.InterfaceC17805d
    /* renamed from: qf */
    public void mo94044qf() {
        m94049Pp(this, false, 1, null);
    }
}
