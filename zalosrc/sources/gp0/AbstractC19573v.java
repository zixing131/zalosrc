package gp0;

import bp0.AbstractC3082b0;
import ho0.AbstractC20110a;
import p097db.C17843b;
import p097db.EnumC17852k;
import ro0.AbstractRunnableC25943g;
import zm.voip.service.HandlerC32324p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gp0.v */
/* loaded from: classes7.dex */
public abstract class AbstractC19573v {

    /* renamed from: a */
    static String f97206a = "VoipSession";

    /* renamed from: gp0.v$a */
    /* loaded from: classes7.dex */
    class a extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ int f97207p;

        a(int i11) {
            this.f97207p = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            boolean z11;
            C17843b.m94137o().m94150M(EnumC17852k.CANCEL_TIMEOUT.ordinal());
            AbstractC19573v abstractC19573v = AbstractC19573v.this;
            if (this.f97207p == -4) {
                z11 = true;
            } else {
                z11 = false;
            }
            abstractC19573v.mo102242b(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m102335c(int i11, int i12, AbstractC19542f abstractC19542f) {
        try {
            if (abstractC19542f instanceof C19548i) {
                C19548i c19548i = (C19548i) abstractC19542f;
                if (i11 != c19548i.m102118a()) {
                    return false;
                }
                if (i12 != c19548i.m102119b()) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m102336d(int i11, AbstractC19542f abstractC19542f) {
        try {
            if (abstractC19542f instanceof C19548i) {
                if (i11 != ((C19548i) abstractC19542f).m102118a()) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m102337e(int i11, int i12, AbstractC19542f abstractC19542f) {
        try {
            if (abstractC19542f instanceof C19568s) {
                C19568s c19568s = (C19568s) abstractC19542f;
                if (i11 != c19568s.m102328c()) {
                    return false;
                }
                if (i12 != c19568s.m102330e()) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m102338f(int i11, AbstractC19542f abstractC19542f) {
        try {
            if (abstractC19542f instanceof C19568s) {
                if (i11 != ((C19568s) abstractC19542f).m102328c()) {
                    return false;
                }
                return true;
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m102339g(AbstractC19542f abstractC19542f) {
        if (abstractC19542f instanceof C19548i) {
            return AbstractC19571t0.m102333a(((C19548i) abstractC19542f).m102118a());
        }
        if (abstractC19542f instanceof C19568s) {
            return abstractC19542f.toString();
        }
        return abstractC19542f.toString();
    }

    /* renamed from: a */
    abstract void mo102239a();

    /* renamed from: b */
    abstract void mo102242b(boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo102340h(int i11, String str) {
        mo102239a();
        AbstractC3082b0.m15422d(f97206a, "OnError " + str);
        HandlerC32324p.m156351d(new a(i11));
    }
}
