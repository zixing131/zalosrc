package ee;

import ae.C0766k;
import ge.C19419k;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p363nh.C23744a;

/* renamed from: ee.z */
/* loaded from: classes3.dex */
public class C18418z {

    /* renamed from: c */
    private static volatile C18418z f92880c;

    /* renamed from: a */
    private final HashMap f92881a = new HashMap();

    /* renamed from: b */
    boolean f92882b = false;

    /* renamed from: ee.z$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f92883a;

        a(String str) {
            this.f92883a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C18418z.this.f92882b = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("suggestion");
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        arrayList.add(new C19419k(jSONArray.getJSONObject(i11)));
                    }
                    C18418z.this.m97609c(this.f92883a, true).clear();
                    C18418z.this.m97609c(this.f92883a, true).addAll(arrayList);
                    C23744a.m124114c().m124116d(3052, this.f92883a);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C18418z.this.f92882b = false;
        }
    }

    private C18418z() {
    }

    /* renamed from: b */
    public static synchronized C18418z m97607b() {
        C18418z c18418z;
        synchronized (C18418z.class) {
            try {
                if (f92880c == null) {
                    synchronized (C18408p.class) {
                        try {
                            if (f92880c == null) {
                                f92880c = new C18418z();
                            }
                        } finally {
                        }
                    }
                }
                c18418z = f92880c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18418z;
    }

    /* renamed from: a */
    public void m97608a(String str) {
        if (this.f92882b) {
            return;
        }
        this.f92882b = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(str));
        c0766k.mo1626e5(str, "");
    }

    /* renamed from: c */
    public ArrayList m97609c(String str, boolean z11) {
        ArrayList arrayList = (ArrayList) this.f92881a.get(str);
        if (arrayList == null && z11) {
            ArrayList arrayList2 = new ArrayList();
            this.f92881a.put(str, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }
}
