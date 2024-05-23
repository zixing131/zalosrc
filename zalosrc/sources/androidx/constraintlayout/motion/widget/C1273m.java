package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C1293a;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p007a1.AbstractC0021b;
import p007a1.AbstractC0029j;
import p007a1.C0022c;
import p007a1.C0023d;
import p007a1.C0035p;
import p118e1.AbstractC18158a;
import p118e1.AbstractC18160c;
import p118e1.AbstractC18161d;
import p118e1.AbstractC18162e;
import p118e1.AbstractC18163f;

/* renamed from: androidx.constraintlayout.motion.widget.m */
/* loaded from: classes2.dex */
public class C1273m {

    /* renamed from: B */
    private HashMap f5144B;

    /* renamed from: C */
    private HashMap f5145C;

    /* renamed from: D */
    private HashMap f5146D;

    /* renamed from: E */
    private AbstractC1271k[] f5147E;

    /* renamed from: F */
    private int f5148F;

    /* renamed from: G */
    private int f5149G;

    /* renamed from: H */
    private View f5150H;

    /* renamed from: I */
    private int f5151I;

    /* renamed from: J */
    private float f5152J;

    /* renamed from: K */
    private Interpolator f5153K;

    /* renamed from: L */
    private boolean f5154L;

    /* renamed from: b */
    View f5156b;

    /* renamed from: c */
    int f5157c;

    /* renamed from: e */
    String f5159e;

    /* renamed from: k */
    private AbstractC0021b[] f5165k;

    /* renamed from: l */
    private AbstractC0021b f5166l;

    /* renamed from: p */
    float f5170p;

    /* renamed from: q */
    float f5171q;

    /* renamed from: r */
    private int[] f5172r;

    /* renamed from: s */
    private double[] f5173s;

    /* renamed from: t */
    private double[] f5174t;

    /* renamed from: u */
    private String[] f5175u;

    /* renamed from: v */
    private int[] f5176v;

    /* renamed from: a */
    Rect f5155a = new Rect();

    /* renamed from: d */
    boolean f5158d = false;

    /* renamed from: f */
    private int f5160f = -1;

    /* renamed from: g */
    private C1275o f5161g = new C1275o();

    /* renamed from: h */
    private C1275o f5162h = new C1275o();

    /* renamed from: i */
    private C1272l f5163i = new C1272l();

    /* renamed from: j */
    private C1272l f5164j = new C1272l();

    /* renamed from: m */
    float f5167m = Float.NaN;

    /* renamed from: n */
    float f5168n = 0.0f;

    /* renamed from: o */
    float f5169o = 1.0f;

    /* renamed from: w */
    private int f5177w = 4;

    /* renamed from: x */
    private float[] f5178x = new float[4];

    /* renamed from: y */
    private ArrayList f5179y = new ArrayList();

    /* renamed from: z */
    private float[] f5180z = new float[1];

    /* renamed from: A */
    private ArrayList f5143A = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.m$a */
    /* loaded from: classes2.dex */
    public class a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C0022c f5181a;

