package af;

import android.content.Context;
import bf.AbstractC2790b;
import bf.C2792d;
import et.C18610q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lt.AbstractC22646b;
import lt.AbstractC22647c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p276jt.AbstractC21351f;
import p354n3.C23528a;
import p379o3.C24003n;

/* renamed from: af.e */
/* loaded from: classes3.dex */
public class C0772e extends AbstractC22647c {

    /* renamed from: b0 */
    private final C2792d f2675b0;

    /* renamed from: c0 */
    private final C23528a f2676c0;

    /* renamed from: d0 */
    private final C24003n f2677d0;

    /* renamed from: e0 */
    private final Context f2678e0;

    /* renamed from: f0 */
    private List f2679f0 = null;

    public C0772e(C2792d c2792d, Context context, C23528a c23528a, C24003n c24003n, boolean z11) {
        this.f2675b0 = c2792d;
        this.f2676c0 = c23528a;
        this.f2677d0 = c24003n;
        this.f2678e0 = context;
        m1904O0(z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1904O0(boolean z11) {
        JSONArray jSONArray;
        int i11;
        List<C0769b> list;
        JSONObject jSONObject;
        if (this.f2675b0 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List m13448i = this.f2675b0.m13448i();
        try {
            jSONObject = this.f2675b0.f11124p;
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        if (jSONObject != null) {
            jSONArray = jSONObject.getJSONArray("staticLocationFilterData");
            for (i11 = 0; i11 < m13448i.size(); i11++) {
                C0769b c0769b = new C0769b((AbstractC2790b.c) m13448i.get(i11), this.f2678e0, this.f2676c0, this.f2677d0);
                if (jSONArray != null) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        if (jSONObject2.has("isDefaultLandscape")) {
                            c0769b.f2672i0 = jSONObject2.getBoolean("isDefaultLandscape");
                            c0769b.f2671h0 = true;
                            c0769b.mo110586m0(jSONObject2);
                        } else {
                            c0769b.f2671h0 = false;
                        }
                    } catch (JSONException e12) {
                        e12.printStackTrace();
                    }
                }
                if (z11) {
                    try {
                        c0769b.mo1901E0();
                    } catch (InterruptedException e13) {
                        e13.printStackTrace();
                    }
                }
                arrayList.add(c0769b);
            }
            list = this.f2679f0;
            if (list != null) {
                this.f2679f0 = null;
                for (final C0769b c0769b2 : list) {
                    Objects.requireNonNull(c0769b2);
                    m1952U(new Runnable() { // from class: af.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0769b.this.destroy();
                        }
                    });
                }
            }
            this.f2679f0 = Collections.unmodifiableList(arrayList);
            if (!m1992u()) {
                m1996y();
                return;
            } else {
                m1952U(new Runnable() { // from class: af.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0772e.this.m1996y();
                    }
                });
                return;
            }
        }
        jSONArray = null;
        while (i11 < m13448i.size()) {
        }
        list = this.f2679f0;
        if (list != null) {
        }
        this.f2679f0 = Collections.unmodifiableList(arrayList);
        if (!m1992u()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).destroy();
        }
    }

    @Override // lt.AbstractC22647c
    /* renamed from: C0 */
    public void mo1906C0(double d11, double d12, double d13, double d14, double d15) {
        List<C0769b> list = this.f2679f0;
        if (list == null) {
            return;
        }
        for (C0769b c0769b : list) {
            c0769b.mo97628p0((float) (c0769b.m110605e0() * d11));
            c0769b.mo110614r0((float) ((c0769b.m110606f0() * d12) + d13));
            c0769b.m110615s0((float) ((c0769b.m110607g0() * d14) + d15));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).m1995x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).m1996y();
        }
    }

    @Override // lt.AbstractC22647c
    /* renamed from: E0 */
    public AbstractC21351f mo1891E0(float f11, float f12) {
        List<C0769b> list = this.f2679f0;
        if (list == null) {
            return null;
        }
        for (C0769b c0769b : list) {
            if (c0769b.m117220w0(f11, f12)) {
                c0769b.f2671h0 = true;
                c0769b.f2672i0 = c0769b.f2667d0;
                return c0769b;
            }
        }
        return null;
    }

    @Override // lt.AbstractC22647c
    /* renamed from: F0 */
    public JSONObject mo1892F0() {
        try {
            List<C0769b> list = this.f2679f0;
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (C0769b c0769b : list) {
                if (!c0769b.f2671h0) {
                    jSONArray.put(new JSONObject());
                } else {
                    JSONObject mo110584d0 = c0769b.mo110584d0();
                    mo110584d0.put("isDefaultLandscape", c0769b.f2672i0);
                    jSONArray.put(mo110584d0);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("staticLocationFilterData", jSONArray);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // lt.AbstractC22647c
    /* renamed from: G0 */
    public boolean mo1893G0() {
        List list = this.f2679f0;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // lt.AbstractC22647c
    /* renamed from: H0 */
    public void mo1894H0(float[] fArr, C18610q c18610q, int i11, int i12, int i13, int i14, boolean z11) {
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).m110603b0(fArr, c18610q);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22647c
    /* renamed from: I0 */
    public void mo1895I0() {
        super.mo1895I0();
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).m1902I0(this.f111055Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22647c
    /* renamed from: J0 */
    public void mo1896J0() {
        super.mo1896J0();
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).m1903J0(this.f111056Z, this.f111057a0);
        }
    }

    @Override // lt.AbstractC22647c
    /* renamed from: K0 */
    public boolean mo1907K0(AbstractC21351f abstractC21351f) {
        List list = this.f2679f0;
        if (list == null || !(abstractC21351f instanceof C0769b) || !list.contains(abstractC21351f)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(abstractC21351f);
        this.f2679f0 = Collections.unmodifiableList(arrayList);
        return true;
    }

    @Override // lt.AbstractC22647c
    /* renamed from: L0 */
    public void mo1908L0(double d11, double d12, double d13, double d14, double d15, double d16) {
        List<C0769b> list = this.f2679f0;
        if (list == null) {
            return;
        }
        for (C0769b c0769b : list) {
            c0769b.m110611n0((float) (c0769b.m110604c0() + d11));
            c0769b.mo97628p0((float) (c0769b.m110605e0() * d12));
            float m110606f0 = c0769b.m110606f0();
            c0769b.mo110614r0((float) ((c0769b.m110607g0() * d13) + d14));
            c0769b.m110615s0((float) ((m110606f0 * d15) + d16));
        }
    }

    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC22646b) it.next()).m1946J();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        List list = this.f2679f0;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0769b) it.next()).mo1956Z(m1949M(), m1948L());
        }
    }
}
