package o80;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.vectordrawable.graphics.drawable.C2040d;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.uidrawing.C16719g;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import kg.C21709f;
import kg.C21715l;
import kg.InterfaceC21713j;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import sy.AbstractC26412d;
import th.C26691l;
import ti0.C26702a;
import ui0.C27280g;

/* renamed from: o80.m */
/* loaded from: classes6.dex */
public final class C24129m extends C16719g {

    /* renamed from: A1 */
    private int f116544A1;

    /* renamed from: B1 */
    private int f116545B1;

    /* renamed from: C1 */
    private int f116546C1;

    /* renamed from: D0 */
    private a f116547D0;

    /* renamed from: D1 */
    private final float[] f116548D1;

    /* renamed from: E0 */
    private RenderNode f116549E0;

    /* renamed from: E1 */
    private final InterfaceC24854k f116550E1;

    /* renamed from: F0 */
    private final boolean f116551F0;

    /* renamed from: G0 */
    private final boolean f116552G0;

    /* renamed from: H0 */
    private boolean f116553H0;

    /* renamed from: I0 */
    private boolean f116554I0;

    /* renamed from: J0 */
    private boolean f116555J0;

    /* renamed from: K0 */
    private final Paint f116556K0;

    /* renamed from: L0 */
    private float[] f116557L0;

    /* renamed from: M0 */
    private final float[] f116558M0;

    /* renamed from: N0 */
    private final C21715l f116559N0;

    /* renamed from: O0 */
    private b[] f116560O0;

    /* renamed from: P0 */
    private final int f116561P0;

    /* renamed from: Q0 */
    private final int f116562Q0;

    /* renamed from: R0 */
    private final double f116563R0;

    /* renamed from: S0 */
    private final int f116564S0;

    /* renamed from: T0 */
    private final float[] f116565T0;

    /* renamed from: U0 */
    private b[] f116566U0;

    /* renamed from: V0 */
    private final int f116567V0;

    /* renamed from: W0 */
    private final int f116568W0;

    /* renamed from: X0 */
    private final int f116569X0;

    /* renamed from: Y0 */
    private final float f116570Y0;

    /* renamed from: Z0 */
    private boolean f116571Z0;

    /* renamed from: a1 */
    private boolean f116572a1;

    /* renamed from: b1 */
    private boolean f116573b1;

    /* renamed from: c1 */
    private float[] f116574c1;

    /* renamed from: d1 */
    private final float[] f116575d1;

    /* renamed from: e1 */
    private final float[] f116576e1;

    /* renamed from: f1 */
    private final float[] f116577f1;

    /* renamed from: g1 */
    private final Matrix f116578g1;

    /* renamed from: h1 */
    private final float[] f116579h1;

    /* renamed from: i1 */
    private final float[] f116580i1;

    /* renamed from: j1 */
    private final int f116581j1;

    /* renamed from: k1 */
    private final Drawable f116582k1;

    /* renamed from: l1 */
    private final C2040d f116583l1;

    /* renamed from: m1 */
    private int[] f116584m1;

    /* renamed from: n1 */
    private final float f116585n1;

    /* renamed from: o1 */
    private int[] f116586o1;

    /* renamed from: p1 */
    private final float f116587p1;

    /* renamed from: q1 */
    private float f116588q1;

    /* renamed from: r1 */
    private float f116589r1;

    /* renamed from: s1 */
    private String f116590s1;

    /* renamed from: t1 */
    private boolean f116591t1;

    /* renamed from: u1 */
    private List f116592u1;

    /* renamed from: v1 */
    private final InterfaceC24854k f116593v1;

    /* renamed from: w1 */
    private RenderNode f116594w1;

    /* renamed from: x1 */
    private StaticLayout f116595x1;

    /* renamed from: y1 */
    private int f116596y1;

    /* renamed from: z1 */
    private int f116597z1;

