package com.zing.zalo.p077ui.widget.reaction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;

/* loaded from: classes6.dex */
public class ReactionPickerInContextMenuView extends ReactionPickerView {

    /* renamed from: n0 */
    static int f71125n0 = -1;

    /* renamed from: o0 */
    static Drawable f71126o0;

    public ReactionPickerInContextMenuView(Context context, int i11, boolean z11, String str, ReactionPickerView.InterfaceC13747a interfaceC13747a, String str2) {
        super(context, i11, z11, str, interfaceC13747a, str2);
        m76804e(context);
    }

    /* renamed from: c */
    public static void m76802c(int i11) {
        if (f71125n0 != i11) {
            f71125n0 = i11;
            m76803d();
        }
    }

    /* renamed from: d */
    private static void m76803d() {
        f71126o0 = null;
    }

    /* renamed from: e */
    private static void m76804e(Context context) {
        if (f71126o0 == null) {
            f71126o0 = AbstractC1388a.m6964f(context, AbstractC16803z.chat_context_menu_background);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView
    public Drawable getBubbleDrawable() {
        return f71126o0;
    }
}
