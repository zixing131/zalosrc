package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.c0 */
/* loaded from: classes3.dex */
final class C6475c0 extends AbstractC6476d {

    /* renamed from: a */
    private final int f36277a;

    /* renamed from: b */
    private final boolean f36278b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6475c0(int i11, boolean z11, AbstractC6473b0 abstractC6473b0) {
        this.f36277a = i11;
        this.f36278b = z11;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC6476d
    /* renamed from: a */
    public final boolean mo33342a() {
        return this.f36278b;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC6476d
    /* renamed from: b */
    public final int mo33343b() {
        return this.f36277a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6476d) {
            AbstractC6476d abstractC6476d = (AbstractC6476d) obj;
            if (this.f36277a == abstractC6476d.mo33343b() && this.f36278b == abstractC6476d.mo33342a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36277a ^ 1000003) * 1000003) ^ (true != this.f36278b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f36277a + ", allowAssetPackDeletion=" + this.f36278b + "}";
    }
}
