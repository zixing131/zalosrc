package p166fq;

import android.widget.TextView;
import fn0.AbstractC19074t;

/* renamed from: fq.j */
/* loaded from: classes4.dex */
public final class C19113j implements InterfaceC19110g {

    /* renamed from: p */
    private final TextView f95113p;

    public C19113j(TextView textView) {
        AbstractC19074t.m100208f(textView, "textView");
        this.f95113p = textView;
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: b */
    public void mo97618b(float f11) {
        this.f95113p.setTranslationY(f11);
    }

    @Override // p166fq.InterfaceC19110g
    public Object getTag() {
        return this.f95113p.getTag();
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: i */
    public void mo97624i(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f95113p.setText(charSequence);
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: j */
    public void mo97625j(float f11) {
        this.f95113p.setScaleX(f11);
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: m */
    public CharSequence mo97626m() {
        CharSequence text = this.f95113p.getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        return text;
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: o */
    public void mo97627o(float f11) {
        this.f95113p.setScaleY(f11);
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: q */
    public void mo97629q(float f11) {
        this.f95113p.setAlpha(f11);
    }

    @Override // p166fq.InterfaceC19110g
    public void setTag(Object obj) {
        this.f95113p.setTag(obj);
    }
}
