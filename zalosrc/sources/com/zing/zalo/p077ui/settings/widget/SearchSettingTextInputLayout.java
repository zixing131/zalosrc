package com.zing.zalo.p077ui.settings.widget;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1602t;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.settings.widget.SearchSettingTextInputLayout;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.zview.AbstractC17466e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ml0.AbstractC23344a;
import zl0.AbstractC32232i;
import zl0.AbstractC32234k;

/* loaded from: classes6.dex */
public final class SearchSettingTextInputLayout extends FrameLayout {

    /* renamed from: p */
    private EditText f68306p;

    /* renamed from: q */
    private ImageView f68307q;

    /* renamed from: com.zing.zalo.ui.settings.widget.SearchSettingTextInputLayout$a */
    /* loaded from: classes6.dex */
    public static final class ActionModeCallbackC13288a implements ActionMode.Callback {
        ActionModeCallbackC13288a() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            AbstractC19074t.m100208f(actionMode, "mode");
            AbstractC19074t.m100208f(menuItem, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            AbstractC19074t.m100208f(actionMode, "mode");
            AbstractC19074t.m100208f(menu, "menu");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            AbstractC19074t.m100208f(actionMode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            AbstractC19074t.m100208f(actionMode, "mode");
            AbstractC19074t.m100208f(menu, "menu");
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchSettingTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m74620b(SearchSettingTextInputLayout searchSettingTextInputLayout, View view) {
        Editable editable;
        AbstractC19074t.m100208f(searchSettingTextInputLayout, "this$0");
        EditText editText = searchSettingTextInputLayout.f68306p;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        if (!TextUtils.isEmpty(editable)) {
            EditText editText2 = searchSettingTextInputLayout.f68306p;
            if (editText2 != null) {
                editText2.setText("");
            }
            AbstractC2379w.m12434h(searchSettingTextInputLayout.f68306p);
        }
    }

    public final ImageView getClearButton() {
        return this.f68307q;
    }

    public final EditText getSearchField() {
        return this.f68306p;
    }

    public final void setClearButton(ImageView imageView) {
        this.f68307q = imageView;
    }

    public final void setSearchField(EditText editText) {
        this.f68306p = editText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchSettingTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ SearchSettingTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSettingTextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC32232i.m155453a(6.0f), 0, AbstractC32232i.m155453a(8.0f), 0);
        layoutParams.addRule(15);
        setLayoutParams(layoutParams);
        setBackgroundResource(AbstractC17466e.ab_bg_textfield_search_default);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        EditTextWithContextMenu editTextWithContextMenu = new EditTextWithContextMenu(context2);
        editTextWithContextMenu.setId(AbstractC23344a.search_src_text);
        editTextWithContextMenu.setTextSize(1, 16.0f);
        editTextWithContextMenu.setHintTextColor(-2565928);
        editTextWithContextMenu.setTextColor(-12696501);
        editTextWithContextMenu.setSingleLine(true);
        editTextWithContextMenu.setBackgroundResource(0);
        editTextWithContextMenu.setPadding(0, 0, 0, 0);
        editTextWithContextMenu.setInputType(editTextWithContextMenu.getInputType() | 524288);
        if (Build.VERSION.SDK_INT < 23) {
            editTextWithContextMenu.setCustomSelectionActionModeCallback(new ActionModeCallbackC13288a());
        }
        AbstractC32234k.m155469a(editTextWithContextMenu, AbstractC16803z.search_cursor_white);
        editTextWithContextMenu.setImeOptions(33554435);
        editTextWithContextMenu.setTextIsSelectable(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AbstractC32232i.m155453a(30.0f));
        layoutParams2.gravity = 16;
        layoutParams2.rightMargin = AbstractC32232i.m155453a(48.0f);
        addView(editTextWithContextMenu, layoutParams2);
        this.f68306p = editTextWithContextMenu;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams3.gravity = AbstractC1602t.m8182b(8388613, getLayoutDirection());
        addView(frameLayout, layoutParams3);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(AbstractC16803z.icn_header_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ra0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchSettingTextInputLayout.m74620b(SearchSettingTextInputLayout.this, view);
            }
        });
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC32232i.m155453a(48.0f), -1);
        layoutParams4.gravity = 8388629;
        frameLayout.addView(imageView, layoutParams4);
        this.f68307q = imageView;
    }
}
