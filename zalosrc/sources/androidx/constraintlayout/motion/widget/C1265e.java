package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.C1293a;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p007a1.AbstractC0029j;
import p118e1.AbstractC18161d;

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* loaded from: classes2.dex */
public class C1265e extends AbstractC1264d {

    /* renamed from: g */
    private String f5079g;

    /* renamed from: h */
    private int f5080h = -1;

    /* renamed from: i */
    private boolean f5081i = false;

    /* renamed from: j */
    private float f5082j = Float.NaN;

    /* renamed from: k */
    private float f5083k = Float.NaN;

    /* renamed from: l */
    private float f5084l = Float.NaN;

    /* renamed from: m */
    private float f5085m = Float.NaN;

    /* renamed from: n */
    private float f5086n = Float.NaN;

    /* renamed from: o */
    private float f5087o = Float.NaN;

    /* renamed from: p */
    private float f5088p = Float.NaN;

    /* renamed from: q */
    private float f5089q = Float.NaN;

    /* renamed from: r */
    private float f5090r = Float.NaN;

    /* renamed from: s */
    private float f5091s = Float.NaN;

    /* renamed from: t */
    private float f5092t = Float.NaN;

    /* renamed from: u */
    private float f5093u = Float.NaN;

    /* renamed from: v */
    private float f5094v = Float.NaN;

