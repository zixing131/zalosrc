package com.zing.zalo.p077ui.custom.floating;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.AbstractC21705b;
import kg.C21709f;
import kg.C21711h;
import kg.C21715l;
import kg.InterfaceC21713j;
import kg.InterfaceC21716m;

/* loaded from: classes5.dex */
public class FloatingController implements InterfaceC21713j, InterfaceC21716m {

    /* renamed from: A */
    private float f61760A;

    /* renamed from: B */
    private float f61761B;

    /* renamed from: C */
    private float f61762C;

    /* renamed from: D */
    private boolean f61763D;

    /* renamed from: E */
    private final InterpolateHelper f61764E;

    /* renamed from: F */
    private boolean f61765F;

    /* renamed from: G */
    private final Context f61766G;

    /* renamed from: I */
    private final InterfaceC11856a f61768I;

    /* renamed from: p */
    C21709f f61770p;

    /* renamed from: q */
    C21709f f61771q;

    /* renamed from: r */
    private C21715l f61772r;

    /* renamed from: s */
    public int f61773s;

    /* renamed from: x */
    private float f61778x;

    /* renamed from: y */
    private float f61779y;

    /* renamed from: z */
    private boolean f61780z;

    /* renamed from: t */
    private final C21711h f61774t = C21711h.m112058a(50.0d, 6.0d);

    /* renamed from: u */
    public int f61775u = 0;

    /* renamed from: v */
    public int f61776v = 0;

    /* renamed from: w */
    private boolean f61777w = false;

    /* renamed from: H */
    private final AtomicBoolean f61767H = new AtomicBoolean(false);

