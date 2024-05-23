package bo;

import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;

/* renamed from: bo.l3 */
/* loaded from: classes4.dex */
public class C3003l3 {

    /* renamed from: a */
    public int f11956a;

    /* renamed from: b */
    public LinkedHashMap f11957b;

    /* renamed from: c */
    public CharSequence f11958c;

    /* renamed from: d */
    public ArrayList f11959d;

    /* renamed from: e */
    public boolean f11960e;

    /* renamed from: f */
    public TrackingSource f11961f;

    /* renamed from: bo.l3$a */
    /* loaded from: classes4.dex */
    public static class a extends C3003l3 {
        public a(JSONArray jSONArray) {
            super(jSONArray);
        }

        @Override // bo.C3003l3
        /* renamed from: k */
        public void mo14398k() {
            try {
                if (this.f11956a <= 0) {
                    this.f11958c = "";
                    return;
                }
                if (this.f11959d == null) {
                    this.f11959d = new ArrayList();
                }
                this.f11959d.clear();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_feed_tag_prefix_no_hyphen));
                sb2.append("<a href=");
                sb2.append(mo14391d());
                sb2.append(">");
                Resources resources = MainApplication.getAppContext().getResources();
                int i11 = AbstractC7921d0.str_feed_tag_others_friend;
                int i12 = this.f11956a;
                sb2.append(resources.getQuantityString(i11, i12, Integer.valueOf(i12)));
                sb2.append("</a>");
                String sb3 = sb2.toString();
                Spanned fromHtml = Html.fromHtml(sb3);
                SpannableString spannableString = new SpannableString(fromHtml.toString());
                Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
                if (spans.length > 0) {
                    for (Object obj : spans) {
                        int spanStart = fromHtml.getSpanStart(obj);
                        int spanEnd = fromHtml.getSpanEnd(obj);
                        int spanFlags = fromHtml.getSpanFlags(obj);
                        if (obj instanceof URLSpan) {
                            C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                            this.f11959d.add(c10866e);
                            spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                        }
                    }
                    this.f11958c = spannableString;
                    return;
                }
                this.f11958c = sb3.replaceAll("<br/>", "\n");
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f11958c = "";
            }
        }
    }

    /* renamed from: bo.l3$b */
    /* loaded from: classes4.dex */
    public static class b extends C3003l3 {
        public b(JSONArray jSONArray, String str, int i11) {
            super(jSONArray, str, i11);
        }

        @Override // bo.C3003l3
        /* renamed from: c */
        protected void mo14390c(int i11, String str, String str2, String str3, boolean z11, boolean z12) {
            super.mo14390c(i11, str, str2, str3, z11, false);
        }

        @Override // bo.C3003l3
        /* renamed from: d */
        public String mo14391d() {
            return "zm://Other_Tags_Photo/";
        }

        public b(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public C3003l3() {
        this.f11956a = 0;
        this.f11957b = new LinkedHashMap();
        this.f11959d = new ArrayList();
        this.f11958c = "";
        this.f11960e = false;
        this.f11961f = null;
    }

    /* renamed from: a */
    public void m14388a() {
        try {
            this.f11956a = 0;
            LinkedHashMap linkedHashMap = this.f11957b;
            if (linkedHashMap != null) {
                linkedHashMap.clear();
            }
            this.f11958c = "";
            ArrayList arrayList = this.f11959d;
            if (arrayList != null) {
                arrayList.clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean m14389b(String str) {
        LinkedHashMap linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && this.f11956a != 0 && (linkedHashMap = this.f11957b) != null) {
                return linkedHashMap.containsKey(str);
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    protected void mo14390c(int i11, String str, String str2, String str3, boolean z11, boolean z12) {
        int i12;
        try {
            if (this.f11959d == null) {
                this.f11959d = new ArrayList();
            }
            this.f11959d.clear();
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb2.append(String.format("<font color=#%s>%s</font>", Integer.toHexString(C23212s8.m119606n(AbstractC21196a.TextColor2) & 16777215), str));
            }
            LinkedHashMap linkedHashMap = this.f11957b;
            if (linkedHashMap != null && linkedHashMap.size() > 0 && i11 > 0) {
                boolean z13 = true;
                i12 = 0;
                for (String str4 : this.f11957b.keySet()) {
                    if (z13) {
                        z13 = false;
                    } else {
                        sb2.append(", ");
                    }
                    String str5 = (String) this.f11957b.get(str4);
                    if (z11 && str5.length() > 30) {
                        str5 = str5.substring(0, 27) + "...";
                    }
                    sb2.append(String.format(str3, str4, str5));
                    i12++;
                    if (i12 == i11) {
                        break;
                    }
                }
            } else {
                i12 = 0;
            }
            int i13 = this.f11956a - i12;
            if (i13 > 0) {
                if (i12 > 0) {
                    if (z12) {
                        sb2.append(String.format("<font color=#%s>%s</font>", Integer.toHexString(C23212s8.m119606n(AbstractC21196a.TextColor2) & 16777215), MainApplication.getAppContext().getString(AbstractC8020f0.str_feed_tag_and)));
                    } else {
                        sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_feed_tag_and));
                    }
                }
                if (this.f11960e) {
                    sb2.append(i13);
                    sb2.append(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_feed_tag_others));
                } else {
                    sb2.append("<a href=");
                    sb2.append(mo14391d());
                    sb2.append(">");
                    sb2.append(i13);
                    sb2.append(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_feed_tag_others));
                    sb2.append("</a>");
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            Spanned fromHtml = Html.fromHtml(sb3);
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            if (spans.length > 0) {
                for (Object obj : spans) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                        TrackingSource trackingSource = this.f11961f;
                        if (trackingSource != null) {
                            c10866e.m56387e0(trackingSource);
                        }
                        c10866e.m56375S(true);
                        c10866e.m56366J(false);
                        this.f11959d.add(c10866e);
                        spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    } else if (obj instanceof ForegroundColorSpan) {
                        spannableString.setSpan(obj, spanStart, spanEnd, spanFlags);
                    }
                }
                this.f11958c = spannableString;
                return;
            }
            this.f11958c = sb3.replaceAll("<br/>", "\n");
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f11958c = "";
        }
    }

    /* renamed from: d */
    public String mo14391d() {
        return "zm://Other_Tags/";
    }

    /* renamed from: e */
    public ArrayList m14392e() {
        ArrayList arrayList = new ArrayList();
        try {
            LinkedHashMap linkedHashMap = this.f11957b;
            if (linkedHashMap != null && linkedHashMap.size() > 0) {
                arrayList.addAll(this.f11957b.keySet());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: f */
    protected void m14393f(JSONArray jSONArray) {
        String str;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        String m96089h = AbstractC18069a.m96089h(jSONObject, "uid");
                        linkedHashMap.put(m96089h, AbstractC21935u.m114542i(m96089h, AbstractC18069a.m96089h(jSONObject, "dpn")));
                    }
                    this.f11957b.clear();
                    if (linkedHashMap.size() > 0) {
                        if (linkedHashMap.containsKey(CoreUtility.f89233i) && (str = (String) linkedHashMap.remove(CoreUtility.f89233i)) != null) {
                            this.f11957b.put(CoreUtility.f89233i, str);
                        }
                        this.f11957b.putAll(linkedHashMap);
                    }
                    this.f11956a = this.f11957b.size();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public void m14394g(String str, boolean z11) {
        try {
            if (!TextUtils.isEmpty(str) && this.f11957b != null && !TextUtils.isEmpty(str)) {
                if (this.f11957b.containsKey(str)) {
                    this.f11957b.remove(str);
                    int i11 = this.f11956a - 1;
                    this.f11956a = i11;
                    if (i11 < 0) {
                        this.f11956a = 0;
                    }
                }
                if (z11) {
                    mo14398k();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m14395h(List list, boolean z11) {
        if (list != null) {
            try {
                if (list.size() != 0 && this.f11957b != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!TextUtils.isEmpty(str) && this.f11957b.containsKey(str)) {
                            this.f11957b.remove(str);
                            int i11 = this.f11956a - 1;
                            this.f11956a = i11;
                            if (i11 < 0) {
                                this.f11956a = 0;
                            }
                        }
                    }
                    if (z11) {
                        mo14398k();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    public void m14396i(boolean z11) {
        this.f11960e = z11;
        mo14398k();
    }

    /* renamed from: j */
    public JSONArray m14397j() {
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f11956a <= 0) {
            return jSONArray;
        }
        LinkedHashMap linkedHashMap = this.f11957b;
        if (linkedHashMap != null) {
            for (String str : linkedHashMap.keySet()) {
                String str2 = (String) this.f11957b.get(str);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", str);
                    jSONObject.put("dpn", str2);
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: k */
    public void mo14398k() {
        String string = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_feed_tag_prefix_no_hyphen);
        if (this.f11956a <= 0) {
            this.f11958c = "";
        } else {
            mo14390c(2, string, "", "<a href=\"zm://Profile/%s\">%s</a>", false, true);
        }
    }

    public C3003l3(C3003l3 c3003l3) {
        this();
        if (c3003l3 != null) {
            this.f11956a = c3003l3.f11956a;
            this.f11957b = c3003l3.f11957b;
            mo14398k();
        }
    }

    /* renamed from: bo.l3$c */
    /* loaded from: classes4.dex */
    public static class c extends C3003l3 {

        /* renamed from: g */
        public String f11962g;

        public c(JSONObject jSONObject, boolean z11) {
            this.f11962g = "";
            try {
                this.f11960e = z11;
                this.f11961f = new TrackingSource(10);
                if (jSONObject.has("user_follow")) {
                    m14393f(jSONObject.getJSONArray("user_follow"));
                }
                if (jSONObject.has("mesage")) {
                    this.f11962g = jSONObject.getString("mesage");
                }
                mo14398k();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // bo.C3003l3
        /* renamed from: d */
        public String mo14391d() {
            return "zm://Other_Header_Feed";
        }

        @Override // bo.C3003l3
        /* renamed from: k */
        public void mo14398k() {
            int i11;
            int i12 = this.f11956a;
            if (i12 <= 3) {
                i11 = i12;
            } else {
                i11 = 2;
            }
            mo14390c(i11, "", this.f11962g, "<a href=\"zm://ProfileHeader/%s\">%s</a>", true, false);
        }

        /* renamed from: l */
        public JSONObject m14399l() {
            JSONObject jSONObject = new JSONObject();
            try {
                String str = this.f11962g;
                if (str != null) {
                    jSONObject.put("mesage", str);
                }
                if (this.f11956a > 0 && this.f11957b != null) {
                    jSONObject.put("user_follow", super.m14397j());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public c(JSONObject jSONObject, boolean z11, String str, int i11) {
            this.f11962g = "";
            try {
                this.f11960e = z11;
                this.f11961f = FeedActionZUtils.m47564v(str, i11);
                if (jSONObject.has("user_follow")) {
                    m14393f(jSONObject.getJSONArray("user_follow"));
                }
                if (jSONObject.has("mesage")) {
                    this.f11962g = jSONObject.getString("mesage");
                }
                mo14398k();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C3003l3(JSONObject jSONObject) {
        this();
        String str;
        try {
            if (jSONObject.has("tot")) {
                int m96085d = AbstractC18069a.m96085d(jSONObject, "tot");
                this.f11956a = m96085d;
                if (m96085d > 0 && jSONObject.has("fr")) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pattern compile = Pattern.compile("<a[^>]*>(.*?)</a>", 34);
                    Pattern compile2 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34);
                    JSONArray jSONArray = jSONObject.getJSONArray("fr");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        String string = jSONArray.getString(i11);
                        if (!TextUtils.isEmpty(string)) {
                            Matcher matcher = compile2.matcher(string);
                            Matcher matcher2 = compile.matcher(string);
                            while (matcher2.find()) {
                                String str2 = "";
                                if (matcher.find()) {
                                    String replace = matcher.group(1).replace("\"", "");
                                    str2 = replace.substring(replace.lastIndexOf("/") + 1);
                                }
                                String group = matcher2.group(1);
                                string = string.replace(group, AbstractC21935u.m114542i(str2, group));
                                linkedHashMap.put(str2, string);
                            }
                        }
                    }
                    this.f11957b.clear();
                    if (linkedHashMap.size() > 0) {
                        if (linkedHashMap.containsKey(CoreUtility.f89233i) && (str = (String) linkedHashMap.remove(CoreUtility.f89233i)) != null) {
                            this.f11957b.put(CoreUtility.f89233i, str);
                        }
                        this.f11957b.putAll(linkedHashMap);
                    }
                }
            }
            mo14398k();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C3003l3(JSONArray jSONArray) {
        this();
        try {
            m14393f(jSONArray);
            mo14398k();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C3003l3(JSONArray jSONArray, String str, int i11) {
        this();
        try {
            this.f11961f = FeedActionZUtils.m47564v(str, i11);
            m14393f(jSONArray);
            mo14398k();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
