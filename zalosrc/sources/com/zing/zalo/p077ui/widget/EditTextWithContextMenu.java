package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import on0.AbstractC24341v;

/* loaded from: classes6.dex */
public class EditTextWithContextMenu extends RobotoEditText {

    /* renamed from: A */
    private PopupMenu f69208A;

    /* renamed from: B */
    private boolean f69209B;

    /* renamed from: C */
    private AbstractC13498a f69210C;

    /* renamed from: D */
    private Runnable f69211D;

    /* renamed from: z */
    private ClipboardManager f69212z;

    /* renamed from: com.zing.zalo.ui.widget.EditTextWithContextMenu$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC13498a {
        /* renamed from: a */
        public void mo36093a() {
        }

        /* renamed from: b */
        public void mo60447b(CharSequence charSequence, int i11, int i12) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextWithContextMenu(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m75698v(null);
    }

    /* renamed from: B */
    public static final void m75689B(EditTextWithContextMenu editTextWithContextMenu, PopupMenu popupMenu) {
        AbstractC19074t.m100208f(editTextWithContextMenu, "this$0");
        AbstractC19074t.m100208f(popupMenu, "menu");
        PopupMenu popupMenu2 = editTextWithContextMenu.f69208A;
        if (popupMenu2 != null && AbstractC19074t.m100204b(popupMenu2, popupMenu)) {
            editTextWithContextMenu.f69209B = false;
        }
    }

