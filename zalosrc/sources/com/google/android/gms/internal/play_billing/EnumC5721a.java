package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.a */
/* loaded from: classes2.dex */
public enum EnumC5721a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* renamed from: F */
    private static final AbstractC5784k f33218F;

    /* renamed from: p */
    private final int f33230p;

    static {
        C5778j c5778j = new C5778j();
        for (EnumC5721a enumC5721a : values()) {
            c5778j.m30298a(Integer.valueOf(enumC5721a.f33230p), enumC5721a);
        }
        f33218F = c5778j.m30299b();
    }

    EnumC5721a(int i11) {
        this.f33230p = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static EnumC5721a m30153b(int i11) {
        AbstractC5784k abstractC5784k = f33218F;
        Integer valueOf = Integer.valueOf(i11);
        if (!abstractC5784k.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (EnumC5721a) abstractC5784k.get(valueOf);
    }
}
