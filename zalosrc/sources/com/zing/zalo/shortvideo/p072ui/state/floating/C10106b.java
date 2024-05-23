package com.zing.zalo.shortvideo.p072ui.state.floating;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.zmedia.view.ZVideoView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.shortvideo.ui.state.floating.b */
/* loaded from: classes5.dex */
public final class C10106b extends AbstractC10105a {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.shortvideo.ui.state.floating.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bitmap m53895a(View view) {
            ZVideoView videoView;
            if (view instanceof LivestreamVideoLayout) {
                LivestreamVideoLayout livestreamVideoLayout = (LivestreamVideoLayout) view;
                if (!livestreamVideoLayout.getHasFirstFrame() || (videoView = livestreamVideoLayout.getVideoView()) == null) {
                    return null;
                }
                return videoView.m92422o0();
            }
            if (view != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                if (width > 0 && height > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                    AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
                    view.draw(new Canvas(createBitmap));
                    return createBitmap;
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10106b(LivestreamData livestreamData) {
        super(livestreamData);
        AbstractC19074t.m100208f(livestreamData, "stream");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.state.floating.AbstractC10105a
    /* renamed from: i */
    public String mo53883i() {
        return ((LivestreamData) m53888n()).m51016f();
    }
}