    /* renamed from: C */
    public static final boolean m75690C(EditTextWithContextMenu editTextWithContextMenu, MenuItem menuItem) {
        String m127114D;
        int m116584g;
        int m116580c;
        int m116580c2;
        AbstractC19074t.m100208f(editTextWithContextMenu, "this$0");
        AbstractC19074t.m100208f(menuItem, "item");
        try {
            if (menuItem.getItemId() != 0 && menuItem.getItemId() != 1) {
                if (menuItem.getItemId() == 2) {
                    Editable text = editTextWithContextMenu.getText();
                    AbstractC19074t.m100205c(text);
                    editTextWithContextMenu.setSelection(0, text.length());
                    Runnable runnable = editTextWithContextMenu.f69211D;
                    if (runnable != null) {
                        editTextWithContextMenu.removeCallbacks(runnable);
                        editTextWithContextMenu.f69211D = null;
                    }
                    RunnableC13619e0 runnableC13619e0 = new Runnable() { // from class: com.zing.zalo.ui.widget.e0
                        public /* synthetic */ RunnableC13619e0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EditTextWithContextMenu.m75691D(EditTextWithContextMenu.this);
                        }
                    };
                    editTextWithContextMenu.f69211D = runnableC13619e0;
                    editTextWithContextMenu.post(runnableC13619e0);
                } else if (menuItem.getItemId() == 3) {
                    Editable text2 = editTextWithContextMenu.getText();
                    Editable text3 = editTextWithContextMenu.getText();
                    AbstractC19074t.m100205c(text3);
                    int length = text3.length();
                    Editable text4 = editTextWithContextMenu.getText();
                    AbstractC19074t.m100205c(text4);
                    int length2 = text4.length();
                    if (editTextWithContextMenu.isFocused()) {
                        int selectionStart = editTextWithContextMenu.getSelectionStart();
                        int selectionEnd = editTextWithContextMenu.getSelectionEnd();
                        m116584g = AbstractC22543l.m116584g(selectionStart, selectionEnd);
                        m116580c = AbstractC22543l.m116580c(0, m116584g);
                        m116580c2 = AbstractC22543l.m116580c(selectionStart, selectionEnd);
                        length2 = AbstractC22543l.m116580c(0, m116580c2);
                        length = m116580c;
                    }
                    ClipboardManager clipboardManager = editTextWithContextMenu.f69212z;
                    AbstractC19074t.m100205c(clipboardManager);
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() > 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(editTextWithContextMenu.getContext());
                        Editable text5 = editTextWithContextMenu.getText();
                        AbstractC19074t.m100205c(text5);
                        text5.replace(length, length2, coerceToText);
                        editTextWithContextMenu.setSelection(coerceToText.length() + length);
                    }
                    AbstractC13498a abstractC13498a = editTextWithContextMenu.f69210C;
                    if (abstractC13498a != null) {
                        AbstractC19074t.m100205c(abstractC13498a);
                        abstractC13498a.mo60447b(text2, length, length2);
                    }
                }
                return true;
            }
            int selectionStart2 = editTextWithContextMenu.getSelectionStart();
            int selectionEnd2 = editTextWithContextMenu.getSelectionEnd();
            Editable text6 = editTextWithContextMenu.getText();
            AbstractC19074t.m100205c(text6);
            if (selectionStart2 == text6.length()) {
                selectionStart2 = 0;
            }
            String substring = String.valueOf(editTextWithContextMenu.getText()).substring(selectionStart2, selectionEnd2);
            AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ClipboardManager clipboardManager2 = editTextWithContextMenu.f69212z;
            AbstractC19074t.m100205c(clipboardManager2);
            clipboardManager2.setPrimaryClip(ClipData.newPlainText("", substring));
            if (menuItem.getItemId() == 1) {
                m127114D = AbstractC24341v.m127114D(String.valueOf(editTextWithContextMenu.getText()), substring, "", false, 4, null);
                editTextWithContextMenu.setText(m127114D);
                editTextWithContextMenu.setSelection(selectionStart2);
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: D */
    public static final void m75691D(EditTextWithContextMenu editTextWithContextMenu) {
        AbstractC19074t.m100208f(editTextWithContextMenu, "this$0");
        editTextWithContextMenu.m75697A(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:            if (r3.hasPrimaryClip() != false) goto L27;     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m75696z(EditTextWithContextMenu editTextWithContextMenu, View view) {
        AbstractC19074t.m100208f(editTextWithContextMenu, "this$0");
        boolean z11 = false;
        if (TextUtils.isEmpty(editTextWithContextMenu.getText())) {
            ClipboardManager clipboardManager = editTextWithContextMenu.f69212z;
            AbstractC19074t.m100205c(clipboardManager);
        }
        if (!editTextWithContextMenu.f69209B) {
            if (!editTextWithContextMenu.isFocused()) {
                editTextWithContextMenu.requestFocus();
            }
            if (editTextWithContextMenu.getText() != null) {
                Editable text = editTextWithContextMenu.getText();
                AbstractC19074t.m100205c(text);
                if (text.length() > 0) {
                    int selectionEnd = editTextWithContextMenu.getSelectionEnd();
                    Editable text2 = editTextWithContextMenu.getText();
                    AbstractC19074t.m100205c(text2);
                    if (selectionEnd == text2.length()) {
                        z11 = true;
                    }
                }
            }
            return editTextWithContextMenu.m75697A(z11);
        }
        return false;
    }

    /* renamed from: A */
    public final boolean m75697A(boolean z11) {
        boolean z12;
        if (this.f69208A == null) {
            PopupMenu popupMenu = new PopupMenu(getContext(), this);
            this.f69208A = popupMenu;
            AbstractC19074t.m100205c(popupMenu);
            popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: com.zing.zalo.ui.widget.c0
                public /* synthetic */ C13571c0() {
                }

                @Override // android.widget.PopupMenu.OnDismissListener
                public final void onDismiss(PopupMenu popupMenu2) {
                    EditTextWithContextMenu.m75689B(EditTextWithContextMenu.this, popupMenu2);
                }
            });
            PopupMenu popupMenu2 = this.f69208A;
            AbstractC19074t.m100205c(popupMenu2);
            popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zing.zalo.ui.widget.d0
                public /* synthetic */ C13610d0() {
                }

                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean m75690C;
                    m75690C = EditTextWithContextMenu.m75690C(EditTextWithContextMenu.this, menuItem);
                    return m75690C;
                }
            });
        }
        PopupMenu popupMenu3 = this.f69208A;
        AbstractC19074t.m100205c(popupMenu3);
        popupMenu3.getMenu().clear();
        if (!TextUtils.isEmpty(getText())) {
            if (getSelectionStart() != getSelectionEnd()) {
                PopupMenu popupMenu4 = this.f69208A;
                AbstractC19074t.m100205c(popupMenu4);
                popupMenu4.getMenu().add(0, 1, 0, R.string.cut);
                PopupMenu popupMenu5 = this.f69208A;
                AbstractC19074t.m100205c(popupMenu5);
                popupMenu5.getMenu().add(0, 0, 0, R.string.copy);
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11) {
                PopupMenu popupMenu6 = this.f69208A;
                AbstractC19074t.m100205c(popupMenu6);
                popupMenu6.getMenu().add(0, 2, 0, R.string.selectAll);
                z12 = true;
            }
        } else {
            z12 = false;
        }
        ClipboardManager clipboardManager = this.f69212z;
        AbstractC19074t.m100205c(clipboardManager);
        if (clipboardManager.hasPrimaryClip()) {
            PopupMenu popupMenu7 = this.f69208A;
            AbstractC19074t.m100205c(popupMenu7);
            popupMenu7.getMenu().add(0, 3, 0, R.string.paste);
            z12 = true;
        }
        if (z12) {
            this.f69209B = true;
            PopupMenu popupMenu8 = this.f69208A;
            AbstractC19074t.m100205c(popupMenu8);
            popupMenu8.show();
        }
        return z12;
    }

    public final ClipboardManager getClipboardManager() {
        return this.f69212z;
    }

    public final PopupMenu getPopupMenu() {
        return this.f69208A;
    }

    public final boolean getShowingMenu() {
        return this.f69209B;
    }

    public final AbstractC13498a getTextContextChangeListener() {
        return this.f69210C;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PopupMenu popupMenu = this.f69208A;
        if (popupMenu != null && this.f69209B) {
            AbstractC19074t.m100205c(popupMenu);
            popupMenu.dismiss();
        }
        Runnable runnable = this.f69211D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f69211D = null;
        }
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.f69212z = clipboardManager;
    }

    public final void setPopupMenu(PopupMenu popupMenu) {
        this.f69208A = popupMenu;
    }

    public final void setShowingMenu(boolean z11) {
        this.f69209B = z11;
    }

    public final void setTextContextChangeListener(AbstractC13498a abstractC13498a) {
        this.f69210C = abstractC13498a;
    }

    public final void setUseContextMenuPopup(boolean z11) {
        if (z11) {
            Object systemService = getContext().getSystemService("clipboard");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            this.f69212z = (ClipboardManager) systemService;
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.widget.b0
                public /* synthetic */ ViewOnLongClickListenerC13566b0() {
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m75696z;
                    m75696z = EditTextWithContextMenu.m75696z(EditTextWithContextMenu.this, view);
                    return m75696z;
                }
            });
            return;
        }
        setOnLongClickListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:            if ((getContext() instanceof android.app.Activity) == false) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:            if (r4.getBoolean(com.zing.zalo.p077ui.widget.AbstractC13660k1.EditTextWithContextMenu_alwaysUseContextPopup, false) == false) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:            setUseContextMenuPopup(r0);     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m75698v(AttributeSet attributeSet) {
        boolean z11 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC13660k1.EditTextWithContextMenu);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr….EditTextWithContextMenu)");
            try {
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextWithContextMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m75698v(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextWithContextMenu(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m75698v(attributeSet);
    }
}
