package p706z6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p671y6.C30797a;

/* renamed from: z6.o */
/* loaded from: classes3.dex */
public class C31696o {

    /* renamed from: a */
    public float f145629a;

    /* renamed from: b */
    public float f145630b;

    /* renamed from: c */
    public float f145631c;

    /* renamed from: d */
    public float f145632d;

    /* renamed from: e */
    public float f145633e;

    /* renamed from: f */
    public float f145634f;

    /* renamed from: g */
    private final List f145635g = new ArrayList();

    /* renamed from: h */
    private final List f145636h = new ArrayList();

    /* renamed from: i */
    private boolean f145637i;

    /* renamed from: z6.o$a */
    /* loaded from: classes3.dex */
    class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f145638b;

        /* renamed from: c */
        final /* synthetic */ Matrix f145639c;

        a(List list, Matrix matrix) {
            this.f145638b = list;
            this.f145639c = matrix;
        }

        @Override // p706z6.C31696o.g
        /* renamed from: a */
        public void mo152567a(Matrix matrix, C30797a c30797a, int i11, Canvas canvas) {
            Iterator it = this.f145638b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo152567a(this.f145639c, c30797a, i11, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.o$b */
    /* loaded from: classes3.dex */
    public static class b extends g {

        /* renamed from: b */
        private final d f145641b;

        public b(d dVar) {
            this.f145641b = dVar;
        }

        @Override // p706z6.C31696o.g
        /* renamed from: a */
        public void mo152567a(Matrix matrix, C30797a c30797a, int i11, Canvas canvas) {
            c30797a.m149840a(canvas, matrix, new RectF(this.f145641b.m152578k(), this.f145641b.m152582o(), this.f145641b.m152579l(), this.f145641b.m152577j()), i11, this.f145641b.m152580m(), this.f145641b.m152581n());
        }
    }

    /* renamed from: z6.o$c */
    /* loaded from: classes3.dex */
    static class c extends g {

        /* renamed from: b */
        private final e f145642b;

        /* renamed from: c */
        private final float f145643c;

        /* renamed from: d */
        private final float f145644d;

        public c(e eVar, float f11, float f12) {
            this.f145642b = eVar;
            this.f145643c = f11;
            this.f145644d = f12;
        }

        @Override // p706z6.C31696o.g
        /* renamed from: a */
        public void mo152567a(Matrix matrix, C30797a c30797a, int i11, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f145642b.f145653c - this.f145644d, this.f145642b.f145652b - this.f145643c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f145643c, this.f145644d);
            matrix2.preRotate(m152568c());
            c30797a.m149841b(canvas, matrix2, rectF, i11);
        }

        /* renamed from: c */
        float m152568c() {
            return (float) Math.toDegrees(Math.atan((this.f145642b.f145653c - this.f145644d) / (this.f145642b.f145652b - this.f145643c)));
        }
    }

    /* renamed from: z6.o$d */
    /* loaded from: classes3.dex */
    public static class d extends f {

        /* renamed from: h */
        private static final RectF f145645h = new RectF();

        /* renamed from: b */
        public float f145646b;

        /* renamed from: c */
        public float f145647c;

        /* renamed from: d */
        public float f145648d;

        /* renamed from: e */
        public float f145649e;

        /* renamed from: f */
        public float f145650f;

        /* renamed from: g */
        public float f145651g;

        public d(float f11, float f12, float f13, float f14) {
            m152584q(f11);
            m152588u(f12);
            m152585r(f13);
            m152583p(f14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m152577j() {
            return this.f145649e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m152578k() {
            return this.f145646b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m152579l() {
            return this.f145648d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m152580m() {
            return this.f145650f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m152581n() {
            return this.f145651g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m152582o() {
            return this.f145647c;
        }

        /* renamed from: p */
        private void m152583p(float f11) {
            this.f145649e = f11;
        }

        /* renamed from: q */
        private void m152584q(float f11) {
            this.f145646b = f11;
        }

        /* renamed from: r */
        private void m152585r(float f11) {
            this.f145648d = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m152586s(float f11) {
            this.f145650f = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m152587t(float f11) {
            this.f145651g = f11;
        }

        /* renamed from: u */
        private void m152588u(float f11) {
            this.f145647c = f11;
        }

        @Override // p706z6.C31696o.f
        /* renamed from: a */
        public void mo152589a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f145654a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f145645h;
            rectF.set(m152578k(), m152582o(), m152579l(), m152577j());
            path.arcTo(rectF, m152580m(), m152581n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: z6.o$e */
    /* loaded from: classes3.dex */
    public static class e extends f {

        /* renamed from: b */
        private float f145652b;

        /* renamed from: c */
        private float f145653c;

        @Override // p706z6.C31696o.f
        /* renamed from: a */
        public void mo152589a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f145654a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f145652b, this.f145653c);
            path.transform(matrix);
        }
    }

    /* renamed from: z6.o$f */
    /* loaded from: classes3.dex */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f145654a = new Matrix();

        /* renamed from: a */
        public abstract void mo152589a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.o$g */
    /* loaded from: classes3.dex */
    public static abstract class g {

        /* renamed from: a */
        static final Matrix f145655a = new Matrix();

        g() {
        }

        /* renamed from: a */
        public abstract void mo152567a(Matrix matrix, C30797a c30797a, int i11, Canvas canvas);

        /* renamed from: b */
        public final void m152594b(C30797a c30797a, int i11, Canvas canvas) {
            mo152567a(f145655a, c30797a, i11, canvas);
        }
    }

    public C31696o() {
        m152565n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m152546b(float f11) {
        if (m152548g() == f11) {
            return;
        }
        float m152548g = ((f11 - m152548g()) + 360.0f) % 360.0f;
        if (m152548g > 180.0f) {
            return;
        }
        d dVar = new d(m152560i(), m152561j(), m152560i(), m152561j());
        dVar.m152586s(m152548g());
        dVar.m152587t(m152548g);
        this.f145636h.add(new b(dVar));
        m152550p(f11);
    }

    /* renamed from: c */
    private void m152547c(g gVar, float f11, float f12) {
        m152546b(f11);
        this.f145636h.add(gVar);
        m152550p(f12);
    }

    /* renamed from: g */
    private float m152548g() {
        return this.f145633e;
    }

    /* renamed from: h */
    private float m152549h() {
        return this.f145634f;
    }

    /* renamed from: p */
    private void m152550p(float f11) {
        this.f145633e = f11;
    }

    /* renamed from: q */
    private void m152551q(float f11) {
        this.f145634f = f11;
    }

    /* renamed from: r */
    private void m152552r(float f11) {
        this.f145631c = f11;
    }

    /* renamed from: s */
    private void m152553s(float f11) {
        this.f145632d = f11;
    }

    /* renamed from: t */
    private void m152554t(float f11) {
        this.f145629a = f11;
    }

    /* renamed from: u */
    private void m152555u(float f11) {
        this.f145630b = f11;
    }

    /* renamed from: a */
    public void m152556a(float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean z11;
        float f17;
        d dVar = new d(f11, f12, f13, f14);
        dVar.m152586s(f15);
        dVar.m152587t(f16);
        this.f145635g.add(dVar);
        b bVar = new b(dVar);
        float f18 = f15 + f16;
        if (f16 < 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        if (z11) {
            f17 = (180.0f + f18) % 360.0f;
        } else {
            f17 = f18;
        }
        m152547c(bVar, f15, f17);
        double d11 = f18;
        m152552r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))));
        m152553s(((f12 + f14) * 0.5f) + (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))));
    }

    /* renamed from: d */
    public void m152557d(Matrix matrix, Path path) {
        int size = this.f145635g.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((f) this.f145635g.get(i11)).mo152589a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m152558e() {
        return this.f145637i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public g m152559f(Matrix matrix) {
        m152546b(m152549h());
        return new a(new ArrayList(this.f145636h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m152560i() {
        return this.f145631c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m152561j() {
        return this.f145632d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m152562k() {
        return this.f145629a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m152563l() {
        return this.f145630b;
    }

    /* renamed from: m */
    public void m152564m(float f11, float f12) {
        e eVar = new e();
        eVar.f145652b = f11;
        eVar.f145653c = f12;
        this.f145635g.add(eVar);
        c cVar = new c(eVar, m152560i(), m152561j());
        m152547c(cVar, cVar.m152568c() + 270.0f, cVar.m152568c() + 270.0f);
        m152552r(f11);
        m152553s(f12);
    }

    /* renamed from: n */
    public void m152565n(float f11, float f12) {
        m152566o(f11, f12, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m152566o(float f11, float f12, float f13, float f14) {
        m152554t(f11);
        m152555u(f12);
        m152552r(f11);
        m152553s(f12);
        m152550p(f13);
        m152551q((f13 + f14) % 360.0f);
        this.f145635g.clear();
        this.f145636h.clear();
        this.f145637i = false;
    }
}
