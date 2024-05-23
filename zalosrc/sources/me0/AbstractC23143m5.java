package me0;

import android.util.Pair;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.regex.Pattern;
import mu.C23444b;
import mu.C23445c;
import nu.C23939e;

/* renamed from: me0.m5 */
/* loaded from: classes4.dex */
public abstract class AbstractC23143m5 {

    /* renamed from: a */
    static int f112273a = 550;

    /* renamed from: b */
    static String f112274b = m118815c();

    /* renamed from: a */
    public static String m118813a(ArrayList arrayList) {
        String str = "";
        for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
            str = str + ((String) arrayList.get(i11)) + "|";
        }
        return "\\b(" + (str + ((String) arrayList.get(arrayList.size() - 1))) + ")\\b";
    }

    /* renamed from: b */
    public static ArrayList m118814b(String str) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(6, 365);
            Pair create = Pair.create(Long.valueOf(System.currentTimeMillis()), Long.valueOf(calendar.getTimeInMillis()));
            ArrayList m123126s = C23445c.m123122r().m123126s(str);
            ArrayList arrayList = new ArrayList();
            Iterator it = m123126s.iterator();
            while (it.hasNext()) {
                C23939e c23939e = (C23939e) it.next();
                SuggestionTimeSpan suggestionTimeSpan = new SuggestionTimeSpan(c23939e.f115893l, c23939e.f115894m, c23939e.f115882a, c23939e.f115883b);
                if (suggestionTimeSpan.f54805u >= ((Long) create.first).longValue() && suggestionTimeSpan.f54805u <= ((Long) create.second).longValue()) {
                    arrayList.add(suggestionTimeSpan);
                }
            }
            boolean m118817e = m118817e(str);
            boolean m118818f = m118818f(str);
            if (!m118817e && !m118818f) {
                return new ArrayList();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((SuggestionTimeSpan) it2.next()).f54806v = m118817e;
            }
            return arrayList;
        } catch (Exception e11) {
            e11.printStackTrace();
            return new ArrayList();
        }
    }

    /* renamed from: c */
    private static String m118815c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nay");
        arrayList.add("mai");
        arrayList.add("tuần");
        arrayList.add("thứ");
        arrayList.add("sáng");
        arrayList.add("trưa");
        arrayList.add("chiều");
        arrayList.add("tối");
        arrayList.add("đêm");
        arrayList.add("ngày");
        arrayList.add("tháng");
        arrayList.add("năm");
        arrayList.add("giờ");
        arrayList.add("[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4,4}");
        arrayList.add("[0-9]{1,2}\\/[0-9]{1,2}");
        arrayList.add("[0-9]{1,2}(:|h|g)[0-9]{0,2}");
        arrayList.add("[0-9]{1,2}( ){0,1}(p|a)m");
        arrayList.add("[0-9]{1,2} rưỡi");
        arrayList.add("t[2-7]");
        arrayList.add("cn");
        arrayList.add("chủ nhật");
        return m118813a(arrayList);
    }

    /* renamed from: d */
    public static SuggestionTimeSpan m118816d(String str) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(6, 365);
            Pair create = Pair.create(Long.valueOf(System.currentTimeMillis()), Long.valueOf(calendar.getTimeInMillis()));
            ArrayList m123126s = C23445c.m123122r().m123126s(str);
            ArrayList arrayList = new ArrayList();
            Iterator it = m123126s.iterator();
            while (it.hasNext()) {
                C23939e c23939e = (C23939e) it.next();
                SuggestionTimeSpan suggestionTimeSpan = new SuggestionTimeSpan(c23939e.f115893l, c23939e.f115894m, c23939e.f115882a, c23939e.f115883b);
                if (suggestionTimeSpan.f54805u >= ((Long) create.first).longValue() && suggestionTimeSpan.f54805u <= ((Long) create.second).longValue()) {
                    arrayList.add(suggestionTimeSpan);
                }
            }
            if (arrayList.size() > 0) {
                return (SuggestionTimeSpan) arrayList.get(0);
            }
            return new SuggestionTimeSpan(0, 0, "", 0L);
        } catch (Exception e11) {
            e11.printStackTrace();
            return new SuggestionTimeSpan(0, 0, "", 0L);
        }
    }

    /* renamed from: e */
    public static boolean m118817e(String str) {
        boolean z11 = false;
        String substring = str.substring(0, Math.min(str.length(), f112273a));
        if (substring.length() > 0) {
            Iterator it = C23444b.m123108d().f113888f.iterator();
            while (it.hasNext()) {
                if (Pattern.compile((String) it.next(), 2).matcher(substring).find()) {
                    return false;
                }
            }
            Iterator it2 = C23444b.m123108d().f113887e.iterator();
            while (it2.hasNext() && !(z11 = Pattern.compile((String) it2.next(), 2).matcher(substring).find())) {
            }
        }
        return z11;
    }

    /* renamed from: f */
    public static boolean m118818f(String str) {
        String substring = str.substring(0, Math.min(str.length(), f112273a));
        if (substring.length() > 0) {
            Iterator it = C23444b.m123108d().f113888f.iterator();
            while (it.hasNext()) {
                if (Pattern.compile((String) it.next(), 2).matcher(substring).find()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m118819g(String str) {
        return Pattern.compile(f112274b).matcher(str.substring(0, Math.min(str.length(), f112273a)).toLowerCase()).find();
    }
}
