package com.zing.zalo.p077ui.zviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.webview.C16798n;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.C23212s8;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MiniDialogPermissionRequest extends LinearLayout {

    /* renamed from: p */
    private final ArrayList f75171p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniDialogPermissionRequest(Context context, ArrayList arrayList) {
        super(context);
        boolean z11;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(arrayList, "permissionList");
        this.f75171p = arrayList;
        setOrientation(1);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = this.f75171p.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C16798n c16798n = (C16798n) obj;
            int m89728b = c16798n.m89728b();
            String m89730d = c16798n.m89730d();
            if (i11 < size - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            m81800a(m89728b, m89730d, z11);
        }
        setPadding(0, AbstractC23136l9.m118742r(15.0f), 0, 0);
    }

    /* renamed from: a */
    private final void m81800a(int i11, String str, boolean z11) {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        int m118742r = AbstractC23136l9.m118742r(16.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        layoutParams.topMargin = m118742r;
        layoutParams.bottomMargin = m118742r;
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        zAppCompatImageView.setImageResource(i11);
        zAppCompatImageView.setId(AbstractC6918a0.mp_dialog_permission_icon);
        relativeLayout.addView(zAppCompatImageView, layoutParams);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(17, AbstractC6918a0.mp_dialog_permission_icon);
        layoutParams2.addRule(16, AbstractC6918a0.mp_dialog_permission_check);
        layoutParams2.setMarginStart(AbstractC23136l9.m118742r(10.0f));
        textView.setId(AbstractC6918a0.mp_dialog_permission_name);
        textView.setText(str);
        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.N200));
        textView.setTextSize(1, 16.0f);
        relativeLayout.addView(textView, layoutParams2);
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(14.0f));
        zAppCompatImageView2.setImageResource(AbstractC16803z.icn_mp_line_check);
        zAppCompatImageView2.setId(AbstractC6918a0.mp_dialog_permission_check);
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        relativeLayout.addView(zAppCompatImageView2, layoutParams3);
        if (z11) {
            View view = new View(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, AbstractC23136l9.m118742r(1.0f));
            layoutParams4.addRule(3, AbstractC6918a0.mp_dialog_permission_icon);
            view.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.MPBottomSheetDivider));
            relativeLayout.addView(view, layoutParams4);
        }
        addView(relativeLayout, new LinearLayout.LayoutParams(-1, -2));
    }

    public final ArrayList<C16798n> getPermissionList() {
        return this.f75171p;
    }
}
