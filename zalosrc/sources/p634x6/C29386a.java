package p634x6;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC1416c;
import p706z6.C31689h;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* renamed from: x6.a */
/* loaded from: classes3.dex */
public class C29386a extends Drawable implements InterfaceC31697p, InterfaceC1416c {

    /* renamed from: p */
    private b f135920p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x6.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        C31689h f135921a;

        /* renamed from: b */
        boolean f135922b;

        public b(C31689h c31689h) {
            this.f135921a = c31689h;
            this.f135922b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C29386a newDrawable() {
            return new C29386a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f135921a = (C31689h) bVar.f135921a.getConstantState().newDrawable();
            this.f135922b = bVar.f135922b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C29386a mutate() {
        this.f135920p = new b(this.f135920p);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f135920p;
        if (bVar.f135922b) {
            bVar.f135921a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f135920p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f135920p.f135921a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f135920p.f135921a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f135920p.f135921a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m146555e = AbstractC29387b.m146555e(iArr);
        b bVar = this.f135920p;
        if (bVar.f135922b != m146555e) {
            bVar.f135922b = m146555e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f135920p.f135921a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f135920p.f135921a.setColorFilter(colorFilter);
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        this.f135920p.f135921a.setShapeAppearanceModel(c31694m);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        this.f135920p.f135921a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f135920p.f135921a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f135920p.f135921a.setTintMode(mode);
    }

    public C29386a(C31694m c31694m) {
        this(new b(new C31689h(c31694m)));
    }

    private C29386a(b bVar) {
        this.f135920p = bVar;
    }
}
