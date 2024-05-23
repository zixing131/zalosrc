package com.zing.zalo.feed.components.suggestitems;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bo.C3025q0;
import com.zing.zalo.feed.components.FeedItemSuggestBase;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23136l9;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public class SuggestItemOAVideo extends FeedItemSuggestBase {

    /* renamed from: S0 */
    private RobotoTextView f45700S0;

    /* renamed from: T0 */
    private RobotoTextView f45701T0;

    /* renamed from: U0 */
    private RobotoTextView f45702U0;

    /* renamed from: V0 */
    private View f45703V0;

    /* renamed from: com.zing.zalo.feed.components.suggestitems.SuggestItemOAVideo$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8386a {
    }

    public SuggestItemOAVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setFooter(C3025q0.d dVar) {
        try {
            if (this.f45700S0 != null) {
                if (!TextUtils.isEmpty(dVar.f12172c)) {
                    this.f45700S0.setVisibility(0);
                    this.f45700S0.setText(dVar.f12172c);
                } else {
                    this.f45700S0.setText("");
                    this.f45700S0.setVisibility(8);
                }
            }
            if (this.f45701T0 != null) {
                if (!TextUtils.isEmpty(dVar.f12171b)) {
                    this.f45701T0.setVisibility(0);
                    this.f45701T0.setText(dVar.f12171b);
                } else {
                    this.f45701T0.setText("");
                    this.f45701T0.setVisibility(8);
                }
            }
            if (this.f45702U0 != null) {
                if (!TextUtils.isEmpty(dVar.f12180k)) {
                    this.f45702U0.setVisibility(0);
                    this.f45702U0.setText(dVar.f12180k);
                } else {
                    this.f45702U0.setText("");
                    this.f45702U0.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
    }

    public void setOnVideoViewClickListener(InterfaceC8386a interfaceC8386a) {
    }

    public void setSuggestBackground(Drawable drawable) {
        View view = this.f45703V0;
        if (view != null) {
            AbstractC23136l9.m118696b1(view, drawable);
        }
    }
}
