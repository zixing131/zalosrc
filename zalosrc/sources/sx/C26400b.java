package sx;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.AbstractC21935u;

/* renamed from: sx.b */
/* loaded from: classes4.dex */
public class C26400b implements Serializable {

    /* renamed from: p */
    private String f125410p;

    /* renamed from: q */
    private String f125411q;

    /* renamed from: r */
    private int f125412r;

    /* renamed from: s */
    private int f125413s;

    /* renamed from: t */
    private List f125414t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [sx.d] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, sx.c] */
    /* JADX WARN: Type inference failed for: r3v6, types: [sx.e] */
    /* renamed from: i */
    public static C26400b m136124i(JSONObject jSONObject) {
        ?? c26402d;
        C26400b c26400b = new C26400b();
        c26400b.m136136m(jSONObject.getString("content"));
        c26400b.m136135l(jSONObject.optString("note"));
        c26400b.m136138o(jSONObject.getInt("answer_type"));
        c26400b.m136137n(jSONObject.getInt("question_type"));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("questions");
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
            String string = jSONObject2.getString("title");
            String string2 = jSONObject2.getString("value");
            String optString = jSONObject2.optString("thumb");
            String optString2 = jSONObject2.optString("phone_number");
            if (!TextUtils.isEmpty(optString2)) {
                string = AbstractC21935u.m114541h(optString2, string, true).trim();
            }
            if (TextUtils.isEmpty(optString)) {
                c26402d = new C26403e();
            } else {
                c26402d = new C26402d();
                c26402d.m136147h(optString);
            }
            c26402d.m136143d(string);
            c26402d.m136144e(string2);
            arrayList.add(c26402d);
        }
        c26400b.m136134k(arrayList);
        return c26400b;
    }

    /* renamed from: a */
    public List m136125a() {
        return this.f125414t;
    }

    /* renamed from: b */
    public int m136126b() {
        List list = this.f125414t;
        int i11 = 0;
        if (list == null) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC26401c) it.next()).m136142c()) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: c */
    public String m136127c() {
        int m136126b = m136126b();
        if (m136126b == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f125414t.size(); i11++) {
            AbstractC26401c abstractC26401c = (AbstractC26401c) this.f125414t.get(i11);
            if (abstractC26401c.m136142c()) {
                sb2.append(abstractC26401c.m136141b());
                if (i11 < this.f125414t.size() - 1 && m136126b > 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public String m136128d() {
        return this.f125410p;
    }

    /* renamed from: e */
    public String m136129e() {
        return this.f125411q;
    }

    /* renamed from: f */
    public int m136130f() {
        return this.f125413s;
    }

    /* renamed from: g */
    public int m136131g() {
        return this.f125412r;
    }

    /* renamed from: h */
    public boolean m136132h() {
        return this.f125412r > 1;
    }

    /* renamed from: j */
    public void m136133j(AbstractC26401c abstractC26401c) {
        if (this.f125414t == null) {
            return;
        }
        if (m136132h()) {
            abstractC26401c.m136145f(true);
            return;
        }
        for (AbstractC26401c abstractC26401c2 : this.f125414t) {
            if (abstractC26401c2.m136142c() && !abstractC26401c2.equals(abstractC26401c)) {
                abstractC26401c2.m136145f(false);
            } else if (abstractC26401c2.equals(abstractC26401c)) {
                abstractC26401c2.m136145f(true);
            }
        }
    }

    /* renamed from: k */
    public void m136134k(List list) {
        this.f125414t = list;
    }

    /* renamed from: l */
    public void m136135l(String str) {
        this.f125410p = str;
    }

    /* renamed from: m */
    public void m136136m(String str) {
        this.f125411q = str;
    }

    /* renamed from: n */
    public void m136137n(int i11) {
        this.f125413s = i11;
    }

    /* renamed from: o */
    public void m136138o(int i11) {
        this.f125412r = i11;
    }

    /* renamed from: p */
    public void m136139p(AbstractC26401c abstractC26401c) {
        if (this.f125414t == null) {
            return;
        }
        abstractC26401c.m136145f(false);
    }
}
