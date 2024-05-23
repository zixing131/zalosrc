package th;

import am.AbstractC0924m0;
import android.text.TextUtils;
import ck0.C3568b;
import dk0.C18020c;
import ho0.AbstractC20110a;
import is.C20793f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lk0.C22505c;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import vu.C28630a;

/* renamed from: th.e */
/* loaded from: classes.dex */
public abstract class AbstractC26684e {

    /* renamed from: a */
    public static boolean f126408a = true;

    /* renamed from: b */
    public static boolean f126409b = true;

    /* renamed from: c */
    public static boolean f126410c = true;

    /* renamed from: d */
    public static String f126411d = null;

    /* renamed from: e */
    public static boolean f126412e = false;

    /* renamed from: f */
    public static boolean f126413f = AbstractC23309i.m122056jg();

    /* renamed from: g */
    public static boolean f126414g = true;

    /* renamed from: h */
    public static boolean f126415h = true;

    /* renamed from: i */
    public static final List f126416i = new ArrayList(Arrays.asList("zalo.me", "zaloapp.com"));

    /* renamed from: j */
    public static final List f126417j = new ArrayList();

    /* renamed from: k */
    public static final List f126418k = new ArrayList();

    /* renamed from: th.e$a */
    /* loaded from: classes3.dex */
    class a implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ C22505c f126419a;

        a(C22505c c22505c) {
            this.f126419a = c22505c;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            C18020c.m95817m().m95829L(this.f126419a);
        }
    }

    /* renamed from: a */
    private static C22505c m137046a(JSONObject jSONObject) {
        return new C22505c(1, jSONObject);
    }

    /* renamed from: b */
    private static void m137047b() {
        f126417j.clear();
        String m100606q = C19172a.m100606q("extend_info_domain_1265");
        if (!TextUtils.isEmpty(m100606q)) {
            try {
                JSONArray jSONArray = new JSONArray(m100606q);
                if (jSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        f126417j.add(jSONArray.optString(i11));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: c */
    private static void m137048c() {
        try {
            f126418k.clear();
            String m2922B1 = AbstractC0924m0.m2922B1();
            if (!TextUtils.isEmpty(m2922B1)) {
                JSONArray jSONArray = new JSONArray(m2922B1);
                if (jSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        f126418k.add(jSONArray.getString(i11));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m137049d() {
        String m122354re;
        JSONArray jSONArray;
        String m120738A1;
        String m122237o8;
        String m122302q;
        f126408a = AbstractC23309i.m121159Lf();
        f126409b = AbstractC23309i.m121750bc();
        f126410c = true;
        f126411d = AbstractC23309i.m121550W();
        f126414g = AbstractC23309i.m121380Re();
        f126415h = AbstractC23309i.m122392sf();
        try {
            if (C20793f.f102166a.m108491a()) {
                m122354re = AbstractC23309i.m122391se();
            } else {
                m122354re = AbstractC23309i.m122354re();
            }
            if (!TextUtils.isEmpty(m122354re)) {
                C3568b.m18124b().m18127d(new a(m137046a(new JSONObject(m122354re).getJSONObject("ZInstantAPIInfo"))));
            }
            String m121893f5 = AbstractC23309i.m121893f5();
            if (!TextUtils.isEmpty(m121893f5)) {
                try {
                    jSONArray = new JSONArray(m121893f5);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                if (jSONArray == null && jSONArray.length() > 0) {
                    f126416i.clear();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        f126416i.add(jSONArray.getString(i11));
                    }
                } else {
                    List list = f126416i;
                    list.clear();
                    list.addAll(Arrays.asList("zalo.me", "zaloapp.com"));
                }
                m120738A1 = AbstractC23309i.m120738A1();
                if (!TextUtils.isEmpty(m120738A1)) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(m120738A1);
                        if (jSONArray2.length() > 0) {
                            C28630a.f132726s.clear();
                            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                                C28630a.f132726s.add(jSONArray2.getString(i12));
                            }
                        }
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                }
                m122237o8 = AbstractC23309i.m122237o8();
                if (!TextUtils.isEmpty(m122237o8)) {
                    try {
                        JSONArray jSONArray3 = new JSONArray(m122237o8);
                        if (jSONArray3.length() > 0) {
                            C28630a.f132728u.clear();
                            for (int i13 = 0; i13 < jSONArray3.length(); i13++) {
                                C28630a.f132728u.add(jSONArray3.getString(i13));
                            }
                        }
                    } catch (Exception e13) {
                        AbstractC20110a.m104539h(e13);
                    }
                }
                m122302q = AbstractC23309i.m122302q();
                if (!TextUtils.isEmpty(m122302q)) {
                    try {
                        JSONArray jSONArray4 = new JSONArray(m122302q);
                        if (jSONArray4.length() > 0) {
                            C28630a.f132727t.clear();
                            for (int i14 = 0; i14 < jSONArray4.length(); i14++) {
                                C28630a.f132727t.add(jSONArray4.getString(i14));
                            }
                        }
                    } catch (Exception e14) {
                        AbstractC20110a.m104539h(e14);
                    }
                }
                AbstractC23775p0.m124216u(AbstractC23309i.m122534w9());
                m137048c();
                m137047b();
            }
            jSONArray = null;
            if (jSONArray == null) {
            }
            List list2 = f126416i;
            list2.clear();
            list2.addAll(Arrays.asList("zalo.me", "zaloapp.com"));
            m120738A1 = AbstractC23309i.m120738A1();
            if (!TextUtils.isEmpty(m120738A1)) {
            }
            m122237o8 = AbstractC23309i.m122237o8();
            if (!TextUtils.isEmpty(m122237o8)) {
            }
            m122302q = AbstractC23309i.m122302q();
            if (!TextUtils.isEmpty(m122302q)) {
            }
            AbstractC23775p0.m124216u(AbstractC23309i.m122534w9());
            m137048c();
            m137047b();
        } catch (Exception e15) {
            AbstractC20110a.m104539h(e15);
        }
    }
}
