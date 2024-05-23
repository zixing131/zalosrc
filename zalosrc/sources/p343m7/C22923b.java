package p343m7;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m7.b */
/* loaded from: classes3.dex */
public final class C22923b extends AbstractC22942u {

    /* renamed from: a */
    private Integer f111588a;

    /* renamed from: b */
    private Map f111589b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p343m7.AbstractC22942u
    /* renamed from: a */
    public final AbstractC22942u mo117647a(int i11) {
        this.f111588a = Integer.valueOf(i11);
        return this;
    }

    @Override // p343m7.AbstractC22942u
    /* renamed from: b */
    public final AbstractC22942u mo117648b(Map map) {
        if (map != null) {
            this.f111589b = map;
            return this;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }

    @Override // p343m7.AbstractC22942u
    /* renamed from: c */
    final AbstractC22943v mo117649c() {
        if (this.f111589b != null) {
            return new C22926e(this.f111588a, this.f111589b, null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p343m7.AbstractC22942u
    /* renamed from: d */
    public final Map mo117650d() {
        Map map = this.f111589b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
