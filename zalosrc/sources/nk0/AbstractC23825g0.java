package nk0;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.zing.zalo.zinstant.utils.C17189a;
import com.zing.zalo.zinstant.zom.meta.ImpressionMeta;
import com.zing.zalo.zinstant.zom.model.config.DataExtrasConfig;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMSkeleton;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMClickEffect;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.ZOMConditional;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMRotate;
import com.zing.zalo.zinstant.zom.properties.ZOMScale;
import com.zing.zalo.zinstant.zom.properties.ZOMSkew;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransformElement;
import com.zing.zalo.zinstant.zom.properties.ZOMTranslate;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.LinkedList;
import ok0.InterfaceC24286c;
import ok0.InterfaceC24288e;
import org.json.JSONObject;
import qk0.AbstractC25310f;
import qk0.InterfaceC25305a;
import qk0.InterfaceC25307c;
import sj0.C26277b;
import sj0.C26280e;
import sj0.C26287l;
import sj0.C26288m;
import sj0.C26289n;
import sj0.C26293r;
import tk0.C26730b;
import uk0.C27291e;

/* renamed from: nk0.g0 */
/* loaded from: classes7.dex */
public abstract class AbstractC23825g0 extends AbstractC25310f implements InterfaceC25307c, InterfaceC23806a {

    /* renamed from: E */
    public static boolean f115102E = false;

    /* renamed from: F */
    private static final int[] f115103F = new int[0];

    /* renamed from: G */
    private static final int[] f115104G = {R.attr.state_pressed};

    /* renamed from: A */
    private final Runnable f115105A;

    /* renamed from: B */
    float[] f115106B;

    /* renamed from: C */
    protected final Object f115107C;

    /* renamed from: D */
    private long f115108D;

    /* renamed from: j */
    protected C26280e f115109j;

    /* renamed from: k */
    protected C26288m f115110k;

    /* renamed from: l */
    private C26277b f115111l;

    /* renamed from: m */
    private C26293r f115112m;

    /* renamed from: n */
    private C26289n f115113n;

    /* renamed from: o */
    private C26287l f115114o;

    /* renamed from: p */
    protected C26280e f115115p;

    /* renamed from: q */
    protected C26280e f115116q;

    /* renamed from: r */
    protected C26280e f115117r;

    /* renamed from: s */
    public int f115118s;

    /* renamed from: t */
    private JSONObject f115119t;

    /* renamed from: u */
    private C27291e f115120u;

    /* renamed from: v */
    C26280e f115121v;

    /* renamed from: w */
    public boolean f115122w;

    /* renamed from: x */
    private boolean f115123x;

    /* renamed from: y */
    public DataExtrasConfig f115124y;

    /* renamed from: z */
    private final Runnable f115125z;

