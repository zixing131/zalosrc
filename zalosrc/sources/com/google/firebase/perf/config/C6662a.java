package com.google.firebase.perf.config;

import android.content.Context;
import p233i9.AbstractC20428a;
import p319l9.C22152a;
import p476r9.AbstractC25706n;
import p476r9.C25698f;
import p476r9.C25699g;

/* renamed from: com.google.firebase.perf.config.a */
/* loaded from: classes3.dex */
public class C6662a {

    /* renamed from: d */
    private static final C22152a f36782d = C22152a.m115524e();

    /* renamed from: e */
    private static volatile C6662a f36783e;

    /* renamed from: a */
    private final RemoteConfigManager f36784a;

    /* renamed from: b */
    private C25698f f36785b;

    /* renamed from: c */
    private C6685x f36786c;

    public C6662a(RemoteConfigManager remoteConfigManager, C25698f c25698f, C6685x c6685x) {
        this.f36784a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f36785b = c25698f == null ? new C25698f() : c25698f;
        this.f36786c = c6685x == null ? C6685x.m34120e() : c6685x;
    }

    /* renamed from: H */
    private boolean m34032H(long j11) {
        return j11 >= 0;
    }

    /* renamed from: I */
    private boolean m34033I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(AbstractC20428a.f100597b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    private boolean m34034J(long j11) {
        return j11 >= 0;
    }

    /* renamed from: L */
    private boolean m34035L(float f11) {
        return 0.0f <= f11 && f11 <= 1.0f;
    }

    /* renamed from: M */
    private boolean m34036M(long j11) {
        return j11 > 0;
    }

    /* renamed from: N */
    private boolean m34037N(long j11) {
        return j11 > 0;
    }

    /* renamed from: b */
    private C25699g m34038b(AbstractC6683v abstractC6683v) {
        return this.f36786c.m34122b(abstractC6683v.mo34078a());
    }

    /* renamed from: c */
    private C25699g m34039c(AbstractC6683v abstractC6683v) {
        return this.f36786c.m34123d(abstractC6683v.mo34078a());
    }

    /* renamed from: d */
    private C25699g m34040d(AbstractC6683v abstractC6683v) {
        return this.f36786c.m34124f(abstractC6683v.mo34078a());
    }

    /* renamed from: e */
    private C25699g m34041e(AbstractC6683v abstractC6683v) {
        return this.f36786c.m34125g(abstractC6683v.mo34078a());
    }

    /* renamed from: g */
    public static synchronized C6662a m34042g() {
        C6662a c6662a;
        synchronized (C6662a.class) {
            try {
                if (f36783e == null) {
                    f36783e = new C6662a(null, null, null);
                }
                c6662a = f36783e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6662a;
    }

    /* renamed from: k */
    private boolean m34043k() {
        C6673l m34098e = C6673l.m34098e();
        C25699g m34048u = m34048u(m34098e);
        if (m34048u.m132613d()) {
            if (this.f36784a.isLastFetchFailed()) {
                return false;
            }
            this.f36786c.m34130m(m34098e.mo34078a(), ((Boolean) m34048u.m132612c()).booleanValue());
            return ((Boolean) m34048u.m132612c()).booleanValue();
        }
        C25699g m34038b = m34038b(m34098e);
        if (m34038b.m132613d()) {
            return ((Boolean) m34038b.m132612c()).booleanValue();
        }
        return m34098e.m34099d().booleanValue();
    }

    /* renamed from: l */
    private boolean m34044l() {
        C6672k m34096e = C6672k.m34096e();
        C25699g m34051x = m34051x(m34096e);
        if (m34051x.m132613d()) {
            this.f36786c.m34129l(m34096e.mo34078a(), (String) m34051x.m132612c());
            return m34033I((String) m34051x.m132612c());
        }
        C25699g m34041e = m34041e(m34096e);
        if (m34041e.m132613d()) {
            return m34033I((String) m34041e.m132612c());
        }
        return m34033I(m34096e.m34097d());
    }

    /* renamed from: n */
    private C25699g m34045n(AbstractC6683v abstractC6683v) {
        return this.f36785b.m132606b(abstractC6683v.mo34075b());
    }

    /* renamed from: o */
    private C25699g m34046o(AbstractC6683v abstractC6683v) {
        return this.f36785b.m132607c(abstractC6683v.mo34075b());
    }

    /* renamed from: p */
    private C25699g m34047p(AbstractC6683v abstractC6683v) {
        return this.f36785b.m132608e(abstractC6683v.mo34075b());
    }

    /* renamed from: u */
    private C25699g m34048u(AbstractC6683v abstractC6683v) {
        return this.f36784a.getBoolean(abstractC6683v.mo34080c());
    }

    /* renamed from: v */
    private C25699g m34049v(AbstractC6683v abstractC6683v) {
        return this.f36784a.getFloat(abstractC6683v.mo34080c());
    }

    /* renamed from: w */
    private C25699g m34050w(AbstractC6683v abstractC6683v) {
        return this.f36784a.getLong(abstractC6683v.mo34080c());
    }

    /* renamed from: x */
    private C25699g m34051x(AbstractC6683v abstractC6683v) {
        return this.f36784a.getString(abstractC6683v.mo34080c());
    }

    /* renamed from: A */
    public long m34052A() {
        C6676o m34104e = C6676o.m34104e();
        C25699g m34047p = m34047p(m34104e);
        if (m34047p.m132613d() && m34036M(((Long) m34047p.m132612c()).longValue())) {
            return ((Long) m34047p.m132612c()).longValue();
        }
        C25699g m34050w = m34050w(m34104e);
        if (m34050w.m132613d() && m34036M(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34104e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34104e);
        if (m34040d.m132613d() && m34036M(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34104e.m34105d().longValue();
    }

    /* renamed from: B */
    public long m34053B() {
        C6677p m34106e = C6677p.m34106e();
        C25699g m34047p = m34047p(m34106e);
        if (m34047p.m132613d() && m34034J(((Long) m34047p.m132612c()).longValue())) {
            return ((Long) m34047p.m132612c()).longValue();
        }
        C25699g m34050w = m34050w(m34106e);
        if (m34050w.m132613d() && m34034J(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34106e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34106e);
        if (m34040d.m132613d() && m34034J(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34106e.m34107d().longValue();
    }

    /* renamed from: C */
    public long m34054C() {
        C6678q m34108e = C6678q.m34108e();
        C25699g m34047p = m34047p(m34108e);
        if (m34047p.m132613d() && m34034J(((Long) m34047p.m132612c()).longValue())) {
            return ((Long) m34047p.m132612c()).longValue();
        }
        C25699g m34050w = m34050w(m34108e);
        if (m34050w.m132613d() && m34034J(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34108e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34108e);
        if (m34040d.m132613d() && m34034J(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34108e.m34109d().longValue();
    }

    /* renamed from: D */
    public float m34055D() {
        C6679r m34110e = C6679r.m34110e();
        C25699g m34046o = m34046o(m34110e);
        if (m34046o.m132613d()) {
            float floatValue = ((Float) m34046o.m132612c()).floatValue() / 100.0f;
            if (m34035L(floatValue)) {
                return floatValue;
            }
        }
        C25699g m34049v = m34049v(m34110e);
        if (m34049v.m132613d() && m34035L(((Float) m34049v.m132612c()).floatValue())) {
            this.f36786c.m34127j(m34110e.mo34078a(), ((Float) m34049v.m132612c()).floatValue());
            return ((Float) m34049v.m132612c()).floatValue();
        }
        C25699g m34039c = m34039c(m34110e);
        if (m34039c.m132613d() && m34035L(((Float) m34039c.m132612c()).floatValue())) {
            return ((Float) m34039c.m132612c()).floatValue();
        }
        return m34110e.m34111d().floatValue();
    }

    /* renamed from: E */
    public long m34056E() {
        C6680s m34112e = C6680s.m34112e();
        C25699g m34050w = m34050w(m34112e);
        if (m34050w.m132613d() && m34032H(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34112e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34112e);
        if (m34040d.m132613d() && m34032H(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34112e.m34113d().longValue();
    }

    /* renamed from: F */
    public long m34057F() {
        C6681t m34114e = C6681t.m34114e();
        C25699g m34050w = m34050w(m34114e);
        if (m34050w.m132613d() && m34032H(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34114e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34114e);
        if (m34040d.m132613d() && m34032H(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34114e.m34115d().longValue();
    }

    /* renamed from: G */
    public float m34058G() {
        C6682u m34116e = C6682u.m34116e();
        C25699g m34049v = m34049v(m34116e);
        if (m34049v.m132613d() && m34035L(((Float) m34049v.m132612c()).floatValue())) {
            this.f36786c.m34127j(m34116e.mo34078a(), ((Float) m34049v.m132612c()).floatValue());
            return ((Float) m34049v.m132612c()).floatValue();
        }
        C25699g m34039c = m34039c(m34116e);
        if (m34039c.m132613d() && m34035L(((Float) m34039c.m132612c()).floatValue())) {
            return ((Float) m34039c.m132612c()).floatValue();
        }
        return m34116e.m34117d().floatValue();
    }

    /* renamed from: K */
    public boolean m34059K() {
        Boolean m34066j = m34066j();
        if ((m34066j == null || m34066j.booleanValue()) && m34067m()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public void m34060O(Context context) {
        f36782d.m115532i(AbstractC25706n.m132621b(context));
        this.f36786c.m34126i(context);
    }

    /* renamed from: P */
    public void m34061P(C25698f c25698f) {
        this.f36785b = c25698f;
    }

    /* renamed from: a */
    public String m34062a() {
        String m34085f;
        C6667f m34084e = C6667f.m34084e();
        if (AbstractC20428a.f100596a.booleanValue()) {
            return m34084e.m34087d();
        }
        String mo34080c = m34084e.mo34080c();
        long j11 = -1;
        if (mo34080c != null) {
            j11 = ((Long) this.f36784a.getRemoteConfigValueOrDefault(mo34080c, -1L)).longValue();
        }
        String mo34078a = m34084e.mo34078a();
        if (C6667f.m34086g(j11) && (m34085f = C6667f.m34085f(j11)) != null) {
            this.f36786c.m34129l(mo34078a, m34085f);
            return m34085f;
        }
        C25699g m34041e = m34041e(m34084e);
        if (m34041e.m132613d()) {
            return (String) m34041e.m132612c();
        }
        return m34084e.m34087d();
    }

    /* renamed from: f */
    public float m34063f() {
        C6666e m34082e = C6666e.m34082e();
        C25699g m34046o = m34046o(m34082e);
        if (m34046o.m132613d()) {
            float floatValue = ((Float) m34046o.m132612c()).floatValue() / 100.0f;
            if (m34035L(floatValue)) {
                return floatValue;
            }
        }
        C25699g m34049v = m34049v(m34082e);
        if (m34049v.m132613d() && m34035L(((Float) m34049v.m132612c()).floatValue())) {
            this.f36786c.m34127j(m34082e.mo34078a(), ((Float) m34049v.m132612c()).floatValue());
            return ((Float) m34049v.m132612c()).floatValue();
        }
        C25699g m34039c = m34039c(m34082e);
        if (m34039c.m132613d() && m34035L(((Float) m34039c.m132612c()).floatValue())) {
            return ((Float) m34039c.m132612c()).floatValue();
        }
        return m34082e.m34083d().floatValue();
    }

    /* renamed from: h */
    public boolean m34064h() {
        C6665d m34079e = C6665d.m34079e();
        C25699g m34045n = m34045n(m34079e);
        if (m34045n.m132613d()) {
            return ((Boolean) m34045n.m132612c()).booleanValue();
        }
        C25699g m34048u = m34048u(m34079e);
        if (m34048u.m132613d()) {
            this.f36786c.m34130m(m34079e.mo34078a(), ((Boolean) m34048u.m132612c()).booleanValue());
            return ((Boolean) m34048u.m132612c()).booleanValue();
        }
        C25699g m34038b = m34038b(m34079e);
        if (m34038b.m132613d()) {
            return ((Boolean) m34038b.m132612c()).booleanValue();
        }
        return m34079e.m34081d().booleanValue();
    }

    /* renamed from: i */
    public Boolean m34065i() {
        C6663b m34074e = C6663b.m34074e();
        C25699g m34045n = m34045n(m34074e);
        if (m34045n.m132613d()) {
            return (Boolean) m34045n.m132612c();
        }
        return m34074e.m34076d();
    }

    /* renamed from: j */
    public Boolean m34066j() {
        if (m34065i().booleanValue()) {
            return Boolean.FALSE;
        }
        C6664c m34077d = C6664c.m34077d();
        C25699g m34038b = m34038b(m34077d);
        if (m34038b.m132613d()) {
            return (Boolean) m34038b.m132612c();
        }
        C25699g m34045n = m34045n(m34077d);
        if (m34045n.m132613d()) {
            return (Boolean) m34045n.m132612c();
        }
        return null;
    }

    /* renamed from: m */
    public boolean m34067m() {
        if (m34043k() && !m34044l()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public long m34068q() {
        C6668g m34088e = C6668g.m34088e();
        C25699g m34050w = m34050w(m34088e);
        if (m34050w.m132613d() && m34032H(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34088e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34088e);
        if (m34040d.m132613d() && m34032H(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34088e.m34089d().longValue();
    }

    /* renamed from: r */
    public long m34069r() {
        C6669h m34090e = C6669h.m34090e();
        C25699g m34050w = m34050w(m34090e);
        if (m34050w.m132613d() && m34032H(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34090e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34090e);
        if (m34040d.m132613d() && m34032H(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34090e.m34091d().longValue();
    }

    /* renamed from: s */
    public float m34070s() {
        C6670i m34092e = C6670i.m34092e();
        C25699g m34049v = m34049v(m34092e);
        if (m34049v.m132613d() && m34035L(((Float) m34049v.m132612c()).floatValue())) {
            this.f36786c.m34127j(m34092e.mo34078a(), ((Float) m34049v.m132612c()).floatValue());
            return ((Float) m34049v.m132612c()).floatValue();
        }
        C25699g m34039c = m34039c(m34092e);
        if (m34039c.m132613d() && m34035L(((Float) m34039c.m132612c()).floatValue())) {
            return ((Float) m34039c.m132612c()).floatValue();
        }
        return m34092e.m34093d().floatValue();
    }

    /* renamed from: t */
    public long m34071t() {
        C6671j m34094e = C6671j.m34094e();
        C25699g m34050w = m34050w(m34094e);
        if (m34050w.m132613d() && m34037N(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34094e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34094e);
        if (m34040d.m132613d() && m34037N(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34094e.m34095d().longValue();
    }

    /* renamed from: y */
    public long m34072y() {
        C6674m m34100e = C6674m.m34100e();
        C25699g m34047p = m34047p(m34100e);
        if (m34047p.m132613d() && m34034J(((Long) m34047p.m132612c()).longValue())) {
            return ((Long) m34047p.m132612c()).longValue();
        }
        C25699g m34050w = m34050w(m34100e);
        if (m34050w.m132613d() && m34034J(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34100e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34100e);
        if (m34040d.m132613d() && m34034J(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34100e.m34101d().longValue();
    }

    /* renamed from: z */
    public long m34073z() {
        C6675n m34102e = C6675n.m34102e();
        C25699g m34047p = m34047p(m34102e);
        if (m34047p.m132613d() && m34034J(((Long) m34047p.m132612c()).longValue())) {
            return ((Long) m34047p.m132612c()).longValue();
        }
        C25699g m34050w = m34050w(m34102e);
        if (m34050w.m132613d() && m34034J(((Long) m34050w.m132612c()).longValue())) {
            this.f36786c.m34128k(m34102e.mo34078a(), ((Long) m34050w.m132612c()).longValue());
            return ((Long) m34050w.m132612c()).longValue();
        }
        C25699g m34040d = m34040d(m34102e);
        if (m34040d.m132613d() && m34034J(((Long) m34040d.m132612c()).longValue())) {
            return ((Long) m34040d.m132612c()).longValue();
        }
        return m34102e.m34103d().longValue();
    }
}
