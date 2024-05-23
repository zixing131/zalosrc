package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.AbstractC6354u;
import com.google.android.material.textfield.TextInputLayout;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23580e;
import p357n6.AbstractC23585j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.h */
/* loaded from: classes3.dex */
public class C6435h extends AbstractC6432e {

    /* renamed from: d */
    private final TextWatcher f36154d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC6426f f36155e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC6427g f36156f;

    /* renamed from: com.google.android.material.textfield.h$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC6354u {
        a() {
        }

        @Override // com.google.android.material.internal.AbstractC6354u, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            C6435h.this.f36127c.setChecked(!r1.m33234g());
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* loaded from: classes3.dex */
    class b implements TextInputLayout.InterfaceC6426f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC6426f
        /* renamed from: a */
        public void mo33137a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C6435h.this.f36127c.setChecked(!r4.m33234g());
            editText.removeTextChangedListener(C6435h.this.f36154d);
            editText.addTextChangedListener(C6435h.this.f36154d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    /* loaded from: classes3.dex */
    class c implements TextInputLayout.InterfaceC6427g {

        /* renamed from: com.google.android.material.textfield.h$c$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ EditText f36160p;

            a(EditText editText) {
                this.f36160p = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f36160p.removeTextChangedListener(C6435h.this.f36154d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC6427g
        /* renamed from: a */
        public void mo33138a(TextInputLayout textInputLayout, int i11) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i11 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C6435h.this.f36125a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C6435h.this.m33234g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C6435h.this.f36125a.m33124X();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6435h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f36154d = new a();
        this.f36155e = new b();
        this.f36156f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m33234g() {
        EditText editText = this.f36125a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m33235h(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC6432e
    /* renamed from: a */
    public void mo33148a() {
        this.f36125a.setEndIconDrawable(AbstractC19694b.m103336d(this.f36126b, AbstractC23580e.design_password_eye));
        TextInputLayout textInputLayout = this.f36125a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(AbstractC23585j.password_toggle_content_description));
        this.f36125a.setEndIconOnClickListener(new d());
        this.f36125a.m33127e(this.f36155e);
        this.f36125a.m33128f(this.f36156f);
        EditText editText = this.f36125a.getEditText();
        if (m33235h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
