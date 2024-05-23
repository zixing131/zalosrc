package com.zing.zalo.shortvideo.p072ui.state.floating;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import s20.AbstractC26102d;

/* renamed from: com.zing.zalo.shortvideo.ui.state.floating.c */
/* loaded from: classes5.dex */
public final class C10107c extends AbstractC10105a {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.shortvideo.ui.state.floating.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bitmap m53898a(View view) {
            if (view instanceof VideoLayout) {
                VideoLayout videoLayout = (VideoLayout) view;
                if (!videoLayout.getHasFirstFrame()) {
                    return null;
                }
                return videoLayout.getBinding().f120435s.m92422o0();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.state.floating.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f52518q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11) {
            super(1);
            this.f52518q = j11;
        }

        /* renamed from: a */
        public final void m53899a(Bundle bundle) {
            AbstractC19074t.m100208f(bundle, "it");
            AbstractC26102d.m134326a(bundle, "lastPosition", Long.valueOf(this.f52518q));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53899a((Bundle) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10107c(Video video) {
        super(video);
        AbstractC19074t.m100208f(video, "video");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.state.floating.AbstractC10105a
    /* renamed from: i */
    public String mo53883i() {
        return ((Video) m53888n()).m52911t();
    }

    /* renamed from: s */
    public final long m53896s() {
        return m53882h().getLong("lastPosition", 0L);
    }

    /* renamed from: t */
    public final void m53897t(long j11) {
        m53891q(new b(j11));
    }
}
