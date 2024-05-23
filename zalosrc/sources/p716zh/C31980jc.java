package p716zh;

import android.text.TextUtils;
import cr.C17566a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l30.C22033k0;
import l30.C22052u;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: zh.jc */
/* loaded from: classes3.dex */
public class C31980jc implements C22033k0.h {

    /* renamed from: A */
    public boolean f147016A;

    /* renamed from: B */
    public int f147017B;

    /* renamed from: C */
    public Map f147018C;

    /* renamed from: D */
    public boolean f147019D;

    /* renamed from: E */
    public int f147020E;

    /* renamed from: F */
    public String f147021F;

    /* renamed from: G */
    public Map f147022G;

    /* renamed from: p */
    public String f147023p;

    /* renamed from: q */
    public String f147024q;

    /* renamed from: r */
    public String f147025r;

    /* renamed from: s */
    public boolean f147026s;

    /* renamed from: t */
    public int f147027t;

    /* renamed from: u */
    public boolean f147028u;

    /* renamed from: v */
    public int f147029v;

    /* renamed from: w */
    public boolean f147030w;

    /* renamed from: x */
    public ArrayList f147031x;

    /* renamed from: y */
    public ArrayList f147032y;

    /* renamed from: z */
    public boolean f147033z;

    public C31980jc(JSONObject jSONObject) {
        this.f147029v = 0;
        this.f147030w = false;
        this.f147031x = new ArrayList();
        this.f147032y = new ArrayList();
        this.f147033z = false;
        this.f147016A = false;
        this.f147017B = 0;
        this.f147018C = Collections.synchronizedMap(new HashMap());
        this.f147019D = true;
        this.f147020E = 0;
        this.f147021F = "0";
        this.f147022G = new HashMap();
        try {
            this.f147023p = AbstractC18069a.m96089h(jSONObject, "uid");
            this.f147025r = AbstractC18069a.m96089h(jSONObject, "avt");
            this.f147024q = AbstractC18069a.m96089h(jSONObject, "dpName");
            this.f147026s = AbstractC18069a.m96083b(jSONObject, "seen");
            this.f147027t = AbstractC18069a.m96085d(jSONObject, "total");
            this.f147028u = AbstractC18069a.m96083b(jSONObject, "isIntro");
            m153814D(jSONObject.optString("listStory"));
            if (this.f147028u) {
                this.f147029v = -1;
            } else if (jSONObject.has("utype")) {
                this.f147029v = AbstractC18069a.m96085d(jSONObject, "utype");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static C31980jc m153810l(C17566a c17566a) {
        C31980jc c31980jc = new C31980jc(c17566a.m93547r(), c17566a.m93538i(), c17566a.m93532c(), "", true, false);
        int i11 = 2;
        c31980jc.f147029v = 2;
        c31980jc.f147019D = false;
        C32123ta c32123ta = new C32123ta();
        c32123ta.f148138h = c17566a.m93530a();
        c32123ta.f148136g = c17566a.m93547r();
        c32123ta.f148126b = 1;
        c32123ta.f148146l = c17566a.m93544o();
        c32123ta.f148147m = c17566a.m93544o();
        if (c17566a.m93531b() != 2) {
            i11 = 1;
        }
        c32123ta.f148140i = i11;
        c32123ta.f148151q = 8000;
        c32123ta.f148121X = c17566a.m93530a();
        c32123ta.f148122Y = c17566a.m93540k();
        c32123ta.f148123Z = c17566a.m93539j();
        c32123ta.f148125a0 = c17566a.m93543n();
        c32123ta.f148127b0 = c17566a.m93546q();
        c32123ta.f148129c0 = c17566a.m93536g();
        c32123ta.f148131d0 = c17566a.m93535f();
        c32123ta.f148133e0 = c17566a.m93534e();
        c32123ta.f148135f0 = c17566a.m93545p();
        c32123ta.f148137g0 = c17566a.m93533d();
        c32123ta.f148139h0 = c17566a.m93542m();
        c32123ta.f148141i0 = c17566a.m93537h();
        c31980jc.f147031x.add(c32123ta);
        return c31980jc;
    }

    /* renamed from: A */
    public void m153811A(boolean z11) {
        this.f147030w = z11;
    }

    /* renamed from: B */
    public void m153812B(String str) {
        if (this.f147031x != null && !TextUtils.isEmpty(str)) {
            for (int i11 = 0; i11 < this.f147031x.size(); i11++) {
                C32123ta c32123ta = (C32123ta) this.f147031x.get(i11);
                if (c32123ta != null && TextUtils.equals(str, c32123ta.f148138h)) {
                    this.f147017B = i11;
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    public void m153813C(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f147017B = 0;
                JSONArray jSONArray = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    C32123ta c32123ta = new C32123ta(this.f147023p, jSONArray.getJSONObject(i11));
                    if (!this.f147018C.containsKey(c32123ta.f148138h)) {
                        this.f147031x.add(c32123ta);
                        this.f147018C.put(c32123ta.f148138h, c32123ta);
                        if (!c32123ta.f148152r && this.f147017B == 0) {
                            this.f147017B = i11;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: D */
    public void m153814D(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    C32123ta c32123ta = new C32123ta((JSONObject) jSONArray.get(i11));
                    if (TextUtils.isEmpty(c32123ta.f148136g)) {
                        c32123ta.f148136g = this.f147023p;
                    }
                    this.f147032y.add(c32123ta);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    public JSONObject m153815E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", this.f147023p);
            jSONObject.put("avt", this.f147025r);
            jSONObject.put("dpName", this.f147024q);
            jSONObject.put("seen", this.f147026s);
            jSONObject.put("total", this.f147027t);
            jSONObject.put("isIntro", this.f147028u);
            jSONObject.put("utype", this.f147029v);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: F */
    public boolean m153816F() {
        boolean z11;
        if (!this.f147026s && this.f147032y.isEmpty()) {
            this.f147026s = true;
            this.f147016A = false;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f147026s && !this.f147032y.isEmpty()) {
            this.f147026s = false;
            this.f147016A = false;
            z11 = true;
        }
        if (m153819a()) {
            this.f147016A = true;
        }
        return z11;
    }

    /* renamed from: G */
    public void m153817G() {
        int i11;
        int i12 = 0;
        this.f147017B = 0;
        int i13 = 0;
        while (true) {
            if (i13 < this.f147031x.size()) {
                C32123ta c32123ta = (C32123ta) this.f147031x.get(i13);
                if (c32123ta != null && !c32123ta.f148152r && c32123ta.f148126b == 1) {
                    break;
                } else {
                    i13++;
                }
            } else {
                i13 = -1;
                break;
            }
        }
        while (true) {
            if (i12 < this.f147031x.size()) {
                C32123ta c32123ta2 = (C32123ta) this.f147031x.get(i12);
                if (c32123ta2 != null && c32123ta2.m155068H() && ((i11 = c32123ta2.f148128c) == 2 || i11 == 1)) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            this.f147017B = i12;
        } else if (i13 != -1) {
            this.f147017B = i13;
        }
    }

    /* renamed from: H */
    public boolean m153818H() {
        String str;
        boolean z11;
        if (!m153832y() && !m153830w()) {
            return false;
        }
        int size = this.f147032y.size();
        String str2 = "";
        if (size <= 0) {
            str = "";
        } else {
            str = ((C32123ta) this.f147032y.get(size - 1)).f148138h;
        }
        this.f147032y.clear();
        Iterator it = this.f147031x.iterator();
        while (it.hasNext()) {
            C32123ta c32123ta = (C32123ta) it.next();
            if (!c32123ta.f148152r) {
                this.f147032y.add(c32123ta);
            }
        }
        int size2 = this.f147032y.size();
        if (size2 > 0) {
            str2 = ((C32123ta) this.f147032y.get(size2 - 1)).f148138h;
        }
        if (size == size2 && str.equals(str2)) {
            z11 = false;
        } else {
            z11 = true;
        }
        m153816F();
        if (this.f147026s) {
            this.f147017B = 0;
        }
        return z11;
    }

    /* renamed from: a */
    public boolean m153819a() {
        Iterator it = this.f147032y.iterator();
        while (it.hasNext()) {
            if (((C32123ta) it.next()).f148128c == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // l30.C22033k0.h
    /* renamed from: b */
    public String mo17216b() {
        return this.f147023p;
    }

    @Override // l30.C22033k0.h
    /* renamed from: c */
    public String mo17217c() {
        return this.f147024q;
    }

    @Override // l30.C22033k0.h
    /* renamed from: d */
    public String mo17218d() {
        return "";
    }

    @Override // l30.C22033k0.h
    /* renamed from: e */
    public void mo17219e(boolean z11) {
        this.f147033z = z11;
    }

    /* renamed from: f */
    public void m153820f(C31980jc c31980jc) {
        if (c31980jc != null) {
            c31980jc.f147023p = this.f147023p;
            c31980jc.f147024q = this.f147024q;
            c31980jc.f147025r = this.f147025r;
            c31980jc.f147026s = this.f147026s;
            c31980jc.f147027t = this.f147027t;
            c31980jc.f147028u = this.f147028u;
            c31980jc.f147029v = this.f147029v;
            c31980jc.f147019D = this.f147019D;
            c31980jc.f147020E = this.f147020E;
            c31980jc.f147021F = this.f147021F;
            c31980jc.f147017B = this.f147017B;
            if (this.f147031x != null) {
                c31980jc.f147031x = new ArrayList(this.f147031x);
            }
            if (this.f147032y != null) {
                c31980jc.f147032y = new ArrayList(this.f147032y);
            }
            c31980jc.f147018C.clear();
            Iterator it = c31980jc.f147031x.iterator();
            while (it.hasNext()) {
                C32123ta c32123ta = (C32123ta) it.next();
                c31980jc.f147018C.put(c32123ta.f148138h, c32123ta);
            }
        }
    }

    @Override // l30.C22033k0.h
    /* renamed from: g */
    public String mo17220g() {
        return this.f147023p;
    }

    @Override // l30.C22033k0.h
    /* renamed from: h */
    public boolean mo17221h() {
        return this.f147033z;
    }

    @Override // l30.C22033k0.h
    /* renamed from: i */
    public boolean mo17222i() {
        return !this.f147026s;
    }

    @Override // l30.C22033k0.h
    /* renamed from: j */
    public C32123ta mo17223j() {
        return m153825r();
    }

    /* renamed from: k */
    public boolean m153821k(String str) {
        if (this.f147031x != null && !TextUtils.isEmpty(str)) {
            Iterator it = this.f147031x.iterator();
            while (it.hasNext()) {
                C32123ta c32123ta = (C32123ta) it.next();
                if (c32123ta != null && TextUtils.equals(str, c32123ta.f148138h)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // l30.C22033k0.h
    /* renamed from: m */
    public boolean mo17224m() {
        return this.f147030w;
    }

    /* renamed from: n */
    public void m153822n(String str) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f147031x.size()) {
                break;
            }
            C32123ta c32123ta = (C32123ta) this.f147031x.get(i11);
            if (c32123ta.f148138h.equals(str)) {
                this.f147031x.remove(i11);
                this.f147018C.remove(str);
                if (c32123ta.f148126b == 1) {
                    this.f147027t--;
                } else {
                    C22052u.f108595f--;
                }
            } else {
                i11++;
            }
        }
        for (int i12 = 0; i12 < this.f147032y.size(); i12++) {
            if (((C32123ta) this.f147032y.get(i12)).f148138h.equals(str)) {
                this.f147032y.remove(i12);
                return;
            }
        }
    }

    /* renamed from: o */
    public JSONArray m153823o() {
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < this.f147031x.size(); i11++) {
            C32123ta c32123ta = (C32123ta) this.f147031x.get(i11);
            if (c32123ta.f148126b == 1) {
                jSONArray.put(c32123ta.m155082i0());
            }
        }
        return jSONArray;
    }

    /* renamed from: p */
    public JSONArray m153824p() {
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < this.f147032y.size(); i11++) {
            jSONArray.put(((C32123ta) this.f147032y.get(i11)).m155082i0());
        }
        return jSONArray;
    }

    @Override // l30.C22033k0.h
    /* renamed from: q */
    public void mo17227q() {
        this.f147030w = false;
    }

    /* renamed from: r */
    public C32123ta m153825r() {
        int i11;
        if (!this.f147031x.isEmpty() && (i11 = this.f147017B) >= 0 && i11 < this.f147031x.size()) {
            return (C32123ta) this.f147031x.get(this.f147017B);
        }
        return null;
    }

    /* renamed from: s */
    public C32123ta m153826s(String str) {
        if (this.f147031x != null) {
            for (int i11 = 0; i11 < this.f147031x.size(); i11++) {
                C32123ta c32123ta = (C32123ta) this.f147031x.get(i11);
                if (c32123ta != null && TextUtils.equals(str, c32123ta.f148138h)) {
                    return c32123ta;
                }
            }
        }
        return null;
    }

    /* renamed from: t */
    public C32123ta m153827t(String str) {
        C32123ta c32123ta;
        try {
            if (this.f147023p.equals(str)) {
                return m153825r();
            }
            int i11 = -1;
            for (int i12 = 0; i12 < this.f147031x.size() && i11 == -1; i12++) {
                C32123ta c32123ta2 = (C32123ta) this.f147031x.get(i12);
                if (c32123ta2 != null && c32123ta2.m155068H() && c32123ta2.f148128c == 2) {
                    i11 = i12;
                }
            }
            if (i11 != -1) {
                c32123ta = (C32123ta) this.f147031x.get(i11);
            } else if (!this.f147032y.isEmpty()) {
                c32123ta = (C32123ta) this.f147032y.get(0);
            } else {
                if (this.f147031x.isEmpty()) {
                    return null;
                }
                c32123ta = (C32123ta) this.f147031x.get(0);
            }
            return c32123ta;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: u */
    public ArrayList m153828u() {
        ArrayList arrayList = new ArrayList();
        if (this.f147032y.size() > 0) {
            for (int i11 = 0; i11 < this.f147032y.size(); i11++) {
                arrayList.add(((C32123ta) this.f147032y.get(i11)).f148146l);
            }
        } else if (this.f147031x.size() > 0) {
            arrayList.add(((C32123ta) this.f147031x.get(0)).f148146l);
        }
        return arrayList;
    }

    /* renamed from: v */
    public boolean m153829v() {
        return this.f147026s;
    }

    /* renamed from: w */
    public boolean m153830w() {
        Iterator it = this.f147031x.iterator();
        while (it.hasNext()) {
            if (((C32123ta) it.next()).f148126b == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public boolean m153831x() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f147031x;
        if ((arrayList2 != null && !arrayList2.isEmpty()) || ((arrayList = this.f147032y) != null && !arrayList.isEmpty())) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public boolean m153832y() {
        return this.f147020E > 0 || !this.f147019D;
    }

    /* renamed from: z */
    public void m153833z(String str, C32123ta c32123ta, String str2) {
        int i11 = 0;
        while (true) {
            try {
                if (i11 < this.f147031x.size()) {
                    if (((C32123ta) this.f147031x.get(i11)).f148138h.equals(str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i11 >= 0) {
            C32123ta c32123ta2 = (C32123ta) this.f147031x.get(i11);
            if (c32123ta2.f148140i == 2) {
                c32123ta.f148156v = c32123ta2.f148156v;
            }
            c32123ta.f148128c = 3;
            this.f147031x.set(i11, c32123ta);
            this.f147018C.remove(str);
        } else {
            if (c32123ta.f148140i == 2) {
                c32123ta.f148146l = str2;
            }
            this.f147031x.add(c32123ta);
        }
        this.f147032y.add(c32123ta);
        m153816F();
        this.f147018C.put(c32123ta.f148138h, c32123ta);
        this.f147027t++;
    }

    public C31980jc(String str, String str2, String str3, String str4, boolean z11, boolean z12) {
        this.f147029v = 0;
        this.f147030w = false;
        this.f147031x = new ArrayList();
        this.f147032y = new ArrayList();
        this.f147033z = false;
        this.f147016A = false;
        this.f147017B = 0;
        this.f147018C = Collections.synchronizedMap(new HashMap());
        this.f147019D = true;
        this.f147020E = 0;
        this.f147021F = "0";
        this.f147022G = new HashMap();
        this.f147023p = str;
        this.f147024q = str2;
        this.f147025r = str3;
        this.f147026s = z11;
        this.f147027t = 0;
        this.f147028u = z12;
        if (z12) {
            this.f147029v = -1;
        }
        m153813C(str4);
    }
}
