package s20;

import android.content.Context;
import android.util.TypedValue;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import on0.AbstractC24344y;
import v00.AbstractC27411f;
import v00.AbstractC27413h;
import v00.C27417l;

/* renamed from: s20.g */
/* loaded from: classes5.dex */
public abstract class AbstractC26105g {

    /* renamed from: a */
    private static final Locale f124311a = new Locale("vi", "VN");

    /* renamed from: a */
    public static final String m134334a(long j11) {
        if (j11 < 0) {
            return "0";
        }
        if (j11 < 10000) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(f124311a, "%,d", Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        if (j11 < 1000000) {
            return m134335b(j11, 1000, "K");
        }
        if (j11 < 1000000000) {
            return m134335b(j11, 1000000, "M");
        }
        return m134335b(j11, 1000000000, "B");
    }

    /* renamed from: b */
    private static final String m134335b(long j11, int i11, String str) {
        char m127208g1;
        int length;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(f124311a, "%,.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j11) / i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        m127208g1 = AbstractC24344y.m127208g1(format);
        if (m127208g1 == '0') {
            length = format.length() - 2;
        } else {
            length = format.length();
        }
        String substring = format.substring(0, length);
        AbstractC19074t.m100207e(substring, "substring(...)");
        return ((Object) substring) + str;
    }

    /* renamed from: c */
    public static final String m134336c(long j11, Context context) {
        if (context == null) {
            return "";
        }
        Locale locale = f124311a;
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        calendar.setTimeInMillis(j11);
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        calendar2.setTimeInMillis(C27417l.f129055a.m140382f().m130131a());
        long m134344k = m134344k(j11) / 1000;
        if (calendar.get(1) != calendar2.get(1)) {
            String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Long.valueOf(j11));
            AbstractC19074t.m100205c(format);
            return format;
        }
        if (m134344k < 60) {
            String string = context.getResources().getString(AbstractC27413h.zch_time_just_now);
            AbstractC19074t.m100205c(string);
            return string;
        }
        if (m134344k < 3600) {
            int i11 = (int) (m134344k / 60);
            String quantityString = context.getResources().getQuantityString(AbstractC27411f.zch_time_mm_minutes, i11, Integer.valueOf(i11));
            AbstractC19074t.m100205c(quantityString);
            return quantityString;
        }
        if (m134344k < 86400) {
            int i12 = (int) (m134344k / 3600);
            String quantityString2 = context.getResources().getQuantityString(AbstractC27411f.zch_time_hh_hours, i12, Integer.valueOf(i12));
            AbstractC19074t.m100205c(quantityString2);
            return quantityString2;
        }
        if (m134344k < 604800) {
            int i13 = calendar.get(6);
            int i14 = calendar2.get(6);
            if (i14 < i13) {
                i14 += calendar.getActualMaximum(6);
            }
            int i15 = i14 - i13;
            String quantityString3 = context.getResources().getQuantityString(AbstractC27411f.zch_time_dd_days, i15, Integer.valueOf(i15));
            AbstractC19074t.m100205c(quantityString3);
            return quantityString3;
        }
        String format2 = new SimpleDateFormat("dd-MM", Locale.getDefault()).format(Long.valueOf(j11));
        AbstractC19074t.m100205c(format2);
        return format2;
    }

    /* renamed from: d */
    public static final String m134337d(int i11) {
        return m134338e(i11);
    }

    /* renamed from: e */
    public static final String m134338e(long j11) {
        long rint = (float) Math.rint(((float) j11) / 1000.0f);
        C19067n0 c19067n0 = C19067n0.f94947a;
        long j12 = 60;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(rint / j12)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(rint % j12)}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        return format + ":" + format2;
    }

