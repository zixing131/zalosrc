package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.social.controls.C10873l;

/* loaded from: classes4.dex */
public class CommentItemText extends CommentItemBase {
    public CommentItemText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: T */
    public void m43581T(C10873l c10873l, boolean z11, int i11, int i12, int i13) {
        if (c10873l == null) {
            return;
        }
        try {
            m43557Q(c10873l, z11, i11, i12);
            m43556P(c10873l);
            mo43562x(c10873l, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.CommentItemBase
    /* renamed from: y */
    public void mo43563y(Context context) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.comment_item_text_content_new, this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43563y(context);
    }
}
