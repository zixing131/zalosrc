package com.zing.zalo.dialog;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.EditableDialog;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.List;
import jn0.AbstractC21317c;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24342w;
import p227i3.C20215s;
import p262jb.AbstractC21196a;

/* loaded from: classes3.dex */
public class EditableDialog extends DialogView {

    /* renamed from: H0 */
    private String f43481H0;

    /* renamed from: I0 */
    private String f43482I0;

    /* renamed from: J0 */
    private String f43483J0;

    /* renamed from: K0 */
    private String f43484K0;

    /* renamed from: L0 */
    private InterfaceC7977a f43485L0;

    /* renamed from: M0 */
    private String f43486M0;

    /* renamed from: N0 */
    private String f43487N0;

    /* renamed from: O0 */
    private String f43488O0;

    /* renamed from: P0 */
    private int f43489P0;

    /* renamed from: Q0 */
    private List f43490Q0;

    /* renamed from: R0 */
    private boolean f43491R0;

    /* renamed from: S0 */
    private LinearLayout f43492S0;

    /* renamed from: T0 */
    private EditTextWithContextMenu f43493T0;

    /* renamed from: U0 */
    private RobotoTextView f43494U0;

    /* renamed from: V0 */
    private TextView f43495V0;

    /* renamed from: W0 */
    private int f43496W0 = -1;

    /* renamed from: X0 */
    private final Handler f43497X0 = new Handler(Looper.getMainLooper());

    /* renamed from: Y0 */
    private Runnable f43498Y0;

