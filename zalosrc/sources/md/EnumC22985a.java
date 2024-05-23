package md;

import fn0.AbstractC19060k;

/* renamed from: md.a */
/* loaded from: classes.dex */
public enum EnumC22985a {
    QR_CODE(0),
    AZTEC(1),
    PDF417(2),
    DATA_MATRIX(3),
    UPC_A(4),
    UPC_E(5),
    EAN_8(6),
    EAN_13(7),
    CODE_39(8),
    CODE_93(9),
    CODE_128(10),
    ITF(11),
    CODABAR(12);

    public static final a Companion = new a(null);

    /* renamed from: p */
    private final int f111774p;

    /* renamed from: md.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC22985a m117750a(int i11) {
            for (EnumC22985a enumC22985a : EnumC22985a.values()) {
                if (enumC22985a.m117749c() == i11) {
                    return enumC22985a;
                }
            }
            return null;
        }
    }

    EnumC22985a(int i11) {
        this.f111774p = i11;
    }

    /* renamed from: c */
    public final int m117749c() {
        return this.f111774p;
    }
}
