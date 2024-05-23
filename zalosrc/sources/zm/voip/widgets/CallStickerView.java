package zm.voip.widgets;

import android.content.Context;
import android.graphics.Canvas;
import bd0.C2770a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.C13700o2;
import fn0.AbstractC19074t;
import p471r3.C25630b;
import vg.C28181s2;

/* loaded from: classes7.dex */
public final class CallStickerView extends RecyclingImageView implements C2770a.a {

    /* renamed from: p */
    private final boolean f149889p;

    /* renamed from: q */
    private final C13700o2 f149890q;

    /* renamed from: r */
    private int f149891r;

    /* renamed from: s */
    private int f149892s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallStickerView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f149889p = true;
        this.f149890q = new C13700o2(new C2770a(this, C13700o2.d.f70834p, -1, null, false, true, false, null, false, 384, null));
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        return C2770a.a.C32648a.m13321b(this);
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return C2770a.a.C32648a.m13320a(this);
    }

    public final boolean getForceUsePNGList() {
        return this.f149889p;
    }

    /* renamed from: i */
    public final void m157272i(C25630b c25630b, String str, boolean z11) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        AbstractC19074t.m100208f(str, "id");
        C13700o2 c13700o2 = this.f149890q;
        c13700o2.m76544n(c25630b, false);
        C13700o2.m76493P(c13700o2, c25630b, str, true, z11, false, false, 48, null);
    }

    /* renamed from: j */
    public final void m157273j() {
        this.f149890q.m76530R(true);
    }

    /* renamed from: k */
    public final void m157274k(int i11, int i12) {
        this.f149892s = i11;
        this.f149891r = i12;
        C13700o2.m76499c0(this.f149890q, C13700o2.d.f70835q, i12, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.ZAppCompatImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f149890q.m76530R(true);
        C28181s2.f131306a.m141724e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        try {
            C13700o2 c13700o2 = this.f149890q;
            canvas.translate((this.f149892s - c13700o2.m76524H()) / 2.0f, 0.0f);
            c13700o2.m76545v(canvas);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        setMeasuredDimension(this.f149892s, this.f149891r);
    }

    public final void setPlayStickerDone(C13700o2.b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        this.f149890q.m76535X(bVar);
    }
}
