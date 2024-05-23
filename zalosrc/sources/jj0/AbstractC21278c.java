package jj0;

/* renamed from: jj0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC21278c {
    /* renamed from: a */
    public static final EnumC21277b m110219a(int i11) {
        if (i11 != -2) {
            if (i11 != -1) {
                if (i11 != 12) {
                    switch (i11) {
                        case 1:
                            return EnumC21277b.USER_CANCELED;
                        case 2:
                            return EnumC21277b.GOOGLE_ERR_SERVICE_UNAVAILABLE;
                        case 3:
                            return EnumC21277b.GOOGLE_ERR_BILLING_UNAVAILABLE;
                        case 4:
                            return EnumC21277b.GOOGLE_ERR_ITEM_UNAVAILABLE;
                        case 5:
                            return EnumC21277b.GOOGLE_ERR_DEVELOPER_ERROR;
                        case 6:
                            return EnumC21277b.GOOGLE_ERR_ERROR;
                        case 7:
                            return EnumC21277b.ITEM_ALREADY_OWNED;
                        case 8:
                            return EnumC21277b.GOOGLE_ERR_ITEM_NOT_OWNED;
                        default:
                            return EnumC21277b.GOOGLE_ERR;
                    }
                }
                return EnumC21277b.GOOGLE_ERR_NETWORK_ERROR;
            }
            return EnumC21277b.GOOGLE_ERR_SERVICE_DISCONNECTED;
        }
        return EnumC21277b.GOOGLE_ERR_FEATURE_NOT_SUPPORTED;
    }
}
