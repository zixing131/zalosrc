package com.zing.zalo.p077ui.chat.widget.jumpbutton;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.imageview.CircleImageView;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23278z2;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class MentionJumpFloatingView extends LinearLayout {

    /* renamed from: p */
    private final InterfaceC24854k f61106p;

    /* renamed from: q */
    private final InterfaceC24854k f61107q;

    /* renamed from: r */
    private final InterfaceC24854k f61108r;

    /* renamed from: s */
    private final InterfaceC24854k f61109s;

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.MentionJumpFloatingView$a */
    /* loaded from: classes5.dex */
    static final class C11752a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f61110q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11752a(Context context) {
            super(0);
            this.f61110q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(this.f61110q);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.MentionJumpFloatingView$b */
    /* loaded from: classes5.dex */
    static final class C11753b extends AbstractC19075u implements InterfaceC18494a {
        C11753b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CircleImageView mo12V4() {
            return (CircleImageView) MentionJumpFloatingView.this.findViewById(AbstractC6918a0.iv_avt);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.MentionJumpFloatingView$c */
    /* loaded from: classes5.dex */
    static final class C11754c extends AbstractC19075u implements InterfaceC18494a {
        C11754c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout mo12V4() {
            return (LinearLayout) MentionJumpFloatingView.this.findViewById(AbstractC6918a0.ll_mention_detail);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.jumpbutton.MentionJumpFloatingView$d */
    /* loaded from: classes5.dex */
    static final class C11755d extends AbstractC19075u implements InterfaceC18494a {
        C11755d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo12V4() {
            return (TextView) MentionJumpFloatingView.this.findViewById(AbstractC6918a0.tv_mention_text);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MentionJumpFloatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final C23528a getAQ() {
        return (C23528a) this.f61106p.getValue();
    }

    private final CircleImageView getAvatarView() {
        Object value = this.f61108r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (CircleImageView) value;
    }

    private final LinearLayout getMentionDetailLayout() {
        Object value = this.f61107q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (LinearLayout) value;
    }

    private final TextView getMentionTextView() {
        Object value = this.f61109s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (TextView) value;
    }

    /* renamed from: a */
    public final void m65426a() {
        getMentionDetailLayout().setVisibility(8);
    }

    /* renamed from: b */
    public final void m65427b() {
        getMentionDetailLayout().setVisibility(0);
    }

    /* renamed from: c */
    public final void m65428c(String str) {
        AbstractC19074t.m100208f(str, "avtUrl");
        if (str.length() == 0) {
            return;
        }
        ((C23528a) getAQ().m123612r(getAvatarView())).m123618x(str, C23278z2.m120143n());
    }

    /* renamed from: d */
    public final void m65429d(C17945a0 c17945a0) {
        String m118743r0;
        AbstractC19074t.m100208f(c17945a0, "unreadMsg");
        if (c17945a0.m94986Q6()) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mention_all);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_mention_jump);
        }
        AbstractC19074t.m100205c(m118743r0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) AbstractC23244v8.m119743g(c17945a0.m94854B4(), 16));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        getMentionTextView().setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) m118743r0));
    }

    public /* synthetic */ MentionJumpFloatingView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionJumpFloatingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C11752a(context));
        this.f61106p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11754c());
        this.f61107q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C11753b());
        this.f61108r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C11755d());
        this.f61109s = m129210a4;
    }
}
