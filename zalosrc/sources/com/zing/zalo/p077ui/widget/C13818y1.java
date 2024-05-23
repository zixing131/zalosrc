package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zview.AbstractC17466e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import l00.AbstractC21993a;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.y1 */
/* loaded from: classes6.dex */
public class C13818y1 extends AbstractC21993a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C13818y1(Context context, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this(context, r2, r4, r3, (i14 & 16) != 0 ? AbstractC23136l9.m118665N(context, AbstractC17466e.transparent) : drawable2, (i14 & 32) != 0 ? 50 : i11, (i14 & 64) != 0 ? 130 : i12, (i14 & 128) != 0 ? 0 : i13);
        StateListDrawable stateListDrawable3;
        StateListDrawable stateListDrawable4;
        if ((i14 & 2) != 0) {
            Drawable m118665N = AbstractC23136l9.m118665N(context, AbstractC16803z.thumb_drawable);
            AbstractC19074t.m100206d(m118665N, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            stateListDrawable3 = (StateListDrawable) m118665N;
        } else {
            stateListDrawable3 = stateListDrawable;
        }
        Drawable m118665N2 = (i14 & 4) != 0 ? AbstractC23136l9.m118665N(context, AbstractC17466e.transparent) : drawable;
        if ((i14 & 8) != 0) {
            Drawable m118665N3 = AbstractC23136l9.m118665N(context, AbstractC16803z.thumb_drawable);
            AbstractC19074t.m100206d(m118665N3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            stateListDrawable4 = (StateListDrawable) m118665N3;
        } else {
            stateListDrawable4 = stateListDrawable2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13818y1(Context context, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        super(null, stateListDrawable, drawable, stateListDrawable2, drawable2, i11, i12, i13);
        AbstractC19074t.m100208f(context, "context");
    }
}
