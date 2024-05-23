package com.zing.zalo.report_v2.reportsummary;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.report_v2.reportsummary.AbstractC9350e;
import com.zing.zalo.report_v2.reportsummary.C9347b;
import com.zing.zalo.report_v2.reportsummary.ReportSummaryReasonItemView;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.RadioButton;
import com.zing.zalo.zdesign.component.TextArea;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ReportSummaryReasonItemView extends ListItem {
    public static final C9338a Companion = new C9338a(null);

    /* renamed from: G */
    private final InterfaceC24854k f49469G;

    /* renamed from: H */
    private final InterfaceC24854k f49470H;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryReasonItemView$a */
    /* loaded from: classes4.dex */
    public static final class C9338a {
        private C9338a() {
        }

        public /* synthetic */ C9338a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryReasonItemView$b */
    /* loaded from: classes4.dex */
    public static final class C9339b implements BaseInputField.InterfaceC16995c {

        /* renamed from: a */
        final /* synthetic */ C9347b.h f49471a;

        C9339b(C9347b.h hVar) {
            this.f49471a = hVar;
        }

        @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField.InterfaceC16995c
        /* renamed from: a */
        public void mo50287a() {
            C9347b.h hVar = this.f49471a;
            if (hVar != null) {
                hVar.mo50313X2(1000);
            }
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryReasonItemView$c */
    /* loaded from: classes4.dex */
    public static final class C9340c implements TextWatcher {

        /* renamed from: p */
        final /* synthetic */ C9347b.h f49472p;

        /* renamed from: q */
        final /* synthetic */ AbstractC9350e.f f49473q;

        /* renamed from: r */
        final /* synthetic */ TextArea f49474r;

        public C9340c(C9347b.h hVar, AbstractC9350e.f fVar, TextArea textArea) {
            this.f49472p = hVar;
            this.f49473q = fVar;
            this.f49474r = textArea;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C9347b.h hVar = this.f49472p;
            if (hVar != null) {
                hVar.mo50311V2((AbstractC9350e.f.b) this.f49473q, String.valueOf(this.f49474r.getEditText().getText()));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryReasonItemView$d */
    /* loaded from: classes4.dex */
    static final class C9341d extends AbstractC19075u implements InterfaceC18494a {
        C9341d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RadioButton mo12V4() {
            Context context = ReportSummaryReasonItemView.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RadioButton radioButton = new RadioButton(context);
            radioButton.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            radioButton.setClickable(false);
            radioButton.setChecked(false);
            return radioButton;
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryReasonItemView$e */
    /* loaded from: classes4.dex */
    static final class C9342e extends AbstractC19075u implements InterfaceC18494a {
        C9342e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextArea mo12V4() {
            int m127173b0;
            String m127114D;
            Context context = ReportSummaryReasonItemView.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            TextArea textArea = new TextArea(context);
            textArea.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            textArea.setMaxLength(1000);
            EditText editText = textArea.getEditText();
            editText.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_hint_input_reason_others));
            editText.setHintTextColor(C23212s8.m119607o(editText.getContext(), AbstractC2807a.text_03));
            editText.setTextColor(C23212s8.m119607o(editText.getContext(), AbstractC2807a.text_01));
            editText.setMinHeight(AbstractC23136l9.m118712h(editText.getContext(), 120.0f));
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_input_reason_others);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
            if (m127173b0 >= 0) {
                m127114D = AbstractC24341v.m127114D(m118743r0, "#x#", "", false, 4, null);
                SpannableString spannableString = new SpannableString(m127114D);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(textArea.getContext(), AbstractC2807a.support_error)), m127173b0, spannableString.length(), 33);
                textArea.setLabel(spannableString);
            }
            return textArea;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportSummaryReasonItemView(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final RadioButton getRadioButtonSelectReason() {
        return (RadioButton) this.f49469G.getValue();
    }

    private final TextArea getTextArea() {
        return (TextArea) this.f49470H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m50285q(C9347b.h hVar, AbstractC9350e.f fVar, View view) {
        AbstractC19074t.m100208f(fVar, "$itemData");
        if (hVar != null) {
            hVar.mo50312W2(fVar);
        }
    }

    /* renamed from: p */
    public final void m50286p(final AbstractC9350e.f fVar, final C9347b.h hVar) {
        int i11;
        AbstractC19074t.m100208f(fVar, "itemData");
        setIdTracking(fVar.m50346c().m125430a());
        setTitle(fVar.m50347d());
        boolean z11 = true;
        boolean z12 = !fVar.m50348e();
        m90592m(z12);
        int i12 = 0;
        if (z12) {
            m90591l(AbstractC23136l9.m118712h(getContext(), 16.0f), 0, 0, 0);
        }
        if (fVar.m50345b()) {
            m90589e(getRadioButtonSelectReason());
            if (hVar == null || !hVar.mo50315m1(fVar)) {
                z11 = false;
            }
            getRadioButtonSelectReason().m90615f(z11, z11);
        } else {
            setTrailingItemVisibility(8);
        }
        ImageView iconChevronRight = getIconChevronRight();
        if (fVar.m50344a()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        iconChevronRight.setVisibility(i11);
        if (fVar instanceof AbstractC9350e.f.b) {
            AbstractC9350e.f.b bVar = (AbstractC9350e.f.b) fVar;
            if (!bVar.m50354k()) {
                getIconChevronRight().setVisibility(8);
            }
            if (bVar.m50353j()) {
                m90585a(getTextArea());
                View belowItem = getBelowItem();
                if (belowItem != null) {
                    int paddingLeft = belowItem.getPaddingLeft();
                    Context context = belowItem.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    belowItem.setPadding(paddingLeft, C27276c.m139648a(context, 16.0f), belowItem.getPaddingRight(), belowItem.getPaddingBottom());
                }
                TextArea textArea = getTextArea();
                textArea.getEditText().setText(bVar.m50352i());
                EditText editText = textArea.getEditText();
                String m50352i = bVar.m50352i();
                if (m50352i != null) {
                    i12 = m50352i.length();
                }
                editText.setSelection(i12);
                textArea.getEditText().addTextChangedListener(new C9340c(hVar, fVar, textArea));
                textArea.setPasteTextLengthExceedListener(new C9339b(hVar));
            } else {
                setBelowItemVisibility(8);
            }
        } else {
            setBelowItemVisibility(8);
        }
        setOnClickListener(new View.OnClickListener() { // from class: sz.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportSummaryReasonItemView.m50285q(C9347b.h.this, fVar, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportSummaryReasonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSummaryReasonItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C9341d());
        this.f49469G = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9342e());
        this.f49470H = m129210a2;
        setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
        setTitleMaxLine(2);
        setTitleColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
    }
}
