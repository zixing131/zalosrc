package com.zing.zalo.p077ui.camera.documentscanner;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import b00.C2480c;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.camera.documentscanner.custom.CropPolygonView;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h00.C19697c;
import j00.C20899b;
import me0.AbstractC23202r9;
import p227i3.AbstractC20216t;
import p227i3.C20218v;
import p348mi.AbstractC23306f;
import p649xl.C30112x2;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import t50.C26490b;
import t50.InterfaceC26489a;

/* loaded from: classes5.dex */
public final class DocumentScanView extends FrameLayout implements InterfaceC26489a, View.OnClickListener, CropPolygonView.InterfaceC11262i {
    public static final C11248a Companion = new C11248a(null);

    /* renamed from: p */
    private final Handler f56582p;

    /* renamed from: q */
    private final InterfaceC24854k f56583q;

    /* renamed from: r */
    private C30112x2 f56584r;

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.DocumentScanView$a */
    /* loaded from: classes5.dex */
    public static final class C11248a {
        private C11248a() {
        }

        public /* synthetic */ C11248a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.DocumentScanView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11249b {
        /* renamed from: a */
        void mo38382a(Bitmap bitmap, boolean z11);

        /* renamed from: b */
        void mo38383b();

        /* renamed from: c */
        void mo38384c();

        /* renamed from: j */
        void mo38385j(String str);
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.DocumentScanView$c */
    /* loaded from: classes5.dex */
    static final class C11250c extends AbstractC19075u implements InterfaceC18494a {
        C11250c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11253b mo12V4() {
            DocumentScanView documentScanView = DocumentScanView.this;
            C19697c m120619T = AbstractC23306f.m120619T();
            AbstractC19074t.m100207e(m120619T, "provideDocumentBoundDetector(...)");
            C20899b m120622U = AbstractC23306f.m120622U();
            AbstractC19074t.m100207e(m120622U, "provideDocumentTransformer(...)");
            return new C11253b(documentScanView, m120619T, m120622U);
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.DocumentScanView$d */
    /* loaded from: classes5.dex */
    public static final class C11251d extends Animation {
        C11251d() {
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation transformation) {
            AbstractC19074t.m100208f(transformation, AbstractC20216t.f99969a);
            ViewGroup.LayoutParams layoutParams = DocumentScanView.this.getBinding().f139881v.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            CropPolygonView.C11261h c11261h = CropPolygonView.Companion;
            layoutParams2.setMargins((int) (c11261h.m59116l() * f11), (int) (c11261h.m59117m() * f11), (int) (c11261h.m59116l() * f11), (int) (c11261h.m59117m() * f11));
            DocumentScanView.this.getBinding().f139881v.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScanView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f56582p = new Handler(Looper.getMainLooper());
        m129210a = AbstractC24856m.m129210a(new C11250c());
        this.f56583q = m129210a;
        m59015f();
    }

    /* renamed from: f */
    private final void m59015f() {
        this.f56584r = C30112x2.m148678c(LayoutInflater.from(getContext()), this, true);
        m59016m();
        ViewGroup.LayoutParams layoutParams = getBinding().f139881v.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        getBinding().f139881v.setLayoutParams((FrameLayout.LayoutParams) layoutParams);
        m59017n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C30112x2 getBinding() {
        C30112x2 c30112x2 = this.f56584r;
        AbstractC19074t.m100205c(c30112x2);
        return c30112x2;
    }

    private final C2480c getFinalBound() {
        return getBinding().f139884y.getFinalBound();
    }

    private final InterfaceC11252a getPresenter() {
        return (InterfaceC11252a) this.f56583q.getValue();
    }

    /* renamed from: m */
    private final void m59016m() {
        getBinding().f139876q.setOnClickListener(this);
        getBinding().f139877r.setOnClickListener(this);
        getBinding().f139878s.setOnClickListener(this);
        getBinding().f139884y.setListener(this);
    }

    /* renamed from: n */
    private final void m59017n() {
        C11251d c11251d = new C11251d();
        c11251d.setDuration(300L);
        getBinding().f139881v.startAnimation(c11251d);
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: Bc */
    public void mo59018Bc(Bitmap bitmap) {
        AbstractC19074t.m100208f(bitmap, "inputBitmap");
        getBinding().f139881v.setImageBitmap(bitmap);
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: Jb */
    public void mo59019Jb() {
        getBinding().f139877r.setEnabled(false);
        getBinding().f139878s.setEnabled(false);
        getBinding().f139878s.setVisibility(8);
        getBinding().f139878s.setVisibility(8);
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: P9 */
    public void mo59020P9() {
        getBinding().f139877r.setEnabled(true);
        getBinding().f139878s.setEnabled(true);
        getBinding().f139877r.setVisibility(0);
        getBinding().f139878s.setVisibility(0);
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: Qn */
    public void mo59021Qn() {
        getBinding().f139884y.setVisibility(4);
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: VH */
    public void mo59022VH(C2480c c2480c, Bitmap bitmap) {
        AbstractC19074t.m100208f(c2480c, "bound");
        AbstractC19074t.m100208f(bitmap, "bitmap");
        int width = getWidth();
        int height = getHeight();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showPolygonView(");
        sb2.append(c2480c);
        sb2.append("). W=");
        sb2.append(width);
        sb2.append(", H=");
        sb2.append(height);
        if (!getBinding().f139884y.isShown()) {
            getBinding().f139884y.setVisibility(0);
        }
        getBinding().f139884y.m59094C(c2480c, bitmap);
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: Y */
    public void mo59023Y() {
        getBinding().f139880u.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.custom.CropPolygonView.InterfaceC11262i
    /* renamed from: a */
    public void mo59024a() {
        getPresenter().mo59039lo();
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.custom.CropPolygonView.InterfaceC11262i
    /* renamed from: b */
    public void mo59025b() {
        getPresenter().mo59040nf();
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.custom.CropPolygonView.InterfaceC11262i
    /* renamed from: c */
    public void mo59026c() {
        getPresenter().mo59041uc();
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: c4 */
    public void mo59027c4() {
        getBinding().f139880u.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.custom.CropPolygonView.InterfaceC11262i
    /* renamed from: d */
    public void mo59028d(boolean z11) {
        if (z11) {
            getBinding().f139876q.setClickable(false);
            getBinding().f139877r.setClickable(false);
            getBinding().f139878s.setClickable(false);
            AbstractC23202r9.m119542j(getBinding().f139883x, null);
            AbstractC23202r9.m119542j(getBinding().f139882w, null);
            return;
        }
        getBinding().f139876q.setClickable(true);
        getBinding().f139877r.setClickable(true);
        getBinding().f139878s.setClickable(true);
        AbstractC23202r9.m119540h(getBinding().f139883x, null);
        AbstractC23202r9.m119540h(getBinding().f139882w, null);
    }

    public final View getTopView() {
        FrameLayout frameLayout = getBinding().f139883x;
        AbstractC19074t.m100207e(frameLayout, "scannerTopPanel");
        return frameLayout;
    }

    /* renamed from: h */
    public final boolean m59029h() {
        getPresenter().mo59034Db();
        return true;
    }

    @Override // t50.InterfaceC26489a
    /* renamed from: h0 */
    public boolean mo59030h0() {
        return isShown();
    }

    /* renamed from: i */
    public final void m59031i(int i11) {
        getPresenter().mo59038l8(i11, getFinalBound());
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: jx */
    public void mo59032jx(int i11) {
        ToastUtils.m89266n(i11, new Object[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_back) {
            getPresenter().mo59034Db();
        } else if (id2 == AbstractC6918a0.btn_done) {
            getPresenter().mo59035F9(getFinalBound());
        } else if (id2 == AbstractC6918a0.btn_rotate) {
            getPresenter().mo59037N9(getFinalBound());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().mo994F2();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f56584r != null && !getBinding().f139884y.isShown()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDocumentScanListener(InterfaceC11249b interfaceC11249b) {
        getPresenter().mo59036Mf(interfaceC11249b);
    }

    public final void setViewArgs(C26490b c26490b) {
        AbstractC19074t.m100208f(c26490b, "viewArgs");
        getPresenter().mo995Nd(c26490b, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f56582p = new Handler(Looper.getMainLooper());
        m129210a = AbstractC24856m.m129210a(new C11250c());
        this.f56583q = m129210a;
        m59015f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScanView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f56582p = new Handler(Looper.getMainLooper());
        m129210a = AbstractC24856m.m129210a(new C11250c());
        this.f56583q = m129210a;
        m59015f();
    }
}
