package p230i6;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: i6.b */
/* loaded from: classes.dex */
public final class C20307b {

    /* renamed from: b */
    public static final C20307b f100288b = new C20307b(null, null);

    /* renamed from: a */
    private final EnumMap f100289a;

    public C20307b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC20305a.class);
        this.f100289a = enumMap;
        enumMap.put((EnumMap) EnumC20305a.AD_STORAGE, (EnumC20305a) bool);
        enumMap.put((EnumMap) EnumC20305a.ANALYTICS_STORAGE, (EnumC20305a) bool2);
    }

    /* renamed from: a */
    public static C20307b m106003a(Bundle bundle) {
        if (bundle == null) {
            return f100288b;
        }
        EnumMap enumMap = new EnumMap(EnumC20305a.class);
        for (EnumC20305a enumC20305a : EnumC20305a.values()) {
            enumMap.put((EnumMap) enumC20305a, (EnumC20305a) m106008n(bundle.getString(enumC20305a.f100287p)));
        }
        return new C20307b(enumMap);
    }

    /* renamed from: b */
    public static C20307b m106004b(String str) {
        EnumMap enumMap = new EnumMap(EnumC20305a.class);
        if (str != null) {
            int i11 = 0;
            while (true) {
                EnumC20305a[] enumC20305aArr = EnumC20305a.f100285s;
                int length = enumC20305aArr.length;
                if (i11 >= 2) {
                    break;
                }
                EnumC20305a enumC20305a = enumC20305aArr[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    char charAt = str.charAt(i12);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) enumC20305a, (EnumC20305a) bool);
                }
                i11++;
            }
        }
        return new C20307b(enumMap);
    }

    /* renamed from: g */
    public static String m106005g(Bundle bundle) {
        String string;
        for (EnumC20305a enumC20305a : EnumC20305a.values()) {
            if (bundle.containsKey(enumC20305a.f100287p) && (string = bundle.getString(enumC20305a.f100287p)) != null && m106008n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m106006j(int i11, int i12) {
        return i11 <= i12;
    }

    /* renamed from: m */
    static final int m106007m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: n */
    private static Boolean m106008n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public final C20307b m106009c(C20307b c20307b) {
        boolean z11;
        EnumMap enumMap = new EnumMap(EnumC20305a.class);
        for (EnumC20305a enumC20305a : EnumC20305a.values()) {
            Boolean bool = (Boolean) this.f100289a.get(enumC20305a);
            Boolean bool2 = (Boolean) c20307b.f100289a.get(enumC20305a);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bool = Boolean.valueOf(z11);
            }
            enumMap.put((EnumMap) enumC20305a, (EnumC20305a) bool);
        }
        return new C20307b(enumMap);
    }

    /* renamed from: d */
    public final C20307b m106010d(C20307b c20307b) {
        EnumMap enumMap = new EnumMap(EnumC20305a.class);
        for (EnumC20305a enumC20305a : EnumC20305a.values()) {
            Boolean bool = (Boolean) this.f100289a.get(enumC20305a);
            if (bool == null) {
                bool = (Boolean) c20307b.f100289a.get(enumC20305a);
            }
            enumMap.put((EnumMap) enumC20305a, (EnumC20305a) bool);
        }
        return new C20307b(enumMap);
    }

    /* renamed from: e */
    public final Boolean m106011e() {
        return (Boolean) this.f100289a.get(EnumC20305a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20307b)) {
            return false;
        }
        C20307b c20307b = (C20307b) obj;
        for (EnumC20305a enumC20305a : EnumC20305a.values()) {
            if (m106007m((Boolean) this.f100289a.get(enumC20305a)) != m106007m((Boolean) c20307b.f100289a.get(enumC20305a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean m106012f() {
        return (Boolean) this.f100289a.get(EnumC20305a.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String m106013h() {
        char c11;
        StringBuilder sb2 = new StringBuilder("G1");
        EnumC20305a[] enumC20305aArr = EnumC20305a.f100285s;
        int length = enumC20305aArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            Boolean bool = (Boolean) this.f100289a.get(enumC20305aArr[i11]);
            if (bool == null) {
                c11 = '-';
            } else if (bool.booleanValue()) {
                c11 = '1';
            } else {
                c11 = '0';
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f100289a.values().iterator();
        int i11 = 17;
        while (it.hasNext()) {
            i11 = (i11 * 31) + m106007m((Boolean) it.next());
        }
        return i11;
    }

    /* renamed from: i */
    public final boolean m106014i(EnumC20305a enumC20305a) {
        Boolean bool = (Boolean) this.f100289a.get(enumC20305a);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m106015k(C20307b c20307b) {
        return m106016l(c20307b, (EnumC20305a[]) this.f100289a.keySet().toArray(new EnumC20305a[0]));
    }

    /* renamed from: l */
    public final boolean m106016l(C20307b c20307b, EnumC20305a... enumC20305aArr) {
        for (EnumC20305a enumC20305a : enumC20305aArr) {
            Boolean bool = (Boolean) this.f100289a.get(enumC20305a);
            Boolean bool2 = (Boolean) c20307b.f100289a.get(enumC20305a);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("settings: ");
        EnumC20305a[] values = EnumC20305a.values();
        int length = values.length;
        for (int i11 = 0; i11 < length; i11++) {
            EnumC20305a enumC20305a = values[i11];
            if (i11 != 0) {
                sb2.append(", ");
            }
            sb2.append(enumC20305a.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f100289a.get(enumC20305a);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public C20307b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC20305a.class);
        this.f100289a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
