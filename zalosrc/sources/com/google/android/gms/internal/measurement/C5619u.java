package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes2.dex */
public final class C5619u implements Iterable, InterfaceC5551q {

    /* renamed from: p */
    private final String f32817p;

    public C5619u(String str) {
        if (str != null) {
            this.f32817p = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0189. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033e  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        char c11;
        C5619u c5619u;
        InterfaceC5551q c5619u2;
        int i11;
        InterfaceC5551q c5415i;
        double min;
        double min2;
        int i12;
        int i13;
        C5590s4 c5590s42;
        int i14;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str)) {
            str2 = "toLocaleUpperCase";
            str3 = "toUpperCase";
        } else {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                str4 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        if (str.equals(str6)) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1776922004:
                        str5 = "charAt";
                        str7 = "toString";
                        if (str.equals(str7)) {
                            c11 = 14;
                            str6 = str4;
                            break;
                        } else {
                            str6 = str4;
                            c11 = 65535;
                            break;
                        }
                    case -1464939364:
                        str5 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c11 = '\f';
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -1361633751:
                        str5 = "charAt";
                        if (str.equals(str5)) {
                            str6 = str4;
                            str7 = "toString";
                            c11 = 0;
                            break;
                        }
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            c11 = 1;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c11 = '\r';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c11 = 7;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c11 = 11;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c11 = 4;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case -399551817:
                        if (str.equals(str3)) {
                            c11 = 15;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c11 = 16;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c11 = 5;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c11 = '\b';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c11 = '\t';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c11 = '\n';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c11 = 6;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c11 = 3;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c11 = 65535;
                        break;
                }
                String str8 = AdError.UNDEFINED_DOMAIN;
                switch (c11) {
                    case 0:
                        AbstractC5608t5.m29619j(str5, 1, list);
                        int m29610a = !list.isEmpty() ? (int) AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) : 0;
                        String str9 = this.f32817p;
                        return (m29610a < 0 || m29610a >= str9.length()) ? InterfaceC5551q.f32737k : new C5619u(String.valueOf(str9.charAt(m29610a)));
                    case 1:
                        c5619u = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder(c5619u.f32817p);
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                sb2.append(c5590s4.m29589b((InterfaceC5551q) list.get(i15)).zzi());
                            }
                            c5619u2 = new C5619u(sb2.toString());
                            return c5619u2;
                        }
                        return c5619u;
                    case 2:
                        c5619u = this;
                        AbstractC5608t5.m29617h(str6, 1, list);
                        String str10 = c5619u.f32817p;
                        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                        if ("length".equals(m29589b.zzi())) {
                            c5619u2 = InterfaceC5551q.f32735i;
                        } else {
                            double doubleValue = m29589b.zzh().doubleValue();
                            c5619u2 = (doubleValue != Math.floor(doubleValue) || (i11 = (int) doubleValue) < 0 || i11 >= str10.length()) ? InterfaceC5551q.f32736j : InterfaceC5551q.f32735i;
                        }
                        return c5619u2;
                    case 3:
                        c5619u = this;
                        AbstractC5608t5.m29619j("indexOf", 2, list);
                        String str11 = c5619u.f32817p;
                        if (list.size() > 0) {
                            str8 = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
                        }
                        c5415i = new C5415i(Double.valueOf(str11.indexOf(str8, (int) AbstractC5608t5.m29610a(list.size() >= 2 ? c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue() : 0.0d))));
                        return c5415i;
                    case 4:
                        c5619u = this;
                        AbstractC5608t5.m29619j("lastIndexOf", 2, list);
                        String str12 = c5619u.f32817p;
                        if (list.size() > 0) {
                            str8 = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
                        }
                        String str13 = str8;
                        c5415i = new C5415i(Double.valueOf(str12.lastIndexOf(str13, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : AbstractC5608t5.m29610a(r0)))));
                        return c5415i;
                    case 5:
                        c5619u = this;
                        AbstractC5608t5.m29619j("match", 1, list);
                        Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi()).matcher(c5619u.f32817p);
                        if (matcher.find()) {
                            c5415i = new C5364f(Arrays.asList(new C5619u(matcher.group())));
                            return c5415i;
                        }
                        c5619u2 = InterfaceC5551q.f32731e;
                        return c5619u2;
                    case 6:
                        c5619u = this;
                        AbstractC5608t5.m29619j("replace", 2, list);
                        InterfaceC5551q interfaceC5551q = InterfaceC5551q.f32730d;
                        if (!list.isEmpty()) {
                            str8 = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
                            if (list.size() > 1) {
                                interfaceC5551q = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                            }
                        }
                        String str14 = str8;
                        String str15 = c5619u.f32817p;
                        int indexOf = str15.indexOf(str14);
                        if (indexOf >= 0) {
                            if (interfaceC5551q instanceof AbstractC5432j) {
                                interfaceC5551q = ((AbstractC5432j) interfaceC5551q).mo28891a(c5590s4, Arrays.asList(new C5619u(str14), new C5415i(Double.valueOf(indexOf)), c5619u));
                            }
                            c5415i = new C5619u(str15.substring(0, indexOf) + interfaceC5551q.zzi() + str15.substring(indexOf + str14.length()));
                            return c5415i;
                        }
                        return c5619u;
                    case 7:
                        c5619u = this;
                        AbstractC5608t5.m29619j("search", 1, list);
                        if (!list.isEmpty()) {
                            str8 = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
                        }
                        if (Pattern.compile(str8).matcher(c5619u.f32817p).find()) {
                            c5415i = new C5415i(Double.valueOf(r0.start()));
                            return c5415i;
                        }
                        c5619u2 = new C5415i(Double.valueOf(-1.0d));
                        return c5619u2;
                    case '\b':
                        c5619u = this;
                        AbstractC5608t5.m29619j("slice", 2, list);
                        String str16 = c5619u.f32817p;
                        double m29610a2 = AbstractC5608t5.m29610a(!list.isEmpty() ? c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue() : 0.0d);
                        if (m29610a2 < 0.0d) {
                            min = Math.max(str16.length() + m29610a2, 0.0d);
                        } else {
                            min = Math.min(m29610a2, str16.length());
                        }
                        double m29610a3 = AbstractC5608t5.m29610a(list.size() > 1 ? c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue() : str16.length());
                        if (m29610a3 < 0.0d) {
                            min2 = Math.max(str16.length() + m29610a3, 0.0d);
                        } else {
                            min2 = Math.min(m29610a3, str16.length());
                        }
                        int i16 = (int) min;
                        c5415i = new C5619u(str16.substring(i16, Math.max(0, ((int) min2) - i16) + i16));
                        return c5415i;
                    case '\t':
                        c5619u = this;
                        AbstractC5608t5.m29619j("split", 2, list);
                        String str17 = c5619u.f32817p;
                        if (str17.length() == 0) {
                            c5619u2 = new C5364f(Arrays.asList(c5619u));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (list.isEmpty()) {
                                arrayList.add(c5619u);
                            } else {
                                String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
                                long m29613d = list.size() > 1 ? AbstractC5608t5.m29613d(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()) : 2147483647L;
                                if (m29613d == 0) {
                                    c5619u2 = new C5364f();
                                } else {
                                    String[] split = str17.split(Pattern.quote(zzi), ((int) m29613d) + 1);
                                    int length2 = split.length;
                                    if (!zzi.isEmpty() || length2 <= 0) {
                                        i12 = length2;
                                        i13 = 0;
                                    } else {
                                        boolean isEmpty = split[0].isEmpty();
                                        i12 = length2 - 1;
                                        i13 = isEmpty;
                                        if (!split[i12].isEmpty()) {
                                            i12 = length2;
                                            i13 = isEmpty;
                                        }
                                    }
                                    if (length2 > m29613d) {
                                        i12--;
                                    }
                                    while (i13 < i12) {
                                        arrayList.add(new C5619u(split[i13]));
                                        i13++;
                                    }
                                }
                            }
                            c5619u2 = new C5364f(arrayList);
                        }
                        return c5619u2;
                    case '\n':
                        c5619u = this;
                        AbstractC5608t5.m29619j("substring", 2, list);
                        String str18 = c5619u.f32817p;
                        if (list.isEmpty()) {
                            c5590s42 = c5590s4;
                            i14 = 0;
                        } else {
                            c5590s42 = c5590s4;
                            i14 = (int) AbstractC5608t5.m29610a(c5590s42.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue());
                        }
                        if (list.size() > 1) {
                            length = (int) AbstractC5608t5.m29610a(c5590s42.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue());
                        } else {
                            length = str18.length();
                        }
                        int min3 = Math.min(Math.max(i14, 0), str18.length());
                        int min4 = Math.min(Math.max(length, 0), str18.length());
                        c5415i = new C5619u(str18.substring(Math.min(min3, min4), Math.max(min3, min4)));
                        return c5415i;
                    case 11:
                        c5619u = this;
                        AbstractC5608t5.m29617h(str2, 0, list);
                        c5415i = new C5619u(c5619u.f32817p.toUpperCase());
                        return c5415i;
                    case '\f':
                        c5619u = this;
                        AbstractC5608t5.m29617h("toLocaleLowerCase", 0, list);
                        c5415i = new C5619u(c5619u.f32817p.toLowerCase());
                        return c5415i;
                    case '\r':
                        c5619u = this;
                        AbstractC5608t5.m29617h("toLowerCase", 0, list);
                        c5415i = new C5619u(c5619u.f32817p.toLowerCase(Locale.ENGLISH));
                        return c5415i;
                    case 14:
                        c5619u = this;
                        AbstractC5608t5.m29617h(str7, 0, list);
                        return c5619u;
                    case 15:
                        c5619u = this;
                        AbstractC5608t5.m29617h(str3, 0, list);
                        c5415i = new C5619u(c5619u.f32817p.toUpperCase(Locale.ENGLISH));
                        return c5415i;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        AbstractC5608t5.m29617h(str3, 0, list);
                        c5619u = this;
                        c5415i = new C5619u(c5619u.f32817p.trim());
                        return c5415i;
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str4 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        String str82 = AdError.UNDEFINED_DOMAIN;
        switch (c11) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5619u)) {
            return false;
        }
        return this.f32817p.equals(((C5619u) obj).f32817p);
    }

    public final int hashCode() {
        return this.f32817p.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5602t(this);
    }

    public final String toString() {
        return "\"" + this.f32817p + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return new C5619u(this.f32817p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f32817p.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        if (this.f32817p.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f32817p);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        return this.f32817p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return new C5585s(this);
    }
}
