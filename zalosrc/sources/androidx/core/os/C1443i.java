package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.i */
/* loaded from: classes2.dex */
public final class C1443i {

    /* renamed from: b */
    private static final C1443i f6272b = m7351a(new Locale[0]);

    /* renamed from: a */
    private final InterfaceC1445k f6273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.i$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static LocaleList m7356a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m7357b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m7358c() {
            return LocaleList.getDefault();
        }
    }

    private C1443i(InterfaceC1445k interfaceC1445k) {
        this.f6273a = interfaceC1445k;
    }

    /* renamed from: a */
    public static C1443i m7351a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m7353e(a.m7356a(localeArr));
        }
        return new C1443i(new C1444j(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m7352b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: e */
    public static C1443i m7353e(LocaleList localeList) {
        return new C1443i(new C1451q(localeList));
    }

    /* renamed from: c */
    public Locale m7354c(int i11) {
        return this.f6273a.get(i11);
    }

    /* renamed from: d */
    public int m7355d() {
        return this.f6273a.size();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C1443i) && this.f6273a.equals(((C1443i) obj).f6273a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f6273a.hashCode();
    }

    public String toString() {
        return this.f6273a.toString();
    }
}
