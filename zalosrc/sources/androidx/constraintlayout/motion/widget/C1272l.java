package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.C1293a;
import androidx.constraintlayout.widget.C1295c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p007a1.C0022c;
import p118e1.AbstractC18161d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.motion.widget.l */
/* loaded from: classes2.dex */
public class C1272l implements Comparable {

    /* renamed from: S */
    static String[] f5113S = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E */
    private C0022c f5118E;

    /* renamed from: G */
    private float f5120G;

    /* renamed from: H */
    private float f5121H;

    /* renamed from: I */
    private float f5122I;

    /* renamed from: J */
    private float f5123J;

    /* renamed from: K */
    private float f5124K;

    /* renamed from: r */
    int f5134r;

    /* renamed from: p */
    private float f5132p = 1.0f;

    /* renamed from: q */
    int f5133q = 0;

    /* renamed from: s */
    private boolean f5135s = false;

    /* renamed from: t */
    private float f5136t = 0.0f;

    /* renamed from: u */
    private float f5137u = 0.0f;

    /* renamed from: v */
    private float f5138v = 0.0f;

    /* renamed from: w */
    public float f5139w = 0.0f;

    /* renamed from: x */
    private float f5140x = 1.0f;

    /* renamed from: y */
    private float f5141y = 1.0f;

    /* renamed from: z */
    private float f5142z = Float.NaN;

    /* renamed from: A */
    private float f5114A = Float.NaN;

    /* renamed from: B */
    private float f5115B = 0.0f;

    /* renamed from: C */
    private float f5116C = 0.0f;

    /* renamed from: D */
    private float f5117D = 0.0f;

    /* renamed from: F */
    private int f5119F = 0;

    /* renamed from: L */
    private float f5125L = Float.NaN;

    /* renamed from: M */
    private float f5126M = Float.NaN;

    /* renamed from: N */
    private int f5127N = -1;

    /* renamed from: O */
    LinkedHashMap f5128O = new LinkedHashMap();

    /* renamed from: P */
    int f5129P = 0;

    /* renamed from: Q */
    double[] f5130Q = new double[18];

    /* renamed from: R */
    double[] f5131R = new double[18];

    /* renamed from: g */
    private boolean m6117g(float f11, float f12) {
        if (!Float.isNaN(f11) && !Float.isNaN(f12)) {
            if (Math.abs(f11 - f12) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f11) == Float.isNaN(f12)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    /* renamed from: b */
    public void m6118b(HashMap hashMap, int i11) {
        for (String str : hashMap.keySet()) {
            AbstractC18161d abstractC18161d = (AbstractC18161d) hashMap.get(str);
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c11 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c11 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c11 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c11 = '\r';
                        break;
                    }
                    break;
            }
            float f11 = 1.0f;
            float f12 = 0.0f;
            switch (c11) {
                case 0:
                    if (!Float.isNaN(this.f5138v)) {
                        f12 = this.f5138v;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 1:
                    if (!Float.isNaN(this.f5139w)) {
                        f12 = this.f5139w;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 2:
                    if (!Float.isNaN(this.f5115B)) {
                        f12 = this.f5115B;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 3:
                    if (!Float.isNaN(this.f5116C)) {
                        f12 = this.f5116C;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 4:
                    if (!Float.isNaN(this.f5117D)) {
                        f12 = this.f5117D;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 5:
                    if (!Float.isNaN(this.f5126M)) {
                        f12 = this.f5126M;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 6:
                    if (!Float.isNaN(this.f5140x)) {
                        f11 = this.f5140x;
                    }
                    abstractC18161d.mo90c(i11, f11);
                    break;
                case 7:
                    if (!Float.isNaN(this.f5141y)) {
                        f11 = this.f5141y;
                    }
                    abstractC18161d.mo90c(i11, f11);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f5142z)) {
                        f12 = this.f5142z;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f5114A)) {
                        f12 = this.f5114A;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f5137u)) {
                        f12 = this.f5137u;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case 11:
                    if (!Float.isNaN(this.f5136t)) {
                        f12 = this.f5136t;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f5125L)) {
                        f12 = this.f5125L;
                    }
                    abstractC18161d.mo90c(i11, f12);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f5132p)) {
                        f11 = this.f5132p;
                    }
                    abstractC18161d.mo90c(i11, f11);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f5128O.containsKey(str2)) {
                            C1293a c1293a = (C1293a) this.f5128O.get(str2);
                            if (abstractC18161d instanceof AbstractC18161d.b) {
                                ((AbstractC18161d.b) abstractC18161d).m96465i(i11, c1293a);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append(" ViewSpline not a CustomSet frame = ");
                                sb2.append(i11);
                                sb2.append(", value");
                                sb2.append(c1293a.m6407d());
                                sb2.append(abstractC18161d);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("UNKNOWN spline ");
                        sb3.append(str);
                        break;
                    }
            }
        }
    }

