package me0;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.SparseArray;
import au.AbstractC2353j;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import ho0.AbstractC20110a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;
import l30.C22013a0;
import mm0.AbstractC23350e;
import nh0.C23791a;
import nh0.C23793c;
import p111du.AbstractC18070b;
import p133ek.AbstractC18458a;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;

/* renamed from: me0.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC23160o0 {

    /* renamed from: a */
    private static String f112313a;

    /* renamed from: b */
    private static String f112314b;

    /* renamed from: c */
    private static String f112315c;

    /* renamed from: d */
    private static String f112316d;

    /* renamed from: e */
    private static String f112317e;

    /* renamed from: f */
    private static String f112318f;

    /* renamed from: g */
    private static String f112319g;

    /* renamed from: h */
    private static String f112320h;

    /* renamed from: i */
    private static String f112321i;

    /* renamed from: j */
    private static String f112322j;

    /* renamed from: k */
    private static String f112323k;

    /* renamed from: l */
    private static String f112324l;

    /* renamed from: m */
    private static String f112325m;

    /* renamed from: n */
    private static String f112326n;

    /* renamed from: o */
    private static String f112327o;

    /* renamed from: p */
    private static String f112328p;

    /* renamed from: q */
    private static String f112329q;

    /* renamed from: r */
    private static String f112330r;

    /* renamed from: s */
    private static String[] f112331s;

    /* renamed from: t */
    private static String f112332t;

    /* renamed from: u */
    private static String f112333u;

    /* renamed from: v */
    private static SparseArray f112334v;

    /* renamed from: w */
    private static SparseArray f112335w;

    /* renamed from: x */
    private static final AbstractC18070b f112336x = new a(2);

    /* renamed from: y */
    private static final AbstractC18070b f112337y = new b(2);

    /* renamed from: z */
    private static final AbstractC18070b f112338z = new c(2);

    /* renamed from: A */
    private static final AbstractC18070b f112312A = new d(2);

    /* renamed from: me0.o0$a */
    /* loaded from: classes.dex */
    class a extends AbstractC18070b {
        a(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f */
        public Calendar mo15431d() {
            return Calendar.getInstance();
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: g */
        public void mo96100e(Calendar calendar) {
            calendar.setTimeZone(TimeZone.getDefault());
        }
    }

    /* renamed from: me0.o0$b */
    /* loaded from: classes.dex */
    class b extends AbstractC18070b {
        b(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f */
        public SimpleDateFormat mo15431d() {
            return new SimpleDateFormat("HH:mm", Locale.getDefault());
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: g */
        public void mo96100e(SimpleDateFormat simpleDateFormat) {
            AbstractC23160o0.m119268l1(simpleDateFormat);
        }
    }

    /* renamed from: me0.o0$c */
    /* loaded from: classes.dex */
    class c extends AbstractC18070b {
        c(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f */
        public SimpleDateFormat mo15431d() {
            return new SimpleDateFormat("MM, yyyy");
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: g */
        public void mo96100e(SimpleDateFormat simpleDateFormat) {
            AbstractC23160o0.m119268l1(simpleDateFormat);
        }
    }

    /* renamed from: me0.o0$d */
    /* loaded from: classes.dex */
    class d extends AbstractC18070b {
        d(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f */
        public SimpleDateFormat mo15431d() {
            return new SimpleDateFormat("MMM yyyy", Locale.ENGLISH);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: g */
        public void mo96100e(SimpleDateFormat simpleDateFormat) {
            AbstractC23160o0.m119268l1(simpleDateFormat);
        }
    }

    /* renamed from: A */
    public static String m119181A(long j11) {
        String str;
        String str2;
        String str3;
        String str4;
        if (j11 == 0) {
            return "";
        }
        m119232Z0();
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124270p());
        m119268l1(c23791a.m124262h());
        m119268l1(c23791a.m124264j());
        m119268l1(c23791a.m124274t());
        m119268l1(c23791a.m124263i());
        int currentTimeMillis = (int) ((System.currentTimeMillis() - j11) / 1000);
        if (currentTimeMillis <= 43200) {
            if (currentTimeMillis >= 0 && currentTimeMillis <= 60) {
                String str5 = f112313a;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(currentTimeMillis);
                if (currentTimeMillis > 1) {
                    str4 = f112319g;
                } else {
                    str4 = f112320h;
                }
                objArr[1] = str4;
                return String.format(str5, objArr);
            }
            if (currentTimeMillis >= 61 && currentTimeMillis <= 3600) {
                int i11 = currentTimeMillis / 60;
                String str6 = f112314b;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i11);
                if (i11 > 1) {
                    str3 = f112319g;
                } else {
                    str3 = f112320h;
                }
                objArr2[1] = str3;
                return String.format(str6, objArr2);
            }
            if (currentTimeMillis >= 3601) {
                int i12 = currentTimeMillis / 3600;
                String str7 = f112315c;
                Object[] objArr3 = new Object[2];
                objArr3[0] = Integer.valueOf(i12);
                if (i12 > 1) {
                    str2 = f112319g;
                } else {
                    str2 = f112320h;
                }
                objArr3[1] = str2;
                return String.format(str7, objArr3);
            }
        }
        Date date = new Date(System.currentTimeMillis());
        Date date2 = new Date(j11);
        int parseInt = Integer.parseInt(c23791a.m124270p().format(date));
        int parseInt2 = Integer.parseInt(c23791a.m124270p().format(date2));
        int parseInt3 = Integer.parseInt(c23791a.m124262h().format(date));
        int parseInt4 = Integer.parseInt(c23791a.m124262h().format(date2));
        int i13 = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date2);
        if (calendar.get(1) == i13) {
            if (parseInt4 == parseInt3) {
                return String.format("%s:%s %s", c23791a.m124264j().format(date2), c23791a.m124274t().format(date2), f112317e);
            }
            if (parseInt3 - parseInt4 == 1) {
                return String.format("%s:%s %s", c23791a.m124264j().format(date2), c23791a.m124274t().format(date2), f112318f);
            }
            if (parseInt2 == parseInt) {
                String str8 = (String) m119229Y().get(calendar.get(7));
                if (str8 != null) {
                    return String.format("%s:%s %s", c23791a.m124264j().format(date2), c23791a.m124274t().format(date2), str8);
                }
                m119268l1(c23791a.m124273s());
                return c23791a.m124273s().format(date2);
            }
            if (currentTimeMillis >= 86400 && currentTimeMillis <= 2592000) {
                int i14 = currentTimeMillis / 86400;
                String str9 = f112316d;
                Object[] objArr4 = new Object[2];
                objArr4[0] = Integer.valueOf(i14);
                if (i14 > 1) {
                    str = f112319g;
                } else {
                    str = f112320h;
                }
                objArr4[1] = str;
                return String.format(str9, objArr4);
            }
            m119268l1(c23791a.m124273s());
            return c23791a.m124273s().format(date2);
        }
        m119268l1(c23791a.m124273s());
        return c23791a.m124273s().format(date2);
    }

    /* renamed from: A0 */
    public static long m119182A0(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: B */
    public static int m119183B() {
        return Calendar.getInstance().get(11);
    }

    /* renamed from: B0 */
    public static String m119184B0(long j11) {
        try {
            long j12 = j11 / 1000;
            return String.format("%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: C */
    public static String m119185C(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124256b());
        return c23791a.m124256b().format(date);
    }

    /* renamed from: C0 */
    public static long m119186C0() {
        return C23793c.m124316k().mo124308a();
    }

    /* renamed from: D */
    public static String m119187D(Calendar calendar) {
        String str;
        String str2;
        Context appContext = MainApplication.getAppContext();
        int[] m12344g = AbstractC2353j.m12344g(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
        int i11 = m12344g[0];
        int i12 = m12344g[1];
        int i13 = m12344g[2];
        int i14 = m12344g[3];
        String[] stringArray = appContext.getResources().getStringArray(AbstractC16775v.array_months_lunar_full);
        String[] stringArray2 = appContext.getResources().getStringArray(AbstractC16775v.array_years_lunar);
        String[] stringArray3 = appContext.getResources().getStringArray(AbstractC16775v.array_days_of_week_full);
        if (m119247e1(calendar.getTimeInMillis())) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
        } else {
            str = stringArray3[calendar.get(7) - 1];
        }
        int i15 = AbstractC8020f0.str_format_date_string_lunar_full;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i11);
        objArr[1] = stringArray[(i12 - 1) % stringArray.length];
        if (i14 == 1) {
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_lunar_leap_full);
        } else {
            str2 = "";
        }
        objArr[2] = str2;
        objArr[3] = stringArray2[((i13 + stringArray2.length) - 4) % stringArray2.length];
        objArr[4] = str;
        return AbstractC23136l9.m118746s0(i15, objArr);
    }

    /* renamed from: D0 */
    public static SparseArray m119188D0() {
        if (f112334v == null) {
            f112334v = new SparseArray();
            m119277o1();
        }
        return f112334v;
    }

    /* renamed from: E */
    public static String m119189E(long j11) {
        String format;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(5);
            int i12 = calendar.get(2) + 1;
            if (AbstractC23309i.m122158m5().equals("vi")) {
                format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_format_header_day_media_store_v2), Integer.valueOf(i11), Integer.valueOf(i12));
            } else {
                format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_format_header_day_media_store), calendar.getDisplayName(2, 2, Locale.US), Integer.valueOf(i11));
            }
            return format;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: E0 */
    public static String m119190E0(Calendar calendar, boolean z11) {
        int i11 = calendar.get(5);
        int i12 = calendar.get(2) + 1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append("/");
        sb2.append(i12);
        if (z11) {
            int i13 = calendar.get(1);
            sb2.append("/");
            sb2.append(i13);
        }
        return sb2.toString();
    }

    /* renamed from: F */
    public static String m119191F(Calendar calendar, boolean z11, boolean z12) {
        return m119193G(calendar, z11, z12, false);
    }

    /* renamed from: F0 */
    public static String m119192F0(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124280z());
        return c23791a.m124280z().format(date);
    }

    /* renamed from: G */
    public static String m119193G(Calendar calendar, boolean z11, boolean z12, boolean z13) {
        return m119195H(calendar, z11, z12, z13, !m119244d1(calendar, Calendar.getInstance()));
    }

    /* renamed from: G0 */
    private static int m119194G0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i17 < -3) {
            return 9;
        }
        if (i11 == i12) {
            if (i15 == i16) {
                if (i17 < 60) {
                    return 8;
                }
                if (i17 < 3600) {
                    return 7;
                }
                if (i17 < 10800) {
                    return 6;
                }
                return 5;
            }
            if (i15 - i16 != 1) {
                if (i13 == i14) {
                    return 3;
                }
                return 2;
            }
        } else {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, i12);
                int actualMaximum = calendar.getActualMaximum(6);
                if (i11 - i12 != 1 || i15 != 1 || i16 != actualMaximum) {
                    return 1;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return 9;
            }
        }
        return 4;
    }

    /* renamed from: H */
    public static String m119195H(Calendar calendar, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m119197I(calendar, z11, z12, z13, z14, false);
    }

    /* renamed from: H0 */
    public static int m119196H0(int i11, int i12, int i13, int i14) {
        if (i13 == i14) {
            if (i11 == i12) {
                return 0;
            }
            if (i11 - i12 != 1) {
                return 2;
            }
            return 1;
        }
        if (i13 - i14 == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, i14);
            int actualMaximum = calendar.getActualMaximum(6);
            if (i11 == 1 && i12 == actualMaximum) {
                return 1;
            }
        }
        return 2;
    }

    /* renamed from: I */
    public static String m119197I(Calendar calendar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        try {
            Context appContext = MainApplication.getAppContext();
            if (z12 && m119247e1(calendar.getTimeInMillis())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_today));
                if (z13) {
                    sb2.append(", ");
                    sb2.append(m119243d0(calendar));
                }
                return sb2.toString();
            }
            if (z15 && m119250f1(calendar.getTimeInMillis())) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tomorrow));
                if (z13) {
                    sb3.append(", ");
                    sb3.append(m119243d0(calendar));
                }
                return sb3.toString();
            }
            int i11 = calendar.get(5);
            int i12 = calendar.get(2);
            int i13 = calendar.get(1);
            if (z11) {
                String[] stringArray = appContext.getResources().getStringArray(AbstractC16775v.array_days_of_week_full);
                String[] stringArray2 = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_full);
                if (z14) {
                    return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_full), stringArray[calendar.get(7) - 1], Integer.valueOf(i11), stringArray2[i12 % stringArray2.length], Integer.valueOf(i13));
                }
                return String.format(appContext.getResources().getString(AbstractC8020f0.str_format_date_string_full_no_year), stringArray[calendar.get(7) - 1], Integer.valueOf(i11), stringArray2[i12 % stringArray2.length]);
            }
            String[] stringArray3 = appContext.getResources().getStringArray(AbstractC16775v.array_days_of_week_short);
            String[] stringArray4 = appContext.getResources().getStringArray(AbstractC16775v.array_months_short);
            return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_short), stringArray3[calendar.get(7) - 1], Integer.valueOf(i11), stringArray4[i12 % stringArray4.length]);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: I0 */
    public static String m119198I0(long j11, long j12) {
        long j13 = j12 - j11;
        String str = "";
        if (j13 <= 0) {
            return "";
        }
        if (j13 / 1000 > 0 && j13 < 60000) {
            return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_minute), 1, "");
        }
        if (j13 >= 60000 && j13 < 3600000) {
            long j14 = j13 / 60000;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_minute);
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(j14);
            if (j14 > 1) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr[1] = str;
            return String.format(m118743r0, objArr);
        }
        if (j13 >= 3600000 && j13 < 86400000) {
            long j15 = j13 / 3600000;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hour_time);
            Object[] objArr2 = new Object[2];
            objArr2[0] = Long.valueOf(j15);
            if (j15 > 1) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr2[1] = str;
            return String.format(m118743r02, objArr2);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j12);
        m119301w1(calendar);
        long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) / 86400000;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_day);
        Object[] objArr3 = new Object[2];
        objArr3[0] = Long.valueOf(timeInMillis2);
        if (timeInMillis2 > 1) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        }
        objArr3[1] = str;
        return String.format(m118743r03, objArr3);
    }

    /* renamed from: J */
    public static String m119199J(Calendar calendar, boolean z11, boolean z12, boolean z13) {
        String str;
        String str2;
        String str3;
        try {
            Context appContext = MainApplication.getAppContext();
            if (z12 && m119247e1(calendar.getTimeInMillis())) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
            }
            int[] m12344g = AbstractC2353j.m12344g(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
            int i11 = m12344g[0];
            int i12 = m12344g[1];
            int i13 = m12344g[2];
            int i14 = m12344g[3];
            if (z11) {
                String[] stringArray = appContext.getResources().getStringArray(AbstractC16775v.array_months_lunar_full);
                String[] stringArray2 = appContext.getResources().getStringArray(AbstractC16775v.array_years_lunar);
                String[] stringArray3 = appContext.getResources().getStringArray(AbstractC16775v.array_days_of_week_full);
                if (z13) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_lunar_full);
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(i11);
                    objArr[1] = stringArray[(i12 - 1) % stringArray.length];
                    if (i14 != 1) {
                        str3 = "";
                    } else {
                        str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_lunar_leap_full);
                    }
                    objArr[2] = str3;
                    objArr[3] = stringArray2[((i13 + stringArray2.length) - 4) % stringArray2.length];
                    objArr[4] = stringArray3[calendar.get(7) - 1];
                    return String.format(m118743r0, objArr);
                }
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_lunar_mini_full);
                Object[] objArr2 = new Object[4];
                objArr2[0] = Integer.valueOf(i11);
                objArr2[1] = stringArray[(i12 - 1) % stringArray.length];
                if (i14 != 1) {
                    str2 = "";
                } else {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_lunar_leap_full);
                }
                objArr2[2] = str2;
                objArr2[3] = stringArray2[((i13 + stringArray2.length) - 4) % stringArray2.length];
                return String.format(m118743r02, objArr2);
            }
            String[] stringArray4 = appContext.getResources().getStringArray(AbstractC16775v.array_months_lunar_short);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_date_string_lunar_short);
            Object[] objArr3 = new Object[3];
            objArr3[0] = Integer.valueOf(i11);
            objArr3[1] = stringArray4[(i12 - 1) % stringArray4.length];
            if (i14 != 1) {
                str = "";
            } else {
                str = "+";
            }
            objArr3[2] = str;
            return String.format(m118743r03, objArr3);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: J0 */
    public static String m119200J0(int i11) {
        Object obj;
        Object obj2;
        if (i11 == 0) {
            return "00:00";
        }
        if (i11 <= 0) {
            return "";
        }
        int i12 = i11 / 1000;
        int i13 = i12 / 60;
        int i14 = i12 % 60;
        if (i14 == 0) {
            i14 = 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        if (i13 > 9) {
            obj = Integer.valueOf(i13);
        } else {
            obj = "0" + i13;
        }
        sb2.append(obj);
        sb2.append(":");
        if (i14 > 9) {
            obj2 = Integer.valueOf(i14);
        } else {
            obj2 = "0" + i14;
        }
        sb2.append(obj2);
        return sb2.toString();
    }

    /* renamed from: K */
    public static String m119201K(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124257c());
        return c23791a.m124257c().format(date);
    }

    /* renamed from: K0 */
    public static String m119202K0(long j11, boolean z11) {
        if (z11) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H:mm", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.format(Long.valueOf(j11));
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("h:mm aa", Locale.getDefault());
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat2.format(Long.valueOf(j11));
    }

    /* renamed from: L */
    public static String m119203L(Calendar calendar, boolean z11) {
        try {
            return m119187D(calendar) + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time) + " " + m119202K0(calendar.getTimeInMillis(), z11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: L0 */
    public static String m119204L0(long j11) {
        StringBuilder sb2 = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        sb2.append(m119202K0(j11, true));
        sb2.append(", ");
        sb2.append(m119190E0(calendar, true));
        return sb2.toString();
    }

    /* renamed from: M */
    public static String m119205M(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124260f());
        return c23791a.m124260f().format(date);
    }

    /* renamed from: M0 */
    public static String m119206M0(Context context, long j11) {
        StringBuilder sb2 = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j11);
        m119301w1(calendar);
        long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) / 86400000;
        if (timeInMillis2 == 0) {
            sb2.append(context.getString(AbstractC8020f0.str_today));
        } else if (timeInMillis2 == 1) {
            sb2.append(context.getString(AbstractC8020f0.str_tomorrow));
        } else {
            sb2.append(context.getResources().getStringArray(AbstractC16775v.array_days_of_week_full)[calendar.get(7) - 1]);
            sb2.append(", ");
            sb2.append(m119190E0(calendar, true));
        }
        sb2.append(" ");
        sb2.append(context.getString(AbstractC8020f0.str_at_time));
        sb2.append(" ");
        sb2.append(m119202K0(j11, true));
        return sb2.toString();
    }

    /* renamed from: N */
    public static String m119207N(long j11) {
        SimpleDateFormat m124257c;
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1);
        calendar.setTimeInMillis(j11);
        int i12 = calendar.get(1);
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124259e());
        m119268l1(c23791a.m124257c());
        if (i12 == i11) {
            m124257c = c23791a.m124259e();
        } else {
            m124257c = c23791a.m124257c();
        }
        return m124257c.format(date);
    }

    /* renamed from: N0 */
    public static String m119208N0(long j11, long j12) {
        return m119210O0(j11, j12, Boolean.FALSE, Boolean.TRUE);
    }

    /* renamed from: O */
    public static String m119209O(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124259e());
        return c23791a.m124259e().format(date);
    }

    /* renamed from: O0 */
    public static String m119210O0(long j11, long j12, Boolean bool, Boolean bool2) {
        long j13;
        String str;
        String str2 = "";
        if (j12 <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        if (bool2.booleanValue()) {
            m119301w1(calendar);
        }
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j12);
        if (bool2.booleanValue()) {
            m119301w1(calendar);
        }
        long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) / 86400000;
        if (timeInMillis2 > 0) {
            return "";
        }
        if (timeInMillis2 == 0) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_today);
        }
        if (timeInMillis2 == -1) {
            return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_mini_profile_day_ago), Long.valueOf(Math.abs(timeInMillis2)), "");
        }
        if (timeInMillis2 > -30) {
            return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_mini_profile_day_ago), Long.valueOf(Math.abs(timeInMillis2)), AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s));
        }
        if (timeInMillis2 > -365) {
            long j14 = timeInMillis2 / 30;
            long abs = Math.abs(j14);
            if (abs == 1) {
                return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_mini_profile_month_ago), Long.valueOf(abs), "");
            }
            return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_mini_profile_month_ago), Long.valueOf(Math.abs(j14)), AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s));
        }
        long abs2 = Math.abs(timeInMillis2) / 365;
        if (bool.booleanValue()) {
            j13 = (long) Math.ceil((((float) (Math.abs(timeInMillis2) - (365 * abs2))) * 1.0f) / 30.0f);
        } else {
            j13 = 0;
        }
        if (j13 == 0) {
            String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_mini_profile_year_ago);
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(abs2);
            if (abs2 > 1) {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr[1] = str2;
            return String.format(string, objArr);
        }
        String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_mini_profile_year_month_ago);
        Object[] objArr2 = new Object[4];
        objArr2[0] = Long.valueOf(abs2);
        if (abs2 <= 1) {
            str = "";
        } else {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        }
        objArr2[1] = str;
        objArr2[2] = Long.valueOf(j13);
        if (j13 > 1) {
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        }
        objArr2[3] = str2;
        return String.format(string2, objArr2);
    }

    /* renamed from: P */
    public static String m119211P(long j11) {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb2 = new StringBuilder();
        if (j11 >= 86400000) {
            int i11 = (int) (j11 / 86400000);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_day);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i11);
            if (i11 <= 1) {
                str4 = "";
            } else {
                str4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr[1] = str4;
            sb2.append(String.format(m118743r0, objArr));
            sb2.append(" ");
            j11 -= i11 * 86400000;
        }
        if (j11 >= 3600000 && j11 < 86400000) {
            int i12 = (int) (j11 / 3600000);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hour);
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(i12);
            if (i12 <= 1) {
                str3 = "";
            } else {
                str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr2[1] = str3;
            sb2.append(String.format(m118743r02, objArr2));
            sb2.append(" ");
            j11 -= i12 * 3600000;
        }
        if (j11 >= 60000 && j11 < 3600000) {
            int i13 = (int) (j11 / 60000);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_minute);
            Object[] objArr3 = new Object[2];
            objArr3[0] = Integer.valueOf(i13);
            if (i13 <= 1) {
                str2 = "";
            } else {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr3[1] = str2;
            sb2.append(String.format(m118743r03, objArr3));
            sb2.append(" ");
            j11 -= i13 * 60000;
        }
        if (j11 >= 1000 && j11 < 60000) {
            int i14 = (int) (j11 / 1000);
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_second);
            Object[] objArr4 = new Object[2];
            objArr4[0] = Integer.valueOf(i14);
            if (i14 <= 1) {
                str = "";
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr4[1] = str;
            sb2.append(String.format(m118743r04, objArr4));
        }
        if (j11 >= 0 && sb2.length() == 0) {
            sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_second), 1, ""));
        }
        return sb2.toString().trim();
    }

    /* renamed from: P0 */
    public static String m119212P0(long j11, boolean z11) {
        if (z11) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.format(Long.valueOf(j11));
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm aa", Locale.getDefault());
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat2.format(Long.valueOf(j11));
    }

    /* renamed from: Q */
    public static String m119213Q(long j11, boolean z11) {
        return m119215R(j11, z11, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x007c  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m119214Q0(long j11, boolean z11, boolean z12) {
        StringBuilder sb2;
        StringBuilder sb3;
        Calendar calendar = Calendar.getInstance();
        if (z12) {
            calendar.setTimeInMillis(C23793c.m124316k().mo124311f());
            m119301w1(calendar);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            m119301w1(calendar);
            long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) / 86400000;
            if (timeInMillis2 == 0) {
                sb3 = new StringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_today));
                sb3.append(", ");
                sb3.append(m119243d0(calendar));
            } else if (timeInMillis2 == 1) {
                sb3 = new StringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tomorrow));
                sb3.append(", ");
                sb3.append(m119243d0(calendar));
            } else {
                sb2 = new StringBuilder(m119191F(calendar, true, false));
            }
            if (z11) {
                sb3.append(" ");
                sb3.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time));
                sb3.append(" ");
                sb3.append(m119202K0(j11, true));
            }
            return sb3.toString();
        }
        calendar.setTimeInMillis(j11);
        sb2 = new StringBuilder(m119191F(calendar, true, false));
        sb3 = sb2;
        if (z11) {
        }
        return sb3.toString();
    }

    /* renamed from: R */
    public static String m119215R(long j11, boolean z11, boolean z12) {
        Calendar.getInstance().setTimeInMillis(j11);
        return m119217S(j11, z11, z12, !m119244d1(r0, Calendar.getInstance()));
    }

    /* renamed from: R0 */
    public static String m119216R0(long j11) {
        if (j11 <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C23793c.m124316k().mo124314i());
        m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j11);
        m119301w1(calendar);
        long timeInMillis2 = (timeInMillis - calendar.getTimeInMillis()) / 86400000;
        if (timeInMillis2 == 0) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
        }
        if (timeInMillis2 == 1) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_yesterday);
        }
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124255a());
        return c23791a.m124255a().format(new Date(j11));
    }

    /* renamed from: S */
    public static String m119217S(long j11, boolean z11, boolean z12, boolean z13) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return m119221U(calendar, z11, z12, z13, true);
    }

    /* renamed from: S0 */
    public static String m119218S0() {
        try {
            String format = new SimpleDateFormat("Z").format(Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.getDefault()).getTime());
            if (format.length() == 5) {
                return format.substring(0, 3) + ":" + format.substring(3, 5);
            }
            return format;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: T */
    public static String m119219T(long j11, boolean z11, boolean z12, boolean z13, boolean z14) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return m119221U(calendar, z11, z12, z13, z14);
    }

    /* renamed from: T0 */
    public static String m119220T0(long j11, Calendar calendar, Calendar calendar2) {
        boolean z11;
        int i11;
        String str = "";
        if (j11 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            long mo124314i = C23793c.m124316k().mo124314i();
            long abs = Math.abs(mo124314i - j11);
            boolean z12 = false;
            if (abs / 3600000 < 24) {
                z11 = true;
            } else {
                z11 = false;
            }
            calendar.setTimeInMillis(j11);
            calendar2.setTimeInMillis(mo124314i);
            if (z11) {
                long j12 = abs / 60000;
                if (j12 < 60) {
                    if (j12 <= 1) {
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.lessThanOneMinute));
                    } else {
                        sb2.append(j12);
                        sb2.append(" ");
                        sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.minute), AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s)));
                    }
                } else {
                    long j13 = abs / 3600000;
                    sb2.append(j13);
                    sb2.append(" ");
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hour);
                    Object[] objArr = new Object[1];
                    if (j13 > 1) {
                        i11 = AbstractC8020f0.str_more_s;
                    } else {
                        i11 = AbstractC8020f0.str_single_form;
                    }
                    objArr[0] = AbstractC23136l9.m118743r0(i11);
                    sb2.append(String.format(m118743r0, objArr));
                }
            } else {
                long j14 = abs / 86400000;
                if (j14 == 6) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(mo124314i - 518400000);
                    if (calendar3.get(6) != calendar.get(6)) {
                        z12 = true;
                    }
                }
                if (mo124314i >= j11 && j14 <= 6 && !z12) {
                    String str2 = (String) m119188D0().get(calendar.get(7));
                    if (str2 != null) {
                        str = str2;
                    }
                    sb2.append(str);
                }
                sb2.append(m119225W(calendar2.get(1), calendar.get(1), j11));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return sb2.toString();
    }

    /* renamed from: U */
    public static String m119221U(Calendar calendar, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m119195H(calendar, z14, z12, false, z13) + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time) + " " + m119202K0(calendar.getTimeInMillis(), z11);
    }

    /* renamed from: U0 */
    public static String m119222U0(long j11, boolean z11) {
        return m119224V0(j11, z11, Calendar.getInstance(), Calendar.getInstance(), false);
    }

    /* renamed from: V */
    public static String m119223V(long j11, boolean z11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return m119199J(calendar, true, true, true) + " " + MainApplication.getAppContext().getString(AbstractC8020f0.str_at_time) + " " + m119202K0(calendar.getTimeInMillis(), z11);
    }

    /* renamed from: V0 */
    public static String m119224V0(long j11, boolean z11, Calendar calendar, Calendar calendar2, boolean z12) {
        boolean z13;
        String m119201K;
        int i11;
        String m119201K2;
        int i12;
        String m119201K3;
        int i13;
        if (j11 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            long mo124314i = C23793c.m124316k().mo124314i();
            if (mo124314i > j11) {
                z13 = true;
            } else {
                z13 = false;
            }
            long abs = Math.abs(mo124314i - j11);
            calendar.setTimeInMillis(j11);
            calendar2.setTimeInMillis(mo124314i);
            int i14 = calendar.get(1);
            int i15 = calendar2.get(1);
            int i16 = calendar.get(6);
            int i17 = calendar2.get(6);
            if (z13 && i14 == i15) {
                if (i16 == i17) {
                    long j12 = abs / 60000;
                    if (j12 < 60) {
                        if (j12 <= 1) {
                            sb2.append(" ");
                            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.lessThanOneMinute));
                        } else {
                            sb2.append(j12);
                            sb2.append(" ");
                            sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.minute), AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s)));
                        }
                    } else {
                        long j13 = abs / 3600000;
                        sb2.append(j13);
                        sb2.append(" ");
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hour);
                        Object[] objArr = new Object[1];
                        if (j13 > 1) {
                            i13 = AbstractC8020f0.str_more_s;
                        } else {
                            i13 = AbstractC8020f0.str_single_form;
                        }
                        objArr[0] = AbstractC23136l9.m118743r0(i13);
                        sb2.append(String.format(m118743r0, objArr));
                    }
                    if (z12) {
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ago));
                    }
                } else if (i17 > i16) {
                    int i18 = i17 - i16;
                    if (i18 > 5) {
                        if (z11) {
                            m119201K3 = m119207N(j11);
                        } else {
                            m119201K3 = m119201K(j11);
                        }
                        sb2.append(m119201K3);
                    } else {
                        sb2.append(i18);
                        sb2.append(" ");
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.day);
                        Object[] objArr2 = new Object[1];
                        if (i18 > 1) {
                            i12 = AbstractC8020f0.str_more_s;
                        } else {
                            i12 = AbstractC8020f0.str_single_form;
                        }
                        objArr2[0] = AbstractC23136l9.m118743r0(i12);
                        sb2.append(String.format(m118743r02, objArr2));
                        if (z12) {
                            sb2.append(" ");
                            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ago));
                        }
                    }
                } else {
                    int i19 = i16 - i17;
                    if (i19 > 5) {
                        if (z11) {
                            m119201K2 = m119207N(j11);
                        } else {
                            m119201K2 = m119201K(j11);
                        }
                        sb2.append(m119201K2);
                    } else if (i19 > 1) {
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.moreThanOneDay));
                    }
                }
            } else if (i14 == i15 && i16 == i17) {
                long j14 = abs / 60000;
                if (j14 < 60) {
                    if (j14 <= 1) {
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.lessThanOneMinute));
                    } else {
                        sb2.append(j14);
                        sb2.append(" ");
                        sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.minute), AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s)));
                    }
                } else {
                    long j15 = abs / 3600000;
                    sb2.append(j15);
                    sb2.append(" ");
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.hour);
                    Object[] objArr3 = new Object[1];
                    if (j15 > 1) {
                        i11 = AbstractC8020f0.str_more_s;
                    } else {
                        i11 = AbstractC8020f0.str_single_form;
                    }
                    objArr3[0] = AbstractC23136l9.m118743r0(i11);
                    sb2.append(String.format(m118743r03, objArr3));
                }
            } else {
                if (z11) {
                    m119201K = m119207N(j11);
                } else {
                    m119201K = m119201K(j11);
                }
                sb2.append(m119201K);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return sb2.toString();
    }

    /* renamed from: W */
    private static String m119225W(int i11, int i12, long j11) {
        SimpleDateFormat m124255a;
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124259e());
        m119268l1(c23791a.m124255a());
        if (i12 == i11) {
            m124255a = c23791a.m124259e();
        } else {
            m124255a = c23791a.m124255a();
        }
        return m124255a.format(date);
    }

    /* renamed from: W0 */
    public static String m119226W0(long j11, boolean z11, boolean z12) {
        return m119224V0(j11, z11, Calendar.getInstance(), Calendar.getInstance(), z12);
    }

    /* renamed from: X */
    public static String m119227X(long j11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        Date date = new Date(j11);
        m119268l1(simpleDateFormat);
        return simpleDateFormat.format(date);
    }

    /* renamed from: X0 */
    public static String m119228X0(int i11, long j11, long j12, String str, boolean z11) {
        boolean z12;
        String m119249f0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j12);
        m119301w1(calendar);
        if ((calendar.getTimeInMillis() - timeInMillis) / 86400000 < 0) {
            if (i11 != 2) {
                if (i11 != 4) {
                    m119249f0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder);
                } else {
                    m119249f0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_anniversary_prefix);
                }
            } else {
                m119249f0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_title);
            }
        } else {
            if (z11 && j11 / 1000 < j12 / 1000) {
                z12 = true;
            } else {
                z12 = false;
            }
            m119249f0 = m119249f0(j11, j12, z12);
        }
        return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_format_time_title_OA_event_2), m119249f0, str);
    }

    /* renamed from: Y */
    public static SparseArray m119229Y() {
        if (f112335w == null) {
            f112335w = new SparseArray();
            m119274n1();
        }
        return f112335w;
    }

    /* renamed from: Y0 */
    public static int m119230Y0(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return calendar.get(1);
    }

    /* renamed from: Z */
    public static int m119231Z(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return calendar.get(5);
    }

    /* renamed from: Z0 */
    public static void m119232Z0() {
        if (f112313a == null) {
            f112313a = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_seconds_ago);
        }
        if (f112314b == null) {
            f112314b = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_minutes_ago);
        }
        if (f112315c == null) {
            f112315c = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_hours_ago);
        }
        if (f112316d == null) {
            f112316d = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_days_ago);
        }
        if (f112317e == null) {
            f112317e = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_today);
        }
        if (f112318f == null) {
            f112318f = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_yesterday);
        }
        if (f112319g == null) {
            f112319g = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        }
        if (f112320h == null) {
            f112320h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_single_form);
        }
    }

    /* renamed from: a */
    public static int m119233a(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) > calendar2.get(0)) {
                return 1;
            }
            if (calendar.get(0) < calendar2.get(0) || calendar.get(1) < calendar2.get(1)) {
                return -1;
            }
            if (calendar.get(1) > calendar2.get(1)) {
                return 1;
            }
            if (calendar.get(6) < calendar2.get(6)) {
                return -1;
            }
            if (calendar.get(6) <= calendar2.get(6)) {
                return 0;
            }
            return 1;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: a0 */
    public static int m119234a0() {
        int i11 = Calendar.getInstance().get(7);
        if (i11 == 2) {
            return 0;
        }
        if (i11 == 3) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 5) {
            return 3;
        }
        if (i11 == 6) {
            return 4;
        }
        if (i11 == 7) {
            return 5;
        }
        if (i11 == 1) {
            return 6;
        }
        return -1;
    }

    /* renamed from: a1 */
    public static boolean m119235a1(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) != calendar2.get(0) || calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: b */
    public static int m119236b(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) > calendar2.get(0)) {
                return 1;
            }
            if (calendar.get(0) < calendar2.get(0) || calendar.get(1) < calendar2.get(1)) {
                return -1;
            }
            if (calendar.get(1) <= calendar2.get(1)) {
                return 0;
            }
            return 1;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: b0 */
    public static int m119237b0(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return calendar.get(6);
    }

    /* renamed from: b1 */
    public static boolean m119238b1(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) != calendar2.get(0) || calendar.get(2) != calendar2.get(2) || calendar.get(1) != calendar2.get(1)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: c */
    public static long m119239c(int i11) {
        if (i11 <= 0) {
            return 0L;
        }
        return i11 * 86400000;
    }

    /* renamed from: c0 */
    public static String m119240c0(Calendar calendar) {
        return String.format(Locale.US, "%1$02d/%2$02d/%3$02d", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)));
    }

    /* renamed from: c1 */
    public static boolean m119241c1(Calendar calendar, Calendar calendar2) {
        if (calendar.getTimeZone().getRawOffset() == calendar2.getTimeZone().getRawOffset()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static long m119242d(long j11) {
        return j11 / 86400000;
    }

    /* renamed from: d0 */
    public static String m119243d0(Calendar calendar) {
        return m119246e0(calendar, !m119244d1(calendar, Calendar.getInstance()));
    }

    /* renamed from: d1 */
    public static boolean m119244d1(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) != calendar2.get(0) || calendar.get(1) != calendar2.get(1)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: e */
    public static String m119245e(long j11) {
        return m119249f0(System.currentTimeMillis(), j11, true);
    }

    /* renamed from: e0 */
    public static String m119246e0(Calendar calendar, boolean z11) {
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        String[] stringArray = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_full);
        if (z11) {
            return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_day_month_year), Integer.valueOf(i11), stringArray[i12 % stringArray.length], Integer.valueOf(i13));
        }
        return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_format_day_month), Integer.valueOf(i11), stringArray[i12 % stringArray.length]);
    }

    /* renamed from: e1 */
    public static boolean m119247e1(long j11) {
        Time time = new Time();
        time.set(j11);
        int i11 = time.year;
        int i12 = time.month;
        int i13 = time.monthDay;
        time.set(System.currentTimeMillis());
        if (i11 == time.year && i12 == time.month && i13 == time.monthDay) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static String m119248f(long j11) {
        AbstractC18070b abstractC18070b = f112337y;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) abstractC18070b.mo7484b();
        try {
            String format = simpleDateFormat.format(Long.valueOf(j11));
            abstractC18070b.mo7483a(simpleDateFormat);
            return format;
        } catch (Throwable th2) {
            f112337y.mo7483a(simpleDateFormat);
            throw th2;
        }
    }

    /* renamed from: f0 */
    public static String m119249f0(long j11, long j12, boolean z11) {
        boolean z12;
        String str;
        String str2;
        int i11;
        int i12;
        int i13;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j12);
        m119301w1(calendar);
        long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) / 86400000;
        long j13 = j12 - j11;
        long abs = Math.abs(j13);
        if (j13 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        String str3 = "";
        if (z11) {
            long j14 = abs / 1000;
            if (j14 > 0 && abs < 60000) {
                if (z12) {
                    i13 = AbstractC8020f0.str_second_ago;
                } else {
                    i13 = AbstractC8020f0.str_second_after;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(i13);
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(j14);
                if (j14 > 1) {
                    str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr[1] = str3;
                return String.format(m118743r0, objArr);
            }
        }
        if (z11 && abs >= 60000 && abs < 3600000) {
            long j15 = abs / 60000;
            if ((abs - (60000 * j15)) / 1000 > 30) {
                j15++;
            }
            if (z12) {
                i12 = AbstractC8020f0.str_minute_ago;
            } else {
                i12 = AbstractC8020f0.str_minute_after;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(i12);
            Object[] objArr2 = new Object[2];
            objArr2[0] = Long.valueOf(j15);
            if (j15 > 1) {
                str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr2[1] = str3;
            return String.format(m118743r02, objArr2);
        }
        if (z11 && abs >= 3600000 && abs < 86400000) {
            long j16 = abs / 3600000;
            long j17 = (abs - (3600000 * j16)) / 60000;
            if (j16 >= 12 && timeInMillis2 == 1) {
                return MainApplication.getAppContext().getString(AbstractC8020f0.str_tomorrow);
            }
            if (j17 > 30) {
                j16++;
            }
            if (z12) {
                i11 = AbstractC8020f0.str_hour_ago;
            } else {
                i11 = AbstractC8020f0.str_hour_after;
            }
            String m118743r03 = AbstractC23136l9.m118743r0(i11);
            Object[] objArr3 = new Object[2];
            objArr3[0] = Long.valueOf(j16);
            if (j16 > 1) {
                str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr3[1] = str3;
            return String.format(m118743r03, objArr3);
        }
        if (timeInMillis2 == 0) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_today);
        }
        if (timeInMillis2 == 1) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_tomorrow);
        }
        if (timeInMillis2 == -1) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_yesterday);
        }
        if (timeInMillis2 > 0) {
            if (timeInMillis2 < 365) {
                return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_in_n_days), Long.valueOf(Math.abs(timeInMillis2)));
            }
            if (timeInMillis2 < 394) {
                long abs2 = Math.abs(timeInMillis2) / 365;
                String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_count_in_n_years);
                Object[] objArr4 = new Object[2];
                objArr4[0] = Long.valueOf(abs2);
                if (abs2 > 1) {
                    str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr4[1] = str3;
                return String.format(string, objArr4);
            }
            long abs3 = Math.abs(timeInMillis2) / 365;
            long ceil = (long) Math.ceil((((float) (Math.abs(timeInMillis2) - (365 * abs3))) * 1.0f) / 30.0f);
            String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_count_in_n_years_n_months);
            Object[] objArr5 = new Object[4];
            objArr5[0] = Long.valueOf(abs3);
            if (abs3 <= 1) {
                str2 = "";
            } else {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr5[1] = str2;
            objArr5[2] = Long.valueOf(ceil);
            if (ceil > 1) {
                str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr5[3] = str3;
            return String.format(string2, objArr5);
        }
        if (timeInMillis2 > -365) {
            return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_n_days_ago), Long.valueOf(Math.abs(timeInMillis2)));
        }
        if (timeInMillis2 > -394) {
            long abs4 = Math.abs(timeInMillis2) / 365;
            String string3 = MainApplication.getAppContext().getString(AbstractC8020f0.str_count_year_ago);
            Object[] objArr6 = new Object[2];
            objArr6[0] = Long.valueOf(abs4);
            if (abs4 > 1) {
                str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            }
            objArr6[1] = str3;
            return String.format(string3, objArr6);
        }
        long abs5 = Math.abs(timeInMillis2) / 365;
        long ceil2 = (long) Math.ceil((((float) (Math.abs(timeInMillis2) - (365 * abs5))) * 1.0f) / 30.0f);
        String string4 = MainApplication.getAppContext().getString(AbstractC8020f0.str_count_year_month_ago);
        Object[] objArr7 = new Object[4];
        objArr7[0] = Long.valueOf(abs5);
        if (abs5 <= 1) {
            str = "";
        } else {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        }
        objArr7[1] = str;
        objArr7[2] = Long.valueOf(ceil2);
        if (ceil2 > 1) {
            str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        }
        objArr7[3] = str3;
        return String.format(string4, objArr7);
    }

    /* renamed from: f1 */
    public static boolean m119250f1(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j11);
        m119301w1(calendar);
        if ((calendar.getTimeInMillis() - timeInMillis) / 86400000 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static String m119251g(long j11) {
        String format;
        try {
            if (DateUtils.isToday(j11)) {
                C23791a c23791a = C23791a.f114936B;
                m119268l1(c23791a.m124265k());
                format = c23791a.m124265k().format(Long.valueOf(j11));
            } else {
                C23791a c23791a2 = C23791a.f114936B;
                m119268l1(c23791a2.m124272r());
                format = c23791a2.m124272r().format(Long.valueOf(j11));
            }
            return format;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: g0 */
    public static int m119252g0(TimeZone timeZone, TimeZone timeZone2) {
        return timeZone.getRawOffset() - timeZone2.getRawOffset();
    }

    /* renamed from: g1 */
    public static String m119253g1(long j11) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Formatter formatter = new Formatter(sb2, Locale.getDefault());
        sb2.setLength(0);
        long j12 = j11 / 3600;
        long j13 = j11 / 60;
        Object[] objArr = {Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j13 % 60), Long.valueOf(j11), Long.valueOf(j11 % 60)};
        if (j12 != 0) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_bubble_duration_format_hours);
        } else {
            str = "";
        }
        String formatter2 = formatter.format(((str + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_bubble_duration_format_minutes)) + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_bubble_duration_format_sec)).trim(), objArr).toString();
        formatter.close();
        return formatter2;
    }

    /* renamed from: h */
    public static String m119254h(long j11, Calendar calendar, Calendar calendar2) {
        String sb2;
        try {
            if (DateUtils.isToday(j11)) {
                C23791a c23791a = C23791a.f114936B;
                m119268l1(c23791a.m124265k());
                sb2 = c23791a.m124265k().format(Long.valueOf(j11));
            } else {
                StringBuilder sb3 = new StringBuilder();
                long mo124314i = C23793c.m124316k().mo124314i();
                long abs = Math.abs(mo124314i - j11);
                calendar.setTimeInMillis(j11);
                calendar2.setTimeInMillis(mo124314i);
                long j12 = abs / 86400000;
                boolean z11 = false;
                if (j12 == 6) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(mo124314i - 518400000);
                    if (calendar3.get(6) != calendar.get(6)) {
                        z11 = true;
                    }
                }
                if (mo124314i >= j11 && j12 <= 6 && !z11) {
                    String str = (String) m119188D0().get(calendar.get(7));
                    if (str == null) {
                        str = "";
                    }
                    sb3.append(str);
                    sb2 = sb3.toString();
                }
                sb3.append(m119225W(calendar2.get(1), calendar.get(1), j11));
                sb2 = sb3.toString();
            }
            return sb2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: h0 */
    public static int m119255h0(TimeZone timeZone, TimeZone timeZone2, long j11) {
        int rawOffset;
        int rawOffset2;
        if (timeZone.useDaylightTime()) {
            rawOffset = timeZone.getOffset(j11);
        } else {
            rawOffset = timeZone.getRawOffset();
        }
        if (timeZone2.useDaylightTime()) {
            rawOffset2 = timeZone2.getOffset(j11);
        } else {
            rawOffset2 = timeZone2.getRawOffset();
        }
        return rawOffset - rawOffset2;
    }

    /* renamed from: h1 */
    public static String m119256h1(long j11) {
        StringBuilder sb2 = new StringBuilder();
        Formatter formatter = new Formatter(sb2, Locale.getDefault());
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_call_duration_format_minute);
        sb2.setLength(0);
        long j12 = j11 / 60;
        String formatter2 = formatter.format(m118743r0, Long.valueOf(j11 / 3600), Long.valueOf(j12), Long.valueOf(j12 % 60), Long.valueOf(j11), Long.valueOf(j11 % 60)).toString();
        formatter.close();
        return formatter2;
    }

    /* renamed from: i */
    private static String m119257i(int i11) {
        try {
            if (i11 > 0) {
                C23791a c23791a = C23791a.f114936B;
                m119268l1(c23791a.m124271q());
                m119268l1(c23791a.m124266l());
                m119268l1(c23791a.m124275u());
                m119268l1(c23791a.m124267m());
                m119259i1();
                Date date = new Date(i11 * 1000);
                if (f112330r.equalsIgnoreCase("vi".toLowerCase())) {
                    Calendar.getInstance().setTime(date);
                    return String.format(f112332t, Integer.valueOf(Integer.parseInt(c23791a.m124271q().format(date))), Integer.valueOf(Integer.parseInt(c23791a.m124266l().format(date))), Integer.valueOf(Integer.parseInt(c23791a.m124275u().format(date))));
                }
                return c23791a.m124267m().format(date);
            }
            throw new Exception();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i0 */
    public static String m119258i0(double d11) {
        if (d11 >= 0.0d) {
            int i11 = (int) d11;
            int i12 = i11 / 3600;
            int i13 = ((int) (d11 % 3600.0d)) / 60;
            int i14 = i11 % 60;
            if (i12 == 0) {
                return String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i14));
            }
            return String.format("%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        return null;
    }

    /* renamed from: i1 */
    private static void m119259i1() {
        if (f112333u == null) {
            f112333u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_header_time);
        }
        if (f112332t == null) {
            f112332t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_social_memory);
        }
        if (f112330r == null) {
            f112330r = AbstractC18458a.f93019a;
        }
    }

    /* renamed from: j */
    public static String m119260j(long j11, boolean z11) {
        if (z11) {
            j11 /= 1000;
        }
        return m119257i((int) j11);
    }

    /* renamed from: j0 */
    public static long m119261j0(int i11, long j11) {
        long j12 = 0;
        if (i11 == 0) {
            return 0L;
        }
        int i12 = 0;
        while (i12 < i11) {
            i12++;
            long j13 = j11;
            j11 = j12 + j11;
            j12 = j13;
        }
        return j11;
    }

    /* renamed from: j1 */
    public static void m119262j1() {
        if (f112322j == null) {
            f112322j = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_at_hh_mm);
        }
        if (f112323k == null) {
            f112323k = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_yesterday);
        }
        if (f112324l == null) {
            f112324l = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_minute);
        }
        if (f112325m == null) {
            f112325m = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_minutes);
        }
        if (f112326n == null) {
            f112326n = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_hour);
        }
        if (f112327o == null) {
            f112327o = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_hours);
        }
        if (f112328p == null) {
            f112328p = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_just_now);
        }
        if (f112329q == null) {
            f112329q = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_same_day);
        }
    }

    /* renamed from: k */
    public static String m119263k(long j11) {
        Date date = new Date(j11);
        Date date2 = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        Date time = calendar.getTime();
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124257c());
        String format = c23791a.m124257c().format(date);
        if (format.equals(c23791a.m124257c().format(date2))) {
            return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_today);
        }
        if (format.equals(c23791a.m124257c().format(time))) {
            return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_yesterday);
        }
        m119268l1(c23791a.m124273s());
        return c23791a.m124273s().format(date);
    }

    /* renamed from: k0 */
    public static String m119264k0() {
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(AbstractC23306f.m120579F1().mo124314i()));
    }

    /* renamed from: k1 */
    private static void m119265k1() {
        if (f112321i == null) {
            f112321i = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_at_hh_mm);
        }
        if (f112330r == null) {
            f112330r = AbstractC18458a.f93019a;
        }
        if (f112331s == null) {
            f112331s = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_short);
        }
    }

    /* renamed from: l */
    public static String m119266l(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124280z());
        return c23791a.m124280z().format(date);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:            if (r7 == 2) goto L73;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:            return "";     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:            return java.lang.String.format(me0.AbstractC23160o0.f112321i, nh0.C23791a.f114936B.m124272r().format(r8), r10);     */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m119267l0(int i11, Date date, int i12, String str) {
        try {
            m119265k1();
            if (!f112330r.equalsIgnoreCase("vi".toLowerCase()) && !f112330r.equalsIgnoreCase("my".toLowerCase())) {
                if (!f112330r.equalsIgnoreCase("en".toLowerCase()) && !f112330r.equalsIgnoreCase("en".toLowerCase())) {
                    return "";
                }
                String[] strArr = f112331s;
                if (strArr != null && strArr.length != 0) {
                    C23791a c23791a = C23791a.f114936B;
                    String format = String.format("%s %d", f112331s[Integer.parseInt(c23791a.m124266l().format(date)) - 1], Integer.valueOf(Integer.parseInt(c23791a.m124271q().format(date))));
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return "";
                        }
                        return String.format(f112321i, format, str);
                    }
                    return String.format("%s, %d", format, Integer.valueOf(i12));
                }
                throw new Exception();
            }
            return C23791a.f114936B.m124273s().format(date);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: l1 */
    public static void m119268l1(DateFormat dateFormat) {
        TimeZone timeZone;
        try {
            if (Calendar.getInstance() != null) {
                timeZone = Calendar.getInstance().getTimeZone();
            } else {
                timeZone = null;
            }
            if (timeZone != null) {
                dateFormat.setTimeZone(timeZone);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static String m119269m(Context context, int i11) {
        String str = "";
        if (i11 == 0) {
            return "";
        }
        if (f112319g == null) {
            f112319g = context.getString(AbstractC8020f0.str_more_s);
        }
        if (f112320h == null) {
            f112320h = context.getString(AbstractC8020f0.str_single_form);
        }
        if (f112328p == null) {
            f112328p = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_just_now);
        }
        int mo124311f = ((int) (C23793c.m124316k().mo124311f() / 1000)) - i11;
        int m114926e = C22013a0.m114926e();
        StringBuilder sb2 = new StringBuilder();
        if (mo124311f < 60) {
            sb2.append(f112328p);
            return sb2.toString();
        }
        if (mo124311f < 3600) {
            int i12 = mo124311f / 60;
            sb2.append(String.format(context.getString(AbstractC8020f0.str_story_count_down_time_minute), Integer.valueOf(i12)));
            if (i12 > 1) {
                str = f112319g;
            }
            sb2.append(str);
            return sb2.toString();
        }
        if (mo124311f < m114926e) {
            int i13 = mo124311f / 3600;
            sb2.append(String.format(context.getString(AbstractC8020f0.str_story_count_down_time_hour), Integer.valueOf(i13)));
            if (i13 > 1) {
                str = f112319g;
            }
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append(String.format(context.getString(AbstractC8020f0.str_story_count_down_time_hour), Integer.valueOf(m114926e / 3600)));
        sb2.append(f112319g);
        return sb2.toString();
    }

    /* renamed from: m0 */
    public static String m119270m0(long j11) {
        return m119273n0(j11, false);
    }

    /* renamed from: m1 */
    public static void m119271m1() {
        m119274n1();
        m119277o1();
        f112313a = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_seconds_ago);
        f112314b = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_minutes_ago);
        f112315c = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_hours_ago);
        f112316d = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_days_ago);
        f112317e = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_today);
        f112318f = AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_yesterday);
        f112319g = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
        f112320h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_single_form);
        f112321i = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_at_hh_mm);
        f112322j = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_at_hh_mm);
        f112323k = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_yesterday);
        f112324l = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_minute);
        f112325m = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_minutes);
        f112326n = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_hour);
        f112327o = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_hours);
        f112328p = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_just_now);
        f112329q = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_same_day);
        f112331s = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_short);
        f112330r = AbstractC18458a.f93019a;
        f112332t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_post_social_memory);
        f112333u = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_header_time);
    }

    /* renamed from: n */
    public static String m119272n(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        String str = "";
        if (i11 > 0) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(i11);
                sb2.append(" ");
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.day);
                Object[] objArr = new Object[1];
                if (i11 > 1) {
                    i15 = AbstractC8020f0.str_more_s;
                } else {
                    i15 = AbstractC8020f0.str_single_form;
                }
                objArr[0] = AbstractC23136l9.m118743r0(i15);
                sb2.append(String.format(m118743r0, objArr));
                str = sb2.toString();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return "";
            }
        }
        if (i12 > 0 || (!str.isEmpty() && (i13 > 0 || i14 > 0))) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(i12);
            sb3.append(" ");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.hour);
            Object[] objArr2 = new Object[1];
            if (i12 > 1) {
                i16 = AbstractC8020f0.str_more_s;
            } else {
                i16 = AbstractC8020f0.str_single_form;
            }
            objArr2[0] = AbstractC23136l9.m118743r0(i16);
            sb3.append(String.format(m118743r02, objArr2));
            str = sb3.toString();
        }
        if (i13 > 0 || (!str.isEmpty() && i14 > 0)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(i13);
            sb4.append(" ");
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.minute);
            Object[] objArr3 = new Object[1];
            if (i13 > 1) {
                i17 = AbstractC8020f0.str_more_s;
            } else {
                i17 = AbstractC8020f0.str_single_form;
            }
            objArr3[0] = AbstractC23136l9.m118743r0(i17);
            sb4.append(String.format(m118743r03, objArr3));
            str = sb4.toString();
        }
        if (i14 > 0 || str.isEmpty()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(i14);
            sb5.append(" ");
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.second);
            Object[] objArr4 = new Object[1];
            if (i14 > 1) {
                i18 = AbstractC8020f0.str_more_s;
            } else {
                i18 = AbstractC8020f0.str_single_form;
            }
            objArr4[0] = AbstractC23136l9.m118743r0(i18);
            sb5.append(String.format(m118743r04, objArr4));
            return sb5.toString();
        }
        return str;
    }

    /* renamed from: n0 */
    public static String m119273n0(long j11, boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        if (j11 <= 0) {
            return "";
        }
        try {
            long mo124314i = C23793c.m124316k().mo124314i();
            long abs = Math.abs(mo124314i - j11) / 1000;
            m119232Z0();
            if (z11 && abs >= 0 && abs < 60) {
                String str5 = f112313a;
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(abs);
                if (abs > 1) {
                    str4 = f112319g;
                } else {
                    str4 = f112320h;
                }
                objArr[1] = str4;
                return String.format(str5, objArr);
            }
            if (abs >= 0 && abs < 3600) {
                int round = Math.round((float) (abs / 60));
                if (round == 0) {
                    round = 1;
                }
                String str6 = f112314b;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(round);
                if (round > 1) {
                    str3 = f112319g;
                } else {
                    str3 = f112320h;
                }
                objArr2[1] = str3;
                return String.format(str6, objArr2);
            }
            if (abs >= 3600 && abs < 86400) {
                int round2 = Math.round((float) (abs / 3600));
                String str7 = f112315c;
                Object[] objArr3 = new Object[2];
                objArr3[0] = Integer.valueOf(round2);
                if (round2 > 1) {
                    str2 = f112319g;
                } else {
                    str2 = f112320h;
                }
                objArr3[1] = str2;
                return String.format(str7, objArr3);
            }
            if (abs >= 86400 && abs < 604800) {
                int round3 = Math.round((float) (abs / 86400));
                String str8 = f112316d;
                Object[] objArr4 = new Object[2];
                objArr4[0] = Integer.valueOf(round3);
                if (round3 > 1) {
                    str = f112319g;
                } else {
                    str = f112320h;
                }
                objArr4[1] = str;
                return String.format(str8, objArr4);
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            calendar2.setTimeInMillis(mo124314i);
            if (calendar.get(1) == calendar2.get(1)) {
                return m119209O(j11);
            }
            return m119201K(j11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: n1 */
    public static synchronized void m119274n1() {
        synchronized (AbstractC23160o0.class) {
            SparseArray sparseArray = f112335w;
            if (sparseArray != null) {
                sparseArray.clear();
                f112335w.put(1, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_su));
                f112335w.put(2, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_mo));
                f112335w.put(3, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_tu));
                f112335w.put(4, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_we));
                f112335w.put(5, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_th));
                f112335w.put(6, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_fr));
                f112335w.put(7, AbstractC23136l9.m118743r0(AbstractC8020f0.dIntext_sa));
            }
        }
    }

    /* renamed from: o */
    public static String m119275o(long j11) {
        if (j11 <= 0) {
            return "";
        }
        try {
            int i11 = (int) (j11 / 86400000);
            long j12 = j11 % 86400000;
            int i12 = (int) (j12 / 3600000);
            long j13 = j12 % 3600000;
            return m119272n(i11, i12, (int) (j13 / 60000), (int) ((j13 % 60000) / 1000));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: o0 */
    public static String m119276o0(long j11) {
        Date date = new Date(j11);
        Date date2 = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        Date time = calendar.getTime();
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124257c());
        String format = c23791a.m124257c().format(date);
        if (format.equals(c23791a.m124257c().format(date2))) {
            m119268l1(c23791a.m124279y());
            return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_today) + c23791a.m124279y().format(date);
        }
        if (format.equals(c23791a.m124257c().format(time))) {
            m119268l1(c23791a.m124279y());
            return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_yesterday) + c23791a.m124279y().format(date);
        }
        m119268l1(c23791a.m124261g());
        return c23791a.m124261g().format(date);
    }

    /* renamed from: o1 */
    public static synchronized void m119277o1() {
        synchronized (AbstractC23160o0.class) {
            SparseArray sparseArray = f112334v;
            if (sparseArray != null) {
                sparseArray.clear();
                f112334v.put(2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_mon));
                f112334v.put(3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_tue));
                f112334v.put(4, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_wed));
                f112334v.put(5, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_thu));
                f112334v.put(6, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_fri));
                f112334v.put(7, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_sat));
                f112334v.put(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_short_day_text_sun));
            }
        }
    }

    /* renamed from: p */
    public static String m119278p(long j11) {
        if (j11 <= 0) {
            return "";
        }
        try {
            int i11 = (int) (j11 / 86400000);
            long j12 = j11 % 86400000;
            int i12 = 1;
            if (i11 > 0) {
                if (j12 <= 0) {
                    i12 = 0;
                }
                return m119272n(i11 + i12, 0, 0, 0);
            }
            int i13 = (int) (j12 / 3600000);
            long j13 = j12 % 3600000;
            if (i13 > 0) {
                if (j13 <= 0) {
                    i12 = 0;
                }
                return m119272n(0, i13 + i12, 0, 0);
            }
            int i14 = (int) (j13 / 60000);
            long j14 = j13 % 60000;
            if (i14 > 0) {
                if (j14 <= 0) {
                    i12 = 0;
                }
                return m119272n(0, 0, i14 + i12, 0);
            }
            int i15 = (int) (j14 / 1000);
            if (j14 % 1000 <= 0) {
                i12 = 0;
            }
            return m119272n(0, 0, 0, i15 + i12);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: p0 */
    public static String m119279p0(long j11) {
        try {
            Date date = new Date(j11);
            C23791a c23791a = C23791a.f114936B;
            m119268l1(c23791a.m124276v());
            return c23791a.m124276v().format(date);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: p1 */
    public static String m119280p1(long j11) {
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124278x());
        return c23791a.m124278x().format(new Date(j11));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x00c1. Please report as an issue. */
    /* renamed from: q */
    private static String m119281q(int i11) {
        String m119267l0;
        try {
            if (i11 > 0) {
                C23791a c23791a = C23791a.f114936B;
                m119268l1(c23791a.m124270p());
                m119268l1(c23791a.m124262h());
                m119268l1(c23791a.m124266l());
                m119268l1(c23791a.m124271q());
                m119268l1(c23791a.m124265k());
                m119268l1(c23791a.m124272r());
                m119268l1(c23791a.m124268n());
                m119268l1(c23791a.m124269o());
                m119268l1(c23791a.m124273s());
                m119262j1();
                Date date = new Date(System.currentTimeMillis());
                Date date2 = new Date(i11 * 1000);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                int i12 = Calendar.getInstance().get(1);
                int i13 = calendar.get(1);
                int parseInt = Integer.parseInt(c23791a.m124270p().format(date));
                int parseInt2 = Integer.parseInt(c23791a.m124270p().format(date2));
                int parseInt3 = Integer.parseInt(c23791a.m124262h().format(date));
                int parseInt4 = Integer.parseInt(c23791a.m124262h().format(date2));
                int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) - i11;
                int m119194G0 = m119194G0(i12, i13, parseInt, parseInt2, parseInt3, parseInt4, currentTimeMillis);
                String format = c23791a.m124273s().format(date2);
                String format2 = c23791a.m124265k().format(date2);
                switch (m119194G0) {
                    case 1:
                    case 2:
                        m119267l0 = m119267l0(m119194G0, date2, i13, format2);
                        if (TextUtils.isEmpty(m119267l0)) {
                            return format;
                        }
                        return m119267l0;
                    case 3:
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date2);
                        String str = (String) m119229Y().get(calendar2.get(7));
                        if (!TextUtils.isEmpty(str)) {
                            m119267l0 = String.format(f112322j, str, format2);
                            return m119267l0;
                        }
                        return format;
                    case 4:
                        return String.format(f112323k, format2);
                    case 5:
                        return String.format(f112329q, format2);
                    case 6:
                        if (currentTimeMillis / 3600 == 1) {
                            m119267l0 = String.format(f112326n, 1);
                        } else {
                            m119267l0 = String.format(f112327o, Integer.valueOf(currentTimeMillis / 3600));
                        }
                        return m119267l0;
                    case 7:
                        if (currentTimeMillis / 60 == 1) {
                            m119267l0 = String.format(f112324l, 1);
                        } else {
                            m119267l0 = String.format(f112325m, Integer.valueOf(currentTimeMillis / 60));
                        }
                        return m119267l0;
                    case 8:
                        return f112328p;
                    case 9:
                        return format;
                    default:
                        return "";
                }
            }
            throw new Exception();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: q0 */
    public static int m119282q0(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return calendar.get(11);
    }

    /* renamed from: q1 */
    public static void m119283q1(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: r */
    public static String m119284r(long j11, boolean z11) {
        if (z11) {
            j11 /= 1000;
        }
        return m119281q((int) j11);
    }

    /* renamed from: r0 */
    public static String m119285r0(String str) {
        boolean z11;
        int i11;
        int i12;
        StringBuilder sb2 = new StringBuilder();
        try {
            long m114361v = C21927m.m114302u().m114361v(str);
            if (m114361v > 0) {
                long mo124314i = C23793c.m124316k().mo124314i();
                if (mo124314i > m114361v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long abs = Math.abs(mo124314i - m114361v);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(m114361v);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(mo124314i);
                int i13 = calendar.get(1);
                int i14 = calendar2.get(1);
                int i15 = calendar.get(6);
                int i16 = calendar2.get(6);
                if (z11 && i13 == i14) {
                    if (i15 == i16) {
                        long j11 = abs / 1000;
                        long m121518V4 = AbstractC23309i.m121518V4();
                        if (m121518V4 < 0) {
                            m121518V4 = 180;
                        }
                        if (j11 <= m121518V4) {
                            sb2.append(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_Online));
                        } else {
                            long j12 = j11 / 60;
                            if (j11 < 60) {
                                j12 = 1;
                            }
                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_at));
                            if (j12 < 60) {
                                Context appContext = MainApplication.getAppContext();
                                if (j12 > 1) {
                                    i12 = AbstractC8020f0.str_more_s;
                                } else {
                                    i12 = AbstractC8020f0.str_single_form;
                                }
                                sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_min_ago, Long.valueOf(j12), appContext.getString(i12)));
                            } else {
                                long j13 = j12 / 60;
                                Context appContext2 = MainApplication.getAppContext();
                                if (j13 > 1) {
                                    i11 = AbstractC8020f0.str_more_s;
                                } else {
                                    i11 = AbstractC8020f0.str_single_form;
                                }
                                sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_hour_ago, Long.valueOf(j13), appContext2.getString(i11)));
                            }
                        }
                    } else if (i16 > i15) {
                        sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_at));
                        if (i16 - i15 == 1) {
                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_yesterday));
                        } else {
                            sb2.append(m119201K(m114361v));
                        }
                    } else {
                        sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_at));
                        sb2.append(m119201K(m114361v));
                    }
                } else if (i13 == i14 && i15 == i16) {
                    sb2.append(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_Online));
                } else {
                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_online_at));
                    sb2.append(m119201K(m114361v));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return sb2.toString();
    }

    /* renamed from: r1 */
    public static void m119286r1(Calendar calendar) {
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: s */
    private static String m119287s(int i11) {
        String str;
        String str2;
        String str3;
        if (i11 == 0) {
            return "";
        }
        m119232Z0();
        int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) - i11;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 60) {
            String str4 = f112313a;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(currentTimeMillis);
            if (currentTimeMillis > 1) {
                str3 = f112319g;
            } else {
                str3 = f112320h;
            }
            objArr[1] = str3;
            return String.format(str4, objArr);
        }
        if (currentTimeMillis >= 61 && currentTimeMillis <= 3600) {
            int i12 = currentTimeMillis / 60;
            String str5 = f112314b;
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(i12);
            if (i12 > 1) {
                str2 = f112319g;
            } else {
                str2 = f112320h;
            }
            objArr2[1] = str2;
            return String.format(str5, objArr2);
        }
        if (currentTimeMillis >= 3601 && currentTimeMillis <= 86400) {
            int i13 = currentTimeMillis / 3600;
            String str6 = f112315c;
            Object[] objArr3 = new Object[2];
            objArr3[0] = Integer.valueOf(i13);
            if (i13 > 1) {
                str = f112319g;
            } else {
                str = f112320h;
            }
            objArr3[1] = str;
            return String.format(str6, objArr3);
        }
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124258d());
        return c23791a.m124258d().format(new Date(i11 * 1000));
    }

    /* renamed from: s0 */
    public static String m119288s0(long j11) {
        return C23791a.f114936B.m124273s().format(Long.valueOf(j11));
    }

    /* renamed from: s1 */
    public static void m119289s1(Calendar calendar) {
        calendar.set(2, 0);
        m119286r1(calendar);
    }

    /* renamed from: t */
    public static String m119290t(long j11, boolean z11) {
        if (z11) {
            return m119287s((int) (j11 / 1000));
        }
        return m119287s((int) j11);
    }

    /* renamed from: t0 */
    public static String m119291t0(long j11) {
        Date date = new Date(j11);
        C23791a c23791a = C23791a.f114936B;
        m119268l1(c23791a.m124277w());
        return c23791a.m124277w().format(date);
    }

    /* renamed from: t1 */
    public static void m119292t1(Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
    }

    /* renamed from: u */
    private static String m119293u(int i11) {
        try {
            if (i11 > 0) {
                C23791a c23791a = C23791a.f114936B;
                m119268l1(c23791a.m124271q());
                m119268l1(c23791a.m124266l());
                m119268l1(c23791a.m124275u());
                m119268l1(c23791a.m124267m());
                m119259i1();
                Date date = new Date(i11 * 1000);
                Calendar.getInstance().setTime(date);
                String format = new SimpleDateFormat("MMMM, yyyy", new Locale(AbstractC18458a.f93019a)).format(date);
                return format.substring(0, 1).toUpperCase() + format.substring(1);
            }
            throw new Exception();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: u0 */
    public static int m119294u0(int i11, int i12, boolean z11, boolean z12) {
        Calendar calendar;
        int i13;
        boolean z13 = false;
        try {
            calendar = Calendar.getInstance();
        } catch (Exception unused) {
        }
        if (!z11) {
            calendar.set(2, i11);
            calendar.set(1, i12);
            return calendar.getActualMaximum(5);
        }
        int[] m12343f = AbstractC2353j.m12343f(1, i11 + 1, i12, z12 ? 1 : 0, 7.0d);
        if (m12343f[0] != 0 && m12343f[1] != 0 && (i13 = m12343f[2]) != 0) {
            calendar.set(1, i13);
            calendar.set(2, m12343f[1] - 1);
            calendar.set(5, m12343f[0]);
            calendar.add(5, 29);
            int[] m12344g = AbstractC2353j.m12344g(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
            if (i11 == m12344g[1] - 1) {
                if (m12344g[3] != 0) {
                    z13 = true;
                }
                if (z12 == z13) {
                    return 30;
                }
            }
            return 29;
        }
        return 0;
    }

    /* renamed from: u1 */
    public static void m119295u1(Calendar calendar) {
        m119286r1(calendar);
        calendar.add(2, 1);
        calendar.add(14, -1);
    }

    /* renamed from: v */
    public static String m119296v(long j11, boolean z11) {
        if (z11) {
            return m119293u((int) (j11 / 1000));
        }
        return m119293u((int) j11);
    }

    /* renamed from: v0 */
    public static long m119297v0(long j11) {
        AbstractC18070b abstractC18070b = f112336x;
        Calendar calendar = (Calendar) abstractC18070b.mo7484b();
        try {
            calendar.setTimeInMillis(j11);
            m119301w1(calendar);
            long timeInMillis = calendar.getTimeInMillis();
            abstractC18070b.mo7483a(calendar);
            return timeInMillis;
        } catch (Throwable th2) {
            f112336x.mo7483a(calendar);
            throw th2;
        }
    }

    /* renamed from: v1 */
    public static void m119298v1(Calendar calendar) {
        calendar.set(2, 11);
        m119295u1(calendar);
    }

    /* renamed from: w */
    public static String m119299w(long j11) {
        StringBuilder sb2 = new StringBuilder();
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            sb2.append(m119189E(j11));
            sb2.append(", ");
            sb2.append(calendar.get(1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: w0 */
    public static int m119300w0(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return calendar.get(12);
    }

    /* renamed from: w1 */
    public static void m119301w1(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: x */
    public static long m119302x(long j11) {
        return (j11 - (j11 % 86400000)) - 28800000;
    }

    /* renamed from: x0 */
    public static String m119303x0(long j11) {
        Date date = new Date(j11);
        if ("vi".equals(AbstractC18458a.f93019a)) {
            AbstractC18070b abstractC18070b = f112338z;
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) abstractC18070b.mo7484b();
            try {
                m119268l1(simpleDateFormat);
                String str = "Tháng " + simpleDateFormat.format(date);
                abstractC18070b.mo7483a(simpleDateFormat);
                return str;
            } catch (Throwable th2) {
                f112338z.mo7483a(simpleDateFormat);
                throw th2;
            }
        }
        AbstractC18070b abstractC18070b2 = f112312A;
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) abstractC18070b2.mo7484b();
        try {
            m119268l1(simpleDateFormat2);
            String format = simpleDateFormat2.format(date);
            abstractC18070b2.mo7483a(simpleDateFormat2);
            return format;
        } catch (Throwable th3) {
            f112312A.mo7483a(simpleDateFormat2);
            throw th3;
        }
    }

    /* renamed from: y */
    public static String m119304y(long j11) {
        long rawOffset = TimeZone.getDefault().getRawOffset();
        if ((j11 + rawOffset) / 86400000 == (AbstractC23306f.m120579F1().mo124314i() + rawOffset) / 86400000) {
            return m119192F0(j11) + " " + MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_today);
        }
        SimpleDateFormat m124260f = C23791a.f114936B.m124260f();
        m119268l1(m124260f);
        return m124260f.format(new Date(j11));
    }

    /* renamed from: y0 */
    public static String m119305y0(long j11) {
        String displayName;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            String valueOf = String.valueOf(calendar.get(1));
            if (AbstractC23309i.m122158m5().equals("vi")) {
                displayName = calendar.getDisplayName(2, 2, Locale.getDefault());
            } else {
                displayName = calendar.getDisplayName(2, 2, Locale.US);
            }
            return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_format_month_year), displayName, valueOf);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: z */
    public static int m119306z() {
        int i11 = Calendar.getInstance().get(11);
        if (i11 >= 5 && i11 < 12) {
            return 0;
        }
        if (i11 >= 12 && i11 < 18) {
            return 1;
        }
        if (i11 >= 18 && i11 < 23) {
            return 2;
        }
        return 3;
    }

    /* renamed from: z0 */
    public static String m119307z0(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return m119197I(calendar, true, true, false, !m119244d1(calendar, Calendar.getInstance()), true) + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time) + " " + m119202K0(calendar.getTimeInMillis(), true);
    }
}
