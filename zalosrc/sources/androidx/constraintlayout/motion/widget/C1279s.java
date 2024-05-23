package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C1276p;
import androidx.constraintlayout.widget.AbstractC1297e;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.C1293a;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007a1.C0022c;
import p007a1.C0023d;

/* renamed from: androidx.constraintlayout.motion.widget.s */
/* loaded from: classes2.dex */
public class C1279s {

    /* renamed from: a */
    private int f5284a;

    /* renamed from: e */
    int f5288e;

    /* renamed from: f */
    C1267g f5289f;

    /* renamed from: g */
    C1295c.a f5290g;

    /* renamed from: j */
    private int f5293j;

    /* renamed from: k */
    private String f5294k;

    /* renamed from: o */
    Context f5298o;

    /* renamed from: b */
    private int f5285b = -1;

    /* renamed from: c */
    private boolean f5286c = false;

    /* renamed from: d */
    private int f5287d = 0;

    /* renamed from: h */
    private int f5291h = -1;

    /* renamed from: i */
    private int f5292i = -1;

    /* renamed from: l */
    private int f5295l = 0;

    /* renamed from: m */
    private String f5296m = null;

    /* renamed from: n */
    private int f5297n = -1;

    /* renamed from: p */
    private int f5299p = -1;

    /* renamed from: q */
    private int f5300q = -1;

    /* renamed from: r */
    private int f5301r = -1;

    /* renamed from: s */
    private int f5302s = -1;

    /* renamed from: t */
    private int f5303t = -1;

    /* renamed from: u */
    private int f5304u = -1;

    /* renamed from: v */
    private int f5305v = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    /* loaded from: classes2.dex */
    public class a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C0022c f5306a;

        a(C0022c c0022c) {
            this.f5306a = c0022c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f5306a.mo60a(f11);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private final int f5308a;

        /* renamed from: b */
        private final int f5309b;

        /* renamed from: c */
        long f5310c;

        /* renamed from: d */
        C1273m f5311d;

        /* renamed from: e */
        int f5312e;

        /* renamed from: f */
        int f5313f;

        /* renamed from: h */
        C1280t f5315h;

        /* renamed from: i */
        Interpolator f5316i;

        /* renamed from: k */
        float f5318k;

        /* renamed from: l */
        float f5319l;

        /* renamed from: m */
        long f5320m;

        /* renamed from: o */
        boolean f5322o;

        /* renamed from: g */
        C0023d f5314g = new C0023d();

        /* renamed from: j */
        boolean f5317j = false;

        /* renamed from: n */
        Rect f5321n = new Rect();

        b(C1280t c1280t, C1273m c1273m, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
            float f11;
            this.f5322o = false;
            this.f5315h = c1280t;
            this.f5311d = c1273m;
            this.f5312e = i11;
            this.f5313f = i12;
            long nanoTime = System.nanoTime();
            this.f5310c = nanoTime;
            this.f5320m = nanoTime;
            this.f5315h.m6320b(this);
            this.f5316i = interpolator;
            this.f5308a = i14;
            this.f5309b = i15;
            if (i13 == 3) {
                this.f5322o = true;
            }
            if (i11 == 0) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f / i11;
            }
            this.f5319l = f11;
            m6313a();
        }

        /* renamed from: a */
        public void m6313a() {
            if (this.f5317j) {
                m6315c();
            } else {
                m6314b();
            }
        }

