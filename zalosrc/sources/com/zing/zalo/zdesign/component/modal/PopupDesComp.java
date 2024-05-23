package com.zing.zalo.zdesign.component.modal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class PopupDesComp extends RelativeLayout {

    /* renamed from: p */
    private RobotoTextView f87048p;

    /* renamed from: q */
    private ImageView f87049q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupDesComp(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public final void setDescription(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        this.f87048p.setText(charSequence);
    }

    public final void setImageDescriptionDialog(Drawable drawable) {
        this.f87048p.setGravity(0);
        if (drawable == null) {
            this.f87049q.setVisibility(8);
        } else {
            this.f87049q.setImageDrawable(drawable);
            this.f87049q.setVisibility(0);
        }
    }

    public final void setImageDescriptionPopup(Drawable drawable) {
        if (drawable == null) {
            this.f87049q.setVisibility(8);
            this.f87048p.setGravity(17);
        } else {
            this.f87049q.setImageDrawable(drawable);
            this.f87049q.setVisibility(0);
            this.f87048p.setGravity(19);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupDesComp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupDesComp(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        LayoutInflater.from(context).inflate(AbstractC2812f.popup_des_comp_item, this);
        View findViewById = findViewById(AbstractC2811e.text_dialog);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.text_dialog)");
        this.f87048p = (RobotoTextView) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.image_des_popup);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.image_des_popup)");
        this.f87049q = (ImageView) findViewById2;
        setImageDescriptionPopup(null);
    }
}
