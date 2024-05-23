package p232i8;

/* renamed from: i8.t */
/* loaded from: classes.dex */
public enum EnumC20419t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: p */
    private final int f100572p;

    EnumC20419t(int i11) {
        this.f100572p = i11;
    }

    /* renamed from: b */
    public static EnumC20419t m106412b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: c */
    public int m106413c() {
        return this.f100572p;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f100572p);
    }
}
