package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import bi0.AbstractC2807a;
import com.zing.zalo.uidrawing.C16719g;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.ui.widget.h */
/* loaded from: classes6.dex */
public class C13641h extends C13687m {

    /* renamed from: r */
    private Paint f70336r;

    /* renamed from: s */
    private int f70337s;

    /* renamed from: t */
    private int f70338t;

    /* renamed from: u */
    private int f70339u;

    /* renamed from: v */
    private boolean f70340v;

    /* renamed from: w */
    private boolean f70341w;

    public C13641h(View view) {
        super(view);
        this.f70337s = AbstractC23136l9.m118742r(12.0f);
        this.f70338t = AbstractC23136l9.m118742r(12.0f);
        this.f70339u = 0;
        this.f70340v = true;
        this.f70341w = true;
        m76242p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.C13687m
    /* renamed from: c */
    public void mo76239c(Canvas canvas) {
        try {
            if (this.f70340v) {
                canvas.save();
                int i11 = this.f70339u;
                canvas.translate((i11 - this.f70337s) / 2, (i11 - this.f70338t) / 2);
                canvas.drawLine(0.0f, 0.0f, this.f70337s, this.f70338t, this.f70336r);
                canvas.drawLine(0.0f, this.f70338t, this.f70337s, 0.0f, this.f70336r);
                canvas.restore();
            } else if (this.f70341w) {
                super.mo76239c(canvas);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.C13687m
    /* renamed from: h */
    public void mo76240h() {
        super.mo76240h();
        this.f70700b.setColor(0);
        this.f70701c.setColor(1711312383);
        this.f70703e.setColor(-16740865);
        this.f70702d.setColor(-855601665);
    }

    @Override // com.zing.zalo.p077ui.widget.C13687m
    /* renamed from: m */
    public void mo76241m(int i11) {
        super.mo76241m(i11);
        this.f70339u = (i11 + C13687m.f70697p) * 2;
    }

    /* renamed from: p */
    void m76242p() {
        Paint paint = new Paint(1);
        this.f70336r = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70336r.setColor(-16740865);
        this.f70336r.setStrokeWidth(2.0f);
        this.f70339u = (this.f70699a + C13687m.f70697p) * 2;
    }

    /* renamed from: q */
    public void m76243q(boolean z11) {
        this.f70340v = z11;
    }

    /* renamed from: r */
    public void m76244r(boolean z11) {
        this.f70341w = z11;
    }

    /* renamed from: s */
    public void m76245s() {
        this.f70700b.setColor(0);
        this.f70701c.setColor(C23212s8.m119607o(this.f70705g, AbstractC2807a.progress_track_background_black));
        this.f70703e.setColor(C23212s8.m119607o(this.f70705g, AbstractC2807a.progress_indicator_blue));
        this.f70703e.setStrokeWidth(AbstractC23136l9.m118742r(2.0f));
        this.f70702d.setColor(-855601665);
        this.f70336r.setColor(C23212s8.m119607o(this.f70705g, AbstractC2807a.icon_02));
        this.f70336r.setStrokeWidth(AbstractC23136l9.m118742r(1.5f));
        this.f70336r.setStrokeCap(Paint.Cap.ROUND);
        this.f70337s = AbstractC23136l9.m118742r(9.0f);
        this.f70338t = AbstractC23136l9.m118742r(9.0f);
    }

    /* renamed from: t */
    public void m76246t() {
        this.f70700b.setColor(1140850688);
        this.f70701c.setColor(1728053247);
        this.f70703e.setColor(-1);
        this.f70702d.setColor(-1);
        this.f70336r.setColor(-1);
        this.f70336r.setStrokeWidth(4.0f);
        this.f70337s = AbstractC23136l9.m118742r(18.0f);
        this.f70338t = AbstractC23136l9.m118742r(18.0f);
    }

    public C13641h(C16719g c16719g) {
        super(c16719g);
        this.f70337s = AbstractC23136l9.m118742r(12.0f);
        this.f70338t = AbstractC23136l9.m118742r(12.0f);
        this.f70339u = 0;
        this.f70340v = true;
        this.f70341w = true;
        m76242p();
    }
}
