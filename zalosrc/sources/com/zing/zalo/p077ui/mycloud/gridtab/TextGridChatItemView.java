package com.zing.zalo.p077ui.mycloud.gridtab;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import fn0.AbstractC19074t;
import ib0.C20500d;
import ib0.C20503g;
import kd0.C21691a;
import l80.C22126c0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import nb0.C23671b;
import on0.AbstractC24342w;
import p588vw.C28652r;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;

/* loaded from: classes6.dex */
public final class TextGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    private C16716d f65732A0;

    /* renamed from: B0 */
    private C22126c0 f65733B0;

    /* renamed from: C0 */
    private final int f65734C0;

    /* renamed from: D0 */
    private C20503g f65735D0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.TextGridChatItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12579a extends SimpleAnimationTarget {
        C12579a() {
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            int[] iArr = new int[2];
            TextGridChatItemView.this.getLocationOnScreen(iArr);
            C16716d c16716d = TextGridChatItemView.this.f65732A0;
            if (c16716d == null) {
                AbstractC19074t.m100223u("containerModule");
                c16716d = null;
            }
            int m89098H = c16716d.m89098H() - c16716d.m89106L().f84721q;
            int i11 = iArr[0];
            return new Rect(i11, iArr[1] + m89098H, TextGridChatItemView.this.getWidth() + i11, iArr[1] + TextGridChatItemView.this.getHeight());
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.TextGridChatItemView$b */
    /* loaded from: classes6.dex */
    public static final class C12580b extends C20500d.a {
        C12580b() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            C17945a0 m71033m;
            BaseMyCloudTabView.AbstractC12510b delegate;
            MyCloudMessageItem data = TextGridChatItemView.this.getData();
            if (data != null && (m71033m = data.m71033m()) != null && (delegate = TextGridChatItemView.this.getDelegate()) != null) {
                delegate.mo70395n(m71033m, str);
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: d */
        public void mo35613d() {
            TextGridChatItemView textGridChatItemView;
            BaseMyCloudTabView.AbstractC12510b delegate;
            MyCloudMessageItem data = TextGridChatItemView.this.getData();
            if (data != null && (delegate = (textGridChatItemView = TextGridChatItemView.this).getDelegate()) != null) {
                delegate.mo70404w(data, textGridChatItemView.getAnimationTarget());
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: e */
        public void mo70938e() {
            TextGridChatItemView textGridChatItemView;
            InterfaceC27158o2 selectEventListener;
            MyCloudMessageItem data = TextGridChatItemView.this.getData();
            if (data != null && (selectEventListener = (textGridChatItemView = TextGridChatItemView.this).getSelectEventListener()) != null) {
                InterfaceC27158o2.a.m139263a(selectEventListener, data, textGridChatItemView.getPosition(), null, 4, null);
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: f */
        public void mo70060f(String str) {
            BaseMyCloudTabView.AbstractC12510b delegate = TextGridChatItemView.this.getDelegate();
            if (delegate != null) {
                delegate.mo70398q(str);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.TextGridChatItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12581c extends ClickableSpan {
        C12581c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(TextGridChatItemView.this.getContext(), AbstractC16781w.LinkColor));
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
    }

    public TextGridChatItemView(Context context) {
        super(context);
        this.f65734C0 = AbstractC23222t7.f112576o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static final void m70935a1(TextGridChatItemView textGridChatItemView, C16719g c16719g) {
        BaseMyCloudTabView.AbstractC12510b delegate;
        AbstractC19074t.m100208f(textGridChatItemView, "this$0");
        if (textGridChatItemView.getEnableMultiSelection()) {
            C21691a checkBoxModule = textGridChatItemView.getCheckBoxModule();
            if (checkBoxModule != null) {
                checkBoxModule.mo89091D0(!checkBoxModule.m89141i0());
                return;
            }
            return;
        }
        MyCloudMessageItem data = textGridChatItemView.getData();
        if (data != null && (delegate = textGridChatItemView.getDelegate()) != null) {
            delegate.mo70404w(data, textGridChatItemView.getAnimationTarget());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static final void m70936b1(TextGridChatItemView textGridChatItemView, C16719g c16719g) {
        InterfaceC27158o2 selectEventListener;
        AbstractC19074t.m100208f(textGridChatItemView, "this$0");
        MyCloudMessageItem data = textGridChatItemView.getData();
        if (data != null && (selectEventListener = textGridChatItemView.getSelectEventListener()) != null) {
            InterfaceC27158o2.a.m139263a(selectEventListener, data, textGridChatItemView.getPosition(), null, 4, null);
        }
    }

    /* renamed from: c1 */
    private final SpannableStringBuilder m70937c1(CharSequence charSequence, int i11, int i12) {
        StaticLayout staticLayout;
        int m116584g;
        int m127178g0;
        int m127178g02;
        CharSequence subSequence;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.setTypeface(Typeface.DEFAULT);
        c13704p1.setTextSize(AbstractC23222t7.f112584s);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        ((TextPaint) c13704p1).linkColor = x3Var.m62540U0();
        c13704p1.setColor(x3Var.m62543V0());
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c13704p1, i12);
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            includePad = alignment.setIncludePad(false);
            staticLayout = includePad.build();
        } else {
            staticLayout = new StaticLayout(charSequence, c13704p1, i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        AbstractC19074t.m100205c(staticLayout);
        if (staticLayout.getLineCount() > i11) {
            m116584g = AbstractC22543l.m116584g(staticLayout.getLineCount(), i11 - 2);
            int lineStart = staticLayout.getLineStart(m116584g);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String property = System.getProperty("line.separator");
            if (property == null) {
                property = "\n";
            }
            int i13 = lineStart - 2;
            m127178g0 = AbstractC24342w.m127178g0(charSequence, " ", i13, false, 4, null);
            m127178g02 = AbstractC24342w.m127178g0(charSequence, property, i13, false, 4, null);
            if (m127178g0 > 0) {
                subSequence = charSequence.subSequence(0, m127178g0);
            } else if (m127178g02 > 0) {
                subSequence = charSequence.subSequence(0, m127178g02);
            } else if (i13 > 0) {
                subSequence = charSequence.subSequence(0, i13);
            } else {
                subSequence = charSequence.subSequence(0, charSequence.length() - 2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
            spannableStringBuilder.append((CharSequence) (" … \n\n" + m118743r0));
            spannableStringBuilder.setSpan(new C12581c(), subSequence.length() + 5, subSequence.length() + 5 + m118743r0.length(), 33);
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimationTarget getAnimationTarget() {
        return new C12579a();
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-2, -1).m89031O(AbstractC23222t7.f112576o);
        this.f65732A0 = c16716d;
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_normal));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        C20503g c20503g = new C20503g(false, true);
        this.f65735D0 = c20503g;
        c22126c0.m111955C1(c20503g);
        this.f65733B0 = c22126c0;
        C20503g c20503g2 = this.f65735D0;
        if (c20503g2 != null) {
            c20503g2.m106543g(new C12580b());
        }
        C16716d c16716d2 = this.f65732A0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d2 = null;
        }
        C22126c0 c22126c02 = this.f65733B0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("msgModule");
            c22126c02 = null;
        }
        c16716d2.m89001g1(c22126c02);
        C16716d c16716d3 = this.f65732A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            return null;
        }
        return c16716d3;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (getData() == null) {
            return;
        }
        C16716d c16716d = this.f65732A0;
        CharSequence charSequence3 = null;
        if (c16716d == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d = null;
        }
        c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.i0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                TextGridChatItemView.m70935a1(TextGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d2 = this.f65732A0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d2 = null;
        }
        c16716d2.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.j0
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                TextGridChatItemView.m70936b1(TextGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d3 = this.f65732A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d3 = null;
        }
        if ((getViewOriginalMsgVisible() && getViewOriginalMsgView() != null) || (getHasReply() && getReplyContentView() != null)) {
            c16716d3.m89106L().m89036T(AbstractC23222t7.f112566j);
        } else {
            c16716d3.m89106L().m89036T(AbstractC23222t7.f112576o);
        }
        MyCloudMessageItem data = getData();
        if (data != null) {
            charSequence = data.m71035o();
        } else {
            charSequence = null;
        }
        if (charSequence == null || charSequence.length() == 0) {
            setContentHeight(getContentHeight() - (this.f65734C0 * 2));
            int contentHeight = getContentHeight();
            C22126c0 c22126c0 = this.f65733B0;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("msgModule");
                c22126c0 = null;
            }
            int m111976p1 = contentHeight / c22126c0.m111976p1();
            C22126c0 c22126c02 = this.f65733B0;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("msgModule");
                c22126c02 = null;
            }
            c22126c02.m111953A1(m111976p1);
            MyCloudMessageItem data2 = getData();
            if (data2 == null || (charSequence2 = data2.m71036p()) == null) {
                charSequence2 = "";
            }
            SpannableStringBuilder m70937c1 = m70937c1(charSequence2, m111976p1, getItemWidth() - (this.f65734C0 * 2));
            Object[] spans = m70937c1.getSpans(0, m70937c1.length(), Object.class);
            AbstractC19074t.m100207e(spans, "getSpans(...)");
            for (Object obj : spans) {
                if (obj instanceof C23671b) {
                    C23671b c23671b = (C23671b) obj;
                    c23671b.f114671t = false;
                    if (c23671b.f114664C == 3) {
                        c23671b.f114662A = true;
                    }
                }
            }
            MyCloudMessageItem data3 = getData();
            if (data3 != null) {
                data3.m71041y(C28652r.m143349v().m143356G(m70937c1, AbstractC23222t7.f112584s));
            }
        }
        C22126c0 c22126c03 = this.f65733B0;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("msgModule");
            c22126c03 = null;
        }
        MyCloudMessageItem data4 = getData();
        if (data4 != null) {
            charSequence3 = data4.m71035o();
        }
        c22126c03.m111959G1(charSequence3);
    }
}
