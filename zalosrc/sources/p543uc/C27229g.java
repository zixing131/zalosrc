package p543uc;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p128ed.C18390e;
import vi.C28255a;
import vi.C28260f;

/* renamed from: uc.g */
/* loaded from: classes3.dex */
public final class C27229g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f127992a;

    /* renamed from: b */
    private final HashMap f127993b;

    /* renamed from: c */
    private final ArrayList f127994c;

    /* renamed from: d */
    private final ArrayList f127995d;

    /* renamed from: uc.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27229g m139345a(String str) {
            ArrayList arrayList;
            Object obj;
            if (str == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("nextPageToken");
                JSONArray optJSONArray = jSONObject.optJSONArray("files");
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    arrayList = null;
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2.has("properties")) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("properties");
                            if (optJSONObject != null) {
                                obj = optJSONObject.get("local_type");
                            } else {
                                obj = null;
                            }
                            if (AbstractC19074t.m100204b(obj, "type_zip")) {
                                try {
                                    C28260f.a aVar = C28260f.Companion;
                                    AbstractC19074t.m100205c(jSONObject2);
                                    C28260f m142317a = aVar.m142317a(jSONObject2);
                                    String mo142291d = m142317a.mo142291d();
                                    if (!hashMap.containsKey(mo142291d)) {
                                        hashMap.put(mo142291d, m142317a);
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(m142317a);
                                    }
                                } catch (Exception e11) {
                                    AbstractC20110a.f98889a.mo104552e(e11);
                                }
                            } else {
                                C28255a.a aVar2 = C28255a.Companion;
                                AbstractC19074t.m100205c(jSONObject2);
                                arrayList2.add(aVar2.m142287d(jSONObject2));
                            }
                        } else {
                            C28255a.a aVar3 = C28255a.Companion;
                            AbstractC19074t.m100205c(jSONObject2);
                            arrayList2.add(aVar3.m142287d(jSONObject2));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && (!arrayList.isEmpty())) {
                    String str2 = "parseFromJsonString-mapFileZip dup count=" + arrayList.size();
                    AbstractC20110a.f98889a.mo104552e(new Exception(str2));
                    C18390e.m97412t(str2, true);
                }
                AbstractC19074t.m100205c(optString);
                return new C27229g(optString, hashMap, arrayList2, arrayList);
            } catch (JSONException e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                return null;
            }
        }
    }

    public C27229g(String str, HashMap hashMap, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC19074t.m100208f(str, "nextPageToken");
        AbstractC19074t.m100208f(hashMap, "mapFileZip");
        AbstractC19074t.m100208f(arrayList, "listFilePhotoSingle");
        this.f127992a = str;
        this.f127993b = hashMap;
        this.f127994c = arrayList;
        this.f127995d = arrayList2;
    }

    /* renamed from: a */
    public final ArrayList m139340a() {
        return this.f127994c;
    }

    /* renamed from: b */
    public final ArrayList m139341b() {
        return this.f127995d;
    }

    /* renamed from: c */
    public final HashMap m139342c() {
        return this.f127993b;
    }

    /* renamed from: d */
    public final String m139343d() {
        return this.f127992a;
    }

    /* renamed from: e */
    public final int m139344e() {
        return this.f127993b.size() + this.f127994c.size();
    }
}
