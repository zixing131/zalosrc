package ge;

import android.text.TextUtils;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import java.util.Iterator;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import me0.AbstractC23136l9;

/* renamed from: ge.p */
/* loaded from: classes3.dex */
public class C19424p {

    /* renamed from: g */
    static final String[] f96368g = {"FREQ", "BYDAY", "INTERVAL", "BYMONTHDAY", "BYMONTH"};

    /* renamed from: h */
    static final String[] f96369h = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    /* renamed from: a */
    public int f96370a;

    /* renamed from: b */
    public TreeSet f96371b;

    /* renamed from: c */
    public TreeSet f96372c;

    /* renamed from: d */
    public TreeSet f96373d;

    /* renamed from: e */
    boolean f96374e;

    /* renamed from: f */
    public int f96375f;

    public C19424p() {
        this.f96370a = -1;
        this.f96371b = new TreeSet();
        this.f96372c = new TreeSet();
        this.f96373d = new TreeSet();
        this.f96374e = true;
        this.f96375f = 0;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C19424p clone() {
        C19424p c19424p = new C19424p();
        c19424p.f96370a = this.f96370a;
        c19424p.f96371b = new TreeSet((SortedSet) this.f96371b);
        c19424p.f96372c = new TreeSet((SortedSet) this.f96372c);
        c19424p.f96373d = new TreeSet((SortedSet) this.f96373d);
        c19424p.f96375f = this.f96375f;
        return c19424p;
    }

    /* renamed from: b */
    public boolean m101570b() {
        if (this.f96370a == 4 && this.f96371b.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public String m101571c() {
        if (!this.f96374e) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_unsupported);
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f96370a;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_unsupported);
                            }
                            if (this.f96371b.size() != 7 && this.f96371b.size() != 0) {
                                StringBuilder sb3 = new StringBuilder();
                                Iterator it = this.f96371b.iterator();
                                while (it.hasNext()) {
                                    sb3.append(AbstractC23136l9.m118755v0(AbstractC16775v.array_days_of_week_short)[(((Integer) it.next()).intValue() - 4) % 7]);
                                    sb3.append(", ");
                                }
                                sb3.delete(sb3.length() - 2, sb3.length());
                                sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_weekly_custom_detail), sb3.toString()));
                            } else {
                                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_weekly_all_detail));
                            }
                        } else {
                            if (this.f96373d.size() > 0) {
                                if (this.f96372c.size() == 1) {
                                    if (((Integer) this.f96372c.first()).intValue() == -1) {
                                        StringBuilder sb4 = new StringBuilder();
                                        Iterator it2 = this.f96373d.iterator();
                                        while (it2.hasNext()) {
                                            Integer num = (Integer) it2.next();
                                            if (num.intValue() >= 1 && num.intValue() <= 12) {
                                                if (this.f96375f == 1) {
                                                    sb4.append(AbstractC23136l9.m118755v0(AbstractC16775v.array_months_lunar_full)[num.intValue() - 1]);
                                                    sb4.append(", ");
                                                } else {
                                                    sb4.append(AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full)[num.intValue() - 1]);
                                                    sb4.append(", ");
                                                }
                                            } else {
                                                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_unsupported);
                                            }
                                        }
                                        sb4.delete(sb4.length() - 2, sb4.length());
                                        sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_yearly_lastmonthday), sb4.toString()));
                                    } else {
                                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_unsupported);
                                    }
                                } else {
                                    return AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_unsupported);
                                }
                            } else {
                                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_yearly_detail));
                            }
                            if (this.f96375f == 1) {
                                sb2.append(" ");
                                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lunisolar_calendar_postfix));
                            }
                        }
                    } else {
                        if (this.f96372c.size() > 0) {
                            if (this.f96372c.size() == 1 && ((Integer) this.f96372c.first()).intValue() == -1) {
                                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_monthly_lastday));
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                Iterator it3 = this.f96372c.iterator();
                                while (it3.hasNext()) {
                                    Integer num2 = (Integer) it3.next();
                                    if (num2.intValue() >= 1 && num2.intValue() <= 31) {
                                        sb5.append("");
                                        sb5.append(num2);
                                        sb5.append(", ");
                                    } else {
                                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_unsupported);
                                    }
                                }
                                sb5.delete(sb5.length() - 2, sb5.length());
                                sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_monthly_bymonthday), sb5.toString()));
                            }
                        } else {
                            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_monthly_detail));
                        }
                        if (this.f96375f == 1) {
                            sb2.append(" ");
                            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lunisolar_calendar_postfix));
                        }
                    }
                } else {
                    sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_weekly_detail));
                }
            } else {
                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_daily_detail));
            }
        } else {
            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_none));
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:            if (r1 != 4) goto L17;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m101572d() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f96370a;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            sb2.append("FREQ=");
                            sb2.append("YEARLY");
                        }
                    } else {
                        sb2.append("FREQ=");
                        sb2.append("MONTHLY");
                    }
                }
                sb2.append("FREQ=");
                sb2.append("WEEKLY");
            } else {
                sb2.append("FREQ=");
                sb2.append("DAILY");
            }
            if (this.f96371b.size() > 0) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append("BYDAY=");
                Iterator it = this.f96371b.iterator();
                while (it.hasNext()) {
                    sb2.append(f96369h[(((Integer) it.next()).intValue() - 4) % 7]);
                    sb2.append(",");
                }
                sb2.deleteCharAt(sb2.length() - 1);
            }
            if (this.f96372c.size() > 0) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append("BYMONTHDAY=");
                Iterator it2 = this.f96372c.iterator();
                while (it2.hasNext()) {
                    sb2.append((Integer) it2.next());
                    sb2.append(",");
                }
                sb2.deleteCharAt(sb2.length() - 1);
            }
            if (this.f96373d.size() > 0) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append("BYMONTH=");
                Iterator it3 = this.f96373d.iterator();
                while (it3.hasNext()) {
                    sb2.append((Integer) it3.next());
                    sb2.append(",");
                }
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        }
        return null;
    }

    public C19424p(String str, int i11) {
        char c11;
        char c12;
        char c13;
        this.f96370a = -1;
        this.f96371b = new TreeSet();
        this.f96372c = new TreeSet();
        this.f96373d = new TreeSet();
        this.f96374e = true;
        this.f96375f = 0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z11 = false;
        for (String str2 : str.trim().toUpperCase(Locale.ENGLISH).split(";")) {
            int indexOf = str2.indexOf("=");
            if (indexOf > 0) {
                String substring = str2.substring(0, indexOf);
                String substring2 = str2.substring(indexOf + 1);
                substring.hashCode();
                switch (substring.hashCode()) {
                    case -1571028365:
                        if (substring.equals("BYMONTHDAY")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 2166392:
                        if (substring.equals("FREQ")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 63671237:
                        if (substring.equals("BYDAY")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 1067237481:
                        if (substring.equals("BYMONTH")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 1353045189:
                        if (substring.equals("INTERVAL")) {
                            c11 = 4;
                            break;
                        }
                        break;
                }
                c11 = 65535;
                switch (c11) {
                    case 0:
                        for (String str3 : substring2.split(",")) {
                            this.f96372c.add(Integer.valueOf(Integer.parseInt(str3)));
                        }
                        break;
                    case 1:
                        substring2.hashCode();
                        switch (substring2.hashCode()) {
                            case -1738378111:
                                if (substring2.equals("WEEKLY")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case -1681232246:
                                if (substring2.equals("YEARLY")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 64808441:
                                if (substring2.equals("DAILY")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                            case 1954618349:
                                if (substring2.equals("MONTHLY")) {
                                    c12 = 3;
                                    break;
                                }
                                break;
                        }
                        c12 = 65535;
                        switch (c12) {
                            case 0:
                                if (z11) {
                                    break;
                                } else {
                                    this.f96370a = 1;
                                    break;
                                }
                            case 1:
                                this.f96370a = 3;
                                break;
                            case 2:
                                this.f96370a = 0;
                                break;
                            case 3:
                                this.f96370a = 2;
                                break;
                            default:
                                this.f96374e = false;
                                break;
                        }
                    case 2:
                        this.f96370a = 4;
                        for (String str4 : substring2.split(",")) {
                            str4.hashCode();
                            switch (str4.hashCode()) {
                                case 2252:
                                    if (str4.equals("FR")) {
                                        c13 = 0;
                                        break;
                                    }
                                    break;
                                case 2466:
                                    if (str4.equals("MO")) {
                                        c13 = 1;
                                        break;
                                    }
                                    break;
                                case 2638:
                                    if (str4.equals("SA")) {
                                        c13 = 2;
                                        break;
                                    }
                                    break;
                                case 2658:
                                    if (str4.equals("SU")) {
                                        c13 = 3;
                                        break;
                                    }
                                    break;
                                case 2676:
                                    if (str4.equals("TH")) {
                                        c13 = 4;
                                        break;
                                    }
                                    break;
                                case 2689:
                                    if (str4.equals("TU")) {
                                        c13 = 5;
                                        break;
                                    }
                                    break;
                                case 2766:
                                    if (str4.equals("WE")) {
                                        c13 = 6;
                                        break;
                                    }
                                    break;
                            }
                            c13 = 65535;
                            switch (c13) {
                                case 0:
                                    this.f96371b.add(9);
                                    break;
                                case 1:
                                    this.f96371b.add(5);
                                    break;
                                case 2:
                                    this.f96371b.add(10);
                                    break;
                                case 3:
                                    this.f96371b.add(11);
                                    break;
                                case 4:
                                    this.f96371b.add(8);
                                    break;
                                case 5:
                                    this.f96371b.add(6);
                                    break;
                                case 6:
                                    this.f96371b.add(7);
                                    break;
                                default:
                                    this.f96374e = false;
                                    break;
                            }
                        }
                        z11 = true;
                        break;
                    case 3:
                        for (String str5 : substring2.split(",")) {
                            this.f96373d.add(Integer.valueOf(Integer.parseInt(str5)));
                        }
                        break;
                    case 4:
                        break;
                    default:
                        this.f96374e = false;
                        break;
                }
            }
        }
        this.f96375f = i11;
    }
}
