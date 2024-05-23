package com.zing.zalo.social.controls;

import ag0.C0815e1;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import fn0.AbstractC19074t;
import p361nb.C23648e;

/* loaded from: classes5.dex */
public final class MsgInfoSpan extends StyleSpan {

    /* renamed from: p */
    private int f54791p;

    /* renamed from: q */
    private String f54792q;

    /* renamed from: r */
    private String f54793r;

    /* renamed from: s */
    private String f54794s;

    /* renamed from: t */
    public int f54795t;

    /* renamed from: u */
    public int f54796u;

    /* renamed from: v */
    public boolean f54797v;

    /* renamed from: w */
    public int f54798w;

    /* renamed from: x */
    private boolean f54799x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgInfoSpan(int i11, String str, String str2, String str3) {
        super(0);
        AbstractC19074t.m100208f(str, "actionLabel");
        AbstractC19074t.m100208f(str2, "actionType");
        AbstractC19074t.m100208f(str3, "actionData");
        this.f54791p = i11;
        this.f54792q = str;
        this.f54793r = str2;
        this.f54794s = str3;
        this.f54799x = true;
    }

    /* renamed from: a */
    private final void m56337a() {
        if (this.f54798w == 16 && this.f54799x) {
            this.f54799x = false;
            C0815e1.m2075D().m2100V(new C23648e(61, "message_info", 1, "hide_mem_list_intro_view", new String[0]), true);
        }
    }

    /* renamed from: b */
    public final String m56338b() {
        return this.f54794s;
    }

    /* renamed from: c */
    public final String m56339c() {
        return this.f54792q;
    }

    /* renamed from: d */
    public final String m56340d() {
        return this.f54793r;
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f54791p);
        textPaint.setFakeBoldText(this.f54797v);
        m56337a();
    }
}
