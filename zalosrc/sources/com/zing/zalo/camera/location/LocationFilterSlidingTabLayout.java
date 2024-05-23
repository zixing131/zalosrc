package com.zing.zalo.camera.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;

/* loaded from: classes3.dex */
public class LocationFilterSlidingTabLayout extends SlidingTabLayout {
    public LocationFilterSlidingTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.SlidingTabLayout
    /* renamed from: a */
    public View mo39378a(Context context) {
        View mo39378a = super.mo39378a(context);
        if (mo39378a instanceof ImageView) {
            ((ImageView) mo39378a).setImageResource(AbstractC16803z.white_30_circle);
        }
        return mo39378a;
    }
}
