package com.zing.zalo.p077ui.picker.mediapicker.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerCameraView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaPickerCameraContainer extends FrameLayout implements MediaPickerCameraView.InterfaceC12844a {

    /* renamed from: p */
    private final int f66745p;

    /* renamed from: q */
    private final boolean f66746q;

    /* renamed from: r */
    private final InterfaceC24854k f66747r;

    /* renamed from: s */
    private InterfaceC12842a f66748s;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraContainer$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12842a {
        /* renamed from: w1 */
        void mo72421w1(View view);
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraContainer$b */
    /* loaded from: classes6.dex */
    static final class C12843b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f66749q;

        /* renamed from: r */
        final /* synthetic */ MediaPickerCameraContainer f66750r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12843b(Context context, MediaPickerCameraContainer mediaPickerCameraContainer) {
            super(0);
            this.f66749q = context;
            this.f66750r = mediaPickerCameraContainer;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaPickerCameraView mo12V4() {
            MediaPickerCameraView mediaPickerCameraView = new MediaPickerCameraView(this.f66749q, this.f66750r.getPhotoType(), this.f66750r.m72453b());
            mediaPickerCameraView.setModuleViewItemListener(this.f66750r);
            this.f66750r.addView(mediaPickerCameraView, -1, -1);
            return mediaPickerCameraView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerCameraContainer(Context context, int i11, boolean z11) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f66745p = i11;
        this.f66746q = z11;
        m129210a = AbstractC24856m.m129210a(new C12843b(context, this));
        this.f66747r = m129210a;
    }

    private final MediaPickerCameraView getCameraModulesView() {
        return (MediaPickerCameraView) this.f66747r.getValue();
    }

    /* renamed from: a */
    public final void m72452a(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        getCameraModulesView().m72469j(mediaItem);
    }

    /* renamed from: b */
    public final boolean m72453b() {
        return this.f66746q;
    }

    public final InterfaceC12842a getItemListener() {
        return this.f66748s;
    }

    public final int getPhotoType() {
        return this.f66745p;
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerCameraView.InterfaceC12844a
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, "targetView");
        InterfaceC12842a interfaceC12842a = this.f66748s;
        if (interfaceC12842a != null) {
            interfaceC12842a.mo72421w1(view);
        }
    }

    public final void setItemListener(InterfaceC12842a interfaceC12842a) {
        this.f66748s = interfaceC12842a;
    }
}
