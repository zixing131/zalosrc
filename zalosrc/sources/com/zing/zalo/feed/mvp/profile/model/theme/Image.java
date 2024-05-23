package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcelable;
import fn0.AbstractC19060k;

/* loaded from: classes4.dex */
public abstract class Image implements Parcelable {
    public static final int AC_CENTER_BOTTOM = 8;
    public static final int AC_CENTER_CENTER = 5;
    public static final int AC_CENTER_TOP = 2;
    public static final int AC_LEFT_BOTTOM = 7;
    public static final int AC_LEFT_CENTER = 4;
    public static final int AC_LEFT_TOP = 1;
    public static final int AC_RIGHT_BOTTOM = 9;
    public static final int AC_RIGHT_CENTER = 6;
    public static final int AC_RIGHT_TOP = 3;
    public static final C8680a Companion = new C8680a(null);
    public static final String SCALE_TYPE_FIXED_HEIGHT = "FIXED_HEIGHT";
    public static final String SCALE_TYPE_FIXED_WIDTH = "FIXED_WIDTH";
    public static final String SCALE_TYPE_NONE = "NONE";
    public static final String SCALE_TYPE_SCREEN = "FIXED_SCREEN";

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.Image$a */
    /* loaded from: classes4.dex */
    public static final class C8680a {
        private C8680a() {
        }

        public /* synthetic */ C8680a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public abstract int getAnchorType();

    public abstract float getScale();

    public abstract String getScaleType();

    public abstract float getTranslateX();

    public abstract float getTranslateY();

    public abstract String getUrl();
}
