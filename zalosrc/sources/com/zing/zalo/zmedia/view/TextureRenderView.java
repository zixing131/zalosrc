package com.zing.zalo.zmedia.view;

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

/* loaded from: classes7.dex */
public class TextureRenderView extends TextureView implements InterfaceC16725a {

    /* renamed from: p */
    private C23729a f88172p;

    /* renamed from: q */
    TextureViewSurfaceTextureListenerC17307b f88173q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zmedia.view.TextureRenderView$a */
    /* loaded from: classes7.dex */
    public static final class C17306a implements InterfaceC16725a.b {

        /* renamed from: a */
        private TextureRenderView f88174a;

        /* renamed from: b */
        SurfaceTexture f88175b;

        /* renamed from: c */
        private Surface f88176c;

        public C17306a(TextureRenderView textureRenderView, SurfaceTexture surfaceTexture) {
            this.f88174a = textureRenderView;
            this.f88175b = surfaceTexture;
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.b
        /* renamed from: a */
        public void mo89169a() {
            Surface surface = this.f88176c;
            if (surface != null) {
                surface.release();
                this.f88176c = null;
            }
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.b
        /* renamed from: b */
        public Surface mo89170b() {
            if (this.f88175b == null) {
                return null;
            }
            Surface surface = this.f88176c;
            if (surface != null) {
                surface.release();
                this.f88176c = null;
            }
            Surface surface2 = new Surface(this.f88175b);
            this.f88176c = surface2;
            return surface2;
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.b
        /* renamed from: c */
        public InterfaceC16725a mo89171c() {
            return this.f88174a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zmedia.view.TextureRenderView$b */
    /* loaded from: classes7.dex */
    public static final class TextureViewSurfaceTextureListenerC17307b implements TextureView.SurfaceTextureListener {

        /* renamed from: p */
        SurfaceTexture f88177p;

        /* renamed from: q */
        private boolean f88178q;

        /* renamed from: r */
        private int f88179r;

        /* renamed from: s */
        private int f88180s;

        /* renamed from: w */
        private WeakReference f88184w;

        /* renamed from: t */
        private boolean f88181t = true;

        /* renamed from: u */
        private boolean f88182u = false;

        /* renamed from: v */
        private boolean f88183v = false;

        /* renamed from: x */
        private Map f88185x = new ConcurrentHashMap();

        public TextureViewSurfaceTextureListenerC17307b(TextureRenderView textureRenderView) {
            this.f88184w = new WeakReference(textureRenderView);
        }

        /* renamed from: a */
        public void m92262a(InterfaceC16725a.a aVar) {
            C17306a c17306a;
            this.f88185x.put(aVar, aVar);
            if (this.f88177p != null) {
                c17306a = new C17306a((TextureRenderView) this.f88184w.get(), this.f88177p);
                aVar.mo89177b(c17306a, this.f88179r, this.f88180s);
            } else {
                c17306a = null;
            }
            if (this.f88178q) {
                if (c17306a == null) {
                    c17306a = new C17306a((TextureRenderView) this.f88184w.get(), this.f88177p);
                }
                aVar.mo89178c(c17306a, 0, this.f88179r, this.f88180s);
            }
        }

        /* renamed from: b */
        public void m92263b() {
            this.f88183v = true;
        }

        /* renamed from: c */
        public void m92264c(InterfaceC16725a.a aVar) {
            this.f88185x.remove(aVar);
        }

        /* renamed from: d */
        public void m92265d() {
            this.f88182u = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f88177p = surfaceTexture;
            this.f88178q = false;
            this.f88179r = 0;
            this.f88180s = 0;
            C17306a c17306a = new C17306a((TextureRenderView) this.f88184w.get(), surfaceTexture);
            Iterator it = this.f88185x.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC16725a.a) it.next()).mo89177b(c17306a, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f88177p = surfaceTexture;
            this.f88178q = false;
            this.f88179r = 0;
            this.f88180s = 0;
            C17306a c17306a = new C17306a((TextureRenderView) this.f88184w.get(), surfaceTexture);
            c17306a.mo89169a();
            Iterator it = this.f88185x.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC16725a.a) it.next()).mo89176a(c17306a);
            }
            return this.f88181t;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f88177p = surfaceTexture;
            this.f88178q = true;
            this.f88179r = i11;
            this.f88180s = i12;
            C17306a c17306a = new C17306a((TextureRenderView) this.f88184w.get(), surfaceTexture);
            Iterator it = this.f88185x.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC16725a.a) it.next()).mo89178c(c17306a, 0, i11, i12);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92261f(context);
    }

    /* renamed from: f */
    private void m92261f(Context context) {
        this.f88172p = new C23729a(this);
        TextureViewSurfaceTextureListenerC17307b textureViewSurfaceTextureListenerC17307b = new TextureViewSurfaceTextureListenerC17307b(this);
        this.f88173q = textureViewSurfaceTextureListenerC17307b;
        setSurfaceTextureListener(textureViewSurfaceTextureListenerC17307b);
        setOpaque(false);
        setClickable(false);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: a */
    public void mo89164a(int i11, int i12) {
        if (i11 > 0 && i12 > 0 && this.f88172p.m124073f(i11, i12)) {
            requestLayout();
        }
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: b */
    public void mo89165b(InterfaceC16725a.a aVar) {
        this.f88173q.m92262a(aVar);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: c */
    public boolean mo89166c() {
        return false;
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: d */
    public void mo89167d(InterfaceC16725a.a aVar) {
        this.f88173q.m92264c(aVar);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    /* renamed from: e */
    public void mo89168e(int i11, int i12, boolean z11, int i13, int i14) {
        if (i11 > 0 && i12 > 0 && this.f88172p.m124074g(i11, i12, z11, i13, i14)) {
            requestLayout();
        }
    }

    public InterfaceC16725a.b getSurfaceHolder() {
        return new C17306a(this, this.f88173q.f88177p);
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f88173q.m92265d();
        super.onDetachedFromWindow();
        this.f88173q.m92263b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        this.f88172p.m124068a(i11, i12);
        setMeasuredDimension(this.f88172p.m124070c(), this.f88172p.m124069b());
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    public void setAspectRatio(int i11) {
        if (this.f88172p.m124071d(i11)) {
            requestLayout();
        }
    }

    @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a
    public void setVideoRotation(int i11) {
        this.f88172p.m124072e(i11);
        setRotation(i11);
        requestLayout();
    }
}
