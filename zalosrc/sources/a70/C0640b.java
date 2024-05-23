package a70;

import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23184q2;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p205hc.InterfaceC19969h;
import p716zh.C31973j5;
import vg.C28203u6;

/* renamed from: a70.b */
/* loaded from: classes5.dex */
public final class C0640b implements InterfaceC19969h {

    /* renamed from: a */
    public static final C0640b f2162a = new C0640b();

    /* renamed from: b */
    private static String f2163b = "";

    /* renamed from: c */
    private static ArrayList f2164c = new ArrayList();

    /* renamed from: d */
    private static String f2165d = "";

    /* renamed from: e */
    private static C31973j5 f2166e;

    private C0640b() {
    }

    /* renamed from: b */
    public static final C0640b m911b(Bundle bundle) {
        String str;
        C0640b c0640b = f2162a;
        if (bundle != null) {
            f2164c.clear();
            if (bundle.containsKey("EXTRA_DATA")) {
                str = bundle.getString("EXTRA_DATA");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    AbstractC19074t.m100205c(str);
                    JSONObject jSONObject = new JSONObject(str);
                    JSONArray optJSONArray = jSONObject.optJSONArray("contacts");
                    if (optJSONArray != null) {
                        AbstractC19074t.m100205c(optJSONArray);
                        final ArrayList arrayList = new ArrayList();
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            long j11 = optJSONArray.getLong(i11);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(j11);
                            String sb3 = sb2.toString();
                            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, sb3, false, 2, null);
                            if (m141800i != null) {
                                f2164c.add(m141800i);
                            } else {
                                arrayList.add(sb3);
                            }
                        }
                        if (arrayList.size() > 0) {
                            AbstractC23184q2.m119463u(arrayList, new Runnable() { // from class: a70.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0640b.m912c(arrayList);
                                }
                            });
                        }
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("errorMsg");
                    String str2 = AbstractC18458a.f93019a;
                    if (AbstractC19074t.m100204b(str2, "vi")) {
                        String optString = jSONObject2.optString("vi");
                        AbstractC19074t.m100207e(optString, "optString(...)");
                        f2165d = optString;
                    } else if (AbstractC19074t.m100204b(str2, "my")) {
                        String optString2 = jSONObject2.optString("my");
                        AbstractC19074t.m100207e(optString2, "optString(...)");
                        f2165d = optString2;
                    } else {
                        String optString3 = jSONObject2.optString("en");
                        AbstractC19074t.m100207e(optString3, "optString(...)");
                        f2165d = optString3;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (bundle.containsKey("GROUP_ID")) {
                String string = bundle.getString("GROUP_ID");
                AbstractC19074t.m100205c(string);
                f2163b = string;
                f2166e = C0943w.f3447a.m4472f(f2163b);
            }
        }
        return c0640b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m912c(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listUidUnknown");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, (String) it.next(), null, 2, null);
            if (m141798e != null) {
                f2164c.add(m141798e);
            }
        }
    }

    /* renamed from: d */
    public final ArrayList m913d() {
        return f2164c;
    }

    /* renamed from: e */
    public final String m914e() {
        return f2165d;
    }

    /* renamed from: f */
    public final C31973j5 m915f() {
        return f2166e;
    }
}
