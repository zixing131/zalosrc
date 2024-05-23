package is;

import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p304ks.AbstractC21935u;
import p363nh.AbstractC23775p0;
import p363nh.InterfaceC23785u0;
import p716zh.C32078q7;
import vg.C28203u6;

/* renamed from: is.z */
/* loaded from: classes4.dex */
public abstract class AbstractC20833z {

    /* renamed from: a */
    public static List f102405a;

    /* renamed from: b */
    public static List f102406b;

    /* renamed from: c */
    public static List f102407c;

    /* renamed from: d */
    public static List f102408d;

    /* renamed from: e */
    public static List f102409e;

    /* renamed from: f */
    public static List f102410f;

    /* renamed from: g */
    public static List f102411g;

    /* renamed from: A */
    public static /* synthetic */ boolean m108886A(C20817r c20817r, String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(c20817r.m108722g());
        }
        return false;
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m108887B(C20817r c20817r, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("LIKE_" + c20817r.m108721f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m108888C(C20817r c20817r, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("MISS_MULTIPLE_FEEDS_" + c20817r.m108723h())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m108889D(C20817r c20817r, String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.endsWith(c20817r.m108722g());
        }
        return false;
    }

    /* renamed from: E */
    private static String m108890E(String str) {
        Matcher matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(str);
        String str2 = "";
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group.startsWith("<a href=\"zm://Comment/")) {
                str2 = Html.fromHtml(group).toString();
            } else if (group.startsWith("<a href=\"zm://Photo/")) {
                str2 = Html.fromHtml(group).toString();
            }
        }
        return str2;
    }

