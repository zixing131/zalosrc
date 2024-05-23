package bo;

import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Patterns;
import android.webkit.URLUtil;
import bo.C3003l3;
import bo.C3025q0;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import gq.C19587j;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.io.Serializable;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p425po.C24881c;
import p588vw.C28652r;
import p716zh.C31839a6;
import p716zh.C31854b6;
import p716zh.C31869c6;
import p716zh.C31995kc;
import p716zh.C32145v4;

/* renamed from: bo.p0 */
/* loaded from: classes4.dex */
public class C3020p0 implements Serializable {

    /* renamed from: D */
    public C3043u0 f12024D;

    /* renamed from: M */
    public ArrayList f12033M;

    /* renamed from: N */
    public ArrayList f12034N;

    /* renamed from: S */
    public C32145v4 f12039S;

    /* renamed from: T */
    public String f12040T;

    /* renamed from: U */
    public ArrayList f12041U;

    /* renamed from: X */
    public boolean f12044X;

    /* renamed from: s */
    public C3003l3.c f12060s;

    /* renamed from: t */
    public String f12061t;

    /* renamed from: x */
    public boolean f12065x;

    /* renamed from: A */
    public C24881c f12021A = new C24881c();

    /* renamed from: R */
    public boolean f12038R = false;

    /* renamed from: c0 */
    public String f12049c0 = "";

    /* renamed from: d0 */
    public String f12050d0 = "";

    /* renamed from: f0 */
    public boolean f12052f0 = true;

    /* renamed from: g0 */
    public C2976g1 f12053g0 = new C2976g1();

    /* renamed from: i0 */
    public int f12055i0 = 0;

    /* renamed from: j0 */
    public boolean f12056j0 = false;

    /* renamed from: p */
    public String f12057p = "";

    /* renamed from: q */
    public int f12058q = 0;

    /* renamed from: r */
    public C3003l3 f12059r = new C3003l3();

    /* renamed from: u */
    public long f12062u = 0;

    /* renamed from: v */
    public boolean f12063v = false;

    /* renamed from: O */
    public int f12035O = 1;

    /* renamed from: w */
    public boolean f12064w = false;

    /* renamed from: Q */
    public int f12037Q = 3;

    /* renamed from: G */
    public boolean f12027G = false;

    /* renamed from: B */
    public C3047v0 f12022B = new C3047v0();

    /* renamed from: C */
    public C3025q0 f12023C = new C3025q0();

    /* renamed from: E */
    public C3039t0 f12025E = new C3039t0();

    /* renamed from: H */
    public CharSequence f12028H = "";

    /* renamed from: L */
    public ArrayList f12032L = new ArrayList();

    /* renamed from: I */
    public ArrayList f12029I = new ArrayList();

    /* renamed from: J */
    public ArrayList f12030J = new ArrayList();

    /* renamed from: K */
    public ArrayList f12031K = new ArrayList();

