package com.zing.zalo.story.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class StoryBarFooterLoading extends RelativeLayout {

    /* renamed from: p */
    int f55093p;

    /* renamed from: q */
    RecyclingImageView f55094q;

    /* renamed from: r */
    ProgressBar f55095r;

    /* renamed from: s */
    View f55096s;

    /* renamed from: t */
    RobotoTextView f55097t;

    public StoryBarFooterLoading(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m56580a() {
        AbstractC23136l9.m118744r1(this.f55094q, 8);
        AbstractC23136l9.m118744r1(this.f55097t, 8);
        AbstractC23136l9.m118744r1(this.f55095r, 0);
        AbstractC23136l9.m118744r1(this.f55096s, 8);
    }

    /* renamed from: b */
    public void m56581b(Context context, int i11) {
        this.f55093p = i11;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setGravity(17);
        setMinimumHeight(AbstractC23136l9.m118655I(AbstractC16802y.story_bar_avatar_width));
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            int i12 = this.f55093p;
            if (i12 == 0 || i12 == 1 || i12 == 2) {
                layoutInflater.inflate(AbstractC7409c0.story_bar_item_loading_retry_content, this);
                this.f55094q = (RecyclingImageView) findViewById(AbstractC6918a0.ic_story_avatar);
                this.f55095r = (ProgressBar) findViewById(AbstractC6918a0.ic_story_loading);
                this.f55096s = findViewById(AbstractC6918a0.img_story_retry);
                this.f55097t = (RobotoTextView) findViewById(AbstractC6918a0.tv_story_name);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public StoryBarFooterLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
