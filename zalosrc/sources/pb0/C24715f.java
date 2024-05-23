package pb0;

import ad0.InterfaceC0753o;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import bd0.C2771b;
import com.zing.zalo.AbstractC16781w;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: pb0.f */
/* loaded from: classes6.dex */
public final class C24715f extends C24713d {
    public static final a Companion = new a(null);

    /* renamed from: u */
    private static final int f118705u = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: v */
    private static final int f118706v = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: q */
    private final InterfaceC24854k f118707q;

    /* renamed from: r */
    private final InterfaceC24854k f118708r;

    /* renamed from: s */
    private final InterfaceC24854k f118709s;

    /* renamed from: t */
    private final InterfaceC24854k f118710t;

    /* renamed from: pb0.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: pb0.f$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f118711q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Path mo12V4() {
            return new Path();
        }
    }

    /* renamed from: pb0.f$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f118712q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint(1);
            paint.setColor(C23212s8.m119606n(AbstractC16781w.CSCSecondaryBackground));
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(C24715f.f118705u);
            return paint;
        }
    }

    /* renamed from: pb0.f$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f118713q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Path mo12V4() {
            return new Path();
        }
    }

    /* renamed from: pb0.f$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f118714q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24719j mo12V4() {
            return new C24719j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24715f(C2771b c2771b) {
        super(c2771b);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(c2771b, "args");
        m129210a = AbstractC24856m.m129210a(b.f118711q);
        this.f118707q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f118713q);
        this.f118708r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f118712q);
        this.f118709s = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(e.f118714q);
        this.f118710t = m129210a4;
    }

    /* renamed from: F */
    private final Path m128356F() {
        return (Path) this.f118707q.getValue();
    }

    /* renamed from: G */
    private final Paint m128357G() {
        return (Paint) this.f118709s.getValue();
    }

    /* renamed from: H */
    private final Path m128358H() {
        return (Path) this.f118708r.getValue();
    }

    /* renamed from: I */
    private final C24719j m128359I() {
        return (C24719j) this.f118710t.getValue();
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: b */
    public void mo128338b(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.save();
        canvas.clipPath(m128356F());
        super.mo128338b(canvas);
        canvas.restore();
    }

    @Override // pb0.AbstractC24710a, pb0.AbstractC24712c
    /* renamed from: p */
    public void mo128321p() {
        int i11;
        super.mo128321p();
        InterfaceC0753o mo128320l = mo128320l();
        int i12 = 0;
        if (mo128320l != null) {
            i11 = mo128320l.mo1321A0();
        } else {
            i11 = 0;
        }
        InterfaceC0753o mo128320l2 = mo128320l();
        if (mo128320l2 != null) {
            i12 = mo128320l2.mo1326F0();
        }
        float f11 = i12;
        m128357G().setShader(new LinearGradient(0.0f, f11 / 3.0f, 0.0f, f11, 0, -1073741824, Shader.TileMode.CLAMP));
        m128356F().reset();
        Path m128356F = m128356F();
        float f12 = i11;
        RectF rectF = new RectF(0.0f, 0.0f, f12, f11);
        int i13 = f118706v;
        Path.Direction direction = Path.Direction.CW;
        m128356F.addRoundRect(rectF, i13, i13, direction);
        m128356F().close();
        m128358H().reset();
        m128358H().addRoundRect(new RectF(0.0f, 0.0f, f12, f11), i13, i13, direction);
        m128358H().close();
        m128359I().m128375d(i11, i12);
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: q */
    public void mo128344q(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.drawPath(m128358H(), m128357G());
        m128359I().m128374a(canvas);
        super.mo128344q(canvas);
    }
}
