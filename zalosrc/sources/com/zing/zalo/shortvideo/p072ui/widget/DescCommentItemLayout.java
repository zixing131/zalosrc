package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b10.C2482a;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.DescriptionCommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import u20.AbstractC26990k;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import z10.C31158d;

/* loaded from: classes5.dex */
public final class DescCommentItemLayout extends FrameLayout {

    /* renamed from: A */
    private int f54030A;

    /* renamed from: B */
    private InterfaceC18511r f54031B;

    /* renamed from: C */
    private int f54032C;

    /* renamed from: D */
    private boolean f54033D;

    /* renamed from: E */
    private InterfaceC18505l f54034E;

    /* renamed from: F */
    private InterfaceC18505l f54035F;

    /* renamed from: G */
    private InterfaceC18505l f54036G;

    /* renamed from: p */
    private final InterfaceC24854k f54037p;

    /* renamed from: q */
    private final InterfaceC24854k f54038q;

    /* renamed from: r */
    private final InterfaceC24854k f54039r;

    /* renamed from: s */
    private final InterfaceC24854k f54040s;

    /* renamed from: t */
    private final InterfaceC24854k f54041t;

    /* renamed from: u */
    private final InterfaceC24854k f54042u;

    /* renamed from: v */
    private final int f54043v;

    /* renamed from: w */
    private final int f54044w;

    /* renamed from: x */
    private int f54045x;

    /* renamed from: y */
    private final int f54046y;

    /* renamed from: z */
    private final int f54047z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$a */
    /* loaded from: classes5.dex */
    static final class C10668a extends AbstractC19075u implements InterfaceC18494a {
        C10668a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvatarImageView mo12V4() {
            return (AvatarImageView) DescCommentItemLayout.this.findViewById(AbstractC27409d.aivAvatar);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$b */
    /* loaded from: classes5.dex */
    public static final class C10669b extends AbstractC26990k {

        /* renamed from: t */
        final /* synthetic */ C2482a f54050t;

        C10669b(C2482a c2482a) {
            this.f54050t = c2482a;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            DescCommentItemLayout.this.f54033D = true;
            DescCommentItemLayout.this.getTxtDescription().setMaxLines(Integer.MAX_VALUE);
            DescCommentItemLayout.this.getTxtDescription().setText(DescCommentItemLayout.this.getTxtDescription().getOriginalText());
            DescCommentItemLayout.this.getLytDescription().setAllowAnimation$zshort_release(true);
            this.f54050t.m12542h(true);
            InterfaceC18505l interfaceC18505l = DescCommentItemLayout.this.f54036G;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Boolean.TRUE);
            }
        }