    /* renamed from: o80.m$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo49409a(boolean z11);

        /* renamed from: b */
        void mo49410b();
    }

    /* renamed from: o80.m$b */
    /* loaded from: classes6.dex */
    private static final class b {

        /* renamed from: a */
        private final int f116598a;

        /* renamed from: b */
        private final C21709f f116599b;

        /* renamed from: c */
        private final c f116600c;

        /* renamed from: d */
        private final a f116601d;

        /* renamed from: o80.m$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC21713j {
            a() {
            }

            @Override // kg.InterfaceC21713j
            /* renamed from: a */
            public void mo39827a(C21709f c21709f) {
                AbstractC19074t.m100208f(c21709f, "spring");
                b.this.m126068b().mo126071b(b.this);
            }

            @Override // kg.InterfaceC21713j
            /* renamed from: b */
            public void mo39828b(C21709f c21709f) {
                AbstractC19074t.m100208f(c21709f, "spring");
                b.this.m126068b().mo126072c(b.this);
            }

            @Override // kg.InterfaceC21713j
            /* renamed from: c */
            public void mo39829c(C21709f c21709f) {
                AbstractC19074t.m100208f(c21709f, "spring");
                b.this.m126068b().mo126073d(b.this);
            }

            @Override // kg.InterfaceC21713j
            /* renamed from: e */
            public void mo39830e(C21709f c21709f) {
                AbstractC19074t.m100208f(c21709f, "spring");
                b.this.m126068b().mo126070a(b.this);
            }
        }

        public b(int i11, C21709f c21709f, c cVar) {
            AbstractC19074t.m100208f(c21709f, "spring");
            AbstractC19074t.m100208f(cVar, "listener");
            this.f116598a = i11;
            this.f116599b = c21709f;
            this.f116600c = cVar;
            a aVar = new a();
            this.f116601d = aVar;
            c21709f.m112030a(aVar);
        }

        /* renamed from: a */
        public final int m126067a() {
            return this.f116598a;
        }

        /* renamed from: b */
        public final c m126068b() {
            return this.f116600c;
        }

        /* renamed from: c */
        public final C21709f m126069c() {
            return this.f116599b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o80.m$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: a */
        void mo126070a(b bVar);

        /* renamed from: b */
        void mo126071b(b bVar);

        /* renamed from: c */
        void mo126072c(b bVar);

        /* renamed from: d */
        void mo126073d(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o80.m$d */
    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a */
        private final String f116603a;

        /* renamed from: b */
        private final float[] f116604b;

        public d(String str, float[] fArr) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(fArr, "points");
            this.f116603a = str;
            this.f116604b = fArr;
        }

        /* renamed from: a */
        public final String m126074a() {
            return this.f116603a;
        }

        /* renamed from: b */
        public final float[] m126075b() {
            return this.f116604b;
        }
    }

    /* renamed from: o80.m$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f116605q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.f116605q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26702a mo12V4() {
            C26702a c26702a = new C26702a(this.f116605q, 1);
            Context context = this.f116605q;
            c26702a.setTypeface(Typeface.DEFAULT_BOLD);
            c26702a.setColor(AbstractC23136l9.m118641B(context, AbstractC2808b.light_text_01));
            return c26702a;
        }
    }

    /* renamed from: o80.m$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f116606q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            return new Paint(1);
        }
    }

    /* renamed from: o80.m$g */
    /* loaded from: classes6.dex */
    public static final class g implements c {
        g() {
        }

        @Override // o80.C24129m.c
        /* renamed from: a */
        public void mo126070a(b bVar) {
            AbstractC19074t.m100208f(bVar, "sp");
        }

        @Override // o80.C24129m.c
        /* renamed from: b */
        public void mo126071b(b bVar) {
            AbstractC19074t.m100208f(bVar, "sp");
            float m112033d = (float) (bVar.m126069c().m112033d() / C24129m.this.f116563R0);
            if (C24129m.this.f116565T0[bVar.m126067a()] != m112033d) {
                C24129m.this.f116565T0[bVar.m126067a()] = m112033d;
                C24129m.this.invalidate();
            }
        }

        @Override // o80.C24129m.c
        /* renamed from: c */
        public void mo126072c(b bVar) {
            AbstractC19074t.m100208f(bVar, "spring");
        }

        @Override // o80.C24129m.c
        /* renamed from: d */
        public void mo126073d(b bVar) {
            AbstractC19074t.m100208f(bVar, "sp");
        }
    }

    /* renamed from: o80.m$h */
    /* loaded from: classes6.dex */
    public static final class h implements c {
        h() {
        }

        @Override // o80.C24129m.c
        /* renamed from: a */
        public void mo126070a(b bVar) {
            AbstractC19074t.m100208f(bVar, "sp");
            if (bVar.m126067a() == 0) {
                AbstractC20110a.f98889a.mo104548a("onSpringEndStateChange", new Object[0]);
            }
        }

        @Override // o80.C24129m.c
        /* renamed from: b */
        public void mo126071b(b bVar) {
            AbstractC19074t.m100208f(bVar, "sp");
            if (C24129m.this.f116573b1) {
                C24129m.this.f116577f1[bVar.m126067a()] = (float) bVar.m126069c().m112033d();
                C24129m c24129m = C24129m.this;
                c24129m.m126040C1(c24129m.f116577f1);
            }
        }

        @Override // o80.C24129m.c
        /* renamed from: c */
        public void mo126072c(b bVar) {
            AbstractC19074t.m100208f(bVar, "spring");
        }

        @Override // o80.C24129m.c
        /* renamed from: d */
        public void mo126073d(b bVar) {
            AbstractC19074t.m100208f(bVar, "sp");
            if (bVar.m126067a() == 0 && bVar.m126069c().m112039l() && C24129m.this.f116572a1) {
                C24129m.this.f116572a1 = false;
                AbstractC20110a.f98889a.mo104548a("onSpringAtRest", new Object[0]);
                a m126065w1 = C24129m.this.m126065w1();
                if (m126065w1 != null) {
                    m126065w1.mo49410b();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24129m(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f116552G0 = true;
        this.f116556K0 = new Paint(1);
        this.f116557L0 = new float[0];
        this.f116558M0 = new float[8];
        this.f116559N0 = C21715l.m112062k();
        b[] bVarArr = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            h hVar = new h();
            C21709f m112019d = this.f116559N0.m112019d();
            if (i11 <= 3) {
                m112019d.m112047t(false);
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC19074t.m100207e(m112019d, "also(...)");
            bVarArr[i11] = new b(i11, m112019d, hVar);
        }
        this.f116560O0 = bVarArr;
        this.f116561P0 = 2;
        this.f116563R0 = AbstractC23136l9.m118712h(context, 100.0f);
        this.f116564S0 = 1;
        this.f116565T0 = new float[2];
        b[] bVarArr2 = new b[2];
        for (int i12 = 0; i12 < 2; i12++) {
            C21709f m112019d2 = this.f116559N0.m112019d();
            AbstractC19074t.m100207e(m112019d2, "createSpring(...)");
            bVarArr2[i12] = new b(i12, m112019d2, new g());
        }
        this.f116566U0 = bVarArr2;
        int m118712h = AbstractC23136l9.m118712h(context, 128.0f);
        this.f116567V0 = m118712h;
        this.f116568W0 = AbstractC23136l9.m118712h(context, 32.0f);
        this.f116569X0 = AbstractC23136l9.m118712h(context, 16.0f);
        this.f116570Y0 = m118712h;
        this.f116574c1 = new float[0];
        this.f116575d1 = new float[8];
        this.f116576e1 = new float[8];
        this.f116577f1 = new float[8];
        this.f116578g1 = new Matrix();
        this.f116579h1 = new float[8];
        this.f116580i1 = new float[8];
        this.f116581j1 = AbstractC23136l9.m118712h(context, 80.0f);
        this.f116582k1 = C27280g.m139658a(context, AbstractC16803z.ic_scan_trigger_success);
        C2040d m11045b = C2040d.m11045b(context, AbstractC16803z.zalo_progress_material);
        if (m11045b != null) {
            m11045b.setTint(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            m11045b.setCallback(this);
        } else {
            m11045b = null;
        }
        this.f116583l1 = m11045b;
        this.f116584m1 = new int[0];
        this.f116585n1 = 0.25f;
        this.f116586o1 = new int[0];
        this.f116587p1 = 0.125f;
        this.f116590s1 = "";
        this.f116592u1 = C26691l.m137147v() ? new ArrayList() : null;
        m129210a = AbstractC24856m.m129210a(f.f116606q);
        this.f116593v1 = m129210a;
        this.f116548D1 = new float[4];
        m129210a2 = AbstractC24856m.m129210a(new e(context));
        this.f116550E1 = m129210a2;
    }

    /* renamed from: B1 */
    private final void m126039B1(boolean z11) {
        if (this.f116573b1 != z11) {
            this.f116573b1 = z11;
            a aVar = this.f116547D0;
            if (aVar != null) {
                aVar.mo49409a(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m126040C1(float[] fArr) {
        if (fArr.length != 8 && this.f116554I0) {
            this.f116554I0 = false;
            invalidate();
            return;
        }
        if (fArr.length == 8) {
            System.arraycopy(fArr, 0, this.f116558M0, 0, 8);
            this.f116578g1.reset();
            if (!this.f116571Z0) {
                float[] fArr2 = this.f116579h1;
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                float f11 = this.f116570Y0;
                fArr2[2] = f11;
                fArr2[3] = 0.0f;
                fArr2[4] = f11;
                fArr2[5] = f11;
                fArr2[6] = 0.0f;
                fArr2[7] = f11;
                this.f116571Z0 = true;
            }
            System.arraycopy(fArr, 0, this.f116580i1, 0, 8);
            this.f116578g1.setPolyToPoly(this.f116579h1, 0, this.f116580i1, 0, 4);
            m126053t1();
            this.f116554I0 = true;
            invalidate();
        }
    }

    /* renamed from: n1 */
    private final void m126048n1(int i11, int i12) {
        RecordingCanvas beginRecording;
        RenderNode m126031a = AbstractC24121e.m126031a("scan-qr-trigger-success");
        m126031a.setPosition(0, 0, i11, i12);
        beginRecording = m126031a.beginRecording();
        AbstractC19074t.m100207e(beginRecording, "beginRecording(...)");
        try {
            m126052s1(beginRecording);
            m126031a.endRecording();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        this.f116549E0 = m126031a;
    }

    /* renamed from: p1 */
    private final void m126049p1(Canvas canvas, int i11, int i12, float f11) {
        TextPaint textPaint;
        this.f116556K0.setStyle(Paint.Style.FILL);
        this.f116556K0.setColor(-6656);
        float f12 = 255;
        this.f116556K0.setAlpha(Math.min(255, Math.max(0, (int) (f11 * f12))));
        int i13 = this.f116546C1;
        canvas.drawRoundRect(0.0f, 0.0f, i11, i12, i13, i13, this.f116556K0);
        StaticLayout staticLayout = this.f116595x1;
        if (staticLayout != null) {
            textPaint = staticLayout.getPaint();
        } else {
            textPaint = null;
        }
        if (textPaint != null) {
            textPaint.setAlpha(Math.min(255, Math.max(0, (int) (f11 * f11 * f12))));
        }
        int save = canvas.save();
        canvas.translate((this.f116545B1 / 2.0f) - (this.f116597z1 / 2), (this.f116544A1 / 2.0f) - (this.f116596y1 / 2));
        try {
            StaticLayout staticLayout2 = this.f116595x1;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: q1 */
    private final void m126050q1(Canvas canvas) {
        RecordingCanvas beginRecording;
        m126054u1(canvas.getWidth(), canvas.getHeight());
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode renderNode = this.f116594w1;
            if (renderNode == null) {
                renderNode = AbstractC24121e.m126031a("bottomBadgeText");
                this.f116594w1 = renderNode;
                renderNode.setUseCompositingLayer(true, null);
                renderNode.setPosition(0, 0, this.f116545B1, this.f116544A1);
                beginRecording = renderNode.beginRecording();
                AbstractC19074t.m100207e(beginRecording, "beginRecording(...)");
                try {
                    m126049p1(beginRecording, this.f116545B1, this.f116544A1, 1.0f);
                } finally {
                    renderNode.endRecording();
                }
            }
            renderNode.setAlpha(this.f116565T0[this.f116562Q0]);
            renderNode.setTranslationX(this.f116588q1);
            renderNode.setTranslationY(this.f116589r1);
            canvas.drawRenderNode(renderNode);
            return;
        }
        float f11 = this.f116588q1;
        float f12 = this.f116589r1;
        int save = canvas.save();
        canvas.translate(f11, f12);
        try {
            m126049p1(canvas, this.f116545B1, this.f116544A1, this.f116565T0[this.f116562Q0]);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: r1 */
    private final void m126051r1(Canvas canvas) {
        List<d> list = this.f116592u1;
        if (list != null) {
            for (d dVar : list) {
                m126056x1().setColor(-5600);
                m126056x1().setStrokeWidth(AbstractC23222t7.f112550b);
                AbstractC26412d.Companion.m136240j(canvas, m126056x1(), dVar.m126075b(), dVar.m126074a(), AbstractC23222t7.f112572m, 0);
            }
        }
    }

    /* renamed from: s1 */
    private final void m126052s1(Canvas canvas) {
        C2040d c2040d;
        if (this.f116554I0) {
            Matrix matrix = this.f116578g1;
            int save = canvas.save();
            canvas.concat(matrix);
            try {
                Drawable drawable = this.f116582k1;
                if (drawable != null) {
                    int i11 = this.f116567V0;
                    drawable.setBounds(0, 0, i11, i11);
                    drawable.draw(canvas);
                }
                if (this.f116555J0 && (c2040d = this.f116583l1) != null) {
                    if (!c2040d.isRunning()) {
                        c2040d.start();
                    }
                    int i12 = this.f116567V0;
                    int i13 = this.f116568W0;
                    c2040d.setBounds((i12 / 2) - (i13 / 2), (i12 / 2) - (i13 / 2), (i12 / 2) + (i13 / 2), (i12 / 2) + (i13 / 2));
                    c2040d.draw(canvas);
                }
                canvas.restoreToCount(save);
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        } else if (this.f116552G0 && this.f116555J0 && this.f116584m1.length == 4 && this.f116586o1.length == 4 && this.f116583l1 != null) {
            this.f116556K0.setStyle(Paint.Style.FILL);
            this.f116556K0.setColor(421551871);
            int[] iArr = this.f116584m1;
            canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AbstractC23136l9.m118712h(getContext(), 12.0f), AbstractC23136l9.m118712h(getContext(), 12.0f), this.f116556K0);
            C2040d c2040d2 = this.f116583l1;
            if (!(c2040d2 instanceof Animatable)) {
                c2040d2 = null;
            }
            if (c2040d2 != null && !c2040d2.isRunning()) {
                c2040d2.start();
            }
            C2040d c2040d3 = this.f116583l1;
            int[] iArr2 = this.f116586o1;
            c2040d3.setBounds(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            this.f116583l1.draw(canvas);
        }
        if (this.f116554I0 && this.f116565T0[this.f116562Q0] != 0.0f) {
            m126050q1(canvas);
        }
    }

    /* renamed from: t1 */
    private final void m126053t1() {
        if (!m126057y1()) {
            return;
        }
        float[] fArr = new float[2];
        ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
        float[] fArr2 = this.f116580i1;
        scanQRUIUtils.m49629l(fArr, fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[2], fArr2[3], fArr2[6], fArr2[7]);
        float[] fArr3 = new float[4];
        scanQRUIUtils.m49633p(fArr3, this.f116580i1);
        float f11 = fArr[0];
        int i11 = this.f116545B1;
        float f12 = f11 - (i11 / 2);
        this.f116588q1 = f12;
        float f13 = fArr3[3] + this.f116569X0;
        this.f116589r1 = f13;
        float f14 = f12 + i11;
        float[] fArr4 = this.f116548D1;
        float f15 = fArr4[2];
        if (f14 > f15) {
            this.f116588q1 = f15 - i11;
        }
        float f16 = this.f116588q1;
        float f17 = fArr4[0];
        if (f16 < f17) {
            this.f116588q1 = f17;
        }
        int i12 = this.f116544A1;
        float f18 = f13 + i12;
        float f19 = fArr4[3];
        if (f18 > f19) {
            this.f116589r1 = f19 - i12;
        }
    }

    /* renamed from: u1 */
    private final void m126054u1(int i11, int i12) {
        int i13;
        if (this.f116595x1 != null) {
            return;
        }
        float[] fArr = this.f116548D1;
        int i14 = 0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = i11;
        fArr[3] = i12;
        m126055v1().setTextSize(AbstractC23136l9.m118712h(getContext(), 12.0f));
        StaticLayout m119624k = AbstractC23214t.m119624k(this.f116590s1, m126055v1(), i11);
        this.f116595x1 = m119624k;
        if (m119624k != null) {
            i13 = (int) m119624k.getLineMax(0);
        } else {
            i13 = 0;
        }
        this.f116597z1 = i13;
        StaticLayout staticLayout = this.f116595x1;
        if (staticLayout != null) {
            i14 = staticLayout.getHeight();
        }
        this.f116596y1 = i14;
        this.f116545B1 = this.f116597z1 + AbstractC23136l9.m118712h(getContext(), 24.0f);
        this.f116544A1 = this.f116596y1 + AbstractC23136l9.m118712h(getContext(), 8.0f);
        this.f116546C1 = AbstractC23136l9.m118712h(getContext(), 100.0f);
        m126053t1();
    }

    /* renamed from: v1 */
    private final C26702a m126055v1() {
        return (C26702a) this.f116550E1.getValue();
    }

    /* renamed from: x1 */
    private final Paint m126056x1() {
        return (Paint) this.f116593v1.getValue();
    }

    /* renamed from: y1 */
    private final boolean m126057y1() {
        return this.f116595x1 != null;
    }

    /* renamed from: A1 */
    public final void m126058A1(List list, List list2) {
        List list3 = this.f116592u1;
        if (list3 != null) {
            list3.clear();
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                List list4 = this.f116592u1;
                if (list4 != null) {
                    list4.add(new d((String) list.get(i11), (float[]) list2.get(i11)));
                }
            }
        }
    }

    /* renamed from: D1 */
    public final void m126059D1(boolean z11) {
        b[] bVarArr = this.f116560O0;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.m126069c().m112047t(z11);
            }
        }
    }

    /* renamed from: E1 */
    public final void m126060E1(boolean z11) {
        C2040d c2040d = this.f116583l1;
        if (!(c2040d instanceof Animatable)) {
            c2040d = null;
        }
        if (c2040d != null) {
            if (z11 && !this.f116555J0) {
                this.f116555J0 = true;
                if (!c2040d.isRunning()) {
                    c2040d.start();
                }
                invalidate();
                return;
            }
            if (!z11 && this.f116555J0) {
                this.f116555J0 = false;
                if (c2040d.isRunning()) {
                    c2040d.stop();
                }
                invalidate();
            }
        }
    }

    /* renamed from: F1 */
    public final void m126061F1(float[] fArr, boolean z11) {
        AbstractC19074t.m100208f(fArr, "points");
        this.f116557L0 = fArr;
        int i11 = 0;
        if (fArr.length != 8) {
            if (this.f116573b1) {
                m126039B1(false);
                m126040C1(fArr);
                return;
            }
            return;
        }
        boolean z12 = this.f116573b1;
        if (!z12 && this.f116574c1.length == 8) {
            m126039B1(true);
            this.f116572a1 = true;
            System.arraycopy(this.f116574c1, 0, this.f116575d1, 0, 8);
            System.arraycopy(fArr, 0, this.f116576e1, 0, 8);
            b[] bVarArr = this.f116560O0;
            if (bVarArr != null) {
                while (i11 < 8) {
                    bVarArr[i11].m126069c().m112044q(this.f116575d1[i11]);
                    bVarArr[i11].m126069c().m112046s(this.f116576e1[i11]);
                    i11++;
                }
                return;
            }
            return;
        }
        if (!z11 && z12) {
            this.f116572a1 = true;
            System.arraycopy(fArr, 0, this.f116576e1, 0, 8);
            b[] bVarArr2 = this.f116560O0;
            if (bVarArr2 != null) {
                while (i11 < 8) {
                    bVarArr2[i11].m126069c().m112046s(this.f116576e1[i11]);
                    i11++;
                }
            }
        }
    }

    /* renamed from: G1 */
    public final void m126062G1(float[] fArr) {
        boolean z11;
        AbstractC19074t.m100208f(fArr, "value");
        this.f116574c1 = fArr;
        if (fArr.length == 8) {
            if (this.f116584m1.length != 4) {
                this.f116584m1 = new int[4];
                this.f116586o1 = new int[4];
            }
            int[] iArr = this.f116584m1;
            float f11 = fArr[6];
            float f12 = this.f116585n1;
            float f13 = fArr[0];
            iArr[0] = (int) (((0.5f - (f12 / 2.0f)) * (f13 - f11)) + f11);
            float f14 = fArr[1];
            float f15 = fArr[3];
            iArr[1] = (int) (((0.5f - (f12 / 2.0f)) * (f15 - f14)) + f14);
            iArr[2] = (int) ((((f12 / 2.0f) + 0.5f) * (f13 - f11)) + f11);
            iArr[3] = (int) ((((f12 / 2.0f) + 0.5f) * (f15 - f14)) + f14);
            int[] iArr2 = this.f116586o1;
            float f16 = this.f116587p1;
            iArr2[0] = (int) (((0.5f - (f16 / 2.0f)) * (f13 - f11)) + f11);
            iArr2[1] = (int) (((0.5f - (f16 / 2.0f)) * (f15 - f14)) + f14);
            iArr2[2] = (int) (f11 + (((f16 / 2.0f) + 0.5f) * (f13 - f11)));
            iArr2[3] = (int) (f14 + (((f16 / 2.0f) + 0.5f) * (f15 - f14)));
            return;
        }
        if (this.f116584m1.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f116584m1 = new int[0];
        }
    }

    /* renamed from: H1 */
    public final void m126063H1(String str) {
        boolean z11;
        Object m131364L;
        Object m131364L2;
        Object m131364L3;
        AbstractC19074t.m100208f(str, "text");
        if (str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C21709f c21709f = null;
        if (!z11 && !AbstractC19074t.m100204b(str, this.f116590s1)) {
            this.f116590s1 = str;
            this.f116591t1 = true;
            this.f116595x1 = null;
            b[] bVarArr = this.f116566U0;
            if (bVarArr != null) {
                m131364L3 = AbstractC25358n.m131364L(bVarArr, this.f116562Q0);
                b bVar = (b) m131364L3;
                if (bVar != null) {
                    c21709f = bVar.m126069c();
                }
            }
            if (c21709f != null) {
                c21709f.m112046s(this.f116563R0);
                return;
            }
            return;
        }
        if (z11) {
            this.f116591t1 = false;
            b[] bVarArr2 = this.f116566U0;
            if (bVarArr2 != null) {
                m131364L2 = AbstractC25358n.m131364L(bVarArr2, this.f116562Q0);
                b bVar2 = (b) m131364L2;
                if (bVar2 != null) {
                    c21709f = bVar2.m126069c();
                }
            }
            if (c21709f != null) {
                c21709f.m112046s(0.0d);
                return;
            }
            return;
        }
        if (!this.f116591t1) {
            this.f116591t1 = true;
            b[] bVarArr3 = this.f116566U0;
            if (bVarArr3 != null) {
                m131364L = AbstractC25358n.m131364L(bVarArr3, this.f116562Q0);
                b bVar3 = (b) m131364L;
                if (bVar3 != null) {
                    c21709f = bVar3.m126069c();
                }
            }
            if (c21709f != null) {
                c21709f.m112046s(this.f116563R0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f116551F0 && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            if (!this.f116553H0) {
                m126048n1(this.f84745E - this.f84743C, this.f84746F - this.f84744D);
                this.f116553H0 = true;
            }
            RenderNode renderNode = this.f116549E0;
            if (renderNode != null) {
                canvas.drawRenderNode(renderNode);
            }
        } else {
            m126052s1(canvas);
        }
        m126051r1(canvas);
    }

    /* renamed from: o1 */
    public final void m126064o1() {
        b[] bVarArr = this.f116560O0;
        if (bVarArr != null) {
            this.f116560O0 = null;
            for (b bVar : bVarArr) {
                bVar.m126069c().m112032c();
            }
        }
        this.f116559N0.m112025j();
    }

    /* renamed from: w1 */
    public final a m126065w1() {
        return this.f116547D0;
    }

    /* renamed from: z1 */
    public final void m126066z1(a aVar) {
        this.f116547D0 = aVar;
    }
}
