package com.zing.zalo.libbubbleview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import yt.AbstractC31079i;

/* loaded from: classes4.dex */
public final class FloatingCloseButton extends AppCompatImageView {

    /* renamed from: p */
    private C8949b f47769p;

    /* renamed from: q */
    private boolean f47770q;

    /* renamed from: r */
    private int f47771r;

    /* renamed from: s */
    private float f47772s;

    /* renamed from: t */
    private int f47773t;

    /* renamed from: u */
    private int f47774u;

    /* renamed from: v */
    private int f47775v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.libbubbleview.FloatingCloseButton$a */
    /* loaded from: classes4.dex */
    public static final class C8944a extends AbstractC19075u implements InterfaceC18494a {
        C8944a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m47725a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m47725a() {
            FloatingCloseButton.this.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingCloseButton(Context context, C8949b c8949b) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c8949b, "manager");
        this.f47769p = c8949b;
        m47719h(c8949b);
    }

    /* renamed from: h */
    private final void m47719h(C8949b c8949b) {
        this.f47769p = c8949b;
        setImageResource(AbstractC31079i.dismiss_icon);
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f47771r = aVar.m47751c(context, c8949b.m47763g().m150978e());
        setVisibility(8);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f47773t = aVar.m47751c(context2, c8949b.m47763g().m150974a());
    }

    private final void setScale(float f11) {
        setScaleX(f11);
        setScaleY(f11);
    }

    /* renamed from: f */
    public final void m47720f() {
        if (!this.f47770q) {
            this.f47770q = true;
            setTranslationY(this.f47772s + this.f47773t);
            setVisibility(0);
            AbstractC8948a.a.m47748g(AbstractC8948a.Companion, this, this.f47772s, 150L, null, null, 24, null);
        }
    }

    /* renamed from: g */
    public final void m47721g(boolean z11) {
        if (this.f47770q) {
            this.f47770q = false;
            if (z11) {
                AbstractC8948a.a.m47748g(AbstractC8948a.Companion, this, this.f47772s + this.f47773t, 150L, new C8944a(), null, 16, null);
                return;
            } else {
                setVisibility(8);
                setTranslationY(this.f47772s + this.f47773t);
                return;
            }
        }
        setVisibility(8);
    }

    public final int getCenterX() {
        return this.f47774u;
    }

    public final int getCenterY() {
        return this.f47775v;
    }

    public final int getEndValueX() {
        return (int) getX();
    }

    public final int getEndValueY() {
        return (int) getY();
    }

    /* renamed from: i */
    public final void m47722i(float f11) {
        setScale(f11);
    }

    /* renamed from: j */
    public final void m47723j() {
        setScale(1.0f);
    }

    /* renamed from: k */
    public final void m47724k(int i11, int i12) {
        if (this.f47774u != i11 || this.f47775v != i12) {
            this.f47774u = i11;
            this.f47775v = i12;
            setX(i11 - (this.f47771r / 2));
            float f11 = this.f47775v - (this.f47771r / 2);
            this.f47772s = f11;
            setY(f11);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m47721g(false);
    }

    public final void setCenterX(int i11) {
        this.f47774u = i11;
    }

    public final void setCenterY(int i11) {
        this.f47775v = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingCloseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        throw new IllegalArgumentException("This constructor cannot be used");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingCloseButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        throw new IllegalArgumentException("This constructor cannot be used");
    }
}
