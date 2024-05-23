package me0;

import ag0.C0824j;
import am.AbstractC0939u;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.CustomTypefaceSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vg.C28023b6;

/* renamed from: me0.t2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23217t2 {

    /* renamed from: me0.t2$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f112495a;

        a(String str) {
            this.f112495a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42271T3(this.f112495a, null);
        }
    }

    /* renamed from: b */
    public static void m119650b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            if (bundle.containsKey("EXTRA_HIGHTLIGHT_SETTING_ID")) {
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            }
            if (bundle.containsKey("EXTRA_HIGHTLIGHT_SETTING_TYPE")) {
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
            }
            if (bundle.containsKey("EXTRA_HIGHTLIGHT_SETTING_DATA")) {
                bundle.putString("EXTRA_HIGHTLIGHT_SETTING_DATA", "");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m119651c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0824j.m2153b(new a(str));
        try {
            C28023b6.m141250h0().m141290I(AbstractC23121k5.m118607e(Long.parseLong(str), 6));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public static SpannableStringBuilder m119652d(String str, ArrayList arrayList, int i11) {
        return m119653e(str, arrayList, i11, -1);
    }

    /* renamed from: e */
    public static SpannableStringBuilder m119653e(String str, ArrayList arrayList, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        SpannableStringBuilder delete;
        SpannableStringBuilder delete2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            String m120002o = AbstractC23262x6.m120002o(str);
            Collections.sort(arrayList, new Comparator() { // from class: me0.s2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m119661m;
                    m119661m = AbstractC23217t2.m119661m((String) obj, (String) obj2);
                    return m119661m;
                }
            });
            ArrayList m119662n = m119662n(str, arrayList);
            if (m119662n != null) {
                Iterator it = m119662n.iterator();
                i13 = 0;
                i14 = 0;
                i15 = 0;
                boolean z11 = true;
                while (it.hasNext()) {
                    int[] iArr = (int[]) it.next();
                    int i16 = iArr[0];
                    int i17 = iArr[1];
                    if (z11) {
                        i14 = i17 + 1;
                        i15 = m120002o.length() - i16;
                        i13 = i16;
                        z11 = false;
                    }
                    if (i16 >= 0 && i17 <= spannableStringBuilder.length()) {
                        m119663o(spannableStringBuilder, i16, i17, i12);
                    }
                }
            } else {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            }
            if (i11 == 0) {
                i11 = 20;
            }
            if (i14 >= i11) {
                if (i15 < i11) {
                    int max = Math.max(m120002o.length() - i11, 0);
                    CharSequence subSequence = spannableStringBuilder.subSequence(max, m120002o.length());
                    if (subSequence instanceof SpannableStringBuilder) {
                        delete2 = (SpannableStringBuilder) subSequence;
                    } else {
                        delete2 = spannableStringBuilder.delete(0, max - 1);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = delete2;
                    if (max > 0) {
                        return spannableStringBuilder2.insert(0, (CharSequence) "...");
                    }
                    return spannableStringBuilder2;
                }
                int max2 = Math.max(i13 - 15, 0);
                CharSequence subSequence2 = spannableStringBuilder.subSequence(max2, m120002o.length());
                if (subSequence2 instanceof SpannableStringBuilder) {
                    delete = (SpannableStringBuilder) subSequence2;
                } else {
                    delete = spannableStringBuilder.delete(0, max2 - 1);
                }
                SpannableStringBuilder spannableStringBuilder3 = delete;
                if (max2 > 0) {
                    return spannableStringBuilder3.insert(0, (CharSequence) "…");
                }
                return spannableStringBuilder3;
            }
            return spannableStringBuilder;
        } catch (Exception e11) {
            e11.printStackTrace();
            return spannableStringBuilder;
        }
    }

    /* renamed from: f */
    public static SpannableStringBuilder m119654f(String str, List list) {
        return m119655g(str, list, -1);
    }

    /* renamed from: g */
    public static SpannableStringBuilder m119655g(String str, List list, int i11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            String m120002o = AbstractC23262x6.m120002o(str);
            boolean z11 = true;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int i13 = -1;
                int i14 = -1;
                int i15 = -1;
                do {
                    i13 = m120002o.indexOf((String) list.get(i12), i13 + 1);
                    if (i13 != -1) {
                        if (i13 != 0) {
                            if (AbstractC23244v8.m119755s(m120002o.charAt(i13 - 1))) {
                            }
                        }
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        if ((i13 == m120002o.length() - ((String) list.get(i12)).length() || AbstractC23244v8.m119755s(m120002o.charAt(((String) list.get(i12)).length() + i13))) && i15 == -1) {
                            i15 = i13;
                        }
                    }
                    if (i13 == -1 || i15 != -1) {
                        break;
                    }
                } while (i14 == -1);
                if (i15 != -1) {
                    i14 = i15;
                }
                if (i14 != -1) {
                    if (z11) {
                        z11 = false;
                    }
                    if (i14 >= 0 && ((String) list.get(i12)).length() + i14 <= spannableStringBuilder.length()) {
                        m119663o(spannableStringBuilder, i14, ((String) list.get(i12)).length() + i14, i11);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return spannableStringBuilder;
    }

    /* renamed from: h */
    public static List m119656h(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        int length = spanned.length();
        int i11 = 0;
        while (i11 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i11, length, CharacterStyle.class);
            if (((CharacterStyle[]) spanned.getSpans(i11, nextSpanTransition, CharacterStyle.class)).length != 0) {
                arrayList.add(Integer.valueOf(i11));
                arrayList.add(Integer.valueOf(nextSpanTransition));
            }
            i11 = nextSpanTransition;
        }
        return arrayList;
    }

    /* renamed from: i */
    public static int m119657i(int i11) {
        return i11 == 1 ? 872304720 : 0;
    }

    /* renamed from: j */
    public static SpannableString m119658j(String str, String str2, int i11, int i12) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        if (TextUtils.isEmpty(str2)) {
            return new SpannableString(str);
        }
        int indexOf = str.indexOf(str2);
        if (indexOf > -1) {
            int length = indexOf + str2.length();
            SpannableString spannableString = new SpannableString(str);
            m119664p(spannableString, indexOf, length, i11, i12, 33);
            return spannableString;
        }
        return new SpannableString(str);
    }

    /* renamed from: k */
    public static boolean m119659k(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: l */
    public static boolean m119660l(int i11) {
        return i11 == 1;
    }

    /* renamed from: m */
    public static /* synthetic */ int m119661m(String str, String str2) {
        if (str.length() > str2.length()) {
            return -1;
        }
        if (str.length() < str2.length()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: n */
    public static ArrayList m119662n(String str, List list) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                String m120002o = AbstractC23262x6.m120002o(str);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] split = ((String) list.get(i11)).split("\\W+");
                    for (int i12 = 0; i12 < split.length; i12++) {
                        sb2.append(split[i12]);
                        if (i12 < split.length - 1) {
                            sb2.append("\\W+");
                        }
                    }
                    Matcher matcher = Pattern.compile(sb2.toString()).matcher(m120002o);
                    while (matcher.find()) {
                        int start = matcher.start();
                        if (start == 0 || AbstractC23244v8.m119755s(m120002o.charAt(start - 1))) {
                            arrayList.add(new int[]{start, matcher.end()});
                            break;
                        }
                    }
                }
                return arrayList;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: o */
    public static void m119663o(Spannable spannable, int i11, int i12, int i13) {
        m119664p(spannable, i11, i12, C23212s8.m119606n(AbstractC16781w.SearchGlobalKeywordSearch), i13, 33);
    }

    /* renamed from: p */
    public static void m119664p(Spannable spannable, int i11, int i12, int i13, int i14, int i15) {
        Typeface defaultFromStyle;
        if (i13 != 0 && i11 >= 0 && i12 > i11) {
            spannable.setSpan(new ForegroundColorSpan(i13), i11, i12, i15);
        }
        if (i14 != -1) {
            if (C13778s1.m76960a()) {
                defaultFromStyle = C13718q1.m76694c(MainApplication.getAppContext(), i14);
            } else if (i14 != 9 && i14 != 7) {
                if (i14 != 0 && i14 != 5) {
                    if (i14 == 6) {
                        defaultFromStyle = Typeface.defaultFromStyle(2);
                    } else {
                        defaultFromStyle = null;
                    }
                } else {
                    defaultFromStyle = Typeface.defaultFromStyle(0);
                }
            } else {
                defaultFromStyle = Typeface.defaultFromStyle(1);
            }
            if (defaultFromStyle != null && i11 >= 0 && i12 > i11) {
                spannable.setSpan(new CustomTypefaceSpan("", defaultFromStyle), i11, i12, i15);
            }
        }
    }
}