    /* renamed from: com.zing.zalo.dialog.EditableDialog$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7977a {
        /* renamed from: a */
        void mo42928a(String str);
    }

    /* renamed from: com.zing.zalo.dialog.EditableDialog$b */
    /* loaded from: classes3.dex */
    public static final class C7978b implements TextWatcher {

        /* renamed from: q */
        final /* synthetic */ C19059j0 f43500q;

        C7978b(C19059j0 c19059j0) {
            this.f43500q = c19059j0;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            int i11;
            boolean z12;
            CharSequence m127168X0;
            RobotoTextView robotoTextView = EditableDialog.this.f43494U0;
            TextView textView = null;
            if (robotoTextView == null) {
                AbstractC19074t.m100223u("btnClear");
                robotoTextView = null;
            }
            if (editable != null && editable.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            robotoTextView.setEnabled(!z11);
            if (!EditableDialog.this.m42915dL()) {
                TextView textView2 = EditableDialog.this.f43495V0;
                if (textView2 == null) {
                    AbstractC19074t.m100223u("btnPositive");
                } else {
                    textView = textView2;
                }
                if (editable != null) {
                    m127168X0 = AbstractC24342w.m127168X0(editable.toString());
                    if (m127168X0.toString().length() > 0) {
                        z12 = true;
                        textView.setEnabled(z12);
                    }
                }
                z12 = false;
                textView.setEnabled(z12);
            }
            if (EditableDialog.this.m42916eL() > 0) {
                if (editable != null) {
                    i11 = editable.length();
                } else {
                    i11 = 0;
                }
                TextView textView3 = (TextView) this.f43500q.f94941p;
                if (textView3 != null) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(EditableDialog.this.m42916eL())}, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                    textView3.setText(format);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public static final void m42910fL(EditableDialog editableDialog, View view) {
        AbstractC19074t.m100208f(editableDialog, "this$0");
        EditTextWithContextMenu editTextWithContextMenu = editableDialog.f43493T0;
        if (editTextWithContextMenu == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu = null;
        }
        editTextWithContextMenu.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gL */
    public static final void m42911gL(List list, EditableDialog editableDialog, View view) {
        AbstractC19074t.m100208f(editableDialog, "this$0");
        if (list != null && list.size() > 1) {
            int mo110378f = AbstractC21317c.f103810p.mo110378f(0, list.size());
            while (editableDialog.f43496W0 == mo110378f) {
                mo110378f = AbstractC21317c.f103810p.mo110378f(0, list.size());
            }
            editableDialog.f43496W0 = mo110378f;
            EditTextWithContextMenu editTextWithContextMenu = editableDialog.f43493T0;
            if (editTextWithContextMenu == null) {
                AbstractC19074t.m100223u("editText");
                editTextWithContextMenu = null;
            }
            editTextWithContextMenu.setText((CharSequence) list.get(editableDialog.f43496W0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hL */
    public static final void m42912hL(EditableDialog editableDialog, View view) {
        AbstractC19074t.m100208f(editableDialog, "this$0");
        EditTextWithContextMenu editTextWithContextMenu = editableDialog.f43493T0;
        if (editTextWithContextMenu == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu = null;
        }
        AbstractC2379w.m12430d(editTextWithContextMenu);
        editableDialog.dismiss();
        InterfaceC17463d.c cVar = editableDialog.f88680E0;
        if (cVar != null) {
            cVar.mo13013p7(editableDialog.m92594JK());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public static final void m42913iL(EditableDialog editableDialog, View view) {
        AbstractC19074t.m100208f(editableDialog, "this$0");
        EditTextWithContextMenu editTextWithContextMenu = editableDialog.f43493T0;
        String str = null;
        if (editTextWithContextMenu == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu = null;
        }
        AbstractC2379w.m12430d(editTextWithContextMenu);
        editableDialog.dismiss();
        InterfaceC7977a interfaceC7977a = editableDialog.f43485L0;
        if (interfaceC7977a != null) {
            EditTextWithContextMenu editTextWithContextMenu2 = editableDialog.f43493T0;
            if (editTextWithContextMenu2 == null) {
                AbstractC19074t.m100223u("editText");
                editTextWithContextMenu2 = null;
            }
            Editable text = editTextWithContextMenu2.getText();
            if (text != null) {
                str = text.toString();
            }
            interfaceC7977a.mo42928a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jL */
    public static final void m42914jL(EditableDialog editableDialog) {
        AbstractC19074t.m100208f(editableDialog, "this$0");
        EditTextWithContextMenu editTextWithContextMenu = editableDialog.f43493T0;
        if (editTextWithContextMenu == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu = null;
        }
        AbstractC2379w.m12432f(editTextWithContextMenu);
        editableDialog.f43498Y0 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List list;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        m92596NK(false);
        LinearLayout linearLayout = new LinearLayout(m92689tK);
        this.f43492S0 = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.f43492S0;
        if (linearLayout2 == null) {
            AbstractC19074t.m100223u("contentView");
            linearLayout2 = null;
        }
        linearLayout2.setBackgroundResource(AbstractC16803z.editable_dialog_bg);
        LinearLayout linearLayout3 = this.f43492S0;
        if (linearLayout3 == null) {
            AbstractC19074t.m100223u("contentView");
            linearLayout3 = null;
        }
        linearLayout3.setMinimumWidth(m92689tK.getResources().getDimensionPixelSize(AbstractC16802y.dialog_min_width));
        FrameLayout frameLayout = new FrameLayout(m92689tK);
        LinearLayout linearLayout4 = this.f43492S0;
        if (linearLayout4 == null) {
            AbstractC19074t.m100223u("contentView");
            linearLayout4 = null;
        }
        linearLayout4.addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        String str = this.f43481H0;
        if (str != null && str.length() != 0) {
            RobotoTextView robotoTextView = new RobotoTextView(m92689tK);
            robotoTextView.setTextColor(C23212s8.m119607o(m92689tK, AbstractC21196a.TextColor1));
            robotoTextView.setFontStyle(7);
            robotoTextView.setTextSize(0, m92689tK.getResources().getDimensionPixelSize(AbstractC16802y.f1b));
            robotoTextView.setText(this.f43481H0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            frameLayout.addView(robotoTextView, layoutParams);
        }
        String str2 = this.f43482I0;
        if (str2 != null && str2.length() != 0) {
            RobotoTextView robotoTextView2 = new RobotoTextView(m92689tK);
            robotoTextView2.setTextColor(AbstractC1388a.m6961c(m92689tK, AbstractC16801x.cMtxt2));
            robotoTextView2.setTextSize(0, m92689tK.getResources().getDimensionPixelSize(AbstractC16802y.f85293f0));
            robotoTextView2.setText(this.f43482I0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
            LinearLayout linearLayout5 = this.f43492S0;
            if (linearLayout5 == null) {
                AbstractC19074t.m100223u("contentView");
                linearLayout5 = null;
            }
            linearLayout5.addView(robotoTextView2, layoutParams2);
        }
        LinearLayout linearLayout6 = new LinearLayout(m92689tK);
        linearLayout6.setOrientation(1);
        linearLayout6.setBackgroundResource(AbstractC16803z.bg_edit_text_border);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(4.0f));
        ViewGroup viewGroup2 = this.f43492S0;
        ViewGroup viewGroup3 = viewGroup2;
        if (viewGroup2 == null) {
            AbstractC19074t.m100223u("contentView");
            viewGroup3 = null;
        }
        viewGroup3.addView(linearLayout6, layoutParams3);
        EditTextWithContextMenu editTextWithContextMenu = new EditTextWithContextMenu(m92689tK);
        this.f43493T0 = editTextWithContextMenu;
        editTextWithContextMenu.setUseContextMenuPopup(true);
        EditTextWithContextMenu editTextWithContextMenu2 = this.f43493T0;
        if (editTextWithContextMenu2 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu2 = null;
        }
        editTextWithContextMenu2.setBackground(null);
        EditTextWithContextMenu editTextWithContextMenu3 = this.f43493T0;
        if (editTextWithContextMenu3 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu3 = null;
        }
        editTextWithContextMenu3.setTextColor(C23212s8.m119607o(m92689tK, AbstractC21196a.TextColor1));
        EditTextWithContextMenu editTextWithContextMenu4 = this.f43493T0;
        if (editTextWithContextMenu4 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu4 = null;
        }
        editTextWithContextMenu4.setHintTextColor(C23212s8.m119607o(m92689tK, AbstractC16781w.TextColor3));
        EditTextWithContextMenu editTextWithContextMenu5 = this.f43493T0;
        if (editTextWithContextMenu5 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu5 = null;
        }
        editTextWithContextMenu5.setTextSize(0, m92689tK.getResources().getDimensionPixelSize(AbstractC16802y.f85293f0));
        EditTextWithContextMenu editTextWithContextMenu6 = this.f43493T0;
        if (editTextWithContextMenu6 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu6 = null;
        }
        editTextWithContextMenu6.setLines(4);
        EditTextWithContextMenu editTextWithContextMenu7 = this.f43493T0;
        if (editTextWithContextMenu7 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu7 = null;
        }
        editTextWithContextMenu7.setGravity(8388659);
        EditTextWithContextMenu editTextWithContextMenu8 = this.f43493T0;
        if (editTextWithContextMenu8 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu8 = null;
        }
        editTextWithContextMenu8.setHint(this.f43484K0);
        EditTextWithContextMenu editTextWithContextMenu9 = this.f43493T0;
        if (editTextWithContextMenu9 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu9 = null;
        }
        editTextWithContextMenu9.setText(this.f43483J0);
        EditTextWithContextMenu editTextWithContextMenu10 = this.f43493T0;
        if (editTextWithContextMenu10 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu10 = null;
        }
        editTextWithContextMenu10.setMovementMethod(new ScrollingMovementMethod());
        EditTextWithContextMenu editTextWithContextMenu11 = this.f43493T0;
        if (editTextWithContextMenu11 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu11 = null;
        }
        EditTextWithContextMenu editTextWithContextMenu12 = this.f43493T0;
        if (editTextWithContextMenu12 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu12 = null;
        }
        editTextWithContextMenu11.setInputType(editTextWithContextMenu12.getInputType() | 1);
        EditTextWithContextMenu editTextWithContextMenu13 = this.f43493T0;
        if (editTextWithContextMenu13 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu13 = null;
        }
        editTextWithContextMenu13.setLongClickable(true);
        EditTextWithContextMenu editTextWithContextMenu14 = this.f43493T0;
        if (editTextWithContextMenu14 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu14 = null;
        }
        editTextWithContextMenu14.setTextIsSelectable(true);
        EditTextWithContextMenu editTextWithContextMenu15 = this.f43493T0;
        if (editTextWithContextMenu15 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu15 = null;
        }
        editTextWithContextMenu15.setFocusableInTouchMode(true);
        C19059j0 c19059j0 = new C19059j0();
        if (this.f43489P0 > 0) {
            InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(this.f43489P0)};
            EditTextWithContextMenu editTextWithContextMenu16 = this.f43493T0;
            if (editTextWithContextMenu16 == null) {
                AbstractC19074t.m100223u("editText");
                editTextWithContextMenu16 = null;
            }
            editTextWithContextMenu16.setFilters(inputFilterArr);
            RobotoTextView robotoTextView3 = new RobotoTextView(m92689tK);
            c19059j0.f94941p = robotoTextView3;
            robotoTextView3.setTextColor(C23212s8.m119607o(m92689tK, AbstractC21196a.TextColor2));
        }
        EditTextWithContextMenu editTextWithContextMenu17 = this.f43493T0;
        if (editTextWithContextMenu17 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu17 = null;
        }
        editTextWithContextMenu17.addTextChangedListener(new C7978b(c19059j0));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
        View view = this.f43493T0;
        if (view == null) {
            AbstractC19074t.m100223u("editText");
            view = null;
        }
        linearLayout6.addView(view, layoutParams4);
        FrameLayout frameLayout2 = new FrameLayout(m92689tK);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 8388613;
        linearLayout6.addView(frameLayout2, layoutParams5);
        RobotoTextView robotoTextView4 = new RobotoTextView(m92689tK);
        this.f43494U0 = robotoTextView4;
        robotoTextView4.setBackgroundResource(AbstractC17466e.list_selector);
        RobotoTextView robotoTextView5 = this.f43494U0;
        if (robotoTextView5 == null) {
            AbstractC19074t.m100223u("btnClear");
            robotoTextView5 = null;
        }
        robotoTextView5.setText(AbstractC8020f0.delete);
        RobotoTextView robotoTextView6 = this.f43494U0;
        if (robotoTextView6 == null) {
            AbstractC19074t.m100223u("btnClear");
            robotoTextView6 = null;
        }
        robotoTextView6.setTextColor(C23212s8.m119607o(m92689tK, AbstractC21196a.TextColor2));
        RobotoTextView robotoTextView7 = this.f43494U0;
        if (robotoTextView7 == null) {
            AbstractC19074t.m100223u("btnClear");
            robotoTextView7 = null;
        }
        robotoTextView7.setOnClickListener(new View.OnClickListener() { // from class: bn.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditableDialog.m42910fL(EditableDialog.this, view2);
            }
        });
        RobotoTextView robotoTextView8 = this.f43494U0;
        if (robotoTextView8 == null) {
            AbstractC19074t.m100223u("btnClear");
            robotoTextView8 = null;
        }
        robotoTextView8.setPadding(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(6.0f));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        RobotoTextView robotoTextView9 = this.f43494U0;
        if (robotoTextView9 == null) {
            AbstractC19074t.m100223u("btnClear");
            robotoTextView9 = null;
        }
        frameLayout2.addView(robotoTextView9, layoutParams6);
        if (c19059j0.f94941p != null) {
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams7.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(6.0f));
            layoutParams7.gravity = 8388613;
            frameLayout2.addView((View) c19059j0.f94941p, layoutParams7);
        }
        EditTextWithContextMenu editTextWithContextMenu18 = this.f43493T0;
        if (editTextWithContextMenu18 == null) {
            AbstractC19074t.m100223u("editText");
            editTextWithContextMenu18 = null;
        }
        Editable text = editTextWithContextMenu18.getText();
        if (text != null && text.length() != 0) {
            EditTextWithContextMenu editTextWithContextMenu19 = this.f43493T0;
            if (editTextWithContextMenu19 == null) {
                AbstractC19074t.m100223u("editText");
                editTextWithContextMenu19 = null;
            }
            EditTextWithContextMenu editTextWithContextMenu20 = this.f43493T0;
            if (editTextWithContextMenu20 == null) {
                AbstractC19074t.m100223u("editText");
                editTextWithContextMenu20 = null;
            }
            Editable text2 = editTextWithContextMenu20.getText();
            AbstractC19074t.m100205c(text2);
            editTextWithContextMenu19.setSelection(text2.length());
            if (this.f43489P0 > 0) {
                EditTextWithContextMenu editTextWithContextMenu21 = this.f43493T0;
                if (editTextWithContextMenu21 == null) {
                    AbstractC19074t.m100223u("editText");
                    editTextWithContextMenu21 = null;
                }
                Editable text3 = editTextWithContextMenu21.getText();
                int length = text3 != null ? text3.length() : 0;
                TextView textView = (TextView) c19059j0.f94941p;
                if (textView != null) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(length), Integer.valueOf(this.f43489P0)}, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                    textView.setText(format);
                }
            }
        }
        String str3 = this.f43488O0;
        if (str3 != null && str3.length() != 0 && (list = this.f43490Q0) != null && !list.isEmpty()) {
            RobotoTextView robotoTextView10 = new RobotoTextView(m92689tK);
            robotoTextView10.setTextColor(AbstractC23136l9.m118645D(m92689tK, AbstractC16801x.bg_btn_type2_text));
            robotoTextView10.setText(this.f43488O0);
            final List list2 = this.f43490Q0;
            robotoTextView10.setEnabled(list2 != null && list2.size() > 1);
            robotoTextView10.setOnClickListener(new View.OnClickListener() { // from class: bn.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EditableDialog.m42911gL(list2, this, view2);
                }
            });
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams8.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
            layoutParams8.gravity = 8388613;
            LinearLayout linearLayout7 = this.f43492S0;
            if (linearLayout7 == null) {
                AbstractC19074t.m100223u("contentView");
                linearLayout7 = null;
            }
            linearLayout7.addView(robotoTextView10, layoutParams8);
        }
        LayoutInflater from = LayoutInflater.from(m92689tK);
        int i11 = AbstractC7409c0.layout_editable_dialog_footer;
        LinearLayout linearLayout8 = this.f43492S0;
        if (linearLayout8 == null) {
            AbstractC19074t.m100223u("contentView");
            linearLayout8 = null;
        }
        View inflate = from.inflate(i11, (ViewGroup) linearLayout8, false);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.confirm_btn_no);
        textView2.setText(AbstractC8020f0.cancel);
        String str4 = this.f43486M0;
        if (str4 != null && str4.length() != 0) {
            textView2.setText(this.f43486M0);
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: bn.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditableDialog.m42912hL(EditableDialog.this, view2);
            }
        });
        View findViewById = inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        TextView textView3 = (TextView) findViewById;
        this.f43495V0 = textView3;
        if (textView3 == null) {
            AbstractC19074t.m100223u("btnPositive");
            textView3 = null;
        }
        textView3.setText(AbstractC8020f0.confirm);
        String str5 = this.f43487N0;
        if (str5 != null && str5.length() != 0) {
            TextView textView4 = this.f43495V0;
            if (textView4 == null) {
                AbstractC19074t.m100223u("btnPositive");
                textView4 = null;
            }
            textView4.setText(this.f43487N0);
        }
        TextView textView5 = this.f43495V0;
        if (textView5 == null) {
            AbstractC19074t.m100223u("btnPositive");
            textView5 = null;
        }
        textView5.setOnClickListener(new View.OnClickListener() { // from class: bn.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditableDialog.m42913iL(EditableDialog.this, view2);
            }
        });
        LinearLayout linearLayout9 = this.f43492S0;
        if (linearLayout9 == null) {
            AbstractC19074t.m100223u("contentView");
            linearLayout9 = null;
        }
        linearLayout9.addView(inflate);
        LinearLayout linearLayout10 = this.f43492S0;
        if (linearLayout10 != null) {
            return linearLayout10;
        }
        AbstractC19074t.m100223u("contentView");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        dismiss();
        Runnable runnable = this.f43498Y0;
        if (runnable != null) {
            Handler handler = this.f43497X0;
            AbstractC19074t.m100205c(runnable);
            handler.removeCallbacks(runnable);
            this.f43498Y0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            Runnable runnable = this.f43498Y0;
            if (runnable != null) {
                Handler handler = this.f43497X0;
                AbstractC19074t.m100205c(runnable);
                handler.removeCallbacks(runnable);
                this.f43498Y0 = null;
            }
            Runnable runnable2 = new Runnable() { // from class: bn.a0
                @Override // java.lang.Runnable
                public final void run() {
                    EditableDialog.m42914jL(EditableDialog.this);
                }
            };
            this.f43498Y0 = runnable2;
            Handler handler2 = this.f43497X0;
            AbstractC19074t.m100205c(runnable2);
            handler2.post(runnable2);
        }
    }

    /* renamed from: dL */
    public final boolean m42915dL() {
        return this.f43491R0;
    }

    /* renamed from: eL */
    public final int m42916eL() {
        return this.f43489P0;
    }

    /* renamed from: kL */
    public final void m42917kL(boolean z11) {
        this.f43491R0 = z11;
    }

    /* renamed from: lL */
    public final void m42918lL(InterfaceC7977a interfaceC7977a) {
        this.f43485L0 = interfaceC7977a;
    }

    /* renamed from: mL */
    public final void m42919mL(String str) {
        this.f43484K0 = str;
    }

    /* renamed from: nL */
    public final void m42920nL(String str) {
        this.f43483J0 = str;
    }

    /* renamed from: oL */
    public final void m42921oL(int i11) {
        this.f43489P0 = i11;
    }

    /* renamed from: pL */
    public final void m42922pL(String str) {
        this.f43482I0 = str;
    }

    /* renamed from: qL */
    public final void m42923qL(String str) {
        this.f43486M0 = str;
    }

    /* renamed from: rL */
    public final void m42924rL(String str) {
        this.f43487N0 = str;
    }

    /* renamed from: sL */
    public final void m42925sL(String str) {
        this.f43488O0 = str;
    }

    /* renamed from: tL */
    public final void m42926tL(List list) {
        this.f43490Q0 = list;
    }

    /* renamed from: uL */
    public final void m42927uL(String str) {
        this.f43481H0 = str;
    }
}
