package com.zing.zalo.uicontrol.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2808b;
import fd0.EnumC18885e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* loaded from: classes4.dex */
public final class WaveformView extends View {
    public static final C16670a Companion = new C16670a(null);

    /* renamed from: D */
    private static final int f84528D = AbstractC23136l9.m118742r(21.0f);

    /* renamed from: E */
    private static final int f84529E = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: F */
    private static final int f84530F = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: G */
    private static final float f84531G = AbstractC23136l9.m118742r(7.0f);

    /* renamed from: H */
    private static final int f84532H = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: I */
    private static final List f84533I;

    /* renamed from: A */
    private long f84534A;

    /* renamed from: B */
    private int f84535B;

    /* renamed from: C */
    private EnumC18885e f84536C;

    /* renamed from: p */
    private View f84537p;

    /* renamed from: q */
    private final Paint f84538q;

    /* renamed from: r */
    private final Paint f84539r;

    /* renamed from: s */
    private int f84540s;

    /* renamed from: t */
    private int f84541t;

    /* renamed from: u */
    private final RectF f84542u;

    /* renamed from: v */
    private int f84543v;

    /* renamed from: w */
    private final List f84544w;

    /* renamed from: x */
    private final List f84545x;

    /* renamed from: y */
    private int f84546y;

    /* renamed from: z */
    private boolean f84547z;

    /* renamed from: com.zing.zalo.uicontrol.voice.WaveformView$a */
    /* loaded from: classes4.dex */
    public static final class C16670a {
        private C16670a() {
        }