    /* renamed from: J */
    private final RectF f61769J = new RectF();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class InterpolateHelper {

        /* renamed from: a */
        CheckPoint f61781a = new CheckPoint(0.0f, 0.0f);

        /* renamed from: b */
        List f61782b = new LinkedList();

        /* renamed from: c */
        CheckPoint f61783c = new CheckPoint(0.0f, 0.0f);

        /* renamed from: d */
        private final long f61784d;

        /* renamed from: e */
        private final int f61785e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static class CheckPoint extends PointF {

            /* renamed from: p */
            long f61786p;

            CheckPoint(float f11, float f12) {
                super(f11, f12);
                this.f61786p = System.nanoTime();
            }
        }

        InterpolateHelper(int i11) {
            this.f61785e = i11;
            this.f61784d = i11 * 1000000;
        }

        /* renamed from: a */
        void m65904a(MotionEvent motionEvent) {
        }

        /* renamed from: b */
        PointF m65905b(CheckPoint checkPoint, CheckPoint checkPoint2) {
            long j11;
            float f11;
            float f12;
            long j12 = checkPoint2.f61786p;
            long j13 = checkPoint.f61786p;
            if (j12 > j13) {
                j11 = j12 - j13;
            } else {
                j11 = j13 - j12;
            }
            float f13 = ((PointF) checkPoint).x;
            float f14 = ((PointF) checkPoint2).x;
            if (f13 > f14) {
                f11 = f13 - f14;
            } else {
                f11 = f14 - f13;
            }
            float f15 = ((PointF) checkPoint).y;
            float f16 = ((PointF) checkPoint2).y;
            if (f15 > f16) {
                f12 = f15 - f16;
            } else {
                f12 = f16 - f15;
            }
            long j14 = this.f61784d;
            float f17 = (float) j11;
            float f18 = (f11 * ((float) j14)) / f17;
            float f19 = (f12 * ((float) j14)) / f17;
            PointF pointF = new PointF(f18, f19);
            if (((PointF) checkPoint2).x < ((PointF) checkPoint).x) {
                pointF.x = -f18;
            }
            if (((PointF) checkPoint2).y < ((PointF) checkPoint).y) {
                pointF.y = -f19;
            }
            return pointF;
        }

        /* renamed from: c */
        void m65906c() {
            CheckPoint checkPoint = this.f61781a;
            ((PointF) checkPoint).x = 0.0f;
            ((PointF) checkPoint).y = 0.0f;
            checkPoint.f61786p = 0L;
            this.f61782b.clear();
            CheckPoint checkPoint2 = this.f61783c;
            ((PointF) checkPoint2).x = 0.0f;
            ((PointF) checkPoint2).y = 0.0f;
            checkPoint2.f61786p = 0L;
        }

        /* renamed from: d */
        PointF m65907d() {
            CheckPoint checkPoint;
            CheckPoint checkPoint2;
            int size = this.f61782b.size();
            if (size == 0) {
                checkPoint = this.f61783c;
                checkPoint2 = this.f61781a;
            } else if (size == 1) {
                checkPoint = (CheckPoint) this.f61782b.get(0);
                checkPoint2 = this.f61781a;
            } else {
                CheckPoint checkPoint3 = (CheckPoint) this.f61782b.get(size - 2);
                checkPoint = (CheckPoint) this.f61782b.get(size - 1);
                checkPoint2 = checkPoint3;
            }
            return m65905b(checkPoint2, checkPoint);
        }

        /* renamed from: e */
        void m65908e(float f11, float f12) {
            CheckPoint checkPoint = this.f61781a;
            ((PointF) checkPoint).x = f11;
            ((PointF) checkPoint).y = f12;
            checkPoint.f61786p = System.nanoTime();
        }

        /* renamed from: f */
        void m65909f(float f11, float f12) {
            this.f61782b.add(new CheckPoint(f11, f12));
        }

        /* renamed from: g */
        void m65910g(float f11, float f12) {
            CheckPoint checkPoint = this.f61783c;
            ((PointF) checkPoint).x = f11;
            ((PointF) checkPoint).y = f12;
            checkPoint.f61786p = System.nanoTime();
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.floating.FloatingController$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11856a {
        /* renamed from: A */
        void mo65911A(C21709f c21709f, C21709f c21709f2);

        /* renamed from: d */
        void mo65912d(C21709f c21709f, C21709f c21709f2);

        float getX();

        float getY();

        /* renamed from: x */
        PointF mo65913x(float f11, float f12, MotionEvent motionEvent);

        /* renamed from: z */
        PointF mo65914z(PointF pointF);
    }

    public FloatingController(Context context, InterfaceC11856a interfaceC11856a, int i11) {
        this.f61773s = 1000;
        this.f61766G = context;
        m65885j();
        this.f61765F = true;
        this.f61773s = i11;
        this.f61768I = interfaceC11856a;
        this.f61764E = new InterpolateHelper(i11);
    }

    /* renamed from: j */
    private void m65885j() {
        this.f61762C = ViewConfiguration.get(this.f61766G).getScaledTouchSlop();
        C21715l m112062k = C21715l.m112062k();
        this.f61772r = m112062k;
        this.f61770p = m112062k.m112019d();
        this.f61771q = this.f61772r.m112019d();
        this.f61770p.m112048u(this.f61774t);
        this.f61771q.m112048u(this.f61774t);
    }

    /* renamed from: o */
    private PointF m65886o(float f11, float f12, MotionEvent motionEvent) {
        PointF pointF;
        InterfaceC11856a interfaceC11856a = this.f61768I;
        if (interfaceC11856a != null) {
            pointF = interfaceC11856a.mo65913x(f11, f12, motionEvent);
        } else {
            pointF = null;
        }
        if (pointF == null) {
            return new PointF(f11, f12);
        }
        return pointF;
    }

    /* renamed from: p */
    private void m65887p() {
        this.f61775u = 3;
        InterfaceC11856a interfaceC11856a = this.f61768I;
        if (interfaceC11856a != null) {
            interfaceC11856a.mo65911A(this.f61770p, this.f61771q);
        }
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
        if (!this.f61767H.get()) {
            return;
        }
        InterfaceC11856a interfaceC11856a = this.f61768I;
        if (interfaceC11856a != null) {
            interfaceC11856a.mo65912d(this.f61770p, this.f61771q);
        }
        float m112038j = (float) this.f61770p.m112038j();
        float m112038j2 = (float) this.f61771q.m112038j();
        if (m112038j == 0.0f && m112038j2 == 0.0f) {
            this.f61775u = 0;
        }
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: b */
    public void mo39828b(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: c */
    public void mo39829c(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21716m
    /* renamed from: d */
    public void mo65888d(AbstractC21705b abstractC21705b) {
        if (this.f61775u == 1) {
            m65887p();
        }
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: e */
    public void mo39830e(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21716m
    /* renamed from: f */
    public void mo65889f(AbstractC21705b abstractC21705b) {
    }

    /* renamed from: g */
    public int m65890g() {
        return this.f61775u;
    }

    /* renamed from: h */
    public float m65891h() {
        return (float) this.f61770p.m112033d();
    }

    /* renamed from: i */
    public float m65892i() {
        return (float) this.f61771q.m112033d();
    }

    /* renamed from: k */
    public boolean m65893k() {
        return this.f61763D;
    }

    /* renamed from: l */
    public void m65894l() {
        C21715l c21715l = this.f61772r;
        if (c21715l != null) {
            c21715l.m112025j();
        }
        C21709f c21709f = this.f61770p;
        if (c21709f != null) {
            c21709f.m112041n();
        }
        C21709f c21709f2 = this.f61771q;
        if (c21709f2 != null) {
            c21709f2.m112041n();
        }
        this.f61767H.set(false);
    }

    /* renamed from: m */
    public void m65895m() {
        if (this.f61767H.get()) {
            return;
        }
        this.f61767H.set(true);
        C21715l c21715l = this.f61772r;
        if (c21715l != null) {
            c21715l.m112017b(this);
        }
        C21709f c21709f = this.f61770p;
        if (c21709f != null) {
            c21709f.m112030a(this);
        }
        C21709f c21709f2 = this.f61771q;
        if (c21709f2 != null) {
            c21709f2.m112030a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:            if (r3 != 3) goto L42;     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m65896n(MotionEvent motionEvent) {
        PointF pointF;
        boolean z11 = false;
        if (this.f61768I == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f61780z) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        if (!this.f61763D) {
                            float f11 = x11 - this.f61760A;
                            float f12 = y11 - this.f61761B;
                            if (Math.abs(f11) > this.f61762C || Math.abs(f12) > this.f61762C) {
                                z11 = true;
                            }
                            this.f61763D = z11;
                        }
                        if (this.f61763D) {
                            this.f61777w = true;
                            PointF m65886o = m65886o((float) (this.f61770p.m112033d() - (this.f61778x - rawX)), (float) (this.f61771q.m112033d() - (this.f61779y - rawY)), motionEvent);
                            this.f61770p.m112044q(m65886o.x).m112043p();
                            this.f61771q.m112044q(m65886o.y).m112043p();
                            this.f61760A = x11;
                            this.f61761B = y11;
                            this.f61764E.m65909f(this.f61768I.getX(), this.f61768I.getY());
                            this.f61764E.m65904a(motionEvent);
                        }
                    }
                }
            }
            if (this.f61780z) {
                this.f61775u = 1;
                this.f61780z = false;
                if (this.f61763D) {
                    this.f61764E.m65910g(this.f61768I.getX(), this.f61768I.getY());
                    this.f61764E.m65904a(motionEvent);
                    pointF = this.f61764E.m65907d();
                } else {
                    pointF = null;
                }
                if (this.f61765F) {
                    PointF mo65914z = this.f61768I.mo65914z(pointF);
                    if (mo65914z == null) {
                        mo65914z = new PointF(0.0f, 0.0f);
                    }
                    this.f61770p.m112049v(mo65914z.x);
                    this.f61771q.m112049v(mo65914z.y);
                }
                this.f61764E.m65906c();
            }
        } else {
            this.f61778x = rawX;
            this.f61779y = rawY;
            this.f61780z = true;
            this.f61777w = false;
            this.f61760A = motionEvent.getX();
            this.f61761B = motionEvent.getY();
            this.f61763D = false;
            this.f61764E.m65906c();
            this.f61764E.m65908e(this.f61768I.getX(), this.f61768I.getY());
            this.f61764E.m65904a(motionEvent);
        }
        this.f61778x = rawX;
        this.f61779y = rawY;
        return this.f61777w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0010, code lost:            if (r6 > r1) goto L4;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m65897q(double d11, double d12) {
        RectF rectF = this.f61769J;
        float f11 = rectF.left;
        if (d11 >= f11) {
            f11 = rectF.right;
        }
        d11 = f11;
        float f12 = rectF.top;
        if (d12 < f12) {
            d12 = f12;
        } else {
            float f13 = rectF.bottom;
            if (d12 > f13) {
                d12 = f13;
            }
        }
        this.f61770p.m112046s(d11);
        this.f61771q.m112046s(d12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0010, code lost:            if (r6 > r1) goto L4;     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m65898r(double d11, double d12) {
        RectF rectF = this.f61769J;
        float f11 = rectF.left;
        if (d11 >= f11) {
            f11 = rectF.right;
        }
        d11 = f11;
        float f12 = rectF.top;
        if (d12 < f12) {
            d12 = f12;
        } else {
            float f13 = rectF.bottom;
            if (d12 > f13) {
                d12 = f13;
            }
        }
        this.f61770p.m112050w(d11);
        this.f61771q.m112050w(d12);
    }

    /* renamed from: s */
    public void m65899s(int i11) {
        this.f61775u = i11;
        if (i11 == 2) {
            this.f61776v = 3;
        } else {
            this.f61776v = 0;
        }
    }

    /* renamed from: t */
    public void m65900t(float f11, float f12, float f13, float f14) {
        this.f61769J.set(f11, f12, f13, f14);
    }

    /* renamed from: u */
    public void m65901u(boolean z11) {
        this.f61765F = z11;
    }

    /* renamed from: v */
    public void m65902v(float f11, float f12) {
        this.f61770p.m112044q(f11).m112043p();
        this.f61771q.m112044q(f12).m112043p();
    }

    /* renamed from: w */
    public void m65903w(C21711h c21711h) {
        this.f61770p.m112048u(c21711h);
        this.f61771q.m112048u(c21711h);
    }
}
