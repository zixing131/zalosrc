package p516t3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p516t3.AbstractC26471e;
import p566v3.C27498f;
import p566v3.C27501i;
import p566v3.C27502j;
import p566v3.C27506n;
import p566v3.C27508p;
import p596w3.C28705c;
import p596w3.C28706d;
import p596w3.C28709g;
import p596w3.C28710h;
import p596w3.C28711i;
import p596w3.C28712j;

/* renamed from: t3.c */
/* loaded from: classes2.dex */
public class C26469c extends Drawable implements AbstractC26471e.b {

    /* renamed from: A */
    float f125670A;

    /* renamed from: B */
    float f125671B;

    /* renamed from: C */
    Map f125672C;

    /* renamed from: D */
    boolean f125673D;

    /* renamed from: E */
    boolean f125674E;

    /* renamed from: F */
    C27501i.a f125675F;

    /* renamed from: G */
    Rect f125676G;

    /* renamed from: H */
    b f125677H;

    /* renamed from: p */
    final C27508p f125678p;

    /* renamed from: q */
    final Paint f125679q;

    /* renamed from: r */
    final List f125680r;

    /* renamed from: s */
    final SparseArray f125681s;

    /* renamed from: t */
    final AbstractC26471e f125682t;

    /* renamed from: u */
    final Matrix f125683u;

    /* renamed from: v */
    final Matrix f125684v;

    /* renamed from: w */
    final Matrix f125685w;

    /* renamed from: x */
    int f125686x;

    /* renamed from: y */
    int f125687y;

    /* renamed from: z */
    float f125688z;

    /* renamed from: t3.c$a */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a */
        final C27502j f125689a;

        /* renamed from: b */
        final C26467a f125690b;

        /* renamed from: c */
        final C26467a f125691c;

        /* renamed from: d */
        final C28712j.a f125692d;

        /* renamed from: e */
        final C28711i.a f125693e;

        /* renamed from: f */
        final C28705c.a f125694f;

        /* renamed from: g */
        final C28709g.a f125695g;

        /* renamed from: h */
        final Matrix f125696h;

        /* renamed from: i */
        final float[] f125697i = new float[9];

        /* renamed from: j */
        final Matrix f125698j;

        /* renamed from: k */
        boolean f125699k;

        /* renamed from: l */
        Shader[] f125700l;

        /* renamed from: m */
        Shader f125701m;

        public a(C27502j c27502j) {
            this.f125689a = c27502j;
            if (m136433n()) {
                this.f125690b = null;
                this.f125692d = null;
                this.f125693e = null;
                this.f125694f = null;
                this.f125696h = new Matrix();
            } else {
                this.f125690b = new C26467a();
                this.f125692d = new C28712j.a();
                this.f125693e = new C28711i.a();
                this.f125694f = new C28705c.a();
                this.f125696h = C26469c.this.f125683u;
            }
            this.f125695g = new C28709g.a();
            if (c27502j.m140618d() != null) {
                this.f125691c = new C26467a();
                this.f125698j = new Matrix();
            } else {
                this.f125691c = null;
                this.f125698j = null;
            }
        }

        /* renamed from: a */
        float m136420a(Matrix matrix) {
            matrix.getValues(this.f125697i);
            return (Math.abs(this.f125697i[0]) + Math.abs(this.f125697i[4])) / 2.0f;
        }

        /* renamed from: b */
        public int m136421b() {
            return Math.round(m136428i() * 255.0f);
        }

        /* renamed from: c */
        public final Bitmap m136422c() {
            Map map = C26469c.this.f125672C;
            if (map == null) {
                return null;
            }
            return (Bitmap) map.get(this.f125689a.m140616b());
        }

        /* renamed from: d */
        public C26467a m136423d() {
            return this.f125691c;
        }

        /* renamed from: e */
        public C26467a m136424e() {
            return this.f125690b;
        }

        /* renamed from: f */
        public Shader m136425f() {
            return this.f125701m;
        }

        /* renamed from: g */
        public int m136426g() {
            C28705c.a aVar = this.f125694f;
            if (aVar != null && aVar.m143761b()) {
                return (int) this.f125694f.m143760a();
            }
            return this.f125689a.m140619e();
        }

        /* renamed from: h */
        public Shader m136427h(float f11) {
            if (this.f125700l == null) {
                return null;
            }
            float m140651f = f11 / C26469c.this.f125678p.m140651f();
            return this.f125700l[(int) (m140651f * (r0.length - 1))];
        }

        /* renamed from: i */
        public float m136428i() {
            return this.f125695g.m143782a() / 100.0f;
        }

