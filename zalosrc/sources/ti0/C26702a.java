package ti0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import fn0.AbstractC19074t;

/* renamed from: ti0.a */
/* loaded from: classes7.dex */
public final class C26702a extends TextPaint {

    /* renamed from: a */
    private final Context f126592a;

    /* renamed from: b */
    private boolean f126593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26702a(Context context, int i11) {
        super(i11);
        AbstractC19074t.m100208f(context, "context");
        this.f126593b = true;
        this.f126592a = context;
        m137271a();
        if (C13778s1.m76966g()) {
            super.setTextSize(getTextSize() * C13778s1.m76962c());
        }
    }

    /* renamed from: a */
    private final void m137271a() {
        Typeface m76694c;
        if (C13778s1.m76960a() && (m76694c = C13718q1.m76694c(this.f126592a, 0)) != null) {
            setTypeface(m76694c);
        }
    }

    /* renamed from: b */
    public final void m137272b() {
        if (C13778s1.m76960a()) {
            Typeface m76694c = C13718q1.m76694c(this.f126592a, 7);
            AbstractC19074t.m100205c(m76694c);
            setTypeface(m76694c);
            return;
        }
        setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* renamed from: c */
    public final void m137273c(float f11, boolean z11) {
        this.f126593b = z11;
        super.setTextSize(f11);
    }

    @Override // android.graphics.Paint
    public void setTextSize(float f11) {
        if (this.f126593b && C13778s1.m76966g()) {
            super.setTextSize(f11 * C13778s1.m76962c());
        } else {
            super.setTextSize(f11);
        }
    }

    @Override // android.graphics.Paint
    public Typeface setTypeface(Typeface typeface) {
        if (!C13778s1.m76960a()) {
            return super.setTypeface(typeface);
        }
        if (AbstractC19074t.m100204b(Typeface.DEFAULT, typeface)) {
            return super.setTypeface(C13718q1.m76694c(this.f126592a, 5));
        }
        if (AbstractC19074t.m100204b(Typeface.DEFAULT_BOLD, typeface)) {
            return super.setTypeface(C13718q1.m76694c(this.f126592a, 9));
        }
        return super.setTypeface(typeface);
    }
}
