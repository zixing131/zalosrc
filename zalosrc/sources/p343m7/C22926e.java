package p343m7;

import java.util.Map;

/* renamed from: m7.e */
/* loaded from: classes3.dex */
final class C22926e extends AbstractC22943v {

    /* renamed from: b */
    private final Integer f111593b;

    /* renamed from: c */
    private final Map f111594c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C22926e(Integer num, Map map, AbstractC22925d abstractC22925d) {
        this.f111593b = num;
        this.f111594c = map;
    }

    @Override // p343m7.AbstractC22943v
    /* renamed from: a */
    public final Integer mo117656a() {
        return this.f111593b;
    }

    @Override // p343m7.AbstractC22943v
    /* renamed from: b */
    public final Map mo117657b() {
        return this.f111594c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22943v) {
            AbstractC22943v abstractC22943v = (AbstractC22943v) obj;
            Integer num = this.f111593b;
            if (num != null ? num.equals(abstractC22943v.mo117656a()) : abstractC22943v.mo117656a() == null) {
                if (this.f111594c.equals(abstractC22943v.mo117657b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f111593b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.f111594c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f111593b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f111594c) + "}";
    }
}
