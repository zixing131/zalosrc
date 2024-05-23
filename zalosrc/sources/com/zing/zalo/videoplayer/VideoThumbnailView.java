package com.zing.zalo.videoplayer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.feed.uicontrols.FeedAdsImageView;

/* loaded from: classes5.dex */
public class VideoThumbnailView extends FeedAdsImageView {

    /* renamed from: u */
    private final Drawable f85177u;

    /* renamed from: v */
    private boolean f85178v;

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85178v = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.VideoThumbnailView, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC8923h0.VideoThumbnailView_video_play_icon);
            this.f85177u = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.uicontrols.FeedAdsImageView, com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f85178v || this.f85177u == null) {
            return;
        }
        int width = (getWidth() - this.f85177u.getIntrinsicWidth()) / 2;
        int height = (getHeight() - this.f85177u.getIntrinsicHeight()) / 2;
        canvas.save();
        canvas.translate(width, height);
        this.f85177u.draw(canvas);
        canvas.restore();
    }

    @Override // com.zing.zalo.feed.uicontrols.FeedAdsImageView
    public void setDrawPlayIcon(boolean z11) {
        super.setDrawPlayIcon(z11);
        this.f85178v = z11;
        invalidate();
    }
}
