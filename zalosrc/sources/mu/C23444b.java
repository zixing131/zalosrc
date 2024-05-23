package mu;

import am.AbstractC0908e0;
import android.text.TextUtils;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nu.C23935a;
import nu.C23936b;
import nu.C23937c;
import nu.C23940f;
import nu.C23941g;
import nu.C23942h;
import nu.C23943i;
import nu.C23944j;
import nu.C23945k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p404ou.C24555a;
import p404ou.C24556b;
import p404ou.C24558d;

/* renamed from: mu.b */
/* loaded from: classes.dex */
public class C23444b {

    /* renamed from: k */
    private static C23444b f113882k;

    /* renamed from: a */
    protected JSONArray f113883a;

    /* renamed from: b */
    protected JSONArray f113884b;

    /* renamed from: c */
    protected JSONArray f113885c;

    /* renamed from: d */
    protected JSONArray f113886d;

    /* renamed from: e */
    public ArrayList f113887e = new ArrayList();

    /* renamed from: f */
    public ArrayList f113888f = new ArrayList();

    /* renamed from: g */
    protected ArrayList f113889g = new ArrayList();

    /* renamed from: h */
    protected ArrayList f113890h = new ArrayList();

    /* renamed from: i */
    public ArrayList f113891i = new ArrayList();

    /* renamed from: j */
    protected C23447e f113892j;

    /* JADX INFO: Access modifiers changed from: protected */
    public C23444b() {
        m123118l();
    }

    /* renamed from: c */
    private int m123107c(String str, String str2, ArrayList arrayList) {
        String str3;
        String str4;
        if (!str.equals("day_vn") && !str.equals("day_en")) {
            if (!str.equals("month_vn") && !str.equals("month_en")) {
                String m123116n = m123116n(str2.trim());
                if (!this.f113892j.f113897a.containsKey(m123116n)) {
                    return 0;
                }
                return ((Integer) this.f113892j.f113897a.get(m123116n)).intValue();
            }
            if (arrayList.size() <= 0) {
                str4 = "";
            } else {
                str4 = m123116n(((C24555a) arrayList.get(0)).f118238a);
            }
            if (str4.startsWith("0")) {
                str4 = "" + Integer.parseInt(str4);
            }
            if (!this.f113892j.f113897a.containsKey(str4)) {
                return 0;
            }
            return ((Integer) this.f113892j.f113897a.get(str4)).intValue();
        }
        if (arrayList.size() < 2) {
            str3 = "";
        } else {
            str3 = m123116n(((C24555a) arrayList.get(1)).f118238a);
        }
        if (str3.startsWith("0")) {
            str3 = "" + Integer.parseInt(str3);
        }
        if (!this.f113892j.f113897a.containsKey(str3)) {
            return 0;
        }
        return ((Integer) this.f113892j.f113897a.get(str3)).intValue();
    }

    /* renamed from: d */
    public static C23444b m123108d() {
        if (f113882k == null) {
            f113882k = new C23444b();
        }
        return f113882k;
    }

    /* renamed from: e */
    public static String m123109e() {
        return AbstractC0908e0.m2816j("PARSE_TIME_CONFIG_EXCLUDES", "", true, false);
    }

    /* renamed from: f */
    public static String m123110f() {
        return AbstractC0908e0.m2816j("PARSE_TIME_CONFIG_INCLUDES", "", true, false);
    }

    /* renamed from: g */
    public static String m123111g() {
        return AbstractC0908e0.m2816j("PARSE_TIME_CONFIG_MAPPING_RULES", "", true, false);
    }

    /* renamed from: h */
    public static String m123112h() {
        return AbstractC0908e0.m2816j("PARSE_TIME_CONFIG_REGEX_FILTER_RULES", "", true, false);
    }

    /* renamed from: i */
    public static String m123113i() {
        return AbstractC0908e0.m2816j("PARSE_TIME_CONFIG_REGEX_RULES", "", true, false);
    }

