package dj;

import android.text.TextUtils;
import ck0.C3568b;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.C17105c;
import com.zing.zalo.zinstant.C17177r0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import lk0.C22504b;
import me0.AbstractC23160o0;
import me0.AbstractC23244v8;
import me0.C23186q4;
import nk0.C23855s0;
import oj0.C24281a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;

/* renamed from: dj.h1 */
/* loaded from: classes3.dex */
public class C17967h1 extends AbstractC18007v0 {

    /* renamed from: J */
    public int f90984J;

    /* renamed from: K */
    public int f90985K;

    /* renamed from: L */
    public long f90986L;

    /* renamed from: M */
    public JSONObject f90987M;

    /* renamed from: N */
    boolean f90988N;

    /* renamed from: O */
    boolean f90989O;

    /* renamed from: P */
    public double f90990P;

    /* renamed from: Q */
    private JSONObject f90991Q;

    /* renamed from: R */
    private C23855s0 f90992R;

    /* renamed from: S */
    private C23855s0 f90993S;

    /* renamed from: T */
    private C22504b f90994T;

    /* renamed from: U */
    private String f90995U;

    /* renamed from: V */
    private List f90996V;

    /* renamed from: W */
    private C17177r0 f90997W;

    /* renamed from: X */
    public C17244x0 f90998X;

    /* renamed from: Y */
    public int f90999Y;

    /* renamed from: Z */
    public int f91000Z;

    /* renamed from: a0 */
    public boolean f91001a0;

    /* renamed from: b0 */
    public int f91002b0;

    /* renamed from: c0 */
    private int f91003c0;

    /* renamed from: dj.h1$a */
    /* loaded from: classes3.dex */
    public class a implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f91004a;

        /* renamed from: b */
        final /* synthetic */ C22504b f91005b;

