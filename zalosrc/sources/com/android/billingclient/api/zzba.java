package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzba implements InterfaceC3886c, InterfaceC3902g, InterfaceC3925m, InterfaceC3946t, InterfaceC3949u {

    /* renamed from: a */
    private final long f15687a;

    public static native void nativeOnAcknowledgePurchaseResponse(int i11, String str, long j11);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i11, String str, long j11);

    public static native void nativeOnConsumePurchaseResponse(int i11, String str, String str2, long j11);

    public static native void nativeOnPriceChangeConfirmationResult(int i11, String str, long j11);

    public static native void nativeOnPurchaseHistoryResponse(int i11, String str, AbstractC3943s[] abstractC3943sArr, long j11);

    public static native void nativeOnPurchasesUpdated(int i11, String str, C3940r[] c3940rArr);

    public static native void nativeOnQueryPurchasesResponse(int i11, String str, C3940r[] c3940rArr, long j11);

    public static native void nativeOnSkuDetailsResponse(int i11, String str, AbstractC3958x[] abstractC3958xArr, long j11);

    @Override // com.android.billingclient.api.InterfaceC3946t
    /* renamed from: a */
    public final void mo18699a(C3918k c3918k, List list) {
        nativeOnQueryPurchasesResponse(c3918k.m18652b(), c3918k.m18651a(), (C3940r[]) list.toArray(new C3940r[list.size()]), this.f15687a);
    }

    @Override // com.android.billingclient.api.InterfaceC3949u
    /* renamed from: b */
    public final void mo18700b(C3918k c3918k, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(c3918k.m18652b(), c3918k.m18651a(), (C3940r[]) list.toArray(new C3940r[list.size()]));
    }

    @Override // com.android.billingclient.api.InterfaceC3902g
    /* renamed from: c */
    public final void mo18592c(C3918k c3918k) {
        nativeOnBillingSetupFinished(c3918k.m18652b(), c3918k.m18651a(), this.f15687a);
    }

    @Override // com.android.billingclient.api.InterfaceC3902g
    /* renamed from: d */
    public final void mo18593d() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // com.android.billingclient.api.InterfaceC3886c
    /* renamed from: e */
    public final void mo18527e(C3918k c3918k) {
        nativeOnAcknowledgePurchaseResponse(c3918k.m18652b(), c3918k.m18651a(), this.f15687a);
    }

    @Override // com.android.billingclient.api.InterfaceC3925m
    /* renamed from: f */
    public final void mo18661f(C3918k c3918k, String str) {
        nativeOnConsumePurchaseResponse(c3918k.m18652b(), c3918k.m18651a(), str, this.f15687a);
    }
}
