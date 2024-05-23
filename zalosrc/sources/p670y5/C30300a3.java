package p670y5;

import com.google.android.gms.common.internal.AbstractC4199m;

/* renamed from: y5.a3 */
/* loaded from: classes2.dex */
public final class C30300a3 {

    /* renamed from: a */
    private final EnumC30386ec f140678a;

    /* renamed from: c */
    private final Boolean f140680c;

    /* renamed from: e */
    private final C30731wf f140682e;

    /* renamed from: f */
    private final AbstractC30375e1 f140683f;

    /* renamed from: g */
    private final AbstractC30375e1 f140684g;

    /* renamed from: b */
    private final Boolean f140679b = null;

    /* renamed from: d */
    private final C30632rb f140681d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C30300a3(C30756y2 c30756y2, AbstractC30775z2 abstractC30775z2) {
        this.f140678a = C30756y2.m149702i(c30756y2);
        this.f140680c = C30756y2.m149704k(c30756y2);
        this.f140682e = C30756y2.m149703j(c30756y2);
        this.f140683f = C30756y2.m149700a(c30756y2);
        this.f140684g = C30756y2.m149701b(c30756y2);
    }

    /* renamed from: a */
    public final AbstractC30375e1 m149442a() {
        return this.f140683f;
    }

    /* renamed from: b */
    public final AbstractC30375e1 m149443b() {
        return this.f140684g;
    }

    /* renamed from: c */
    public final EnumC30386ec m149444c() {
        return this.f140678a;
    }

    /* renamed from: d */
    public final C30731wf m149445d() {
        return this.f140682e;
    }

    /* renamed from: e */
    public final Boolean m149446e() {
        return this.f140680c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30300a3)) {
            return false;
        }
        C30300a3 c30300a3 = (C30300a3) obj;
        if (AbstractC4199m.m19701a(this.f140678a, c30300a3.f140678a) && AbstractC4199m.m19701a(null, null) && AbstractC4199m.m19701a(this.f140680c, c30300a3.f140680c) && AbstractC4199m.m19701a(null, null) && AbstractC4199m.m19701a(this.f140682e, c30300a3.f140682e) && AbstractC4199m.m19701a(this.f140683f, c30300a3.f140683f) && AbstractC4199m.m19701a(this.f140684g, c30300a3.f140684g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f140678a, null, this.f140680c, null, this.f140682e, this.f140683f, this.f140684g);
    }
}