    /* renamed from: F */
    private static List m108891F(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(str);
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group.startsWith("<a href=\"zm://Profile/")) {
                Matcher matcher2 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                String str2 = "";
                if (matcher2.find()) {
                    String replace = matcher2.group(1).replace("\"", "");
                    str2 = replace.substring(replace.lastIndexOf("/") + 1);
                }
                arrayList.add(AbstractC21935u.m114542i(str2, matcher.group(1)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.text.SpannableString, android.text.Spannable] */
    /* renamed from: G */
    public static CharSequence m108892G(String str, String str2, String str3, String str4, String str5) {
        char c11;
        int i11;
        int indexOf;
        try {
            switch (str.hashCode()) {
                case -1348026953:
                    if (str.equals("like_comment")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -253014634:
                    if (str.equals("new_story")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3321751:
                    if (str.equals("like")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 950398559:
                    if (str.equals("comment")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1376909533:
                    if (str.equals("new_feed")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1750351177:
                    if (str.equals("miss_multiple_feeds")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1984255539:
                    if (str.equals("story_reaction")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    String m42580x6 = C7960e.m41971c6().m42580x6(str, str2);
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(m42580x6)) {
                        arrayList.addAll(Arrays.asList(m42580x6.split(",")));
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (size > 200 || ((String) arrayList.get(size)).equals(str3)) {
                            arrayList.remove(size);
                        }
                    }
                    arrayList.add(0, str3);
                    List<String> m108913r = m108913r(arrayList, 2);
                    String m108906k = m108906k(m108913r, arrayList.size());
                    String m108890E = m108890E(str5);
                    if (!TextUtils.isEmpty(m108906k) && !TextUtils.isEmpty(m108890E)) {
                        if (arrayList.size() > 1) {
                            i11 = AbstractC8020f0.str_noti_social_like_feed_plural;
                        } else {
                            i11 = AbstractC8020f0.str_noti_social_like_feed;
                        }
                        String format = String.format(AbstractC23136l9.m118743r0(i11), m108906k, m108890E);
                        if (m108913r != null) {
                            ?? spannableString = new SpannableString(format);
                            for (String str6 : m108913r) {
                                int indexOf2 = format.indexOf(str6);
                                if (indexOf2 >= 0) {
                                    spannableString.setSpan(new StyleSpan(1), indexOf2, str6.length() + indexOf2, 33);
                                }
                            }
                            str4 = spannableString;
                        }
                    }
                    C7960e.m41971c6().m42215Nd(str, str2, TextUtils.join(",", arrayList));
                    return str4;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    List<String> m108891F = m108891F(str5);
                    SpannableString spannableString2 = new SpannableString(str4);
                    for (String str7 : m108891F) {
                        if (!TextUtils.isEmpty(str7) && (indexOf = str4.indexOf(str7)) >= 0) {
                            spannableString2.setSpan(new StyleSpan(1), indexOf, str7.length() + indexOf, 33);
                        }
                    }
                    return spannableString2;
                default:
                    return str4;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return str4;
        }
    }

    /* renamed from: H */
    public static void m108893H() {
        C7960e.m41971c6().m42491oc("like", 604800);
        C7960e.m41971c6().m42478nc("like", 200);
        C7960e.m41971c6().m42491oc("like_comment", 604800);
        C7960e.m41971c6().m42478nc("like_comment", 200);
    }

    /* renamed from: I */
    public static void m108894I() {
        try {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67683RN(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static void m108895J() {
        try {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67683RN(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m108903h() {
        try {
            AbstractC23775p0.m124199d("new_story", new InterfaceC23785u0() { // from class: is.x
                @Override // p363nh.InterfaceC23785u0
                /* renamed from: a */
                public final boolean mo108726a(String str) {
                    boolean m108919x;
                    m108919x = AbstractC20833z.m108919x(str);
                    return m108919x;
                }
            });
            AbstractC23775p0.m124199d("story_reaction", new InterfaceC23785u0() { // from class: is.y
                @Override // p363nh.InterfaceC23785u0
                /* renamed from: a */
                public final boolean mo108726a(String str) {
                    boolean m108920y;
                    m108920y = AbstractC20833z.m108920y(str);
                    return m108920y;
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    public static void m108904i(String str, C20817r c20817r) {
        char c11;
        if (!TextUtils.isEmpty(str) && c20817r != null) {
            try {
                switch (str.hashCode()) {
                    case -1348026953:
                        if (str.equals("like_comment")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1077756671:
                        if (str.equals("memory")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -253014634:
                        if (str.equals("new_story")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3321751:
                        if (str.equals("like")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 76353254:
                        if (str.equals("zalo_video")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 950398559:
                        if (str.equals("comment")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1750351177:
                        if (str.equals("miss_multiple_feeds")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1837742968:
                        if (str.equals("story_archive")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1984255539:
                        if (str.equals("story_reaction")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 23) {
                            AbstractC23775p0.m124199d(str, new InterfaceC23785u0() { // from class: is.s
                                public /* synthetic */ C20819s() {
                                }

                                @Override // p363nh.InterfaceC23785u0
                                /* renamed from: a */
                                public final boolean mo108726a(String str2) {
                                    boolean m108921z;
                                    m108921z = AbstractC20833z.m108921z(C20817r.this, str2);
                                    return m108921z;
                                }
                            });
                            return;
                        } else {
                            AbstractC23775p0.m124198c(str, m108911p(str, c20817r));
                            return;
                        }
                    case 1:
                    case 2:
                        if (Build.VERSION.SDK_INT >= 23) {
                            AbstractC23775p0.m124199d(str, new InterfaceC23785u0() { // from class: is.t
                                public /* synthetic */ C20821t() {
                                }

                                @Override // p363nh.InterfaceC23785u0
                                /* renamed from: a */
                                public final boolean mo108726a(String str2) {
                                    boolean m108886A;
                                    m108886A = AbstractC20833z.m108886A(C20817r.this, str2);
                                    return m108886A;
                                }
                            });
                            return;
                        } else {
                            AbstractC23775p0.m124198c(str, m108911p(str, c20817r));
                            return;
                        }
                    case 3:
                    case 4:
                        if (Build.VERSION.SDK_INT >= 23) {
                            AbstractC23775p0.m124199d(str, new InterfaceC23785u0() { // from class: is.u
                                public /* synthetic */ C20823u() {
                                }

                                @Override // p363nh.InterfaceC23785u0
                                /* renamed from: a */
                                public final boolean mo108726a(String str2) {
                                    boolean m108887B;
                                    m108887B = AbstractC20833z.m108887B(C20817r.this, str2);
                                    return m108887B;
                                }
                            });
                            return;
                        } else {
                            AbstractC23775p0.m124198c(str, m108911p(str, c20817r));
                            return;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT >= 23) {
                            AbstractC23775p0.m124199d(str, new InterfaceC23785u0() { // from class: is.v
                                public /* synthetic */ C20825v() {
                                }

                                @Override // p363nh.InterfaceC23785u0
                                /* renamed from: a */
                                public final boolean mo108726a(String str2) {
                                    boolean m108888C;
                                    m108888C = AbstractC20833z.m108888C(C20817r.this, str2);
                                    return m108888C;
                                }
                            });
                            return;
                        } else {
                            AbstractC23775p0.m124198c(str, m108911p(str, c20817r));
                            return;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT >= 23) {
                            AbstractC23775p0.m124199d(str, new InterfaceC23785u0() { // from class: is.w
                                public /* synthetic */ C20827w() {
                                }

                                @Override // p363nh.InterfaceC23785u0
                                /* renamed from: a */
                                public final boolean mo108726a(String str2) {
                                    boolean m108889D;
                                    m108889D = AbstractC20833z.m108889D(C20817r.this, str2);
                                    return m108889D;
                                }
                            });
                            return;
                        } else {
                            AbstractC23775p0.m124198c(str, m108911p(str, c20817r));
                            return;
                        }
                    default:
                        AbstractC23775p0.m124198c(str, m108911p(str, c20817r));
                        return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static void m108905j(String str) {
        AbstractC23775p0.m124198c("miss_multiple_feeds", str);
    }

    /* renamed from: k */
    private static String m108906k(List list, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (list != null) {
            if (list.size() == 1) {
                sb2.append((String) list.get(0));
            } else if (list.size() >= 2) {
                if (i11 == 2) {
                    sb2.append((String) list.get(0));
                    sb2.append(String.format(" %s ", AbstractC23136l9.m118743r0(AbstractC8020f0.str_and)));
                    sb2.append((String) list.get(1));
                } else if (i11 > 2) {
                    sb2.append((String) list.get(0));
                    sb2.append(String.format(", %s ", list.get(1)));
                    sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select_n_friend), Integer.valueOf(i11 - 2)));
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: l */
    public static String m108907l(int i11, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            if (i11 != 122 && i11 != 213) {
                if (i11 != 125 || jSONObject.isNull("uidFrom")) {
                    return "";
                }
                return AbstractC18069a.m96089h(jSONObject, "uidFrom");
            }
            if (jSONObject.isNull("cid")) {
                return "";
            }
            return AbstractC18069a.m96089h(jSONObject, "cid");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return "";
    }

    /* renamed from: m */
    public static String m108908m(C32078q7 c32078q7) {
        try {
            Iterator it = c32078q7.m154758n().iterator();
            while (it.hasNext()) {
                C10866e c10866e = (C10866e) it.next();
                int m56406u = c10866e.m56406u();
                String m56393i = c10866e.m56393i();
                if (m56393i != null) {
                    if (m56406u == 1) {
                        return m56393i.split("/")[1];
                    }
                    if (m56406u == 2) {
                        return c32078q7.m154766w();
                    }
                }
            }
            return "";
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: n */
    public static List m108909n(String str) {
        m108914s();
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1348026953:
                if (str.equals("like_comment")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1077756671:
                if (str.equals("memory")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3321751:
                if (str.equals("like")) {
                    c11 = 2;
                    break;
                }
                break;
            case 950398559:
                if (str.equals("comment")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1376909533:
                if (str.equals("new_feed")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1750351177:
                if (str.equals("miss_multiple_feeds")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1837742968:
                if (str.equals("story_archive")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return f102408d;
            case 1:
                return f102409e;
            case 2:
                return f102407c;
            case 3:
                return f102406b;
            case 4:
                return f102405a;
            case 5:
                return f102410f;
            case 6:
                return f102411g;
            default:
                return new ArrayList();
        }
    }

    /* renamed from: o */
    public static String m108910o(String str) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s)) {
            String m40383Q = m141809c.m40383Q(true, false);
            if (TextUtils.isEmpty(m40383Q)) {
                return m141809c.f42437s;
            }
            return m40383Q;
        }
        return "";
    }

    /* renamed from: p */
    public static String m108911p(String str, C20817r c20817r) {
        char c11;
        if (c20817r == null) {
            return "";
        }
        try {
            switch (str.hashCode()) {
                case -1348026953:
                    if (str.equals("like_comment")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1077756671:
                    if (str.equals("memory")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -253014634:
                    if (str.equals("new_story")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3321751:
                    if (str.equals("like")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 950398559:
                    if (str.equals("comment")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1750351177:
                    if (str.equals("miss_multiple_feeds")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1837742968:
                    if (str.equals("story_archive")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1984255539:
                    if (str.equals("story_reaction")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    if (Build.VERSION.SDK_INT >= 23) {
                        return "COMMENT_" + c20817r.m108721f() + c20817r.m108723h();
                    }
                    return "COMMENT_" + c20817r.m108721f();
                case 1:
                case 2:
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (c20817r.m108725j()) {
                            return "EXPIRE_STORY_";
                        }
                        return c20817r.m108722g();
                    }
                    return c20817r.m108722g();
                case 3:
                case 4:
                    if (Build.VERSION.SDK_INT >= 23) {
                        return "LIKE_" + c20817r.m108721f() + c20817r.m108720e();
                    }
                    return "LIKE_" + c20817r.m108721f();
                case 5:
                    return "MEMORY_";
                case 6:
                    return "MISS_MULTIPLE_FEEDS_" + c20817r.m108723h() + c20817r.m108724i();
                case 7:
                    return "STORY_ARCHIVE_" + c20817r.m108722g();
                default:
                    return c20817r.m108721f();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: q */
    public static String m108912q(int i11) {
        m108914s();
        List list = f102405a;
        if (list != null && list.contains(Integer.valueOf(i11))) {
            return "new_feed";
        }
        List list2 = f102406b;
        if (list2 != null && list2.contains(Integer.valueOf(i11))) {
            return "comment";
        }
        List list3 = f102407c;
        if (list3 != null && list3.contains(Integer.valueOf(i11))) {
            return "like";
        }
        List list4 = f102408d;
        if (list4 != null && list4.contains(Integer.valueOf(i11))) {
            return "like_comment";
        }
        List list5 = f102409e;
        if (list5 != null && list5.contains(Integer.valueOf(i11))) {
            return "memory";
        }
        List list6 = f102410f;
        if (list6 != null && list6.contains(Integer.valueOf(i11))) {
            return "miss_multiple_feeds";
        }
        List list7 = f102411g;
        if (list7 != null && list7.contains(Integer.valueOf(i11))) {
            return "story_archive";
        }
        return "default";
    }

    /* renamed from: r */
    private static List m108913r(List list, int i11) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                String m108910o = m108910o((String) list.get(i12));
                if (!TextUtils.isEmpty(m108910o)) {
                    arrayList.add(m108910o);
                }
                if (arrayList.size() >= i11) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private static void m108914s() {
        if (f102405a == null) {
            ArrayList arrayList = new ArrayList();
            f102405a = arrayList;
            arrayList.add(107);
            f102405a.add(108);
            f102405a.add(Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10));
            f102405a.add(113);
            f102405a.add(114);
            f102405a.add(115);
            f102405a.add(204);
            f102405a.add(17);
            f102405a.add(117);
            f102405a.add(301);
            f102405a.add(250);
            f102405a.add(251);
            f102405a.add(252);
            f102405a.add(123);
            f102405a.add(124);
        }
        if (f102406b == null) {
            ArrayList arrayList2 = new ArrayList();
            f102406b = arrayList2;
            arrayList2.add(103);
            f102406b.add(104);
            f102406b.add(111);
            f102406b.add(112);
            f102406b.add(201);
            f102406b.add(206);
            f102406b.add(207);
            f102406b.add(208);
            f102406b.add(119);
            f102406b.add(121);
            f102406b.add(210);
            f102406b.add(212);
            f102406b.add(302);
            f102406b.add(304);
        }
        if (f102407c == null) {
            ArrayList arrayList3 = new ArrayList();
            f102407c = arrayList3;
            arrayList3.add(105);
            f102407c.add(106);
            f102407c.add(203);
            f102407c.add(118);
            f102407c.add(120);
            f102407c.add(209);
            f102407c.add(211);
            f102407c.add(303);
        }
        if (f102408d == null) {
            ArrayList arrayList4 = new ArrayList();
            f102408d = arrayList4;
            arrayList4.add(Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422));
            f102408d.add(213);
        }
        if (f102409e == null) {
            ArrayList arrayList5 = new ArrayList();
            f102409e = arrayList5;
            arrayList5.add(306);
        }
        if (f102410f == null) {
            ArrayList arrayList6 = new ArrayList();
            f102410f = arrayList6;
            arrayList6.add(125);
        }
        if (f102411g == null) {
            ArrayList arrayList7 = new ArrayList();
            f102411g = arrayList7;
            arrayList7.add(1624);
            f102411g.add(1625);
            f102411g.add(1626);
        }
    }

    /* renamed from: t */
    public static boolean m108915t(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -253014634:
                if (str.equals("new_story")) {
                    c11 = 0;
                    break;
                }
                break;
            case 1376909533:
                if (str.equals("new_feed")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1750351177:
                if (str.equals("miss_multiple_feeds")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: u */
    private static boolean m108916u(int i11) {
        return m108909n("comment").contains(Integer.valueOf(i11));
    }

    /* renamed from: v */
    public static boolean m108917v(TrackingSource trackingSource) {
        if (trackingSource != null) {
            try {
                if (trackingSource.m40683t() != 15 && trackingSource.m40683t() != 50) {
                    return false;
                }
                if (m108916u(((Integer) trackingSource.m40679l("actID")).intValue())) {
                    return true;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m108918w(int i11) {
        return m108912q(i11).equals("like");
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m108919x(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.endsWith("EXPIRE_STORY_");
        }
        return false;
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m108920y(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.endsWith("EXPIRE_STORY_");
        }
        return false;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m108921z(C20817r c20817r, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("COMMENT_" + c20817r.m108721f())) {
                return true;
            }
        }
        return false;
    }
}