        a(C17945a0 c17945a0, C22504b c22504b) {
            this.f91004a = c17945a0;
            this.f91005b = c22504b;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            C24281a.m126786b().m126788d(this.f91004a.m95029V3().m41046j(), this.f91004a.m95225p5(this.f91005b), null, this.f91005b, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.h1$b */
    /* loaded from: classes3.dex */
    public class b extends C17177r0 {

        /* renamed from: d */
        final /* synthetic */ C22504b f91007d;

        b(C22504b c22504b) {
            this.f91007d = c22504b;
        }

        @Override // com.zing.zalo.zinstant.C17174q, nj0.AbstractC23802a, com.zing.zalo.zinstant.InterfaceC17139d
        /* renamed from: c */
        public String mo91644c(String str, String str2, String str3) {
            if ("action.query.get.time.local.convert".equals(str)) {
                return C17967h1.m95576h(str2);
            }
            if ("action.query.text.decrypt".equals(str) && !TextUtils.isEmpty(str2) && this.f91007d != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("itemId", this.f91007d.f110129c);
                    return super.mo91644c(str, jSONObject.toString(), str3);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
            return super.mo91644c(str, str2, str3);
        }
    }

    public C17967h1(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f90990P = 1.0d;
        this.f90995U = "";
        this.f90999Y = 0;
        this.f91000Z = 0;
        this.f91001a0 = false;
        this.f91002b0 = 0;
        this.f91003c0 = 0;
        m95588t();
    }

    /* renamed from: h */
    public static String m95576h(String str) {
        DateFormat dateFormat;
        try {
            JSONObject jSONObject = new JSONObject(str);
            long j11 = jSONObject.getLong("timestamp");
            String string = jSONObject.getString("pattern");
            int optInt = jSONObject.optInt("format", 0);
            int optInt2 = jSONObject.optInt("calendar", 0);
            if (AbstractC23160o0.m119247e1(j11)) {
                string = string.replaceAll("EEEE", "'" + MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_today) + "'");
            }
            if (optInt2 == 1) {
                dateFormat = new C23186q4(string, new Locale(AbstractC18458a.f93019a));
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string, new Locale(AbstractC18458a.f93019a));
                simpleDateFormat.getDateFormatSymbols().setWeekdays(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_full));
                simpleDateFormat.getDateFormatSymbols().setWeekdays(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_full));
                simpleDateFormat.getDateFormatSymbols().setShortWeekdays(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_short));
                simpleDateFormat.getDateFormatSymbols().setShortMonths(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_short));
                simpleDateFormat.getDateFormatSymbols().setMonths(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_full));
                dateFormat = simpleDateFormat;
            }
            String format = dateFormat.format(new Date(j11));
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt != 3) {
                        if (optInt == 4) {
                            return AbstractC23244v8.m119739c(format);
                        }
                        return format;
                    }
                    return format.toLowerCase();
                }
                return format.toUpperCase();
            }
            return AbstractC23244v8.m119740d(format);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: q */
    private boolean m95577q(String str) {
        List list = this.f90996V;
        if (list != null && list.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m95578i() {
        return (this.f91000Z & 1) != 0;
    }

    /* renamed from: j */
    public String m95579j() {
        return this.f90995U;
    }

    /* renamed from: k */
    public JSONObject m95580k() {
        try {
            if (this.f90991Q == null) {
                m95588t();
            }
            return this.f90991Q;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public synchronized C17177r0 m95581l(C17945a0 c17945a0) {
        try {
            try {
                C22504b m95583n = m95583n();
                if (this.f90997W == null) {
                    this.f90997W = new b(m95583n);
                }
                if (c17945a0 != this.f90997W.m91780e()) {
                    this.f90997W.m91781f(c17945a0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f90997W;
    }

    /* renamed from: m */
    public int m95582m() {
        return this.f91003c0;
    }

    /* renamed from: n */
    public synchronized C22504b m95583n() {
        try {
            try {
                if (this.f90994T == null) {
                    if (this.f90991Q == null) {
                        m95588t();
                    }
                    this.f90994T = new C22504b(2, this.f90991Q);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f90994T;
    }

    /* renamed from: o */
    public C23855s0 m95584o() {
        return this.f90992R;
    }

    /* renamed from: p */
    public C23855s0 m95585p() {
        return this.f90993S;
    }

    /* renamed from: r */
    public boolean m95586r() {
        if (m95577q("reactions") && this.f91003c0 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean m95587s() {
        if (m95577q("reactions") && this.f91003c0 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public void m95588t() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                boolean z15 = false;
                if (jSONObject.has("layoutType")) {
                    if (jSONObject.getInt("layoutType") == 2) {
                        this.f91002b0 = 2;
                    } else {
                        this.f91002b0 = 0;
                    }
                }
                if (jSONObject.has("id")) {
                    this.f90984J = AbstractC18069a.m96085d(jSONObject, "id");
                }
                if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    this.f90985K = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                }
                if (this.f91002b0 == 2 && jSONObject.has("bubbleItem")) {
                    this.f90991Q = jSONObject.getJSONObject("bubbleItem");
                } else if (jSONObject.has("item")) {
                    this.f90991Q = jSONObject.getJSONObject("item");
                }
                JSONObject jSONObject2 = this.f90991Q;
                if (jSONObject2 != null && jSONObject2.has("content_time")) {
                    this.f90986L = this.f90991Q.optLong("content_time");
                }
                if (jSONObject.has("collapse")) {
                    if (jSONObject.optInt("collapse") == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f91019x = z14;
                }
                if (jSONObject.has("customMsg")) {
                    this.f90987M = jSONObject.getJSONObject("customMsg");
                    this.f90995U = AbstractC19646n0.m102890F(jSONObject.getJSONObject("customMsg"), -1);
                }
                if (jSONObject.has("canPin")) {
                    if (jSONObject.optInt("canPin") == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f90988N = z13;
                }
                if (jSONObject.has("canUndo")) {
                    if (jSONObject.optInt("canUndo") == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f90989O = z12;
                }
                if (jSONObject.has("forceShowMsgInfo")) {
                    if (jSONObject.optInt("forceShowMsgInfo") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f91020y = z11;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("anchors");
                if (optJSONArray != null) {
                    this.f90996V = new ArrayList(optJSONArray.length());
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        String optString = optJSONArray.optString(i11);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f90996V.add(optString);
                        }
                    }
                }
                if (jSONObject.has("maxWidth")) {
                    this.f90990P = AbstractC18069a.m96084c(jSONObject, "maxWidth");
                }
                if (jSONObject.has("zinstantConfig")) {
                    this.f90998X = new C17244x0(jSONObject.getInt("featureType"), jSONObject.getJSONObject("zinstantConfig"));
                }
                if (jSONObject.has("zdataState")) {
                    this.f90999Y = jSONObject.getInt("zdataState");
                }
                if (jSONObject.has("encrypted") && jSONObject.has("decrypted")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("encrypted");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("decrypted");
                    C22504b m95583n = m95583n();
                    if (m95583n != null && jSONArray.length() == jSONArray2.length()) {
                        String str = m95583n.f110129c;
                        int length = jSONArray.length();
                        for (int i12 = 0; i12 < length; i12++) {
                            C17105c.f87481a.m91463c(str, jSONArray.getString(i12), jSONArray2.getString(i12));
                        }
                    }
                }
                if (jSONObject.has("trackingFlags")) {
                    this.f91000Z = jSONObject.getInt("trackingFlags");
                }
                if (jSONObject.has("disableCustomCache")) {
                    if (jSONObject.optInt("disableCustomCache", 0) == 1) {
                        z15 = true;
                    }
                    this.f91001a0 = z15;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public void m95589u(C17945a0 c17945a0) {
        C22504b m95583n = m95583n();
        if (m95583n == null) {
            return;
        }
        C3568b.m18124b().m18127d(new a(c17945a0, m95583n));
    }

    /* renamed from: v */
    public void m95590v() {
        this.f91000Z &= -2;
        try {
            JSONObject jSONObject = new JSONObject(this.f91017v);
            jSONObject.put("trackingFlags", this.f91000Z);
            m95591w(jSONObject);
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: w */
    public void m95591w(JSONObject jSONObject) {
        this.f91017v = jSONObject.toString();
    }

    /* renamed from: x */
    public void m95592x(int i11) {
        this.f91003c0 = i11;
    }

    /* renamed from: y */
    public void m95593y(C23855s0 c23855s0) {
        this.f90992R = c23855s0;
        if (c23855s0 != null) {
            this.f91003c0 = 1;
        } else {
            this.f91003c0 = -1;
        }
    }

    /* renamed from: z */
    public void m95594z(C23855s0 c23855s0) {
        this.f90993S = c23855s0;
    }

    public C17967h1(JSONObject jSONObject) {
        super(jSONObject);
        this.f90990P = 1.0d;
        this.f90995U = "";
        this.f90999Y = 0;
        this.f91000Z = 0;
        this.f91001a0 = false;
        this.f91002b0 = 0;
        this.f91003c0 = 0;
        m95588t();
    }
}
