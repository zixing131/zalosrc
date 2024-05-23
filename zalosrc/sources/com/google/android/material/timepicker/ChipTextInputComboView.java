package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC6354u;
import com.google.android.material.textfield.TextInputLayout;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23583h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: p */
    private final Chip f36163p;

    /* renamed from: q */
    private final TextInputLayout f36164q;

    /* renamed from: r */
    private final EditText f36165r;

    /* renamed from: s */
    private TextWatcher f36166s;

    /* renamed from: t */
    private TextView f36167t;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes3.dex */
    private class C6445b extends AbstractC6354u {
        private C6445b() {
        }

        @Override // com.google.android.material.internal.AbstractC6354u, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f36163p.setText(ChipTextInputComboView.this.m33251c("00"));
            } else {
                ChipTextInputComboView.this.f36163p.setText(ChipTextInputComboView.this.m33251c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m33251c(CharSequence charSequence) {
        return TimeModel.m33281a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m33252d() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f36165r.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f36163p.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m33252d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        int i11;
        this.f36163p.setChecked(z11);
        EditText editText = this.f36165r;
        int i12 = 0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        editText.setVisibility(i11);
        Chip chip = this.f36163p;
        if (z11) {
            i12 = 8;
        }
        chip.setVisibility(i12);
        if (isChecked()) {
            this.f36165r.requestFocus();
            if (!TextUtils.isEmpty(this.f36165r.getText())) {
                EditText editText2 = this.f36165r;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f36163p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        this.f36163p.setTag(i11, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f36163p.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(AbstractC23583h.material_time_chip, (ViewGroup) this, false);
        this.f36163p = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(AbstractC23583h.material_time_input, (ViewGroup) this, false);
        this.f36164q = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f36165r = editText;
        editText.setVisibility(4);
        C6445b c6445b = new C6445b();
        this.f36166s = c6445b;
        editText.addTextChangedListener(c6445b);
        m33252d();
        addView(chip);
        addView(textInputLayout);
        this.f36167t = (TextView) findViewById(AbstractC23581f.material_label);
        editText.setSaveEnabled(false);
    }
}