        /* renamed from: j */
        public int m136429j() {
            C28711i.a aVar = this.f125693e;
            if (aVar != null && aVar.m143789b()) {
                return (int) this.f125693e.m143788a();
            }
            return this.f125689a.m140624j();
        }

        /* renamed from: k */
        public Paint.Cap m136430k() {
            return this.f125689a.m140625k();
        }

        /* renamed from: l */
        public float m136431l() {
            C28712j.a aVar = this.f125692d;
            if (aVar != null) {
                return aVar.m143794b();
            }
            return 0.0f;
        }

        /* renamed from: m */
        public Matrix m136432m() {
            Matrix matrix = this.f125696h;
            if (matrix == C26469c.this.f125683u) {
                return null;
            }
            return matrix;
        }

        /* renamed from: n */
        boolean m136433n() {
            if (m136422c() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        public boolean m136434o() {
            return this.f125699k;
        }

        /* renamed from: p */
        void m136435p(C27502j c27502j) {
            if (this.f125700l != null) {
                return;
            }
            int m140652g = C26469c.this.f125678p.m140652g();
            float m140651f = C26469c.this.f125678p.m140651f();
            int round = Math.round((30.0f * m140651f) / m140652g);
            this.f125700l = new LinearGradient[round + 1];
            C28706d.a aVar = new C28706d.a();
            C27506n m140634a = c27502j.m140617c().m140634a();
            for (int i11 = 0; i11 < round; i11++) {
                float f11 = (i11 / round) * m140651f;
                m140634a.m140641b().m143779a(f11, aVar);
                m140634a.m140640a().m143779a(f11, aVar);
                this.f125700l[i11] = new LinearGradient(0.0f, 0.0f, 0.0f, C26469c.this.f125678p.m140649d()[1], aVar.m143767b(), aVar.m143766a(), Shader.TileMode.CLAMP);
            }
        }

        /* renamed from: q */
        public void m136436q(float f11) {
            if (f11 >= this.f125689a.m140620f() && f11 <= this.f125689a.m140627m()) {
                this.f125699k = true;
                this.f125689a.m140628n(this.f125696h, f11);
                Matrix matrix = (Matrix) C26469c.this.f125681s.get(this.f125689a.m140615a());
                if (matrix != null && !matrix.isIdentity()) {
                    this.f125696h.postConcat(matrix);
                }
                this.f125689a.m140630p(this.f125695g, f11);
                C28710h m140623i = this.f125689a.m140623i();
                if (!m136433n() && m140623i != null) {
                    this.f125690b.m136396n();
                    m140623i.m143779a(f11, this.f125690b);
                    this.f125690b.m136397o(this.f125696h);
                    this.f125689a.m140632r(this.f125692d, f11);
                    this.f125689a.m140631q(this.f125693e, f11);
                    this.f125689a.m140629o(this.f125694f, f11);
                    this.f125692d.m143793a(m136420a(this.f125696h));
                    if (this.f125689a.m140617c() != null) {
                        m136435p(this.f125689a);
                    }
                    this.f125701m = m136427h(f11);
                    if (this.f125689a.m140618d() != null) {
                        this.f125689a.m140618d().m140628n(this.f125698j, f11);
                        this.f125691c.m136396n();
                        this.f125689a.m140618d().m140623i().m143779a(f11, this.f125691c);
                        this.f125691c.m136397o(this.f125698j);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f125699k = false;
        }
    }

    /* renamed from: t3.c$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo136437a();
    }

    public C26469c(C27508p c27508p, int i11) {
        Paint paint = new Paint(1);
        this.f125679q = paint;
        this.f125674E = false;
        this.f125675F = null;
        this.f125678p = c27508p;
        this.f125672C = c27508p.m140648c();
        this.f125683u = new Matrix();
        this.f125684v = new Matrix();
        this.f125685w = new Matrix();
        this.f125682t = AbstractC26471e.m136438c(this, c27508p);
        paint.setStrokeCap(Paint.Cap.ROUND);
        ArrayList arrayList = new ArrayList();
        int size = c27508p.m140650e().size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new a((C27502j) this.f125678p.m140650e().get(i12)));
        }
        this.f125680r = Collections.unmodifiableList(arrayList);
        this.f125681s = new SparseArray();
        List m140647b = this.f125678p.m140647b();
        int size2 = m140647b.size();
        for (int i13 = 0; i13 < size2; i13++) {
            this.f125681s.put(((C27498f) m140647b.get(i13)).m140608c(), new Matrix());
        }
        m136417s(i11);
        this.f125673D = false;
        this.f125676G = new Rect();
    }

    /* renamed from: f */
    private void m136399f(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = i13 - i11;
        this.f125686x = i15;
        this.f125687y = i14 - i12;
        this.f125688z = Math.min(i15 / this.f125678p.m140649d()[0], this.f125687y / this.f125678p.m140649d()[1]);
        m136404e(1.0f, 1.0f, EnumC26468b.UP, z11);
        if (!this.f125674E) {
            m136415q(0.0f);
        }
    }

    @Override // p516t3.AbstractC26471e.b
    /* renamed from: a */
    public void mo136400a(float f11) {
        m136415q(f11);
        m136408j((int) f11);
        invalidateSelf();
    }

    /* renamed from: b */
    void m136401b(Canvas canvas, C26467a c26467a, Region.Op op2) {
        c26467a.m136397o(this.f125684v);
        canvas.clipPath(c26467a.m136387d(), op2);
        c26467a.m136397o(this.f125685w);
    }

    /* renamed from: c */
    void m136402c(Canvas canvas, C26467a c26467a, Paint paint) {
        c26467a.m136397o(this.f125684v);
        canvas.drawPath(c26467a.m136387d(), paint);
        c26467a.m136397o(this.f125685w);
    }

    /* renamed from: d */
    void m136403d(Canvas canvas, C26467a c26467a, Paint paint) {
        canvas.concat(this.f125684v);
        canvas.drawPath(c26467a.m136387d(), paint);
        canvas.concat(this.f125685w);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.translate(bounds.left, bounds.top);
        if (this.f125673D) {
            canvas.clipRect(0.0f, 0.0f, this.f125678p.m140649d()[0] * this.f125688z * this.f125671B * this.f125670A, this.f125678p.m140649d()[1] * this.f125688z * this.f125671B * this.f125670A);
        }
        int size = this.f125680r.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) this.f125680r.get(i11);
            if (aVar.m136434o()) {
                this.f125679q.setShader(null);
                this.f125679q.setAlpha(aVar.m136421b());
                Bitmap m136422c = aVar.m136422c();
                Matrix m136432m = aVar.m136432m();
                if (m136422c != null && m136432m != null) {
                    canvas.save();
                    canvas.concat(this.f125684v);
                    canvas.drawBitmap(m136422c, m136432m, this.f125679q);
                    canvas.restore();
                } else {
                    C26467a m136424e = aVar.m136424e();
                    if (m136424e != null && !m136424e.m136388e()) {
                        if (aVar.m136423d() != null) {
                            canvas.save();
                            m136401b(canvas, aVar.m136423d(), Region.Op.INTERSECT);
                        }
                        this.f125679q.setStrokeCap(aVar.m136430k());
                        if (aVar.m136426g() != 0) {
                            this.f125679q.setStyle(Paint.Style.FILL);
                            if (aVar.m136425f() == null) {
                                this.f125679q.setColor(aVar.m136426g());
                                this.f125679q.setAlpha(aVar.m136421b());
                                m136402c(canvas, m136424e, this.f125679q);
                            } else {
                                this.f125679q.setShader(aVar.m136425f());
                                m136403d(canvas, m136424e, this.f125679q);
                            }
                        }
                        if (aVar.m136429j() != 0 && aVar.m136431l() > 0.0f) {
                            this.f125679q.setColor(aVar.m136429j());
                            this.f125679q.setStyle(Paint.Style.STROKE);
                            this.f125679q.setStrokeWidth(aVar.m136431l() * this.f125688z * this.f125670A * this.f125671B);
                            m136402c(canvas, m136424e, this.f125679q);
                        }
                        if (aVar.m136423d() != null) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
        canvas.translate(-bounds.left, -bounds.top);
    }

    /* renamed from: e */
    void m136404e(float f11, float f12, EnumC26468b enumC26468b, boolean z11) {
        float f13;
        if (this.f125670A == f11 && this.f125671B == f12 && !z11) {
            return;
        }
        Matrix matrix = this.f125684v;
        float f14 = this.f125688z;
        matrix.setScale(f14, f14);
        if (f11 == 1.0f && f12 == 1.0f) {
            this.f125670A = 1.0f;
            this.f125671B = 1.0f;
            this.f125684v.invert(this.f125685w);
            return;
        }
        if (enumC26468b == EnumC26468b.UP) {
            f13 = this.f125687y;
        } else {
            f13 = 0.0f;
        }
        this.f125684v.postScale(f11, f11, this.f125686x / 2, this.f125687y / 2);
        this.f125684v.postScale(f12, f12, this.f125686x / 2, f13);
        this.f125670A = f11;
        this.f125671B = f12;
        this.f125684v.invert(this.f125685w);
    }

    /* renamed from: g */
    public void m136405g(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.translate(bounds.left, bounds.top);
        if (this.f125673D) {
            canvas.clipRect(0.0f, 0.0f, this.f125678p.m140649d()[0] * this.f125688z * this.f125671B * this.f125670A, this.f125678p.m140649d()[1] * this.f125688z * this.f125671B * this.f125670A);
        }
        if (!this.f125679q.isFilterBitmap()) {
            this.f125679q.setFilterBitmap(true);
        }
        int size = this.f125680r.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) this.f125680r.get(i11);
            if (aVar.m136434o()) {
                this.f125679q.setShader(null);
                this.f125679q.setAlpha(aVar.m136421b());
                Bitmap m136422c = aVar.m136422c();
                Matrix m136432m = aVar.m136432m();
                if (m136422c != null && m136432m != null) {
                    canvas.save();
                    Rect bounds2 = getBounds();
                    this.f125676G.set(0, 0, m136422c.getWidth(), m136422c.getHeight());
                    canvas.drawBitmap(m136422c, this.f125676G, bounds2, this.f125679q);
                    canvas.restore();
                } else {
                    C26467a m136424e = aVar.m136424e();
                    if (m136424e != null && !m136424e.m136388e()) {
                        if (aVar.m136423d() != null) {
                            canvas.save();
                            m136401b(canvas, aVar.m136423d(), Region.Op.INTERSECT);
                        }
                        this.f125679q.setStrokeCap(aVar.m136430k());
                        if (aVar.m136426g() != 0) {
                            this.f125679q.setStyle(Paint.Style.FILL);
                            if (aVar.m136425f() == null) {
                                this.f125679q.setColor(aVar.m136426g());
                                this.f125679q.setAlpha(aVar.m136421b());
                                m136402c(canvas, m136424e, this.f125679q);
                            } else {
                                this.f125679q.setShader(aVar.m136425f());
                                m136403d(canvas, m136424e, this.f125679q);
                            }
                        }
                        if (aVar.m136429j() != 0 && aVar.m136431l() > 0.0f) {
                            this.f125679q.setColor(aVar.m136429j());
                            this.f125679q.setStyle(Paint.Style.STROKE);
                            this.f125679q.setStrokeWidth(aVar.m136431l() * this.f125688z * this.f125670A * this.f125671B);
                            m136402c(canvas, m136424e, this.f125679q);
                        }
                        if (aVar.m136423d() != null) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
        canvas.translate(-bounds.left, -bounds.top);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f125687y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f125686x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* renamed from: h */
    public C27508p m136406h() {
        return this.f125678p;
    }

    /* renamed from: i */
    public boolean m136407i() {
        return this.f125682t.m136441d();
    }

    /* renamed from: j */
    void m136408j(int i11) {
        C27501i.a aVar;
        int size = this.f125680r.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((a) this.f125680r.get(i12)).f125689a instanceof C27501i) {
                C27501i c27501i = (C27501i) ((a) this.f125680r.get(i12)).f125689a;
                if (c27501i.m140613s(i11) && (aVar = this.f125675F) != null) {
                    aVar.mo40013a(c27501i.m140622h());
                }
            }
        }
    }

    /* renamed from: k */
    public void m136409k() {
        this.f125682t.m136442e();
    }

    /* renamed from: l */
    public void m136410l() {
        int size = this.f125680r.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f125680r.get(i11)).f125689a instanceof C27501i) {
                ((C27501i) ((a) this.f125680r.get(i11)).f125689a).m140614t();
            }
        }
    }

    /* renamed from: m */
    public void m136411m(b bVar) {
        this.f125677H = bVar;
    }

    /* renamed from: n */
    public void m136412n(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        m136399f(i11, i12, i13, i14, true);
    }

    /* renamed from: o */
    public void m136413o(float f11, float f12, EnumC26468b enumC26468b) {
        m136404e(f11, f12, enumC26468b, false);
    }

    @Override // p516t3.AbstractC26471e.b
    public void onStop() {
        b bVar = this.f125677H;
        if (bVar == null) {
            return;
        }
        bVar.mo136437a();
    }

    /* renamed from: p */
    public void m136414p(boolean z11) {
        this.f125679q.setFilterBitmap(z11);
    }

    /* renamed from: q */
    public void m136415q(float f11) {
        this.f125674E = true;
        this.f125678p.m140653h(this.f125681s, f11);
        int size = this.f125680r.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((a) this.f125680r.get(i11)).m136436q(f11);
        }
    }

    /* renamed from: r */
    public void m136416r(C27501i.a aVar) {
        this.f125675F = aVar;
    }

    /* renamed from: s */
    public void m136417s(int i11) {
        this.f125682t.m136444g(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        m136399f(i11, i12, i13, i14, false);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void m136418t() {
        this.f125682t.m136445h();
    }

    /* renamed from: u */
    public void m136419u() {
        this.f125682t.m136446i();
    }
}
