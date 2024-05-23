package vi;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vi.C28255a;

/* renamed from: vi.d */
/* loaded from: classes3.dex */
public final class C28258d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f131756a;

    /* renamed from: b */
    private String f131757b;

    /* renamed from: c */
    private String f131758c;

    /* renamed from: d */
    private ArrayList f131759d;

    /* renamed from: vi.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28258d m142297a(String str) {
            if (str == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("kind");
                String optString2 = jSONObject.optString("nextPageToken");
                String optString3 = jSONObject.optString("incompleteSearch");
                JSONArray optJSONArray = jSONObject.optJSONArray("files");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        C28255a.a aVar = C28255a.Companion;
                        AbstractC19074t.m100205c(jSONObject2);
                        arrayList.add(aVar.m142287d(jSONObject2));
                    }
                }
                AbstractC19074t.m100205c(optString);
                return new C28258d(optString, optString2, optString3, arrayList);
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
    }

    public C28258d(String str, String str2, String str3, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "kind");
        AbstractC19074t.m100208f(arrayList, "listFile");
        this.f131756a = str;
        this.f131757b = str2;
        this.f131758c = str3;
        this.f131759d = arrayList;
    }

    /* renamed from: a */
    public final ArrayList m142295a() {
        return this.f131759d;
    }

    /* renamed from: b */
    public final String m142296b() {
        return this.f131757b;
    }
}
