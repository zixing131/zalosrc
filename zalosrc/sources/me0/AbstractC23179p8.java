package me0;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import au.AbstractC2373t;
import au.C2352i0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import su.AbstractC26389c;

/* renamed from: me0.p8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23179p8 {

    /* renamed from: a */
    private static volatile List f112384a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.p8$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f112385a;

        /* renamed from: b */
        final /* synthetic */ Runnable f112386b;

        /* renamed from: me0.p8$a$a */
        /* loaded from: classes4.dex */
        class C32896a extends AbstractC0939u {
            C32896a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                try {
                    Iterator it = a.this.f112385a.iterator();
                    while (it.hasNext()) {
                        C7960e.m41971c6().m42384ee((ContactProfile) it.next());
                    }
                    Runnable runnable = a.this.f112386b;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        a(List list, Runnable runnable) {
            this.f112385a = list;
            this.f112386b = runnable;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                AbstractC23309i.m121392Rq(System.currentTimeMillis());
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("identifiers")) != null) {
                    for (ContactProfile contactProfile : this.f112385a) {
                        if (optJSONObject.has(contactProfile.f42434r)) {
                            JSONObject jSONObject = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optJSONObject.optString(contactProfile.f42434r)));
                            contactProfile.f42446v = jSONObject.optString("avatar_url");
                            contactProfile.f42437s = jSONObject.optString("dname");
                            contactProfile.f42460z1 = jSONObject.optString("uname");
                            contactProfile.f42455y = jSONObject.optString("phone_num");
                            contactProfile.f42427o1 = AbstractC23028c0.m118087g(contactProfile.f42437s);
                        }
                    }
                }
                C0824j.m2153b(new C32896a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m119416b(ContactProfile contactProfile) {
        try {
            if (m119420f(contactProfile.f42434r)) {
                synchronized (AbstractC23179p8.class) {
                    try {
                        for (ContactProfile contactProfile2 : m119417c()) {
                            if (contactProfile2.f42434r.equals(contactProfile.f42434r)) {
                                contactProfile2.f42437s = contactProfile.f42437s;
                                contactProfile2.f42446v = contactProfile.f42446v;
                                contactProfile2.f42460z1 = contactProfile.f42460z1;
                                contactProfile2.f42455y = contactProfile.f42455y;
                                contactProfile2.f42362N1 = contactProfile.f42362N1;
                                contactProfile2.f42423m1 = System.currentTimeMillis();
                                contactProfile2.f42427o1 = AbstractC23028c0.m118087g(contactProfile2.f42437s);
                            }
                        }
                    } finally {
                    }
                }
            } else {
                f112384a.add(contactProfile);
            }
            C7960e.m41971c6().m42604z7(contactProfile);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    private static List m119417c() {
        if (f112384a == null) {
            synchronized (AbstractC23179p8.class) {
                try {
                    if (f112384a == null) {
                        f112384a = C7960e.m41971c6().m42550u5();
                    }
                } finally {
                }
            }
        }
        return f112384a;
    }

    /* renamed from: d */
    public static String m119418d(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = m119419e().iterator();
            while (it.hasNext()) {
                jSONArray.put(((ContactProfile) it.next()).f42434r);
            }
            jSONObject.put("uid_old", str);
            jSONObject.put("size", jSONArray.length());
            jSONObject.put("account_list", jSONArray);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: e */
    public static List m119419e() {
        ContactProfile contactProfile;
        ArrayList arrayList = new ArrayList();
        synchronized (AbstractC23179p8.class) {
            try {
                contactProfile = null;
                for (ContactProfile contactProfile2 : m119417c()) {
                    if (contactProfile2.f42434r.equals(CoreUtility.f89233i)) {
                        contactProfile = contactProfile2;
                    } else {
                        arrayList.add(contactProfile2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (contactProfile == null) {
            arrayList.clear();
        } else {
            ContactProfile contactProfile3 = AbstractC23304d.f113368c0;
            if (contactProfile3 != null) {
                contactProfile.f42455y = contactProfile3.f42455y;
                contactProfile.f42437s = contactProfile3.f42437s;
                contactProfile.f42446v = contactProfile3.f42446v;
                contactProfile.f42460z1 = contactProfile3.f42460z1;
            }
            Collections.sort(arrayList, new Comparator() { // from class: me0.o8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m119422h;
                    m119422h = AbstractC23179p8.m119422h((ContactProfile) obj, (ContactProfile) obj2);
                    return m119422h;
                }
            });
            arrayList.add(0, contactProfile);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m119420f(String str) {
        synchronized (AbstractC23179p8.class) {
            try {
                Iterator it = m119417c().iterator();
                while (it.hasNext()) {
                    if (((ContactProfile) it.next()).f42434r.equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static boolean m119421g() {
        return f112384a != null;
    }

    /* renamed from: h */
    public static /* synthetic */ int m119422h(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return Long.compare(contactProfile2.f42423m1, contactProfile.f42423m1);
    }

    /* renamed from: i */
    public static void m119423i(Runnable runnable) {
        try {
            ArrayList arrayList = new ArrayList(m119417c());
            if (arrayList.size() > 1 && System.currentTimeMillis() - AbstractC23309i.m122420t6() > AbstractC23309i.m121674Zc()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(((ContactProfile) it.next()).f42434r)));
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(arrayList, runnable));
                c0766k.mo1769w9(AbstractC23006a0.m117905e(), arrayList2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m119424j(String str) {
        try {
            synchronized (AbstractC23179p8.class) {
                try {
                    f112384a = m119417c();
                    int size = f112384a.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        if (((ContactProfile) f112384a.get(size)).f42434r.equals(str)) {
                            f112384a.remove(size);
                            break;
                        }
                        size--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (C7960e.m41971c6().m42169Jc(str) <= 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: k */
    public static void m119425k() {
        synchronized (AbstractC23179p8.class) {
            f112384a = new ArrayList();
        }
        C7960e.m41971c6().m42122Fb();
    }

    /* renamed from: l */
    public static void m119426l(String str) {
        try {
            synchronized (AbstractC23179p8.class) {
                try {
                    for (ContactProfile contactProfile : m119417c()) {
                        if (contactProfile.f42434r.equals(str)) {
                            contactProfile.f42362N1 = "";
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C7960e.m41971c6().m42192Lc(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m119427m(C2352i0 c2352i0, String str, int i11) {
        String m12333f;
        if (c2352i0 == null) {
            return;
        }
        try {
            long m12331b = c2352i0.m12331b(str);
            if (m12331b != Long.MIN_VALUE && i11 != -1 && (m12333f = c2352i0.m12333f()) != null && !TextUtils.isEmpty(m12333f)) {
                if (!TextUtils.isEmpty(c2352i0.m12334g())) {
                    str = str + ", uidSwitchTo:" + c2352i0.m12334g();
                }
                AbstractC20887g.m109231i(m12333f, i11, str, m12331b, 123100, CoreUtility.f89236l);
            }
        } catch (Exception unused) {
        }
    }
}
