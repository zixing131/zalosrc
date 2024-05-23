package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.e1 */
/* loaded from: classes2.dex */
public final class C3896e1 {

    /* renamed from: a */
    private boolean f15496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3896e1(AbstractC3892d1 abstractC3892d1) {
    }

    /* renamed from: a */
    public final C3896e1 m18542a() {
        this.f15496a = true;
        return this;
    }

    /* renamed from: b */
    public final C3904g1 m18543b() {
        if (this.f15496a) {
            return new C3904g1(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
