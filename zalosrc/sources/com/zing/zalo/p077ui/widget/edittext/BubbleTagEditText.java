package com.zing.zalo.p077ui.widget.edittext;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ActionEditText;
import ed0.AbstractC18391a;

/* loaded from: classes6.dex */
public class BubbleTagEditText extends LinearLayout {

    /* renamed from: A */
    boolean f70243A;

    /* renamed from: p */
    Context f70244p;

    /* renamed from: q */
    View f70245q;

    /* renamed from: r */
    View f70246r;

    /* renamed from: s */
    RobotoTextView f70247s;

    /* renamed from: t */
    ActionEditText f70248t;

    /* renamed from: u */
    ImageView f70249u;

    /* renamed from: v */
    boolean f70250v;

    /* renamed from: w */
    boolean f70251w;

    /* renamed from: x */
    String f70252x;

    /* renamed from: y */
    String f70253y;

    /* renamed from: z */
    View.OnFocusChangeListener f70254z;

    /* loaded from: classes6.dex */
    private static class TagSpan extends ForegroundColorSpan {
        TagSpan() {
            super(AbstractC11531v0.m62222Y2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.edittext.BubbleTagEditText$a */
    /* loaded from: classes6.dex */
    public class C13623a extends AbstractC18391a {
        C13623a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BubbleTagEditText bubbleTagEditText = BubbleTagEditText.this;
            if (!bubbleTagEditText.f70250v) {
                if (bubbleTagEditText.f70251w) {
                    bubbleTagEditText.m76205h();
                    return;
                } else {
                    if (editable.length() > 20) {
                        BubbleTagEditText bubbleTagEditText2 = BubbleTagEditText.this;
                        bubbleTagEditText2.f70248t.setText(bubbleTagEditText2.m76212p(editable.toString(), false));
                        BubbleTagEditText.this.f70248t.setSelection(20);
                        return;
                    }
                    return;
                }
            }
            bubbleTagEditText.f70251w = true;
            bubbleTagEditText.setBackgroundState(true);
            BubbleTagEditText.this.f70250v = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.edittext.BubbleTagEditText$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13624b {
    }

    /* renamed from: com.zing.zalo.ui.widget.edittext.BubbleTagEditText$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC13625c {
    }

    public BubbleTagEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m76205h() {
        this.f70251w = false;
        setBackgroundState(false);
        ActionEditText actionEditText = this.f70248t;
        actionEditText.setText(m76212p(actionEditText.getText().toString(), false));
        ActionEditText actionEditText2 = this.f70248t;
        actionEditText2.setSelection(actionEditText2.length());
    }

    /* renamed from: i */
    private void m76206i() {
        if (!this.f70243A && this.f70248t.length() <= 0) {
            this.f70247s.setText(this.f70253y);
            this.f70249u.setVisibility(8);
        } else {
            this.f70249u.setVisibility(0);
            this.f70247s.setText(this.f70252x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m76207j(View view, boolean z11) {
        this.f70243A = z11;
        m76206i();
        View.OnFocusChangeListener onFocusChangeListener = this.f70254z;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m76208k(int i11, int i12) {
        if (this.f70251w) {
            if (i11 != i12) {
                ActionEditText actionEditText = this.f70248t;
                actionEditText.setSelection(0, actionEditText.length());
            } else {
                ActionEditText actionEditText2 = this.f70248t;
                actionEditText2.setSelection(actionEditText2.length());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m76209l(View view) {
        ActionEditText actionEditText = this.f70248t;
        if (actionEditText != null) {
            actionEditText.setText("");
        }
        m76206i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m76210m(View view) {
        AbstractC2379w.m12433g(this.f70248t, 0);
    }

    /* renamed from: n */
    private void m76211n() {
        View inflate = LayoutInflater.from(this.f70244p).inflate(AbstractC7409c0.bubble_edit_text_layout, (ViewGroup) this, true);
        this.f70245q = inflate;
        this.f70246r = inflate.findViewById(AbstractC6918a0.bubble_container);
        this.f70247s = (RobotoTextView) this.f70245q.findViewById(AbstractC6918a0.prefix_tv);
        ActionEditText actionEditText = (ActionEditText) this.f70245q.findViewById(AbstractC6918a0.edit_text);
        this.f70248t = actionEditText;
        actionEditText.addTextChangedListener(new C13623a());
        this.f70248t.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.widget.edittext.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BubbleTagEditText.this.m76207j(view, z11);
            }
        });
        this.f70248t.setSelectionChangedListener(new ActionEditText.InterfaceC16449b() { // from class: com.zing.zalo.ui.widget.edittext.b
            @Override // com.zing.zalo.uicontrol.ActionEditText.InterfaceC16449b
            /* renamed from: a */
            public final void mo76217a(int i11, int i12) {
                BubbleTagEditText.this.m76208k(i11, i12);
            }
        });
        ImageView imageView = (ImageView) this.f70245q.findViewById(AbstractC6918a0.clear_btn);
        this.f70249u = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.edittext.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BubbleTagEditText.this.m76209l(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.edittext.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BubbleTagEditText.this.m76210m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public String m76212p(String str, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 20) {
                String substring = str.substring(0, 20);
                if (z11) {
                    return substring + (char) 8230;
                }
                return substring;
            }
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundState(boolean z11) {
        View view = this.f70246r;
        if (view != null) {
            if (z11) {
                view.setBackgroundResource(AbstractC16803z.bubble_edit_text_background_state_selected);
            } else {
                view.setBackgroundResource(AbstractC16803z.bubble_edit_text_background_state_normal);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        ActionEditText actionEditText = this.f70248t;
        if (actionEditText != null) {
            actionEditText.clearFocus();
        }
    }

    public String getCurPhaseText() {
        return this.f70248t.getText().toString();
    }

    public void setHint(String str) {
        this.f70253y = str;
        if (this.f70247s != null && !hasFocus()) {
            this.f70247s.setText(str);
        }
    }

    public void setMinWidth(int i11) {
        this.f70246r.setMinimumWidth(i11);
    }

    public void setOnClearBtnClickListenter(InterfaceC13624b interfaceC13624b) {
    }

    public void setOnClearTagListener(InterfaceC13625c interfaceC13625c) {
    }

    public void setOnEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f70254z = onFocusChangeListener;
    }

    public void setPrefix(String str) {
        this.f70252x = str;
        if (this.f70247s != null && hasFocus()) {
            this.f70247s.setText(str);
        }
    }

    public void setTagText(String str) {
        this.f70250v = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m76212p(str, true));
        spannableStringBuilder.setSpan(new TagSpan(), 0, spannableStringBuilder.length(), 33);
        this.f70248t.setText(spannableStringBuilder);
        this.f70248t.setSelection(spannableStringBuilder.length());
    }

    public void setText(String str) {
        ActionEditText actionEditText = this.f70248t;
        if (actionEditText != null) {
            actionEditText.setText(m76212p(str, false));
        }
    }

    public BubbleTagEditText(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public BubbleTagEditText(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f70250v = false;
        this.f70251w = false;
        this.f70252x = "";
        this.f70253y = "";
        this.f70243A = false;
        this.f70244p = context;
        m76211n();
    }
}
