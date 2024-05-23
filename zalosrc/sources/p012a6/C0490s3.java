package p012a6;

import com.google.android.gms.common.internal.AbstractC4199m;

/* renamed from: a6.s3 */
/* loaded from: classes2.dex */
public final class C0490s3 {

    /* renamed from: a */
    private final EnumC0233ec f1871a;

    /* renamed from: b */
    private final Boolean f1872b;

    /* renamed from: c */
    private final Boolean f1873c;

    /* renamed from: d */
    private final C0479rb f1874d;

    /* renamed from: e */
    private final C0539ue f1875e;

    public /* synthetic */ C0490s3(C0452q3 c0452q3, AbstractC0471r3 abstractC0471r3) {
        EnumC0233ec enumC0233ec;
        Boolean bool;
        C0539ue c0539ue;
        enumC0233ec = c0452q3.f1795a;
        this.f1871a = enumC0233ec;
        this.f1872b = null;
        bool = c0452q3.f1796b;
        this.f1873c = bool;
        this.f1874d = null;
        c0539ue = c0452q3.f1797c;
        this.f1875e = c0539ue;
    }

    /* renamed from: a */
    public final EnumC0233ec m872a() {
        return this.f1871a;
    }

    /* renamed from: b */
    public final C0539ue m873b() {
        return this.f1875e;
    }

    /* renamed from: c */
    public final Boolean m874c() {
        return this.f1873c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0490s3)) {
            return false;
        }
        C0490s3 c0490s3 = (C0490s3) obj;
        if (AbstractC4199m.m19701a(this.f1871a, c0490s3.f1871a) && AbstractC4199m.m19701a(null, null) && AbstractC4199m.m19701a(this.f1873c, c0490s3.f1873c) && AbstractC4199m.m19701a(null, null) && AbstractC4199m.m19701a(this.f1875e, c0490s3.f1875e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f1871a, null, this.f1873c, null, this.f1875e);
    }
}
