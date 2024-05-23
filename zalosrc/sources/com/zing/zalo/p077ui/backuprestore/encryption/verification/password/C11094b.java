package com.zing.zalo.p077ui.backuprestore.encryption.verification.password;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.password.AbstractC11093a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.C19964c;
import p361nb.AbstractC23647d;
import p479rc.C25724a;
import pg0.C24747a;
import sc.C26220b;
import sg0.C26245a;
import si.C26263i;
import u40.C27030a;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.b */
/* loaded from: classes5.dex */
public final class C11094b extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C25724a f55883s;

    /* renamed from: t */
    private final C24747a f55884t;

    /* renamed from: u */
    private final C1761c0 f55885u;

    /* renamed from: v */
    private final C1761c0 f55886v;

    /* renamed from: w */
    private String f55887w;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C11094b(C25724a c25724a, C24747a c24747a) {
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        AbstractC19074t.m100208f(c24747a, "criticalCaseManager");
        this.f55883s = c25724a;
        this.f55884t = c24747a;
        this.f55885u = new C1761c0(new C27030a(false, false, false, 7, null));
        this.f55886v = new C1761c0(new C19964c(AbstractC11093a.c.f55880a));
        this.f55887w = "";
    }

    /* renamed from: N */
    private final C27030a m57886N() {
        C27030a c27030a = (C27030a) m57891Q().mo9215f();
        if (c27030a == null) {
            return new C27030a(false, false, false, 7, null);
        }
        return c27030a;
    }

    /* renamed from: V */
    private final boolean m57887V(String str) {
        if (str.length() == 0) {
            return false;
        }
        TargetBackupInfo targetBackupInfo = null;
        if (!this.f55883s.m132681W(str, 1)) {
            C26220b.m134826i("SMLPasswordVerificationViewModel", "verifyPasswordWithBackupInfo(): Not match!", null, 4, null);
            return false;
        }
        TargetBackupInfo m135058w = C26263i.m135058w();
        if (m135058w != null) {
            if (m135058w.m40954j() == 0) {
                targetBackupInfo = m135058w;
            }
            if (targetBackupInfo != null) {
                this.f55883s.m132678T(str);
            }
        }
        this.f55884t.m128513E(1, str);
        return true;
    }

    /* renamed from: M */
    public final void m57888M() {
        this.f55885u.mo9221n(C27030a.m139171b(m57886N(), false, false, true, 3, null));
        C26263i.m135055u().m135082n();
        AbstractC23647d.m123897g("5811300");
    }

    /* renamed from: O */
    public final String m57889O() {
        return this.f55887w;
    }

    /* renamed from: P */
    public final LiveData m57890P() {
        return this.f55886v;
    }

    /* renamed from: Q */
    public final LiveData m57891Q() {
        return this.f55885u;
    }

    /* renamed from: R */
    public final void m57892R(int i11) {
        if (i11 == AbstractC6918a0.btnContinue) {
            this.f55886v.mo9221n(new C19964c(AbstractC11093a.a.f55878a));
        } else if (i11 == AbstractC6918a0.btnForgotPassword) {
            this.f55886v.mo9221n(new C19964c(AbstractC11093a.b.f55879a));
        }
    }

    /* renamed from: S */
    public final void m57893S() {
        this.f55885u.mo9221n(C27030a.m139171b(m57886N(), false, false, false, 3, null));
        this.f55886v.mo9221n(new C19964c(AbstractC11093a.e.f55882a));
    }

    /* renamed from: T */
    public final void m57894T(String str) {
        boolean z11;
        AbstractC19074t.m100208f(str, "text");
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f55887w = str;
        this.f55885u.mo9221n(C27030a.m139171b(m57886N(), z11, false, false, 6, null));
    }

    /* renamed from: U */
    public final void m57895U(String str) {
        AbstractC19074t.m100208f(str, "currentInputPassword");
        C26220b.m134826i("SMLPasswordVerificationViewModel", "verifyPassword(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        if (m57887V(str)) {
            this.f55886v.mo9221n(new C19964c(AbstractC11093a.d.f55881a));
        } else {
            this.f55885u.mo9221n(C27030a.m139171b(m57886N(), false, true, false, 4, null));
        }
    }
}