    /* renamed from: f */
    public static final String m134339f(long j11, Context context) {
        if (context == null) {
            return "";
        }
        long j12 = j11 / 1000;
        if (j12 < 1) {
            String string = context.getResources().getString(AbstractC27413h.zch_time_just_now);
            AbstractC19074t.m100205c(string);
            return string;
        }
        if (j12 < 60) {
            int i11 = (int) j12;
            String quantityString = context.getResources().getQuantityString(AbstractC27411f.zch_time_ss_seconds, i11, Integer.valueOf(i11));
            AbstractC19074t.m100205c(quantityString);
            return quantityString;
        }
        if (j12 < 3600) {
            int i12 = (int) (j12 / 60);
            String quantityString2 = context.getResources().getQuantityString(AbstractC27411f.zch_time_mm_minutes, i12, Integer.valueOf(i12));
            AbstractC19074t.m100205c(quantityString2);
            return quantityString2;
        }
        if (j12 < 86400) {
            int i13 = (int) (j12 / 3600);
            String quantityString3 = context.getResources().getQuantityString(AbstractC27411f.zch_time_hh_hours, i13, Integer.valueOf(i13));
            AbstractC19074t.m100205c(quantityString3);
            return quantityString3;
        }
        int i14 = (int) (j12 / 86400);
        String quantityString4 = context.getResources().getQuantityString(AbstractC27411f.zch_time_dd_days, i14, Integer.valueOf(i14));
        AbstractC19074t.m100205c(quantityString4);
        return quantityString4;
    }

