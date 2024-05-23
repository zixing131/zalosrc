package com.zing.zalo.p077ui.chat.widget.popup;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.chat.widget.popup.C11785a;
import com.zing.zalo.p077ui.chat.widget.popup.TextSelectPopupMenuView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public final class TextSelectPopupMenuView extends LinearLayout {
    public static final C11784a Companion = new C11784a(null);

    /* renamed from: p */
    private final int f61289p;

    /* renamed from: q */
    private final int f61290q;

    /* renamed from: r */
    private final float f61291r;

    /* renamed from: s */
    private final float f61292s;

    /* renamed from: t */
    private final float f61293t;

    /* renamed from: u */
    private final int f61294u;

    /* renamed from: v */
    private final int f61295v;

    /* renamed from: w */
    private final Path f61296w;

    /* renamed from: x */
    private final Path f61297x;

    /* renamed from: y */
    private final Paint f61298y;

    /* renamed from: z */
    private C11785a.c f61299z;

    /* renamed from: com.zing.zalo.ui.chat.widget.popup.TextSelectPopupMenuView$a */
    /* loaded from: classes5.dex */
    public static final class C11784a {
        private C11784a() {
        }

        public /* synthetic */ C11784a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSelectPopupMenuView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m6961c = AbstractC1388a.m6961c(context, AbstractC16801x.Dark_SecondaryBackgroundColor);
        this.f61289p = m6961c;
        this.f61290q = AbstractC1388a.m6961c(context, AbstractC16801x.Dark_TextColor1);
        this.f61291r = AbstractC23136l9.m118742r(7.0f);
        this.f61292s = AbstractC23136l9.m118742r(5.0f);
        this.f61293t = AbstractC23136l9.m118742r(5.0f);
        this.f61294u = AbstractC23136l9.m118742r(10.0f);
        this.f61295v = AbstractC23136l9.m118742r(7.0f);
        this.f61296w = new Path();
        this.f61297x = new Path();
        Paint paint = new Paint();
        paint.setColor(m6961c);
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f61298y = paint;
        this.f61299z = C11785a.c.f61313p;
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m65550c(C11785a.b bVar, View view) {
        AbstractC19074t.m100208f(bVar, "$option");
        bVar.m65572b().mo12V4();
    }

    /* renamed from: d */
    private final boolean m65551d() {
        C11785a.c cVar = this.f61299z;
        if (cVar != C11785a.c.f61313p && cVar != C11785a.c.f61315r) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m65552e() {
        C11785a.c cVar = this.f61299z;
        if (cVar != C11785a.c.f61314q && cVar != C11785a.c.f61316s) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m65553b(final C11785a.b bVar) {
        AbstractC19074t.m100208f(bVar, "option");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        robotoTextView.setText(bVar.m65571a());
        int i11 = this.f61294u;
        int i12 = this.f61295v;
        robotoTextView.setPadding(i11, i12, i11, i12);
        robotoTextView.setBackgroundColor(this.f61289p);
        robotoTextView.setTextColor(this.f61290q);
        robotoTextView.setTextSize(1, 15.0f);
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: p60.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextSelectPopupMenuView.m65550c(C11785a.b.this, view);
            }
        });
        addView(robotoTextView);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int save = canvas.save();
        if (m65552e()) {
            canvas.translate(0.0f, this.f61291r);
        }
        canvas.clipPath(this.f61297x);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: f */
    public final void m65554f(C11785a.c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "position");
        if (cVar == C11785a.c.f61318u) {
            return;
        }
        this.f61299z = cVar;
        this.f61296w.reset();
        float measuredWidth = getMeasuredWidth() - i11;
        if (m65551d()) {
            this.f61296w.moveTo(measuredWidth, getMeasuredHeight());
            this.f61296w.lineTo(measuredWidth - this.f61292s, getMeasuredHeight() - this.f61291r);
            this.f61296w.lineTo(measuredWidth + this.f61292s, getMeasuredHeight() - this.f61291r);
        } else if (m65552e()) {
            this.f61296w.moveTo(measuredWidth, 0.0f);
            this.f61296w.lineTo(measuredWidth - this.f61292s, this.f61291r);
            this.f61296w.lineTo(measuredWidth + this.f61292s, this.f61291r);
        }
        this.f61296w.close();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        if (m65551d() || m65552e()) {
            canvas.drawPath(this.f61296w, this.f61298y);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f61297x.reset();
        Path path = this.f61297x;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f11 = this.f61293t;
        path.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f11, f11, Path.Direction.CW);
        setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState((int) (getMeasuredHeight() + this.f61291r), i12, 0));
    }
}