    /* renamed from: c */
    public void m6119c(View view) {
        float alpha;
        this.f5134r = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f5132p = alpha;
        this.f5135s = false;
        this.f5136t = view.getElevation();
        this.f5137u = view.getRotation();
        this.f5138v = view.getRotationX();
        this.f5139w = view.getRotationY();
        this.f5140x = view.getScaleX();
        this.f5141y = view.getScaleY();
        this.f5142z = view.getPivotX();
        this.f5114A = view.getPivotY();
        this.f5115B = view.getTranslationX();
        this.f5116C = view.getTranslationY();
        this.f5117D = view.getTranslationZ();
    }

    /* renamed from: d */
    public void m6120d(C1295c.a aVar) {
        float f11;
        C1295c.d dVar = aVar.f5641c;
        int i11 = dVar.f5746c;
        this.f5133q = i11;
        int i12 = dVar.f5745b;
        this.f5134r = i12;
        if (i12 != 0 && i11 == 0) {
            f11 = 0.0f;
        } else {
            f11 = dVar.f5747d;
        }
        this.f5132p = f11;
        C1295c.e eVar = aVar.f5644f;
        this.f5135s = eVar.f5762m;
        this.f5136t = eVar.f5763n;
        this.f5137u = eVar.f5751b;
        this.f5138v = eVar.f5752c;
        this.f5139w = eVar.f5753d;
        this.f5140x = eVar.f5754e;
        this.f5141y = eVar.f5755f;
        this.f5142z = eVar.f5756g;
        this.f5114A = eVar.f5757h;
        this.f5115B = eVar.f5759j;
        this.f5116C = eVar.f5760k;
        this.f5117D = eVar.f5761l;
        this.f5118E = C0022c.m59c(aVar.f5642d.f5733d);
        C1295c.c cVar = aVar.f5642d;
        this.f5125L = cVar.f5738i;
        this.f5119F = cVar.f5735f;
        this.f5127N = cVar.f5731b;
        this.f5126M = aVar.f5641c.f5748e;
        for (String str : aVar.f5645g.keySet()) {
            C1293a c1293a = (C1293a) aVar.f5645g.get(str);
            if (c1293a.m6409f()) {
                this.f5128O.put(str, c1293a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1272l c1272l) {
        return Float.compare(this.f5120G, c1272l.f5120G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6122h(C1272l c1272l, HashSet hashSet) {
        if (m6117g(this.f5132p, c1272l.f5132p)) {
            hashSet.add("alpha");
        }
        if (m6117g(this.f5136t, c1272l.f5136t)) {
            hashSet.add("elevation");
        }
        int i11 = this.f5134r;
        int i12 = c1272l.f5134r;
        if (i11 != i12 && this.f5133q == 0 && (i11 == 0 || i12 == 0)) {
            hashSet.add("alpha");
        }
        if (m6117g(this.f5137u, c1272l.f5137u)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f5125L) || !Float.isNaN(c1272l.f5125L)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f5126M) || !Float.isNaN(c1272l.f5126M)) {
            hashSet.add("progress");
        }
        if (m6117g(this.f5138v, c1272l.f5138v)) {
            hashSet.add("rotationX");
        }
        if (m6117g(this.f5139w, c1272l.f5139w)) {
            hashSet.add("rotationY");
        }
        if (m6117g(this.f5142z, c1272l.f5142z)) {
            hashSet.add("transformPivotX");
        }
        if (m6117g(this.f5114A, c1272l.f5114A)) {
            hashSet.add("transformPivotY");
        }
        if (m6117g(this.f5140x, c1272l.f5140x)) {
            hashSet.add("scaleX");
        }
        if (m6117g(this.f5141y, c1272l.f5141y)) {
            hashSet.add("scaleY");
        }
        if (m6117g(this.f5115B, c1272l.f5115B)) {
            hashSet.add("translationX");
        }
        if (m6117g(this.f5116C, c1272l.f5116C)) {
            hashSet.add("translationY");
        }
        if (m6117g(this.f5117D, c1272l.f5117D)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: i */
    void m6123i(float f11, float f12, float f13, float f14) {
        this.f5121H = f11;
        this.f5122I = f12;
        this.f5123J = f13;
        this.f5124K = f14;
    }

    /* renamed from: j */
    public void m6124j(Rect rect, C1295c c1295c, int i11, int i12) {
        m6123i(rect.left, rect.top, rect.width(), rect.height());
        m6120d(c1295c.m6463z(i12));
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.f5137u + 90.0f;
            this.f5137u = f11;
            if (f11 > 180.0f) {
                this.f5137u = f11 - 360.0f;
                return;
            }
            return;
        }
        this.f5137u -= 90.0f;
    }

    /* renamed from: m */
    public void m6125m(View view) {
        m6123i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m6119c(view);
    }
}
