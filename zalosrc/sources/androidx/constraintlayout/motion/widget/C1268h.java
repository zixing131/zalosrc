package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.AbstractC1298f;
import java.util.HashMap;
import p007a1.C0022c;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* loaded from: classes2.dex */
public class C1268h extends AbstractC1269i {

    /* renamed from: h */
    String f5099h = null;

    /* renamed from: i */
    int f5100i = AbstractC1264d.f5073f;

    /* renamed from: j */
    int f5101j = 0;

    /* renamed from: k */
    float f5102k = Float.NaN;

    /* renamed from: l */
    float f5103l = Float.NaN;

    /* renamed from: m */
    float f5104m = Float.NaN;

    /* renamed from: n */
    float f5105n = Float.NaN;

    /* renamed from: o */
    float f5106o = Float.NaN;

    /* renamed from: p */
    float f5107p = Float.NaN;

    /* renamed from: q */
    int f5108q = 0;

    /* renamed from: r */
    private float f5109r = Float.NaN;

    /* renamed from: s */
    private float f5110s = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.h$a */
    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f5111a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5111a = sparseIntArray;
            sparseIntArray.append(AbstractC1298f.KeyPosition_motionTarget, 1);
            f5111a.append(AbstractC1298f.KeyPosition_framePosition, 2);
            f5111a.append(AbstractC1298f.KeyPosition_transitionEasing, 3);
            f5111a.append(AbstractC1298f.KeyPosition_curveFit, 4);
            f5111a.append(AbstractC1298f.KeyPosition_drawPath, 5);
            f5111a.append(AbstractC1298f.KeyPosition_percentX, 6);
            f5111a.append(AbstractC1298f.KeyPosition_percentY, 7);
            f5111a.append(AbstractC1298f.KeyPosition_keyPositionType, 9);
            f5111a.append(AbstractC1298f.KeyPosition_sizePercent, 8);
            f5111a.append(AbstractC1298f.KeyPosition_percentWidth, 11);
            f5111a.append(AbstractC1298f.KeyPosition_percentHeight, 12);
            f5111a.append(AbstractC1298f.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m6116b(C1268h c1268h, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f5111a.get(index)) {
                    case 1:
                        if (MotionLayout.f4934r1) {
                            int resourceId = typedArray.getResourceId(index, c1268h.f5075b);
                            c1268h.f5075b = resourceId;
                            if (resourceId == -1) {
                                c1268h.f5076c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c1268h.f5076c = typedArray.getString(index);
                            break;
                        } else {
                            c1268h.f5075b = typedArray.getResourceId(index, c1268h.f5075b);
                            break;
                        }
                    case 2:
                        c1268h.f5074a = typedArray.getInt(index, c1268h.f5074a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            c1268h.f5099h = typedArray.getString(index);
                            break;
                        } else {
                            c1268h.f5099h = C0022c.f60c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c1268h.f5112g = typedArray.getInteger(index, c1268h.f5112g);
                        break;
                    case 5:
                        c1268h.f5101j = typedArray.getInt(index, c1268h.f5101j);
                        break;
                    case 6:
                        c1268h.f5104m = typedArray.getFloat(index, c1268h.f5104m);
                        break;
                    case 7:
                        c1268h.f5105n = typedArray.getFloat(index, c1268h.f5105n);
                        break;
                    case 8:
                        float f11 = typedArray.getFloat(index, c1268h.f5103l);
                        c1268h.f5102k = f11;
                        c1268h.f5103l = f11;
                        break;
                    case 9:
                        c1268h.f5108q = typedArray.getInt(index, c1268h.f5108q);
                        break;
                    case 10:
                        c1268h.f5100i = typedArray.getInt(index, c1268h.f5100i);
                        break;
                    case 11:
                        c1268h.f5102k = typedArray.getFloat(index, c1268h.f5102k);
                        break;
                    case 12:
                        c1268h.f5103l = typedArray.getFloat(index, c1268h.f5103l);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f5111a.get(index));
                        break;
                }
            }
            int i12 = c1268h.f5074a;
        }
    }

    public C1268h() {
        this.f5077d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: a */
    public void mo6064a(HashMap hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1264d clone() {
        return new C1268h().mo6066c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: c */
    public AbstractC1264d mo6066c(AbstractC1264d abstractC1264d) {
        super.mo6066c(abstractC1264d);
        C1268h c1268h = (C1268h) abstractC1264d;
        this.f5099h = c1268h.f5099h;
        this.f5100i = c1268h.f5100i;
        this.f5101j = c1268h.f5101j;
        this.f5102k = c1268h.f5102k;
        this.f5103l = Float.NaN;
        this.f5104m = c1268h.f5104m;
        this.f5105n = c1268h.f5105n;
        this.f5106o = c1268h.f5106o;
        this.f5107p = c1268h.f5107p;
        this.f5109r = c1268h.f5109r;
        this.f5110s = c1268h.f5110s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1264d
    /* renamed from: e */
    public void mo6068e(Context context, AttributeSet attributeSet) {
        a.m6116b(this, context.obtainStyledAttributes(attributeSet, AbstractC1298f.KeyPosition));
    }

    /* renamed from: m */
    public void m6113m(int i11) {
        this.f5108q = i11;
    }

    /* renamed from: n */
    public void m6114n(String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c11 = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c11 = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c11 = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c11 = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                this.f5099h = obj.toString();
                return;
            case 1:
                this.f5102k = m6074k(obj);
                return;
            case 2:
                this.f5103l = m6074k(obj);
                return;
            case 3:
                this.f5101j = m6075l(obj);
                return;
            case 4:
                float m6074k = m6074k(obj);
                this.f5102k = m6074k;
                this.f5103l = m6074k;
                return;
            case 5:
                this.f5104m = m6074k(obj);
                return;
            case 6:
                this.f5105n = m6074k(obj);
                return;
            default:
                return;
        }
    }
}
