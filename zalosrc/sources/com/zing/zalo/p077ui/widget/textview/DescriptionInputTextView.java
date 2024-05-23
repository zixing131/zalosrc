package com.zing.zalo.p077ui.widget.textview;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.DescriptionInputTextView;
import com.zing.zalo.social.controls.C10882u;
import com.zing.zalo.zview.dialog.AbstractC17464e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import mm0.AbstractC23356k;

/* loaded from: classes6.dex */
public class DescriptionInputTextView extends RobotoTextView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC17463d.e, InterfaceC17463d.c {

    /* renamed from: A */
    String f71406A;

    /* renamed from: B */
    CharSequence f71407B;

    /* renamed from: C */
    KeyEventCallbackC17462c f71408C;

    /* renamed from: D */
    CharSequence f71409D;

    /* renamed from: E */
    InterfaceC13796a f71410E;

    /* renamed from: F */
    InterfaceC13797b f71411F;

    /* renamed from: G */
    int f71412G;

    /* renamed from: H */
    String f71413H;

    /* renamed from: I */
    EditText f71414I;

    /* renamed from: com.zing.zalo.ui.widget.textview.DescriptionInputTextView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13796a {
        /* renamed from: a */
        void mo77046a(String str);
    }

    /* renamed from: com.zing.zalo.ui.widget.textview.DescriptionInputTextView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13797b {
        /* renamed from: a */
        void mo39224a();
    }

    public DescriptionInputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71412G = 25;
        m77040j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ boolean m77039l(TextView textView, int i11, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        String trim;
        if (i11 != -2) {
            if (i11 == -1 && (trim = this.f71414I.getText().toString().trim()) != null) {
                AbstractC2379w.m12430d(this.f71414I);
                AbstractC17464e.m92878d(this.f71408C);
                setDescription(trim);
                InterfaceC13796a interfaceC13796a = this.f71410E;
                if (interfaceC13796a != null) {
                    interfaceC13796a.mo77046a(trim);
                }
                this.f71414I.setText("");
                return;
            }
            return;
        }
        AbstractC2379w.m12430d(this.f71414I);
        AbstractC17464e.m92878d(this.f71408C);
        this.f71414I.setText("");
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        InterfaceC13797b interfaceC13797b = this.f71411F;
        if (interfaceC13797b != null) {
            interfaceC13797b.mo39224a();
        }
    }

    public String getDescription() {
        String str = this.f71406A;
        if (str != null && !str.contentEquals(this.f71409D)) {
            return this.f71406A;
        }
        return "";
    }

    /* renamed from: j */
    void m77040j() {
        this.f71409D = AbstractC23136l9.m118743r0(AbstractC8020f0.description_input_text_hint_caption_empty);
        m77042m();
        setOnClickListener(this);
    }

    /* renamed from: k */
    public boolean m77041k() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f71408C;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    void m77042m() {
        if (TextUtils.isEmpty(this.f71406A)) {
            this.f71407B = this.f71409D;
        } else {
            String str = this.f71406A;
            if (str.length() > this.f71412G) {
                str = this.f71406A.substring(0, this.f71412G) + "...";
            }
            Spanned fromHtml = Html.fromHtml(String.format("%s <a href=\"cmd://EditDescription/\"></a>", AbstractC23356k.m122797c(str, new String[]{"&", "<", ">", "\"", "'", "/"}, new String[]{"&amp;", "&lt;", "&gt;", "&quot;", "&#x27;", "&#x2F;"})));
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    spannableString.setSpan(new C10882u(getContext(), ((URLSpan) obj).getURL(), spanStart, spanEnd), spanStart, spanEnd, spanFlags);
                }
            }
            this.f71407B = spannableString;
        }
        setText(this.f71407B);
    }

    /* renamed from: n */
    public void m77043n() {
        this.f71406A = "";
        m77042m();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m77045q();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        AbstractC17464e.m92878d(this.f71408C);
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public void m77044p() {
        EditText editText = this.f71414I;
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
        AbstractC17464e.m92878d(this.f71408C);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
    /* renamed from: p7 */
    public void mo13013p7(InterfaceC17463d interfaceC17463d) {
        AbstractC17464e.m92878d(this.f71408C);
    }

    /* renamed from: q */
    public void m77045q() {
        try {
            AbstractC17464e.m92878d(this.f71408C);
            C8009j.a aVar = new C8009j.a(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.description_input_layout, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(AbstractC6918a0.description_input_edit_text);
            this.f71414I = editText;
            editText.setCompoundDrawablePadding(AbstractC23222t7.f112556e);
            String str = this.f71413H;
            if (str != null) {
                this.f71414I.setHint(str);
            }
            this.f71414I.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: qb0.a
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m77039l;
                    m77039l = DescriptionInputTextView.m77039l(textView, i11, keyEvent);
                    return m77039l;
                }
            });
            if (!TextUtils.isEmpty(this.f71406A)) {
                this.f71414I.setText(this.f71406A);
                this.f71414I.setSelection(this.f71406A.length());
            }
            aVar.m43177z(inflate);
            aVar.m43171t(AbstractC8020f0.description_input_text_popup_title);
            aVar.m43154c(false);
            aVar.m43164m(AbstractC8020f0.cancel, this);
            aVar.m43169r(AbstractC8020f0.f43842ok, this);
            aVar.m43167p(this);
            C8009j m43152a = aVar.m43152a();
            this.f71408C = m43152a;
            m43152a.m92867k().m92890I(37);
            this.f71408C.m92874z(false);
            this.f71408C.m92855F(this);
            this.f71408C.mo13822K();
            this.f71414I.requestFocus();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("View", e11);
        }
    }

    public void setDescription(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setDescription:");
        sb2.append(str);
        String str2 = this.f71406A;
        if ((str2 != null && str2.equals(str)) || this.f71409D.equals(str)) {
            return;
        }
        this.f71406A = str;
        m77042m();
    }

    public void setDescriptionChangedListener(InterfaceC13796a interfaceC13796a) {
        this.f71410E = interfaceC13796a;
    }

    public void setDialogDismissListener(InterfaceC13797b interfaceC13797b) {
        this.f71411F = interfaceC13797b;
    }

    public void setDialogInputHint(String str) {
        this.f71413H = str;
    }

    public void setDisplayHint(CharSequence charSequence) {
        this.f71409D = charSequence;
        m77042m();
    }

    public void setDisplayLength(int i11) {
        this.f71412G = i11;
    }
}
