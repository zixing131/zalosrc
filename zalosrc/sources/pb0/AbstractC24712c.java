package pb0;

import ad0.InterfaceC0753o;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import bd0.C2771b;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import ln0.AbstractC22543l;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p471r3.C25630b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.AbstractC28236y3;

/* renamed from: pb0.c */
/* loaded from: classes6.dex */
public abstract class AbstractC24712c {

    /* renamed from: a */
    private final C2771b f118681a;

    /* renamed from: b */
    private C25630b f118682b;

    /* renamed from: c */
    private final InterfaceC24854k f118683c;

    /* renamed from: d */
    private final InterfaceC24854k f118684d;

    /* renamed from: e */
    private int f118685e;

    /* renamed from: f */
    private int f118686f;

    /* renamed from: g */
    private int f118687g;

    /* renamed from: h */
    private int f118688h;

    /* renamed from: i */
    private final InterfaceC24854k f118689i;

    /* renamed from: j */
    private final InterfaceC24854k f118690j;

    /* renamed from: k */
    private InterfaceC0753o f118691k;

    /* renamed from: l */
    private BitmapShader f118692l;

    /* renamed from: m */
    private Bitmap f118693m;

    /* renamed from: n */
    private final InterfaceC24854k f118694n;

    /* renamed from: pb0.c$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f118695q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Rect mo12V4() {
            return new Rect();
        }
    }

    /* renamed from: pb0.c$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f118696q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo12V4() {
            return AbstractC28236y3.m142192c(AbstractC28236y3.m142191b(AbstractC11531v0.Companion.m62485C()));
        }
    }

    /* renamed from: pb0.c$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f118697q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Matrix mo12V4() {
            return new Matrix();
        }
    }

    /* renamed from: pb0.c$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f118698q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            return new Paint(1);
        }
    }

    /* renamed from: pb0.c$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f118699q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    public AbstractC24712c(C2771b c2771b) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(c2771b, "args");
        this.f118681a = c2771b;
        this.f118682b = c2771b.m13325d();
        m129210a = AbstractC24856m.m129210a(c.f118697q);
        this.f118683c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f118695q);
        this.f118684d = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(d.f118698q);
        this.f118689i = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(b.f118696q);
        this.f118690j = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(e.f118699q);
        this.f118694n = m129210a5;
    }

    /* renamed from: a */
    private final void m128330a(Bitmap bitmap) {
        int i11;
        float m116583f;
        try {
            if (!m128337o(bitmap)) {
                return;
            }
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
            this.f118687g = i11;
            this.f118688h = i12;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.f118685e = width;
            this.f118686f = height;
            AbstractC28236y3.m142190a(i11, i12, width, height, null, m128332g(), this.f118681a.m13326e());
            m116583f = AbstractC22543l.m116583f(m128332g().width() / width, m128332g().height() / height);
            m128334j().setScale(m116583f, m116583f);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    private final void m128331d(Canvas canvas) {
        Bitmap m128333i = m128333i();
        if (m128333i != null && !m128333i.isRecycled()) {
            m128341f(m128333i, canvas);
        }
    }

    /* renamed from: g */
    private final Rect m128332g() {
        return (Rect) this.f118684d.getValue();
    }

    /* renamed from: i */
    private final Bitmap m128333i() {
        return (Bitmap) this.f118690j.getValue();
    }

    /* renamed from: j */
    private final Matrix m128334j() {
        return (Matrix) this.f118683c.getValue();
    }

    /* renamed from: k */
    private final Paint m128335k() {
        return (Paint) this.f118689i.getValue();
    }

    /* renamed from: m */
    private final Paint m128336m() {
        return (Paint) this.f118694n.getValue();
    }

    /* renamed from: o */
    private final boolean m128337o(Bitmap bitmap) {
        InterfaceC0753o mo128320l;
        InterfaceC0753o mo128320l2;
        int i11 = this.f118685e;
        if (i11 != 0 && this.f118686f != 0 && i11 == bitmap.getWidth() && this.f118686f == bitmap.getHeight() && this.f118687g != 0 && this.f118688h != 0 && (mo128320l = mo128320l()) != null && this.f118687g == mo128320l.mo1321A0() && (mo128320l2 = mo128320l()) != null && this.f118688h == mo128320l2.mo1326F0()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo128338b(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        m128339c(canvas);
        mo128344q(canvas);
    }

    /* renamed from: c */
    public void m128339c(Canvas canvas) {
        Bitmap bitmap;
        int i11;
        int i12;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!mo128340e(canvas)) {
            InterfaceC0753o mo128320l = mo128320l();
            Drawable drawable = null;
            if (mo128320l != null) {
                bitmap = mo128320l.mo1327G0();
            } else {
                bitmap = null;
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                m128341f(bitmap, canvas);
                return;
            }
            InterfaceC0753o mo128320l2 = mo128320l();
            if (mo128320l2 != null) {
                drawable = mo128320l2.mo1324D0();
            }
            if (drawable != null && mo128320l() != null) {
                InterfaceC0753o mo128320l3 = mo128320l();
                if (mo128320l3 != null) {
                    i11 = mo128320l3.mo1321A0();
                } else {
                    i11 = 0;
                }
                InterfaceC0753o mo128320l4 = mo128320l();
                if (mo128320l4 != null) {
                    i12 = mo128320l4.mo1326F0();
                } else {
                    i12 = 0;
                }
                drawable.setBounds(0, 0, i11, i12);
                drawable.draw(canvas);
                return;
            }
            m128331d(canvas);
        }
    }

    /* renamed from: e */
    public abstract boolean mo128340e(Canvas canvas);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0007, B:6:0x0012, B:8:0x0016, B:11:0x0035, B:13:0x0039, B:14:0x0040, B:17:0x0021, B:18:0x0055, B:20:0x005b, B:22:0x005f, B:24:0x0063), top: B:3:0x0007 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m128341f(Bitmap bitmap, Canvas canvas) {
        BitmapShader bitmapShader;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (bitmap != null) {
            try {
                m128330a(bitmap);
                if (this.f118681a.m13329h()) {
                    if (this.f118692l != null) {
                        if (!AbstractC19074t.m100204b(bitmap, this.f118693m)) {
                        }
                        bitmapShader = this.f118692l;
                        if (bitmapShader != null) {
                            bitmapShader.setLocalMatrix(m128334j());
                        }
                        RectF rectF = new RectF(m128332g());
                        int i11 = AbstractC23222t7.f112566j;
                        canvas.drawRoundRect(rectF, i11, i11, m128336m());
                        return;
                    }
                    this.f118693m = bitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f118692l = new BitmapShader(bitmap, tileMode, tileMode);
                    m128336m().setShader(this.f118692l);
                    bitmapShader = this.f118692l;
                    if (bitmapShader != null) {
                    }
                    RectF rectF2 = new RectF(m128332g());
                    int i112 = AbstractC23222t7.f112566j;
                    canvas.drawRoundRect(rectF2, i112, i112, m128336m());
                    return;
                }
                if (!bitmap.isRecycled() && this.f118685e > 0 && this.f118686f > 0) {
                    canvas.drawBitmap(bitmap, m128334j(), m128335k());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: h */
    public final C25630b m128342h() {
        return this.f118681a.m13325d();
    }

    /* renamed from: l */
    public InterfaceC0753o mo128320l() {
        return this.f118691k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final C25630b m128343n() {
        return this.f118682b;
    }

    /* renamed from: p */
    public void mo128321p() {
    }

    /* renamed from: q */
    public void mo128344q(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    /* renamed from: r */
    public void mo128322r(InterfaceC0753o interfaceC0753o) {
        this.f118691k = interfaceC0753o;
    }

    /* renamed from: s */
    public void mo128345s(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        this.f118682b = c25630b;
    }
}
