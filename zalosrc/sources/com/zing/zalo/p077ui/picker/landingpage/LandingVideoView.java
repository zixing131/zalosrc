package com.zing.zalo.p077ui.picker.landingpage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.photoview.PhotoView;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import me0.AbstractC23006a0;
import me0.AbstractC23280z4;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* loaded from: classes6.dex */
public class LandingVideoView extends FrameLayout {

    /* renamed from: p */
    private PhotoView f66348p;

    /* renamed from: q */
    private C23528a f66349q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingVideoView$a */
    /* loaded from: classes6.dex */
    public class C12749a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ InterfaceC12751c f66350l1;

        C12749a(InterfaceC12751c interfaceC12751c) {
            this.f66350l1 = interfaceC12751c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                LandingVideoView.this.f66348p.setImageInfo(c3979l);
                this.f66350l1.mo71921a(c3979l.m18839c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingVideoView$b */
    /* loaded from: classes6.dex */
    public class C12750b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ MediaItem f66352l1;

        C12750b(MediaItem mediaItem) {
            this.f66352l1 = mediaItem;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c3979l.m18839c() != null) {
                this.f66352l1.m41164p1(c3979l.m18839c().getWidth());
                this.f66352l1.m41118Q0(c3979l.m18839c().getHeight());
                LandingVideoView.this.f66348p.setImageInfo(c3979l);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingVideoView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC12751c {
        /* renamed from: a */
        void mo71921a(Bitmap bitmap);
    }

    public LandingVideoView(Context context) {
        super(context);
        m71919b();
    }

    /* renamed from: b */
    private void m71919b() {
        this.f66349q = new C23528a(getContext());
        PhotoView photoView = new PhotoView(getContext());
        this.f66348p = photoView;
        photoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f66348p, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public void m71920c(MediaItem mediaItem, C24003n c24003n, InterfaceC12751c interfaceC12751c) {
        try {
            C3979l m108841w = AbstractC20826v0.m108841w(AbstractC23280z4.m120364z(mediaItem), Integer.valueOf(c24003n.f116260a), Integer.valueOf(AbstractC23006a0.m117875E()), Integer.valueOf(AbstractC23006a0.m117871A()), Integer.valueOf(AbstractC23006a0.m117928x()));
            if (m108841w != null) {
                this.f66348p.setImageInfo(m108841w);
                interfaceC12751c.mo71921a(m108841w.m18839c());
            } else {
                ((C23528a) this.f66349q.m123612r(this.f66348p)).m123579C(AbstractC23280z4.m120364z(mediaItem), c24003n, new C12749a(interfaceC12751c));
            }
            ((C23528a) this.f66349q.m123612r(this.f66348p)).m123586J(AbstractC23280z4.m120363y(mediaItem), true, true, AbstractC23006a0.m117875E(), 0, new C12750b(mediaItem).m125773e3(true), false, C23278z2.m120110a(), true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public PhotoView getPhotoView() {
        return this.f66348p;
    }

    public LandingVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m71919b();
    }
}
