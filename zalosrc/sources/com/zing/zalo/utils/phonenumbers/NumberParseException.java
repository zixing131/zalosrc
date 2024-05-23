package com.zing.zalo.utils.phonenumbers;

/* loaded from: classes4.dex */
public class NumberParseException extends Exception {

    /* renamed from: p */
    private final EnumC16740a f84909p;

    /* renamed from: q */
    private final String f84910q;

    /* renamed from: com.zing.zalo.utils.phonenumbers.NumberParseException$a */
    /* loaded from: classes4.dex */
    public enum EnumC16740a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(EnumC16740a enumC16740a, String str) {
        super(str);
        this.f84910q = str;
        this.f84909p = enumC16740a;
    }

    /* renamed from: a */
    public EnumC16740a m89298a() {
        return this.f84909p;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "Error type: " + this.f84909p + ". " + this.f84910q;
    }
}
