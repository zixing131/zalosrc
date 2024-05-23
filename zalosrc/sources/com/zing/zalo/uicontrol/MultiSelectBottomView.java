package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p649xl.C29762d6;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class MultiSelectBottomView extends FrameLayout {
    public static final C16466a Companion = new C16466a(null);

    /* renamed from: p */
    private final C29762d6 f83250p;

    /* renamed from: q */
    private final InterfaceC24854k f83251q;

    /* renamed from: r */
    private final InterfaceC24854k f83252r;

    /* renamed from: com.zing.zalo.uicontrol.MultiSelectBottomView$a */
    /* loaded from: classes4.dex */
    public static final class C16466a {
        private C16466a() {
        }

        public /* synthetic */ C16466a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MultiSelectBottomView$b */
    /* loaded from: classes4.dex */
    static final class C16467b extends AbstractC19075u implements InterfaceC18494a {
        C16467b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C23212s8.m119607o(MultiSelectBottomView.this.getContext(), AbstractC2807a.text_03));
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MultiSelectBottomView$c */
    /* loaded from: classes4.dex */
    static final class C16468c extends AbstractC19075u implements InterfaceC18494a {
        C16468c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C23212s8.m119607o(MultiSelectBottomView.this.getContext(), AbstractC2807a.text_01));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectBottomView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        C29762d6 m147848c = C29762d6.m147848c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m147848c, "inflate(...)");
        this.f83250p = m147848c;
        setBackgroundResource(AbstractC16803z.chat_reply_bg);
        setElevation(AbstractC23222t7.f112562h);
        m129210a = AbstractC24856m.m129210a(new C16468c());
        this.f83251q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C16467b());
        this.f83252r = m129210a2;
    }

    /* renamed from: a */
    public final TextView m87769a(int i11, CharSequence charSequence, Drawable drawable) {
        AbstractC19074t.m100208f(charSequence, "text");
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.layout_multi_select_bottom_view_item, (ViewGroup) this.f83250p.f137494q, false);
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setId(i11);
        textView.setText(charSequence);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        this.f83250p.f137494q.addView(textView);
        return textView;
    }

    public final int getDisableTextColor() {
        return ((Number) this.f83252r.getValue()).intValue();
    }

    public final int getEnableTextColor() {
        return ((Number) this.f83251q.getValue()).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        C29762d6 m147848c = C29762d6.m147848c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m147848c, "inflate(...)");
        this.f83250p = m147848c;
        setBackgroundResource(AbstractC16803z.chat_reply_bg);
        setElevation(AbstractC23222t7.f112562h);
        m129210a = AbstractC24856m.m129210a(new C16468c());
        this.f83251q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C16467b());
        this.f83252r = m129210a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectBottomView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        C29762d6 m147848c = C29762d6.m147848c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m147848c, "inflate(...)");
        this.f83250p = m147848c;
        setBackgroundResource(AbstractC16803z.chat_reply_bg);
        setElevation(AbstractC23222t7.f112562h);
        m129210a = AbstractC24856m.m129210a(new C16468c());
        this.f83251q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C16467b());
        this.f83252r = m129210a2;
    }
}
