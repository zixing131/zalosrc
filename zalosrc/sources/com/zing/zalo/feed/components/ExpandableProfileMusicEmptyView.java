package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.uicontrols.SquareGifView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public class ExpandableProfileMusicEmptyView extends ExpandableProfileMusicBaseView {

    /* renamed from: B */
    FrameLayout f44222B;

    /* renamed from: C */
    SquareGifView f44223C;

    /* renamed from: D */
    RecyclingImageView f44224D;

    /* renamed from: E */
    RobotoTextView f44225E;

    public ExpandableProfileMusicEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43623l(context);
    }

    /* renamed from: l */
    private void m43623l(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(AbstractC7409c0.expandable_profile_music_empty_view, this);
            this.f44222B = (FrameLayout) findViewById(AbstractC6918a0.icon_container);
            SquareGifView squareGifView = (SquareGifView) findViewById(AbstractC6918a0.gif_empty_icon);
            this.f44223C = squareGifView;
            squareGifView.setCropMode(1);
            this.f44224D = (RecyclingImageView) findViewById(AbstractC6918a0.img_empty_icon);
            RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.tv_description);
            this.f44225E = robotoTextView;
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.f44225E.setSelected(true);
            this.f44225E.setShadowLayer(AbstractC23136l9.m118742r(2.0f), 0.0f, AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118641B(context, AbstractC16801x.profile_music_sticky_text_shadow));
        }
    }

    @Override // com.zing.zalo.feed.components.ExpandableProfileMusicBaseView
    /* renamed from: e */
    public void mo43621e() {
        super.mo43621e();
        try {
            this.f44222B.getLayoutParams().width = ExpandableProfileMusicBaseView.f44210w;
            this.f44222B.getLayoutParams().height = ExpandableProfileMusicBaseView.f44210w;
            this.f44225E.setSingleLine(true);
            this.f44225E.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f44225E.setMarqueeRepeatLimit(-1);
            this.f44225E.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.ExpandableProfileMusicBaseView
    /* renamed from: f */
    public void mo43622f() {
        super.mo43622f();
        try {
            this.f44222B.getLayoutParams().width = ExpandableProfileMusicBaseView.f44212y;
            this.f44222B.getLayoutParams().height = ExpandableProfileMusicBaseView.f44212y;
            this.f44225E.setSingleLine(false);
            this.f44225E.setMaxLines(2);
            this.f44225E.setEllipsize(TextUtils.TruncateAt.END);
            this.f44225E.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85299f6));
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m43624k(ContactProfile.C7870f c7870f, C23528a c23528a) {
        if (c7870f != null) {
            try {
                if (c7870f.m40456d()) {
                    this.f44225E.setText(c7870f.m40453a());
                    if (!TextUtils.isEmpty(c7870f.m40454b())) {
                        this.f44223C.setVisibility(0);
                        this.f44223C.m88227l(new ZSimpleGIFView.C16554f(c7870f.m40454b(), c7870f.m40455c(), 100, 100, "ExpandableProfileMusicEmptyView"), 0, null);
                        this.f44223C.m88224g(100L);
                    } else {
                        this.f44224D.setVisibility(0);
                        this.f44223C.setVisibility(8);
                        this.f44224D.setImageResource(AbstractC16803z.bg_item_feed_o);
                        ((C23528a) c23528a.m123612r(this.f44224D)).m123618x(c7870f.m40455c(), C23278z2.m120123e0());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f44225E.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_empty_msg));
        RecyclingImageView recyclingImageView = this.f44224D;
        recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.ic_profile_music_empty));
        this.f44224D.setVisibility(0);
        this.f44223C.setVisibility(8);
    }
}
