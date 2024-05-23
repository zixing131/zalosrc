package com.zing.zalo.p077ui.settings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import bi0.AbstractC2814h;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public final class ItemContactView extends ListItem {

    /* renamed from: G */
    public Avatar f68291G;

    /* renamed from: H */
    public Button f68292H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemContactView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m74599n(context);
    }

    public final Avatar getAvatar() {
        Avatar avatar = this.f68291G;
        if (avatar != null) {
            return avatar;
        }
        AbstractC19074t.m100223u("avatar");
        return null;
    }

    public final Button getBtnAction() {
        Button button = this.f68292H;
        if (button != null) {
            return button;
        }
        AbstractC19074t.m100223u("btnAction");
        return null;
    }

    /* renamed from: n */
    public final void m74599n(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Avatar avatar = new Avatar(context);
        avatar.setLayoutParams(new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f)));
        setAvatar(avatar);
        Button button = new Button(context);
        button.m90539c(AbstractC2814h.ButtonSmall_SecondaryNeutral);
        button.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        setBtnAction(button);
        m90591l(AbstractC23136l9.m118742r(80.0f), 0, 0, 0);
        m90587c(getAvatar());
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        m90589e(getBtnAction());
        setTrailingGravity(enumC16952b0);
    }

    public final void setAvatar(Avatar avatar) {
        AbstractC19074t.m100208f(avatar, "<set-?>");
        this.f68291G = avatar;
    }

    public final void setBtnAction(Button button) {
        AbstractC19074t.m100208f(button, "<set-?>");
        this.f68292H = button;
    }

    @Override // com.zing.zalo.zdesign.component.ListItem, com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        getAvatar().setIdTracking(str);
        getBtnAction().setIdTracking(str);
        super.setIdTracking(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemContactView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m74599n(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemContactView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m74599n(context);
    }
}
