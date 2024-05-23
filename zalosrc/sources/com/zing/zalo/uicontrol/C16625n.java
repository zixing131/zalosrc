package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mi0.C23314b;

/* renamed from: com.zing.zalo.uicontrol.n */
/* loaded from: classes4.dex */
public final class C16625n {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C17024o0.a f83866a;

    /* renamed from: b */
    private C17024o0 f83867b;

    /* renamed from: c */
    private int f83868c;

    /* renamed from: d */
    private Paint f83869d;

    /* renamed from: e */
    private int f83870e;

    /* renamed from: f */
    private int f83871f;

    /* renamed from: com.zing.zalo.uicontrol.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C16625n(Context context, C17024o0.a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "delegate");
        this.f83866a = aVar;
        C17024o0 c17024o0 = new C17024o0(context, aVar);
        this.f83867b = c17024o0;
        c17024o0.m91152e(C23314b.m122698a(context, AbstractC2814h.ProgressBar_Size24_White));
        C17024o0 c17024o02 = this.f83867b;
        int i11 = AbstractC23222t7.f112532K;
        c17024o02.m91149M(i11, i11);
        Paint paint = new Paint(1);
        this.f83869d = paint;
        paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.black));
        this.f83869d.setAlpha(140);
    }

    /* renamed from: a */
    public final void m88397a(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        float f11 = this.f83870e;
        int i11 = ChatRow.f57223X5;
        canvas.drawCircle(f11 + (i11 / 2.0f), this.f83871f + (i11 / 2.0f), ChatRow.f57224Y5 / 2.0f, this.f83869d);
        this.f83867b.m91153i(canvas);
    }

    /* renamed from: b */
    public final void m88398b() {
        this.f83867b.m91161z(255);
        this.f83868c = 0;
        this.f83867b.m91159x();
        this.f83870e = 0;
        this.f83871f = 0;
        this.f83869d.setAlpha(140);
    }

    /* renamed from: c */
    public final void m88399c(int i11) {
        this.f83867b.m91161z(i11);
        this.f83869d.setAlpha((int) (i11 * 0.55f));
    }

    /* renamed from: d */
    public final void m88400d(int i11, int i12) {
        this.f83870e = i11;
        this.f83871f = i12;
        this.f83867b.m91138B(i11, i12);
    }

    /* renamed from: e */
    public final void m88401e(int i11) {
        int m116580c;
        int m116580c2;
        m116580c = AbstractC22543l.m116580c(this.f83867b.m91154r(), 5);
        m116580c2 = AbstractC22543l.m116580c(i11, m116580c);
        if (m116580c2 == this.f83867b.m91154r()) {
            return;
        }
        this.f83867b.m91140D(m116580c2, false);
    }
}
