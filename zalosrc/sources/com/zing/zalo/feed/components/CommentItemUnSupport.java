package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.social.controls.C10873l;
import p348mi.AbstractC23306f;

/* loaded from: classes4.dex */
public class CommentItemUnSupport extends CommentItemBase {

    /* renamed from: O */
    private Context f44185O;

    public CommentItemUnSupport(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: T */
    public void m43582T(C10873l c10873l, boolean z11, int i11, int i12, int i13) {
        if (c10873l == null) {
            return;
        }
        try {
            View view = this.f44146D;
            if (view != null) {
                view.setVisibility(0);
            }
            c10873l.m56470i0(this.f44185O.getString(AbstractC8020f0.str_comment_unsupported, AbstractC23306f.m120583H().m110204g().f110084s));
            m43557Q(c10873l, z11, i11, i12);
            mo43562x(c10873l, i13);
            TextView textView = this.f44158q;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#ff9b9b9b"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.CommentItemBase
    /* renamed from: y */
    public void mo43563y(Context context) {
        try {
            this.f44185O = context;
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.comment_item_unsupported_content, this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43563y(context);
    }
}
