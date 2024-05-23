package lb0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p392oh.C24261h;
import p392oh.C24265l;
import ph.C24751d;
import ph.C24753f;
import th.AbstractC26682c;

/* renamed from: lb0.g */
/* loaded from: classes6.dex */
public class C22405g {

    /* renamed from: I */
    public static final int f109658I = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: J */
    public static final int f109659J = AbstractC23136l9.m118742r(7.0f);

    /* renamed from: K */
    public static final int f109660K = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: L */
    public static final int f109661L = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: A */
    C24751d f109662A;

    /* renamed from: B */
    ValueAnimator f109663B;

    /* renamed from: G */
    ValueAnimator f109668G;

    /* renamed from: H */
    ValueAnimator f109669H;

    /* renamed from: a */
    int f109670a;

    /* renamed from: b */
    int f109671b;

    /* renamed from: c */
    int f109672c;

    /* renamed from: d */
    int f109673d;

    /* renamed from: e */
    int f109674e;

    /* renamed from: f */
    int f109675f;

    /* renamed from: h */
    final C23528a f109677h;

    /* renamed from: i */
    final C3977j f109678i;

    /* renamed from: j */
    C22422x f109679j;

    /* renamed from: k */
    BitmapDrawable f109680k;

    /* renamed from: l */
    c f109681l;

    /* renamed from: m */
    final Context f109682m;

    /* renamed from: o */
    int f109684o;

    /* renamed from: p */
    int f109685p;

    /* renamed from: s */
    Drawable f109688s;

    /* renamed from: t */
    TextPaint f109689t;

    /* renamed from: u */
    C13704p1 f109690u;

    /* renamed from: v */
    Drawable f109691v;

    /* renamed from: y */
    String f109694y;

    /* renamed from: g */
    final List f109676g = new ArrayList();

    /* renamed from: n */
    boolean f109683n = true;

    /* renamed from: q */
    int f109686q = 0;

    /* renamed from: r */
    String f109687r = "";

    /* renamed from: w */
    public boolean f109692w = true;

    /* renamed from: x */
    public boolean f109693x = true;

    /* renamed from: z */
    boolean f109695z = false;

    /* renamed from: C */
    float f109664C = 1.0f;

    /* renamed from: D */
    float f109665D = 1.0f;

    /* renamed from: E */
    float f109666E = 1.0f;

    /* renamed from: F */
    float f109667F = 0.0f;