        /* renamed from: b */
        void m6314b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            long j11 = nanoTime - this.f5320m;
            this.f5320m = nanoTime;
            float f11 = this.f5318k + (((float) (j11 * 1.0E-6d)) * this.f5319l);
            this.f5318k = f11;
            if (f11 >= 1.0f) {
                this.f5318k = 1.0f;
            }
            Interpolator interpolator = this.f5316i;
            if (interpolator == null) {
                interpolation = this.f5318k;
            } else {
                interpolation = interpolator.getInterpolation(this.f5318k);
            }
            float f12 = interpolation;
            C1273m c1273m = this.f5311d;
            boolean m6160x = c1273m.m6160x(c1273m.f5156b, f12, nanoTime, this.f5314g);
            if (this.f5318k >= 1.0f) {
                if (this.f5308a != -1) {
                    this.f5311d.m6159v().setTag(this.f5308a, Long.valueOf(System.nanoTime()));
                }
                if (this.f5309b != -1) {
                    this.f5311d.m6159v().setTag(this.f5309b, null);
                }
                if (!this.f5322o) {
                    this.f5315h.m6324g(this);
                }
            }
            if (this.f5318k < 1.0f || m6160x) {
                this.f5315h.m6323e();
            }
        }

        /* renamed from: c */
        void m6315c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            long j11 = nanoTime - this.f5320m;
            this.f5320m = nanoTime;
            float f11 = this.f5318k - (((float) (j11 * 1.0E-6d)) * this.f5319l);
            this.f5318k = f11;
            if (f11 < 0.0f) {
                this.f5318k = 0.0f;
            }
            Interpolator interpolator = this.f5316i;
            if (interpolator == null) {
                interpolation = this.f5318k;
            } else {
                interpolation = interpolator.getInterpolation(this.f5318k);
            }
            float f12 = interpolation;
            C1273m c1273m = this.f5311d;
            boolean m6160x = c1273m.m6160x(c1273m.f5156b, f12, nanoTime, this.f5314g);
            if (this.f5318k <= 0.0f) {
                if (this.f5308a != -1) {
                    this.f5311d.m6159v().setTag(this.f5308a, Long.valueOf(System.nanoTime()));
                }
                if (this.f5309b != -1) {
                    this.f5311d.m6159v().setTag(this.f5309b, null);
                }
                this.f5315h.m6324g(this);
            }
            if (this.f5318k > 0.0f || m6160x) {
                this.f5315h.m6323e();
            }
        }

        /* renamed from: d */
        public void m6316d(int i11, float f11, float f12) {
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f5311d.m6159v().getHitRect(this.f5321n);
                    if (!this.f5321n.contains((int) f11, (int) f12) && !this.f5317j) {
                        m6317e(true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.f5317j) {
                m6317e(true);
            }
        }

        /* renamed from: e */
        void m6317e(boolean z11) {
            int i11;
            float f11;
            this.f5317j = z11;
            if (z11 && (i11 = this.f5313f) != -1) {
                if (i11 == 0) {
                    f11 = Float.MAX_VALUE;
                } else {
                    f11 = 1.0f / i11;
                }
                this.f5319l = f11;
            }
            this.f5315h.m6323e();
            this.f5320m = System.nanoTime();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0051. Please report as an issue. */
    public C1279s(Context context, XmlPullParser xmlPullParser) {
        char c11;
        this.f5298o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 != 0) {
                        if (c11 != 1) {
                            if (c11 != 2) {
                                if (c11 != 3 && c11 != 4) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(AbstractC1261a.m6057a());
                                    sb2.append(" unknown tag ");
                                    sb2.append(name);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(".xml:");
                                    sb3.append(xmlPullParser.getLineNumber());
                                } else {
                                    C1293a.m6403h(context, xmlPullParser, this.f5290g.f5645g);
                                }
                            } else {
                                this.f5290g = C1295c.m6435m(context, xmlPullParser);
                            }
                        } else {
                            this.f5289f = new C1267g(context, xmlPullParser);
                        }
                    } else {
                        m6301l(context, xmlPullParser);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: j */
    public /* synthetic */ void m6300j(View[] viewArr) {
        if (this.f5299p != -1) {
            for (View view : viewArr) {
                view.setTag(this.f5299p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f5300q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f5300q, null);
            }
        }
    }

    /* renamed from: l */
    private void m6301l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == AbstractC1298f.ViewTransition_android_id) {
                this.f5284a = obtainStyledAttributes.getResourceId(index, this.f5284a);
            } else if (index == AbstractC1298f.ViewTransition_motionTarget) {
                if (MotionLayout.f4934r1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f5293j);
                    this.f5293j = resourceId;
                    if (resourceId == -1) {
                        this.f5294k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f5294k = obtainStyledAttributes.getString(index);
                } else {
                    this.f5293j = obtainStyledAttributes.getResourceId(index, this.f5293j);
                }
            } else if (index == AbstractC1298f.ViewTransition_onStateTransition) {
                this.f5285b = obtainStyledAttributes.getInt(index, this.f5285b);
            } else if (index == AbstractC1298f.ViewTransition_transitionDisable) {
                this.f5286c = obtainStyledAttributes.getBoolean(index, this.f5286c);
            } else if (index == AbstractC1298f.ViewTransition_pathMotionArc) {
                this.f5287d = obtainStyledAttributes.getInt(index, this.f5287d);
            } else if (index == AbstractC1298f.ViewTransition_duration) {
                this.f5291h = obtainStyledAttributes.getInt(index, this.f5291h);
            } else if (index == AbstractC1298f.ViewTransition_upDuration) {
                this.f5292i = obtainStyledAttributes.getInt(index, this.f5292i);
            } else if (index == AbstractC1298f.ViewTransition_viewTransitionMode) {
                this.f5288e = obtainStyledAttributes.getInt(index, this.f5288e);
            } else if (index == AbstractC1298f.ViewTransition_motionInterpolator) {
                int i12 = obtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f5297n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f5295l = -2;
                    }
                } else if (i12 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f5296m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.f5297n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f5295l = -2;
                    } else {
                        this.f5295l = -1;
                    }
                } else {
                    this.f5295l = obtainStyledAttributes.getInteger(index, this.f5295l);
                }
            } else if (index == AbstractC1298f.ViewTransition_setsTag) {
                this.f5299p = obtainStyledAttributes.getResourceId(index, this.f5299p);
            } else if (index == AbstractC1298f.ViewTransition_clearsTag) {
                this.f5300q = obtainStyledAttributes.getResourceId(index, this.f5300q);
            } else if (index == AbstractC1298f.ViewTransition_ifTagSet) {
                this.f5301r = obtainStyledAttributes.getResourceId(index, this.f5301r);
            } else if (index == AbstractC1298f.ViewTransition_ifTagNotSet) {
                this.f5302s = obtainStyledAttributes.getResourceId(index, this.f5302s);
            } else if (index == AbstractC1298f.ViewTransition_SharedValueId) {
                this.f5304u = obtainStyledAttributes.getResourceId(index, this.f5304u);
            } else if (index == AbstractC1298f.ViewTransition_SharedValue) {
                this.f5303t = obtainStyledAttributes.getInteger(index, this.f5303t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: n */
    private void m6302n(C1276p.b bVar, View view) {
        int i11 = this.f5291h;
        if (i11 != -1) {
            bVar.m6260E(i11);
        }
        bVar.m6263H(this.f5287d);
        bVar.m6261F(this.f5295l, this.f5296m, this.f5297n);
        int id2 = view.getId();
        C1267g c1267g = this.f5289f;
        if (c1267g != null) {
            ArrayList m6112d = c1267g.m6112d(-1);
            C1267g c1267g2 = new C1267g();
            Iterator it = m6112d.iterator();
            while (it.hasNext()) {
                c1267g2.m6111c(((AbstractC1264d) it.next()).clone().m6072i(id2));
            }
            bVar.m6264t(c1267g2);
        }
    }

    /* renamed from: b */
    void m6303b(C1280t c1280t, MotionLayout motionLayout, View view) {
        C1273m c1273m = new C1273m(view);
        c1273m.m6132B(view);
        this.f5289f.m6109a(c1273m);
        c1273m.m6139I(motionLayout.getWidth(), motionLayout.getHeight(), this.f5291h, System.nanoTime());
        new b(c1280t, c1273m, this.f5291h, this.f5292i, this.f5285b, m6307f(motionLayout.getContext()), this.f5299p, this.f5300q);
    }

    /* renamed from: c */
    public void m6304c(C1280t c1280t, MotionLayout motionLayout, int i11, C1295c c1295c, View... viewArr) {
        if (this.f5286c) {
            return;
        }
        int i12 = this.f5288e;
        if (i12 == 2) {
            m6303b(c1280t, motionLayout, viewArr[0]);
            return;
        }
        if (i12 == 1) {
            for (int i13 : motionLayout.getConstraintSetIds()) {
                if (i13 != i11) {
                    C1295c m6008n0 = motionLayout.m6008n0(i13);
                    for (View view : viewArr) {
                        C1295c.a m6460w = m6008n0.m6460w(view.getId());
                        C1295c.a aVar = this.f5290g;
                        if (aVar != null) {
                            aVar.m6470d(m6460w);
                            m6460w.f5645g.putAll(this.f5290g.f5645g);
                        }
                    }
                }
            }
        }
        C1295c c1295c2 = new C1295c();
        c1295c2.m6457q(c1295c);
        for (View view2 : viewArr) {
            C1295c.a m6460w2 = c1295c2.m6460w(view2.getId());
            C1295c.a aVar2 = this.f5290g;
            if (aVar2 != null) {
                aVar2.m6470d(m6460w2);
                m6460w2.f5645g.putAll(this.f5290g.f5645g);
            }
        }
        motionLayout.m6001L0(i11, c1295c2);
        motionLayout.m6001L0(AbstractC1297e.view_transition, c1295c);
        motionLayout.m6018z0(AbstractC1297e.view_transition, -1, -1);
        C1276p.b bVar = new C1276p.b(-1, motionLayout.f4948N, AbstractC1297e.view_transition, i11);
        for (View view3 : viewArr) {
            m6302n(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.m5995F0(new Runnable() { // from class: androidx.constraintlayout.motion.widget.r

            /* renamed from: q */
            public final /* synthetic */ View[] f5283q;

            public /* synthetic */ RunnableC1278r(View[] viewArr2) {
                r2 = viewArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1279s.this.m6300j(r2);
            }
        });
    }

    /* renamed from: d */
    boolean m6305d(View view) {
        boolean z11;
        boolean z12;
        int i11 = this.f5301r;
        if (i11 == -1 || view.getTag(i11) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = this.f5302s;
        if (i12 == -1 || view.getTag(i12) == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int m6306e() {
        return this.f5284a;
    }

    /* renamed from: f */
    Interpolator m6307f(Context context) {
        int i11 = this.f5295l;
        if (i11 != -2) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    if (i11 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
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
            return new a(C0022c.m59c(this.f5296m));
        }
        return AnimationUtils.loadInterpolator(context, this.f5297n);
    }

    /* renamed from: g */
    public int m6308g() {
        return this.f5303t;
    }

    /* renamed from: h */
    public int m6309h() {
        return this.f5304u;
    }

    /* renamed from: i */
    public int m6310i() {
        return this.f5285b;
    }

    /* renamed from: k */
    public boolean m6311k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f5293j == -1 && this.f5294k == null) || !m6305d(view)) {
            return false;
        }
        if (view.getId() == this.f5293j) {
            return true;
        }
        if (this.f5294k == null || !(view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) || (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f5518c0) == null || !str.matches(this.f5294k)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m6312m(int i11) {
        int i12 = this.f5285b;
        return i12 == 1 ? i11 == 0 : i12 == 2 ? i11 == 1 : i12 == 3 && i11 == 0;
    }

    public String toString() {
        return "ViewTransition(" + AbstractC1261a.m6059c(this.f5298o, this.f5284a) + ")";
    }
}