        a(C0022c c0022c) {
            this.f5181a = c0022c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f5181a.mo60a(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1273m(View view) {
        int i11 = AbstractC1264d.f5073f;
        this.f5148F = i11;
        this.f5149G = i11;
        this.f5150H = null;
        this.f5151I = i11;
        this.f5152J = Float.NaN;
        this.f5153K = null;
        this.f5154L = false;
        m6138H(view);
    }

    /* renamed from: g */
    private float m6126g(float f11, float[] fArr) {
        float f12 = 0.0f;
        float f13 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f14 = this.f5169o;
            if (f14 != 1.0d) {
                float f15 = this.f5168n;
                if (f11 < f15) {
                    f11 = 0.0f;
                }
                if (f11 > f15 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f15) * f14, 1.0f);
                }
            }
        }
        C0022c c0022c = this.f5161g.f5191p;
        Iterator it = this.f5179y.iterator();
        float f16 = Float.NaN;
        while (it.hasNext()) {
            C1275o c1275o = (C1275o) it.next();
            C0022c c0022c2 = c1275o.f5191p;
            if (c0022c2 != null) {
                float f17 = c1275o.f5193r;
                if (f17 < f11) {
                    c0022c = c0022c2;
                    f12 = f17;
                } else if (Float.isNaN(f16)) {
                    f16 = c1275o.f5193r;
                }
            }
        }
        if (c0022c != null) {
            if (!Float.isNaN(f16)) {
                f13 = f16;
            }
            float f18 = f13 - f12;
            double d11 = (f11 - f12) / f18;
            f11 = (((float) c0022c.mo60a(d11)) * f18) + f12;
            if (fArr != null) {
                fArr[0] = (float) c0022c.mo61b(d11);
            }
        }
        return f11;
    }

    /* renamed from: p */
    private static Interpolator m6127p(Context context, int i11, String str, int i12) {
        if (i11 != -2) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(C0022c.m59c(str));
        }
        return AnimationUtils.loadInterpolator(context, i12);
    }

    /* renamed from: s */
    private float m6128s() {
        char c11;
        float f11;
        float[] fArr = new float[2];
        float f12 = 1.0f / 99;
        double d11 = 0.0d;
        double d12 = 0.0d;
        float f13 = 0.0f;
        int i11 = 0;
        while (i11 < 100) {
            float f14 = i11 * f12;
            double d13 = f14;
            C0022c c0022c = this.f5161g.f5191p;
            Iterator it = this.f5179y.iterator();
            float f15 = Float.NaN;
            float f16 = 0.0f;
            while (it.hasNext()) {
                C1275o c1275o = (C1275o) it.next();
                C0022c c0022c2 = c1275o.f5191p;
                if (c0022c2 != null) {
                    float f17 = c1275o.f5193r;
                    if (f17 < f14) {
                        c0022c = c0022c2;
                        f16 = f17;
                    } else if (Float.isNaN(f15)) {
                        f15 = c1275o.f5193r;
                    }
                }
            }
            if (c0022c != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d13 = (((float) c0022c.mo60a((f14 - f16) / r17)) * (f15 - f16)) + f16;
            }
            this.f5165k[0].mo41d(d13, this.f5173s);
            float f18 = f13;
            int i12 = i11;
            this.f5161g.m6167h(d13, this.f5172r, this.f5173s, fArr, 0);
            if (i12 > 0) {
                c11 = 0;
                f11 = (float) (f18 + Math.hypot(d12 - fArr[1], d11 - fArr[0]));
            } else {
                c11 = 0;
                f11 = f18;
            }
            d11 = fArr[c11];
            i11 = i12 + 1;
            f13 = f11;
            d12 = fArr[1];
        }
        return f13;
    }

    /* renamed from: w */
    private void m6129w(C1275o c1275o) {
        if (Collections.binarySearch(this.f5179y, c1275o) == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" KeyPath position \"");
            sb2.append(c1275o.f5194s);
            sb2.append("\" outside of range");
        }
        this.f5179y.add((-r0) - 1, c1275o);
    }

    /* renamed from: y */
    private void m6130y(C1275o c1275o) {
        c1275o.m6177w((int) this.f5156b.getX(), (int) this.f5156b.getY(), this.f5156b.getWidth(), this.f5156b.getHeight());
    }

    /* renamed from: A */
    void m6131A(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        int i14 = rect.left + rect.right;
                        rect2.left = i12 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i14 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i15 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
                rect2.top = i13 - ((i15 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i16 = rect.left + rect.right;
            rect2.left = i12 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i16 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i13 - ((i17 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m6132B(View view) {
        C1275o c1275o = this.f5161g;
        c1275o.f5193r = 0.0f;
        c1275o.f5194s = 0.0f;
        this.f5154L = true;
        c1275o.m6177w(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f5162h.m6177w(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f5163i.m6125m(view);
        this.f5164j.m6125m(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m6133C(Rect rect, C1295c c1295c, int i11, int i12) {
        int i13 = c1295c.f5635d;
        if (i13 != 0) {
            m6131A(rect, this.f5155a, i13, i11, i12);
            rect = this.f5155a;
        }
        C1275o c1275o = this.f5162h;
        c1275o.f5193r = 1.0f;
        c1275o.f5194s = 1.0f;
        m6130y(c1275o);
        this.f5162h.m6177w(rect.left, rect.top, rect.width(), rect.height());
        this.f5162h.m6163b(c1295c.m6463z(this.f5157c));
        this.f5164j.m6124j(rect, c1295c, i13, this.f5157c);
    }

    /* renamed from: D */
    public void m6134D(int i11) {
        this.f5148F = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m6135E(View view) {
        C1275o c1275o = this.f5161g;
        c1275o.f5193r = 0.0f;
        c1275o.f5194s = 0.0f;
        c1275o.m6177w(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f5163i.m6125m(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m6136F(Rect rect, C1295c c1295c, int i11, int i12) {
        int i13 = c1295c.f5635d;
        if (i13 != 0) {
            m6131A(rect, this.f5155a, i13, i11, i12);
        }
        C1275o c1275o = this.f5161g;
        c1275o.f5193r = 0.0f;
        c1275o.f5194s = 0.0f;
        m6130y(c1275o);
        this.f5161g.m6177w(rect.left, rect.top, rect.width(), rect.height());
        C1295c.a m6463z = c1295c.m6463z(this.f5157c);
        this.f5161g.m6163b(m6463z);
        this.f5167m = m6463z.f5642d.f5736g;
        this.f5163i.m6124j(rect, c1295c, i13, this.f5157c);
        this.f5149G = m6463z.f5644f.f5758i;
        C1295c.c cVar = m6463z.f5642d;
        this.f5151I = cVar.f5740k;
        this.f5152J = cVar.f5739j;
        Context context = this.f5156b.getContext();
        C1295c.c cVar2 = m6463z.f5642d;
        this.f5153K = m6127p(context, cVar2.f5742m, cVar2.f5741l, cVar2.f5743n);
    }

    /* renamed from: G */
    public void m6137G(AbstractC18162e abstractC18162e, View view, int i11, int i12, int i13) {
        C1275o c1275o = this.f5161g;
        c1275o.f5193r = 0.0f;
        c1275o.f5194s = 0.0f;
        Rect rect = new Rect();
        if (i11 != 1) {
            if (i11 != 2) {
                this.f5161g.m6177w(rect.left, rect.top, rect.width(), rect.height());
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: H */
    public void m6138H(View view) {
        this.f5156b = view;
        this.f5157c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f5159e = ((ConstraintLayout.LayoutParams) layoutParams).m6388a();
        }
    }

    /* renamed from: I */
    public void m6139I(int i11, int i12, float f11, long j11) {
        String[] strArr;
        boolean z11;
        double[][] dArr;
        C1293a c1293a;
        int i13;
        AbstractC18163f m96468g;
        C1293a c1293a2;
        int i14;
        Integer num;
        AbstractC18161d m96463g;
        C1293a c1293a3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i15 = this.f5148F;
        if (i15 != AbstractC1264d.f5073f) {
            this.f5161g.f5201z = i15;
        }
        this.f5163i.m6122h(this.f5164j, hashSet2);
        ArrayList arrayList = this.f5143A;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC1264d abstractC1264d = (AbstractC1264d) it.next();
                if (abstractC1264d instanceof C1268h) {
                    C1268h c1268h = (C1268h) abstractC1264d;
                    m6129w(new C1275o(i11, i12, c1268h, this.f5161g, this.f5162h));
                    int i16 = c1268h.f5112g;
                    if (i16 != AbstractC1264d.f5073f) {
                        this.f5160f = i16;
                    }
                } else {
                    abstractC1264d.mo6071h(hashMap);
                    abstractC1264d.mo6067d(hashSet2);
                }
            }
        }
        if (!hashSet2.isEmpty()) {
            this.f5145C = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it3 = this.f5143A.iterator();
                    while (it3.hasNext()) {
                        AbstractC1264d abstractC1264d2 = (AbstractC1264d) it3.next();
                        HashMap hashMap2 = abstractC1264d2.f5078e;
                        if (hashMap2 != null && (c1293a3 = (C1293a) hashMap2.get(str2)) != null) {
                            sparseArray.append(abstractC1264d2.f5074a, c1293a3);
                        }
                    }
                    m96463g = AbstractC18161d.m96462f(str, sparseArray);
                } else {
                    m96463g = AbstractC18161d.m96463g(str);
                }
                if (m96463g != null) {
                    m96463g.m91d(str);
                    this.f5145C.put(str, m96463g);
                }
            }
            ArrayList arrayList2 = this.f5143A;
            if (arrayList2 != null) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    AbstractC1264d abstractC1264d3 = (AbstractC1264d) it4.next();
                    if (abstractC1264d3 instanceof C1265e) {
                        abstractC1264d3.mo6064a(this.f5145C);
                    }
                }
            }
            this.f5163i.m6118b(this.f5145C, 0);
            this.f5164j.m6118b(this.f5145C, 100);
            for (String str3 : this.f5145C.keySet()) {
                if (hashMap.containsKey(str3) && (num = (Integer) hashMap.get(str3)) != null) {
                    i14 = num.intValue();
                } else {
                    i14 = 0;
                }
                AbstractC0029j abstractC0029j = (AbstractC0029j) this.f5145C.get(str3);
                if (abstractC0029j != null) {
                    abstractC0029j.mo92e(i14);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f5144B == null) {
                this.f5144B = new HashMap();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str4 = (String) it5.next();
                if (!this.f5144B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        Iterator it6 = this.f5143A.iterator();
                        while (it6.hasNext()) {
                            AbstractC1264d abstractC1264d4 = (AbstractC1264d) it6.next();
                            HashMap hashMap3 = abstractC1264d4.f5078e;
                            if (hashMap3 != null && (c1293a2 = (C1293a) hashMap3.get(str5)) != null) {
                                sparseArray2.append(abstractC1264d4.f5074a, c1293a2);
                            }
                        }
                        m96468g = AbstractC18163f.m96467f(str4, sparseArray2);
                    } else {
                        m96468g = AbstractC18163f.m96468g(str4, j11);
                    }
                    if (m96468g != null) {
                        m96468g.m107c(str4);
                        this.f5144B.put(str4, m96468g);
                    }
                }
            }
            ArrayList arrayList3 = this.f5143A;
            if (arrayList3 != null) {
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                }
            }
            for (String str6 : this.f5144B.keySet()) {
                if (hashMap.containsKey(str6)) {
                    i13 = ((Integer) hashMap.get(str6)).intValue();
                } else {
                    i13 = 0;
                }
                ((AbstractC18163f) this.f5144B.get(str6)).mo108d(i13);
            }
        }
        int size = this.f5179y.size();
        int i17 = size + 2;
        C1275o[] c1275oArr = new C1275o[i17];
        c1275oArr[0] = this.f5161g;
        c1275oArr[size + 1] = this.f5162h;
        if (this.f5179y.size() > 0 && this.f5160f == -1) {
            this.f5160f = 0;
        }
        Iterator it8 = this.f5179y.iterator();
        int i18 = 1;
        while (it8.hasNext()) {
            c1275oArr[i18] = (C1275o) it8.next();
            i18++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f5162h.f5186D.keySet()) {
            if (this.f5161g.f5186D.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f5175u = strArr2;
        this.f5176v = new int[strArr2.length];
        int i19 = 0;
        while (true) {
            strArr = this.f5175u;
            if (i19 >= strArr.length) {
                break;
            }
            String str8 = strArr[i19];
            this.f5176v[i19] = 0;
            int i21 = 0;
            while (true) {
                if (i21 >= i17) {
                    break;
                }
                if (c1275oArr[i21].f5186D.containsKey(str8) && (c1293a = (C1293a) c1275oArr[i21].f5186D.get(str8)) != null) {
                    int[] iArr = this.f5176v;
                    iArr[i19] = iArr[i19] + c1293a.m6410g();
                    break;
                }
                i21++;
            }
            i19++;
        }
        if (c1275oArr[0].f5201z != AbstractC1264d.f5073f) {
            z11 = true;
        } else {
            z11 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i22 = 1; i22 < i17; i22++) {
            c1275oArr[i22].m6165e(c1275oArr[i22 - 1], zArr, this.f5175u, z11);
        }
        int i23 = 0;
        for (int i24 = 1; i24 < length; i24++) {
            if (zArr[i24]) {
                i23++;
            }
        }
        this.f5172r = new int[i23];
        int max = Math.max(2, i23);
        this.f5173s = new double[max];
        this.f5174t = new double[max];
        int i25 = 0;
        for (int i26 = 1; i26 < length; i26++) {
            if (zArr[i26]) {
                this.f5172r[i25] = i26;
                i25++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i17, this.f5172r.length);
        double[] dArr3 = new double[i17];
        for (int i27 = 0; i27 < i17; i27++) {
            c1275oArr[i27].m6166g(dArr2[i27], this.f5172r);
            dArr3[i27] = c1275oArr[i27].f5193r;
        }
        int i28 = 0;
        while (true) {
            int[] iArr2 = this.f5172r;
            if (i28 >= iArr2.length) {
                break;
            }
            if (iArr2[i28] < C1275o.f5182I.length) {
                String str9 = C1275o.f5182I[this.f5172r[i28]] + " [";
                for (int i29 = 0; i29 < i17; i29++) {
                    str9 = str9 + dArr2[i29][i28];
                }
            }
            i28++;
        }
        this.f5165k = new AbstractC0021b[this.f5175u.length + 1];
        int i31 = 0;
        while (true) {
            String[] strArr3 = this.f5175u;
            if (i31 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i31];
            double[] dArr4 = null;
            double[][] dArr5 = null;
            int i32 = 0;
            int i33 = 0;
            while (i32 < i17) {
                if (c1275oArr[i32].m6172r(str10)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i17];
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i17, c1275oArr[i32].m6170m(str10));
                    }
                    C1275o c1275o = c1275oArr[i32];
                    dArr = dArr2;
                    dArr4[i33] = c1275o.f5193r;
                    c1275o.m6169j(str10, dArr5[i33], 0);
                    i33++;
                } else {
                    dArr = dArr2;
                }
                i32++;
                dArr2 = dArr;
            }
            i31++;
            this.f5165k[i31] = AbstractC0021b.m57a(this.f5160f, Arrays.copyOf(dArr4, i33), (double[][]) Arrays.copyOf(dArr5, i33));
            dArr2 = dArr2;
        }
        this.f5165k[0] = AbstractC0021b.m57a(this.f5160f, dArr3, dArr2);
        if (c1275oArr[0].f5201z != AbstractC1264d.f5073f) {
            int[] iArr3 = new int[i17];
            double[] dArr6 = new double[i17];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i17, 2);
            for (int i34 = 0; i34 < i17; i34++) {
                iArr3[i34] = c1275oArr[i34].f5201z;
                dArr6[i34] = r9.f5193r;
                double[] dArr8 = dArr7[i34];
                dArr8[0] = r9.f5195t;
                dArr8[1] = r9.f5196u;
            }
            this.f5166l = AbstractC0021b.m58b(iArr3, dArr6, dArr7);
        }
        this.f5146D = new HashMap();
        if (this.f5143A != null) {
            Iterator it9 = hashSet3.iterator();
            float f12 = Float.NaN;
            while (it9.hasNext()) {
                String str11 = (String) it9.next();
                AbstractC18160c m96459f = AbstractC18160c.m96459f(str11);
                if (m96459f != null) {
                    if (m96459f.m70e() && Float.isNaN(f12)) {
                        f12 = m6128s();
                    }
                    m96459f.m68c(str11);
                    this.f5146D.put(str11, m96459f);
                }
            }
            Iterator it10 = this.f5143A.iterator();
            while (it10.hasNext()) {
            }
            Iterator it11 = this.f5146D.values().iterator();
            while (it11.hasNext()) {
                ((AbstractC18160c) it11.next()).m69d(f12);
            }
        }
    }

    /* renamed from: J */
    public void m6140J(C1273m c1273m) {
        this.f5161g.m6180z(c1273m, c1273m.f5161g);
        this.f5162h.m6180z(c1273m, c1273m.f5162h);
    }

    /* renamed from: a */
    public void m6141a(AbstractC1264d abstractC1264d) {
        this.f5143A.add(abstractC1264d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6142b(ArrayList arrayList) {
        this.f5143A.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m6143c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] mo45h = this.f5165k[0].mo45h();
        if (iArr != null) {
            Iterator it = this.f5179y.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = ((C1275o) it.next()).f5187E;
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < mo45h.length; i13++) {
            this.f5165k[0].mo41d(mo45h[i13], this.f5173s);
            this.f5161g.m6167h(mo45h[i13], this.f5172r, this.f5173s, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6144d(float[] fArr, int i11) {
        AbstractC0029j abstractC0029j;
        AbstractC0029j abstractC0029j2;
        AbstractC18160c abstractC18160c;
        double d11;
        float f11 = 1.0f;
        float f12 = 1.0f / (i11 - 1);
        HashMap hashMap = this.f5145C;
        AbstractC18160c abstractC18160c2 = null;
        if (hashMap == null) {
            abstractC0029j = null;
        } else {
            abstractC0029j = (AbstractC0029j) hashMap.get("translationX");
        }
        HashMap hashMap2 = this.f5145C;
        if (hashMap2 == null) {
            abstractC0029j2 = null;
        } else {
            abstractC0029j2 = (AbstractC0029j) hashMap2.get("translationY");
        }
        HashMap hashMap3 = this.f5146D;
        if (hashMap3 == null) {
            abstractC18160c = null;
        } else {
            abstractC18160c = (AbstractC18160c) hashMap3.get("translationX");
        }
        HashMap hashMap4 = this.f5146D;
        if (hashMap4 != null) {
            abstractC18160c2 = (AbstractC18160c) hashMap4.get("translationY");
        }
        AbstractC18160c abstractC18160c3 = abstractC18160c2;
        int i12 = 0;
        while (i12 < i11) {
            float f13 = i12 * f12;
            float f14 = this.f5169o;
            float f15 = 0.0f;
            if (f14 != f11) {
                float f16 = this.f5168n;
                if (f13 < f16) {
                    f13 = 0.0f;
                }
                if (f13 > f16 && f13 < 1.0d) {
                    f13 = Math.min((f13 - f16) * f14, f11);
                }
            }
            float f17 = f13;
            double d12 = f17;
            C0022c c0022c = this.f5161g.f5191p;
            Iterator it = this.f5179y.iterator();
            float f18 = Float.NaN;
            while (it.hasNext()) {
                C1275o c1275o = (C1275o) it.next();
                C0022c c0022c2 = c1275o.f5191p;
                double d13 = d12;
                if (c0022c2 != null) {
                    float f19 = c1275o.f5193r;
                    if (f19 < f17) {
                        f15 = f19;
                        c0022c = c0022c2;
                    } else if (Float.isNaN(f18)) {
                        f18 = c1275o.f5193r;
                    }
                }
                d12 = d13;
            }
            double d14 = d12;
            if (c0022c != null) {
                if (Float.isNaN(f18)) {
                    f18 = 1.0f;
                }
                d11 = (((float) c0022c.mo60a((f17 - f15) / r16)) * (f18 - f15)) + f15;
            } else {
                d11 = d14;
            }
            this.f5165k[0].mo41d(d11, this.f5173s);
            AbstractC0021b abstractC0021b = this.f5166l;
            if (abstractC0021b != null) {
                double[] dArr = this.f5173s;
                if (dArr.length > 0) {
                    abstractC0021b.mo41d(d11, dArr);
                }
            }
            int i13 = i12 * 2;
            int i14 = i12;
            this.f5161g.m6167h(d11, this.f5172r, this.f5173s, fArr, i13);
            if (abstractC18160c != null) {
                fArr[i13] = fArr[i13] + abstractC18160c.m66a(f17);
            } else if (abstractC0029j != null) {
                fArr[i13] = fArr[i13] + abstractC0029j.m88a(f17);
            }
            if (abstractC18160c3 != null) {
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + abstractC18160c3.m66a(f17);
            } else if (abstractC0029j2 != null) {
                int i16 = i13 + 1;
                fArr[i16] = fArr[i16] + abstractC0029j2.m88a(f17);
            }
            i12 = i14 + 1;
            f11 = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6145e(float f11, float[] fArr, int i11) {
        this.f5165k[0].mo41d(m6126g(f11, null), this.f5173s);
        this.f5161g.m6171q(this.f5172r, this.f5173s, fArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m6146f(boolean z11) {
        AbstractC1271k[] abstractC1271kArr;
        if ("button".equals(AbstractC1261a.m6060d(this.f5156b)) && (abstractC1271kArr = this.f5147E) != null && abstractC1271kArr.length > 0) {
            AbstractC1271k abstractC1271k = abstractC1271kArr[0];
            throw null;
        }
    }

    /* renamed from: h */
    public int m6147h() {
        return this.f5161g.f5183A;
    }

    /* renamed from: i */
    public void m6148i(double d11, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f5165k[0].mo41d(d11, dArr);
        this.f5165k[0].mo44g(d11, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f5161g.m6168i(d11, this.f5172r, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: j */
    public float m6149j() {
        return this.f5170p;
    }

    /* renamed from: k */
    public float m6150k() {
        return this.f5171q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m6151l(float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        float m6126g = m6126g(f11, this.f5180z);
        AbstractC0021b[] abstractC0021bArr = this.f5165k;
        int i11 = 0;
        if (abstractC0021bArr != null) {
            double d11 = m6126g;
            abstractC0021bArr[0].mo44g(d11, this.f5174t);
            this.f5165k[0].mo41d(d11, this.f5173s);
            float f14 = this.f5180z[0];
            while (true) {
                dArr = this.f5174t;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * f14;
                i11++;
            }
            AbstractC0021b abstractC0021b = this.f5166l;
            if (abstractC0021b != null) {
                double[] dArr2 = this.f5173s;
                if (dArr2.length > 0) {
                    abstractC0021b.mo41d(d11, dArr2);
                    this.f5166l.mo44g(d11, this.f5174t);
                    this.f5161g.m6178x(f12, f13, fArr, this.f5172r, this.f5174t, this.f5173s);
                    return;
                }
                return;
            }
            this.f5161g.m6178x(f12, f13, fArr, this.f5172r, dArr, this.f5173s);
            return;
        }
        C1275o c1275o = this.f5162h;
        float f15 = c1275o.f5195t;
        C1275o c1275o2 = this.f5161g;
        float f16 = f15 - c1275o2.f5195t;
        float f17 = c1275o.f5196u - c1275o2.f5196u;
        float f18 = (c1275o.f5197v - c1275o2.f5197v) + f16;
        float f19 = (c1275o.f5198w - c1275o2.f5198w) + f17;
        fArr[0] = (f16 * (1.0f - f12)) + (f18 * f12);
        fArr[1] = (f17 * (1.0f - f13)) + (f19 * f13);
    }

    /* renamed from: m */
    public int m6152m() {
        int i11 = this.f5161g.f5192q;
        Iterator it = this.f5179y.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, ((C1275o) it.next()).f5192q);
        }
        return Math.max(i11, this.f5162h.f5192q);
    }

    /* renamed from: n */
    public float m6153n() {
        return this.f5162h.f5195t;
    }

    /* renamed from: o */
    public float m6154o() {
        return this.f5162h.f5196u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C1275o m6155q(int i11) {
        return (C1275o) this.f5179y.get(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m6156r(float f11, int i11, int i12, float f12, float f13, float[] fArr) {
        AbstractC0029j abstractC0029j;
        AbstractC0029j abstractC0029j2;
        AbstractC0029j abstractC0029j3;
        AbstractC0029j abstractC0029j4;
        AbstractC0029j abstractC0029j5;
        AbstractC18160c abstractC18160c;
        AbstractC18160c abstractC18160c2;
        AbstractC18160c abstractC18160c3;
        AbstractC18160c abstractC18160c4;
        float m6126g = m6126g(f11, this.f5180z);
        HashMap hashMap = this.f5145C;
        AbstractC18160c abstractC18160c5 = null;
        if (hashMap == null) {
            abstractC0029j = null;
        } else {
            abstractC0029j = (AbstractC0029j) hashMap.get("translationX");
        }
        HashMap hashMap2 = this.f5145C;
        if (hashMap2 == null) {
            abstractC0029j2 = null;
        } else {
            abstractC0029j2 = (AbstractC0029j) hashMap2.get("translationY");
        }
        HashMap hashMap3 = this.f5145C;
        if (hashMap3 == null) {
            abstractC0029j3 = null;
        } else {
            abstractC0029j3 = (AbstractC0029j) hashMap3.get("rotation");
        }
        HashMap hashMap4 = this.f5145C;
        if (hashMap4 == null) {
            abstractC0029j4 = null;
        } else {
            abstractC0029j4 = (AbstractC0029j) hashMap4.get("scaleX");
        }
        HashMap hashMap5 = this.f5145C;
        if (hashMap5 == null) {
            abstractC0029j5 = null;
        } else {
            abstractC0029j5 = (AbstractC0029j) hashMap5.get("scaleY");
        }
        HashMap hashMap6 = this.f5146D;
        if (hashMap6 == null) {
            abstractC18160c = null;
        } else {
            abstractC18160c = (AbstractC18160c) hashMap6.get("translationX");
        }
        HashMap hashMap7 = this.f5146D;
        if (hashMap7 == null) {
            abstractC18160c2 = null;
        } else {
            abstractC18160c2 = (AbstractC18160c) hashMap7.get("translationY");
        }
        HashMap hashMap8 = this.f5146D;
        if (hashMap8 == null) {
            abstractC18160c3 = null;
        } else {
            abstractC18160c3 = (AbstractC18160c) hashMap8.get("rotation");
        }
        HashMap hashMap9 = this.f5146D;
        if (hashMap9 == null) {
            abstractC18160c4 = null;
        } else {
            abstractC18160c4 = (AbstractC18160c) hashMap9.get("scaleX");
        }
        HashMap hashMap10 = this.f5146D;
        if (hashMap10 != null) {
            abstractC18160c5 = (AbstractC18160c) hashMap10.get("scaleY");
        }
        C0035p c0035p = new C0035p();
        c0035p.m113b();
        c0035p.m115d(abstractC0029j3, m6126g);
        c0035p.m119h(abstractC0029j, abstractC0029j2, m6126g);
        c0035p.m117f(abstractC0029j4, abstractC0029j5, m6126g);
        c0035p.m114c(abstractC18160c3, m6126g);
        c0035p.m118g(abstractC18160c, abstractC18160c2, m6126g);
        c0035p.m116e(abstractC18160c4, abstractC18160c5, m6126g);
        AbstractC0021b abstractC0021b = this.f5166l;
        if (abstractC0021b != null) {
            double[] dArr = this.f5173s;
            if (dArr.length > 0) {
                double d11 = m6126g;
                abstractC0021b.mo41d(d11, dArr);
                this.f5166l.mo44g(d11, this.f5174t);
                this.f5161g.m6178x(f12, f13, fArr, this.f5172r, this.f5174t, this.f5173s);
            }
            c0035p.m112a(f12, f13, i11, i12, fArr);
            return;
        }
        int i13 = 0;
        if (this.f5165k != null) {
            double m6126g2 = m6126g(m6126g, this.f5180z);
            this.f5165k[0].mo44g(m6126g2, this.f5174t);
            this.f5165k[0].mo41d(m6126g2, this.f5173s);
            float f14 = this.f5180z[0];
            while (true) {
                double[] dArr2 = this.f5174t;
                if (i13 < dArr2.length) {
                    dArr2[i13] = dArr2[i13] * f14;
                    i13++;
                } else {
                    this.f5161g.m6178x(f12, f13, fArr, this.f5172r, dArr2, this.f5173s);
                    c0035p.m112a(f12, f13, i11, i12, fArr);
                    return;
                }
            }
        } else {
            C1275o c1275o = this.f5162h;
            float f15 = c1275o.f5195t;
            C1275o c1275o2 = this.f5161g;
            float f16 = f15 - c1275o2.f5195t;
            AbstractC18160c abstractC18160c6 = abstractC18160c5;
            float f17 = c1275o.f5196u - c1275o2.f5196u;
            AbstractC18160c abstractC18160c7 = abstractC18160c4;
            float f18 = (c1275o.f5197v - c1275o2.f5197v) + f16;
            float f19 = (c1275o.f5198w - c1275o2.f5198w) + f17;
            fArr[0] = (f16 * (1.0f - f12)) + (f18 * f12);
            fArr[1] = (f17 * (1.0f - f13)) + (f19 * f13);
            c0035p.m113b();
            c0035p.m115d(abstractC0029j3, m6126g);
            c0035p.m119h(abstractC0029j, abstractC0029j2, m6126g);
            c0035p.m117f(abstractC0029j4, abstractC0029j5, m6126g);
            c0035p.m114c(abstractC18160c3, m6126g);
            c0035p.m118g(abstractC18160c, abstractC18160c2, m6126g);
            c0035p.m116e(abstractC18160c7, abstractC18160c6, m6126g);
            c0035p.m112a(f12, f13, i11, i12, fArr);
        }
    }

    /* renamed from: t */
    public float m6157t() {
        return this.f5161g.f5195t;
    }

    public String toString() {
        return " start: x: " + this.f5161g.f5195t + " y: " + this.f5161g.f5196u + " end: x: " + this.f5162h.f5195t + " y: " + this.f5162h.f5196u;
    }

    /* renamed from: u */
    public float m6158u() {
        return this.f5161g.f5196u;
    }

    /* renamed from: v */
    public View m6159v() {
        return this.f5156b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m6160x(View view, float f11, long j11, C0023d c0023d) {
        AbstractC18163f.d dVar;
        boolean z11;
        int i11;
        double d11;
        int i12;
        float f12;
        float m6126g = m6126g(f11, null);
        int i13 = this.f5151I;
        if (i13 != AbstractC1264d.f5073f) {
            float f13 = 1.0f / i13;
            float floor = ((float) Math.floor(m6126g / f13)) * f13;
            float f14 = (m6126g % f13) / f13;
            if (!Float.isNaN(this.f5152J)) {
                f14 = (f14 + this.f5152J) % 1.0f;
            }
            Interpolator interpolator = this.f5153K;
            if (interpolator != null) {
                f12 = interpolator.getInterpolation(f14);
            } else if (f14 > 0.5d) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            m6126g = (f12 * f13) + floor;
        }
        float f15 = m6126g;
        HashMap hashMap = this.f5145C;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((AbstractC18161d) it.next()).mo96464h(view, f15);
            }
        }
        HashMap hashMap2 = this.f5144B;
        if (hashMap2 != null) {
            dVar = null;
            boolean z12 = false;
            for (AbstractC18163f abstractC18163f : hashMap2.values()) {
                if (abstractC18163f instanceof AbstractC18163f.d) {
                    dVar = (AbstractC18163f.d) abstractC18163f;
                } else {
                    z12 |= abstractC18163f.mo96470h(view, f15, j11, c0023d);
                }
            }
            z11 = z12;
        } else {
            dVar = null;
            z11 = false;
        }
        AbstractC0021b[] abstractC0021bArr = this.f5165k;
        if (abstractC0021bArr != null) {
            double d12 = f15;
            abstractC0021bArr[0].mo41d(d12, this.f5173s);
            this.f5165k[0].mo44g(d12, this.f5174t);
            AbstractC0021b abstractC0021b = this.f5166l;
            if (abstractC0021b != null) {
                double[] dArr = this.f5173s;
                if (dArr.length > 0) {
                    abstractC0021b.mo41d(d12, dArr);
                    this.f5166l.mo44g(d12, this.f5174t);
                }
            }
            if (!this.f5154L) {
                d11 = d12;
                i12 = 1;
                this.f5161g.m6179y(f15, view, this.f5172r, this.f5173s, this.f5174t, null, this.f5158d);
                this.f5158d = false;
            } else {
                d11 = d12;
                i12 = 1;
            }
            if (this.f5149G != AbstractC1264d.f5073f) {
                if (this.f5150H == null) {
                    this.f5150H = ((View) view.getParent()).findViewById(this.f5149G);
                }
                if (this.f5150H != null) {
                    float top = (r1.getTop() + this.f5150H.getBottom()) / 2.0f;
                    float left = (this.f5150H.getLeft() + this.f5150H.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.f5145C;
            if (hashMap3 != null) {
                for (AbstractC0029j abstractC0029j : hashMap3.values()) {
                    if (abstractC0029j instanceof AbstractC18161d.d) {
                        double[] dArr2 = this.f5174t;
                        if (dArr2.length > i12) {
                            ((AbstractC18161d.d) abstractC0029j).m96466i(view, f15, dArr2[0], dArr2[i12]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f5174t;
                double d13 = dArr3[0];
                double d14 = dArr3[i12];
                i11 = 0;
                z11 |= dVar.m96471i(view, c0023d, f15, j11, d13, d14);
            } else {
                i11 = 0;
            }
            int i14 = 1;
            while (true) {
                AbstractC0021b[] abstractC0021bArr2 = this.f5165k;
                if (i14 >= abstractC0021bArr2.length) {
                    break;
                }
                abstractC0021bArr2[i14].mo42e(d11, this.f5178x);
                AbstractC18158a.m96455b((C1293a) this.f5161g.f5186D.get(this.f5175u[i14 - 1]), view, this.f5178x);
                i14++;
            }
            C1272l c1272l = this.f5163i;
            if (c1272l.f5133q == 0) {
                if (f15 <= 0.0f) {
                    view.setVisibility(c1272l.f5134r);
                } else if (f15 >= 1.0f) {
                    view.setVisibility(this.f5164j.f5134r);
                } else if (this.f5164j.f5134r != c1272l.f5134r) {
                    view.setVisibility(i11);
                }
            }
            AbstractC1271k[] abstractC1271kArr = this.f5147E;
            if (abstractC1271kArr != null && abstractC1271kArr.length > 0) {
                AbstractC1271k abstractC1271k = abstractC1271kArr[i11];
                throw null;
            }
        } else {
            i11 = 0;
            C1275o c1275o = this.f5161g;
            float f16 = c1275o.f5195t;
            C1275o c1275o2 = this.f5162h;
            float f17 = f16 + ((c1275o2.f5195t - f16) * f15);
            float f18 = c1275o.f5196u;
            float f19 = f18 + ((c1275o2.f5196u - f18) * f15);
            float f21 = c1275o.f5197v;
            float f22 = c1275o2.f5197v;
            float f23 = c1275o.f5198w;
            float f24 = c1275o2.f5198w;
            float f25 = f17 + 0.5f;
            int i15 = (int) f25;
            float f26 = f19 + 0.5f;
            int i16 = (int) f26;
            int i17 = (int) (f25 + ((f22 - f21) * f15) + f21);
            int i18 = (int) (f26 + ((f24 - f23) * f15) + f23);
            int i19 = i17 - i15;
            int i21 = i18 - i16;
            if (f22 != f21 || f24 != f23 || this.f5158d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
                this.f5158d = false;
            }
            view.layout(i15, i16, i17, i18);
        }
        HashMap hashMap4 = this.f5146D;
        if (hashMap4 != null) {
            for (AbstractC18160c abstractC18160c : hashMap4.values()) {
                if (abstractC18160c instanceof AbstractC18160c.d) {
                    double[] dArr4 = this.f5174t;
                    ((AbstractC18160c.d) abstractC18160c).m96461h(view, f15, dArr4[i11], dArr4[1]);
                } else {
                    abstractC18160c.mo96460g(view, f15);
                }
            }
        }
        return z11;
    }

    /* renamed from: z */
    public void m6161z() {
        this.f5158d = true;
    }
}