        @Override // u20.AbstractC26990k
        /* renamed from: e */
        public void mo52096e(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC18505l interfaceC18505l = DescCommentItemLayout.this.f54035F;
            if (interfaceC18505l != null) {
                CharSequence originalText = DescCommentItemLayout.this.getTxtDescription().getOriginalText();
                if (originalText == null) {
                    originalText = DescCommentItemLayout.this.getTxtDescription().getText();
                }
                interfaceC18505l.mo205i9(originalText.toString());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setColor(AbstractC26112n.m134426u(DescCommentItemLayout.this, AbstractC27406a.zch_text_inverse_subtle));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$c */
    /* loaded from: classes5.dex */
    public static final class C10670c extends AbstractC26990k {

        /* renamed from: t */
        final /* synthetic */ String f54052t;

        C10670c(String str) {
            this.f54052t = str;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC18505l interfaceC18505l = DescCommentItemLayout.this.f54034E;
            if (interfaceC18505l != null) {
                String str = this.f54052t;
                AbstractC19074t.m100207e(str, "$hashtag");
                interfaceC18505l.mo205i9(str);
            }
        }

        @Override // u20.AbstractC26990k
        /* renamed from: e */
        public void mo52096e(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC18505l interfaceC18505l = DescCommentItemLayout.this.f54035F;
            if (interfaceC18505l != null) {
                CharSequence originalText = DescCommentItemLayout.this.getTxtDescription().getOriginalText();
                if (originalText == null) {
                    originalText = DescCommentItemLayout.this.getTxtDescription().getText();
                }
                interfaceC18505l.mo205i9(originalText.toString());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(DescCommentItemLayout.this.getTxtDescription(), 9));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$d */
    /* loaded from: classes5.dex */
    public static final class C10671d extends MetricAffectingSpan {
        C10671d() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(DescCommentItemLayout.this.getTxtDescription(), 9));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$e */
    /* loaded from: classes5.dex */
    static final class C10672e extends AbstractC19075u implements InterfaceC18505l {
        C10672e() {
            super(1);
        }

        /* renamed from: a */
        public final void m55723a(boolean z11) {
            InterfaceC18505l interfaceC18505l = DescCommentItemLayout.this.f54035F;
            if (interfaceC18505l != null) {
                CharSequence originalText = DescCommentItemLayout.this.getTxtDescription().getOriginalText();
                if (originalText == null) {
                    originalText = DescCommentItemLayout.this.getTxtDescription().getText();
                }
                interfaceC18505l.mo205i9(originalText.toString());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55723a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$f */
    /* loaded from: classes5.dex */
    static final class C10673f extends AbstractC19075u implements InterfaceC18494a {
        C10673f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DescriptionCommentLayout mo12V4() {
            return (DescriptionCommentLayout) DescCommentItemLayout.this.findViewById(AbstractC27409d.lytDescription);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$g */
    /* loaded from: classes5.dex */
    static final class C10674g extends AbstractC19075u implements InterfaceC18494a {
        C10674g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverScrollableRecyclerView mo12V4() {
            return (OverScrollableRecyclerView) DescCommentItemLayout.this.findViewById(AbstractC27409d.rvCta);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$h */
    /* loaded from: classes5.dex */
    static final class C10675h extends AbstractC19075u implements InterfaceC18494a {
        C10675h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return DescCommentItemLayout.this.findViewById(AbstractC27409d.tagAuthor);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$i */
    /* loaded from: classes5.dex */
    static final class C10676i extends AbstractC19075u implements InterfaceC18494a {
        C10676i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EllipsizedTextView mo12V4() {
            return (EllipsizedTextView) DescCommentItemLayout.this.findViewById(AbstractC27409d.txtDescription);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.DescCommentItemLayout$j */
    /* loaded from: classes5.dex */
    static final class C10677j extends AbstractC19075u implements InterfaceC18494a {
        C10677j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FitUsernameTextView mo12V4() {
            return (FitUsernameTextView) DescCommentItemLayout.this.findViewById(AbstractC27409d.txtName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescCommentItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C10668a());
        this.f54037p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10677j());
        this.f54038q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10676i());
        this.f54039r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C10675h());
        this.f54040s = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C10673f());
        this.f54041t = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C10674g());
        this.f54042u = m129210a6;
        this.f54043v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_to_info);
        this.f54044w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_name_to_tag);
        this.f54045x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_size);
        this.f54046y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_padding_horizontal);
        this.f54047z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_padding_vertical);
        this.f54030A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_indent);
        this.f54032C = -1;
    }

    private final AvatarImageView getAivAvatar() {
        Object value = this.f54037p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (AvatarImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DescriptionCommentLayout getLytDescription() {
        Object value = this.f54041t.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (DescriptionCommentLayout) value;
    }

    private final OverScrollableRecyclerView getRvCta() {
        Object value = this.f54042u.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (OverScrollableRecyclerView) value;
    }

    private final View getTagAuthor() {
        Object value = this.f54040s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EllipsizedTextView getTxtDescription() {
        Object value = this.f54039r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (EllipsizedTextView) value;
    }

    private final FitUsernameTextView getTxtName() {
        Object value = this.f54038q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FitUsernameTextView) value;
    }

    /* renamed from: g */
    public final void m55720g(C2482a c2482a, C31158d.a aVar) {
        C31158d c31158d;
        AbstractC19074t.m100208f(c2482a, "desc");
        AbstractC19074t.m100208f(aVar, "callback");
        AvatarImageView.m55927l(getAivAvatar(), c2482a.m12538d(), c2482a.m12539e(), c2482a.m12537c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
        getAivAvatar().setCornerRadius(AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp));
        getAivAvatar().setChannelIconVisible(true);
        getTxtName().setText(c2482a.m12539e());
        String m12540f = c2482a.m12540f();
        if (m12540f != null) {
            getTxtName().setVerifiedIcon(m12540f);
        }
        if (c2482a.m12541g()) {
            getTxtDescription().setMaxLines(Integer.MAX_VALUE);
        } else {
            getTxtDescription().setMaxLines(3);
        }
        getTxtDescription().setEllipsizedMaxLine(2);
        EllipsizedTextView txtDescription = getTxtDescription();
        SpannableString spannableString = new SpannableString(AbstractC26112n.m134366G(this, AbstractC27413h.zch_text_ellipsis_see_more, new Object[0]));
        spannableString.setSpan(new C10669b(c2482a), 1, spannableString.length(), 17);
        txtDescription.setEllipsisText(spannableString);
        EllipsizedTextView txtDescription2 = getTxtDescription();
        SpannableString spannableString2 = new SpannableString(c2482a.m12536b());
        Matcher matcher = Pattern.compile("#\\w+").matcher(spannableString2);
        while (matcher.find()) {
            spannableString2.setSpan(new C10670c(matcher.group()), matcher.start(), matcher.end(), 17);
            spannableString2.setSpan(new C10671d(), matcher.start(), matcher.end(), 17);
        }
        txtDescription2.setText(spannableString2);
        getLytDescription().setOnLongTouchDesc(new C10672e());
        AbstractC26112n.m134431w0(getLytDescription());
        List m12535a = c2482a.m12535a();
        if (m12535a != null && !m12535a.isEmpty()) {
            AbstractC26112n.m134431w0(getRvCta());
            if (getRvCta().getLayoutManager() == null) {
                getRvCta().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                C31158d c31158d2 = new C31158d();
                c31158d2.m151527P(aVar);
                c31158d2.m151528Q(c2482a.m12535a());
                getRvCta().setAdapter(c31158d2);
                return;
            }
            RecyclerView.AbstractC1880g adapter = getRvCta().getAdapter();
            if (adapter instanceof C31158d) {
                c31158d = (C31158d) adapter;
            } else {
                c31158d = null;
            }
            if (c31158d != null && c2482a.m12535a() != c31158d.m151523L()) {
                c31158d.m151528Q(c2482a.m12535a());
                c31158d.m10008p();
                return;
            }
            return;
        }
        AbstractC26112n.m134367H(getRvCta());
    }

    /* renamed from: h */
    public final void m55721h() {
        this.f54032C = -1;
        this.f54033D = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f54046y + this.f54030A;
        int i16 = this.f54047z;
        AbstractC26112n.m134383X(getAivAvatar(), i16, i15);
        int i17 = i15 + this.f54045x + this.f54043v;
        AbstractC26112n.m134383X(getTxtName(), i16, i17);
        if (AbstractC26112n.m134378S(getTagAuthor())) {
            int measuredWidth = i17 + getTxtName().getMeasuredWidth() + this.f54044w;
            AbstractC26112n.m134383X(getTagAuthor(), i16 + ((AbstractC26112n.m134428v(getTxtName()) - getTagAuthor().getMeasuredHeight()) / 2), measuredWidth);
        }
        AbstractC26112n.m134383X(getLytDescription(), getTxtName().getBottom(), getTxtName().getLeft());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:            if (r4 <= r9) goto L30;     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        View view;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int i14 = this.f54046y;
        int i15 = ((((size - i14) - this.f54030A) - this.f54045x) - this.f54043v) - i14;
        AvatarImageView aivAvatar = getAivAvatar();
        int i16 = this.f54045x;
        AbstractC26112n.m134387a0(aivAvatar, i16, 1073741824, i16, 1073741824);
        if (AbstractC26112n.m134378S(getTagAuthor())) {
            AbstractC26112n.m134387a0(getTagAuthor(), 0, 0, 0, 0);
            i15 -= getTagAuthor().getMeasuredWidth() + this.f54044w;
        }
        AbstractC26112n.m134387a0(getTxtName(), i15, 1073741824, 0, 0);
        AbstractC26112n.m134387a0(getLytDescription(), i15, 1073741824, (View.MeasureSpec.getSize(i12) - getTxtName().getMeasuredHeight()) - this.f54047z, Integer.MIN_VALUE);
        int i17 = this.f54047z;
        int max = Math.max(this.f54045x + i17, i17 + getTxtName().getMeasuredHeight() + getLytDescription().getMeasuredHeight());
        if (getTxtDescription().getMeasuredHeight() > 0 && this.f54032C != max && !getLytDescription().m56255f()) {
            boolean z12 = true;
            if (getTxtDescription().getMaxLines() > 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object parent = getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            int i18 = this.f54046y;
            if (view != null) {
                i13 = ((view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - i18;
            } else {
                i13 = 0;
            }
            if (z11) {
                float lineCount = getTxtDescription().getLayout().getLineCount() * Math.abs(getTxtDescription().getPaint().getFontMetrics().bottom - getTxtDescription().getPaint().getFontMetrics().top);
                if (this.f54033D) {
                }
            }
            z12 = false;
            InterfaceC18511r interfaceC18511r = this.f54031B;
            if (interfaceC18511r != null) {
                interfaceC18511r.mo49340Uc(Integer.valueOf(i13), Integer.valueOf(max), Boolean.valueOf(z11), Boolean.valueOf(z12));
            }
            this.f54032C = max;
            if (z12) {
                this.f54033D = false;
            }
        }
        setMeasuredDimension(size, max);
    }

    public final void setOnClickChannel(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "onClickChannel");
        getAivAvatar().setOnClickListener(onClickListener);
    }

    public final void setOnClickExpand(InterfaceC18505l interfaceC18505l) {
        this.f54036G = interfaceC18505l;
    }

    public final void setOnClickHashTag(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onClickHashTag");
        this.f54034E = interfaceC18505l;
    }

    public final void setOnItemHeightChange(InterfaceC18511r interfaceC18511r) {
        this.f54031B = interfaceC18511r;
    }

    public final void setOnLongClick(InterfaceC18505l interfaceC18505l) {
        this.f54035F = interfaceC18505l;
    }
}
