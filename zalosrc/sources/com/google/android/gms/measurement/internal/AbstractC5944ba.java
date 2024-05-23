package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5419i3;
import com.google.android.gms.internal.measurement.C5538p3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ba */
/* loaded from: classes2.dex */
public abstract class AbstractC5944ba {

    /* renamed from: a */
    final String f33796a;

    /* renamed from: b */
    final int f33797b;

    /* renamed from: c */
    Boolean f33798c;

    /* renamed from: d */
    Boolean f33799d;

    /* renamed from: e */
    Long f33800e;

    /* renamed from: f */
    Long f33801f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5944ba(String str, int i11) {
        this.f33796a = str;
        this.f33797b = i11;
    }

    /* renamed from: d */
    private static Boolean m30807d(String str, int i11, boolean z11, String str2, List list, String str3, C6082o3 c6082o3) {
        int i12;
        if (i11 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z11 && i11 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i11 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z11) {
                    i12 = 66;
                } else {
                    i12 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i12).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c6082o3 != null) {
                        c6082o3.m31202w().m31109b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m30808e(BigDecimal bigDecimal, C5419i3 c5419i3, double d11) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC4205o.m19722k(c5419i3);
        if (c5419i3.m29198G()) {
            boolean z11 = true;
            if (c5419i3.m29203M() != 1) {
                if (c5419i3.m29203M() == 5) {
                    if (!c5419i3.m29202L() || !c5419i3.m29201J()) {
                        return null;
                    }
                } else if (!c5419i3.m29199H()) {
                    return null;
                }
                int m29203M = c5419i3.m29203M();
                if (c5419i3.m29203M() == 5) {
                    if (C6077n9.m31154N(c5419i3.m29196E()) && C6077n9.m31154N(c5419i3.m29195D())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c5419i3.m29196E());
                            bigDecimal4 = new BigDecimal(c5419i3.m29195D());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C6077n9.m31154N(c5419i3.m29194C())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c5419i3.m29194C());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (m29203M == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i11 = m29203M - 1;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z11 = false;
                            }
                            return Boolean.valueOf(z11);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d11 != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d11).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d11).multiply(new BigDecimal(2)))) >= 0) {
                                z11 = false;
                            }
                            return Boolean.valueOf(z11);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Boolean m30809f(String str, C5538p3 c5538p3, C6082o3 c6082o3) {
        String m29494D;
        List list;
        String str2;
        AbstractC4205o.m19722k(c5538p3);
        if (str == null || !c5538p3.m29499I() || c5538p3.m29500J() == 1) {
            return null;
        }
        if (c5538p3.m29500J() == 7) {
            if (c5538p3.m29493A() == 0) {
                return null;
            }
        } else if (!c5538p3.m29498H()) {
            return null;
        }
        int m29500J = c5538p3.m29500J();
        boolean m29496F = c5538p3.m29496F();
        if (!m29496F && m29500J != 2 && m29500J != 7) {
            m29494D = c5538p3.m29494D().toUpperCase(Locale.ENGLISH);
        } else {
            m29494D = c5538p3.m29494D();
        }
        String str3 = m29494D;
        if (c5538p3.m29493A() == 0) {
            list = null;
        } else {
            List m29495E = c5538p3.m29495E();
            if (!m29496F) {
                ArrayList arrayList = new ArrayList(m29495E.size());
                Iterator it = m29495E.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                m29495E = Collections.unmodifiableList(arrayList);
            }
            list = m29495E;
        }
        if (m29500J == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return m30807d(str, m29500J, m29496F, str3, list, str2, c6082o3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Boolean m30810g(double d11, C5419i3 c5419i3) {
        try {
            return m30808e(new BigDecimal(d11), c5419i3, Math.ulp(d11));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Boolean m30811h(long j11, C5419i3 c5419i3) {
        try {
            return m30808e(new BigDecimal(j11), c5419i3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Boolean m30812i(String str, C5419i3 c5419i3) {
        if (!C6077n9.m31154N(str)) {
            return null;
        }
        try {
            return m30808e(new BigDecimal(str), c5419i3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Boolean m30813j(Boolean bool, boolean z11) {
        boolean z12;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo30795a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo30796b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo30797c();
}
