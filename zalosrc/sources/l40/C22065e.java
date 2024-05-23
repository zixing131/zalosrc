package l40;

import ag0.C0815e1;
import ah0.C0860a;
import b50.C2556d;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import l40.C22065e;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p421pc.C24720a;
import p479rc.C25727d;
import p484ri.C25806c;
import p525ti.C26701b;
import pm0.C24848g0;
import s00.AbstractC26084s;
import sc.C26220b;
import si.C26263i;

/* renamed from: l40.e */
/* loaded from: classes5.dex */
public final class C22065e extends AbstractC19962a implements InterfaceC22061a {

    /* renamed from: t */
    private final C25806c f108661t;

    /* renamed from: u */
    private final C24720a f108662u;

    /* renamed from: v */
    private int f108663v;

    /* renamed from: w */
    private boolean f108664w;

    /* renamed from: x */
    private String[] f108665x;

    /* renamed from: y */
    private final C26701b f108666y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l40.e$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C7924a f108668r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7924a c7924a) {
            super(1);
            this.f108668r = c7924a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m115208d(C22065e c22065e, C7924a c7924a) {
            AbstractC19074t.m100208f(c22065e, "this$0");
            AbstractC19074t.m100208f(c7924a, "$backupInfoServer");
            if (((InterfaceC22062b) c22065e.m103742Dp()).mo45894h0()) {
                c22065e.m115200Jp(c7924a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m115209e(C22065e c22065e, C7924a c7924a) {
            AbstractC19074t.m100208f(c22065e, "this$0");
            if (!((InterfaceC22062b) c22065e.m103742Dp()).mo45894h0()) {
                return;
            }
            AbstractC20110a.f98889a.mo104548a("get info success invalid", new Object[0]);
            c22065e.m115200Jp(c7924a);
        }

        /* renamed from: c */
        public final void m115210c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                final C7924a c7924a = new C7924a(jSONObject);
                if (c7924a.m40975d()) {
                    C22447s.m116065x0(jSONObject);
                    C26263i.m135055u().m135092z0(c7924a, jSONObject.toString());
                    InterfaceC22062b interfaceC22062b = (InterfaceC22062b) C22065e.this.m103742Dp();
                    final C22065e c22065e = C22065e.this;
                    interfaceC22062b.mo70710wy(new Runnable() { // from class: l40.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22065e.a.m115208d(C22065e.this, c7924a);
                        }
                    });
                } else {
                    InterfaceC22062b interfaceC22062b2 = (InterfaceC22062b) C22065e.this.m103742Dp();
                    final C22065e c22065e2 = C22065e.this;
                    final C7924a c7924a2 = this.f108668r;
                    interfaceC22062b2.mo70710wy(new Runnable() { // from class: l40.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22065e.a.m115209e(C22065e.this, c7924a2);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m115210c((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l40.e$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C7924a f108670r;

        /* renamed from: s */
        final /* synthetic */ boolean f108671s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7924a c7924a, boolean z11) {
            super(2);
            this.f108670r = c7924a;
            this.f108671s = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m115212c(C22065e c22065e, int i11, C7924a c7924a, boolean z11) {
            AbstractC19074t.m100208f(c22065e, "this$0");
            try {
                if (!((InterfaceC22062b) c22065e.m103742Dp()).mo45894h0()) {
                    return;
                }
                if (i11 == 1001) {
                    c22065e.m115200Jp(c7924a);
                    if (z11) {
                        C26220b.m134827j("updateBackupInfo - ErrorData - 1001", null, 2, null);
                    }
                } else {
                    c22065e.m115200Jp(c7924a);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* renamed from: b */
        public final void m115213b(final int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            InterfaceC22062b interfaceC22062b = (InterfaceC22062b) C22065e.this.m103742Dp();
            final C22065e c22065e = C22065e.this;
            final C7924a c7924a = this.f108670r;
            final boolean z11 = this.f108671s;
            interfaceC22062b.mo70710wy(new Runnable() { // from class: l40.f
                @Override // java.lang.Runnable
                public final void run() {
                    C22065e.b.m115212c(C22065e.this, i11, c7924a, z11);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m115213b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22065e(InterfaceC22062b interfaceC22062b, C25806c c25806c, C24720a c24720a) {
        super(interfaceC22062b);
        AbstractC19074t.m100208f(interfaceC22062b, "mvpView");
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        this.f108661t = c25806c;
        this.f108662u = c24720a;
        this.f108664w = true;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_backup_wifi_only);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_backup_wifi_3g);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f108665x = new String[]{m118743r0, m118743r02};
        this.f108666y = C26701b.Companion.m137270a();
        int i11 = !c25806c.m133024B() ? 1 : 0;
        this.f108663v = i11;
        interfaceC22062b.mo57161B(this.f108665x[i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jp */
    public final void m115200Jp(C7924a c7924a) {
        if (c7924a != null && c7924a.m40975d()) {
            C22447s.m116032f(c7924a.f42886u, this.f108666y);
        }
        ((InterfaceC22062b) m103742Dp()).mo57168So();
    }

    /* renamed from: Kp */
    private final boolean m115201Kp() {
        if (!this.f108662u.m128398O() || !C22447s.m116047m0(C26263i.m135058w(), false, 2, null)) {
            return false;
        }
        ((InterfaceC22062b) m103742Dp()).mo57165M();
        return true;
    }

    /* renamed from: Mp */
    private final int m115202Mp(boolean z11) {
        return z11 ? 1 : 0;
    }

    /* renamed from: Np */
    private final void m115203Np(boolean z11) {
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (!C22447s.m116017S(m135087t)) {
            this.f108661t.m133049i(new a(m135087t), new b(m135087t, z11));
        } else {
            AbstractC19074t.m100205c(m135087t);
            m115200Jp(m135087t);
        }
    }

    /* renamed from: Op */
    static /* synthetic */ void m115204Op(C22065e c22065e, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c22065e.m115203Np(z11);
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: F */
    public void mo115182F() {
        AbstractC26084s.m134268p(1, ((InterfaceC22062b) m103742Dp()).mo57167Ri(), true);
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: Hh */
    public void mo115183Hh(int i11) {
        this.f108661t.m133031K(i11);
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: K */
    public void mo115184K() {
        m115204Op(this, false, 1, null);
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: M */
    public void mo115185M() {
        try {
            if (this.f108663v != 0) {
                AbstractC23647d.m123897g("5580110");
            } else {
                AbstractC23647d.m123897g("5580109");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: N */
    public void mo115186N() {
        ((InterfaceC22062b) m103742Dp()).mo57166Q();
        AbstractC26084s.m134269q(0, 128);
        C0815e1.m2079N(128, 1, 0, 0, 0);
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: N4 */
    public boolean mo115187N4() {
        return this.f108662u.m128392I();
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: g0 */
    public void mo115188g0() {
        try {
            AbstractC23647d.m123897g("5580108");
            ((InterfaceC22062b) m103742Dp()).mo57164H(this.f108665x, this.f108663v);
            AbstractC26084s.m134269q(0, 60);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: je */
    public boolean mo115189je() {
        return this.f108661t.m133023A();
    }

    /* renamed from: lb */
    public boolean m115205lb() {
        if (AbstractC23306f.m120633X1().m89807v() && C0860a.Companion.m2473a().m2461l()) {
            return true;
        }
        return false;
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: m6 */
    public boolean mo115190m6() {
        return this.f108661t.m133023A();
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: o0 */
    public void mo115191o0() {
        ((InterfaceC22062b) m103742Dp()).mo57169U(m115202Mp(!this.f108664w));
        AbstractC23647d.m123897g("711300");
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: p */
    public void mo115192p() {
        m115200Jp(C26263i.m135055u().m135087t());
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: q0 */
    public boolean mo115193q0() {
        return C26263i.m135055u().m135071M();
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: r */
    public boolean mo115194r() {
        return this.f108662u.m128403T();
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: r0 */
    public boolean mo115195r0() {
        return C26263i.m135053s();
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: s0 */
    public void mo115196s0(int i11) {
        try {
            this.f108663v = i11;
            ((InterfaceC22062b) m103742Dp()).mo57161B(this.f108665x[i11]);
            if (i11 == 0) {
                AbstractC23647d.m123897g("5580109");
                this.f108661t.m133039T(true);
            } else {
                AbstractC23647d.m123897g("5580110");
                this.f108661t.m133039T(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: sh */
    public void mo115197sh(boolean z11) {
        this.f108661t.m133031K(z11 ? 1 : 0);
        ((InterfaceC22062b) m103742Dp()).mo57171kd(z11);
    }

    @Override // l40.InterfaceC22061a
    /* renamed from: za */
    public void mo115198za(boolean z11) {
        TargetBackupInfo targetBackupInfo;
        if (m115205lb() && C25727d.Companion.m132786i()) {
            return;
        }
        if (C26263i.m135053s()) {
            C7924a m135087t = C26263i.m135055u().m135087t();
            if (m135087t != null && (targetBackupInfo = m135087t.f42886u) != null) {
                if (targetBackupInfo.m40953i() == 1) {
                    ((InterfaceC22062b) m103742Dp()).mo57162F();
                    AbstractC23647d.m123897g("711301");
                    AbstractC23647d.m123897g("711309");
                } else if (!m115205lb() && !AbstractC3489d.m17512t()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_using_change_protect_code_for_normal_user));
                    C26220b.m134827j("Normal User can't be used this function!", null, 2, null);
                } else {
                    ((InterfaceC22062b) m103742Dp()).mo57163Gr();
                }
            }
        } else {
            this.f108664w = z11;
            if (!m115201Kp()) {
                mo115191o0();
            }
        }
        if (z11) {
            AbstractC26084s.m134269q(0, 112);
            C0815e1.m2079N(112, 1, 0, 0, 0);
        } else {
            C2556d.m12981o().m12990O("5", "");
        }
    }
}
