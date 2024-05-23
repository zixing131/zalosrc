package p666y1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.core.graphics.AbstractC1409d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p665y0.C30239a;

/* renamed from: y1.b */
/* loaded from: classes2.dex */
public final class C30256b {

    /* renamed from: f */
    static final c f140520f = new a();

    /* renamed from: a */
    private final List f140521a;

    /* renamed from: b */
    private final List f140522b;

    /* renamed from: d */
    private final SparseBooleanArray f140524d = new SparseBooleanArray();

    /* renamed from: c */
    private final Map f140523c = new C30239a();

    /* renamed from: e */
    private final e f140525e = m149232a();

    /* renamed from: y1.b$a */
    /* loaded from: classes2.dex */
    static class a implements c {
        a() {
        }

        /* renamed from: b */
        private boolean m149240b(float[] fArr) {
            if (fArr[2] <= 0.05f) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m149241c(float[] fArr) {
            float f11 = fArr[0];
            if (f11 < 10.0f || f11 > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        private boolean m149242d(float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return true;
            }
            return false;
        }

        @Override // p666y1.C30256b.c
        /* renamed from: a */
        public boolean mo149243a(int i11, float[] fArr) {
            if (!m149242d(fArr) && !m149240b(fArr) && !m149241c(fArr)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: y1.b$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final List f140526a;

        /* renamed from: b */
        private final Bitmap f140527b;

        /* renamed from: c */
        private final List f140528c;

        /* renamed from: d */
        private int f140529d;

        /* renamed from: e */
        private int f140530e;

        /* renamed from: f */
        private int f140531f;

        /* renamed from: g */
        private final List f140532g;

        /* renamed from: h */
        private Rect f140533h;

        /* renamed from: y1.b$b$a */
        /* loaded from: classes2.dex */
        class a extends AsyncTask {

            /* renamed from: a */
            final /* synthetic */ d f140534a;

            a(d dVar) {
                this.f140534a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C30256b doInBackground(Bitmap... bitmapArr) {
                try {
                    return b.this.m149247b();
                } catch (Exception unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(C30256b c30256b) {
                this.f140534a.mo97220a(c30256b);
            }
        }

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f140528c = arrayList;
            this.f140529d = 16;
            this.f140530e = 12544;
            this.f140531f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f140532g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(C30256b.f140520f);
                this.f140527b = bitmap;
                this.f140526a = null;
                arrayList.add(C30257c.f140545e);
                arrayList.add(C30257c.f140546f);
                arrayList.add(C30257c.f140547g);
                arrayList.add(C30257c.f140548h);
                arrayList.add(C30257c.f140549i);
                arrayList.add(C30257c.f140550j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        /* renamed from: c */
        private int[] m149244c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f140533h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f140533h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i11 = 0; i11 < height2; i11++) {
                Rect rect2 = this.f140533h;
                System.arraycopy(iArr, ((rect2.top + i11) * width) + rect2.left, iArr2, i11 * width2, width2);
            }
            return iArr2;
        }

        /* renamed from: d */
        private Bitmap m149245d(Bitmap bitmap) {
            int max;
            int i11;
            double d11 = -1.0d;
            if (this.f140530e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i12 = this.f140530e;
                if (width > i12) {
                    d11 = Math.sqrt(i12 / width);
                }
            } else if (this.f140531f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i11 = this.f140531f)) {
                d11 = i11 / max;
            }
            if (d11 <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d11), (int) Math.ceil(bitmap.getHeight() * d11), false);
        }

        /* renamed from: a */
        public AsyncTask m149246a(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f140527b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        /* renamed from: b */
        public C30256b m149247b() {
            List list;
            c[] cVarArr;
            Bitmap bitmap = this.f140527b;
            if (bitmap != null) {
                Bitmap m149245d = m149245d(bitmap);
                Rect rect = this.f140533h;
                if (m149245d != this.f140527b && rect != null) {
                    double width = m149245d.getWidth() / this.f140527b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), m149245d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), m149245d.getHeight());
                }
                int[] m149244c = m149244c(m149245d);
                int i11 = this.f140529d;
                if (this.f140532g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List list2 = this.f140532g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                C30255a c30255a = new C30255a(m149244c, i11, cVarArr);
                if (m149245d != this.f140527b) {
                    m149245d.recycle();
                }
                list = c30255a.m149222d();
            } else {
                list = this.f140526a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C30256b c30256b = new C30256b(list, this.f140528c);
            c30256b.m149238c();
            return c30256b;
        }

        /* renamed from: e */
        public b m149248e(int i11, int i12, int i13, int i14) {
            if (this.f140527b != null) {
                if (this.f140533h == null) {
                    this.f140533h = new Rect();
                }
                this.f140533h.set(0, 0, this.f140527b.getWidth(), this.f140527b.getHeight());
                if (!this.f140533h.intersect(i11, i12, i13, i14)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }
    }

    /* renamed from: y1.b$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        boolean mo149243a(int i11, float[] fArr);
    }

    /* renamed from: y1.b$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: a */
        void mo97220a(C30256b c30256b);
    }

    /* renamed from: y1.b$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        private final int f140536a;

        /* renamed from: b */
        private final int f140537b;

        /* renamed from: c */
        private final int f140538c;

        /* renamed from: d */
        private final int f140539d;

        /* renamed from: e */
        private final int f140540e;

        /* renamed from: f */
        private boolean f140541f;

        /* renamed from: g */
        private int f140542g;

        /* renamed from: h */
        private int f140543h;

        /* renamed from: i */
        private float[] f140544i;

        public e(int i11, int i12) {
            this.f140536a = Color.red(i11);
            this.f140537b = Color.green(i11);
            this.f140538c = Color.blue(i11);
            this.f140539d = i11;
            this.f140540e = i12;
        }

        /* renamed from: a */
        private void m149251a() {
            int m7147p;
            int m7147p2;
            if (!this.f140541f) {
                int m7138g = AbstractC1409d.m7138g(-1, this.f140539d, 4.5f);
                int m7138g2 = AbstractC1409d.m7138g(-1, this.f140539d, 3.0f);
                if (m7138g != -1 && m7138g2 != -1) {
                    this.f140543h = AbstractC1409d.m7147p(-1, m7138g);
                    this.f140542g = AbstractC1409d.m7147p(-1, m7138g2);
                    this.f140541f = true;
                    return;
                }
                int m7138g3 = AbstractC1409d.m7138g(-16777216, this.f140539d, 4.5f);
                int m7138g4 = AbstractC1409d.m7138g(-16777216, this.f140539d, 3.0f);
                if (m7138g3 != -1 && m7138g4 != -1) {
                    this.f140543h = AbstractC1409d.m7147p(-16777216, m7138g3);
                    this.f140542g = AbstractC1409d.m7147p(-16777216, m7138g4);
                    this.f140541f = true;
                    return;
                }
                if (m7138g != -1) {
                    m7147p = AbstractC1409d.m7147p(-1, m7138g);
                } else {
                    m7147p = AbstractC1409d.m7147p(-16777216, m7138g3);
                }
                this.f140543h = m7147p;
                if (m7138g2 != -1) {
                    m7147p2 = AbstractC1409d.m7147p(-1, m7138g2);
                } else {
                    m7147p2 = AbstractC1409d.m7147p(-16777216, m7138g4);
                }
                this.f140542g = m7147p2;
                this.f140541f = true;
            }
        }

        /* renamed from: b */
        public int m149252b() {
            m149251a();
            return this.f140543h;
        }

        /* renamed from: c */
        public float[] m149253c() {
            if (this.f140544i == null) {
                this.f140544i = new float[3];
            }
            AbstractC1409d.m7132a(this.f140536a, this.f140537b, this.f140538c, this.f140544i);
            return this.f140544i;
        }

        /* renamed from: d */
        public int m149254d() {
            return this.f140540e;
        }

        /* renamed from: e */
        public int m149255e() {
            return this.f140539d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f140540e == eVar.f140540e && this.f140539d == eVar.f140539d) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int m149256f() {
            m149251a();
            return this.f140542g;
        }

        public int hashCode() {
            return (this.f140539d * 31) + this.f140540e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m149255e()) + "] [HSL: " + Arrays.toString(m149253c()) + "] [Population: " + this.f140540e + "] [Title Text: #" + Integer.toHexString(m149256f()) + "] [Body Text: #" + Integer.toHexString(m149252b()) + ']';
        }
    }

    C30256b(List list, List list2) {
        this.f140521a = list;
        this.f140522b = list2;
    }

    /* renamed from: a */
    private e m149232a() {
        int size = this.f140521a.size();
        int i11 = Integer.MIN_VALUE;
        e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            e eVar2 = (e) this.f140521a.get(i12);
            if (eVar2.m149254d() > i11) {
                i11 = eVar2.m149254d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public static b m149233b(Bitmap bitmap) {
        return new b(bitmap);
    }

    /* renamed from: d */
    private float m149234d(e eVar, C30257c c30257c) {
        int i11;
        float f11;
        float f12;
        float[] m149253c = eVar.m149253c();
        e eVar2 = this.f140525e;
        if (eVar2 != null) {
            i11 = eVar2.m149254d();
        } else {
            i11 = 1;
        }
        float f13 = 0.0f;
        if (c30257c.m149270g() > 0.0f) {
            f11 = c30257c.m149270g() * (1.0f - Math.abs(m149253c[1] - c30257c.m149272i()));
        } else {
            f11 = 0.0f;
        }
        if (c30257c.m149264a() > 0.0f) {
            f12 = c30257c.m149264a() * (1.0f - Math.abs(m149253c[2] - c30257c.m149271h()));
        } else {
            f12 = 0.0f;
        }
        if (c30257c.m149269f() > 0.0f) {
            f13 = c30257c.m149269f() * (eVar.m149254d() / i11);
        }
        return f11 + f12 + f13;
    }

    /* renamed from: e */
    private e m149235e(C30257c c30257c) {
        e m149236g = m149236g(c30257c);
        if (m149236g != null && c30257c.m149273j()) {
            this.f140524d.append(m149236g.m149255e(), true);
        }
        return m149236g;
    }

    /* renamed from: g */
    private e m149236g(C30257c c30257c) {
        int size = this.f140521a.size();
        float f11 = 0.0f;
        e eVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar2 = (e) this.f140521a.get(i11);
            if (m149237h(eVar2, c30257c)) {
                float m149234d = m149234d(eVar2, c30257c);
                if (eVar == null || m149234d > f11) {
                    eVar = eVar2;
                    f11 = m149234d;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    private boolean m149237h(e eVar, C30257c c30257c) {
        float[] m149253c = eVar.m149253c();
        if (m149253c[1] >= c30257c.m149268e() && m149253c[1] <= c30257c.m149266c() && m149253c[2] >= c30257c.m149267d() && m149253c[2] <= c30257c.m149265b() && !this.f140524d.get(eVar.m149255e())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    void m149238c() {
        int size = this.f140522b.size();
        for (int i11 = 0; i11 < size; i11++) {
            C30257c c30257c = (C30257c) this.f140522b.get(i11);
            c30257c.m149274k();
            this.f140523c.put(c30257c, m149235e(c30257c));
        }
        this.f140524d.clear();
    }

    /* renamed from: f */
    public int m149239f(int i11) {
        e eVar = this.f140525e;
        if (eVar != null) {
            return eVar.m149255e();
        }
        return i11;
    }
}
