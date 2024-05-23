package p012a6;

/* renamed from: a6.se */
/* loaded from: classes2.dex */
public enum EnumC0501se implements InterfaceC0147a2 {
    TYPE_UNKNOWN(0),
    LATIN(1),
    LATIN_AND_CHINESE(2),
    LATIN_AND_DEVANAGARI(3),
    LATIN_AND_JAPANESE(4),
    LATIN_AND_KOREAN(5),
    CREDIT_CARD(6),
    DOCUMENT(7);


    /* renamed from: p */
    private final int f1911p;

    EnumC0501se(int i11) {
        this.f1911p = i11;
    }

    @Override // p012a6.InterfaceC0147a2
    public final int zza() {
        return this.f1911p;
    }
}