    /* renamed from: lb0.g$a */
    /* loaded from: classes6.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ boolean f109696l1;

        a(boolean z11) {
            this.f109696l1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (!TextUtils.isEmpty(C22405g.this.f109694y) && str.equals(C22405g.this.f109694y)) {
                C22405g c22405g = C22405g.this;
                c22405g.f109695z = true;
                c22405g.f109678i.setImageInfo(c3979l, false);
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        C22405g.this.f109680k = new BitmapDrawable(c3979l.m18839c());
                        if (this.f109696l1) {
                            C22405g c22405g2 = C22405g.this;
                            c22405g2.f109680k.setTintList(c22405g2.m115834i());
                        }
                        C22405g.this.m115845t();
                    }
                }
            }
        }
    }

    /* renamed from: lb0.g$b */
    /* loaded from: classes6.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C22405g c22405g = C22405g.this;
            c22405g.f109664C = 1.0f;
            c22405g.m115845t();
        }
    }

    /* renamed from: lb0.g$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: a */
        void mo61132a();
    }

    public C22405g(Context context, c cVar) {
        this.f109681l = cVar;
        this.f109682m = context;
        int i11 = f109661L;
        this.f109674e = Math.round(i11 * 1.1f);
        this.f109675f = f109660K;
        this.f109688s = AbstractC26682c.m137042f(context);
        this.f109691v = AbstractC26682c.m137043g(context);
        TextPaint textPaint = new TextPaint(1);
        this.f109689t = textPaint;
        textPaint.setTextSize(i11);
        C13704p1 c13704p1 = new C13704p1(1);
        this.f109690u = c13704p1;
        c13704p1.setColor(-6579301);
        this.f109690u.setTextSize(i11);
        this.f109677h = new C23528a(context);
        this.f109678i = new C3977j(context);
    }

    /* renamed from: v */
    public /* synthetic */ void m115813v(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, PropertyValuesHolder propertyValuesHolder3, ValueAnimator valueAnimator) {
        try {
            this.f109665D = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName())).floatValue();
            this.f109666E = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder2.getPropertyName())).floatValue();
            this.f109667F = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder3.getPropertyName())).floatValue();
            m115845t();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public /* synthetic */ void m115814w(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, PropertyValuesHolder propertyValuesHolder3, ValueAnimator valueAnimator) {
        try {
            this.f109665D = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName())).floatValue();
            this.f109666E = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder2.getPropertyName())).floatValue();
            this.f109667F = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder3.getPropertyName())).floatValue();
            m115845t();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public /* synthetic */ void m115815x(ValueAnimator valueAnimator) {
        this.f109664C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m115845t();
    }

    /* renamed from: A */
    public void m115816A() {
        if (!this.f109695z || !TextUtils.equals(this.f109694y, C24265l.m126676s().m126706y())) {
            this.f109695z = false;
            m115847y();
        }
    }

    /* renamed from: B */
    public void m115817B() {
        if (this.f109663B == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.85f, 1.0f);
            this.f109663B = ofFloat;
            ofFloat.setRepeatCount(3);
            this.f109663B.setRepeatMode(2);
            this.f109663B.setDuration(300L);
            this.f109663B.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lb0.d
                public /* synthetic */ C22400d() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C22405g.this.m115815x(valueAnimator);
                }
            });
            this.f109663B.addListener(new b());
        }
        this.f109663B.cancel();
        this.f109663B.start();
    }

    /* renamed from: C */
    public void m115818C() {
        this.f109676g.clear();
        this.f109687r = "";
        m115848z();
    }

    /* renamed from: D */
    public void m115819D(int i11) {
        try {
            this.f109688s.setAlpha(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public void m115820E(Drawable drawable) {
        this.f109688s = drawable;
    }

    /* renamed from: F */
    public void m115821F(List list) {
        int i11;
        C24751d m126650x;
        int m128572p;
        int m128574r;
        boolean z11;
        List list2 = null;
        this.f109662A = null;
        this.f109679j = null;
        this.f109686q = 0;
        try {
            i11 = Integer.parseInt(CoreUtility.f89233i);
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = 0;
        }
        if (list != null && !list.isEmpty()) {
            long j11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                C17945a0 c17945a0 = (C17945a0) list.get(i13);
                if (c17945a0.m94877E3() && (m126650x = C24261h.m126630v().m126650x(c17945a0.m95029V3())) != null) {
                    C24753f m128570n = m126650x.m128570n(Integer.parseInt(CoreUtility.f89233i));
                    synchronized (m126650x.m128567j()) {
                        m128572p = m126650x.m128572p();
                        m128574r = m126650x.m128574r(i11);
                    }
                    if (m128572p == i12 && m128570n != null && j11 < m128570n.m128598k()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (m128572p > i12 || z11) {
                        this.f109662A = m126650x;
                        if (m128570n != null) {
                            j11 = m128570n.m128598k();
                            if (this.f109679j == null || z11) {
                                this.f109679j = new C22422x(m128570n.m128596i(), (int) this.f109689t.getTextSize());
                            }
                        }
                        i12 = m128572p;
                    }
                    if (this.f109686q < m128574r) {
                        this.f109686q = m128574r;
                    }
                }
            }
            C24751d c24751d = this.f109662A;
            if (c24751d != null) {
                list2 = c24751d.m128569m();
            }
            m115823H(list2, i12);
            return;
        }
        m115823H(null, 0);
    }

    /* renamed from: G */
    public void m115822G(C24751d c24751d) {
        int i11;
        int m128572p;
        this.f109662A = c24751d;
        this.f109679j = null;
        this.f109686q = 0;
        try {
            i11 = Integer.parseInt(CoreUtility.f89233i);
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = 0;
        }
        C24751d c24751d2 = this.f109662A;
        if (c24751d2 == null) {
            m115823H(null, 0);
            return;
        }
        synchronized (c24751d2.m128567j()) {
            this.f109686q = this.f109662A.m128574r(i11);
            m128572p = this.f109662A.m128572p();
        }
        C24753f m128570n = this.f109662A.m128570n(Integer.parseInt(CoreUtility.f89233i));
        if (m128570n != null) {
            this.f109679j = new C22422x(m128570n.m128596i(), (int) this.f109689t.getTextSize());
        }
        m115823H(this.f109662A.m128569m(), m128572p);
    }

    /* renamed from: H */
    void m115823H(List list, int i11) {
        if (list == null) {
            list = new ArrayList();
        }
        boolean z11 = false;
        this.f109695z = false;
        this.f109676g.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f109676g.add(new C22422x((String) it.next(), (int) this.f109689t.getTextSize()));
        }
        this.f109687r = AbstractC19646n0.m102954a0(i11);
        if (this.f109693x && C24265l.m126676s().m126683E()) {
            z11 = true;
        }
        this.f109683n = z11;
        m115848z();
    }

    /* renamed from: I */
    public void m115824I(int i11, int i12) {
        this.f109670a = i11;
        this.f109671b = i12;
    }

    /* renamed from: J */
    public void m115825J(int i11) {
        this.f109675f = Math.max(i11, 0);
    }

    /* renamed from: K */
    public void m115826K(int i11) {
        this.f109690u.setColor(i11);
    }

    /* renamed from: L */
    public void m115827L(int i11) {
        float max = Math.max(i11, 0);
        this.f109674e = Math.round(1.1f * max);
        this.f109689t.setTextSize(max);
        this.f109690u.setTextSize(max);
    }

    /* renamed from: M */
    public void m115828M() {
        m115844s();
        this.f109669H.cancel();
        if (!this.f109668G.isRunning()) {
            if (this.f109665D != 1.0f || this.f109666E != 1.0f || this.f109667F != 0.0f) {
                this.f109668G.start();
            }
        }
    }

    /* renamed from: d */
    public void m115829d(Canvas canvas) {
        int i11;
        int i12;
        if (m115842q() && this.f109665D > 0.0f) {
            float f11 = this.f109666E;
            if (f11 > 0.0f) {
                int i13 = (int) (this.f109674e * f11);
                int i14 = (int) (this.f109675f * f11);
                int i15 = (int) (f109658I * f11);
                int i16 = (int) (f109659J * f11);
                int size = (i15 * 2) + (this.f109676g.size() * i13) + (this.f109676g.size() * i14) + this.f109684o;
                int i17 = (i16 * 2) + i13;
                int i18 = this.f109670a;
                int i19 = this.f109672c;
                boolean z11 = this.f109683n;
                if (z11) {
                    i11 = AbstractC26682c.f126381a;
                } else {
                    i11 = 0;
                }
                int i21 = (((i19 - i11) - AbstractC26682c.f126382b) / 2) + i18;
                int i22 = i18 + i19;
                if (z11) {
                    i12 = AbstractC26682c.f126381a / 2;
                } else {
                    i12 = 0;
                }
                int i23 = i22 - i12;
                int i24 = this.f109671b + (this.f109673d / 2);
                int i25 = (int) ((i21 + ((i23 - i21) * this.f109667F)) - (size / 2.0f));
                int i26 = i17 / 2;
                canvas.save();
                canvas.translate(i25, i24 - i26);
                Drawable drawable = this.f109688s;
                if (drawable != null) {
                    drawable.setBounds(0, 0, size, i17);
                    this.f109688s.setAlpha((int) (this.f109665D * 255.0f));
                    this.f109688s.draw(canvas);
                }
                if (this.f109666E >= 0.5f) {
                    int m118742r = i16 - AbstractC23136l9.m118742r(0.5f);
                    for (int i27 = 0; i27 < this.f109676g.size(); i27++) {
                        canvas.save();
                        canvas.translate(((i13 + i14) * i27) + i15, m118742r);
                        C22422x c22422x = (C22422x) this.f109676g.get(i27);
                        int i28 = this.f109674e;
                        c22422x.setBounds(0, 0, i28, i28);
                        ((C22422x) this.f109676g.get(i27)).m115849a(this.f109666E);
                        ((C22422x) this.f109676g.get(i27)).draw(canvas);
                        canvas.restore();
                    }
                }
                if (this.f109666E >= 0.8f) {
                    int m118742r2 = ((size - i15) - this.f109684o) - AbstractC23136l9.m118742r(0.5f);
                    int i29 = i26 + (this.f109685p / 2);
                    this.f109690u.setAlpha((int) (this.f109665D * 255.0f));
                    canvas.drawText(this.f109687r, m118742r2, i29, this.f109690u);
                }
                canvas.restore();
            }
        }
        if (this.f109683n) {
            canvas.save();
            int i31 = AbstractC26682c.f126381a;
            int i32 = (int) (i31 * this.f109664C);
            int i33 = (this.f109670a + this.f109672c) - (i31 / 2);
            int i34 = this.f109671b + (i31 / 2);
            float f12 = i33;
            float f13 = i32 / 2.0f;
            canvas.translate(f12 - f13, i34 - f13);
            this.f109691v.setBounds(0, 0, i32, i32);
            this.f109691v.draw(canvas);
            if (this.f109679j == null) {
                Drawable m115838m = m115838m();
                if (m115838m != null) {
                    m115838m.setBounds(0, 0, i32, i32);
                    m115838m.draw(canvas);
                }
            } else {
                int i35 = this.f109674e;
                canvas.translate((i32 - i35) / 2.0f, (i32 - i35) / 2.0f);
                C22422x c22422x2 = this.f109679j;
                int i36 = this.f109674e;
                c22422x2.setBounds(0, 0, i36, i36);
                this.f109679j.m115849a(this.f109664C);
                this.f109679j.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: e */
    protected Drawable m115830e() {
        return AbstractC26682c.m137041e(this.f109682m);
    }

    /* renamed from: f */
    public int m115831f() {
        return this.f109673d;
    }

    /* renamed from: g */
    public int m115832g() {
        return this.f109670a;
    }

    /* renamed from: h */
    public int m115833h() {
        return this.f109686q;
    }

    /* renamed from: i */
    protected ColorStateList m115834i() {
        return AbstractC26682c.m137040d(this.f109682m);
    }

    /* renamed from: j */
    public int m115835j() {
        return ((this.f109670a + this.f109672c) - AbstractC26682c.f126381a) - AbstractC26682c.f126382b;
    }

    /* renamed from: k */
    public boolean m115836k() {
        return this.f109683n;
    }

    /* renamed from: l */
    public C24751d m115837l() {
        return this.f109662A;
    }

    /* renamed from: m */
    protected Drawable m115838m() {
        BitmapDrawable bitmapDrawable = this.f109680k;
        if (bitmapDrawable != null) {
            if (bitmapDrawable.getBitmap().isRecycled()) {
                return m115830e();
            }
            return this.f109680k;
        }
        return m115830e();
    }

    /* renamed from: n */
    public int m115839n() {
        return this.f109671b;
    }

    /* renamed from: o */
    public int m115840o() {
        C24751d c24751d = this.f109662A;
        if (c24751d != null) {
            return c24751d.m128572p();
        }
        return 0;
    }

    /* renamed from: p */
    public int m115841p() {
        return this.f109672c;
    }

    /* renamed from: q */
    boolean m115842q() {
        if (!this.f109676g.isEmpty() && !TextUtils.isEmpty(this.f109687r)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void m115843r() {
        m115844s();
        this.f109668G.cancel();
        if (!this.f109669H.isRunning()) {
            if (this.f109665D != 0.0f || this.f109666E != 0.0f || this.f109667F != 1.0f) {
                this.f109669H.start();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: lb0.e.<init>(lb0.g, android.animation.PropertyValuesHolder, android.animation.PropertyValuesHolder, android.animation.PropertyValuesHolder):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: s */
    void m115844s() {
        /*
            r14 = this;
            android.animation.ValueAnimator r0 = r14.f109668G
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r2 = 200(0xc8, double:9.9E-322)
            r4 = 1
            r5 = 0
            r6 = 3
            java.lang.String r7 = "translation_x"
            java.lang.String r8 = "scale"
            r9 = 2
            if (r0 != 0) goto L53
            float[] r0 = new float[r9]
            r0 = {x0098: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r10 = "alpha"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r10, r0)
            float[] r10 = new float[r9]
            r10 = {x00a0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r10 = android.animation.PropertyValuesHolder.ofFloat(r8, r10)
            float[] r11 = new float[r9]
            r11 = {x00a8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r7, r11)
            android.animation.PropertyValuesHolder[] r12 = new android.animation.PropertyValuesHolder[r6]
            r12[r5] = r0
            r12[r4] = r10
            r12[r9] = r11
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofPropertyValuesHolder(r12)
            r14.f109668G = r12
            lb0.e r13 = new lb0.e
            r13.<init>()
            r12.addUpdateListener(r13)
            android.animation.ValueAnimator r0 = r14.f109668G
            r0.setDuration(r2)
            android.animation.ValueAnimator r0 = r14.f109668G
            android.view.animation.OvershootInterpolator r10 = new android.view.animation.OvershootInterpolator
            r10.<init>(r1)
            r0.setInterpolator(r10)
        L53:
            android.animation.ValueAnimator r0 = r14.f109669H
            if (r0 != 0) goto L97
            float[] r0 = new float[r9]
            r0 = {x00b0: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r8, r0)
            float[] r10 = new float[r9]
            r10 = {x00b8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r8, r10)
            float[] r10 = new float[r9]
            r10 = {x00c0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r7 = android.animation.PropertyValuesHolder.ofFloat(r7, r10)
            android.animation.PropertyValuesHolder[] r6 = new android.animation.PropertyValuesHolder[r6]
            r6[r5] = r0
            r6[r4] = r8
            r6[r9] = r7
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofPropertyValuesHolder(r6)
            r14.f109669H = r4
            lb0.f r5 = new lb0.f
            r5.<init>()
            r4.addUpdateListener(r5)
            android.animation.ValueAnimator r0 = r14.f109669H
            r0.setDuration(r2)
            android.animation.ValueAnimator r0 = r14.f109669H
            android.view.animation.AnticipateInterpolator r2 = new android.view.animation.AnticipateInterpolator
            r2.<init>(r1)
            r0.setInterpolator(r2)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lb0.C22405g.m115844s():void");
    }

    /* renamed from: t */
    void m115845t() {
        this.f109681l.mo61132a();
    }

    /* renamed from: u */
    public boolean m115846u() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f109668G;
        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && (((valueAnimator = this.f109669H) == null || !valueAnimator.isRunning()) && this.f109665D == 1.0f && this.f109666E == 1.0f && this.f109667F == 0.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    void m115847y() {
        this.f109694y = C24265l.m126676s().m126706y();
        boolean m126682D = C24265l.m126676s().m126682D();
        if (!TextUtils.isEmpty(this.f109694y)) {
            C24003n m120075I0 = C23278z2.m120075I0();
            if (C23999j.m125696L2(this.f109694y, m120075I0)) {
                C3979l m123606l = this.f109677h.m123606l(this.f109694y, m120075I0.f116260a, m120075I0.f116263d, m120075I0.f116266g);
                if (m123606l != null) {
                    this.f109695z = true;
                    C3977j c3977j = this.f109678i;
                    if (c3977j != null) {
                        c3977j.setImageInfo(m123606l, false);
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(m123606l.m18839c());
                    this.f109680k = bitmapDrawable;
                    if (m126682D) {
                        bitmapDrawable.setTintList(m115834i());
                        return;
                    }
                    return;
                }
                return;
            }
            ((C23528a) this.f109677h.m123612r(this.f109678i)).m123579C(this.f109694y, m120075I0, new a(m126682D));
            return;
        }
        this.f109680k = null;
    }

    /* renamed from: z */
    void m115848z() {
        int i11;
        if (this.f109683n) {
            i11 = AbstractC26682c.f126381a;
        } else {
            i11 = 0;
        }
        this.f109672c = i11;
        this.f109673d = AbstractC26682c.f126381a;
        if (m115842q()) {
            this.f109672c += AbstractC26682c.f126382b;
            this.f109684o = AbstractC23136l9.m118764y0(this.f109690u, this.f109687r);
            this.f109685p = AbstractC23136l9.m118761x0(this.f109690u, this.f109687r);
            this.f109672c += (f109658I * 2) + (this.f109674e * this.f109676g.size()) + (this.f109675f * this.f109676g.size()) + this.f109684o;
        }
    }
}
