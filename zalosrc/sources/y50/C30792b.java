package y50;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.core.content.AbstractC1388a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import ln0.C22537f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19180c;
import qm0.AbstractC25351j0;

/* renamed from: y50.b */
/* loaded from: classes5.dex */
public final class C30792b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C30795e f142102a;

    /* renamed from: b */
    private final int f142103b;

    /* renamed from: c */
    private final float f142104c;

    /* renamed from: d */
    private final int f142105d;

    /* renamed from: e */
    private float f142106e;

    /* renamed from: f */
    private int f142107f;

    /* renamed from: g */
    private int f142108g;

    /* renamed from: h */
    private int f142109h;

    /* renamed from: i */
    private int f142110i;

    /* renamed from: j */
    private final Point f142111j;

    /* renamed from: k */
    private int f142112k;

    /* renamed from: l */
    private int f142113l;

    /* renamed from: m */
    private int f142114m;

    /* renamed from: n */
    private int f142115n;

    /* renamed from: o */
    private final Point f142116o;

    /* renamed from: p */
    private final Path f142117p;

    /* renamed from: q */
    private final Paint f142118q;

    /* renamed from: r */
    private final Paint f142119r;

    /* renamed from: s */
    private final Rect f142120s;

    /* renamed from: y50.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C30792b(Context context, C30795e c30795e) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c30795e, "layout");
        this.f142102a = c30795e;
        this.f142103b = AbstractC23136l9.m118742r(2.0f);
        float m118742r = AbstractC23136l9.m118742r(5.0f);
        this.f142104c = m118742r;
        int m118742r2 = AbstractC23136l9.m118742r(11.0f);
        this.f142105d = m118742r2;
        this.f142106e = m118742r2;
        this.f142107f = -1;
        this.f142108g = -1;
        this.f142109h = -1;
        this.f142110i = -1;
        this.f142111j = new Point();
        this.f142112k = -1;
        this.f142113l = -1;
        this.f142114m = -1;
        this.f142115n = -1;
        this.f142116o = new Point();
        this.f142117p = new Path();
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setColor(AbstractC1388a.m6961c(context, AbstractC19180c.highlighted_text_material_light));
        paint.setPathEffect(new CornerPathEffect(m118742r));
        this.f142118q = paint;
        Paint paint2 = new Paint();
        paint2.setFlags(1);
        paint2.setColor(C23212s8.m119607o(context, AbstractC19178a.colorControlActivated));
        this.f142119r = paint2;
        this.f142120s = new Rect();
    }

    /* renamed from: a */
    private final void m149747a(int i11, int i12, int i13, C30795e c30795e) {
        c30795e.m149804b(i11, i12, i13, this.f142120s);
        if (i13 != this.f142107f) {
            this.f142120s.left -= this.f142103b;
        }
        Path path = this.f142117p;
        Rect rect = this.f142120s;
        path.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
    }

    /* renamed from: b */
    private final void m149748b(Canvas canvas) {
        canvas.save();
        Point point = this.f142116o;
        canvas.drawCircle(point.x, point.y, this.f142106e, this.f142119r);
        canvas.restore();
        Point point2 = this.f142116o;
        int i11 = point2.x;
        float f11 = this.f142106e;
        int i12 = point2.y;
        canvas.drawRect(i11 - f11, i12 - f11, i11, i12, this.f142119r);
    }

    /* renamed from: c */
    private final void m149749c(Canvas canvas) {
        canvas.save();
        Point point = this.f142111j;
        canvas.drawCircle(point.x, point.y, this.f142106e, this.f142119r);
        canvas.restore();
        Point point2 = this.f142111j;
        int i11 = point2.x;
        int i12 = point2.y;
        float f11 = this.f142106e;
        canvas.drawRect(i11, i12 - f11, i11 + f11, i12, this.f142119r);
    }

    /* renamed from: g */
    private final void m149750g(int i11) {
        this.f142112k = this.f142102a.m149808f(i11, true);
        this.f142113l = this.f142102a.m149816o(i11, true);
        this.f142114m = this.f142102a.m149812k(this.f142112k);
        int m149806d = this.f142102a.m149806d(this.f142112k);
        this.f142115n = m149806d;
        Point point = this.f142116o;
        int i12 = this.f142113l;
        int i13 = this.f142105d;
        point.set(i12 + i13, m149806d + i13);
    }

    /* renamed from: h */
    private final void m149751h(int i11, int i12) {
        this.f142117p.reset();
        Iterator it = new C22537f(this.f142107f, this.f142112k).iterator();
        while (it.hasNext()) {
            m149747a(i11, i12, ((AbstractC25351j0) it).mo116552a(), this.f142102a);
        }
    }

    /* renamed from: j */
    private final void m149752j(int i11) {
        this.f142107f = C30795e.m149801g(this.f142102a, i11, false, 2, null);
        this.f142108g = C30795e.m149802p(this.f142102a, i11, false, 2, null);
        this.f142109h = this.f142102a.m149812k(this.f142107f);
        int m149806d = this.f142102a.m149806d(this.f142107f);
        this.f142110i = m149806d;
        Point point = this.f142111j;
        int i12 = this.f142108g;
        int i13 = this.f142105d;
        point.set(i12 - i13, m149806d + i13);
    }

    /* renamed from: d */
    public final void m149753d(Canvas canvas, float f11) {
        AbstractC19074t.m100208f(canvas, "canvas");
        this.f142106e = this.f142105d * f11;
        m149749c(canvas);
        m149748b(canvas);
    }

    /* renamed from: e */
    public final void m149754e(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.drawPath(this.f142117p, this.f142118q);
    }

    /* renamed from: f */
    public final void m149755f(C30795e c30795e) {
        AbstractC19074t.m100208f(c30795e, "layout");
        this.f142102a = c30795e;
    }

    /* renamed from: i */
    public final void m149756i(int i11, int i12) {
        m149752j(i11);
        m149750g(i12);
        m149751h(i11, i12);
    }
}