    /* renamed from: w */
    private float f5095w = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.e$a */
    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f5096a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5096a = sparseIntArray;
            sparseIntArray.append(AbstractC1298f.KeyAttribute_android_alpha, 1);
            f5096a.append(AbstractC1298f.KeyAttribute_android_elevation, 2);
            f5096a.append(AbstractC1298f.KeyAttribute_android_rotation, 4);
            f5096a.append(AbstractC1298f.KeyAttribute_android_rotationX, 5);
            f5096a.append(AbstractC1298f.KeyAttribute_android_rotationY, 6);
            f5096a.append(AbstractC1298f.KeyAttribute_android_transformPivotX, 19);
            f5096a.append(AbstractC1298f.KeyAttribute_android_transformPivotY, 20);
            f5096a.append(AbstractC1298f.KeyAttribute_android_scaleX, 7);
            f5096a.append(AbstractC1298f.KeyAttribute_transitionPathRotate, 8);
            f5096a.append(AbstractC1298f.KeyAttribute_transitionEasing, 9);
            f5096a.append(AbstractC1298f.KeyAttribute_motionTarget, 10);
            f5096a.append(AbstractC1298f.KeyAttribute_framePosition, 12);
            f5096a.append(AbstractC1298f.KeyAttribute_curveFit, 13);
            f5096a.append(AbstractC1298f.KeyAttribute_android_scaleY, 14);
            f5096a.append(AbstractC1298f.KeyAttribute_android_translationX, 15);
            f5096a.append(AbstractC1298f.KeyAttribute_android_translationY, 16);
            f5096a.append(AbstractC1298f.KeyAttribute_android_translationZ, 17);
            f5096a.append(AbstractC1298f.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m6108a(C1265e c1265e, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f5096a.get(index)) {
                    case 1:
                        c1265e.f5082j = typedArray.getFloat(index, c1265e.f5082j);
                        break;
                    case 2:
                        c1265e.f5083k = typedArray.getDimension(index, c1265e.f5083k);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f5096a.get(index));
                        break;
                    case 4:
                        c1265e.f5084l = typedArray.getFloat(index, c1265e.f5084l);
                        break;
                    case 5:
                        c1265e.f5085m = typedArray.getFloat(index, c1265e.f5085m);
                        break;
                    case 6:
                        c1265e.f5086n = typedArray.getFloat(index, c1265e.f5086n);
                        break;
                    case 7:
                        c1265e.f5090r = typedArray.getFloat(index, c1265e.f5090r);
                        break;
                    case 8:
                        c1265e.f5089q = typedArray.getFloat(index, c1265e.f5089q);
                        break;
                    case 9:
                        c1265e.f5079g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f4934r1) {
                            int resourceId = typedArray.getResourceId(index, c1265e.f5075b);
                            c1265e.f5075b = resourceId;
                            if (resourceId == -1) {
                                c1265e.f5076c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c1265e.f5076c = typedArray.getString(index);
                            break;
                        } else {
                            c1265e.f5075b = typedArray.getResourceId(index, c1265e.f5075b);
                            break;
                        }
                    case 12:
                        c1265e.f5074a = typedArray.getInt(index, c1265e.f5074a);
                        break;
                    case 13:
                        c1265e.f5080h = typedArray.getInteger(index, c1265e.f5080h);
                        break;
                    case 14:
                        c1265e.f5091s = typedArray.getFloat(index, c1265e.f5091s);
                        break;
                    case 15:
                        c1265e.f5092t = typedArray.getDimension(index, c1265e.f5092t);
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        c1265e.f5093u = typedArray.getDimension(index, c1265e.f5093u);
                        break;
                    case 17:
                        c1265e.f5094v = typedArray.getDimension(index, c1265e.f5094v);
                        break;
                    case 18:
                        c1265e.f5095w = typedArray.getFloat(index, c1265e.f5095w);
                        break;
                    case 19:
                        c1265e.f5087o = typedArray.getDimension(index, c1265e.f5087o);
                        break;
                    case 20:
                        c1265e.f5088p = typedArray.getDimension(index, c1265e.f5088p);
                        break;
                }
            }
        }
    }

    public C1265e() {
        this.f5077d = 1;
        this.f5078e = new HashMap();
    }

    /* renamed from: R */
    public void m6107R(String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c11 = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c11 = 16;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                this.f5095w = m6074k(obj);
                return;
            case 1:
                this.f5079g = obj.toString();
                return;
            case 2:
                this.f5085m = m6074k(obj);
                return;
            case 3:
                this.f5086n = m6074k(obj);
                return;
            case 4:
                this.f5092t = m6074k(obj);
                return;
            case 5:
                this.f5093u = m6074k(obj);
                return;
            case 6:
                this.f5094v = m6074k(obj);
                return;
            case 7:
                this.f5090r = m6074k(obj);
                return;
            case '\b':
                this.f5091s = m6074k(obj);
                return;
            case '\t':
                this.f5087o = m6074k(obj);
                return;
            case '\n':
                this.f5088p = m6074k(obj);
                return;
            case 11:
                this.f5084l = m6074k(obj);
                return;
            case '\f':
                this.f5083k = m6074k(obj);
                return;
            case '\r':
                this.f5089q = m6074k(obj);
                return;
            case 14:
                this.f5082j = m6074k(obj);
                return;
            case 15:
                this.f5080h = m6075l(obj);
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                this.f5081i = m6073j(obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x009a, code lost:            if (r1.equals("scaleY") == false) goto L15;     */
    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6064a(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            AbstractC0029j abstractC0029j = (AbstractC0029j) hashMap.get(str);
            if (abstractC0029j != null) {
                char c11 = 7;
                if (str.startsWith("CUSTOM")) {
                    C1293a c1293a = (C1293a) this.f5078e.get(str.substring(7));
                    if (c1293a != null) {
                        ((AbstractC18161d.b) abstractC0029j).m96465i(this.f5074a, c1293a);
                    }
                } else {
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
                    c11 = 65535;
                    switch (c11) {
                        case 0:
                            if (Float.isNaN(this.f5085m)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5085m);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f5086n)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5086n);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f5092t)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5092t);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f5093u)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5093u);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f5094v)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5094v);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f5095w)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5095w);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f5090r)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5090r);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f5091s)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5091s);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.f5085m)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5087o);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.f5086n)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5088p);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.f5084l)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5084l);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f5083k)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5083k);
                                break;
                            }
                        case '\f':
                            if (Float.isNaN(this.f5089q)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5089q);
                                break;
                            }
                        case '\r':
                            if (Float.isNaN(this.f5082j)) {
                                break;
                            } else {
                                abstractC0029j.mo90c(this.f5074a, this.f5082j);
                                break;
                            }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: b */
    public AbstractC1264d clone() {
        return new C1265e().mo6066c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: c */
    public AbstractC1264d mo6066c(AbstractC1264d abstractC1264d) {
        super.mo6066c(abstractC1264d);
        C1265e c1265e = (C1265e) abstractC1264d;
        this.f5080h = c1265e.f5080h;
        this.f5081i = c1265e.f5081i;
        this.f5082j = c1265e.f5082j;
        this.f5083k = c1265e.f5083k;
        this.f5084l = c1265e.f5084l;
        this.f5085m = c1265e.f5085m;
        this.f5086n = c1265e.f5086n;
        this.f5087o = c1265e.f5087o;
        this.f5088p = c1265e.f5088p;
        this.f5089q = c1265e.f5089q;
        this.f5090r = c1265e.f5090r;
        this.f5091s = c1265e.f5091s;
        this.f5092t = c1265e.f5092t;
        this.f5093u = c1265e.f5093u;
        this.f5094v = c1265e.f5094v;
        this.f5095w = c1265e.f5095w;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: d */
    public void mo6067d(HashSet hashSet) {
        if (!Float.isNaN(this.f5082j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f5083k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f5084l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f5085m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f5086n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f5087o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f5088p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f5092t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f5093u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f5094v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f5089q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f5090r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f5091s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f5095w)) {
            hashSet.add("progress");
        }
        if (this.f5078e.size() > 0) {
            Iterator it = this.f5078e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: e */
    public void mo6068e(Context context, AttributeSet attributeSet) {
        a.m6108a(this, context.obtainStyledAttributes(attributeSet, AbstractC1298f.KeyAttribute));
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: h */
    public void mo6071h(HashMap hashMap) {
        if (this.f5080h == -1) {
            return;
        }
        if (!Float.isNaN(this.f5082j)) {
            hashMap.put("alpha", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5083k)) {
            hashMap.put("elevation", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5084l)) {
            hashMap.put("rotation", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5085m)) {
            hashMap.put("rotationX", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5086n)) {
            hashMap.put("rotationY", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5087o)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5088p)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5092t)) {
            hashMap.put("translationX", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5093u)) {
            hashMap.put("translationY", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5094v)) {
            hashMap.put("translationZ", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5089q)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5090r)) {
            hashMap.put("scaleX", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5091s)) {
            hashMap.put("scaleY", Integer.valueOf(this.f5080h));
        }
        if (!Float.isNaN(this.f5095w)) {
            hashMap.put("progress", Integer.valueOf(this.f5080h));
        }
        if (this.f5078e.size() > 0) {
            Iterator it = this.f5078e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f5080h));
            }
        }
    }
}
