package com.zing.zalo.uidrawing.widget.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.zing.zalo.uidrawing.widget.video.InterfaceC16725a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nd0.C23729a;

@TargetApi(14)
/* loaded from: classes4.dex */
public class VideoTextureRenderView extends TextureView implements InterfaceC16725a {

    /* renamed from: p */
    private C23729a f84800p;

    /* renamed from: q */
    TextureViewSurfaceTextureListenerC16724b f84801q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uidrawing.widget.video.VideoTextureRenderView$a */
    /* loaded from: classes4.dex */
    public static final class C16723a implements InterfaceC16725a.b {

        /* renamed from: a */
        private VideoTextureRenderView f84802a;

        /* renamed from: b */
        SurfaceTexture f84803b;

        /* renamed from: c */
        private Surface f84804c;

        public C16723a(VideoTextureRenderView videoTextureRenderView, SurfaceTexture surfaceTexture) {
            this.f84802a = videoTextureRenderView;
            this.f84803b = surfaceTexture;
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.b
        /* renamed from: a */
        public void mo89169a() {
            Surface surface = this.f84804c;
            if (surface != null) {
                surface.release();
                this.f84804c = null;
            }
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.b
        /* renamed from: b */
        public Surface mo89170b() {
            if (this.f84803b == null) {
                return null;
            }
            Surface surface = this.f84804c;
            if (surface != null) {
                surface.release();
                this.f84804c = null;
            }
            Surface surface2 = new Surface(this.f84803b);
            this.f84804c = surface2;
            return surface2;
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.b
        /* renamed from: c */
        public InterfaceC16725a mo89171c() {
            return this.f84802a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uidrawing.widget.video.VideoTextureRenderView$b */
    /* loaded from: classes4.dex */
    public static final class TextureViewSurfaceTextureListenerC16724b implements TextureView.SurfaceTextureListener {

        /* renamed from: p */
        SurfaceTexture f84805p;

        /* renamed from: q */
        private boolean f84806q;

        /* renamed from: r */
        private int f84807r;

        /* renamed from: s */
        private int f84808s;

        /* renamed from: w */
        private WeakReference f84812w;

        /* renamed from: t */
        private boolean f84809t = true;

        /* renamed from: u */
        private boolean f84810u = false;

        /* renamed from: v */
        private boolean f84811v = false;

        /* renamed from: x */
        private Map f84813x = new ConcurrentHashMap();

        public TextureViewSurfaceTextureListenerC16724b(VideoTextureRenderView videoTextureRenderView) {
            this.f84812w = new WeakReference(videoTextureRenderView);
        }

        /* renamed from: a */
        public void m89172a(InterfaceC16725a.a aVar) {
            C16723a c16723a;
            this.f84813x.put(aVar, aVar);
            if (this.f84805p != null) {
                c16723a = new C16723a((VideoTextureRenderView) this.f84812w.get(), this.f84805p);
                aVar.mo89177b(c16723a, this.f84807r, this.f84808s);
            } else {
                c16723a = null;
            }
            if (this.f84806q) {
                if (c16723a == null) {
                    c16723a = new C16723a((VideoTextureRenderView) this.f84812w.get(), this.f84805p);
                }
                aVar.mo89178c(c16723a, 0, this.f84807r, this.f84808s);
            }
        }

        /* renamed from: b */
        public void m89173b() {
            this.f84811v = true;
        }

        /* renamed from: c */
        public void m89174c(InterfaceC16725a.a aVar) {
            this.f84813x.remove(aVar);
        }

        /* renamed from: d */
        public void m89175d() {
            this.f84810u = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f84805p = surfaceTexture;
            this.f84806q = false;
            this.f84807r = 0;
            this.f84808s = 0;
            C16723a c16723a = new C16723a((VideoTextureRenderView) this.f84812w.get(), surfaceTexture);
            Iterator it = this.f84813x.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC16725a.a) it.next()).mo89177b(c16723a, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f84805p = surfaceTexture;
            this.f84806q = false;
            this.f84807r = 0;
            this.f84808s = 0;
            C16723a c16723a = new C16723a((VideoTextureRenderView) this.f84812w.get(), surfaceTexture);
            c16723a.mo89169a();
            Iterator it = this.f84813x.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC16725a.a) it.next()).mo89176a(c16723a);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onSurfaceTextureDestroyed: destroy: ");
            sb2.append(this.f84809t);
            return this.f84809t;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f84805p = surfaceTexture;
            this.f84806q = true;
            this.f84807r = i11;
            this.f84808s = i12;
            C16723a c16723a = new C16723a((VideoTextureRenderView) this.f84812w.get(), surfaceTexture);
            Iterator it = this.f84813x.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC16725a.a) it.next()).mo89178c(c16723a, 0, i11, i12);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public VideoTextureRenderView(Context context) {
        super(context);
        m89163f(context);
    }

    /* renamed from: f */
    private void m89163f(Context context) {
        this.f84800p = new C23729a(this);
        TextureViewSurfaceTextureListenerC16724b textureViewSurfaceTextureListenerC16724b = new TextureViewSurfaceTextureListenerC16724b(this);
        this.f84801q = textureViewSurfaceTextureListenerC16724b;
        setSurfaceTextureListener(textureViewSurfaceTextureListenerC16724b);
        setOpaque(false);
        setClickable(false);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: a */
    public void mo89164a(int i11, int i12) {
        if (i11 > 0 && i12 > 0 && this.f84800p.m124073f(i11, i12)) {
            requestLayout();
        }
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: b */
    public void mo89165b(InterfaceC16725a.a aVar) {
        this.f84801q.m89172a(aVar);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: c */
    public boolean mo89166c() {
        return false;
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: d */
    public void mo89167d(InterfaceC16725a.a aVar) {
        this.f84801q.m89174c(aVar);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: e */
    public void mo89168e(int i11, int i12, boolean z11, int i13, int i14) {
        if (i11 > 0 && i12 > 0 && this.f84800p.m124074g(i11, i12, z11, i13, i14)) {
            requestLayout();
        }
    }

    public InterfaceC16725a.b getSurfaceHolder() {
        return new C16723a(this, this.f84801q.f84805p);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f84801q.m89175d();
        super.onDetachedFromWindow();
        this.f84801q.m89173b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoTextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoTextureRenderView.class.getName());
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        this.f84800p.m124068a(i11, i12);
        setMeasuredDimension(this.f84800p.m124070c(), this.f84800p.m124069b());
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    public void setAspectRatio(int i11) {
        if (this.f84800p.m124071d(i11)) {
            requestLayout();
        }
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    public void setVideoRotation(int i11) {
        this.f84800p.m124072e(i11);
        setRotation(i11);
        requestLayout();
    }

    public VideoTextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89163f(context);
    }

    public VideoTextureRenderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m89163f(context);
    }
}