        public /* synthetic */ C16670a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        List m131505m;
        m131505m = AbstractC25368s.m131505m(Float.valueOf(0.25f), Float.valueOf(0.5f));
        f84533I = m131505m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.light_icon_02));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f84538q = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setStyle(style);
        this.f84539r = paint2;
        this.f84542u = new RectF();
        this.f84544w = new ArrayList();
        this.f84545x = new ArrayList();
        this.f84536C = EnumC18885e.f94267q;
    }

    /* renamed from: b */
    private final void m88827b() {
        if (this.f84541t != this.f84545x.size()) {
            m88840a();
        }
    }

    /* renamed from: d */
    private final void m88828d() {
        this.f84545x.clear();
        this.f84535B = 0;
    }

    /* renamed from: e */
    private final void m88829e() {
        this.f84544w.clear();
        this.f84547z = false;
        this.f84543v = 0;
        this.f84545x.clear();
        this.f84546y = 0;
    }

    /* renamed from: f */
    private final void m88830f(Canvas canvas) {
        float size = (this.f84535B / 100) * this.f84545x.size();
        double d11 = size;
        int floor = (int) Math.floor(d11);
        int ceil = (int) Math.ceil(d11);
        for (int i11 = 0; i11 < floor; i11++) {
            RectF rectF = (RectF) this.f84545x.get(i11);
            float f11 = f84531G;
            canvas.drawRoundRect(rectF, f11, f11, this.f84539r);
        }
        if (floor != ceil && floor >= 0 && floor < this.f84545x.size()) {
            RectF rectF2 = (RectF) this.f84545x.get(floor);
            float f12 = rectF2.left;
            float f13 = f12 + ((rectF2.right - f12) * (size - floor));
            float f14 = rectF2.top;
            float f15 = rectF2.bottom;
            float f16 = f84531G;
            canvas.drawRoundRect(f12, f14, f13, f15, f16, f16, this.f84539r);
            canvas.drawRoundRect(f13, rectF2.top, rectF2.right, rectF2.bottom, f16, f16, this.f84538q);
        }
        int size2 = this.f84545x.size();
        while (ceil < size2) {
            RectF rectF3 = (RectF) this.f84545x.get(ceil);
            float f17 = f84531G;
            canvas.drawRoundRect(rectF3, f17, f17, this.f84538q);
            ceil++;
        }
    }

    /* renamed from: g */
    private final void m88831g(Canvas canvas) {
        float m116587j;
        float f11;
        m116587j = AbstractC22543l.m116587j(((float) (getCurrentTimeInMs() - this.f84534A)) / ((float) 100), 0.0f, 1.0f);
        if (this.f84546y >= this.f84545x.size()) {
            f11 = -((f84530F + f84532H) * m116587j);
        } else {
            f11 = 0.0f;
        }
        RectF rectF = this.f84542u;
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            save = canvas.save();
            canvas.translate(f11, 0.0f);
            try {
                m88832h(canvas, this.f84538q, m116587j);
                canvas.restoreToCount(save);
                if (m116587j < 1.0f) {
                    invalidate();
                } else if (this.f84547z) {
                    m88837n();
                }
            } finally {
                canvas.restoreToCount(save);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final long getCurrentTimeInMs() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    private final void m88832h(Canvas canvas, Paint paint, float f11) {
        int m131504l;
        float floatValue;
        int size = this.f84546y - f84533I.size();
        for (int i11 = 0; i11 < size; i11++) {
            RectF rectF = (RectF) this.f84545x.get(i11);
            float f12 = f84531G;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int size2 = f84533I.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Integer valueOf = Integer.valueOf((this.f84546y - 1) - i12);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                List list = f84533I;
                float floatValue2 = ((Number) list.get(i12)).floatValue();
                m131504l = AbstractC25368s.m131504l(list);
                if (i12 == m131504l) {
                    floatValue = 1.0f;
                } else {
                    floatValue = ((Number) list.get(i12 + 1)).floatValue();
                }
                float f13 = ((RectF) this.f84545x.get(intValue)).left;
                float f14 = ((RectF) this.f84545x.get(intValue)).right;
                float height = ((RectF) this.f84545x.get(intValue)).height() * (floatValue2 + ((floatValue - floatValue2) * f11));
                float f15 = (this.f84540s - height) / 2;
                float f16 = f84531G;
                canvas.drawRoundRect(f13, f15, f14, f15 + height, f16, f16, paint);
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    private final void m88833i(int i11) {
        this.f84545x.clear();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f84545x.add(new RectF((f84530F + f84532H) * i12, 0.0f, r1 + r2, 0.0f));
        }
    }

    /* renamed from: j */
    private final List m88834j(List list, int i11) {
        int m116580c;
        int m131504l;
        int m116584g;
        float floatValue;
        double m131193T;
        List m131502j;
        if (i11 <= 0) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        if (list.size() == i11) {
            return list;
        }
        float size = list.size() / i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (i12 < i11) {
            float f11 = i12;
            m116580c = AbstractC22543l.m116580c((int) Math.floor(size * f11), 0);
            i12++;
            m131504l = AbstractC25368s.m131504l(list);
            m116584g = AbstractC22543l.m116584g((int) Math.ceil(i12 * size), m131504l);
            if (list.size() > i11) {
                m131193T = AbstractC25332a0.m131193T(list.subList(m116580c, m116584g + 1));
                floatValue = (float) m131193T;
            } else {
                float f12 = (f11 + 0.5f) * size;
                floatValue = ((((Number) list.get(m116584g)).floatValue() * (m116584g - f12)) + (((Number) list.get(m116580c)).floatValue() * (f12 - m116580c))) / (m116584g - m116580c);
            }
            arrayList.add(Float.valueOf(floatValue));
        }
        return arrayList;
    }

    /* renamed from: l */
    private final void m88835l(RectF rectF, float f11) {
        float max = Math.max(f11 * f84528D, f84529E);
        float f12 = (this.f84540s - max) / 2;
        rectF.top = f12;
        rectF.bottom = f12 + max;
    }

    /* renamed from: m */
    private final float m88836m(float f11, float f12) {
        float m116583f;
        if (f11 < f12) {
            f11 = (f11 + f12) / 2;
        }
        m116583f = AbstractC22543l.m116583f(f11, 1.0f);
        return m116583f;
    }

    /* renamed from: n */
    private final void m88837n() {
        m88838r();
        m88839u();
        this.f84534A = getCurrentTimeInMs();
        invalidate();
    }

    /* renamed from: r */
    private final void m88838r() {
        float f11;
        Object m131216p0;
        float f12 = (this.f84543v * 4) / 32678.0f;
        if (!this.f84544w.isEmpty()) {
            m131216p0 = AbstractC25332a0.m131216p0(this.f84544w);
            f11 = ((Number) m131216p0).floatValue();
        } else {
            f11 = 0.0f;
        }
        this.f84544w.add(Float.valueOf(m88836m(f12, f11)));
        this.f84543v = 0;
    }

    /* renamed from: u */
    private final void m88839u() {
        Object m131216p0;
        Object m131216p02;
        Object m131216p03;
        if (this.f84544w.isEmpty()) {
            return;
        }
        if (this.f84546y < this.f84545x.size()) {
            RectF rectF = (RectF) this.f84545x.get(this.f84546y);
            m131216p03 = AbstractC25332a0.m131216p0(this.f84544w);
            m88835l(rectF, ((Number) m131216p03).floatValue());
            this.f84546y++;
            return;
        }
        int size = this.f84545x.size() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            ((RectF) this.f84545x.get(i11)).top = ((RectF) this.f84545x.get(i12)).top;
            ((RectF) this.f84545x.get(i11)).bottom = ((RectF) this.f84545x.get(i12)).bottom;
            i11 = i12;
        }
        m131216p0 = AbstractC25332a0.m131216p0(this.f84545x);
        m131216p02 = AbstractC25332a0.m131216p0(this.f84544w);
        m88835l((RectF) m131216p0, ((Number) m131216p02).floatValue());
    }

    /* renamed from: a */
    public final void m88840a() {
        List m88834j = m88834j(this.f84544w, this.f84541t);
        m88833i(this.f84541t);
        int i11 = this.f84541t;
        for (int i12 = 0; i12 < i11; i12++) {
            m88835l((RectF) this.f84545x.get(i12), ((Number) m88834j.get(i12)).floatValue());
        }
        invalidate();
    }

    /* renamed from: c */
    public final void m88841c() {
        m88829e();
        m88828d();
    }

    public final EnumC18885e getMode() {
        return this.f84536C;
    }

    public final View getParentView() {
        return this.f84537p;
    }

    /* renamed from: k */
    public final void m88842k(int i11, int i12) {
        this.f84538q.setColor(i11);
        this.f84539r.setColor(i12);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        EnumC18885e enumC18885e = this.f84536C;
        if (enumC18885e == EnumC18885e.f94266p) {
            m88831g(canvas);
        } else if (enumC18885e == EnumC18885e.f94267q) {
            m88830f(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f84540s = i12;
        this.f84541t = i11 / (f84530F + f84532H);
        RectF rectF = this.f84542u;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = i11;
        rectF.bottom = i12;
        if (this.f84536C == EnumC18885e.f94267q) {
            m88827b();
        }
    }

    /* renamed from: p */
    public final void m88843p() {
        if (!this.f84547z) {
            this.f84547z = true;
            m88833i(this.f84541t + 1);
            m88837n();
        }
    }

    /* renamed from: q */
    public final void m88844q() {
        this.f84547z = false;
    }

    /* renamed from: s */
    public final void m88845s(int i11) {
        this.f84543v = Math.max(this.f84543v, i11);
    }

    public final void setMode(EnumC18885e enumC18885e) {
        AbstractC19074t.m100208f(enumC18885e, "<set-?>");
        this.f84536C = enumC18885e;
    }

    public final void setParentView(View view) {
        this.f84537p = view;
    }

    public final void setProgressPreview(int i11) {
        int m116588k;
        m116588k = AbstractC22543l.m116588k(i11, 0, 100);
        this.f84535B = m116588k;
        invalidate();
    }
}
