package com.zing.zalo.social.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes5.dex */
public class CoverImageView extends RecyclingImageView {

    /* renamed from: p */
    private boolean f54999p;

    /* renamed from: com.zing.zalo.social.widget.CoverImageView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10888a {
    }

    public CoverImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54999p = false;
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Bitmap bitmap;
        super.setImageDrawable(drawable);
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            this.f54999p = true;
        }
    }

    public void setOnCoverBitmapSetListener(InterfaceC10888a interfaceC10888a) {
    }
}
