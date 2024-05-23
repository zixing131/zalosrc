package gq;

/* renamed from: gq.k */
/* loaded from: classes4.dex */
public abstract class AbstractC19588k {
    /* renamed from: d */
    public abstract int mo40517d();

    /* renamed from: e */
    public abstract int mo40518e();

    /* renamed from: g */
    public final boolean m102533g() {
        if (!m102534h() && mo40518e() - mo40517d() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m102534h() {
        if (Math.abs(mo40517d() - mo40518e()) <= 20) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m102535i() {
        if (!m102534h() && mo40518e() - mo40517d() < 0) {
            return true;
        }
        return false;
    }
}
