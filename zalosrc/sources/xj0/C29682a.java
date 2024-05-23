package xj0;

import com.zing.zalo.zinstant.zom.node.ZOMInput;
import com.zing.zalo.zinstant.zom.properties.ZOMInputText;
import fn0.AbstractC19074t;

/* renamed from: xj0.a */
/* loaded from: classes7.dex */
public final class C29682a {

    /* renamed from: a */
    public C29684c f137116a;

    /* renamed from: b */
    private int f137117b;

    /* renamed from: c */
    private boolean f137118c;

    public C29682a(ZOMInput zOMInput) {
        AbstractC19074t.m100208f(zOMInput, "zomInput");
        ZOMInputText zOMInputText = zOMInput.zomInputText;
        AbstractC19074t.m100207e(zOMInputText, "zomInput.zomInputText");
        this.f137116a = new C29684c(zOMInputText);
        m147619a(zOMInput);
    }

    /* renamed from: a */
    private final void m147619a(ZOMInput zOMInput) {
        this.f137117b = zOMInput.inputType;
        this.f137118c = zOMInput.disabled;
        ZOMInputText zOMInputText = zOMInput.zomInputText;
        AbstractC19074t.m100207e(zOMInputText, "input.zomInputText");
        m147620c(zOMInputText);
    }

    /* renamed from: c */
    private final void m147620c(ZOMInputText zOMInputText) {
        this.f137116a.m147638q(zOMInputText);
    }

    /* renamed from: b */
    public final void m147621b(ZOMInput zOMInput) {
        AbstractC19074t.m100208f(zOMInput, "input");
        m147619a(zOMInput);
    }
}
