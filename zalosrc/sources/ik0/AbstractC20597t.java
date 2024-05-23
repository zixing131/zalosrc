package ik0;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import ik0.AbstractC20596s;
import ik0.C20581d;
import java.util.Iterator;
import lk0.C22504b;
import org.json.JSONObject;

/* renamed from: ik0.t */
/* loaded from: classes7.dex */
public abstract class AbstractC20597t {

    /* renamed from: ik0.t$a */
    /* loaded from: classes7.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC20597t mo107081a();

        /* renamed from: b */
        public abstract a mo107082b(AbstractC20596s abstractC20596s);

        /* renamed from: c */
        public abstract a mo107083c(AbstractC20596s abstractC20596s);
    }

    /* renamed from: a */
    public static a m107198a(C22504b c22504b) {
        return m107199b(c22504b, null, null);
    }

    /* renamed from: b */
    public static a m107199b(C22504b c22504b, String str, String str2) {
        AbstractC20596s.b mo107075a;
        AbstractC20596s abstractC20596s = null;
        AbstractC20596s.b bVar = null;
        if (TextUtils.isEmpty(c22504b.f110136j)) {
            mo107075a = null;
        } else {
            mo107075a = AbstractC20596s.b.m107197a(c22504b.f110135i, c22504b.f110136j).mo107075a();
        }
        AbstractC20596s mo107064a = AbstractC20596s.m107196b(1, c22504b.f110128b, c22504b.f110130d, c22504b.f110129c, str).mo107068e(str2).mo107067d(mo107075a).mo107065b(c22504b.f110140n).mo107064a();
        if (!m107201d(c22504b.f110137k)) {
            if (!TextUtils.isEmpty(c22504b.f110139m)) {
                bVar = AbstractC20596s.b.m107197a(3, c22504b.f110139m).mo107075a();
            }
            abstractC20596s = AbstractC20596s.m107195a(2, c22504b.f110128b, c22504b.f110138l, c22504b.f110137k).mo107068e(str2).mo107067d(bVar).mo107064a();
        }
        return new C20581d.b().m107084d(c22504b.f110128b).mo107082b(mo107064a).mo107083c(abstractC20596s);
    }

    /* renamed from: c */
    public static a m107200c(C22504b c22504b, String str, String str2, String str3) {
        AbstractC20596s.b mo107075a;
        AbstractC20596s abstractC20596s = null;
        AbstractC20596s.b bVar = null;
        if (TextUtils.isEmpty(c22504b.f110136j)) {
            mo107075a = null;
        } else {
            mo107075a = AbstractC20596s.b.m107197a(c22504b.f110135i, c22504b.f110136j).mo107075a();
        }
        AbstractC20596s mo107064a = AbstractC20596s.m107196b(1, c22504b.f110128b, c22504b.f110130d, c22504b.f110129c, str).mo107068e(str2).mo107067d(mo107075a).mo107065b(m107202e(c22504b.f110140n, str3)).mo107064a();
        if (!m107201d(c22504b.f110137k)) {
            if (!TextUtils.isEmpty(c22504b.f110139m)) {
                bVar = AbstractC20596s.b.m107197a(3, c22504b.f110139m).mo107075a();
            }
            abstractC20596s = AbstractC20596s.m107195a(2, c22504b.f110128b, c22504b.f110138l, c22504b.f110137k).mo107068e(str2).mo107067d(bVar).mo107064a();
        }
        return new C20581d.b().m107084d(c22504b.f110128b).mo107082b(mo107064a).mo107083c(abstractC20596s);
    }

    /* renamed from: d */
    public static boolean m107201d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m107202e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104546o(e11);
            return str;
        }
    }

    /* renamed from: f */
    public abstract AbstractC20596s mo107078f();

    /* renamed from: g */
    public abstract AbstractC20596s mo107079g();

    /* renamed from: h */
    public abstract String mo107080h();
}