    /* renamed from: P */
    private final String f12036P = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);

    /* renamed from: V */
    public PrivacyInfo f12042V = new PrivacyInfo();

    /* renamed from: Y */
    public boolean f12045Y = false;

    /* renamed from: W */
    public boolean f12043W = false;

    /* renamed from: Z */
    public boolean f12046Z = false;

    /* renamed from: a0 */
    public boolean f12047a0 = false;

    /* renamed from: b0 */
    public boolean f12048b0 = false;

    /* renamed from: y */
    public String f12066y = "";

    /* renamed from: z */
    public String f12067z = "";

    /* renamed from: e0 */
    public C31854b6 f12051e0 = null;

    /* renamed from: F */
    public List f12026F = new ArrayList();

    /* renamed from: h0 */
    private boolean f12054h0 = false;

    /* renamed from: M */
    private void m14454M(String str) {
        TrackingSource trackingSource;
        String str2;
        CharSequence charSequence;
        List m14460q0 = m14460q0(str);
        String m14462s0 = m14462s0(str);
        if (TextUtils.isEmpty(m14462s0)) {
            this.f12023C.f12116g = "";
            return;
        }
        this.f12023C.f12117h = m14462s0;
        String str3 = m14462s0 + String.format("...<a href=\"zm://SeeMore/%s/%s\">%s</a>", this.f12022B.f12280b, this.f12057p, this.f12036P);
        this.f12031K = new ArrayList();
        String m119747k = AbstractC23244v8.m119747k(str3.replaceAll("(\r\n|\n)", "<br/>"));
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String m14461r0 = m14461r0(m119747k);
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m14461r0);
            while (matcher2.find()) {
                String group = matcher2.group(0);
                if (group.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    if (!matcher3.find()) {
                        str2 = "";
                    } else {
                        String replace = matcher3.group(1).replace("\"", "");
                        str2 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group2 = matcher2.group(1);
                    CharSequence m114542i = AbstractC21935u.m114542i(str2, group2);
                    if (!group2.equals(m114542i)) {
                        charSequence = group.replace(group2, m114542i);
                    } else {
                        charSequence = group;
                    }
                    if (m14461r0.contains(group) && !group.equals(charSequence)) {
                        m14461r0 = m14461r0.replace(group, charSequence);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m14461r0).replaceAll("&lt;"));
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        if (spans.length > 0) {
            int i11 = 0;
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    c10866e.f54832J = 10;
                    if (m14518m0()) {
                        trackingSource = new TrackingSource(20);
                    } else {
                        trackingSource = new TrackingSource(10);
                    }
                    c10866e.m56387e0(trackingSource);
                    c10866e.m56366J(true);
                    c10866e.m56389f0(m14486Q());
                    this.f12031K.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    if (c10866e.m56406u() == 5 && m14460q0 != null && m14460q0.size() > 0 && i11 < m14460q0.size()) {
                        c10866e.m56390g0((String) m14460q0.get(i11));
                        i11++;
                    }
                }
            }
            m14484N(spannableString, true);
            this.f12023C.f12116g = C28652r.m143349v().m143350A(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(m14461r0.replaceAll("<br/>", "\n"));
        m14484N(spannableString2, true);
        this.f12023C.f12116g = C28652r.m143349v().m143350A(spannableString2);
    }

    /* renamed from: O */
    private void m14455O(String str) {
        TrackingSource trackingSource;
        String str2;
        CharSequence charSequence;
        String m14464u0 = m14464u0(str);
        if (TextUtils.isEmpty(m14464u0)) {
            this.f12023C.f12112c = "";
            return;
        }
        this.f12023C.f12114e = m14464u0;
        String str3 = m14464u0 + String.format("...<a href=\"zm://SeeMore/%s/%s\">%s</a>", this.f12022B.f12280b, this.f12057p, this.f12036P);
        this.f12030J = new ArrayList();
        String m119747k = AbstractC23244v8.m119747k(str3.replaceAll("(\r\n|\n)", "<br/>"));
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String m14461r0 = m14461r0(m119747k);
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m14461r0);
            while (matcher2.find()) {
                String group = matcher2.group(0);
                if (group.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    if (!matcher3.find()) {
                        str2 = "";
                    } else {
                        String replace = matcher3.group(1).replace("\"", "");
                        str2 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group2 = matcher2.group(1);
                    CharSequence m114542i = AbstractC21935u.m114542i(str2, group2);
                    if (!group2.equals(m114542i)) {
                        charSequence = group.replace(group2, m114542i);
                    } else {
                        charSequence = group;
                    }
                    if (m14461r0.contains(group) && !group.equals(charSequence)) {
                        m14461r0 = m14461r0.replace(group, charSequence);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m14461r0).replaceAll("&lt;"));
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        if (spans.length > 0) {
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    c10866e.f54832J = 10;
                    if (m14518m0()) {
                        trackingSource = new TrackingSource(20);
                    } else {
                        trackingSource = new TrackingSource(10);
                    }
                    c10866e.m56387e0(trackingSource);
                    c10866e.m56366J(true);
                    c10866e.m56389f0(m14486Q());
                    this.f12030J.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            m14484N(spannableString, true);
            this.f12023C.f12112c = C28652r.m143349v().m143350A(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(m14461r0.replaceAll("<br/>", "\n"));
        m14484N(spannableString2, true);
        this.f12023C.f12112c = C28652r.m143349v().m143350A(spannableString2);
    }

    /* renamed from: f */
    public static void m14457f(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C10866e c10866e = (C10866e) arrayList.get(i11);
                    if (c10866e != null) {
                        c10866e.m56365I(null);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public static void m14458g(CharSequence charSequence) {
        if (charSequence != null) {
            try {
                new SpannableStringBuilder(charSequence).clearSpans();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ int m14459n0(C3030r0 c3030r0, C3030r0 c3030r02) {
        if (c3030r0 != null && c3030r02 != null) {
            return Long.compare(c3030r0.f12208f, c3030r02.f12208f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.CharSequence] */
    /* renamed from: q0 */
    private List m14460q0(String str) {
        String str2;
        String m14463t0 = m14463t0(str);
        if (TextUtils.isEmpty(m14463t0)) {
            return null;
        }
        String m119747k = AbstractC23244v8.m119747k((m14463t0 + String.format("...<a href=\"zm://SeeMore/%s/%s\">%s</a>", this.f12022B.f12280b, this.f12057p, this.f12036P)).replaceAll("(\r\n|\n)", "<br/>"));
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        ?? m14461r0 = m14461r0(m119747k);
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m14461r0);
            while (matcher2.find()) {
                ?? group = matcher2.group(0);
                if (group.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    String str3 = "";
                    if (matcher3.find()) {
                        String replace = matcher3.group(1).replace("\"", "");
                        str3 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group2 = matcher2.group(1);
                    String m114542i = AbstractC21935u.m114542i(str3, group2);
                    if (!group2.equals(m114542i)) {
                        str2 = group.replace(group2, m114542i);
                    } else {
                        str2 = group;
                    }
                    if (m14461r0.contains(group) && !group.equals(str2)) {
                        m14461r0 = m14461r0.replace(group, str2);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m14461r0).replaceAll("&lt;"));
        new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        if (spans.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : spans) {
                if (obj instanceof URLSpan) {
                    URLSpan uRLSpan = (URLSpan) obj;
                    try {
                        if (URLUtil.isValidUrl(uRLSpan.getURL())) {
                            arrayList.add(uRLSpan.getURL());
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: r0 */
    private String m14461r0(String str) {
        if (AbstractC23309i.m121739b2()) {
            try {
                Matcher matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(str);
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (matcher.find()) {
                    arrayList.add(new Pair(Integer.valueOf(i11), Integer.valueOf(matcher.start())));
                    i11 = matcher.end();
                }
                if (i11 != str.length()) {
                    arrayList.add(new Pair(Integer.valueOf(i11), Integer.valueOf(str.length())));
                }
                String str2 = "";
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Pair pair = (Pair) arrayList.get(i13);
                    String str3 = str2 + str.substring(i12, ((Integer) pair.first).intValue());
                    String substring = str.substring(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
                    Matcher matcher2 = Patterns.PHONE.matcher(substring);
                    String str4 = "";
                    int i14 = 0;
                    while (matcher2.find()) {
                        int start = matcher2.start();
                        int end = matcher2.end();
                        String m15603v = AbstractC3102n.m15603v(matcher2.group(0));
                        if (AbstractC3102n.m15592k(m15603v)) {
                            str4 = str4 + substring.substring(i14, start) + "<a href=\"zm://PhoneNumber/" + m15603v + "\">" + substring.substring(start, end) + "</a>";
                            i14 = end;
                        }
                    }
                    str2 = str3 + (str4 + substring.substring(Math.min(i14, substring.length())));
                    i12 = ((Integer) pair.second).intValue();
                }
                return str2 + str.substring(Math.min(i12, str.length()));
            } catch (Exception e11) {
                e11.printStackTrace();
                return str;
            }
        }
        return str;
    }

    /* renamed from: s0 */
    private String m14462s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String property = System.getProperty("line.separator");
            int length = str.split(property).length;
            if (length <= 3 && str.length() < 120) {
                return "";
            }
            if (length > 3) {
                String[] split = str.split(property);
                String str2 = "";
                for (int i11 = 0; i11 < 3; i11++) {
                    str2 = str2 + split[i11] + property;
                }
                str = str2;
            }
            if (str.length() >= 120) {
                int indexOf = str.indexOf(" ", 119);
                int indexOf2 = str.indexOf(property, 119);
                if (indexOf > 0) {
                    return str.substring(0, indexOf);
                }
                if (indexOf2 > 0) {
                    return str.substring(0, indexOf2);
                }
                return str.substring(0, 120);
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: t0 */
    private String m14463t0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String property = System.getProperty("line.separator");
            int length = str.split(property).length;
            StringBuilder sb2 = new StringBuilder();
            String[] split = str.split(property);
            for (int i11 = 0; i11 < length; i11++) {
                sb2.append(split[i11]);
                sb2.append(property);
            }
            return sb2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: u0 */
    private String m14464u0(String str) {
        int i11;
        int i12;
        int i13;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String property = System.getProperty("line.separator");
            int length = str.split(property).length;
            int i14 = this.f12058q;
            if (i14 == 1) {
                i11 = 10;
            } else {
                i11 = 4;
            }
            if (i14 == 1) {
                i12 = 550;
            } else {
                i12 = 250;
            }
            if (length <= i11 && str.length() < i12) {
                return "";
            }
            if (length > i11) {
                String[] split = str.split(property);
                String str2 = "";
                for (int i15 = 0; i15 < i11; i15++) {
                    str2 = str2 + split[i15] + property;
                }
                str = str2.trim();
            }
            if (str.length() >= i12) {
                if (this.f12058q == 1) {
                    i13 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                } else {
                    i13 = 200;
                }
                int i16 = i13 - 1;
                int lastIndexOf = str.lastIndexOf(" ", i16);
                int lastIndexOf2 = str.lastIndexOf(property, i16);
                if (lastIndexOf > 0) {
                    return str.substring(0, lastIndexOf);
                }
                if (lastIndexOf2 > 0) {
                    return str.substring(0, lastIndexOf2);
                }
                return str.substring(0, i16);
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: A */
    public String m14465A() {
        String str;
        C3047v0 c3047v0 = this.f12022B;
        if (c3047v0 != null && (str = c3047v0.f12280b) != null) {
            return str;
        }
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:5|(2:9|(15:11|(1:13)|14|(1:16)|17|18|19|(2:21|(1:23)(3:24|25|(1:27)(2:28|(1:30)(1:31))))|32|34|35|(4:38|(8:40|41|42|(1:44)|45|(1:47)(1:59)|48|(3:53|54|55))(1:60)|56|36)|61|62|(5:64|(3:66|(6:68|(1:70)(1:85)|71|(3:73|(1:75)|76)(3:80|(1:82)(1:84)|83)|77|78)(2:86|87)|79)|88|89|90)(2:91|92)))|100|(0)|14|(0)|17|18|19|(0)|32|34|35|(1:36)|61|62|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0101, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0128, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x009e, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b8, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:19:0x0070, B:21:0x0082, B:24:0x008b, B:27:0x0099, B:28:0x00a0, B:30:0x00ac, B:31:0x00b1), top: B:18:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:35:0x00bb, B:36:0x00c7, B:38:0x00cd, B:41:0x00d9, B:44:0x00eb, B:45:0x0103, B:47:0x0111, B:48:0x0117, B:51:0x011d, B:54:0x0123), top: B:34:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022b  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.regex.Pattern] */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m14466A0(String str, boolean z11) {
        boolean z12;
        Object[] spans;
        TrackingSource trackingSource;
        Matcher matcher;
        String str2;
        Matcher matcher2;
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        if (TextUtils.isEmpty(normalize)) {
            return;
        }
        C3025q0 c3025q0 = this.f12023C;
        c3025q0.f12115f = normalize;
        if (z11 && !TextUtils.isEmpty(c3025q0.f12114e)) {
            C3025q0 c3025q02 = this.f12023C;
            if (!c3025q02.f12114e.equals(c3025q02.f12113d)) {
                z12 = true;
                if (z12) {
                    normalize = normalize + String.format("...<a href=\"zm://SeeMore/%s/%s\">%s</a>", this.f12022B.f12280b, this.f12057p, this.f12036P);
                }
                if (this.f12029I == null) {
                    this.f12029I = new ArrayList();
                }
                ?? m119747k = AbstractC23244v8.m119747k(normalize.replaceAll("(\r\n|\n)", "<br/>"));
                matcher2 = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
                m119747k = m119747k;
                if (matcher2.find()) {
                    if (m119747k.contains("<a href=\"http")) {
                        m119747k = m119747k;
                    } else if (matcher2.group().startsWith("https://")) {
                        m119747k = matcher2.replaceAll("<a href=\"$1\">$1</a>");
                    } else if (matcher2.group().startsWith("http://")) {
                        m119747k = matcher2.replaceAll("<a href=\"$1\">$1</a>");
                    } else {
                        m119747k = matcher2.replaceAll("<a href=\"http://$1\">$1</a>");
                    }
                }
                matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m119747k);
                while (matcher.find()) {
                    ?? group = matcher.group(0);
                    if (group.startsWith("<a href=\"zm://Profile/")) {
                        Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                        String str3 = "";
                        if (matcher3.find()) {
                            String replace = matcher3.group(1).replace("\"", "");
                            str3 = replace.substring(replace.lastIndexOf("/") + 1);
                        }
                        String group2 = matcher.group(1);
                        String m114542i = AbstractC21935u.m114542i(str3, group2);
                        if (!group2.equals(m114542i)) {
                            str2 = group.replace(group2, m114542i);
                        } else {
                            str2 = group;
                        }
                        if (m119747k.contains(group) && !group.equals(str2)) {
                            m119747k = m119747k.replace(group, str2);
                        }
                    }
                }
                Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m119747k).replaceAll("&lt;"));
                SpannableString spannableString = new SpannableString(fromHtml.toString());
                spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
                String m40689a = new TrackingSource.C7894b().m40694f(10).m40691c(this.f12057p).m40693e(this.f12058q).m40692d(m14465A()).m40689a();
                if (spans.length <= 0) {
                    for (Object obj : spans) {
                        int spanStart = fromHtml.getSpanStart(obj);
                        int spanEnd = fromHtml.getSpanEnd(obj);
                        int spanFlags = fromHtml.getSpanFlags(obj);
                        if (obj instanceof URLSpan) {
                            C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                            if (m14518m0()) {
                                trackingSource = new TrackingSource(20);
                            } else {
                                trackingSource = new TrackingSource(10);
                            }
                            c10866e.m56387e0(trackingSource);
                            c10866e.f54832J = 10;
                            c10866e.f54833K = m40689a;
                            c10866e.m56366J(true);
                            if (z12) {
                                if (this.f12030J.size() > 0) {
                                    c10866e.m56369M(((C10866e) this.f12030J.get(0)).m56391h());
                                    c10866e.m56371O(((C10866e) this.f12030J.get(0)).m56410y());
                                }
                                this.f12030J.add(c10866e);
                            } else {
                                if (this.f12029I.size() > 0) {
                                    c10866e.m56369M(((C10866e) this.f12029I.get(0)).m56391h());
                                    c10866e.m56371O(((C10866e) this.f12029I.get(0)).m56410y());
                                }
                                this.f12029I.add(c10866e);
                            }
                            spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                        }
                    }
                    this.f12023C.f12115f = C28652r.m143349v().m143350A(spannableString);
                    return;
                }
                this.f12023C.f12115f = C28652r.m143349v().m143350A(new SpannableString(m119747k.replaceAll("<br/>", "\n")));
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
        if (this.f12029I == null) {
        }
        ?? m119747k2 = AbstractC23244v8.m119747k(normalize.replaceAll("(\r\n|\n)", "<br/>"));
        matcher2 = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k2);
        m119747k2 = m119747k2;
        if (matcher2.find()) {
        }
        matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m119747k2);
        while (matcher.find()) {
        }
        Spanned fromHtml2 = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m119747k2).replaceAll("&lt;"));
        SpannableString spannableString2 = new SpannableString(fromHtml2.toString());
        spans = fromHtml2.getSpans(0, fromHtml2.length(), Object.class);
        String m40689a2 = new TrackingSource.C7894b().m40694f(10).m40691c(this.f12057p).m40693e(this.f12058q).m40692d(m14465A()).m40689a();
        if (spans.length <= 0) {
        }
    }

    /* renamed from: B */
    public List m14467B() {
        return this.f12026F;
    }

    /* renamed from: B0 */
    public boolean m14468B0() {
        int i11 = this.f12058q;
        if ((i11 == 7 || i11 == 24) && !m14479H()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public String m14469C() {
        C3025q0 c3025q0;
        C2949b c2949b;
        if (this.f12058q == 23 && (c3025q0 = this.f12023C) != null && (c2949b = c3025q0.f12106O) != null) {
            return c2949b.m13962e();
        }
        return "";
    }

    /* renamed from: C0 */
    public boolean m14470C0() {
        if ((m14481J() || m14483L() || m14471D()) && !m14479H()) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean m14471D() {
        return this.f12058q == 23;
    }

    /* renamed from: D0 */
    public boolean m14472D0() {
        C3043u0 c3043u0 = this.f12024D;
        if (c3043u0 != null) {
            return c3043u0.m14622g();
        }
        return true;
    }

    /* renamed from: E */
    public boolean m14473E() {
        boolean z11;
        boolean z12;
        C3025q0 c3025q0;
        ArrayList arrayList;
        if (this.f12058q == 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            c3025q0 = this.f12023C;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (c3025q0 != null && (arrayList = c3025q0.f12107P) != null) {
            int min = Math.min(arrayList.size(), 9);
            for (int i11 = 0; i11 < min; i11++) {
                C2954c c2954c = (C2954c) this.f12023C.f12107P.get(i11);
                if (c2954c == null || !c2954c.m13989d()) {
                    return false;
                }
            }
            z12 = true;
            if (!z11) {
            }
            return false;
        }
        z12 = false;
        if (!z11 && z12) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    public JSONObject m14474E0() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f12057p;
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            jSONObject.put("fid", obj);
            jSONObject.put("ftype", this.f12058q);
            jSONObject.put("cts", this.f12062u);
            jSONObject.put("hid", this.f12063v ? 1 : 0);
            jSONObject.put("islike", this.f12064w ? 1 : 0);
            jSONObject.put("isSubscribe", this.f12065x);
            jSONObject.put("suggest_comment", this.f12052f0 ? 1 : 0);
            jSONObject.put("max_line", this.f12037Q);
            jSONObject.put("iscmtable", this.f12035O);
            jSONObject.put("feed_title", this.f12066y);
            jSONObject.put("feed_desc", this.f12067z);
            jSONObject.put("edited", this.f12054h0 ? 1 : 0);
            jSONObject.put("feed_sub_type", this.f12055i0);
            C31854b6 c31854b6 = this.f12051e0;
            if (c31854b6 != null) {
                jSONObject.put("mapEffect", c31854b6.m153141b());
            }
            C3047v0 c3047v0 = this.f12022B;
            if (c3047v0 != null) {
                jSONObject.put("header", c3047v0.m14632a());
            }
            C3025q0 c3025q0 = this.f12023C;
            if (c3025q0 != null) {
                jSONObject.put("content", c3025q0.m14573j(this.f12058q));
            }
            C3039t0 c3039t0 = this.f12025E;
            if (c3039t0 != null) {
                jSONObject.put("footer", c3039t0.m14614a());
            }
            if (m14479H()) {
                jSONObject.put("footerv2", this.f12024D.m14623h());
            }
            C3030r0 m14533x = m14533x();
            if (m14533x != null) {
                jSONObject.put("comment", m14533x.m14585b());
            }
            C3003l3 c3003l3 = this.f12059r;
            if (c3003l3 != null && c3003l3.f11956a > 0) {
                jSONObject.put("tags", c3003l3.m14397j());
            } else {
                jSONObject.put("tags", new JSONArray());
            }
            Object obj3 = this.f12061t;
            if (obj3 != null) {
                obj2 = obj3;
            }
            jSONObject.put("suggest_title", obj2);
            C3003l3.c cVar = this.f12060s;
            if (cVar != null && cVar.f11956a > 0) {
                jSONObject.put("user_follow", cVar.m14399l());
            }
            PrivacyInfo privacyInfo = this.f12042V;
            if (privacyInfo != null) {
                if (privacyInfo.f45974q.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f12042V.f45974q.iterator();
                    while (it.hasNext()) {
                        LikeContactItem likeContactItem = (LikeContactItem) it.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("uid", likeContactItem.m56333d());
                        jSONObject2.put("dpn", likeContactItem.m56331b());
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("privacy_share_list", jSONArray);
                }
                jSONObject.put("privacy", this.f12042V.f45973p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: F */
    public boolean m14475F(boolean z11) {
        boolean z12;
        boolean z13;
        C3025q0 c3025q0;
        int size;
        if (this.f12058q == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        try {
            c3025q0 = this.f12023C;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (c3025q0 != null && c3025q0.f12118i != null) {
            int mo102465h = C19587j.f97307a.m102530f(c3025q0.m14566c()).mo102465h();
            if (z11) {
                size = Math.min(this.f12023C.f12118i.size(), mo102465h);
            } else {
                size = this.f12023C.f12118i.size();
            }
            for (int i11 = 0; i11 < size; i11++) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f12023C.f12118i.get(i11);
                if (itemAlbumMobile == null || !itemAlbumMobile.m40510U()) {
                    return false;
                }
            }
            z13 = true;
            if (!z12) {
            }
            return false;
        }
        z13 = false;
        if (!z12 && z13) {
            return true;
        }
        return false;
    }

    /* renamed from: F0 */
    public void m14476F0() {
        int i11 = this.f12025E.f12244b;
        if (i11 > 0) {
            m14536y0(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_tv_like_other_new), AbstractC20814p0.m108599D(i11)));
        } else {
            this.f12028H = "";
        }
    }

    /* renamed from: G */
    public boolean m14477G() {
        C3063z0 c3063z0 = this.f12023C.f12111b;
        if (c3063z0 != null && !TextUtils.isEmpty(c3063z0.m14728g())) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    public void m14478G0(C3003l3 c3003l3) {
        C3003l3 c3003l32 = this.f12059r;
        c3003l32.f11956a = c3003l3.f11956a;
        c3003l32.f11957b = new LinkedHashMap(c3003l3.f11957b);
        this.f12059r.mo14398k();
    }

    /* renamed from: H */
    public boolean m14479H() {
        C3043u0 c3043u0 = this.f12024D;
        if (c3043u0 != null && c3043u0.m14619d()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m14480I() {
        C3025q0.b bVar;
        C31869c6 c31869c6;
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null && (bVar = c3025q0.f12134y) != null && (c31869c6 = bVar.f12149l) != null) {
            return c31869c6.m153173a();
        }
        return false;
    }

    /* renamed from: J */
    public boolean m14481J() {
        int i11 = this.f12058q;
        return i11 == 3 || i11 == 2;
    }

    /* renamed from: K */
    public boolean m14482K() {
        C3003l3 c3003l3 = this.f12059r;
        if (c3003l3 != null && c3003l3.f11956a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public boolean m14483L() {
        return this.f12058q == 17;
    }

    /* renamed from: N */
    public void m14484N(SpannableString spannableString, boolean z11) {
        try {
            if (!AbstractC23309i.m121072J2()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (z11) {
                ArrayList arrayList2 = this.f12030J;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                this.f12034N = C31839a6.m152968b().m152971c(spannableString, arrayList, this.f12051e0);
                return;
            }
            ArrayList arrayList3 = this.f12029I;
            if (arrayList3 != null) {
                arrayList.addAll(arrayList3);
            }
            this.f12033M = C31839a6.m152968b().m152971c(spannableString, arrayList, this.f12051e0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public boolean m14485P() {
        boolean z11;
        boolean z12;
        int i11 = this.f12058q;
        if (i11 != 1 && ((i11 != 2 || !this.f12023C.f12126q) && i11 != 3 && i11 != 6 && i11 != 7 && i11 != 24 && i11 != 17 && i11 != 22 && i11 != 23)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f12023C.f12097F != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || z12) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public boolean m14486Q() {
        C3025q0 c3025q0;
        C3013n3 c3013n3;
        if (this.f12058q == 1 && (c3025q0 = this.f12023C) != null && (c3013n3 = c3025q0.f12097F) != null && c3013n3.m14430a()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public boolean m14487R() {
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null && c3025q0.f12125p) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public boolean m14488S() {
        return this.f12054h0;
    }

    /* renamed from: T */
    public boolean m14489T() {
        return this.f12021A.m129381a();
    }

    /* renamed from: U */
    public boolean m14490U() {
        if (m14479H() && this.f12024D.m14620e()) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public boolean m14491V() {
        if (this.f12058q == 100 && AbstractC20826v0.m108816j0(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public boolean m14492W() {
        C3039t0 c3039t0 = this.f12025E;
        if (c3039t0 != null && c3039t0.f12245c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public boolean m14493X() {
        return this.f12027G;
    }

    /* renamed from: Y */
    public boolean m14494Y() {
        String str = this.f12022B.f12280b;
        if (str != null && str.equals(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public boolean m14495Z() {
        if (m14494Y() && !this.f12056j0) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public boolean m14496a0() {
        C3063z0 c3063z0;
        if (this.f12058q == 1 && (c3063z0 = this.f12023C.f12111b) != null && c3063z0.f12384i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m14497b(C3030r0 c3030r0) {
        List<C3030r0> list = this.f12026F;
        if (list != null && c3030r0 != null) {
            for (C3030r0 c3030r02 : list) {
                if (c3030r02 != null && c3030r0.f12210h.equals(c3030r02.f12210h)) {
                    return;
                }
            }
            this.f12026F.add(c3030r0);
            Collections.sort(this.f12026F, new Comparator() { // from class: bo.o0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14459n0;
                    m14459n0 = C3020p0.m14459n0((C3030r0) obj, (C3030r0) obj2);
                    return m14459n0;
                }
            });
            if (this.f12026F.size() > 1) {
                this.f12026F.remove(0);
            }
        }
    }

    /* renamed from: b0 */
    public boolean m14498b0() {
        return AbstractC20826v0.m108826o0(this.f12058q);
    }

    /* renamed from: c */
    public CharSequence m14499c() {
        TrackingSource trackingSource;
        String string = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);
        try {
            String format = String.format("...<a href=\"zm://SeeMore/%s/%s\">%s</a>", this.f12022B.f12280b, this.f12057p, string);
            if (this.f12030J == null) {
                this.f12030J = new ArrayList();
            }
            Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(format).replaceAll("&lt;"));
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            String m40689a = new TrackingSource.C7894b().m40694f(10).m40691c(this.f12057p).m40693e(this.f12058q).m40692d(m14465A()).m40689a();
            if (spans.length > 0) {
                for (Object obj : spans) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                        if (m14518m0()) {
                            trackingSource = new TrackingSource(20);
                        } else {
                            trackingSource = new TrackingSource(10);
                        }
                        c10866e.m56387e0(trackingSource);
                        c10866e.m56366J(true);
                        c10866e.m56375S(true);
                        c10866e.f54833K = m40689a;
                        this.f12030J.add(c10866e);
                        spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    }
                }
                return C28652r.m143349v().m143350A(spannableString);
            }
            return C28652r.m143349v().m143353D(format);
        } catch (Exception e11) {
            e11.printStackTrace();
            return string;
        }
    }

    /* renamed from: c0 */
    public boolean m14500c0() {
        int i11 = this.f12058q;
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 17 || i11 == 7 || i11 == 24;
    }

    /* renamed from: d */
    public boolean m14501d() {
        return this.f12035O >= 0 && !this.f12063v;
    }

    /* renamed from: d0 */
    public boolean m14502d0() {
        C3003l3 c3003l3 = this.f12059r;
        if (c3003l3 != null && c3003l3.m14389b(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m14503e() {
        m14457f(this.f12029I);
        m14457f(this.f12030J);
        m14457f(this.f12032L);
        try {
            ArrayList arrayList = this.f12023C.f12118i;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f12023C.f12118i.get(i11);
                    if (itemAlbumMobile != null) {
                        m14457f(itemAlbumMobile.m40530q());
                        m14457f(itemAlbumMobile.m40532t());
                        m14457f(itemAlbumMobile.m40533u());
                    }
                }
            }
            C3003l3 c3003l3 = this.f12059r;
            if (c3003l3 != null) {
                m14457f(c3003l3.f11959d);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m14458g(this.f12023C.f12110a);
        m14458g(this.f12023C.f12112c);
        m14458g(this.f12023C.f12116g);
    }

    /* renamed from: e0 */
    public boolean m14504e0() {
        C3025q0 c3025q0;
        if (this.f12058q == 23 && (c3025q0 = this.f12023C) != null && c3025q0.f12107P != null && c3025q0.f12106O != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public boolean m14505f0() {
        if (!m14504e0() || this.f12023C.f12107P.isEmpty() || !((C2954c) this.f12023C.f12107P.get(0)).m13990e()) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    public boolean m14506g0() {
        if (m14504e0() && this.f12023C.f12107P.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m14507h() {
        List list = this.f12026F;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f12026F.iterator();
            while (it.hasNext()) {
                C3030r0 c3030r0 = (C3030r0) it.next();
                if (c3030r0 != null && c3030r0.f12204b == 0) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: h0 */
    public boolean m14508h0() {
        if (!m14504e0() || this.f12023C.f12107P.size() != 1 || !((C2954c) this.f12023C.f12107P.get(0)).m13991f()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void m14509i() {
        List list = this.f12026F;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f12026F.iterator();
            while (it.hasNext()) {
                C3030r0 c3030r0 = (C3030r0) it.next();
                if (c3030r0 != null && c3030r0.f12204b == 1) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: i0 */
    public boolean m14510i0() {
        return this.f12058q == 2 && this.f12055i0 == 1;
    }

    /* renamed from: j */
    public boolean m14511j(ArrayList arrayList) {
        ArrayList arrayList2;
        AbstractC2959d abstractC2959d;
        int i11 = this.f12058q;
        boolean z11 = false;
        if (i11 != 2 && i11 != 3 && i11 != 23) {
            return false;
        }
        try {
            if (i11 != 2 && i11 != 3) {
                if (i11 == 23 && (arrayList2 = this.f12023C.f12107P) != null) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        String str = "";
                        C2954c c2954c = (C2954c) this.f12023C.f12107P.get(size);
                        if (c2954c != null) {
                            abstractC2959d = c2954c.m13986a();
                        } else {
                            abstractC2959d = null;
                        }
                        if (abstractC2959d instanceof C2964e) {
                            str = String.valueOf(((C2964e) abstractC2959d).m14027j());
                        } else if (abstractC2959d instanceof C2969f) {
                            str = String.valueOf(((C2969f) abstractC2959d).m14049m());
                        }
                        if (!TextUtils.isEmpty(str) && arrayList.contains(str)) {
                            this.f12023C.f12107P.remove(size);
                            this.f12023C.f12125p = true;
                            C31995kc.m154255c().m154257b(this.f12057p);
                            z11 = true;
                        }
                    }
                }
            } else {
                for (int size2 = this.f12023C.f12118i.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.contains(((ItemAlbumMobile) this.f12023C.f12118i.get(size2)).f42595r)) {
                        this.f12023C.f12118i.remove(size2);
                        this.f12023C.f12125p = true;
                        C31995kc.m154255c().m154257b(this.f12057p);
                        z11 = true;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return z11;
    }

    /* renamed from: j0 */
    public boolean m14512j0() {
        return this.f12058q == 2 && this.f12055i0 == 2;
    }

    /* renamed from: k */
    public int m14513k() {
        C32145v4 c32145v4;
        try {
            if (!m14498b0() || (c32145v4 = this.f12039S) == null) {
                return 0;
            }
            return c32145v4.f148249b;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: k0 */
    public boolean m14514k0() {
        int i11 = this.f12058q;
        return i11 == 2 || i11 == 3 || i11 == 17;
    }

    /* renamed from: l */
    public int m14515l() {
        int i11 = this.f12058q;
        if (i11 != 100) {
            return (i11 == 108 || i11 == 109) ? 22 : -1;
        }
        return 40;
    }

    /* renamed from: l0 */
    public boolean m14516l0() {
        int i11 = this.f12058q;
        return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 6 || i11 == 24 || i11 == 7 || i11 == 100 || i11 == 108 || i11 == 17 || i11 == 21 || i11 == 22 || i11 == 23 || i11 == 109;
    }

    /* renamed from: m */
    public long m14517m() {
        C32145v4 c32145v4;
        try {
            if (!m14498b0() || (c32145v4 = this.f12039S) == null) {
                return 0L;
            }
            return Long.parseLong(c32145v4.f148248a);
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: m0 */
    public boolean m14518m0() {
        if (this.f12022B.f12279a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public int m14519n() {
        int i11;
        ArrayList arrayList;
        int i12 = 0;
        if (!m14473E()) {
            return 0;
        }
        try {
            C3025q0 c3025q0 = this.f12023C;
            if (c3025q0 != null && (arrayList = c3025q0.f12107P) != null) {
                i11 = Math.min(arrayList.size(), 9);
            } else {
                i11 = 0;
            }
            int i13 = 0;
            while (i12 < i11) {
                try {
                    C2954c c2954c = (C2954c) this.f12023C.f12107P.get(i12);
                    if (c2954c != null && c2954c.m13987b() != null) {
                        i13 = (int) Math.max(i13, c2954c.m13987b().f42617d);
                    }
                    i12++;
                } catch (Exception e11) {
                    e = e11;
                    i12 = i13;
                    e.printStackTrace();
                    return i12;
                }
            }
            return i13;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: o */
    public int m14520o() {
        if (!m14475F(true)) {
            return 0;
        }
        try {
            return AbstractC23136l9.m118742r(C19587j.f97307a.m102530f(this.f12023C.m14566c()).mo102458a()) * 2;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 0;
        }
    }

    /* renamed from: o0 */
    public void m14521o0() {
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null && this.f12058q == 23) {
            c3025q0.m14571h();
            this.f12023C.f12125p = false;
        }
    }

    /* renamed from: p */
    public int m14522p() {
        if (!m14475F(true)) {
            return 0;
        }
        try {
            return AbstractC23136l9.m118742r(C19587j.f97307a.m102530f(this.f12023C.m14566c()).mo102463f()) * 2;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 0;
        }
    }

    /* renamed from: p0 */
    public void m14523p0() {
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null && this.f12058q == 3) {
            c3025q0.m14572i();
            this.f12023C.f12125p = false;
        }
    }

    /* renamed from: q */
    public int m14524q() {
        ItemAlbumMobile.C7883c c7883c;
        int i11 = 0;
        if (!m14475F(true)) {
            return 0;
        }
        try {
            int min = Math.min(this.f12023C.f12118i.size(), C19587j.f97307a.m102530f(this.f12023C.m14566c()).mo102465h());
            int i12 = 0;
            while (i11 < min) {
                try {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f12023C.f12118i.get(i11);
                    if (itemAlbumMobile != null && (c7883c = itemAlbumMobile.f42596r0) != null) {
                        i12 = (int) Math.max(i12, c7883c.f42617d);
                    }
                    i11++;
                } catch (Exception e11) {
                    e = e11;
                    i11 = i12;
                    AbstractC23350e.m122778h(e);
                    return i11;
                }
            }
            return i12;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: r */
    public boolean m14525r() {
        return this.f12035O == 1;
    }

    /* renamed from: s */
    public CharSequence m14526s() {
        if (!TextUtils.isEmpty(this.f12023C.f12116g)) {
            return this.f12023C.f12116g;
        }
        if (!TextUtils.isEmpty(this.f12023C.f12112c)) {
            return this.f12023C.f12112c;
        }
        return this.f12023C.f12110a;
    }

    /* renamed from: t */
    public CharSequence m14527t() {
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null) {
            return c3025q0.f12110a;
        }
        return "";
    }

    /* renamed from: u */
    public CharSequence m14528u() {
        if (TextUtils.isEmpty(this.f12023C.f12112c)) {
            return this.f12023C.f12110a;
        }
        return this.f12023C.f12112c;
    }

    /* renamed from: v */
    public String m14529v() {
        if (TextUtils.isEmpty(this.f12023C.f12114e)) {
            return this.f12023C.f12113d;
        }
        return this.f12023C.f12114e;
    }

    /* renamed from: v0 */
    public void m14530v0(List list, boolean z11) {
        C3003l3 c3003l3 = this.f12059r;
        if (c3003l3 != null) {
            c3003l3.m14395h(list, z11);
        }
    }

    /* renamed from: w */
    public ArrayList m14531w(boolean z11, boolean z12) {
        if (z11 && (!TextUtils.isEmpty(this.f12023C.f12112c) || (z12 && !TextUtils.isEmpty(this.f12023C.f12116g)))) {
            return this.f12034N;
        }
        return this.f12033M;
    }

    /* renamed from: w0 */
    public void m14532w0() {
        C3043u0 c3043u0 = this.f12024D;
        if (c3043u0 != null) {
            c3043u0.m14621f();
        }
    }

    /* renamed from: x */
    public C3030r0 m14533x() {
        List list = this.f12026F;
        if (list != null && !list.isEmpty()) {
            for (C3030r0 c3030r0 : this.f12026F) {
                if (c3030r0 != null && c3030r0.f12204b == 0) {
                    return c3030r0;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: x0 */
    public void m14534x0(boolean z11) {
        this.f12054h0 = z11;
    }

    /* renamed from: y */
    public ArrayList m14535y() {
        ArrayList arrayList;
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null && (arrayList = c3025q0.f12107P) != null) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: y0 */
    public void m14536y0(String str) {
        TrackingSource m47564v;
        this.f12032L = new ArrayList();
        String replaceAll = str.replaceAll("(\r\n|\n)", "<br/>");
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(replaceAll);
            if (matcher.find() && !replaceAll.contains("<a href=\"http")) {
                replaceAll = matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(replaceAll);
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj);
            int spanEnd = fromHtml.getSpanEnd(obj);
            int spanFlags = fromHtml.getSpanFlags(obj);
            if (obj instanceof URLSpan) {
                C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                c10866e.m56373Q(this.f12057p);
                c10866e.m56394i0(this.f12022B.f12280b);
                if (m14518m0()) {
                    m47564v = new TrackingSource(20);
                } else {
                    m47564v = FeedActionZUtils.m47564v(this.f12057p, this.f12058q);
                }
                c10866e.m56387e0(m47564v);
                c10866e.m56384b0(this.f12025E.f12244b);
                this.f12032L.add(c10866e);
                spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
            }
        }
        this.f12028H = spannableString;
    }

    /* renamed from: z */
    public ArrayList m14537z() {
        ArrayList arrayList;
        C3025q0 c3025q0 = this.f12023C;
        if (c3025q0 != null && (arrayList = c3025q0.f12118i) != null) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: z0 */
    public void m14538z0(String str) {
        TrackingSource trackingSource;
        String str2;
        CharSequence charSequence;
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        C3025q0 c3025q0 = this.f12023C;
        c3025q0.f12113d = normalize;
        c3025q0.f12115f = "";
        m14455O(normalize);
        m14454M(normalize);
        this.f12029I = new ArrayList();
        String m119747k = AbstractC23244v8.m119747k(normalize.replaceAll("(\r\n|\n)", "<br/>"));
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String m14461r0 = m14461r0(m119747k);
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m14461r0);
            while (matcher2.find()) {
                String group = matcher2.group(0);
                if (group.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    if (!matcher3.find()) {
                        str2 = "";
                    } else {
                        String replace = matcher3.group(1).replace("\"", "");
                        str2 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group2 = matcher2.group(1);
                    CharSequence m114542i = AbstractC21935u.m114542i(str2, group2);
                    if (!group2.equals(m114542i)) {
                        charSequence = group.replace(group2, m114542i);
                    } else {
                        charSequence = group;
                    }
                    if (m14461r0.contains(group) && !group.equals(charSequence)) {
                        m14461r0 = m14461r0.replace(group, charSequence);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m14461r0).replaceAll("&lt;"));
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        String m40689a = new TrackingSource.C7894b().m40694f(10).m40691c(this.f12057p).m40693e(this.f12058q).m40692d(m14465A()).m40689a();
        if (spans.length > 0) {
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    if (m14518m0()) {
                        trackingSource = new TrackingSource(20);
                    } else {
                        trackingSource = new TrackingSource(10);
                    }
                    c10866e.m56387e0(trackingSource);
                    c10866e.f54832J = 10;
                    c10866e.f54833K = m40689a;
                    c10866e.m56366J(true);
                    c10866e.m56389f0(m14486Q());
                    this.f12029I.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            m14484N(spannableString, false);
            this.f12023C.f12110a = C28652r.m143349v().m143350A(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(m14461r0.replaceAll("<br/>", "\n"));
        m14484N(spannableString2, false);
        this.f12023C.f12110a = C28652r.m143349v().m143350A(spannableString2);
    }
}
