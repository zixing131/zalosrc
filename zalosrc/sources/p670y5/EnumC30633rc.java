package p670y5;

/* renamed from: y5.rc */
/* loaded from: classes2.dex */
public enum EnumC30633rc implements InterfaceC30471j2 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);


    /* renamed from: p */
    private final int f141757p;

    EnumC30633rc(int i11) {
        this.f141757p = i11;
    }

    @Override // p670y5.InterfaceC30471j2
    public final int zza() {
        return this.f141757p;
    }
}
