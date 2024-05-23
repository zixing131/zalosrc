package p566v3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.SparseArray;
import com.androidquery.util.AbstractC3972e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p502s3.C26117c;
import p631x3.AbstractC29300a;
import p631x3.AbstractC29302c;
import p631x3.AbstractC29304e;

/* renamed from: v3.p */
/* loaded from: classes2.dex */
public class C27508p {

    /* renamed from: a */
    private final int f129404a;

    /* renamed from: b */
    private final int f129405b;

    /* renamed from: c */
    private final List f129406c;

    /* renamed from: d */
    private final List f129407d;

    /* renamed from: e */
    private final float[] f129408e;

    /* renamed from: f */
    private final int f129409f;

    /* renamed from: g */
    private Map f129410g;

    /* renamed from: v3.p$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f129411a;

        /* renamed from: b */
        public int f129412b;

        /* renamed from: c */
        public List f129413c;

        /* renamed from: d */
        public List f129414d;

        /* renamed from: e */
        public float[] f129415e;

        /* renamed from: f */
        public int f129416f;

        /* renamed from: g */
        public Map f129417g;

        /* renamed from: a */
        public C27508p m140655a() {
            return new C27508p(this.f129411a, this.f129412b, this.f129413c, this.f129414d, this.f129415e, this.f129416f, this.f129417g);
        }
    }

    /* renamed from: a */
    public void m140646a() {
        Map map = this.f129410g;
        if (map == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) this.f129410g.get((String) it.next());
            if (bitmap != null && !bitmap.isRecycled() && AbstractC3972e.m18765V()) {
                C26117c.m134454d().m134458e(bitmap);
            }
        }
        this.f129410g.clear();
    }

    /* renamed from: b */
    public List m140647b() {
        return this.f129407d;
    }

    /* renamed from: c */
    public Map m140648c() {
        return this.f129410g;
    }

    /* renamed from: d */
    public float[] m140649d() {
        return this.f129408e;
    }

    /* renamed from: e */
    public List m140650e() {
        return this.f129406c;
    }

    /* renamed from: f */
    public int m140651f() {
        return this.f129405b;
    }

    /* renamed from: g */
    public int m140652g() {
        return this.f129404a;
    }

    /* renamed from: h */
    public void m140653h(SparseArray sparseArray, float f11) {
        int size = this.f129407d.size();
        for (int i11 = 0; i11 < size; i11++) {
            C27498f c27498f = (C27498f) this.f129407d.get(i11);
            Matrix matrix = (Matrix) sparseArray.get(c27498f.m140608c());
            matrix.reset();
            if (c27498f.m140606a() != null) {
                c27498f.m140606a().m143779a(f11, matrix);
            }
            int size2 = c27498f.m140607b().size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((C27495c) c27498f.m140607b().get(i12)).m140597c().m143779a(f11, matrix);
            }
            if (c27498f.m140609d() > 0) {
                matrix.postConcat((Matrix) sparseArray.get(c27498f.m140609d()));
            }
        }
    }

    /* renamed from: i */
    public void m140654i(Map map) {
        this.f129410g = map;
    }

    public C27508p(C27508p c27508p) {
        Object c27502j;
        this.f129404a = c27508p.f129404a;
        this.f129405b = c27508p.f129405b;
        this.f129409f = c27508p.f129409f;
        if (c27508p.f129406c != null) {
            this.f129406c = new ArrayList();
            for (C27502j c27502j2 : c27508p.f129406c) {
                if (c27502j2 instanceof C27501i) {
                    c27502j = new C27501i((C27501i) c27502j2);
                } else {
                    c27502j = new C27502j(c27502j2);
                }
                this.f129406c.add(c27502j);
            }
        } else {
            this.f129406c = null;
        }
        if (c27508p.f129407d != null) {
            this.f129407d = new ArrayList();
            Iterator it = c27508p.f129407d.iterator();
            while (it.hasNext()) {
                this.f129407d.add(new C27498f((C27498f) it.next()));
            }
        } else {
            this.f129407d = null;
        }
        float[] fArr = c27508p.f129408e;
        if (fArr != null) {
            this.f129408e = new float[fArr.length];
            int i11 = 0;
            while (true) {
                float[] fArr2 = c27508p.f129408e;
                if (i11 >= fArr2.length) {
                    break;
                }
                this.f129408e[i11] = fArr2[i11];
                i11++;
            }
        } else {
            this.f129408e = null;
        }
        if (c27508p.f129410g == null) {
            this.f129410g = null;
            return;
        }
        this.f129410g = new HashMap();
        for (Map.Entry entry : c27508p.f129410g.entrySet()) {
            this.f129410g.put((String) entry.getKey(), ((Bitmap) entry.getValue()).copy(((Bitmap) entry.getValue()).getConfig(), true));
        }
    }

    private C27508p(int i11, int i12, List list, List list2, float[] fArr, int i13, Map map) {
        this.f129404a = ((Integer) AbstractC29302c.m146400b(Integer.valueOf(i11), i11 > 0, "frame_rate")).intValue();
        this.f129405b = ((Integer) AbstractC29302c.m146400b(Integer.valueOf(i12), i12 > 0, "animation_frame_count")).intValue();
        this.f129406c = (List) AbstractC29302c.m146400b(AbstractC29304e.m146402a(list), list.size() > 0, "features");
        List m146397a = AbstractC29300a.m146397a(list2);
        this.f129407d = (List) AbstractC29302c.m146400b(AbstractC29304e.m146402a(m146397a), AbstractC29302c.m146399a(m146397a), "animation_groups");
        this.f129408e = (float[]) AbstractC29302c.m146400b(fArr, fArr.length == 2 && fArr[0] > 0.0f && fArr[1] > 0.0f, "canvas_size");
        this.f129409f = i13;
        this.f129410g = map;
    }
}
