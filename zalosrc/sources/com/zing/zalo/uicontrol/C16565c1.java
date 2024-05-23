package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mi0.C23314b;

/* renamed from: com.zing.zalo.uicontrol.c1 */
/* loaded from: classes4.dex */
public final class C16565c1 {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private static final int f83650f = AbstractC23222t7.f112532K;

    /* renamed from: g */
    private static final int f83651g = AbstractC23222t7.f112534M;

    /* renamed from: a */
    private final C17024o0.a f83652a;

    /* renamed from: b */
    private C17024o0 f83653b;

    /* renamed from: c */
    private Paint f83654c;

    /* renamed from: d */
    private int f83655d;

    /* renamed from: e */
    private int f83656e;

    /* renamed from: com.zing.zalo.uicontrol.c1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m88261a() {
            return C16565c1.f83651g;
        }
    }

    public C16565c1(Context context, C17024o0.a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "delegate");
        this.f83652a = aVar;
        C17024o0 c17024o0 = new C17024o0(context, aVar);
        this.f83653b = c17024o0;
        c17024o0.m91152e(C23314b.m122698a(context, AbstractC2814h.ProgressBar_Size24_White));
        C17024o0 c17024o02 = this.f83653b;
        int i11 = f83650f;
        c17024o02.m91149M(i11, i11);
        Paint paint = new Paint(1);
        this.f83654c = paint;
        paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.black));
        this.f83654c.setAlpha(140);
    }

    /* renamed from: b */
    public final void m88256b(int i11, int i12) {
        int i13 = f83651g;
        this.f83655d = (i11 - i13) / 2;
        this.f83656e = (i12 - i13) / 2;
        int i14 = f83650f;
        this.f83653b.m91138B((i11 - i14) / 2, (i12 - i14) / 2);
    }

    /* renamed from: c */
    public final void m88257c(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        float f11 = this.f83655d;
        int i11 = f83651g;
        canvas.drawCircle(f11 + (i11 / 2.0f), this.f83656e + (i11 / 2.0f), i11 / 2.0f, this.f83654c);
        this.f83653b.m91153i(canvas);
    }

    /* renamed from: d */
    public final int m88258d() {
        return this.f83653b.m91154r();
    }

    /* renamed from: e */
    public final void m88259e(int i11) {
        this.f83653b.m91161z(i11);
        this.f83654c.setAlpha((int) (i11 * 0.55f));
    }

    /* renamed from: f */
    public final void m88260f(int i11, boolean z11) {
        if (i11 == this.f83653b.m91154r()) {
            return;
        }
        this.f83653b.m91140D(i11, z11);
    }
}