    /* renamed from: g */
    public static final String m134340g(long j11, Context context) {
        AbstractC19074t.m100208f(context, "context");
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(Long.valueOf(j11));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: h */
    public static final String m134341h(long j11) {
        long rint = (float) Math.rint(((float) j11) / 1000.0f);
        if (rint < 60) {
            return "00:00:" + rint;
        }
        long j12 = 60;
        long j13 = rint / j12;
        long j14 = rint % j12;
        if (j13 < 60) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            return "00:" + format + ":" + format2;
        }
        long j15 = j13 / j12;
        long j16 = j13 % j12;
        C19067n0 c19067n02 = C19067n0.f94947a;
        String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j15)}, 1));
        AbstractC19074t.m100207e(format3, "format(...)");
        String format4 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
        AbstractC19074t.m100207e(format4, "format(...)");
        String format5 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14)}, 1));
        AbstractC19074t.m100207e(format5, "format(...)");
        return format3 + ":" + format4 + ":" + format5;
    }

    /* renamed from: i */
    public static final String m134342i(long j11, Context context) {
        if (context == null) {
            return "";
        }
        Locale locale = f124311a;
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        calendar.setTimeInMillis(j11);
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        calendar2.setTimeInMillis(C27417l.f129055a.m140382f().m130131a());
        long m134344k = m134344k(j11) / 1000;
        if (m134344k < 1) {
            String string = context.getResources().getString(AbstractC27413h.zch_time_just_now);
            AbstractC19074t.m100205c(string);
            return string;
        }
        if (m134344k < 60) {
            int i11 = (int) m134344k;
            String quantityString = context.getResources().getQuantityString(AbstractC27411f.zch_time_ss_seconds, i11, Integer.valueOf(i11));
            AbstractC19074t.m100205c(quantityString);
            return quantityString;
        }
        if (m134344k < 3600) {
            int i12 = (int) (m134344k / 60);
            String quantityString2 = context.getResources().getQuantityString(AbstractC27411f.zch_time_mm_minutes, i12, Integer.valueOf(i12));
            AbstractC19074t.m100205c(quantityString2);
            return quantityString2;
        }
        if (m134344k < 21600) {
            int i13 = (int) (m134344k / 3600);
            String quantityString3 = context.getResources().getQuantityString(AbstractC27411f.zch_time_hh_hours, i13, Integer.valueOf(i13));
            AbstractC19074t.m100205c(quantityString3);
            return quantityString3;
        }
        if (m134350q(j11)) {
            String format = new SimpleDateFormat(context.getResources().getString(AbstractC27413h.zch_time_today_hh_mm), Locale.getDefault()).format(Long.valueOf(j11));
            AbstractC19074t.m100205c(format);
            return format;
        }
        if (m134350q(86400000 + j11)) {
            String format2 = new SimpleDateFormat(context.getResources().getString(AbstractC27413h.zch_time_yesterday_hh_mm), Locale.getDefault()).format(Long.valueOf(j11));
            AbstractC19074t.m100205c(format2);
            return format2;
        }
        if (m134344k < 604800) {
            int i14 = calendar.get(6);
            int i15 = calendar2.get(6);
            if (i15 < i14) {
                i15 += calendar.getActualMaximum(6);
            }
            int i16 = i15 - i14;
            String quantityString4 = context.getResources().getQuantityString(AbstractC27411f.zch_time_dd_days, i16, Integer.valueOf(i16));
            AbstractC19074t.m100205c(quantityString4);
            return quantityString4;
        }
        if (m134344k < 2592000) {
            int i17 = calendar.get(3);
            int i18 = calendar2.get(3);
            if (i18 < i17) {
                i18 += calendar.getActualMaximum(3);
            }
            int i19 = i18 - i17;
            String quantityString5 = context.getResources().getQuantityString(AbstractC27411f.zch_time_ww_weeks, i19, Integer.valueOf(i19));
            AbstractC19074t.m100205c(quantityString5);
            return quantityString5;
        }
        if (m134344k < 31104000) {
            int i21 = calendar.get(2);
            int i22 = calendar2.get(2);
            if (i22 < i21) {
                i22 += calendar.getActualMaximum(2);
            }
            int max = Math.max(1, i22 - i21);
            String quantityString6 = context.getResources().getQuantityString(AbstractC27411f.zch_time_mm_months, max, Integer.valueOf(max));
            AbstractC19074t.m100205c(quantityString6);
            return quantityString6;
        }
        int max2 = Math.max(1, calendar2.get(1) - calendar.get(1));
        String quantityString7 = context.getResources().getQuantityString(AbstractC27411f.zch_time_yy_years, max2, Integer.valueOf(max2));
        AbstractC19074t.m100205c(quantityString7);
        return quantityString7;
    }

    /* renamed from: j */
    public static final String m134343j(long j11, Context context) {
        if (context == null) {
            return "";
        }
        Locale locale = f124311a;
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        calendar.setTimeInMillis(j11);
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        calendar2.setTimeInMillis(C27417l.f129055a.m140382f().m130131a());
        if (calendar.get(1) == calendar2.get(1)) {
            String format = new SimpleDateFormat(context.getResources().getString(AbstractC27413h.zch_time_dd_mm), Locale.getDefault()).format(Long.valueOf(j11));
            AbstractC19074t.m100205c(format);
            return format;
        }
        String format2 = new SimpleDateFormat(context.getResources().getString(AbstractC27413h.zch_time_dd_mm_yy), Locale.getDefault()).format(Long.valueOf(j11));
        AbstractC19074t.m100205c(format2);
        return format2;
    }

    /* renamed from: k */
    public static final long m134344k(long j11) {
        return C27417l.f129055a.m140382f().m130131a() - j11;
    }

    /* renamed from: l */
    public static final int m134345l(float f11) {
        return (int) (m134346m(f11) + 0.5f);
    }

    /* renamed from: m */
    public static final float m134346m(float f11) {
        return TypedValue.applyDimension(1, f11, CoreUtility.getAppContext().getResources().getDisplayMetrics());
    }

    /* renamed from: n */
    public static final int m134347n(int i11) {
        return (int) (m134346m(i11) + 0.5f);
    }

    /* renamed from: o */
    public static final boolean m134348o(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C27417l.f129055a.m140382f().m130131a());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m134349p(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C27417l.f129055a.m140382f().m130131a());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m134350q(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C27417l.f129055a.m140382f().m130131a());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }
}
