package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.os.j */
/* loaded from: classes2.dex */
public final class C1444j implements InterfaceC1445k {

    /* renamed from: c */
    private static final Locale[] f6274c = new Locale[0];

    /* renamed from: d */
    private static final Locale f6275d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f6276e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f6277f = C1443i.m7352b("en-Latn");

    /* renamed from: a */
    private final Locale[] f6278a;

    /* renamed from: b */
    private final String f6279b;

    public C1444j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f6278a = f6274c;
            this.f6279b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < localeArr.length; i11++) {
            Locale locale = localeArr[i11];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m7359b(sb2, locale2);
                    if (i11 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i11 + "] is null");
            }
        }
        this.f6278a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f6279b = sb2.toString();
    }

    /* renamed from: b */
    static void m7359b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override // androidx.core.os.InterfaceC1445k
    /* renamed from: a */
    public Object mo7360a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1444j)) {
            return false;
        }
        Locale[] localeArr = ((C1444j) obj).f6278a;
        if (this.f6278a.length != localeArr.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            Locale[] localeArr2 = this.f6278a;
            if (i11 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i11].equals(localeArr[i11])) {
                return false;
            }
            i11++;
        }
    }

    @Override // androidx.core.os.InterfaceC1445k
    public Locale get(int i11) {
        if (i11 >= 0) {
            Locale[] localeArr = this.f6278a;
            if (i11 < localeArr.length) {
                return localeArr[i11];
            }
        }
        return null;
    }

    public int hashCode() {
        int i11 = 1;
        for (Locale locale : this.f6278a) {
            i11 = (i11 * 31) + locale.hashCode();
        }
        return i11;
    }

    @Override // androidx.core.os.InterfaceC1445k
    public int size() {
        return this.f6278a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f6278a;
            if (i11 < localeArr.length) {
                sb2.append(localeArr[i11]);
                if (i11 < this.f6278a.length - 1) {
                    sb2.append(',');
                }
                i11++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