    /* renamed from: j */
    private boolean m123114j(C23943i c23943i, C23943i c23943i2) {
        int i11;
        int i12 = c23943i2.f115909e;
        if ((i12 >= c23943i.f115908d && i12 <= c23943i.f115909e) || ((i11 = c23943i.f115909e) >= c23943i2.f115908d && i11 <= i12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ int m123115k(C23943i c23943i, C23943i c23943i2) {
        return c23943i.f115908d - c23943i2.f115908d;
    }

    /* renamed from: n */
    private String m123116n(String str) {
        try {
            return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(Normalizer.normalize(str, Normalizer.Form.NFD)).replaceAll("").replaceAll("đ", "d");
        } catch (Exception e11) {
            e11.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:            if (r11.equals("day_en") == false) goto L20;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m123117b(String str, int i11) {
        ArrayList arrayList;
        C23943i c23935a;
        ArrayList arrayList2 = new ArrayList();
        if (i11 == 0) {
            arrayList = this.f113890h;
        } else {
            arrayList = this.f113889g;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24558d c24558d = (C24558d) it.next();
            Iterator it2 = c24558d.f118246b.iterator();
            while (it2.hasNext()) {
                Matcher matcher = Pattern.compile((String) it2.next(), 64).matcher(str);
                int i12 = 0;
                while (matcher.find(i12)) {
                    String group = matcher.group();
                    ArrayList arrayList3 = new ArrayList();
                    int groupCount = matcher.groupCount();
                    char c11 = 1;
                    for (int i13 = 1; i13 <= groupCount; i13++) {
                        arrayList3.add(new C24555a(matcher.group(i13), matcher.start(i13)));
                    }
                    int m123107c = m123107c(c24558d.f118245a, group, arrayList3);
                    String str2 = c24558d.f118245a;
                    str2.hashCode();
                    switch (str2.hashCode()) {
                        case -1349088399:
                            if (str2.equals("custom")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -1338771412:
                            break;
                        case -1338770885:
                            if (str2.equals("day_vn")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case -1313927333:
                            if (str2.equals("time_en")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case -1313926806:
                            if (str2.equals("time_vn")) {
                                c11 = 4;
                                break;
                            }
                            break;
                        case -1296587797:
                            if (str2.equals("year_en")) {
                                c11 = 5;
                                break;
                            }
                            break;
                        case -1296587270:
                            if (str2.equals("year_vn")) {
                                c11 = 6;
                                break;
                            }
                            break;
                        case -714551008:
                            if (str2.equals("weekday_en")) {
                                c11 = 7;
                                break;
                            }
                            break;
                        case -714550481:
                            if (str2.equals("weekday_vn")) {
                                c11 = '\b';
                                break;
                            }
                            break;
                        case -319013176:
                            if (str2.equals("month_en")) {
                                c11 = '\t';
                                break;
                            }
                            break;
                        case -319012649:
                            if (str2.equals("month_vn")) {
                                c11 = '\n';
                                break;
                            }
                            break;
                        case 566597607:
                            if (str2.equals("period_en")) {
                                c11 = 11;
                                break;
                            }
                            break;
                        case 566598134:
                            if (str2.equals("period_vn")) {
                                c11 = '\f';
                                break;
                            }
                            break;
                        case 2099350067:
                            if (str2.equals("neartime_en")) {
                                c11 = '\r';
                                break;
                            }
                            break;
                        case 2099350594:
                            if (str2.equals("neartime_vn")) {
                                c11 = 14;
                                break;
                            }
                            break;
                    }
                    c11 = 65535;
                    switch (c11) {
                        case 0:
                            c23935a = new C23935a(c24558d.f118245a, group, matcher.start(), m123107c);
                            c23935a.f115906b = c24558d.f118247c;
                            break;
                        case 1:
                        case 2:
                            c23935a = new C23936b(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        case 3:
                        case 4:
                            c23935a = new C23942h(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        case 5:
                        case 6:
                            c23935a = new C23945k(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        case 7:
                        case '\b':
                            c23935a = new C23944j(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        case '\t':
                        case '\n':
                            c23935a = new C23940f(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        case 11:
                        case '\f':
                            c23935a = new C23937c(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        case '\r':
                        case 14:
                            c23935a = new C23941g(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                        default:
                            c23935a = new C23943i(c24558d.f118245a, group, matcher.start(), m123107c);
                            break;
                    }
                    c23935a.f115910f = arrayList3;
                    arrayList2.add(this.f113892j.m123132c(c23935a, i11));
                    i12 = group.length() + matcher.start();
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: l */
    public void m123118l() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        try {
            String m123110f = m123110f();
            JSONArray jSONArray4 = null;
            if (TextUtils.isEmpty(m123110f)) {
                jSONArray = null;
            } else {
                jSONArray = new JSONArray(m123110f);
            }
            this.f113883a = jSONArray;
            if (jSONArray != null) {
                this.f113887e.clear();
                int length = this.f113883a.length();
                for (int i11 = 0; i11 < length; i11++) {
                    this.f113887e.add((String) this.f113883a.get(i11));
                }
            }
            String m123109e = m123109e();
            if (TextUtils.isEmpty(m123109e)) {
                jSONArray2 = null;
            } else {
                jSONArray2 = new JSONArray(m123109e);
            }
            this.f113884b = jSONArray2;
            if (jSONArray2 != null) {
                this.f113888f.clear();
                int length2 = this.f113884b.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    this.f113888f.add((String) this.f113884b.get(i12));
                }
            }
            String m123112h = m123112h();
            if (TextUtils.isEmpty(m123112h)) {
                jSONArray3 = null;
            } else {
                jSONArray3 = new JSONArray(m123112h);
            }
            this.f113886d = jSONArray3;
            if (jSONArray3 != null) {
                this.f113891i.clear();
                int length3 = this.f113886d.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    this.f113891i.add(new C24556b((JSONObject) this.f113886d.get(i13)));
                }
            }
            String m123113i = m123113i();
            if (!TextUtils.isEmpty(m123113i)) {
                jSONArray4 = new JSONArray(m123113i);
            }
            this.f113885c = jSONArray4;
            this.f113889g = m123119m(jSONArray4, 1);
            this.f113890h = m123119m(this.f113885c, 0);
            C23447e c23447e = this.f113892j;
            if (c23447e == null) {
                this.f113892j = C23447e.m123130a();
            } else {
                c23447e.m123131b();
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public ArrayList m123119m(JSONArray jSONArray, int i11) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        try {
            int length = jSONArray.length();
            int i12 = 0;
            if (i11 != 0) {
                if (i11 == 1) {
                    while (i12 < length) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i12);
                        if (!jSONObject.getString("regexType").equals("period_vn") && !jSONObject.getString("regexType").equals("period_en") && !jSONObject.getString("regexType").equals("time_vn") && !jSONObject.getString("regexType").equals("time_en")) {
                            arrayList.add(new C24558d(jSONObject));
                        }
                        i12++;
                    }
                }
            } else {
                while (i12 < length) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i12);
                    if (!jSONObject2.getString("regexType").equals("custom") && !jSONObject2.getString("regexType").equals("month_vn") && !jSONObject2.getString("regexType").equals("month_en") && !jSONObject2.getString("regexType").equals("year_vn") && !jSONObject2.getString("regexType").equals("year_en") && !jSONObject2.getString("regexType").equals("neartime_en") && !jSONObject2.getString("regexType").equals("day_en") && !jSONObject2.getString("regexType").equals("period_en") && !jSONObject2.getString("regexType").equals("time_en") && !jSONObject2.getString("regexType").equals("weekday_en")) {
                        arrayList.add(new C24558d(jSONObject2));
                    }
                    i12++;
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public ArrayList m123120o(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size > 0; size--) {
            C23943i c23943i = (C23943i) arrayList.get(size);
            int i11 = size - 1;
            C23943i c23943i2 = (C23943i) arrayList.get(i11);
            if (m123114j(c23943i, c23943i2)) {
                int i12 = c23943i.f115908d;
                int i13 = c23943i2.f115908d;
                if ((i12 == i13 && c23943i.f115909e > c23943i2.f115909e) || (c23943i.f115909e == c23943i2.f115909e && i12 < i13)) {
                    arrayList.set(size, c23943i2);
                    arrayList.set(i11, c23943i);
                }
                arrayList.remove(size);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public ArrayList m123121p(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator() { // from class: mu.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m123115k;
                m123115k = C23444b.m123115k((C23943i) obj, (C23943i) obj2);
                return m123115k;
            }
        });
        return arrayList;
    }
}