    public AbstractC23825g0(C23855s0 c23855s0, ZOM zom) {
        super(c23855s0, AbstractC25310f.a.ZinstantNode, zom);
        this.f115118s = 4;
        this.f115122w = false;
        this.f115123x = false;
        this.f115124y = null;
        this.f115125z = new Runnable() { // from class: nk0.d0
            public /* synthetic */ RunnableC23816d0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23825g0.this.m124490l1();
            }
        };
        this.f115105A = new Runnable() { // from class: nk0.e0
            public /* synthetic */ RunnableC23819e0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23825g0.this.m124491m1();
            }
        };
        this.f115106B = new float[2];
        this.f115107C = new Object();
        this.f115108D = 0L;
        m124485g2();
        m124493v1();
    }

    /* renamed from: A1 */
    private void m124446A1() {
        this.f115115p = null;
        this.f115116q = null;
        this.f115110k = null;
    }

    /* renamed from: C1 */
    private void m124447C1() {
        m124478d1();
        m124482f1();
        m124480e1();
        m124489k1();
        m124488j1();
        m124486h1();
        m124484g1();
        m124487i1();
    }

    /* renamed from: D1 */
    private void m124448D1() {
        C26280e c26280e = this.f115109j;
        if (c26280e == null) {
            return;
        }
        c26280e.m135231j(m131022q());
    }

    /* renamed from: F1 */
    private void m124449F1() {
        C26280e c26280e = this.f115109j;
        if (c26280e == null) {
            return;
        }
        m124498M1(c26280e);
    }

    /* renamed from: G1 */
    private void m124450G1() {
        ZOMBackground zOMBackground;
        if (this.f115113n != null && (zOMBackground = m131007J().mBackground) != null) {
            m124498M1(this.f115113n);
            this.f115113n.m135284J(zOMBackground.mGradient);
        }
    }

    /* renamed from: H1 */
    private void m124451H1() {
        ZOMBackground zOMBackground;
        if (this.f115112m != null && (zOMBackground = m131007J().mBackground) != null) {
            this.f115112m.m135345g0(zOMBackground.getType(), zOMBackground.getSrc(), ImageView.ScaleType.CENTER_CROP, false, zOMBackground.mTintColor, zOMBackground.mRepeat, false, 1, true, this.f115122w);
            this.f115112m.setBounds(0, 0, m131005I(), m131027v());
        }
    }

    /* renamed from: I1 */
    private void m124452I1() {
        ZOMBorder zOMBorder = m131007J().mBorder;
        C26280e c26280e = this.f115117r;
        if (c26280e != null && zOMBorder != null) {
            m124498M1(c26280e);
        }
    }

    /* renamed from: J1 */
    private void m124453J1() {
        if (this.f115114o == null) {
            return;
        }
        ZOMBoxShadow zOMBoxShadow = m131007J().mBoxShadow;
        if (zOMBoxShadow != null) {
            ZOM m131007J = m131007J();
            C26287l c26287l = this.f115114o;
            int i11 = zOMBoxShadow.hOffset;
            int i12 = zOMBoxShadow.vOffset;
            int i13 = zOMBoxShadow.blur;
            int i14 = zOMBoxShadow.spread;
            int i15 = zOMBoxShadow.color;
            float f11 = m131007J.mRadius;
            boolean[] zArr = m131007J.mCornersToggle;
            c26287l.m135261j(i11, i12, i13, i14, i15, f11, zArr[0], zArr[1], zArr[2], zArr[3], m131007J.mWidth, m131007J.mHeight);
        }
        this.f115114o.setBounds(0, 0, m131007J().mWidth, m131007J().mHeight);
    }

    /* renamed from: K1 */
    private void m124454K1() {
        C26280e c26280e = this.f115121v;
        if (c26280e == null) {
            return;
        }
        m124498M1(c26280e);
    }

    /* renamed from: L1 */
    private void m124455L1() {
        m124449F1();
        m124451H1();
        m124450G1();
        m124457O1();
        m124456N1();
        m124453J1();
        m124452I1();
        m124454K1();
    }

    /* renamed from: N1 */
    private void m124456N1() {
        C26277b c26277b = this.f115111l;
        if (c26277b == null) {
            return;
        }
        c26277b.setBounds(0, 0, m131007J().mWidth, m131007J().mHeight);
    }

    /* renamed from: O1 */
    private void m124457O1() {
        C26288m c26288m = this.f115110k;
        if (c26288m == null) {
            return;
        }
        m124498M1(c26288m);
    }

    /* renamed from: P1 */
    private void m124458P1() {
        if (this.f115109j == null) {
            return;
        }
        ZOM m131007J = m131007J();
        ZOMBackground zOMBackground = m131007J.mBackground;
        if (m131007J.mType == 7) {
            this.f115109j.m135231j(((ZOMSkeleton) m131007J).mSkeletonBackgroundColor);
        } else if (zOMBackground != null) {
            this.f115109j.m135231j(m131022q());
        }
        this.f115109j.setAlpha(m131021p());
        m124497E1(this.f115109j);
    }

    /* renamed from: Q1 */
    private void m124459Q1() {
        if (this.f115113n == null) {
            return;
        }
        ZOMBackground zOMBackground = m131007J().mBackground;
        if (zOMBackground != null) {
            this.f115113n.m135284J(zOMBackground.mGradient);
            this.f115113n.m135283H(zOMBackground.mTintColor);
            m124497E1(this.f115113n);
        }
        this.f115113n.setAlpha(m131021p());
    }

    /* renamed from: R1 */
    private void m124460R1() {
        if (this.f115112m == null) {
            return;
        }
        ZOMBackground zOMBackground = m131007J().mBackground;
        if (zOMBackground != null) {
            String src = zOMBackground.getSrc();
            this.f115112m.m135345g0(zOMBackground.getType(), src, ImageView.ScaleType.CENTER_CROP, false, zOMBackground.mTintColor, zOMBackground.mRepeat, false, 1, true, this.f115122w);
        }
        this.f115112m.setAlpha(m131021p());
    }

    /* renamed from: S1 */
    private void m124461S1() {
        ZOMBorder zOMBorder = m131007J().mBorder;
        C26280e c26280e = this.f115117r;
        if (c26280e != null && zOMBorder != null) {
            m124497E1(c26280e);
            this.f115117r.m135236p(zOMBorder.width, m124505b1(zOMBorder.color));
        }
    }

    /* renamed from: T1 */
    private void m124463T1() {
        if (this.f115114o == null) {
            return;
        }
        ZOMBoxShadow zOMBoxShadow = m131007J().mBoxShadow;
        if (zOMBoxShadow != null) {
            ZOM m131007J = m131007J();
            C26287l c26287l = this.f115114o;
            int i11 = zOMBoxShadow.hOffset;
            int i12 = zOMBoxShadow.vOffset;
            int i13 = zOMBoxShadow.blur;
            int i14 = zOMBoxShadow.spread;
            int i15 = zOMBoxShadow.color;
            float f11 = m131007J.mRadius;
            boolean[] zArr = m131007J.mCornersToggle;
            c26287l.m135261j(i11, i12, i13, i14, i15, f11, zArr[0], zArr[1], zArr[2], zArr[3], m131007J.mWidth, m131007J.mHeight);
        }
        this.f115114o.setAlpha(m131021p());
    }

    /* renamed from: U1 */
    private void m124465U1() {
        m124458P1();
        m124460R1();
        m124459Q1();
        m124469W1();
        m124467V1();
        m124463T1();
        m124461S1();
    }

    /* renamed from: V1 */
    private void m124467V1() {
        C26277b c26277b = this.f115111l;
        if (c26277b == null) {
            return;
        }
        c26277b.m135209C(m131007J().mGlowingAnimation, m131007J().mRadius);
        this.f115111l.setAlpha(m131021p());
    }

    /* renamed from: W0 */
    private void m124468W0(Canvas canvas, LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ZOMTransformElement zOMTransformElement = (ZOMTransformElement) it.next();
            int type = zOMTransformElement.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            ZOMSkew zOMSkew = (ZOMSkew) zOMTransformElement;
                            canvas.skew((float) Math.tan(Math.toRadians(zOMSkew.mAngleX)), (float) Math.tan(Math.toRadians(zOMSkew.mAngleY)));
                        }
                    } else {
                        canvas.rotate(((ZOMRotate) zOMTransformElement).mAngle);
                    }
                } else {
                    ZOMScale zOMScale = (ZOMScale) zOMTransformElement;
                    canvas.scale(zOMScale.f88007mX, zOMScale.f88008mY);
                }
            } else {
                ZOMTranslate zOMTranslate = (ZOMTranslate) zOMTransformElement;
                canvas.translate(zOMTranslate.f88010mX, zOMTranslate.f88011mY);
            }
        }
    }

    /* renamed from: W1 */
    private void m124469W1() {
        int i11;
        if (this.f115110k == null) {
            return;
        }
        ZOM m131007J = m131007J();
        ZOMBackground zOMBackground = m131007J.mBackground;
        if (m131007J.isClickable()) {
            C26288m c26288m = this.f115110k;
            this.f115115p = c26288m;
            int i12 = 1;
            if (zOMBackground != null) {
                i11 = zOMBackground.mPressedColor;
                ZOMClickEffect zOMClickEffect = zOMBackground.mClickEffect;
                if (zOMClickEffect != null) {
                    i12 = zOMClickEffect.mType;
                }
                if (zOMBackground.mPressedOverlay) {
                    this.f115116q = c26288m;
                    this.f115115p = null;
                } else {
                    this.f115116q = null;
                }
            } else {
                i11 = 1291845632;
            }
            c26288m.mo135235o(i11);
            this.f115110k.m135266y(i12);
            return;
        }
        m124446A1();
    }

    /* renamed from: X0 */
    private boolean m124470X0(MotionEvent motionEvent) {
        if (!m131007J().isClickable()) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        Rect m131023r = m131023r();
        m124503Z0(this.f115106B, x11, y11);
        float[] fArr = this.f115106B;
        return m131023r.contains((int) fArr[0], (int) fArr[1]);
    }

    /* renamed from: X1 */
    private void m124471X1() {
        ZOMInsight zOMInsight = m131007J().mInsight;
        if (zOMInsight != null) {
            this.f115120u = new C27291e(m131007J().mID, zOMInsight);
        }
    }

    /* renamed from: Y1 */
    private void m124472Y1() {
        C26280e c26280e = this.f115109j;
        if (c26280e == null) {
            return;
        }
        c26280e.setAlpha(m131021p());
    }

    /* renamed from: Z1 */
    private void m124473Z1() {
        C26289n c26289n = this.f115113n;
        if (c26289n == null) {
            return;
        }
        c26289n.setAlpha(m131021p());
    }

    /* renamed from: a2 */
    private void m124474a2() {
        C26293r c26293r = this.f115112m;
        if (c26293r == null) {
            return;
        }
        c26293r.setAlpha(m131021p());
    }

    /* renamed from: b2 */
    private void m124475b2() {
        C26280e c26280e;
        ZOMBorder zOMBorder = m131007J().mBorder;
        if (zOMBorder != null && (c26280e = this.f115117r) != null) {
            c26280e.m135236p(zOMBorder.width, m124505b1(zOMBorder.color));
        }
    }

    /* renamed from: c1 */
    private C26280e m124476c1() {
        m124487i1();
        return this.f115121v;
    }

    /* renamed from: c2 */
    private void m124477c2() {
        C26287l c26287l = this.f115114o;
        if (c26287l == null) {
            return;
        }
        c26287l.setAlpha(m131021p());
    }

    /* renamed from: d1 */
    private void m124478d1() {
        boolean z11;
        ZOM m131007J = m131007J();
        ZOMBackground zOMBackground = m131007J.mBackground;
        boolean z12 = false;
        if (zOMBackground != null && zOMBackground.mColor != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m131007J.mType == 7 && ((ZOMSkeleton) m131007J).mSkeletonBackgroundColor != 0) {
            z12 = true;
        }
        if (!z11 && !z12) {
            this.f115109j = null;
        } else if (this.f115109j == null) {
            this.f115109j = new C26280e();
            m124449F1();
            m124458P1();
            this.f115109j.setCallback(m131031z());
        }
    }

    /* renamed from: d2 */
    private void m124479d2() {
        m124472Y1();
        m124475b2();
        m124474a2();
        m124473Z1();
        m124483f2();
        m124481e2();
        m124477c2();
    }

    /* renamed from: e1 */
    private void m124480e1() {
        ZOM m131007J = m131007J();
        ZOMBackground zOMBackground = m131007J.mBackground;
        if (zOMBackground != null && zOMBackground.mGradient != null) {
            if (this.f115113n == null) {
                this.f115113n = new C26289n(m131007J.mBound.getWidth(), m131007J.mBound.getHeight(), zOMBackground.mGradient);
                m124450G1();
                m124459Q1();
                this.f115113n.setCallback(m131031z());
                return;
            }
            return;
        }
        this.f115113n = null;
    }

    /* renamed from: e2 */
    private void m124481e2() {
        C26277b c26277b = this.f115111l;
        if (c26277b == null) {
            return;
        }
        c26277b.setAlpha(m131021p());
    }

    /* renamed from: f1 */
    private void m124482f1() {
        ZOMBackground zOMBackground = m131007J().mBackground;
        if (zOMBackground != null && !TextUtils.isEmpty(zOMBackground.getSrc())) {
            if (this.f115112m == null) {
                this.f115112m = new C26293r(this, true);
                String src = zOMBackground.getSrc();
                this.f115112m.m135338L(zOMBackground.getType(), src, ImageView.ScaleType.CENTER_CROP, false, zOMBackground.mTintColor, zOMBackground.mRepeat, false, 1, true, this.f115122w);
                this.f115112m.setBounds(0, 0, m131005I(), m131027v());
                this.f115112m.setAlpha(m131021p());
                this.f115112m.m135337J().setCallback(m131031z());
                return;
            }
            return;
        }
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            c26293r.m135343a0();
            this.f115112m = null;
        }
    }

    /* renamed from: f2 */
    private void m124483f2() {
        C26288m c26288m = this.f115110k;
        if (c26288m == null) {
            return;
        }
        c26288m.setAlpha(m131021p());
    }

    /* renamed from: g1 */
    private void m124484g1() {
        if (m131007J().mBorder != null) {
            if (this.f115117r == null) {
                C26280e c26280e = new C26280e();
                this.f115117r = c26280e;
                c26280e.m135231j(0);
                m124452I1();
                m124461S1();
                this.f115117r.setCallback(m131031z());
                return;
            }
            return;
        }
        this.f115117r = null;
    }

    /* renamed from: g2 */
    private void m124485g2() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ZOMBackground zOMBackground = m131007J().mBackground;
        boolean z18 = true;
        if (zOMBackground != null) {
            if (zOMBackground.mColor != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (zOMBackground.mPressedColor != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z19 = z15 | z16 | (!TextUtils.isEmpty(zOMBackground.getSrc()));
            if (zOMBackground.mGradient != null) {
                z17 = true;
            } else {
                z17 = false;
            }
            z11 = z17 | z19;
        } else {
            z11 = false;
        }
        boolean isClickable = z11 | m131007J().isClickable();
        if (m131007J().mBorder != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z21 = isClickable | z12;
        if (m131007J().mGlowingAnimation != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z22 = z21 | z13;
        if (m131007J().mBoxShadow != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z23 = z22 | z14;
        if (m131007J().mType != 7 || ((ZOMSkeleton) m131007J()).mSkeletonBackgroundColor == 0) {
            z18 = false;
        }
        this.f115123x = z23 | z18;
    }

    /* renamed from: h1 */
    private void m124486h1() {
        if (m131007J().mBoxShadow != null) {
            if (this.f115114o == null) {
                this.f115114o = new C26287l();
                m124453J1();
                m124463T1();
                this.f115114o.setCallback(m131031z());
                return;
            }
            return;
        }
        this.f115114o = null;
    }

    /* renamed from: i1 */
    private void m124487i1() {
        if (f115102E && this.f115121v == null) {
            C26280e c26280e = new C26280e(m131007J().mWidth, m131007J().mHeight);
            this.f115121v = c26280e;
            c26280e.m135236p(2, -65536);
            this.f115121v.m135231j(0);
            if (TextUtils.equals(m131007J().mAnchorType, "reactions")) {
                this.f115121v.m135236p(8, -16776961);
            }
            m124498M1(this.f115121v);
        }
    }

    /* renamed from: j1 */
    private void m124488j1() {
        if (m131007J().mGlowingAnimation != null) {
            if (this.f115111l == null) {
                this.f115111l = new C26277b();
                m124456N1();
                m124467V1();
                this.f115111l.setCallback(m131031z());
                return;
            }
            return;
        }
        C26277b c26277b = this.f115111l;
        if (c26277b != null) {
            c26277b.m135212z();
            this.f115111l = null;
        }
    }

    /* renamed from: k1 */
    private void m124489k1() {
        if (m131007J().isClickable()) {
            if (this.f115110k == null) {
                this.f115110k = new C26288m();
                m124457O1();
                m124469W1();
                this.f115110k.m135231j(0);
                this.f115110k.setCallback(m131031z());
                return;
            }
            return;
        }
        m124446A1();
    }

    /* renamed from: l1 */
    public /* synthetic */ void m124490l1() {
        InterfaceC25305a m131024s = m131024s();
        ZOMClick zOMClick = m131007J().mClick;
        C26730b m130997C = m130997C();
        if (zOMClick != null && zOMClick.valid()) {
            if (m130997C != null && !m130997C.m137485b(zOMClick.mAction)) {
                return;
            }
            if (this.f115119t != null) {
                m131024s.mo92035f(this, m131007J().mID, zOMClick.mAction, zOMClick.mData, this.f115119t);
            } else {
                m131024s.mo92032c(this, m131007J().mID, zOMClick.mAction, zOMClick.mData);
            }
        }
    }

    /* renamed from: m1 */
    public /* synthetic */ void m124491m1() {
        InterfaceC25305a m131024s = m131024s();
        ZOMClick zOMClick = m131007J().mLongClick;
        if (zOMClick != null && zOMClick.valid()) {
            m131024s.mo92033d(this, m131007J().mID, zOMClick.mAction, zOMClick.mData);
        }
    }

    /* renamed from: n1 */
    private boolean m124492n1() {
        return this.f115123x;
    }

    /* renamed from: v1 */
    private void m124493v1() {
        if (TextUtils.isEmpty(m131007J().mExtraData)) {
            return;
        }
        DataExtrasConfig dataExtrasConfig = new DataExtrasConfig(m131007J().mExtraData);
        this.f115124y = dataExtrasConfig;
        JSONObject jSONObject = dataExtrasConfig.mI18n;
        if (jSONObject != null) {
            this.f115119t = jSONObject.optJSONObject("click");
        }
        this.f115122w = this.f115124y.mRecheckSrc;
    }

    /* renamed from: w1 */
    public void m124494w1() {
        m131007J().onClick();
        if (m131007J().isClickable()) {
            this.f115125z.run();
        }
    }

    /* renamed from: B1 */
    public void m124495B1(int i11, boolean z11) {
        int i12;
        this.f115118s = i11;
        long j11 = 0;
        if (i11 == 2) {
            Message m131017c0 = m131017c0(4, null);
            m131017c0.obj = Integer.valueOf(i11);
            if (z11) {
                j11 = 100;
            }
            m131008K0(m131017c0, false, j11);
            return;
        }
        Message m131017c02 = m131017c0(3, null);
        m131017c02.obj = Integer.valueOf(i11);
        if (i11 != 1 && i11 != 3) {
            i12 = 100;
        } else {
            i12 = 50;
        }
        if (z11) {
            j11 = i12;
        }
        m131008K0(m131017c02, false, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qk0.AbstractC25310f
    /* renamed from: D0 */
    public void mo124496D0() {
        super.mo124496D0();
        C26277b c26277b = this.f115111l;
        if (c26277b != null) {
            c26277b.m135211x();
        }
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            c26293r.m135357t0();
        }
    }

    /* renamed from: E1 */
    public void m124497E1(C26280e c26280e) {
        c26280e.m135234m(m131007J().mRadius, m131007J().mCornersToggle[0], m131007J().mCornersToggle[1], m131007J().mCornersToggle[2], m131007J().mCornersToggle[3]);
    }

    /* renamed from: M1 */
    public void m124498M1(C26280e c26280e) {
        c26280e.setBounds(0, 0, m131005I(), m131027v());
        m124497E1(c26280e);
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: P */
    public void mo124499P(Message message) {
        int i11 = message.what;
        if (i11 != 3 && i11 != 4) {
            super.mo124499P(message);
            return;
        }
        int intValue = ((Integer) message.obj).intValue();
        if (intValue == 2) {
            mo124441s1();
        } else if (intValue == 4) {
            mo124442u1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qk0.AbstractC25310f
    /* renamed from: P0 */
    public void mo124500P0() {
        super.mo124500P0();
        C26277b c26277b = this.f115111l;
        if (c26277b != null) {
            c26277b.m135212z();
        }
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            c26293r.m135358v0();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: S0 */
    public void mo124501S0() {
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            c26293r.m135339Q();
        }
    }

    /* renamed from: Y0 */
    protected void m124502Y0(Canvas canvas) {
        int i11;
        int i12;
        C26280e m124476c1 = m124476c1();
        if (f115102E && m124476c1 != null) {
            m124476c1.m135231j(0);
            if (TextUtils.equals(m131007J().mAnchorType, "reactions")) {
                i11 = -16776961;
                i12 = 8;
            } else {
                i11 = -65536;
                i12 = 2;
            }
            m124476c1.m135236p(i12, i11);
            m124476c1.draw(canvas);
        }
    }

    /* renamed from: Z0 */
    public void m124503Z0(float[] fArr, float f11, float f12) {
        fArr[0] = f11;
        fArr[1] = f12;
        ZOMMatrix2D transformInverseMatrixPosition = m131026t().getTransformInverseMatrixPosition();
        if (transformInverseMatrixPosition != null && !transformInverseMatrixPosition.isIdentity()) {
            float[] fArr2 = transformInverseMatrixPosition.matrix;
            fArr[0] = (fArr2[0] * f11) + (fArr2[2] * f12) + fArr2[4];
            fArr[1] = (fArr2[1] * f11) + (fArr2[3] * f12) + fArr2[5];
        }
    }

    /* renamed from: a1 */
    public String mo124504a1() {
        if (m131007J().mCondition != null) {
            for (ZOMConditional zOMConditional : m131007J().mCondition) {
                if (zOMConditional != null && zOMConditional.mType == 1) {
                    ZOMConditionParam zOMConditionParam = (ZOMConditionParam) zOMConditional;
                    C26730b m130997C = m130997C();
                    if (m130997C == null || m130997C.m137486c(zOMConditionParam.action)) {
                        return m131030y().mo91644c(zOMConditionParam.action, zOMConditionParam.data, null);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b1 */
    public int m124505b1(int i11) {
        return C17189a.f87752a.m91796b(m130996B(), i11);
    }

    @Override // qk0.InterfaceC25307c
    /* renamed from: c */
    public void mo124506c(InterfaceC25307c.a aVar) {
        m131031z().mo128878o(this, aVar);
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: d0 */
    public void mo124507d0(Canvas canvas) {
        LinkedList<ZOMTransformElement> transformElements;
        ZOM m131007J = m131007J();
        if (m131007J.mTransform != null && (transformElements = m131026t().getTransformElements()) != null && transformElements.size() > 0) {
            ZOMTransform zOMTransform = m131007J.mTransform;
            canvas.translate(zOMTransform.valueOriginX, zOMTransform.valueOriginY);
            m124468W0(canvas, transformElements);
            ZOMTransform zOMTransform2 = m131007J.mTransform;
            canvas.translate(-zOMTransform2.valueOriginX, -zOMTransform2.valueOriginY);
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: e0 */
    public void mo124508e0() {
        super.mo124508e0();
        m124448D1();
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: i0 */
    public void mo124509i0() {
        boolean z11;
        C27291e c27291e;
        super.mo124509i0();
        ImpressionMeta m131029x = m131029x();
        if (m131029x != null && m131029x.isOnlyInterval()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ZOMInsight zOMInsight = m131007J().mInsight;
        if (zOMInsight == null || (c27291e = this.f115120u) == null || !m131016Z(Math.min(1.0f, Math.max(0.2f, c27291e.f128388b.mOffset)))) {
            return;
        }
        if (!z11 && zOMInsight.mImpressionTimeout >= 5000) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f115108D > zOMInsight.mImpressionTimeout) {
                if (f115102E) {
                    AbstractC20110a.m104535d("checkImpression - hasImpression", new Object[0]);
                }
                if (m131031z().mo128879t(this.f115120u)) {
                    this.f115108D = currentTimeMillis;
                    return;
                }
                return;
            }
            return;
        }
        if (!z11 || zOMInsight.mImpressionTimeout < 5000) {
            return;
        }
        if (f115102E) {
            AbstractC20110a.m104535d("checkImpression - hasImpression with meta impression", new Object[0]);
        }
        m131031z().mo128879t(this.f115120u);
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: j0 */
    public void mo124435j0(Canvas canvas) {
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: k0 */
    protected void mo124510k0(Canvas canvas) {
        if (this.f115114o != null || this.f115109j != null || this.f115112m != null || this.f115113n != null || this.f115111l != null || this.f115115p != null) {
            canvas.save();
            canvas.translate(m131023r().left, m131023r().top);
            C26287l c26287l = this.f115114o;
            if (c26287l != null) {
                c26287l.draw(canvas);
            }
            C26280e c26280e = this.f115109j;
            if (c26280e != null) {
                c26280e.draw(canvas);
            }
            C26289n c26289n = this.f115113n;
            if (c26289n != null) {
                c26289n.draw(canvas);
            }
            C26293r c26293r = this.f115112m;
            if (c26293r != null) {
                c26293r.draw(canvas);
            }
            C26277b c26277b = this.f115111l;
            if (c26277b != null) {
                c26277b.draw(canvas);
            }
            C26280e c26280e2 = this.f115115p;
            if (c26280e2 != null) {
                c26280e2.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: l0 */
    public void mo124511l0(Canvas canvas) {
        canvas.save();
        canvas.translate(m131023r().left, m131023r().top);
        C26280e c26280e = this.f115117r;
        if (c26280e != null) {
            c26280e.draw(canvas);
        }
        C26280e c26280e2 = this.f115116q;
        if (c26280e2 != null) {
            c26280e2.draw(canvas);
        }
        if (f115102E) {
            m124502Y0(canvas);
        }
        canvas.restore();
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: m0 */
    public void mo124512m0() {
        super.mo124512m0();
        m124447C1();
        m124471X1();
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        m124479d2();
    }

    /* renamed from: o1 */
    public boolean mo124437o1(MotionEvent motionEvent) {
        if (!m124470X0(motionEvent) || this.f115118s != 2) {
            return false;
        }
        m131000E().mo124395c(new Runnable() { // from class: nk0.f0
            public /* synthetic */ RunnableC23822f0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23825g0.this.m124494w1();
            }
        }, this.f115107C, true);
        m124495B1(1, false);
        return true;
    }

    @Override // qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onPause() {
        super.onPause();
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            m131028w().m116438g(new RunnableC23864x(c26293r), null, false);
        }
    }

    @Override // qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onStop() {
        super.onStop();
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            m131028w().m116438g(new RunnableC23862w(c26293r), null, false);
        }
        this.f115108D = 0L;
    }

    /* renamed from: p1 */
    public boolean mo124513p1(MotionEvent motionEvent, int i11) {
        if (!m131015Y()) {
            return false;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return false;
                    }
                    return m124515t1();
                }
                return mo124438q1(motionEvent);
            }
            return mo124440r1(motionEvent);
        }
        return mo124437o1(motionEvent);
    }

    /* renamed from: q1 */
    public boolean mo124438q1(MotionEvent motionEvent) {
        if (!m124470X0(motionEvent) || !m131007J().isLongClickable() || this.f115118s != 2) {
            return false;
        }
        m124495B1(3, false);
        this.f115105A.run();
        return true;
    }

    /* renamed from: r1 */
    public boolean mo124440r1(MotionEvent motionEvent) {
        if (!m124470X0(motionEvent) || this.f115118s == 2) {
            return false;
        }
        m124495B1(2, false);
        return true;
    }

    /* renamed from: s1 */
    public void mo124441s1() {
        C26288m c26288m = this.f115110k;
        if (c26288m != null) {
            c26288m.setState(f115104G);
            this.f115110k.m135265x(this.f115106B[0] - m131023r().left, this.f115106B[1] - m131023r().top);
        }
        m131013W();
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: t0 */
    public void mo124514t0() {
        super.mo124514t0();
        C26293r c26293r = this.f115112m;
        if (c26293r != null) {
            m131028w().m116438g(new RunnableC23862w(c26293r), null, false);
        }
    }

    /* renamed from: t1 */
    public boolean m124515t1() {
        if (this.f115118s != 4) {
            m124495B1(4, true);
            return true;
        }
        return false;
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: u */
    public int mo124516u() {
        if (m131005I() > 0 && m131027v() > 0) {
            if (!m131015Y()) {
                return 1;
            }
            if (f115102E || m131026t().getTransformDrawing() != null || m131007J().mType != 4 || m124492n1()) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: u0 */
    public void mo124517u0() {
        super.mo124517u0();
        m124471X1();
        m124485g2();
        if (m124492n1()) {
            m124447C1();
            m124465U1();
        }
    }

    /* renamed from: u1 */
    public void mo124442u1() {
        C26288m c26288m = this.f115110k;
        if (c26288m != null) {
            c26288m.setState(f115103F);
        }
        m131013W();
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: v0 */
    public void mo124443v0() {
        super.mo124443v0();
        m124471X1();
        if (m124492n1()) {
            m124447C1();
            m124455L1();
        }
    }

    /* renamed from: x1 */
    public boolean m124518x1(int i11, String str, InterfaceC24286c interfaceC24286c) {
        if (m131014X()) {
            return m130999D().mo128870b(this, i11, str, interfaceC24286c);
        }
        return false;
    }

    /* renamed from: y1 */
    public boolean m124519y1(String str, InterfaceC24288e interfaceC24288e, int i11, boolean z11) {
        if (m131014X()) {
            return m130999D().mo128871c(this, str, interfaceC24288e, i11, z11);
        }
        return false;
    }

    /* renamed from: z1 */
    public boolean m124520z1(int i11, String str, InterfaceC24288e interfaceC24288e) {
        if (m131014X()) {
            return m130999D().mo128869a(this, i11, str, interfaceC24288e);
        }
        return false;
    }
}
