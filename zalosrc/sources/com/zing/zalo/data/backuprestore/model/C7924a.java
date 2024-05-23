package com.zing.zalo.data.backuprestore.model;

import android.text.TextUtils;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p320ld.AbstractC22431c;
import p348mi.AbstractC23309i;

/* renamed from: com.zing.zalo.data.backuprestore.model.a */
/* loaded from: classes3.dex */
public final class C7924a implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private int f42881p;

    /* renamed from: q */
    private long f42882q;

    /* renamed from: r */
    private TargetBackupInfo f42883r;

    /* renamed from: s */
    private TargetBackupInfo f42884s;

    /* renamed from: t */
    private TargetBackupInfo f42885t;

    /* renamed from: u */
    public TargetBackupInfo f42886u;

    /* renamed from: com.zing.zalo.data.backuprestore.model.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7924a m40980a() {
            try {
                String m121291P = AbstractC23309i.m121291P();
                if (TextUtils.isEmpty(m121291P)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(m121291P);
                C7924a c7924a = new C7924a();
                c7924a.m40973f(jSONObject);
                c7924a.m40977g(0);
                return c7924a;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }

        /* renamed from: b */
        public final boolean m40981b(TargetBackupInfo targetBackupInfo) {
            if (targetBackupInfo != null && targetBackupInfo.isValid()) {
                return true;
            }
            return false;
        }
    }

    public C7924a() {
        this.f42882q = -1L;
    }

    /* renamed from: b */
    public static final C7924a m40972b() {
        return Companion.m40980a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m40973f(JSONObject jSONObject) {
        this.f42882q = jSONObject.optLong("server_time", -1L);
        TargetBackupInfo.C7923b c7923b = TargetBackupInfo.Companion;
        TargetBackupInfo m40970a = c7923b.m40970a(jSONObject);
        this.f42883r = m40970a;
        AbstractC19074t.m100205c(m40970a);
        if (m40970a.isValid()) {
            TargetBackupInfo targetBackupInfo = this.f42883r;
            AbstractC19074t.m100205c(targetBackupInfo);
            targetBackupInfo.m40967z(1);
        }
        if (jSONObject.has("other")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("other");
                AbstractC19074t.m100205c(jSONObject2);
                this.f42884s = c7923b.m40970a(jSONObject2);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        if (jSONObject.has("cross")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("cross");
                TargetBackupInfo.C7923b c7923b2 = TargetBackupInfo.Companion;
                AbstractC19074t.m100205c(jSONObject3);
                TargetBackupInfo m40970a2 = c7923b2.m40970a(jSONObject3);
                this.f42885t = m40970a2;
                if (this.f42883r != null) {
                    AbstractC19074t.m100205c(m40970a2);
                    TargetBackupInfo targetBackupInfo2 = this.f42883r;
                    AbstractC19074t.m100205c(targetBackupInfo2);
                    m40970a2.m40942B(targetBackupInfo2.m40959o());
                    TargetBackupInfo targetBackupInfo3 = this.f42885t;
                    AbstractC19074t.m100205c(targetBackupInfo3);
                    TargetBackupInfo targetBackupInfo4 = this.f42883r;
                    AbstractC19074t.m100205c(targetBackupInfo4);
                    targetBackupInfo3.m40943C(targetBackupInfo4.m40962t());
                    TargetBackupInfo targetBackupInfo5 = this.f42885t;
                    AbstractC19074t.m100205c(targetBackupInfo5);
                    TargetBackupInfo targetBackupInfo6 = this.f42883r;
                    AbstractC19074t.m100205c(targetBackupInfo6);
                    targetBackupInfo5.m40966y(targetBackupInfo6.m40947c());
                    TargetBackupInfo targetBackupInfo7 = this.f42885t;
                    AbstractC19074t.m100205c(targetBackupInfo7);
                    TargetBackupInfo targetBackupInfo8 = this.f42883r;
                    AbstractC19074t.m100205c(targetBackupInfo8);
                    targetBackupInfo7.m40965x(targetBackupInfo8.m40946b());
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                this.f42885t = null;
            }
        } else {
            this.f42885t = null;
        }
        m40978h();
    }

    /* renamed from: c */
    public final int m40974c() {
        return this.f42881p;
    }

    /* renamed from: d */
    public final boolean m40975d() {
        return Companion.m40981b(this.f42886u);
    }

    /* renamed from: e */
    public final boolean m40976e() {
        if (Companion.m40981b(this.f42886u)) {
            TargetBackupInfo targetBackupInfo = this.f42886u;
            AbstractC19074t.m100205c(targetBackupInfo);
            if (AbstractC22431c.m115870a(targetBackupInfo)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m40977g(int i11) {
        this.f42881p = i11;
    }

    /* renamed from: h */
    public final TargetBackupInfo m40978h() {
        TargetBackupInfo targetBackupInfo;
        a aVar = Companion;
        if (aVar.m40981b(this.f42885t)) {
            this.f42886u = this.f42885t;
        } else if (aVar.m40981b(this.f42883r) && aVar.m40981b(this.f42884s)) {
            TargetBackupInfo targetBackupInfo2 = this.f42883r;
            AbstractC19074t.m100205c(targetBackupInfo2);
            long m40950f = targetBackupInfo2.m40950f();
            TargetBackupInfo targetBackupInfo3 = this.f42884s;
            AbstractC19074t.m100205c(targetBackupInfo3);
            if (m40950f >= targetBackupInfo3.m40950f()) {
                targetBackupInfo = this.f42883r;
            } else {
                targetBackupInfo = this.f42884s;
            }
            this.f42886u = targetBackupInfo;
        } else if (aVar.m40981b(this.f42883r)) {
            this.f42886u = this.f42883r;
        } else if (aVar.m40981b(this.f42884s)) {
            this.f42886u = this.f42884s;
        }
        return this.f42886u;
    }

    /* renamed from: i */
    public final void m40979i(String str, long j11, long j12) {
        TargetBackupInfo targetBackupInfo = this.f42885t;
        if (targetBackupInfo != null) {
            AbstractC19074t.m100205c(targetBackupInfo);
            AbstractC19074t.m100205c(str);
            targetBackupInfo.m40942B(str);
            TargetBackupInfo targetBackupInfo2 = this.f42885t;
            AbstractC19074t.m100205c(targetBackupInfo2);
            targetBackupInfo2.m40943C(j11);
            TargetBackupInfo targetBackupInfo3 = this.f42885t;
            AbstractC19074t.m100205c(targetBackupInfo3);
            targetBackupInfo3.m40966y(j12);
        }
        TargetBackupInfo targetBackupInfo4 = this.f42883r;
        if (targetBackupInfo4 != null) {
            AbstractC19074t.m100205c(targetBackupInfo4);
            AbstractC19074t.m100205c(str);
            targetBackupInfo4.m40942B(str);
            TargetBackupInfo targetBackupInfo5 = this.f42883r;
            AbstractC19074t.m100205c(targetBackupInfo5);
            targetBackupInfo5.m40943C(j11);
            TargetBackupInfo targetBackupInfo6 = this.f42883r;
            AbstractC19074t.m100205c(targetBackupInfo6);
            targetBackupInfo6.m40966y(j12);
        }
        TargetBackupInfo targetBackupInfo7 = this.f42884s;
        if (targetBackupInfo7 != null) {
            AbstractC19074t.m100205c(targetBackupInfo7);
            AbstractC19074t.m100205c(str);
            targetBackupInfo7.m40942B(str);
            TargetBackupInfo targetBackupInfo8 = this.f42884s;
            AbstractC19074t.m100205c(targetBackupInfo8);
            targetBackupInfo8.m40943C(j11);
            TargetBackupInfo targetBackupInfo9 = this.f42884s;
            AbstractC19074t.m100205c(targetBackupInfo9);
            targetBackupInfo9.m40966y(j12);
        }
    }

    public C7924a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f42882q = -1L;
        m40973f(jSONObject);
        this.f42881p = 1;
        AbstractC20887g.m109217D(18844, null, 2, null);
    }
}
